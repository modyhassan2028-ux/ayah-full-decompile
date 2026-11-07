package com.google.android.material.transformation;

import E7.a;
import I1.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u1.b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15382r = 0;

    public ExpandableBehavior() {
    }

    @Override // u1.b
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u1.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z10 = ((FloatingActionButton) obj).f14934F.f1975b;
        if (z10) {
            int i10 = this.f15382r;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f15382r != 1) {
            return false;
        }
        this.f15382r = z10 ? 1 : 2;
        w((View) obj, view, z10, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u1.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a aVar;
        int i11;
        WeakHashMap weakHashMap = S.f3689a;
        if (!view.isLaidOut()) {
            ArrayList arrayListO = coordinatorLayout.o(view);
            int size = arrayListO.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListO.get(i12);
                if (f(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                boolean z10 = ((FloatingActionButton) aVar).f14934F.f1975b;
                if (!z10 ? this.f15382r == 1 : !((i11 = this.f15382r) != 0 && i11 != 2)) {
                    int i13 = z10 ? 1 : 2;
                    this.f15382r = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new p008a8.a(this, view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
