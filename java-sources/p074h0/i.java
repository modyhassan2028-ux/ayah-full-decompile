package p074h0;

import A.C0023i;
import A.o1;
import H9.v;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.U;
import N9.k0;
import U6.C0531i;
import U6.C0534l;
import Z0.B;
import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.ayah.MainActivity;
import com.ayah.common.data.source.json.model.booklist.BookType;
import i7.C0967b0;
import i7.C0972d;
import i7.C0999m;
import i7.C1021t1;
import i7.C1023u0;
import i7.EnumC0977e1;
import i7.G;
import i7.I1;
import i7.InterfaceC0965a1;
import i7.Q1;
import i7.R1;
import i7.V;
import i7.X;
import i7.Y0;
import i7.Z;
import io.realm.RealmFieldTypeConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import p035d3.z;
import p063g1.c;
import p063g1.m;
import p110k9.y;
import p120l9.l;
import p120l9.r;
import p138n8.a;
import p138n8.b;
import p151p.C1256n;
import p151p.C1273w;
import p151p.M;
import p153p1.e;
import p153p1.f;
import p180s0.o;
import p181s2.s;
import p207v2.AbstractC1373k;
import p207v2.C1363a;
import p207v2.C1371i;
import p207v2.C1372j;
import p207v2.C1374l;
import p207v2.EnumC1375m;
import p211v6.d;
import p216w1.n;
import p216w1.q;
import p216w1.t;
import p251z9.j;
import p251z9.k;
import u.C1351f;
import u.E;
import v9.g;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p085i0.i, InterfaceC0965a1, Z, b, a, p211v6.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static i f16419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static i f16420w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f16422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f16424u;

    public /* synthetic */ i(int i10, Object obj, String str, String str2) {
        this.f16421r = i10;
        this.f16422s = obj;
        this.f16423t = str;
        this.f16424u = str2;
    }

    public static i A(Context context, AttributeSet attributeSet, int[] iArr) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static i B(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static final C1363a e(i iVar, C1363a c1363a, C1374l c1374l, C1374l c1374l2) {
        AbstractC1373k abstractC1373k;
        AbstractC1373k abstractC1373k2;
        AbstractC1373k abstractC1373k3;
        iVar.getClass();
        AbstractC1373k abstractC1373k4 = C1372j.f23256c;
        if (c1363a == null || (abstractC1373k = c1363a.f23199a) == null) {
            abstractC1373k = abstractC1373k4;
        }
        AbstractC1373k abstractC1373k5 = c1374l.f23263a;
        AbstractC1373k abstractC1373kH = h(abstractC1373k, abstractC1373k5, abstractC1373k5, c1374l2 != null ? c1374l2.f23263a : null);
        if (c1363a == null || (abstractC1373k2 = c1363a.f23200b) == null) {
            abstractC1373k2 = abstractC1373k4;
        }
        AbstractC1373k abstractC1373kH2 = h(abstractC1373k2, abstractC1373k5, c1374l.f23264b, c1374l2 != null ? c1374l2.f23264b : null);
        if (c1363a != null && (abstractC1373k3 = c1363a.f23201c) != null) {
            abstractC1373k4 = abstractC1373k3;
        }
        return new C1363a(abstractC1373kH, abstractC1373kH2, h(abstractC1373k4, abstractC1373k5, c1374l.f23265c, c1374l2 != null ? c1374l2.f23265c : null), c1374l, c1374l2);
    }

    public static AbstractC1373k h(AbstractC1373k abstractC1373k, AbstractC1373k abstractC1373k2, AbstractC1373k abstractC1373k3, AbstractC1373k abstractC1373k4) {
        if (abstractC1373k4 == null) {
            return abstractC1373k3;
        }
        if (abstractC1373k instanceof C1371i) {
            return ((abstractC1373k2 instanceof C1372j) && (abstractC1373k4 instanceof C1372j)) ? abstractC1373k4 : abstractC1373k;
        }
        return abstractC1373k4;
    }

    public static String k(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                string = "&".concat(string);
            }
            return p.z(str, string);
        }
        return str + "?" + string;
    }

    public void C() {
        ((TypedArray) this.f16423t).recycle();
    }

    public void D(Object obj) {
        long jB = j.b();
        if (jB == l.f16429a) {
            this.f16424u = obj;
            return;
        }
        synchronized (this.f16423t) {
            k kVar = (k) ((AtomicReference) this.f16422s).get();
            int iA = kVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.f16422s).set(kVar.b(jB, obj));
            } else {
                kVar.f16428c[iA] = obj;
            }
        }
    }

    public void E(C1374l c1374l, C1374l c1374l2) {
        j.e(c1374l, "sourceLoadStates");
        l(new C0023i(this, c1374l, c1374l2, 20));
    }

    public void F(EnumC1375m enumC1375m, AbstractC1373k abstractC1373k) {
        j.e(enumC1375m, "type");
        int iOrdinal = enumC1375m.ordinal();
        if (iOrdinal == 0) {
            this.f16422s = abstractC1373k;
        } else if (iOrdinal == 1) {
            this.f16423t = abstractC1373k;
        } else {
            if (iOrdinal != 2) {
                throw new A6.a();
            }
            this.f16424u = abstractC1373k;
        }
    }

    public void G(o oVar) {
        ((p196u0.b) this.f16424u).f22794r.f22792c = oVar;
    }

    public void H(c cVar) {
        ((p196u0.b) this.f16424u).f22794r.f22790a = cVar;
    }

    public void I(m mVar) {
        ((p196u0.b) this.f16424u).f22794r.f22791b = mVar;
    }

    public void J(long j) {
        ((p196u0.b) this.f16424u).f22794r.f22793d = j;
    }

    public C1374l K() {
        return new C1374l((AbstractC1373k) this.f16422s, (AbstractC1373k) this.f16423t, (AbstractC1373k) this.f16424u);
    }

    public void L(f fVar, int i10, int i11) {
        int i12 = fVar.S;
        int i13 = fVar.T;
        fVar.S = 0;
        fVar.T = 0;
        fVar.z(i10);
        fVar.w(i11);
        if (i12 < 0) {
            fVar.S = 0;
        } else {
            fVar.S = i12;
        }
        if (i13 < 0) {
            fVar.T = 0;
        } else {
            fVar.T = i13;
        }
        ((f) this.f16424u).F();
    }

    public void M() {
        E e10 = (E) this.f16422s;
        String str = (String) this.f16423t;
        List list = (List) e10.j(str);
        if (list != null) {
            list.remove((k) this.f16424u);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        e10.l(str, list);
    }

    public synchronized void N(int i10, int i11, long j, long j10) {
        ((C1023u0) this.f16422s).f17564B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f16424u;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        p118l7.o oVarA = ((W6.c) this.f16423t).a(new C0534l(0, Arrays.asList(new C0531i(36301, i10, 0, j, j10, null, null, 0, i11))));
        o1 o1Var = new o1(this, jElapsedRealtime, 2);
        oVarA.getClass();
        oVarA.a(p118l7.j.f19403a, o1Var);
    }

    @Override // p211v6.a
    public boolean a() {
        return ((d) this.f16422s).f19724r;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r9
      0x006b: PHI (r9v13 int) = (r9v7 int), (r9v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:57:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    @Override // i7.InterfaceC0965a1, i7.Z
    public void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        int i11;
        EnumC0977e1 enumC0977e1;
        AtomicReference atomicReference;
        C0967b0 c0967b0;
        C0999m c0999m;
        String strSubstring;
        Object obj;
        switch (this.f16421r) {
            case 5:
                Y0 y10 = (Y0) this.f16423t;
                y10.o();
                I1 i12 = (I1) this.f16424u;
                if (i10 != 200 && i10 != 204) {
                    i11 = 304;
                    if (i10 != 304) {
                        i11 = i10;
                    }
                    X x9 = ((C1023u0) y10.f16104r).f17584w;
                    C1023u0.m(x9);
                    x9.f17185z.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(i12.f17012r), Integer.valueOf(i11), th);
                    if (Arrays.asList(((String) G.f16977u.a(null)).split(",")).contains(String.valueOf(i11))) {
                        enumC0977e1 = EnumC0977e1.BACKOFF;
                    } else {
                        enumC0977e1 = EnumC0977e1.FAILURE;
                    }
                    atomicReference = (AtomicReference) this.f16422s;
                    C1021t1 c1021t1P = ((C1023u0) y10.f16104r).p();
                    long j = i12.f17012r;
                    C0972d c0972d = new C0972d(enumC0977e1.f17344r, j, i12.f17017w);
                    c1021t1P.o();
                    c1021t1P.p();
                    c1021t1P.C(new F1.o((Object) c1021t1P, (Object) c1021t1P.E(true), (Parcelable) c0972d, 8));
                    X x10 = ((C1023u0) y10.f16104r).f17584w;
                    C1023u0.m(x10);
                    x10.f17178E.c(Long.valueOf(j), enumC0977e1, "[sgtm] Updated status for row_id");
                    synchronized (atomicReference) {
                        atomicReference.set(enumC0977e1);
                        atomicReference.notifyAll();
                        break;
                    }
                    return;
                }
                i11 = i10;
                if (th == null) {
                    X x11 = ((C1023u0) y10.f16104r).f17584w;
                    C1023u0.m(x11);
                    x11.f17178E.b(Long.valueOf(i12.f17012r), "[sgtm] Upload succeeded for row_id");
                    enumC0977e1 = EnumC0977e1.SUCCESS;
                } else {
                    X x12 = ((C1023u0) y10.f16104r).f17584w;
                    C1023u0.m(x12);
                    x12.f17185z.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(i12.f17012r), Integer.valueOf(i11), th);
                    if (Arrays.asList(((String) G.f16977u.a(null)).split(",")).contains(String.valueOf(i11))) {
                        enumC0977e1 = EnumC0977e1.BACKOFF;
                    } else {
                        enumC0977e1 = EnumC0977e1.FAILURE;
                    }
                }
                atomicReference = (AtomicReference) this.f16422s;
                C1021t1 c1021t1P2 = ((C1023u0) y10.f16104r).p();
                long j10 = i12.f17012r;
                C0972d c0972d2 = new C0972d(enumC0977e1.f17344r, j10, i12.f17017w);
                c1021t1P2.o();
                c1021t1P2.p();
                c1021t1P2.C(new F1.o((Object) c1021t1P2, (Object) c1021t1P2.E(true), (Parcelable) c0972d2, 8));
                X x13 = ((C1023u0) y10.f16104r).f17584w;
                C1023u0.m(x13);
                x13.f17178E.c(Long.valueOf(j10), enumC0977e1, "[sgtm] Updated status for row_id");
                synchronized (atomicReference) {
                    atomicReference.set(enumC0977e1);
                    atomicReference.notifyAll();
                    return;
                }
            case 6:
                ((Q1) this.f16424u).y(true, i10, th, bArr, (String) this.f16422s, (ArrayList) this.f16423t);
                return;
            default:
                long j11 = ((R1) this.f16423t).f17116a;
                Q1 q10 = (Q1) this.f16424u;
                String str2 = (String) this.f16422s;
                q10.c().o();
                q10.l0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        q10.f17093L = false;
                        q10.O();
                    }
                }
                if (i10 == 200) {
                    if (th == null) {
                        C0999m c0999m2 = q10.f17106t;
                        Q1.U(c0999m2);
                        c0999m2.v(Long.valueOf(j11));
                        q10.b().f17178E.c(str2, Integer.valueOf(i10), "Successfully uploaded batch from upload queue. appId, status");
                        c0967b0 = q10.f17105s;
                        Q1.U(c0967b0);
                        if (c0967b0.I()) {
                            c0999m = q10.f17106t;
                            Q1.U(c0999m);
                            if (c0999m.u(str2)) {
                                q10.t(str2);
                            } else {
                                q10.N();
                            }
                        } else {
                            q10.N();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        V v10 = q10.b().f17175B;
                        Integer numValueOf = Integer.valueOf(i10);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        v10.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        C0999m c0999m3 = q10.f17106t;
                        Q1.U(c0999m3);
                        c0999m3.A(Long.valueOf(j11));
                        q10.N();
                    }
                } else if (i10 == 204) {
                    i10 = 204;
                    if (th == null) {
                        C0999m c0999m4 = q10.f17106t;
                        Q1.U(c0999m4);
                        c0999m4.v(Long.valueOf(j11));
                        q10.b().f17178E.c(str2, Integer.valueOf(i10), "Successfully uploaded batch from upload queue. appId, status");
                        c0967b0 = q10.f17105s;
                        Q1.U(c0967b0);
                        if (c0967b0.I()) {
                            c0999m = q10.f17106t;
                            Q1.U(c0999m);
                            if (c0999m.u(str2)) {
                                q10.t(str2);
                            } else {
                                q10.N();
                            }
                        } else {
                            q10.N();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        V v11 = q10.b().f17175B;
                        Integer numValueOf2 = Integer.valueOf(i10);
                        obj = th;
                        if (th == null) {
                            obj = strSubstring;
                        }
                        v11.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        C0999m c0999m5 = q10.f17106t;
                        Q1.U(c0999m5);
                        c0999m5.A(Long.valueOf(j11));
                        q10.N();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    V v12 = q10.b().f17175B;
                    Integer numValueOf3 = Integer.valueOf(i10);
                    obj = th;
                    if (th == null) {
                        obj = strSubstring;
                    }
                    v12.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    C0999m c0999m6 = q10.f17106t;
                    Q1.U(c0999m6);
                    c0999m6.A(Long.valueOf(j11));
                    q10.N();
                }
                return;
        }
    }

    @Override // p211v6.a
    public void c(long j) {
        Handler handler = (Handler) this.f16423t;
        p211v6.b bVar = (p211v6.b) this.f16424u;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, j);
    }

    @Override // p211v6.a
    public void d() {
        ((Handler) this.f16423t).removeCallbacks((p211v6.b) this.f16424u);
        ((d) this.f16422s).f23345t.setSystemUiVisibility(3847);
    }

    public void f(double d5, float f3) {
        int length = ((float[]) this.f16422s).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f16423t, d5);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f16423t = Arrays.copyOf((double[]) this.f16423t, length);
        this.f16422s = Arrays.copyOf((float[]) this.f16422s, length);
        this.f16424u = new double[length];
        double[] dArr = (double[]) this.f16423t;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f16423t)[iBinarySearch] = d5;
        ((float[]) this.f16422s)[iBinarySearch] = f3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(q9.c cVar) {
        p248z6.b bVar;
        List list;
        List list2;
        ArrayList arrayList;
        BookType bookType;
        String name;
        BookType bookType2;
        Object obj;
        Context context = (Context) this.f16422s;
        if (cVar instanceof p248z6.b) {
            bVar = (p248z6.b) cVar;
            int i10 = bVar.f24844v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f24844v = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new p248z6.b(this, cVar);
            }
        } else {
            bVar = new p248z6.b(this, cVar);
        }
        Object obj2 = bVar.f24842t;
        int i11 = bVar.f24844v;
        int i12 = 0;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            File[] fileArrListFiles = context.getFilesDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : fileArrListFiles) {
                    j.b(file);
                    if (g.g(file).equals("db")) {
                        arrayList2.add(file);
                    }
                }
                list = arrayList2;
            } else {
                list = r.f19440r;
            }
            String[] strArrDatabaseList = context.databaseList();
            j.d(strArrDatabaseList, "databaseList(...)");
            ArrayList arrayList3 = new ArrayList();
            for (String str : strArrDatabaseList) {
                j.b(str);
                if (v.L0(str, "db") && !((List) this.f16424u).contains(str)) {
                    arrayList3.add(str);
                }
            }
            D3.c cVar2 = (D3.c) this.f16423t;
            bVar.f24840r = list;
            bVar.f24841s = arrayList3;
            bVar.f24844v = 1;
            Object objA = cVar2.a(bVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objA == aVar) {
                return aVar;
            }
            list2 = list;
            obj2 = objA;
            arrayList = arrayList3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = bVar.f24841s;
            list2 = (List) bVar.f24840r;
            p110k9.a.e(obj2);
        }
        List<BookType> list3 = (List) obj2;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list3.iterator();
        while (true) {
            Object obj3 = null;
            if (!it.hasNext()) {
                break;
            }
            BookType bookType3 = (BookType) it.next();
            for (Object obj4 : list2) {
                String name2 = ((File) obj4).getName();
                j.d(name2, "getName(...)");
                if (H9.o.V0(name2, bookType3.f13685a)) {
                    obj3 = obj4;
                    break;
                }
            }
            File file2 = (File) obj3;
            if (file2 != null) {
                arrayList4.add(file2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList4.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj5 = arrayList4.get(i13);
            i13++;
            if (context.getDatabasePath(((File) obj5).getName()).exists()) {
                arrayList5.add(obj5);
            }
        }
        int size2 = arrayList5.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj6 = arrayList5.get(i14);
            i14++;
            ((File) obj6).delete();
        }
        ArrayList arrayList6 = new ArrayList();
        for (BookType bookType4 : list3) {
            int size3 = arrayList.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i15);
                i15++;
                String str2 = (String) obj;
                j.b(str2);
                if (H9.o.V0(str2, bookType4.f13685a) && !H9.o.V0(str2, bookType4.f13686b)) {
                    break;
                }
            }
            String str3 = (String) obj;
            if (str3 != null) {
                arrayList6.add(str3);
            }
        }
        int size4 = arrayList6.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj7 = arrayList6.get(i16);
            i16++;
            context.deleteDatabase((String) obj7);
        }
        ArrayList arrayList7 = new ArrayList();
        int size5 = arrayList.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj8 = arrayList.get(i17);
            i17++;
            String str4 = (String) obj8;
            if (!list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                do {
                    if (it2.hasNext()) {
                        bookType2 = (BookType) it2.next();
                        j.b(str4);
                    }
                } while (!H9.o.V0(str4, bookType2.f13685a));
            }
            arrayList7.add(obj8);
        }
        int size6 = arrayList7.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj9 = arrayList7.get(i18);
            i18++;
            context.deleteDatabase((String) obj9);
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj10 : list2) {
            File file3 = (File) obj10;
            if (!list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                do {
                    if (it3.hasNext()) {
                        bookType = (BookType) it3.next();
                        name = file3.getName();
                        j.d(name, "getName(...)");
                    }
                } while (!H9.o.V0(name, bookType.f13685a));
            }
            arrayList8.add(obj10);
        }
        int size7 = arrayList8.size();
        while (i12 < size7) {
            Object obj11 = arrayList8.get(i12);
            i12++;
            ((File) obj11).delete();
        }
        return y.f19095a;
    }

    @Override // p138n8.a
    public void i(Bundle bundle) {
        synchronized (this.f16423t) {
            try {
                m8.b bVar = m8.b.f19690a;
                bVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f16424u = new CountDownLatch(1);
                ((B) this.f16422s).i(bundle);
                bVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f16424u).await(500, TimeUnit.MILLISECONDS)) {
                        bVar.c("App exception callback received from Analytics listener.");
                    } else {
                        bVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f16424u = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p138n8.b
    public void j(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f16424u;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void l(p241y9.c cVar) {
        Object value;
        C1363a c1363a;
        k0 k0Var = (k0) this.f16423t;
        do {
            value = k0Var.getValue();
            C1363a c1363a2 = (C1363a) value;
            c1363a = (C1363a) cVar.e(c1363a2);
            if (j.a(c1363a2, c1363a)) {
                return;
            }
        } while (!k0Var.l(value, c1363a));
        if (c1363a != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f16422s).iterator();
            while (it.hasNext()) {
                ((p241y9.c) it.next()).e(c1363a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    public Da.r m() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        p170q8.c.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            try {
                String strK = k((String) this.f16422s, (HashMap) this.f16423t);
                String str = "GET Request URL: " + strK;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str, null);
                    }
                    httpsURLConnection = (HttpsURLConnection) new URL(strK).openConnection();
                    try {
                        httpsURLConnection.setReadTimeout(10000);
                        httpsURLConnection.setConnectTimeout(10000);
                        httpsURLConnection.setRequestMethod("GET");
                        for (Map.Entry entry : ((HashMap) this.f16424u).entrySet()) {
                            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        InputStream inputStream2 = httpsURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                char[] cArr = new char[8192];
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    int i10 = bufferedReader.read(cArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    sb.append(cArr, 0, i10);
                                }
                                string = sb.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpsURLConnection.disconnect();
                        return new Da.r(responseCode, string);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    httpsURLConnection = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public Object n() {
        long jB = j.b();
        if (jB == l.f16429a) {
            return this.f16424u;
        }
        k kVar = (k) ((AtomicReference) this.f16422s).get();
        int iA = kVar.a(jB);
        if (iA >= 0) {
            return kVar.f16428c[iA];
        }
        return null;
    }

    public AbstractC1373k o(EnumC1375m enumC1375m) {
        j.e(enumC1375m, "loadType");
        int iOrdinal = enumC1375m.ordinal();
        if (iOrdinal == 0) {
            return (AbstractC1373k) this.f16422s;
        }
        if (iOrdinal == 1) {
            return (AbstractC1373k) this.f16423t;
        }
        if (iOrdinal == 2) {
            return (AbstractC1373k) this.f16424u;
        }
        throw new A6.a();
    }

    public o p() {
        return ((p196u0.b) this.f16424u).f22794r.f22792c;
    }

    public ColorStateList q(int i10) {
        int resourceId;
        ColorStateList colorStateListE;
        TypedArray typedArray = (TypedArray) this.f16423t;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListE = s.e((Context) this.f16422s, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListE;
    }

    public Drawable r(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f16423t;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : Y2.a.E((Context) this.f16422s, resourceId);
    }

    public Drawable s(int i10) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f16423t).hasValue(i10) || (resourceId = ((TypedArray) this.f16423t).getResourceId(i10, 0)) == 0) {
            return null;
        }
        C1273w c1273wA = C1273w.a();
        Context context = (Context) this.f16422s;
        synchronized (c1273wA) {
            drawableG = c1273wA.f20798a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface t(int i10, int i11, M m10) {
        int resourceId = ((TypedArray) this.f16423t).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f16424u) == null) {
            this.f16424u = new TypedValue();
        }
        Context context = (Context) this.f16422s;
        TypedValue typedValue = (TypedValue) this.f16424u;
        ThreadLocal threadLocal = p244z1.j.f24770a;
        if (context.isRestricted()) {
            return null;
        }
        return p244z1.j.c(context, resourceId, typedValue, i11, m10, true, false);
    }

    public String toString() {
        switch (this.f16421r) {
            case 9:
                return "pos =" + Arrays.toString((double[]) this.f16423t) + " period=" + Arrays.toString((float[]) this.f16422s);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                String str = (String) this.f16424u;
                String str2 = (String) this.f16423t;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f16422s;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String string = sb.toString();
                j.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // p211v6.a
    public void toggle() {
        d dVar = (d) this.f16422s;
        boolean z10 = dVar.f19724r;
        View view = dVar.f23345t;
        if (z10) {
            view.setSystemUiVisibility(3847);
        } else {
            view.setSystemUiVisibility(1792);
        }
    }

    public double u(double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        } else if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) this.f16423t, d5);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i10 = -iBinarySearch;
        int i11 = i10 - 1;
        float[] fArr = (float[]) this.f16422s;
        float f3 = fArr[i11];
        int i12 = i10 - 2;
        float f7 = fArr[i12];
        double[] dArr = (double[]) this.f16423t;
        double d9 = dArr[i11];
        double d10 = dArr[i12];
        double d11 = ((double) (f3 - f7)) / (d9 - d10);
        return ((((d5 * d5) - (d10 * d10)) * d11) / 2.0d) + ((d5 - d10) * (((double) f7) - (d11 * d10))) + ((double[]) this.f16424u)[i12];
    }

    public long v() {
        return ((p196u0.b) this.f16424u).f22794r.f22793d;
    }

    public double w(double d5) {
        return Math.sin(u(d5) * 6.283185307179586d);
    }

    public void x(String str, String str2) {
        ((HashMap) this.f16424u).put(str, str2);
    }

    public boolean y(s1.d dVar, e eVar, boolean z10) {
        p163q1.b bVar = (p163q1.b) this.f16423t;
        p153p1.d[] dVarArr = eVar.f20860J;
        int[] iArr = eVar.f20887l;
        bVar.f21238a = dVarArr[0];
        bVar.f21239b = dVarArr[1];
        bVar.f21240c = eVar.m();
        bVar.f21241d = eVar.j();
        bVar.f21245i = false;
        bVar.j = z10;
        p153p1.d dVar2 = bVar.f21238a;
        p153p1.d dVar3 = p153p1.d.f20848t;
        boolean z11 = dVar2 == dVar3;
        boolean z12 = bVar.f21239b == dVar3;
        boolean z13 = z11 && eVar.f20864N > 0.0f;
        boolean z14 = z12 && eVar.f20864N > 0.0f;
        p153p1.d dVar4 = p153p1.d.f20846r;
        if (z13 && iArr[0] == 4) {
            bVar.f21238a = dVar4;
        }
        if (z14 && iArr[1] == 4) {
            bVar.f21239b = dVar4;
        }
        dVar.a(eVar, bVar);
        eVar.z(bVar.f21242e);
        eVar.w(bVar.f21243f);
        eVar.f20898w = bVar.f21244h;
        int i10 = bVar.g;
        eVar.R = i10;
        eVar.f20898w = i10 > 0;
        bVar.j = false;
        return bVar.f21245i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(int i10, q9.c cVar) {
        p117l6.a aVar;
        p124m3.j jVar;
        if (cVar instanceof p117l6.a) {
            aVar = (p117l6.a) cVar;
            int i11 = aVar.f19400v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f19400v = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new p117l6.a(this, cVar);
            }
        } else {
            aVar = new p117l6.a(this, cVar);
        }
        Object objG = aVar.f19398t;
        int i12 = aVar.f19400v;
        p161p9.a aVar2 = p161p9.a.f21156r;
        if (i12 == 0) {
            p110k9.a.e(objG);
            C1256n c1256n = (C1256n) this.f16422s;
            aVar.f19396r = i10;
            aVar.f19400v = 1;
            objG = c1256n.g(i10, aVar);
            if (objG != aVar2) {
            }
            return aVar2;
        }
        if (i12 == 1) {
            i10 = aVar.f19396r;
            p110k9.a.e(objG);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = aVar.f19397s;
            p110k9.a.e(objG);
        }
        return new p108k6.a(jVar, (E3.c) objG);
        p124m3.j jVar2 = (p124m3.j) objG;
        p198u3.f fVar = (p198u3.f) this.f16423t;
        aVar.f19397s = jVar2;
        aVar.f19396r = i10;
        aVar.f19400v = 2;
        Object objR = B9.a.R(fVar.f22895a.f497a, true, false, new A3.b(i10, 3), aVar);
        if (objR != aVar2) {
            objG = objR;
            jVar = jVar2;
            return new p108k6.a(jVar, (E3.c) objG);
        }
        return aVar2;
    }

    public /* synthetic */ i(int i10, boolean z10) {
        this.f16421r = i10;
    }

    public /* synthetic */ i(Y0 y10, AtomicReference atomicReference, I1 i10) {
        this.f16421r = 5;
        this.f16423t = y10;
        this.f16422s = atomicReference;
        this.f16424u = i10;
    }

    public /* synthetic */ i(Q1 q10, String str, Object obj, int i10) {
        this.f16421r = i10;
        this.f16422s = str;
        this.f16423t = obj;
        this.f16424u = q10;
    }

    public i(Context context, C1023u0 c1023u0) {
        this.f16421r = 4;
        this.f16424u = new AtomicLong(-1L);
        this.f16423t = new W6.c(context, W6.c.f9642i, new U6.m("measurement:api"), S6.b.f7504b);
        this.f16422s = c1023u0;
    }

    public i(Context context, D3.c cVar) {
        this.f16421r = 20;
        j.e(cVar, "bookSource");
        this.f16422s = context;
        this.f16423t = cVar;
        this.f16424u = l.S(new String[]{"ayah.db", "quran-text.db"});
    }

    public i(C1256n c1256n, p198u3.f fVar) {
        this.f16421r = 8;
        j.e(fVar, "notesModel");
        this.f16422s = c1256n;
        this.f16423t = fVar;
        this.f16424u = AbstractC0405x.b(AbstractC0405x.e());
    }

    public i(int i10) {
        this.f16421r = i10;
        switch (i10) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                this.f16422s = new CopyOnWriteArrayList();
                k0 k0VarC = AbstractC0419l.c(null);
                this.f16423t = k0VarC;
                this.f16424u = new U(k0VarC);
                break;
            default:
                this.f16422s = new AtomicReference(j.f16425a);
                this.f16423t = new Object();
                break;
        }
    }

    public i(String str, HashMap map) {
        this.f16421r = 15;
        this.f16422s = str;
        this.f16423t = map;
        this.f16424u = new HashMap();
    }

    public i(B b5) {
        this.f16421r = 10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f16423t = new Object();
        this.f16422s = b5;
    }

    public i(p196u0.b bVar) {
        this.f16421r = 14;
        this.f16424u = bVar;
        this.f16422s = new p151p.V(this);
    }

    public i(Context context, TypedArray typedArray) {
        this.f16421r = 11;
        this.f16422s = context;
        this.f16423t = typedArray;
    }

    public i(Context context, LocationManager locationManager) {
        this.f16421r = 1;
        this.f16424u = new p084i.G();
        this.f16422s = context;
        this.f16423t = locationManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v29 */
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
    public i(p216w1.p pVar) {
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        Bundle bundle2;
        int i11;
        this.f16421r = 19;
        new ArrayList();
        this.f16424u = new Bundle();
        this.f16423t = pVar;
        Context context = pVar.f23603a;
        ArrayList arrayList2 = pVar.f23621u;
        ArrayList arrayList3 = pVar.f23605c;
        ArrayList arrayList4 = pVar.f23606d;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16422s = p216w1.r.a(context, pVar.f23618r);
        } else {
            this.f16422s = new Notification.Builder(context);
        }
        Notification notification = pVar.f23620t;
        ?? r10 = 0;
        ((Notification.Builder) this.f16422s).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.f23607e).setContentText(pVar.f23608f).setContentInfo(null).setContentIntent(pVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(pVar.f23612l, pVar.f23613m, false);
        Notification.Builder builder = (Notification.Builder) this.f16422s;
        IconCompat iconCompat = pVar.f23609h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        ((Notification.Builder) this.f16422s).setSubText(null).setUsesChronometer(false).setPriority(pVar.f23610i);
        ArrayList arrayList5 = pVar.f23604b;
        int size = arrayList5.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList5.get(i12);
            i12++;
            n nVar = (n) obj;
            int i13 = Build.VERSION.SDK_INT;
            if (nVar.f23597b == null && (i11 = nVar.f23600e) != 0) {
                nVar.f23597b = IconCompat.d(r10, "", i11);
            }
            IconCompat iconCompat2 = nVar.f23597b;
            boolean z10 = nVar.f23598c;
            Bundle bundle3 = nVar.f23596a;
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != 0 ? iconCompat2.g(r10) : r10, nVar.f23601f, nVar.g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            if (i13 >= 24) {
                q.b(builder2, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                p216w1.s.a(builder2);
            }
            if (i13 >= 29) {
                p216w1.f.d(builder2);
            }
            if (i13 >= 31) {
                t.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", nVar.f23599d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f16422s).addAction(builder2.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            r10 = 0;
        }
        ArrayList arrayList8 = arrayList3;
        Bundle bundle4 = pVar.f23615o;
        if (bundle4 != null) {
            ((Bundle) this.f16424u).putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f16422s).setShowWhen(pVar.j);
        ((Notification.Builder) this.f16422s).setLocalOnly(pVar.f23614n);
        ((Notification.Builder) this.f16422s).setGroup(null);
        ((Notification.Builder) this.f16422s).setSortKey(null);
        ((Notification.Builder) this.f16422s).setGroupSummary(false);
        ((Notification.Builder) this.f16422s).setCategory(null);
        ((Notification.Builder) this.f16422s).setColor(pVar.f23616p);
        ((Notification.Builder) this.f16422s).setVisibility(pVar.f23617q);
        ((Notification.Builder) this.f16422s).setPublicVersion(null);
        ((Notification.Builder) this.f16422s).setSound(notification.sound, notification.audioAttributes);
        if (i14 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw p245z2.a.z(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C1351f c1351f = new C1351f(arrayList2.size() + arrayList.size());
                    c1351f.addAll(arrayList);
                    c1351f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c1351f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList2.get(i15);
                i15++;
                ((Notification.Builder) this.f16422s).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (pVar.f23615o == null) {
                pVar.f23615o = new Bundle();
            }
            Bundle bundle5 = pVar.f23615o.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                String string = Integer.toString(i16);
                n nVar2 = (n) arrayList4.get(i16);
                Bundle bundle8 = new Bundle();
                if (nVar2.f23597b == null && (i10 = nVar2.f23600e) != 0) {
                    nVar2.f23597b = IconCompat.d(null, "", i10);
                }
                IconCompat iconCompat3 = nVar2.f23597b;
                Bundle bundle9 = nVar2.f23596a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.e() : 0);
                bundle8.putCharSequence("title", nVar2.f23601f);
                bundle8.putParcelable("actionIntent", nVar2.g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", nVar2.f23598c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", nVar2.f23599d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (pVar.f23615o == null) {
                pVar.f23615o = new Bundle();
            }
            pVar.f23615o.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f16424u).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 24) {
            ((Notification.Builder) this.f16422s).setExtras(pVar.f23615o);
            q.c((Notification.Builder) this.f16422s);
        }
        if (i17 >= 26) {
            p216w1.r.b((Notification.Builder) this.f16422s);
            p216w1.r.d((Notification.Builder) this.f16422s);
            p216w1.r.e((Notification.Builder) this.f16422s);
            p216w1.r.f((Notification.Builder) this.f16422s);
            p216w1.r.c((Notification.Builder) this.f16422s);
            if (!TextUtils.isEmpty(pVar.f23618r)) {
                ((Notification.Builder) this.f16422s).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i17 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw p245z2.a.z(it2);
            }
        }
        if (i17 >= 29) {
            p216w1.f.b((Notification.Builder) this.f16422s, pVar.f23619s);
            p216w1.f.c((Notification.Builder) this.f16422s);
        }
    }

    public i(f fVar) {
        this.f16421r = 12;
        this.f16422s = new ArrayList();
        this.f16423t = new p163q1.b();
        this.f16424u = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(E e10, String str, p241y9.a aVar) {
        this.f16421r = 2;
        this.f16422s = e10;
        this.f16423t = str;
        this.f16424u = (k) aVar;
    }

    public i(MainActivity mainActivity, z zVar, View view) {
        this.f16421r = 18;
        this.f16423t = new Handler(Looper.getMainLooper());
        this.f16424u = new p211v6.b(0, this);
        this.f16422s = new d(mainActivity, zVar, view);
    }
}
