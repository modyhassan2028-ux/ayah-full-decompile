package M7;

import K0.AbstractC0332a;
import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0332a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5765k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5766l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f5767m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final F7.f f5768n = new F7.f(Float.class, "animationFraction", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final F7.f f5769o = new F7.f(Float.class, "completeEndFraction", 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f5770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f5771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p076h2.a f5772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f5773f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5775i;
    public c j;

    public g(h hVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f5773f = hVar;
        this.f5772e = new p076h2.a(1);
    }

    @Override // K0.AbstractC0332a
    public final void c() {
        ObjectAnimator objectAnimator = this.f5770c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // K0.AbstractC0332a
    public final void l() {
        this.g = 0;
        ((m) ((ArrayList) this.f5053b).get(0)).f5799c = this.f5773f.f5754c[0];
        this.f5775i = 0.0f;
    }

    @Override // K0.AbstractC0332a
    public final void o(c cVar) {
        this.j = cVar;
    }

    @Override // K0.AbstractC0332a
    public final void p() {
        ObjectAnimator objectAnimator = this.f5771d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((o) this.f5052a).isVisible()) {
            this.f5771d.start();
        } else {
            c();
        }
    }

    @Override // K0.AbstractC0332a
    public final void r() {
        int i10 = 0;
        if (this.f5770c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f5768n, 0.0f, 1.0f);
            this.f5770c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f5770c.setInterpolator(null);
            this.f5770c.setRepeatCount(-1);
            this.f5770c.addListener(new f(this, i10));
        }
        if (this.f5771d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f5769o, 0.0f, 1.0f);
            this.f5771d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f5771d.setInterpolator(this.f5772e);
            this.f5771d.addListener(new f(this, 1));
        }
        this.g = 0;
        ((m) ((ArrayList) this.f5053b).get(0)).f5799c = this.f5773f.f5754c[0];
        this.f5775i = 0.0f;
        this.f5770c.start();
    }

    @Override // K0.AbstractC0332a
    public final void s() {
        this.j = null;
    }
}
