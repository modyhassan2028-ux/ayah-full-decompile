package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1051g implements InterfaceC1049e, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC1046b f17797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient LocalTime f17798b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int compareTo(InterfaceC1049e interfaceC1049e) {
        return j$.com.android.tools.r8.a.h(this, interfaceC1049e);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object v(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.s(this, fVar);
    }

    public static C1051g Q(l lVar, Temporal temporal) {
        C1051g c1051g = (C1051g) temporal;
        if (lVar.equals(c1051g.f17797a.a())) {
            return c1051g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.j() + ", actual: " + c1051g.f17797a.a().j());
    }

    public C1051g(InterfaceC1046b interfaceC1046b, LocalTime localTime) {
        Objects.requireNonNull(interfaceC1046b, "date");
        Objects.requireNonNull(localTime, "time");
        this.f17797a = interfaceC1046b;
        this.f17798b = localTime;
    }

    public final C1051g U(Temporal temporal, LocalTime localTime) {
        InterfaceC1046b interfaceC1046b = this.f17797a;
        return (interfaceC1046b == temporal && this.f17798b == localTime) ? this : new C1051g(AbstractC1048d.Q(interfaceC1046b.a(), temporal), localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return Q(this.f17797a.a(), j$.time.temporal.n.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.InterfaceC1049e
    public final l a() {
        return this.f17797a.a();
    }

    @Override // j$.time.chrono.InterfaceC1049e
    public final InterfaceC1046b f() {
        return this.f17797a;
    }

    public final int hashCode() {
        return this.f17797a.hashCode() ^ this.f17798b.hashCode();
    }

    public final String toString() {
        return this.f17797a.toString() + "T" + this.f17798b.toString();
    }

    @Override // j$.time.chrono.InterfaceC1049e
    public final LocalTime b() {
        return this.f17798b;
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
            if (!((ChronoField) temporalField).R()) {
                return this.f17797a.l(temporalField);
            }
            LocalTime localTime = this.f17798b;
            localTime.getClass();
            return j$.time.temporal.n.d(localTime, temporalField);
        }
        return temporalField.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.f17798b.get(temporalField) : this.f17797a.get(temporalField);
        }
        return l(temporalField).a(D(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.f17798b.D(temporalField) : this.f17797a.D(temporalField);
        }
        return temporalField.A(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        if (j$.time.c.b(localDate)) {
            return U(localDate, this.f17798b);
        }
        l lVarA = this.f17797a.a();
        localDate.getClass();
        return Q(lVarA, (C1051g) j$.com.android.tools.r8.a.a(localDate, this));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C1051g c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).R()) {
                return U(this.f17797a, this.f17798b.c(j, temporalField));
            }
            return U(this.f17797a.c(j, temporalField), this.f17798b);
        }
        return Q(this.f17797a.a(), temporalField.D(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final C1051g d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return Q(this.f17797a.a(), temporalUnit.k(this, j));
        }
        switch (AbstractC1050f.f17796a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return S(this.f17797a, 0L, 0L, 0L, j);
            case 2:
                C1051g c1051gU = U(this.f17797a.d(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.f17798b);
                return c1051gU.S(c1051gU.f17797a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C1051g c1051gU2 = U(this.f17797a.d(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.f17798b);
                return c1051gU2.S(c1051gU2.f17797a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return S(this.f17797a, 0L, 0L, j, 0L);
            case 5:
                return S(this.f17797a, 0L, j, 0L, 0L);
            case 6:
                return S(this.f17797a, j, 0L, 0L, 0L);
            case 7:
                C1051g c1051gU3 = U(this.f17797a.d(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.f17798b);
                return c1051gU3.S(c1051gU3.f17797a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return U(this.f17797a.d(j, temporalUnit), this.f17798b);
        }
    }

    public final C1051g S(InterfaceC1046b interfaceC1046b, long j, long j10, long j11, long j12) {
        if ((j | j10 | j11 | j12) == 0) {
            return U(interfaceC1046b, this.f17798b);
        }
        long j13 = j / 24;
        long j14 = ((j % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jC0 = this.f17798b.c0();
        long j15 = j14 + jC0;
        long jG = j$.com.android.tools.r8.a.G(j15, 86400000000000L) + j13 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long jF = j$.com.android.tools.r8.a.F(j15, 86400000000000L);
        return U(interfaceC1046b.d(jG, (TemporalUnit) ChronoUnit.DAYS), jF == jC0 ? this.f17798b : LocalTime.V(jF));
    }

    @Override // j$.time.chrono.InterfaceC1049e
    public final ChronoZonedDateTime B(ZoneId zoneId) {
        return k.Q(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC1049e interfaceC1049eG = this.f17797a.a().G(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, interfaceC1049eG);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            InterfaceC1046b interfaceC1046bF = interfaceC1049eG.f();
            if (interfaceC1049eG.b().compareTo(this.f17798b) < 0) {
                interfaceC1046bF = interfaceC1046bF.t(1L, chronoUnit2);
            }
            return this.f17797a.until(interfaceC1046bF, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jD = interfaceC1049eG.D(chronoField) - this.f17797a.D(chronoField);
        switch (AbstractC1050f.f17796a[chronoUnit.ordinal()]) {
            case 1:
                jD = j$.com.android.tools.r8.a.H(jD, 86400000000000L);
                break;
            case 2:
                jD = j$.com.android.tools.r8.a.H(jD, 86400000000L);
                break;
            case 3:
                jD = j$.com.android.tools.r8.a.H(jD, 86400000L);
                break;
            case 4:
                jD = j$.com.android.tools.r8.a.H(jD, 86400);
                break;
            case 5:
                jD = j$.com.android.tools.r8.a.H(jD, 1440);
                break;
            case 6:
                jD = j$.com.android.tools.r8.a.H(jD, 24);
                break;
            case 7:
                jD = j$.com.android.tools.r8.a.H(jD, 2);
                break;
        }
        return j$.com.android.tools.r8.a.B(jD, this.f17798b.until(interfaceC1049eG.b(), temporalUnit));
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(f().E(), ChronoField.EPOCH_DAY).c(b().c0(), ChronoField.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1049e) && j$.com.android.tools.r8.a.h(this, (InterfaceC1049e) obj) == 0;
    }
}
