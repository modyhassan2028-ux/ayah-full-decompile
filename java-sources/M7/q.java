package M7;

import K0.AbstractC0332a;
import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0332a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F7.f f5810i = new F7.f(Float.class, "animationFraction", 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f5811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p076h2.a f5812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f5813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5814f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5815h;

    public q(t tVar) {
        super(3);
        this.f5814f = 1;
        this.f5813e = tVar;
        this.f5812d = new p076h2.a(1);
    }

    @Override // K0.AbstractC0332a
    public final void c() {
        ObjectAnimator objectAnimator = this.f5811c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // K0.AbstractC0332a
    public final void l() {
        t();
    }

    @Override // K0.AbstractC0332a
    public final void r() {
        if (this.f5811c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f5810i, 0.0f, 1.0f);
            this.f5811c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f5811c.setInterpolator(null);
            this.f5811c.setRepeatCount(-1);
            this.f5811c.addListener(new F7.e(5, this));
        }
        t();
        this.f5811c.start();
    }

    public final void t() {
        this.g = true;
        this.f5814f = 1;
        ArrayList arrayList = (ArrayList) this.f5053b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m mVar = (m) obj;
            t tVar = this.f5813e;
            mVar.f5799c = tVar.f5754c[0];
            mVar.f5800d = tVar.g / 2;
        }
    }

    @Override // K0.AbstractC0332a
    public final void p() {
    }

    @Override // K0.AbstractC0332a
    public final void s() {
    }

    @Override // K0.AbstractC0332a
    public final void o(c cVar) {
    }
}
