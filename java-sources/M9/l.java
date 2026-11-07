package M9;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5875b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5876a;

    public static final Object a(Object obj) {
        if (obj instanceof k) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return p251z9.j.a(this.f5876a, ((l) obj).f5876a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5876a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f5876a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
