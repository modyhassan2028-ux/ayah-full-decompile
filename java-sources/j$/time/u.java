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
public final class u implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18004c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18006b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i10 = this.f18005a - uVar.f18005a;
        return i10 == 0 ? this.f18006b - uVar.f18006b : i10;
    }

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.n(ChronoField.YEAR, 4, 10, F.EXCEEDS_PAD);
        uVar.d('-');
        uVar.m(ChronoField.MONTH_OF_YEAR, 2);
        uVar.r(Locale.getDefault(), E.SMART, null);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        u uVar;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.f17812c.equals(j$.com.android.tools.r8.a.z(temporal))) {
                    temporal = LocalDate.S(temporal);
                }
                ChronoField chronoField = ChronoField.YEAR;
                int i10 = temporal.get(chronoField);
                ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
                int i11 = temporal.get(chronoField2);
                chronoField.Q(i10);
                chronoField2.Q(i11);
                uVar = new u(i10, i11);
            } catch (b e10) {
                throw new b("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jQ = uVar.Q() - Q();
            switch (t.f17957b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jQ;
                case 2:
                    return jQ / 12;
                case 3:
                    return jQ / 120;
                case 4:
                    return jQ / 1200;
                case 5:
                    return jQ / 12000;
                case 6:
                    ChronoField chronoField3 = ChronoField.ERA;
                    return uVar.D(chronoField3) - D(chronoField3);
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, uVar);
    }

    public u(int i10, int i11) {
        this.f18005a = i10;
        this.f18006b = i11;
    }

    public final u U(int i10, int i11) {
        return (this.f18005a == i10 && this.f18006b == i11) ? this : new u(i10, i11);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f18005a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, temporalField);
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
        int i11 = t.f17956a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f18006b;
        } else {
            if (i11 == 2) {
                return Q();
            }
            if (i11 == 3) {
                int i12 = this.f18005a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f18005a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
            }
            i10 = this.f18005a;
        }
        return i10;
    }

    public final long Q() {
        return ((((long) this.f18005a) * 12) + ((long) this.f18006b)) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        localDate.getClass();
        return (u) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final u c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (u) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        int i10 = t.f17956a[chronoField.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j;
            ChronoField.MONTH_OF_YEAR.Q(i11);
            return U(this.f18005a, i11);
        }
        if (i10 == 2) {
            return S(j - Q());
        }
        if (i10 == 3) {
            if (this.f18005a < 1) {
                j = 1 - j;
            }
            int i12 = (int) j;
            ChronoField.YEAR.Q(i12);
            return U(i12, this.f18006b);
        }
        if (i10 == 4) {
            int i13 = (int) j;
            ChronoField.YEAR.Q(i13);
            return U(i13, this.f18006b);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
        if (D(ChronoField.ERA) == j) {
            return this;
        }
        int i14 = 1 - this.f18005a;
        ChronoField.YEAR.Q(i14);
        return U(i14, this.f18006b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final u d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.k(this, j);
        }
        switch (t.f17957b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return S(j);
            case 2:
                return T(j);
            case 3:
                return T(j$.com.android.tools.r8.a.H(j, 10));
            case 4:
                return T(j$.com.android.tools.r8.a.H(j, 100));
            case 5:
                return T(j$.com.android.tools.r8.a.H(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.B(D(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final u T(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return U(chronoField.f17960b.a(((long) this.f18005a) + j, chronoField), this.f18006b);
    }

    public final u S(long j) {
        if (j == 0) {
            return this;
        }
        long j10 = (((long) this.f18005a) * 12) + ((long) (this.f18006b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j11 = 12;
        return U(chronoField.f17960b.a(j$.com.android.tools.r8.a.G(j10, j11), chronoField), ((int) j$.com.android.tools.r8.a.F(j10, j11)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.n.c(this, fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.z(temporal).equals(j$.time.chrono.q.f17812c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.c(Q(), ChronoField.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f18005a == uVar.f18005a && this.f18006b == uVar.f18006b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18005a ^ (this.f18006b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f18005a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f18005a;
            if (i10 < 0) {
                sb.append(i10 - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i10 + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f18005a);
        }
        sb.append(this.f18006b < 10 ? "-0" : "-");
        sb.append(this.f18006b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
