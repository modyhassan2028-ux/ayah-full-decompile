package I9;

import H9.o;
import com.google.android.gms.internal.measurement.B1;
import p017b7.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f3850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f3851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f3852u = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f3853r;

    static {
        int i10 = b.f3854a;
        f3850s = g.X(4611686018427387903L);
        f3851t = g.X(-4611686018427387903L);
    }

    public static final long a(long j, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return g.X(B0.c.m(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return g.Z((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strH1 = o.h1(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strH1.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strH1.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb.append((CharSequence) strH1, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strH1, 0, i15);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j10) {
        long j11 = j ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return j.g(j, j10);
        }
        int i10 = (((int) j) & 1) - (((int) j10) & 1);
        return j < 0 ? -i10 : i10;
    }

    public static final int d(long j) {
        if (e(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final boolean e(long j) {
        return j == f3850s || j == f3851t;
    }

    public static final long f(long j, long j10) {
        if (e(j)) {
            if (!e(j10) || (j10 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j10)) {
            return j10;
        }
        int i10 = ((int) j) & 1;
        if (i10 != (((int) j10) & 1)) {
            return i10 == 1 ? a(j >> 1, j10 >> 1) : a(j10 >> 1, j >> 1);
        }
        long j11 = (j >> 1) + (j10 >> 1);
        if (i10 == 0) {
            return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? g.X(j11 / ((long) 1000000)) : g.Z(j11);
        }
        return g.Y(j11);
    }

    public static final long g(long j, c cVar) {
        j.e(cVar, "unit");
        if (j == f3850s) {
            return Long.MAX_VALUE;
        }
        if (j == f3851t) {
            return Long.MIN_VALUE;
        }
        return B1.r(j >> 1, (((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, cVar);
    }

    public static final long h(long j) {
        long j10 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i10 = b.f3854a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f3853r, ((a) obj).f3853r);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f3853r == ((a) obj).f3853r;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3853r;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long jH = this.f3853r;
        if (jH == 0) {
            return "0s";
        }
        if (jH == f3850s) {
            return "Infinity";
        }
        if (jH == f3851t) {
            return "-Infinity";
        }
        int i10 = 0;
        boolean z10 = jH < 0;
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append('-');
        }
        if (jH < 0) {
            jH = h(jH);
        }
        long jG = g(jH, c.DAYS);
        int iG = e(jH) ? 0 : (int) (g(jH, c.HOURS) % ((long) 24));
        int iG2 = e(jH) ? 0 : (int) (g(jH, c.MINUTES) % ((long) 60));
        int iG3 = e(jH) ? 0 : (int) (g(jH, c.SECONDS) % ((long) 60));
        int iD = d(jH);
        boolean z11 = jG != 0;
        boolean z12 = iG != 0;
        boolean z13 = iG2 != 0;
        boolean z14 = (iG3 == 0 && iD == 0) ? false : true;
        if (z11) {
            sb.append(jG);
            sb.append('d');
            i10 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('h');
            i10 = i11;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iG2);
            sb.append('m');
            i10 = i12;
        }
        if (z14) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iG3 != 0 || z11 || z12 || z13) {
                b(sb, iG3, iD, 9, "s", false);
            } else if (iD >= 1000000) {
                b(sb, iD / 1000000, iD % 1000000, 6, "ms", false);
            } else if (iD >= 1000) {
                b(sb, iD / 1000, iD % 1000, 3, "us", false);
            } else {
                sb.append(iD);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (z10 && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
