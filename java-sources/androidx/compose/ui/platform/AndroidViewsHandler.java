package androidx.compose.ui.platform;

import G0.a;
import J0.I;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidViewsHandler extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f12068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f12069s;

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
        this.f12068r = new HashMap();
        this.f12069s = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, I> getHolderToLayoutNode() {
        return this.f12068r;
    }

    public final HashMap<I, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f12069s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (AndroidViewHolder androidViewHolder : this.f12068r.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (AndroidViewHolder androidViewHolder : this.f12068r.keySet()) {
            int i13 = androidViewHolder.f12108L;
            if (i13 != Integer.MIN_VALUE && (i12 = androidViewHolder.f12109M) != Integer.MIN_VALUE) {
                androidViewHolder.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            I i11 = (I) this.f12068r.get(childAt);
            if (childAt.isLayoutRequested() && i11 != null) {
                I.W(i11, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
