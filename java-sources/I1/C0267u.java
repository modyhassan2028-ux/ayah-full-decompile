package I1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: I1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0267u implements InterfaceC0268v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ScrollFeedbackProvider f3786r;

    public C0267u(NestedScrollView nestedScrollView) {
        this.f3786r = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // I1.InterfaceC0268v
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f3786r.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // I1.InterfaceC0268v
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f3786r.onScrollProgress(i10, i11, i12, i13);
    }
}
