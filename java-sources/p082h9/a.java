package p082h9;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import p092i9.b;
import p092i9.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Scheduler a(p092i9.a aVar) {
        try {
            d dVar = b.f17708a;
            if (dVar != null) {
                return dVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw Exceptions.propagate(th);
        }
    }
}
