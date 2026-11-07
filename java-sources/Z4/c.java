package Z4;

import D.C0077u;
import G4.i;
import K9.InterfaceC0402u;
import W.C1;
import W.P;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.L0;
import Z.S;
import Z.X;
import android.content.Context;
import android.os.Build;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import j$.time.LocalTime;
import p110k9.y;
import p173r2.A;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10983r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f10984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KhatmahWrapper f10985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L0 f10986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X f10987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ X f10988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f10989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f10990y;

    public /* synthetic */ c(InterfaceC0402u interfaceC0402u, P p10, KhatmahWrapper khatmahWrapper, X x9, X x10, Context context, X x11) {
        this.f10984s = interfaceC0402u;
        this.f10989x = p10;
        this.f10985t = khatmahWrapper;
        this.f10986u = x9;
        this.f10987v = x10;
        this.f10990y = context;
        this.f10988w = x11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        X x9;
        p095j3.a aVar;
        int i10 = this.f10983r;
        y yVar = y.f19095a;
        Object obj4 = this.f10990y;
        Object obj5 = this.f10989x;
        switch (i10) {
            case 0:
                KhatmahWrapper.a(this.f10986u, this.f10987v, (A) obj5, this.f10984s, this.f10985t, (p241y9.c) obj4, this.f10988w, (C0077u) obj, (C0698o) obj2, ((Integer) obj3).intValue());
                break;
            default:
                P p10 = (P) obj5;
                Context context = (Context) obj4;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i11 = KhatmahWrapper.f13794v;
                j.e((D.P) obj, "it");
                if (!c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c0698o.N();
                } else {
                    InterfaceC0402u interfaceC0402u = this.f10984s;
                    boolean zI = c0698o.i(interfaceC0402u) | c0698o.g(p10);
                    Object objH = c0698o.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new I4.c(interfaceC0402u, p10, 1);
                        c0698o.e0(objH);
                    }
                    p241y9.a aVar2 = (p241y9.a) objH;
                    Object objH2 = c0698o.H();
                    if (objH2 == s10) {
                        objH2 = C0672b.r(Boolean.FALSE);
                        c0698o.e0(objH2);
                    }
                    X x10 = (X) objH2;
                    int i12 = Build.VERSION.SDK_INT;
                    KhatmahWrapper khatmahWrapper = this.f10985t;
                    L0 l10 = this.f10986u;
                    X x11 = this.f10987v;
                    if (i12 >= 33) {
                        c0698o.T(794914988);
                        C4.e eVar = new C4.e(13, new C4.c(khatmahWrapper.getKhatmahPresenter().f8190f.f24367e, 14));
                        Boolean bool = Boolean.FALSE;
                        x9 = x11;
                        X xK = C0672b.k(eVar, bool, null, c0698o, 48, 2);
                        T4.a aVar3 = (T4.a) l10.getValue();
                        LocalTime localTime = (aVar3 == null || (aVar = aVar3.f7781a) == null) ? null : aVar.f18756f;
                        if (((Boolean) x10.getValue()).booleanValue() && ((Boolean) xK.getValue()).booleanValue() && localTime != null) {
                            x10.setValue(bool);
                            x9.setValue(localTime);
                        }
                    } else {
                        x9 = x11;
                        c0698o.T(789805940);
                    }
                    c0698o.p(false);
                    C1.a(null, null, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).d(), 0L, 0.0f, 0.0f, null, p074h0.j.d(-1807413677, new i(l10, khatmahWrapper, aVar2, interfaceC0402u, context, this.f10988w, x10, x9), c0698o), c0698o, 12582912, 123);
                }
                break;
        }
        return yVar;
    }

    public /* synthetic */ c(X x9, X x10, A a9, InterfaceC0402u interfaceC0402u, KhatmahWrapper khatmahWrapper, p241y9.c cVar, X x11) {
        this.f10986u = x9;
        this.f10987v = x10;
        this.f10989x = a9;
        this.f10984s = interfaceC0402u;
        this.f10985t = khatmahWrapper;
        this.f10990y = cVar;
        this.f10988w = x11;
    }
}
