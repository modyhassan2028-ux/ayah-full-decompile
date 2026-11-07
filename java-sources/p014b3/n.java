package p014b3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class n extends RecyclerView {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f13231c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f13231c1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f13231c1.f13048K.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f13231c1;
        accessibilityEvent.setFromIndex(viewPager2.f13052u);
        accessibilityEvent.setToIndex(viewPager2.f13052u);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f13048K.f557u);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13231c1.f13046I && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f13231c1.f13046I && super.onTouchEvent(motionEvent);
    }
}
