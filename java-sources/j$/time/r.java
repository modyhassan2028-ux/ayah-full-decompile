package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17953b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f17953b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17953b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17953b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17953b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17953b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f17952a = iArr2;
        try {
            iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f17952a[ChronoField.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17952a[ChronoField.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
