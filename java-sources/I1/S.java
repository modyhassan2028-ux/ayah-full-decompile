package I1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f3689a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f3690b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3691c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f3692d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f3693e = new C();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E f3694f = new E();

    public static Z a(View view) {
        if (f3689a == null) {
            f3689a = new WeakHashMap();
        }
        Z z10 = (Z) f3689a.get(view);
        if (z10 != null) {
            return z10;
        }
        Z z11 = new Z(view);
        f3689a.put(view, z11);
        return z11;
    }

    public static B0 b(View view, B0 b5) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsG = b5.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? O.a(view, windowInsetsG) : G.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return B0.h(view, windowInsetsA);
            }
        }
        return b5;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Q.f3685d;
        Q q10 = (Q) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (q10 == null) {
            q10 = new Q();
            q10.f3686a = null;
            q10.f3687b = null;
            q10.f3688c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q10);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = q10.f3686a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Q.f3685d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (q10.f3686a == null) {
                            q10.f3686a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = Q.f3685d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                q10.f3686a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    q10.f3686a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = q10.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (q10.f3687b == null) {
                    q10.f3687b = new SparseArray();
                }
                q10.f3687b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return N.a(view);
        }
        if (f3691c) {
            return null;
        }
        if (f3690b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3690b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3691c = true;
                return null;
            }
        }
        try {
            Object obj = f3690b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3691c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = M.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? P.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static G0 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return O.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new G0(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(int i10, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static B0 j(View view, B0 b5) {
        WindowInsets windowInsetsG = b5.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = G.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return B0.h(view, windowInsetsB);
            }
        }
        return b5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0256i k(View view, C0256i c0256i) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0256i + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return P.b(view, c0256i);
        }
        N1.k kVar = (N1.k) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0265s interfaceC0265s = f3693e;
        if (kVar == null) {
            if (view instanceof InterfaceC0265s) {
                interfaceC0265s = (InterfaceC0265s) view;
            }
            return interfaceC0265s.a(c0256i);
        }
        C0256i c0256iA = N1.k.a(view, c0256i);
        if (c0256iA == null) {
            return null;
        }
        if (view instanceof InterfaceC0265s) {
            interfaceC0265s = (InterfaceC0265s) view;
        }
        return interfaceC0265s.a(c0256iA);
    }

    public static void l(int i10, View view) {
        ArrayList arrayListF = f(view);
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            if (((J1.d) arrayListF.get(i11)).a() == i10) {
                arrayListF.remove(i11);
                return;
            }
        }
    }

    public static void m(View view, J1.d dVar, String str, J1.q qVar) {
        C0243b c0243b;
        if (qVar == null && str == null) {
            l(dVar.a(), view);
            i(0, view);
            return;
        }
        J1.d dVar2 = new J1.d(null, dVar.f4212b, str, qVar, dVar.f4213c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        if (accessibilityDelegateD == null) {
            c0243b = null;
        } else {
            c0243b = accessibilityDelegateD instanceof C0241a ? ((C0241a) accessibilityDelegateD).f3708a : new C0243b(accessibilityDelegateD);
        }
        if (c0243b == null) {
            c0243b = new C0243b();
        }
        o(view, c0243b);
        l(dVar2.a(), view);
        f(view).add(dVar2);
        i(0, view);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            N.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void o(View view, C0243b c0243b) {
        if (c0243b == null && (d(view) instanceof C0241a)) {
            c0243b = new C0243b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0243b == null ? null : c0243b.f3711b);
    }

    public static void p(View view, CharSequence charSequence) {
        new D(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        E e10 = f3694f;
        if (charSequence == null) {
            e10.f3674r.remove(view);
            view.removeOnAttachStateChangeListener(e10);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e10);
        } else {
            e10.f3674r.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(e10);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e10);
            }
        }
    }

    public static void q(ViewGroup viewGroup, O8.c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            K.a(viewGroup, cVar != null ? (PointerIcon) cVar.f6511r : null);
        }
    }

    public static void r(View view, AbstractC0244b0 abstractC0244b0) {
        if (Build.VERSION.SDK_INT >= 30) {
            j0.h(view, abstractC0244b0);
            return;
        }
        PathInterpolator pathInterpolator = C0254g0.f3738e;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0252f0 = abstractC0244b0 != null ? new ViewOnApplyWindowInsetsListenerC0252f0(view, abstractC0244b0) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0252f0);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0252f0);
        }
    }
}
