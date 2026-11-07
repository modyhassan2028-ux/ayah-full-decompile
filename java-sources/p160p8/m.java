package p160p8;

import Ca.r;
import D6.s;
import T6.k;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.squareup.moshi.z;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m8.a;
import p085i0.n;
import p118l7.i;
import p118l7.o;
import p151p.m1;
import p170q8.c;
import p178r8.d;
import p178r8.e;
import p178r8.f;
import p178r8.h;
import p185s8.A;
import p185s8.B;
import p185s8.C;
import p185s8.C1307a0;
import p185s8.C1323i0;
import p185s8.C1327k0;
import p185s8.C1329l0;
import p185s8.C1331m0;
import p185s8.C1333n0;
import p185s8.C1335o0;
import p185s8.D;
import p185s8.E;
import p185s8.I;
import p185s8.J;
import p185s8.K;
import p185s8.M;
import p185s8.N0;
import p185s8.O;
import p185s8.O0;
import p185s8.P;
import p185s8.Q;
import p185s8.S;
import p185s8.V;
import p185s8.Z;
import p213v8.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f21087r = new h(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Charset f21088s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f21092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f21093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f21094f;
    public final b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f21095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f21096i;
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p138n8.a f21097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f21098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f21099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f21100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f21101o = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f21102p = new i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f21103q = new i();

    public m(Context context, x xVar, k kVar, b bVar, n nVar, a aVar, b bVar2, f fVar, m1 m1Var, a aVar2, p138n8.a aVar3, j jVar, c cVar) {
        new AtomicBoolean(false);
        this.f21089a = context;
        this.f21094f = xVar;
        this.f21090b = kVar;
        this.g = bVar;
        this.f21091c = nVar;
        this.f21095h = aVar;
        this.f21092d = bVar2;
        this.f21096i = fVar;
        this.j = aVar2;
        this.f21097k = aVar3;
        this.f21098l = jVar;
        this.f21099m = m1Var;
        this.f21093e = cVar;
    }

    public static o a(m mVar) {
        o oVarO;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : b.e(((File) mVar.g.f23380c).listFiles(f21087r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    oVarO = p000a.a.E(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    oVarO = p000a.a.o(new ScheduledThreadPoolExecutor(1), new l(mVar, j));
                }
                arrayList.add(oVarO);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return p000a.a.q0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:205:0x060c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [p8.j] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [int] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(boolean z10, s sVar, boolean z11) throws Throwable {
        ArrayList arrayList;
        int i10;
        int i11;
        ?? r10;
        boolean z12;
        String str;
        boolean z13;
        String[] list;
        Throwable th;
        List listB;
        ApplicationExitInfo next;
        String strE;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        c.a();
        ArrayList arrayList2 = new ArrayList(((p213v8.a) this.f21099m.f20741b).c());
        if (arrayList2.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList2.get(z10 == true ? 1 : 0);
        if (z11 && sVar.b().f24392b.f24389b) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f21089a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    b bVar = this.g;
                    f fVar = new f(bVar);
                    fVar.f21616s = f.f21614t;
                    if (str2 != null) {
                        fVar.f21616s = new p178r8.m(bVar.b(str2, "userlog"));
                    }
                    b bVar2 = this.g;
                    c cVar = this.f21093e;
                    h hVar = new h(bVar2);
                    i10 = 4;
                    b bVar3 = new b(str2, bVar2, cVar);
                    i11 = 8;
                    ((e) ((AtomicMarkableReference) ((r) bVar3.f23381d).f849c).getReference()).d(hVar.c(str2, false));
                    ((e) ((AtomicMarkableReference) ((r) bVar3.f23382e).f849c).getReference()).d(hVar.c(str2, true));
                    ((AtomicMarkableReference) bVar3.g).set(hVar.d(str2), false);
                    z zVar = (z) bVar3.f23383f;
                    File fileB = bVar2.b(str2, "rollouts-state");
                    if (!fileB.exists() || fileB.length() == 0) {
                        h.g(fileB, "The file has a length of zero for session: " + str2);
                        listB = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(fileB);
                            try {
                                try {
                                    listB = h.b(g.i(fileInputStream2));
                                    String str3 = "Loaded rollouts state:\n" + listB + "\nfor session " + str2;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str3, null);
                                    }
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    h.f(fileB);
                                    g.b(fileInputStream2, "Failed to close rollouts state file.");
                                    listB = Collections.EMPTY_LIST;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                g.b(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                            g.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    synchronized (zVar) {
                        zVar.f15517a.clear();
                        if (listB.size() > zVar.f15518b) {
                            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + zVar.f15518b, null);
                            zVar.f15517a.addAll(listB.subList(0, zVar.f15518b));
                        } else {
                            zVar.f15517a.addAll(listB);
                        }
                    }
                    m1 m1Var = this.f21099m;
                    p213v8.a aVar = (p213v8.a) m1Var.f20741b;
                    long jLastModified = aVar.f23375b.b(str2, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strS = p123m2.c.s("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strS, null);
                        }
                        arrayList = arrayList2;
                    } else {
                        s sVar2 = (s) m1Var.f20740a;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            strE = traceInputStream != null ? m1.e(traceInputStream) : null;
                        } catch (IOException e12) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e12, null);
                        }
                        C c10 = new C();
                        c10.f22177d = next.getImportance();
                        c10.j = (byte) (c10.j | 4);
                        String processName = next.getProcessName();
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        c10.f22175b = processName;
                        c10.f22176c = next.getReason();
                        c10.j = (byte) (c10.j | 2);
                        c10.g = next.getTimestamp();
                        c10.j = (byte) (c10.j | 32);
                        c10.f22174a = next.getPid();
                        c10.j = (byte) (c10.j | 1);
                        c10.f22178e = next.getPss();
                        c10.j = (byte) (c10.j | 8);
                        c10.f22179f = next.getRss();
                        c10.j = (byte) (c10.j | 16);
                        c10.f22180h = strE;
                        D dA = c10.a();
                        int i13 = sVar2.f21128a.getResources().getConfiguration().orientation;
                        O o10 = new O();
                        o10.f22243b = "anr";
                        long j = dA.g;
                        o10.f22242a = j;
                        o10.g = (byte) (o10.g | 1);
                        a aVar2 = sVar2.f21130c;
                        if (!sVar2.f21132e.b().f24392b.f24390c || aVar2.f21051c.size() <= 0) {
                            arrayList = arrayList2;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = aVar2.f21051c;
                            int size = arrayList4.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList4.get(i14);
                                int i15 = i14 + 1;
                                int i16 = size;
                                d dVar = (d) obj;
                                String str4 = dVar.f21062a;
                                if (str4 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                ArrayList arrayList5 = arrayList4;
                                String str5 = dVar.f21063b;
                                if (str5 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                String str6 = dVar.f21064c;
                                if (str6 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                arrayList3.add(new E(str5, str4, str6));
                                size = i16;
                                i14 = i15;
                                arrayList4 = arrayList5;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                        }
                        C c11 = new C();
                        c11.f22177d = dA.f22185d;
                        byte b5 = (byte) (c11.j | 4);
                        c11.j = b5;
                        String str7 = dA.f22183b;
                        if (str7 == null) {
                            throw new NullPointerException("Null processName");
                        }
                        c11.f22175b = str7;
                        c11.f22176c = dA.f22184c;
                        c11.g = j;
                        c11.f22174a = dA.f22182a;
                        c11.f22178e = dA.f22186e;
                        c11.f22179f = dA.f22187f;
                        c11.j = (byte) (((byte) (((byte) (((byte) (((byte) (b5 | 2)) | 32)) | 1)) | 8)) | 16);
                        c11.f22180h = dA.f22188h;
                        c11.f22181i = listUnmodifiableList;
                        D dA2 = c11.a();
                        Boolean boolValueOf = Boolean.valueOf(dA2.f22185d != 100);
                        String str8 = dA2.f22183b;
                        int i17 = dA2.f22182a;
                        int i18 = dA2.f22185d;
                        j.e(str8, "processName");
                        if ((8 & 4) != 0) {
                            i18 = 0;
                        }
                        Z z14 = new Z();
                        z14.f22292a = str8;
                        z14.f22293b = i17;
                        byte b10 = (byte) (z14.f22296e | 1);
                        z14.f22294c = i18;
                        z14.f22295d = false;
                        z14.f22296e = (byte) (((byte) (b10 | 2)) | 4);
                        C1307a0 c1307a0A = z14.a();
                        byte b11 = (byte) 1;
                        V vE = s.e();
                        List listA = sVar2.a();
                        if (listA == null) {
                            throw new NullPointerException("Null binaries");
                        }
                        S s10 = new S(null, null, dA2, vE, listA);
                        if (b11 != 1) {
                            StringBuilder sb = new StringBuilder();
                            if (b11 == 0) {
                                sb.append(" uiOrientation");
                            }
                            throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
                        }
                        o10.f22244c = new Q(s10, null, null, boolValueOf, c1307a0A, null, i13);
                        o10.f22245d = sVar2.b(i13);
                        P pA = o10.a();
                        String strS2 = p123m2.c.s("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strS2, null);
                        }
                        aVar.d(m1.d(m1.a(pA, fVar, bVar3, Collections.EMPTY_MAP), bVar3), str2, true);
                    }
                } else {
                    arrayList = arrayList2;
                    i10 = 4;
                    i11 = 8;
                    String strS3 = p123m2.c.s("No ApplicationExitInfo available. Session: ", str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strS3, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i10 = 4;
                i11 = 8;
                String strR = p123m2.c.r(i12, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strR, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i10 = 4;
            i11 = 8;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z11 && this.j.c(str2)) {
            String strS4 = p123m2.c.s("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                th = null;
                Log.v("FirebaseCrashlytics", strS4, null);
            } else {
                th = null;
            }
            this.j.a(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, th);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, th);
            Log.w("FirebaseCrashlytics", "No native core present", th);
            r10 = th;
        } else {
            r10 = 0;
        }
        if (z10 != 0) {
            z12 = false;
            str = (String) arrayList.get(0);
        } else {
            z12 = false;
            this.f21098l.b(r10);
            str = null;
        }
        m1 m1Var2 = this.f21099m;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        p213v8.a aVar3 = (p213v8.a) m1Var2.f20741b;
        b bVar4 = aVar3.f23375b;
        bVar4.a(".com.google.firebase.crashlytics");
        bVar4.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) bVar4.f23378a).isEmpty()) {
            bVar4.a(".com.google.firebase.crashlytics.files.v1");
            String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) bVar4.f23379b;
            if (file.exists() && (list = file.list(new p175r4.b(str9, 1))) != null) {
                int length = list.length;
                for (?? r11 = z12; r11 < length; r11++) {
                    bVar4.a(list[r11]);
                }
            }
        }
        NavigableSet<String> navigableSetC = aVar3.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        int i19 = i11;
        if (navigableSetC.size() > i19) {
            while (navigableSetC.size() > i19) {
                String str10 = (String) navigableSetC.last();
                String strS5 = p123m2.c.s("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strS5, null);
                }
                b.d(new File((File) bVar4.f23381d, str10));
                navigableSetC.remove(str10);
            }
        }
        for (String str11 : navigableSetC) {
            String strS6 = p123m2.c.s("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strS6, null);
            }
            p194t8.a aVar4 = p213v8.a.g;
            h hVar2 = p213v8.a.f23373i;
            File file2 = new File((File) bVar4.f23381d, str11);
            file2.mkdirs();
            List<File> listE = b.e(file2.listFiles(hVar2));
            if (listE.isEmpty()) {
                String strD = p245z2.a.D("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strD, null);
                }
            } else {
                Collections.sort(listE);
                ArrayList arrayList6 = new ArrayList();
                boolean z15 = z12;
                for (File file3 : listE) {
                    try {
                        String strE2 = p213v8.a.e(file3);
                        aVar4.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE2));
                            try {
                                P pE = p194t8.a.e(jsonReader);
                                jsonReader.close();
                                arrayList6.add(pE);
                                if (z15) {
                                    z13 = true;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                }
                                z15 = z13;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e13) {
                            throw new IOException(e13);
                        }
                    } catch (IOException e14) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e14);
                    }
                }
                if (arrayList6.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strD2 = new h(bVar4).d(str11);
                    String strA = aVar3.f23377d.a(str11);
                    File fileB2 = bVar4.b(str11, "report");
                    try {
                        String strE3 = p213v8.a.e(fileB2);
                        aVar4.getClass();
                        B bI = p194t8.a.i(strE3);
                        A a9 = bI.a();
                        N0 n6 = bI.f22171k;
                        if (n6 != null) {
                            try {
                                I iA = n6.a();
                                iA.f22203e = Long.valueOf(jCurrentTimeMillis);
                                iA.f22204f = z15;
                                try {
                                    iA.f22209m = (byte) (iA.f22209m | 2);
                                    if (strD2 != null) {
                                        iA.f22205h = new C1327k0(strD2);
                                    }
                                    a9.j = iA.a();
                                } catch (IOException e15) {
                                    e = e15;
                                }
                            } catch (IOException e16) {
                                e = e16;
                            }
                        }
                        B bA = a9.a();
                        A a10 = bA.a();
                        a10.g = strA;
                        N0 n10 = bA.f22171k;
                        if (n10 != null) {
                            I iA2 = n10.a();
                            iA2.f22201c = strA;
                            a10.j = iA2.a();
                        }
                        B bA2 = a10.a();
                        N0 n11 = bA2.f22171k;
                        if (n11 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        A a11 = bA2.a();
                        I iA3 = n11.a();
                        iA3.f22207k = arrayList6;
                        a11.j = iA3.a();
                        B bA3 = a11.a();
                        N0 n12 = bA3.f22171k;
                        if (n12 != null) {
                            String str12 = "appQualitySessionId: " + strA;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e17) {
                                        e = e17;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                                    }
                                }
                                p213v8.a.f(z15 ? new File((File) bVar4.f23383f, ((J) n12).f22211b) : new File((File) bVar4.f23382e, ((J) n12).f22211b), p194t8.a.f22646a.D(bA3));
                            } catch (IOException e18) {
                                e = e18;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                            }
                        }
                        e = e17;
                    } catch (IOException e19) {
                        e = e19;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                }
                b.d(new File((File) bVar4.f23381d, str11));
                z12 = false;
            }
            b.d(new File((File) bVar4.f23381d, str11));
            z12 = false;
        }
        p014b3.c cVar2 = aVar3.f23376c.b().f24391a;
        ArrayList arrayListB = aVar3.b();
        int size2 = arrayListB.size();
        int i20 = i10;
        if (size2 <= i20) {
            return;
        }
        Iterator it2 = arrayListB.subList(i20, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        int i10;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strS = p123m2.c.s("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strS, null);
        }
        Locale locale = Locale.US;
        x xVar = this.f21094f;
        a aVar = this.f21095h;
        C1331m0 c1331m0 = new C1331m0(xVar.f21147c, aVar.f21054f, aVar.g, xVar.c().f21059a, p123m2.c.m(aVar.f21052d != null ? 4 : 1), aVar.f21055h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        C1335o0 c1335o0 = new C1335o0(g.g());
        Context context = this.f21089a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        f fVar = f.f21068r;
        String str6 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str6)) {
            f fVar2 = (f) f.f21069s.get(str6.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = fVar.ordinal();
        String str7 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new C1329l0(c1331m0, c1335o0, new C1333n0(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str5;
            str3 = str8;
            i10 = 4;
        } else {
            b bVar = this.f21092d;
            synchronized (((String) bVar.f23378a)) {
                bVar.f23378a = str;
                str2 = str5;
                str3 = str8;
                i10 = 4;
                ((c) bVar.f23380c).f21346b.a(new J6.a(bVar, str, ((e) ((AtomicMarkableReference) ((r) bVar.f23381d).f849c).getReference()).a(), ((z) bVar.f23383f).b(), 1));
            }
        }
        f fVar3 = this.f21096i;
        ((d) fVar3.f21616s).c();
        fVar3.f21616s = f.f21614t;
        if (str != null) {
            fVar3.f21616s = new p178r8.m(((b) fVar3.f21615r).b(str, "userlog"));
        }
        this.f21098l.b(str);
        m1 m1Var = this.f21099m;
        s sVar = (s) m1Var.f20740a;
        Charset charset = O0.f22248a;
        A a9 = new A();
        a9.f22153a = "20.0.0";
        a aVar2 = sVar.f21130c;
        String str10 = aVar2.f21049a;
        if (str10 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a9.f22154b = str10;
        x xVar2 = sVar.f21129b;
        String str11 = xVar2.c().f21059a;
        if (str11 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a9.f22156d = str11;
        a9.f22157e = xVar2.c().f21060b;
        a9.f22158f = xVar2.c().f21061c;
        String str12 = aVar2.f21054f;
        if (str12 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a9.f22159h = str12;
        String str13 = aVar2.g;
        if (str13 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a9.f22160i = str13;
        a9.f22155c = i10;
        a9.f22163m = (byte) (a9.f22163m | 1);
        I i11 = new I();
        i11.f22204f = false;
        byte b5 = (byte) (i11.f22209m | 2);
        i11.f22202d = jCurrentTimeMillis;
        i11.f22209m = (byte) (b5 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i11.f22200b = str;
        String str14 = s.g;
        if (str14 == null) {
            throw new NullPointerException("Null generator");
        }
        i11.f22199a = str14;
        String str15 = xVar2.f21147c;
        if (str15 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str16 = xVar2.c().f21059a;
        n nVar = aVar2.f21055h;
        if (((n) nVar.f16734t) == null) {
            nVar.f16734t = new n(nVar);
        }
        n nVar2 = (n) nVar.f16734t;
        String str17 = (String) nVar2.f16733s;
        if (nVar2 == null) {
            nVar.f16734t = new n(nVar);
        }
        i11.g = new K(str15, str12, str13, str16, str17, (String) ((n) nVar.f16734t).f16734t);
        C1323i0 c1323i0 = new C1323i0();
        c1323i0.f22374a = 3;
        c1323i0.f22378e = (byte) (c1323i0.f22378e | 1);
        if (str4 == null) {
            throw new NullPointerException("Null version");
        }
        c1323i0.f22375b = str4;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c1323i0.f22376c = str2;
        c1323i0.f22377d = g.g();
        c1323i0.f22378e = (byte) (c1323i0.f22378e | 2);
        i11.f22206i = c1323i0.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str6) && (num = (Integer) s.f21127f.get(str6.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(sVar.f21128a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = g.f();
        int iC2 = g.c();
        M m10 = new M();
        m10.f22226a = iIntValue;
        byte b10 = (byte) (m10.j | 1);
        m10.j = b10;
        if (str7 == 0) {
            throw new NullPointerException("Null model");
        }
        m10.f22227b = str7;
        m10.f22228c = iAvailableProcessors2;
        m10.f22229d = jA2;
        m10.f22230e = blockCount2;
        m10.f22231f = zF2;
        m10.g = iC2;
        m10.j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        String str18 = str3;
        if (str18 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m10.f22232h = str18;
        if (str9 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m10.f22233i = str9;
        i11.j = m10.a();
        i11.f22208l = 3;
        i11.f22209m = (byte) (i11.f22209m | 4);
        a9.j = i11.a();
        B bA = a9.a();
        b bVar2 = ((p213v8.a) m1Var.f20741b).f23375b;
        N0 n6 = bA.f22171k;
        if (n6 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str19 = ((J) n6).f22211b;
        try {
            p213v8.a.g.getClass();
            p213v8.a.f(bVar2.b(str19, "report"), p194t8.a.f22646a.D(bA));
            File fileB = bVar2.b(str19, "start-time");
            long j = ((J) n6).f22213d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), p213v8.a.f23370e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e10) {
            String strS2 = p123m2.c.s("Could not persist report for session ", str19);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strS2, e10);
            }
        }
    }

    public final boolean d(s sVar) throws Throwable {
        c.a();
        t tVar = this.f21100n;
        if (tVar != null && tVar.f21137e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, sVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((p213v8.a) this.f21099m.f20741b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f21089a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f21088s), 0);
        }
        ClassLoader classLoader = m.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.f21092d.f(strF);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f21089a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final void h(o oVar) {
        o oVar2;
        o oVarA;
        i iVar = this.f21101o;
        b bVar = ((p213v8.a) this.f21099m.f20741b).f23375b;
        if (b.e(((File) bVar.f23382e).listFiles()).isEmpty() && b.e(((File) bVar.f23383f).listFiles()).isEmpty() && b.e(((File) bVar.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            iVar.b(Boolean.FALSE);
            return;
        }
        m8.b bVar2 = m8.b.f19690a;
        bVar2.c("Crash reports are available to be sent.");
        k kVar = this.f21090b;
        if (kVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            iVar.b(Boolean.FALSE);
            oVarA = p000a.a.E(Boolean.TRUE);
        } else {
            bVar2.b("Automatic data collection is disabled.");
            bVar2.c("Notifying that unsent reports are available.");
            iVar.b(Boolean.TRUE);
            synchronized (kVar.f7844c) {
                oVar2 = ((i) kVar.f7845d).f19402a;
            }
            i7.B b5 = new i7.B(10);
            oVar2.getClass();
            E6.s sVar = p118l7.j.f19403a;
            o oVar3 = new o();
            oVar2.f19422b.f(new p118l7.m(sVar, b5, oVar3));
            oVar2.n();
            bVar2.b("Waiting for send/deleteUnsentReports to be called.");
            oVarA = p170q8.a.a(oVar3, this.f21102p.f19402a);
        }
        oVarA.h(this.f21093e.f21345a, new n(11, this, oVar, false));
    }
}
