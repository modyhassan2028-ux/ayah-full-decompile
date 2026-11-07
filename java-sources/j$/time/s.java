package j$.time;

import j$.time.format.E;
import j$.time.format.F;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17954b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17955a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17955a - ((s) obj).f17955a;
    }

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.n(ChronoField.YEAR, 4, 10, F.EXCEEDS_PAD);
        uVar.r(Locale.getDefault(), E.SMART, null);
    }

    public static s Q(int i10) {
        ChronoField.YEAR.Q(i10);
        return new s(i10);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        s sVarQ;
        if (temporal instanceof s) {
            sVarQ = (s) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.f17812c.equals(j$.com.android.tools.r8.a.z(temporal))) {
                    temporal = LocalDate.S(temporal);
                }
                sVarQ = Q(temporal.get(ChronoField.YEAR));
            } catch (b e10) {
                throw new b("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j = ((long) sVarQ.f17955a) - ((long) this.f17955a);
            int i10 = r.f17953b[((ChronoUnit) temporalUnit).ordinal()];
            if (i10 == 1) {
                return j;
            }
            if (i10 == 2) {
                return j / 10;
            }
            if (i10 == 3) {
                return j / 100;
            }
            if (i10 == 4) {
                return j / 1000;
            }
            if (i10 == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return sVarQ.D(chronoField) - D(chronoField);
            }
            throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, sVarQ);
    }

    public s(int i10) {
        this.f17955a = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f17955a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return l(temporalField).a(D(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        int i10 = r.f17952a[((ChronoField) temporalField).ordinal()];
        if (i10 == 1) {
            int i11 = this.f17955a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f17955a;
        }
        if (i10 == 3) {
            return this.f17955a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        localDate.getClass();
        return (s) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final s c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (s) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        int i10 = r.f17952a[chronoField.ordinal()];
        if (i10 == 1) {
            if (this.f17955a < 1) {
                j = 1 - j;
            }
            return Q((int) j);
        }
        if (i10 == 2) {
            return Q((int) j);
        }
        if (i10 == 3) {
            return D(ChronoField.ERA) == j ? this : Q(1 - this.f17955a);
        }
        throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final s d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (s) temporalUnit.k(this, j);
        }
        int i10 = r.f17953b[((ChronoUnit) temporalUnit).ordinal()];
        if (i10 == 1) {
            return S(j);
        }
        if (i10 == 2) {
            return S(j$.com.android.tools.r8.a.H(j, 10));
        }
        if (i10 == 3) {
            return S(j$.com.android.tools.r8.a.H(j, 100));
        }
        if (i10 == 4) {
            return S(j$.com.android.tools.r8.a.H(j, 1000));
        }
        if (i10 == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return c(j$.com.android.tools.r8.a.B(D(chronoField), j), chronoField);
        }
        throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
    }

    public final s S(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return Q(chronoField.f17960b.a(((long) this.f17955a) + j, chronoField));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17980b) {
            return j$.time.chrono.q.f17812c;
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.n.c(this, fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.z(temporal).equals(j$.time.chrono.q.f17812c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.c(this.f17955a, ChronoField.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f17955a == ((s) obj).f17955a;
    }

    public final int hashCode() {
        return this.f17955a;
    }

    public final String toString() {
        return Integer.toString(this.f17955a);
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
