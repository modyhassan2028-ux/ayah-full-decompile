package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class G1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f14033i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f14034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f14035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f14036c;
    public volatile Map g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public K0.n1 f14037d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f14038e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14039f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f14040h = new ArrayList();

    public G1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f14034a = contentResolver;
        this.f14035b = uri;
        this.f14036c = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v3 com.google.android.gms.internal.measurement.G1) = (r1v2 com.google.android.gms.internal.measurement.G1), (r1v4 com.google.android.gms.internal.measurement.G1) binds: [B:6:0x001c, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static G1 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        G1 g10;
        if (Build.VERSION.SDK_INT >= 24) {
            g10 = (G1) ConcurrentMap$EL.computeIfAbsent(f14033i, uri, new Function() { // from class: com.google.android.gms.internal.measurement.F1
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return new G1(contentResolver, uri, runnable);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            ConcurrentHashMap concurrentHashMap = f14033i;
            G1 g11 = (G1) concurrentHashMap.get(uri);
            if (g11 == null) {
                g11 = new G1(contentResolver, uri, runnable);
                g10 = (G1) concurrentHashMap.putIfAbsent(uri, g11);
                if (g10 == null) {
                    g10 = g11;
                }
            } else {
                g10 = g11;
            }
        }
        try {
            if (!g10.f14038e) {
                return g10;
            }
            synchronized (g10) {
                try {
                    if (g10.f14038e) {
                        K0.n1 n1Var = new K0.n1(g10);
                        g10.f14034a.registerContentObserver(g10.f14035b, false, n1Var);
                        g10.f14037d = n1Var;
                        g10.f14038e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g10;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = f14033i.values().iterator();
        while (it.hasNext()) {
            G1 g10 = (G1) it.next();
            synchronized (g10) {
                try {
                    if (g10.f14038e) {
                        g10.f14038e = false;
                    } else {
                        K0.n1 n1Var = g10.f14037d;
                        if (n1Var != null) {
                            g10.f14034a.unregisterContentObserver(n1Var);
                            g10.f14037d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map b() {
        Map map;
        ?? r10;
        Object objC;
        Map map2 = this.g;
        ?? r11 = map2;
        if (map2 == null) {
            synchronized (this.f14039f) {
                ?? r12 = this.g;
                r10 = r12;
                if (r12 == 0) {
                    try {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                C0902x2 c0902x2 = new C0902x2(this);
                                try {
                                    objC = c0902x2.c();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objC = c0902x2.c();
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    } catch (Throwable th) {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                        throw th;
                                    }
                                }
                                map = (Map) objC;
                            } catch (SecurityException e10) {
                                e = e10;
                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        } catch (IllegalStateException e12) {
                            e = e12;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        this.g = map;
                        r10 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(r12);
                        throw th2;
                    }
                }
            }
            r11 = r10;
        }
        return r11 != 0 ? r11 : Collections.EMPTY_MAP;
    }
}
