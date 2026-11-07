package U0;

/* JADX INFO: renamed from: U0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0511c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8051d;

    public C0511c(Object obj, int i10, int i11, String str) {
        this.f8048a = obj;
        this.f8049b = i10;
        this.f8050c = i11;
        this.f8051d = str;
    }

    public final C0513e a(int i10) {
        int i11 = this.f8050c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (!(i10 != Integer.MIN_VALUE)) {
            p002a1.a.b("Item.end should be set first");
        }
        return new C0513e(this.f8048a, this.f8049b, i10, this.f8051d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0511c)) {
            return false;
        }
        C0511c c0511c = (C0511c) obj;
        return p251z9.j.a(this.f8048a, c0511c.f8048a) && this.f8049b == c0511c.f8049b && this.f8050c == c0511c.f8050c && p251z9.j.a(this.f8051d, c0511c.f8051d);
    }

    public final int hashCode() {
        Object obj = this.f8048a;
        return this.f8051d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f8049b) * 31) + this.f8050c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f8048a);
        sb.append(", start=");
        sb.append(this.f8049b);
        sb.append(", end=");
        sb.append(this.f8050c);
        sb.append(", tag=");
        return p245z2.a.F(sb, this.f8051d, ')');
    }
}
