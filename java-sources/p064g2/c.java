package p064g2;

import android.util.Log;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.K;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16271a = b.f16270a;

    public static b a(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        while (abstractComponentCallbacksC0947u != null) {
            if (abstractComponentCallbacksC0947u.f16138L != null && abstractComponentCallbacksC0947u.f16128B) {
                abstractComponentCallbacksC0947u.o();
            }
            abstractComponentCallbacksC0947u = abstractComponentCallbacksC0947u.f16140N;
        }
        return f16271a;
    }

    public static void b(e eVar) {
        if (K.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(eVar.f16272r.getClass().getName()), eVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, String str) {
        j.e(abstractComponentCallbacksC0947u, "fragment");
        j.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0947u, "Attempting to reuse fragment " + abstractComponentCallbacksC0947u + " with previous ID " + str));
        a(abstractComponentCallbacksC0947u).getClass();
    }
}
