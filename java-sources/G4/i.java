package G4;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.P;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.L0;
import Z.S;
import Z.X;
import android.content.Context;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import java.text.NumberFormat;
import l0.r;
import p110k9.y;
import p181s2.A;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2830r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2838z;

    public /* synthetic */ i(P p10, C4.e eVar, InterfaceC0415h interfaceC0415h, E4.a aVar, p241y9.c cVar, p241y9.c cVar2, r rVar, NumberFormat numberFormat, int i10) {
        this.f2833u = p10;
        this.f2834v = eVar;
        this.f2835w = interfaceC0415h;
        this.f2836x = aVar;
        this.f2831s = cVar;
        this.f2832t = cVar2;
        this.f2837y = rVar;
        this.f2838z = numberFormat;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2830r;
        y yVar = y.f19095a;
        Object obj3 = this.f2838z;
        Object obj4 = this.f2836x;
        Object obj5 = this.f2835w;
        Object obj6 = this.f2832t;
        Object obj7 = this.f2831s;
        Object obj8 = this.f2834v;
        Object obj9 = this.f2837y;
        Object obj10 = this.f2833u;
        final int i11 = 1;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                n.a((P) obj10, (C4.e) obj8, (InterfaceC0415h) obj5, (E4.a) obj4, (p241y9.c) obj7, (p241y9.c) obj6, (r) obj9, (NumberFormat) obj3, (C0698o) obj, C0672b.y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                V4.a.a((T4.a) obj10, (p241y9.c) obj7, (p241y9.a) obj8, (p241y9.c) obj6, (p241y9.c) obj5, (p241y9.a) obj4, (p241y9.e) obj9, (p241y9.a) obj3, (C0698o) obj, C0672b.y(1));
                break;
            case 2:
                L0 l10 = (L0) obj10;
                final KhatmahWrapper khatmahWrapper = (KhatmahWrapper) obj8;
                p241y9.a aVar = (p241y9.a) obj5;
                final InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj4;
                Context context = (Context) obj7;
                X x9 = (X) obj6;
                X x10 = (X) obj9;
                X x11 = (X) obj3;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = KhatmahWrapper.f13794v;
                final int i13 = 0;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    T4.a aVar2 = (T4.a) l10.getValue();
                    boolean zI = c0698o.i(khatmahWrapper);
                    Object objH = c0698o.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new E5.a(11, khatmahWrapper);
                        c0698o.e0(objH);
                    }
                    p241y9.c cVar = (p241y9.c) objH;
                    boolean zG = c0698o.g(aVar);
                    Object objH2 = c0698o.H();
                    if (zG || objH2 == s10) {
                        objH2 = new X4.g(x9, aVar, 1);
                        c0698o.e0(objH2);
                    }
                    p241y9.a aVar3 = (p241y9.a) objH2;
                    boolean zI2 = c0698o.i(interfaceC0402u) | c0698o.i(khatmahWrapper);
                    Object objH3 = c0698o.H();
                    if (zI2 || objH3 == s10) {
                        objH3 = new p241y9.c() { // from class: Z4.a
                            @Override // p241y9.c
                            public final Object e(Object obj11) {
                                int i14 = i13;
                                y yVar2 = y.f19095a;
                                KhatmahWrapper khatmahWrapper2 = khatmahWrapper;
                                InterfaceC0402u interfaceC0402u2 = interfaceC0402u;
                                p095j3.a aVar4 = (p095j3.a) obj11;
                                switch (i14) {
                                    case 0:
                                        int i15 = KhatmahWrapper.f13794v;
                                        j.e(aVar4, "it");
                                        AbstractC0405x.x(interfaceC0402u2, null, new g(khatmahWrapper2, aVar4, null, 0), 3);
                                        break;
                                    default:
                                        int i16 = KhatmahWrapper.f13794v;
                                        j.e(aVar4, "it");
                                        AbstractC0405x.x(interfaceC0402u2, null, new g(khatmahWrapper2, aVar4, null, 1), 3);
                                        break;
                                }
                                return yVar2;
                            }
                        };
                        c0698o.e0(objH3);
                    }
                    p241y9.c cVar2 = (p241y9.c) objH3;
                    boolean zI3 = c0698o.i(interfaceC0402u) | c0698o.i(khatmahWrapper);
                    Object objH4 = c0698o.H();
                    if (zI3 || objH4 == s10) {
                        objH4 = new p241y9.c() { // from class: Z4.a
                            @Override // p241y9.c
                            public final Object e(Object obj11) {
                                int i14 = i11;
                                y yVar2 = y.f19095a;
                                KhatmahWrapper khatmahWrapper2 = khatmahWrapper;
                                InterfaceC0402u interfaceC0402u2 = interfaceC0402u;
                                p095j3.a aVar4 = (p095j3.a) obj11;
                                switch (i14) {
                                    case 0:
                                        int i15 = KhatmahWrapper.f13794v;
                                        j.e(aVar4, "it");
                                        AbstractC0405x.x(interfaceC0402u2, null, new g(khatmahWrapper2, aVar4, null, 0), 3);
                                        break;
                                    default:
                                        int i16 = KhatmahWrapper.f13794v;
                                        j.e(aVar4, "it");
                                        AbstractC0405x.x(interfaceC0402u2, null, new g(khatmahWrapper2, aVar4, null, 1), 3);
                                        break;
                                }
                                return yVar2;
                            }
                        };
                        c0698o.e0(objH4);
                    }
                    p241y9.c cVar3 = (p241y9.c) objH4;
                    boolean zG2 = c0698o.g(aVar);
                    Object objH5 = c0698o.H();
                    if (zG2 || objH5 == s10) {
                        objH5 = new X4.g(x9, aVar, 2);
                        c0698o.e0(objH5);
                    }
                    p241y9.a aVar4 = (p241y9.a) objH5;
                    boolean zI4 = c0698o.i(khatmahWrapper) | c0698o.i(context) | c0698o.i(interfaceC0402u);
                    Object objH6 = c0698o.H();
                    if (zI4 || objH6 == s10) {
                        D4.c cVar4 = new D4.c(khatmahWrapper, context, x10, x11, interfaceC0402u, 2);
                        c0698o.e0(cVar4);
                        objH6 = cVar4;
                    }
                    p241y9.e eVar = (p241y9.e) objH6;
                    boolean zI5 = c0698o.i(interfaceC0402u) | c0698o.i(khatmahWrapper);
                    Object objH7 = c0698o.H();
                    if (zI5 || objH7 == s10) {
                        objH7 = new f(17, interfaceC0402u, khatmahWrapper);
                        c0698o.e0(objH7);
                    }
                    V4.a.a(aVar2, cVar, aVar3, cVar2, cVar3, aVar4, eVar, (p241y9.a) objH7, c0698o, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                A.a((p173r2.A) obj10, (r) obj9, (l0.e) obj8, (p241y9.c) obj7, (p241y9.c) obj6, (p241y9.c) obj5, (p241y9.c) obj4, (p241y9.c) obj3, (C0698o) obj, C0672b.y(49));
                break;
        }
        return yVar;
    }

    public /* synthetic */ i(T4.a aVar, p241y9.c cVar, p241y9.a aVar2, p241y9.c cVar2, p241y9.c cVar3, p241y9.a aVar3, p241y9.e eVar, p241y9.a aVar4, int i10) {
        this.f2833u = aVar;
        this.f2831s = cVar;
        this.f2834v = aVar2;
        this.f2832t = cVar2;
        this.f2835w = cVar3;
        this.f2836x = aVar3;
        this.f2837y = eVar;
        this.f2838z = aVar4;
    }

    public /* synthetic */ i(L0 l10, KhatmahWrapper khatmahWrapper, p241y9.a aVar, InterfaceC0402u interfaceC0402u, Context context, X x9, X x10, X x11) {
        this.f2833u = l10;
        this.f2834v = khatmahWrapper;
        this.f2835w = aVar;
        this.f2836x = interfaceC0402u;
        this.f2831s = context;
        this.f2832t = x9;
        this.f2837y = x10;
        this.f2838z = x11;
    }

    public /* synthetic */ i(p173r2.A a9, r rVar, l0.e eVar, p241y9.c cVar, p241y9.c cVar2, p241y9.c cVar3, p241y9.c cVar4, p241y9.c cVar5, int i10) {
        this.f2833u = a9;
        this.f2837y = rVar;
        this.f2834v = eVar;
        this.f2831s = cVar;
        this.f2832t = cVar2;
        this.f2835w = cVar3;
        this.f2836x = cVar4;
        this.f2838z = cVar5;
    }
}
