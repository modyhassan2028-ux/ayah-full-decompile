package ra;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int a(int i10, int i11, int i12) {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(android.support.v4.media.session.p.w(i12, i10, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
