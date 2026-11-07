package j$.time;

import j$.time.format.E;
import j$.time.format.TextStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.k {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Month[] f17757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Month[] f17758b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f17758b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f17758b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f17757a = values();
    }

    public static Month T(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new b("Invalid value for MonthOfYear: " + i10);
        }
        return f17757a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.j(ChronoField.MONTH_OF_YEAR, textStyle);
        return uVar.r(locale, E.SMART, null).a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.MONTH_OF_YEAR;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.v();
        }
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(this);
    }

    public final int R(boolean z10) {
        int i10 = j.f17936a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return z10 ? 29 : 28;
    }

    public final int S() {
        int i10 = j.f17936a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int Q(boolean z10) {
        switch (j.f17936a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17980b) {
            return j$.time.chrono.q.f17812c;
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.n.c(this, fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.z(temporal).equals(j$.time.chrono.q.f17812c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.c(getValue(), ChronoField.MONTH_OF_YEAR);
    }
}
