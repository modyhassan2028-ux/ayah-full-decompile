package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1046b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZoneId f17842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j$.time.chrono.l f17843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E f17845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1046b f17846f;
    public LocalTime g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17841a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j$.time.p f17847h = j$.time.p.f17946d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.p l(TemporalField temporalField) {
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (((HashMap) this.f17841a).containsKey(temporalField)) {
            return true;
        }
        InterfaceC1046b interfaceC1046b = this.f17846f;
        if (interfaceC1046b != null && interfaceC1046b.e(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.e(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.k(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) ((HashMap) this.f17841a).get(temporalField);
        if (l10 != null) {
            return l10.longValue();
        }
        InterfaceC1046b interfaceC1046b = this.f17846f;
        if (interfaceC1046b != null && interfaceC1046b.e(temporalField)) {
            return this.f17846f.D(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.e(temporalField)) {
            return this.g.D(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f17979a) {
            return this.f17842b;
        }
        if (fVar == j$.time.temporal.n.f17980b) {
            return this.f17843c;
        }
        if (fVar == j$.time.temporal.n.f17984f) {
            InterfaceC1046b interfaceC1046b = this.f17846f;
            if (interfaceC1046b != null) {
                return LocalDate.S(interfaceC1046b);
            }
            return null;
        }
        if (fVar == j$.time.temporal.n.g) {
            return this.g;
        }
        if (fVar == j$.time.temporal.n.f17982d) {
            Long l10 = (Long) ((HashMap) this.f17841a).get(ChronoField.OFFSET_SECONDS);
            if (l10 != null) {
                return ZoneOffset.Z(l10.intValue());
            }
            ZoneId zoneId = this.f17842b;
            return zoneId instanceof ZoneOffset ? zoneId : fVar.g(this);
        }
        if (fVar == j$.time.temporal.n.f17983e) {
            return fVar.g(this);
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return null;
        }
        return fVar.g(this);
    }

    public final void u(TemporalField temporalField, ChronoField chronoField, Long l10) {
        Long l11 = (Long) ((HashMap) this.f17841a).put(chronoField, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new j$.time.b("Conflict found: " + chronoField + " " + l11 + " differs from " + chronoField + " " + l10 + " while resolving  " + temporalField);
    }

    public final void j() {
        if (((HashMap) this.f17841a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f17842b;
            if (zoneId != null) {
                m(zoneId);
                return;
            }
            Long l10 = (Long) ((HashMap) this.f17841a).get(ChronoField.OFFSET_SECONDS);
            if (l10 != null) {
                m(ZoneOffset.Z(l10.intValue()));
            }
        }
    }

    public final void m(ZoneId zoneId) {
        Map map = this.f17841a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        ChronoZonedDateTime chronoZonedDateTimeM = this.f17843c.M(Instant.Q(((Long) ((HashMap) map).remove(chronoField)).longValue(), 0), zoneId);
        s(chronoZonedDateTimeM.f());
        u(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(chronoZonedDateTimeM.b().d0()));
    }

    public final void s(InterfaceC1046b interfaceC1046b) {
        InterfaceC1046b interfaceC1046b2 = this.f17846f;
        if (interfaceC1046b2 != null) {
            if (interfaceC1046b == null || interfaceC1046b2.equals(interfaceC1046b)) {
                return;
            }
            throw new j$.time.b("Conflict found: Fields resolved to two different dates: " + this.f17846f + " " + interfaceC1046b);
        }
        if (interfaceC1046b != null) {
            if (!this.f17843c.equals(interfaceC1046b.a())) {
                throw new j$.time.b("ChronoLocalDate must use the effective parsed chronology: " + this.f17843c);
            }
            this.f17846f = interfaceC1046b;
        }
    }

    public final void o() {
        Map map = this.f17841a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.f17841a).remove(chronoField)).longValue();
            E e10 = this.f17845e;
            if (e10 == E.STRICT || (e10 == E.SMART && jLongValue != 0)) {
                chronoField.Q(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            u(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f17841a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f17841a).remove(chronoField3)).longValue();
            E e11 = this.f17845e;
            if (e11 == E.STRICT || (e11 == E.SMART && jLongValue2 != 0)) {
                chronoField3.Q(jLongValue2);
            }
            u(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f17841a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.f17841a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f17841a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f17841a).remove(chronoField5)).longValue();
                if (this.f17845e == E.LENIENT) {
                    u(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.Q(jLongValue3);
                    chronoField5.Q(jLongValue3);
                    u(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f17841a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f17841a).remove(chronoField6)).longValue();
            if (this.f17845e != E.LENIENT) {
                chronoField6.Q(jLongValue5);
            }
            u(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            u(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            u(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            u(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f17841a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f17841a).remove(chronoField7)).longValue();
            if (this.f17845e != E.LENIENT) {
                chronoField7.Q(jLongValue6);
            }
            u(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            u(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f17841a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f17841a).remove(chronoField8)).longValue();
            if (this.f17845e != E.LENIENT) {
                chronoField8.Q(jLongValue7);
            }
            u(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            u(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f17841a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f17841a).remove(chronoField9)).longValue();
            if (this.f17845e != E.LENIENT) {
                chronoField9.Q(jLongValue8);
            }
            u(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            u(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            u(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f17841a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f17841a).remove(chronoField10)).longValue();
            if (this.f17845e != E.LENIENT) {
                chronoField10.Q(jLongValue9);
            }
            u(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            u(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f17841a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f17841a).get(chronoField11)).longValue();
            E e12 = this.f17845e;
            E e13 = E.LENIENT;
            if (e12 != e13) {
                chronoField11.Q(jLongValue10);
            }
            Map map11 = this.f17841a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f17841a).remove(chronoField12)).longValue();
                if (this.f17845e != e13) {
                    chronoField12.Q(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                u(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f17841a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f17841a).remove(chronoField13)).longValue();
                if (this.f17845e != e13) {
                    chronoField13.Q(jLongValue12);
                }
                u(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f17841a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.f17841a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.f17841a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.f17841a).containsKey(chronoField11)) {
                    n(((Long) ((HashMap) this.f17841a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.f17841a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.f17841a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.f17841a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void n(long j, long j10, long j11, long j12) {
        if (this.f17845e == E.LENIENT) {
            long jB = j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.B(j$.com.android.tools.r8.a.H(j, 3600000000000L), j$.com.android.tools.r8.a.H(j10, 60000000000L)), j$.com.android.tools.r8.a.H(j11, 1000000000L)), j12);
            p(LocalTime.V(j$.com.android.tools.r8.a.F(jB, 86400000000000L)), j$.time.p.a(0, 0, (int) j$.com.android.tools.r8.a.G(jB, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.f17960b.a(j10, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.f17960b.a(j12, chronoField2);
        if (this.f17845e == E.SMART && j == 24 && iA == 0 && j11 == 0 && iA2 == 0) {
            p(LocalTime.g, j$.time.p.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.f17960b.a(j, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        p(LocalTime.U(iA3, iA, chronoField4.f17960b.a(j11, chronoField4), iA2), j$.time.p.f17946d);
    }

    public final void p(LocalTime localTime, j$.time.p pVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new j$.time.b("Conflict found: Fields resolved to different times: " + this.g + " " + localTime);
            }
            j$.time.p pVar2 = this.f17847h;
            pVar2.getClass();
            j$.time.p pVar3 = j$.time.p.f17946d;
            if (pVar2 != pVar3 && pVar != pVar3 && !this.f17847h.equals(pVar)) {
                throw new j$.time.b("Conflict found: Fields resolved to different excess periods: " + this.f17847h + " " + pVar);
            }
            this.f17847h = pVar;
            return;
        }
        this.g = localTime;
        this.f17847h = pVar;
    }

    public final void i(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f17841a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.e(temporalField)) {
                try {
                    long jD = temporalAccessor.D(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jD != jLongValue) {
                        throw new j$.time.b("Conflict found: Field " + temporalField + " " + jD + " differs from " + temporalField + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f17841a);
        sb.append(',');
        sb.append(this.f17843c);
        if (this.f17842b != null) {
            sb.append(',');
            sb.append(this.f17842b);
        }
        if (this.f17846f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC1046b interfaceC1046b = this.f17846f;
            if (interfaceC1046b != null) {
                sb.append(interfaceC1046b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
