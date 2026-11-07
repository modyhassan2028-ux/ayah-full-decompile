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
public final class o implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17943c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f17944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f17945b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        if (this.f17945b.equals(oVar.f17945b)) {
            return this.f17944a.compareTo(oVar.f17944a);
        }
        int iCompare = Long.compare(R(), oVar.R());
        return iCompare == 0 ? this.f17944a.compareTo(oVar.f17944a) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.f17750e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new o(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f17751f;
        ZoneOffset zoneOffset2 = ZoneOffset.f17765f;
        localTime2.getClass();
        new o(localTime2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        o oVar;
        if (temporal instanceof o) {
            oVar = (o) temporal;
        } else {
            try {
                oVar = new o(LocalTime.S(temporal), ZoneOffset.W(temporal));
            } catch (b e10) {
                throw new b("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jR = oVar.R() - R();
            switch (n.f17942a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jR;
                case 2:
                    return jR / 1000;
                case 3:
                    return jR / 1000000;
                case 4:
                    return jR / 1000000000;
                case 5:
                    return jR / 60000000000L;
                case 6:
                    return jR / 3600000000000L;
                case 7:
                    return jR / 43200000000000L;
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, oVar);
    }

    public o(LocalTime localTime, ZoneOffset zoneOffset) {
        this.f17944a = (LocalTime) Objects.requireNonNull(localTime, "time");
        this.f17945b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final o S(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f17944a == localTime && this.f17945b.equals(zoneOffset)) ? this : new o(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() || temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                LocalTime localTime = this.f17944a;
                localTime.getClass();
                return j$.time.temporal.n.d(localTime, temporalField);
            }
            return ((ChronoField) temporalField).f17960b;
        }
        return temporalField.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.f17945b.f17766b;
            }
            return this.f17944a.D(temporalField);
        }
        return temporalField.A(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        localDate.getClass();
        return (o) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                ChronoField chronoField = (ChronoField) temporalField;
                return S(this.f17944a, ZoneOffset.Z(chronoField.f17960b.a(j, chronoField)));
            }
            return S(this.f17944a.c(j, temporalField), this.f17945b);
        }
        return (o) temporalField.D(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final o d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return S(this.f17944a.d(j, temporalUnit), this.f17945b);
        }
        return (o) temporalUnit.k(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17982d || fVar == j$.time.temporal.n.f17983e) {
            return this.f17945b;
        }
        if (((fVar == j$.time.temporal.n.f17979a) || (fVar == j$.time.temporal.n.f17980b)) || fVar == j$.time.temporal.n.f17984f) {
            return null;
        }
        if (fVar == j$.time.temporal.n.g) {
            return this.f17944a;
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return ChronoUnit.NANOS;
        }
        return fVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(this.f17944a.c0(), ChronoField.NANO_OF_DAY).c(this.f17945b.f17766b, ChronoField.OFFSET_SECONDS);
    }

    public final long R() {
        return this.f17944a.c0() - (((long) this.f17945b.f17766b) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f17944a.equals(oVar.f17944a) && this.f17945b.equals(oVar.f17945b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17944a.hashCode() ^ this.f17945b.f17766b;
    }

    public final String toString() {
        return this.f17944a.toString() + this.f17945b.f17767c;
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
