package p178r8;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21611a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21612b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21613c;

    public e(int i10) {
        this.f21613c = i10;
    }

    public static String b(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f21611a));
    }

    public final synchronized boolean c(String str) {
        boolean zEquals;
        String strB = b(this.f21613c, "com.crashlytics.version-control-info");
        if (this.f21611a.size() >= this.f21612b && !this.f21611a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f21612b, null);
            return false;
        }
        String strB2 = b(this.f21613c, str);
        String str2 = (String) this.f21611a.get(strB);
        if (str2 == null) {
            zEquals = strB2 == null;
        } else {
            zEquals = str2.equals(strB2);
        }
        if (zEquals) {
            return false;
        }
        this.f21611a.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.f21613c, str);
                if (this.f21611a.size() < this.f21612b || this.f21611a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.f21611a.put(strB, str2 == null ? "" : b(this.f21613c, str2));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f21612b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
