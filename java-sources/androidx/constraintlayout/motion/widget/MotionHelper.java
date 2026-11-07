package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p132n1.u;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f12162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View[] f12163B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12164y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12165z;

    public MotionHelper(Context context) {
        super(context);
        this.f12164y = false;
        this.f12165z = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f12164y = typedArrayObtainStyledAttributes.getBoolean(index, this.f12164y);
                } else if (index == 0) {
                    this.f12165z = typedArrayObtainStyledAttributes.getBoolean(index, this.f12165z);
                }
            }
        }
    }

    public float getProgress() {
        return this.f12162A;
    }

    public void setProgress(View view, float f3) {
    }

    public void setProgress(float f3) {
        this.f12162A = f3;
        int i10 = 0;
        if (this.f12261s > 0) {
            this.f12163B = f((ConstraintLayout) getParent());
            while (i10 < this.f12261s) {
                setProgress(this.f12163B[i10], f3);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f3);
            }
            i10++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12164y = false;
        this.f12165z = false;
        g(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12164y = false;
        this.f12165z = false;
        g(attributeSet);
    }
}
