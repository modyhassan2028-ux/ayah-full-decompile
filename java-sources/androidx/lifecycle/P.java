package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p123m2.d f12640a = new p123m2.d();

    public final void a() {
        p123m2.d dVar = this.f12640a;
        if (dVar != null && !dVar.f19526d) {
            dVar.f19526d = true;
            synchronized (dVar.f19523a) {
                try {
                    Iterator it = dVar.f19524b.values().iterator();
                    while (it.hasNext()) {
                        p123m2.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f19525c.iterator();
                    while (it2.hasNext()) {
                        p123m2.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f19525c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
