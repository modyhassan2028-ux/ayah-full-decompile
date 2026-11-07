package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1046b;
import j$.time.chrono.InterfaceC1049e;
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
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f17768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f17769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneId f17770c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isAfter(ChronoZonedDateTime chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.n(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.w(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.i(this, chronoZonedDateTime);
    }

    public static ZonedDateTime now() {
        a aVarL = j$.com.android.tools.r8.a.L();
        Objects.requireNonNull(aVarL, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVarL.f17772a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return p(instantOfEpochMilli.f17739a, instantOfEpochMilli.f17740b, zoneId);
    }

    public static ZonedDateTime of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return R(LocalDateTime.T(localDate, localTime), zoneId, null);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.l a() {
        return ((LocalDate) f()).a();
    }

    public static ZonedDateTime R(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarR = zoneId.R();
        List listF = fVarR.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), "offset");
            }
        } else {
            Object objE = fVarR.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.W(d.l(bVar.f18017d.f17766b - bVar.f18016c.f17766b, 0).f17830a);
            zoneOffset = bVar.f18017d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime p(long j, int i10, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.R().d(Instant.S(j, i10));
        return new ZonedDateTime(LocalDateTime.U(j, i10, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime Q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdQ = ZoneId.Q(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (temporalAccessor.e(chronoField)) {
                return p(temporalAccessor.D(chronoField), temporalAccessor.get(ChronoField.NANO_OF_SECOND), zoneIdQ);
            }
            return of(LocalDate.S(temporalAccessor), LocalTime.S(temporalAccessor), zoneIdQ);
        } catch (b e10) {
            throw new b("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f17768a = localDateTime;
        this.f17769b = zoneOffset;
        this.f17770c = zoneId;
    }

    public final ZonedDateTime T(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f17769b) || !this.f17770c.R().f(this.f17768a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f17768a, this.f17770c, zoneOffset);
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
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).f17960b;
            }
            return this.f17768a.l(temporalField);
        }
        return temporalField.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = w.f18010a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f17769b.f17766b;
            }
            return this.f17768a.get(temporalField);
        }
        return j$.com.android.tools.r8.a.k(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        int i10 = w.f18010a[((ChronoField) temporalField).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f17768a.D(temporalField) : this.f17769b.f17766b;
        }
        return j$.com.android.tools.r8.a.w(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.f17769b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.f17770c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f17770c.equals(zoneId) ? this : R(this.f17768a, zoneId, this.f17769b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime h(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f17770c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f17768a;
        ZoneOffset zoneOffset = this.f17769b;
        localDateTime.getClass();
        return p(j$.com.android.tools.r8.a.v(localDateTime, zoneOffset), this.f17768a.f17749b.f17756d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1049e q() {
        return this.f17768a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1046b f() {
        return this.f17768a.f();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f17768a.f17748a.U();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return this.f17768a.f17749b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        if (c.b(localDate)) {
            return R(LocalDateTime.T(localDate, this.f17768a.f17749b), this.f17770c, this.f17769b);
        }
        return (ZonedDateTime) localDate.p(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i10 = w.f18010a[chronoField.ordinal()];
            if (i10 == 1) {
                return p(j, this.f17768a.f17749b.f17756d, this.f17770c);
            }
            if (i10 != 2) {
                return R(this.f17768a.c(j, temporalField), this.f17770c, this.f17769b);
            }
            return T(ZoneOffset.Z(chronoField.f17960b.a(j, chronoField)));
        }
        return (ZonedDateTime) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.k(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return R(this.f17768a.d(j, temporalUnit), this.f17770c, this.f17769b);
        }
        LocalDateTime localDateTimeD = this.f17768a.d(j, temporalUnit);
        ZoneOffset zoneOffset = this.f17769b;
        ZoneId zoneId = this.f17770c;
        Objects.requireNonNull(localDateTimeD, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.R().f(localDateTimeD).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTimeD, zoneId, zoneOffset);
        }
        localDateTimeD.getClass();
        return p(j$.com.android.tools.r8.a.v(localDateTimeD, zoneOffset), localDateTimeD.f17749b.f17756d, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17984f) {
            return this.f17768a.f();
        }
        return j$.com.android.tools.r8.a.t(this, fVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeQ = Q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeH = zonedDateTimeQ.h(this.f17770c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.f17768a.until(zonedDateTimeH.f17768a, temporalUnit);
            }
            return new OffsetDateTime(this.f17768a, this.f17769b).until(new OffsetDateTime(zonedDateTimeH.f17768a, zonedDateTimeH.f17769b), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTimeQ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f17768a.equals(zonedDateTime.f17768a) && this.f17769b.equals(zonedDateTime.f17769b) && this.f17770c.equals(zonedDateTime.f17770c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17768a.hashCode() ^ this.f17769b.f17766b) ^ Integer.rotateLeft(this.f17770c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f17768a.toString() + this.f17769b.f17767c;
        ZoneOffset zoneOffset = this.f17769b;
        ZoneId zoneId = this.f17770c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
