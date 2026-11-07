package K9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class E extends P9.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5320v = AtomicIntegerFieldUpdater.newUpdater(E.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // P9.q, K9.h0
    public final void m(Object obj) throws D {
        o(obj);
    }

    @Override // P9.q, K9.h0
    public final void o(Object obj) throws D {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f5320v;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                P9.b.h(AbstractC0405x.A(obj), AbstractC0813f2.H(this.f6800u));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
