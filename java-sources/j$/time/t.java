package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17957b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f17957b = iArr;
        try {
            iArr[ChronoUnit.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17957b[ChronoUnit.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17957b[ChronoUnit.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17957b[ChronoUnit.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17957b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17957b[ChronoUnit.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f17956a = iArr2;
        try {
            iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17956a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17956a[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f17956a[ChronoField.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f17956a[ChronoField.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
