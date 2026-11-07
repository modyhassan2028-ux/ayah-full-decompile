package E2;

import android.database.Observable;

/* JADX INFO: renamed from: E2.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117d0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0119e0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0119e0) ((Observable) this).mObservers.get(size)).d(i10, i11);
        }
    }

    public final void d(int i10, int i11, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0119e0) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
        }
    }

    public final void e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0119e0) ((Observable) this).mObservers.get(size)).c(i10, i11);
        }
    }

    public final void f(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC0119e0) ((Observable) this).mObservers.get(size)).e(i10, i11);
        }
    }
}
