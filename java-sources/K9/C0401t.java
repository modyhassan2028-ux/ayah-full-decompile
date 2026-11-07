package K9;

/* JADX INFO: renamed from: K9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0401t extends p150o9.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f5395t = new r();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5396s;

    public C0401t(String str) {
        super(f5395t);
        this.f5396s = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0401t) && p251z9.j.a(this.f5396s, ((C0401t) obj).f5396s);
    }

    public final int hashCode() {
        return this.f5396s.hashCode();
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("CoroutineName("), this.f5396s, ')');
    }
}
