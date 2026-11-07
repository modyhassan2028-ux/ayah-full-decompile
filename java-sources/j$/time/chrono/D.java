package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17777a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f17777a = iArr;
        try {
            iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17777a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17777a[ChronoField.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
