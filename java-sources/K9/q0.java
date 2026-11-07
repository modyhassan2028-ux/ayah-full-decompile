package K9;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5390a = new ThreadLocal();

    public static S a() {
        ThreadLocal threadLocal = f5390a;
        S s10 = (S) threadLocal.get();
        if (s10 != null) {
            return s10;
        }
        C0386d c0386d = new C0386d(Thread.currentThread());
        threadLocal.set(c0386d);
        return c0386d;
    }
}
