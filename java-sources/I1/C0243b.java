package I1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: I1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0243b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3709c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0241a f3711b;

    public C0243b() {
        this(f3709c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3710a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public O8.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3710a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new O8.c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3710a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, J1.g gVar) {
        this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3710a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3710a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 < list.size()) {
                J1.d dVar = (J1.d) list.get(i11);
                if (dVar.a() == i10) {
                    Class cls = dVar.f4213c;
                    J1.q qVar = dVar.f4214d;
                    if (qVar != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e10) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                            }
                        }
                        zPerformAccessibilityAction = qVar.f(view);
                        break;
                    }
                } else {
                    i11++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f3710a.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f3710a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3710a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0243b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3710a = accessibilityDelegate;
        this.f3711b = new C0241a(this);
    }
}
