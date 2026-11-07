package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p153p1.h;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12287y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12288z;

    public VirtualLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22038b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f12287y = true;
                } else if (index == 13) {
                    this.f12288z = true;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f12287y || this.f12288z) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f12261s; i10++) {
                View viewD = constraintLayout.d(this.f12260r[i10]);
                if (viewD != null) {
                    if (this.f12287y) {
                        viewD.setVisibility(visibility);
                    }
                    if (this.f12288z && elevation > 0.0f) {
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
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void m(h hVar, int i10, int i11) {
    }
}
