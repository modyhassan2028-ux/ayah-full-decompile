package j$.time.chrono;

import io.realm.RealmFieldTypeConstants;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class HijrahDate extends AbstractC1048d implements Serializable {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient HijrahChronology f17789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f17790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17792d;

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1049e F(LocalTime localTime) {
        return new C1051g(this, localTime);
    }

    public static HijrahDate now() {
        return new HijrahDate(HijrahChronology.INSTANCE, LocalDate.b0(j$.com.android.tools.r8.a.L()).E());
    }

    public HijrahDate(HijrahChronology hijrahChronology, int i10, int i11, int i12) {
        hijrahChronology.U(i10, i11, i12);
        this.f17789a = hijrahChronology;
        this.f17790b = i10;
        this.f17791c = i11;
        this.f17792d = i12;
    }

    public HijrahDate(HijrahChronology hijrahChronology, long j) {
        int i10 = (int) j;
        hijrahChronology.R();
        if (i10 < hijrahChronology.f17784e || i10 >= hijrahChronology.f17785f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(hijrahChronology.f17783d, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {hijrahChronology.T(iBinarySearch), ((hijrahChronology.g + iBinarySearch) % 12) + 1, (i10 - hijrahChronology.f17783d[iBinarySearch]) + 1};
        this.f17789a = hijrahChronology;
        this.f17790b = iArr[0];
        this.f17791c = iArr[1];
        this.f17792d = iArr[2];
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final l a() {
        return this.f17789a;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final m H() {
        return p.AH;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final int N() {
        return this.f17789a.X(this.f17790b, 12);
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
        int i10 = o.f17810a[chronoField.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.p.f(1L, this.f17789a.V(this.f17790b, this.f17791c));
        }
        if (i10 != 2) {
            return i10 != 3 ? this.f17789a.s(chronoField) : j$.time.temporal.p.f(1L, 5L);
        }
        return j$.time.temporal.p.f(1L, N());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.A(this);
        }
        switch (o.f17810a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f17792d;
            case 2:
                return V();
            case 3:
                return ((this.f17792d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.F(E() + 3, 7)) + 1;
            case 5:
                return ((this.f17792d - 1) % 7) + 1;
            case 6:
                return ((V() - 1) % 7) + 1;
            case 7:
                return E();
            case 8:
                return ((V() - 1) / 7) + 1;
            case 9:
                return this.f17791c;
            case 10:
                return ((((long) this.f17790b) * 12) + ((long) this.f17791c)) - 1;
            case 11:
                return this.f17790b;
            case 12:
                return this.f17790b;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return this.f17790b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final HijrahDate c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (HijrahDate) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.f17789a.s(chronoField).b(j, chronoField);
        int i10 = (int) j;
        switch (o.f17810a[chronoField.ordinal()]) {
            case 1:
                return Y(this.f17790b, this.f17791c, i10);
            case 2:
                return S(Math.min(i10, N()) - V());
            case 3:
                return S((j - D(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return S(j - ((long) (((int) j$.com.android.tools.r8.a.F(E() + 3, 7)) + 1)));
            case 5:
                return S(j - D(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return S(j - D(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new HijrahDate(this.f17789a, j);
            case 8:
                return S((j - D(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Y(this.f17790b, i10, this.f17792d);
            case 10:
                return T(j - (((((long) this.f17790b) * 12) + ((long) this.f17791c)) - 1));
            case 11:
                if (this.f17790b < 1) {
                    i10 = 1 - i10;
                }
                return Y(i10, this.f17791c, this.f17792d);
            case 12:
                return Y(i10, this.f17791c, this.f17792d);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return Y(1 - this.f17790b, this.f17791c, this.f17792d);
            default:
                throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
        }
    }

    public final HijrahDate Y(int i10, int i11, int i12) {
        int iV = this.f17789a.V(i10, i11);
        if (i12 > iV) {
            i12 = iV;
        }
        return new HijrahDate(this.f17789a, i10, i11, i12);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        return (HijrahDate) super.z(localDate);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b z(j$.time.temporal.k kVar) {
        return (HijrahDate) super.z(kVar);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b K(j$.time.temporal.m mVar) {
        return (HijrahDate) super.K(mVar);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final long E() {
        return this.f17789a.U(this.f17790b, this.f17791c, this.f17792d);
    }

    public final int V() {
        return this.f17789a.X(this.f17790b, this.f17791c - 1) + this.f17792d;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final boolean r() {
        return this.f17789a.P(this.f17790b);
    }

    @Override // j$.time.chrono.AbstractC1048d
    public final InterfaceC1046b U(long j) {
        if (j == 0) {
            return this;
        }
        long j10 = ((long) this.f17790b) + ((long) ((int) j));
        int i10 = (int) j10;
        if (j10 == i10) {
            return Y(i10, this.f17791c, this.f17792d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC1048d
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final HijrahDate T(long j) {
        if (j == 0) {
            return this;
        }
        long j10 = (((long) this.f17790b) * 12) + ((long) (this.f17791c - 1)) + j;
        HijrahChronology hijrahChronology = this.f17789a;
        long jG = j$.com.android.tools.r8.a.G(j10, 12L);
        if (jG >= hijrahChronology.T(0) && jG <= hijrahChronology.T(hijrahChronology.f17783d.length - 1) - 1) {
            return Y((int) jG, ((int) j$.com.android.tools.r8.a.F(j10, 12L)) + 1, this.f17792d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jG);
    }

    @Override // j$.time.chrono.AbstractC1048d
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final HijrahDate S(long j) {
        return new HijrahDate(this.f17789a, E() + j);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b, j$.time.temporal.Temporal
    public final InterfaceC1046b d(long j, TemporalUnit temporalUnit) {
        return (HijrahDate) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (HijrahDate) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return (HijrahDate) super.t(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b t(long j, TemporalUnit temporalUnit) {
        return (HijrahDate) super.t(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HijrahDate) {
            HijrahDate hijrahDate = (HijrahDate) obj;
            if (this.f17790b == hijrahDate.f17790b && this.f17791c == hijrahDate.f17791c && this.f17792d == hijrahDate.f17792d && this.f17789a.equals(hijrahDate.f17789a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC1048d, j$.time.chrono.InterfaceC1046b
    public int hashCode() {
        int i10 = this.f17790b;
        int i11 = this.f17791c;
        int i12 = this.f17792d;
        this.f17789a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 6, this);
    }
}
