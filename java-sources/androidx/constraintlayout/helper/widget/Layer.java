package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p153p1.e;
import s1.c;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f12144A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ConstraintLayout f12145B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f12146C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f12147D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f12148E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f12149F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f12150G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f12151H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f12152I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f12153J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f12154K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View[] f12155L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f12156M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f12157N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12158O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f12159P;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f12160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f12161z;

    public Layer(Context context) {
        super(context);
        this.f12160y = Float.NaN;
        this.f12161z = Float.NaN;
        this.f12144A = Float.NaN;
        this.f12146C = 1.0f;
        this.f12147D = 1.0f;
        this.f12148E = Float.NaN;
        this.f12149F = Float.NaN;
        this.f12150G = Float.NaN;
        this.f12151H = Float.NaN;
        this.f12152I = Float.NaN;
        this.f12153J = Float.NaN;
        this.f12154K = true;
        this.f12155L = null;
        this.f12156M = 0.0f;
        this.f12157N = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22038b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f12158O = true;
                } else if (index == 13) {
                    this.f12159P = true;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j() {
        n();
        this.f12148E = Float.NaN;
        this.f12149F = Float.NaN;
        e eVar = ((c) getLayoutParams()).f21902l0;
        eVar.z(0);
        eVar.w(0);
        m();
        layout(((int) this.f12152I) - getPaddingLeft(), ((int) this.f12153J) - getPaddingTop(), getPaddingRight() + ((int) this.f12150G), getPaddingBottom() + ((int) this.f12151H));
        if (Float.isNaN(this.f12144A)) {
            return;
        }
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(ConstraintLayout constraintLayout) {
        this.f12145B = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f12144A = rotation;
        } else {
            if (Float.isNaN(this.f12144A)) {
                return;
            }
            this.f12144A = rotation;
        }
    }

    public final void m() {
        if (this.f12145B == null) {
            return;
        }
        if (this.f12154K || Float.isNaN(this.f12148E) || Float.isNaN(this.f12149F)) {
            if (!Float.isNaN(this.f12160y) && !Float.isNaN(this.f12161z)) {
                this.f12149F = this.f12161z;
                this.f12148E = this.f12160y;
                return;
            }
            View[] viewArrF = f(this.f12145B);
            int left = viewArrF[0].getLeft();
            int top = viewArrF[0].getTop();
            int right = viewArrF[0].getRight();
            int bottom = viewArrF[0].getBottom();
            for (int i10 = 0; i10 < this.f12261s; i10++) {
                View view = viewArrF[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f12150G = right;
            this.f12151H = bottom;
            this.f12152I = left;
            this.f12153J = top;
            if (Float.isNaN(this.f12160y)) {
                this.f12148E = (left + right) / 2;
            } else {
                this.f12148E = this.f12160y;
            }
            if (Float.isNaN(this.f12161z)) {
                this.f12149F = (top + bottom) / 2;
            } else {
                this.f12149F = this.f12161z;
            }
        }
    }

    public final void n() {
        int i10;
        if (this.f12145B == null || (i10 = this.f12261s) == 0) {
            return;
        }
        View[] viewArr = this.f12155L;
        if (viewArr == null || viewArr.length != i10) {
            this.f12155L = new View[i10];
        }
        for (int i11 = 0; i11 < this.f12261s; i11++) {
            this.f12155L[i11] = this.f12145B.d(this.f12260r[i11]);
        }
    }

    public final void o() {
        if (this.f12145B == null) {
            return;
        }
        if (this.f12155L == null) {
            n();
        }
        m();
        double radians = Math.toRadians(this.f12144A);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f3 = this.f12146C;
        float f7 = f3 * fCos;
        float f10 = this.f12147D;
        float f11 = (-f10) * fSin;
        float f12 = f3 * fSin;
        float f13 = f10 * fCos;
        for (int i10 = 0; i10 < this.f12261s; i10++) {
            View view = this.f12155L[i10];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f14 = right - this.f12148E;
            float f15 = bottom - this.f12149F;
            float f16 = (((f11 * f15) + (f7 * f14)) - f14) + this.f12156M;
            float f17 = (((f13 * f15) + (f14 * f12)) - f15) + this.f12157N;
            view.setTranslationX(f16);
            view.setTranslationY(f17);
            view.setScaleY(this.f12147D);
            view.setScaleX(this.f12146C);
            view.setRotation(this.f12144A);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12145B = (ConstraintLayout) getParent();
        if (this.f12158O || this.f12159P) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f12261s; i10++) {
                View viewD = this.f12145B.d(this.f12260r[i10]);
                if (viewD != null) {
                    if (this.f12158O) {
                        viewD.setVisibility(visibility);
                    }
                    if (this.f12159P && elevation > 0.0f) {
                        viewD.setTranslationZ(viewD.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        c();
    }

    @Override // android.view.View
    public void setPivotX(float f3) {
        this.f12160y = f3;
        o();
    }

    @Override // android.view.View
    public void setPivotY(float f3) {
        this.f12161z = f3;
        o();
    }

    @Override // android.view.View
    public void setRotation(float f3) {
        this.f12144A = f3;
        o();
    }

    @Override // android.view.View
    public void setScaleX(float f3) {
        this.f12146C = f3;
        o();
    }

    @Override // android.view.View
    public void setScaleY(float f3) {
        this.f12147D = f3;
        o();
    }

    @Override // android.view.View
    public void setTranslationX(float f3) {
        this.f12156M = f3;
        o();
    }

    @Override // android.view.View
    public void setTranslationY(float f3) {
        this.f12157N = f3;
        o();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12160y = Float.NaN;
        this.f12161z = Float.NaN;
        this.f12144A = Float.NaN;
        this.f12146C = 1.0f;
        this.f12147D = 1.0f;
        this.f12148E = Float.NaN;
        this.f12149F = Float.NaN;
        this.f12150G = Float.NaN;
        this.f12151H = Float.NaN;
        this.f12152I = Float.NaN;
        this.f12153J = Float.NaN;
        this.f12154K = true;
        this.f12155L = null;
        this.f12156M = 0.0f;
        this.f12157N = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12160y = Float.NaN;
        this.f12161z = Float.NaN;
        this.f12144A = Float.NaN;
        this.f12146C = 1.0f;
        this.f12147D = 1.0f;
        this.f12148E = Float.NaN;
        this.f12149F = Float.NaN;
        this.f12150G = Float.NaN;
        this.f12151H = Float.NaN;
        this.f12152I = Float.NaN;
        this.f12153J = Float.NaN;
        this.f12154K = true;
        this.f12155L = null;
        this.f12156M = 0.0f;
        this.f12157N = 0.0f;
    }
}
