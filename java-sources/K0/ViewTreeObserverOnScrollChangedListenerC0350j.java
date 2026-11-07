package K0;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: K0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnScrollChangedListenerC0350j implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5083b;

    public /* synthetic */ ViewTreeObserverOnScrollChangedListenerC0350j(int i10, View view) {
        this.f5082a = i10;
        this.f5083b = view;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i10 = this.f5082a;
        View view = this.f5083b;
        switch (i10) {
            case 0:
                Class cls = AndroidComposeView.f11987U0;
                ((AndroidComposeView) view).Q();
                break;
            default:
                ((T7.c) view).x();
                break;
        }
    }
}
