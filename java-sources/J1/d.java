package J1;

import I1.AbstractC0272z;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f4196e = new d(1, (String) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f4197f = new d(2, (String) null);
    public static final d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f4198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f4199i;
    public static final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f4200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f4201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f4202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f4203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f4204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f4205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f4206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f4207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f4208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f4209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f4210u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f4213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f4214d;

    static {
        new d(4, (String) null);
        new d(8, (String) null);
        g = new d(16, (String) null);
        new d(32, (String) null);
        f4198h = new d(64, (String) null);
        f4199i = new d(128, (String) null);
        new d(256, j.class);
        new d(512, j.class);
        new d(1024, k.class);
        new d(2048, k.class);
        j = new d(4096, (String) null);
        f4200k = new d(8192, (String) null);
        new d(16384, (String) null);
        new d(32768, (String) null);
        new d(65536, (String) null);
        new d(131072, o.class);
        f4201l = new d(262144, (String) null);
        f4202m = new d(524288, (String) null);
        f4203n = new d(1048576, (String) null);
        new d(2097152, p.class);
        int i10 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f4204o = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m.class);
        f4205p = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f4206q = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f4207r = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f4208s = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f4209t = new d(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, n.class);
        new d(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, l.class);
        new d(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new d(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new d(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new d(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new d(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new d(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        f4210u = new d(i10 >= 34 ? AbstractC0272z.d() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f4211a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f4211a;
        Object obj3 = this.f4211a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4211a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = g.d(this.f4212b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4211a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public d(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public d(Object obj, int i10, CharSequence charSequence, q qVar, Class cls) {
        this.f4212b = i10;
        this.f4214d = qVar;
        if (obj == null) {
            this.f4211a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f4211a = obj;
        }
        this.f4213c = cls;
    }
}
