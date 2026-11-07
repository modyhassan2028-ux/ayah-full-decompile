package k3;

import j$.time.DayOfWeek;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18977a;

    static {
        int[] iArr = new int[DayOfWeek.values().length];
        try {
            iArr[DayOfWeek.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DayOfWeek.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DayOfWeek.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DayOfWeek.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DayOfWeek.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DayOfWeek.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DayOfWeek.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f18977a = iArr;
    }
}
