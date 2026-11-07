package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.m, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f17946d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17949c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.C(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static p a(int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f17946d;
        }
        return new p(i10, i11, i12);
    }

    public p(int i10, int i11, int i12) {
        this.f17947a = i10;
        this.f17948b = i11;
        this.f17949c = i12;
    }

    @Override // j$.time.temporal.m
    public final Temporal k(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        j$.time.chrono.l lVar = (j$.time.chrono.l) temporal.v(j$.time.temporal.n.f17980b);
        if (lVar == null || j$.time.chrono.q.f17812c.equals(lVar)) {
            int i10 = this.f17948b;
            if (i10 != 0) {
                long j = (((long) this.f17947a) * 12) + ((long) i10);
                if (j != 0) {
                    temporal = temporal.d(j, ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f17947a;
                if (i11 != 0) {
                    temporal = temporal.d(i11, ChronoUnit.YEARS);
                }
            }
            int i12 = this.f17949c;
            return i12 != 0 ? temporal.d(i12, ChronoUnit.DAYS) : temporal;
        }
        throw new b("Chronology mismatch, expected: ISO, actual: " + lVar.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f17947a == pVar.f17947a && this.f17948b == pVar.f17948b && this.f17949c == pVar.f17949c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f17949c, 16) + Integer.rotateLeft(this.f17948b, 8) + this.f17947a;
    }

    public final String toString() {
        if (this == f17946d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i10 = this.f17947a;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        int i11 = this.f17948b;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('M');
        }
        int i12 = this.f17949c;
        if (i12 != 0) {
            sb.append(i12);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
