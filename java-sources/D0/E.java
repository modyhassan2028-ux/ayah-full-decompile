package D0;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1051a;

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.f1051a == ((E) obj).f1051a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1051a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f1051a + ')';
    }
}
