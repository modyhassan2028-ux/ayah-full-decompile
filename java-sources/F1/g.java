package F1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2162e;

    public g(String str, String str2, String str3, List list) {
        str.getClass();
        this.f2158a = str;
        str2.getClass();
        this.f2159b = str2;
        this.f2160c = str3;
        list.getClass();
        this.f2161d = list;
        this.f2162e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2158a + ", mProviderPackage: " + this.f2159b + ", mQuery: " + this.f2160c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f2161d;
            if (i10 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i10++;
        }
    }
}
