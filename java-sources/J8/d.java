package J8;

import U6.C0532j;
import U6.y;
import W.AbstractC0607v1;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p100j8.l;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f4394m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p050e8.f f4395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L8.c f4396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M.k f4397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f4399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f4400f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f4401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p109k8.i f4402i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f4403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4404l;

    static {
        new AtomicInteger(1);
    }

    public d(p050e8.f fVar, I8.b bVar, ExecutorService executorService, p109k8.i iVar) {
        fVar.a();
        L8.c cVar = new L8.c(fVar.f15843a, bVar);
        M.k kVar = new M.k(fVar);
        if (C0532j.f8279t == null) {
            C0532j.f8279t = new C0532j(11);
        }
        C0532j c0532j = C0532j.f8279t;
        if (k.f4412d == null) {
            k.f4412d = new k(c0532j);
        }
        k kVar2 = k.f4412d;
        l lVar = new l(new b(0, fVar));
        i iVar2 = new i();
        this.g = new Object();
        this.f4403k = new HashSet();
        this.f4404l = new ArrayList();
        this.f4395a = fVar;
        this.f4396b = cVar;
        this.f4397c = kVar;
        this.f4398d = kVar2;
        this.f4399e = lVar;
        this.f4400f = iVar2;
        this.f4401h = executorService;
        this.f4402i = iVar;
    }

    public static d e() {
        p050e8.f fVarB = p050e8.f.b();
        fVarB.a();
        return (d) fVarB.f15846d.b(e.class);
    }

    public final void a(j jVar) {
        synchronized (this.g) {
            this.f4404l.add(jVar);
        }
    }

    public final void b() {
        K8.b bVarG;
        synchronized (f4394m) {
            try {
                p050e8.f fVar = this.f4395a;
                fVar.a();
                M.k kVarE = M.k.e(fVar.f15843a);
                try {
                    bVarG = this.f4397c.G();
                    int i10 = bVarG.f5308b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        String strI = i(bVarG);
                        M.k kVar = this.f4397c;
                        K8.a aVarA = bVarG.a();
                        aVarA.f5299a = strI;
                        aVarA.f5300b = 3;
                        bVarG = aVarA.a();
                        kVar.v(bVarG);
                    }
                    if (kVarE != null) {
                        kVarE.H();
                    }
                } catch (Throwable th) {
                    if (kVarE != null) {
                        kVarE.H();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l(bVarG);
        this.f4402i.execute(new c(this, 2));
    }

    public final K8.b c(K8.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        String str;
        L8.b bVarF;
        p050e8.f fVar = this.f4395a;
        fVar.a();
        String str2 = fVar.f15845c.f15856a;
        String str3 = bVar.f5307a;
        fVar.a();
        String str4 = fVar.f15845c.g;
        String str5 = bVar.f5310d;
        L8.c cVar = this.f4396b;
        L8.d dVar = cVar.f5573c;
        if (!dVar.b()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = L8.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new f("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str2);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    httpURLConnectionC.setDoOutput(true);
                    L8.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = L8.c.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        str = null;
                        break;
                    }
                    L8.c.b(httpURLConnectionC, null, str2, str4);
                    httpURLConnection = httpURLConnectionC;
                    try {
                        try {
                            if (responseCode == 401 || responseCode == 404) {
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                str = null;
                                L8.b bVar2 = new L8.b(0L, 3, null);
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                bVarF = bVar2;
                                break;
                            }
                            if (responseCode == 429) {
                                throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                L8.b bVar3 = new L8.b(0L, 2, null);
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                bVarF = bVar3;
                                str = null;
                                break;
                            }
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (IOException | AssertionError unused2) {
                    httpURLConnection = httpURLConnectionC;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionC;
            }
        }
        int iB = AbstractC0607v1.b(bVarF.f5568c);
        if (iB != 0) {
            if (iB == 1) {
                K8.a aVarA = bVar.a();
                aVarA.g = "BAD CONFIG";
                aVarA.f5300b = 5;
                return aVarA.a();
            }
            if (iB != 2) {
                throw new f("Firebase Installations Service is unavailable. Please try again later.");
            }
            m(str);
            K8.a aVarA2 = bVar.a();
            aVarA2.f5300b = 2;
            return aVarA2.a();
        }
        String str6 = bVarF.f5566a;
        long j = bVarF.f5567b;
        k kVar = this.f4398d;
        kVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kVar.f4413a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        K8.a aVarA3 = bVar.a();
        aVarA3.f5301c = str6;
        aVarA3.f5303e = j;
        byte b5 = (byte) (aVarA3.f5305h | 1);
        aVarA3.f5304f = seconds;
        aVarA3.f5305h = (byte) (b5 | 2);
        return aVarA3.a();
    }

    public final o d() {
        String str;
        h();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return p000a.a.E(str);
        }
        p118l7.i iVar = new p118l7.i();
        a(new h(iVar));
        o oVar = iVar.f19402a;
        this.f4401h.execute(new c(this, 0));
        return oVar;
    }

    public final o f() {
        h();
        p118l7.i iVar = new p118l7.i();
        a(new g(this.f4398d, iVar));
        this.f4401h.execute(new c(this, 1));
        return iVar.f19402a;
    }

    public final void g(K8.b bVar) {
        synchronized (f4394m) {
            try {
                p050e8.f fVar = this.f4395a;
                fVar.a();
                M.k kVarE = M.k.e(fVar.f15843a);
                try {
                    this.f4397c.v(bVar);
                    if (kVarE != null) {
                        kVarE.H();
                    }
                } catch (Throwable th) {
                    if (kVarE != null) {
                        kVarE.H();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        p050e8.f fVar = this.f4395a;
        fVar.a();
        y.d(fVar.f15845c.f15857b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.d(fVar.f15845c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.d(fVar.f15845c.f15856a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f15845c.f15857b;
        Pattern pattern = k.f4411c;
        if (!str.contains(":")) {
            throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        fVar.a();
        if (!k.f4411c.matcher(fVar.f15845c.f15856a).matches()) {
            throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[Catch: all -> 0x0036, DONT_GENERATE, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:27:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:27:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String i(K8.b bVar) {
        K8.c cVar;
        String strA;
        p050e8.f fVar = this.f4395a;
        fVar.a();
        if (!fVar.f15844b.equals("CHIME_ANDROID_SDK")) {
            p050e8.f fVar2 = this.f4395a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f15844b)) {
                if (bVar.f5308b == 1) {
                    cVar = (K8.c) this.f4399e.get();
                    synchronized (cVar.f5314a) {
                        try {
                            strA = cVar.a();
                            if (strA != null) {
                                strA = cVar.b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(strA)) {
                        return strA;
                    }
                    this.f4400f.getClass();
                    return i.a();
                }
            }
        } else if (bVar.f5308b == 1) {
            cVar = (K8.c) this.f4399e.get();
            synchronized (cVar.f5314a) {
                strA = cVar.a();
                if (strA != null) {
                    strA = cVar.b();
                }
                if (TextUtils.isEmpty(strA)) {
                    return strA;
                }
                this.f4400f.getClass();
                return i.a();
            }
        }
        this.f4400f.getClass();
        return i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [L8.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [L8.a] */
    public final K8.b j(K8.b bVar) throws f {
        String str = bVar.f5307a;
        String string = null;
        if (str != null && str.length() == 11) {
            K8.c cVar = (K8.c) this.f4399e.get();
            synchronized (cVar.f5314a) {
                try {
                    String[] strArr = K8.c.f5313c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = cVar.f5314a.getString("|T|" + cVar.f5315b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        L8.c cVar2 = this.f4396b;
        p050e8.f fVar = this.f4395a;
        fVar.a();
        String str3 = fVar.f15845c.f15856a;
        String str4 = bVar.f5307a;
        p050e8.f fVar2 = this.f4395a;
        fVar2.a();
        String str5 = fVar2.f15845c.g;
        p050e8.f fVar3 = this.f4395a;
        fVar3.a();
        String str6 = fVar3.f15845c.f15857b;
        L8.d dVar = cVar2.f5573c;
        if (!dVar.b()) {
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = L8.c.a("projects/" + str5 + "/installations");
        int i11 = 0;
        L8.a aVar = cVar2;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    L8.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        L8.a aVarE = L8.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            L8.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                L8.a aVar2 = new L8.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    int iB = AbstractC0607v1.b(aVar.f5565e);
                    if (iB != 0) {
                        if (iB != 1) {
                            throw new f("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        K8.a aVarA = bVar.a();
                        aVarA.g = "BAD CONFIG";
                        aVarA.f5300b = 5;
                        return aVarA.a();
                    }
                    String str7 = aVar.f5562b;
                    String str8 = aVar.f5563c;
                    k kVar = this.f4398d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f4413a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    L8.b bVar2 = aVar.f5564d;
                    String str9 = bVar2.f5566a;
                    long j = bVar2.f5567b;
                    K8.a aVarA2 = bVar.a();
                    aVarA2.f5299a = str7;
                    aVarA2.f5300b = 4;
                    aVarA2.f5301c = str9;
                    aVarA2.f5302d = str8;
                    aVarA2.f5303e = j;
                    byte b5 = (byte) (aVarA2.f5305h | 1);
                    aVarA2.f5304f = seconds;
                    aVarA2.f5305h = (byte) (b5 | 2);
                    return aVarA2.a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f4404l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(K8.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.f4404l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m(String str) {
        this.j = str;
    }

    public final synchronized void n(K8.b bVar, K8.b bVar2) {
        try {
            if (this.f4403k.size() != 0 && !TextUtils.equals(bVar.f5307a, bVar2.f5307a)) {
                Iterator it = this.f4403k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
