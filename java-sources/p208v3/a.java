package p208v3;

import com.ayah.common.data.source.preference.model.AppNotificationType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23325a;

    static {
        int[] iArr = new int[k3.a.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[AppNotificationType.values().length];
        try {
            iArr2[AppNotificationType.DAILY_READING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AppNotificationType.SURA_KAHF.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AppNotificationType.VERSE_OF_THE_DAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f23325a = iArr2;
    }
}
