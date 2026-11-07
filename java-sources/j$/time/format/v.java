package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f17919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17920b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17921c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f17923e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f17922d = arrayList;
        this.f17923e = null;
        this.f17919a = dateTimeFormatter;
        arrayList.add(new D());
    }

    public final boolean a(char c10, char c11) {
        if (this.f17920b) {
            return c10 == c11;
        }
        return b(c10, c11);
    }

    public final boolean g(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 <= charSequence.length() && i11 + i12 <= charSequence2.length()) {
            if (this.f17920b) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (charSequence.charAt(i10 + i13) == charSequence2.charAt(i11 + i13)) {
                    }
                }
                return true;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                char cCharAt = charSequence.charAt(i10 + i14);
                char cCharAt2 = charSequence2.charAt(i11 + i14);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    public final D c() {
        ArrayList arrayList = this.f17922d;
        return (D) arrayList.get(arrayList.size() - 1);
    }

    public final Long d(ChronoField chronoField) {
        return (Long) ((HashMap) c().f17841a).get(chronoField);
    }

    public final int f(TemporalField temporalField, long j, int i10, int i11) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) ((HashMap) c().f17841a).put(temporalField, Long.valueOf(j));
        return (l10 == null || l10.longValue() == j) ? i11 : ~i10;
    }

    public final void e(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f17842b = zoneId;
    }

    public final String toString() {
        return c().toString();
    }
}
