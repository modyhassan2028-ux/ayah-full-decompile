package p063g1;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16254a;

    public /* synthetic */ j(long j) {
        this.f16254a = j;
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final long b(long j, long j10) {
        return (((long) (((int) (j >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final long c(long j, long j10) {
        return (((long) (((int) (j >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static String d(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return p.A(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f16254a == ((j) obj).f16254a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16254a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d(this.f16254a);
    }
}
