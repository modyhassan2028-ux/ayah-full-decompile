package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements j$.time.temporal.m, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f17829c = new d(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17831b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int iCompare = Long.compare(this.f17830a, dVar.f17830a);
        return iCompare != 0 ? iCompare : this.f17831b - dVar.f17831b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static d p(long j) {
        long j10 = j / 1000000000;
        int i10 = (int) (j % 1000000000);
        if (i10 < 0) {
            i10 = (int) (((long) i10) + 1000000000);
            j10--;
        }
        return l(j10, i10);
    }

    public static d l(long j, int i10) {
        if ((((long) i10) | j) == 0) {
            return f17829c;
        }
        return new d(j, i10);
    }

    public d(long j, int i10) {
        this.f17830a = j;
        this.f17831b = i10;
    }

    @Override // j$.time.temporal.m
    public final Temporal k(Temporal temporal) {
        long j = this.f17830a;
        if (j != 0) {
            temporal = temporal.d(j, ChronoUnit.SECONDS);
        }
        int i10 = this.f17831b;
        return i10 != 0 ? temporal.d(i10, ChronoUnit.NANOS) : temporal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f17830a == dVar.f17830a && this.f17831b == dVar.f17831b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17830a;
        return (this.f17831b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f17829c) {
            return "PT0S";
        }
        long j = this.f17830a;
        if (j < 0 && this.f17831b > 0) {
            j++;
        }
        long j10 = j / 3600;
        int i10 = (int) ((j % 3600) / 60);
        int i11 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i11 == 0 && this.f17831b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.f17830a < 0 && this.f17831b > 0 && i11 == 0) {
            sb.append("-0");
        } else {
            sb.append(i11);
        }
        if (this.f17831b > 0) {
            int length = sb.length();
            if (this.f17830a < 0) {
                sb.append(2000000000 - ((long) this.f17831b));
            } else {
                sb.append(((long) this.f17831b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
