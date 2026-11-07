package Q8;

import android.os.Build;

/* JADX INFO: renamed from: Q8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0455b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0454a f6948b;

    public C0455b(String str, C0454a c0454a) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        p251z9.j.e(str, "appId");
        p251z9.j.e(str2, "deviceModel");
        p251z9.j.e(str3, "osVersion");
        this.f6947a = str;
        this.f6948b = c0454a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0455b)) {
            return false;
        }
        C0455b c0455b = (C0455b) obj;
        if (!p251z9.j.a(this.f6947a, c0455b.f6947a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!p251z9.j.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return p251z9.j.a(str2, str2) && this.f6948b.equals(c0455b.f6948b);
    }

    public final int hashCode() {
        return this.f6948b.hashCode() + ((A.LOG_ENVIRONMENT_PROD.hashCode() + p245z2.a.x(Build.VERSION.RELEASE, (((Build.MODEL.hashCode() + (this.f6947a.hashCode() * 31)) * 31) + 48517559) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f6947a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + A.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f6948b + ')';
    }
}
