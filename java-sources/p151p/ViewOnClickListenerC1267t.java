package p151p;

import I1.AbstractC0245c;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserView;
import p140o.k;

/* JADX INFO: renamed from: p.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1267t implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f20781r;

    public ViewOnClickListenerC1267t(ActivityChooserView activityChooserView) {
        this.f20781r = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.f20781r;
        C1265s c1265s = activityChooserView.f11487r;
        if (view == activityChooserView.f11492w) {
            activityChooserView.a();
            c1265s.getClass();
            throw null;
        }
        if (view != activityChooserView.f11490u) {
            throw new IllegalArgumentException();
        }
        c1265s.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1250k c1250k;
        k kVar;
        ActivityChooserView activityChooserView = this.f20781r;
        PopupWindow.OnDismissListener onDismissListener = activityChooserView.f11485A;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        AbstractC0245c abstractC0245c = activityChooserView.f11493x;
        if (abstractC0245c == null || (c1250k = abstractC0245c.f3714a) == null || (kVar = c1250k.f20709t) == null) {
            return;
        }
        kVar.c(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        ((C1265s) adapterView.getAdapter()).getClass();
        ActivityChooserView activityChooserView = this.f20781r;
        activityChooserView.a();
        activityChooserView.f11487r.getClass();
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.f20781r;
        if (view != activityChooserView.f11492w) {
            throw new IllegalArgumentException();
        }
        activityChooserView.f11487r.getClass();
        throw null;
    }
}
