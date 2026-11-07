package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1045a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f17793a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f17794b = new ConcurrentHashMap();

    public abstract /* synthetic */ InterfaceC1046b l();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j().compareTo(((l) obj).j());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static l p(l lVar, String str) {
        String strM;
        l lVar2 = (l) f17793a.putIfAbsent(str, lVar);
        if (lVar2 == null && (strM = lVar.m()) != null) {
            f17794b.putIfAbsent(strM, lVar);
        }
        return lVar2;
    }

    @Override // j$.time.chrono.l
    public InterfaceC1046b L(Map map, j$.time.format.E e10) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return i(((Long) map.remove(chronoField)).longValue());
        }
        A(map, e10);
        InterfaceC1046b interfaceC1046bQ = Q(map, e10);
        if (interfaceC1046bQ != null) {
            return interfaceC1046bQ;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return D(map, e10);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int iA = s(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (e10 == j$.time.format.E.LENIENT) {
                        long jI = j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return J(iA, 1, 1).d(jI, (TemporalUnit) ChronoUnit.MONTHS).d(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = s(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    InterfaceC1046b interfaceC1046bD = J(iA, iA2, 1).d((s(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((s(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (e10 != j$.time.format.E.STRICT || interfaceC1046bD.get(chronoField3) == iA2) {
                        return interfaceC1046bD;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int iA3 = s(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (e10 == j$.time.format.E.LENIENT) {
                        return v(J(iA3, 1, 1), j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField3)).longValue(), 1L), j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField4)).longValue(), 1L), j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int iA4 = s(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    InterfaceC1046b interfaceC1046bZ = J(iA3, iA4, 1).d((s(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).z(new j$.time.temporal.l(DayOfWeek.Q(s(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                    if (e10 != j$.time.format.E.STRICT || interfaceC1046bZ.get(chronoField3) == iA4) {
                        return interfaceC1046bZ;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int iA5 = s(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (e10 != j$.time.format.E.LENIENT) {
                return o(iA5, s(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return o(iA5, 1).d(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int iA6 = s(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (e10 == j$.time.format.E.LENIENT) {
                return o(iA6, 1).d(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            InterfaceC1046b interfaceC1046bD2 = o(iA6, 1).d((s(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((s(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (e10 != j$.time.format.E.STRICT || interfaceC1046bD2.get(chronoField2) == iA6) {
                return interfaceC1046bD2;
            }
            throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int iA7 = s(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (e10 == j$.time.format.E.LENIENT) {
            return v(o(iA7, 1), 0L, j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField8)).longValue(), 1L), j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        InterfaceC1046b interfaceC1046bZ2 = o(iA7, 1).d((s(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).z(new j$.time.temporal.l(DayOfWeek.Q(s(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
        if (e10 != j$.time.format.E.STRICT || interfaceC1046bZ2.get(chronoField2) == iA7) {
            return interfaceC1046bZ2;
        }
        throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
    }

    @Override // j$.time.chrono.l
    public InterfaceC1049e G(TemporalAccessor temporalAccessor) {
        try {
            return C(temporalAccessor).F(LocalTime.S(temporalAccessor));
        } catch (j$.time.b e10) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e10);
        }
    }

    public void A(Map map, j$.time.format.E e10) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (e10 != j$.time.format.E.LENIENT) {
                chronoField.Q(l10.longValue());
            }
            InterfaceC1046b interfaceC1046bC = l().c(1L, (TemporalField) ChronoField.DAY_OF_MONTH).c(l10.longValue(), (TemporalField) chronoField);
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            k(map, chronoField2, interfaceC1046bC.get(chronoField2));
            ChronoField chronoField3 = ChronoField.YEAR;
            k(map, chronoField3, interfaceC1046bC.get(chronoField3));
        }
    }

    public InterfaceC1046b Q(Map map, j$.time.format.E e10) {
        int iA;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            ChronoField chronoField2 = ChronoField.ERA;
            Long l11 = (Long) map.remove(chronoField2);
            if (e10 != j$.time.format.E.LENIENT) {
                iA = s(chronoField).a(l10.longValue(), chronoField);
            } else {
                iA = j$.com.android.tools.r8.a.A(l10.longValue());
            }
            if (l11 != null) {
                k(map, ChronoField.YEAR, x(w(s(chronoField2).a(l11.longValue(), chronoField2)), iA));
                return null;
            }
            ChronoField chronoField3 = ChronoField.YEAR;
            if (map.containsKey(chronoField3)) {
                k(map, chronoField3, x(o(s(chronoField3).a(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).H(), iA));
                return null;
            }
            if (e10 == j$.time.format.E.STRICT) {
                map.put(chronoField, l10);
                return null;
            }
            List listU = u();
            if (listU.isEmpty()) {
                k(map, chronoField3, iA);
                return null;
            }
            k(map, chronoField3, x((m) listU.get(listU.size() - 1), iA));
            return null;
        }
        ChronoField chronoField4 = ChronoField.ERA;
        if (!map.containsKey(chronoField4)) {
            return null;
        }
        s(chronoField4).b(((Long) map.get(chronoField4)).longValue(), chronoField4);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // j$.time.chrono.l
    public ChronoZonedDateTime n(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdQ = ZoneId.Q(temporalAccessor);
            try {
                temporalAccessor = M(Instant.R(temporalAccessor), zoneIdQ);
                return temporalAccessor;
            } catch (j$.time.b unused) {
                return k.Q(zoneIdQ, null, C1051g.Q(this, G(temporalAccessor)));
            }
        } catch (j$.time.b e10) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e10);
        }
    }

    public InterfaceC1046b D(Map map, j$.time.format.E e10) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = s(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (e10 == j$.time.format.E.LENIENT) {
            long jI = j$.com.android.tools.r8.a.I(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return J(iA, 1, 1).d(jI, (TemporalUnit) ChronoUnit.MONTHS).d(j$.com.android.tools.r8.a.I(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = s(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = s(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (e10 != j$.time.format.E.SMART) {
            return J(iA, iA2, iA3);
        }
        try {
            return J(iA, iA2, iA3);
        } catch (j$.time.b unused) {
            return J(iA, iA2, 1).z(new j$.time.f(3));
        }
    }

    public static InterfaceC1046b v(InterfaceC1046b interfaceC1046b, long j, long j10, long j11) {
        long j12;
        InterfaceC1046b interfaceC1046bD = interfaceC1046b.d(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC1046b interfaceC1046bD2 = interfaceC1046bD.d(j10, (TemporalUnit) chronoUnit);
        if (j11 > 7) {
            long j13 = j11 - 1;
            interfaceC1046bD2 = interfaceC1046bD2.d(j13 / 7, (TemporalUnit) chronoUnit);
            j12 = j13 % 7;
        } else {
            if (j11 < 1) {
                interfaceC1046bD2 = interfaceC1046bD2.d(j$.com.android.tools.r8.a.I(j11, 7L) / 7, (TemporalUnit) chronoUnit);
                j12 = (j11 + 6) % 7;
            }
            return interfaceC1046bD2.z(new j$.time.temporal.l(DayOfWeek.Q((int) j11).getValue(), 0));
        }
        j11 = j12 + 1;
        return interfaceC1046bD2.z(new j$.time.temporal.l(DayOfWeek.Q((int) j11).getValue(), 0));
    }

    public static void k(Map map, ChronoField chronoField, long j) {
        Long l10 = (Long) map.get(chronoField);
        if (l10 != null && l10.longValue() != j) {
            throw new j$.time.b("Conflict found: " + chronoField + " " + l10 + " differs from " + chronoField + " " + j);
        }
        map.put(chronoField, Long.valueOf(j));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1045a) && j().compareTo(((AbstractC1045a) obj).j()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ j().hashCode();
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return j();
    }
}
