package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient C1051g f17806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f17807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient ZoneId f17808c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.k(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isAfter(ChronoZonedDateTime chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.n(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object v(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.t(this, fVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.i(this, chronoZonedDateTime);
    }

    public static k Q(ZoneId zoneId, ZoneOffset zoneOffset, C1051g c1051g) {
        Objects.requireNonNull(c1051g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, c1051g);
        }
        j$.time.zone.f fVarR = zoneId.R();
        LocalDateTime localDateTimeR = LocalDateTime.R(c1051g);
        List listF = fVarR.f(localDateTimeR);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c1051g = c1051g;
        } else {
            Object objE = fVarR.e(localDateTimeR);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c1051g = c1051g.S(c1051g.f17797a, 0L, 0L, j$.time.d.l(bVar.f18017d.f17766b - bVar.f18016c.f17766b, 0).f17830a, 0L);
            zoneOffset = bVar.f18017d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, c1051g);
    }

    public static k R(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.R().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new k(zoneId, zoneOffsetD, (C1051g) lVar.G(LocalDateTime.U(instant.f17739a, instant.f17740b, zoneOffsetD)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return ((C1051g) q()).l(temporalField);
            }
            return ((ChronoField) temporalField).f17960b;
        }
        return temporalField.l(this);
    }

    public static k p(l lVar, Temporal temporal) {
        k kVar = (k) temporal;
        if (lVar.equals(kVar.a())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.j() + ", actual: " + kVar.a().j());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = i.f17804a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return toEpochSecond();
            }
            if (i10 != 2) {
                return ((C1051g) q()).D(temporalField);
            }
            return g().f17766b;
        }
        return temporalField.A(this);
    }

    public k(ZoneId zoneId, ZoneOffset zoneOffset, C1051g c1051g) {
        this.f17806a = (C1051g) Objects.requireNonNull(c1051g, "dateTime");
        this.f17807b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f17808c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.f17807b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1046b f() {
        return ((C1051g) q()).f();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return ((C1051g) q()).b();
    }

    public final int hashCode() {
        return (this.f17806a.hashCode() ^ this.f17807b.f17766b) ^ Integer.rotateLeft(this.f17808c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1049e q() {
        return this.f17806a;
    }

    public final String toString() {
        String str = this.f17806a.toString() + this.f17807b.f17767c;
        ZoneOffset zoneOffset = this.f17807b;
        ZoneId zoneId = this.f17808c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.f17808c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        return Q(zoneId, this.f17807b, this.f17806a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f17808c.equals(zoneId)) {
            return this;
        }
        C1051g c1051g = this.f17806a;
        ZoneOffset zoneOffset = this.f17807b;
        c1051g.getClass();
        return R(a(), Instant.S(j$.com.android.tools.r8.a.v(c1051g, zoneOffset), c1051g.f17798b.f17756d), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return p(a(), temporalField.D(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i10 = j.f17805a[chronoField.ordinal()];
        if (i10 == 1) {
            return d(j - j$.com.android.tools.r8.a.w(this), ChronoUnit.SECONDS);
        }
        if (i10 != 2) {
            return Q(this.f17808c, this.f17807b, this.f17806a.c(j, temporalField));
        }
        ZoneOffset zoneOffsetZ = ZoneOffset.Z(chronoField.f17960b.a(j, chronoField));
        C1051g c1051g = this.f17806a;
        c1051g.getClass();
        return R(a(), Instant.S(j$.com.android.tools.r8.a.v(c1051g, zoneOffsetZ), c1051g.f17798b.f17756d), this.f17808c);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final k d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return p(a(), this.f17806a.d(j, temporalUnit).p(this));
        }
        return p(a(), temporalUnit.k(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeN = a().n(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f17806a.until(chronoZonedDateTimeN.h(this.f17807b).q(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeN);
    }

    private Object writeReplace() {
        return new C((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.i(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        return p(a(), localDate.p(this));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return p(a(), j$.time.temporal.n.b(this, j, chronoUnit));
    }
}
