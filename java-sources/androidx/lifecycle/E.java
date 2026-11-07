package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0766o enumC0766o) {
        p251z9.j.e(enumC0766o, "event");
        if (activity instanceof InterfaceC0771u) {
            w wVarH = ((InterfaceC0771u) activity).h();
            if (p123m2.c.D(wVarH)) {
                wVarH.d(enumC0766o);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            G.a.Companion.getClass();
            F.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new G(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
