package i7;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends H1 {
    public static final boolean r(String str) {
        String str2 = (String) G.f16975t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i7.M1 p(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.N1.p(java.lang.String):i7.M1");
    }

    public final String q(String str) {
        C1003n0 c1003n0 = this.f17001s.f17104r;
        Q1.U(c1003n0);
        String strB = c1003n0.B(str);
        if (TextUtils.isEmpty(strB)) {
            return (String) G.f16971r.a(null);
        }
        Uri uri = Uri.parse((String) G.f16971r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(authority).length());
        sb.append(strB);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
