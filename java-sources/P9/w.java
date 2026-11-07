package P9;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p150o9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ThreadLocal f6810r;

    public w(ThreadLocal threadLocal) {
        this.f6810r = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && p251z9.j.a(this.f6810r, ((w) obj).f6810r);
    }

    public final int hashCode() {
        return this.f6810r.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f6810r + ')';
    }
}
