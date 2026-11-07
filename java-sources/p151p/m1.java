package p151p;

import A.C0041r0;
import A6.a;
import Ca.r;
import D6.s;
import E6.v;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.squareup.moshi.z;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import p118l7.i;
import p118l7.l;
import p118l7.o;
import p151p.m1;
import p160p8.j;
import p160p8.w;
import p160p8.x;
import p170q8.c;
import p171r0.e;
import p178r8.d;
import p178r8.f;
import p178r8.n;
import p185s8.A;
import p185s8.B;
import p185s8.C1307a0;
import p185s8.C1313d0;
import p185s8.C1315e0;
import p185s8.C1319g0;
import p185s8.C1321h0;
import p185s8.D0;
import p185s8.F;
import p185s8.K0;
import p185s8.O;
import p185s8.P;
import p185s8.Q;
import p185s8.S;
import p185s8.U;
import p185s8.V;
import p185s8.W;
import p213v8.b;
import ra.C1291c;
import ra.m;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20745f;
    public Object g;

    public m1(C0041r0 c0041r0) {
        this.f20740a = c0041r0;
        this.f20741b = e.f21388e;
        this.f20742c = null;
        this.f20743d = null;
        this.f20744e = null;
        this.f20745f = null;
        this.g = null;
    }

    public static P a(P p10, f fVar, b bVar, Map map) {
        Map mapUnmodifiableMap;
        O oA = p10.a();
        String strF = ((d) fVar.f21616s).f();
        if (strF != null) {
            oA.f22246e = new C1313d0(strF);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        r rVar = (r) bVar.f23381d;
        if (map.isEmpty()) {
            mapUnmodifiableMap = ((p178r8.e) ((AtomicMarkableReference) rVar.f849c).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((p178r8.e) ((AtomicMarkableReference) rVar.f849c).getReference()).a());
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = p178r8.e.b(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB)) {
                    map2.put(strB, p178r8.e.b(1024, (String) entry.getValue()));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
        }
        List listG = g(mapUnmodifiableMap);
        List listG2 = g(((p178r8.e) ((AtomicMarkableReference) ((r) bVar.f23382e).f849c).getReference()).a());
        if (!listG.isEmpty() || !listG2.isEmpty()) {
            Q q10 = (Q) p10.f22251c;
            oA.f22244c = new Q(q10.f22255a, listG, listG2, q10.f22258d, q10.f22259e, q10.f22260f, q10.g);
        }
        return oA.a();
    }

    public static void b(Menu menu, M0.b bVar) {
        int i10;
        int i11 = bVar.f5668r;
        int i12 = bVar.f5669s;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            i10 = R.string.copy;
        } else if (iOrdinal == 1) {
            i10 = R.string.paste;
        } else if (iOrdinal == 2) {
            i10 = R.string.cut;
        } else if (iOrdinal == 3) {
            i10 = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new a();
            }
            i10 = Build.VERSION.SDK_INT <= 26 ? com.ayah.R.string.autofill : R.string.autofill;
        }
        menu.add(0, i11, i12, i10).setShowAsAction(1);
    }

    public static void c(Menu menu, M0.b bVar, p241y9.a aVar) {
        int i10 = bVar.f5668r;
        if (aVar != null && menu.findItem(i10) == null) {
            b(menu, bVar);
        } else {
            if (aVar != null || menu.findItem(i10) == null) {
                return;
            }
            menu.removeItem(i10);
        }
    }

    public static K0 d(P p10, b bVar) {
        List listB = ((z) bVar.f23383f).b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            n nVar = (n) listB.get(i10);
            nVar.getClass();
            C1315e0 c1315e0 = new C1315e0();
            p178r8.b bVar2 = (p178r8.b) nVar;
            String str = bVar2.f21606e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar2.f21603b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c1315e0.f22343a = new C1319g0(str2, str);
            String str3 = bVar2.f21604c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c1315e0.f22344b = str3;
            String str4 = bVar2.f21605d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c1315e0.f22345c = str4;
            c1315e0.f22346d = bVar2.f21607f;
            c1315e0.f22347e = (byte) (c1315e0.f22347e | 1);
            arrayList.add(c1315e0.a());
        }
        if (arrayList.isEmpty()) {
            return p10;
        }
        O oA = p10.a();
        oA.f22247f = new C1321h0(arrayList);
        return oA.a();
    }

    public static String e(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        bufferedInputStream.close();
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
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static m1 f(Context context, x xVar, b bVar, p160p8.a aVar, f fVar, b bVar2, p085i0.n nVar, s sVar, p085i0.n nVar2, j jVar, c cVar) {
        p160p8.s sVar2 = new p160p8.s(context, xVar, aVar, nVar, sVar);
        p213v8.a aVar2 = new p213v8.a(bVar, sVar, jVar);
        p194t8.a aVar3 = w8.a.f23792b;
        v.b(context);
        return new m1(sVar2, aVar2, new w8.a(new w8.c(v.a().c(new C6.a(w8.a.f23793c, w8.a.f23794d)).a("FIREBASE_CRASHLYTICS_REPORT", new B6.b("json"), w8.a.f23795e), sVar.b(), nVar2)), fVar, bVar2, xVar, cVar);
    }

    public static List g(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new F(str, str2));
        }
        Collections.sort(arrayList, new F1.b(6));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void h(Throwable th, Thread thread, String str, final p178r8.c cVar, boolean z10) {
        final boolean zEquals = str.equals("crash");
        p160p8.s sVar = (p160p8.s) this.f20740a;
        long j = cVar.f21609b;
        Context context = sVar.f21128a;
        int i10 = context.getResources().getConfiguration().orientation;
        p085i0.n nVar = sVar.f21131d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        Aa.a aVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            aVar = new Aa.a(th2.getLocalizedMessage(), th2.getClass().getName(), nVar.d(th2.getStackTrace()), aVar);
        }
        O o10 = new O();
        o10.f22243b = str;
        o10.f22242a = j;
        o10.g = (byte) (o10.g | 1);
        D0 d0B = m8.c.f19691a.b(context);
        int i11 = ((C1307a0) d0B).f22303c;
        Boolean boolValueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList arrayListA = m8.c.a(context);
        byte b5 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aVar.f556t;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b10 = (byte) 1;
        List listD = p160p8.s.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = boolValueOf;
        if (b10 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b10 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
        }
        arrayList.add(new W(4, name, listD));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrD = nVar.d(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    List listD2 = p160p8.s.d(stackTraceElementArrD, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b10 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if (b10 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb2));
                    }
                    arrayList.add(new W(0, name2, listD2));
                }
                it = it;
                nVar = nVar;
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        U uC = p160p8.s.c(0, aVar);
        V vE = p160p8.s.e();
        List listA = sVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        S s10 = new S(listUnmodifiableList, uC, null, vE, listA);
        if (b5 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b5 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb3));
        }
        o10.f22244c = new Q(s10, null, null, bool, d0B, arrayListA, i10);
        o10.f22245d = sVar.b(i10);
        P pA = o10.a();
        Map map = cVar.f21610c;
        f fVar = (f) this.f20743d;
        b bVar = (b) this.f20744e;
        final K0 k0D = d(a(pA, fVar, bVar, map), bVar);
        if (z10) {
            ((p213v8.a) this.f20741b).d(k0D, cVar.f21608a, zEquals);
        } else {
            ((c) this.g).f21346b.a(new Runnable() { // from class: p8.y
                @Override // java.lang.Runnable
                public final void run() {
                    m1 m1Var = this.f21151r;
                    m1Var.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    ((p213v8.a) m1Var.f20741b).d(k0D, cVar.f21608a, zEquals);
                }
            });
        }
    }

    public o i(Executor executor, String str) {
        i iVar;
        ArrayList arrayListB = ((p213v8.a) this.f20741b).b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) arrayListB.get(i10);
            try {
                p194t8.a aVar = p213v8.a.g;
                String strE = p213v8.a.e(file);
                aVar.getClass();
                arrayList.add(new p160p8.b(p194t8.a.i(strE), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            p160p8.b bVar = (p160p8.b) obj;
            if (str == null || str.equals(bVar.f21057b)) {
                w8.a aVar2 = (w8.a) this.f20742c;
                B b5 = bVar.f21056a;
                if (b5.f22168f == null || b5.g == null) {
                    w wVarB = ((x) this.f20745f).b(true);
                    B b10 = bVar.f21056a;
                    String str2 = wVarB.f21142a;
                    A a9 = b10.a();
                    a9.f22157e = str2;
                    B bA = a9.a();
                    String str3 = wVarB.f21143b;
                    A a10 = bA.a();
                    a10.f22158f = str3;
                    bVar = new p160p8.b(a10.a(), bVar.f21057b, bVar.f21058c);
                }
                boolean z10 = str != null;
                w8.c cVar = aVar2.f23796a;
                synchronized (cVar.f23806f) {
                    try {
                        iVar = new i();
                        if (z10) {
                            ((AtomicInteger) cVar.f23808i.f16733s).getAndIncrement();
                            if (cVar.f23806f.size() < cVar.f23805e) {
                                m8.b bVar2 = m8.b.f19690a;
                                bVar2.b("Enqueueing report: " + bVar.f21057b);
                                bVar2.b("Queue size: " + cVar.f23806f.size());
                                cVar.g.execute(new F1.o(cVar, bVar, iVar, 11));
                                bVar2.b("Closing task for report: " + bVar.f21057b);
                                iVar.b(bVar);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f21057b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.f23808i.f16734t).getAndIncrement();
                                iVar.b(bVar);
                            }
                        } else {
                            cVar.b(bVar, iVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o oVar = iVar.f19402a;
                C1243g0 c1243g0 = new C1243g0();
                oVar.getClass();
                o oVar2 = new o();
                oVar.f19422b.f(new l(executor, c1243g0, oVar2, 0));
                oVar.n();
                arrayList2.add(oVar2);
            }
        }
        return p000a.a.q0(arrayList2);
    }

    public m1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f20743d = layoutParams;
        this.f20744e = new Rect();
        this.f20745f = new int[2];
        this.g = new int[2];
        this.f20740a = context;
        View viewInflate = LayoutInflater.from(context).inflate(com.ayah.R.layout.abc_tooltip, (ViewGroup) null);
        this.f20741b = viewInflate;
        this.f20742c = (TextView) viewInflate.findViewById(com.ayah.R.id.message);
        layoutParams.setTitle(m1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.ayah.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public m1(p160p8.s sVar, p213v8.a aVar, w8.a aVar2, f fVar, b bVar, x xVar, c cVar) {
        this.f20740a = sVar;
        this.f20741b = aVar;
        this.f20742c = aVar2;
        this.f20743d = fVar;
        this.f20744e = bVar;
        this.f20745f = xVar;
        this.g = cVar;
    }

    public m1(na.d dVar) {
        p251z9.j.e(dVar, "taskRunner");
        this.f20740a = dVar;
        this.f20745f = m.f21689a;
        this.g = C1291c.f21650a;
    }
}
