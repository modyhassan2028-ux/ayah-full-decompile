package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class G extends Fragment {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f12616s = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f12617r;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final F Companion = new F();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            F.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            p251z9.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            p251z9.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            p251z9.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            p251z9.j.e(activity, "activity");
            int i10 = G.f12616s;
            E.a(activity, EnumC0766o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            p251z9.j.e(activity, "activity");
            int i10 = G.f12616s;
            E.a(activity, EnumC0766o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            p251z9.j.e(activity, "activity");
            int i10 = G.f12616s;
            E.a(activity, EnumC0766o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            p251z9.j.e(activity, "activity");
            int i10 = G.f12616s;
            E.a(activity, EnumC0766o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            p251z9.j.e(activity, "activity");
            int i10 = G.f12616s;
            E.a(activity, EnumC0766o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            p251z9.j.e(activity, "activity");
            int i10 = G.f12616s;
            E.a(activity, EnumC0766o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            p251z9.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            p251z9.j.e(activity, "activity");
            p251z9.j.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            p251z9.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            p251z9.j.e(activity, "activity");
        }
    }

    public final void a(EnumC0766o enumC0766o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            p251z9.j.d(activity, "getActivity(...)");
            E.a(activity, enumC0766o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0766o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0766o.ON_DESTROY);
        this.f12617r = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0766o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        T t2 = this.f12617r;
        if (t2 != null) {
            ((D) t2.f12645a).c();
        }
        a(EnumC0766o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        T t2 = this.f12617r;
        if (t2 != null) {
            D d5 = (D) t2.f12645a;
            int i10 = d5.f12608r + 1;
            d5.f12608r = i10;
            if (i10 == 1 && d5.f12611u) {
                d5.f12613w.d(EnumC0766o.ON_START);
                d5.f12611u = false;
            }
        }
        a(EnumC0766o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0766o.ON_STOP);
    }
}
