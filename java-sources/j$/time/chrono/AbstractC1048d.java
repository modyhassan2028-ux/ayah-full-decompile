package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1048d implements InterfaceC1046b, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ int compareTo(InterfaceC1046b interfaceC1046b) {
        return j$.com.android.tools.r8.a.g(this, interfaceC1046b);
    }

    public abstract InterfaceC1046b S(long j);

    public abstract InterfaceC1046b T(long j);

    public abstract InterfaceC1046b U(long j);

    @Override // j$.time.chrono.InterfaceC1046b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.p l(TemporalField temporalField) {
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Temporal p(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object v(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.r(this, fVar);
    }

    public static InterfaceC1046b Q(l lVar, Temporal temporal) {
        InterfaceC1046b interfaceC1046b = (InterfaceC1046b) temporal;
        if (lVar.equals(interfaceC1046b.a())) {
            return interfaceC1046b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + lVar.j() + ", actual: " + interfaceC1046b.a().j());
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public InterfaceC1049e F(LocalTime localTime) {
        return new C1051g(this, localTime);
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC1046b d(long j, TemporalUnit temporalUnit) {
        boolean z10 = temporalUnit instanceof ChronoUnit;
        if (!z10) {
            if (!z10) {
                return Q(a(), temporalUnit.k(this, j));
            }
            throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC1047c.f17795a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return S(j);
            case 2:
                return S(j$.com.android.tools.r8.a.H(j, 7));
            case 3:
                return T(j);
            case 4:
                return U(j);
            case 5:
                return U(j$.com.android.tools.r8.a.H(j, 10));
            case 6:
                return U(j$.com.android.tools.r8.a.H(j, 100));
            case 7:
                return U(j$.com.android.tools.r8.a.H(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.B(D(chronoField), j), (TemporalField) chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public m H() {
        return a().w(get(ChronoField.ERA));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public boolean r() {
        return a().P(D(ChronoField.YEAR));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public int N() {
        return r() ? 366 : 365;
    }

    @Override // j$.time.chrono.InterfaceC1046b, j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC1046b interfaceC1046bC = a().C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, interfaceC1046bC);
        }
        switch (AbstractC1047c.f17795a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC1046bC.E() - E();
            case 2:
                return (interfaceC1046bC.E() - E()) / 7;
            case 3:
                return R(interfaceC1046bC);
            case 4:
                return R(interfaceC1046bC) / 12;
            case 5:
                return R(interfaceC1046bC) / 120;
            case 6:
                return R(interfaceC1046bC) / 1200;
            case 7:
                return R(interfaceC1046bC) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return interfaceC1046bC.D(chronoField) - D(chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long R(InterfaceC1046b interfaceC1046b) {
        if (a().s(ChronoField.MONTH_OF_YEAR).f17988d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long jD = D(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((interfaceC1046b.D(chronoField) * 32) + ((long) interfaceC1046b.get(chronoField2))) - (jD + ((long) j$.time.temporal.n.a(this, chronoField2)))) / 32;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1046b) && j$.com.android.tools.r8.a.g(this, (InterfaceC1046b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public int hashCode() {
        long jE = E();
        return ((int) (jE ^ (jE >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC1046b z(j$.time.temporal.k kVar) {
        return Q(a(), kVar.p(this));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final String toString() {
        long jD = D(ChronoField.YEAR_OF_ERA);
        long jD2 = D(ChronoField.MONTH_OF_YEAR);
        long jD3 = D(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(jD);
        sb.append(jD2 < 10 ? "-0" : "-");
        sb.append(jD2);
        sb.append(jD3 < 10 ? "-0" : "-");
        sb.append(jD3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC1046b c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return Q(a(), temporalField.D(this, j));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public InterfaceC1046b K(j$.time.temporal.m mVar) {
        return Q(a(), mVar.k(this));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC1046b t(long j, TemporalUnit temporalUnit) {
        return Q(a(), j$.time.temporal.n.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public long E() {
        return D(ChronoField.EPOCH_DAY);
    }
}
