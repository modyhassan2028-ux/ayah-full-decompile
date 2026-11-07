package D4;

import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import W.AbstractC0598s1;
import W.C0569i1;
import Z.C0672b;
import Z.C0673b0;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.X;
import android.content.Context;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import j$.time.LocalTime;
import java.text.NumberFormat;
import java.util.List;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1181w;

    public /* synthetic */ c(B4.a aVar, p241y9.c cVar, p241y9.f fVar, p241y9.c cVar2, r rVar, int i10) {
        this.f1176r = 0;
        this.f1180v = aVar;
        this.f1177s = cVar;
        this.f1181w = fVar;
        this.f1178t = cVar2;
        this.f1179u = rVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1176r) {
            case 0:
                ((Integer) obj2).getClass();
                k.a((B4.a) this.f1180v, (p241y9.c) this.f1177s, (p241y9.f) this.f1181w, (p241y9.c) this.f1178t, (r) this.f1179u, (C0698o) obj, C0672b.y(3121));
                break;
            case 1:
                ((Integer) obj2).getClass();
                H4.a.b((InterfaceC0415h) this.f1180v, (p241y9.c) this.f1177s, (p241y9.c) this.f1178t, (r) this.f1179u, (NumberFormat) this.f1181w, (C0698o) obj, C0672b.y(1));
                break;
            case 2:
                KhatmahWrapper.b((KhatmahWrapper) this.f1180v, (Context) this.f1177s, (X) this.f1178t, (X) this.f1181w, (InterfaceC0402u) this.f1179u, ((Boolean) obj).booleanValue(), (LocalTime) obj2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                p006a5.a.f((p047e5.g) this.f1180v, (p241y9.f) this.f1181w, (p241y9.f) this.f1177s, (r) this.f1179u, (List) this.f1178t, (C0698o) obj, C0672b.y(3073));
                break;
            case 4:
                ((Integer) obj2).getClass();
                p067g5.a.d((p090i5.b) this.f1180v, (p241y9.c) this.f1177s, (p241y9.e) this.f1178t, (p241y9.a) this.f1181w, (r) this.f1179u, (C0698o) obj, C0672b.y(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                p068g6.b.b((p048e6.a) this.f1180v, (p241y9.a) this.f1181w, (p241y9.c) this.f1177s, (p241y9.c) this.f1178t, (r) this.f1179u, (C0698o) obj, C0672b.y(1));
                break;
            default:
                C0673b0 c0673b0 = (C0673b0) this.f1180v;
                p241y9.c cVar = (p241y9.c) this.f1177s;
                p241y9.c cVar2 = (p241y9.c) this.f1178t;
                C0569i1 c0569i1 = (C0569i1) this.f1181w;
                B.j jVar = (B.j) this.f1179u;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fG = c0673b0.g();
                    E9.a aVar = new E9.a(1.0f, 604.0f);
                    float f3 = 56;
                    r rVarJ = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f11826a, f3), f3, 0.0f, 2);
                    boolean zG = c0698o.g(c0673b0) | c0698o.g(cVar);
                    Object objH = c0698o.H();
                    S s10 = C0690k.f10683a;
                    if (zG || objH == s10) {
                        objH = new A3.e(15, c0673b0, cVar);
                        c0698o.e0(objH);
                    }
                    p241y9.c cVar3 = (p241y9.c) objH;
                    boolean zG2 = c0698o.g(cVar2) | c0698o.g(c0673b0);
                    Object objH2 = c0698o.H();
                    if (zG2 || objH2 == s10) {
                        objH2 = new G4.f(28, cVar2, c0673b0);
                        c0698o.e0(objH2);
                    }
                    AbstractC0598s1.a(fG, cVar3, rVarJ, false, (p241y9.a) objH2, c0569i1, jVar, 604, p074h0.j.d(-736142970, new A4.d(8, jVar, c0569i1), c0698o), p191t5.a.f22606b, aVar, c0698o, 920125824);
                } else {
                    c0698o.N();
                }
                return y.f19095a;
        }
        return y.f19095a;
    }

    public /* synthetic */ c(InterfaceC0415h interfaceC0415h, p241y9.c cVar, p241y9.c cVar2, r rVar, NumberFormat numberFormat, int i10) {
        this.f1176r = 1;
        this.f1180v = interfaceC0415h;
        this.f1177s = cVar;
        this.f1178t = cVar2;
        this.f1179u = rVar;
        this.f1181w = numberFormat;
    }

    public /* synthetic */ c(p047e5.g gVar, p241y9.f fVar, p241y9.f fVar2, r rVar, List list, int i10) {
        this.f1176r = 3;
        this.f1180v = gVar;
        this.f1181w = fVar;
        this.f1177s = fVar2;
        this.f1179u = rVar;
        this.f1178t = list;
    }

    public /* synthetic */ c(p048e6.a aVar, p241y9.a aVar2, p241y9.c cVar, p241y9.c cVar2, r rVar, int i10) {
        this.f1176r = 5;
        this.f1180v = aVar;
        this.f1181w = aVar2;
        this.f1177s = cVar;
        this.f1178t = cVar2;
        this.f1179u = rVar;
    }

    public /* synthetic */ c(p090i5.b bVar, p241y9.c cVar, p241y9.e eVar, p241y9.a aVar, r rVar, int i10) {
        this.f1176r = 4;
        this.f1180v = bVar;
        this.f1177s = cVar;
        this.f1178t = eVar;
        this.f1181w = aVar;
        this.f1179u = rVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1176r = i10;
        this.f1180v = obj;
        this.f1177s = obj2;
        this.f1178t = obj3;
        this.f1181w = obj4;
        this.f1179u = obj5;
    }
}
