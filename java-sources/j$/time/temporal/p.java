package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17988d;

    public static p f(long j, long j10) {
        if (j > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new p(j, j, j10, j10);
    }

    public static p g(long j, long j10, long j11) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new p(j, 1L, j10, j11);
    }

    public p(long j, long j10, long j11, long j12) {
        this.f17985a = j;
        this.f17986b = j10;
        this.f17987c = j11;
        this.f17988d = j12;
    }

    public final boolean d() {
        return this.f17985a >= -2147483648L && this.f17988d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.f17985a && j <= this.f17988d;
    }

    public final int a(long j, TemporalField temporalField) {
        if (d() && e(j)) {
            return (int) j;
        }
        throw new j$.time.b(c(j, temporalField));
    }

    public final void b(long j, TemporalField temporalField) {
        if (!e(j)) {
            throw new j$.time.b(c(j, temporalField));
        }
    }

    public final String c(long j, TemporalField temporalField) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f17985a;
        long j10 = this.f17986b;
        if (j > j10) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.f17987c;
        long j12 = this.f17988d;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f17985a == pVar.f17985a && this.f17986b == pVar.f17986b && this.f17987c == pVar.f17987c && this.f17988d == pVar.f17988d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17985a;
        long j10 = this.f17986b;
        long j11 = j + (j10 << 16) + (j10 >> 48);
        long j12 = this.f17987c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.f17988d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) (j15 ^ (j15 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17985a);
        if (this.f17985a != this.f17986b) {
            sb.append('/');
            sb.append(this.f17986b);
        }
        sb.append(" - ");
        sb.append(this.f17987c);
        if (this.f17987c != this.f17988d) {
            sb.append('/');
            sb.append(this.f17988d);
        }
        return sb.toString();
    }
}
