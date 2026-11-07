package i7;

/* JADX INFO: renamed from: i7.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1006o0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1014r0 f17496b;

    public C1006o0(C1014r0 c1014r0, String str) {
        this.f17496b = c1014r0;
        this.f17495a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        X x9 = ((C1023u0) this.f17496b.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17182w.b(th, this.f17495a);
    }
}
