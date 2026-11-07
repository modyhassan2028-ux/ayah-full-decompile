package p050e8;

import H8.d;
import I8.b;
import T6.c;
import U6.y;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.K1;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p100j8.a;
import p100j8.e;
import p100j8.l;
import p109k8.j;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f15841k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1350e f15842l = new C1350e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f15845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f15846d;
    public final l g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f15849h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15847e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15848f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f15850i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public f(Context context, String str, h hVar) {
        ?? arrayList;
        Iterator it;
        this.f15843a = context;
        y.c(str);
        this.f15844b = str;
        this.f15845c = hVar;
        a aVar = FirebaseInitProvider.f15403r;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
            while (true) {
                ?? r10 = 1;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList2.add(new J8.b(r10 == true ? 1 : 0, (String) it.next()));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        it = arrayList.iterator();
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.f19063r;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 2;
        arrayList3.add(new J8.b(i10, new FirebaseCommonRegistrar()));
        arrayList3.add(new J8.b(i10, new ExecutorsRegistrar()));
        arrayList4.add(a.c(context, Context.class, new Class[0]));
        arrayList4.add(a.c(this, f.class, new Class[0]));
        arrayList4.add(a.c(hVar, h.class, new Class[0]));
        R7.f fVar = new R7.f(16);
        if ((Build.VERSION.SDK_INT >= 24 ? K1.j(context) : true) && FirebaseInitProvider.f15404s.get()) {
            arrayList4.add(a.c(aVar, a.class, new Class[0]));
        }
        e eVar = new e(arrayList3, arrayList4, fVar);
        this.f15846d = eVar;
        Trace.endSection();
        this.g = new l(new H8.b(this, context));
        this.f15849h = eVar.f(d.class);
        c cVar = new c(this);
        a();
        if (this.f15847e.get()) {
            c.f7809v.f7810r.get();
        }
        this.f15850i.add(cVar);
        Trace.endSection();
    }

    public static f b() {
        f fVar;
        synchronized (f15841k) {
            try {
                fVar = (f) f15842l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + Y6.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((d) fVar.f15849h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f e(Context context) {
        synchronized (f15841k) {
            try {
                if (f15842l.containsKey("[DEFAULT]")) {
                    return b();
                }
                h hVarA = h.a(context);
                if (hVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, hVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f15838a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f15838a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                do {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        c.b(application);
                        c.f7809v.a(dVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f15841k) {
            C1350e c1350e = f15842l;
            y.h("FirebaseApp name [DEFAULT] already exists!", !c1350e.containsKey("[DEFAULT]"));
            y.g(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", hVar);
            c1350e.put("[DEFAULT]", fVar);
        }
        fVar.d();
        return fVar;
    }

    public final void a() {
        y.h("FirebaseApp was deleted", !this.f15848f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f15844b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f15845c.f15857b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? K1.j(this.f15843a) : true)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f15844b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f15843a;
            AtomicReference atomicReference = e.f15839b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f15844b);
        Log.i("FirebaseApp", sb2.toString());
        e eVar2 = this.f15846d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f15844b);
        AtomicReference atomicReference2 = eVar2.f18799f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((d) this.f15849h.get()).b();
            }
        }
        synchronized (eVar2) {
            map = new HashMap(eVar2.f18794a);
        }
        eVar2.a(map, zEquals);
        ((d) this.f15849h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f15844b.equals(fVar.f15844b);
    }

    public final boolean g() {
        boolean z10;
        a();
        N8.a aVar = (N8.a) this.g.get();
        synchronized (aVar) {
            z10 = aVar.f6069a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f15844b.hashCode();
    }

    public final String toString() {
        L5.c cVar = new L5.c(this);
        cVar.k(this.f15844b, "name");
        cVar.k(this.f15845c, "options");
        return cVar.toString();
    }
}
