package A;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends CancellationException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f177r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(String str, int i10) {
        super(str);
        this.f177r = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f177r) {
            case 0:
                setStackTrace(V0.f154a);
                break;
            case 1:
                setStackTrace(D0.u.f1131c);
                break;
            case 2:
                setStackTrace(l0.a.f19304e);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }
}
