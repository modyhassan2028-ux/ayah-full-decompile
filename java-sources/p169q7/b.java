package p169q7;

import I1.S;
import R1.c;
import android.app.Application;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p216w1.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f21339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f21340t;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f21338r = i10;
        this.f21339s = obj;
        this.f21340t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21338r;
        Object obj = this.f21339s;
        Object obj2 = this.f21340t;
        switch (i10) {
            case 0:
                c cVar = ((SwipeDismissBehavior) obj2).f14609r;
                if (cVar == null || !cVar.h()) {
                    return;
                }
                WeakHashMap weakHashMap = S.f3689a;
                ((View) obj).postOnAnimation(this);
                return;
            case 1:
                ((p216w1.c) obj).f23570r = obj2;
                return;
            case 2:
                ((Application) obj).unregisterActivityLifecycleCallbacks((p216w1.c) obj2);
                return;
            default:
                try {
                    Method method = d.f23579d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.f23580e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f21338r = 0;
        this.f21340t = swipeDismissBehavior;
        this.f21339s = view;
    }
}
