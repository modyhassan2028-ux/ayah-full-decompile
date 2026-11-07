package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC1045a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f17812c = new q();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m w(int i10) {
        if (i10 == 0) {
            return r.BCE;
        }
        if (i10 == 1) {
            return r.CE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.l
    public final String j() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b J(int i10, int i11, int i12) {
        return LocalDate.c0(i10, i11, i12);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b o(int i10, int i11) {
        return LocalDate.e0(i10, i11);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b i(long j) {
        return LocalDate.d0(j);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b C(TemporalAccessor temporalAccessor) {
        return LocalDate.S(temporalAccessor);
    }

    private q() {
    }

    @Override // j$.time.chrono.AbstractC1045a, j$.time.chrono.l
    public final InterfaceC1049e G(TemporalAccessor temporalAccessor) {
        return LocalDateTime.R(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC1045a, j$.time.chrono.l
    public final ChronoZonedDateTime n(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.Q(temporalAccessor);
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.p(instant.f17739a, instant.f17740b, zoneId);
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b l() {
        j$.time.a aVarL = j$.com.android.tools.r8.a.L();
        Objects.requireNonNull(aVarL, "clock");
        return LocalDate.S(LocalDate.b0(aVarL));
    }

    @Override // j$.time.chrono.l
    public final boolean P(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i10) {
        if (mVar instanceof r) {
            return mVar == r.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.l
    public final List u() {
        return j$.com.android.tools.r8.a.C(r.values());
    }

    @Override // j$.time.chrono.AbstractC1045a, j$.time.chrono.l
    public final InterfaceC1046b L(Map map, j$.time.format.E e10) {
        return (LocalDate) super.L(map, e10);
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final void A(Map map, j$.time.format.E e10) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (e10 != j$.time.format.E.LENIENT) {
                chronoField.Q(l10.longValue());
            }
            long j = 12;
            AbstractC1045a.k(map, ChronoField.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.F(l10.longValue(), j)) + 1);
            AbstractC1045a.k(map, ChronoField.YEAR, j$.com.android.tools.r8.a.G(l10.longValue(), j));
        }
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b Q(Map map, j$.time.format.E e10) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l10 = (Long) map.remove(chronoField);
        if (l10 != null) {
            if (e10 != j$.time.format.E.LENIENT) {
                chronoField.Q(l10.longValue());
            }
            Long l11 = (Long) map.remove(ChronoField.ERA);
            if (l11 != null) {
                if (l11.longValue() == 1) {
                    AbstractC1045a.k(map, ChronoField.YEAR, l10.longValue());
                    return null;
                }
                if (l11.longValue() == 0) {
                    AbstractC1045a.k(map, ChronoField.YEAR, j$.com.android.tools.r8.a.I(1L, l10.longValue()));
                    return null;
                }
                throw new j$.time.b("Invalid value for era: " + l11);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l12 = (Long) map.get(chronoField2);
            if (e10 != j$.time.format.E.STRICT) {
                AbstractC1045a.k(map, chronoField2, (l12 == null || l12.longValue() > 0) ? l10.longValue() : j$.com.android.tools.r8.a.I(1L, l10.longValue()));
                return null;
            }
            if (l12 != null) {
                long jLongValue = l12.longValue();
                long jLongValue2 = l10.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = j$.com.android.tools.r8.a.I(1L, jLongValue2);
                }
                AbstractC1045a.k(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l10);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.Q(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b D(Map map, j$.time.format.E e10) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.f17960b.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z10 = true;
        if (e10 == j$.time.format.E.LENIENT) {
            return LocalDate.c0(iA, 1, 1).g0(j$.com.android.tools.r8.a.I(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(j$.com.android.tools.r8.a.I(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.f17960b.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.f17960b.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (e10 == j$.time.format.E.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i10 = j$.time.s.f17954b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z10 = false;
                }
                iA3 = Math.min(iA3, month.R(z10));
            }
        }
        return LocalDate.c0(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.p s(ChronoField chronoField) {
        return chronoField.f17960b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }
}
