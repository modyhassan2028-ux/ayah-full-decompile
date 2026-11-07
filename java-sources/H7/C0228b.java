package H7;

import E2.AbstractC0115c0;
import I1.C0243b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ayah.R;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: renamed from: H7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228b extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3469e;

    public /* synthetic */ C0228b(int i10, Object obj) {
        this.f3468d = i10;
        this.f3469e = obj;
    }

    @Override // I1.C0243b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3468d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3469e).f14966u);
                break;
            case 1:
            default:
                super.c(view, accessibilityEvent);
                break;
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
        }
    }

    @Override // I1.C0243b
    public void d(View view, J1.g gVar) {
        int i10;
        int i11 = this.f3468d;
        View.AccessibilityDelegate accessibilityDelegate = this.f3710a;
        Object obj = this.f3469e;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f14967v);
                accessibilityNodeInfo.setChecked(checkableImageButton.f14966u);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f4219a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f14984O);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                gVar.m(ViewPager.class.getName());
                gVar.v(false);
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                gVar.r(materialCalendar.f14832z0.getVisibility() == 0 ? materialCalendar.p().getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.p().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo3 = gVar.f4219a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                if (((p193t7.e) obj).f22631A) {
                    gVar.a(1048576);
                    accessibilityNodeInfo3.setDismissable(true);
                } else {
                    accessibilityNodeInfo3.setDismissable(false);
                }
                break;
            case 5:
            default:
                super.d(view, gVar);
                break;
            case 6:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i12 = MaterialButtonToggleGroup.f14730B;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < materialButtonToggleGroup.getChildCount(); i14++) {
                        if (materialButtonToggleGroup.getChildAt(i14) == view) {
                            i10 = i13;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.c(i14)) {
                                i13++;
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    i10 = -1;
                }
                gVar.o(J1.f.a(0, 1, i10, 1, false, ((MaterialButton) view).f14721F));
                break;
            case 7:
                p226x2.s sVar = (p226x2.s) obj;
                sVar.g.d(view, gVar);
                RecyclerView recyclerView = sVar.f24339f;
                recyclerView.getClass();
                int iN = RecyclerView.N(view);
                AbstractC0115c0 adapter = recyclerView.getAdapter();
                if (adapter instanceof p226x2.p) {
                    ((p226x2.p) adapter).l(iN);
                    break;
                }
                break;
        }
    }

    @Override // I1.C0243b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3468d) {
            case 5:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f3469e;
                    int i10 = BottomSheetDragHandleView.f14704D;
                    bottomSheetDragHandleView.a();
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // I1.C0243b
    public boolean g(View view, int i10, Bundle bundle) {
        switch (this.f3468d) {
            case 2:
                ViewPager viewPager = (ViewPager) this.f3469e;
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                if (i10 == 4096 || i10 == 8192) {
                    viewPager.getClass();
                }
                return false;
            case 4:
                if (i10 == 1048576) {
                    p193t7.e eVar = (p193t7.e) this.f3469e;
                    if (eVar.f22631A) {
                        eVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i10, bundle);
            case 7:
                return ((p226x2.s) this.f3469e).g.g(view, i10, bundle);
            default:
                return super.g(view, i10, bundle);
        }
    }
}
