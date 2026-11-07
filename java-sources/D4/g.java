package D4;

import D.X;
import F.C0153b;
import W.V0;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1193r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f1194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1196u;

    public /* synthetic */ g(int i10, p124m3.j jVar, p241y9.c cVar) {
        this.f1196u = jVar;
        this.f1195t = i10;
        this.f1194s = cVar;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1193r) {
            case 0:
                p124m3.j jVar = (p124m3.j) this.f1196u;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                p251z9.j.e((C0153b) obj, "$this$item");
                if (c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z10 = jVar.f19585a == this.f1195t;
                    p241y9.c cVar = this.f1194s;
                    boolean zG = c0698o.g(cVar) | c0698o.i(jVar);
                    Object objH = c0698o.H();
                    if (zG || objH == C0690k.f10683a) {
                        objH = new h(0, jVar, cVar);
                        c0698o.e0(objH);
                    }
                    p015b4.f.c(jVar, androidx.compose.foundation.a.c(l0.o.f19333a, false, null, (p241y9.a) objH, 7), false, z10, c0698o, 0, 4);
                } else {
                    c0698o.N();
                }
                break;
            default:
                E4.a aVar = (E4.a) this.f1196u;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                p251z9.j.e((X) obj, "$this$TopAppBar");
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p241y9.c cVar2 = this.f1194s;
                    boolean zG2 = c0698o2.g(cVar2);
                    int i10 = this.f1195t;
                    boolean zE = zG2 | c0698o2.e(i10) | c0698o2.i(aVar);
                    Object objH2 = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zE || objH2 == s10) {
                        objH2 = new G4.b(cVar2, i10, aVar, 3);
                        c0698o2.e0(objH2);
                    }
                    V0.h((p241y9.a) objH2, null, false, null, p074h0.j.d(-552909408, new G4.m(0, aVar), c0698o2), c0698o2, 196608, 30);
                    boolean zG3 = c0698o2.g(cVar2) | c0698o2.e(i10) | c0698o2.i(aVar);
                    Object objH3 = c0698o2.H();
                    if (zG3 || objH3 == s10) {
                        objH3 = new G4.b(cVar2, i10, aVar, 4);
                        c0698o2.e0(objH3);
                    }
                    V0.h((p241y9.a) objH3, null, false, null, G4.n.g, c0698o2, 196608, 30);
                } else {
                    c0698o2.N();
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ g(p241y9.c cVar, int i10, E4.a aVar) {
        this.f1194s = cVar;
        this.f1195t = i10;
        this.f1196u = aVar;
    }
}
