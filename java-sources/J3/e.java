package J3;

import com.ayah.common.data.source.preference.model.AppNotificationType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4247a;

    static {
        int[] iArr = new int[AppNotificationType.values().length];
        try {
            iArr[AppNotificationType.DAILY_READING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppNotificationType.SURA_KAHF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AppNotificationType.VERSE_OF_THE_DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4247a = iArr;
    }
}
