package K9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: K9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0397o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5384b = AtomicIntegerFieldUpdater.newUpdater(C0397o.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5385a;

    public C0397o(Throwable th, boolean z10) {
        this.f5385a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5385a + ']';
    }
}
