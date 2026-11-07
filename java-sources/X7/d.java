package X7;

import K0.RunnableC0354l;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.ayah.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10000f;
    public final TimeInterpolator g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f10001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f10002i;
    public final E5.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f10003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f10004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f10005m;

    public d(m mVar) {
        super(mVar);
        this.j = new E5.b(3, this);
        this.f10003k = new a(this, 0);
        this.f9999e = p050e8.b.S(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f10000f = p050e8.b.S(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = p050e8.b.T(mVar.getContext(), R.attr.motionEasingLinearInterpolator, p137n7.a.f20015a);
        this.f10001h = p050e8.b.T(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20018d);
    }

    @Override // X7.n
    public final void a() {
        if (this.f10047b.f10030G != null) {
            return;
        }
        s(t());
    }

    @Override // X7.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // X7.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // X7.n
    public final View.OnFocusChangeListener e() {
        return this.f10003k;
    }

    @Override // X7.n
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // X7.n
    public final View.OnFocusChangeListener g() {
        return this.f10003k;
    }

    @Override // X7.n
    public final void l(EditText editText) {
        this.f10002i = editText;
        this.f10046a.setEndIconVisible(t());
    }

    @Override // X7.n
    public final void o(boolean z10) {
        if (this.f10047b.f10030G == null) {
            return;
        }
        s(z10);
    }

    @Override // X7.n
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f10001h);
        valueAnimatorOfFloat.setDuration(this.f10000f);
        final int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f9996b;

            {
                this.f9996b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.f9996b;
                        dVar.getClass();
                        dVar.f10049d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f9996b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f10049d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f9999e;
        valueAnimatorOfFloat2.setDuration(i11);
        final int i12 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f9996b;

            {
                this.f9996b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        d dVar = this.f9996b;
                        dVar.getClass();
                        dVar.f10049d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f9996b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f10049d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10004l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f10004l.addListener(new c(this, i12));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f9996b;

            {
                this.f9996b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        d dVar = this.f9996b;
                        dVar.getClass();
                        dVar.f10049d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f9996b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f10049d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f10005m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i10));
    }

    @Override // X7.n
    public final void r() {
        EditText editText = this.f10002i;
        if (editText != null) {
            editText.post(new RunnableC0354l(7, this));
        }
    }

    public final void s(boolean z10) {
        boolean z11 = this.f10047b.d() == z10;
        if (z10 && !this.f10004l.isRunning()) {
            this.f10005m.cancel();
            this.f10004l.start();
            if (z11) {
                this.f10004l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f10004l.cancel();
        this.f10005m.start();
        if (z11) {
            this.f10005m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f10002i;
        if (editText != null) {
            return (editText.hasFocus() || this.f10049d.hasFocus()) && this.f10002i.getText().length() > 0;
        }
        return false;
    }
}
