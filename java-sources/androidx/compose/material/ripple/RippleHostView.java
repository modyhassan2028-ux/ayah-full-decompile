package androidx.compose.material.ripple;

import B.l;
import K0.RunnableC0354l;
import V.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import p171r0.c;
import p171r0.i;
import p180s0.F;
import p180s0.q;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f11906w = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f11907x = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f11908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f11909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Long f11910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RunnableC0354l f11911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f11912v;

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f11911u;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f11910t;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f11906w : f11907x;
            m mVar = this.f11908r;
            if (mVar != null) {
                mVar.setState(iArr);
            }
        } else {
            RunnableC0354l runnableC0354l = new RunnableC0354l(6, this);
            this.f11911u = runnableC0354l;
            postDelayed(runnableC0354l, 50L);
        }
        this.f11910t = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        m mVar = rippleHostView.f11908r;
        if (mVar != null) {
            mVar.setState(f11907x);
        }
        rippleHostView.f11911u = null;
    }

    public final void b(l lVar, boolean z10, long j, int i10, long j10, float f3, a aVar) {
        if (this.f11908r == null || !Boolean.valueOf(z10).equals(this.f11909s)) {
            m mVar = new m(z10);
            setBackground(mVar);
            this.f11908r = mVar;
            this.f11909s = Boolean.valueOf(z10);
        }
        m mVar2 = this.f11908r;
        j.b(mVar2);
        this.f11912v = aVar;
        m1setRipplePropertiesbiQXAtU(j, i10, j10, f3);
        if (z10) {
            mVar2.setHotspot(c.d(lVar.f571a), c.e(lVar.f571a));
        } else {
            mVar2.setHotspot(mVar2.getBounds().centerX(), mVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f11912v = null;
        RunnableC0354l runnableC0354l = this.f11911u;
        if (runnableC0354l != null) {
            removeCallbacks(runnableC0354l);
            RunnableC0354l runnableC0354l2 = this.f11911u;
            j.b(runnableC0354l2);
            runnableC0354l2.run();
        } else {
            m mVar = this.f11908r;
            if (mVar != null) {
                mVar.setState(f11907x);
            }
        }
        m mVar2 = this.f11908r;
        if (mVar2 == null) {
            return;
        }
        mVar2.setVisible(false, false);
        unscheduleDrawable(mVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a aVar = this.f11912v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m1setRipplePropertiesbiQXAtU(long j, int i10, long j10, float f3) {
        m mVar = this.f11908r;
        if (mVar == null) {
            return;
        }
        Integer num = mVar.f8364t;
        if (num == null || num.intValue() != i10) {
            mVar.f8364t = Integer.valueOf(i10);
            mVar.setRadius(i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f3 *= 2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        long jB = q.b(j10, f3);
        q qVar = mVar.f8363s;
        if (!(qVar == null ? false : q.c(qVar.f21845a, jB))) {
            mVar.f8363s = new q(jB);
            mVar.setColor(ColorStateList.valueOf(F.u(jB)));
        }
        Rect rect = new Rect(0, 0, B9.a.V(i.d(j)), B9.a.V(i.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        mVar.setBounds(rect);
    }
}
