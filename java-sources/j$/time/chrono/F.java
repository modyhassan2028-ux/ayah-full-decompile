package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17779a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f17779a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17779a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17779a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17779a[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17779a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17779a[ChronoField.YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f17779a[ChronoField.ERA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
