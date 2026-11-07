package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10935a;

    public static String a(int i10) {
        if (i10 == -1) {
            return "Unspecified";
        }
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "Characters";
        }
        if (i10 == 2) {
            return "Words";
        }
        return i10 == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f10935a == ((l) obj).f10935a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10935a;
    }

    public final String toString() {
        return a(this.f10935a);
    }
}
