package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0760i {
    final /* synthetic */ D this$0;

    public static final class a extends AbstractC0760i {
        final /* synthetic */ D this$0;

        public a(D d5) {
            this.this$0 = d5;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            p251z9.j.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            p251z9.j.e(activity, "activity");
            D d5 = this.this$0;
            int i10 = d5.f12608r + 1;
            d5.f12608r = i10;
            if (i10 == 1 && d5.f12611u) {
                d5.f12613w.d(EnumC0766o.ON_START);
                d5.f12611u = false;
            }
        }
    }

    public C(D d5) {
        this.this$0 = d5;
    }

    @Override // androidx.lifecycle.AbstractC0760i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        p251z9.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = G.f12616s;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            p251z9.j.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((G) fragmentFindFragmentByTag).f12617r = this.this$0.f12615y;
        }
    }

    @Override // androidx.lifecycle.AbstractC0760i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        p251z9.j.e(activity, "activity");
        D d5 = this.this$0;
        int i10 = d5.f12609s - 1;
        d5.f12609s = i10;
        if (i10 == 0) {
            Handler handler = d5.f12612v;
            p251z9.j.b(handler);
            handler.postDelayed(d5.f12614x, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        p251z9.j.e(activity, "activity");
        B.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0760i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        p251z9.j.e(activity, "activity");
        D d5 = this.this$0;
        int i10 = d5.f12608r - 1;
        d5.f12608r = i10;
        if (i10 == 0 && d5.f12610t) {
            d5.f12613w.d(EnumC0766o.ON_STOP);
            d5.f12611u = true;
        }
    }
}
