package N1;

import I1.C0243b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5992d;

    public /* synthetic */ f(int i10) {
        this.f5992d = i10;
    }

    @Override // I1.C0243b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5992d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        int scrollRange;
        switch (this.f5992d) {
            case 0:
                this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                gVar.m(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    gVar.v(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        gVar.b(J1.d.f4200k);
                        gVar.b(J1.d.f4205p);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        gVar.b(J1.d.j);
                        gVar.b(J1.d.f4207r);
                    }
                    break;
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
                this.f3710a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!DrawerLayout.i(view)) {
                    gVar.f4220b = -1;
                    accessibilityNodeInfo.setParent(null);
                }
                break;
            case 2:
                this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                gVar.n(null);
                break;
            case 3:
                this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                gVar.v(false);
                break;
            default:
                this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                gVar.n(null);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // I1.C0243b
    public boolean g(View view, int i10, Bundle bundle) {
        int iMin;
        switch (this.f5992d) {
            case 0:
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i10 == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i10 == 8192 || i10 == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i10 == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.g(view, i10, bundle);
        }
    }
}
