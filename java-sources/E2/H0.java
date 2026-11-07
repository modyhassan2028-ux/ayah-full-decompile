package E2;

import I1.C0243b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class H0 extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f1509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0 f1510e;

    public H0(RecyclerView recyclerView) {
        this.f1509d = recyclerView;
        C0243b c0243bJ = j();
        if (c0243bJ == null || !(c0243bJ instanceof G0)) {
            this.f1510e = new G0(this);
        } else {
            this.f1510e = (G0) c0243bJ;
        }
    }

    @Override // I1.C0243b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f1509d.R()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().V(accessibilityEvent);
        }
    }

    @Override // I1.C0243b
    public void d(View view, J1.g gVar) {
        this.f3710a.onInitializeAccessibilityNodeInfo(view, gVar.f4219a);
        RecyclerView recyclerView = this.f1509d;
        if (recyclerView.R() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0135m0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1716b;
        layoutManager.W(recyclerView2.f12912t, recyclerView2.f12923y0, gVar);
    }

    @Override // I1.C0243b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1509d;
        if (recyclerView.R() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().j0(i10, bundle);
    }

    public C0243b j() {
        return this.f1510e;
    }
}
