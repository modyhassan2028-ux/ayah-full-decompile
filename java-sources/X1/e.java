package X1;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9850a;

    public e(String str) {
        j.e(str, "name");
        this.f9850a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return j.a(this.f9850a, ((e) obj).f9850a);
    }

    public final int hashCode() {
        return this.f9850a.hashCode();
    }

    public final String toString() {
        return this.f9850a;
    }
}
