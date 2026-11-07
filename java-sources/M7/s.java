package M7;

import K0.AbstractC0332a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.ayah.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0332a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5818k = {533, 567, 850, 750};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5819l = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final F7.f f5820m = new F7.f(Float.class, "animationFraction", 8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f5821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f5822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator[] f5823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f5824f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5826i;
    public c j;

    public s(Context context, t tVar) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f5824f = tVar;
        this.f5823e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // K0.AbstractC0332a
    public final void c() {
        ObjectAnimator objectAnimator = this.f5821c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // K0.AbstractC0332a
    public final void l() {
        t();
    }

    @Override // K0.AbstractC0332a
    public final void o(c cVar) {
        this.j = cVar;
    }

    @Override // K0.AbstractC0332a
    public final void p() {
        ObjectAnimator objectAnimator = this.f5822d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((o) this.f5052a).isVisible()) {
            this.f5822d.setFloatValues(this.f5826i, 1.0f);
            this.f5822d.setDuration((long) ((1.0f - this.f5826i) * 1800.0f));
            this.f5822d.start();
        }
    }

    @Override // K0.AbstractC0332a
    public final void r() {
        ObjectAnimator objectAnimator = this.f5821c;
        F7.f fVar = f5820m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, fVar, 0.0f, 1.0f);
            this.f5821c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f5821c.setInterpolator(null);
            this.f5821c.setRepeatCount(-1);
            this.f5821c.addListener(new r(this, 0));
        }
        if (this.f5822d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, fVar, 1.0f);
            this.f5822d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f5822d.setInterpolator(null);
            this.f5822d.addListener(new r(this, 1));
        }
        t();
        this.f5821c.start();
    }

    @Override // K0.AbstractC0332a
    public final void s() {
        this.j = null;
    }

    public final void t() {
        this.g = 0;
        ArrayList arrayList = (ArrayList) this.f5053b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).f5799c = this.f5824f.f5754c[0];
        }
    }
}
