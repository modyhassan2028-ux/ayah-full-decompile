package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1049e;
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
public final class LocalDateTime implements Temporal, j$.time.temporal.k, InterfaceC1049e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f17746c = T(LocalDate.f17741d, LocalTime.f17750e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f17747d = T(LocalDate.f17742e, LocalTime.f17751f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f17748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f17749b;

    @Override // j$.time.chrono.InterfaceC1049e
    public final j$.time.chrono.l a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.InterfaceC1049e
    public final ChronoZonedDateTime B(ZoneId zoneId) {
        return ZonedDateTime.R(this, zoneId, null);
    }

    public static LocalDateTime T(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(((LocalDate) f()).E(), ChronoField.EPOCH_DAY).c(b().c0(), ChronoField.NANO_OF_DAY);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return U(instant.f17739a, instant.f17740b, zoneId.R().d(instant));
    }

    public static LocalDateTime U(long j, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j10 = i10;
        ChronoField.NANO_OF_SECOND.Q(j10);
        long j11 = j + ((long) zoneOffset.f17766b);
        long j12 = 86400;
        return new LocalDateTime(LocalDate.d0(j$.com.android.tools.r8.a.G(j11, j12)), LocalTime.V((((long) ((int) j$.com.android.tools.r8.a.F(j11, j12))) * 1000000000) + j10));
    }

    public static LocalDateTime R(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(LocalDate.S(temporalAccessor), LocalTime.S(temporalAccessor));
            } catch (b e10) {
                throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
            }
        }
        return ((ZonedDateTime) temporalAccessor).f17768a;
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f17748a = localDate;
        this.f17749b = localTime;
    }

    public final LocalDateTime Z(LocalDate localDate, LocalTime localTime) {
        return (this.f17748a == localDate && this.f17749b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.k(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.R();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).R()) {
                LocalTime localTime = this.f17749b;
                localTime.getClass();
                return j$.time.temporal.n.d(localTime, temporalField);
            }
            return this.f17748a.l(temporalField);
        }
        return temporalField.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.f17749b.get(temporalField) : this.f17748a.get(temporalField);
        }
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.f17749b.D(temporalField) : this.f17748a.D(temporalField);
        }
        return temporalField.A(this);
    }

    @Override // j$.time.chrono.InterfaceC1049e
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate f() {
        return this.f17748a;
    }

    @Override // j$.time.chrono.InterfaceC1049e
    public final LocalTime b() {
        return this.f17749b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime z(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return Z((LocalDate) kVar, this.f17749b);
        }
        if (kVar instanceof LocalTime) {
            return Z(this.f17748a, (LocalTime) kVar);
        }
        if (kVar instanceof LocalDateTime) {
            return (LocalDateTime) kVar;
        }
        return (LocalDateTime) kVar.p(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).R()) {
                return Z(this.f17748a, this.f17749b.c(j, temporalField));
            }
            return Z(this.f17748a.c(j, temporalField), this.f17749b);
        }
        return (LocalDateTime) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.k(this, j);
        }
        switch (h.f17933a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(this.f17748a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeZ = Z(this.f17748a.plusDays(j / 86400000000L), this.f17749b);
                return localDateTimeZ.X(localDateTimeZ.f17748a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeZ2 = Z(this.f17748a.plusDays(j / 86400000), this.f17749b);
                return localDateTimeZ2.X(localDateTimeZ2.f17748a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return W(j);
            case 5:
                return X(this.f17748a, 0L, j, 0L, 0L);
            case 6:
                return X(this.f17748a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeZ3 = Z(this.f17748a.plusDays(j / 256), this.f17749b);
                return localDateTimeZ3.X(localDateTimeZ3.f17748a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(this.f17748a.d(j, temporalUnit), this.f17749b);
        }
    }

    public final LocalDateTime W(long j) {
        return X(this.f17748a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final LocalDateTime X(LocalDate localDate, long j, long j10, long j11, long j12) {
        if ((j | j10 | j11 | j12) == 0) {
            return Z(localDate, this.f17749b);
        }
        long j13 = 1;
        long jC0 = this.f17749b.c0();
        long j14 = ((((j % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L)) * j13) + jC0;
        long jG = j$.com.android.tools.r8.a.G(j14, 86400000000000L) + (((j / 24) + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L)) * j13);
        long jF = j$.com.android.tools.r8.a.F(j14, 86400000000000L);
        return Z(localDate.plusDays(jG), jF == jC0 ? this.f17749b : LocalTime.V(jF));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17984f) {
            return this.f17748a;
        }
        return j$.com.android.tools.r8.a.s(this, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        long jH;
        long j;
        LocalDateTime localDateTimeR = R(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeR);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDatePlusDays = localDateTimeR.f17748a;
            LocalDate localDate = this.f17748a;
            if (localDate == null) {
                if (localDatePlusDays.E() > localDate.E()) {
                    if (localDateTimeR.f17749b.compareTo(this.f17749b) < 0) {
                        localDatePlusDays = localDatePlusDays.plusDays(-1L);
                    }
                }
                return this.f17748a.until(localDatePlusDays, temporalUnit);
            }
            localDatePlusDays.getClass();
            if (localDatePlusDays.Q(localDate) > 0) {
                if (localDateTimeR.f17749b.compareTo(this.f17749b) < 0) {
                    localDatePlusDays = localDatePlusDays.plusDays(-1L);
                }
            }
            return this.f17748a.until(localDatePlusDays, temporalUnit);
            if (localDatePlusDays.X(this.f17748a) && localDateTimeR.f17749b.compareTo(this.f17749b) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.f17748a.until(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate2 = this.f17748a;
        LocalDate localDate3 = localDateTimeR.f17748a;
        localDate2.getClass();
        long jE = localDate3.E() - localDate2.E();
        if (jE == 0) {
            return this.f17749b.until(localDateTimeR.f17749b, temporalUnit);
        }
        long jC0 = localDateTimeR.f17749b.c0() - this.f17749b.c0();
        if (jE > 0) {
            jH = jE - 1;
            j = jC0 + 86400000000000L;
        } else {
            jH = jE + 1;
            j = jC0 - 86400000000000L;
        }
        switch (h.f17933a[chronoUnit.ordinal()]) {
            case 1:
                jH = j$.com.android.tools.r8.a.H(jH, 86400000000000L);
                break;
            case 2:
                jH = j$.com.android.tools.r8.a.H(jH, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jH = j$.com.android.tools.r8.a.H(jH, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jH = j$.com.android.tools.r8.a.H(jH, 86400);
                j /= 1000000000;
                break;
            case 5:
                jH = j$.com.android.tools.r8.a.H(jH, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jH = j$.com.android.tools.r8.a.H(jH, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jH = j$.com.android.tools.r8.a.H(jH, 2);
                j /= 43200000000000L;
                break;
        }
        return j$.com.android.tools.r8.a.B(jH, j);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1049e interfaceC1049e) {
        if (interfaceC1049e instanceof LocalDateTime) {
            return Q((LocalDateTime) interfaceC1049e);
        }
        return j$.com.android.tools.r8.a.h(this, interfaceC1049e);
    }

    public final int Q(LocalDateTime localDateTime) {
        int iQ = this.f17748a.Q(localDateTime.f());
        return iQ == 0 ? this.f17749b.compareTo(localDateTime.f17749b) : iQ;
    }

    public final boolean S(InterfaceC1049e interfaceC1049e) {
        if (interfaceC1049e instanceof LocalDateTime) {
            return Q((LocalDateTime) interfaceC1049e) < 0;
        }
        long jE = f().E();
        long jE2 = interfaceC1049e.f().E();
        if (jE >= jE2) {
            return jE == jE2 && this.f17749b.c0() < interfaceC1049e.b().c0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f17748a.equals(localDateTime.f17748a) && this.f17749b.equals(localDateTime.f17749b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17748a.hashCode() ^ this.f17749b.hashCode();
    }

    public final String toString() {
        return this.f17748a.toString() + "T" + this.f17749b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
