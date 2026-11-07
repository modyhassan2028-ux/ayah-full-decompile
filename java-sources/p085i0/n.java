package p085i0;

import D6.s;
import N9.AbstractC0419l;
import T6.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import androidx.cardview.widget.CardView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import i7.B;
import i7.C0981g;
import i7.C0985h0;
import i7.C1023u0;
import i7.F1;
import i7.G;
import i7.M0;
import i7.X;
import i7.Y0;
import io.realm.RealmFieldTypeConstants;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ka.r;
import org.json.JSONObject;
import p110k9.j;
import p118l7.h;
import p118l7.o;
import p151p.C1256n;
import p151p.V;
import p160p8.g;
import p160p8.m;
import p207v2.C1381t;
import p207v2.k0;
import p211v6.b;
import p226x2.i;
import p226x2.p;
import p241y9.c;
import p241y9.e;
import x8.d;
import y8.a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m, h, k0, i, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f16733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16734t;

    public /* synthetic */ n(int i10, Object obj) {
        this.f16732r = i10;
        this.f16734t = obj;
    }

    @Override // p085i0.m
    public Object a(b bVar, Object obj) {
        return ((e) this.f16733s).invoke(bVar, obj);
    }

    @Override // p226x2.i
    public boolean b(Preference preference) {
        ((PreferenceGroup) this.f16733s).f12791j0 = Integer.MAX_VALUE;
        p pVar = (p) this.f16734t;
        Handler handler = pVar.f24322y;
        b bVar = pVar.f24323z;
        handler.removeCallbacks(bVar);
        handler.post(bVar);
        return true;
    }

    @Override // p085i0.m
    public Object c(Object obj) {
        return ((c) this.f16734t).e(obj);
    }

    @Override // y8.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        a[] aVarArr = (a[]) this.f16733s;
        StackTraceElement[] stackTraceElementArrD = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            a aVar = aVarArr[i10];
            if (stackTraceElementArrD.length <= 1024) {
                break;
            }
            stackTraceElementArrD = aVar.d(stackTraceElementArr);
        }
        return stackTraceElementArrD.length > 1024 ? ((B) this.f16734t).d(stackTraceElementArrD) : stackTraceElementArrD;
    }

    public void e() {
        String str = (String) this.f16733s;
        try {
            p213v8.b bVar = (p213v8.b) this.f16734t;
            bVar.getClass();
            new File((File) bVar.f23380c, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void f(Throwable th) {
        F1 f3 = (F1) this.f16733s;
        Y0 y10 = (Y0) this.f16734t;
        y10.o();
        y10.f17238z = false;
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        X x9 = c1023u0.f17584w;
        int i10 = 2;
        if (c0981g.y(null, G.f16917U0)) {
            String message = th.getMessage();
            y10.f17222E = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        y10.f17222E = true;
                    }
                    i10 = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i10 = 3;
                }
            }
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            C1023u0.m(x9);
            x9.f17185z.c(X.w(c1023u0.r().u()), X.w(th.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
            y10.f17218A = 1;
            y10.M().add(f3);
            return;
        }
        if (i11 != 1) {
            C1023u0.m(x9);
            x9.f17182w.c(X.w(c1023u0.r().u()), th, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
            k();
            y10.f17218A = 1;
            y10.N();
            return;
        }
        y10.M().add(f3);
        if (y10.f17218A > ((Integer) G.f16984x0.a(null)).intValue()) {
            y10.f17218A = 1;
            C1023u0.m(x9);
            x9.f17185z.c(X.w(c1023u0.r().u()), X.w(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        C1023u0.m(x9);
        x9.f17185z.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", X.w(c1023u0.r().u()), X.w(String.valueOf(y10.f17218A)), X.w(th.toString()));
        int i12 = y10.f17218A;
        if (y10.f17219B == null) {
            y10.f17219B = new M0(y10, c1023u0, 1);
        }
        y10.f17219B.b(((long) i12) * 1000);
        int i13 = y10.f17218A;
        y10.f17218A = i13 + i13;
    }

    public void g(int i10, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i10 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            p138n8.b bVar = "clx".equals(bundle2.getString("_o")) ? (p074h0.i) this.f16733s : (X4.c) this.f16734t;
            if (bVar == null) {
                return;
            }
            bVar.j(string, bundle2);
        }
    }

    @Override // p118l7.h
    public o h(Object obj) throws Throwable {
        FileWriter fileWriter;
        switch (this.f16732r) {
            case 11:
                Boolean bool = (Boolean) obj;
                m mVar = (m) this.f16734t;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    k kVar = mVar.f21090b;
                    if (zBooleanValue) {
                        ((p118l7.i) kVar.f7847f).b(null);
                        return ((o) this.f16733s).h(mVar.f21093e.f21345a, new V(this));
                    }
                    kVar.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = p213v8.b.e(((File) mVar.g.f23380c).listFiles(m.f21087r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                p213v8.b bVar = ((p213v8.a) mVar.f21099m.f20741b).f23375b;
                p213v8.a.a(p213v8.b.e(((File) bVar.f23382e).listFiles()));
                p213v8.a.a(p213v8.b.e(((File) bVar.f23383f).listFiles()));
                p213v8.a.a(p213v8.b.e(((File) bVar.g).listFiles()));
                mVar.f21103q.b(null);
                return p000a.a.E(null);
            default:
                s sVar = (s) this.f16734t;
                JSONObject jSONObject = (JSONObject) ((p170q8.c) this.f16733s).f21347c.f21342r.submit(new p160p8.o(1, this)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    x8.b bVarK = ((C1256n) sVar.f1310c).k(jSONObject);
                    C1256n c1256n = (C1256n) sVar.f1312e;
                    long j = bVarK.f24393c;
                    c1256n.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j);
                        fileWriter = new FileWriter((File) c1256n.f20747s);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Throwable th) {
                                th = th;
                                fileWriter2 = fileWriter;
                                g.b(fileWriter2, "Failed to close settings writer.");
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                    g.b(fileWriter, "Failed to close settings writer.");
                    s.d(jSONObject, "Loaded settings: ");
                    String str = ((d) sVar.f1309b).f24402f;
                    SharedPreferences.Editor editorEdit = ((Context) sVar.f1308a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) sVar.f1314h).set(bVarK);
                    ((p118l7.i) ((AtomicReference) sVar.f1315i).get()).b(bVarK);
                    break;
                }
                return p000a.a.E(null);
        }
    }

    public void i(Object obj) {
        N9.k0 k0Var = (N9.k0) this.f16733s;
        j jVar = new j(Integer.valueOf(((Number) ((j) k0Var.getValue()).f19077r).intValue() + 1), obj);
        k0Var.getClass();
        k0Var.n(null, jVar);
    }

    public void j(int i10, int i11, int i12, int i13) {
        CardView cardView = (CardView) this.f16734t;
        cardView.f11726u.set(i10, i11, i12, i13);
        Rect rect = cardView.f11725t;
        super/*android.widget.FrameLayout*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    public void k() {
        C1023u0 c1023u0 = (C1023u0) ((Y0) this.f16734t).f16104r;
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.k(c0985h0);
        SparseArray sparseArrayU = c0985h0.u();
        F1 f3 = (F1) this.f16733s;
        sparseArrayU.put(f3.f16881t, Long.valueOf(f3.f16880s));
        C0985h0 c0985h1 = c1023u0.f17583v;
        C1023u0.k(c0985h1);
        int[] iArr = new int[sparseArrayU.size()];
        long[] jArr = new long[sparseArrayU.size()];
        for (int i10 = 0; i10 < sparseArrayU.size(); i10++) {
            iArr[i10] = sparseArrayU.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayU.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c0985h1.f17388E.P(bundle);
    }

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f16732r = i10;
        this.f16733s = obj;
        this.f16734t = obj2;
    }

    public /* synthetic */ n(int i10, Object obj, Object obj2, boolean z10) {
        this.f16732r = i10;
        this.f16733s = obj2;
        this.f16734t = obj;
    }

    public n(Context context, p144o3.h hVar) {
        this.f16732r = 21;
        p251z9.j.e(hVar, "reciterModel");
        this.f16733s = context;
        this.f16734t = hVar;
    }

    public n(r rVar) {
        this.f16732r = 1;
        p251z9.j.e(rVar, "okHttpClient");
        this.f16733s = rVar;
        this.f16734t = new ArrayList();
    }

    public n(int i10) {
        this.f16732r = i10;
        switch (i10) {
            case 10:
                this.f16733s = new Rect();
                this.f16734t = new Rect();
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                this.f16733s = new AtomicInteger();
                this.f16734t = new AtomicInteger();
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                N9.k0 k0VarC = AbstractC0419l.c(new j(Integer.MIN_VALUE, null));
                this.f16733s = k0VarC;
                this.f16734t = new C4.e(20, k0VarC);
                break;
        }
    }

    public n(a[] aVarArr) {
        this.f16732r = 20;
        this.f16733s = aVarArr;
        this.f16734t = new B(18);
    }

    public n(Context context) {
        this.f16732r = 8;
        this.f16733s = context;
        this.f16734t = null;
    }

    public n(n nVar) {
        this.f16732r = 7;
        Context context = (Context) nVar.f16733s;
        int iD = g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f16733s = "Unity";
            String string = context.getResources().getString(iD);
            this.f16734t = string;
            String strS = p123m2.c.s("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strS, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f16733s = "Flutter";
                this.f16734t = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f16733s = null;
        this.f16734t = null;
    }

    public n(C1381t c1381t, n nVar) {
        this.f16732r = 16;
        p251z9.j.e(nVar, "retryEventBus");
        this.f16734t = c1381t;
        this.f16733s = nVar;
    }

    public n(p222w7.g gVar, p222w7.g gVar2) {
        this.f16732r = 17;
        if (gVar.f23776a <= gVar2.f23776a) {
            this.f16733s = gVar;
            this.f16734t = gVar2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
