package K9;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: K9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0387e implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5355b;

    public /* synthetic */ C0387e(int i10, Object obj) {
        this.f5354a = i10;
        this.f5355b = obj;
    }

    public final String toString() {
        switch (this.f5354a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f5355b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((p241y9.c) this.f5355b).getClass().getSimpleName() + '@' + AbstractC0405x.p(this) + ']';
            default:
                return "DisposeOnCancel[" + ((J) this.f5355b) + ']';
        }
    }
}
