package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import s1.c;

/* JADX INFO: loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j() {
        c cVar = (c) getLayoutParams();
        cVar.f21902l0.z(0);
        cVar.f21902l0.w(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
