package j$.time;

import j$.time.format.E;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements TemporalAccessor, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17938c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17940b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int i10 = this.f17939a - lVar.f17939a;
        return i10 == 0 ? this.f17940b - lVar.f17940b : i10;
    }

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.e("--");
        uVar.m(ChronoField.MONTH_OF_YEAR, 2);
        uVar.d('-');
        uVar.m(ChronoField.DAY_OF_MONTH, 2);
        uVar.r(Locale.getDefault(), E.SMART, null);
    }

    public l(int i10, int i11) {
        this.f17939a = i10;
        this.f17940b = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        int i10;
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.v();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, temporalField);
        }
        Month monthT = Month.T(this.f17939a);
        monthT.getClass();
        int i11 = j.f17936a[monthT.ordinal()];
        if (i11 != 1) {
            i10 = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        } else {
            i10 = 28;
        }
        return j$.time.temporal.p.g(1L, i10, Month.T(this.f17939a).S());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return l(temporalField).a(D(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        int i11 = k.f17937a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f17940b;
        } else {
            if (i11 != 2) {
                throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
            }
            i10 = this.f17939a;
        }
        return i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17980b) {
            return j$.time.chrono.q.f17812c;
        }
        return j$.time.temporal.n.c(this, fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.z(temporal).equals(j$.time.chrono.q.f17812c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        Temporal temporalC = temporal.c(this.f17939a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalC.c(Math.min(temporalC.l(chronoField).f17988d, this.f17940b), chronoField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f17939a == lVar.f17939a && this.f17940b == lVar.f17940b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17939a << 6) + this.f17940b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f17939a < 10 ? "0" : "");
        sb.append(this.f17939a);
        sb.append(this.f17940b < 10 ? "-0" : "-");
        sb.append(this.f17940b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
