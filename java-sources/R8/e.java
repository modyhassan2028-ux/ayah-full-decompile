package R8;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7409a;

    public e(String str) {
        j.e(str, "sessionId");
        this.f7409a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f7409a, ((e) obj).f7409a);
    }

    public final int hashCode() {
        return this.f7409a.hashCode();
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("SessionDetails(sessionId="), this.f7409a, ')');
    }
}
