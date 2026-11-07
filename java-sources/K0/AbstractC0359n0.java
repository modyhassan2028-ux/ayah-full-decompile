package K0;

import Z.C0672b;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import Z.C0709z;

/* JADX INFO: renamed from: K0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0359n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.M0 f5112a = new Z.M0(Q.f4995z);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.M0 f5113b = new Z.M0(Q.f4971A);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z.M0 f5114c = new Z.M0(Q.f4973C);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z.M0 f5115d = new Z.M0(Q.f4972B);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Z.M0 f5116e = new Z.M0(Q.f4975E);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Z.M0 f5117f = new Z.M0(Q.f4974D);
    public static final Z.M0 g = new Z.M0(Q.f4981K);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z.M0 f5118h = new Z.M0(Q.f4977G);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z.M0 f5119i = new Z.M0(Q.f4978H);
    public static final Z.M0 j = new Z.M0(Q.f4980J);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z.M0 f5120k = new Z.M0(Q.f4979I);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Z.M0 f5121l = new Z.M0(Q.f4982L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Z.M0 f5122m = new Z.M0(Q.f4983M);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Z.M0 f5123n = new Z.M0(Q.f4984N);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Z.M0 f5124o = new Z.M0(Q.R);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Z.M0 f5125p = new Z.M0(Q.Q);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Z.M0 f5126q = new Z.M0(Q.S);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z.M0 f5127r = new Z.M0(Q.T);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Z.M0 f5128s = new Z.M0(Q.U);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Z.M0 f5129t = new Z.M0(Q.f4987V);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Z.M0 f5130u = new Z.M0(Q.f4985O);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0709z f5131v = new C0709z(Q.f4986P);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Z.M0 f5132w = new Z.M0(Q.f4976F);

    public static final void a(J0.r0 r0Var, C0335b0 c0335b0, p241y9.e eVar, C0698o c0698o, int i10) {
        c0698o.V(874662829);
        int i11 = i10 | (c0698o.g(r0Var) ? 4 : 2) | (c0698o.g(c0335b0) ? 32 : 16) | (c0698o.i(eVar) ? 256 : 128);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            C0695m0 c0695m0A = f5112a.a(r0Var.getAccessibilityManager());
            C0695m0 c0695m0A2 = f5113b.a(r0Var.getAutofill());
            C0695m0 c0695m0A3 = f5115d.a(r0Var.getAutofillManager());
            C0695m0 c0695m0A4 = f5114c.a(r0Var.getAutofillTree());
            C0695m0 c0695m0A5 = f5116e.a(r0Var.getClipboardManager());
            C0695m0 c0695m0A6 = f5117f.a(r0Var.getClipboard());
            C0695m0 c0695m0A7 = f5118h.a(r0Var.getDensity());
            C0695m0 c0695m0A8 = f5119i.a(r0Var.getFocusOwner());
            C0695m0 c0695m0A9 = j.a(r0Var.getFontLoader());
            c0695m0A9.f10699f = false;
            C0695m0 c0695m0A10 = f5120k.a(r0Var.getFontFamilyResolver());
            c0695m0A10.f10699f = false;
            C0672b.b(new C0695m0[]{c0695m0A, c0695m0A2, c0695m0A3, c0695m0A4, c0695m0A5, c0695m0A6, c0695m0A7, c0695m0A8, c0695m0A9, c0695m0A10, f5121l.a(r0Var.getHapticFeedBack()), f5122m.a(r0Var.getInputModeManager()), f5123n.a(r0Var.getLayoutDirection()), f5124o.a(r0Var.getTextInputService()), f5125p.a(r0Var.getSoftwareKeyboardController()), f5126q.a(r0Var.getTextToolbar()), f5127r.a(c0335b0), f5128s.a(r0Var.getViewConfiguration()), f5129t.a(r0Var.getWindowInfo()), f5130u.a(r0Var.getPointerIconService()), g.a(r0Var.getGraphicsContext())}, eVar, c0698o, ((i11 >> 3) & 112) | 8);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A.I0(r0Var, c0335b0, eVar, i10, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
