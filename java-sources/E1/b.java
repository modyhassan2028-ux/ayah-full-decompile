package E1;

import K9.C0389g;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0389g f1421r;

    public b(C0389g c0389g) {
        super(false);
        this.f1421r = c0389g;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f1421r.resumeWith(p110k9.a.b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f1421r.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
