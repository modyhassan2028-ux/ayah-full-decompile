package D0;

import J0.r0;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f1050s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(ViewFactoryHolder viewFactoryHolder, int i10) {
        super(1);
        this.f1049r = i10;
        this.f1050s = viewFactoryHolder;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f1049r) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                ViewFactoryHolder viewFactoryHolder = this.f1050s;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = viewFactoryHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = viewFactoryHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            default:
                r0 r0Var = (r0) obj;
                AndroidComposeView androidComposeView = r0Var instanceof AndroidComposeView ? (AndroidComposeView) r0Var : null;
                ViewFactoryHolder viewFactoryHolder2 = this.f1050s;
                if (androidComposeView != null) {
                    C0086d c0086d = new C0086d(13, androidComposeView, viewFactoryHolder2);
                    u.A a9 = androidComposeView.L0;
                    if (a9.f(c0086d) < 0) {
                        a9.a(c0086d);
                    }
                }
                viewFactoryHolder2.removeAllViewsInLayout();
                return p110k9.y.f19095a;
        }
    }
}
