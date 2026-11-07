package M7;

import android.os.SystemClock;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BaseProgressIndicator f5748s;

    public /* synthetic */ b(BaseProgressIndicator baseProgressIndicator, int i10) {
        this.f5747r = i10;
        this.f5748s = baseProgressIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5747r;
        BaseProgressIndicator baseProgressIndicator = this.f5748s;
        switch (i10) {
            case 0:
                int i11 = BaseProgressIndicator.f15099D;
                if (baseProgressIndicator.f15107v > 0) {
                    SystemClock.uptimeMillis();
                }
                baseProgressIndicator.setVisibility(0);
                break;
            default:
                int i12 = BaseProgressIndicator.f15099D;
                ((l) baseProgressIndicator.getCurrentDrawable()).c(false, false, true);
                if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                    baseProgressIndicator.setVisibility(4);
                }
                baseProgressIndicator.getClass();
                break;
        }
    }
}
