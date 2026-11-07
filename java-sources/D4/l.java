package D4;

import D0.v;
import F.A;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import W.C0604u1;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import com.ayah.R;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1213u;

    public /* synthetic */ l(int i10, int i11, Object obj, Object obj2) {
        this.f1210r = i11;
        this.f1212t = obj;
        this.f1213u = obj2;
        this.f1211s = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1210r) {
            case 0:
                ((Integer) obj2).getClass();
                k.c(this.f1211s, (p124m3.j) this.f1212t, (r) this.f1213u, (C0698o) obj, C0672b.y(1));
                break;
            case 1:
                p241y9.c cVar = (p241y9.c) this.f1212t;
                E4.a aVar = (E4.a) this.f1213u;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM0 = p000a.a.m0(R.string.notes, c0698o);
                    boolean zG = c0698o.g(cVar);
                    int i10 = this.f1211s;
                    boolean zE = zG | c0698o.e(i10);
                    Object objH = c0698o.H();
                    if (zE || objH == C0690k.f10683a) {
                        objH = new G4.g(i10, 1, cVar);
                        c0698o.e0(objH);
                    }
                    p015b4.f.m(strM0, androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.c(l0.o.f19333a, false, null, (p241y9.a) objH, 7), 16, 0.0f, 2), null, p074h0.j.d(-612088251, new A4.f(1, aVar), c0698o), c0698o, 3072, 4);
                } else {
                    c0698o.N();
                }
                return y.f19095a;
            case 2:
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f1212t;
                A a9 = (A) this.f1213u;
                v vVar = (v) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                p251z9.j.e(vVar, "change");
                vVar.a();
                AbstractC0405x.x(interfaceC0402u, null, new M4.j(a9, fFloatValue, this.f1211s, null), 3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                V4.a.b((p241y9.a) this.f1212t, (r) this.f1213u, (C0698o) obj, C0672b.y(this.f1211s | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                X4.a.c((p241y9.a) this.f1212t, (p241y9.a) this.f1213u, (C0698o) obj, C0672b.y(this.f1211s | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                Y4.a.b((p095j3.c) this.f1212t, (p241y9.c) this.f1213u, (C0698o) obj, C0672b.y(this.f1211s | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                p067g5.a.e((String) this.f1212t, (r) this.f1213u, (C0698o) obj, C0672b.y(this.f1211s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                p191t5.a.b((C0604u1) this.f1212t, (r) this.f1213u, (C0698o) obj, C0672b.y(this.f1211s | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ l(int i10, p124m3.j jVar, r rVar, int i11) {
        this.f1210r = 0;
        this.f1211s = i10;
        this.f1212t = jVar;
        this.f1213u = rVar;
    }

    public /* synthetic */ l(p241y9.c cVar, int i10, E4.a aVar) {
        this.f1210r = 1;
        this.f1212t = cVar;
        this.f1211s = i10;
        this.f1213u = aVar;
    }
}
