package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f17837a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f17838b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f17839c = new B();

    public String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object objA = a(temporalField, locale);
        if (objA instanceof A) {
            return ((A) objA).a(j, textStyle);
        }
        return null;
    }

    public String b(j$.time.chrono.l lVar, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (lVar == j$.time.chrono.q.f17812c || !(temporalField instanceof ChronoField)) {
            return c(temporalField, j, textStyle, locale);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(temporalField, locale);
        if (!(objA instanceof A) || (list = (List) ((HashMap) ((A) objA).f17836b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(j$.time.chrono.l lVar, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (lVar == j$.time.chrono.q.f17812c || !(temporalField instanceof ChronoField)) {
            return e(temporalField, textStyle, locale);
        }
        return null;
    }

    public static Object a(TemporalField temporalField, Locale locale) {
        Object a9;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        ConcurrentHashMap concurrentHashMap = f17837a;
        V v10 = concurrentHashMap.get(simpleImmutableEntry);
        if (v10 != 0) {
            return v10;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i10 = 0; i10 < eras.length; i10++) {
                if (!eras[i10].isEmpty()) {
                    long j = i10;
                    map2.put(Long.valueOf(j), eras[i10]);
                    Long lValueOf = Long.valueOf(j);
                    String str = eras[i10];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            a9 = new A(map);
        } else {
            long j10 = 1;
            if (temporalField == ChronoField.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j11 = 1; j11 <= length; j11++) {
                    String strY = j$.com.android.tools.r8.a.y(j11, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j11), strY);
                    linkedHashMap2.put(Long.valueOf(j11), strY.substring(0, Character.charCount(strY.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j11), j$.com.android.tools.r8.a.y(j11, "LLL", locale));
                }
                if (length > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                    map.put(TextStyle.FULL, linkedHashMap);
                    map.put(TextStyle.NARROW, linkedHashMap2);
                    map.put(TextStyle.SHORT, linkedHashMap3);
                }
                a9 = new A(map);
            } else if (temporalField == ChronoField.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z10 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j12 = 1;
                while (j12 <= length2) {
                    String strX = j$.com.android.tools.r8.a.x(j12, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j12), strX);
                    Long lValueOf2 = Long.valueOf(j12);
                    if (!z10) {
                        strSubstring = strX.substring(0, Character.charCount(strX.codePointAt(0)));
                    } else {
                        strSubstring = new StringBuilder().appendCodePoint(strX.codePointBefore(strX.length())).toString();
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(Long.valueOf(j12), j$.com.android.tools.r8.a.x(j12, "ccc", locale));
                    j12 += j10;
                    j10 = j10;
                }
                if (length2 > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                    map.put(TextStyle.FULL, linkedHashMap4);
                    map.put(TextStyle.NARROW, linkedHashMap5);
                    map.put(TextStyle.SHORT, linkedHashMap6);
                }
                a9 = new A(map);
            } else if (temporalField == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i11 = 0; i11 < amPmStrings.length; i11++) {
                    if (!amPmStrings[i11].isEmpty()) {
                        long j13 = i11;
                        map4.put(Long.valueOf(j13), amPmStrings[i11]);
                        Long lValueOf3 = Long.valueOf(j13);
                        String str2 = amPmStrings[i11];
                        map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(TextStyle.FULL, map4);
                    map.put(TextStyle.SHORT, map4);
                    map.put(TextStyle.NARROW, map5);
                }
                a9 = new A(map);
            } else {
                a9 = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, a9);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
