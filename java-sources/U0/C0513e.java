package U0;

/* JADX INFO: renamed from: U0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8057d;

    public C0513e(Object obj, int i10, int i11, String str) {
        this.f8054a = obj;
        this.f8055b = i10;
        this.f8056c = i11;
        this.f8057d = str;
        if (i10 <= i11) {
            return;
        }
        p002a1.a.a("Reversed range is not supported");
    }

    public static C0513e a(C0513e c0513e, u uVar, int i10, int i11) {
        Object obj = uVar;
        if ((i11 & 1) != 0) {
            obj = c0513e.f8054a;
        }
        int i12 = c0513e.f8055b;
        if ((i11 & 4) != 0) {
            i10 = c0513e.f8056c;
        }
        return new C0513e(obj, i12, i10, c0513e.f8057d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0513e)) {
            return false;
        }
        C0513e c0513e = (C0513e) obj;
        return p251z9.j.a(this.f8054a, c0513e.f8054a) && this.f8055b == c0513e.f8055b && this.f8056c == c0513e.f8056c && p251z9.j.a(this.f8057d, c0513e.f8057d);
    }

    public final int hashCode() {
        Object obj = this.f8054a;
        return this.f8057d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f8055b) * 31) + this.f8056c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f8054a);
        sb.append(", start=");
        sb.append(this.f8055b);
        sb.append(", end=");
        sb.append(this.f8056c);
        sb.append(", tag=");
        return p245z2.a.F(sb, this.f8057d, ')');
    }

    public C0513e(int i10, int i11, Object obj) {
        this(obj, i10, i11, "");
    }
}
