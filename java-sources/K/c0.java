package K;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4617a;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f4617a == ((c0) obj).f4617a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4617a;
    }

    public final String toString() {
        return "MenuItemsAvailability(value=" + this.f4617a + ')';
    }
}
