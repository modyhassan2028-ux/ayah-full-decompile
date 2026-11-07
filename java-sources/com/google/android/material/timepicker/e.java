package com.google.android.material.timepicker;

import I1.S;
import K0.RunnableC0354l;
import R7.k;
import R7.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ayah.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC0354l f15376H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15377I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final R7.i f15378J;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        R7.i iVar = new R7.i();
        this.f15378J = iVar;
        k kVar = new k(0.5f);
        m mVarG = iVar.f7325r.f7294a.g();
        mVarG.f7341e = kVar;
        mVarG.f7342f = kVar;
        mVarG.g = kVar;
        mVarG.f7343h = kVar;
        iVar.setShapeAppearanceModel(mVarG.a());
        this.f15378J.m(ColorStateList.valueOf(-1));
        R7.i iVar2 = this.f15378J;
        WeakHashMap weakHashMap = S.f3689a;
        setBackground(iVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.Q, R.attr.materialClockStyle, 0);
        this.f15377I = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15376H = new RunnableC0354l(17, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = S.f3689a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0354l runnableC0354l = this.f15376H;
            handler.removeCallbacks(runnableC0354l);
            handler.post(runnableC0354l);
        }
    }

    public abstract void o();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0354l runnableC0354l = this.f15376H;
            handler.removeCallbacks(runnableC0354l);
            handler.post(runnableC0354l);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f15378J.m(ColorStateList.valueOf(i10));
    }
}
