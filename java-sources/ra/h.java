package ra;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Da.k f21674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f21675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f21676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f21677d;

    static {
        Da.k kVar = Da.k.f1363u;
        f21674a = R7.f.m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f21675b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f21676c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            p251z9.j.d(binaryString, "toBinaryString(...)");
            String strReplace = la.e.c("%8s", binaryString).replace(' ', '0');
            p251z9.j.d(strReplace, "replace(...)");
            strArr[i10] = strReplace;
        }
        f21677d = strArr;
        String[] strArr2 = f21676c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = android.support.v4.media.session.p.B(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f21676c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i14]);
            sb.append('|');
            strArr3[i15 | 8] = android.support.v4.media.session.p.B(sb, strArr3[i13], "|PADDED");
        }
        int length = f21676c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f21676c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f21677d[i16];
            }
        }
    }

    public static String a(int i10) {
        String[] strArr = f21675b;
        return i10 < strArr.length ? strArr[i10] : la.e.c("0x%02x", Integer.valueOf(i10));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    public static String b(boolean z10, int i10, int i11, int i12, int i13) {
        String strP0;
        String str;
        String strA = a(i12);
        if (i13 == 0) {
            strP0 = "";
        } else {
            String[] strArr = f21677d;
            if (i12 == 2 || i12 == 3) {
                strP0 = strArr[i13];
            } else if (i12 == 4 || i12 == 6) {
                strP0 = i13 == 1 ? "ACK" : strArr[i13];
            } else if (i12 == 7 || i12 == 8) {
                strP0 = strArr[i13];
            } else {
                String[] strArr2 = f21676c;
                if (i13 < strArr2.length) {
                    str = strArr2[i13];
                    p251z9.j.b(str);
                } else {
                    str = strArr[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strP0 = (i12 != 0 || (i13 & 32) == 0) ? str : H9.v.P0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strP0 = H9.v.P0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return la.e.c("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strA, strP0);
    }

    public static String c(boolean z10, int i10, int i11, long j) {
        return la.e.c("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), a(8), Long.valueOf(j));
    }
}
