package p140o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p130n.b;

/* JADX INFO: loaded from: classes.dex */
public final class o extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CollapsibleActionView f20188r;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view) {
        super(view.getContext());
        this.f20188r = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p130n.b
    public final void onActionViewCollapsed() {
        this.f20188r.onActionViewCollapsed();
    }

    @Override // p130n.b
    public final void onActionViewExpanded() {
        this.f20188r.onActionViewExpanded();
    }
}
