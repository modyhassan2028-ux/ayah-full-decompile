package U0;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f8033b = va.g.e(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8034c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8035a;

    public /* synthetic */ K(long j) {
        this.f8035a = j;
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final boolean b(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int c(long j) {
        return d(j) - e(j);
    }

    public static final int d(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int e(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean f(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String g(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return android.support.v4.media.session.p.A(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            return this.f8035a == ((K) obj).f8035a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8035a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return g(this.f8035a);
    }
}
