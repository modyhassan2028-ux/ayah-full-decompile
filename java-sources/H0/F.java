package H0;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class F extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3154c;

    public /* synthetic */ F(int i10, Object obj) {
        this.f3153b = i10;
        this.f3154c = obj;
    }

    @Override // H0.T
    public final p063g1.m b() {
        switch (this.f3153b) {
            case 0:
                return ((J0.P) this.f3154c).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.f3154c).getLayoutDirection();
        }
    }

    @Override // H0.T
    public final int c() {
        switch (this.f3153b) {
            case 0:
                return ((J0.P) this.f3154c).T();
            default:
                return ((AndroidComposeView) this.f3154c).getRoot().f3915X.f3958p.f3168r;
        }
    }
}
