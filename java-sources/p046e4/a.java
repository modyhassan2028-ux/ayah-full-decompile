package p046e4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15759b;

    public a() {
        double d5 = 1440;
        this.f15758a = B9.a.U(0.16111111111111112d * d5);
        this.f15759b = B9.a.U(0.015d * d5);
        B9.a.U(0.045d * d5);
        B9.a.U(d5 * 0.025d);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    public final int hashCode() {
        return 1440;
    }

    public final String toString() {
        return "PageWidthInfo(width=1440)";
    }
}
