package j$.time.format;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1046b;
import j$.time.chrono.InterfaceC1049e;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_TIME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f17848f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1056d f17849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f17850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f17851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f17852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j$.time.chrono.l f17853e;

    public static DateTimeFormatter ofPattern(String str) {
        u uVar = new u();
        uVar.h(str);
        return uVar.r(Locale.getDefault(), E.SMART, null);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        u uVar = new u();
        uVar.h(str);
        return uVar.r(locale, E.SMART, null);
    }

    static {
        u uVar = new u();
        ChronoField chronoField = ChronoField.YEAR;
        F f3 = F.EXCEEDS_PAD;
        uVar.n(chronoField, 4, 10, f3);
        uVar.d('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        uVar.m(chronoField2, 2);
        uVar.d('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        uVar.m(chronoField3, 2);
        E e10 = E.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.f17812c;
        DateTimeFormatter dateTimeFormatterQ = uVar.q(e10, qVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        u uVar2 = new u();
        p pVar = p.INSENSITIVE;
        uVar2.c(pVar);
        uVar2.a(dateTimeFormatterQ);
        j jVar = j.f17878e;
        uVar2.c(jVar);
        uVar2.q(e10, qVar);
        u uVar3 = new u();
        uVar3.c(pVar);
        uVar3.a(dateTimeFormatterQ);
        uVar3.p();
        uVar3.c(jVar);
        uVar3.q(e10, qVar);
        u uVar4 = new u();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        uVar4.m(chronoField4, 2);
        uVar4.d(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        uVar4.m(chronoField5, 2);
        uVar4.p();
        uVar4.d(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        uVar4.m(chronoField6, 2);
        uVar4.p();
        uVar4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterQ2 = uVar4.q(e10, null);
        ISO_LOCAL_TIME = dateTimeFormatterQ2;
        u uVar5 = new u();
        uVar5.c(pVar);
        uVar5.a(dateTimeFormatterQ2);
        uVar5.c(jVar);
        uVar5.q(e10, null);
        u uVar6 = new u();
        uVar6.c(pVar);
        uVar6.a(dateTimeFormatterQ2);
        uVar6.p();
        uVar6.c(jVar);
        uVar6.q(e10, null);
        u uVar7 = new u();
        uVar7.c(pVar);
        uVar7.a(dateTimeFormatterQ);
        uVar7.d('T');
        uVar7.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = uVar7.q(e10, qVar);
        u uVar8 = new u();
        uVar8.c(pVar);
        uVar8.a(dateTimeFormatterQ3);
        p pVar2 = p.LENIENT;
        uVar8.c(pVar2);
        uVar8.c(jVar);
        p pVar3 = p.STRICT;
        uVar8.c(pVar3);
        DateTimeFormatter dateTimeFormatterQ4 = uVar8.q(e10, qVar);
        u uVar9 = new u();
        uVar9.a(dateTimeFormatterQ4);
        uVar9.p();
        uVar9.d('[');
        p pVar4 = p.SENSITIVE;
        uVar9.c(pVar4);
        j$.time.f fVar = u.f17911h;
        uVar9.c(new s(fVar, "ZoneRegionId()"));
        uVar9.d(']');
        uVar9.q(e10, qVar);
        u uVar10 = new u();
        uVar10.a(dateTimeFormatterQ3);
        uVar10.p();
        uVar10.c(jVar);
        uVar10.p();
        uVar10.d('[');
        uVar10.c(pVar4);
        uVar10.c(new s(fVar, "ZoneRegionId()"));
        uVar10.d(']');
        uVar10.q(e10, qVar);
        u uVar11 = new u();
        uVar11.c(pVar);
        uVar11.n(chronoField, 4, 10, f3);
        uVar11.d('-');
        uVar11.m(ChronoField.DAY_OF_YEAR, 3);
        uVar11.p();
        uVar11.c(jVar);
        uVar11.q(e10, qVar);
        u uVar12 = new u();
        uVar12.c(pVar);
        uVar12.n(j$.time.temporal.h.f17970c, 4, 10, f3);
        uVar12.e("-W");
        uVar12.m(j$.time.temporal.h.f17969b, 2);
        uVar12.d('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        uVar12.m(chronoField7, 1);
        uVar12.p();
        uVar12.c(jVar);
        uVar12.q(e10, qVar);
        u uVar13 = new u();
        uVar13.c(pVar);
        uVar13.c(new C1059g());
        f17848f = uVar13.q(e10, null);
        u uVar14 = new u();
        uVar14.c(pVar);
        uVar14.m(chronoField, 4);
        uVar14.m(chronoField2, 2);
        uVar14.m(chronoField3, 2);
        uVar14.p();
        uVar14.c(pVar2);
        uVar14.g("+HHMMss", "Z");
        uVar14.c(pVar3);
        uVar14.q(e10, qVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        u uVar15 = new u();
        uVar15.c(pVar);
        uVar15.c(pVar2);
        uVar15.p();
        uVar15.i(chronoField7, map);
        uVar15.e(", ");
        uVar15.o();
        uVar15.n(chronoField3, 1, 2, F.NOT_NEGATIVE);
        uVar15.d(' ');
        uVar15.i(chronoField2, map2);
        uVar15.d(' ');
        uVar15.m(chronoField, 4);
        uVar15.d(' ');
        uVar15.m(chronoField4, 2);
        uVar15.d(':');
        uVar15.m(chronoField5, 2);
        uVar15.p();
        uVar15.d(':');
        uVar15.m(chronoField6, 2);
        uVar15.o();
        uVar15.d(' ');
        uVar15.g("+HHMM", "GMT");
        uVar15.q(E.SMART, qVar);
    }

    public DateTimeFormatter(C1056d c1056d, Locale locale, E e10, j$.time.chrono.l lVar) {
        C c10 = C.f17840a;
        this.f17849a = (C1056d) Objects.requireNonNull(c1056d, "printerParser");
        this.f17850b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f17851c = (C) Objects.requireNonNull(c10, "decimalStyle");
        this.f17852d = (E) Objects.requireNonNull(e10, "resolverStyle");
        this.f17853e = lVar;
    }

    public final String a(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        C1056d c1056d = this.f17849a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            c1056d.k(new y(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e10) {
            throw new j$.time.b(e10.getMessage(), e10);
        }
    }

    public final Object b(CharSequence charSequence, j$.time.f fVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(fVar, "query");
        try {
            return c(charSequence).v(fVar);
        } catch (w e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            w wVar = new w("Text '" + string + "' could not be parsed: " + e11.getMessage(), e11);
            charSequence.toString();
            throw wVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0295  */
    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0338  */
    /* JADX WARN: Code duplicated, block: B:135:0x0365  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0271  */
    public final D c(CharSequence charSequence) {
        String string;
        long j;
        TemporalField temporalField;
        ChronoField chronoField;
        Map map;
        ChronoField chronoField2;
        TemporalField temporalField2;
        int i10 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        v vVar = new v(this);
        int iL = this.f17849a.l(vVar, charSequence, parsePosition.getIndex());
        ZoneId zoneId = null;
        if (iL < 0) {
            parsePosition.setErrorIndex(~iL);
            vVar = null;
        } else {
            parsePosition.setIndex(iL);
        }
        if (vVar != null) {
            DateTimeFormatter dateTimeFormatter = vVar.f17919a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                D dC = vVar.c();
                j$.time.chrono.l lVar = vVar.c().f17843c;
                if (lVar == null && (lVar = dateTimeFormatter.f17853e) == null) {
                    lVar = j$.time.chrono.q.f17812c;
                }
                dC.f17843c = lVar;
                ZoneId zoneId2 = dC.f17842b;
                if (zoneId2 != null) {
                    zoneId = zoneId2;
                } else {
                    dateTimeFormatter.getClass();
                }
                dC.f17842b = zoneId;
                dC.f17845e = this.f17852d;
                dC.j();
                dC.s(dC.f17843c.L(dC.f17841a, dC.f17845e));
                dC.o();
                if (((HashMap) dC.f17841a).size() > 0) {
                    loop0: while (i10 < 50) {
                        Iterator it = ((HashMap) dC.f17841a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            temporalField2 = (TemporalField) ((Map.Entry) it.next()).getKey();
                            TemporalAccessor temporalAccessorP = temporalField2.p(dC.f17841a, dC, dC.f17845e);
                            if (temporalAccessorP != null) {
                                if (temporalAccessorP instanceof ChronoZonedDateTime) {
                                    ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorP;
                                    ZoneId zoneId3 = dC.f17842b;
                                    if (zoneId3 == null) {
                                        dC.f17842b = chronoZonedDateTime.getZone();
                                    } else if (!zoneId3.equals(chronoZonedDateTime.getZone())) {
                                        throw new j$.time.b("ChronoZonedDateTime must use the effective parsed zone: " + dC.f17842b);
                                    }
                                    temporalAccessorP = chronoZonedDateTime.q();
                                }
                                if (temporalAccessorP instanceof InterfaceC1049e) {
                                    InterfaceC1049e interfaceC1049e = (InterfaceC1049e) temporalAccessorP;
                                    dC.p(interfaceC1049e.b(), j$.time.p.f17946d);
                                    dC.s(interfaceC1049e.f());
                                    break;
                                }
                                if (temporalAccessorP instanceof InterfaceC1046b) {
                                    dC.s((InterfaceC1046b) temporalAccessorP);
                                    break;
                                }
                                if (temporalAccessorP instanceof LocalTime) {
                                    dC.p((LocalTime) temporalAccessorP, j$.time.p.f17946d);
                                    break;
                                }
                                throw new j$.time.b("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) dC.f17841a).containsKey(temporalField2));
                        i10++;
                    }
                    if (i10 == 50) {
                        throw new j$.time.b("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i10 > 0) {
                        dC.j();
                        dC.s(dC.f17843c.L(dC.f17841a, dC.f17845e));
                        dC.o();
                    }
                }
                if (dC.g == null) {
                    Map map2 = dC.f17841a;
                    ChronoField chronoField3 = ChronoField.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(chronoField3)) {
                        long jLongValue = ((Long) ((HashMap) dC.f17841a).remove(chronoField3)).longValue();
                        Map map3 = dC.f17841a;
                        ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(chronoField4)) {
                            long jLongValue2 = (((Long) ((HashMap) dC.f17841a).get(chronoField4)).longValue() % 1000) + (jLongValue * 1000);
                            dC.u(chronoField3, chronoField4, Long.valueOf(jLongValue2));
                            ((HashMap) dC.f17841a).remove(chronoField4);
                            ((HashMap) dC.f17841a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) dC.f17841a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = dC.f17841a;
                        ChronoField chronoField5 = ChronoField.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(chronoField5)) {
                            ((HashMap) dC.f17841a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) dC.f17841a).remove(chronoField5)).longValue() * 1000));
                        }
                    }
                    Map map5 = dC.f17841a;
                    ChronoField chronoField6 = ChronoField.HOUR_OF_DAY;
                    Long l10 = (Long) ((HashMap) map5).get(chronoField6);
                    if (l10 != null) {
                        Map map6 = dC.f17841a;
                        ChronoField chronoField7 = ChronoField.MINUTE_OF_HOUR;
                        Long l11 = (Long) ((HashMap) map6).get(chronoField7);
                        Map map7 = dC.f17841a;
                        ChronoField chronoField8 = ChronoField.SECOND_OF_MINUTE;
                        Long l12 = (Long) ((HashMap) map7).get(chronoField8);
                        Map map8 = dC.f17841a;
                        ChronoField chronoField9 = ChronoField.NANO_OF_SECOND;
                        Long l13 = (Long) ((HashMap) map8).get(chronoField9);
                        if ((l11 != null || (l12 == null && l13 == null)) && (l11 == null || l12 != null || l13 == null)) {
                            long jLongValue3 = l11 != null ? l11.longValue() : 0L;
                            long jLongValue4 = l12 != null ? l12.longValue() : 0L;
                            long jLongValue5 = l13 != null ? l13.longValue() : 0L;
                            long j10 = jLongValue4;
                            j = 1000000;
                            dC.n(l10.longValue(), jLongValue3, j10, jLongValue5);
                            ((HashMap) dC.f17841a).remove(chronoField6);
                            ((HashMap) dC.f17841a).remove(chronoField7);
                            ((HashMap) dC.f17841a).remove(chronoField8);
                            ((HashMap) dC.f17841a).remove(chronoField9);
                        } else {
                            j = 1000000;
                        }
                    } else {
                        j = 1000000;
                    }
                    if (dC.f17845e != E.LENIENT && ((HashMap) dC.f17841a).size() > 0) {
                        for (Map.Entry entry : ((HashMap) dC.f17841a).entrySet()) {
                            temporalField = (TemporalField) entry.getKey();
                            if (temporalField instanceof ChronoField) {
                                chronoField = (ChronoField) temporalField;
                                if (chronoField.R()) {
                                    chronoField.Q(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else {
                    j = 1000000;
                    if (dC.f17845e != E.LENIENT) {
                        while (r1.hasNext()) {
                            temporalField = (TemporalField) entry.getKey();
                            if (temporalField instanceof ChronoField) {
                                chronoField = (ChronoField) temporalField;
                                if (chronoField.R()) {
                                    chronoField.Q(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                }
                InterfaceC1046b interfaceC1046b = dC.f17846f;
                if (interfaceC1046b != null) {
                    dC.i(interfaceC1046b);
                }
                LocalTime localTime = dC.g;
                if (localTime != null) {
                    dC.i(localTime);
                    if (dC.f17846f != null && ((HashMap) dC.f17841a).size() > 0) {
                        dC.i(dC.f17846f.F(dC.g));
                    }
                }
                if (dC.f17846f != null && dC.g != null) {
                    j$.time.p pVar = dC.f17847h;
                    pVar.getClass();
                    j$.time.p pVar2 = j$.time.p.f17946d;
                    if (pVar != pVar2) {
                        dC.f17846f = dC.f17846f.K(dC.f17847h);
                        dC.f17847h = pVar2;
                    }
                }
                if (dC.g == null) {
                    if (((HashMap) dC.f17841a).containsKey(ChronoField.INSTANT_SECONDS)) {
                        map = dC.f17841a;
                        chronoField2 = ChronoField.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(chronoField2)) {
                            long jLongValue6 = ((Long) ((HashMap) dC.f17841a).get(chronoField2)).longValue();
                            ((HashMap) dC.f17841a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 / 1000));
                            ((HashMap) dC.f17841a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue6 / j));
                        } else {
                            ((HashMap) dC.f17841a).put(chronoField2, 0L);
                            ((HashMap) dC.f17841a).put(ChronoField.MICRO_OF_SECOND, 0L);
                            ((HashMap) dC.f17841a).put(ChronoField.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) dC.f17841a).containsKey(ChronoField.SECOND_OF_DAY)) {
                        map = dC.f17841a;
                        chronoField2 = ChronoField.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(chronoField2)) {
                            long jLongValue7 = ((Long) ((HashMap) dC.f17841a).get(chronoField2)).longValue();
                            ((HashMap) dC.f17841a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue7 / 1000));
                            ((HashMap) dC.f17841a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 / j));
                        } else {
                            ((HashMap) dC.f17841a).put(chronoField2, 0L);
                            ((HashMap) dC.f17841a).put(ChronoField.MICRO_OF_SECOND, 0L);
                            ((HashMap) dC.f17841a).put(ChronoField.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) dC.f17841a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                        map = dC.f17841a;
                        chronoField2 = ChronoField.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(chronoField2)) {
                            long jLongValue8 = ((Long) ((HashMap) dC.f17841a).get(chronoField2)).longValue();
                            ((HashMap) dC.f17841a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue8 / 1000));
                            ((HashMap) dC.f17841a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue8 / j));
                        } else {
                            ((HashMap) dC.f17841a).put(chronoField2, 0L);
                            ((HashMap) dC.f17841a).put(ChronoField.MICRO_OF_SECOND, 0L);
                            ((HashMap) dC.f17841a).put(ChronoField.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (dC.f17846f != null && dC.g != null) {
                    Long l14 = (Long) ((HashMap) dC.f17841a).get(ChronoField.OFFSET_SECONDS);
                    if (l14 != null) {
                        ((HashMap) dC.f17841a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(dC.f17846f.F(dC.g).B(ZoneOffset.Z(l14.intValue())).toEpochSecond()));
                        return dC;
                    }
                    if (dC.f17842b != null) {
                        ((HashMap) dC.f17841a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(dC.f17846f.F(dC.g).B(dC.f17842b).toEpochSecond()));
                    }
                }
                return dC;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new w(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new w(str2, charSequence);
    }

    public final String toString() {
        String string = this.f17849a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
