package j$.time;

import io.realm.RealmFieldTypeConstants;
import j$.time.chrono.InterfaceC1046b;
import j$.time.chrono.InterfaceC1049e;
import j$.time.format.DateTimeFormatter;
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

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.k, InterfaceC1046b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDate f17741d = c0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LocalDate f17742e = c0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f17744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f17745c;

    static {
        c0(1970, 1, 1);
    }

    public static LocalDate now() {
        return b0(j$.com.android.tools.r8.a.L());
    }

    public static LocalDate b0(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.f17772a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return d0(j$.com.android.tools.r8.a.G(instantOfEpochMilli.f17739a + ((long) zoneId.R().d(instantOfEpochMilli).f17766b), 86400));
    }

    public static LocalDate c0(int i10, int i11, int i12) {
        ChronoField.YEAR.Q(i10);
        ChronoField.MONTH_OF_YEAR.Q(i11);
        ChronoField.DAY_OF_MONTH.Q(i12);
        return R(i10, i11, i12);
    }

    public static LocalDate e0(int i10, int i11) {
        long j = i10;
        ChronoField.YEAR.Q(j);
        ChronoField.DAY_OF_YEAR.Q(i11);
        boolean zP = j$.time.chrono.q.f17812c.P(j);
        if (i11 == 366 && !zP) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        Month monthT = Month.T(((i11 - 1) / 31) + 1);
        if (i11 > (monthT.R(zP) + monthT.Q(zP)) - 1) {
            monthT = Month.f17757a[((((int) 1) + 12) + monthT.ordinal()) % 12];
        }
        return new LocalDate(i10, monthT.getValue(), (i11 - monthT.Q(zP)) + 1);
    }

    public static LocalDate d0(long j) {
        long j10;
        ChronoField.EPOCH_DAY.Q(j);
        long j11 = 719468 + j;
        if (j11 < 0) {
            long j12 = ((j + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i10 = (int) j14;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j15 = j13 + j10 + ((long) (i11 / 10));
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.f17960b.a(j15, chronoField), i12, i13);
    }

    public static LocalDate S(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.v(j$.time.temporal.n.f17984f);
        if (localDate != null) {
            return localDate;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.b(charSequence, new f(0));
    }

    public static LocalDate R(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (j$.time.chrono.q.f17812c.P(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new b("Invalid date '" + Month.T(i11).name() + " " + i12 + "'");
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate j0(int i10, int i11, int i12) {
        if (i11 == 2) {
            i12 = Math.min(i12, j$.time.chrono.q.f17812c.P((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new LocalDate(i10, i11, i12);
    }

    public LocalDate(int i10, int i11, int i12) {
        this.f17743a = i10;
        this.f17744b = (short) i11;
        this.f17745c = (short) i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.l(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
        int i10 = g.f17931a[chronoField.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.p.f(1L, Y());
        }
        if (i10 == 2) {
            return j$.time.temporal.p.f(1L, N());
        }
        if (i10 == 3) {
            return j$.time.temporal.p.f(1L, (getMonth() != Month.FEBRUARY || r()) ? 5L : 4L);
        }
        if (i10 != 4) {
            return chronoField.f17960b;
        }
        return this.f17743a <= 0 ? j$.time.temporal.p.f(1L, 1000000000L) : j$.time.temporal.p.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return T((ChronoField) temporalField);
        }
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return E();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return W();
            }
            return T((ChronoField) temporalField);
        }
        return temporalField.A(this);
    }

    public final int T(ChronoField chronoField) {
        switch (g.f17931a[chronoField.ordinal()]) {
            case 1:
                return this.f17745c;
            case 2:
                return V();
            case 3:
                return ((this.f17745c - 1) / 7) + 1;
            case 4:
                int i10 = this.f17743a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return U().getValue();
            case 6:
                return ((this.f17745c - 1) % 7) + 1;
            case 7:
                return ((V() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.o("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((V() - 1) / 7) + 1;
            case 10:
                return this.f17744b;
            case 11:
                throw new j$.time.temporal.o("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f17743a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return this.f17743a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.o("Unsupported field: " + chronoField);
        }
    }

    public final long W() {
        return ((((long) this.f17743a) * 12) + ((long) this.f17744b)) - 1;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final j$.time.chrono.l a() {
        return j$.time.chrono.q.f17812c;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final j$.time.chrono.m H() {
        return this.f17743a >= 1 ? j$.time.chrono.r.CE : j$.time.chrono.r.BCE;
    }

    public Month getMonth() {
        return Month.T(this.f17744b);
    }

    public int getDayOfMonth() {
        return this.f17745c;
    }

    public final int V() {
        return (getMonth().Q(r()) + this.f17745c) - 1;
    }

    public final DayOfWeek U() {
        return DayOfWeek.Q(((int) j$.com.android.tools.r8.a.F(E() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final boolean r() {
        return j$.time.chrono.q.f17812c.P(this.f17743a);
    }

    public final int Y() {
        short s10 = this.f17744b;
        if (s10 != 2) {
            return (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31;
        }
        return r() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final int N() {
        return r() ? 366 : 365;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate z(j$.time.temporal.k kVar) {
        if (kVar instanceof LocalDate) {
            return (LocalDate) kVar;
        }
        return (LocalDate) kVar.p(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        switch (g.f17931a[chronoField.ordinal()]) {
            case 1:
                int i10 = (int) j;
                if (this.f17745c != i10) {
                    return c0(this.f17743a, this.f17744b, i10);
                }
                return this;
            case 2:
                int i11 = (int) j;
                if (V() != i11) {
                    return e0(this.f17743a, i11);
                }
                return this;
            case 3:
                return h0(j - D(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f17743a < 1) {
                    j = 1 - j;
                }
                return m0((int) j);
            case 5:
                return plusDays(j - ((long) U().getValue()));
            case 6:
                return plusDays(j - D(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - D(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return d0(j);
            case 9:
                return h0(j - D(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j;
                if (this.f17744b != i12) {
                    ChronoField.MONTH_OF_YEAR.Q(i12);
                    return j0(this.f17743a, i12, this.f17745c);
                }
                return this;
            case 11:
                return g0(j - W());
            case 12:
                return m0((int) j);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                if (D(ChronoField.ERA) != j) {
                    return m0(1 - this.f17743a);
                }
                return this;
            default:
                throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate m0(int i10) {
        if (this.f17743a == i10) {
            return this;
        }
        ChronoField.YEAR.Q(i10);
        return j0(i10, this.f17744b, this.f17745c);
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final InterfaceC1046b K(j$.time.temporal.m mVar) {
        if (c.b(mVar)) {
            p pVar = (p) mVar;
            return g0((((long) pVar.f17947a) * 12) + ((long) pVar.f17948b)).plusDays(pVar.f17949c);
        }
        Objects.requireNonNull(mVar, "amountToAdd");
        return (LocalDate) ((p) mVar).k(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.k(this, j);
        }
        switch (g.f17932b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return h0(j);
            case 3:
                return g0(j);
            case 4:
                return i0(j);
            case 5:
                return i0(j$.com.android.tools.r8.a.H(j, 10));
            case 6:
                return i0(j$.com.android.tools.r8.a.H(j, 100));
            case 7:
                return i0(j$.com.android.tools.r8.a.H(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.B(D(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final LocalDate i0(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return j0(chronoField.f17960b.a(((long) this.f17743a) + j, chronoField), this.f17744b, this.f17745c);
    }

    public final LocalDate g0(long j) {
        if (j == 0) {
            return this;
        }
        long j10 = (((long) this.f17743a) * 12) + ((long) (this.f17744b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j11 = 12;
        return j0(chronoField.f17960b.a(j$.com.android.tools.r8.a.G(j10, j11), chronoField), ((int) j$.com.android.tools.r8.a.F(j10, j11)) + 1, this.f17745c);
    }

    public final LocalDate h0(long j) {
        return plusDays(j$.com.android.tools.r8.a.H(j, 7));
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j10 = ((long) this.f17745c) + j;
        if (j10 > 0) {
            if (j10 <= 28) {
                return new LocalDate(this.f17743a, this.f17744b, (int) j10);
            }
            if (j10 <= 59) {
                long jY = Y();
                if (j10 <= jY) {
                    return new LocalDate(this.f17743a, this.f17744b, (int) j10);
                }
                short s10 = this.f17744b;
                if (s10 < 12) {
                    return new LocalDate(this.f17743a, s10 + 1, (int) (j10 - jY));
                }
                ChronoField.YEAR.Q(this.f17743a + 1);
                return new LocalDate(this.f17743a + 1, 1, (int) (j10 - jY));
            }
        }
        return d0(j$.com.android.tools.r8.a.B(E(), j));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate t(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        return fVar == j$.time.temporal.n.f17984f ? this : j$.com.android.tools.r8.a.r(this, fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateS = S(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateS);
        }
        switch (g.f17932b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateS.E() - E();
            case 2:
                return (localDateS.E() - E()) / 7;
            case 3:
                return a0(localDateS);
            case 4:
                return a0(localDateS) / 12;
            case 5:
                return a0(localDateS) / 120;
            case 6:
                return a0(localDateS) / 1200;
            case 7:
                return a0(localDateS) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateS.D(chronoField) - D(chronoField);
            default:
                throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
    }

    public final long a0(LocalDate localDate) {
        return (((localDate.W() * 32) + ((long) localDate.getDayOfMonth())) - ((W() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final InterfaceC1049e F(LocalTime localTime) {
        return LocalDateTime.T(this, localTime);
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final long E() {
        long j;
        long j10 = this.f17743a;
        long j11 = this.f17744b;
        long j12 = 365 * j10;
        if (j10 >= 0) {
            j = ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12;
        } else {
            j = j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))));
        }
        long j13 = (((367 * j11) - 362) / 12) + j + ((long) (this.f17745c - 1));
        if (j11 > 2) {
            j13 = !r() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1046b interfaceC1046b) {
        if (interfaceC1046b instanceof LocalDate) {
            return Q((LocalDate) interfaceC1046b);
        }
        return j$.com.android.tools.r8.a.g(this, interfaceC1046b);
    }

    public final int Q(LocalDate localDate) {
        int i10 = this.f17743a - localDate.f17743a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f17744b - localDate.f17744b;
        return i11 == 0 ? this.f17745c - localDate.f17745c : i11;
    }

    public final boolean X(InterfaceC1046b interfaceC1046b) {
        if (interfaceC1046b instanceof LocalDate) {
            return Q((LocalDate) interfaceC1046b) < 0;
        }
        return E() < interfaceC1046b.E();
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && Q((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public int hashCode() {
        int i10 = this.f17743a;
        return (((i10 << 11) + (this.f17744b << 6)) + this.f17745c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC1046b
    public final String toString() {
        int i10 = this.f17743a;
        short s10 = this.f17744b;
        short s11 = this.f17745c;
        int iAbs = Math.abs(i10);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb.append('+');
            }
            sb.append(i10);
        } else if (i10 < 0) {
            sb.append(i10 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i10 + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        sb.append(s11 < 10 ? "-0" : "-");
        sb.append((int) s11);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
