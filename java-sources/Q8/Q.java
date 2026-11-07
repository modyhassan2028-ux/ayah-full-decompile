package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f6910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0455b f6911b;

    public Q(Z z10, C0455b c0455b) {
        this.f6910a = z10;
        this.f6911b = c0455b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f6910a.equals(q10.f6910a) && this.f6911b.equals(q10.f6911b);
    }

    public final int hashCode() {
        return this.f6911b.hashCode() + ((this.f6910a.hashCode() + (EnumC0467n.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC0467n.SESSION_START + ", sessionData=" + this.f6910a + ", applicationInfo=" + this.f6911b + ')';
    }
}
