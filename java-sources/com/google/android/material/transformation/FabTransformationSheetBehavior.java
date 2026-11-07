package com.google.android.material.transformation;

import I1.S;
import L5.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import java.util.HashMap;
import java.util.WeakHashMap;
import p137n7.e;
import p137n7.g;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap f15392z;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final c D(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        c cVar = new c(18, false);
        cVar.f5532s = e.b(context, i10);
        cVar.f5533t = new g();
        return cVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void w(View view, View view2, boolean z10, boolean z11) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f15392z = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z12 = (childAt.getLayoutParams() instanceof u1.e) && (((u1.e) childAt.getLayoutParams()).f22806a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    if (z10) {
                        this.f15392z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = S.f3689a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f15392z;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f15392z.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = S.f3689a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z10) {
                this.f15392z = null;
            }
        }
        super.w(view, view2, z10, z11);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
