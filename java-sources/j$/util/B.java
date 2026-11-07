package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f18043b = new B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18044a;

    public B() {
        this.f18044a = null;
    }

    public B(Object obj) {
        this.f18044a = Objects.requireNonNull(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return Objects.equals(this.f18044a, ((B) obj).f18044a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f18044a);
    }

    public final String toString() {
        Object obj = this.f18044a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
