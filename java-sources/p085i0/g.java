package p085i0;

import A.C0023i;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.M0;
import Z.S;
import java.util.Map;
import p074h0.d;
import p110k9.y;
import p241y9.c;
import u.E;
import u.M;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f16720e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f16722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f16723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f16724d;

    static {
        d dVar = d.f16712s;
        e eVar = e.f16715s;
        n nVar = o.f16735a;
        f16720e = new n(0, dVar, eVar);
    }

    public g(Map map) {
        this.f16721a = map;
        long[] jArr = M.f22699a;
        this.f16722b = new E();
        this.f16724d = new f(0, this);
    }

    @Override // p085i0.c
    public final void a(Object obj, d dVar, C0698o c0698o, int i10) {
        c0698o.T(-1198538093);
        c0698o.W(obj);
        Object objH = c0698o.H();
        S s10 = C0690k.f10683a;
        if (objH == s10) {
            f fVar = this.f16724d;
            if (!((Boolean) fVar.e(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map map = (Map) this.f16721a.get(obj);
            M0 m10 = l.f16731a;
            k kVar = new k(map, fVar);
            c0698o.e0(kVar);
            objH = kVar;
        }
        j jVar = (j) objH;
        C0672b.a(l.f16731a.a(jVar), dVar, c0698o, (i10 & 112) | 8);
        boolean zI = c0698o.i(this) | c0698o.i(obj) | c0698o.i(jVar);
        Object objH2 = c0698o.H();
        if (zI || objH2 == s10) {
            objH2 = new C0023i(this, obj, jVar, 16);
            c0698o.e0(objH2);
        }
        C0672b.d(y.f19095a, (c) objH2, c0698o);
        if (c0698o.f10743x && c0698o.f10711F.f10846i == c0698o.f10744y) {
            c0698o.f10744y = -1;
            c0698o.f10743x = false;
        }
        c0698o.p(false);
        c0698o.p(false);
    }

    @Override // p085i0.c
    public final void f(Object obj) {
        if (this.f16722b.j(obj) == null) {
            this.f16721a.remove(obj);
        }
    }
}
