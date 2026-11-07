package p050e8;

import T6.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f15838a = new AtomicReference();

    @Override // T6.b
    public final void a(boolean z10) {
        synchronized (f.f15841k) {
            try {
                ArrayList arrayList = new ArrayList(f.f15842l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f fVar = (f) obj;
                    if (fVar.f15847e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.f15850i.iterator();
                        while (it.hasNext()) {
                            f fVar2 = ((c) it.next()).f15837a;
                            if (!z10) {
                                ((H8.d) fVar2.f15849h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
