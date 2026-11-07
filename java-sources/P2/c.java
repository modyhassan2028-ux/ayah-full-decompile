package P2;

import I1.C0243b;
import I1.S;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6588d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f6589e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6590f;

    public c(SlidingPaneLayout slidingPaneLayout) {
        this.f6590f = slidingPaneLayout;
    }

    @Override // I1.C0243b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        switch (this.f6588d) {
            case 1:
                DrawerLayout drawerLayout = (DrawerLayout) this.f6590f;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.f3710a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                List<CharSequence> text = accessibilityEvent.getText();
                View viewF = drawerLayout.f();
                if (viewF != null) {
                    int iH = drawerLayout.h(viewF);
                    drawerLayout.getClass();
                    WeakHashMap weakHashMap = S.f3689a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(iH, drawerLayout.getLayoutDirection());
                    if (absoluteGravity == 3) {
                        charSequence = drawerLayout.S;
                    } else {
                        charSequence = absoluteGravity == 5 ? drawerLayout.T : null;
                    }
                    if (charSequence != null) {
                        text.add(charSequence);
                    }
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // I1.C0243b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6588d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                break;
            default:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
        }
    }

    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        int i10 = this.f6588d;
        Rect rect = this.f6589e;
        View.AccessibilityDelegate accessibilityDelegate = this.f3710a;
        switch (i10) {
            case 0:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6590f;
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                gVar.l(rect);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                gVar.m(accessibilityNodeInfoObtain.getClassName());
                gVar.p(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setClickable(accessibilityNodeInfoObtain.isClickable());
                accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                gVar.i(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
                gVar.a(accessibilityNodeInfoObtain.getActions());
                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
                gVar.m("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                gVar.f4221c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = S.f3689a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    gVar.f4220b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                int childCount = slidingPaneLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = slidingPaneLayout.getChildAt(i11);
                    if (!slidingPaneLayout.a(childAt) && childAt.getVisibility() == 0) {
                        childAt.setImportantForAccessibility(1);
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f4219a;
                if (DrawerLayout.f12534j0) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo2);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain2);
                    gVar.f4221c = -1;
                    accessibilityNodeInfo2.setSource(view);
                    WeakHashMap weakHashMap2 = S.f3689a;
                    Object parentForAccessibility2 = view.getParentForAccessibility();
                    if (parentForAccessibility2 instanceof View) {
                        gVar.f4220b = -1;
                        accessibilityNodeInfo2.setParent((View) parentForAccessibility2);
                    }
                    accessibilityNodeInfoObtain2.getBoundsInScreen(rect);
                    gVar.l(rect);
                    accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfoObtain2.isVisibleToUser());
                    accessibilityNodeInfo2.setPackageName(accessibilityNodeInfoObtain2.getPackageName());
                    gVar.m(accessibilityNodeInfoObtain2.getClassName());
                    gVar.p(accessibilityNodeInfoObtain2.getContentDescription());
                    accessibilityNodeInfo2.setEnabled(accessibilityNodeInfoObtain2.isEnabled());
                    accessibilityNodeInfo2.setFocused(accessibilityNodeInfoObtain2.isFocused());
                    gVar.i(accessibilityNodeInfoObtain2.isAccessibilityFocused());
                    accessibilityNodeInfo2.setSelected(accessibilityNodeInfoObtain2.isSelected());
                    gVar.a(accessibilityNodeInfoObtain2.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = viewGroup.getChildAt(i12);
                        if (DrawerLayout.i(childAt2)) {
                            accessibilityNodeInfo2.addChild(childAt2);
                        }
                    }
                }
                gVar.m("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo2.setFocusable(false);
                accessibilityNodeInfo2.setFocused(false);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) J1.d.f4196e.f4211a);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) J1.d.f4197f.f4211a);
                break;
        }
    }

    @Override // I1.C0243b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6588d) {
            case 0:
                if (((SlidingPaneLayout) this.f6590f).a(view)) {
                    return false;
                }
                return this.f3710a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                if (DrawerLayout.f12534j0 || DrawerLayout.i(view)) {
                    return this.f3710a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }
                return false;
        }
    }

    public c(DrawerLayout drawerLayout) {
        this.f6590f = drawerLayout;
    }
}
