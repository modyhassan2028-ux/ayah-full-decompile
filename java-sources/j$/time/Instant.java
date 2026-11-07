package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.k, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f17738c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17740b;

    public static Instant now() {
        a.f17771b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f17739a, instant2.f17739a);
        return iCompare != 0 ? iCompare : this.f17740b - instant2.f17740b;
    }

    static {
        S(-31557014167219200L, 0L);
        S(31556889864403199L, 999999999L);
    }

    public static Instant S(long j, long j10) {
        return Q(j$.com.android.tools.r8.a.B(j, j$.com.android.tools.r8.a.G(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.F(j10, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j10 = 1000;
        return Q(j$.com.android.tools.r8.a.G(j, j10), ((int) j$.com.android.tools.r8.a.F(j, j10)) * 1000000);
    }

    public static Instant R(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return S(temporalAccessor.D(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (b e10) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static Instant Q(long j, int i10) {
        if ((((long) i10) | j) == 0) {
            return f17738c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i10);
    }

    public Instant(long j, int i10) {
        this.f17739a = j;
        this.f17740b = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.n.d(this, temporalField).a(temporalField.A(this), temporalField);
        }
        int i10 = e.f17832a[((ChronoField) temporalField).ordinal()];
        if (i10 == 1) {
            return this.f17740b;
        }
        if (i10 == 2) {
            return this.f17740b / 1000;
        }
        if (i10 == 3) {
            return this.f17740b / 1000000;
        }
        if (i10 == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.f17960b.a(this.f17739a, chronoField);
        }
        throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        int i10;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        int i11 = e.f17832a[((ChronoField) temporalField).ordinal()];
        if (i11 == 1) {
            i10 = this.f17740b;
        } else if (i11 == 2) {
            i10 = this.f17740b / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f17739a;
                }
                throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
            }
            i10 = this.f17740b / 1000000;
        }
        return i10;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        int i10 = e.f17832a[chronoField.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j) * 1000;
                if (i11 != this.f17740b) {
                    return Q(this.f17739a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j) * 1000000;
                if (i12 != this.f17740b) {
                    return Q(this.f17739a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
                }
                if (j != this.f17739a) {
                    return Q(j, this.f17740b);
                }
            }
        } else if (j != this.f17740b) {
            return Q(this.f17739a, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.k(this, j);
        }
        switch (e.f17833b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T(0L, j);
            case 2:
                return T(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return T(j / 1000, (j % 1000) * 1000000);
            case 4:
                return T(j, 0L);
            case 5:
                return T(j$.com.android.tools.r8.a.H(j, 60), 0L);
            case 6:
                return T(j$.com.android.tools.r8.a.H(j, 3600), 0L);
            case 7:
                return T(j$.com.android.tools.r8.a.H(j, 43200), 0L);
            case 8:
                return T(j$.com.android.tools.r8.a.H(j, 86400), 0L);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final Instant T(long j, long j10) {
        if ((j | j10) == 0) {
            return this;
        }
        return S(j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.B(this.f17739a, j), j10 / 1000000000), ((long) this.f17740b) + (j10 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17981c) {
            return ChronoUnit.NANOS;
        }
        if (fVar == j$.time.temporal.n.f17980b || fVar == j$.time.temporal.n.f17979a || fVar == j$.time.temporal.n.f17983e || fVar == j$.time.temporal.n.f17982d || fVar == j$.time.temporal.n.f17984f || fVar == j$.time.temporal.n.g) {
            return null;
        }
        return fVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(this.f17739a, ChronoField.INSTANT_SECONDS).c(this.f17740b, ChronoField.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantR = R(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantR);
        }
        switch (e.f17833b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j$.com.android.tools.r8.a.I(instantR.f17739a, this.f17739a), 1000000000L), instantR.f17740b - this.f17740b);
            case 2:
                return j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j$.com.android.tools.r8.a.I(instantR.f17739a, this.f17739a), 1000000000L), instantR.f17740b - this.f17740b) / 1000;
            case 3:
                return j$.com.android.tools.r8.a.I(instantR.W(), W());
            case 4:
                return V(instantR);
            case 5:
                return V(instantR) / 60;
            case 6:
                return V(instantR) / 3600;
            case 7:
                return V(instantR) / 43200;
            case 8:
                return V(instantR) / 86400;
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long V(Instant instant) {
        long jI = j$.com.android.tools.r8.a.I(instant.f17739a, this.f17739a);
        long j = instant.f17740b - this.f17740b;
        if (jI <= 0 || j >= 0) {
            return (jI >= 0 || j <= 0) ? jI : jI + 1;
        }
        return jI - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.Q(this, zoneOffset);
    }

    public final long W() {
        long j = this.f17739a;
        return (j >= 0 || this.f17740b <= 0) ? j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j, 1000), this.f17740b / 1000000) : j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j + 1, 1000), (this.f17740b / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f17739a == instant.f17739a && this.f17740b == instant.f17740b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f17739a;
        return (this.f17740b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f17848f.a(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
