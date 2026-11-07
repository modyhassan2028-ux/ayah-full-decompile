package p086i1;

import U0.C0516h;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a(int i10, String str, List list) {
        C0516h c0516h = C0516h.f8080t;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 32) != 0) {
            c0516h = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) str);
            }
            if (c0516h != null) {
                sb.append((CharSequence) c0516h.e(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
