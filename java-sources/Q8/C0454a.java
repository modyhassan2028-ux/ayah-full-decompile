package Q8;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0454a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f6944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6945e;

    public C0454a(String str, String str2, String str3, G g, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        p251z9.j.e(str2, "versionName");
        p251z9.j.e(str3, "appBuildVersion");
        p251z9.j.e(str4, "deviceManufacturer");
        this.f6941a = str;
        this.f6942b = str2;
        this.f6943c = str3;
        this.f6944d = g;
        this.f6945e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0454a)) {
            return false;
        }
        C0454a c0454a = (C0454a) obj;
        if (!this.f6941a.equals(c0454a.f6941a) || !p251z9.j.a(this.f6942b, c0454a.f6942b) || !p251z9.j.a(this.f6943c, c0454a.f6943c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return p251z9.j.a(str, str) && this.f6944d.equals(c0454a.f6944d) && this.f6945e.equals(c0454a.f6945e);
    }

    public final int hashCode() {
        return this.f6945e.hashCode() + ((this.f6944d.hashCode() + p245z2.a.x(Build.MANUFACTURER, p245z2.a.x(this.f6943c, p245z2.a.x(this.f6942b, this.f6941a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f6941a + ", versionName=" + this.f6942b + ", appBuildVersion=" + this.f6943c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f6944d + ", appProcessDetails=" + this.f6945e + ')';
    }
}
