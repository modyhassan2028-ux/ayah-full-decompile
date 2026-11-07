package j$.time;

import j$.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18010a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18010a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18010a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
