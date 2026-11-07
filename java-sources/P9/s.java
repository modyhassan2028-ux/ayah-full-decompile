package P9;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6803a = 0;

    static {
        Object objB;
        Object objB2;
        Exception exc = new Exception();
        String simpleName = p000a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objB = q9.a.class.getCanonicalName();
        } catch (Throwable th) {
            objB = p110k9.a.b(th);
        }
        if (p110k9.m.a(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objB2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            objB2 = p110k9.a.b(th2);
        }
        if (p110k9.m.a(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
