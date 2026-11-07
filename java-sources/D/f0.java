package D;

import I1.B0;
import I1.C0259l;
import android.os.Build;
import android.view.View;
import com.ayah.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f955u = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0058a f956a = C0059b.c(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0058a f957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0058a f958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0058a f959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0058a f960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0058a f961f;
    public final C0058a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0058a f962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0058a f963i;
    public final b0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0 f966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f973t;

    public f0(View view) {
        C0058a c0058aC = C0059b.c(128, "displayCutout");
        this.f957b = c0058aC;
        C0058a c0058aC2 = C0059b.c(8, "ime");
        this.f958c = c0058aC2;
        C0058a c0058aC3 = C0059b.c(32, "mandatorySystemGestures");
        this.f959d = c0058aC3;
        this.f960e = C0059b.c(2, "navigationBars");
        this.f961f = C0059b.c(1, "statusBars");
        C0058a c0058aC4 = C0059b.c(519, "systemBars");
        this.g = c0058aC4;
        C0058a c0058aC5 = C0059b.c(16, "systemGestures");
        this.f962h = c0058aC5;
        C0058a c0058aC6 = C0059b.c(64, "tappableElement");
        this.f963i = c0058aC6;
        b0 b0Var = new b0(new G(0, 0, 0, 0), "waterfall");
        this.j = b0Var;
        new Z(new Z(c0058aC4, c0058aC2), c0058aC);
        new Z(new Z(new Z(c0058aC6, c0058aC3), c0058aC5), b0Var);
        this.f964k = C0059b.e(4, "captionBarIgnoringVisibility");
        this.f965l = C0059b.e(2, "navigationBarsIgnoringVisibility");
        this.f966m = C0059b.e(1, "statusBarsIgnoringVisibility");
        this.f967n = C0059b.e(519, "systemBarsIgnoringVisibility");
        this.f968o = C0059b.e(64, "tappableElementIgnoringVisibility");
        this.f969p = C0059b.e(8, "imeAnimationTarget");
        this.f970q = C0059b.e(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f971r = bool != null ? bool.booleanValue() : true;
        this.f973t = new D(this);
    }

    public static void a(f0 f0Var, B0 b5) {
        boolean z10 = false;
        f0Var.f956a.f(b5, 0);
        f0Var.f958c.f(b5, 0);
        f0Var.f957b.f(b5, 0);
        f0Var.f960e.f(b5, 0);
        f0Var.f961f.f(b5, 0);
        f0Var.g.f(b5, 0);
        f0Var.f962h.f(b5, 0);
        f0Var.f963i.f(b5, 0);
        f0Var.f959d.f(b5, 0);
        f0Var.f964k.f(AbstractC0060c.f(b5.f3671a.h(4)));
        f0Var.f965l.f(AbstractC0060c.f(b5.f3671a.h(2)));
        f0Var.f966m.f(AbstractC0060c.f(b5.f3671a.h(1)));
        f0Var.f967n.f(AbstractC0060c.f(b5.f3671a.h(519)));
        f0Var.f968o.f(AbstractC0060c.f(b5.f3671a.h(64)));
        C0259l c0259lF = b5.f3671a.f();
        if (c0259lF != null) {
            f0Var.j.f(AbstractC0060c.f(Build.VERSION.SDK_INT >= 30 ? A1.c.d(B1.b.d(c0259lF.f3758a)) : A1.c.f461e));
        }
        synchronized (p093j0.n.f18661b) {
            u.F f3 = p093j0.n.f18667i.f18633h;
            if (f3 != null && f3.h()) {
                z10 = true;
            }
        }
        if (z10) {
            p093j0.n.a();
        }
    }
}
