package p251z9;

/* JADX INFO: loaded from: classes.dex */
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f24880a;

    public n(Class cls) {
        j.e(cls, "jClass");
        this.f24880a = cls;
    }

    @Override // p251z9.d
    public final Class a() {
        return this.f24880a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return j.a(this.f24880a, ((n) obj).f24880a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24880a.hashCode();
    }

    public final String toString() {
        return this.f24880a + " (Kotlin reflection is not available)";
    }
}
