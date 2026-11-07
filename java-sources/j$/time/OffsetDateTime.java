package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17759c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f17760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f17761b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f17761b.equals(offsetDateTime2.f17761b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f17760a;
            ZoneOffset zoneOffset = this.f17761b;
            localDateTime.getClass();
            long jV = j$.com.android.tools.r8.a.v(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.f17760a;
            ZoneOffset zoneOffset2 = offsetDateTime2.f17761b;
            localDateTime2.getClass();
            iCompare = Long.compare(jV, j$.com.android.tools.r8.a.v(localDateTime2, zoneOffset2));
            if (iCompare == 0) {
                iCompare = this.f17760a.f17749b.f17756d - offsetDateTime2.f17760a.f17749b.f17756d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f17746c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f17747d;
        ZoneOffset zoneOffset2 = ZoneOffset.f17765f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime Q(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.R().d(instant);
        return new OffsetDateTime(LocalDateTime.U(instant.f17739a, instant.f17740b, zoneOffsetD), zoneOffsetD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetW = ZoneOffset.W(temporal);
                LocalDate localDate = (LocalDate) temporal.v(j$.time.temporal.n.f17984f);
                LocalTime localTime = (LocalTime) temporal.v(j$.time.temporal.n.g);
                if (localDate != null && localTime != null) {
                    temporal = new OffsetDateTime(LocalDateTime.T(localDate, localTime), zoneOffsetW);
                } else {
                    temporal = Q(Instant.R(temporal), zoneOffsetW);
                }
            } catch (b e10) {
                throw new b("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.f17761b;
            if (!zoneOffset.equals(temporal.f17761b)) {
                offsetDateTime = temporal;
                offsetDateTime = new OffsetDateTime(temporal.f17760a.W(zoneOffset.f17766b - temporal.f17761b.f17766b), zoneOffset);
            }
            offsetDateTime = temporal;
            return this.f17760a.until(offsetDateTime.f17760a, temporalUnit);
        }
        return temporalUnit.between(this, temporal);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f17760a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f17761b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime S(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f17760a == localDateTime && this.f17761b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.f17760a.l(temporalField);
            }
            return ((ChronoField) temporalField).f17960b;
        }
        return temporalField.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = m.f17941a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f17761b.f17766b;
            }
            return this.f17760a.get(temporalField);
        }
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        int i10 = m.f17941a[((ChronoField) temporalField).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f17760a.D(temporalField) : this.f17761b.f17766b;
        }
        LocalDateTime localDateTime = this.f17760a;
        ZoneOffset zoneOffset = this.f17761b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.v(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f17760a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        if (c.b(localDate)) {
            return S(this.f17760a.z(localDate), this.f17761b);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = m.f17941a[chronoField.ordinal()];
            if (i10 == 1) {
                return Q(Instant.S(j, this.f17760a.f17749b.f17756d), this.f17761b);
            }
            if (i10 == 2) {
                return S(this.f17760a, ZoneOffset.Z(chronoField.f17960b.a(j, chronoField)));
            }
            return S(this.f17760a.c(j, temporalField), this.f17761b);
        }
        return (OffsetDateTime) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return S(this.f17760a.d(j, temporalUnit), this.f17761b);
        }
        return (OffsetDateTime) temporalUnit.k(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17982d || fVar == j$.time.temporal.n.f17983e) {
            return this.f17761b;
        }
        if (fVar == j$.time.temporal.n.f17979a) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f17984f) {
            return this.f17760a.f();
        }
        if (fVar == j$.time.temporal.n.g) {
            return this.f17760a.f17749b;
        }
        if (fVar == j$.time.temporal.n.f17980b) {
            return j$.time.chrono.q.f17812c;
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return ChronoUnit.NANOS;
        }
        return fVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(this.f17760a.f().E(), ChronoField.EPOCH_DAY).c(this.f17760a.f17749b.c0(), ChronoField.NANO_OF_DAY).c(this.f17761b.f17766b, ChronoField.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f17760a.equals(offsetDateTime.f17760a) && this.f17761b.equals(offsetDateTime.f17761b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17760a.hashCode() ^ this.f17761b.f17766b;
    }

    public final String toString() {
        return this.f17760a.toString() + this.f17761b.f17767c;
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
