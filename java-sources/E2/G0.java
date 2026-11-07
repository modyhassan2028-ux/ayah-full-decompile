package E2;

import I1.C0243b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H0 f1504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f1505e = new WeakHashMap();

    public G0(H0 h7) {
        this.f1504d = h7;
    }

    @Override // I1.C0243b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        return c0243b != null ? c0243b.a(view, accessibilityEvent) : this.f3710a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // I1.C0243b
    public final O8.c b(View view) {
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        return c0243b != null ? c0243b.b(view) : super.b(view);
    }

    @Override // I1.C0243b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        if (c0243b != null) {
            c0243b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        H0 h7 = this.f1504d;
        RecyclerView recyclerView = h7.f1509d;
        RecyclerView recyclerView2 = h7.f1509d;
        boolean zR = recyclerView.R();
        View.AccessibilityDelegate accessibilityDelegate = this.f3710a;
        if (zR || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().Y(view, gVar);
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        if (c0243b != null) {
            c0243b.d(view, gVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // I1.C0243b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        if (c0243b != null) {
            c0243b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // I1.C0243b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0243b c0243b = (C0243b) this.f1505e.get(viewGroup);
        return c0243b != null ? c0243b.f(viewGroup, view, accessibilityEvent) : this.f3710a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // I1.C0243b
    public final boolean g(View view, int i10, Bundle bundle) {
        H0 h7 = this.f1504d;
        RecyclerView recyclerView = h7.f1509d;
        RecyclerView recyclerView2 = h7.f1509d;
        if (recyclerView.R() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i10, bundle);
        }
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        if (c0243b != null) {
            if (c0243b.g(view, i10, bundle)) {
                return true;
            }
        } else if (super.g(view, i10, bundle)) {
            return true;
        }
        u0 u0Var = recyclerView2.getLayoutManager().f1716b.f12912t;
        return false;
    }

    @Override // I1.C0243b
    public final void h(View view, int i10) {
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        if (c0243b != null) {
            c0243b.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // I1.C0243b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0243b c0243b = (C0243b) this.f1505e.get(view);
        if (c0243b != null) {
            c0243b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
