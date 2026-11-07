package p247z5;

import A4.h;
import B3.f;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.X;
import com.ayah.feature.onboarding.OnboardingActivity;
import p074h0.j;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OnboardingActivity f24834s;

    public /* synthetic */ a(OnboardingActivity onboardingActivity, int i10) {
        this.f24833r = i10;
        this.f24834s = onboardingActivity;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f24833r;
        y yVar = y.f19095a;
        OnboardingActivity onboardingActivity = this.f24834s;
        int i11 = 1;
        C0698o c0698o = (C0698o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i12 = OnboardingActivity.T;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(630896705, new a(onboardingActivity, i11), c0698o), c0698o, 48);
                }
                break;
            default:
                int i13 = OnboardingActivity.T;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    Object objH = c0698o.H();
                    S s10 = C0690k.f10683a;
                    if (objH == s10) {
                        objH = C0672b.r(Boolean.FALSE);
                        c0698o.e0(objH);
                    }
                    X x9 = (X) objH;
                    if (!((Boolean) x9.getValue()).booleanValue()) {
                        c0698o.T(266941540);
                        Object objH2 = c0698o.H();
                        if (objH2 == s10) {
                            objH2 = new h(x9, 14);
                            c0698o.e0(objH2);
                        }
                        A5.e.b((p241y9.a) objH2, c0698o, 6);
                        c0698o.p(false);
                    } else {
                        c0698o.T(267010794);
                        boolean zI = c0698o.i(onboardingActivity);
                        Object objH3 = c0698o.H();
                        if (zI || objH3 == s10) {
                            objH3 = new f(24, onboardingActivity);
                            c0698o.e0(objH3);
                        }
                        A5.e.a((p241y9.a) objH3, c0698o, 0);
                        c0698o.p(false);
                    }
                }
                break;
        }
        return yVar;
    }
}
