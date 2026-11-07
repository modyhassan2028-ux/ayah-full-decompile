package P2;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p000a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6592c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f6591b = i10;
        this.f6592c = obj;
    }

    @Override // p000a.a
    public int L(View view) {
        switch (this.f6591b) {
            case 0:
                return ((SlidingPaneLayout) this.f6592c).f12975z;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6592c;
                return sideSheetBehavior.f15159C + sideSheetBehavior.f15162F;
            default:
                return super.L(view);
        }
    }

    @Override // p000a.a
    public int M() {
        switch (this.f6591b) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6592c;
                return bottomSheetBehavior.f14671Z ? bottomSheetBehavior.f14682k0 : bottomSheetBehavior.f14669X;
            default:
                return super.M();
        }
    }

    @Override // p000a.a
    public void T(int i10, int i11) {
        switch (this.f6591b) {
            case 0:
                if (v0()) {
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                    slidingPaneLayout.f12958F.c(i11, slidingPaneLayout.f12972w);
                    break;
                }
                break;
        }
    }

    @Override // p000a.a
    public void U(int i10) {
        switch (this.f6591b) {
            case 0:
                if (v0()) {
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                    slidingPaneLayout.f12958F.c(i10, slidingPaneLayout.f12972w);
                    break;
                }
                break;
        }
    }

    @Override // p000a.a
    public void Y(View view, int i10) {
        switch (this.f6591b) {
            case 0:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                int childCount = slidingPaneLayout.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = slidingPaneLayout.getChildAt(i11);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                break;
        }
    }

    @Override // p000a.a
    public final void Z(int i10) {
        switch (this.f6591b) {
            case 0:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f12957E;
                if (slidingPaneLayout.f12958F.f7201a == 0) {
                    if (slidingPaneLayout.f12973x != 1.0f) {
                        Iterator it = copyOnWriteArrayList.iterator();
                        if (it.hasNext()) {
                            throw p245z2.a.z(it);
                        }
                        slidingPaneLayout.sendAccessibilityEvent(32);
                        slidingPaneLayout.f12959G = true;
                        return;
                    }
                    slidingPaneLayout.f(slidingPaneLayout.f12972w);
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    if (it2.hasNext()) {
                        throw p245z2.a.z(it2);
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.f12959G = false;
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6592c;
                    if (sideSheetBehavior.f15177x) {
                        sideSheetBehavior.x(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6592c;
                    if (bottomSheetBehavior.f14673b0) {
                        bottomSheetBehavior.M(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p000a.a
    public final void a0(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f6591b) {
            case 0:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                if (slidingPaneLayout.f12972w == null) {
                    slidingPaneLayout.f12973x = 0.0f;
                } else {
                    boolean zB = slidingPaneLayout.b();
                    e eVar = (e) slidingPaneLayout.f12972w.getLayoutParams();
                    int width = slidingPaneLayout.f12972w.getWidth();
                    if (zB) {
                        i10 = (slidingPaneLayout.getWidth() - i10) - width;
                    }
                    float paddingRight = (i10 - ((zB ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zB ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin))) / slidingPaneLayout.f12975z;
                    slidingPaneLayout.f12973x = paddingRight;
                    if (slidingPaneLayout.f12954B != 0) {
                        slidingPaneLayout.d(paddingRight);
                    }
                    Iterator it = slidingPaneLayout.f12957E.iterator();
                    if (it.hasNext()) {
                        throw p245z2.a.z(it);
                    }
                }
                slidingPaneLayout.invalidate();
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6592c;
                WeakReference weakReference = sideSheetBehavior.f15164H;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f15171r.k0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f15169M;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f15171r.e(i10);
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw p245z2.a.z(it2);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f6592c).A(i11);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p000a.a
    public final void b0(View view, float f3, float f7) {
        int paddingLeft;
        int i10;
        switch (this.f6591b) {
            case 0:
                e eVar = (e) view.getLayoutParams();
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                if (slidingPaneLayout.b()) {
                    int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    if (f3 < 0.0f || (f3 == 0.0f && slidingPaneLayout.f12973x > 0.5f)) {
                        paddingRight += slidingPaneLayout.f12975z;
                    }
                    paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f12972w.getWidth();
                } else {
                    paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + slidingPaneLayout.getPaddingLeft();
                    if (f3 > 0.0f || (f3 == 0.0f && slidingPaneLayout.f12973x > 0.5f)) {
                        paddingLeft += slidingPaneLayout.f12975z;
                    }
                }
                slidingPaneLayout.f12958F.s(paddingLeft, view.getTop());
                slidingPaneLayout.invalidate();
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6592c;
                if (!sideSheetBehavior.f15171r.S(f3)) {
                    if (!sideSheetBehavior.f15171r.f0(view, f3)) {
                        if (f3 == 0.0f || Math.abs(f3) <= Math.abs(f7)) {
                            int left = view.getLeft();
                            i10 = Math.abs(left - sideSheetBehavior.f15171r.E()) < Math.abs(left - sideSheetBehavior.f15171r.G()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f15171r.U(f3, f7) || sideSheetBehavior.f15171r.T(view)) {
                    }
                }
                sideSheetBehavior.z(view, i10, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6592c;
                int i11 = 6;
                if (f7 < 0.0f) {
                    if (bottomSheetBehavior.f14691s) {
                        i11 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f14667V) {
                            i11 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f14671Z && bottomSheetBehavior.N(view, f7)) {
                    if (Math.abs(f3) >= Math.abs(f7) || f7 <= bottomSheetBehavior.f14695u) {
                        if (view.getTop() > (bottomSheetBehavior.E() + bottomSheetBehavior.f14682k0) / 2) {
                            i11 = 5;
                        } else if (bottomSheetBehavior.f14691s || Math.abs(view.getTop() - bottomSheetBehavior.E()) < Math.abs(view.getTop() - bottomSheetBehavior.f14667V)) {
                            i11 = 3;
                        }
                    } else {
                        i11 = 5;
                    }
                } else if (f7 == 0.0f || Math.abs(f3) > Math.abs(f7)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f14691s) {
                        int i12 = bottomSheetBehavior.f14667V;
                        if (top2 < i12) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f14669X)) {
                                i11 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.f14669X)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i11 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.U) < Math.abs(top2 - bottomSheetBehavior.f14669X)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (bottomSheetBehavior.f14691s) {
                    i11 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f14667V) < Math.abs(top3 - bottomSheetBehavior.f14669X)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i11 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.O(view, i11, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    @Override // p000a.a
    public final boolean o0(int i10, View view) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f6591b) {
            case 0:
                if (v0()) {
                    return ((e) view.getLayoutParams()).f6595b;
                }
                return false;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6592c;
                return (sideSheetBehavior.f15178y == 1 || (weakReference = sideSheetBehavior.f15163G) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6592c;
                int i11 = bottomSheetBehavior.f14674c0;
                if (i11 != 1 && !bottomSheetBehavior.f14694t0) {
                    if (i11 == 3 && bottomSheetBehavior.f14690r0 == i10) {
                        WeakReference weakReference3 = bottomSheetBehavior.f14685n0;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference2 = bottomSheetBehavior.f14683l0;
                            if (weakReference2 == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference2 = bottomSheetBehavior.f14683l0;
                        if (weakReference2 == null && weakReference2.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // p000a.a
    public final int p(int i10, View view) {
        switch (this.f6591b) {
            case 0:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
                e eVar = (e) slidingPaneLayout.f12972w.getLayoutParams();
                if (!slidingPaneLayout.b()) {
                    int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    return Math.min(Math.max(i10, paddingLeft), slidingPaneLayout.f12975z + paddingLeft);
                }
                int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f12972w.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
                return Math.max(Math.min(i10, width), width - slidingPaneLayout.f12975z);
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6592c;
                return B9.a.i(i10, sideSheetBehavior.f15171r.J(), sideSheetBehavior.f15171r.I());
            default:
                return view.getLeft();
        }
    }

    @Override // p000a.a
    public final int q(int i10, View view) {
        switch (this.f6591b) {
            case 0:
                return view.getTop();
            case 1:
                return view.getTop();
            default:
                return B9.a.i(i10, ((BottomSheetBehavior) this.f6592c).E(), M());
        }
    }

    public boolean v0() {
        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f6592c;
        if (slidingPaneLayout.f12953A || slidingPaneLayout.getLockMode() == 3) {
            return false;
        }
        if (slidingPaneLayout.c() && slidingPaneLayout.getLockMode() == 1) {
            return false;
        }
        return slidingPaneLayout.c() || slidingPaneLayout.getLockMode() != 2;
    }
}
