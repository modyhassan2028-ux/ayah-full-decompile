package com.google.android.material.transformation;

import E2.C0149x;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p050e8.b;
import p137n7.f;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f15390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f15391u;

    public FabTransformationScrimBehavior() {
        this.f15390t = new f(75L);
        this.f15391u = new f(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, u1.b
    public final boolean f(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // u1.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        f fVar = z10 ? this.f15390t : this.f15391u;
        if (z10) {
            if (!z11) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        fVar.a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        b.R(animatorSet, arrayList);
        animatorSet.addListener(new C0149x(view2, z10));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15390t = new f(75L);
        this.f15391u = new f(0L);
    }
}
