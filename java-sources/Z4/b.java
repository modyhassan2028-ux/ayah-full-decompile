package Z4;

import A4.i;
import K9.InterfaceC0402u;
import Q8.C0469p;
import T1.C0504v;
import W.P;
import W.V0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.X;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import java.util.Arrays;
import p074h0.j;
import p085i0.n;
import p085i0.o;
import p110k9.y;
import p173r2.A;
import p173r2.G;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ KhatmahWrapper f10981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f10982t;

    public /* synthetic */ b(KhatmahWrapper khatmahWrapper, Context context, int i10) {
        this.f10980r = i10;
        this.f10981s = khatmahWrapper;
        this.f10982t = context;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10980r;
        y yVar = y.f19095a;
        int i11 = 2;
        int i12 = 1;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = KhatmahWrapper.f13794v;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(-1084360599, new b(this.f10981s, this.f10982t, i12), c0698o), c0698o, 48);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = KhatmahWrapper.f13794v;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    Context context = (Context) c0698o2.k(AndroidCompositionLocals_androidKt.f12063b);
                    Object[] objArrCopyOf = Arrays.copyOf(new G[0], 0);
                    p026c5.a aVar = new p026c5.a(21);
                    i iVar = new i(context, 4);
                    n nVar = o.f16735a;
                    n nVar2 = new n(0, aVar, iVar);
                    boolean zI = c0698o2.i(context);
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new C0469p(context, 4);
                        c0698o2.e0(objH);
                    }
                    A a9 = (A) va.g.H(objArrCopyOf, nVar2, (p241y9.a) objH, c0698o2, 0, 4);
                    P p10 = V0.p(V0.q(390, 2, c0698o2), c0698o2, 2);
                    boolean zG = c0698o2.g(p10) | c0698o2.i(a9);
                    Object objH2 = c0698o2.H();
                    p150o9.c cVar = null;
                    if (zG || objH2 == s10) {
                        objH2 = new C0504v(p10, a9, cVar, i11);
                        c0698o2.e0(objH2);
                    }
                    p241y9.c cVar2 = (p241y9.c) objH2;
                    Object objH3 = c0698o2.H();
                    if (objH3 == s10) {
                        objH3 = C0672b.m(c0698o2);
                        c0698o2.e0(objH3);
                    }
                    InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH3;
                    KhatmahWrapper khatmahWrapper = this.f10981s;
                    U4.e khatmahPresenter = khatmahWrapper.getKhatmahPresenter();
                    X xK = C0672b.k(new C4.g(khatmahPresenter.f8188d.f22587b, khatmahPresenter, 13), null, null, c0698o2, 48, 2);
                    Object objH4 = c0698o2.H();
                    if (objH4 == s10) {
                        objH4 = C0672b.r(Boolean.FALSE);
                        c0698o2.e0(objH4);
                    }
                    X x9 = (X) objH4;
                    Object objH5 = c0698o2.H();
                    if (objH5 == s10) {
                        objH5 = C0672b.r(null);
                        c0698o2.e0(objH5);
                    }
                    X x10 = (X) objH5;
                    V0.b(j.d(-429703816, new c(xK, x9, a9, interfaceC0402u, khatmahWrapper, cVar2, x10), c0698o2), null, p10, 0, 0.0f, null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).d(), 0L, 0.0f, 0.0f, null, false, null, 0L, 0L, j.d(-2106008114, new c(interfaceC0402u, p10, khatmahWrapper, xK, x10, this.f10982t, x9), c0698o2), c0698o2, 3078, 64434);
                }
                break;
        }
        return yVar;
    }
}
