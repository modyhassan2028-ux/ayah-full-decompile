package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import s1.c;
import s1.g;
import s1.h;
import s1.l;
import s1.m;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f12283r;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new m();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        m mVar = new m(context, attributeSet);
        mVar.f22024m0 = 1.0f;
        mVar.f22025n0 = false;
        mVar.f22026o0 = 0.0f;
        mVar.f22027p0 = 0.0f;
        mVar.f22028q0 = 0.0f;
        mVar.f22029r0 = 0.0f;
        mVar.f22030s0 = 1.0f;
        mVar.f22031t0 = 1.0f;
        mVar.f22032u0 = 0.0f;
        mVar.f22033v0 = 0.0f;
        mVar.f22034w0 = 0.0f;
        mVar.f22035x0 = 0.0f;
        mVar.f22036y0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22040d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 15) {
                mVar.f22024m0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22024m0);
            } else if (index == 28) {
                mVar.f22026o0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22026o0);
                mVar.f22025n0 = true;
            } else if (index == 23) {
                mVar.f22028q0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22028q0);
            } else if (index == 24) {
                mVar.f22029r0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22029r0);
            } else if (index == 22) {
                mVar.f22027p0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22027p0);
            } else if (index == 20) {
                mVar.f22030s0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22030s0);
            } else if (index == 21) {
                mVar.f22031t0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22031t0);
            } else if (index == 16) {
                mVar.f22032u0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22032u0);
            } else if (index == 17) {
                mVar.f22033v0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22033v0);
            } else if (index == 18) {
                mVar.f22034w0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22034w0);
            } else if (index == 19) {
                mVar.f22035x0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22035x0);
            } else if (index == 27) {
                mVar.f22036y0 = typedArrayObtainStyledAttributes.getFloat(index, mVar.f22036y0);
            }
        }
        return mVar;
    }

    public l getConstraintSet() {
        if (this.f12283r == null) {
            this.f12283r = new l();
        }
        l lVar = this.f12283r;
        lVar.getClass();
        int childCount = getChildCount();
        HashMap map = lVar.f22023c;
        map.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            m mVar = (m) childAt.getLayoutParams();
            int id = childAt.getId();
            if (lVar.f22022b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new g());
            }
            g gVar = (g) map.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                h hVar = gVar.f21936d;
                gVar.c(id, mVar);
                if (constraintHelper instanceof Barrier) {
                    hVar.f21968d0 = 1;
                    Barrier barrier = (Barrier) constraintHelper;
                    hVar.f21964b0 = barrier.getType();
                    hVar.f21970e0 = barrier.getReferencedIds();
                    hVar.f21966c0 = barrier.getMargin();
                }
            }
            gVar.c(id, mVar);
        }
        return this.f12283r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }
}
