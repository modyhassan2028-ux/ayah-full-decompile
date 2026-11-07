package com.google.android.material.progressindicator;

import H7.H;
import I1.S;
import M7.a;
import M7.b;
import M7.c;
import M7.d;
import M7.j;
import M7.l;
import M7.n;
import M7.o;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseProgressIndicator<S extends d> extends ProgressBar {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f15099D = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f15100A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f15101B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f15102C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f15103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15104s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15105t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15106u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15107v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f15108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15110y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f15111z;

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i10);
        this.f15109x = false;
        this.f15110y = 4;
        this.f15111z = new b(this, 0);
        this.f15100A = new b(this, 1);
        this.f15101B = new c(0, this);
        this.f15102C = new c(1, this);
        Context context2 = getContext();
        this.f15103r = a(context2, attributeSet);
        H.c(context2, attributeSet, i10, i11);
        int[] iArr = p128m7.a.f19660d;
        H.d(context2, attributeSet, iArr, i10, i11, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        typedArrayObtainStyledAttributes.getInt(6, -1);
        this.f15107v = Math.min(typedArrayObtainStyledAttributes.getInt(4, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f15108w = new a();
        this.f15106u = true;
    }

    private n getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f5802C;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f5779C;
    }

    public abstract d a(Context context, AttributeSet attributeSet);

    public final boolean b() {
        WeakHashMap weakHashMap = S.f3689a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f15103r.f5757f;
    }

    public int[] getIndicatorColor() {
        return this.f15103r.f5754c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f15103r.g;
    }

    public int getShowAnimationBehavior() {
        return this.f15103r.f5756e;
    }

    public int getTrackColor() {
        return this.f15103r.f5755d;
    }

    public int getTrackCornerRadius() {
        return this.f15103r.f5753b;
    }

    public int getTrackThickness() {
        return this.f15103r.f5752a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f5803D.o(this.f15101B);
        }
        j progressDrawable = getProgressDrawable();
        c cVar = this.f15102C;
        if (progressDrawable != null) {
            j progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f5793w == null) {
                progressDrawable2.f5793w = new ArrayList();
            }
            if (!progressDrawable2.f5793w.contains(cVar)) {
                progressDrawable2.f5793w.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            o indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f5793w == null) {
                indeterminateDrawable.f5793w = new ArrayList();
            }
            if (!indeterminateDrawable.f5793w.contains(cVar)) {
                indeterminateDrawable.f5793w.add(cVar);
            }
        }
        if (b()) {
            if (this.f15107v > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f15100A);
        removeCallbacks(this.f15111z);
        ((l) getCurrentDrawable()).c(false, false, false);
        o indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f15102C;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(cVar);
            getIndeterminateDrawable().f5803D.s();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        try {
            n currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        if (this.f15106u) {
            ((l) getCurrentDrawable()).c(b(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f15106u) {
            ((l) getCurrentDrawable()).c(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f15108w = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f5790t = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f5790t = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f15103r.f5757f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            l lVar = (l) getCurrentDrawable();
            if (lVar != null) {
                lVar.c(false, false, false);
            }
            super.setIndeterminate(z10);
            l lVar2 = (l) getCurrentDrawable();
            if (lVar2 != null) {
                lVar2.c(b(), false, false);
            }
            if ((lVar2 instanceof o) && b()) {
                ((o) lVar2).f5803D.r();
            }
            this.f15109x = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof o)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((l) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{Y2.a.C(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f15103r.f5754c = iArr;
        getIndeterminateDrawable().f5803D.l();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        d dVar = this.f15103r;
        if (dVar.g != i10) {
            dVar.g = i10;
            dVar.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i10, false);
    }

    public void setProgressCompat(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f15104s = i10;
            this.f15105t = z10;
            this.f15109x = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f15108w;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f5803D.p();
                    return;
                }
            }
            this.f15101B.a(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof j)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            j jVar = (j) drawable;
            jVar.c(false, false, false);
            super.setProgressDrawable(jVar);
            jVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f15103r.f5756e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        d dVar = this.f15103r;
        if (dVar.f5755d != i10) {
            dVar.f5755d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        d dVar = this.f15103r;
        if (dVar.f5753b != i10) {
            dVar.f5753b = Math.min(i10, dVar.f5752a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        d dVar = this.f15103r;
        if (dVar.f5752a != i10) {
            dVar.f5752a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f15110y = i10;
    }

    @Override // android.widget.ProgressBar
    public o getIndeterminateDrawable() {
        return (o) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public j getProgressDrawable() {
        return (j) super.getProgressDrawable();
    }
}
