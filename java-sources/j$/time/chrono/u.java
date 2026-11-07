package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17816a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f17816a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17816a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17816a[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17816a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17816a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17816a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f17816a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17816a[ChronoField.ERA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17816a[ChronoField.YEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
