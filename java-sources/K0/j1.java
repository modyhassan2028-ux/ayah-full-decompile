package K0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0941n;
import p056f2.LayoutInflaterFactory2C0952z;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5085r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f5086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f5087t;

    public j1(LayoutInflaterFactory2C0952z layoutInflaterFactory2C0952z, p056f2.Q q10) {
        this.f5087t = layoutInflaterFactory2C0952z;
        this.f5086s = q10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f5085r) {
            case 0:
                break;
            case 1:
                p251z9.j.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f5087t).get();
                IBinder iBinder = null;
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (activity != null && iBinder != null) {
                    ((androidx.window.layout.s) this.f5086s).c(iBinder, activity);
                }
                break;
            default:
                p056f2.Q q10 = (p056f2.Q) this.f5086s;
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
                q10.k();
                C0941n.i((ViewGroup) abstractComponentCallbacksC0947u.f16145X.getParent(), ((LayoutInflaterFactory2C0952z) this.f5087t).f16182r).h();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5085r) {
            case 0:
                ((View) this.f5086s).removeOnAttachStateChangeListener(this);
                ((Z.s0) this.f5087t).x();
                break;
            case 1:
                p251z9.j.e(view, "view");
                break;
        }
    }

    public j1(androidx.window.layout.s sVar, Activity activity) {
        p251z9.j.e(sVar, "sidecarCompat");
        this.f5086s = sVar;
        this.f5087t = new WeakReference(activity);
    }

    public j1(View view, Z.s0 s0Var) {
        this.f5086s = view;
        this.f5087t = s0Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
