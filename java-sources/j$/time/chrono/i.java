package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17804a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f17804a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17804a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
