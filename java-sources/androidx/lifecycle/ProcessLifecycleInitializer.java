package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements U2.b {
    @Override // U2.b
    public final List a() {
        return p120l9.r.f19440r;
    }

    @Override // U2.b
    public final Object b(Context context) {
        p251z9.j.e(context, "context");
        U2.a aVarC = U2.a.c(context);
        p251z9.j.d(aVarC, "getInstance(...)");
        if (!aVarC.f8166b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f12667a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            p251z9.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0768q());
        }
        D d5 = D.f12607z;
        d5.getClass();
        d5.f12612v = new Handler();
        d5.f12613w.d(EnumC0766o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        p251z9.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C(d5));
        return d5;
    }
}
