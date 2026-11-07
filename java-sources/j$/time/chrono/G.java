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
public final class G extends AbstractC1048d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f17780a;

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1049e F(LocalTime localTime) {
        return new C1051g(this, localTime);
    }

    public G(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f17780a = localDate;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final l a() {
        return E.f17778c;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final int hashCode() {
        E.f17778c.getClass();
        return this.f17780a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final m H() {
        return V() >= 1 ? H.BE : H.BEFORE_BE;
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
        int i10 = F.f17779a[chronoField.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f17780a.l(temporalField);
        }
        if (i10 != 4) {
            return E.f17778c.s(chronoField);
        }
        j$.time.temporal.p pVar = ChronoField.YEAR.f17960b;
        return j$.time.temporal.p.f(1L, V() <= 0 ? (-(pVar.f17985a + 543)) + 1 : 543 + pVar.f17988d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = F.f17779a[((ChronoField) temporalField).ordinal()];
            if (i10 == 4) {
                int iV = V();
                if (iV < 1) {
                    iV = 1 - iV;
                }
                return iV;
            }
            if (i10 == 5) {
                return ((((long) V()) * 12) + ((long) this.f17780a.f17744b)) - 1;
            }
            if (i10 == 6) {
                return V();
            }
            if (i10 != 7) {
                return this.f17780a.D(temporalField);
            }
            return V() < 1 ? 0 : 1;
        }
        return temporalField.A(this);
    }

    public final int V() {
        return this.f17780a.f17743a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final G c(long j, TemporalField temporalField) {
        int iA;
        int i10;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (D(chronoField) == j) {
                return this;
            }
            int[] iArr = F.f17779a;
            int i11 = iArr[chronoField.ordinal()];
            if (i11 == 4) {
                iA = E.f17778c.s(chronoField).a(j, chronoField);
                i10 = iArr[chronoField.ordinal()];
                if (i10 != 4) {
                    LocalDate localDate = this.f17780a;
                    if (V() < 1) {
                        iA = 1 - iA;
                    }
                    return X(localDate.m0(iA - 543));
                }
                if (i10 != 6) {
                    return X(this.f17780a.m0(iA - 543));
                }
                if (i10 == 7) {
                    return X(this.f17780a.m0((-542) - V()));
                }
            } else {
                if (i11 == 5) {
                    E.f17778c.s(chronoField).b(j, chronoField);
                    long jV = ((long) V()) * 12;
                    LocalDate localDate2 = this.f17780a;
                    return X(localDate2.g0(j - ((jV + ((long) localDate2.f17744b)) - 1)));
                }
                if (i11 == 6 || i11 == 7) {
                    iA = E.f17778c.s(chronoField).a(j, chronoField);
                    i10 = iArr[chronoField.ordinal()];
                    if (i10 != 4) {
                        LocalDate localDate3 = this.f17780a;
                        if (V() < 1) {
                            iA = 1 - iA;
                        }
                        return X(localDate3.m0(iA - 543));
                    }
                    if (i10 != 6) {
                        return X(this.f17780a.m0(iA - 543));
                    }
                    if (i10 == 7) {
                        return X(this.f17780a.m0((-542) - V()));
                    }
                }
            }
            return X(this.f17780a.c(j, temporalField));
        }
        return (G) super.c(j, temporalField);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        return (G) super.z(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b z(j$.time.temporal.k kVar) {
        return (G) super.z(kVar);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b K(j$.time.temporal.m mVar) {
        return (G) super.K(mVar);
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b U(long j) {
        return X(this.f17780a.i0(j));
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b T(long j) {
        return X(this.f17780a.g0(j));
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b S(long j) {
        return X(this.f17780a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b, j$.time.temporal.Temporal
    public final InterfaceC1046b d(long j, TemporalUnit temporalUnit) {
        return (G) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (G) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return (G) super.t(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b t(long j, TemporalUnit temporalUnit) {
        return (G) super.t(j, temporalUnit);
    }

    public final G X(LocalDate localDate) {
        return localDate.equals(this.f17780a) ? this : new G(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final long E() {
        return this.f17780a.E();
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return this.f17780a.equals(((G) obj).f17780a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 8, this);
    }
}
