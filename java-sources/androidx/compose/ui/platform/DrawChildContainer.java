package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import p180s0.AbstractC1295d;
import p180s0.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12072r;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(o oVar, ViewLayer viewLayer, long j) {
        super.drawChild(AbstractC1295d.a(oVar), viewLayer, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            j.c(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).f12091y) {
                this.f12072r = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f12072r = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f12072r) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
