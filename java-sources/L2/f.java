package L2;

import H9.o;
import H9.p;
import com.google.android.gms.internal.measurement.B1;
import java.util.Locale;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5476f;
    public final int g;

    public f(String str, String str2, boolean z10, int i10, String str3, int i11) {
        j.e(str, "name");
        j.e(str2, "type");
        this.f5471a = str;
        this.f5472b = str2;
        this.f5473c = z10;
        this.f5474d = i10;
        this.f5475e = str3;
        this.f5476f = i11;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        j.d(upperCase, "toUpperCase(...)");
        this.g = o.V0(upperCase, "INT") ? 3 : (o.V0(upperCase, "CHAR") || o.V0(upperCase, "CLOB") || o.V0(upperCase, "TEXT")) ? 2 : o.V0(upperCase, "BLOB") ? 5 : (o.V0(upperCase, "REAL") || o.V0(upperCase, "FLOA") || o.V0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                boolean z10 = this.f5474d > 0;
                f fVar = (f) obj;
                int i10 = fVar.f5476f;
                if (z10 == (fVar.f5474d > 0) && j.a(this.f5471a, fVar.f5471a) && this.f5473c == fVar.f5473c) {
                    String str = fVar.f5475e;
                    int i11 = this.f5476f;
                    String str2 = this.f5475e;
                    if ((i11 != 1 || i10 != 2 || str2 == null || B1.v(str2, str)) && ((i11 != 2 || i10 != 1 || str == null || B1.v(str, str2)) && ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : B1.v(str2, str))) && this.g == fVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f5471a.hashCode() * 31) + this.g) * 31) + (this.f5473c ? 1231 : 1237)) * 31) + this.f5474d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f5471a);
        sb.append("',\n            |   type = '");
        sb.append(this.f5472b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f5473c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f5474d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f5475e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return p.H0(p.J0(sb.toString()));
    }
}
