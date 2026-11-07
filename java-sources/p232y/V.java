package p232y;

import A.Z;
import S9.c;
import S9.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f24460a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f24461b = d.a();

    public static final void a(V v10, U u8) {
        AtomicReference atomicReference = v10.f24460a;
        while (true) {
            U u10 = (U) atomicReference.get();
            if (u10 != null && u8.f24458a.compareTo(u10.f24458a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(u10, u8)) {
                    if (u10 != null) {
                        u10.f24459b.e(new Z("Mutation interrupted", 4));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == u10);
        }
    }
}
