package R1;

import I1.C0243b;
import I1.S;
import J1.g;
import K0.A;
import R7.f;
import U6.C0532j;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import u.AbstractC1361p;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C0243b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f7185n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f7186o = new f(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0532j f7187p = new C0532j(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f7191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f7192i;
    public A j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f7188d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f7189e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f7190f = new Rect();
    public final int[] g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7193k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7194l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7195m = Integer.MIN_VALUE;

    public a(View view) {
        this.f7192i = view;
        this.f7191h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = S.f3689a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // I1.C0243b
    public final O8.c b(View view) {
        if (this.j == null) {
            this.j = new A(this, 1);
        }
        return this.j;
    }

    @Override // I1.C0243b
    public final void d(View view, g gVar) {
        this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
        t(gVar);
    }

    public final boolean j(int i10) {
        if (this.f7194l != i10) {
            return false;
        }
        this.f7194l = Integer.MIN_VALUE;
        v(i10, false);
        x(i10, 8);
        return true;
    }

    public final AccessibilityEvent k(int i10, int i11) {
        View view = this.f7192i;
        if (i10 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i11);
        g gVarR = r(i10);
        accessibilityEventObtain2.getText().add(gVarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = gVarR.f4219a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i10);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final g l(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        gVar.m("android.view.View");
        Rect rect = f7185n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        gVar.l(rect);
        gVar.f4220b = -1;
        View view = this.f7192i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i10, gVar);
        if (gVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f7189e;
        gVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        gVar.f4221c = i10;
        accessibilityNodeInfoObtain.setSource(view, i10);
        if (this.f7193k == i10) {
            gVar.i(true);
            gVar.a(128);
        } else {
            gVar.i(false);
            gVar.a(64);
        }
        boolean z10 = this.f7194l == i10;
        if (z10) {
            gVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            gVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z10);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f7188d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.f(rect3);
            if (gVar.f4220b != -1) {
                g gVar2 = new g(AccessibilityNodeInfo.obtain());
                for (int i11 = gVar.f4220b; i11 != -1; i11 = gVar2.f4220b) {
                    gVar2.f4220b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = gVar2.f4219a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i11, gVar2);
                    gVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f7190f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                gVar.l(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        gVar.f4219a.setVisibleToUser(true);
                    }
                }
            }
        }
        return gVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f7191h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f7195m;
            if (i11 != iN) {
                this.f7195m = iN;
                x(iN, 128);
                x(i11, 256);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i10 = this.f7195m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f7195m = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i10, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f3, float f7);

    public abstract void o(ArrayList arrayList);

    public final void p(int i10) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f7191h.isEnabled() || (parent = (view = this.f7192i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i10, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    public final boolean q(int i10, Rect rect) {
        int i11;
        int i12;
        Object obj;
        g gVar;
        int i13;
        int iE;
        int i14;
        Rect rect2;
        int iG;
        Rect rect3;
        int i15;
        g gVar2;
        int i16;
        int iW;
        int iX;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        P p10 = new P(0);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            p10.f(((Integer) arrayList.get(i17)).intValue(), l(((Integer) arrayList.get(i17)).intValue()));
        }
        int i18 = this.f7194l;
        g gVar3 = i18 == Integer.MIN_VALUE ? null : (g) p10.d(i18);
        f fVar = f7186o;
        C0532j c0532j = f7187p;
        View view = this.f7192i;
        if (i10 == 1 || i10 == 2) {
            i11 = 0;
            i12 = -1;
            WeakHashMap weakHashMap = S.f3689a;
            boolean z10 = view.getLayoutDirection() == 1;
            c0532j.getClass();
            int iG2 = p10.g();
            ArrayList arrayList2 = new ArrayList(iG2);
            for (int i19 = 0; i19 < iG2; i19++) {
                arrayList2.add((g) p10.h(i19));
            }
            Collections.sort(arrayList2, new b(z10, fVar));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (gVar3 != null) {
                    size = arrayList2.indexOf(gVar3);
                }
                int i20 = size - 1;
                if (i20 >= 0) {
                    obj = arrayList2.get(i20);
                } else {
                    obj = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (gVar3 == null ? -1 : arrayList2.lastIndexOf(gVar3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            gVar = (g) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i21 = this.f7194l;
            if (i21 != Integer.MIN_VALUE) {
                r(i21).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i10 == 17) {
                        i14 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i10 == 33) {
                        i14 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i10 == 66) {
                        i14 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i14 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i10 != 17) {
                    i11 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i10 != 33) {
                    i11 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i10 != 66) {
                    i11 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                c0532j.getClass();
                iG = p10.g();
                rect3 = new Rect();
                gVar = null;
                for (i15 = i11; i15 < iG; i15++) {
                    gVar2 = (g) p10.h(i15);
                    if (gVar2 == gVar3) {
                        fVar.getClass();
                        gVar2.f(rect3);
                        if (Y2.a.S(i10, rect4, rect3)) {
                            if (Y2.a.S(i10, rect4, rect2) || Y2.a.l(i10, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                gVar = gVar2;
                            } else if (Y2.a.l(i10, rect4, rect2, rect3)) {
                                int iW2 = Y2.a.W(i10, rect4, rect3);
                                int iX2 = Y2.a.X(i10, rect4, rect3);
                                i16 = (iX2 * iX2) + (iW2 * 13 * iW2);
                                iW = Y2.a.W(i10, rect4, rect2);
                                iX = Y2.a.X(i10, rect4, rect2);
                                if (i16 < (iX * iX) + (iW * 13 * iW)) {
                                    rect2.set(rect3);
                                    gVar = gVar2;
                                }
                            }
                        }
                    }
                }
                i12 = i14;
            }
            i14 = -1;
            rect2 = new Rect(rect4);
            if (i10 != 17) {
                i11 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i10 != 33) {
                i11 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i10 != 66) {
                i11 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i10 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            c0532j.getClass();
            iG = p10.g();
            rect3 = new Rect();
            gVar = null;
            while (i15 < iG) {
                gVar2 = (g) p10.h(i15);
                if (gVar2 == gVar3) {
                    fVar.getClass();
                    gVar2.f(rect3);
                    if (Y2.a.S(i10, rect4, rect3)) {
                        if (Y2.a.S(i10, rect4, rect2)) {
                            rect2.set(rect3);
                            gVar = gVar2;
                        } else if (Y2.a.l(i10, rect4, rect2, rect3)) {
                            int iW3 = Y2.a.W(i10, rect4, rect3);
                            int iX3 = Y2.a.X(i10, rect4, rect3);
                            i16 = (iX3 * iX3) + (iW3 * 13 * iW3);
                            iW = Y2.a.W(i10, rect4, rect2);
                            iX = Y2.a.X(i10, rect4, rect2);
                            if (i16 < (iX * iX) + (iW * 13 * iW)) {
                                rect2.set(rect3);
                                gVar = gVar2;
                            }
                        }
                    }
                }
            }
            i12 = i14;
        }
        g gVar4 = gVar;
        if (gVar4 == null) {
            iE = Integer.MIN_VALUE;
        } else {
            if (p10.f22704r) {
                AbstractC1361p.a(p10);
            }
            int i22 = p10.f22707u;
            int i23 = i11;
            while (true) {
                if (i23 >= i22) {
                    i13 = i12;
                    break;
                }
                if (p10.f22706t[i23] == gVar4) {
                    i13 = i23;
                    break;
                }
                i23++;
            }
            iE = p10.e(i13);
        }
        return w(iE);
    }

    public final g r(int i10) {
        if (i10 != -1) {
            return l(i10);
        }
        View view = this.f7192i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        g gVar = new g(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = S.f3689a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            gVar.f4219a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
        }
        return gVar;
    }

    public abstract boolean s(int i10, int i11, Bundle bundle);

    public abstract void u(int i10, g gVar);

    public final boolean w(int i10) {
        int i11;
        View view = this.f7192i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f7194l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f7194l = i10;
        v(i10, true);
        x(i10, 8);
        return true;
    }

    public final void x(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f7191h.isEnabled() || (parent = (view = this.f7192i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i10, i11));
    }

    public void t(g gVar) {
    }

    public void v(int i10, boolean z10) {
    }
}
