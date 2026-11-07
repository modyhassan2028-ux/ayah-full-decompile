package ra;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Da.k f21651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Da.k f21652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Da.k f21653f;
    public static final Da.k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Da.k f21654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Da.k f21655i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Da.k f21656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Da.k f21657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21658c;

    static {
        Da.k kVar = Da.k.f1363u;
        f21651d = R7.f.m(":");
        f21652e = R7.f.m(":status");
        f21653f = R7.f.m(":method");
        g = R7.f.m(":path");
        f21654h = R7.f.m(":scheme");
        f21655i = R7.f.m(":authority");
    }

    public d(Da.k kVar, Da.k kVar2) {
        p251z9.j.e(kVar, "name");
        p251z9.j.e(kVar2, "value");
        this.f21656a = kVar;
        this.f21657b = kVar2;
        this.f21658c = kVar2.a() + kVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p251z9.j.a(this.f21656a, dVar.f21656a) && p251z9.j.a(this.f21657b, dVar.f21657b);
    }

    public final int hashCode() {
        return this.f21657b.hashCode() + (this.f21656a.hashCode() * 31);
    }

    public final String toString() {
        return this.f21656a.k() + ": " + this.f21657b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(R7.f.m(str), R7.f.m(str2));
        Da.k kVar = Da.k.f1363u;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Da.k kVar, String str) {
        this(kVar, R7.f.m(str));
        p251z9.j.e(kVar, "name");
        p251z9.j.e(str, "value");
        Da.k kVar2 = Da.k.f1363u;
    }
}
