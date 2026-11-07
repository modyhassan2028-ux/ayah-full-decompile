package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC1048d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f17773a;

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1049e F(LocalTime localTime) {
        return new C1051g(this, localTime);
    }

    public A(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f17773a = localDate;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final l a() {
        return y.f17827c;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final int hashCode() {
        y.f17827c.getClass();
        return this.f17773a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final m H() {
        return V() >= 1 ? B.ROC : B.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.l(this);
        }
        if (!j$.com.android.tools.r8.a.o(this, temporalField)) {
            throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i10 = z.f17828a[chronoField.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f17773a.l(temporalField);
        }
        if (i10 != 4) {
            return y.f17827c.s(chronoField);
        }
        j$.time.temporal.p pVar = ChronoField.YEAR.f17960b;
        return j$.time.temporal.p.f(1L, V() <= 0 ? (-pVar.f17985a) + 1912 : pVar.f17988d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = z.f17828a[((ChronoField) temporalField).ordinal()];
            if (i10 == 4) {
                int iV = V();
                if (iV < 1) {
                    iV = 1 - iV;
                }
                return iV;
            }
            if (i10 == 5) {
                return ((((long) V()) * 12) + ((long) this.f17773a.f17744b)) - 1;
            }
            if (i10 == 6) {
                return V();
            }
            if (i10 != 7) {
                return this.f17773a.D(temporalField);
            }
            return V() < 1 ? 0 : 1;
        }
        return temporalField.A(this);
    }

    public final int V() {
        return this.f17773a.f17743a - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final A c(long j, TemporalField temporalField) {
        int iA;
        int i10;
        int i11;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (D(chronoField) == j) {
                return this;
            }
            int[] iArr = z.f17828a;
            int i12 = iArr[chronoField.ordinal()];
            if (i12 == 4) {
                iA = y.f17827c.s(chronoField).a(j, chronoField);
                i10 = iArr[chronoField.ordinal()];
                if (i10 != 4) {
                    LocalDate localDate = this.f17773a;
                    if (V() >= 1) {
                        i11 = iA + 1911;
                    } else {
                        i11 = 1912 - iA;
                    }
                    return X(localDate.m0(i11));
                }
                if (i10 != 6) {
                    return X(this.f17773a.m0(iA + 1911));
                }
                if (i10 == 7) {
                    return X(this.f17773a.m0(1912 - V()));
                }
            } else {
                if (i12 == 5) {
                    y.f17827c.s(chronoField).b(j, chronoField);
                    long jV = ((long) V()) * 12;
                    LocalDate localDate2 = this.f17773a;
                    return X(localDate2.g0(j - ((jV + ((long) localDate2.f17744b)) - 1)));
                }
                if (i12 == 6 || i12 == 7) {
                    iA = y.f17827c.s(chronoField).a(j, chronoField);
                    i10 = iArr[chronoField.ordinal()];
                    if (i10 != 4) {
                        LocalDate localDate3 = this.f17773a;
                        if (V() >= 1) {
                            i11 = iA + 1911;
                        } else {
                            i11 = 1912 - iA;
                        }
                        return X(localDate3.m0(i11));
                    }
                    if (i10 != 6) {
                        return X(this.f17773a.m0(iA + 1911));
                    }
                    if (i10 == 7) {
                        return X(this.f17773a.m0(1912 - V()));
                    }
                }
            }
            return X(this.f17773a.c(j, temporalField));
        }
        return (A) super.c(j, temporalField);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        return (A) super.z(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b z(j$.time.temporal.k kVar) {
        return (A) super.z(kVar);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b K(j$.time.temporal.m mVar) {
        return (A) super.K(mVar);
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b U(long j) {
        return X(this.f17773a.i0(j));
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b T(long j) {
        return X(this.f17773a.g0(j));
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b S(long j) {
        return X(this.f17773a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b, j$.time.temporal.Temporal
    public final InterfaceC1046b d(long j, TemporalUnit temporalUnit) {
        return (A) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (A) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return (A) super.t(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b t(long j, TemporalUnit temporalUnit) {
        return (A) super.t(j, temporalUnit);
    }

    public final A X(LocalDate localDate) {
        return localDate.equals(this.f17773a) ? this : new A(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final long E() {
        return this.f17773a.E();
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f17773a.equals(((A) obj).f17773a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 7, this);
    }
}
