package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractC1048d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDate f17817d = LocalDate.c0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f17818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient w f17819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17820c;

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1049e F(LocalTime localTime) {
        return new C1051g(this, localTime);
    }

    public v(LocalDate localDate) {
        if (localDate.X(f17817d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        w wVarI = w.i(localDate);
        this.f17819b = wVarI;
        this.f17820c = (localDate.f17743a - wVarI.f17824b.f17743a) + 1;
        this.f17818a = localDate;
    }

    public v(w wVar, int i10, LocalDate localDate) {
        if (localDate.X(f17817d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        this.f17819b = wVar;
        this.f17820c = i10;
        this.f17818a = localDate;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final l a() {
        return t.f17815c;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final int hashCode() {
        t.f17815c.getClass();
        return this.f17818a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final m H() {
        return this.f17819b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final int N() {
        int iN;
        w wVarJ = this.f17819b.j();
        if (wVarJ != null) {
            LocalDate localDate = wVarJ.f17824b;
            if (localDate.f17743a == this.f17818a.f17743a) {
                iN = localDate.V() - 1;
            } else {
                iN = this.f17818a.N();
            }
        } else {
            iN = this.f17818a.N();
        }
        return this.f17820c == 1 ? iN - (this.f17819b.f17824b.V() - 1) : iN;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b, j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.l(this);
        }
        if (!e(temporalField)) {
            throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i10 = u.f17816a[chronoField.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.p.f(1L, this.f17818a.Y());
        }
        if (i10 == 2) {
            return j$.time.temporal.p.f(1L, N());
        }
        if (i10 != 3) {
            return t.f17815c.s(chronoField);
        }
        w wVar = this.f17819b;
        int i11 = wVar.f17824b.f17743a;
        w wVarJ = wVar.j();
        return wVarJ != null ? j$.time.temporal.p.f(1L, (wVarJ.f17824b.f17743a - i11) + 1) : j$.time.temporal.p.f(1L, 999999999 - i11);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        switch (u.f17816a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.f17820c == 1 ? (this.f17818a.V() - this.f17819b.f17824b.V()) + 1 : this.f17818a.V();
            case 3:
                return this.f17820c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
            case 8:
                return this.f17819b.f17823a;
            default:
                return this.f17818a.D(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final v c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (D(chronoField) == j) {
                return this;
            }
            int[] iArr = u.f17816a;
            int i10 = iArr[chronoField.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                t tVar = t.f17815c;
                int iA = tVar.s(chronoField).a(j, chronoField);
                int i11 = iArr[chronoField.ordinal()];
                if (i11 == 3) {
                    return Y(this.f17818a.m0(tVar.x(this.f17819b, iA)));
                }
                if (i11 == 8) {
                    return Y(this.f17818a.m0(tVar.x(w.m(iA), this.f17820c)));
                }
                if (i11 == 9) {
                    return Y(this.f17818a.m0(iA));
                }
            }
            return Y(this.f17818a.c(j, temporalField));
        }
        return (v) super.c(j, temporalField);
    }

    public final v X(j$.time.f fVar) {
        return (v) super.z(fVar);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        return (v) super.z(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b z(j$.time.temporal.k kVar) {
        return (v) super.z(kVar);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b K(j$.time.temporal.m mVar) {
        return (v) super.K(mVar);
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b U(long j) {
        return Y(this.f17818a.i0(j));
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b T(long j) {
        return Y(this.f17818a.g0(j));
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b S(long j) {
        return Y(this.f17818a.plusDays(j));
    }

    public final v V(long j, ChronoUnit chronoUnit) {
        return (v) super.d(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b, j$.time.temporal.Temporal
    public final InterfaceC1046b d(long j, TemporalUnit temporalUnit) {
        return (v) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (v) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return (v) super.t(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b t(long j, TemporalUnit temporalUnit) {
        return (v) super.t(j, temporalUnit);
    }

    public final v Y(LocalDate localDate) {
        return localDate.equals(this.f17818a) ? this : new v(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final long E() {
        return this.f17818a.E();
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f17818a.equals(((v) obj).f17818a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 4, this);
    }
}
