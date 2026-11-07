package j$.time.temporal;

import j$.time.chrono.InterfaceC1046b;
import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements TemporalField {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f17989f = p.f(1, 7);
    public static final p g = p.g(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f17990h = p.g(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f17991i = p.g(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f17993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TemporalUnit f17994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TemporalUnit f17995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f17996e;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public final InterfaceC1046b e(j$.time.chrono.l lVar, int i10, int i11, int i12) {
        InterfaceC1046b interfaceC1046bJ = lVar.J(i10, 1, 1);
        int iH = h(1, b(interfaceC1046bJ));
        return interfaceC1046bJ.d(((Math.min(i11, a(iH, interfaceC1046bJ.N() + this.f17993b.f17999b) - 1) - 1) * 7) + (i12 - 1) + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public q(String str, r rVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, p pVar) {
        this.f17992a = str;
        this.f17993b = rVar;
        this.f17994c = temporalUnit;
        this.f17995d = temporalUnit2;
        this.f17996e = pVar;
    }

    @Override // j$.time.temporal.TemporalField
    public final long A(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f17995d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == r.f17997h) {
                    iC = d(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int i10 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                iC = a(h(i10, iB), i10);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int i11 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            iC = a(h(i11, iB2), i11);
        }
        return iC;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return n.e(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.f17993b.f17998a.getValue()) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int i10 = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i11 = temporalAccessor.get(chronoField);
        int iH = h(i11, iB);
        int iA = a(iH, i11);
        if (iA == 0) {
            return i10 - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.l(chronoField).f17988d) + this.f17993b.f17999b) ? i10 + 1 : i10;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i10 = temporalAccessor.get(chronoField);
        int iH = h(i10, iB);
        int iA2 = a(iH, i10);
        if (iA2 == 0) {
            return d(j$.com.android.tools.r8.a.z(temporalAccessor).C(temporalAccessor).t(i10, ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.l(chronoField).f17988d) + this.f17993b.f17999b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i10, int i11) {
        int iE = n.e(i10 - i11);
        return iE + 1 > this.f17993b.f17999b ? 7 - iE : -iE;
    }

    public static int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal D(Temporal temporal, long j) {
        int iA = this.f17996e.a(j, this);
        int i10 = temporal.get(this);
        if (iA == i10) {
            return temporal;
        }
        if (this.f17995d != ChronoUnit.FOREVER) {
            return temporal.d(iA - i10, this.f17994c);
        }
        r rVar = this.f17993b;
        return e(j$.com.android.tools.r8.a.z(temporal), (int) j, temporal.get(rVar.f18002e), temporal.get(rVar.f18000c));
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor p(Map map, D d5, E e10) {
        InterfaceC1046b interfaceC1046bD;
        InterfaceC1046b interfaceC1046bD2;
        ChronoField chronoField;
        InterfaceC1046b interfaceC1046bD3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iA = j$.com.android.tools.r8.a.A(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        p pVar = this.f17996e;
        r rVar = this.f17993b;
        TemporalUnit temporalUnit = this.f17995d;
        if (temporalUnit == chronoUnit) {
            long jE = n.e((pVar.a(jLongValue, this) - 1) + (rVar.f17998a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        int iE = n.e(chronoField2.f17960b.a(((Long) map.get(chronoField2)).longValue(), chronoField2) - rVar.f17998a.getValue()) + 1;
        j$.time.chrono.l lVarZ = j$.com.android.tools.r8.a.z(d5);
        ChronoField chronoField3 = ChronoField.YEAR;
        if (!map.containsKey(chronoField3)) {
            if ((temporalUnit != r.f17997h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(rVar.f18003f) || !map.containsKey(rVar.f18002e)) {
                return null;
            }
            q qVar = rVar.f18003f;
            int iA2 = qVar.f17996e.a(((Long) map.get(qVar)).longValue(), rVar.f18003f);
            if (e10 == E.LENIENT) {
                interfaceC1046bD = e(lVarZ, iA2, 1, iE).d(j$.com.android.tools.r8.a.I(((Long) map.get(rVar.f18002e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                q qVar2 = rVar.f18002e;
                InterfaceC1046b interfaceC1046bE = e(lVarZ, iA2, qVar2.f17996e.a(((Long) map.get(qVar2)).longValue(), rVar.f18002e), iE);
                if (e10 == E.STRICT && c(interfaceC1046bE) != iA2) {
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                interfaceC1046bD = interfaceC1046bE;
            }
            map.remove(this);
            map.remove(rVar.f18003f);
            map.remove(rVar.f18002e);
            map.remove(chronoField2);
            return interfaceC1046bD;
        }
        int iA3 = chronoField3.f17960b.a(((Long) map.get(chronoField3)).longValue(), chronoField3);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField4 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField4)) {
                long jLongValue2 = ((Long) map.get(chronoField4)).longValue();
                long j = iA;
                if (e10 == E.LENIENT) {
                    InterfaceC1046b interfaceC1046bD4 = lVarZ.J(iA3, 1, 1).d(j$.com.android.tools.r8.a.I(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(interfaceC1046bD4);
                    int i10 = interfaceC1046bD4.get(ChronoField.DAY_OF_MONTH);
                    interfaceC1046bD3 = interfaceC1046bD4.d(j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j$.com.android.tools.r8.a.I(j, a(h(i10, iB), i10)), 7), iE - b(interfaceC1046bD4)), (TemporalUnit) ChronoUnit.DAYS);
                    chronoField = chronoField4;
                } else {
                    chronoField = chronoField4;
                    InterfaceC1046b interfaceC1046bJ = lVarZ.J(iA3, chronoField.f17960b.a(jLongValue2, chronoField), 1);
                    long jA = pVar.a(j, this);
                    int iB2 = b(interfaceC1046bJ);
                    int i11 = interfaceC1046bJ.get(ChronoField.DAY_OF_MONTH);
                    InterfaceC1046b interfaceC1046bD5 = interfaceC1046bJ.d((((int) (jA - ((long) a(h(i11, iB2), i11)))) * 7) + (iE - b(interfaceC1046bJ)), (TemporalUnit) ChronoUnit.DAYS);
                    if (e10 == E.STRICT && interfaceC1046bD5.D(chronoField) != jLongValue2) {
                        throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                    }
                    interfaceC1046bD3 = interfaceC1046bD5;
                }
                map.remove(this);
                map.remove(chronoField3);
                map.remove(chronoField);
                map.remove(chronoField2);
                return interfaceC1046bD3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j10 = iA;
        InterfaceC1046b interfaceC1046bJ2 = lVarZ.J(iA3, 1, 1);
        if (e10 == E.LENIENT) {
            int iB3 = b(interfaceC1046bJ2);
            int i12 = interfaceC1046bJ2.get(ChronoField.DAY_OF_YEAR);
            interfaceC1046bD2 = interfaceC1046bJ2.d(j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j$.com.android.tools.r8.a.I(j10, a(h(i12, iB3), i12)), 7), iE - b(interfaceC1046bJ2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = pVar.a(j10, this);
            int iB4 = b(interfaceC1046bJ2);
            int i13 = interfaceC1046bJ2.get(ChronoField.DAY_OF_YEAR);
            InterfaceC1046b interfaceC1046bD6 = interfaceC1046bJ2.d((((int) (jA2 - ((long) a(h(i13, iB4), i13)))) * 7) + (iE - b(interfaceC1046bJ2)), (TemporalUnit) ChronoUnit.DAYS);
            if (e10 == E.STRICT && interfaceC1046bD6.D(chronoField3) != iA3) {
                throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
            }
            interfaceC1046bD2 = interfaceC1046bD6;
        }
        map.remove(this);
        map.remove(chronoField3);
        map.remove(chronoField2);
        return interfaceC1046bD2;
    }

    @Override // j$.time.temporal.TemporalField
    public final p v() {
        return this.f17996e;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean k(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.e(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f17995d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.e(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.e(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == r.f17997h) {
            return temporalAccessor.e(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.e(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final p l(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f17995d;
        if (temporalUnit == chronoUnit) {
            return this.f17996e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == r.f17997h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.f17960b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    public final p f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iH = h(temporalAccessor.get(chronoField), b(temporalAccessor));
        p pVarL = temporalAccessor.l(chronoField);
        return p.f(a(iH, (int) pVarL.f17985a), a(iH, (int) pVarL.f17988d));
    }

    public final p g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.e(chronoField)) {
            return f17990h;
        }
        int iB = b(temporalAccessor);
        int i10 = temporalAccessor.get(chronoField);
        int iH = h(i10, iB);
        int iA = a(iH, i10);
        if (iA != 0) {
            int i11 = (int) temporalAccessor.l(chronoField).f17988d;
            int iA2 = a(iH, this.f17993b.f17999b + i11);
            if (iA >= iA2) {
                return g(j$.com.android.tools.r8.a.z(temporalAccessor).C(temporalAccessor).d((i11 - i10) + 8, (TemporalUnit) ChronoUnit.DAYS));
            }
            return p.f(1L, iA2 - 1);
        }
        return g(j$.com.android.tools.r8.a.z(temporalAccessor).C(temporalAccessor).t(i10 + 7, ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f17992a + "[" + this.f17993b.toString() + "]";
    }
}
