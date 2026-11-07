package p232y;

import A.C0042s;
import A.T0;
import B.j;
import Z.C;
import Z.C0672b;
import Z.C0675c0;
import p085i0.f;
import p085i0.n;
import p085i0.o;
import p110k9.y;
import p161p9.a;
import p241y9.e;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements T0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f24534i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0675c0 f24535a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24539e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0675c0 f24536b = new C0675c0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f24537c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0675c0 f24538d = new C0675c0(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0042s f24540f = new C0042s(new f(16, this));
    public final C g = C0672b.o(new i0(this, 1));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f24541h = C0672b.o(new i0(this, 0));

    static {
        C1457k c1457k = C1457k.f24547x;
        n nVar = o.f16735a;
        f24534i = new n(0, h0.f24520r, c1457k);
    }

    public j0(int i10) {
        this.f24535a = new C0675c0(i10);
    }

    @Override // A.T0
    public final Object a(T t2, e eVar, c cVar) {
        Object objA = this.f24540f.a(t2, eVar, cVar);
        return objA == a.f21156r ? objA : y.f19095a;
    }

    @Override // A.T0
    public final boolean b() {
        return ((Boolean) this.f24541h.getValue()).booleanValue();
    }

    @Override // A.T0
    public final boolean c() {
        return this.f24540f.c();
    }

    @Override // A.T0
    public final boolean d() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // A.T0
    public final float e(float f3) {
        return this.f24540f.e(f3);
    }
}
