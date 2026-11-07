package K9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends CancellationException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient h0 f5348r;

    public b0(String str, Throwable th, h0 h0Var) {
        super(str);
        this.f5348r = h0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!p251z9.j.a(b0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = b0Var.f5348r;
        if (obj2 == null) {
            obj2 = k0.f5377s;
        }
        Object obj3 = this.f5348r;
        if (obj3 == null) {
            obj3 = k0.f5377s;
        }
        return p251z9.j.a(obj2, obj3) && p251z9.j.a(b0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        p251z9.j.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f5348r;
        if (obj == null) {
            obj = k0.f5377s;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f5348r;
        if (obj == null) {
            obj = k0.f5377s;
        }
        sb.append(obj);
        return sb.toString();
    }
}
