package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1045a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f17815c = new t();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.l
    public final String j() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b J(int i10, int i11, int i12) {
        return new v(LocalDate.c0(i10, i11, i12));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b o(int i10, int i11) {
        return new v(LocalDate.e0(i10, i11));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b i(long j) {
        return new v(LocalDate.d0(j));
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b l() {
        return new v(LocalDate.S(LocalDate.b0(j$.com.android.tools.r8.a.L())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof v) {
            return (v) temporalAccessor;
        }
        return new v(LocalDate.S(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final List u() {
        w[] wVarArr = w.f17822e;
        return j$.com.android.tools.r8.a.C((w[]) Arrays.copyOf(wVarArr, wVarArr.length));
    }

    @Override // j$.time.chrono.l
    public final boolean P(long j) {
        return q.f17812c.P(j);
    }

    private t() {
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i10) {
        if (!(mVar instanceof w)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i11 = ((w) mVar).f17824b.f17743a;
        int i12 = (i11 + i10) - 1;
        if (i10 != 1 && (i12 < -999999999 || i12 > 999999999 || i12 < i11 || mVar != w.i(LocalDate.c0(i12, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return i12;
    }

    @Override // j$.time.chrono.l
    public final m w(int i10) {
        return w.m(i10);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.p s(ChronoField chronoField) {
        switch (s.f17814a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.o("Unsupported field: " + chronoField);
            case 5:
                w[] wVarArr = w.f17822e;
                int i10 = wVarArr[wVarArr.length - 1].f17824b.f17743a;
                int iMin = 1000000000 - wVarArr[wVarArr.length - 1].f17824b.f17743a;
                int i11 = wVarArr[0].f17824b.f17743a;
                int i12 = 1;
                while (true) {
                    w[] wVarArr2 = w.f17822e;
                    if (i12 >= wVarArr2.length) {
                        return j$.time.temporal.p.g(1L, iMin, 999999999 - i10);
                    }
                    w wVar = wVarArr2[i12];
                    iMin = Math.min(iMin, (wVar.f17824b.f17743a - i11) + 1);
                    i11 = wVar.f17824b.f17743a;
                    i12++;
                }
                break;
            case 6:
                w wVar2 = w.f17821d;
                long j = ChronoField.DAY_OF_YEAR.f17960b.f17987c;
                long jMin = j;
                for (w wVar3 : w.f17822e) {
                    long jMin2 = Math.min(jMin, (wVar3.f17824b.N() - wVar3.f17824b.V()) + 1);
                    jMin = wVar3.j() != null ? Math.min(jMin2, wVar3.j().f17824b.V() - 1) : jMin2;
                }
                return j$.time.temporal.p.g(1L, jMin, ChronoField.DAY_OF_YEAR.f17960b.f17988d);
            case 7:
                return j$.time.temporal.p.f(v.f17817d.f17743a, 999999999L);
            case 8:
                long j10 = w.f17821d.f17823a;
                w[] wVarArr3 = w.f17822e;
                return j$.time.temporal.p.f(j10, wVarArr3[wVarArr3.length - 1].f17823a);
            default:
                return chronoField.f17960b;
        }
    }

    @Override // j$.time.chrono.AbstractC1045a, j$.time.chrono.l
    public final InterfaceC1046b L(Map map, j$.time.format.E e10) {
        return (v) super.L(map, e10);
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b Q(Map map, j$.time.format.E e10) {
        LocalDate localDateE0;
        v vVarX;
        ChronoField chronoField = ChronoField.ERA;
        Long l10 = (Long) map.get(chronoField);
        w wVarM = l10 != null ? w.m(s(chronoField).a(l10.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l11 = (Long) map.get(chronoField2);
        int iA = l11 != null ? s(chronoField2).a(l11.longValue(), chronoField2) : 0;
        if (wVarM == null && l11 != null && !map.containsKey(ChronoField.YEAR) && e10 != j$.time.format.E.STRICT) {
            w[] wVarArr = w.f17822e;
            wVarM = ((w[]) Arrays.copyOf(wVarArr, wVarArr.length))[((w[]) Arrays.copyOf(wVarArr, wVarArr.length)).length - 1];
        }
        if (l11 != null && wVarM != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (e10 == j$.time.format.E.LENIENT) {
                        return new v(LocalDate.c0((wVarM.f17824b.f17743a + iA) - 1, 1, 1)).V(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).V(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = s(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = s(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (e10 != j$.time.format.E.SMART) {
                        LocalDate localDate = v.f17817d;
                        Objects.requireNonNull(wVarM, "era");
                        LocalDate localDateC0 = LocalDate.c0((wVarM.f17824b.f17743a + iA) - 1, iA2, iA3);
                        if (localDateC0.X(wVarM.f17824b) || wVarM != w.i(localDateC0)) {
                            throw new j$.time.b("year, month, and day not valid for Era");
                        }
                        return new v(wVarM, iA, localDateC0);
                    }
                    if (iA < 1) {
                        throw new j$.time.b("Invalid YearOfEra: " + iA);
                    }
                    int i10 = (wVarM.f17824b.f17743a + iA) - 1;
                    try {
                        vVarX = new v(LocalDate.c0(i10, iA2, iA3));
                    } catch (j$.time.b unused) {
                        vVarX = new v(LocalDate.c0(i10, iA2, 1)).X(new j$.time.f(3));
                    }
                    if (vVarX.f17819b == wVarM || j$.time.temporal.n.a(vVarX, ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return vVarX;
                    }
                    throw new j$.time.b("Invalid YearOfEra for Era: " + wVarM + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (e10 == j$.time.format.E.LENIENT) {
                    return new v(LocalDate.e0((wVarM.f17824b.f17743a + iA) - 1, 1)).V(j$.com.android.tools.r8.a.I(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = s(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = v.f17817d;
                Objects.requireNonNull(wVarM, "era");
                if (iA == 1) {
                    LocalDate localDate3 = wVarM.f17824b;
                    localDateE0 = LocalDate.e0(localDate3.f17743a, (localDate3.V() + iA4) - 1);
                } else {
                    localDateE0 = LocalDate.e0((wVarM.f17824b.f17743a + iA) - 1, iA4);
                }
                if (localDateE0.X(wVarM.f17824b) || wVarM != w.i(localDateE0)) {
                    throw new j$.time.b("Invalid parameters");
                }
                return new v(wVarM, iA, localDateE0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        return k.R(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }
}
