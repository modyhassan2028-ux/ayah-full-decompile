package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f17965b;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ TemporalAccessor p(Map map, D d5, E e10) {
        return null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f17965b.clone();
    }

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final p v() {
                return p.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.DAY_OF_YEAR) || !temporalAccessor.e(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.e(ChronoField.YEAR)) {
                    return false;
                }
                f fVar2 = h.f17968a;
                return j$.com.android.tools.r8.a.z(temporalAccessor).equals(j$.time.chrono.q.f17812c);
            }

            @Override // j$.time.temporal.TemporalField
            public final p l(TemporalAccessor temporalAccessor) {
                if (!k(temporalAccessor)) {
                    throw new o("Unsupported field: DayOfQuarter");
                }
                long jD = temporalAccessor.D(f.QUARTER_OF_YEAR);
                if (jD == 1) {
                    return j$.time.chrono.q.f17812c.P(temporalAccessor.D(ChronoField.YEAR)) ? p.f(1L, 91L) : p.f(1L, 90L);
                }
                if (jD == 2) {
                    return p.f(1L, 91L);
                }
                if (jD == 3 || jD == 4) {
                    return p.f(1L, 92L);
                }
                return v();
            }

            @Override // j$.time.temporal.TemporalField
            public final long A(TemporalAccessor temporalAccessor) {
                if (!k(temporalAccessor)) {
                    throw new o("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - f.f17964a[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.q.f17812c.P(temporalAccessor.D(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                long jA = A(temporal);
                v().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.c((j - jA) + temporal.D(chronoField), chronoField);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final TemporalAccessor p(Map map, D d5, E e10) {
                LocalDate localDateG0;
                long jI;
                ChronoField chronoField = ChronoField.YEAR;
                Long l10 = (Long) map.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l11 = (Long) map.get(temporalField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = chronoField.f17960b.a(l10.longValue(), chronoField);
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.f17968a;
                if (!j$.com.android.tools.r8.a.z(d5).equals(j$.time.chrono.q.f17812c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                if (e10 == E.LENIENT) {
                    localDateG0 = LocalDate.c0(iA, 1, 1).g0(j$.com.android.tools.r8.a.H(j$.com.android.tools.r8.a.I(l11.longValue(), 1L), 3));
                    jI = j$.com.android.tools.r8.a.I(jLongValue, 1L);
                } else {
                    LocalDate localDateC0 = LocalDate.c0(iA, ((temporalField.v().a(l11.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (e10 == E.STRICT) {
                            l(localDateC0).b(jLongValue, this);
                        } else {
                            v().b(jLongValue, this);
                        }
                    }
                    localDateG0 = localDateC0;
                    jI = jLongValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDateG0.plusDays(jI);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final p v() {
                return p.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.f17968a;
                return j$.com.android.tools.r8.a.z(temporalAccessor).equals(j$.time.chrono.q.f17812c);
            }

            @Override // j$.time.temporal.TemporalField
            public final long A(TemporalAccessor temporalAccessor) {
                if (!k(temporalAccessor)) {
                    throw new o("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.D(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.TemporalField
            public final p l(TemporalAccessor temporalAccessor) {
                if (!k(temporalAccessor)) {
                    throw new o("Unsupported field: QuarterOfYear");
                }
                return v();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                long jA = A(temporal);
                v().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.c(((j - jA) * 3) + temporal.D(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final p v() {
                return p.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.f17968a;
                return j$.com.android.tools.r8.a.z(temporalAccessor).equals(j$.time.chrono.q.f17812c);
            }

            @Override // j$.time.temporal.TemporalField
            public final p l(TemporalAccessor temporalAccessor) {
                if (k(temporalAccessor)) {
                    return f.T(LocalDate.S(temporalAccessor));
                }
                throw new o("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final long A(TemporalAccessor temporalAccessor) {
                if (!k(temporalAccessor)) {
                    throw new o("Unsupported field: WeekOfWeekBasedYear");
                }
                return f.Q(LocalDate.S(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                v().b(j, this);
                return temporal.d(j$.com.android.tools.r8.a.I(j, A(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final TemporalAccessor p(Map map, D d5, E e10) {
                LocalDate localDateC;
                long j;
                long j10;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                Long l10 = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l11 = (Long) map.get(chronoField);
                if (l10 == null || l11 == null) {
                    return null;
                }
                int iA = temporalField.v().a(l10.longValue(), temporalField);
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.f17968a;
                if (!j$.com.android.tools.r8.a.z(d5).equals(j$.time.chrono.q.f17812c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                LocalDate localDateC0 = LocalDate.c0(iA, 1, 4);
                if (e10 == E.LENIENT) {
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 > 7) {
                        long j11 = jLongValue2 - 1;
                        j = 1;
                        localDateC0 = localDateC0.h0(j11 / 7);
                        j10 = j11 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateC0 = localDateC0.h0(j$.com.android.tools.r8.a.I(jLongValue2, 7L) / 7);
                            j10 = (jLongValue2 + 6) % 7;
                        }
                        localDateC = localDateC0.h0(j$.com.android.tools.r8.a.I(jLongValue, j)).c(jLongValue2, chronoField);
                    }
                    jLongValue2 = j10 + j;
                    localDateC = localDateC0.h0(j$.com.android.tools.r8.a.I(jLongValue, j)).c(jLongValue2, chronoField);
                } else {
                    int iA2 = chronoField.f17960b.a(l11.longValue(), chronoField);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (e10 == E.STRICT) {
                            f.T(localDateC0).b(jLongValue, this);
                        } else {
                            v().b(jLongValue, this);
                        }
                    }
                    localDateC = localDateC0.h0(jLongValue - 1).c(iA2, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateC;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final p v() {
                return ChronoField.YEAR.f17960b;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean k(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.f17968a;
                return j$.com.android.tools.r8.a.z(temporalAccessor).equals(j$.time.chrono.q.f17812c);
            }

            @Override // j$.time.temporal.TemporalField
            public final long A(TemporalAccessor temporalAccessor) {
                if (k(temporalAccessor)) {
                    return f.R(LocalDate.S(temporalAccessor));
                }
                throw new o("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final p l(TemporalAccessor temporalAccessor) {
                if (!k(temporalAccessor)) {
                    throw new o("Unsupported field: WeekBasedYear");
                }
                return v();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal D(Temporal temporal, long j) {
                if (!k(temporal)) {
                    throw new o("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.f17960b.a(j, f.WEEK_BASED_YEAR);
                LocalDate localDateS = LocalDate.S(temporal);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                int i10 = localDateS.get(chronoField);
                int iQ = f.Q(localDateS);
                if (iQ == 53 && f.S(iA) == 52) {
                    iQ = 52;
                }
                LocalDate localDateC0 = LocalDate.c0(iA, 1, 4);
                return temporal.z(localDateC0.plusDays(((iQ - 1) * 7) + (i10 - localDateC0.get(chronoField))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        f17965b = new f[]{fVar, fVar2, fVar3, fVar4};
        f17964a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static p T(LocalDate localDate) {
        return p.f(1L, S(R(localDate)));
    }

    public static int S(int i10) {
        LocalDate localDateC0 = LocalDate.c0(i10, 1, 1);
        if (localDateC0.U() != DayOfWeek.THURSDAY) {
            return (localDateC0.U() == DayOfWeek.WEDNESDAY && localDateC0.r()) ? 53 : 52;
        }
        return 53;
    }

    public static int Q(LocalDate localDate) {
        int iOrdinal = localDate.U().ordinal();
        int iV = localDate.V() - 1;
        int i10 = (3 - iOrdinal) + iV;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iV >= i12) {
            int i13 = ((iV - i12) / 7) + 1;
            if (i13 != 53 || i12 == -3 || (i12 == -2 && localDate.r())) {
                return i13;
            }
            return 1;
        }
        if (localDate.V() != 180) {
            localDate = LocalDate.e0(localDate.f17743a, 180);
        }
        return (int) T(localDate.i0(-1L)).f17988d;
    }

    public static int R(LocalDate localDate) {
        int i10 = localDate.f17743a;
        int iV = localDate.V();
        if (iV <= 3) {
            return iV - localDate.U().ordinal() < -2 ? i10 - 1 : i10;
        }
        if (iV >= 363) {
            return ((iV - 363) - (localDate.r() ? 1 : 0)) - localDate.U().ordinal() >= 0 ? i10 + 1 : i10;
        }
        return i10;
    }
}
