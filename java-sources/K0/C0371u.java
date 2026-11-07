package K0;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: K0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371u extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f5172s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0371u(AndroidComposeView androidComposeView, int i10) {
        super(0);
        this.f5171r = i10;
        this.f5172s = androidComposeView;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f5171r) {
            case 0:
                AndroidComposeView androidComposeView = this.f5172s;
                MotionEvent motionEvent = androidComposeView.f12006I0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.f12008J0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f12013M0);
                }
                return p110k9.y.f19095a;
            default:
                return this.f5172s.get_viewTreeOwners();
        }
    }
}
