package C6;

import D0.y;
import D6.s;
import D6.v;
import E6.j;
import E6.u;
import H8.e;
import I1.B0;
import I1.C0249e;
import I1.C0253g;
import I1.InterfaceC0251f;
import I1.S;
import I1.r;
import I1.y0;
import J1.q;
import L6.i;
import N9.k0;
import X3.h;
import Z0.B;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.AboutActivity;
import com.ayah.MainActivity;
import com.ayah.PreferencesActivity;
import com.ayah.R;
import com.ayah.feature.quran.view.QuranPage;
import com.ayah.feature.quran.view.QuranPageViewGroup;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import com.ayah.note.NoteActivity;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import i7.C;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p035d3.DialogInterfaceOnClickListenerC0926h;
import p035d3.z;
import p050e8.f;
import p084i.C0956d;
import p100j8.n;
import p100j8.p;
import p118l7.o;
import p151p.C1256n;
import p151p.V;
import p151p.f1;
import p151p.m1;
import p160p8.g;
import p160p8.k;
import p160p8.m;
import p160p8.t;
import p160p8.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p100j8.c, M6.b, r, p053f.b, q, f1, I8.a, p118l7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f771s;

    public /* synthetic */ b(int i10, Object obj) {
        this.f770r = i10;
        this.f771s = obj;
    }

    @Override // p118l7.a
    public Object a(o oVar) {
        switch (this.f770r) {
            case 23:
                ((CountDownLatch) this.f771s).countDown();
                return null;
            case 24:
                return (o) ((k) this.f771s).call();
            default:
                ((Runnable) this.f771s).run();
                return p000a.a.E(null);
        }
    }

    @Override // M6.b
    public Object b() {
        int i10 = this.f770r;
        Object obj = this.f771s;
        switch (i10) {
            case 4:
                i iVar = (i) ((L6.c) obj);
                iVar.getClass();
                int i11 = H6.a.f3405e;
                Aa.a aVar = new Aa.a();
                aVar.f554r = null;
                aVar.f556t = new ArrayList();
                aVar.f555s = null;
                aVar.f557u = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseB = iVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    H6.a aVar2 = (H6.a) i.E(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new J6.b(iVar, map, aVar, 3));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar2;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            case 5:
                i iVar2 = (i) ((L6.d) obj);
                long jE = iVar2.f5551s.e() - iVar2.f5553u.f5538d;
                SQLiteDatabase sQLiteDatabaseB2 = iVar2.b();
                sQLiteDatabaseB2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jE)};
                    Cursor cursorRawQuery = sQLiteDatabaseB2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            iVar2.s(cursorRawQuery.getInt(0), H6.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB2.setTransactionSuccessful();
                    sQLiteDatabaseB2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseB2.endTransaction();
                    throw th2;
                }
            case 6:
                i iVar3 = (i) ((L6.c) ((s) obj).f1315i);
                SQLiteDatabase sQLiteDatabaseB3 = iVar3.b();
                sQLiteDatabaseB3.beginTransaction();
                try {
                    sQLiteDatabaseB3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar3.f5551s.e()).execute();
                    sQLiteDatabaseB3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseB3.endTransaction();
                }
            default:
                Aa.a aVar3 = (Aa.a) obj;
                Iterator it = ((Iterable) ((i) ((L6.d) aVar3.f555s)).i(new J1.c(10))).iterator();
                while (it.hasNext()) {
                    ((android.support.v4.media.session.r) aVar3.f556t).M((j) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x045c  */
    @Override // p100j8.c
    public Object c(u uVar) {
        p160p8.r rVar;
        p170q8.c cVar;
        int i10;
        int i11;
        int i12;
        Throwable th;
        String str;
        p119l8.b bVar;
        o oVar;
        o oVarH;
        boolean z10;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        x8.b bVarA;
        switch (this.f770r) {
            case 2:
                return new H8.d((Context) uVar.b(Context.class), ((f) uVar.b(f.class)).c(), uVar.B(e.class), uVar.f(O8.b.class), (Executor) uVar.e((p) this.f771s));
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return this.f771s;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f771s;
                int i13 = CrashlyticsRegistrar.f15399d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                f fVar = (f) uVar.b(f.class);
                J8.e eVar = (J8.e) uVar.b(J8.e.class);
                n nVarL = uVar.l(m8.a.class);
                n nVarL2 = uVar.l(p070g8.a.class);
                n nVarL3 = uVar.l(P8.a.class);
                ExecutorService executorService = (ExecutorService) uVar.e(crashlyticsRegistrar.f15400a);
                ExecutorService executorService2 = (ExecutorService) uVar.e(crashlyticsRegistrar.f15401b);
                ExecutorService executorService3 = (ExecutorService) uVar.e(crashlyticsRegistrar.f15402c);
                fVar.a();
                Context context = fVar.f15843a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.0 for " + packageName, null);
                p170q8.c cVar2 = new p170q8.c(executorService, executorService2);
                p213v8.b bVar2 = new p213v8.b(context);
                T6.k kVar = new T6.k(fVar);
                x xVar = new x(context, packageName, eVar, kVar);
                m8.a aVar = new m8.a(nVarL);
                p013b2.f fVar2 = new p013b2.f(nVarL2);
                p160p8.j jVar = new p160p8.j(kVar, bVar2);
                R8.c cVar3 = R8.c.f7404a;
                R8.d dVar = R8.d.f7406r;
                R8.c cVar4 = R8.c.f7404a;
                R8.a aVarA = R8.c.a(dVar);
                if (aVarA.f7394b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar + " already registered.");
                } else {
                    aVarA.f7394b = jVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar + " registered.");
                    aVarA.f7393a.b(null);
                }
                p160p8.r rVar2 = new p160p8.r(fVar, xVar, aVar, kVar, new p119l8.a(fVar2), new p119l8.a(fVar2), bVar2, jVar, new B(20, nVarL3), cVar2);
                p170q8.c cVar5 = rVar2.f21126o;
                fVar.a();
                String str2 = fVar.f15845c.f15857b;
                int iD = g.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iD == 0) {
                    iD = g.d(context, "com.crashlytics.android.build_id", "string");
                }
                String string = iD != 0 ? context.getResources().getString(iD) : null;
                ArrayList arrayList = new ArrayList();
                int iD2 = g.d(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iD3 = g.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iD4 = g.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iD2 == 0 || iD3 == 0 || iD4 == 0) {
                    rVar = rVar2;
                    cVar = cVar5;
                    i10 = 2;
                    i11 = 0;
                    i12 = 3;
                    String str3 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th = null;
                        Log.d("FirebaseCrashlytics", str3, null);
                    } else {
                        th = null;
                    }
                } else {
                    i10 = 2;
                    String[] stringArray = context.getResources().getStringArray(iD2);
                    String[] stringArray2 = context.getResources().getStringArray(iD3);
                    String[] stringArray3 = context.getResources().getStringArray(iD4);
                    i11 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i14 = 0;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new p160p8.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                            i14 = i15 + 1;
                            cVar5 = cVar5;
                            rVar2 = rVar2;
                        }
                        rVar = rVar2;
                        cVar = cVar5;
                    } else {
                        rVar = rVar2;
                        cVar = cVar5;
                        String str4 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str4, null);
                        }
                    }
                    th = null;
                    i12 = 3;
                }
                String strS = p123m2.c.s("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i12)) {
                    Log.d("FirebaseCrashlytics", strS, th);
                }
                int size = arrayList.size();
                int i16 = i11;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    p160p8.d dVar2 = (p160p8.d) obj;
                    String str5 = "Build id for " + dVar2.f21062a + " on " + dVar2.f21063b + ": " + dVar2.f21064c;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str5, null);
                    }
                }
                int i17 = i10;
                try {
                    p160p8.a aVarA2 = p160p8.a.a(context, xVar, str2, string, arrayList, new p085i0.n(context));
                    String str6 = "Installer package name is: " + aVarA2.f21052d;
                    if (Log.isLoggable("FirebaseCrashlytics", i17)) {
                        Log.v("FirebaseCrashlytics", str6, null);
                    }
                    new C(14);
                    String str7 = aVarA2.f21054f;
                    String str8 = aVarA2.g;
                    String strD = xVar.d();
                    C c10 = new C(10);
                    C1256n c1256n = new C1256n(15, c10);
                    C1256n c1256n2 = new C1256n(bVar2);
                    Locale locale = Locale.US;
                    String strD2 = p245z2.a.D("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings");
                    V v10 = new V();
                    if (strD2 == null) {
                        throw new IllegalArgumentException("url must not be null.");
                    }
                    v10.f20603r = strD2;
                    String str9 = Build.MANUFACTURER;
                    String str10 = x.f21144h;
                    String str11 = str9.replaceAll(str10, "") + "/" + Build.MODEL.replaceAll(str10, "");
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                    int iD5 = g.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iD5 == 0) {
                        iD5 = g.d(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {iD5 != 0 ? context.getResources().getString(iD5) : null, str2, str8, str7};
                    ArrayList arrayList2 = new ArrayList();
                    int i18 = i11;
                    while (i18 < 4) {
                        String str12 = strArr[i18];
                        String[] strArr2 = strArr;
                        if (str12 != null) {
                            arrayList2.add(str12.replace("-", "").toLowerCase(Locale.US));
                        }
                        i18++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i19 = i11;
                    while (i19 < size2) {
                        Object obj2 = arrayList2.get(i19);
                        i19++;
                        sb.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String string2 = sb.toString();
                    x8.d dVar3 = new x8.d(str2, str11, strReplaceAll, strReplaceAll2, xVar, string2.length() > 0 ? g.h(string2) : null, str8, str7, p123m2.c.m(strD != null ? 4 : 1));
                    s sVar = new s();
                    AtomicReference atomicReference = new AtomicReference();
                    sVar.f1314h = atomicReference;
                    sVar.f1315i = new AtomicReference(new p118l7.i());
                    sVar.f1308a = context;
                    sVar.f1309b = dVar3;
                    sVar.f1311d = c10;
                    sVar.f1310c = c1256n;
                    sVar.f1312e = c1256n2;
                    sVar.f1313f = v10;
                    sVar.g = kVar;
                    atomicReference.set(i7.B.b(c10));
                    AtomicReference atomicReference2 = (AtomicReference) sVar.f1315i;
                    AtomicReference atomicReference3 = (AtomicReference) sVar.f1314h;
                    if (!((Context) sVar.f1308a).getSharedPreferences("com.google.firebase.crashlytics", i11).getString("existing_instance_identifier", "").equals(((x8.d) sVar.f1309b).f24402f) || (bVarA = sVar.a(1)) == null) {
                        x8.b bVarA2 = sVar.a(3);
                        if (bVarA2 != null) {
                            atomicReference3.set(bVarA2);
                            ((p118l7.i) atomicReference2.get()).b(bVarA2);
                        }
                        T6.k kVar2 = (T6.k) sVar.g;
                        o oVar2 = ((p118l7.i) kVar2.f7847f).f19402a;
                        synchronized (kVar2.f7844c) {
                            oVar = ((p118l7.i) kVar2.f7845d).f19402a;
                            break;
                        }
                        oVarH = p170q8.a.a(oVar2, oVar).h(cVar2.f21345a, new p085i0.n(19, sVar, cVar2, false));
                    } else {
                        atomicReference3.set(bVarA);
                        ((p118l7.i) atomicReference2.get()).b(bVarA);
                        oVarH = p000a.a.E(null);
                    }
                    oVarH.a(executorService3, new W2.n(25));
                    p160p8.r rVar3 = rVar;
                    p213v8.b bVar3 = rVar3.f21121i;
                    Context context2 = rVar3.f21114a;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z10 = true;
                    } else {
                        int iD6 = g.d(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iD6 > 0) {
                            z10 = resources.getBoolean(iD6);
                        } else {
                            int iD7 = g.d(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iD7 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(iD7));
                            } else {
                                z10 = true;
                            }
                        }
                    }
                    String str13 = r38.f21050b;
                    if (z10) {
                        str = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str13)) {
                            Log.e(str, ".");
                            Log.e(str, ".     |  | ");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".   \\ |  | /");
                            Log.e(str, ".    \\    /");
                            Log.e(str, ".     \\  /");
                            Log.e(str, ".      \\/");
                            Log.e(str, ".");
                            Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str, ".");
                            Log.e(str, ".      /\\");
                            Log.e(str, ".     /  \\");
                            Log.e(str, ".    /    \\");
                            Log.e(str, ".   / |  | \\");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    } else {
                        str = "FirebaseCrashlytics";
                        if (Log.isLoggable(str, 2)) {
                            Log.v(str, "Configured not to require a build ID.", null);
                        }
                    }
                    String str14 = new p160p8.e().f21067a;
                    try {
                        int i20 = 12;
                        rVar3.f21119f = new p085i0.n(i20, "crash_marker", bVar3);
                        rVar3.f21118e = new p085i0.n(i20, "initialization_marker", bVar3);
                        p170q8.c cVar6 = cVar;
                        p213v8.b bVar4 = new p213v8.b(str14, bVar3, cVar6);
                        p178r8.f fVar3 = new p178r8.f(bVar3);
                        p085i0.n nVar = new p085i0.n(new y8.a[]{new C(18)});
                        ((n) rVar3.f21125n.f10875s).a(new W2.n(28));
                        rVar3.g = new m(rVar3.f21114a, rVar3.f21120h, rVar3.f21115b, rVar3.f21121i, rVar3.f21119f, aVarA2, bVar4, fVar3, m1.f(rVar3.f21114a, rVar3.f21120h, rVar3.f21121i, aVarA2, fVar3, bVar4, nVar, sVar, rVar3.f21116c, rVar3.f21123l, rVar3.f21126o), rVar3.f21124m, rVar3.f21122k, rVar3.f21123l, rVar3.f21126o);
                        p085i0.n nVar2 = rVar3.f21118e;
                        p213v8.b bVar5 = (p213v8.b) nVar2.f16734t;
                        String str15 = (String) nVar2.f16733s;
                        bVar5.getClass();
                        boolean zExists = new File((File) bVar5.f23380c, str15).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) cVar6.f21345a.f21342r.submit(new p160p8.o(0, rVar3)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        m mVar = rVar3.g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        mVar.f21093e.f21345a.a(new F2.x(11, mVar, str14));
                        t tVar = new t(new V(mVar), sVar, defaultUncaughtExceptionHandler, mVar.j);
                        mVar.f21100n = tVar;
                        Thread.setDefaultUncaughtExceptionHandler(tVar);
                        if (zExists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            rVar3.b(sVar);
                        } else {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Successfully configured exception handler.", null);
                            }
                            cVar6.f21345a.a(new p160p8.n(rVar3, sVar, 0));
                        }
                        break;
                    } catch (Exception e10) {
                        Log.e(str, "Crashlytics was not started due to an exception during initialization", e10);
                        rVar3.g = null;
                    }
                    bVar = new p119l8.b(rVar3);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis2 > 16) {
                        String str16 = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms";
                        if (Log.isLoggable(str, 3)) {
                            Log.d(str, str16, null);
                        }
                    }
                    return bVar;
                } catch (PackageManager.NameNotFoundException e11) {
                    str = "FirebaseCrashlytics";
                    Log.e(str, "Error retrieving app package info.", e11);
                    bVar = null;
                }
                break;
        }
    }

    @Override // p053f.b
    public void d(Object obj) {
        ReminderSettingsActivity reminderSettingsActivity = (ReminderSettingsActivity) this.f771s;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = ReminderSettingsActivity.f13864a0;
        p227x3.a aVar = (p227x3.a) reminderSettingsActivity.s().f5533t;
        aVar.getClass();
        k0 k0Var = aVar.f24365c;
        p227x3.e eVar = new p227x3.e(System.currentTimeMillis(), "android.permission.POST_NOTIFICATIONS", zBooleanValue);
        k0Var.getClass();
        k0Var.n(null, eVar);
    }

    @Override // I8.a
    public void e(I8.b bVar) {
        m8.a aVar = (m8.a) this.f771s;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f19689b.set((m8.a) bVar.get());
    }

    @Override // J1.q
    public boolean f(View view) {
        int i10 = this.f770r;
        Object obj = this.f771s;
        switch (i10) {
            case 12:
                DrawerLayout drawerLayout = (DrawerLayout) obj;
                if (!DrawerLayout.k(view) || drawerLayout.g(view) == 2) {
                    return false;
                }
                drawerLayout.c(view, true);
                return true;
            default:
                int i11 = BottomSheetDragHandleView.f14704D;
                return ((BottomSheetDragHandleView) obj).a();
        }
    }

    public c g(android.support.v4.media.session.r rVar) throws IOException {
        d dVar = (d) this.f771s;
        URL url = (URL) rVar.f11364s;
        String strO = Y2.a.O("CctTransportBackend");
        if (Log.isLoggable(strO, 4)) {
            Log.i(strO, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) rVar.f11366u;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    p248z6.c cVar = dVar.f775a;
                    D6.m mVar = (D6.m) rVar.f11365t;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    E8.d dVar2 = (E8.d) cVar.f24847s;
                    E8.e eVar = new E8.e(bufferedWriter, dVar2.f1983a, dVar2.f1984b, dVar2.f1985c, dVar2.f1986d);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.f1988b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strO2 = Y2.a.O("CctTransportBackend");
                    if (Log.isLoggable(strO2, 4)) {
                        Log.i(strO2, String.format("Status Code: %d", numValueOf));
                    }
                    Y2.a.v("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Y2.a.v("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c cVar2 = new c(responseCode, null, v.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1330a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar2;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (C8.b e10) {
            e = e10;
            Y2.a.w("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            Y2.a.w("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            Y2.a.w("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            Y2.a.w("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, null, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void h() {
        p241y9.e eVar = (p241y9.e) this.f771s;
        synchronized (p093j0.n.f18661b) {
            ?? r10 = p093j0.n.g;
            p251z9.j.e(r10, "<this>");
            ArrayList arrayList = new ArrayList(p120l9.n.a0(r10, 10));
            boolean z10 = false;
            for (Object obj : r10) {
                boolean z11 = true;
                if (!z10 && p251z9.j.a(obj, eVar)) {
                    z10 = true;
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
            p093j0.n.g = arrayList;
        }
    }

    public boolean i(p248z6.c cVar, int i10, Bundle bundle) {
        InterfaceC0251f c0249e;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f771s;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((K1.g) cVar.f24847s).r();
                Parcelable parcelable = (Parcelable) ((K1.g) cVar.f24847s).p();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        K1.g gVar = (K1.g) cVar.f24847s;
        ClipData clipData = new ClipData(gVar.e(), new ClipData.Item(gVar.q()));
        if (i11 >= 31) {
            c0249e = new C0249e(clipData, 2);
        } else {
            C0253g c0253g = new C0253g();
            c0253g.f3733b = clipData;
            c0253g.f3734c = 2;
            c0249e = c0253g;
        }
        c0249e.a(gVar.t());
        c0249e.setExtras(bundle);
        return S.k(appCompatEditText, c0249e.build()) == null;
    }

    public void j(F9.n nVar) {
        p110k9.j jVar;
        int i10 = this.f770r;
        X3.k kVarA = X3.e.f9936a;
        h hVar = h.f9939a;
        W3.b bVar = W3.b.f9595f;
        Object obj = this.f771s;
        switch (i10) {
            case 1:
                QuranPage quranPage = (QuranPage) obj;
                int i11 = QuranPage.f13836z;
                QuranPageViewGroup quranPageViewGroup = quranPage.f13837t;
                if (nVar.equals(bVar)) {
                    kVarA = hVar;
                } else if (nVar instanceof W3.d) {
                    W3.d dVar = (W3.d) nVar;
                    kVarA = quranPageViewGroup.a(dVar.f9597f, dVar.g, false);
                } else if (nVar instanceof W3.c) {
                    W3.c cVar = (W3.c) nVar;
                    kVarA = quranPageViewGroup.a(cVar.f9596f, cVar.g, true);
                } else if (!(nVar instanceof W3.a)) {
                    throw new A6.a();
                }
                if (kVarA != null) {
                    quranPage.a(kVarA);
                    return;
                }
                return;
            default:
                p016b6.a aVar = (p016b6.a) obj;
                if (nVar.equals(bVar)) {
                    kVarA = hVar;
                } else if (!nVar.equals(W3.a.f9594f)) {
                    boolean z10 = nVar instanceof W3.d;
                    if (!z10 && !(nVar instanceof W3.c)) {
                        throw new A6.a();
                    }
                    kVarA = null;
                    if (z10 || (nVar instanceof W3.c)) {
                        if (z10) {
                            W3.d dVar2 = (W3.d) nVar;
                            jVar = new p110k9.j(Float.valueOf(dVar2.f9597f), Float.valueOf(dVar2.g));
                        } else if (nVar instanceof W3.c) {
                            W3.c cVar2 = (W3.c) nVar;
                            jVar = new p110k9.j(Float.valueOf(cVar2.f9596f), Float.valueOf(cVar2.g));
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            float fFloatValue = ((Number) jVar.f19077r).floatValue();
                            float fFloatValue2 = ((Number) jVar.f19078s).floatValue();
                            int iIntValue = ((Number) aVar.f13305b.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).intValue();
                            if (iIntValue > -1) {
                                kVarA = z10 ? new X3.f(iIntValue) : new X3.i(iIntValue);
                            } else {
                                int iIntValue2 = ((Number) aVar.f13304a.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).intValue();
                                if (iIntValue2 > -1) {
                                    kVarA = z10 ? new X3.g(iIntValue2) : new X3.j(iIntValue2);
                                }
                            }
                        }
                    }
                }
                if (kVarA != null) {
                    aVar.f13306c.e(kVarA);
                    return;
                }
                return;
        }
    }

    @Override // p151p.f1
    public boolean onMenuItemClick(MenuItem menuItem) {
        NoteActivity noteActivity = (NoteActivity) this.f771s;
        p251z9.j.b(menuItem);
        int i10 = NoteActivity.f13906i0;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.ayah_text) {
            EditText editText = noteActivity.f13914d0;
            if (editText == null) {
                p251z9.j.k("editor");
                throw null;
            }
            int selectionStart = editText.getSelectionStart();
            EditText editText2 = noteActivity.f13914d0;
            if (editText2 == null) {
                p251z9.j.k("editor");
                throw null;
            }
            int selectionEnd = editText2.getSelectionEnd();
            p124m3.j jVar = noteActivity.f13917g0;
            if (jVar == null) {
                p251z9.j.k("verseDao");
                throw null;
            }
            SpannableString spannableString = new SpannableString(p245z2.a.D("﴿", jVar.f19587c, "﴾"));
            spannableString.setSpan(new p192t6.a(noteActivity.f13908X), 0, spannableString.length(), 33);
            EditText editText3 = noteActivity.f13914d0;
            if (editText3 != null) {
                editText3.getText().replace(selectionStart, selectionEnd, spannableString);
                return true;
            }
            p251z9.j.k("editor");
            throw null;
        }
        if (itemId == R.id.remove_note) {
            Da.r rVar = new Da.r(noteActivity, R.style.DayNightAlert);
            C0956d c0956d = (C0956d) rVar.f1388t;
            c0956d.f16560d = c0956d.f16557a.getText(R.string.remove_note_prompt);
            DialogInterfaceOnClickListenerC0926h dialogInterfaceOnClickListenerC0926h = new DialogInterfaceOnClickListenerC0926h(noteActivity, 3);
            c0956d.g = c0956d.f16557a.getText(R.string.remove_note_confirm);
            c0956d.f16563h = dialogInterfaceOnClickListenerC0926h;
            p098j6.a aVar = new p098j6.a();
            c0956d.f16564i = c0956d.f16557a.getText(android.R.string.cancel);
            c0956d.j = aVar;
            rVar.e().show();
            return true;
        }
        if (itemId != R.id.share) {
            return noteActivity.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        p124m3.j jVar2 = noteActivity.f13917g0;
        if (jVar2 == null) {
            p251z9.j.k("verseDao");
            throw null;
        }
        String strD = jVar2.d(noteActivity);
        EditText editText4 = noteActivity.f13914d0;
        if (editText4 == null) {
            p251z9.j.k("editor");
            throw null;
        }
        intent.putExtra("android.intent.extra.TEXT", H9.p.I0("\n        " + strD + "\n        " + ((Object) editText4.getText()) + "\n        "));
        noteActivity.startActivity(Intent.createChooser(intent, noteActivity.getString(R.string.action_share)));
        return true;
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        int i10 = this.f770r;
        boolean z10 = true;
        Object obj = this.f771s;
        switch (i10) {
            case 8:
                L1.d dVar = (L1.d) obj;
                ArrayList arrayList = dVar.f5440b;
                y0 y0Var = b5.f3671a;
                A1.c cVarB = A1.c.b(y0Var.g(519), y0Var.g(64));
                A1.c cVarB2 = A1.c.b(y0Var.h(519), y0Var.h(64));
                if (!cVarB.equals(dVar.f5441c) || !cVarB2.equals(dVar.f5442d)) {
                    dVar.f5441c = cVarB;
                    dVar.f5442d = cVarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = ((L1.a) arrayList.get(size)).f5430a;
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            throw android.support.v4.media.session.p.u(size2, arrayList2);
                        }
                    }
                }
                return b5;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                int i11 = AboutActivity.f13601W;
                ((ViewGroup) obj).setPadding(0, b5.f3671a.g(519).f463b, 0, 0);
                return b5;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                int i12 = AboutActivity.f13601W;
                A1.c cVarG = b5.f3671a.g(647);
                ((ListView) obj).setPadding(cVarG.f462a, 0, cVarG.f464c, cVarG.f465d);
                return b5;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int i13 = PreferencesActivity.f13662d0;
                ((PreferencesActivity) obj).f13665Y.setPadding(0, b5.f3671a.g(519).f463b, 0, 0);
                return b5;
            case 22:
                RecyclerView recyclerView = (RecyclerView) obj;
                p251z9.j.e(view, "view");
                A1.c cVarG2 = b5.f3671a.g(647);
                p251z9.j.d(cVarG2, "getInsets(...)");
                p251z9.j.b(recyclerView);
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                view.setPadding(cVarG2.f462a, 0, cVarG2.f464c, cVarG2.f465d);
                recyclerView.setLayoutParams(layoutParams);
                return b5;
            default:
                y yVar = (y) obj;
                p251z9.j.e(view, "<unused var>");
                y0 y0Var2 = b5.f3671a;
                boolean zQ = y0Var2.q(1);
                boolean zQ2 = y0Var2.q(2);
                if (!zQ && !zQ2) {
                    z10 = false;
                }
                yVar.f1157r = z10;
                MainActivity mainActivity = ((z) yVar.f1158s).f15689r;
                int i14 = MainActivity.f13622J0;
                mainActivity.z(z10);
                return b5;
        }
    }
}
