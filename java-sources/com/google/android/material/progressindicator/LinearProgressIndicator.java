package com.google.android.material.progressindicator;

import H7.H;
import I1.S;
import K0.AbstractC0332a;
import M7.d;
import M7.j;
import M7.o;
import M7.p;
import M7.q;
import M7.s;
import M7.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ayah.R;
import java.util.WeakHashMap;
import p128m7.a;

/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<t> {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final d a(Context context, AttributeSet attributeSet) {
        t tVar = new t(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        H.c(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = a.f19684x;
        H.d(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        tVar.f5827h = typedArrayObtainStyledAttributes.getInt(0, 1);
        tVar.f5828i = typedArrayObtainStyledAttributes.getInt(1, 0);
        tVar.f5829k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), tVar.f5752a);
        typedArrayObtainStyledAttributes.recycle();
        tVar.a();
        tVar.j = tVar.f5828i == 1;
        return tVar;
    }

    public int getIndeterminateAnimationType() {
        return ((t) this.f15103r).f5827h;
    }

    public int getIndicatorDirection() {
        return ((t) this.f15103r).f5828i;
    }

    public int getTrackStopIndicatorSize() {
        return ((t) this.f15103r).f5829k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d dVar = this.f15103r;
        t tVar = (t) dVar;
        boolean z11 = true;
        if (((t) dVar).f5828i != 1) {
            WeakHashMap weakHashMap = S.f3689a;
            if ((getLayoutDirection() != 1 || ((t) dVar).f5828i != 2) && (getLayoutDirection() != 0 || ((t) dVar).f5828i != 3)) {
                z11 = false;
            }
        }
        tVar.j = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        o indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        j progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        d dVar = this.f15103r;
        if (((t) dVar).f5827h == i10) {
            return;
        }
        if (b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((t) dVar).f5827h = i10;
        ((t) dVar).a();
        if (i10 == 0) {
            o indeterminateDrawable = getIndeterminateDrawable();
            q qVar = new q((t) dVar);
            indeterminateDrawable.f5803D = qVar;
            qVar.f5052a = indeterminateDrawable;
        } else {
            o indeterminateDrawable2 = getIndeterminateDrawable();
            s sVar = new s(getContext(), (t) dVar);
            indeterminateDrawable2.f5803D = sVar;
            sVar.f5052a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((t) this.f15103r).a();
    }

    public void setIndicatorDirection(int i10) {
        d dVar = this.f15103r;
        ((t) dVar).f5828i = i10;
        t tVar = (t) dVar;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap weakHashMap = S.f3689a;
            if ((getLayoutDirection() != 1 || ((t) dVar).f5828i != 2) && (getLayoutDirection() != 0 || i10 != 3)) {
                z10 = false;
            }
        }
        tVar.j = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i10, boolean z10) {
        d dVar = this.f15103r;
        if (dVar != null && ((t) dVar).f5827h == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i10, z10);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((t) this.f15103r).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        d dVar = this.f15103r;
        if (((t) dVar).f5829k != i10) {
            ((t) dVar).f5829k = Math.min(i10, ((t) dVar).f5752a);
            ((t) dVar).a();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        AbstractC0332a sVar;
        super(context, attributeSet, i10, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        t tVar = (t) this.f15103r;
        p pVar = new p(tVar);
        pVar.f5805b = 300.0f;
        Context context2 = getContext();
        if (tVar.f5827h == 0) {
            sVar = new q(tVar);
        } else {
            sVar = new s(context2, tVar);
        }
        setIndeterminateDrawable(new o(context2, tVar, pVar, sVar));
        setProgressDrawable(new j(getContext(), tVar, pVar));
    }
}
