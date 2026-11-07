package i7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import p056f2.AbstractC0939l;

/* JADX INFO: renamed from: i7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981g extends AbstractC0939l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f17358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0978f f17360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f17361v;

    public final Boolean A(String str) {
        U6.y.c(str);
        Bundle bundleZ = z();
        if (bundleZ != null) {
            if (bundleZ.containsKey(str)) {
                return Boolean.valueOf(bundleZ.getBoolean(str));
            }
            return null;
        }
        X x9 = ((C1023u0) this.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17182w.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean B() {
        ((C1023u0) this.f16104r).getClass();
        Boolean boolA = A("firebase_analytics_collection_deactivated");
        return boolA != null && boolA.booleanValue();
    }

    public final boolean C() {
        Boolean boolA = A("google_analytics_automatic_screen_reporting_enabled");
        return boolA == null || boolA.booleanValue();
    }

    public final E0 D(String str, boolean z10) {
        Object obj;
        U6.y.c(str);
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        Bundle bundleZ = z();
        if (bundleZ == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZ.get(str);
        }
        E0 e10 = E0.f16862s;
        if (obj == null) {
            return e10;
        }
        if (Boolean.TRUE.equals(obj)) {
            return E0.f16865v;
        }
        if (Boolean.FALSE.equals(obj)) {
            return E0.f16864u;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return E0.f16863t;
        }
        X x10 = c1023u0.f17584w;
        C1023u0.m(x10);
        x10.f17185z.b(str, "Invalid manifest metadata for");
        return e10;
    }

    public final boolean p(String str) {
        return "1".equals(this.f17360u.a(str, "gaia_collection_enabled"));
    }

    public final boolean q(String str) {
        return "1".equals(this.f17360u.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean r() {
        if (this.f17358s == null) {
            Boolean boolA = A("app_measurement_lite");
            this.f17358s = boolA;
            if (boolA == null) {
                this.f17358s = Boolean.FALSE;
            }
        }
        return this.f17358s.booleanValue() || !((C1023u0) this.f16104r).f17580s;
    }

    public final String s(String str) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            U6.y.f(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17182w.b(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            X x12 = c1023u0.f17584w;
            C1023u0.m(x12);
            x12.f17182w.b(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void t() {
        ((C1023u0) this.f16104r).getClass();
    }

    public final String u(String str, F f3) {
        return TextUtils.isEmpty(str) ? (String) f3.a(null) : (String) f3.a(this.f17360u.a(str, f3.f16870a));
    }

    public final long v(String str, F f3) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) f3.a(null)).longValue();
        }
        String strA = this.f17360u.a(str, f3.f16870a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) f3.a(null)).longValue();
        }
        try {
            return ((Long) f3.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) f3.a(null)).longValue();
        }
    }

    public final int w(String str, F f3) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) f3.a(null)).intValue();
        }
        String strA = this.f17360u.a(str, f3.f16870a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) f3.a(null)).intValue();
        }
        try {
            return ((Integer) f3.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) f3.a(null)).intValue();
        }
    }

    public final double x(String str, F f3) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) f3.a(null)).doubleValue();
        }
        String strA = this.f17360u.a(str, f3.f16870a);
        if (TextUtils.isEmpty(strA)) {
            return ((Double) f3.a(null)).doubleValue();
        }
        try {
            return ((Double) f3.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) f3.a(null)).doubleValue();
        }
    }

    public final boolean y(String str, F f3) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) f3.a(null)).booleanValue();
        }
        String strA = this.f17360u.a(str, f3.f16870a);
        return TextUtils.isEmpty(strA) ? ((Boolean) f3.a(null)).booleanValue() : ((Boolean) f3.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final Bundle z() {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        try {
            Context context = c1023u0.f17579r;
            X x9 = c1023u0.f17584w;
            if (context.getPackageManager() == null) {
                C1023u0.m(x9);
                x9.f17182w.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            N0.a aVarA = Z6.b.a(context);
            ApplicationInfo applicationInfo = ((Context) aVarA.f5961a).getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            C1023u0.m(x9);
            x9.f17182w.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
