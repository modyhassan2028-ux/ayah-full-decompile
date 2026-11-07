package D6;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final SparseArray f1241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ H[] f1242s;

    /* JADX INFO: Fake field, exist only in values array */
    H EF0;

    static {
        H h7 = new H("UNKNOWN_MOBILE_SUBTYPE", 0);
        H h10 = new H("GPRS", 1);
        H h11 = new H("EDGE", 2);
        H h12 = new H("UMTS", 3);
        H h13 = new H("CDMA", 4);
        H h14 = new H("EVDO_0", 5);
        H h15 = new H("EVDO_A", 6);
        H h16 = new H("RTT", 7);
        H h17 = new H("HSDPA", 8);
        H h18 = new H("HSUPA", 9);
        H h19 = new H("HSPA", 10);
        H h20 = new H("IDEN", 11);
        H h21 = new H("EVDO_B", 12);
        H h22 = new H("LTE", 13);
        H h23 = new H("EHRPD", 14);
        H h24 = new H("HSPAP", 15);
        H h25 = new H("GSM", 16);
        H h26 = new H("TD_SCDMA", 17);
        H h27 = new H("IWLAN", 18);
        H h28 = new H("LTE_CA", 19);
        f1242s = new H[]{h7, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22, h23, h24, h25, h26, h27, h28, new H("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f1241r = sparseArray;
        sparseArray.put(0, h7);
        sparseArray.put(1, h10);
        sparseArray.put(2, h11);
        sparseArray.put(3, h12);
        sparseArray.put(4, h13);
        sparseArray.put(5, h14);
        sparseArray.put(6, h15);
        sparseArray.put(7, h16);
        sparseArray.put(8, h17);
        sparseArray.put(9, h18);
        sparseArray.put(10, h19);
        sparseArray.put(11, h20);
        sparseArray.put(12, h21);
        sparseArray.put(13, h22);
        sparseArray.put(14, h23);
        sparseArray.put(15, h24);
        sparseArray.put(16, h25);
        sparseArray.put(17, h26);
        sparseArray.put(18, h27);
        sparseArray.put(19, h28);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f1242s.clone();
    }
}
