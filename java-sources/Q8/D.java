package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public static final C Companion = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6884b;

    public D(int i10, String str) {
        p251z9.j.e(str, "uuid");
        this.f6883a = i10;
        this.f6884b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        return this.f6883a == d5.f6883a && p251z9.j.a(this.f6884b, d5.f6884b);
    }

    public final int hashCode() {
        return this.f6884b.hashCode() + (this.f6883a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.f6883a);
        sb.append(", uuid=");
        return p245z2.a.F(sb, this.f6884b, ')');
    }

    public /* synthetic */ D(String str, int i10, int i11) {
        if (3 != (i10 & 3)) {
            Y9.M.e(i10, 3, B.f6882a.d());
            throw null;
        }
        this.f6883a = i11;
        this.f6884b = str;
    }
}
