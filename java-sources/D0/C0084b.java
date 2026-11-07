package D0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: D0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0084b extends CancellationException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0084b f1086r = new C0084b();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(u.f1131c);
        return this;
    }
}
