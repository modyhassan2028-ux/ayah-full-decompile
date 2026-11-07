package K0;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: K0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361o0 implements p243z0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5141b;

    public /* synthetic */ C0361o0(int i10, View view) {
        this.f5140a = i10;
        this.f5141b = view;
    }

    @Override // p243z0.a
    public final void a(int i10) {
        switch (this.f5140a) {
            case 0:
                View view = this.f5141b;
                if (i10 == 16) {
                    view.performHapticFeedback(16);
                } else if (i10 == 6) {
                    view.performHapticFeedback(6);
                } else if (i10 == 13) {
                    view.performHapticFeedback(13);
                } else if (i10 == 23) {
                    view.performHapticFeedback(23);
                } else if (i10 == 0) {
                    view.performHapticFeedback(0);
                } else if (i10 == 17) {
                    view.performHapticFeedback(17);
                } else if (i10 == 27) {
                    view.performHapticFeedback(27);
                } else if (i10 == 26) {
                    view.performHapticFeedback(26);
                } else if (i10 == 9) {
                    view.performHapticFeedback(9);
                } else if (i10 == 22) {
                    view.performHapticFeedback(22);
                } else if (i10 == 21) {
                    view.performHapticFeedback(21);
                } else if (i10 == 1) {
                    view.performHapticFeedback(1);
                }
                break;
            default:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f5141b;
                if (i10 == 16) {
                    androidComposeView.performHapticFeedback(16);
                } else if (i10 == 6) {
                    androidComposeView.performHapticFeedback(6);
                } else if (i10 == 13) {
                    androidComposeView.performHapticFeedback(13);
                } else if (i10 == 23) {
                    androidComposeView.performHapticFeedback(23);
                } else if (i10 == 0) {
                    androidComposeView.performHapticFeedback(0);
                } else if (i10 == 17) {
                    androidComposeView.performHapticFeedback(17);
                } else if (i10 == 27) {
                    androidComposeView.performHapticFeedback(27);
                } else if (i10 == 26) {
                    androidComposeView.performHapticFeedback(26);
                } else if (i10 == 9) {
                    androidComposeView.performHapticFeedback(9);
                } else if (i10 == 22) {
                    androidComposeView.performHapticFeedback(22);
                } else if (i10 == 21) {
                    androidComposeView.performHapticFeedback(21);
                } else if (i10 == 1) {
                    androidComposeView.performHapticFeedback(1);
                }
                break;
        }
    }
}
