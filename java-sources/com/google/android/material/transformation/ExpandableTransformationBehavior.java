package com.google.android.material.transformation;

import F7.e;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AnimatorSet f15383s;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f15383s;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z10, z12);
        this.f15383s = animatorSetX;
        animatorSetX.addListener(new e(11, this));
        this.f15383s.start();
        if (z11) {
            return;
        }
        this.f15383s.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
