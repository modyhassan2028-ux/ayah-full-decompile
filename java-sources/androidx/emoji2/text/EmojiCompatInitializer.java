package androidx.emoji2.text;

import U2.a;
import U2.b;
import android.content.Context;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p013b2.j;
import p013b2.k;
import p013b2.n;
import p013b2.t;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // U2.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // U2.b
    public final Object b(Context context) {
        t tVar = new t(new n(context, 0));
        tVar.f1625a = 1;
        if (j.f13157k == null) {
            synchronized (j.j) {
                try {
                    if (j.f13157k == null) {
                        j.f13157k = new j(tVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f8164e) {
            try {
                objB = aVarC.f8165a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w wVarH = ((InterfaceC0771u) objB).h();
        wVarH.a(new k(this, wVarH));
    }
}
