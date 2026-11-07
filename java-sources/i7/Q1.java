package i7;

import E2.RunnableC0147v;
import android.app.AlarmManager;
import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0797c1;
import com.google.android.gms.internal.measurement.C0802d1;
import com.google.android.gms.internal.measurement.C0812f1;
import com.google.android.gms.internal.measurement.C0817g1;
import com.google.android.gms.internal.measurement.C0827i1;
import com.google.android.gms.internal.measurement.C0832j1;
import com.google.android.gms.internal.measurement.C0837k1;
import com.google.android.gms.internal.measurement.C0842l1;
import com.google.android.gms.internal.measurement.C0869q3;
import com.google.android.gms.internal.measurement.C0872r2;
import com.google.android.gms.internal.measurement.C0876s1;
import com.google.android.gms.internal.measurement.C0881t1;
import com.google.android.gms.internal.measurement.C0883t3;
import com.google.android.gms.internal.measurement.C0886u1;
import com.google.android.gms.internal.measurement.C0910z0;
import com.google.android.gms.internal.measurement.R3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 implements D0 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static volatile Q1 f17081b0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0991j0 f17083B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1023u0 f17084C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f17086E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f17087F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f17088G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f17090I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f17091J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f17092K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f17093L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f17094M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public FileLock f17095N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public FileChannel f17096O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f17097P;
    public ArrayList Q;
    public final HashMap S;
    public final HashMap T;
    public final HashMap U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0983g1 f17099W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f17100X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public z1 f17101Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f17102Z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1003n0 f17104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0967b0 f17105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0999m f17106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0973d0 f17107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public G1 f17108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0969c f17109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0967b0 f17110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0967b0 f17111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1027v1 f17112z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final AtomicBoolean f17085D = new AtomicBoolean(false);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final LinkedList f17089H = new LinkedList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final HashMap f17098V = new HashMap();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Z0.B f17103a0 = new Z0.B(14, this);
    public long R = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N1 f17082A = new N1(this);

    public Q1(p013b2.n nVar) {
        this.f17084C = C1023u0.s(nVar.f13172a, null, null);
        C0967b0 c0967b0 = new C0967b0(this, 2);
        c0967b0.q();
        this.f17110x = c0967b0;
        C0967b0 c0967b1 = new C0967b0(this, 0);
        c0967b1.q();
        this.f17105s = c0967b1;
        C1003n0 c1003n0 = new C1003n0(this);
        c1003n0.q();
        this.f17104r = c1003n0;
        this.S = new HashMap();
        this.T = new HashMap();
        this.U = new HashMap();
        c().x(new RunnableC0147v(this, nVar));
    }

    public static Q1 C(Context context) {
        U6.y.f(context);
        U6.y.f(context.getApplicationContext());
        if (f17081b0 == null) {
            synchronized (Q1.class) {
                try {
                    if (f17081b0 == null) {
                        f17081b0 = new Q1(new p013b2.n(context, 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17081b0;
    }

    public static final void D(C0797c1 c0797c1, int i10, String str) {
        List listH = c0797c1.h();
        for (int i11 = 0; i11 < listH.size(); i11++) {
            if ("_err".equals(((C0817g1) listH.get(i11)).q())) {
                return;
            }
        }
        C0812f1 c0812f1B = C0817g1.B();
        c0812f1B.h("_err");
        c0812f1B.j(i10);
        C0817g1 c0817g1 = (C0817g1) c0812f1B.e();
        C0812f1 c0812f1B2 = C0817g1.B();
        c0812f1B2.h("_ev");
        c0812f1B2.i(str);
        C0817g1 c0817g2 = (C0817g1) c0812f1B2.e();
        c0797c1.k(c0817g1);
        c0797c1.k(c0817g2);
    }

    public static final void E(C0797c1 c0797c1, String str) {
        List listH = c0797c1.h();
        for (int i10 = 0; i10 < listH.size(); i10++) {
            if (str.equals(((C0817g1) listH.get(i10)).q())) {
                c0797c1.m(i10);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(X1 x9) {
        return !TextUtils.isEmpty(x9.f17205s);
    }

    public static final void U(L1 l10) {
        if (l10 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!l10.f17029t) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(l10.getClass())));
        }
    }

    public static final Boolean V(X1 x9) {
        Boolean bool = x9.f17193G;
        String str = x9.T;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((E0) X4.c.u(str).f9953r).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r11
      0x0047: PHI (r11v12 int) = (r11v2 int), (r11v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    public final void A(String str, int i10, Throwable th, byte[] bArr, Map map) {
        boolean z10;
        C0967b0 c0967b0 = this.f17105s;
        c().o();
        l0();
        U6.y.c(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f17092K = false;
                O();
                throw th2;
            }
        }
        V v10 = b().f17178E;
        Integer numValueOf = Integer.valueOf(bArr.length);
        v10.b(numValueOf, "onConfigFetched. Response size");
        C0999m c0999m = this.f17106t;
        U(c0999m);
        c0999m.a0();
        try {
            C0999m c0999m2 = this.f17106t;
            U(c0999m2);
            C0970c0 c0970c0Q0 = c0999m2.q0(str);
            if (i10 == 200 || i10 == 204) {
                if (th == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 == 304) {
                i10 = 304;
                if (th == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (c0970c0Q0 == null) {
                b().f17185z.b(X.w(str), "App does not exist in onConfigFetched. appId");
            } else {
                C1003n0 c1003n0 = this.f17104r;
                if (z10 || i10 == 404) {
                    String strM = M("Last-Modified", map);
                    String strM2 = M("ETag", map);
                    if (i10 == 404 || i10 == 304) {
                        U(c1003n0);
                        if (c1003n0.A(str) == null) {
                            U(c1003n0);
                            c1003n0.C(str, null, null, null);
                        }
                    } else {
                        U(c1003n0);
                        c1003n0.C(str, bArr, strM, strM2);
                    }
                    e().getClass();
                    c0970c0Q0.f(System.currentTimeMillis());
                    C0999m c0999m3 = this.f17106t;
                    U(c0999m3);
                    c0999m3.r0(c0970c0Q0, false);
                    if (i10 == 404) {
                        b().f17175B.b(str, "Config not found. Using empty config. appId");
                    } else {
                        b().f17178E.c(Integer.valueOf(i10), numValueOf, "Successfully fetched config. Got network response. code, size");
                    }
                    U(c0967b0);
                    if (c0967b0.I() && L()) {
                        q();
                    } else {
                        U(c0967b0);
                        if (c0967b0.I()) {
                            C0999m c0999m4 = this.f17106t;
                            U(c0999m4);
                            if (c0999m4.u(c0970c0Q0.D())) {
                                t(c0970c0Q0.D());
                            } else {
                                N();
                            }
                        } else {
                            N();
                        }
                    }
                } else {
                    e().getClass();
                    c0970c0Q0.g(System.currentTimeMillis());
                    C0999m c0999m5 = this.f17106t;
                    U(c0999m5);
                    c0999m5.r0(c0970c0Q0, false);
                    b().f17178E.c(Integer.valueOf(i10), th, "Fetching config failed. code, error");
                    U(c1003n0);
                    c1003n0.o();
                    c1003n0.f17476D.put(str, null);
                    C0979f0 c0979f0 = this.f17112z.f17626z;
                    e().getClass();
                    c0979f0.b(System.currentTimeMillis());
                    if (i10 == 503 || i10 == 429) {
                        C0979f0 c0979f1 = this.f17112z.f17624x;
                        e().getClass();
                        c0979f1.b(System.currentTimeMillis());
                    }
                    N();
                }
            }
            C0999m c0999m6 = this.f17106t;
            U(c0999m6);
            c0999m6.b0();
            C0999m c0999m7 = this.f17106t;
            U(c0999m7);
            c0999m7.c0();
            this.f17092K = false;
            O();
        } catch (Throwable th3) {
            C0999m c0999m8 = this.f17106t;
            U(c0999m8);
            c0999m8.c0();
            throw th3;
        }
    }

    public final void B() {
        c().o();
        l0();
        if (this.f17086E) {
            return;
        }
        this.f17086E = true;
        c().o();
        FileLock fileLock = this.f17095N;
        C1023u0 c1023u0 = this.f17084C;
        if (fileLock == null || !fileLock.isValid()) {
            ((C1023u0) this.f17106t.f16104r).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(c1023u0.f17579r.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f17096O = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f17095N = fileLockTryLock;
                if (fileLockTryLock == null) {
                    b().f17182w.a("Storage concurrent data access panic");
                    return;
                }
                b().f17178E.a("Storage concurrent access okay");
            } catch (FileNotFoundException e10) {
                b().f17182w.b(e10, "Failed to acquire storage lock");
                return;
            } catch (IOException e11) {
                b().f17182w.b(e11, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e12) {
                b().f17185z.b(e12, "Storage lock already acquired");
                return;
            }
        } else {
            b().f17178E.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f17096O;
        c().o();
        int i10 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().f17182w.a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i11 = fileChannel.read(byteBufferAllocate);
                if (i11 == 4) {
                    byteBufferAllocate.flip();
                    i10 = byteBufferAllocate.getInt();
                } else if (i11 != -1) {
                    b().f17185z.b(Integer.valueOf(i11), "Unexpected data length. Bytes read");
                }
            } catch (IOException e13) {
                b().f17182w.b(e13, "Failed to read from channel");
            }
        }
        O oR = c1023u0.r();
        oR.p();
        int i12 = oR.f17048v;
        c().o();
        if (i10 > i12) {
            b().f17182w.c(Integer.valueOf(i10), Integer.valueOf(i12), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i10 < i12) {
            FileChannel fileChannel2 = this.f17096O;
            c().o();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().f17182w.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i12);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().f17182w.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    b().f17178E.c(Integer.valueOf(i10), Integer.valueOf(i12), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e14) {
                    b().f17182w.b(e14, "Failed to write to channel");
                }
            }
            b().f17182w.c(Integer.valueOf(i10), Integer.valueOf(i12), "Storage version upgrade failed. Previous, current version");
        }
    }

    public final int F(String str, Z0.B b5) throws Throwable {
        E0 e0S;
        C1003n0 c1003n0 = this.f17104r;
        com.google.android.gms.internal.measurement.C0 c0J = c1003n0.J(str);
        G0 g10 = G0.f16992v;
        if (c0J == null) {
            b5.o(g10, EnumC0984h.FAILSAFE);
            return 1;
        }
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C0970c0 c0970c0Q0 = c0999m.q0(str);
        if (c0970c0Q0 == null || ((E0) X4.c.u(c0970c0Q0.s()).f9953r) != E0.f16863t || (e0S = c1003n0.s(str, g10)) == E0.f16862s) {
            b5.o(g10, EnumC0984h.REMOTE_DEFAULT);
            if (c1003n0.I(str, g10)) {
                return 0;
            }
        } else {
            b5.o(g10, EnumC0984h.REMOTE_ENFORCED_DEFAULT);
            if (e0S == E0.f16865v) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(C0802d1 c0802d1) {
        Serializable serializableD;
        HashMap map = new HashMap();
        j0();
        HashMap map2 = new HashMap();
        for (C0817g1 c0817g1 : c0802d1.p()) {
            if (c0817g1.q().startsWith("gad_") && (serializableD = C0967b0.D(c0817g1)) != null) {
                map2.put(c0817g1.q(), serializableD);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        c().o();
        if (this.f17089H.isEmpty()) {
            return;
        }
        if (this.f17101Y == null) {
            this.f17101Y = new z1(this, this.f17084C, 2);
        }
        if (this.f17101Y.f17472c != 0) {
            return;
        }
        e().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) G.f16887C0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.f17102Z));
        b().f17178E.b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.f17101Y == null) {
            this.f17101Y = new z1(this, this.f17084C, 2);
        }
        this.f17101Y.b(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0446 A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0456  */
    /* JADX WARN: Code duplicated, block: B:124:0x0458 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0468  */
    /* JADX WARN: Code duplicated, block: B:130:0x046f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0471 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x049f  */
    /* JADX WARN: Code duplicated, block: B:139:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a5 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x04bd A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x04c7 A[Catch: all -> 0x0121, LOOP:11: B:143:0x04b7->B:147:0x04c7, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x051d A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0532  */
    /* JADX WARN: Code duplicated, block: B:162:0x0534 A[PHI: r10
      0x0534: PHI (r10v11 com.google.android.gms.internal.measurement.k1) = (r10v9 com.google.android.gms.internal.measurement.k1), (r10v14 com.google.android.gms.internal.measurement.k1) binds: [B:166:0x0553, B:161:0x0532] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0546 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0555  */
    /* JADX WARN: Code duplicated, block: B:172:0x0574 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0583 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x05c3 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x05de A[Catch: all -> 0x0121, LOOP:10: B:186:0x05bd->B:191:0x05de, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x05fa A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x067e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x068a A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x06c9 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x06f0 A[Catch: all -> 0x0121, LOOP:9: B:222:0x06ee->B:223:0x06f0, LOOP_END, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:234:0x074e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0757 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x075d A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0766  */
    /* JADX WARN: Code duplicated, block: B:432:0x0e33 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x0e5e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x0e6c A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:441:0x0e79 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x0ec0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:447:0x0ec2 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017e  */
    /* JADX WARN: Code duplicated, block: B:451:0x0ef1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:488:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x06dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x06c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x05d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x0ec7 A[SYNTHETIC] */
    public final boolean I(long j, String str) {
        boolean z10;
        int i10;
        Long l10;
        C1023u0 c1023u0;
        long j10;
        int i11;
        C0999m c0999mG0;
        ArrayList arrayList;
        StringBuilder sb;
        int i12;
        int iDelete;
        C0999m c0999mG1;
        com.google.android.gms.internal.measurement.H0 h0A;
        Long l11;
        long j11;
        long j12;
        long j13;
        int iF;
        HashMap map;
        long jP;
        Long l12;
        C0817g1 c0817g1W;
        Long lValueOf;
        String str2;
        C0837k1 c0837k1;
        String str3;
        String str4;
        int i13;
        int i14;
        C0817g1 c0817g1J;
        C0797c1 c0797c1;
        String str5;
        int i15;
        Bundle bundleV;
        int i16;
        C0967b0 c0967b0J0;
        ArrayList arrayList2;
        int size;
        int i17;
        C0812f1 c0812f1B;
        Object obj;
        C0817g1 c0817g1J2;
        String str6;
        int i18;
        C0797c1 c0797c2;
        ArrayList arrayList3;
        int i19;
        int i20;
        int i21;
        String strS;
        int iCharCount;
        int iCodePointAt;
        C0837k1 c0837k2;
        Q1 q10 = this;
        String str7 = "1";
        String str8 = "_ai";
        String str9 = "purchase";
        String str10 = "items";
        Long l13 = 1L;
        q10.g0().a0();
        try {
            C0982g0 c0982g0 = new C0982g0(q10);
            q10.g0().W(str, j, q10.R, c0982g0);
            ArrayList arrayList4 = (ArrayList) c0982g0.f17365d;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                g0().b0();
                z10 = false;
            } else {
                C0837k1 c0837k3 = (C0837k1) ((C0842l1) c0982g0.f17363b).i();
                c0837k3.b();
                ((C0842l1) c0837k3.f14329s).a0();
                int i22 = -1;
                int i23 = -1;
                int i24 = 0;
                int i25 = 0;
                boolean z11 = false;
                boolean z12 = false;
                C0797c1 c0797c3 = null;
                C0797c1 c0797c4 = null;
                while (true) {
                    int size2 = ((ArrayList) c0982g0.f17365d).size();
                    i10 = i25;
                    l10 = l13;
                    c1023u0 = q10.f17084C;
                    if (i24 >= size2) {
                        break;
                    }
                    C0797c1 c0797c5 = (C0797c1) ((C0802d1) ((ArrayList) c0982g0.f17365d).get(i24)).i();
                    int i26 = i24;
                    String str11 = str10;
                    if (q10.f0().D(((C0842l1) c0982g0.f17363b).p(), c0797c5.n())) {
                        q10.b().t().c(X.w(((C0842l1) c0982g0.f17363b).p()), c1023u0.n().a(c0797c5.n()), "Dropping blocked raw event. appId");
                        if (!str7.equals(q10.f0().a(((C0842l1) c0982g0.f17363b).p(), "measurement.upload.blacklist_internal")) && !str7.equals(q10.f0().a(((C0842l1) c0982g0.f17363b).p(), "measurement.upload.blacklist_public")) && !"_err".equals(c0797c5.n())) {
                            q10.k0();
                            V1.E(q10.f17103a0, ((C0842l1) c0982g0.f17363b).p(), 11, "_ev", c0797c5.n(), 0);
                        }
                        str4 = str8;
                        str3 = str9;
                        i25 = i10;
                        i15 = i26;
                        str5 = str11;
                    } else {
                        String strN = c0797c5.n();
                        if (strN.equals(str9) || strN.equals("_iap") || strN.equals("ecommerce_purchase")) {
                            C0812f1 c0812f1B2 = C0817g1.B();
                            c0812f1B2.h("_ct");
                            if (z11) {
                                str2 = "returning";
                            } else {
                                String strP = ((C0842l1) c0982g0.f17363b).p();
                                if (q10.R(strP, str9) && q10.R(strP, "_iap") && q10.R(strP, "ecommerce_purchase")) {
                                    str2 = "new";
                                } else {
                                    str2 = "returning";
                                }
                            }
                            c0812f1B2.i(str2);
                            c0797c5.k((C0817g1) c0812f1B2.e());
                            z11 = true;
                        }
                        if (c0797c5.n().equals(I0.g(str8, I0.f17005c, I0.f17003a))) {
                            c0797c5.b();
                            ((C0802d1) c0797c5.f14329s).F(str8);
                            q10.b().v().a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(q10.b().y(), 5)) {
                                for (int i27 = 0; i27 < c0797c5.i(); i27++) {
                                    if ("ad_platform".equals(c0797c5.j(i27).q()) && !c0797c5.j(i27).s().isEmpty() && "admob".equalsIgnoreCase(c0797c5.j(i27).s())) {
                                        q10.b().f17175B.a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean zE = q10.f0().E(((C0842l1) c0982g0.f17363b).p(), c0797c5.n());
                        if (!zE) {
                            q10.j0();
                            String strN2 = c0797c5.n();
                            U6.y.c(strN2);
                            if (strN2.hashCode() != 95027 || !strN2.equals("_ui")) {
                                str4 = str8;
                                str3 = str9;
                                c0837k1 = c0837k3;
                                zE = false;
                            }
                            if (zE) {
                                arrayList3 = new ArrayList(c0797c5.h());
                                i20 = -1;
                                i21 = -1;
                                for (i19 = 0; i19 < arrayList3.size(); i19++) {
                                    if ("value".equals(((C0817g1) arrayList3.get(i19)).q())) {
                                        i20 = i19;
                                    } else if ("currency".equals(((C0817g1) arrayList3.get(i19)).q())) {
                                        i21 = i19;
                                    }
                                }
                                if (i20 != -1) {
                                    if (!((C0817g1) arrayList3.get(i20)).t() || ((C0817g1) arrayList3.get(i20)).x()) {
                                        if (i21 == -1) {
                                            strS = ((C0817g1) arrayList3.get(i21)).s();
                                            if (strS.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strS.length()) {
                                                    iCodePointAt = strS.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        q10.b().f17175B.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        c0797c5.m(i20);
                                        E(c0797c5, "_c");
                                        D(c0797c5, 19, "currency");
                                        break;
                                    }
                                    q10.b().f17175B.a("Value must be specified with a numeric type.");
                                    c0797c5.m(i20);
                                    E(c0797c5, "_c");
                                    D(c0797c5, 18, "value");
                                }
                            }
                            if ("_e".equals(c0797c5.n())) {
                                q10.j0();
                                if (C0967b0.w((C0802d1) c0797c5.e(), "_fr") == null) {
                                    if (c0797c4 != null && Math.abs(c0797c4.o() - c0797c5.o()) <= 1000) {
                                        c0797c2 = (C0797c1) c0797c4.clone();
                                        if (q10.K(c0797c5, c0797c2)) {
                                            c0837k3 = c0837k1;
                                            c0837k3.W(i23, c0797c2);
                                            i22 = i22;
                                            c0797c3 = null;
                                            c0797c4 = null;
                                        }
                                    }
                                    c0837k3 = c0837k1;
                                    c0797c3 = c0797c5;
                                    i22 = i10;
                                } else {
                                    c0837k3 = c0837k1;
                                    i13 = i22;
                                    i22 = i13;
                                }
                            } else {
                                c0837k3 = c0837k1;
                                if ("_vs".equals(c0797c5.n())) {
                                    q10.j0();
                                    if (C0967b0.w((C0802d1) c0797c5.e(), "_et") == null) {
                                        if (c0797c3 != null && Math.abs(c0797c3.o() - c0797c5.o()) <= 1000) {
                                            c0797c1 = (C0797c1) c0797c3.clone();
                                            if (q10.K(c0797c1, c0797c5)) {
                                                int i28 = i22;
                                                c0837k3.W(i28, c0797c1);
                                                i22 = i28;
                                                c0797c3 = null;
                                                c0797c4 = null;
                                            }
                                        }
                                        i22 = i22;
                                        c0797c4 = c0797c5;
                                        i23 = i10;
                                    } else {
                                        i13 = i22;
                                        i22 = i13;
                                    }
                                } else {
                                    i13 = i22;
                                    if (q10.e0().y(null, G.f16957k1) && (("_f".equals(c0797c5.n()) || "_v".equals(c0797c5.n())) && ("_f".equals(c0797c5.n()) || "_v".equals(c0797c5.n())))) {
                                        for (i14 = 0; i14 < c0797c5.i(); i14++) {
                                            c0817g1J = c0797c5.j(i14);
                                            if ("_elt".equals(c0817g1J.q())) {
                                                c0797c5.q(c0817g1J.u());
                                                c0797c5.m(i14);
                                                break;
                                            }
                                        }
                                    }
                                    i22 = i13;
                                }
                            }
                            if (c0797c5.i() != 0) {
                                q10.j0();
                                bundleV = C0967b0.v(c0797c5.h());
                                i16 = 0;
                                while (i16 < c0797c5.i()) {
                                    c0817g1J2 = c0797c5.j(i16);
                                    str6 = str11;
                                    if (c0817g1J2.q().equals(str6) || c0817g1J2.z().isEmpty()) {
                                        i18 = i16;
                                        if (!c0817g1J2.q().equals(str6)) {
                                            q10.x(c0797c5.n(), (C0812f1) c0817g1J2.i(), bundleV, ((C0842l1) c0982g0.f17363b).p());
                                        }
                                    } else {
                                        String strP2 = ((C0842l1) c0982g0.f17363b).p();
                                        List listZ = c0817g1J2.z();
                                        Bundle[] bundleArr = new Bundle[listZ.size()];
                                        int i29 = 0;
                                        while (i29 < listZ.size()) {
                                            C0817g1 c0817g1 = (C0817g1) listZ.get(i29);
                                            q10.j0();
                                            Bundle bundleV2 = C0967b0.v(c0817g1.z());
                                            Iterator it = c0817g1.z().iterator();
                                            while (it.hasNext()) {
                                                q10.x(c0797c5.n(), (C0812f1) ((C0817g1) it.next()).i(), bundleV2, strP2);
                                                i16 = i16;
                                                listZ = listZ;
                                            }
                                            bundleArr[i29] = bundleV2;
                                            i29++;
                                            i16 = i16;
                                            listZ = listZ;
                                        }
                                        i18 = i16;
                                        bundleV.putParcelableArray(str6, bundleArr);
                                    }
                                    i16 = i18 + 1;
                                    str11 = str6;
                                }
                                str5 = str11;
                                c0797c5.b();
                                ((C0802d1) c0797c5.f14329s).D();
                                c0967b0J0 = q10.j0();
                                arrayList2 = new ArrayList();
                                for (String str12 : bundleV.keySet()) {
                                    c0812f1B = C0817g1.B();
                                    c0812f1B.h(str12);
                                    obj = bundleV.get(str12);
                                    if (obj != null) {
                                        c0967b0J0.O(c0812f1B, obj);
                                        arrayList2.add((C0817g1) c0812f1B.e());
                                    }
                                }
                                size = arrayList2.size();
                                i17 = 0;
                                while (i17 < size) {
                                    Object obj2 = arrayList2.get(i17);
                                    i17++;
                                    c0797c5.k((C0817g1) obj2);
                                }
                            } else {
                                str5 = str11;
                            }
                            i15 = i26;
                            ((ArrayList) c0982g0.f17365d).set(i15, (C0802d1) c0797c5.e());
                            c0837k3.X(c0797c5);
                            i25 = i10 + 1;
                        }
                        str4 = str8;
                        int i30 = 0;
                        boolean z13 = false;
                        boolean z14 = false;
                        while (true) {
                            str3 = str9;
                            if (i30 >= c0797c5.i()) {
                                break;
                            }
                            if ("_c".equals(c0797c5.j(i30).q())) {
                                C0812f1 c0812f1 = (C0812f1) c0797c5.j(i30).i();
                                c0837k2 = c0837k3;
                                c0812f1.j(1L);
                                C0817g1 c0817g2 = (C0817g1) c0812f1.e();
                                c0797c5.b();
                                ((C0802d1) c0797c5.f14329s).A(i30, c0817g2);
                                z13 = true;
                            } else {
                                c0837k2 = c0837k3;
                                if ("_r".equals(c0797c5.j(i30).q())) {
                                    C0812f1 c0812f2 = (C0812f1) c0797c5.j(i30).i();
                                    c0812f2.j(1L);
                                    C0817g1 c0817g3 = (C0817g1) c0812f2.e();
                                    c0797c5.b();
                                    ((C0802d1) c0797c5.f14329s).A(i30, c0817g3);
                                    z14 = true;
                                    z13 = z13;
                                }
                            }
                            i30++;
                            str9 = str3;
                            c0837k3 = c0837k2;
                        }
                        c0837k1 = c0837k3;
                        if (!z13 && zE) {
                            q10.b().v().b(c1023u0.n().a(c0797c5.n()), "Marking event as conversion");
                            C0812f1 c0812f1B3 = C0817g1.B();
                            c0812f1B3.h("_c");
                            c0812f1B3.j(1L);
                            c0797c5.l(c0812f1B3);
                        }
                        if (!z14) {
                            q10.b().v().b(c1023u0.n().a(c0797c5.n()), "Marking event as real-time");
                            C0812f1 c0812f1B4 = C0817g1.B();
                            c0812f1B4.h("_r");
                            c0812f1B4.j(1L);
                            c0797c5.l(c0812f1B4);
                        }
                        if (q10.g0().s0(q10.g(), ((C0842l1) c0982g0.f17363b).p(), false, true, false, false).f17421e > q10.e0().w(((C0842l1) c0982g0.f17363b).p(), G.f16967p)) {
                            E(c0797c5, "_r");
                        } else {
                            z12 = true;
                        }
                        if (V1.o0(c0797c5.n()) && zE != 0 && q10.g0().s0(q10.g(), ((C0842l1) c0982g0.f17363b).p(), true, false, false, false).f17419c > q10.e0().w(((C0842l1) c0982g0.f17363b).p(), G.f16965o)) {
                            q10.b().t().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Too many conversions. Not logging as conversion. appId");
                            boolean z15 = false;
                            C0812f1 c0812f3 = null;
                            int i31 = -1;
                            for (int i32 = 0; i32 < c0797c5.i(); i32++) {
                                C0817g1 c0817g1J3 = c0797c5.j(i32);
                                if ("_c".equals(c0817g1J3.q())) {
                                    c0812f3 = (C0812f1) c0817g1J3.i();
                                    i31 = i32;
                                } else if ("_err".equals(c0817g1J3.q())) {
                                    z15 = true;
                                }
                            }
                            if (z15) {
                                if (c0812f3 != null) {
                                    c0797c5.m(i31);
                                } else {
                                    c0812f3 = null;
                                    if (c0812f3 != null) {
                                        C0812f1 c0812f4 = (C0812f1) c0812f3.clone();
                                        c0812f4.h("_err");
                                        c0812f4.j(10L);
                                        C0817g1 c0817g4 = (C0817g1) c0812f4.e();
                                        c0797c5.b();
                                        ((C0802d1) c0797c5.f14329s).A(i31, c0817g4);
                                    } else {
                                        q10.b().s().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Did not find conversion parameter. appId");
                                    }
                                }
                            } else if (c0812f3 != null) {
                                C0812f1 c0812f5 = (C0812f1) c0812f3.clone();
                                c0812f5.h("_err");
                                c0812f5.j(10L);
                                C0817g1 c0817g5 = (C0817g1) c0812f5.e();
                                c0797c5.b();
                                ((C0802d1) c0797c5.f14329s).A(i31, c0817g5);
                            } else {
                                q10.b().s().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Did not find conversion parameter. appId");
                            }
                        }
                        if (zE) {
                            arrayList3 = new ArrayList(c0797c5.h());
                            i20 = -1;
                            i21 = -1;
                            while (i19 < arrayList3.size()) {
                                if ("value".equals(((C0817g1) arrayList3.get(i19)).q())) {
                                    i20 = i19;
                                } else if ("currency".equals(((C0817g1) arrayList3.get(i19)).q())) {
                                    i21 = i19;
                                }
                            }
                            if (i20 != -1) {
                                if (((C0817g1) arrayList3.get(i20)).t()) {
                                }
                                if (i21 == -1) {
                                    strS = ((C0817g1) arrayList3.get(i21)).s();
                                    if (strS.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strS.length()) {
                                            iCodePointAt = strS.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                q10.b().f17175B.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                c0797c5.m(i20);
                                E(c0797c5, "_c");
                                D(c0797c5, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(c0797c5.n())) {
                            q10.j0();
                            if (C0967b0.w((C0802d1) c0797c5.e(), "_fr") == null) {
                                if (c0797c4 != null) {
                                    c0797c2 = (C0797c1) c0797c4.clone();
                                    if (q10.K(c0797c5, c0797c2)) {
                                        c0837k3 = c0837k1;
                                        c0837k3.W(i23, c0797c2);
                                        i22 = i22;
                                        c0797c3 = null;
                                        c0797c4 = null;
                                    }
                                }
                                c0837k3 = c0837k1;
                                c0797c3 = c0797c5;
                                i22 = i10;
                            } else {
                                c0837k3 = c0837k1;
                                i13 = i22;
                                i22 = i13;
                            }
                        } else {
                            c0837k3 = c0837k1;
                            if ("_vs".equals(c0797c5.n())) {
                                q10.j0();
                                if (C0967b0.w((C0802d1) c0797c5.e(), "_et") == null) {
                                    if (c0797c3 != null) {
                                        c0797c1 = (C0797c1) c0797c3.clone();
                                        if (q10.K(c0797c1, c0797c5)) {
                                            int i210 = i22;
                                            c0837k3.W(i210, c0797c1);
                                            i22 = i210;
                                            c0797c3 = null;
                                            c0797c4 = null;
                                        }
                                    }
                                    i22 = i22;
                                    c0797c4 = c0797c5;
                                    i23 = i10;
                                } else {
                                    i13 = i22;
                                    i22 = i13;
                                }
                            } else {
                                i13 = i22;
                                if (q10.e0().y(null, G.f16957k1)) {
                                    while (i14 < c0797c5.i()) {
                                        c0817g1J = c0797c5.j(i14);
                                        if ("_elt".equals(c0817g1J.q())) {
                                            c0797c5.q(c0817g1J.u());
                                            c0797c5.m(i14);
                                            break;
                                        }
                                    }
                                }
                                i22 = i13;
                            }
                        }
                        if (c0797c5.i() != 0) {
                            q10.j0();
                            bundleV = C0967b0.v(c0797c5.h());
                            i16 = 0;
                            while (i16 < c0797c5.i()) {
                                c0817g1J2 = c0797c5.j(i16);
                                str6 = str11;
                                if (c0817g1J2.q().equals(str6)) {
                                    i18 = i16;
                                    if (!c0817g1J2.q().equals(str6)) {
                                        q10.x(c0797c5.n(), (C0812f1) c0817g1J2.i(), bundleV, ((C0842l1) c0982g0.f17363b).p());
                                    }
                                } else {
                                    i18 = i16;
                                    if (!c0817g1J2.q().equals(str6)) {
                                        q10.x(c0797c5.n(), (C0812f1) c0817g1J2.i(), bundleV, ((C0842l1) c0982g0.f17363b).p());
                                    }
                                }
                                i16 = i18 + 1;
                                str11 = str6;
                            }
                            str5 = str11;
                            c0797c5.b();
                            ((C0802d1) c0797c5.f14329s).D();
                            c0967b0J0 = q10.j0();
                            arrayList2 = new ArrayList();
                            while (r5.hasNext()) {
                                c0812f1B = C0817g1.B();
                                c0812f1B.h(str12);
                                obj = bundleV.get(str12);
                                if (obj != null) {
                                    c0967b0J0.O(c0812f1B, obj);
                                    arrayList2.add((C0817g1) c0812f1B.e());
                                }
                            }
                            size = arrayList2.size();
                            i17 = 0;
                            while (i17 < size) {
                                Object obj3 = arrayList2.get(i17);
                                i17++;
                                c0797c5.k((C0817g1) obj3);
                            }
                        } else {
                            str5 = str11;
                        }
                        i15 = i26;
                        ((ArrayList) c0982g0.f17365d).set(i15, (C0802d1) c0797c5.e());
                        c0837k3.X(c0797c5);
                        i25 = i10 + 1;
                    }
                    i24 = i15 + 1;
                    str10 = str5;
                    l13 = l10;
                    str7 = str7;
                    str8 = str4;
                    str9 = str3;
                }
                long j14 = 0;
                long jLongValue = 0;
                int i33 = i10;
                int i34 = 0;
                while (i34 < i33) {
                    C0802d1 c0802d1T1 = ((C0842l1) c0837k3.f14329s).T1(i34);
                    if ("_e".equals(c0802d1T1.s())) {
                        q10.j0();
                        if (C0967b0.w(c0802d1T1, "_fr") != null) {
                            c0837k3.Y(i34);
                            i33--;
                            i34--;
                        } else {
                            q10.j0();
                            c0817g1W = C0967b0.w(c0802d1T1, "_et");
                            if (c0817g1W == null) {
                                if (c0817g1W.t()) {
                                    lValueOf = Long.valueOf(c0817g1W.u());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        q10.j0();
                        c0817g1W = C0967b0.w(c0802d1T1, "_et");
                        if (c0817g1W == null) {
                            if (c0817g1W.t()) {
                                lValueOf = Long.valueOf(c0817g1W.u());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i34++;
                }
                q10.J(c0837k3, jLongValue, false);
                Iterator it2 = c0837k3.U().iterator();
                while (it2.hasNext()) {
                    if ("_s".equals(((C0802d1) it2.next()).s())) {
                        q10.g0().g0(c0837k3.o(), "_se");
                        break;
                    }
                }
                if (C0967b0.c0(c0837k3, "_sid") >= 0) {
                    q10.J(c0837k3, jLongValue, true);
                } else {
                    int iC0 = C0967b0.c0(c0837k3, "_se");
                    if (iC0 >= 0) {
                        c0837k3.b();
                        ((C0842l1) c0837k3.f14329s).e0(iC0);
                        q10.b().s().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String strP3 = ((C0842l1) c0982g0.f17363b).p();
                q10.c().o();
                q10.l0();
                C0970c0 c0970c0Q0 = q10.g0().q0(strP3);
                if (c0970c0Q0 == null) {
                    q10.b().s().b(X.w(strP3), "Cannot fix consent fields without appInfo. appId");
                } else {
                    q10.m(c0970c0Q0, c0837k3);
                }
                String strP4 = ((C0842l1) c0982g0.f17363b).p();
                q10.c().o();
                q10.l0();
                C0970c0 c0970c0Q1 = q10.g0().q0(strP4);
                if (c0970c0Q1 == null) {
                    q10.b().t().b(X.w(strP4), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    q10.n(c0970c0Q1, c0837k3);
                }
                c0837k3.b();
                ((C0842l1) c0837k3.f14329s).h0(Long.MAX_VALUE);
                c0837k3.b();
                ((C0842l1) c0837k3.f14329s).i0(Long.MIN_VALUE);
                for (int i35 = 0; i35 < c0837k3.V(); i35++) {
                    C0802d1 c0802d1T2 = ((C0842l1) c0837k3.f14329s).T1(i35);
                    if (c0802d1T2.u() < ((C0842l1) c0837k3.f14329s).a2()) {
                        long jU = c0802d1T2.u();
                        c0837k3.b();
                        ((C0842l1) c0837k3.f14329s).h0(jU);
                    }
                    if (c0802d1T2.u() > ((C0842l1) c0837k3.f14329s).c2()) {
                        long jU2 = c0802d1T2.u();
                        c0837k3.b();
                        ((C0842l1) c0837k3.f14329s).i0(jU2);
                    }
                }
                c0837k3.M();
                H0 h7 = H0.f16998c;
                H0 h0J = q10.a(((C0842l1) c0982g0.f17363b).p()).j(H0.c(100, ((C0842l1) c0982g0.f17363b).u0()));
                H0 h0T = q10.g0().T(((C0842l1) c0982g0.f17363b).p());
                q10.g0().S(((C0842l1) c0982g0.f17363b).p(), h0J);
                G0 g10 = G0.f16990t;
                if (!h0J.i(g10) && h0T.i(g10)) {
                    q10.g0().e0(((C0842l1) c0982g0.f17363b).p());
                } else if (h0J.i(g10) && !h0T.i(g10)) {
                    q10.g0().f0(((C0842l1) c0982g0.f17363b).p());
                }
                G0 g11 = G0.f16989s;
                if (!h0J.i(g11)) {
                    c0837k3.b();
                    ((C0842l1) c0837k3.f14329s).z1();
                    c0837k3.b();
                    ((C0842l1) c0837k3.f14329s).B1();
                    c0837k3.b();
                    ((C0842l1) c0837k3.f14329s).S0();
                }
                if (!h0J.i(g10)) {
                    c0837k3.b();
                    ((C0842l1) c0837k3.f14329s).D1();
                    c0837k3.b();
                    ((C0842l1) c0837k3.f14329s).Z0();
                }
                R3.a();
                if (q10.e0().y(((C0842l1) c0982g0.f17363b).p(), G.f16913Q0)) {
                    q10.k0();
                    if (V1.M(((C0842l1) c0982g0.f17363b).p()) && q10.a(((C0842l1) c0982g0.f17363b).p()).i(g11) && ((C0842l1) c0982g0.f17363b).z0()) {
                        q10.w(c0837k3, c0982g0);
                    }
                }
                c0837k3.b();
                ((C0842l1) c0837k3.f14329s).L1();
                c0837k3.J(q10.i0().s(c0837k3.o(), c0837k3.U(), DesugarCollections.unmodifiableList(((C0842l1) c0837k3.f14329s).U1()), Long.valueOf(((C0842l1) c0837k3.f14329s).a2()), Long.valueOf(((C0842l1) c0837k3.f14329s).c2()), !h0J.i(g10)));
                if (q10.e0().q(((C0842l1) c0982g0.f17363b).p())) {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom secureRandomN0 = q10.k0().n0();
                    int i36 = 0;
                    while (i36 < c0837k3.V()) {
                        C0797c1 c0797c6 = (C0797c1) ((C0842l1) c0837k3.f14329s).T1(i36).i();
                        if (c0797c6.n().equals("_ep")) {
                            q10.j0();
                            String str13 = (String) C0967b0.x((C0802d1) c0797c6.e(), "_en");
                            r rVarM = (r) map2.get(str13);
                            if (rVarM == null) {
                                C0999m c0999mG2 = q10.g0();
                                String strP5 = ((C0842l1) c0982g0.f17363b).p();
                                U6.y.f(str13);
                                rVarM = c0999mG2.M("events", strP5, str13);
                                if (rVarM != null) {
                                    map2.put(str13, rVarM);
                                }
                            }
                            if (rVarM == null || rVarM.f17528i != null) {
                                l11 = l10;
                            } else {
                                Long l14 = rVarM.j;
                                if (l14 != null && l14.longValue() > 1) {
                                    q10.j0();
                                    C0967b0.u(c0797c6, "_sr", l14);
                                }
                                Boolean bool = rVarM.f17529k;
                                if (bool == null || !bool.booleanValue()) {
                                    l11 = l10;
                                } else {
                                    q10.j0();
                                    l11 = l10;
                                    C0967b0.u(c0797c6, "_efs", l11);
                                }
                                arrayList5.add((C0802d1) c0797c6.e());
                            }
                            c0837k3.W(i36, c0797c6);
                            j11 = j14;
                        } else {
                            l11 = l10;
                            C1003n0 c1003n0F0 = q10.f0();
                            j11 = j14;
                            String strP6 = ((C0842l1) c0982g0.f17363b).p();
                            String strA = c1003n0F0.a(strP6, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strA)) {
                                j12 = j11;
                            } else {
                                try {
                                    j12 = Long.parseLong(strA);
                                } catch (NumberFormatException e10) {
                                    ((C1023u0) c1003n0F0.f16104r).b().t().c(X.w(strP6), e10, "Unable to parse timezone offset. appId");
                                    j12 = j11;
                                }
                            }
                            q10.k0();
                            long j15 = j12 * 60000;
                            long jO = (c0797c6.o() + j15) / 86400000;
                            C0802d1 c0802d1 = (C0802d1) c0797c6.e();
                            if (TextUtils.isEmpty("_dbg")) {
                                j13 = j15;
                            } else {
                                Iterator it3 = c0802d1.p().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C0817g1 c0817g6 = (C0817g1) it3.next();
                                        j13 = j15;
                                        if ("_dbg".equals(c0817g6.q())) {
                                            iF = !l11.equals(Long.valueOf(c0817g6.u())) ? f0().F(((C0842l1) c0982g0.f17363b).p(), c0797c6.n()) : 1;
                                        } else {
                                            j15 = j13;
                                        }
                                    } else {
                                        j13 = j15;
                                    }
                                }
                            }
                            if (iF <= 0) {
                                b().t().c(c0797c6.n(), Integer.valueOf(iF), "Sample rate must be positive. event, rate");
                                arrayList5.add((C0802d1) c0797c6.e());
                                c0837k3.W(i36, c0797c6);
                            } else {
                                r rVarB = (r) map2.get(c0797c6.n());
                                if (rVarB == null && (rVarB = g0().M("events", ((C0842l1) c0982g0.f17363b).p(), c0797c6.n())) == null) {
                                    b().t().c(((C0842l1) c0982g0.f17363b).p(), c0797c6.n(), "Event being bundled has no eventAggregate. appId, eventName");
                                    rVarB = new r(((C0842l1) c0982g0.f17363b).p(), c0797c6.n(), 1L, 1L, 1L, c0797c6.o(), 0L, null, null, null, null);
                                }
                                j0();
                                Long l15 = (Long) C0967b0.x((C0802d1) c0797c6.e(), "_eid");
                                boolean z16 = l15 != null;
                                if (iF == 1) {
                                    arrayList5.add((C0802d1) c0797c6.e());
                                    if (z16 && (rVarB.f17528i != null || rVarB.j != null || rVarB.f17529k != null)) {
                                        map2.put(c0797c6.n(), rVarB.b(null, null, null));
                                    }
                                    c0837k3.W(i36, c0797c6);
                                } else {
                                    if (secureRandomN0.nextInt(iF) == 0) {
                                        j0();
                                        HashMap map3 = map2;
                                        Long lValueOf2 = Long.valueOf(iF);
                                        C0967b0.u(c0797c6, "_sr", lValueOf2);
                                        arrayList5.add((C0802d1) c0797c6.e());
                                        if (z16) {
                                            rVarB = rVarB.b(null, lValueOf2, null);
                                        }
                                        map = map3;
                                        map.put(c0797c6.n(), new r(rVarB.f17521a, rVarB.f17522b, rVarB.f17523c, rVarB.f17524d, rVarB.f17525e, rVarB.f17526f, c0797c6.o(), Long.valueOf(jO), rVarB.f17528i, rVarB.j, rVarB.f17529k));
                                        l12 = l11;
                                    } else {
                                        map = map2;
                                        Long l16 = rVarB.f17527h;
                                        if (l16 != null) {
                                            jP = l16.longValue();
                                        } else {
                                            k0();
                                            jP = (j13 + c0797c6.p()) / 86400000;
                                        }
                                        if (jP != jO) {
                                            j0();
                                            C0967b0.u(c0797c6, "_efs", l11);
                                            j0();
                                            l12 = l11;
                                            Long lValueOf3 = Long.valueOf(iF);
                                            C0967b0.u(c0797c6, "_sr", lValueOf3);
                                            arrayList5.add((C0802d1) c0797c6.e());
                                            if (z16) {
                                                rVarB = rVarB.b(null, lValueOf3, Boolean.TRUE);
                                            }
                                            map.put(c0797c6.n(), new r(rVarB.f17521a, rVarB.f17522b, rVarB.f17523c, rVarB.f17524d, rVarB.f17525e, rVarB.f17526f, c0797c6.o(), Long.valueOf(jO), rVarB.f17528i, rVarB.j, rVarB.f17529k));
                                        } else {
                                            l12 = l11;
                                            if (z16) {
                                                map.put(c0797c6.n(), rVarB.b(l15, null, null));
                                            }
                                        }
                                    }
                                    c0837k3.W(i36, c0797c6);
                                }
                                i36++;
                                q10 = this;
                                l10 = l12;
                                map2 = map;
                                j14 = j11;
                            }
                        }
                        map = map2;
                        l12 = l11;
                        i36++;
                        q10 = this;
                        l10 = l12;
                        map2 = map;
                        j14 = j11;
                    }
                    j10 = j14;
                    HashMap map4 = map2;
                    if (arrayList5.size() < c0837k3.V()) {
                        c0837k3.b();
                        ((C0842l1) c0837k3.f14329s).a0();
                        c0837k3.b();
                        ((C0842l1) c0837k3.f14329s).Z(arrayList5);
                    }
                    Iterator it4 = map4.entrySet().iterator();
                    while (it4.hasNext()) {
                        g0().N("events", (r) ((Map.Entry) it4.next()).getValue());
                    }
                } else {
                    j10 = 0;
                }
                String strP7 = ((C0842l1) c0982g0.f17363b).p();
                C0970c0 c0970c0Q2 = g0().q0(strP7);
                try {
                    if (c0970c0Q2 == null) {
                        b().s().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Bundling raw events w/o app info. appId");
                    } else {
                        if (c0837k3.V() > 0) {
                            C1014r0 c1014r0 = c0970c0Q2.f17292a.f17585x;
                            C1023u0.m(c1014r0);
                            c1014r0.o();
                            long j16 = c0970c0Q2.f17299i;
                            if (j16 != j10) {
                                c0837k3.h(j16);
                            } else {
                                c0837k3.i();
                            }
                            C1014r0 c1014r1 = c0970c0Q2.f17292a.f17585x;
                            C1023u0.m(c1014r1);
                            c1014r1.o();
                            long j17 = c0970c0Q2.f17298h;
                            if (j17 != j10) {
                                j16 = j17;
                            }
                            if (j16 != j10) {
                                c0837k3.b0(j16);
                            } else {
                                c0837k3.c0();
                            }
                            c0970c0Q2.h(c0837k3.V());
                            C1014r0 c1014r2 = c0970c0Q2.f17292a.f17585x;
                            C1023u0.m(c1014r2);
                            c1014r2.o();
                            int i37 = (int) c0970c0Q2.f17281F;
                            c0837k3.b();
                            ((C0842l1) c0837k3.f14329s).j1(i37);
                            C1014r0 c1014r3 = c0970c0Q2.f17292a.f17585x;
                            C1023u0.m(c1014r3);
                            c1014r3.o();
                            c0837k3.x((int) c0970c0Q2.g);
                            c0970c0Q2.L(((C0842l1) c0837k3.f14329s).a2());
                            c0970c0Q2.M(((C0842l1) c0837k3.f14329s).c2());
                            String strU = c0970c0Q2.u();
                            if (strU != null) {
                                c0837k3.F(strU);
                            } else {
                                c0837k3.G();
                            }
                            i11 = 0;
                            g0().r0(c0970c0Q2, false);
                        }
                        if (c0837k3.V() > 0) {
                            c1023u0.getClass();
                            h0A = f0().A(((C0842l1) c0982g0.f17363b).p());
                            if (h0A == null && h0A.p()) {
                                long jQ = h0A.q();
                                c0837k3.b();
                                ((C0842l1) c0837k3.f14329s).Q0(jQ);
                            } else if (((C0842l1) c0982g0.f17363b).E().isEmpty()) {
                                c0837k3.b();
                                ((C0842l1) c0837k3.f14329s).Q0(-1L);
                            } else {
                                b().t().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Did not find measurement config or missing version info. appId");
                            }
                            g0().v0((C0842l1) c0837k3.e(), z12);
                        }
                        c0999mG0 = g0();
                        arrayList = (ArrayList) c0982g0.f17364c;
                        U6.y.f(arrayList);
                        c0999mG0.o();
                        c0999mG0.p();
                        sb = new StringBuilder("rowid in (");
                        for (i12 = i11; i12 < arrayList.size(); i12++) {
                            if (i12 != 0) {
                                sb.append(",");
                            }
                            sb.append(((Long) arrayList.get(i12)).longValue());
                        }
                        sb.append(")");
                        iDelete = c0999mG0.d0().delete("raw_events", sb.toString(), null);
                        if (iDelete != arrayList.size()) {
                            ((C1023u0) c0999mG0.f16104r).b().s().c(Integer.valueOf(iDelete), Integer.valueOf(arrayList.size()), "Deleted fewer rows from raw events table than expected");
                        }
                        c0999mG1 = g0();
                        c0999mG1.d0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strP7, strP7});
                        g0().b0();
                        z10 = true;
                    }
                    c0999mG1.d0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strP7, strP7});
                } catch (SQLiteException e11) {
                    ((C1023u0) c0999mG1.f16104r).b().s().c(X.w(strP7), e11, "Failed to remove unused event metadata. appId");
                }
                i11 = 0;
                if (c0837k3.V() > 0) {
                    c1023u0.getClass();
                    h0A = f0().A(((C0842l1) c0982g0.f17363b).p());
                    if (h0A == null) {
                        if (((C0842l1) c0982g0.f17363b).E().isEmpty()) {
                            c0837k3.b();
                            ((C0842l1) c0837k3.f14329s).Q0(-1L);
                        } else {
                            b().t().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Did not find measurement config or missing version info. appId");
                        }
                    } else if (((C0842l1) c0982g0.f17363b).E().isEmpty()) {
                        c0837k3.b();
                        ((C0842l1) c0837k3.f14329s).Q0(-1L);
                    } else {
                        b().t().b(X.w(((C0842l1) c0982g0.f17363b).p()), "Did not find measurement config or missing version info. appId");
                    }
                    g0().v0((C0842l1) c0837k3.e(), z12);
                }
                c0999mG0 = g0();
                arrayList = (ArrayList) c0982g0.f17364c;
                U6.y.f(arrayList);
                c0999mG0.o();
                c0999mG0.p();
                sb = new StringBuilder("rowid in (");
                while (i12 < arrayList.size()) {
                    if (i12 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) arrayList.get(i12)).longValue());
                }
                sb.append(")");
                iDelete = c0999mG0.d0().delete("raw_events", sb.toString(), null);
                if (iDelete != arrayList.size()) {
                    ((C1023u0) c0999mG0.f16104r).b().s().c(Integer.valueOf(iDelete), Integer.valueOf(arrayList.size()), "Deleted fewer rows from raw events table than expected");
                }
                c0999mG1 = g0();
                g0().b0();
                z10 = true;
            }
            g0().c0();
            return z10;
        } catch (Throwable th) {
            g0().c0();
            throw th;
        }
    }

    public final void J(C0837k1 c0837k1, long j, boolean z10) throws Throwable {
        T1 t2;
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        C0999m c0999m = this.f17106t;
        U(c0999m);
        T1 t1I0 = c0999m.i0(c0837k1.o(), str);
        if (t1I0 == null || (obj = t1I0.f17147e) == null) {
            String strO = c0837k1.o();
            e().getClass();
            t2 = new T1(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strO2 = c0837k1.o();
            e().getClass();
            t2 = new T1(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        C0881t1 c0881t1A = C0886u1.A();
        c0881t1A.b();
        ((C0886u1) c0881t1A.f14329s).C(str);
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0881t1A.b();
        ((C0886u1) c0881t1A.f14329s).B(jCurrentTimeMillis);
        Object obj2 = t2.f17147e;
        long jLongValue = ((Long) obj2).longValue();
        c0881t1A.b();
        ((C0886u1) c0881t1A.f14329s).F(jLongValue);
        C0886u1 c0886u1 = (C0886u1) c0881t1A.e();
        int iC0 = C0967b0.c0(c0837k1, str);
        if (iC0 >= 0) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).c0(iC0, c0886u1);
        } else {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).d0(c0886u1);
        }
        if (j > 0) {
            C0999m c0999m2 = this.f17106t;
            U(c0999m2);
            c0999m2.h0(t2);
            b().f17178E.c(true != z10 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(C0797c1 c0797c1, C0797c1 c0797c2) {
        U6.y.a("_e".equals(c0797c1.n()));
        j0();
        C0817g1 c0817g1W = C0967b0.w((C0802d1) c0797c1.e(), "_sc");
        String strS = c0817g1W == null ? null : c0817g1W.s();
        j0();
        C0817g1 c0817g1W2 = C0967b0.w((C0802d1) c0797c2.e(), "_pc");
        String strS2 = c0817g1W2 != null ? c0817g1W2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        U6.y.a("_e".equals(c0797c1.n()));
        j0();
        C0817g1 c0817g1W3 = C0967b0.w((C0802d1) c0797c1.e(), "_et");
        if (c0817g1W3 == null || !c0817g1W3.t() || c0817g1W3.u() <= 0) {
            return true;
        }
        long jU = c0817g1W3.u();
        j0();
        C0817g1 c0817g1W4 = C0967b0.w((C0802d1) c0797c2.e(), "_et");
        if (c0817g1W4 != null && c0817g1W4.u() > 0) {
            jU += c0817g1W4.u();
        }
        j0();
        C0967b0.u(c0797c2, "_et", Long.valueOf(jU));
        j0();
        C0967b0.u(c0797c1, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        c().o();
        l0();
        C0999m c0999m = this.f17106t;
        U(c0999m);
        if (c0999m.Y("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        C0999m c0999m2 = this.f17106t;
        U(c0999m2);
        return !TextUtils.isEmpty(c0999m2.w());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0330  */
    public final void N() {
        boolean z10;
        long jMax;
        long jMax2;
        int iIntValue;
        C0967b0 c0967b0 = this.f17110x;
        c().o();
        l0();
        if (this.f17087F > 0) {
            e().getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.f17087F);
            if (jAbs > 0) {
                b().f17178E.b(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
                h0().a();
                G1 g10 = this.f17108v;
                U(g10);
                g10.s();
                return;
            }
            this.f17087F = 0L;
        }
        if (!this.f17084C.h() || !L()) {
            b().f17178E.a("Nothing to upload or uploading impossible");
            h0().a();
            G1 g11 = this.f17108v;
            U(g11);
            g11.s();
            return;
        }
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e0();
        long jMax3 = Math.max(0L, ((Long) G.f16911P.a(null)).longValue());
        C0999m c0999m = this.f17106t;
        U(c0999m);
        if (c0999m.Y("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z10 = true;
        } else {
            C0999m c0999m2 = this.f17106t;
            U(c0999m2);
            if (c0999m2.Y("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            String strS = e0().s("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strS) || ".none.".equals(strS)) {
                e0();
                jMax = Math.max(0L, ((Long) G.f16900J.a(null)).longValue());
            } else {
                e0();
                jMax = Math.max(0L, ((Long) G.f16902K.a(null)).longValue());
            }
        } else {
            e0();
            jMax = Math.max(0L, ((Long) G.f16898I.a(null)).longValue());
        }
        long jA = this.f17112z.f17625y.a();
        long jA2 = this.f17112z.f17626z.a();
        C0999m c0999m3 = this.f17106t;
        U(c0999m3);
        long jZ = c0999m3.Z("select max(bundle_end_timestamp) from queue", null, 0L);
        C0999m c0999m4 = this.f17106t;
        U(c0999m4);
        long jMax4 = Math.max(jZ, c0999m4.Z("select max(timestamp) from raw_events", null, 0L));
        if (jMax4 != 0) {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jA - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jA2 - jCurrentTimeMillis);
            long jMin = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z10 && jMax5 > 0) {
                jMin = Math.min(jAbs2, jMax5) + jMax;
            }
            U(c0967b0);
            jMax2 = !c0967b0.Y(jMax5, jMax) ? jMax5 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i10 = 0;
                while (true) {
                    e0();
                    if (i10 >= Math.min(20, Math.max(0, ((Integer) G.R.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    e0();
                    jMax2 += Math.max(0L, ((Long) G.Q.a(null)).longValue()) * (1 << i10);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            jMax2 = 0;
            break;
        }
        if (jMax2 == 0) {
            b().f17178E.a("Next upload time is 0");
            h0().a();
            G1 g12 = this.f17108v;
            U(g12);
            g12.s();
            return;
        }
        C0967b0 c0967b1 = this.f17105s;
        U(c0967b1);
        if (!c0967b1.I()) {
            b().f17178E.a("No network");
            C0973d0 c0973d0H0 = h0();
            Q1 q10 = c0973d0H0.f17319a;
            q10.l0();
            q10.c().o();
            if (!c0973d0H0.f17320b) {
                q10.f17084C.f17579r.registerReceiver(c0973d0H0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                C0967b0 c0967b2 = q10.f17105s;
                U(c0967b2);
                c0973d0H0.f17321c = c0967b2.I();
                q10.b().f17178E.b(Boolean.valueOf(c0973d0H0.f17321c), "Registering connectivity change receiver. Network connected");
                c0973d0H0.f17320b = true;
            }
            G1 g13 = this.f17108v;
            U(g13);
            g13.s();
            return;
        }
        long jA3 = this.f17112z.f17624x.a();
        e0();
        long jMax6 = Math.max(0L, ((Long) G.f16894G.a(null)).longValue());
        U(c0967b0);
        if (!c0967b0.Y(jA3, jMax6)) {
            jMax2 = Math.max(jMax2, jA3 + jMax6);
        }
        h0().a();
        e().getClass();
        long jCurrentTimeMillis2 = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            e0();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) G.f16904L.a(null)).longValue());
            C0979f0 c0979f0 = this.f17112z.f17625y;
            e().getClass();
            c0979f0.b(System.currentTimeMillis());
        }
        b().f17178E.b(Long.valueOf(jCurrentTimeMillis2), "Upload scheduled in approximately ms");
        G1 g14 = this.f17108v;
        U(g14);
        g14.p();
        C1023u0 c1023u0 = (C1023u0) g14.f16104r;
        c1023u0.getClass();
        X x9 = c1023u0.f17584w;
        Context context = c1023u0.f17579r;
        if (!V1.g0(context)) {
            C1023u0.m(x9);
            x9.f17177D.a("Receiver not registered/enabled");
        }
        if (!V1.H(context)) {
            C1023u0.m(x9);
            x9.f17177D.a("Service not registered/enabled");
        }
        g14.s();
        C1023u0.m(x9);
        x9.f17178E.b(Long.valueOf(jCurrentTimeMillis2), "Scheduling upload, millis");
        c1023u0.f17564B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + jCurrentTimeMillis2;
        if (jCurrentTimeMillis2 < Math.max(0L, ((Long) G.f16905M.a(null)).longValue()) && g14.t().f17472c == 0) {
            g14.t().b(jCurrentTimeMillis2);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = g14.f16995u;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, jElapsedRealtime, Math.max(((Long) G.f16896H.a(null)).longValue(), jCurrentTimeMillis2), g14.w());
                return;
            }
            return;
        }
        ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iV = g14.v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(iV, componentName).setMinimumLatency(jCurrentTimeMillis2).setOverrideDeadline(jCurrentTimeMillis2 + jCurrentTimeMillis2).setExtras(persistableBundle).build();
        Method method = com.google.android.gms.internal.measurement.G.f14031a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        Method method2 = com.google.android.gms.internal.measurement.G.f14031a;
        if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfoBuild);
            return;
        }
        Method method3 = com.google.android.gms.internal.measurement.G.f14032b;
        if (method3 != null) {
            try {
                Integer num = (Integer) method3.invoke(UserHandle.class, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
        } else {
            iIntValue = 0;
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e11) {
            Log.e("UploadAlarm", "error calling scheduleAsPackage", e11);
            jobScheduler.schedule(jobInfoBuild);
        }
    }

    public final void O() {
        c().o();
        if (this.f17092K || this.f17093L || this.f17094M) {
            b().f17178E.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f17092K), Boolean.valueOf(this.f17093L), Boolean.valueOf(this.f17094M));
            return;
        }
        b().f17178E.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f17088G;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f17088G;
        U6.y.f(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(C0970c0 c0970c0) {
        try {
            long jP = c0970c0.P();
            C1023u0 c1023u0 = this.f17084C;
            if (jP != -2147483648L) {
                if (c0970c0.P() == Z6.b.a(c1023u0.f17579r).b(0, c0970c0.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Z6.b.a(c1023u0.f17579r).b(0, c0970c0.D()).versionName;
                String strN = c0970c0.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final X1 Q(String str) {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C0970c0 c0970c0Q0 = c0999m.q0(str);
        if (c0970c0Q0 != null) {
            C1023u0 c1023u0 = c0970c0Q0.f17292a;
            if (!TextUtils.isEmpty(c0970c0Q0.N())) {
                Boolean boolP = P(c0970c0Q0);
                if (boolP != null && !boolP.booleanValue()) {
                    b().f17182w.b(X.w(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = c0970c0Q0.G();
                String strN = c0970c0Q0.N();
                long jP = c0970c0Q0.P();
                C1014r0 c1014r0 = c1023u0.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.o();
                String str2 = c0970c0Q0.f17301l;
                C1014r0 c1014r1 = c1023u0.f17585x;
                C1023u0.m(c1014r1);
                c1014r1.o();
                long j = c0970c0Q0.f17302m;
                C1014r0 c1014r2 = c1023u0.f17585x;
                C1023u0.m(c1014r2);
                c1014r2.o();
                long j10 = c0970c0Q0.f17303n;
                C1014r0 c1014r3 = c1023u0.f17585x;
                C1023u0.m(c1014r3);
                c1014r3.o();
                boolean z10 = c0970c0Q0.f17304o;
                String strJ = c0970c0Q0.J();
                C1014r0 c1014r4 = c1023u0.f17585x;
                C1023u0.m(c1014r4);
                c1014r4.o();
                boolean z11 = c0970c0Q0.f17305p;
                Boolean boolW = c0970c0Q0.w();
                long jB = c0970c0Q0.b();
                C1014r0 c1014r5 = c1023u0.f17585x;
                C1023u0.m(c1014r5);
                c1014r5.o();
                ArrayList arrayList = c0970c0Q0.f17308s;
                String strG2 = a(str).g();
                boolean zY = c0970c0Q0.y();
                C1014r0 c1014r6 = c1023u0.f17585x;
                C1023u0.m(c1014r6);
                c1014r6.o();
                long j11 = c0970c0Q0.f17311v;
                int i10 = a(str).f17000b;
                String str3 = o0(str).f17491b;
                C1014r0 c1014r7 = c1023u0.f17585x;
                C1023u0.m(c1014r7);
                c1014r7.o();
                int i11 = c0970c0Q0.f17313x;
                C1014r0 c1014r8 = c1023u0.f17585x;
                C1023u0.m(c1014r8);
                c1014r8.o();
                return new X1(str, strG, strN, jP, str2, j, j10, (String) null, z10, false, strJ, 0L, 0, z11, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j11, i10, str3, i11, c0970c0Q0.f17277B, c0970c0Q0.C(), c0970c0Q0.s(), 0L, c0970c0Q0.t());
            }
        }
        b().f17177D.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) throws Throwable {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        r rVarM = c0999m.M("events", str, str2);
        return rVarM == null || rVarM.f17523c < 1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    public final void W(S1 s10, X1 x9) {
        r rVarM;
        long jLongValue;
        c().o();
        l0();
        boolean zT = T(x9);
        String str = x9.f17204r;
        if (zT) {
            if (!x9.f17211y) {
                c0(x9);
                return;
            }
            V1 v1K0 = k0();
            String str2 = s10.f17132s;
            int iV0 = v1K0.v0(str2);
            Z0.B b5 = this.f17103a0;
            if (iV0 != 0) {
                k0();
                e0();
                String strT = V1.t(24, str2, true);
                int length = str2 != null ? str2.length() : 0;
                k0();
                V1.E(b5, x9.f17204r, iV0, "_ev", strT, length);
                return;
            }
            int iB = k0().B(s10.b(), str2);
            if (iB != 0) {
                k0();
                e0();
                String strT2 = V1.t(24, str2, true);
                Object objB = s10.b();
                int length2 = (objB == null || !((objB instanceof String) || (objB instanceof CharSequence))) ? 0 : objB.toString().length();
                k0();
                V1.E(b5, x9.f17204r, iB, "_ev", strT2, length2);
                return;
            }
            Object objC = k0().C(s10.b(), str2);
            if (objC != null) {
                String str3 = "_sid";
                if ("_sid".equals(str2)) {
                    long j = s10.f17133t;
                    String str4 = s10.f17136w;
                    U6.y.f(str);
                    C0999m c0999m = this.f17106t;
                    U(c0999m);
                    T1 t1I0 = c0999m.i0(str, "_sno");
                    if (t1I0 != null) {
                        Object obj = t1I0.f17147e;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (t1I0 != null) {
                                b().f17185z.b(t1I0.f17147e, "Retrieved last session number from database does not contain a valid (long) value");
                            }
                            C0999m c0999m2 = this.f17106t;
                            U(c0999m2);
                            rVarM = c0999m2.M("events", str, "_s");
                            if (rVarM != null) {
                                V v10 = b().f17178E;
                                long j10 = rVarM.f17523c;
                                v10.b(Long.valueOf(j10), "Backfill the session number. Last used session number");
                                jLongValue = j10;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (t1I0 != null) {
                            b().f17185z.b(t1I0.f17147e, "Retrieved last session number from database does not contain a valid (long) value");
                        }
                        C0999m c0999m3 = this.f17106t;
                        U(c0999m3);
                        rVarM = c0999m3.M("events", str, "_s");
                        if (rVarM != null) {
                            V v11 = b().f17178E;
                            long j11 = rVarM.f17523c;
                            v11.b(Long.valueOf(j11), "Backfill the session number. Last used session number");
                            jLongValue = j11;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    W(new S1("_sno", str4, j, Long.valueOf(jLongValue + 1)), x9);
                } else {
                    str3 = "_sid";
                }
                U6.y.f(str);
                String str5 = s10.f17136w;
                U6.y.f(str5);
                T1 t2 = new T1(str, str5, str2, s10.f17133t, objC);
                V v12 = b().f17178E;
                C1023u0 c1023u0 = this.f17084C;
                S s11 = c1023u0.f17563A;
                String str6 = t2.f17145c;
                v12.c(s11.c(str6), objC, "Setting user property");
                C0999m c0999m4 = this.f17106t;
                U(c0999m4);
                c0999m4.a0();
                try {
                    boolean zEquals = "_id".equals(str6);
                    Object obj2 = t2.f17147e;
                    if (zEquals) {
                        C0999m c0999m5 = this.f17106t;
                        U(c0999m5);
                        T1 t1I1 = c0999m5.i0(str, "_id");
                        if (t1I1 != null && !obj2.equals(t1I1.f17147e)) {
                            C0999m c0999m6 = this.f17106t;
                            U(c0999m6);
                            c0999m6.g0(str, "_lair");
                        }
                    }
                    c0(x9);
                    C0999m c0999m7 = this.f17106t;
                    U(c0999m7);
                    boolean zH0 = c0999m7.h0(t2);
                    if (str3.equals(str2)) {
                        C0967b0 c0967b0 = this.f17110x;
                        U(c0967b0);
                        String str7 = x9.f17198L;
                        long jZ = TextUtils.isEmpty(str7) ? 0L : c0967b0.Z(str7.getBytes(Charset.forName("UTF-8")));
                        C0999m c0999m8 = this.f17106t;
                        U(c0999m8);
                        C0970c0 c0970c0Q0 = c0999m8.q0(str);
                        if (c0970c0Q0 != null) {
                            c0970c0Q0.A(jZ);
                            if (c0970c0Q0.o()) {
                                C0999m c0999m9 = this.f17106t;
                                U(c0999m9);
                                c0999m9.r0(c0970c0Q0, false);
                            }
                        }
                    }
                    C0999m c0999m10 = this.f17106t;
                    U(c0999m10);
                    c0999m10.b0();
                    if (!zH0) {
                        b().f17182w.c(c1023u0.f17563A.c(str6), obj2, "Too many unique user properties are set. Ignoring user property");
                        k0();
                        V1.E(b5, str, 9, null, null, 0);
                    }
                } finally {
                    C0999m c0999m11 = this.f17106t;
                    U(c0999m11);
                    c0999m11.c0();
                }
            }
        }
    }

    public final void X(String str, X1 x9) {
        c().o();
        l0();
        boolean zT = T(x9);
        String str2 = x9.f17204r;
        if (zT) {
            if (!x9.f17211y) {
                c0(x9);
                return;
            }
            Boolean boolV = V(x9);
            if ("_npa".equals(str) && boolV != null) {
                b().f17177D.a("Falling back to manifest metadata value for ad personalization");
                e().getClass();
                W(new S1("_npa", "auto", System.currentTimeMillis(), Long.valueOf(true != boolV.booleanValue() ? 0L : 1L)), x9);
                return;
            }
            V v10 = b().f17177D;
            C1023u0 c1023u0 = this.f17084C;
            v10.b(c1023u0.f17563A.c(str), "Removing user property");
            C0999m c0999m = this.f17106t;
            U(c0999m);
            c0999m.a0();
            try {
                c0(x9);
                if ("_id".equals(str)) {
                    C0999m c0999m2 = this.f17106t;
                    U(c0999m2);
                    U6.y.f(str2);
                    c0999m2.g0(str2, "_lair");
                }
                C0999m c0999m3 = this.f17106t;
                U(c0999m3);
                U6.y.f(str2);
                c0999m3.g0(str2, str);
                C0999m c0999m4 = this.f17106t;
                U(c0999m4);
                c0999m4.b0();
                b().f17177D.b(c1023u0.f17563A.c(str), "User property removed");
            } finally {
                C0999m c0999m5 = this.f17106t;
                U(c0999m5);
                c0999m5.c0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02a1 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02c3 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02f9 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0301 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0307 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0314  */
    /* JADX WARN: Code duplicated, block: B:126:0x031a A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0325 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x032b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0332  */
    /* JADX WARN: Code duplicated, block: B:133:0x0335  */
    /* JADX WARN: Code duplicated, block: B:136:0x0348  */
    /* JADX WARN: Code duplicated, block: B:142:0x0371 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0376 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x037c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0384 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x038d A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x039d A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x03c6 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x03f8 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0408 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x042e A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0435 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x010c A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0116 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0120 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012d A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0154 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x038d, B:152:0x0390, B:154:0x039d, B:155:0x03ad, B:166:0x0451, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0371, B:144:0x0376, B:146:0x037e, B:148:0x0384, B:140:0x035f, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03c6, B:158:0x03f8, B:159:0x03fb, B:161:0x0408, B:162:0x0416, B:163:0x042e, B:165:0x0435, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:173:0x00a4, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    public final void Y(X1 x9) {
        long j;
        long j10;
        r rVarM;
        boolean z10;
        long j11;
        long j12;
        Bundle bundle;
        long j13;
        C1023u0 c1023u0;
        C1023u0 c1023u1;
        String str;
        int i10;
        Bundle bundle2;
        long j14;
        long jC;
        C1023u0 c1023u2;
        PackageInfo packageInfoB;
        X1 x10;
        ApplicationInfo applicationInfo;
        long j15;
        long j16;
        int i11;
        long j17;
        long j18;
        C1023u0 c1023u3 = this.f17084C;
        c().o();
        l0();
        U6.y.f(x9);
        boolean z11 = x9.f17192F;
        String str2 = x9.f17204r;
        U6.y.c(str2);
        if (T(x9)) {
            C0999m c0999m = this.f17106t;
            U(c0999m);
            C0970c0 c0970c0Q0 = c0999m.q0(str2);
            if (c0970c0Q0 != null && TextUtils.isEmpty(c0970c0Q0.G()) && !TextUtils.isEmpty(x9.f17205s)) {
                c0970c0Q0.f(0L);
                C0999m c0999m2 = this.f17106t;
                U(c0999m2);
                c0999m2.r0(c0970c0Q0, false);
                C1003n0 c1003n0 = this.f17104r;
                U(c1003n0);
                c1003n0.o();
                c1003n0.f17482y.remove(str2);
            }
            if (!x9.f17211y) {
                c0(x9);
                return;
            }
            long jCurrentTimeMillis = x9.f17189C;
            if (jCurrentTimeMillis == 0) {
                e().getClass();
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j19 = jCurrentTimeMillis;
            int i12 = x9.f17190D;
            if (i12 != 0 && i12 != 1) {
                b().f17185z.c(X.w(str2), Integer.valueOf(i12), "Incorrect app type, assuming installed app. appId, appType");
                i12 = 0;
            }
            C0999m c0999m3 = this.f17106t;
            U(c0999m3);
            c0999m3.a0();
            try {
                C0999m c0999m4 = this.f17106t;
                U(c0999m4);
                T1 t1I0 = c0999m4.i0(str2, "_npa");
                Boolean boolV = V(x9);
                if (t1I0 != null) {
                    j = 1;
                    if (!"auto".equals(t1I0.f17144b)) {
                        j10 = j19;
                    }
                    if (e0().y(null, G.f16936c1)) {
                        b0(x9, x9.U);
                        j10 = j10;
                    } else {
                        b0(x9, j10);
                    }
                    c0(x9);
                    if (i12 == 0) {
                        C0999m c0999m5 = this.f17106t;
                        U(c0999m5);
                        rVarM = c0999m5.M("events", str2, "_f");
                        z10 = false;
                    } else {
                        C0999m c0999m6 = this.f17106t;
                        U(c0999m6);
                        rVarM = c0999m6.M("events", str2, "_v");
                        z10 = true;
                    }
                    if (rVarM == null) {
                        j12 = ((j10 / 3600000) + j) * 3600000;
                        if (z10) {
                            Long lValueOf = Long.valueOf(j12);
                            long j20 = j10;
                            W(new S1("_fvt", "auto", j20, lValueOf), x9);
                            c().o();
                            l0();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z11) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (e0().y(null, G.f16957k1)) {
                                e().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            i(new C1022u("_v", new C1019t(bundle), "auto", j20), x9);
                        } else {
                            Long lValueOf2 = Long.valueOf(j12);
                            j13 = j10;
                            W(new S1("_fot", "auto", j13, lValueOf2), x9);
                            c().o();
                            C0991j0 c0991j0 = this.f17083B;
                            U6.y.f(c0991j0);
                            c1023u0 = c0991j0.f17424b;
                            if (str2 != null || str2.isEmpty()) {
                                c1023u1 = c1023u3;
                                str = "_elt";
                                i10 = 1;
                                X x11 = c1023u0.f17584w;
                                C1023u0.m(x11);
                                x11.f17174A.a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                str = "_elt";
                                C1014r0 c1014r0 = c1023u0.f17585x;
                                Context context = c1023u0.f17579r;
                                X x12 = c1023u0.f17584w;
                                C1023u0.m(c1014r0);
                                c1014r0.o();
                                if (c0991j0.a()) {
                                    ServiceConnectionC0988i0 serviceConnectionC0988i0 = new ServiceConnectionC0988i0(c0991j0, str2);
                                    C1014r0 c1014r1 = c1023u0.f17585x;
                                    C1023u0.m(c1014r1);
                                    c1014r1.o();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    c1023u1 = c1023u3;
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = context.getPackageManager();
                                    if (packageManager == null) {
                                        C1023u0.m(x12);
                                        x12.f17174A.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                            i10 = 1;
                                            C1023u0.m(x12);
                                            x12.f17176C.a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str3 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str3) && c0991j0.a()) {
                                                    try {
                                                        try {
                                                            boolean zC = X6.a.a().c(context, context.getClass().getName(), new Intent(intent), serviceConnectionC0988i0, 1, null);
                                                            i10 = 1;
                                                            try {
                                                                C1023u0.m(x12);
                                                                x12.f17178E.b(zC ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e10) {
                                                                e = e10;
                                                                X x13 = c1023u0.f17584w;
                                                                C1023u0.m(x13);
                                                                x13.f17182w.b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } catch (RuntimeException e11) {
                                                            e = e11;
                                                            i10 = 1;
                                                        }
                                                    } catch (RuntimeException e12) {
                                                        e = e12;
                                                        i10 = 1;
                                                    }
                                                } else {
                                                    i10 = 1;
                                                    C1023u0.m(x12);
                                                    x12.f17185z.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C1023u0.m(x12);
                                    x12.f17176C.a("Install Referrer Reporter is not available");
                                    c1023u1 = c1023u3;
                                }
                                i10 = 1;
                            }
                            c().o();
                            l0();
                            bundle2 = new Bundle();
                            j14 = j;
                            bundle2.putLong("_c", j14);
                            bundle2.putLong("_r", j14);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j14);
                            if (z11) {
                                bundle2.putLong("_dac", j14);
                            }
                            U6.y.f(str2);
                            C0999m c0999m7 = this.f17106t;
                            U(c0999m7);
                            U6.y.c(str2);
                            c0999m7.o();
                            c0999m7.p();
                            jC = c0999m7.C(str2);
                            c1023u2 = c1023u1;
                            if (c1023u2.f17579r.getPackageManager() == null) {
                                b().f17182w.b(X.w(str2), "PackageManager is null, first open report might be inaccurate. appId");
                                x10 = x9;
                            } else {
                                try {
                                    packageInfoB = Z6.b.a(c1023u2.f17579r).b(0, str2);
                                } catch (PackageManager.NameNotFoundException e13) {
                                    b().f17182w.c(X.w(str2), e13, "Package info is null, first open report might be inaccurate. appId");
                                    packageInfoB = null;
                                }
                                if (packageInfoB != null) {
                                    j16 = packageInfoB.firstInstallTime;
                                    if (j16 != 0) {
                                        if (j16 != packageInfoB.lastUpdateTime) {
                                            if (e0().y(null, G.f16901J0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jC == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                i11 = 0;
                                                jC = 0;
                                            }
                                            i11 = 0;
                                        } else {
                                            i11 = i10;
                                        }
                                        if (i10 != i11) {
                                            j17 = 0;
                                        } else {
                                            j17 = 1;
                                        }
                                        x10 = x9;
                                        W(new S1("_fi", "auto", j13, Long.valueOf(j17)), x10);
                                    } else {
                                        x10 = x9;
                                    }
                                } else {
                                    x10 = x9;
                                }
                                try {
                                    applicationInfo = ((Context) Z6.b.a(c1023u2.f17579r).f5961a).getPackageManager().getApplicationInfo(str2, 0);
                                } catch (PackageManager.NameNotFoundException e14) {
                                    b().f17182w.c(X.w(str2), e14, "Application info is null, first open report might be inaccurate. appId");
                                    applicationInfo = null;
                                }
                                if (applicationInfo != null) {
                                    if ((i10 & applicationInfo.flags) != 0) {
                                        j15 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j15 = 1;
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j15);
                                    }
                                }
                            }
                            j18 = jC;
                            if (j18 >= 0) {
                                bundle2.putLong("_pfo", j18);
                            }
                            if (e0().y(null, G.f16957k1)) {
                                e().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            i(new C1022u("_f", new C1019t(bundle2), "auto", j13), x10);
                        }
                    } else {
                        j11 = j10;
                        if (x9.f17212z) {
                            i(new C1022u("_cd", new C1019t(new Bundle()), "auto", j11), x9);
                        }
                    }
                    C0999m c0999m8 = this.f17106t;
                    U(c0999m8);
                    c0999m8.b0();
                    C0999m c0999m9 = this.f17106t;
                    U(c0999m9);
                    c0999m9.c0();
                }
                j = 1;
                if (boolV != null) {
                    S1 s10 = new S1("_npa", "auto", j19, Long.valueOf(true != boolV.booleanValue() ? 0L : j));
                    j10 = j19;
                    if (t1I0 == null || !t1I0.f17147e.equals(s10.f17134u)) {
                        W(s10, x9);
                    }
                } else {
                    j10 = j19;
                    if (t1I0 != null) {
                        X("_npa", x9);
                    }
                }
                if (e0().y(null, G.f16936c1)) {
                    b0(x9, x9.U);
                    j10 = j10;
                } else {
                    b0(x9, j10);
                }
                c0(x9);
                if (i12 == 0) {
                    C0999m c0999m10 = this.f17106t;
                    U(c0999m10);
                    rVarM = c0999m10.M("events", str2, "_f");
                    z10 = false;
                } else {
                    C0999m c0999m11 = this.f17106t;
                    U(c0999m11);
                    rVarM = c0999m11.M("events", str2, "_v");
                    z10 = true;
                }
                if (rVarM == null) {
                    j12 = ((j10 / 3600000) + j) * 3600000;
                    if (z10) {
                        Long lValueOf3 = Long.valueOf(j12);
                        j13 = j10;
                        W(new S1("_fot", "auto", j13, lValueOf3), x9);
                        c().o();
                        C0991j0 c0991j1 = this.f17083B;
                        U6.y.f(c0991j1);
                        c1023u0 = c0991j1.f17424b;
                        if (str2 != null) {
                            c1023u1 = c1023u3;
                            str = "_elt";
                            i10 = 1;
                            X x14 = c1023u0.f17584w;
                            C1023u0.m(x14);
                            x14.f17174A.a("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            c1023u1 = c1023u3;
                            str = "_elt";
                            i10 = 1;
                            X x15 = c1023u0.f17584w;
                            C1023u0.m(x15);
                            x15.f17174A.a("Install Referrer Reporter was called with invalid app package name");
                        }
                        c().o();
                        l0();
                        bundle2 = new Bundle();
                        j14 = j;
                        bundle2.putLong("_c", j14);
                        bundle2.putLong("_r", j14);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j14);
                        if (z11) {
                            bundle2.putLong("_dac", j14);
                        }
                        U6.y.f(str2);
                        C0999m c0999m12 = this.f17106t;
                        U(c0999m12);
                        U6.y.c(str2);
                        c0999m12.o();
                        c0999m12.p();
                        jC = c0999m12.C(str2);
                        c1023u2 = c1023u1;
                        if (c1023u2.f17579r.getPackageManager() == null) {
                            b().f17182w.b(X.w(str2), "PackageManager is null, first open report might be inaccurate. appId");
                            x10 = x9;
                        } else {
                            packageInfoB = Z6.b.a(c1023u2.f17579r).b(0, str2);
                            if (packageInfoB != null) {
                                j16 = packageInfoB.firstInstallTime;
                                if (j16 != 0) {
                                    if (j16 != packageInfoB.lastUpdateTime) {
                                        if (e0().y(null, G.f16901J0)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jC == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            i11 = 0;
                                            jC = 0;
                                        }
                                        i11 = 0;
                                    } else {
                                        i11 = i10;
                                    }
                                    if (i10 != i11) {
                                        j17 = 0;
                                    } else {
                                        j17 = 1;
                                    }
                                    x10 = x9;
                                    W(new S1("_fi", "auto", j13, Long.valueOf(j17)), x10);
                                } else {
                                    x10 = x9;
                                }
                            } else {
                                x10 = x9;
                            }
                            applicationInfo = ((Context) Z6.b.a(c1023u2.f17579r).f5961a).getPackageManager().getApplicationInfo(str2, 0);
                            if (applicationInfo != null) {
                                if ((i10 & applicationInfo.flags) != 0) {
                                    j15 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j15 = 1;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j15);
                                }
                            }
                        }
                        j18 = jC;
                        if (j18 >= 0) {
                            bundle2.putLong("_pfo", j18);
                        }
                        if (e0().y(null, G.f16957k1)) {
                            e().getClass();
                            bundle2.putLong(str, System.currentTimeMillis());
                        }
                        i(new C1022u("_f", new C1019t(bundle2), "auto", j13), x10);
                    } else {
                        Long lValueOf4 = Long.valueOf(j12);
                        long j21 = j10;
                        W(new S1("_fvt", "auto", j21, lValueOf4), x9);
                        c().o();
                        l0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (z11) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (e0().y(null, G.f16957k1)) {
                            e().getClass();
                            bundle.putLong("_elt", System.currentTimeMillis());
                        }
                        i(new C1022u("_v", new C1019t(bundle), "auto", j21), x9);
                    }
                } else {
                    j11 = j10;
                    if (x9.f17212z) {
                        i(new C1022u("_cd", new C1019t(new Bundle()), "auto", j11), x9);
                    }
                }
                C0999m c0999m13 = this.f17106t;
                U(c0999m13);
                c0999m13.b0();
                C0999m c0999m14 = this.f17106t;
                U(c0999m14);
                c0999m14.c0();
            } catch (Throwable th) {
                C0999m c0999m15 = this.f17106t;
                U(c0999m15);
                c0999m15.c0();
                throw th;
            }
        }
    }

    public final void Z(C0975e c0975e, X1 x9) {
        C1022u c1022u;
        U6.y.c(c0975e.f17325r);
        U6.y.f(c0975e.f17326s);
        U6.y.f(c0975e.f17327t);
        U6.y.c(c0975e.f17327t.f17132s);
        c().o();
        l0();
        if (T(x9)) {
            if (!x9.f17211y) {
                c0(x9);
                return;
            }
            C0975e c0975e2 = new C0975e(c0975e);
            boolean z10 = false;
            c0975e2.f17329v = false;
            C0999m c0999m = this.f17106t;
            U(c0999m);
            c0999m.a0();
            try {
                C0999m c0999m2 = this.f17106t;
                U(c0999m2);
                String str = c0975e2.f17325r;
                U6.y.f(str);
                C0975e c0975eM0 = c0999m2.m0(str, c0975e2.f17327t.f17132s);
                C1023u0 c1023u0 = this.f17084C;
                if (c0975eM0 != null && !c0975eM0.f17326s.equals(c0975e2.f17326s)) {
                    b().f17185z.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", c1023u0.f17563A.c(c0975e2.f17327t.f17132s), c0975e2.f17326s, c0975eM0.f17326s);
                }
                if (c0975eM0 != null && c0975eM0.f17329v) {
                    c0975e2.f17326s = c0975eM0.f17326s;
                    c0975e2.f17328u = c0975eM0.f17328u;
                    c0975e2.f17332y = c0975eM0.f17332y;
                    c0975e2.f17330w = c0975eM0.f17330w;
                    c0975e2.f17333z = c0975eM0.f17333z;
                    c0975e2.f17329v = true;
                    S1 s10 = c0975e2.f17327t;
                    c0975e2.f17327t = new S1(s10.f17132s, c0975eM0.f17327t.f17136w, c0975eM0.f17327t.f17133t, s10.b());
                } else if (TextUtils.isEmpty(c0975e2.f17330w)) {
                    S1 s11 = c0975e2.f17327t;
                    c0975e2.f17327t = new S1(s11.f17132s, c0975e2.f17327t.f17136w, c0975e2.f17328u, s11.b());
                    c0975e2.f17329v = true;
                    z10 = true;
                }
                if (c0975e2.f17329v) {
                    S1 s12 = c0975e2.f17327t;
                    String str2 = c0975e2.f17325r;
                    U6.y.f(str2);
                    String str3 = c0975e2.f17326s;
                    String str4 = s12.f17132s;
                    long j = s12.f17133t;
                    Object objB = s12.b();
                    U6.y.f(objB);
                    T1 t2 = new T1(str2, str3, str4, j, objB);
                    Object obj = t2.f17147e;
                    String str5 = t2.f17145c;
                    C0999m c0999m3 = this.f17106t;
                    U(c0999m3);
                    if (c0999m3.h0(t2)) {
                        b().f17177D.d("User property updated immediately", c0975e2.f17325r, c1023u0.f17563A.c(str5), obj);
                    } else {
                        b().f17182w.d("(2)Too many active user properties, ignoring", X.w(c0975e2.f17325r), c1023u0.f17563A.c(str5), obj);
                    }
                    if (z10 && (c1022u = c0975e2.f17333z) != null) {
                        l(new C1022u(c1022u, c0975e2.f17328u), x9);
                    }
                }
                C0999m c0999m4 = this.f17106t;
                U(c0999m4);
                if (c0999m4.l0(c0975e2)) {
                    b().f17177D.d("Conditional property added", c0975e2.f17325r, c1023u0.f17563A.c(c0975e2.f17327t.f17132s), c0975e2.f17327t.b());
                } else {
                    b().f17182w.d("Too many conditional properties, ignoring", X.w(c0975e2.f17325r), c1023u0.f17563A.c(c0975e2.f17327t.f17132s), c0975e2.f17327t.b());
                }
                C0999m c0999m5 = this.f17106t;
                U(c0999m5);
                c0999m5.b0();
            } finally {
                C0999m c0999m6 = this.f17106t;
                U(c0999m6);
                c0999m6.c0();
            }
        }
    }

    public final H0 a(String str) throws Throwable {
        H0 h7 = H0.f16998c;
        c().o();
        l0();
        HashMap map = this.S;
        H0 h0H = (H0) map.get(str);
        if (h0H == null) {
            C0999m c0999m = this.f17106t;
            U(c0999m);
            h0H = c0999m.H(str);
            if (h0H == null) {
                h0H = H0.f16998c;
            }
            c().o();
            l0();
            map.put(str, h0H);
            C0999m c0999m2 = this.f17106t;
            U(c0999m2);
            c0999m2.J(str, h0H);
        }
        return h0H;
    }

    public final void a0(C0975e c0975e, X1 x9) {
        U6.y.c(c0975e.f17325r);
        U6.y.f(c0975e.f17327t);
        U6.y.c(c0975e.f17327t.f17132s);
        c().o();
        l0();
        if (T(x9)) {
            if (!x9.f17211y) {
                c0(x9);
                return;
            }
            C0999m c0999m = this.f17106t;
            U(c0999m);
            c0999m.a0();
            try {
                c0(x9);
                String str = c0975e.f17325r;
                U6.y.f(str);
                C0999m c0999m2 = this.f17106t;
                U(c0999m2);
                C0975e c0975eM0 = c0999m2.m0(str, c0975e.f17327t.f17132s);
                C1023u0 c1023u0 = this.f17084C;
                if (c0975eM0 != null) {
                    b().f17177D.c(c0975e.f17325r, c1023u0.f17563A.c(c0975e.f17327t.f17132s), "Removing conditional user property");
                    C0999m c0999m3 = this.f17106t;
                    U(c0999m3);
                    c0999m3.n0(str, c0975e.f17327t.f17132s);
                    if (c0975eM0.f17329v) {
                        C0999m c0999m4 = this.f17106t;
                        U(c0999m4);
                        c0999m4.g0(str, c0975e.f17327t.f17132s);
                    }
                    C1022u c1022u = c0975e.f17324B;
                    if (c1022u != null) {
                        C1019t c1019t = c1022u.f17559s;
                        C1022u c1022uS = k0().S(c1022u.f17558r, c1019t != null ? c1019t.e() : null, c0975eM0.f17326s, c1022u.f17561u, true);
                        U6.y.f(c1022uS);
                        l(c1022uS, x9);
                    }
                } else {
                    b().f17185z.c(X.w(c0975e.f17325r), c1023u0.f17563A.c(c0975e.f17327t.f17132s), "Conditional user property doesn't exist");
                }
                C0999m c0999m5 = this.f17106t;
                U(c0999m5);
                c0999m5.b0();
            } finally {
                C0999m c0999m6 = this.f17106t;
                U(c0999m6);
                c0999m6.c0();
            }
        }
    }

    @Override // i7.D0
    public final X b() {
        C1023u0 c1023u0 = this.f17084C;
        U6.y.f(c1023u0);
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        return x9;
    }

    public final void b0(X1 x9, long j) throws Throwable {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        String str = x9.f17204r;
        U6.y.f(str);
        C0970c0 c0970c0Q0 = c0999m.q0(str);
        if (c0970c0Q0 != null) {
            k0();
            String str2 = x9.f17205s;
            String strG = c0970c0Q0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                U6.y.f(str2);
                if (!str2.equals(strG)) {
                    b().f17185z.b(X.w(c0970c0Q0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    C0999m c0999m2 = this.f17106t;
                    U(c0999m2);
                    C1023u0 c1023u0 = (C1023u0) c0999m2.f16104r;
                    String strD = c0970c0Q0.D();
                    c0999m2.p();
                    c0999m2.o();
                    U6.y.c(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseD0 = c0999m2.d0();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseD0.delete("events", "app_id=?", strArr) + sQLiteDatabaseD0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseD0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseD0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseD0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseD0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseD0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseD0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseD0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseD0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseD0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseD0.delete("trigger_uris", "app_id=?", strArr);
                        if (c1023u0.f17582u.y(null, G.f16952i1)) {
                            iDelete += sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            X x10 = c1023u0.f17584w;
                            C1023u0.m(x10);
                            x10.f17178E.c(strD, Integer.valueOf(iDelete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e10) {
                        X x11 = c1023u0.f17584w;
                        C1023u0.m(x11);
                        x11.f17182w.c(X.w(strD), e10, "Error deleting application data. appId, error");
                    }
                    c0970c0Q0 = null;
                }
            }
        }
        if (c0970c0Q0 != null) {
            boolean z10 = (c0970c0Q0.P() == -2147483648L || c0970c0Q0.P() == x9.f17187A) ? false : true;
            String strN = c0970c0Q0.N();
            if (z10 || ((c0970c0Q0.P() != -2147483648L || strN == null || strN.equals(x9.f17206t)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strN);
                C1022u c1022u = new C1022u("_au", new C1019t(bundle), "auto", j);
                if (e0().y(null, G.d1)) {
                    i(c1022u, x9);
                } else {
                    j(c1022u, x9);
                }
            }
        }
    }

    @Override // i7.D0
    public final C1014r0 c() {
        C1023u0 c1023u0 = this.f17084C;
        U6.y.f(c1023u0);
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        return c1014r0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x029e  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:89:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x028e  */
    public final C0970c0 c0(X1 x9) {
        boolean z10;
        C1023u0 c1023u0;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        boolean z11;
        C0883t3 c0883t3;
        boolean z12;
        boolean z13;
        String str5;
        boolean z14;
        String str6;
        boolean z15;
        int i10;
        boolean z16;
        c().o();
        l0();
        U6.y.f(x9);
        boolean z17 = x9.f17191E;
        String str7 = x9.f17204r;
        U6.y.c(str7);
        String str8 = x9.f17197K;
        if (!str8.isEmpty()) {
            this.U.put(str7, new O1(this, str8));
        }
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C0970c0 c0970c0Q0 = c0999m.q0(str7);
        H0 h0J = a(str7).j(H0.c(100, x9.f17196J));
        G0 g10 = G0.f16989s;
        String strT = h0J.i(g10) ? this.f17112z.t(str7, z17) : "";
        boolean z18 = true;
        G0 g11 = G0.f16990t;
        if (c0970c0Q0 != null) {
            C1023u0 c1023u1 = c0970c0Q0.f17292a;
            if (h0J.i(g10) && strT != null) {
                C1014r0 c1014r0 = c1023u1.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.o();
                if (!strT.equals(c0970c0Q0.f17296e)) {
                    C1014r0 c1014r1 = c1023u1.f17585x;
                    C1023u0.m(c1014r1);
                    c1014r1.o();
                    boolean zIsEmpty = TextUtils.isEmpty(c0970c0Q0.f17296e);
                    c0970c0Q0.I(strT);
                    if (z17) {
                        C1027v1 c1027v1 = this.f17112z;
                        c1027v1.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((h0J.i(g10) ? c1027v1.s(str7) : new Pair("", Boolean.FALSE)).first) && !zIsEmpty) {
                            if (h0J.i(g11)) {
                                c0970c0Q0.F(o(h0J));
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            C0999m c0999m2 = this.f17106t;
                            U(c0999m2);
                            if (c0999m2.i0(str7, "_id") != null) {
                                C0999m c0999m3 = this.f17106t;
                                U(c0999m3);
                                if (c0999m3.i0(str7, "_lair") == null) {
                                    e().getClass();
                                    T1 t2 = new T1(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    C0999m c0999m4 = this.f17106t;
                                    U(c0999m4);
                                    c0999m4.h0(t2);
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(c0970c0Q0.E()) && h0J.i(g11)) {
                        c0970c0Q0.F(o(h0J));
                    }
                } else if (TextUtils.isEmpty(c0970c0Q0.E())) {
                    c0970c0Q0.F(o(h0J));
                }
            } else if (TextUtils.isEmpty(c0970c0Q0.E()) && h0J.i(g11)) {
                c0970c0Q0.F(o(h0J));
            }
            c1023u0 = c0970c0Q0.f17292a;
            c0970c0Q0.H(x9.f17205s);
            str = x9.f17188B;
            if (!TextUtils.isEmpty(str)) {
                c0970c0Q0.K(str);
            }
            j = x9.f17208v;
            if (j != 0) {
                c0970c0Q0.S(j);
            }
            str2 = x9.f17206t;
            if (!TextUtils.isEmpty(str2)) {
                c0970c0Q0.O(str2);
            }
            c0970c0Q0.Q(x9.f17187A);
            str3 = x9.f17207u;
            if (str3 != null) {
                c0970c0Q0.R(str3);
            }
            c0970c0Q0.a(x9.f17209w);
            c0970c0Q0.d(x9.f17211y);
            str4 = x9.f17210x;
            if (!TextUtils.isEmpty(str4)) {
                c0970c0Q0.v(str4);
            }
            C1014r0 c1014r2 = c1023u0.f17585x;
            C1023u0.m(c1014r2);
            c1014r2.o();
            boolean z19 = c0970c0Q0.Q;
            if (c0970c0Q0.f17305p != z17) {
                z11 = true;
            } else {
                z11 = false;
            }
            c0970c0Q0.Q = z19 | z11;
            c0970c0Q0.f17305p = z17;
            Boolean bool = x9.f17193G;
            C1014r0 c1014r3 = c1023u0.f17585x;
            C1023u0.m(c1014r3);
            c1014r3.o();
            c0970c0Q0.Q |= !Objects.equals(c0970c0Q0.f17306q, bool);
            c0970c0Q0.f17306q = bool;
            c0970c0Q0.c(x9.f17194H);
            String str9 = x9.f17198L;
            C1014r0 c1014r4 = c1023u0.f17585x;
            C1023u0.m(c1014r4);
            c1014r4.o();
            c0970c0Q0.Q |= !Objects.equals(c0970c0Q0.f17309t, str9);
            c0970c0Q0.f17309t = str9;
            c0883t3 = C0883t3.f14410s;
            if (e0().y(null, G.f16906M0)) {
                c0970c0Q0.x(x9.f17195I);
            } else {
                if (e0().y(null, G.L0)) {
                    c0970c0Q0.x(null);
                }
            }
            z12 = x9.f17199M;
            C1014r0 c1014r5 = c1023u0.f17585x;
            C1023u0.m(c1014r5);
            c1014r5.o();
            boolean z20 = c0970c0Q0.Q;
            if (c0970c0Q0.f17310u != z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            c0970c0Q0.Q = z20 | z13;
            c0970c0Q0.f17310u = z12;
            str5 = x9.S;
            C1014r0 c1014r6 = c1023u0.f17585x;
            C1023u0.m(c1014r6);
            c1014r6.o();
            boolean z21 = c0970c0Q0.Q;
            if (c0970c0Q0.f17278C != str5) {
                z14 = true;
            } else {
                z14 = false;
            }
            c0970c0Q0.Q = z21 | z14;
            c0970c0Q0.f17278C = str5;
            R3.a();
            if (e0().y(null, G.f16913Q0)) {
                i10 = x9.Q;
                C1014r0 c1014r7 = c1023u0.f17585x;
                C1023u0.m(c1014r7);
                c1014r7.o();
                boolean z22 = c0970c0Q0.Q;
                if (c0970c0Q0.f17313x != i10) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c0970c0Q0.Q = z22 | z16;
                c0970c0Q0.f17313x = i10;
            }
            c0970c0Q0.z(x9.f17200N);
            str6 = x9.T;
            C1014r0 c1014r8 = c1023u0.f17585x;
            C1023u0.m(c1014r8);
            c1014r8.o();
            boolean z23 = c0970c0Q0.Q;
            if (c0970c0Q0.f17282G != str6) {
                z15 = true;
            } else {
                z15 = false;
            }
            c0970c0Q0.Q = z23 | z15;
            c0970c0Q0.f17282G = str6;
            int i11 = x9.f17203V;
            C1014r0 c1014r9 = c1023u0.f17585x;
            C1023u0.m(c1014r9);
            c1014r9.o();
            c0970c0Q0.Q |= c0970c0Q0.f17284I != i11;
            c0970c0Q0.f17284I = i11;
            if (!c0970c0Q0.o()) {
                z18 = z10;
            } else if (!z10) {
                return c0970c0Q0;
            }
            C0999m c0999m5 = this.f17106t;
            U(c0999m5);
            c0999m5.r0(c0970c0Q0, z18);
            return c0970c0Q0;
        }
        c0970c0Q0 = new C0970c0(this.f17084C, str7);
        if (h0J.i(g11)) {
            c0970c0Q0.F(o(h0J));
        }
        if (h0J.i(g10)) {
            c0970c0Q0.I(strT);
        }
        z10 = false;
        c1023u0 = c0970c0Q0.f17292a;
        c0970c0Q0.H(x9.f17205s);
        str = x9.f17188B;
        if (!TextUtils.isEmpty(str)) {
            c0970c0Q0.K(str);
        }
        j = x9.f17208v;
        if (j != 0) {
            c0970c0Q0.S(j);
        }
        str2 = x9.f17206t;
        if (!TextUtils.isEmpty(str2)) {
            c0970c0Q0.O(str2);
        }
        c0970c0Q0.Q(x9.f17187A);
        str3 = x9.f17207u;
        if (str3 != null) {
            c0970c0Q0.R(str3);
        }
        c0970c0Q0.a(x9.f17209w);
        c0970c0Q0.d(x9.f17211y);
        str4 = x9.f17210x;
        if (!TextUtils.isEmpty(str4)) {
            c0970c0Q0.v(str4);
        }
        C1014r0 c1014r10 = c1023u0.f17585x;
        C1023u0.m(c1014r10);
        c1014r10.o();
        boolean z110 = c0970c0Q0.Q;
        if (c0970c0Q0.f17305p != z17) {
            z11 = true;
        } else {
            z11 = false;
        }
        c0970c0Q0.Q = z110 | z11;
        c0970c0Q0.f17305p = z17;
        Boolean bool2 = x9.f17193G;
        C1014r0 c1014r11 = c1023u0.f17585x;
        C1023u0.m(c1014r11);
        c1014r11.o();
        c0970c0Q0.Q |= !Objects.equals(c0970c0Q0.f17306q, bool2);
        c0970c0Q0.f17306q = bool2;
        c0970c0Q0.c(x9.f17194H);
        String str10 = x9.f17198L;
        C1014r0 c1014r12 = c1023u0.f17585x;
        C1023u0.m(c1014r12);
        c1014r12.o();
        c0970c0Q0.Q |= !Objects.equals(c0970c0Q0.f17309t, str10);
        c0970c0Q0.f17309t = str10;
        c0883t3 = C0883t3.f14410s;
        if (e0().y(null, G.f16906M0)) {
            c0970c0Q0.x(x9.f17195I);
        } else {
            if (e0().y(null, G.L0)) {
                c0970c0Q0.x(null);
            }
        }
        z12 = x9.f17199M;
        C1014r0 c1014r13 = c1023u0.f17585x;
        C1023u0.m(c1014r13);
        c1014r13.o();
        boolean z24 = c0970c0Q0.Q;
        if (c0970c0Q0.f17310u != z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0970c0Q0.Q = z24 | z13;
        c0970c0Q0.f17310u = z12;
        str5 = x9.S;
        C1014r0 c1014r14 = c1023u0.f17585x;
        C1023u0.m(c1014r14);
        c1014r14.o();
        boolean z25 = c0970c0Q0.Q;
        if (c0970c0Q0.f17278C != str5) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0970c0Q0.Q = z25 | z14;
        c0970c0Q0.f17278C = str5;
        R3.a();
        if (e0().y(null, G.f16913Q0)) {
            i10 = x9.Q;
            C1014r0 c1014r15 = c1023u0.f17585x;
            C1023u0.m(c1014r15);
            c1014r15.o();
            boolean z26 = c0970c0Q0.Q;
            if (c0970c0Q0.f17313x != i10) {
                z16 = true;
            } else {
                z16 = false;
            }
            c0970c0Q0.Q = z26 | z16;
            c0970c0Q0.f17313x = i10;
        }
        c0970c0Q0.z(x9.f17200N);
        str6 = x9.T;
        C1014r0 c1014r16 = c1023u0.f17585x;
        C1023u0.m(c1014r16);
        c1014r16.o();
        boolean z27 = c0970c0Q0.Q;
        if (c0970c0Q0.f17282G != str6) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0970c0Q0.Q = z27 | z15;
        c0970c0Q0.f17282G = str6;
        int i12 = x9.f17203V;
        C1014r0 c1014r17 = c1023u0.f17585x;
        C1023u0.m(c1014r17);
        c1014r17.o();
        c0970c0Q0.Q |= c0970c0Q0.f17284I != i12;
        c0970c0Q0.f17284I = i12;
        if (!c0970c0Q0.o()) {
            z18 = z10;
        } else if (!z10) {
            return c0970c0Q0;
        }
        C0999m c0999m6 = this.f17106t;
        U(c0999m6);
        c0999m6.r0(c0970c0Q0, z18);
        return c0970c0Q0;
    }

    @Override // i7.D0
    public final Context d() {
        return this.f17084C.f17579r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, X1 x9) {
        int[] iArr;
        c().o();
        R3.a();
        C0981g c0981gE0 = e0();
        String str = x9.f17204r;
        if (!c0981gE0.y(str, G.f16913Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().f17182w.a("Uri sources and timestamps do not match");
                } else {
                    int i10 = 0;
                    while (i10 < intArray.length) {
                        C0999m c0999m = this.f17106t;
                        U(c0999m);
                        C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
                        int i11 = intArray[i10];
                        long j = longArray[i10];
                        U6.y.c(str);
                        c0999m.o();
                        c0999m.p();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = c0999m.d0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j)});
                                X x10 = c1023u0.f17584w;
                                C1023u0.m(x10);
                                V v10 = x10.f17178E;
                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(iDelete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                v10.d(sb.toString(), str, Integer.valueOf(i11), Long.valueOf(j));
                            } catch (SQLiteException e10) {
                                e = e10;
                                X x11 = c1023u0.f17584w;
                                C1023u0.m(x11);
                                x11.f17182w.c(X.w(str), e, "Error pruning trigger URIs. appId");
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            iArr = intArray;
                        }
                        i10++;
                        intArray = iArr;
                    }
                }
            }
        }
        C0999m c0999m2 = this.f17106t;
        U(c0999m2);
        String str2 = x9.f17204r;
        U6.y.c(str2);
        c0999m2.o();
        c0999m2.p();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c0999m2.d0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new F1(cursorQuery.getLong(1), cursorQuery.getInt(2), string));
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e12) {
            X x12 = ((C1023u0) c0999m2.f16104r).f17584w;
            C1023u0.m(x12);
            x12.f17182w.c(X.w(str2), e12, "Error querying trigger uris. appId");
            arrayList = Collections.EMPTY_LIST;
        }
        return arrayList;
    }

    @Override // i7.D0
    public final Y6.a e() {
        C1023u0 c1023u0 = this.f17084C;
        U6.y.f(c1023u0);
        return c1023u0.f17564B;
    }

    public final C0981g e0() {
        C1023u0 c1023u0 = this.f17084C;
        U6.y.f(c1023u0);
        return c1023u0.f17582u;
    }

    @Override // i7.D0
    public final H8.e f() {
        return this.f17084C.f17581t;
    }

    public final C1003n0 f0() {
        C1003n0 c1003n0 = this.f17104r;
        U(c1003n0);
        return c1003n0;
    }

    public final long g() {
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1027v1 c1027v1 = this.f17112z;
        c1027v1.p();
        c1027v1.o();
        C0979f0 c0979f0 = c1027v1.f17620A;
        long jA = c0979f0.a();
        if (jA == 0) {
            V1 v10 = ((C1023u0) c1027v1.f16104r).f17587z;
            C1023u0.k(v10);
            jA = ((long) v10.n0().nextInt(86400000)) + 1;
            c0979f0.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final C0999m g0() {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        return c0999m;
    }

    public final void h(C1022u c1022u, String str) {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C0970c0 c0970c0Q0 = c0999m.q0(str);
        if (c0970c0Q0 != null) {
            C1023u0 c1023u0 = c0970c0Q0.f17292a;
            if (!TextUtils.isEmpty(c0970c0Q0.N())) {
                Boolean boolP = P(c0970c0Q0);
                if (boolP == null) {
                    if (!"_ui".equals(c1022u.f17558r)) {
                        b().f17185z.b(X.w(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    b().f17182w.b(X.w(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = c0970c0Q0.G();
                String strN = c0970c0Q0.N();
                long jP = c0970c0Q0.P();
                C1014r0 c1014r0 = c1023u0.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.o();
                String str2 = c0970c0Q0.f17301l;
                C1014r0 c1014r1 = c1023u0.f17585x;
                C1023u0.m(c1014r1);
                c1014r1.o();
                long j = c0970c0Q0.f17302m;
                C1014r0 c1014r2 = c1023u0.f17585x;
                C1023u0.m(c1014r2);
                c1014r2.o();
                long j10 = c0970c0Q0.f17303n;
                C1014r0 c1014r3 = c1023u0.f17585x;
                C1023u0.m(c1014r3);
                c1014r3.o();
                boolean z10 = c0970c0Q0.f17304o;
                String strJ = c0970c0Q0.J();
                C1014r0 c1014r4 = c1023u0.f17585x;
                C1023u0.m(c1014r4);
                c1014r4.o();
                boolean z11 = c0970c0Q0.f17305p;
                Boolean boolW = c0970c0Q0.w();
                long jB = c0970c0Q0.b();
                C1014r0 c1014r5 = c1023u0.f17585x;
                C1023u0.m(c1014r5);
                c1014r5.o();
                ArrayList arrayList = c0970c0Q0.f17308s;
                String strG2 = a(str).g();
                boolean zY = c0970c0Q0.y();
                C1014r0 c1014r6 = c1023u0.f17585x;
                C1023u0.m(c1014r6);
                c1014r6.o();
                long j11 = c0970c0Q0.f17311v;
                int i10 = a(str).f17000b;
                String str3 = o0(str).f17491b;
                C1014r0 c1014r7 = c1023u0.f17585x;
                C1023u0.m(c1014r7);
                c1014r7.o();
                int i11 = c0970c0Q0.f17313x;
                C1014r0 c1014r8 = c1023u0.f17585x;
                C1023u0.m(c1014r8);
                c1014r8.o();
                i(c1022u, new X1(str, strG, strN, jP, str2, j, j10, (String) null, z10, false, strJ, 0L, 0, z11, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j11, i10, str3, i11, c0970c0Q0.f17277B, c0970c0Q0.C(), c0970c0Q0.s(), 0L, c0970c0Q0.t()));
                return;
            }
        }
        b().f17177D.b(str, "No app data available; dropping event");
    }

    public final C0973d0 h0() {
        C0973d0 c0973d0 = this.f17107u;
        if (c0973d0 != null) {
            return c0973d0;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    public final void i(C1022u c1022u, X1 x9) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        Cursor cursor;
        Bundle bundleV;
        C1022u c1022uC;
        C1019t c1019t;
        String string;
        String str = x9.f17204r;
        U6.y.c(str);
        Y yB = Y.b(c1022u);
        Bundle bundle = (Bundle) yB.f17217e;
        V1 v1K0 = k0();
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
        c0999m.o();
        c0999m.p();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = c0999m.d0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            C0802d1 c0802d1 = (C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorRawQuery.getBlob(0))).e();
                            c0999m.f17001s.j0();
                            bundleV = C0967b0.v(c0802d1.p());
                            cursorRawQuery.close();
                        } catch (IOException e10) {
                            X x10 = c1023u0.f17584w;
                            C1023u0.m(x10);
                            x10.f17182w.c(X.w(str), e10, "Failed to retrieve default event parameters. appId");
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            bundleV = null;
                        }
                        v1K0.z(bundle, bundleV);
                        V1 v1K1 = k0();
                        C0981g c0981gE0 = e0();
                        c0981gE0.getClass();
                        v1K1.x(yB, Math.max(Math.min(c0981gE0.w(str, G.f16924Y), 100), 25));
                        c1022uC = yB.c();
                        if (!e0().y(null, G.f16946g1) && "_cmp".equals(c1022uC.f17558r)) {
                            c1019t = c1022uC.f17559s;
                            if ("referrer API v2".equals(c1019t.f17548r.getString("_cis"))) {
                                string = c1019t.f17548r.getString("gclid");
                                if (!TextUtils.isEmpty(string)) {
                                    W(new S1("_lgclid", "auto", c1022uC.f17561u, string), x9);
                                }
                            }
                        }
                        j(c1022uC, x9);
                    }
                    X x11 = c1023u0.f17584w;
                    C1023u0.m(x11);
                    x11.f17178E.a("Default event parameters not found");
                } catch (SQLiteException e11) {
                    e = e11;
                    X x12 = c1023u0.f17584w;
                    C1023u0.m(x12);
                    x12.f17182w.b(e, "Error selecting default event parameters");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        bundleV = null;
        v1K0.z(bundle, bundleV);
        V1 v1K2 = k0();
        C0981g c0981gE1 = e0();
        c0981gE1.getClass();
        v1K2.x(yB, Math.max(Math.min(c0981gE1.w(str, G.f16924Y), 100), 25));
        c1022uC = yB.c();
        if (!e0().y(null, G.f16946g1)) {
            c1019t = c1022uC.f17559s;
            if ("referrer API v2".equals(c1019t.f17548r.getString("_cis"))) {
                string = c1019t.f17548r.getString("gclid");
                if (!TextUtils.isEmpty(string)) {
                    W(new S1("_lgclid", "auto", c1022uC.f17561u, string), x9);
                }
            }
        }
        j(c1022uC, x9);
    }

    public final C0969c i0() {
        C0969c c0969c = this.f17109w;
        U(c0969c);
        return c0969c;
    }

    public final void j(C1022u c1022u, X1 x9) {
        C1022u c1022u2;
        List listP0;
        C1023u0 c1023u0;
        List listP1;
        List<C0975e> listP2;
        String str;
        U6.y.f(x9);
        String str2 = x9.f17204r;
        U6.y.c(str2);
        c().o();
        l0();
        long j = c1022u.f17561u;
        Y yB = Y.b(c1022u);
        c().o();
        V1.h0((this.f17099W == null || (str = this.f17100X) == null || !str.equals(str2)) ? null : this.f17099W, (Bundle) yB.f17217e, false);
        C1022u c1022uC = yB.c();
        j0();
        if (TextUtils.isEmpty(x9.f17205s)) {
            return;
        }
        if (!x9.f17211y) {
            c0(x9);
            return;
        }
        List list = x9.f17195I;
        if (list != null) {
            String str3 = c1022uC.f17558r;
            if (!list.contains(str3)) {
                b().f17177D.d("Dropping non-safelisted event. appId, event name, origin", str2, c1022uC.f17558r, c1022uC.f17560t);
                return;
            } else {
                Bundle bundleE = c1022uC.f17559s.e();
                bundleE.putLong("ga_safelisted", 1L);
                c1022u2 = new C1022u(str3, new C1019t(bundleE), c1022uC.f17560t, c1022uC.f17561u);
            }
        } else {
            c1022u2 = c1022uC;
        }
        C0999m c0999m = this.f17106t;
        U(c0999m);
        c0999m.a0();
        try {
            String str4 = c1022u2.f17558r;
            if ("_s".equals(str4)) {
                C0999m c0999m2 = this.f17106t;
                U(c0999m2);
                if (!c0999m2.D(str2, "_s") && c1022u2.f17559s.f17548r.getLong("_sid") != 0) {
                    C0999m c0999m3 = this.f17106t;
                    U(c0999m3);
                    if (c0999m3.D(str2, "_f")) {
                        C0999m c0999m4 = this.f17106t;
                        U(c0999m4);
                        c0999m4.G(str2, null, "_sid", k(c1022u2, str2));
                    } else {
                        C0999m c0999m5 = this.f17106t;
                        U(c0999m5);
                        if (c0999m5.D(str2, "_v")) {
                            C0999m c0999m6 = this.f17106t;
                            U(c0999m6);
                            c0999m6.G(str2, null, "_sid", k(c1022u2, str2));
                        } else {
                            C0999m c0999m7 = this.f17106t;
                            U(c0999m7);
                            e().getClass();
                            c0999m7.G(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(c1022u2, str2));
                        }
                    }
                }
            }
            C0999m c0999m8 = this.f17106t;
            U(c0999m8);
            U6.y.c(str2);
            c0999m8.o();
            c0999m8.p();
            if (j < 0) {
                X x10 = ((C1023u0) c0999m8.f16104r).f17584w;
                C1023u0.m(x10);
                x10.f17185z.c(X.w(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                listP0 = Collections.EMPTY_LIST;
            } else {
                listP0 = c0999m8.p0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listP0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c1023u0 = this.f17084C;
                if (!zHasNext) {
                    break;
                }
                C0975e c0975e = (C0975e) it.next();
                if (c0975e != null) {
                    b().f17178E.d("User property timed out", c0975e.f17325r, c1023u0.f17563A.c(c0975e.f17327t.f17132s), c0975e.f17327t.b());
                    C1022u c1022u3 = c0975e.f17331x;
                    if (c1022u3 != null) {
                        l(new C1022u(c1022u3, j), x9);
                    }
                    C0999m c0999m9 = this.f17106t;
                    U(c0999m9);
                    c0999m9.n0(str2, c0975e.f17327t.f17132s);
                }
            }
            C0999m c0999m10 = this.f17106t;
            U(c0999m10);
            U6.y.c(str2);
            c0999m10.o();
            c0999m10.p();
            if (j < 0) {
                X x11 = ((C1023u0) c0999m10.f16104r).f17584w;
                C1023u0.m(x11);
                x11.f17185z.c(X.w(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                listP1 = Collections.EMPTY_LIST;
            } else {
                listP1 = c0999m10.p0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listP1.size());
            Iterator it2 = listP1.iterator();
            while (it2.hasNext()) {
                C0975e c0975e2 = (C0975e) it2.next();
                if (c0975e2 != null) {
                    Iterator it3 = it2;
                    b().f17178E.d("User property expired", c0975e2.f17325r, c1023u0.f17563A.c(c0975e2.f17327t.f17132s), c0975e2.f17327t.b());
                    C0999m c0999m11 = this.f17106t;
                    U(c0999m11);
                    c0999m11.g0(str2, c0975e2.f17327t.f17132s);
                    C1022u c1022u4 = c0975e2.f17324B;
                    if (c1022u4 != null) {
                        arrayList.add(c1022u4);
                    }
                    C0999m c0999m12 = this.f17106t;
                    U(c0999m12);
                    c0999m12.n0(str2, c0975e2.f17327t.f17132s);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l(new C1022u((C1022u) obj, j), x9);
            }
            C0999m c0999m13 = this.f17106t;
            U(c0999m13);
            U6.y.c(str2);
            U6.y.c(str4);
            c0999m13.o();
            c0999m13.p();
            if (j < 0) {
                C1023u0 c1023u1 = (C1023u0) c0999m13.f16104r;
                X x12 = c1023u1.f17584w;
                C1023u0.m(x12);
                x12.f17185z.d("Invalid time querying triggered conditional properties", X.w(str2), c1023u1.f17563A.a(str4), Long.valueOf(j));
                listP2 = Collections.EMPTY_LIST;
            } else {
                listP2 = c0999m13.p0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listP2.size());
            for (C0975e c0975e3 : listP2) {
                if (c0975e3 != null) {
                    S1 s10 = c0975e3.f17327t;
                    String str5 = c0975e3.f17325r;
                    U6.y.f(str5);
                    String str6 = c0975e3.f17326s;
                    String str7 = s10.f17132s;
                    Object objB = s10.b();
                    U6.y.f(objB);
                    T1 t2 = new T1(str5, str6, str7, j, objB);
                    Object obj2 = t2.f17147e;
                    String str8 = t2.f17145c;
                    C0999m c0999m14 = this.f17106t;
                    U(c0999m14);
                    if (c0999m14.h0(t2)) {
                        b().f17178E.d("User property triggered", c0975e3.f17325r, c1023u0.f17563A.c(str8), obj2);
                    } else {
                        b().f17182w.d("Too many active user properties, ignoring", X.w(c0975e3.f17325r), c1023u0.f17563A.c(str8), obj2);
                    }
                    C1022u c1022u5 = c0975e3.f17333z;
                    if (c1022u5 != null) {
                        arrayList2.add(c1022u5);
                    }
                    c0975e3.f17327t = new S1(t2);
                    c0975e3.f17329v = true;
                    C0999m c0999m15 = this.f17106t;
                    U(c0999m15);
                    c0999m15.l0(c0975e3);
                }
            }
            l(c1022u2, x9);
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                l(new C1022u((C1022u) obj3, j), x9);
            }
            C0999m c0999m16 = this.f17106t;
            U(c0999m16);
            c0999m16.b0();
        } finally {
            C0999m c0999m17 = this.f17106t;
            U(c0999m17);
            c0999m17.c0();
        }
    }

    public final C0967b0 j0() {
        C0967b0 c0967b0 = this.f17110x;
        U(c0967b0);
        return c0967b0;
    }

    public final Bundle k(C1022u c1022u, String str) throws Throwable {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", c1022u.f17559s.f17548r.getLong("_sid"));
        C0999m c0999m = this.f17106t;
        U(c0999m);
        T1 t1I0 = c0999m.i0(str, "_sno");
        if (t1I0 != null) {
            Object obj = t1I0.f17147e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final V1 k0() {
        C1023u0 c1023u0 = this.f17084C;
        U6.y.f(c1023u0);
        V1 v10 = c1023u0.f17587z;
        C1023u0.k(v10);
        return v10;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x03ea A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x040a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x040c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0426 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x042c A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0462 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0480  */
    /* JADX WARN: Code duplicated, block: B:121:0x0484 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x04c1 A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x04dd A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x04ed A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0501 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x057a A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x05be A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x05e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0659 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0695 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x069e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:172:0x06ac A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:176:0x06ba A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:180:0x06c9 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:185:0x06e1 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:190:0x071a A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0723 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0734  */
    /* JADX WARN: Code duplicated, block: B:199:0x0742  */
    /* JADX WARN: Code duplicated, block: B:200:0x0744  */
    /* JADX WARN: Code duplicated, block: B:203:0x074c  */
    /* JADX WARN: Code duplicated, block: B:204:0x074e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0758  */
    /* JADX WARN: Code duplicated, block: B:207:0x075a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0766  */
    /* JADX WARN: Code duplicated, block: B:211:0x0768  */
    /* JADX WARN: Code duplicated, block: B:214:0x0774  */
    /* JADX WARN: Code duplicated, block: B:215:0x0776  */
    /* JADX WARN: Code duplicated, block: B:218:0x0782  */
    /* JADX WARN: Code duplicated, block: B:219:0x0784  */
    /* JADX WARN: Code duplicated, block: B:222:0x0790  */
    /* JADX WARN: Code duplicated, block: B:223:0x0792  */
    /* JADX WARN: Code duplicated, block: B:226:0x079c  */
    /* JADX WARN: Code duplicated, block: B:227:0x079e  */
    /* JADX WARN: Code duplicated, block: B:230:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:231:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:233:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:236:0x07c0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x07ea A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x07ed A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x07f3 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:266:0x0890 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x08a0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x08b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x0971  */
    /* JADX WARN: Code duplicated, block: B:303:0x09b6 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:306:0x09c1 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x09d6 A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x09f6 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a47 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x0a65 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0a7e A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:333:0x0ac8 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x0ada A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:338:0x0ae9 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0b09 A[Catch: all -> 0x0a04, TRY_LEAVE, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:350:0x0b84 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x0bbc A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:362:0x0c2c A[Catch: all -> 0x0a04, SQLiteException -> 0x0c42, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c42, blocks: (B:360:0x0c1b, B:362:0x0c2c), top: B:388:0x0c1b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:382:0x0519 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0b16 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0b90 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:? A[LOOP:3: B:348:0x0b7e->B:414:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0379  */
    /* JADX WARN: Code duplicated, block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0390 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    public final void l(C1022u c1022u, X1 x9) throws Throwable {
        Q1 q10;
        String str;
        String str2;
        String str3;
        long jRound;
        String str4;
        C0999m c0999mG0;
        int iW;
        T1 t2;
        T1 t10;
        Z0.B b5;
        boolean zO0;
        boolean zEquals;
        Iterator<String> it;
        long length;
        Object objB;
        String str5;
        C0990j c0990jT0;
        long jIntValue;
        String str6;
        Bundle bundleE;
        C0999m c0999mG1;
        long jDelete;
        C1023u0 c1023u0;
        C1011q c1011q;
        String str7;
        r rVarM;
        r rVarA;
        C1011q c1011q2;
        C0837k1 c0837k1U;
        String str8;
        String str9;
        String str10;
        long j;
        String str11;
        String str12;
        String str13;
        H0 h0J;
        boolean zY;
        G0 g10;
        long j10;
        com.google.android.gms.internal.measurement.G1 g1A;
        Map mapB;
        String str14;
        ArrayList arrayList;
        H0 h0J2;
        C0970c0 c0970c0Q0;
        int i10;
        List listJ0;
        int i11;
        C0999m c0999mG2;
        C0999m c0999mG3;
        Iterator<String> it2;
        boolean zE;
        int i12;
        String str15;
        ContentValues contentValues;
        String str16;
        C0967b0 c0967b0J0;
        long jZ;
        C0970c0 c0970c0Q1;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long jE;
        C0981g c0981gE0;
        F f3;
        Z0.B b10;
        Object obj;
        T1 t1I0;
        Object obj2;
        long jMax;
        long jIntValue2;
        String str17 = "events";
        U6.y.f(x9);
        boolean z18 = x9.f17191E;
        long j12 = x9.f17194H;
        long j13 = x9.f17209w;
        String str18 = x9.f17196J;
        long j14 = x9.f17208v;
        long j15 = x9.f17187A;
        String str19 = x9.f17198L;
        String str20 = x9.f17206t;
        String str21 = x9.f17207u;
        long j16 = j13;
        boolean z19 = x9.f17211y;
        String str22 = x9.f17204r;
        U6.y.c(str22);
        long jNanoTime = System.nanoTime();
        c().o();
        l0();
        j0();
        String str23 = x9.f17205s;
        if (TextUtils.isEmpty(str23)) {
            return;
        }
        if (!z19) {
            c0(x9);
            return;
        }
        C1003n0 c1003n0F0 = f0();
        String str24 = c1022u.f17558r;
        boolean zD = c1003n0F0.D(str22, str24);
        C1023u0 c1023u1 = this.f17084C;
        Z0.B b11 = this.f17103a0;
        if (zD) {
            b().t().c(X.w(str22), c1023u1.n().a(str24), "Dropping blocked event. appId");
            if (!"1".equals(f0().a(str22, "measurement.upload.blacklist_internal")) && !"1".equals(f0().a(str22, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str24)) {
                    return;
                }
                k0();
                V1.E(b11, str22, 11, "_ev", str24, 0);
                return;
            }
            C0970c0 c0970c0Q2 = g0().q0(str22);
            if (c0970c0Q2 != null) {
                C1023u0 c1023u2 = c0970c0Q2.f17292a;
                C1014r0 c1014r0 = c1023u2.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.o();
                long j17 = c0970c0Q2.S;
                C1014r0 c1014r1 = c1023u2.f17585x;
                C1023u0.m(c1014r1);
                c1014r1.o();
                long jMax2 = Math.max(j17, c0970c0Q2.R);
                e().getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                e0();
                if (jAbs > ((Long) G.f16909O.a(null)).longValue()) {
                    b().u().a("Fetching config for blocked app");
                    z(c0970c0Q2);
                    return;
                }
                return;
            }
            return;
        }
        Y yB = Y.b(c1022u);
        V1 v1K0 = k0();
        C0981g c0981gE1 = e0();
        c0981gE1.getClass();
        v1K0.x(yB, Math.max(Math.min(c0981gE1.w(str22, G.f16924Y), 100), 25));
        int iMax = Math.max(Math.min(e0().w(str22, G.f16948h0), 35), 10);
        Bundle bundle = (Bundle) yB.f17217e;
        for (String str25 : new TreeSet(bundle.keySet())) {
            if ("items".equals(str25)) {
                k0().y(bundle.getParcelableArray(str25), iMax);
            }
        }
        C1022u c1022uC = yB.c();
        C1019t c1019t = c1022uC.f17559s;
        String str26 = c1022uC.f17558r;
        if (Log.isLoggable(b().y(), 2)) {
            b().v().b(c1023u1.n().d(c1022uC), "Logging event");
        }
        g0().a0();
        try {
            c0(x9);
            boolean z20 = "ecommerce_purchase".equals(str26) || "purchase".equals(str26) || "refund".equals(str26);
            if (!"_iap".equals(str26)) {
                if (z20) {
                    z20 = true;
                } else {
                    str3 = str21;
                    str17 = "events";
                    str = str19;
                    str4 = str22;
                    str2 = str20;
                }
                b5 = b11;
                zO0 = V1.o0(str26);
                zEquals = "_err".equals(str26);
                k0();
                if (c1019t == null) {
                    length = 0;
                } else {
                    it = c1019t.f17548r.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objB = c1019t.b(it.next());
                        if (objB instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objB).length;
                        }
                    }
                }
                str5 = str4;
                c0990jT0 = g0().t0(g(), str5, length + 1, true, zO0, false, zEquals, false, false, false);
                long j18 = c0990jT0.f17418b;
                e0();
                jIntValue = j18 - ((long) ((Integer) G.f16958l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zO0) {
                        long j19 = c0990jT0.f17417a;
                        e0();
                        jIntValue2 = j19 - ((long) ((Integer) G.f16963n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17417a), "Data loss. Too many public events logged. appId, count");
                            }
                            k0();
                            V1.E(b5, str5, 16, "_ev", c1022uC.f17558r, 0);
                            g0().b0();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = c0990jT0.f17420d - ((long) Math.max(0, Math.min(1000000, e0().w(str6, G.f16961m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                b().s().c(X.w(str6), Long.valueOf(c0990jT0.f17420d), "Too many error events logged. appId, count");
                            }
                            g0().b0();
                        }
                    }
                    bundleE = c1019t.e();
                    V1 v1K1 = k0();
                    String str27 = c1022uC.f17560t;
                    v1K1.D(bundleE, "_o", str27);
                    if (k0().Q(str6, x9.S)) {
                        k0().D(bundleE, "_dbg", 1L);
                        k0().D(bundleE, "_r", 1L);
                    }
                    if ("_s".equals(str26) && (t1I0 = g0().i0(str6, "_sno")) != null) {
                        obj2 = t1I0.f17147e;
                        if (obj2 instanceof Long) {
                            k0().D(bundleE, "_sno", obj2);
                        }
                    }
                    if (e0().y(null, G.f16925Y0) && Objects.equals(str27, "am") && str26.equals("_ai")) {
                        obj = bundleE.get("value");
                        if (obj instanceof String) {
                            try {
                                double d5 = Double.parseDouble((String) obj);
                                bundleE.remove("value");
                                bundleE.putDouble("value", d5);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    c0999mG1 = g0();
                    U6.y.c(str6);
                    c0999mG1.o();
                    c0999mG1.p();
                    try {
                        jDelete = c0999mG1.d0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((C1023u0) c0999mG1.f16104r).f17582u.w(str6, G.f16969q))))});
                    } catch (SQLiteException e10) {
                        ((C1023u0) c0999mG1.f16104r).b().s().c(X.w(str6), e10, "Error deleting over the limit events. appId");
                        jDelete = 0;
                    }
                    if (jDelete > 0) {
                        b().t().c(X.w(str6), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                    }
                    c1023u0 = this.f17084C;
                    c1011q = new C1011q(c1023u0, c1022uC.f17560t, str6, c1022uC.f17558r, c1022uC.f17561u, 0L, bundleE);
                    C0999m c0999mG4 = g0();
                    str7 = (String) c1011q.f17512e;
                    String str28 = str17;
                    rVarM = c0999mG4.M(str28, str6, str7);
                    if (rVarM == null) {
                        jE = g0().E(str6);
                        c0981gE0 = e0();
                        c0981gE0.getClass();
                        f3 = G.f16922X;
                        b10 = b5;
                        if (jE >= Math.max(Math.min(c0981gE0.w(str6, f3), 2000), 500) || !zO0) {
                            b5 = b10;
                            rVarA = new r(str6, str7, 0L, 0L, 0L, c1011q.f17509b, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            V vS = b().s();
                            W w9 = X.w(str6);
                            String strA = c1023u0.n().a(str7);
                            C0981g c0981gE2 = e0();
                            c0981gE2.getClass();
                            vS.d("Too many event names used, ignoring event. appId, name, supported count", w9, strA, Integer.valueOf(Math.max(Math.min(c0981gE2.w(str6, f3), 2000), 500)));
                            k0();
                            V1.E(b10, str6, 8, null, null, 0);
                        }
                    } else {
                        c1011q = c1011q.e(c1023u0, rVarM.f17526f);
                        rVarA = rVarM.a(c1011q.f17509b);
                    }
                    c1011q2 = c1011q;
                    g0().N(str28, rVarA);
                    c().o();
                    l0();
                    String str29 = (String) c1011q2.f17511d;
                    U6.y.c(str29);
                    U6.y.a(str29.equals(str6));
                    c0837k1U = C0842l1.U();
                    c0837k1U.y();
                    c0837k1U.j();
                    if (!TextUtils.isEmpty(str6)) {
                        c0837k1U.p(str6);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str8 = str3;
                    } else {
                        str8 = str3;
                        c0837k1U.n(str8);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                    } else {
                        str9 = str2;
                        c0837k1U.q(str9);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                    } else {
                        str10 = str;
                        c0837k1U.R(str10);
                    }
                    if (j15 != -2147483648L) {
                        j = j15;
                        c0837k1U.L((int) j);
                    } else {
                        j = j15;
                    }
                    str11 = str8;
                    c0837k1U.r(j14);
                    if (TextUtils.isEmpty(str23)) {
                        str12 = str23;
                    } else {
                        str12 = str23;
                        c0837k1U.H(str12);
                    }
                    U6.y.f(str6);
                    str13 = str10;
                    h0J = a(str6).j(H0.c(100, str18));
                    c0837k1U.Q(h0J.f());
                    R3.a();
                    zY = e0().y(str6, G.f16913Q0);
                    g10 = G0.f16989s;
                    if (zY) {
                        k0();
                        if (V1.M(str6)) {
                            c0837k1U.z(x9.Q);
                            j10 = j;
                            j11 = x9.R;
                            if (!h0J.i(g10) && j11 != 0) {
                                j11 = (j11 & (-2)) | 32;
                            }
                            if (j11 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c0837k1U.T(z10);
                            if (j11 != 0) {
                                com.google.android.gms.internal.measurement.S0 s0W = com.google.android.gms.internal.measurement.T0.w();
                                if ((j11 & 1) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                s0W.h(z11);
                                if ((j11 & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                s0W.i(z12);
                                if ((j11 & 4) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                s0W.j(z13);
                                if ((j11 & 8) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                s0W.k(z14);
                                if ((j11 & 16) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                s0W.l(z15);
                                if ((j11 & 32) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                s0W.m(z16);
                                if ((j11 & 64) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                s0W.n(z17);
                                c0837k1U.A((com.google.android.gms.internal.measurement.T0) s0W.e());
                            }
                        } else {
                            j10 = j;
                        }
                    } else {
                        j10 = j;
                    }
                    if (j16 != 0) {
                        c0837k1U.w(j16);
                        j16 = j16;
                    }
                    c0837k1U.O(j12);
                    C0967b0 c0967b0J1 = j0();
                    g1A = com.google.android.gms.internal.measurement.G1.a(c0967b0J1.f17001s.f17084C.d().getContentResolver(), com.google.android.gms.internal.measurement.N1.a(), T6.p.f7852s);
                    if (g1A == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = g1A.b();
                    }
                    if (mapB == null && !mapB.isEmpty()) {
                        arrayList = new ArrayList();
                        int iIntValue = ((Integer) G.f16945g0.a(null)).intValue();
                        Iterator it3 = mapB.entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                str14 = str9;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it3.next();
                            Iterator it4 = it3;
                            str14 = str9;
                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int i13 = Integer.parseInt((String) entry.getValue());
                                    if (i13 != 0) {
                                        arrayList.add(Integer.valueOf(i13));
                                        if (arrayList.size() >= iIntValue) {
                                            ((C1023u0) c0967b0J1.f16104r).b().t().b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } catch (NumberFormatException e11) {
                                    ((C1023u0) c0967b0J1.f16104r).b().t().b(e11, "Experiment ID NumberFormatException");
                                }
                            }
                            it3 = it4;
                            str9 = str14;
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList != null) {
                                c0837k1U.N(arrayList);
                            }
                            if (e0().y(null, G.f16933b1)) {
                                c0837k1U.D();
                            }
                            h0J2 = a(str6).j(H0.c(100, str18));
                            if (h0J2.i(g10) || !z18) {
                                str12 = str12;
                            } else {
                                try {
                                    C1027v1 c1027v1 = this.f17112z;
                                    c1027v1.getClass();
                                    Pair pairS = h0J2.i(g10) ? c1027v1.s(str6) : new Pair("", Boolean.FALSE);
                                    if (TextUtils.isEmpty((CharSequence) pairS.first)) {
                                        str12 = str12;
                                    } else {
                                        c0837k1U.t((String) pairS.first);
                                        Object obj3 = pairS.second;
                                        if (obj3 != null) {
                                            c0837k1U.u(((Boolean) obj3).booleanValue());
                                        }
                                        if (((String) c1011q2.f17512e).equals("_fx") || ((String) pairS.first).equals("00000000-0000-0000-0000-000000000000") || (c0970c0Q1 = g0().q0(str6)) == null) {
                                            str12 = str12;
                                        } else {
                                            C1014r0 c1014r2 = c0970c0Q1.f17292a.f17585x;
                                            C1023u0.m(c1014r2);
                                            c1014r2.o();
                                            if (c0970c0Q1.f17314y) {
                                                u(str6, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                C1014r0 c1014r3 = c0970c0Q1.f17292a.f17585x;
                                                C1023u0.m(c1014r3);
                                                c1014r3.o();
                                                Long l10 = c0970c0Q1.f17315z;
                                                if (l10 != null) {
                                                    bundle2.putLong("_pfo", Math.max(0L, l10.longValue()));
                                                }
                                                C1014r0 c1014r4 = c0970c0Q1.f17292a.f17585x;
                                                C1023u0.m(c1014r4);
                                                c1014r4.o();
                                                Long l11 = c0970c0Q1.f17276A;
                                                if (l11 != null) {
                                                    bundle2.putLong("_uwa", l11.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                b5.a(str6, "_fx", bundle2);
                                            } else {
                                                str12 = str12;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    q10 = this;
                                }
                            }
                            c1023u1.q().q();
                            String str30 = Build.MODEL;
                            c0837k1U.k();
                            c1023u1.q().q();
                            String str31 = Build.VERSION.RELEASE;
                            c0837k1U.b();
                            ((C0842l1) c0837k1U.f14329s).o0(str31);
                            c0837k1U.m((int) c1023u1.q().s());
                            c0837k1U.l(c1023u1.q().t());
                            c0837k1U.S(x9.f17200N);
                            if (c1023u1.a()) {
                                c0837k1U.o();
                                if (!TextUtils.isEmpty(null)) {
                                    c0837k1U.b();
                                    ((C0842l1) c0837k1U.f14329s).R0(null);
                                    throw null;
                                }
                            }
                            c0970c0Q0 = g0().q0(str6);
                            if (c0970c0Q0 == null) {
                                c0970c0Q0 = new C0970c0(c1023u1, str6);
                                q10 = this;
                                try {
                                    c0970c0Q0.F(q10.o(h0J2));
                                    c0970c0Q0.K(x9.f17188B);
                                    c0970c0Q0.H(str12);
                                    if (h0J2.i(g10)) {
                                        c0970c0Q0.I(q10.f17112z.t(str6, z18));
                                    }
                                    c0970c0Q0.e(0L);
                                    c0970c0Q0.L(0L);
                                    c0970c0Q0.M(0L);
                                    c0970c0Q0.O(str14);
                                    c0970c0Q0.Q(j10);
                                    c0970c0Q0.R(str11);
                                    c0970c0Q0.S(j14);
                                    c0970c0Q0.a(j16);
                                    c0970c0Q0.d(z19);
                                    c0970c0Q0.c(j12);
                                    i10 = 0;
                                    q10.g0().r0(c0970c0Q0, false);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                i10 = 0;
                                q10 = this;
                            }
                            if (h0J2.i(G0.f16990t) && !TextUtils.isEmpty(c0970c0Q0.E())) {
                                String strE = c0970c0Q0.E();
                                U6.y.f(strE);
                                c0837k1U.v(strE);
                            }
                            if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                                String strJ = c0970c0Q0.J();
                                U6.y.f(strJ);
                                c0837k1U.K(strJ);
                            }
                            listJ0 = q10.g0().j0(str6);
                            i11 = i10;
                            while (i11 < listJ0.size()) {
                                C0881t1 c0881t1A = C0886u1.A();
                                String str32 = ((T1) listJ0.get(i11)).f17145c;
                                c0881t1A.b();
                                ((C0886u1) c0881t1A.f14329s).C(str32);
                                long j20 = ((T1) listJ0.get(i11)).f17146d;
                                c0881t1A.b();
                                ((C0886u1) c0881t1A.f14329s).B(j20);
                                q10.j0().M(c0881t1A, ((T1) listJ0.get(i11)).f17147e);
                                c0837k1U.Z(c0881t1A);
                                if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                    C1014r0 c1014r5 = c0970c0Q0.f17292a.f17585x;
                                    C1023u0.m(c1014r5);
                                    c1014r5.o();
                                    if (c0970c0Q0.f17312w != 0) {
                                        c0967b0J0 = q10.j0();
                                        if (TextUtils.isEmpty(str13)) {
                                            str16 = str13;
                                            jZ = 0;
                                        } else {
                                            str16 = str13;
                                            jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                        }
                                        C1014r0 c1014r6 = c0970c0Q0.f17292a.f17585x;
                                        C1023u0.m(c1014r6);
                                        c1014r6.o();
                                        if (jZ != c0970c0Q0.f17312w) {
                                            c0837k1U.b();
                                            ((C0842l1) c0837k1U.f14329s).Z0();
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                } else {
                                    str16 = str13;
                                }
                                i11++;
                                str13 = str16;
                            }
                            try {
                                c0999mG2 = q10.g0();
                                C0842l1 c0842l1 = (C0842l1) c0837k1U.e();
                                c0999mG2.o();
                                c0999mG2.p();
                                U6.y.c(c0842l1.p());
                                byte[] bArrA = c0842l1.a();
                                long jZ2 = c0999mG2.f17001s.j0().Z(bArrA);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", c0842l1.p());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(jZ2));
                                contentValues2.put("metadata", bArrA);
                                try {
                                    c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    c0999mG3 = q10.g0();
                                    C1019t c1019t2 = (C1019t) c1011q2.g;
                                    Objects.requireNonNull(c1019t2);
                                    it2 = c1019t2.f17548r.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            C1003n0 c1003n0F1 = q10.f0();
                                            String str33 = (String) c1011q2.f17511d;
                                            zE = c1003n0F1.E(str33, (String) c1011q2.f17512e);
                                            C0990j c0990jS0 = q10.g0().s0(q10.g(), str33, false, false, false, false);
                                            if (zE || c0990jS0.f17421e >= q10.e0().w(str33, G.f16967p)) {
                                                i12 = i10;
                                                break;
                                            }
                                        } else if ("_r".equals(it2.next())) {
                                        }
                                        i12 = 1;
                                        break;
                                    }
                                    c0999mG3.o();
                                    c0999mG3.p();
                                    str15 = (String) c1011q2.f17511d;
                                    U6.y.c(str15);
                                    byte[] bArrA2 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str15);
                                    contentValues.put("name", (String) c1011q2.f17512e);
                                    contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jZ2));
                                    contentValues.put("data", bArrA2);
                                    contentValues.put("realtime", Integer.valueOf(i12));
                                    try {
                                        if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                                            ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                                        } else {
                                            q10.f17087F = 0L;
                                        }
                                    } catch (SQLiteException e12) {
                                        ((C1023u0) c0999mG3.f16104r).b().s().c(X.w((String) c1011q2.f17511d), e12, "Error storing raw event. appId");
                                    }
                                    q10.g0().b0();
                                    q10.g0().c0();
                                    q10.N();
                                    q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                } catch (SQLiteException e13) {
                                    ((C1023u0) c0999mG2.f16104r).b().s().c(X.w(c0842l1.p()), e13, "Error storing raw event metadata. appId");
                                    throw e13;
                                }
                            } catch (IOException e14) {
                                q10.b().s().c(X.w(c0837k1U.o()), e14, "Data loss. Failed to insert raw event metadata. appId");
                            }
                        }
                        q10.g0().c0();
                        throw th;
                    }
                    str14 = str9;
                    arrayList = null;
                    if (arrayList != null) {
                        c0837k1U.N(arrayList);
                    }
                    if (e0().y(null, G.f16933b1)) {
                        c0837k1U.D();
                    }
                    h0J2 = a(str6).j(H0.c(100, str18));
                    if (h0J2.i(g10)) {
                        str12 = str12;
                        c1023u1.q().q();
                        String str34 = Build.MODEL;
                        c0837k1U.k();
                        c1023u1.q().q();
                        String str35 = Build.VERSION.RELEASE;
                        c0837k1U.b();
                        ((C0842l1) c0837k1U.f14329s).o0(str35);
                        c0837k1U.m((int) c1023u1.q().s());
                        c0837k1U.l(c1023u1.q().t());
                        c0837k1U.S(x9.f17200N);
                        if (c1023u1.a()) {
                            c0837k1U.o();
                            if (!TextUtils.isEmpty(null)) {
                                c0837k1U.b();
                                ((C0842l1) c0837k1U.f14329s).R0(null);
                                throw null;
                            }
                        }
                        c0970c0Q0 = g0().q0(str6);
                        if (c0970c0Q0 == null) {
                            c0970c0Q0 = new C0970c0(c1023u1, str6);
                            q10 = this;
                            c0970c0Q0.F(q10.o(h0J2));
                            c0970c0Q0.K(x9.f17188B);
                            c0970c0Q0.H(str12);
                            if (h0J2.i(g10)) {
                                c0970c0Q0.I(q10.f17112z.t(str6, z18));
                            }
                            c0970c0Q0.e(0L);
                            c0970c0Q0.L(0L);
                            c0970c0Q0.M(0L);
                            c0970c0Q0.O(str14);
                            c0970c0Q0.Q(j10);
                            c0970c0Q0.R(str11);
                            c0970c0Q0.S(j14);
                            c0970c0Q0.a(j16);
                            c0970c0Q0.d(z19);
                            c0970c0Q0.c(j12);
                            i10 = 0;
                            q10.g0().r0(c0970c0Q0, false);
                        } else {
                            i10 = 0;
                            q10 = this;
                        }
                        if (h0J2.i(G0.f16990t)) {
                            String strE2 = c0970c0Q0.E();
                            U6.y.f(strE2);
                            c0837k1U.v(strE2);
                        }
                        if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                            String strJ2 = c0970c0Q0.J();
                            U6.y.f(strJ2);
                            c0837k1U.K(strJ2);
                        }
                        listJ0 = q10.g0().j0(str6);
                        i11 = i10;
                        while (i11 < listJ0.size()) {
                            C0881t1 c0881t1A2 = C0886u1.A();
                            String str36 = ((T1) listJ0.get(i11)).f17145c;
                            c0881t1A2.b();
                            ((C0886u1) c0881t1A2.f14329s).C(str36);
                            long j21 = ((T1) listJ0.get(i11)).f17146d;
                            c0881t1A2.b();
                            ((C0886u1) c0881t1A2.f14329s).B(j21);
                            q10.j0().M(c0881t1A2, ((T1) listJ0.get(i11)).f17147e);
                            c0837k1U.Z(c0881t1A2);
                            if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                C1014r0 c1014r7 = c0970c0Q0.f17292a.f17585x;
                                C1023u0.m(c1014r7);
                                c1014r7.o();
                                if (c0970c0Q0.f17312w != 0) {
                                    c0967b0J0 = q10.j0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jZ = 0;
                                    } else {
                                        str16 = str13;
                                        jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    C1014r0 c1014r8 = c0970c0Q0.f17292a.f17585x;
                                    C1023u0.m(c1014r8);
                                    c1014r8.o();
                                    if (jZ != c0970c0Q0.f17312w) {
                                        c0837k1U.b();
                                        ((C0842l1) c0837k1U.f14329s).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i11++;
                            str13 = str16;
                        }
                        c0999mG2 = q10.g0();
                        C0842l1 c0842l2 = (C0842l1) c0837k1U.e();
                        c0999mG2.o();
                        c0999mG2.p();
                        U6.y.c(c0842l2.p());
                        byte[] bArrA3 = c0842l2.a();
                        long jZ3 = c0999mG2.f17001s.j0().Z(bArrA3);
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("app_id", c0842l2.p());
                        contentValues3.put("metadata_fingerprint", Long.valueOf(jZ3));
                        contentValues3.put("metadata", bArrA3);
                        c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                        c0999mG3 = q10.g0();
                        C1019t c1019t3 = (C1019t) c1011q2.g;
                        Objects.requireNonNull(c1019t3);
                        it2 = c1019t3.f17548r.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                C1003n0 c1003n0F2 = q10.f0();
                                String str37 = (String) c1011q2.f17511d;
                                zE = c1003n0F2.E(str37, (String) c1011q2.f17512e);
                                C0990j c0990jS1 = q10.g0().s0(q10.g(), str37, false, false, false, false);
                                if (zE) {
                                }
                                i12 = i10;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i12 = 1;
                            break;
                        }
                        c0999mG3.o();
                        c0999mG3.p();
                        str15 = (String) c1011q2.f17511d;
                        U6.y.c(str15);
                        byte[] bArrA4 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", (String) c1011q2.f17512e);
                        contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jZ3));
                        contentValues.put("data", bArrA4);
                        contentValues.put("realtime", Integer.valueOf(i12));
                        if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                            ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            q10.f17087F = 0L;
                        }
                        q10.g0().b0();
                        q10.g0().c0();
                        q10.N();
                        q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    str12 = str12;
                    c1023u1.q().q();
                    String str38 = Build.MODEL;
                    c0837k1U.k();
                    c1023u1.q().q();
                    String str39 = Build.VERSION.RELEASE;
                    c0837k1U.b();
                    ((C0842l1) c0837k1U.f14329s).o0(str39);
                    c0837k1U.m((int) c1023u1.q().s());
                    c0837k1U.l(c1023u1.q().t());
                    c0837k1U.S(x9.f17200N);
                    if (c1023u1.a()) {
                        c0837k1U.o();
                        if (!TextUtils.isEmpty(null)) {
                            c0837k1U.b();
                            ((C0842l1) c0837k1U.f14329s).R0(null);
                            throw null;
                        }
                    }
                    c0970c0Q0 = g0().q0(str6);
                    if (c0970c0Q0 == null) {
                        c0970c0Q0 = new C0970c0(c1023u1, str6);
                        q10 = this;
                        c0970c0Q0.F(q10.o(h0J2));
                        c0970c0Q0.K(x9.f17188B);
                        c0970c0Q0.H(str12);
                        if (h0J2.i(g10)) {
                            c0970c0Q0.I(q10.f17112z.t(str6, z18));
                        }
                        c0970c0Q0.e(0L);
                        c0970c0Q0.L(0L);
                        c0970c0Q0.M(0L);
                        c0970c0Q0.O(str14);
                        c0970c0Q0.Q(j10);
                        c0970c0Q0.R(str11);
                        c0970c0Q0.S(j14);
                        c0970c0Q0.a(j16);
                        c0970c0Q0.d(z19);
                        c0970c0Q0.c(j12);
                        i10 = 0;
                        q10.g0().r0(c0970c0Q0, false);
                    } else {
                        i10 = 0;
                        q10 = this;
                    }
                    if (h0J2.i(G0.f16990t)) {
                        String strE3 = c0970c0Q0.E();
                        U6.y.f(strE3);
                        c0837k1U.v(strE3);
                    }
                    if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                        String strJ3 = c0970c0Q0.J();
                        U6.y.f(strJ3);
                        c0837k1U.K(strJ3);
                    }
                    listJ0 = q10.g0().j0(str6);
                    i11 = i10;
                    while (i11 < listJ0.size()) {
                        C0881t1 c0881t1A3 = C0886u1.A();
                        String str310 = ((T1) listJ0.get(i11)).f17145c;
                        c0881t1A3.b();
                        ((C0886u1) c0881t1A3.f14329s).C(str310);
                        long j22 = ((T1) listJ0.get(i11)).f17146d;
                        c0881t1A3.b();
                        ((C0886u1) c0881t1A3.f14329s).B(j22);
                        q10.j0().M(c0881t1A3, ((T1) listJ0.get(i11)).f17147e);
                        c0837k1U.Z(c0881t1A3);
                        if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                            C1014r0 c1014r9 = c0970c0Q0.f17292a.f17585x;
                            C1023u0.m(c1014r9);
                            c1014r9.o();
                            if (c0970c0Q0.f17312w != 0) {
                                c0967b0J0 = q10.j0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jZ = 0;
                                } else {
                                    str16 = str13;
                                    jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                C1014r0 c1014r10 = c0970c0Q0.f17292a.f17585x;
                                C1023u0.m(c1014r10);
                                c1014r10.o();
                                if (jZ != c0970c0Q0.f17312w) {
                                    c0837k1U.b();
                                    ((C0842l1) c0837k1U.f14329s).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i11++;
                        str13 = str16;
                    }
                    c0999mG2 = q10.g0();
                    C0842l1 c0842l3 = (C0842l1) c0837k1U.e();
                    c0999mG2.o();
                    c0999mG2.p();
                    U6.y.c(c0842l3.p());
                    byte[] bArrA5 = c0842l3.a();
                    long jZ4 = c0999mG2.f17001s.j0().Z(bArrA5);
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("app_id", c0842l3.p());
                    contentValues4.put("metadata_fingerprint", Long.valueOf(jZ4));
                    contentValues4.put("metadata", bArrA5);
                    c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                    c0999mG3 = q10.g0();
                    C1019t c1019t4 = (C1019t) c1011q2.g;
                    Objects.requireNonNull(c1019t4);
                    it2 = c1019t4.f17548r.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            C1003n0 c1003n0F3 = q10.f0();
                            String str311 = (String) c1011q2.f17511d;
                            zE = c1003n0F3.E(str311, (String) c1011q2.f17512e);
                            C0990j c0990jS2 = q10.g0().s0(q10.g(), str311, false, false, false, false);
                            if (zE) {
                            }
                            i12 = i10;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i12 = 1;
                        break;
                    }
                    c0999mG3.o();
                    c0999mG3.p();
                    str15 = (String) c1011q2.f17511d;
                    U6.y.c(str15);
                    byte[] bArrA6 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", (String) c1011q2.f17512e);
                    contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jZ4));
                    contentValues.put("data", bArrA6);
                    contentValues.put("realtime", Integer.valueOf(i12));
                    if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                        ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        q10.f17087F = 0L;
                    }
                    q10.g0().b0();
                    q10.g0().c0();
                    q10.N();
                    q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    q10.g0().c0();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17418b), "Data loss. Too many events logged. appId, count");
                }
                g0().b0();
                g0().c0();
            }
            str = str19;
            str2 = str20;
            String strD = c1019t.d();
            str3 = str21;
            Bundle bundle3 = c1019t.f17548r;
            if (z20) {
                double dDoubleValue = c1019t.c().doubleValue() * 1000000.0d;
                if (dDoubleValue == 0.0d) {
                    dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                }
                if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                    b().t().c(X.w(str22), Double.valueOf(dDoubleValue), "Data lost. Currency value is too big. appId");
                    g0().b0();
                } else {
                    jRound = Math.round(dDoubleValue);
                    if ("refund".equals(str26)) {
                        jRound = -jRound;
                    }
                }
                g0().c0();
            }
            str17 = "events";
            jRound = bundle3.getLong("value");
            if (!TextUtils.isEmpty(strD)) {
                String upperCase = strD.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String strConcat = "_ltv_".concat(upperCase);
                    T1 t1I1 = g0().i0(str22, strConcat);
                    try {
                        if (t1I1 != null) {
                            Object obj4 = t1I1.f17147e;
                            if (obj4 instanceof Long) {
                                long jLongValue = ((Long) obj4).longValue();
                                String str40 = c1022uC.f17560t;
                                e().getClass();
                                t2 = new T1(str22, str40, strConcat, System.currentTimeMillis(), Long.valueOf(jLongValue + jRound));
                                str4 = str22;
                            }
                            t10 = t2;
                            if (!g0().h0(t10)) {
                                b().s().d("Too many unique user properties are set. Ignoring user property. appId", X.w(str4), c1023u1.n().c(t10.f17145c), t10.f17147e);
                                k0();
                                V1.E(b11, str4, 9, null, null, 0);
                                b5 = b11;
                            }
                            zO0 = V1.o0(str26);
                            zEquals = "_err".equals(str26);
                            k0();
                            if (c1019t == null) {
                                length = 0;
                            } else {
                                it = c1019t.f17548r.keySet().iterator();
                                length = 0;
                                while (it.hasNext()) {
                                    objB = c1019t.b(it.next());
                                    if (objB instanceof Parcelable[]) {
                                        length += (long) ((Parcelable[]) objB).length;
                                    }
                                }
                            }
                            str5 = str4;
                            c0990jT0 = g0().t0(g(), str5, length + 1, true, zO0, false, zEquals, false, false, false);
                            long j110 = c0990jT0.f17418b;
                            e0();
                            jIntValue = j110 - ((long) ((Integer) G.f16958l.a(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zO0) {
                                    long j111 = c0990jT0.f17417a;
                                    e0();
                                    jIntValue2 = j111 - ((long) ((Integer) G.f16963n.a(null)).intValue());
                                    if (jIntValue2 > 0) {
                                        if (jIntValue2 % 1000 == 1) {
                                            b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17417a), "Data loss. Too many public events logged. appId, count");
                                        }
                                        k0();
                                        V1.E(b5, str5, 16, "_ev", c1022uC.f17558r, 0);
                                        g0().b0();
                                    }
                                }
                                str6 = str5;
                                if (zEquals) {
                                    jMax = c0990jT0.f17420d - ((long) Math.max(0, Math.min(1000000, e0().w(str6, G.f16961m))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            b().s().c(X.w(str6), Long.valueOf(c0990jT0.f17420d), "Too many error events logged. appId, count");
                                        }
                                        g0().b0();
                                    }
                                }
                                bundleE = c1019t.e();
                                V1 v1K2 = k0();
                                String str210 = c1022uC.f17560t;
                                v1K2.D(bundleE, "_o", str210);
                                if (k0().Q(str6, x9.S)) {
                                    k0().D(bundleE, "_dbg", 1L);
                                    k0().D(bundleE, "_r", 1L);
                                }
                                if ("_s".equals(str26)) {
                                    obj2 = t1I0.f17147e;
                                    if (obj2 instanceof Long) {
                                        k0().D(bundleE, "_sno", obj2);
                                    }
                                }
                                if (e0().y(null, G.f16925Y0)) {
                                    obj = bundleE.get("value");
                                    if (obj instanceof String) {
                                        double d9 = Double.parseDouble((String) obj);
                                        bundleE.remove("value");
                                        bundleE.putDouble("value", d9);
                                    }
                                }
                                c0999mG1 = g0();
                                U6.y.c(str6);
                                c0999mG1.o();
                                c0999mG1.p();
                                jDelete = c0999mG1.d0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((C1023u0) c0999mG1.f16104r).f17582u.w(str6, G.f16969q))))});
                                if (jDelete > 0) {
                                    b().t().c(X.w(str6), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                                }
                                c1023u0 = this.f17084C;
                                c1011q = new C1011q(c1023u0, c1022uC.f17560t, str6, c1022uC.f17558r, c1022uC.f17561u, 0L, bundleE);
                                C0999m c0999mG5 = g0();
                                str7 = (String) c1011q.f17512e;
                                String str211 = str17;
                                rVarM = c0999mG5.M(str211, str6, str7);
                                if (rVarM == null) {
                                    jE = g0().E(str6);
                                    c0981gE0 = e0();
                                    c0981gE0.getClass();
                                    f3 = G.f16922X;
                                    b10 = b5;
                                    if (jE >= Math.max(Math.min(c0981gE0.w(str6, f3), 2000), 500)) {
                                    }
                                    b5 = b10;
                                    rVarA = new r(str6, str7, 0L, 0L, 0L, c1011q.f17509b, 0L, null, null, null, null);
                                    str6 = str6;
                                } else {
                                    c1011q = c1011q.e(c1023u0, rVarM.f17526f);
                                    rVarA = rVarM.a(c1011q.f17509b);
                                }
                                c1011q2 = c1011q;
                                g0().N(str211, rVarA);
                                c().o();
                                l0();
                                String str212 = (String) c1011q2.f17511d;
                                U6.y.c(str212);
                                U6.y.a(str212.equals(str6));
                                c0837k1U = C0842l1.U();
                                c0837k1U.y();
                                c0837k1U.j();
                                if (!TextUtils.isEmpty(str6)) {
                                    c0837k1U.p(str6);
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str8 = str3;
                                    c0837k1U.n(str8);
                                } else {
                                    str8 = str3;
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str9 = str2;
                                    c0837k1U.q(str9);
                                } else {
                                    str9 = str2;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str10 = str;
                                    c0837k1U.R(str10);
                                } else {
                                    str10 = str;
                                }
                                if (j15 != -2147483648L) {
                                    j = j15;
                                    c0837k1U.L((int) j);
                                } else {
                                    j = j15;
                                }
                                str11 = str8;
                                c0837k1U.r(j14);
                                if (TextUtils.isEmpty(str23)) {
                                    str12 = str23;
                                    c0837k1U.H(str12);
                                } else {
                                    str12 = str23;
                                }
                                U6.y.f(str6);
                                str13 = str10;
                                h0J = a(str6).j(H0.c(100, str18));
                                c0837k1U.Q(h0J.f());
                                R3.a();
                                zY = e0().y(str6, G.f16913Q0);
                                g10 = G0.f16989s;
                                if (zY) {
                                    k0();
                                    if (V1.M(str6)) {
                                        c0837k1U.z(x9.Q);
                                        j10 = j;
                                        j11 = x9.R;
                                        if (!h0J.i(g10)) {
                                            j11 = (j11 & (-2)) | 32;
                                        }
                                        if (j11 == 1) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        c0837k1U.T(z10);
                                        if (j11 != 0) {
                                            com.google.android.gms.internal.measurement.S0 s0W2 = com.google.android.gms.internal.measurement.T0.w();
                                            if ((j11 & 1) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            s0W2.h(z11);
                                            if ((j11 & 2) != 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            s0W2.i(z12);
                                            if ((j11 & 4) != 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            s0W2.j(z13);
                                            if ((j11 & 8) != 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            s0W2.k(z14);
                                            if ((j11 & 16) != 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            s0W2.l(z15);
                                            if ((j11 & 32) != 0) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            s0W2.m(z16);
                                            if ((j11 & 64) != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            s0W2.n(z17);
                                            c0837k1U.A((com.google.android.gms.internal.measurement.T0) s0W2.e());
                                        }
                                    } else {
                                        j10 = j;
                                    }
                                } else {
                                    j10 = j;
                                }
                                if (j16 != 0) {
                                    c0837k1U.w(j16);
                                    j16 = j16;
                                }
                                c0837k1U.O(j12);
                                C0967b0 c0967b0J2 = j0();
                                g1A = com.google.android.gms.internal.measurement.G1.a(c0967b0J2.f17001s.f17084C.d().getContentResolver(), com.google.android.gms.internal.measurement.N1.a(), T6.p.f7852s);
                                if (g1A == null) {
                                    mapB = Collections.EMPTY_MAP;
                                } else {
                                    mapB = g1A.b();
                                }
                                if (mapB == null) {
                                    str14 = str9;
                                    arrayList = null;
                                } else {
                                    str14 = str9;
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    c0837k1U.N(arrayList);
                                }
                                if (e0().y(null, G.f16933b1)) {
                                    c0837k1U.D();
                                }
                                h0J2 = a(str6).j(H0.c(100, str18));
                                if (h0J2.i(g10)) {
                                    str12 = str12;
                                    c1023u1.q().q();
                                    String str312 = Build.MODEL;
                                    c0837k1U.k();
                                    c1023u1.q().q();
                                    String str313 = Build.VERSION.RELEASE;
                                    c0837k1U.b();
                                    ((C0842l1) c0837k1U.f14329s).o0(str313);
                                    c0837k1U.m((int) c1023u1.q().s());
                                    c0837k1U.l(c1023u1.q().t());
                                    c0837k1U.S(x9.f17200N);
                                    if (c1023u1.a()) {
                                        c0837k1U.o();
                                        if (!TextUtils.isEmpty(null)) {
                                            c0837k1U.b();
                                            ((C0842l1) c0837k1U.f14329s).R0(null);
                                            throw null;
                                        }
                                    }
                                    c0970c0Q0 = g0().q0(str6);
                                    if (c0970c0Q0 == null) {
                                        c0970c0Q0 = new C0970c0(c1023u1, str6);
                                        q10 = this;
                                        c0970c0Q0.F(q10.o(h0J2));
                                        c0970c0Q0.K(x9.f17188B);
                                        c0970c0Q0.H(str12);
                                        if (h0J2.i(g10)) {
                                            c0970c0Q0.I(q10.f17112z.t(str6, z18));
                                        }
                                        c0970c0Q0.e(0L);
                                        c0970c0Q0.L(0L);
                                        c0970c0Q0.M(0L);
                                        c0970c0Q0.O(str14);
                                        c0970c0Q0.Q(j10);
                                        c0970c0Q0.R(str11);
                                        c0970c0Q0.S(j14);
                                        c0970c0Q0.a(j16);
                                        c0970c0Q0.d(z19);
                                        c0970c0Q0.c(j12);
                                        i10 = 0;
                                        q10.g0().r0(c0970c0Q0, false);
                                    } else {
                                        i10 = 0;
                                        q10 = this;
                                    }
                                    if (h0J2.i(G0.f16990t)) {
                                        String strE4 = c0970c0Q0.E();
                                        U6.y.f(strE4);
                                        c0837k1U.v(strE4);
                                    }
                                    if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                                        String strJ4 = c0970c0Q0.J();
                                        U6.y.f(strJ4);
                                        c0837k1U.K(strJ4);
                                    }
                                    listJ0 = q10.g0().j0(str6);
                                    i11 = i10;
                                    while (i11 < listJ0.size()) {
                                        C0881t1 c0881t1A4 = C0886u1.A();
                                        String str314 = ((T1) listJ0.get(i11)).f17145c;
                                        c0881t1A4.b();
                                        ((C0886u1) c0881t1A4.f14329s).C(str314);
                                        long j23 = ((T1) listJ0.get(i11)).f17146d;
                                        c0881t1A4.b();
                                        ((C0886u1) c0881t1A4.f14329s).B(j23);
                                        q10.j0().M(c0881t1A4, ((T1) listJ0.get(i11)).f17147e);
                                        c0837k1U.Z(c0881t1A4);
                                        if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                            C1014r0 c1014r11 = c0970c0Q0.f17292a.f17585x;
                                            C1023u0.m(c1014r11);
                                            c1014r11.o();
                                            if (c0970c0Q0.f17312w != 0) {
                                                c0967b0J0 = q10.j0();
                                                if (TextUtils.isEmpty(str13)) {
                                                    str16 = str13;
                                                    jZ = 0;
                                                } else {
                                                    str16 = str13;
                                                    jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                                }
                                                C1014r0 c1014r12 = c0970c0Q0.f17292a.f17585x;
                                                C1023u0.m(c1014r12);
                                                c1014r12.o();
                                                if (jZ != c0970c0Q0.f17312w) {
                                                    c0837k1U.b();
                                                    ((C0842l1) c0837k1U.f14329s).Z0();
                                                }
                                            } else {
                                                str16 = str13;
                                            }
                                        } else {
                                            str16 = str13;
                                        }
                                        i11++;
                                        str13 = str16;
                                    }
                                    c0999mG2 = q10.g0();
                                    C0842l1 c0842l4 = (C0842l1) c0837k1U.e();
                                    c0999mG2.o();
                                    c0999mG2.p();
                                    U6.y.c(c0842l4.p());
                                    byte[] bArrA7 = c0842l4.a();
                                    long jZ5 = c0999mG2.f17001s.j0().Z(bArrA7);
                                    ContentValues contentValues5 = new ContentValues();
                                    contentValues5.put("app_id", c0842l4.p());
                                    contentValues5.put("metadata_fingerprint", Long.valueOf(jZ5));
                                    contentValues5.put("metadata", bArrA7);
                                    c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                    c0999mG3 = q10.g0();
                                    C1019t c1019t5 = (C1019t) c1011q2.g;
                                    Objects.requireNonNull(c1019t5);
                                    it2 = c1019t5.f17548r.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            C1003n0 c1003n0F4 = q10.f0();
                                            String str315 = (String) c1011q2.f17511d;
                                            zE = c1003n0F4.E(str315, (String) c1011q2.f17512e);
                                            C0990j c0990jS3 = q10.g0().s0(q10.g(), str315, false, false, false, false);
                                            if (zE) {
                                            }
                                            i12 = i10;
                                            break;
                                        }
                                        if ("_r".equals(it2.next())) {
                                        }
                                        i12 = 1;
                                        break;
                                    }
                                    c0999mG3.o();
                                    c0999mG3.p();
                                    str15 = (String) c1011q2.f17511d;
                                    U6.y.c(str15);
                                    byte[] bArrA8 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str15);
                                    contentValues.put("name", (String) c1011q2.f17512e);
                                    contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jZ5));
                                    contentValues.put("data", bArrA8);
                                    contentValues.put("realtime", Integer.valueOf(i12));
                                    if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                                        ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                                    } else {
                                        q10.f17087F = 0L;
                                    }
                                    q10.g0().b0();
                                    q10.g0().c0();
                                    q10.N();
                                    q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                                str12 = str12;
                                c1023u1.q().q();
                                String str316 = Build.MODEL;
                                c0837k1U.k();
                                c1023u1.q().q();
                                String str317 = Build.VERSION.RELEASE;
                                c0837k1U.b();
                                ((C0842l1) c0837k1U.f14329s).o0(str317);
                                c0837k1U.m((int) c1023u1.q().s());
                                c0837k1U.l(c1023u1.q().t());
                                c0837k1U.S(x9.f17200N);
                                if (c1023u1.a()) {
                                    c0837k1U.o();
                                    if (!TextUtils.isEmpty(null)) {
                                        c0837k1U.b();
                                        ((C0842l1) c0837k1U.f14329s).R0(null);
                                        throw null;
                                    }
                                }
                                c0970c0Q0 = g0().q0(str6);
                                if (c0970c0Q0 == null) {
                                    c0970c0Q0 = new C0970c0(c1023u1, str6);
                                    q10 = this;
                                    c0970c0Q0.F(q10.o(h0J2));
                                    c0970c0Q0.K(x9.f17188B);
                                    c0970c0Q0.H(str12);
                                    if (h0J2.i(g10)) {
                                        c0970c0Q0.I(q10.f17112z.t(str6, z18));
                                    }
                                    c0970c0Q0.e(0L);
                                    c0970c0Q0.L(0L);
                                    c0970c0Q0.M(0L);
                                    c0970c0Q0.O(str14);
                                    c0970c0Q0.Q(j10);
                                    c0970c0Q0.R(str11);
                                    c0970c0Q0.S(j14);
                                    c0970c0Q0.a(j16);
                                    c0970c0Q0.d(z19);
                                    c0970c0Q0.c(j12);
                                    i10 = 0;
                                    q10.g0().r0(c0970c0Q0, false);
                                } else {
                                    i10 = 0;
                                    q10 = this;
                                }
                                if (h0J2.i(G0.f16990t)) {
                                    String strE5 = c0970c0Q0.E();
                                    U6.y.f(strE5);
                                    c0837k1U.v(strE5);
                                }
                                if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                                    String strJ5 = c0970c0Q0.J();
                                    U6.y.f(strJ5);
                                    c0837k1U.K(strJ5);
                                }
                                listJ0 = q10.g0().j0(str6);
                                i11 = i10;
                                while (i11 < listJ0.size()) {
                                    C0881t1 c0881t1A5 = C0886u1.A();
                                    String str318 = ((T1) listJ0.get(i11)).f17145c;
                                    c0881t1A5.b();
                                    ((C0886u1) c0881t1A5.f14329s).C(str318);
                                    long j24 = ((T1) listJ0.get(i11)).f17146d;
                                    c0881t1A5.b();
                                    ((C0886u1) c0881t1A5.f14329s).B(j24);
                                    q10.j0().M(c0881t1A5, ((T1) listJ0.get(i11)).f17147e);
                                    c0837k1U.Z(c0881t1A5);
                                    if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                        C1014r0 c1014r13 = c0970c0Q0.f17292a.f17585x;
                                        C1023u0.m(c1014r13);
                                        c1014r13.o();
                                        if (c0970c0Q0.f17312w != 0) {
                                            c0967b0J0 = q10.j0();
                                            if (TextUtils.isEmpty(str13)) {
                                                str16 = str13;
                                                jZ = 0;
                                            } else {
                                                str16 = str13;
                                                jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                            }
                                            C1014r0 c1014r14 = c0970c0Q0.f17292a.f17585x;
                                            C1023u0.m(c1014r14);
                                            c1014r14.o();
                                            if (jZ != c0970c0Q0.f17312w) {
                                                c0837k1U.b();
                                                ((C0842l1) c0837k1U.f14329s).Z0();
                                            }
                                        } else {
                                            str16 = str13;
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                    i11++;
                                    str13 = str16;
                                }
                                c0999mG2 = q10.g0();
                                C0842l1 c0842l5 = (C0842l1) c0837k1U.e();
                                c0999mG2.o();
                                c0999mG2.p();
                                U6.y.c(c0842l5.p());
                                byte[] bArrA9 = c0842l5.a();
                                long jZ6 = c0999mG2.f17001s.j0().Z(bArrA9);
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put("app_id", c0842l5.p());
                                contentValues6.put("metadata_fingerprint", Long.valueOf(jZ6));
                                contentValues6.put("metadata", bArrA9);
                                c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                c0999mG3 = q10.g0();
                                C1019t c1019t6 = (C1019t) c1011q2.g;
                                Objects.requireNonNull(c1019t6);
                                it2 = c1019t6.f17548r.keySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        C1003n0 c1003n0F5 = q10.f0();
                                        String str319 = (String) c1011q2.f17511d;
                                        zE = c1003n0F5.E(str319, (String) c1011q2.f17512e);
                                        C0990j c0990jS4 = q10.g0().s0(q10.g(), str319, false, false, false, false);
                                        if (zE) {
                                        }
                                        i12 = i10;
                                        break;
                                    }
                                    if ("_r".equals(it2.next())) {
                                    }
                                    i12 = 1;
                                    break;
                                }
                                c0999mG3.o();
                                c0999mG3.p();
                                str15 = (String) c1011q2.f17511d;
                                U6.y.c(str15);
                                byte[] bArrA10 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str15);
                                contentValues.put("name", (String) c1011q2.f17512e);
                                contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jZ6));
                                contentValues.put("data", bArrA10);
                                contentValues.put("realtime", Integer.valueOf(i12));
                                if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                                    ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                                } else {
                                    q10.f17087F = 0L;
                                }
                                q10.g0().b0();
                                q10.g0().c0();
                                q10.N();
                                q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                                q10.g0().c0();
                                throw th;
                            }
                            if (jIntValue % 1000 == 1) {
                                b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17418b), "Data loss. Too many events logged. appId, count");
                            }
                            g0().b0();
                            g0().c0();
                        }
                        c0999mG0.d0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str22, str22, String.valueOf(iW)});
                    } catch (SQLiteException e15) {
                        ((C1023u0) c0999mG0.f16104r).b().s().c(X.w(str22), e15, "Error pruning currencies. appId");
                    }
                    c0999mG0 = g0();
                    iW = e0().w(str22, G.U) - 1;
                    U6.y.c(str22);
                    c0999mG0.o();
                    c0999mG0.p();
                    String str41 = c1022uC.f17560t;
                    e().getClass();
                    str4 = str22;
                    t2 = new T1(str4, str41, strConcat, System.currentTimeMillis(), Long.valueOf(jRound));
                    t10 = t2;
                    if (!g0().h0(t10)) {
                        b().s().d("Too many unique user properties are set. Ignoring user property. appId", X.w(str4), c1023u1.n().c(t10.f17145c), t10.f17147e);
                        k0();
                        V1.E(b11, str4, 9, null, null, 0);
                        b5 = b11;
                    }
                    zO0 = V1.o0(str26);
                    zEquals = "_err".equals(str26);
                    k0();
                    if (c1019t == null) {
                        length = 0;
                    } else {
                        it = c1019t.f17548r.keySet().iterator();
                        length = 0;
                        while (it.hasNext()) {
                            objB = c1019t.b(it.next());
                            if (objB instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objB).length;
                            }
                        }
                    }
                    str5 = str4;
                    c0990jT0 = g0().t0(g(), str5, length + 1, true, zO0, false, zEquals, false, false, false);
                    long j112 = c0990jT0.f17418b;
                    e0();
                    jIntValue = j112 - ((long) ((Integer) G.f16958l.a(null)).intValue());
                    if (jIntValue <= 0) {
                        if (zO0) {
                            long j113 = c0990jT0.f17417a;
                            e0();
                            jIntValue2 = j113 - ((long) ((Integer) G.f16963n.a(null)).intValue());
                            if (jIntValue2 > 0) {
                                if (jIntValue2 % 1000 == 1) {
                                    b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17417a), "Data loss. Too many public events logged. appId, count");
                                }
                                k0();
                                V1.E(b5, str5, 16, "_ev", c1022uC.f17558r, 0);
                                g0().b0();
                            }
                        }
                        str6 = str5;
                        if (zEquals) {
                            jMax = c0990jT0.f17420d - ((long) Math.max(0, Math.min(1000000, e0().w(str6, G.f16961m))));
                            if (jMax > 0) {
                                if (jMax == 1) {
                                    b().s().c(X.w(str6), Long.valueOf(c0990jT0.f17420d), "Too many error events logged. appId, count");
                                }
                                g0().b0();
                            }
                        }
                        bundleE = c1019t.e();
                        V1 v1K3 = k0();
                        String str213 = c1022uC.f17560t;
                        v1K3.D(bundleE, "_o", str213);
                        if (k0().Q(str6, x9.S)) {
                            k0().D(bundleE, "_dbg", 1L);
                            k0().D(bundleE, "_r", 1L);
                        }
                        if ("_s".equals(str26)) {
                            obj2 = t1I0.f17147e;
                            if (obj2 instanceof Long) {
                                k0().D(bundleE, "_sno", obj2);
                            }
                        }
                        if (e0().y(null, G.f16925Y0)) {
                            obj = bundleE.get("value");
                            if (obj instanceof String) {
                                double d10 = Double.parseDouble((String) obj);
                                bundleE.remove("value");
                                bundleE.putDouble("value", d10);
                            }
                        }
                        c0999mG1 = g0();
                        U6.y.c(str6);
                        c0999mG1.o();
                        c0999mG1.p();
                        jDelete = c0999mG1.d0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((C1023u0) c0999mG1.f16104r).f17582u.w(str6, G.f16969q))))});
                        if (jDelete > 0) {
                            b().t().c(X.w(str6), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                        }
                        c1023u0 = this.f17084C;
                        c1011q = new C1011q(c1023u0, c1022uC.f17560t, str6, c1022uC.f17558r, c1022uC.f17561u, 0L, bundleE);
                        C0999m c0999mG6 = g0();
                        str7 = (String) c1011q.f17512e;
                        String str214 = str17;
                        rVarM = c0999mG6.M(str214, str6, str7);
                        if (rVarM == null) {
                            jE = g0().E(str6);
                            c0981gE0 = e0();
                            c0981gE0.getClass();
                            f3 = G.f16922X;
                            b10 = b5;
                            if (jE >= Math.max(Math.min(c0981gE0.w(str6, f3), 2000), 500)) {
                            }
                            b5 = b10;
                            rVarA = new r(str6, str7, 0L, 0L, 0L, c1011q.f17509b, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            c1011q = c1011q.e(c1023u0, rVarM.f17526f);
                            rVarA = rVarM.a(c1011q.f17509b);
                        }
                        c1011q2 = c1011q;
                        g0().N(str214, rVarA);
                        c().o();
                        l0();
                        String str215 = (String) c1011q2.f17511d;
                        U6.y.c(str215);
                        U6.y.a(str215.equals(str6));
                        c0837k1U = C0842l1.U();
                        c0837k1U.y();
                        c0837k1U.j();
                        if (!TextUtils.isEmpty(str6)) {
                            c0837k1U.p(str6);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str8 = str3;
                            c0837k1U.n(str8);
                        } else {
                            str8 = str3;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str9 = str2;
                            c0837k1U.q(str9);
                        } else {
                            str9 = str2;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str10 = str;
                            c0837k1U.R(str10);
                        } else {
                            str10 = str;
                        }
                        if (j15 != -2147483648L) {
                            j = j15;
                            c0837k1U.L((int) j);
                        } else {
                            j = j15;
                        }
                        str11 = str8;
                        c0837k1U.r(j14);
                        if (TextUtils.isEmpty(str23)) {
                            str12 = str23;
                            c0837k1U.H(str12);
                        } else {
                            str12 = str23;
                        }
                        U6.y.f(str6);
                        str13 = str10;
                        h0J = a(str6).j(H0.c(100, str18));
                        c0837k1U.Q(h0J.f());
                        R3.a();
                        zY = e0().y(str6, G.f16913Q0);
                        g10 = G0.f16989s;
                        if (zY) {
                            k0();
                            if (V1.M(str6)) {
                                c0837k1U.z(x9.Q);
                                j10 = j;
                                j11 = x9.R;
                                if (!h0J.i(g10)) {
                                    j11 = (j11 & (-2)) | 32;
                                }
                                if (j11 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c0837k1U.T(z10);
                                if (j11 != 0) {
                                    com.google.android.gms.internal.measurement.S0 s0W3 = com.google.android.gms.internal.measurement.T0.w();
                                    if ((j11 & 1) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    s0W3.h(z11);
                                    if ((j11 & 2) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    s0W3.i(z12);
                                    if ((j11 & 4) != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    s0W3.j(z13);
                                    if ((j11 & 8) != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    s0W3.k(z14);
                                    if ((j11 & 16) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    s0W3.l(z15);
                                    if ((j11 & 32) != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    s0W3.m(z16);
                                    if ((j11 & 64) != 0) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    s0W3.n(z17);
                                    c0837k1U.A((com.google.android.gms.internal.measurement.T0) s0W3.e());
                                }
                            } else {
                                j10 = j;
                            }
                        } else {
                            j10 = j;
                        }
                        if (j16 != 0) {
                            c0837k1U.w(j16);
                            j16 = j16;
                        }
                        c0837k1U.O(j12);
                        C0967b0 c0967b0J3 = j0();
                        g1A = com.google.android.gms.internal.measurement.G1.a(c0967b0J3.f17001s.f17084C.d().getContentResolver(), com.google.android.gms.internal.measurement.N1.a(), T6.p.f7852s);
                        if (g1A == null) {
                            mapB = Collections.EMPTY_MAP;
                        } else {
                            mapB = g1A.b();
                        }
                        if (mapB == null) {
                            str14 = str9;
                            arrayList = null;
                        } else {
                            str14 = str9;
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            c0837k1U.N(arrayList);
                        }
                        if (e0().y(null, G.f16933b1)) {
                            c0837k1U.D();
                        }
                        h0J2 = a(str6).j(H0.c(100, str18));
                        if (h0J2.i(g10)) {
                            str12 = str12;
                            c1023u1.q().q();
                            String str3110 = Build.MODEL;
                            c0837k1U.k();
                            c1023u1.q().q();
                            String str3111 = Build.VERSION.RELEASE;
                            c0837k1U.b();
                            ((C0842l1) c0837k1U.f14329s).o0(str3111);
                            c0837k1U.m((int) c1023u1.q().s());
                            c0837k1U.l(c1023u1.q().t());
                            c0837k1U.S(x9.f17200N);
                            if (c1023u1.a()) {
                                c0837k1U.o();
                                if (!TextUtils.isEmpty(null)) {
                                    c0837k1U.b();
                                    ((C0842l1) c0837k1U.f14329s).R0(null);
                                    throw null;
                                }
                            }
                            c0970c0Q0 = g0().q0(str6);
                            if (c0970c0Q0 == null) {
                                c0970c0Q0 = new C0970c0(c1023u1, str6);
                                q10 = this;
                                c0970c0Q0.F(q10.o(h0J2));
                                c0970c0Q0.K(x9.f17188B);
                                c0970c0Q0.H(str12);
                                if (h0J2.i(g10)) {
                                    c0970c0Q0.I(q10.f17112z.t(str6, z18));
                                }
                                c0970c0Q0.e(0L);
                                c0970c0Q0.L(0L);
                                c0970c0Q0.M(0L);
                                c0970c0Q0.O(str14);
                                c0970c0Q0.Q(j10);
                                c0970c0Q0.R(str11);
                                c0970c0Q0.S(j14);
                                c0970c0Q0.a(j16);
                                c0970c0Q0.d(z19);
                                c0970c0Q0.c(j12);
                                i10 = 0;
                                q10.g0().r0(c0970c0Q0, false);
                            } else {
                                i10 = 0;
                                q10 = this;
                            }
                            if (h0J2.i(G0.f16990t)) {
                                String strE6 = c0970c0Q0.E();
                                U6.y.f(strE6);
                                c0837k1U.v(strE6);
                            }
                            if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                                String strJ6 = c0970c0Q0.J();
                                U6.y.f(strJ6);
                                c0837k1U.K(strJ6);
                            }
                            listJ0 = q10.g0().j0(str6);
                            i11 = i10;
                            while (i11 < listJ0.size()) {
                                C0881t1 c0881t1A6 = C0886u1.A();
                                String str3112 = ((T1) listJ0.get(i11)).f17145c;
                                c0881t1A6.b();
                                ((C0886u1) c0881t1A6.f14329s).C(str3112);
                                long j25 = ((T1) listJ0.get(i11)).f17146d;
                                c0881t1A6.b();
                                ((C0886u1) c0881t1A6.f14329s).B(j25);
                                q10.j0().M(c0881t1A6, ((T1) listJ0.get(i11)).f17147e);
                                c0837k1U.Z(c0881t1A6);
                                if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                    C1014r0 c1014r15 = c0970c0Q0.f17292a.f17585x;
                                    C1023u0.m(c1014r15);
                                    c1014r15.o();
                                    if (c0970c0Q0.f17312w != 0) {
                                        c0967b0J0 = q10.j0();
                                        if (TextUtils.isEmpty(str13)) {
                                            str16 = str13;
                                            jZ = 0;
                                        } else {
                                            str16 = str13;
                                            jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                        }
                                        C1014r0 c1014r16 = c0970c0Q0.f17292a.f17585x;
                                        C1023u0.m(c1014r16);
                                        c1014r16.o();
                                        if (jZ != c0970c0Q0.f17312w) {
                                            c0837k1U.b();
                                            ((C0842l1) c0837k1U.f14329s).Z0();
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                } else {
                                    str16 = str13;
                                }
                                i11++;
                                str13 = str16;
                            }
                            c0999mG2 = q10.g0();
                            C0842l1 c0842l6 = (C0842l1) c0837k1U.e();
                            c0999mG2.o();
                            c0999mG2.p();
                            U6.y.c(c0842l6.p());
                            byte[] bArrA11 = c0842l6.a();
                            long jZ7 = c0999mG2.f17001s.j0().Z(bArrA11);
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put("app_id", c0842l6.p());
                            contentValues7.put("metadata_fingerprint", Long.valueOf(jZ7));
                            contentValues7.put("metadata", bArrA11);
                            c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
                            c0999mG3 = q10.g0();
                            C1019t c1019t7 = (C1019t) c1011q2.g;
                            Objects.requireNonNull(c1019t7);
                            it2 = c1019t7.f17548r.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    C1003n0 c1003n0F6 = q10.f0();
                                    String str3113 = (String) c1011q2.f17511d;
                                    zE = c1003n0F6.E(str3113, (String) c1011q2.f17512e);
                                    C0990j c0990jS5 = q10.g0().s0(q10.g(), str3113, false, false, false, false);
                                    if (zE) {
                                    }
                                    i12 = i10;
                                    break;
                                }
                                if ("_r".equals(it2.next())) {
                                }
                                i12 = 1;
                                break;
                            }
                            c0999mG3.o();
                            c0999mG3.p();
                            str15 = (String) c1011q2.f17511d;
                            U6.y.c(str15);
                            byte[] bArrA12 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str15);
                            contentValues.put("name", (String) c1011q2.f17512e);
                            contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jZ7));
                            contentValues.put("data", bArrA12);
                            contentValues.put("realtime", Integer.valueOf(i12));
                            if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                                ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                            } else {
                                q10.f17087F = 0L;
                            }
                            q10.g0().b0();
                            q10.g0().c0();
                            q10.N();
                            q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        str12 = str12;
                        c1023u1.q().q();
                        String str3114 = Build.MODEL;
                        c0837k1U.k();
                        c1023u1.q().q();
                        String str3115 = Build.VERSION.RELEASE;
                        c0837k1U.b();
                        ((C0842l1) c0837k1U.f14329s).o0(str3115);
                        c0837k1U.m((int) c1023u1.q().s());
                        c0837k1U.l(c1023u1.q().t());
                        c0837k1U.S(x9.f17200N);
                        if (c1023u1.a()) {
                            c0837k1U.o();
                            if (!TextUtils.isEmpty(null)) {
                                c0837k1U.b();
                                ((C0842l1) c0837k1U.f14329s).R0(null);
                                throw null;
                            }
                        }
                        c0970c0Q0 = g0().q0(str6);
                        if (c0970c0Q0 == null) {
                            c0970c0Q0 = new C0970c0(c1023u1, str6);
                            q10 = this;
                            c0970c0Q0.F(q10.o(h0J2));
                            c0970c0Q0.K(x9.f17188B);
                            c0970c0Q0.H(str12);
                            if (h0J2.i(g10)) {
                                c0970c0Q0.I(q10.f17112z.t(str6, z18));
                            }
                            c0970c0Q0.e(0L);
                            c0970c0Q0.L(0L);
                            c0970c0Q0.M(0L);
                            c0970c0Q0.O(str14);
                            c0970c0Q0.Q(j10);
                            c0970c0Q0.R(str11);
                            c0970c0Q0.S(j14);
                            c0970c0Q0.a(j16);
                            c0970c0Q0.d(z19);
                            c0970c0Q0.c(j12);
                            i10 = 0;
                            q10.g0().r0(c0970c0Q0, false);
                        } else {
                            i10 = 0;
                            q10 = this;
                        }
                        if (h0J2.i(G0.f16990t)) {
                            String strE7 = c0970c0Q0.E();
                            U6.y.f(strE7);
                            c0837k1U.v(strE7);
                        }
                        if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                            String strJ7 = c0970c0Q0.J();
                            U6.y.f(strJ7);
                            c0837k1U.K(strJ7);
                        }
                        listJ0 = q10.g0().j0(str6);
                        i11 = i10;
                        while (i11 < listJ0.size()) {
                            C0881t1 c0881t1A7 = C0886u1.A();
                            String str3116 = ((T1) listJ0.get(i11)).f17145c;
                            c0881t1A7.b();
                            ((C0886u1) c0881t1A7.f14329s).C(str3116);
                            long j26 = ((T1) listJ0.get(i11)).f17146d;
                            c0881t1A7.b();
                            ((C0886u1) c0881t1A7.f14329s).B(j26);
                            q10.j0().M(c0881t1A7, ((T1) listJ0.get(i11)).f17147e);
                            c0837k1U.Z(c0881t1A7);
                            if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                C1014r0 c1014r17 = c0970c0Q0.f17292a.f17585x;
                                C1023u0.m(c1014r17);
                                c1014r17.o();
                                if (c0970c0Q0.f17312w != 0) {
                                    c0967b0J0 = q10.j0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jZ = 0;
                                    } else {
                                        str16 = str13;
                                        jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    C1014r0 c1014r18 = c0970c0Q0.f17292a.f17585x;
                                    C1023u0.m(c1014r18);
                                    c1014r18.o();
                                    if (jZ != c0970c0Q0.f17312w) {
                                        c0837k1U.b();
                                        ((C0842l1) c0837k1U.f14329s).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i11++;
                            str13 = str16;
                        }
                        c0999mG2 = q10.g0();
                        C0842l1 c0842l7 = (C0842l1) c0837k1U.e();
                        c0999mG2.o();
                        c0999mG2.p();
                        U6.y.c(c0842l7.p());
                        byte[] bArrA13 = c0842l7.a();
                        long jZ8 = c0999mG2.f17001s.j0().Z(bArrA13);
                        ContentValues contentValues8 = new ContentValues();
                        contentValues8.put("app_id", c0842l7.p());
                        contentValues8.put("metadata_fingerprint", Long.valueOf(jZ8));
                        contentValues8.put("metadata", bArrA13);
                        c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                        c0999mG3 = q10.g0();
                        C1019t c1019t8 = (C1019t) c1011q2.g;
                        Objects.requireNonNull(c1019t8);
                        it2 = c1019t8.f17548r.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                C1003n0 c1003n0F7 = q10.f0();
                                String str3117 = (String) c1011q2.f17511d;
                                zE = c1003n0F7.E(str3117, (String) c1011q2.f17512e);
                                C0990j c0990jS6 = q10.g0().s0(q10.g(), str3117, false, false, false, false);
                                if (zE) {
                                }
                                i12 = i10;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i12 = 1;
                            break;
                        }
                        c0999mG3.o();
                        c0999mG3.p();
                        str15 = (String) c1011q2.f17511d;
                        U6.y.c(str15);
                        byte[] bArrA14 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", (String) c1011q2.f17512e);
                        contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jZ8));
                        contentValues.put("data", bArrA14);
                        contentValues.put("realtime", Integer.valueOf(i12));
                        if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                            ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            q10.f17087F = 0L;
                        }
                        q10.g0().b0();
                        q10.g0().c0();
                        q10.N();
                        q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                        q10.g0().c0();
                        throw th;
                    }
                    if (jIntValue % 1000 == 1) {
                        b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17418b), "Data loss. Too many events logged. appId, count");
                    }
                    g0().b0();
                    g0().c0();
                }
                b5 = b11;
                zO0 = V1.o0(str26);
                zEquals = "_err".equals(str26);
                k0();
                if (c1019t == null) {
                    length = 0;
                } else {
                    it = c1019t.f17548r.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objB = c1019t.b(it.next());
                        if (objB instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objB).length;
                        }
                    }
                }
                str5 = str4;
                c0990jT0 = g0().t0(g(), str5, length + 1, true, zO0, false, zEquals, false, false, false);
                long j114 = c0990jT0.f17418b;
                e0();
                jIntValue = j114 - ((long) ((Integer) G.f16958l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zO0) {
                        long j115 = c0990jT0.f17417a;
                        e0();
                        jIntValue2 = j115 - ((long) ((Integer) G.f16963n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17417a), "Data loss. Too many public events logged. appId, count");
                            }
                            k0();
                            V1.E(b5, str5, 16, "_ev", c1022uC.f17558r, 0);
                            g0().b0();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = c0990jT0.f17420d - ((long) Math.max(0, Math.min(1000000, e0().w(str6, G.f16961m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                b().s().c(X.w(str6), Long.valueOf(c0990jT0.f17420d), "Too many error events logged. appId, count");
                            }
                            g0().b0();
                        }
                    }
                    bundleE = c1019t.e();
                    V1 v1K4 = k0();
                    String str216 = c1022uC.f17560t;
                    v1K4.D(bundleE, "_o", str216);
                    if (k0().Q(str6, x9.S)) {
                        k0().D(bundleE, "_dbg", 1L);
                        k0().D(bundleE, "_r", 1L);
                    }
                    if ("_s".equals(str26)) {
                        obj2 = t1I0.f17147e;
                        if (obj2 instanceof Long) {
                            k0().D(bundleE, "_sno", obj2);
                        }
                    }
                    if (e0().y(null, G.f16925Y0)) {
                        obj = bundleE.get("value");
                        if (obj instanceof String) {
                            double d11 = Double.parseDouble((String) obj);
                            bundleE.remove("value");
                            bundleE.putDouble("value", d11);
                        }
                    }
                    c0999mG1 = g0();
                    U6.y.c(str6);
                    c0999mG1.o();
                    c0999mG1.p();
                    jDelete = c0999mG1.d0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((C1023u0) c0999mG1.f16104r).f17582u.w(str6, G.f16969q))))});
                    if (jDelete > 0) {
                        b().t().c(X.w(str6), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                    }
                    c1023u0 = this.f17084C;
                    c1011q = new C1011q(c1023u0, c1022uC.f17560t, str6, c1022uC.f17558r, c1022uC.f17561u, 0L, bundleE);
                    C0999m c0999mG7 = g0();
                    str7 = (String) c1011q.f17512e;
                    String str217 = str17;
                    rVarM = c0999mG7.M(str217, str6, str7);
                    if (rVarM == null) {
                        jE = g0().E(str6);
                        c0981gE0 = e0();
                        c0981gE0.getClass();
                        f3 = G.f16922X;
                        b10 = b5;
                        if (jE >= Math.max(Math.min(c0981gE0.w(str6, f3), 2000), 500)) {
                        }
                        b5 = b10;
                        rVarA = new r(str6, str7, 0L, 0L, 0L, c1011q.f17509b, 0L, null, null, null, null);
                        str6 = str6;
                    } else {
                        c1011q = c1011q.e(c1023u0, rVarM.f17526f);
                        rVarA = rVarM.a(c1011q.f17509b);
                    }
                    c1011q2 = c1011q;
                    g0().N(str217, rVarA);
                    c().o();
                    l0();
                    String str218 = (String) c1011q2.f17511d;
                    U6.y.c(str218);
                    U6.y.a(str218.equals(str6));
                    c0837k1U = C0842l1.U();
                    c0837k1U.y();
                    c0837k1U.j();
                    if (!TextUtils.isEmpty(str6)) {
                        c0837k1U.p(str6);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str8 = str3;
                        c0837k1U.n(str8);
                    } else {
                        str8 = str3;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                        c0837k1U.q(str9);
                    } else {
                        str9 = str2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                        c0837k1U.R(str10);
                    } else {
                        str10 = str;
                    }
                    if (j15 != -2147483648L) {
                        j = j15;
                        c0837k1U.L((int) j);
                    } else {
                        j = j15;
                    }
                    str11 = str8;
                    c0837k1U.r(j14);
                    if (TextUtils.isEmpty(str23)) {
                        str12 = str23;
                        c0837k1U.H(str12);
                    } else {
                        str12 = str23;
                    }
                    U6.y.f(str6);
                    str13 = str10;
                    h0J = a(str6).j(H0.c(100, str18));
                    c0837k1U.Q(h0J.f());
                    R3.a();
                    zY = e0().y(str6, G.f16913Q0);
                    g10 = G0.f16989s;
                    if (zY) {
                        k0();
                        if (V1.M(str6)) {
                            c0837k1U.z(x9.Q);
                            j10 = j;
                            j11 = x9.R;
                            if (!h0J.i(g10)) {
                                j11 = (j11 & (-2)) | 32;
                            }
                            if (j11 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c0837k1U.T(z10);
                            if (j11 != 0) {
                                com.google.android.gms.internal.measurement.S0 s0W4 = com.google.android.gms.internal.measurement.T0.w();
                                if ((j11 & 1) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                s0W4.h(z11);
                                if ((j11 & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                s0W4.i(z12);
                                if ((j11 & 4) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                s0W4.j(z13);
                                if ((j11 & 8) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                s0W4.k(z14);
                                if ((j11 & 16) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                s0W4.l(z15);
                                if ((j11 & 32) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                s0W4.m(z16);
                                if ((j11 & 64) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                s0W4.n(z17);
                                c0837k1U.A((com.google.android.gms.internal.measurement.T0) s0W4.e());
                            }
                        } else {
                            j10 = j;
                        }
                    } else {
                        j10 = j;
                    }
                    if (j16 != 0) {
                        c0837k1U.w(j16);
                        j16 = j16;
                    }
                    c0837k1U.O(j12);
                    C0967b0 c0967b0J4 = j0();
                    g1A = com.google.android.gms.internal.measurement.G1.a(c0967b0J4.f17001s.f17084C.d().getContentResolver(), com.google.android.gms.internal.measurement.N1.a(), T6.p.f7852s);
                    if (g1A == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = g1A.b();
                    }
                    if (mapB == null) {
                        str14 = str9;
                        arrayList = null;
                    } else {
                        str14 = str9;
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        c0837k1U.N(arrayList);
                    }
                    if (e0().y(null, G.f16933b1)) {
                        c0837k1U.D();
                    }
                    h0J2 = a(str6).j(H0.c(100, str18));
                    if (h0J2.i(g10)) {
                        str12 = str12;
                        c1023u1.q().q();
                        String str3118 = Build.MODEL;
                        c0837k1U.k();
                        c1023u1.q().q();
                        String str3119 = Build.VERSION.RELEASE;
                        c0837k1U.b();
                        ((C0842l1) c0837k1U.f14329s).o0(str3119);
                        c0837k1U.m((int) c1023u1.q().s());
                        c0837k1U.l(c1023u1.q().t());
                        c0837k1U.S(x9.f17200N);
                        if (c1023u1.a()) {
                            c0837k1U.o();
                            if (!TextUtils.isEmpty(null)) {
                                c0837k1U.b();
                                ((C0842l1) c0837k1U.f14329s).R0(null);
                                throw null;
                            }
                        }
                        c0970c0Q0 = g0().q0(str6);
                        if (c0970c0Q0 == null) {
                            c0970c0Q0 = new C0970c0(c1023u1, str6);
                            q10 = this;
                            c0970c0Q0.F(q10.o(h0J2));
                            c0970c0Q0.K(x9.f17188B);
                            c0970c0Q0.H(str12);
                            if (h0J2.i(g10)) {
                                c0970c0Q0.I(q10.f17112z.t(str6, z18));
                            }
                            c0970c0Q0.e(0L);
                            c0970c0Q0.L(0L);
                            c0970c0Q0.M(0L);
                            c0970c0Q0.O(str14);
                            c0970c0Q0.Q(j10);
                            c0970c0Q0.R(str11);
                            c0970c0Q0.S(j14);
                            c0970c0Q0.a(j16);
                            c0970c0Q0.d(z19);
                            c0970c0Q0.c(j12);
                            i10 = 0;
                            q10.g0().r0(c0970c0Q0, false);
                        } else {
                            i10 = 0;
                            q10 = this;
                        }
                        if (h0J2.i(G0.f16990t)) {
                            String strE8 = c0970c0Q0.E();
                            U6.y.f(strE8);
                            c0837k1U.v(strE8);
                        }
                        if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                            String strJ8 = c0970c0Q0.J();
                            U6.y.f(strJ8);
                            c0837k1U.K(strJ8);
                        }
                        listJ0 = q10.g0().j0(str6);
                        i11 = i10;
                        while (i11 < listJ0.size()) {
                            C0881t1 c0881t1A8 = C0886u1.A();
                            String str31110 = ((T1) listJ0.get(i11)).f17145c;
                            c0881t1A8.b();
                            ((C0886u1) c0881t1A8.f14329s).C(str31110);
                            long j27 = ((T1) listJ0.get(i11)).f17146d;
                            c0881t1A8.b();
                            ((C0886u1) c0881t1A8.f14329s).B(j27);
                            q10.j0().M(c0881t1A8, ((T1) listJ0.get(i11)).f17147e);
                            c0837k1U.Z(c0881t1A8);
                            if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                                C1014r0 c1014r19 = c0970c0Q0.f17292a.f17585x;
                                C1023u0.m(c1014r19);
                                c1014r19.o();
                                if (c0970c0Q0.f17312w != 0) {
                                    c0967b0J0 = q10.j0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jZ = 0;
                                    } else {
                                        str16 = str13;
                                        jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    C1014r0 c1014r110 = c0970c0Q0.f17292a.f17585x;
                                    C1023u0.m(c1014r110);
                                    c1014r110.o();
                                    if (jZ != c0970c0Q0.f17312w) {
                                        c0837k1U.b();
                                        ((C0842l1) c0837k1U.f14329s).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i11++;
                            str13 = str16;
                        }
                        c0999mG2 = q10.g0();
                        C0842l1 c0842l8 = (C0842l1) c0837k1U.e();
                        c0999mG2.o();
                        c0999mG2.p();
                        U6.y.c(c0842l8.p());
                        byte[] bArrA15 = c0842l8.a();
                        long jZ9 = c0999mG2.f17001s.j0().Z(bArrA15);
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put("app_id", c0842l8.p());
                        contentValues9.put("metadata_fingerprint", Long.valueOf(jZ9));
                        contentValues9.put("metadata", bArrA15);
                        c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                        c0999mG3 = q10.g0();
                        C1019t c1019t9 = (C1019t) c1011q2.g;
                        Objects.requireNonNull(c1019t9);
                        it2 = c1019t9.f17548r.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                C1003n0 c1003n0F8 = q10.f0();
                                String str31111 = (String) c1011q2.f17511d;
                                zE = c1003n0F8.E(str31111, (String) c1011q2.f17512e);
                                C0990j c0990jS7 = q10.g0().s0(q10.g(), str31111, false, false, false, false);
                                if (zE) {
                                }
                                i12 = i10;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i12 = 1;
                            break;
                        }
                        c0999mG3.o();
                        c0999mG3.p();
                        str15 = (String) c1011q2.f17511d;
                        U6.y.c(str15);
                        byte[] bArrA16 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", (String) c1011q2.f17512e);
                        contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jZ9));
                        contentValues.put("data", bArrA16);
                        contentValues.put("realtime", Integer.valueOf(i12));
                        if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                            ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            q10.f17087F = 0L;
                        }
                        q10.g0().b0();
                        q10.g0().c0();
                        q10.N();
                        q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    str12 = str12;
                    c1023u1.q().q();
                    String str31112 = Build.MODEL;
                    c0837k1U.k();
                    c1023u1.q().q();
                    String str31113 = Build.VERSION.RELEASE;
                    c0837k1U.b();
                    ((C0842l1) c0837k1U.f14329s).o0(str31113);
                    c0837k1U.m((int) c1023u1.q().s());
                    c0837k1U.l(c1023u1.q().t());
                    c0837k1U.S(x9.f17200N);
                    if (c1023u1.a()) {
                        c0837k1U.o();
                        if (!TextUtils.isEmpty(null)) {
                            c0837k1U.b();
                            ((C0842l1) c0837k1U.f14329s).R0(null);
                            throw null;
                        }
                    }
                    c0970c0Q0 = g0().q0(str6);
                    if (c0970c0Q0 == null) {
                        c0970c0Q0 = new C0970c0(c1023u1, str6);
                        q10 = this;
                        c0970c0Q0.F(q10.o(h0J2));
                        c0970c0Q0.K(x9.f17188B);
                        c0970c0Q0.H(str12);
                        if (h0J2.i(g10)) {
                            c0970c0Q0.I(q10.f17112z.t(str6, z18));
                        }
                        c0970c0Q0.e(0L);
                        c0970c0Q0.L(0L);
                        c0970c0Q0.M(0L);
                        c0970c0Q0.O(str14);
                        c0970c0Q0.Q(j10);
                        c0970c0Q0.R(str11);
                        c0970c0Q0.S(j14);
                        c0970c0Q0.a(j16);
                        c0970c0Q0.d(z19);
                        c0970c0Q0.c(j12);
                        i10 = 0;
                        q10.g0().r0(c0970c0Q0, false);
                    } else {
                        i10 = 0;
                        q10 = this;
                    }
                    if (h0J2.i(G0.f16990t)) {
                        String strE9 = c0970c0Q0.E();
                        U6.y.f(strE9);
                        c0837k1U.v(strE9);
                    }
                    if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                        String strJ9 = c0970c0Q0.J();
                        U6.y.f(strJ9);
                        c0837k1U.K(strJ9);
                    }
                    listJ0 = q10.g0().j0(str6);
                    i11 = i10;
                    while (i11 < listJ0.size()) {
                        C0881t1 c0881t1A9 = C0886u1.A();
                        String str31114 = ((T1) listJ0.get(i11)).f17145c;
                        c0881t1A9.b();
                        ((C0886u1) c0881t1A9.f14329s).C(str31114);
                        long j28 = ((T1) listJ0.get(i11)).f17146d;
                        c0881t1A9.b();
                        ((C0886u1) c0881t1A9.f14329s).B(j28);
                        q10.j0().M(c0881t1A9, ((T1) listJ0.get(i11)).f17147e);
                        c0837k1U.Z(c0881t1A9);
                        if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                            C1014r0 c1014r111 = c0970c0Q0.f17292a.f17585x;
                            C1023u0.m(c1014r111);
                            c1014r111.o();
                            if (c0970c0Q0.f17312w != 0) {
                                c0967b0J0 = q10.j0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jZ = 0;
                                } else {
                                    str16 = str13;
                                    jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                C1014r0 c1014r112 = c0970c0Q0.f17292a.f17585x;
                                C1023u0.m(c1014r112);
                                c1014r112.o();
                                if (jZ != c0970c0Q0.f17312w) {
                                    c0837k1U.b();
                                    ((C0842l1) c0837k1U.f14329s).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i11++;
                        str13 = str16;
                    }
                    c0999mG2 = q10.g0();
                    C0842l1 c0842l9 = (C0842l1) c0837k1U.e();
                    c0999mG2.o();
                    c0999mG2.p();
                    U6.y.c(c0842l9.p());
                    byte[] bArrA17 = c0842l9.a();
                    long jZ10 = c0999mG2.f17001s.j0().Z(bArrA17);
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put("app_id", c0842l9.p());
                    contentValues10.put("metadata_fingerprint", Long.valueOf(jZ10));
                    contentValues10.put("metadata", bArrA17);
                    c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
                    c0999mG3 = q10.g0();
                    C1019t c1019t10 = (C1019t) c1011q2.g;
                    Objects.requireNonNull(c1019t10);
                    it2 = c1019t10.f17548r.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            C1003n0 c1003n0F9 = q10.f0();
                            String str31115 = (String) c1011q2.f17511d;
                            zE = c1003n0F9.E(str31115, (String) c1011q2.f17512e);
                            C0990j c0990jS8 = q10.g0().s0(q10.g(), str31115, false, false, false, false);
                            if (zE) {
                            }
                            i12 = i10;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i12 = 1;
                        break;
                    }
                    c0999mG3.o();
                    c0999mG3.p();
                    str15 = (String) c1011q2.f17511d;
                    U6.y.c(str15);
                    byte[] bArrA18 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", (String) c1011q2.f17512e);
                    contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jZ10));
                    contentValues.put("data", bArrA18);
                    contentValues.put("realtime", Integer.valueOf(i12));
                    if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                        ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        q10.f17087F = 0L;
                    }
                    q10.g0().b0();
                    q10.g0().c0();
                    q10.N();
                    q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    q10.g0().c0();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17418b), "Data loss. Too many events logged. appId, count");
                }
                g0().b0();
                g0().c0();
            }
            str4 = str22;
            b5 = b11;
            zO0 = V1.o0(str26);
            zEquals = "_err".equals(str26);
            k0();
            if (c1019t == null) {
                length = 0;
            } else {
                it = c1019t.f17548r.keySet().iterator();
                length = 0;
                while (it.hasNext()) {
                    objB = c1019t.b(it.next());
                    if (objB instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objB).length;
                    }
                }
            }
            str5 = str4;
            c0990jT0 = g0().t0(g(), str5, length + 1, true, zO0, false, zEquals, false, false, false);
            long j116 = c0990jT0.f17418b;
            e0();
            jIntValue = j116 - ((long) ((Integer) G.f16958l.a(null)).intValue());
            if (jIntValue <= 0) {
                if (zO0) {
                    long j117 = c0990jT0.f17417a;
                    e0();
                    jIntValue2 = j117 - ((long) ((Integer) G.f16963n.a(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17417a), "Data loss. Too many public events logged. appId, count");
                        }
                        k0();
                        V1.E(b5, str5, 16, "_ev", c1022uC.f17558r, 0);
                        g0().b0();
                    }
                }
                str6 = str5;
                if (zEquals) {
                    jMax = c0990jT0.f17420d - ((long) Math.max(0, Math.min(1000000, e0().w(str6, G.f16961m))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            b().s().c(X.w(str6), Long.valueOf(c0990jT0.f17420d), "Too many error events logged. appId, count");
                        }
                        g0().b0();
                    }
                }
                bundleE = c1019t.e();
                V1 v1K5 = k0();
                String str219 = c1022uC.f17560t;
                v1K5.D(bundleE, "_o", str219);
                if (k0().Q(str6, x9.S)) {
                    k0().D(bundleE, "_dbg", 1L);
                    k0().D(bundleE, "_r", 1L);
                }
                if ("_s".equals(str26)) {
                    obj2 = t1I0.f17147e;
                    if (obj2 instanceof Long) {
                        k0().D(bundleE, "_sno", obj2);
                    }
                }
                if (e0().y(null, G.f16925Y0)) {
                    obj = bundleE.get("value");
                    if (obj instanceof String) {
                        double d12 = Double.parseDouble((String) obj);
                        bundleE.remove("value");
                        bundleE.putDouble("value", d12);
                    }
                }
                c0999mG1 = g0();
                U6.y.c(str6);
                c0999mG1.o();
                c0999mG1.p();
                jDelete = c0999mG1.d0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((C1023u0) c0999mG1.f16104r).f17582u.w(str6, G.f16969q))))});
                if (jDelete > 0) {
                    b().t().c(X.w(str6), Long.valueOf(jDelete), "Data lost. Too many events stored on disk, deleted. appId");
                }
                c1023u0 = this.f17084C;
                c1011q = new C1011q(c1023u0, c1022uC.f17560t, str6, c1022uC.f17558r, c1022uC.f17561u, 0L, bundleE);
                C0999m c0999mG8 = g0();
                str7 = (String) c1011q.f17512e;
                String str2110 = str17;
                rVarM = c0999mG8.M(str2110, str6, str7);
                if (rVarM == null) {
                    jE = g0().E(str6);
                    c0981gE0 = e0();
                    c0981gE0.getClass();
                    f3 = G.f16922X;
                    b10 = b5;
                    if (jE >= Math.max(Math.min(c0981gE0.w(str6, f3), 2000), 500)) {
                    }
                    b5 = b10;
                    rVarA = new r(str6, str7, 0L, 0L, 0L, c1011q.f17509b, 0L, null, null, null, null);
                    str6 = str6;
                } else {
                    c1011q = c1011q.e(c1023u0, rVarM.f17526f);
                    rVarA = rVarM.a(c1011q.f17509b);
                }
                c1011q2 = c1011q;
                g0().N(str2110, rVarA);
                c().o();
                l0();
                String str2111 = (String) c1011q2.f17511d;
                U6.y.c(str2111);
                U6.y.a(str2111.equals(str6));
                c0837k1U = C0842l1.U();
                c0837k1U.y();
                c0837k1U.j();
                if (!TextUtils.isEmpty(str6)) {
                    c0837k1U.p(str6);
                }
                if (TextUtils.isEmpty(str3)) {
                    str8 = str3;
                    c0837k1U.n(str8);
                } else {
                    str8 = str3;
                }
                if (TextUtils.isEmpty(str2)) {
                    str9 = str2;
                    c0837k1U.q(str9);
                } else {
                    str9 = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    str10 = str;
                    c0837k1U.R(str10);
                } else {
                    str10 = str;
                }
                if (j15 != -2147483648L) {
                    j = j15;
                    c0837k1U.L((int) j);
                } else {
                    j = j15;
                }
                str11 = str8;
                c0837k1U.r(j14);
                if (TextUtils.isEmpty(str23)) {
                    str12 = str23;
                    c0837k1U.H(str12);
                } else {
                    str12 = str23;
                }
                U6.y.f(str6);
                str13 = str10;
                h0J = a(str6).j(H0.c(100, str18));
                c0837k1U.Q(h0J.f());
                R3.a();
                zY = e0().y(str6, G.f16913Q0);
                g10 = G0.f16989s;
                if (zY) {
                    k0();
                    if (V1.M(str6)) {
                        c0837k1U.z(x9.Q);
                        j10 = j;
                        j11 = x9.R;
                        if (!h0J.i(g10)) {
                            j11 = (j11 & (-2)) | 32;
                        }
                        if (j11 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c0837k1U.T(z10);
                        if (j11 != 0) {
                            com.google.android.gms.internal.measurement.S0 s0W5 = com.google.android.gms.internal.measurement.T0.w();
                            if ((j11 & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            s0W5.h(z11);
                            if ((j11 & 2) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            s0W5.i(z12);
                            if ((j11 & 4) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            s0W5.j(z13);
                            if ((j11 & 8) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            s0W5.k(z14);
                            if ((j11 & 16) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            s0W5.l(z15);
                            if ((j11 & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            s0W5.m(z16);
                            if ((j11 & 64) != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            s0W5.n(z17);
                            c0837k1U.A((com.google.android.gms.internal.measurement.T0) s0W5.e());
                        }
                    } else {
                        j10 = j;
                    }
                } else {
                    j10 = j;
                }
                if (j16 != 0) {
                    c0837k1U.w(j16);
                    j16 = j16;
                }
                c0837k1U.O(j12);
                C0967b0 c0967b0J5 = j0();
                g1A = com.google.android.gms.internal.measurement.G1.a(c0967b0J5.f17001s.f17084C.d().getContentResolver(), com.google.android.gms.internal.measurement.N1.a(), T6.p.f7852s);
                if (g1A == null) {
                    mapB = Collections.EMPTY_MAP;
                } else {
                    mapB = g1A.b();
                }
                if (mapB == null) {
                    str14 = str9;
                    arrayList = null;
                } else {
                    str14 = str9;
                    arrayList = null;
                }
                if (arrayList != null) {
                    c0837k1U.N(arrayList);
                }
                if (e0().y(null, G.f16933b1)) {
                    c0837k1U.D();
                }
                h0J2 = a(str6).j(H0.c(100, str18));
                if (h0J2.i(g10)) {
                    str12 = str12;
                    c1023u1.q().q();
                    String str31116 = Build.MODEL;
                    c0837k1U.k();
                    c1023u1.q().q();
                    String str31117 = Build.VERSION.RELEASE;
                    c0837k1U.b();
                    ((C0842l1) c0837k1U.f14329s).o0(str31117);
                    c0837k1U.m((int) c1023u1.q().s());
                    c0837k1U.l(c1023u1.q().t());
                    c0837k1U.S(x9.f17200N);
                    if (c1023u1.a()) {
                        c0837k1U.o();
                        if (!TextUtils.isEmpty(null)) {
                            c0837k1U.b();
                            ((C0842l1) c0837k1U.f14329s).R0(null);
                            throw null;
                        }
                    }
                    c0970c0Q0 = g0().q0(str6);
                    if (c0970c0Q0 == null) {
                        c0970c0Q0 = new C0970c0(c1023u1, str6);
                        q10 = this;
                        c0970c0Q0.F(q10.o(h0J2));
                        c0970c0Q0.K(x9.f17188B);
                        c0970c0Q0.H(str12);
                        if (h0J2.i(g10)) {
                            c0970c0Q0.I(q10.f17112z.t(str6, z18));
                        }
                        c0970c0Q0.e(0L);
                        c0970c0Q0.L(0L);
                        c0970c0Q0.M(0L);
                        c0970c0Q0.O(str14);
                        c0970c0Q0.Q(j10);
                        c0970c0Q0.R(str11);
                        c0970c0Q0.S(j14);
                        c0970c0Q0.a(j16);
                        c0970c0Q0.d(z19);
                        c0970c0Q0.c(j12);
                        i10 = 0;
                        q10.g0().r0(c0970c0Q0, false);
                    } else {
                        i10 = 0;
                        q10 = this;
                    }
                    if (h0J2.i(G0.f16990t)) {
                        String strE10 = c0970c0Q0.E();
                        U6.y.f(strE10);
                        c0837k1U.v(strE10);
                    }
                    if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                        String strJ10 = c0970c0Q0.J();
                        U6.y.f(strJ10);
                        c0837k1U.K(strJ10);
                    }
                    listJ0 = q10.g0().j0(str6);
                    i11 = i10;
                    while (i11 < listJ0.size()) {
                        C0881t1 c0881t1A10 = C0886u1.A();
                        String str31118 = ((T1) listJ0.get(i11)).f17145c;
                        c0881t1A10.b();
                        ((C0886u1) c0881t1A10.f14329s).C(str31118);
                        long j29 = ((T1) listJ0.get(i11)).f17146d;
                        c0881t1A10.b();
                        ((C0886u1) c0881t1A10.f14329s).B(j29);
                        q10.j0().M(c0881t1A10, ((T1) listJ0.get(i11)).f17147e);
                        c0837k1U.Z(c0881t1A10);
                        if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                            C1014r0 c1014r113 = c0970c0Q0.f17292a.f17585x;
                            C1023u0.m(c1014r113);
                            c1014r113.o();
                            if (c0970c0Q0.f17312w != 0) {
                                c0967b0J0 = q10.j0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jZ = 0;
                                } else {
                                    str16 = str13;
                                    jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                C1014r0 c1014r114 = c0970c0Q0.f17292a.f17585x;
                                C1023u0.m(c1014r114);
                                c1014r114.o();
                                if (jZ != c0970c0Q0.f17312w) {
                                    c0837k1U.b();
                                    ((C0842l1) c0837k1U.f14329s).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i11++;
                        str13 = str16;
                    }
                    c0999mG2 = q10.g0();
                    C0842l1 c0842l10 = (C0842l1) c0837k1U.e();
                    c0999mG2.o();
                    c0999mG2.p();
                    U6.y.c(c0842l10.p());
                    byte[] bArrA19 = c0842l10.a();
                    long jZ11 = c0999mG2.f17001s.j0().Z(bArrA19);
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put("app_id", c0842l10.p());
                    contentValues11.put("metadata_fingerprint", Long.valueOf(jZ11));
                    contentValues11.put("metadata", bArrA19);
                    c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
                    c0999mG3 = q10.g0();
                    C1019t c1019t11 = (C1019t) c1011q2.g;
                    Objects.requireNonNull(c1019t11);
                    it2 = c1019t11.f17548r.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            C1003n0 c1003n0F10 = q10.f0();
                            String str31119 = (String) c1011q2.f17511d;
                            zE = c1003n0F10.E(str31119, (String) c1011q2.f17512e);
                            C0990j c0990jS9 = q10.g0().s0(q10.g(), str31119, false, false, false, false);
                            if (zE) {
                            }
                            i12 = i10;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i12 = 1;
                        break;
                    }
                    c0999mG3.o();
                    c0999mG3.p();
                    str15 = (String) c1011q2.f17511d;
                    U6.y.c(str15);
                    byte[] bArrA110 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", (String) c1011q2.f17512e);
                    contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jZ11));
                    contentValues.put("data", bArrA110);
                    contentValues.put("realtime", Integer.valueOf(i12));
                    if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                        ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        q10.f17087F = 0L;
                    }
                    q10.g0().b0();
                    q10.g0().c0();
                    q10.N();
                    q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                }
                str12 = str12;
                c1023u1.q().q();
                String str311110 = Build.MODEL;
                c0837k1U.k();
                c1023u1.q().q();
                String str311111 = Build.VERSION.RELEASE;
                c0837k1U.b();
                ((C0842l1) c0837k1U.f14329s).o0(str311111);
                c0837k1U.m((int) c1023u1.q().s());
                c0837k1U.l(c1023u1.q().t());
                c0837k1U.S(x9.f17200N);
                if (c1023u1.a()) {
                    c0837k1U.o();
                    if (!TextUtils.isEmpty(null)) {
                        c0837k1U.b();
                        ((C0842l1) c0837k1U.f14329s).R0(null);
                        throw null;
                    }
                }
                c0970c0Q0 = g0().q0(str6);
                if (c0970c0Q0 == null) {
                    c0970c0Q0 = new C0970c0(c1023u1, str6);
                    q10 = this;
                    c0970c0Q0.F(q10.o(h0J2));
                    c0970c0Q0.K(x9.f17188B);
                    c0970c0Q0.H(str12);
                    if (h0J2.i(g10)) {
                        c0970c0Q0.I(q10.f17112z.t(str6, z18));
                    }
                    c0970c0Q0.e(0L);
                    c0970c0Q0.L(0L);
                    c0970c0Q0.M(0L);
                    c0970c0Q0.O(str14);
                    c0970c0Q0.Q(j10);
                    c0970c0Q0.R(str11);
                    c0970c0Q0.S(j14);
                    c0970c0Q0.a(j16);
                    c0970c0Q0.d(z19);
                    c0970c0Q0.c(j12);
                    i10 = 0;
                    q10.g0().r0(c0970c0Q0, false);
                } else {
                    i10 = 0;
                    q10 = this;
                }
                if (h0J2.i(G0.f16990t)) {
                    String strE11 = c0970c0Q0.E();
                    U6.y.f(strE11);
                    c0837k1U.v(strE11);
                }
                if (!TextUtils.isEmpty(c0970c0Q0.J())) {
                    String strJ11 = c0970c0Q0.J();
                    U6.y.f(strJ11);
                    c0837k1U.K(strJ11);
                }
                listJ0 = q10.g0().j0(str6);
                i11 = i10;
                while (i11 < listJ0.size()) {
                    C0881t1 c0881t1A11 = C0886u1.A();
                    String str311112 = ((T1) listJ0.get(i11)).f17145c;
                    c0881t1A11.b();
                    ((C0886u1) c0881t1A11.f14329s).C(str311112);
                    long j210 = ((T1) listJ0.get(i11)).f17146d;
                    c0881t1A11.b();
                    ((C0886u1) c0881t1A11.f14329s).B(j210);
                    q10.j0().M(c0881t1A11, ((T1) listJ0.get(i11)).f17147e);
                    c0837k1U.Z(c0881t1A11);
                    if ("_sid".equals(((T1) listJ0.get(i11)).f17145c)) {
                        C1014r0 c1014r115 = c0970c0Q0.f17292a.f17585x;
                        C1023u0.m(c1014r115);
                        c1014r115.o();
                        if (c0970c0Q0.f17312w != 0) {
                            c0967b0J0 = q10.j0();
                            if (TextUtils.isEmpty(str13)) {
                                str16 = str13;
                                jZ = 0;
                            } else {
                                str16 = str13;
                                jZ = c0967b0J0.Z(str16.getBytes(Charset.forName("UTF-8")));
                            }
                            C1014r0 c1014r116 = c0970c0Q0.f17292a.f17585x;
                            C1023u0.m(c1014r116);
                            c1014r116.o();
                            if (jZ != c0970c0Q0.f17312w) {
                                c0837k1U.b();
                                ((C0842l1) c0837k1U.f14329s).Z0();
                            }
                        } else {
                            str16 = str13;
                        }
                    } else {
                        str16 = str13;
                    }
                    i11++;
                    str13 = str16;
                }
                c0999mG2 = q10.g0();
                C0842l1 c0842l11 = (C0842l1) c0837k1U.e();
                c0999mG2.o();
                c0999mG2.p();
                U6.y.c(c0842l11.p());
                byte[] bArrA111 = c0842l11.a();
                long jZ12 = c0999mG2.f17001s.j0().Z(bArrA111);
                ContentValues contentValues12 = new ContentValues();
                contentValues12.put("app_id", c0842l11.p());
                contentValues12.put("metadata_fingerprint", Long.valueOf(jZ12));
                contentValues12.put("metadata", bArrA111);
                c0999mG2.d0().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
                c0999mG3 = q10.g0();
                C1019t c1019t12 = (C1019t) c1011q2.g;
                Objects.requireNonNull(c1019t12);
                it2 = c1019t12.f17548r.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        C1003n0 c1003n0F11 = q10.f0();
                        String str311113 = (String) c1011q2.f17511d;
                        zE = c1003n0F11.E(str311113, (String) c1011q2.f17512e);
                        C0990j c0990jS10 = q10.g0().s0(q10.g(), str311113, false, false, false, false);
                        if (zE) {
                        }
                        i12 = i10;
                        break;
                    }
                    if ("_r".equals(it2.next())) {
                    }
                    i12 = 1;
                    break;
                }
                c0999mG3.o();
                c0999mG3.p();
                str15 = (String) c1011q2.f17511d;
                U6.y.c(str15);
                byte[] bArrA112 = c0999mG3.f17001s.j0().Q(c1011q2).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str15);
                contentValues.put("name", (String) c1011q2.f17512e);
                contentValues.put("timestamp", Long.valueOf(c1011q2.f17509b));
                contentValues.put("metadata_fingerprint", Long.valueOf(jZ12));
                contentValues.put("data", bArrA112);
                contentValues.put("realtime", Integer.valueOf(i12));
                if (c0999mG3.d0().insert("raw_events", null, contentValues) == -1) {
                    ((C1023u0) c0999mG3.f16104r).b().s().b(X.w(str15), "Failed to insert raw event (got -1). appId");
                } else {
                    q10.f17087F = 0L;
                }
                q10.g0().b0();
                q10.g0().c0();
                q10.N();
                q10.b().v().b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                return;
                q10.g0().c0();
                throw th;
            }
            if (jIntValue % 1000 == 1) {
                b().s().c(X.w(str5), Long.valueOf(c0990jT0.f17418b), "Data loss. Too many events logged. appId, count");
            }
            g0().b0();
            g0().c0();
        } catch (Throwable th3) {
            th = th3;
            q10 = this;
        }
    }

    public final void l0() {
        if (!this.f17085D.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void m(C0970c0 c0970c0, C0837k1 c0837k1) throws Throwable {
        Z0.B b5;
        C0886u1 c0886u1;
        EnumC0984h enumC0984h;
        c().o();
        l0();
        String strB0 = ((C0842l1) c0837k1.f14329s).B0();
        EnumMap enumMap = new EnumMap(G0.class);
        int length = strB0.length();
        int length2 = G0.values().length;
        EnumC0984h enumC0984h2 = EnumC0984h.UNSET;
        int i10 = 0;
        if (length < length2 || strB0.charAt(0) != '1') {
            b5 = new Z0.B(11);
        } else {
            G0[] g0ArrValues = G0.values();
            int length3 = g0ArrValues.length;
            int i11 = 0;
            int i12 = 1;
            while (i11 < length3) {
                G0 g10 = g0ArrValues[i11];
                int i13 = i12 + 1;
                char cCharAt = strB0.charAt(i12);
                EnumC0984h[] enumC0984hArrValues = EnumC0984h.values();
                int length4 = enumC0984hArrValues.length;
                int i14 = i10;
                while (true) {
                    if (i14 >= length4) {
                        enumC0984h = enumC0984h2;
                        break;
                    }
                    enumC0984h = enumC0984hArrValues[i14];
                    if (enumC0984h.f17383r == cCharAt) {
                        break;
                    } else {
                        i14++;
                    }
                }
                enumMap.put(g10, enumC0984h);
                i11++;
                i12 = i13;
                i10 = 0;
            }
            b5 = new Z0.B(enumMap);
        }
        String strD = c0970c0.D();
        c().o();
        l0();
        H0 h0A = a(strD);
        EnumMap enumMap2 = h0A.f16999a;
        G0 g11 = G0.f16989s;
        E0 e10 = (E0) enumMap2.get(g11);
        E0 e11 = E0.f16862s;
        if (e10 == null) {
            e10 = e11;
        }
        int i15 = h0A.f17000b;
        int iOrdinal = e10.ordinal();
        EnumC0984h enumC0984h3 = EnumC0984h.REMOTE_ENFORCED_DEFAULT;
        EnumC0984h enumC0984h4 = EnumC0984h.FAILSAFE;
        if (iOrdinal == 1) {
            b5.o(g11, enumC0984h3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            b5.n(g11, i15);
        } else {
            b5.o(g11, enumC0984h4);
        }
        G0 g12 = G0.f16990t;
        E0 e12 = (E0) enumMap2.get(g12);
        if (e12 != null) {
            e11 = e12;
        }
        int iOrdinal2 = e11.ordinal();
        if (iOrdinal2 == 1) {
            b5.o(g12, enumC0984h3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            b5.n(g12, i15);
        } else {
            b5.o(g12, enumC0984h4);
        }
        String strD2 = c0970c0.D();
        c().o();
        l0();
        C1005o c1005oQ0 = q0(strD2, o0(strD2), a(strD2), b5);
        String str = c1005oQ0.f17493d;
        Boolean bool = c1005oQ0.f17492c;
        U6.y.f(bool);
        boolean zBooleanValue = bool.booleanValue();
        c0837k1.b();
        ((C0842l1) c0837k1.f14329s).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).g1(str);
        }
        c().o();
        l0();
        Iterator it = DesugarCollections.unmodifiableList(((C0842l1) c0837k1.f14329s).U1()).iterator();
        do {
            if (!it.hasNext()) {
                c0886u1 = null;
                break;
            }
            c0886u1 = (C0886u1) it.next();
        } while (!"_npa".equals(c0886u1.r()));
        if (c0886u1 != null) {
            EnumMap enumMap3 = (EnumMap) b5.f10875s;
            G0 g13 = G0.f16992v;
            EnumC0984h enumC0984h5 = (EnumC0984h) enumMap3.get(g13);
            if (enumC0984h5 == null) {
                enumC0984h5 = enumC0984h2;
            }
            if (enumC0984h5 == enumC0984h2) {
                C0999m c0999m = this.f17106t;
                U(c0999m);
                T1 t1I0 = c0999m.i0(c0970c0.D(), "_npa");
                EnumC0984h enumC0984h6 = EnumC0984h.MANIFEST;
                EnumC0984h enumC0984h7 = EnumC0984h.API;
                if (t1I0 != null) {
                    String str2 = t1I0.f17144b;
                    if ("tcf".equals(str2)) {
                        b5.o(g13, EnumC0984h.TCF);
                    } else if ("app".equals(str2)) {
                        b5.o(g13, enumC0984h7);
                    } else {
                        b5.o(g13, enumC0984h6);
                    }
                } else {
                    Boolean boolW = c0970c0.w();
                    if (boolW == null || ((boolW.booleanValue() && c0886u1.v() != 1) || !(boolW.booleanValue() || c0886u1.v() == 0))) {
                        b5.o(g13, enumC0984h7);
                    } else {
                        b5.o(g13, enumC0984h6);
                    }
                }
            }
        } else {
            int iF = F(c0970c0.D(), b5);
            C0881t1 c0881t1A = C0886u1.A();
            c0881t1A.b();
            ((C0886u1) c0881t1A.f14329s).C("_npa");
            e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0881t1A.b();
            ((C0886u1) c0881t1A.f14329s).B(jCurrentTimeMillis);
            c0881t1A.b();
            ((C0886u1) c0881t1A.f14329s).F(iF);
            C0886u1 c0886u2 = (C0886u1) c0881t1A.e();
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).d0(c0886u2);
            b().f17178E.c("non_personalized_ads(_npa)", Integer.valueOf(iF), "Setting user property");
        }
        String string = b5.toString();
        c0837k1.b();
        ((C0842l1) c0837k1.f14329s).e1(string);
        String strD3 = c0970c0.D();
        C1003n0 c1003n0 = this.f17104r;
        c1003n0.o();
        c1003n0.u(strD3);
        com.google.android.gms.internal.measurement.C0 c0J = c1003n0.J(strD3);
        boolean z10 = c0J == null || !c0J.s() || c0J.t();
        List listU = c0837k1.U();
        for (int i16 = 0; i16 < listU.size(); i16++) {
            if ("_tcf".equals(((C0802d1) listU.get(i16)).s())) {
                C0797c1 c0797c1 = (C0797c1) ((C0802d1) listU.get(i16)).i();
                List listH = c0797c1.h();
                for (int i17 = 0; i17 < listH.size(); i17++) {
                    if ("_tcfd".equals(((C0817g1) listH.get(i17)).q())) {
                        String strS = ((C0817g1) listH.get(i17)).s();
                        if (z10 && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i18 = 1;
                            while (true) {
                                if (i18 >= 64) {
                                    i18 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18)) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18 | 1);
                            strS = String.valueOf(charArray);
                        }
                        C0812f1 c0812f1B = C0817g1.B();
                        c0812f1B.h("_tcfd");
                        c0812f1B.i(strS);
                        c0797c1.b();
                        ((C0802d1) c0797c1.f14329s).A(i17, (C0817g1) c0812f1B.e());
                        break;
                    }
                }
                c0837k1.W(i16, c0797c1);
                return;
            }
        }
    }

    public final void m0(X1 x9) throws Throwable {
        c().o();
        l0();
        String str = x9.f17204r;
        U6.y.c(str);
        H0 h0C = H0.c(x9.f17201O, x9.f17196J);
        a(str);
        b().f17178E.c(str, h0C, "Setting storage consent for package");
        c().o();
        l0();
        this.S.put(str, h0C);
        C0999m c0999m = this.f17106t;
        U(c0999m);
        c0999m.J(str, h0C);
    }

    public final void n(C0970c0 c0970c0, C0837k1 c0837k1) {
        Serializable serializableD;
        c().o();
        l0();
        com.google.android.gms.internal.measurement.N0 n0O = com.google.android.gms.internal.measurement.Q0.O();
        C1023u0 c1023u0 = c0970c0.f17292a;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        byte[] bArr = c0970c0.f17283H;
        if (bArr != null) {
            try {
                n0O = (com.google.android.gms.internal.measurement.N0) C0967b0.b0(n0O, bArr);
            } catch (C0872r2 unused) {
                b().f17185z.b(X.w(c0970c0.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = c0837k1.U().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0802d1 c0802d1 = (C0802d1) it.next();
            if (c0802d1.s().equals("_cmp")) {
                C0817g1 c0817g1W = C0967b0.w(c0802d1, "gclid");
                Serializable serializableD2 = c0817g1W == null ? null : C0967b0.D(c0817g1W);
                if (serializableD2 == null) {
                    serializableD2 = "";
                }
                String str = (String) serializableD2;
                C0817g1 c0817g1W2 = C0967b0.w(c0802d1, "gbraid");
                Serializable serializableD3 = c0817g1W2 == null ? null : C0967b0.D(c0817g1W2);
                if (serializableD3 == null) {
                    serializableD3 = "";
                }
                String str2 = (String) serializableD3;
                C0817g1 c0817g1W3 = C0967b0.w(c0802d1, "gad_source");
                Serializable serializableD4 = c0817g1W3 == null ? null : C0967b0.D(c0817g1W3);
                String str3 = (String) (serializableD4 != null ? serializableD4 : "");
                String[] strArrSplit = ((String) G.f16949h1.a(null)).split(",");
                j0();
                HashMap map = new HashMap();
                for (C0817g1 c0817g1 : c0802d1.p()) {
                    if (Arrays.asList(strArrSplit).contains(c0817g1.q()) && (serializableD = C0967b0.D(c0817g1)) != null) {
                        map.put(c0817g1.q(), serializableD);
                    }
                }
                if (!map.isEmpty()) {
                    C0817g1 c0817g1W4 = C0967b0.w(c0802d1, "click_timestamp");
                    Serializable serializableD5 = c0817g1W4 == null ? null : C0967b0.D(c0817g1W4);
                    long jLongValue = ((Long) (serializableD5 != null ? serializableD5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = c0802d1.u();
                    }
                    C0817g1 c0817g1W5 = C0967b0.w(c0802d1, "_cis");
                    if ("referrer API v2".equals(c0817g1W5 != null ? C0967b0.D(c0817g1W5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).N()) {
                            if (str.isEmpty()) {
                                n0O.b();
                                ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).q();
                            } else {
                                n0O.b();
                                ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).p(str);
                            }
                            if (str2.isEmpty()) {
                                n0O.b();
                                ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).s();
                            } else {
                                n0O.b();
                                ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).r(str2);
                            }
                            if (str3.isEmpty()) {
                                n0O.b();
                                ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).u();
                            } else {
                                n0O.b();
                                ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).t(str3);
                            }
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).v(jLongValue);
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).x().clear();
                            HashMap mapG = G(c0802d1);
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).x().putAll(mapG);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).F()) {
                        if (str.isEmpty()) {
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).R();
                        } else {
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).Q(str);
                        }
                        if (str2.isEmpty()) {
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).T();
                        } else {
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).S(str2);
                        }
                        if (str3.isEmpty()) {
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).V();
                        } else {
                            n0O.b();
                            ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).U(str3);
                        }
                        n0O.b();
                        ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).W(jLongValue);
                        n0O.b();
                        ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).w().clear();
                        HashMap mapG2 = G(c0802d1);
                        n0O.b();
                        ((com.google.android.gms.internal.measurement.Q0) n0O.f14329s).w().putAll(mapG2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.Q0) n0O.e()).equals(com.google.android.gms.internal.measurement.Q0.P())) {
            com.google.android.gms.internal.measurement.Q0 q10 = (com.google.android.gms.internal.measurement.Q0) n0O.e();
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).k1(q10);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.Q0) n0O.e()).a();
        C1014r0 c1014r1 = c1023u0.f17585x;
        C1023u0.m(c1014r1);
        c1014r1.o();
        c0970c0.Q |= c0970c0.f17283H != bArrA;
        c0970c0.f17283H = bArrA;
        if (c0970c0.o()) {
            C0999m c0999m = this.f17106t;
            U(c0999m);
            c0999m.r0(c0970c0, false);
        }
        if (e0().y(null, G.f16946g1)) {
            C0999m c0999m2 = this.f17106t;
            U(c0999m2);
            c0999m2.g0(c0970c0.D(), "_lgclid");
        }
    }

    public final void n0(X1 x9) throws Throwable {
        c().o();
        l0();
        String str = x9.f17204r;
        U6.y.c(str);
        C1005o c1005oB = C1005o.b(x9.f17202P);
        b().f17178E.c(str, c1005oB, "Setting DMA consent for package");
        c().o();
        l0();
        E0 e0A = C1005o.c(100, p0(str)).a();
        this.T.put(str, c1005oB);
        C0999m c0999m = this.f17106t;
        U(c0999m);
        U6.y.f(str);
        U6.y.f(c1005oB);
        c0999m.o();
        c0999m.p();
        H0 h0H = c0999m.H(str);
        H0 h7 = H0.f16998c;
        if (h0H == h7) {
            c0999m.J(str, h7);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c1005oB.f17491b);
        c0999m.L(contentValues);
        E0 e0A2 = C1005o.c(100, p0(str)).a();
        c().o();
        l0();
        E0 e10 = E0.f16865v;
        E0 e11 = E0.f16864u;
        boolean z10 = e0A == e11 && e0A2 == e10;
        boolean z11 = e0A == e10 && e0A2 == e11;
        if (z10 || z11) {
            b().f17178E.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            C0999m c0999m2 = this.f17106t;
            U(c0999m2);
            if (c0999m2.s0(g(), str, false, false, false, false).f17422f < e0().w(str, G.f16964n0)) {
                bundle.putLong("_r", 1L);
                C0999m c0999m3 = this.f17106t;
                U(c0999m3);
                b().f17178E.c(str, Long.valueOf(c0999m3.s0(g(), str, false, false, true, false).f17422f), "_dcu realtime event count");
            }
            this.f17103a0.a(str, "_dcu", bundle);
        }
    }

    public final String o(H0 h7) {
        if (!h7.i(G0.f16990t)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().n0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final C1005o o0(String str) {
        c().o();
        l0();
        HashMap map = this.T;
        C1005o c1005o = (C1005o) map.get(str);
        if (c1005o != null) {
            return c1005o;
        }
        C0999m c0999m = this.f17106t;
        U(c0999m);
        U6.y.f(str);
        c0999m.o();
        c0999m.p();
        C1005o c1005oB = C1005o.b(c0999m.K("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, c1005oB);
        return c1005oB;
    }

    public final void p(ArrayList arrayList) {
        U6.y.a(!arrayList.isEmpty());
        if (this.f17097P != null) {
            b().f17182w.a("Set uploading progress before finishing the previous upload");
        } else {
            this.f17097P = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle p0(String str) throws Throwable {
        c().o();
        l0();
        C1003n0 c1003n0 = this.f17104r;
        U(c1003n0);
        if (c1003n0.J(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        H0 h0A = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = h0A.f16999a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((E0) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((G0) entry.getKey()).f16994r, str2);
            }
        }
        bundle.putAll(bundle2);
        C1005o c1005oQ0 = q0(str, o0(str), h0A, new Z0.B(11));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : c1005oQ0.f17494e.entrySet()) {
            int iOrdinal2 = ((E0) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((G0) entry2.getKey()).f16994r, str3);
            }
        }
        Boolean bool = c1005oQ0.f17492c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = c1005oQ0.f17493d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        C0999m c0999m = this.f17106t;
        U(c0999m);
        T1 t1I0 = c0999m.i0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (t1I0 != null ? t1I0.f17147e.equals(1L) : F(str, new Z0.B(11))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [i7.Q1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
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
    public final void q() {
        SQLiteException e10;
        C0970c0 c0970c0Q0;
        c().o();
        l0();
        this.f17094M = true;
        try {
            C1023u0 c1023u0 = this.f17084C;
            c1023u0.getClass();
            Boolean bool = c1023u0.p().f17553v;
            if (bool == null) {
                b().f17185z.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f17182w.a("Upload called in the client side when service should be used");
            } else if (this.f17087F > 0) {
                N();
            } else {
                c().o();
                if (this.f17097P != null) {
                    b().f17178E.a("Uploading requested multiple times");
                } else {
                    C0967b0 c0967b0 = this.f17105s;
                    U(c0967b0);
                    if (c0967b0.I()) {
                        e().getClass();
                        ?? CurrentTimeMillis = System.currentTimeMillis();
                        ?? r10 = 0;
                        cursorRawQuery = null;
                        Cursor cursorRawQuery = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iW = e0().w(null, G.f16953j0);
                        e0();
                        long jLongValue = CurrentTimeMillis - ((Long) G.f16939e.a(null)).longValue();
                        for (int i10 = 0; i10 < iW && I(jLongValue, null); i10++) {
                        }
                        R3.a();
                        c().o();
                        H();
                        long jA = this.f17112z.f17625y.a();
                        if (jA != 0) {
                            b().f17177D.b(Long.valueOf(Math.abs(CurrentTimeMillis - jA)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        C0999m c0999m = this.f17106t;
                        U(c0999m);
                        String strW = c0999m.w();
                        long j = -1;
                        if (TextUtils.isEmpty(strW)) {
                            try {
                                this.R = -1L;
                                C0999m c0999m2 = this.f17106t;
                                U(c0999m2);
                                e0();
                                long jLongValue2 = CurrentTimeMillis - ((Long) G.f16939e.a(null)).longValue();
                                c0999m2.o();
                                c0999m2.p();
                                try {
                                    CurrentTimeMillis = c0999m2.d0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                    try {
                                        if (CurrentTimeMillis.moveToFirst()) {
                                            string = CurrentTimeMillis.getString(0);
                                        } else {
                                            X x9 = ((C1023u0) c0999m2.f16104r).f17584w;
                                            C1023u0.m(x9);
                                            x9.f17178E.a("No expired configs for apps with pending events");
                                        }
                                    } catch (SQLiteException e11) {
                                        e10 = e11;
                                        X x10 = ((C1023u0) c0999m2.f16104r).f17584w;
                                        C1023u0.m(x10);
                                        x10.f17182w.b(e10, "Error selecting expired configs");
                                        if (CurrentTimeMillis != 0) {
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            C0999m c0999m3 = this.f17106t;
                                            U(c0999m3);
                                            c0970c0Q0 = c0999m3.q0(string);
                                            if (c0970c0Q0 != null) {
                                                z(c0970c0Q0);
                                            }
                                        }
                                        this.f17094M = false;
                                        O();
                                    }
                                } catch (SQLiteException e12) {
                                    e10 = e12;
                                    CurrentTimeMillis = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    throw th;
                                }
                                CurrentTimeMillis.close();
                                if (!TextUtils.isEmpty(string)) {
                                    C0999m c0999m4 = this.f17106t;
                                    U(c0999m4);
                                    c0970c0Q0 = c0999m4.q0(string);
                                    if (c0970c0Q0 != null) {
                                        z(c0970c0Q0);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = CurrentTimeMillis;
                            }
                        } else {
                            if (this.R == -1) {
                                C0999m c0999m5 = this.f17106t;
                                U(c0999m5);
                                try {
                                    try {
                                        cursorRawQuery = c0999m5.d0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(0);
                                        }
                                    } catch (Throwable th3) {
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        throw th3;
                                    }
                                } catch (SQLiteException e13) {
                                    X x11 = ((C1023u0) c0999m5.f16104r).f17584w;
                                    C1023u0.m(x11);
                                    x11.f17182w.b(e13, "Error querying raw events");
                                    if (cursorRawQuery != null) {
                                    }
                                    this.R = j;
                                    r(CurrentTimeMillis, strW);
                                    this.f17094M = false;
                                    O();
                                }
                                cursorRawQuery.close();
                                this.R = j;
                            }
                            r(CurrentTimeMillis, strW);
                        }
                    } else {
                        b().f17178E.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.f17094M = false;
            O();
        } catch (Throwable th4) {
            this.f17094M = false;
            O();
            throw th4;
        }
    }

    public final C1005o q0(String str, C1005o c1005o, H0 h7, Z0.B b5) throws Throwable {
        G0 g0Z;
        E0 e0S;
        C1003n0 c1003n0 = this.f17104r;
        U(c1003n0);
        com.google.android.gms.internal.measurement.C0 c0J = c1003n0.J(str);
        int i10 = 90;
        E0 e10 = E0.f16864u;
        G0 g10 = G0.f16991u;
        if (c0J == null) {
            if (c1005o.a() == e10) {
                i10 = c1005o.f17490a;
                b5.n(g10, i10);
            } else {
                b5.o(g10, EnumC0984h.FAILSAFE);
            }
            return new C1005o(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        E0 e0A = c1005o.a();
        E0 e11 = E0.f16865v;
        if (e0A == e11 || e0A == e10) {
            i10 = c1005o.f17490a;
            b5.n(g10, i10);
        } else {
            E0 e12 = E0.f16863t;
            E0 e13 = E0.f16862s;
            if (e0A != e12 || (e0S = c1003n0.s(str, g10)) == e13) {
                c1003n0.o();
                c1003n0.u(str);
                com.google.android.gms.internal.measurement.C0 c0J2 = c1003n0.J(str);
                if (c0J2 != null) {
                    Iterator it = c0J2.q().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            g0Z = null;
                            break;
                        }
                        com.google.android.gms.internal.measurement.A0 a9 = (com.google.android.gms.internal.measurement.A0) it.next();
                        if (g10 == C1003n0.z(a9.p())) {
                            g0Z = C1003n0.z(a9.q());
                            break;
                        }
                    }
                } else {
                    g0Z = null;
                    break;
                }
                EnumMap enumMap = h7.f16999a;
                G0 g11 = G0.f16989s;
                E0 e14 = (E0) enumMap.get(g11);
                if (e14 != null) {
                    e13 = e14;
                }
                boolean z10 = e13 == e11 || e13 == e10;
                if (g0Z == g11 && z10) {
                    b5.o(g10, EnumC0984h.REMOTE_DELEGATION);
                    e0A = e13;
                } else {
                    b5.o(g10, EnumC0984h.REMOTE_DEFAULT);
                    e0A = true != c1003n0.I(str, g10) ? e10 : e11;
                }
            } else {
                b5.o(g10, EnumC0984h.REMOTE_ENFORCED_DEFAULT);
                e0A = e0S;
            }
        }
        c1003n0.o();
        c1003n0.u(str);
        com.google.android.gms.internal.measurement.C0 c0J3 = c1003n0.J(str);
        boolean z11 = c0J3 == null || !c0J3.s() || c0J3.t();
        U(c1003n0);
        c1003n0.o();
        c1003n0.u(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.C0 c0J4 = c1003n0.J(str);
        if (c0J4 != null) {
            Iterator it2 = c0J4.r().iterator();
            while (it2.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.B0) it2.next()).p());
            }
        }
        if (e0A == e10 || treeSet.isEmpty()) {
            return new C1005o(Boolean.FALSE, i10, Boolean.valueOf(z11), "-");
        }
        return new C1005o(Boolean.TRUE, i10, Boolean.valueOf(z11), z11 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0266  */
    /* JADX WARN: Code duplicated, block: B:145:0x0383  */
    /* JADX WARN: Code duplicated, block: B:150:0x03db  */
    /* JADX WARN: Code duplicated, block: B:175:0x045f A[LOOP:10: B:151:0x03dd->B:175:0x045f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0465  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r11 r24
      0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v55 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v57 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r24v19 long) = (r24v2 long), (r24v20 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x049b  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:193:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x050d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0526  */
    /* JADX WARN: Code duplicated, block: B:206:0x0529  */
    /* JADX WARN: Code duplicated, block: B:208:0x052f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0531  */
    /* JADX WARN: Code duplicated, block: B:210:0x0533  */
    /* JADX WARN: Code duplicated, block: B:211:0x0535  */
    /* JADX WARN: Code duplicated, block: B:212:0x0537  */
    /* JADX WARN: Code duplicated, block: B:213:0x053c  */
    /* JADX WARN: Code duplicated, block: B:216:0x054c  */
    /* JADX WARN: Code duplicated, block: B:218:0x054f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0551  */
    /* JADX WARN: Code duplicated, block: B:224:0x058a  */
    /* JADX WARN: Code duplicated, block: B:226:0x058e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0597  */
    /* JADX WARN: Code duplicated, block: B:233:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:236:0x05af  */
    /* JADX WARN: Code duplicated, block: B:241:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:244:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:247:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:251:0x05fb A[EDGE_INSN: B:251:0x05fb->B:252:0x05fc BREAK  A[LOOP:3: B:242:0x05cc->B:250:0x05f8]] */
    /* JADX WARN: Code duplicated, block: B:254:0x0617  */
    /* JADX WARN: Code duplicated, block: B:257:0x0623  */
    /* JADX WARN: Code duplicated, block: B:261:0x0652  */
    /* JADX WARN: Code duplicated, block: B:263:0x0693  */
    /* JADX WARN: Code duplicated, block: B:265:0x069f  */
    /* JADX WARN: Code duplicated, block: B:267:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:270:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:272:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:275:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:278:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:279:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:283:0x071c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0744  */
    /* JADX WARN: Code duplicated, block: B:291:0x0759  */
    /* JADX WARN: Code duplicated, block: B:294:0x076c  */
    /* JADX WARN: Code duplicated, block: B:299:0x078a  */
    /* JADX WARN: Code duplicated, block: B:301:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:305:0x07af  */
    /* JADX WARN: Code duplicated, block: B:307:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:310:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:315:0x0803  */
    /* JADX WARN: Code duplicated, block: B:317:0x0811  */
    /* JADX WARN: Code duplicated, block: B:319:0x0822  */
    /* JADX WARN: Code duplicated, block: B:320:0x0824  */
    /* JADX WARN: Code duplicated, block: B:323:0x0829 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x082b  */
    /* JADX WARN: Code duplicated, block: B:325:0x082d  */
    /* JADX WARN: Code duplicated, block: B:326:0x0830  */
    /* JADX WARN: Code duplicated, block: B:330:0x0845  */
    /* JADX WARN: Code duplicated, block: B:336:0x0875  */
    /* JADX WARN: Code duplicated, block: B:339:0x088d  */
    /* JADX WARN: Code duplicated, block: B:343:0x08a3 A[LOOP:7: B:341:0x089d->B:343:0x08a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:347:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:350:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:353:0x0934 A[LOOP:8: B:351:0x092e->B:353:0x0934, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:356:0x0985  */
    /* JADX WARN: Code duplicated, block: B:358:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:360:0x09db  */
    /* JADX WARN: Code duplicated, block: B:362:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:365:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:367:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:370:0x0a06 A[LOOP:9: B:368:0x0a00->B:370:0x0a06, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:373:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:433:0x05c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:? A[LOOP:2: B:234:0x05a9->B:435:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x07f7 A[EDGE_INSN: B:438:0x07f7->B:313:0x07f7 BREAK  A[LOOP:4: B:259:0x064e->B:312:0x07e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x077b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x074e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0736 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x085a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x0851 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:? A[LOOP:6: B:328:0x083f->B:450:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x041e A[EDGE_INSN: B:454:0x041e->B:164:0x041e BREAK  A[LOOP:10: B:151:0x03dd->B:175:0x045f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r31v0, types: [i7.Q1] */
    public final void r(long j, String str) throws Throwable {
        ?? r14;
        long j10;
        Cursor cursorQuery;
        List list;
        List<Pair> list2;
        C0869q3 c0869q3;
        F f3;
        boolean zY;
        G0 g10;
        List list3;
        H0 h0A;
        G0 g11;
        int i10;
        List listSubList;
        C0827i1 c0827i1W;
        int size;
        ArrayList arrayList;
        int i11;
        boolean zI;
        boolean zI2;
        boolean zY2;
        N1 n6;
        M1 m1P;
        List list4;
        C1023u0 c1023u0;
        C0832j1 c0832j1;
        ArrayList arrayList2;
        EnumC0980f1 enumC0980f1;
        boolean z10;
        boolean z11;
        String str2;
        C0967b0 c0967b0;
        String strR;
        Iterator it;
        String string;
        C0827i1 c0827i1X;
        String strB;
        ArrayList arrayList3;
        Iterator it2;
        String strH;
        C0832j1 c0832j2;
        C0827i1 c0827i1;
        int i12;
        C0827i1 c0827i1W2;
        String strB2;
        boolean zIsEmpty;
        EnumC0980f1 enumC0980f2;
        EnumC0980f1 enumC0980f3;
        M1 m10;
        C0837k1 c0837k1;
        String strV;
        int i13;
        ArrayList arrayList4;
        Iterator it3;
        boolean z12;
        Long lValueOf;
        Long lValueOf2;
        boolean z13;
        boolean z14;
        int i14;
        List list5;
        boolean z15;
        C0802d1 c0802d1;
        C0817g1 c0817g1W;
        C0817g1 c0817g1W2;
        C0876s1 c0876s1B;
        Iterator it4;
        String strV2;
        int i15;
        C0842l1 c0842l1;
        C0842l1 c0842l2;
        List list6;
        boolean zIsEmpty2;
        ArrayList arrayList5;
        C1023u0 c1023u1;
        ArrayList arrayList6;
        Cursor cursor;
        C1023u0 c1023u2;
        List list7;
        Cursor cursorQuery2;
        List list8;
        List list9;
        Iterator it5;
        boolean z16;
        C0837k1 c0837k2;
        com.google.android.gms.internal.measurement.C0 c0J;
        ArrayList arrayList7;
        Iterator it6;
        int iP;
        Iterator it7;
        int i16;
        int i17;
        int iR;
        SQLiteDatabase sQLiteDatabaseD0;
        long jCurrentTimeMillis;
        List list10;
        C0999m c0999m;
        long jV;
        long jV2;
        String str3 = str;
        int iW = e0().w(str3, G.f16947h);
        int i18 = 0;
        int iMax = Math.max(0, e0().w(str3, G.f16950i));
        C0999m c0999mG0 = g0();
        C1023u0 c1023u3 = (C1023u0) c0999mG0.f16104r;
        c0999mG0.o();
        c0999mG0.p();
        int i19 = 1;
        U6.y.a(iW > 0);
        ?? r11 = iMax > 0 ? 1 : 0;
        U6.y.a(r11);
        U6.y.c(str3);
        try {
            try {
                try {
                    j10 = -1;
                    try {
                        cursorQuery = c0999mG0.d0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str3}, null, null, "rowid", String.valueOf(iW));
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList8 = new ArrayList();
                                int length = 0;
                                while (true) {
                                    long j11 = cursorQuery.getLong(i18);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i19);
                                        C0967b0 c0967b0J0 = c0999mG0.f17001s.j0();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[1024];
                                            c0999m = c0999mG0;
                                            while (true) {
                                                try {
                                                    int i20 = gZIPInputStream.read(bArr);
                                                    if (i20 <= 0) {
                                                        break;
                                                    }
                                                    c1023u3 = c1023u3;
                                                    try {
                                                        byteArrayOutputStream.write(bArr, 0, i20);
                                                        c1023u3 = c1023u3;
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                    }
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    c1023u3 = c1023u3;
                                                }
                                                try {
                                                    ((C1023u0) c0967b0J0.f16104r).b().s().b(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e12) {
                                                    e = e12;
                                                    c1023u3.b().s().c(X.w(str3), e, "Failed to unzip queued bundle. appId");
                                                    try {
                                                        if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        cursorQuery.close();
                                                        list2 = arrayList8;
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        c1023u3.b().s().c(X.w(str3), e, "Error querying bundles. appId");
                                                        list = Collections.EMPTY_LIST;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        list2 = list;
                                                    }
                                                    if (list2.isEmpty()) {
                                                        return;
                                                    }
                                                    c0869q3 = C0869q3.f14389s;
                                                    C0981g c0981gE0 = e0();
                                                    f3 = G.f16952i1;
                                                    zY = c0981gE0.y(null, f3);
                                                    g10 = G0.f16990t;
                                                    if (zY) {
                                                        if (!e0().y(null, f3)) {
                                                            list6 = list2;
                                                        } else if (a(str3).i(g10)) {
                                                            arrayList5 = new ArrayList(list2.size());
                                                            C0999m c0999mG1 = g0();
                                                            c1023u1 = (C1023u0) c0999mG1.f16104r;
                                                            U6.y.c(str3);
                                                            c0999mG1.o();
                                                            c0999mG1.p();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseD0 = c0999mG1.d0();
                                                            c1023u1.e().getClass();
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseD0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            c1023u2 = c1023u1;
                                                            if (cursorQuery2.moveToFirst()) {
                                                                list7 = list2;
                                                                while (true) {
                                                                    arrayList6.add((C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery2.getBlob(0))).e());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        cursorQuery2 = cursorQuery2;
                                                                        arrayList6 = arrayList6;
                                                                    }
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                V v10 = c1023u2.b().v();
                                                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb.append("Pruned ");
                                                                sb.append(iDelete);
                                                                sb.append(" NO_DATA mode events. appId");
                                                                v10.b(str3, sb.toString());
                                                                list10 = list7;
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                list10 = list2;
                                                                cursorQuery2.close();
                                                            }
                                                            list8 = arrayList6;
                                                            list9 = list10;
                                                            it5 = list9.iterator();
                                                            z16 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                c0837k2 = (C0837k1) ((C0842l1) pair.first).i();
                                                                if (z16) {
                                                                    List listU = c0837k2.U();
                                                                    c0837k2.b();
                                                                    ((C0842l1) c0837k2.f14329s).a0();
                                                                    c0837k2.b();
                                                                    ((C0842l1) c0837k2.f14329s).Z(list8);
                                                                    c0837k2.b();
                                                                    ((C0842l1) c0837k2.f14329s).Z(listU);
                                                                    z16 = false;
                                                                }
                                                                com.google.android.gms.internal.measurement.W0 w0Q = com.google.android.gms.internal.measurement.Z0.q();
                                                                c0J = f0().J(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (c0J != null) {
                                                                    it6 = c0J.p().iterator();
                                                                    while (it6.hasNext()) {
                                                                        C0910z0 c0910z0 = (C0910z0) it6.next();
                                                                        Iterator it8 = it5;
                                                                        com.google.android.gms.internal.measurement.X0 x0P = com.google.android.gms.internal.measurement.Y0.p();
                                                                        boolean z17 = z16;
                                                                        iP = c0910z0.p() - 1;
                                                                        List list11 = list8;
                                                                        if (iP != 1) {
                                                                            it7 = it6;
                                                                            i16 = 3;
                                                                            i17 = 2;
                                                                        } else if (iP != 2) {
                                                                            it7 = it6;
                                                                            i16 = 3;
                                                                            if (iP != 3) {
                                                                                i17 = 4;
                                                                            } else if (iP != 4) {
                                                                                i17 = 1;
                                                                            } else {
                                                                                i17 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i16 = 3;
                                                                            i17 = 3;
                                                                        }
                                                                        x0P.h(i17);
                                                                        iR = c0910z0.r() - 1;
                                                                        if (iR != 1) {
                                                                            i16 = 2;
                                                                        } else if (iR != 2) {
                                                                            i16 = 1;
                                                                        }
                                                                        x0P.i(i16);
                                                                        arrayList7.add((com.google.android.gms.internal.measurement.Y0) x0P.e());
                                                                        it5 = it8;
                                                                        list8 = list11;
                                                                        z16 = z17;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z18 = z16;
                                                                List list12 = list8;
                                                                w0Q.h(arrayList7);
                                                                c0837k2.E(w0Q);
                                                                arrayList5.add(Pair.create((C0842l1) c0837k2.e(), (Long) pair.second));
                                                                it5 = it9;
                                                                list8 = list12;
                                                                z16 = z18;
                                                            }
                                                            list6 = arrayList5;
                                                        } else {
                                                            arrayList5 = new ArrayList(list2.size());
                                                            C0999m c0999mG2 = g0();
                                                            c1023u1 = (C1023u0) c0999mG2.f16104r;
                                                            U6.y.c(str3);
                                                            c0999mG2.o();
                                                            c0999mG2.p();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    sQLiteDatabaseD0 = c0999mG2.d0();
                                                                    c1023u1.e().getClass();
                                                                    jCurrentTimeMillis = System.currentTimeMillis();
                                                                    cursorQuery2 = sQLiteDatabaseD0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                    c1023u2 = c1023u1;
                                                                    try {
                                                                        try {
                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                list7 = list2;
                                                                                while (true) {
                                                                                    try {
                                                                                        try {
                                                                                            arrayList6.add((C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery2.getBlob(0))).e());
                                                                                        } catch (SQLiteException e14) {
                                                                                            e = e14;
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            c1023u2.b().s().c(X.w(str3), e, "Error flushing NO_DATA mode events. appId");
                                                                                            list8 = Collections.EMPTY_LIST;
                                                                                            list9 = list7;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                                list9 = list7;
                                                                                            }
                                                                                            it5 = list9.iterator();
                                                                                            z16 = true;
                                                                                            while (it5.hasNext()) {
                                                                                                Pair pair2 = (Pair) it5.next();
                                                                                                c0837k2 = (C0837k1) ((C0842l1) pair2.first).i();
                                                                                                if (z16) {
                                                                                                    List listU2 = c0837k2.U();
                                                                                                    c0837k2.b();
                                                                                                    ((C0842l1) c0837k2.f14329s).a0();
                                                                                                    c0837k2.b();
                                                                                                    ((C0842l1) c0837k2.f14329s).Z(list8);
                                                                                                    c0837k2.b();
                                                                                                    ((C0842l1) c0837k2.f14329s).Z(listU2);
                                                                                                    z16 = false;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.W0 w0Q2 = com.google.android.gms.internal.measurement.Z0.q();
                                                                                                c0J = f0().J(str3);
                                                                                                arrayList7 = new ArrayList();
                                                                                                if (c0J != null) {
                                                                                                    it6 = c0J.p().iterator();
                                                                                                    while (it6.hasNext()) {
                                                                                                        C0910z0 c0910z1 = (C0910z0) it6.next();
                                                                                                        Iterator it10 = it5;
                                                                                                        com.google.android.gms.internal.measurement.X0 x0P2 = com.google.android.gms.internal.measurement.Y0.p();
                                                                                                        boolean z19 = z16;
                                                                                                        iP = c0910z1.p() - 1;
                                                                                                        List list13 = list8;
                                                                                                        if (iP != 1) {
                                                                                                            it7 = it6;
                                                                                                            i16 = 3;
                                                                                                            i17 = 2;
                                                                                                        } else if (iP != 2) {
                                                                                                            it7 = it6;
                                                                                                            i16 = 3;
                                                                                                            if (iP != 3) {
                                                                                                                i17 = 4;
                                                                                                            } else if (iP != 4) {
                                                                                                                i17 = 1;
                                                                                                            } else {
                                                                                                                i17 = 5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it7 = it6;
                                                                                                            i16 = 3;
                                                                                                            i17 = 3;
                                                                                                        }
                                                                                                        x0P2.h(i17);
                                                                                                        iR = c0910z1.r() - 1;
                                                                                                        if (iR != 1) {
                                                                                                            i16 = 2;
                                                                                                        } else if (iR != 2) {
                                                                                                            i16 = 1;
                                                                                                        }
                                                                                                        x0P2.i(i16);
                                                                                                        arrayList7.add((com.google.android.gms.internal.measurement.Y0) x0P2.e());
                                                                                                        it5 = it10;
                                                                                                        list8 = list13;
                                                                                                        z16 = z19;
                                                                                                        it6 = it7;
                                                                                                    }
                                                                                                }
                                                                                                Iterator it11 = it5;
                                                                                                boolean z110 = z16;
                                                                                                List list14 = list8;
                                                                                                w0Q2.h(arrayList7);
                                                                                                c0837k2.E(w0Q2);
                                                                                                arrayList5.add(Pair.create((C0842l1) c0837k2.e(), (Long) pair2.second));
                                                                                                it5 = it11;
                                                                                                list8 = list14;
                                                                                                z16 = z110;
                                                                                            }
                                                                                            list6 = arrayList5;
                                                                                            zIsEmpty2 = list6.isEmpty();
                                                                                            list3 = list6;
                                                                                            if (zIsEmpty2) {
                                                                                                return;
                                                                                            }
                                                                                            h0A = a(str3);
                                                                                            g11 = G0.f16989s;
                                                                                            if (h0A.i(g11)) {
                                                                                                i10 = 0;
                                                                                                listSubList = list3;
                                                                                                break;
                                                                                            }
                                                                                            it4 = list3.iterator();
                                                                                            while (true) {
                                                                                                if (it4.hasNext()) {
                                                                                                    strV2 = null;
                                                                                                    break;
                                                                                                }
                                                                                                c0842l2 = (C0842l1) ((Pair) it4.next()).first;
                                                                                                if (!c0842l2.v().isEmpty()) {
                                                                                                    strV2 = c0842l2.v();
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (strV2 != null) {
                                                                                                i10 = 0;
                                                                                                listSubList = list3;
                                                                                                break;
                                                                                            }
                                                                                            i15 = 0;
                                                                                            while (true) {
                                                                                                if (i15 < list3.size()) {
                                                                                                    i10 = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                c0842l1 = (C0842l1) ((Pair) list3.get(i15)).first;
                                                                                                if (!c0842l1.v().isEmpty()) {
                                                                                                    i10 = 0;
                                                                                                    listSubList = list3.subList(0, i15);
                                                                                                    break;
                                                                                                }
                                                                                                i15++;
                                                                                            }
                                                                                            c0827i1W = C0832j1.w();
                                                                                            size = listSubList.size();
                                                                                            arrayList = new ArrayList(listSubList.size());
                                                                                            if (e0().p(str3)) {
                                                                                                i11 = i10;
                                                                                            } else {
                                                                                                i11 = i10;
                                                                                            }
                                                                                            zI = a(str3).i(g11);
                                                                                            zI2 = a(str3).i(g10);
                                                                                            zY2 = e0().y(str3, G.f16908N0);
                                                                                            n6 = this.f17082A;
                                                                                            m1P = n6.p(str3);
                                                                                            list4 = listSubList;
                                                                                            while (true) {
                                                                                                c1023u0 = this.f17084C;
                                                                                                if (i10 < size) {
                                                                                                    break;
                                                                                                }
                                                                                                c0837k1 = (C0837k1) ((C0842l1) ((Pair) list4.get(i10)).first).i();
                                                                                                int i21 = i10;
                                                                                                arrayList.add((Long) ((Pair) list4.get(i10)).second);
                                                                                                e0().t();
                                                                                                c0837k1.s();
                                                                                                c0837k1.b();
                                                                                                ((C0842l1) c0837k1.f14329s).f0(j);
                                                                                                c1023u0.getClass();
                                                                                                c0837k1.I();
                                                                                                if (i11 == 0) {
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).S0();
                                                                                                }
                                                                                                if (!zI) {
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).z1();
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).B1();
                                                                                                }
                                                                                                if (!zI2) {
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).D1();
                                                                                                }
                                                                                                v(c0837k1, str3);
                                                                                                if (!zY2) {
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).Z0();
                                                                                                }
                                                                                                if (!zI2) {
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).L1();
                                                                                                }
                                                                                                strV = ((C0842l1) c0837k1.f14329s).v();
                                                                                                if (TextUtils.isEmpty(strV)) {
                                                                                                    i13 = size;
                                                                                                } else {
                                                                                                    i13 = size;
                                                                                                    if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                                                                                        z12 = zI2;
                                                                                                        i14 = i11;
                                                                                                        list5 = list4;
                                                                                                        z15 = zY2;
                                                                                                    }
                                                                                                    if (c0837k1.V() != 0) {
                                                                                                        if (e0().y(str3, G.f16889D0)) {
                                                                                                            c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                                                                                                        }
                                                                                                        c0876s1B = m1P.b();
                                                                                                        if (c0876s1B != null) {
                                                                                                            c0837k1.B(c0876s1B);
                                                                                                        }
                                                                                                        c0827i1W.b();
                                                                                                        ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                                                                                                    }
                                                                                                    i10 = i21 + 1;
                                                                                                    size = i13;
                                                                                                    zI2 = z12;
                                                                                                    list4 = list5;
                                                                                                    i11 = i14;
                                                                                                    zY2 = z15;
                                                                                                }
                                                                                                arrayList4 = new ArrayList(c0837k1.U());
                                                                                                it3 = arrayList4.iterator();
                                                                                                z12 = zI2;
                                                                                                lValueOf = null;
                                                                                                lValueOf2 = null;
                                                                                                z13 = false;
                                                                                                z14 = false;
                                                                                                while (it3.hasNext()) {
                                                                                                    i11 = i11;
                                                                                                    c0802d1 = (C0802d1) it3.next();
                                                                                                    list4 = list4;
                                                                                                    zY2 = zY2;
                                                                                                    if ("_fx".equals(c0802d1.s())) {
                                                                                                        it3.remove();
                                                                                                        z13 = true;
                                                                                                    } else if ("_f".equals(c0802d1.s())) {
                                                                                                        j0();
                                                                                                        c0817g1W = C0967b0.w(c0802d1, "_pfo");
                                                                                                        if (c0817g1W != null) {
                                                                                                            lValueOf = Long.valueOf(c0817g1W.u());
                                                                                                        }
                                                                                                        j0();
                                                                                                        c0817g1W2 = C0967b0.w(c0802d1, "_uwa");
                                                                                                        if (c0817g1W2 != null) {
                                                                                                            lValueOf2 = Long.valueOf(c0817g1W2.u());
                                                                                                        }
                                                                                                    } else {
                                                                                                        list4 = list4;
                                                                                                        i11 = i11;
                                                                                                        zY2 = zY2;
                                                                                                    }
                                                                                                    z14 = true;
                                                                                                }
                                                                                                i14 = i11;
                                                                                                list5 = list4;
                                                                                                z15 = zY2;
                                                                                                if (z13) {
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).a0();
                                                                                                    c0837k1.b();
                                                                                                    ((C0842l1) c0837k1.f14329s).Z(arrayList4);
                                                                                                }
                                                                                                if (z14) {
                                                                                                    u(c0837k1.o(), true, lValueOf, lValueOf2);
                                                                                                }
                                                                                                if (c0837k1.V() != 0) {
                                                                                                    if (e0().y(str3, G.f16889D0)) {
                                                                                                        c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                                                                                                    }
                                                                                                    c0876s1B = m1P.b();
                                                                                                    if (c0876s1B != null) {
                                                                                                        c0837k1.B(c0876s1B);
                                                                                                    }
                                                                                                    c0827i1W.b();
                                                                                                    ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                                                                                                }
                                                                                                i10 = i21 + 1;
                                                                                                size = i13;
                                                                                                zI2 = z12;
                                                                                                list4 = list5;
                                                                                                i11 = i14;
                                                                                                zY2 = z15;
                                                                                            }
                                                                                            if (((C0832j1) c0827i1W.f14329s).q() == 0) {
                                                                                                p(arrayList);
                                                                                                y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                                                                return;
                                                                                            }
                                                                                            c0832j1 = (C0832j1) c0827i1W.e();
                                                                                            arrayList2 = new ArrayList();
                                                                                            enumC0980f1 = m1P.f17034c;
                                                                                            if (enumC0980f1 == EnumC0980f1.SGTM_CLIENT) {
                                                                                                z10 = true;
                                                                                            } else {
                                                                                                z10 = false;
                                                                                            }
                                                                                            if (enumC0980f1 != EnumC0980f1.SGTM) {
                                                                                                if (z10) {
                                                                                                    z11 = true;
                                                                                                } else {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                c0967b0 = this.f17105s;
                                                                                                U(c0967b0);
                                                                                                if (c0967b0.I()) {
                                                                                                    if (Log.isLoggable(b().y(), 2)) {
                                                                                                        strR = j0().R(c0832j1);
                                                                                                    } else {
                                                                                                        strR = str2;
                                                                                                    }
                                                                                                    j0();
                                                                                                    byte[] bArrA = c0832j1.a();
                                                                                                    p(arrayList);
                                                                                                    this.f17112z.f17626z.b(j);
                                                                                                    b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA.length), strR);
                                                                                                    this.f17093L = true;
                                                                                                    U(c0967b0);
                                                                                                    c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            z11 = z10;
                                                                                            it = ((C0832j1) c0827i1W.e()).p().iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    if (((C0842l1) it.next()).N()) {
                                                                                                        string = UUID.randomUUID().toString();
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    string = null;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            C0832j1 c0832j3 = (C0832j1) c0827i1W.e();
                                                                                            c().o();
                                                                                            l0();
                                                                                            c0827i1X = C0832j1.x(c0832j3);
                                                                                            if (!TextUtils.isEmpty(string)) {
                                                                                                c0827i1X.b();
                                                                                                ((C0832j1) c0827i1X.f14329s).C(string);
                                                                                            }
                                                                                            strB = f0().B(str3);
                                                                                            if (!TextUtils.isEmpty(strB)) {
                                                                                                c0827i1X.i(strB);
                                                                                            }
                                                                                            arrayList3 = new ArrayList();
                                                                                            it2 = c0832j3.p().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                C0837k1 c0837k1V = C0842l1.V((C0842l1) it2.next());
                                                                                                c0837k1V.b();
                                                                                                ((C0842l1) c0837k1V.f14329s).S0();
                                                                                                arrayList3.add((C0842l1) c0837k1V.e());
                                                                                            }
                                                                                            c0827i1X.b();
                                                                                            ((C0832j1) c0827i1X.f14329s).B();
                                                                                            c0827i1X.b();
                                                                                            ((C0832j1) c0827i1X.f14329s).A(arrayList3);
                                                                                            V v11 = b().v();
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                strH = "null";
                                                                                            } else {
                                                                                                strH = c0827i1X.h();
                                                                                            }
                                                                                            v11.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                            c0832j2 = (C0832j1) c0827i1X.e();
                                                                                            if (TextUtils.isEmpty(string)) {
                                                                                                str2 = null;
                                                                                            } else {
                                                                                                C0832j1 c0832j4 = (C0832j1) c0827i1W.e();
                                                                                                c().o();
                                                                                                l0();
                                                                                                c0827i1W2 = C0832j1.w();
                                                                                                b().v().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                c0827i1W2.b();
                                                                                                ((C0832j1) c0827i1W2.f14329s).C(string);
                                                                                                for (C0842l1 c0842l3 : c0832j4.p()) {
                                                                                                    C0837k1 c0837k1U = C0842l1.U();
                                                                                                    String strO = c0842l3.O();
                                                                                                    c0837k1U.b();
                                                                                                    ((C0842l1) c0837k1U.f14329s).R0(strO);
                                                                                                    int iK0 = c0842l3.K0();
                                                                                                    c0837k1U.b();
                                                                                                    ((C0842l1) c0837k1U.f14329s).j1(iK0);
                                                                                                    c0827i1W2.b();
                                                                                                    ((C0832j1) c0827i1W2.f14329s).z((C0842l1) c0837k1U.e());
                                                                                                }
                                                                                                C0832j1 c0832j5 = (C0832j1) c0827i1W2.e();
                                                                                                strB2 = n6.f17001s.f0().B(str3);
                                                                                                zIsEmpty = TextUtils.isEmpty(strB2);
                                                                                                enumC0980f2 = EnumC0980f1.GOOGLE_SIGNAL;
                                                                                                enumC0980f3 = EnumC0980f1.GOOGLE_SIGNAL_PENDING;
                                                                                                if (zIsEmpty) {
                                                                                                    str2 = null;
                                                                                                    String str4 = (String) G.f16973s.a(null);
                                                                                                    if (z11) {
                                                                                                        enumC0980f2 = enumC0980f3;
                                                                                                    }
                                                                                                    m10 = new M1(str4, Collections.EMPTY_MAP, enumC0980f2, null);
                                                                                                } else {
                                                                                                    Uri uri = Uri.parse((String) G.f16973s.a(null));
                                                                                                    Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                    String authority = uri.getAuthority();
                                                                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strB2).length() + 1 + String.valueOf(authority).length());
                                                                                                    sb2.append(strB2);
                                                                                                    sb2.append(".");
                                                                                                    sb2.append(authority);
                                                                                                    builderBuildUpon.authority(sb2.toString());
                                                                                                    String string2 = builderBuildUpon.build().toString();
                                                                                                    if (z11) {
                                                                                                        enumC0980f2 = enumC0980f3;
                                                                                                    }
                                                                                                    str2 = null;
                                                                                                    m10 = new M1(string2, Collections.EMPTY_MAP, enumC0980f2, null);
                                                                                                }
                                                                                                arrayList2.add(Pair.create(c0832j5, m10));
                                                                                            }
                                                                                            if (z11) {
                                                                                                str3 = str;
                                                                                                c0832j1 = c0832j2;
                                                                                                c0967b0 = this.f17105s;
                                                                                                U(c0967b0);
                                                                                                if (c0967b0.I()) {
                                                                                                    if (Log.isLoggable(b().y(), 2)) {
                                                                                                        strR = j0().R(c0832j1);
                                                                                                    } else {
                                                                                                        strR = str2;
                                                                                                    }
                                                                                                    j0();
                                                                                                    byte[] bArrA2 = c0832j1.a();
                                                                                                    p(arrayList);
                                                                                                    this.f17112z.f17626z.b(j);
                                                                                                    b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA2.length), strR);
                                                                                                    this.f17093L = true;
                                                                                                    U(c0967b0);
                                                                                                    c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            c0827i1 = (C0827i1) c0832j2.i();
                                                                                            for (i12 = 0; i12 < c0832j2.q(); i12++) {
                                                                                                C0837k1 c0837k3 = (C0837k1) c0832j2.r(i12).i();
                                                                                                c0837k3.a0();
                                                                                                c0837k3.C(j);
                                                                                                c0827i1.b();
                                                                                                ((C0832j1) c0827i1.f14329s).y(i12, (C0842l1) c0837k3.e());
                                                                                            }
                                                                                            arrayList2.add(Pair.create((C0832j1) c0827i1.e(), m1P));
                                                                                            p(arrayList);
                                                                                            y(false, 204, null, null, str, arrayList2);
                                                                                            if (s(str, m1P.a())) {
                                                                                                b().v().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                Intent intent = new Intent();
                                                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                intent.setPackage(str);
                                                                                                S(c1023u0.d(), intent);
                                                                                            }
                                                                                        }
                                                                                    } catch (C0872r2 e15) {
                                                                                        c1023u2.b().f17175B.c(X.w(str3), e15, "Failed to parse stored NO_DATA mode event, appId");
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                break;
                                                                                            }
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            arrayList6 = arrayList6;
                                                                                        } catch (SQLiteException e16) {
                                                                                            e = e16;
                                                                                            c1023u2.b().s().c(X.w(str3), e, "Error flushing NO_DATA mode events. appId");
                                                                                            list8 = Collections.EMPTY_LIST;
                                                                                            list9 = list7;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                                list9 = list7;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th) {
                                                                                        th = th;
                                                                                        cursor = cursorQuery2;
                                                                                        if (cursor != null) {
                                                                                            cursor.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                cursorQuery2.close();
                                                                                try {
                                                                                    int iDelete2 = sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                                    V v12 = c1023u2.b().v();
                                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                    sb3.append("Pruned ");
                                                                                    sb3.append(iDelete2);
                                                                                    sb3.append(" NO_DATA mode events. appId");
                                                                                    v12.b(str3, sb3.toString());
                                                                                    list10 = list7;
                                                                                } catch (SQLiteException e17) {
                                                                                    e = e17;
                                                                                    cursorQuery2 = null;
                                                                                    c1023u2.b().s().c(X.w(str3), e, "Error flushing NO_DATA mode events. appId");
                                                                                    list8 = Collections.EMPTY_LIST;
                                                                                    list9 = list7;
                                                                                    if (cursorQuery2 != null) {
                                                                                        cursorQuery2.close();
                                                                                        list9 = list7;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                arrayList6 = arrayList6;
                                                                                list10 = list2;
                                                                                cursorQuery2.close();
                                                                            }
                                                                            list8 = arrayList6;
                                                                            list9 = list10;
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                            cursorQuery2 = cursorQuery2;
                                                                            list7 = list2;
                                                                        }
                                                                        it5 = list9.iterator();
                                                                        z16 = true;
                                                                        while (it5.hasNext()) {
                                                                            Pair pair3 = (Pair) it5.next();
                                                                            c0837k2 = (C0837k1) ((C0842l1) pair3.first).i();
                                                                            if (z16) {
                                                                                List listU3 = c0837k2.U();
                                                                                c0837k2.b();
                                                                                ((C0842l1) c0837k2.f14329s).a0();
                                                                                c0837k2.b();
                                                                                ((C0842l1) c0837k2.f14329s).Z(list8);
                                                                                c0837k2.b();
                                                                                ((C0842l1) c0837k2.f14329s).Z(listU3);
                                                                                z16 = false;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.W0 w0Q3 = com.google.android.gms.internal.measurement.Z0.q();
                                                                            c0J = f0().J(str3);
                                                                            arrayList7 = new ArrayList();
                                                                            if (c0J != null) {
                                                                                it6 = c0J.p().iterator();
                                                                                while (it6.hasNext()) {
                                                                                    C0910z0 c0910z2 = (C0910z0) it6.next();
                                                                                    Iterator it12 = it5;
                                                                                    com.google.android.gms.internal.measurement.X0 x0P3 = com.google.android.gms.internal.measurement.Y0.p();
                                                                                    boolean z111 = z16;
                                                                                    iP = c0910z2.p() - 1;
                                                                                    List list15 = list8;
                                                                                    if (iP != 1) {
                                                                                        it7 = it6;
                                                                                        i16 = 3;
                                                                                        i17 = 2;
                                                                                    } else if (iP != 2) {
                                                                                        it7 = it6;
                                                                                        i16 = 3;
                                                                                        if (iP != 3) {
                                                                                            i17 = 4;
                                                                                        } else if (iP != 4) {
                                                                                            i17 = 1;
                                                                                        } else {
                                                                                            i17 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        it7 = it6;
                                                                                        i16 = 3;
                                                                                        i17 = 3;
                                                                                    }
                                                                                    x0P3.h(i17);
                                                                                    iR = c0910z2.r() - 1;
                                                                                    if (iR != 1) {
                                                                                        i16 = 2;
                                                                                    } else if (iR != 2) {
                                                                                        i16 = 1;
                                                                                    }
                                                                                    x0P3.i(i16);
                                                                                    arrayList7.add((com.google.android.gms.internal.measurement.Y0) x0P3.e());
                                                                                    it5 = it12;
                                                                                    list8 = list15;
                                                                                    z16 = z111;
                                                                                    it6 = it7;
                                                                                }
                                                                            }
                                                                            Iterator it13 = it5;
                                                                            boolean z112 = z16;
                                                                            List list16 = list8;
                                                                            w0Q3.h(arrayList7);
                                                                            c0837k2.E(w0Q3);
                                                                            arrayList5.add(Pair.create((C0842l1) c0837k2.e(), (Long) pair3.second));
                                                                            it5 = it13;
                                                                            list8 = list16;
                                                                            z16 = z112;
                                                                        }
                                                                        list6 = arrayList5;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        cursorQuery2 = cursorQuery2;
                                                                        cursor = cursorQuery2;
                                                                        if (cursor != null) {
                                                                            cursor.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteException e19) {
                                                                    e = e19;
                                                                    c1023u2 = c1023u1;
                                                                    list7 = list2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor = null;
                                                                if (cursor != null) {
                                                                    cursor.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        zIsEmpty2 = list6.isEmpty();
                                                        list3 = list6;
                                                        if (zIsEmpty2) {
                                                            return;
                                                        }
                                                    } else {
                                                        list3 = list2;
                                                    }
                                                    h0A = a(str3);
                                                    g11 = G0.f16989s;
                                                    if (h0A.i(g11)) {
                                                        i10 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    it4 = list3.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            strV2 = null;
                                                            break;
                                                        }
                                                        c0842l2 = (C0842l1) ((Pair) it4.next()).first;
                                                        if (!c0842l2.v().isEmpty()) {
                                                            strV2 = c0842l2.v();
                                                            break;
                                                        }
                                                    }
                                                    if (strV2 != null) {
                                                        i10 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    i15 = 0;
                                                    while (true) {
                                                        if (i15 < list3.size()) {
                                                            i10 = 0;
                                                            listSubList = list3;
                                                            break;
                                                        }
                                                        c0842l1 = (C0842l1) ((Pair) list3.get(i15)).first;
                                                        if (!c0842l1.v().isEmpty()) {
                                                            i10 = 0;
                                                            listSubList = list3.subList(0, i15);
                                                            break;
                                                        }
                                                        i15++;
                                                    }
                                                    c0827i1W = C0832j1.w();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (e0().p(str3)) {
                                                        i11 = i10;
                                                    } else {
                                                        i11 = i10;
                                                    }
                                                    zI = a(str3).i(g11);
                                                    zI2 = a(str3).i(g10);
                                                    zY2 = e0().y(str3, G.f16908N0);
                                                    n6 = this.f17082A;
                                                    m1P = n6.p(str3);
                                                    list4 = listSubList;
                                                    while (true) {
                                                        c1023u0 = this.f17084C;
                                                        if (i10 < size) {
                                                            break;
                                                            break;
                                                        }
                                                        c0837k1 = (C0837k1) ((C0842l1) ((Pair) list4.get(i10)).first).i();
                                                        int i22 = i10;
                                                        arrayList.add((Long) ((Pair) list4.get(i10)).second);
                                                        e0().t();
                                                        c0837k1.s();
                                                        c0837k1.b();
                                                        ((C0842l1) c0837k1.f14329s).f0(j);
                                                        c1023u0.getClass();
                                                        c0837k1.I();
                                                        if (i11 == 0) {
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).S0();
                                                        }
                                                        if (!zI) {
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).z1();
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).B1();
                                                        }
                                                        if (!zI2) {
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).D1();
                                                        }
                                                        v(c0837k1, str3);
                                                        if (!zY2) {
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).Z0();
                                                        }
                                                        if (!zI2) {
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).L1();
                                                        }
                                                        strV = ((C0842l1) c0837k1.f14329s).v();
                                                        if (TextUtils.isEmpty(strV)) {
                                                            i13 = size;
                                                            if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                                                z12 = zI2;
                                                                i14 = i11;
                                                                list5 = list4;
                                                                z15 = zY2;
                                                            }
                                                            if (c0837k1.V() != 0) {
                                                                if (e0().y(str3, G.f16889D0)) {
                                                                    c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                                                                }
                                                                c0876s1B = m1P.b();
                                                                if (c0876s1B != null) {
                                                                    c0837k1.B(c0876s1B);
                                                                }
                                                                c0827i1W.b();
                                                                ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                                                            }
                                                            i10 = i22 + 1;
                                                            size = i13;
                                                            zI2 = z12;
                                                            list4 = list5;
                                                            i11 = i14;
                                                            zY2 = z15;
                                                        } else {
                                                            i13 = size;
                                                        }
                                                        arrayList4 = new ArrayList(c0837k1.U());
                                                        it3 = arrayList4.iterator();
                                                        z12 = zI2;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z13 = false;
                                                        z14 = false;
                                                        while (it3.hasNext()) {
                                                            i11 = i11;
                                                            c0802d1 = (C0802d1) it3.next();
                                                            list4 = list4;
                                                            zY2 = zY2;
                                                            if ("_fx".equals(c0802d1.s())) {
                                                                it3.remove();
                                                                z13 = true;
                                                            } else if ("_f".equals(c0802d1.s())) {
                                                                j0();
                                                                c0817g1W = C0967b0.w(c0802d1, "_pfo");
                                                                if (c0817g1W != null) {
                                                                    lValueOf = Long.valueOf(c0817g1W.u());
                                                                }
                                                                j0();
                                                                c0817g1W2 = C0967b0.w(c0802d1, "_uwa");
                                                                if (c0817g1W2 != null) {
                                                                    lValueOf2 = Long.valueOf(c0817g1W2.u());
                                                                }
                                                            } else {
                                                                list4 = list4;
                                                                i11 = i11;
                                                                zY2 = zY2;
                                                            }
                                                            z14 = true;
                                                        }
                                                        i14 = i11;
                                                        list5 = list4;
                                                        z15 = zY2;
                                                        if (z13) {
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).a0();
                                                            c0837k1.b();
                                                            ((C0842l1) c0837k1.f14329s).Z(arrayList4);
                                                        }
                                                        if (z14) {
                                                            u(c0837k1.o(), true, lValueOf, lValueOf2);
                                                        }
                                                        if (c0837k1.V() != 0) {
                                                            if (e0().y(str3, G.f16889D0)) {
                                                                c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                                                            }
                                                            c0876s1B = m1P.b();
                                                            if (c0876s1B != null) {
                                                                c0837k1.B(c0876s1B);
                                                            }
                                                            c0827i1W.b();
                                                            ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                                                        }
                                                        i10 = i22 + 1;
                                                        size = i13;
                                                        zI2 = z12;
                                                        list4 = list5;
                                                        i11 = i14;
                                                        zY2 = z15;
                                                    }
                                                    if (((C0832j1) c0827i1W.f14329s).q() == 0) {
                                                        p(arrayList);
                                                        y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                        return;
                                                    }
                                                    c0832j1 = (C0832j1) c0827i1W.e();
                                                    arrayList2 = new ArrayList();
                                                    enumC0980f1 = m1P.f17034c;
                                                    if (enumC0980f1 == EnumC0980f1.SGTM_CLIENT) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (enumC0980f1 != EnumC0980f1.SGTM) {
                                                        if (z10) {
                                                            z11 = true;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        c0967b0 = this.f17105s;
                                                        U(c0967b0);
                                                        if (c0967b0.I()) {
                                                            if (Log.isLoggable(b().y(), 2)) {
                                                                strR = j0().R(c0832j1);
                                                            } else {
                                                                strR = str2;
                                                            }
                                                            j0();
                                                            byte[] bArrA3 = c0832j1.a();
                                                            p(arrayList);
                                                            this.f17112z.f17626z.b(j);
                                                            b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA3.length), strR);
                                                            this.f17093L = true;
                                                            U(c0967b0);
                                                            c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    z11 = z10;
                                                    it = ((C0832j1) c0827i1W.e()).p().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((C0842l1) it.next()).N()) {
                                                                string = UUID.randomUUID().toString();
                                                                break;
                                                            }
                                                        } else {
                                                            string = null;
                                                            break;
                                                        }
                                                    }
                                                    C0832j1 c0832j6 = (C0832j1) c0827i1W.e();
                                                    c().o();
                                                    l0();
                                                    c0827i1X = C0832j1.x(c0832j6);
                                                    if (!TextUtils.isEmpty(string)) {
                                                        c0827i1X.b();
                                                        ((C0832j1) c0827i1X.f14329s).C(string);
                                                    }
                                                    strB = f0().B(str3);
                                                    if (!TextUtils.isEmpty(strB)) {
                                                        c0827i1X.i(strB);
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    it2 = c0832j6.p().iterator();
                                                    while (it2.hasNext()) {
                                                        C0837k1 c0837k1V2 = C0842l1.V((C0842l1) it2.next());
                                                        c0837k1V2.b();
                                                        ((C0842l1) c0837k1V2.f14329s).S0();
                                                        arrayList3.add((C0842l1) c0837k1V2.e());
                                                    }
                                                    c0827i1X.b();
                                                    ((C0832j1) c0827i1X.f14329s).B();
                                                    c0827i1X.b();
                                                    ((C0832j1) c0827i1X.f14329s).A(arrayList3);
                                                    V v13 = b().v();
                                                    if (TextUtils.isEmpty(string)) {
                                                        strH = "null";
                                                    } else {
                                                        strH = c0827i1X.h();
                                                    }
                                                    v13.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                    c0832j2 = (C0832j1) c0827i1X.e();
                                                    if (TextUtils.isEmpty(string)) {
                                                        C0832j1 c0832j7 = (C0832j1) c0827i1W.e();
                                                        c().o();
                                                        l0();
                                                        c0827i1W2 = C0832j1.w();
                                                        b().v().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                        c0827i1W2.b();
                                                        ((C0832j1) c0827i1W2.f14329s).C(string);
                                                        while (r0.hasNext()) {
                                                            C0837k1 c0837k1U2 = C0842l1.U();
                                                            String strO2 = c0842l3.O();
                                                            c0837k1U2.b();
                                                            ((C0842l1) c0837k1U2.f14329s).R0(strO2);
                                                            int iK1 = c0842l3.K0();
                                                            c0837k1U2.b();
                                                            ((C0842l1) c0837k1U2.f14329s).j1(iK1);
                                                            c0827i1W2.b();
                                                            ((C0832j1) c0827i1W2.f14329s).z((C0842l1) c0837k1U2.e());
                                                        }
                                                        C0832j1 c0832j8 = (C0832j1) c0827i1W2.e();
                                                        strB2 = n6.f17001s.f0().B(str3);
                                                        zIsEmpty = TextUtils.isEmpty(strB2);
                                                        enumC0980f2 = EnumC0980f1.GOOGLE_SIGNAL;
                                                        enumC0980f3 = EnumC0980f1.GOOGLE_SIGNAL_PENDING;
                                                        if (zIsEmpty) {
                                                            Uri uri2 = Uri.parse((String) G.f16973s.a(null));
                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                            String authority2 = uri2.getAuthority();
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(strB2).length() + 1 + String.valueOf(authority2).length());
                                                            sb4.append(strB2);
                                                            sb4.append(".");
                                                            sb4.append(authority2);
                                                            builderBuildUpon2.authority(sb4.toString());
                                                            String string3 = builderBuildUpon2.build().toString();
                                                            if (z11) {
                                                                enumC0980f2 = enumC0980f3;
                                                            }
                                                            str2 = null;
                                                            m10 = new M1(string3, Collections.EMPTY_MAP, enumC0980f2, null);
                                                        } else {
                                                            str2 = null;
                                                            String str5 = (String) G.f16973s.a(null);
                                                            if (z11) {
                                                                enumC0980f2 = enumC0980f3;
                                                            }
                                                            m10 = new M1(str5, Collections.EMPTY_MAP, enumC0980f2, null);
                                                        }
                                                        arrayList2.add(Pair.create(c0832j8, m10));
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (z11) {
                                                        str3 = str;
                                                        c0832j1 = c0832j2;
                                                        c0967b0 = this.f17105s;
                                                        U(c0967b0);
                                                        if (c0967b0.I()) {
                                                            if (Log.isLoggable(b().y(), 2)) {
                                                                strR = j0().R(c0832j1);
                                                            } else {
                                                                strR = str2;
                                                            }
                                                            j0();
                                                            byte[] bArrA4 = c0832j1.a();
                                                            p(arrayList);
                                                            this.f17112z.f17626z.b(j);
                                                            b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA4.length), strR);
                                                            this.f17093L = true;
                                                            U(c0967b0);
                                                            c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    c0827i1 = (C0827i1) c0832j2.i();
                                                    while (i12 < c0832j2.q()) {
                                                        C0837k1 c0837k4 = (C0837k1) c0832j2.r(i12).i();
                                                        c0837k4.a0();
                                                        c0837k4.C(j);
                                                        c0827i1.b();
                                                        ((C0832j1) c0827i1.f14329s).y(i12, (C0842l1) c0837k4.e());
                                                    }
                                                    arrayList2.add(Pair.create((C0832j1) c0827i1.e(), m1P));
                                                    p(arrayList);
                                                    y(false, 204, null, null, str, arrayList2);
                                                    if (s(str, m1P.a())) {
                                                        b().v().b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                        Intent intent2 = new Intent();
                                                        intent2.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                        intent2.setPackage(str);
                                                        S(c1023u0.d(), intent2);
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                C0837k1 c0837k5 = (C0837k1) C0967b0.b0(C0842l1.U(), byteArray);
                                                if (!arrayList8.isEmpty()) {
                                                    C0842l1 c0842l4 = (C0842l1) ((Pair) arrayList8.get(0)).first;
                                                    C0842l1 c0842l5 = (C0842l1) c0837k5.e();
                                                    if (!c0842l4.u0().equals(c0842l5.u0()) || !c0842l4.B0().equals(c0842l5.B0()) || c0842l4.D0() != c0842l5.D0() || !c0842l4.F0().equals(c0842l5.F0())) {
                                                        break;
                                                    }
                                                    Iterator it14 = c0842l4.U1().iterator();
                                                    while (true) {
                                                        if (!it14.hasNext()) {
                                                            jV = -1;
                                                            break;
                                                        }
                                                        C0886u1 c0886u1 = (C0886u1) it14.next();
                                                        Iterator it15 = it14;
                                                        if ("_npa".equals(c0886u1.r())) {
                                                            jV = c0886u1.v();
                                                            break;
                                                        }
                                                        it14 = it15;
                                                    }
                                                    Iterator it16 = c0842l5.U1().iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            jV2 = -1;
                                                            break;
                                                        }
                                                        C0886u1 c0886u2 = (C0886u1) it16.next();
                                                        if ("_npa".equals(c0886u2.r())) {
                                                            jV2 = c0886u2.v();
                                                            break;
                                                        }
                                                    }
                                                    if (jV != jV2) {
                                                        break;
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i23 = cursorQuery.getInt(2);
                                                    c0837k5.b();
                                                    ((C0842l1) c0837k5.f14329s).T0(i23);
                                                }
                                                length += byteArray.length;
                                                arrayList8.add(Pair.create((C0842l1) c0837k5.e(), Long.valueOf(j11)));
                                            } catch (IOException e20) {
                                                c1023u3.b().s().c(X.w(str3), e20, "Failed to merge queued bundle. appId");
                                            }
                                            c1023u3 = c1023u3;
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            }
                                            c0999mG0 = c0999m;
                                            c1023u3 = c1023u3;
                                            i18 = 0;
                                            i19 = 1;
                                        } catch (IOException e21) {
                                            e = e21;
                                            c0999m = c0999mG0;
                                        }
                                    } catch (IOException e22) {
                                        e = e22;
                                        c0999m = c0999mG0;
                                        c1023u3 = c1023u3;
                                    }
                                }
                                cursorQuery.close();
                                list2 = arrayList8;
                            } else {
                                list = Collections.EMPTY_LIST;
                                cursorQuery.close();
                                list2 = list;
                            }
                        } catch (SQLiteException e23) {
                            e = e23;
                            c1023u3 = c1023u3;
                        }
                    } catch (SQLiteException e24) {
                        e = e24;
                        cursorQuery = null;
                        c1023u3.b().s().c(X.w(str3), e, "Error querying bundles. appId");
                        list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        list2 = list;
                        if (list2.isEmpty()) {
                            return;
                        }
                        c0869q3 = C0869q3.f14389s;
                        C0981g c0981gE1 = e0();
                        f3 = G.f16952i1;
                        zY = c0981gE1.y(null, f3);
                        g10 = G0.f16990t;
                        if (zY) {
                            if (!e0().y(null, f3)) {
                                list6 = list2;
                            } else if (a(str3).i(g10)) {
                                arrayList5 = new ArrayList(list2.size());
                                C0999m c0999mG3 = g0();
                                c1023u1 = (C1023u0) c0999mG3.f16104r;
                                U6.y.c(str3);
                                c0999mG3.o();
                                c0999mG3.p();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseD0 = c0999mG3.d0();
                                c1023u1.e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseD0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                c1023u2 = c1023u1;
                                if (cursorQuery2.moveToFirst()) {
                                    list7 = list2;
                                    while (true) {
                                        arrayList6.add((C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    V v14 = c1023u2.b().v();
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb5.append("Pruned ");
                                    sb5.append(iDelete3);
                                    sb5.append(" NO_DATA mode events. appId");
                                    v14.b(str3, sb5.toString());
                                    list10 = list7;
                                } else {
                                    arrayList6 = arrayList6;
                                    list10 = list2;
                                    cursorQuery2.close();
                                }
                                list8 = arrayList6;
                                list9 = list10;
                                it5 = list9.iterator();
                                z16 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    c0837k2 = (C0837k1) ((C0842l1) pair4.first).i();
                                    if (z16) {
                                        List listU4 = c0837k2.U();
                                        c0837k2.b();
                                        ((C0842l1) c0837k2.f14329s).a0();
                                        c0837k2.b();
                                        ((C0842l1) c0837k2.f14329s).Z(list8);
                                        c0837k2.b();
                                        ((C0842l1) c0837k2.f14329s).Z(listU4);
                                        z16 = false;
                                    }
                                    com.google.android.gms.internal.measurement.W0 w0Q4 = com.google.android.gms.internal.measurement.Z0.q();
                                    c0J = f0().J(str3);
                                    arrayList7 = new ArrayList();
                                    if (c0J != null) {
                                        it6 = c0J.p().iterator();
                                        while (it6.hasNext()) {
                                            C0910z0 c0910z3 = (C0910z0) it6.next();
                                            Iterator it17 = it5;
                                            com.google.android.gms.internal.measurement.X0 x0P4 = com.google.android.gms.internal.measurement.Y0.p();
                                            boolean z113 = z16;
                                            iP = c0910z3.p() - 1;
                                            List list17 = list8;
                                            if (iP != 1) {
                                                it7 = it6;
                                                i16 = 3;
                                                i17 = 2;
                                            } else if (iP != 2) {
                                                it7 = it6;
                                                i16 = 3;
                                                if (iP != 3) {
                                                    i17 = 4;
                                                } else if (iP != 4) {
                                                    i17 = 1;
                                                } else {
                                                    i17 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i16 = 3;
                                                i17 = 3;
                                            }
                                            x0P4.h(i17);
                                            iR = c0910z3.r() - 1;
                                            if (iR != 1) {
                                                i16 = 2;
                                            } else if (iR != 2) {
                                                i16 = 1;
                                            }
                                            x0P4.i(i16);
                                            arrayList7.add((com.google.android.gms.internal.measurement.Y0) x0P4.e());
                                            it5 = it17;
                                            list8 = list17;
                                            z16 = z113;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it18 = it5;
                                    boolean z114 = z16;
                                    List list18 = list8;
                                    w0Q4.h(arrayList7);
                                    c0837k2.E(w0Q4);
                                    arrayList5.add(Pair.create((C0842l1) c0837k2.e(), (Long) pair4.second));
                                    it5 = it18;
                                    list8 = list18;
                                    z16 = z114;
                                }
                                list6 = arrayList5;
                            } else {
                                arrayList5 = new ArrayList(list2.size());
                                C0999m c0999mG4 = g0();
                                c1023u1 = (C1023u0) c0999mG4.f16104r;
                                U6.y.c(str3);
                                c0999mG4.o();
                                c0999mG4.p();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseD0 = c0999mG4.d0();
                                c1023u1.e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseD0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                c1023u2 = c1023u1;
                                if (cursorQuery2.moveToFirst()) {
                                    list7 = list2;
                                    while (true) {
                                        arrayList6.add((C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete4 = sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    V v15 = c1023u2.b().v();
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                    sb6.append("Pruned ");
                                    sb6.append(iDelete4);
                                    sb6.append(" NO_DATA mode events. appId");
                                    v15.b(str3, sb6.toString());
                                    list10 = list7;
                                } else {
                                    arrayList6 = arrayList6;
                                    list10 = list2;
                                    cursorQuery2.close();
                                }
                                list8 = arrayList6;
                                list9 = list10;
                                it5 = list9.iterator();
                                z16 = true;
                                while (it5.hasNext()) {
                                    Pair pair5 = (Pair) it5.next();
                                    c0837k2 = (C0837k1) ((C0842l1) pair5.first).i();
                                    if (z16) {
                                        List listU5 = c0837k2.U();
                                        c0837k2.b();
                                        ((C0842l1) c0837k2.f14329s).a0();
                                        c0837k2.b();
                                        ((C0842l1) c0837k2.f14329s).Z(list8);
                                        c0837k2.b();
                                        ((C0842l1) c0837k2.f14329s).Z(listU5);
                                        z16 = false;
                                    }
                                    com.google.android.gms.internal.measurement.W0 w0Q5 = com.google.android.gms.internal.measurement.Z0.q();
                                    c0J = f0().J(str3);
                                    arrayList7 = new ArrayList();
                                    if (c0J != null) {
                                        it6 = c0J.p().iterator();
                                        while (it6.hasNext()) {
                                            C0910z0 c0910z4 = (C0910z0) it6.next();
                                            Iterator it19 = it5;
                                            com.google.android.gms.internal.measurement.X0 x0P5 = com.google.android.gms.internal.measurement.Y0.p();
                                            boolean z115 = z16;
                                            iP = c0910z4.p() - 1;
                                            List list19 = list8;
                                            if (iP != 1) {
                                                it7 = it6;
                                                i16 = 3;
                                                i17 = 2;
                                            } else if (iP != 2) {
                                                it7 = it6;
                                                i16 = 3;
                                                if (iP != 3) {
                                                    i17 = 4;
                                                } else if (iP != 4) {
                                                    i17 = 1;
                                                } else {
                                                    i17 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i16 = 3;
                                                i17 = 3;
                                            }
                                            x0P5.h(i17);
                                            iR = c0910z4.r() - 1;
                                            if (iR != 1) {
                                                i16 = 2;
                                            } else if (iR != 2) {
                                                i16 = 1;
                                            }
                                            x0P5.i(i16);
                                            arrayList7.add((com.google.android.gms.internal.measurement.Y0) x0P5.e());
                                            it5 = it19;
                                            list8 = list19;
                                            z16 = z115;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it110 = it5;
                                    boolean z116 = z16;
                                    List list110 = list8;
                                    w0Q5.h(arrayList7);
                                    c0837k2.E(w0Q5);
                                    arrayList5.add(Pair.create((C0842l1) c0837k2.e(), (Long) pair5.second));
                                    it5 = it110;
                                    list8 = list110;
                                    z16 = z116;
                                }
                                list6 = arrayList5;
                            }
                            zIsEmpty2 = list6.isEmpty();
                            list3 = list6;
                            if (zIsEmpty2) {
                                return;
                            }
                        } else {
                            list3 = list2;
                        }
                        h0A = a(str3);
                        g11 = G0.f16989s;
                        if (h0A.i(g11)) {
                            i10 = 0;
                            listSubList = list3;
                            break;
                        }
                        it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                strV2 = null;
                                break;
                            }
                            c0842l2 = (C0842l1) ((Pair) it4.next()).first;
                            if (!c0842l2.v().isEmpty()) {
                                strV2 = c0842l2.v();
                                break;
                            }
                        }
                        if (strV2 != null) {
                            i10 = 0;
                            listSubList = list3;
                            break;
                        }
                        i15 = 0;
                        while (true) {
                            if (i15 < list3.size()) {
                                i10 = 0;
                                listSubList = list3;
                                break;
                            }
                            c0842l1 = (C0842l1) ((Pair) list3.get(i15)).first;
                            if (!c0842l1.v().isEmpty()) {
                                i10 = 0;
                                listSubList = list3.subList(0, i15);
                                break;
                            }
                            i15++;
                        }
                        c0827i1W = C0832j1.w();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (e0().p(str3)) {
                            i11 = i10;
                        } else {
                            i11 = i10;
                        }
                        zI = a(str3).i(g11);
                        zI2 = a(str3).i(g10);
                        zY2 = e0().y(str3, G.f16908N0);
                        n6 = this.f17082A;
                        m1P = n6.p(str3);
                        list4 = listSubList;
                        while (true) {
                            c1023u0 = this.f17084C;
                            if (i10 < size) {
                                break;
                                break;
                            }
                            c0837k1 = (C0837k1) ((C0842l1) ((Pair) list4.get(i10)).first).i();
                            int i24 = i10;
                            arrayList.add((Long) ((Pair) list4.get(i10)).second);
                            e0().t();
                            c0837k1.s();
                            c0837k1.b();
                            ((C0842l1) c0837k1.f14329s).f0(j);
                            c1023u0.getClass();
                            c0837k1.I();
                            if (i11 == 0) {
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).S0();
                            }
                            if (!zI) {
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).z1();
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).B1();
                            }
                            if (!zI2) {
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).D1();
                            }
                            v(c0837k1, str3);
                            if (!zY2) {
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).Z0();
                            }
                            if (!zI2) {
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).L1();
                            }
                            strV = ((C0842l1) c0837k1.f14329s).v();
                            if (TextUtils.isEmpty(strV)) {
                                i13 = size;
                                if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                    z12 = zI2;
                                    i14 = i11;
                                    list5 = list4;
                                    z15 = zY2;
                                }
                                if (c0837k1.V() != 0) {
                                    if (e0().y(str3, G.f16889D0)) {
                                        c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                                    }
                                    c0876s1B = m1P.b();
                                    if (c0876s1B != null) {
                                        c0837k1.B(c0876s1B);
                                    }
                                    c0827i1W.b();
                                    ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                                }
                                i10 = i24 + 1;
                                size = i13;
                                zI2 = z12;
                                list4 = list5;
                                i11 = i14;
                                zY2 = z15;
                            } else {
                                i13 = size;
                            }
                            arrayList4 = new ArrayList(c0837k1.U());
                            it3 = arrayList4.iterator();
                            z12 = zI2;
                            lValueOf = null;
                            lValueOf2 = null;
                            z13 = false;
                            z14 = false;
                            while (it3.hasNext()) {
                                i11 = i11;
                                c0802d1 = (C0802d1) it3.next();
                                list4 = list4;
                                zY2 = zY2;
                                if ("_fx".equals(c0802d1.s())) {
                                    it3.remove();
                                    z13 = true;
                                } else if ("_f".equals(c0802d1.s())) {
                                    j0();
                                    c0817g1W = C0967b0.w(c0802d1, "_pfo");
                                    if (c0817g1W != null) {
                                        lValueOf = Long.valueOf(c0817g1W.u());
                                    }
                                    j0();
                                    c0817g1W2 = C0967b0.w(c0802d1, "_uwa");
                                    if (c0817g1W2 != null) {
                                        lValueOf2 = Long.valueOf(c0817g1W2.u());
                                    }
                                } else {
                                    list4 = list4;
                                    i11 = i11;
                                    zY2 = zY2;
                                }
                                z14 = true;
                            }
                            i14 = i11;
                            list5 = list4;
                            z15 = zY2;
                            if (z13) {
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).a0();
                                c0837k1.b();
                                ((C0842l1) c0837k1.f14329s).Z(arrayList4);
                            }
                            if (z14) {
                                u(c0837k1.o(), true, lValueOf, lValueOf2);
                            }
                            if (c0837k1.V() != 0) {
                                if (e0().y(str3, G.f16889D0)) {
                                    c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                                }
                                c0876s1B = m1P.b();
                                if (c0876s1B != null) {
                                    c0837k1.B(c0876s1B);
                                }
                                c0827i1W.b();
                                ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                            }
                            i10 = i24 + 1;
                            size = i13;
                            zI2 = z12;
                            list4 = list5;
                            i11 = i14;
                            zY2 = z15;
                        }
                        if (((C0832j1) c0827i1W.f14329s).q() == 0) {
                            p(arrayList);
                            y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                            return;
                        }
                        c0832j1 = (C0832j1) c0827i1W.e();
                        arrayList2 = new ArrayList();
                        enumC0980f1 = m1P.f17034c;
                        if (enumC0980f1 == EnumC0980f1.SGTM_CLIENT) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (enumC0980f1 != EnumC0980f1.SGTM) {
                            if (z10) {
                                z11 = true;
                            } else {
                                str2 = null;
                            }
                            c0967b0 = this.f17105s;
                            U(c0967b0);
                            if (c0967b0.I()) {
                                if (Log.isLoggable(b().y(), 2)) {
                                    strR = j0().R(c0832j1);
                                } else {
                                    strR = str2;
                                }
                                j0();
                                byte[] bArrA5 = c0832j1.a();
                                p(arrayList);
                                this.f17112z.f17626z.b(j);
                                b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA5.length), strR);
                                this.f17093L = true;
                                U(c0967b0);
                                c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                                return;
                            }
                            return;
                        }
                        z11 = z10;
                        it = ((C0832j1) c0827i1W.e()).p().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C0842l1) it.next()).N()) {
                                    string = UUID.randomUUID().toString();
                                    break;
                                }
                            } else {
                                string = null;
                                break;
                            }
                        }
                        C0832j1 c0832j9 = (C0832j1) c0827i1W.e();
                        c().o();
                        l0();
                        c0827i1X = C0832j1.x(c0832j9);
                        if (!TextUtils.isEmpty(string)) {
                            c0827i1X.b();
                            ((C0832j1) c0827i1X.f14329s).C(string);
                        }
                        strB = f0().B(str3);
                        if (!TextUtils.isEmpty(strB)) {
                            c0827i1X.i(strB);
                        }
                        arrayList3 = new ArrayList();
                        it2 = c0832j9.p().iterator();
                        while (it2.hasNext()) {
                            C0837k1 c0837k1V3 = C0842l1.V((C0842l1) it2.next());
                            c0837k1V3.b();
                            ((C0842l1) c0837k1V3.f14329s).S0();
                            arrayList3.add((C0842l1) c0837k1V3.e());
                        }
                        c0827i1X.b();
                        ((C0832j1) c0827i1X.f14329s).B();
                        c0827i1X.b();
                        ((C0832j1) c0827i1X.f14329s).A(arrayList3);
                        V v16 = b().v();
                        if (TextUtils.isEmpty(string)) {
                            strH = "null";
                        } else {
                            strH = c0827i1X.h();
                        }
                        v16.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                        c0832j2 = (C0832j1) c0827i1X.e();
                        if (TextUtils.isEmpty(string)) {
                            C0832j1 c0832j10 = (C0832j1) c0827i1W.e();
                            c().o();
                            l0();
                            c0827i1W2 = C0832j1.w();
                            b().v().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                            c0827i1W2.b();
                            ((C0832j1) c0827i1W2.f14329s).C(string);
                            while (r0.hasNext()) {
                                C0837k1 c0837k1U3 = C0842l1.U();
                                String strO3 = c0842l3.O();
                                c0837k1U3.b();
                                ((C0842l1) c0837k1U3.f14329s).R0(strO3);
                                int iK2 = c0842l3.K0();
                                c0837k1U3.b();
                                ((C0842l1) c0837k1U3.f14329s).j1(iK2);
                                c0827i1W2.b();
                                ((C0832j1) c0827i1W2.f14329s).z((C0842l1) c0837k1U3.e());
                            }
                            C0832j1 c0832j11 = (C0832j1) c0827i1W2.e();
                            strB2 = n6.f17001s.f0().B(str3);
                            zIsEmpty = TextUtils.isEmpty(strB2);
                            enumC0980f2 = EnumC0980f1.GOOGLE_SIGNAL;
                            enumC0980f3 = EnumC0980f1.GOOGLE_SIGNAL_PENDING;
                            if (zIsEmpty) {
                                Uri uri3 = Uri.parse((String) G.f16973s.a(null));
                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                String authority3 = uri3.getAuthority();
                                StringBuilder sb7 = new StringBuilder(String.valueOf(strB2).length() + 1 + String.valueOf(authority3).length());
                                sb7.append(strB2);
                                sb7.append(".");
                                sb7.append(authority3);
                                builderBuildUpon3.authority(sb7.toString());
                                String string4 = builderBuildUpon3.build().toString();
                                if (z11) {
                                    enumC0980f2 = enumC0980f3;
                                }
                                str2 = null;
                                m10 = new M1(string4, Collections.EMPTY_MAP, enumC0980f2, null);
                            } else {
                                str2 = null;
                                String str6 = (String) G.f16973s.a(null);
                                if (z11) {
                                    enumC0980f2 = enumC0980f3;
                                }
                                m10 = new M1(str6, Collections.EMPTY_MAP, enumC0980f2, null);
                            }
                            arrayList2.add(Pair.create(c0832j11, m10));
                        } else {
                            str2 = null;
                        }
                        if (z11) {
                            str3 = str;
                            c0832j1 = c0832j2;
                            c0967b0 = this.f17105s;
                            U(c0967b0);
                            if (c0967b0.I()) {
                                if (Log.isLoggable(b().y(), 2)) {
                                    strR = j0().R(c0832j1);
                                } else {
                                    strR = str2;
                                }
                                j0();
                                byte[] bArrA6 = c0832j1.a();
                                p(arrayList);
                                this.f17112z.f17626z.b(j);
                                b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA6.length), strR);
                                this.f17093L = true;
                                U(c0967b0);
                                c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                                return;
                            }
                            return;
                        }
                        c0827i1 = (C0827i1) c0832j2.i();
                        while (i12 < c0832j2.q()) {
                            C0837k1 c0837k6 = (C0837k1) c0832j2.r(i12).i();
                            c0837k6.a0();
                            c0837k6.C(j);
                            c0827i1.b();
                            ((C0832j1) c0827i1.f14329s).y(i12, (C0842l1) c0837k6.e());
                        }
                        arrayList2.add(Pair.create((C0832j1) c0827i1.e(), m1P));
                        p(arrayList);
                        y(false, 204, null, null, str, arrayList2);
                        if (s(str, m1P.a())) {
                            b().v().b(str, "[sgtm] Sending sgtm batches available notification to app");
                            Intent intent3 = new Intent();
                            intent3.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            intent3.setPackage(str);
                            S(c1023u0.d(), intent3);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r14 = 0;
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e25) {
                e = e25;
                j10 = -1;
            }
            if (list2.isEmpty()) {
                return;
            }
            c0869q3 = C0869q3.f14389s;
            C0981g c0981gE2 = e0();
            f3 = G.f16952i1;
            zY = c0981gE2.y(null, f3);
            g10 = G0.f16990t;
            if (zY) {
                if (!e0().y(null, f3)) {
                    list6 = list2;
                } else if (a(str3).i(g10) || !f0().t(str3)) {
                    arrayList5 = new ArrayList(list2.size());
                    C0999m c0999mG5 = g0();
                    c1023u1 = (C1023u0) c0999mG5.f16104r;
                    U6.y.c(str3);
                    c0999mG5.o();
                    c0999mG5.p();
                    arrayList6 = new ArrayList();
                    sQLiteDatabaseD0 = c0999mG5.d0();
                    c1023u1.e().getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    cursorQuery2 = sQLiteDatabaseD0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                    c1023u2 = c1023u1;
                    if (cursorQuery2.moveToFirst()) {
                        list7 = list2;
                        while (true) {
                            arrayList6.add((C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery2.getBlob(0))).e());
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            } else {
                                cursorQuery2 = cursorQuery2;
                                arrayList6 = arrayList6;
                            }
                        }
                        cursorQuery2.close();
                        int iDelete5 = sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                        V v17 = c1023u2.b().v();
                        StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                        sb8.append("Pruned ");
                        sb8.append(iDelete5);
                        sb8.append(" NO_DATA mode events. appId");
                        v17.b(str3, sb8.toString());
                        list10 = list7;
                    } else {
                        arrayList6 = arrayList6;
                        list10 = list2;
                        cursorQuery2.close();
                    }
                    list8 = arrayList6;
                    list9 = list10;
                    it5 = list9.iterator();
                    z16 = true;
                    while (it5.hasNext()) {
                        Pair pair6 = (Pair) it5.next();
                        c0837k2 = (C0837k1) ((C0842l1) pair6.first).i();
                        if (z16 && !list8.isEmpty()) {
                            List listU6 = c0837k2.U();
                            c0837k2.b();
                            ((C0842l1) c0837k2.f14329s).a0();
                            c0837k2.b();
                            ((C0842l1) c0837k2.f14329s).Z(list8);
                            c0837k2.b();
                            ((C0842l1) c0837k2.f14329s).Z(listU6);
                            z16 = false;
                        }
                        com.google.android.gms.internal.measurement.W0 w0Q6 = com.google.android.gms.internal.measurement.Z0.q();
                        c0J = f0().J(str3);
                        arrayList7 = new ArrayList();
                        if (c0J != null) {
                            it6 = c0J.p().iterator();
                            while (it6.hasNext()) {
                                C0910z0 c0910z5 = (C0910z0) it6.next();
                                Iterator it111 = it5;
                                com.google.android.gms.internal.measurement.X0 x0P6 = com.google.android.gms.internal.measurement.Y0.p();
                                boolean z117 = z16;
                                iP = c0910z5.p() - 1;
                                List list111 = list8;
                                if (iP != 1) {
                                    it7 = it6;
                                    i16 = 3;
                                    i17 = 2;
                                } else if (iP != 2) {
                                    it7 = it6;
                                    i16 = 3;
                                    if (iP != 3) {
                                        i17 = 4;
                                    } else if (iP != 4) {
                                        i17 = 1;
                                    } else {
                                        i17 = 5;
                                    }
                                } else {
                                    it7 = it6;
                                    i16 = 3;
                                    i17 = 3;
                                }
                                x0P6.h(i17);
                                iR = c0910z5.r() - 1;
                                if (iR != 1) {
                                    i16 = 2;
                                } else if (iR != 2) {
                                    i16 = 1;
                                }
                                x0P6.i(i16);
                                arrayList7.add((com.google.android.gms.internal.measurement.Y0) x0P6.e());
                                it5 = it111;
                                list8 = list111;
                                z16 = z117;
                                it6 = it7;
                            }
                        }
                        Iterator it112 = it5;
                        boolean z118 = z16;
                        List list112 = list8;
                        w0Q6.h(arrayList7);
                        c0837k2.E(w0Q6);
                        arrayList5.add(Pair.create((C0842l1) c0837k2.e(), (Long) pair6.second));
                        it5 = it112;
                        list8 = list112;
                        z16 = z118;
                    }
                    list6 = arrayList5;
                } else {
                    List listAsList = Arrays.asList(((String) G.f16954j1.a(null)).split(","));
                    for (Pair pair7 : list2) {
                        try {
                            g0().x(((Long) pair7.second).longValue());
                            for (C0802d1 c0802d2 : ((C0842l1) pair7.first).P1()) {
                                if (listAsList.contains(c0802d2.s())) {
                                    if (c0802d2.s().equals("_f") || c0802d2.s().equals("_v")) {
                                        C0797c1 c0797c1 = (C0797c1) c0802d2.i();
                                        j0();
                                        C0967b0.u(c0797c1, "_dac", 1L);
                                        c0802d2 = (C0802d1) c0797c1.e();
                                    }
                                    C0999m c0999mG6 = g0();
                                    c0999mG6.o();
                                    c0999mG6.p();
                                    U6.y.c(str3);
                                    C1023u0 c1023u4 = (C1023u0) c0999mG6.f16104r;
                                    c1023u4.b().v().b(c0802d2, "Caching events in NO_DATA mode");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("app_id", str3);
                                    C0802d1 c0802d3 = c0802d2;
                                    contentValues.put("name", c0802d3.s());
                                    contentValues.put("data", c0802d3.a());
                                    contentValues.put("timestamp_millis", Long.valueOf(c0802d3.u()));
                                    try {
                                        if (c0999mG6.d0().insert("no_data_mode_events", null, contentValues) == j10) {
                                            c1023u4.b().s().b(X.w(str3), "Failed to insert NO_DATA mode event (got -1). appId");
                                        }
                                    } catch (SQLiteException e26) {
                                        ((C1023u0) c0999mG6.f16104r).b().s().c(X.w(str3), e26, "Error storing NO_DATA mode event. appId");
                                    }
                                }
                            }
                        } catch (SQLiteException unused) {
                            b().f17175B.b(str3, "Failed handling NO_DATA mode bundles. appId");
                        }
                    }
                    list6 = Collections.EMPTY_LIST;
                }
                zIsEmpty2 = list6.isEmpty();
                list3 = list6;
                if (zIsEmpty2) {
                    return;
                }
            } else {
                list3 = list2;
            }
            h0A = a(str3);
            g11 = G0.f16989s;
            if (h0A.i(g11)) {
                i10 = 0;
                listSubList = list3;
                break;
            }
            it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    strV2 = null;
                    break;
                }
                c0842l2 = (C0842l1) ((Pair) it4.next()).first;
                if (!c0842l2.v().isEmpty()) {
                    strV2 = c0842l2.v();
                    break;
                }
            }
            if (strV2 != null) {
                i10 = 0;
                listSubList = list3;
                break;
            }
            i15 = 0;
            while (true) {
                if (i15 < list3.size()) {
                    i10 = 0;
                    listSubList = list3;
                    break;
                }
                c0842l1 = (C0842l1) ((Pair) list3.get(i15)).first;
                if (!c0842l1.v().isEmpty() && !c0842l1.v().equals(strV2)) {
                    i10 = 0;
                    listSubList = list3.subList(0, i15);
                    break;
                }
                i15++;
            }
            c0827i1W = C0832j1.w();
            size = listSubList.size();
            arrayList = new ArrayList(listSubList.size());
            if (e0().p(str3) || !a(str3).i(g11)) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            zI = a(str3).i(g11);
            zI2 = a(str3).i(g10);
            zY2 = e0().y(str3, G.f16908N0);
            n6 = this.f17082A;
            m1P = n6.p(str3);
            list4 = listSubList;
            while (true) {
                c1023u0 = this.f17084C;
                if (i10 < size) {
                    break;
                    break;
                }
                c0837k1 = (C0837k1) ((C0842l1) ((Pair) list4.get(i10)).first).i();
                int i25 = i10;
                arrayList.add((Long) ((Pair) list4.get(i10)).second);
                e0().t();
                c0837k1.s();
                c0837k1.b();
                ((C0842l1) c0837k1.f14329s).f0(j);
                c1023u0.getClass();
                c0837k1.I();
                if (i11 == 0) {
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).S0();
                }
                if (!zI) {
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).z1();
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).B1();
                }
                if (!zI2) {
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).D1();
                }
                v(c0837k1, str3);
                if (!zY2) {
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).Z0();
                }
                if (!zI2) {
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).L1();
                }
                strV = ((C0842l1) c0837k1.f14329s).v();
                if (TextUtils.isEmpty(strV)) {
                    i13 = size;
                    if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                        z12 = zI2;
                        i14 = i11;
                        list5 = list4;
                        z15 = zY2;
                    }
                    if (c0837k1.V() != 0) {
                        if (e0().y(str3, G.f16889D0)) {
                            c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                        }
                        c0876s1B = m1P.b();
                        if (c0876s1B != null) {
                            c0837k1.B(c0876s1B);
                        }
                        c0827i1W.b();
                        ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                    }
                    i10 = i25 + 1;
                    size = i13;
                    zI2 = z12;
                    list4 = list5;
                    i11 = i14;
                    zY2 = z15;
                } else {
                    i13 = size;
                }
                arrayList4 = new ArrayList(c0837k1.U());
                it3 = arrayList4.iterator();
                z12 = zI2;
                lValueOf = null;
                lValueOf2 = null;
                z13 = false;
                z14 = false;
                while (it3.hasNext()) {
                    i11 = i11;
                    c0802d1 = (C0802d1) it3.next();
                    list4 = list4;
                    zY2 = zY2;
                    if ("_fx".equals(c0802d1.s())) {
                        it3.remove();
                        z13 = true;
                    } else if ("_f".equals(c0802d1.s())) {
                        j0();
                        c0817g1W = C0967b0.w(c0802d1, "_pfo");
                        if (c0817g1W != null) {
                            lValueOf = Long.valueOf(c0817g1W.u());
                        }
                        j0();
                        c0817g1W2 = C0967b0.w(c0802d1, "_uwa");
                        if (c0817g1W2 != null) {
                            lValueOf2 = Long.valueOf(c0817g1W2.u());
                        }
                    } else {
                        list4 = list4;
                        i11 = i11;
                        zY2 = zY2;
                    }
                    z14 = true;
                }
                i14 = i11;
                list5 = list4;
                z15 = zY2;
                if (z13) {
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).a0();
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).Z(arrayList4);
                }
                if (z14) {
                    u(c0837k1.o(), true, lValueOf, lValueOf2);
                }
                if (c0837k1.V() != 0) {
                    if (e0().y(str3, G.f16889D0)) {
                        c0837k1.P(j0().Z(((C0842l1) c0837k1.e()).a()));
                    }
                    c0876s1B = m1P.b();
                    if (c0876s1B != null) {
                        c0837k1.B(c0876s1B);
                    }
                    c0827i1W.b();
                    ((C0832j1) c0827i1W.f14329s).z((C0842l1) c0837k1.e());
                }
                i10 = i25 + 1;
                size = i13;
                zI2 = z12;
                list4 = list5;
                i11 = i14;
                zY2 = z15;
            }
            if (((C0832j1) c0827i1W.f14329s).q() == 0) {
                p(arrayList);
                y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                return;
            }
            c0832j1 = (C0832j1) c0827i1W.e();
            arrayList2 = new ArrayList();
            enumC0980f1 = m1P.f17034c;
            if (enumC0980f1 == EnumC0980f1.SGTM_CLIENT) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (enumC0980f1 != EnumC0980f1.SGTM) {
                if (z10) {
                    z11 = true;
                } else {
                    str2 = null;
                }
                c0967b0 = this.f17105s;
                U(c0967b0);
                if (c0967b0.I()) {
                    if (Log.isLoggable(b().y(), 2)) {
                        strR = j0().R(c0832j1);
                    } else {
                        strR = str2;
                    }
                    j0();
                    byte[] bArrA7 = c0832j1.a();
                    p(arrayList);
                    this.f17112z.f17626z.b(j);
                    b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA7.length), strR);
                    this.f17093L = true;
                    U(c0967b0);
                    c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                    return;
                }
                return;
            }
            z11 = z10;
            it = ((C0832j1) c0827i1W.e()).p().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C0842l1) it.next()).N()) {
                        string = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    string = null;
                    break;
                }
            }
            C0832j1 c0832j12 = (C0832j1) c0827i1W.e();
            c().o();
            l0();
            c0827i1X = C0832j1.x(c0832j12);
            if (!TextUtils.isEmpty(string)) {
                c0827i1X.b();
                ((C0832j1) c0827i1X.f14329s).C(string);
            }
            strB = f0().B(str3);
            if (!TextUtils.isEmpty(strB)) {
                c0827i1X.i(strB);
            }
            arrayList3 = new ArrayList();
            it2 = c0832j12.p().iterator();
            while (it2.hasNext()) {
                C0837k1 c0837k1V4 = C0842l1.V((C0842l1) it2.next());
                c0837k1V4.b();
                ((C0842l1) c0837k1V4.f14329s).S0();
                arrayList3.add((C0842l1) c0837k1V4.e());
            }
            c0827i1X.b();
            ((C0832j1) c0827i1X.f14329s).B();
            c0827i1X.b();
            ((C0832j1) c0827i1X.f14329s).A(arrayList3);
            V v18 = b().v();
            if (TextUtils.isEmpty(string)) {
                strH = "null";
            } else {
                strH = c0827i1X.h();
            }
            v18.b(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
            c0832j2 = (C0832j1) c0827i1X.e();
            if (TextUtils.isEmpty(string)) {
                C0832j1 c0832j13 = (C0832j1) c0827i1W.e();
                c().o();
                l0();
                c0827i1W2 = C0832j1.w();
                b().v().b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                c0827i1W2.b();
                ((C0832j1) c0827i1W2.f14329s).C(string);
                while (r0.hasNext()) {
                    C0837k1 c0837k1U4 = C0842l1.U();
                    String strO4 = c0842l3.O();
                    c0837k1U4.b();
                    ((C0842l1) c0837k1U4.f14329s).R0(strO4);
                    int iK3 = c0842l3.K0();
                    c0837k1U4.b();
                    ((C0842l1) c0837k1U4.f14329s).j1(iK3);
                    c0827i1W2.b();
                    ((C0832j1) c0827i1W2.f14329s).z((C0842l1) c0837k1U4.e());
                }
                C0832j1 c0832j14 = (C0832j1) c0827i1W2.e();
                strB2 = n6.f17001s.f0().B(str3);
                zIsEmpty = TextUtils.isEmpty(strB2);
                enumC0980f2 = EnumC0980f1.GOOGLE_SIGNAL;
                enumC0980f3 = EnumC0980f1.GOOGLE_SIGNAL_PENDING;
                if (zIsEmpty) {
                    Uri uri4 = Uri.parse((String) G.f16973s.a(null));
                    Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                    String authority4 = uri4.getAuthority();
                    StringBuilder sb9 = new StringBuilder(String.valueOf(strB2).length() + 1 + String.valueOf(authority4).length());
                    sb9.append(strB2);
                    sb9.append(".");
                    sb9.append(authority4);
                    builderBuildUpon4.authority(sb9.toString());
                    String string5 = builderBuildUpon4.build().toString();
                    if (z11) {
                        enumC0980f2 = enumC0980f3;
                    }
                    str2 = null;
                    m10 = new M1(string5, Collections.EMPTY_MAP, enumC0980f2, null);
                } else {
                    str2 = null;
                    String str7 = (String) G.f16973s.a(null);
                    if (z11) {
                        enumC0980f2 = enumC0980f3;
                    }
                    m10 = new M1(str7, Collections.EMPTY_MAP, enumC0980f2, null);
                }
                arrayList2.add(Pair.create(c0832j14, m10));
            } else {
                str2 = null;
            }
            if (z11) {
                str3 = str;
                c0832j1 = c0832j2;
                c0967b0 = this.f17105s;
                U(c0967b0);
                if (c0967b0.I()) {
                    if (Log.isLoggable(b().y(), 2)) {
                        strR = j0().R(c0832j1);
                    } else {
                        strR = str2;
                    }
                    j0();
                    byte[] bArrA8 = c0832j1.a();
                    p(arrayList);
                    this.f17112z.f17626z.b(j);
                    b().v().d("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA8.length), strR);
                    this.f17093L = true;
                    U(c0967b0);
                    c0967b0.N(str3, m1P, c0832j1, new p074h0.i((Q1) this, str3, arrayList2, 6));
                    return;
                }
                return;
            }
            c0827i1 = (C0827i1) c0832j2.i();
            while (i12 < c0832j2.q()) {
                C0837k1 c0837k7 = (C0837k1) c0832j2.r(i12).i();
                c0837k7.a0();
                c0837k7.C(j);
                c0827i1.b();
                ((C0832j1) c0827i1.f14329s).y(i12, (C0842l1) c0837k7.e());
            }
            arrayList2.add(Pair.create((C0832j1) c0827i1.e(), m1P));
            p(arrayList);
            y(false, 204, null, null, str, arrayList2);
            if (s(str, m1P.a())) {
                b().v().b(str, "[sgtm] Sending sgtm batches available notification to app");
                Intent intent4 = new Intent();
                intent4.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                intent4.setPackage(str);
                S(c1023u0.d(), intent4);
            }
        } catch (Throwable th5) {
            th = th5;
            r14 = r11;
        }
    }

    public final boolean s(String str, String str2) {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C0970c0 c0970c0Q0 = c0999m.q0(str);
        HashMap map = this.f17098V;
        if (c0970c0Q0 != null && k0().Q(str, c0970c0Q0.C())) {
            map.remove(str2);
            return true;
        }
        P1 p10 = (P1) map.get(str2);
        if (p10 != null) {
            p10.f17067a.e().getClass();
            if (System.currentTimeMillis() < p10.f17069c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        c().o();
        l0();
        this.f17094M = true;
        try {
            C1023u0 c1023u0 = this.f17084C;
            c1023u0.getClass();
            Boolean bool = c1023u0.p().f17553v;
            if (bool == null) {
                b().f17185z.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f17182w.a("Upload called in the client side when service should be used");
            } else if (this.f17087F > 0) {
                N();
            } else {
                C0967b0 c0967b0 = this.f17105s;
                U(c0967b0);
                if (c0967b0.I()) {
                    C0999m c0999m = this.f17106t;
                    U(c0999m);
                    if (c0999m.u(str)) {
                        C0999m c0999m2 = this.f17106t;
                        U(c0999m2);
                        U6.y.c(str);
                        c0999m2.o();
                        c0999m2.p();
                        List listT = c0999m2.t(str, J1.b(EnumC0980f1.GOOGLE_SIGNAL), 1);
                        R1 r10 = listT.isEmpty() ? null : (R1) listT.get(0);
                        if (r10 != null) {
                            C0832j1 c0832j1 = r10.f17117b;
                            b().f17178E.d("[sgtm] Uploading data from upload queue. appId, type, url", str, r10.f17120e, r10.f17118c);
                            byte[] bArrA = c0832j1.a();
                            if (Log.isLoggable(b().y(), 2)) {
                                C0967b0 c0967b1 = this.f17110x;
                                U(c0967b1);
                                b().f17178E.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), c0967b1.R(c0832j1));
                            }
                            M1 m10 = new M1(r10.f17118c, r10.f17119d, r10.f17120e, null);
                            this.f17093L = true;
                            C0967b0 c0967b2 = this.f17105s;
                            U(c0967b2);
                            c0967b2.N(str, m10, c0832j1, new p074h0.i(this, str, r10, 7));
                        }
                    } else {
                        b().f17178E.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    b().f17178E.a("Network not connected, ignoring upload request");
                    N();
                }
            }
        } finally {
            this.f17094M = false;
            O();
        }
    }

    public final void u(String str, boolean z10, Long l10, Long l11) {
        C0999m c0999m = this.f17106t;
        U(c0999m);
        C0970c0 c0970c0Q0 = c0999m.q0(str);
        if (c0970c0Q0 != null) {
            C1023u0 c1023u0 = c0970c0Q0.f17292a;
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.o();
            c0970c0Q0.Q |= c0970c0Q0.f17314y != z10;
            c0970c0Q0.f17314y = z10;
            C1014r0 c1014r1 = c1023u0.f17585x;
            C1023u0.m(c1014r1);
            c1014r1.o();
            c0970c0Q0.Q |= !Objects.equals(c0970c0Q0.f17315z, l10);
            c0970c0Q0.f17315z = l10;
            C1014r0 c1014r2 = c1023u0.f17585x;
            C1023u0.m(c1014r2);
            c1014r2.o();
            c0970c0Q0.Q |= !Objects.equals(c0970c0Q0.f17276A, l11);
            c0970c0Q0.f17276A = l11;
            if (c0970c0Q0.o()) {
                C0999m c0999m2 = this.f17106t;
                U(c0999m2);
                c0999m2.r0(c0970c0Q0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    public final void v(C0837k1 c0837k1, String str) throws Throwable {
        int iC0;
        int iIndexOf;
        C1003n0 c1003n0 = this.f17104r;
        U(c1003n0);
        c1003n0.o();
        c1003n0.u(str);
        C1350e c1350e = c1003n0.f17479v;
        Set set = (Set) c1350e.get(str);
        if (set != null) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).a1(set);
        }
        U(c1003n0);
        c1003n0.o();
        c1003n0.u(str);
        if (c1350e.get(str) != null && (((Set) c1350e.get(str)).contains("device_model") || ((Set) c1350e.get(str)).contains("device_info"))) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).q1();
        }
        U(c1003n0);
        if (c1003n0.G(str)) {
            String strI2 = ((C0842l1) c0837k1.f14329s).i2();
            if (!TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                String strSubstring = strI2.substring(0, iIndexOf);
                c0837k1.b();
                ((C0842l1) c0837k1.f14329s).o0(strSubstring);
            }
        }
        U(c1003n0);
        c1003n0.o();
        c1003n0.u(str);
        if (c1350e.get(str) != null && ((Set) c1350e.get(str)).contains("user_id") && (iC0 = C0967b0.c0(c0837k1, "_id")) != -1) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).e0(iC0);
        }
        U(c1003n0);
        c1003n0.o();
        c1003n0.u(str);
        if (c1350e.get(str) != null && ((Set) c1350e.get(str)).contains("google_signals")) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).S0();
        }
        U(c1003n0);
        if (c1003n0.H(str)) {
            c0837k1.b();
            ((C0842l1) c0837k1.f14329s).D1();
            if (a(str).i(G0.f16990t)) {
                HashMap map = this.U;
                O1 o10 = (O1) map.get(str);
                if (o10 != null) {
                    long jV = e0().v(str, G.f16959l0) + o10.f17060b;
                    e().getClass();
                    if (jV < SystemClock.elapsedRealtime()) {
                        o10 = new O1(this, k0().i0());
                        map.put(str, o10);
                    }
                } else {
                    o10 = new O1(this, k0().i0());
                    map.put(str, o10);
                }
                String str2 = o10.f17059a;
                c0837k1.b();
                ((C0842l1) c0837k1.f14329s).b1(str2);
            }
        }
        U(c1003n0);
        c1003n0.o();
        c1003n0.u(str);
        if (c1350e.get(str) == null || !((Set) c1350e.get(str)).contains("enhanced_user_id")) {
            return;
        }
        c0837k1.b();
        ((C0842l1) c0837k1.f14329s).Z0();
    }

    public final void w(C0837k1 c0837k1, C0982g0 c0982g0) {
        String strI0;
        String strI1;
        for (int i10 = 0; i10 < c0837k1.V(); i10++) {
            C0797c1 c0797c1 = (C0797c1) ((C0842l1) c0837k1.f14329s).T1(i10).i();
            Iterator it = c0797c1.h().iterator();
            while (it.hasNext()) {
                if ("_c".equals(((C0817g1) it.next()).q())) {
                    if (((C0842l1) c0982g0.f17363b).G0() >= e0().w(((C0842l1) c0982g0.f17363b).p(), G.f16962m0)) {
                        int iW = e0().w(((C0842l1) c0982g0.f17363b).p(), G.f16988z0);
                        LinkedList linkedList = this.f17089H;
                        C0967b0 c0967b0 = this.f17110x;
                        if (iW > 0) {
                            C0999m c0999m = this.f17106t;
                            U(c0999m);
                            if (c0999m.s0(g(), ((C0842l1) c0982g0.f17363b).p(), false, false, false, true).g > iW) {
                                C0812f1 c0812f1B = C0817g1.B();
                                c0812f1B.h("_tnr");
                                c0812f1B.j(1L);
                                c0797c1.k((C0817g1) c0812f1B.e());
                            } else {
                                if (e0().y(((C0842l1) c0982g0.f17363b).p(), G.f16915S0)) {
                                    strI1 = k0().i0();
                                    C0812f1 c0812f1B2 = C0817g1.B();
                                    c0812f1B2.h("_tu");
                                    c0812f1B2.i(strI1);
                                    c0797c1.k((C0817g1) c0812f1B2.e());
                                } else {
                                    strI1 = null;
                                }
                                C0812f1 c0812f1B3 = C0817g1.B();
                                c0812f1B3.h("_tr");
                                c0812f1B3.j(1L);
                                c0797c1.k((C0817g1) c0812f1B3.e());
                                U(c0967b0);
                                F1 f1P = c0967b0.P(((C0842l1) c0982g0.f17363b).p(), c0837k1, c0797c1, strI1);
                                if (f1P != null) {
                                    b().f17178E.c(((C0842l1) c0982g0.f17363b).p(), f1P.f16879r, "Generated trigger URI. appId, uri");
                                    C0999m c0999m2 = this.f17106t;
                                    U(c0999m2);
                                    c0999m2.I(((C0842l1) c0982g0.f17363b).p(), f1P);
                                    if (!linkedList.contains(((C0842l1) c0982g0.f17363b).p())) {
                                        linkedList.add(((C0842l1) c0982g0.f17363b).p());
                                    }
                                }
                            }
                        } else {
                            if (e0().y(((C0842l1) c0982g0.f17363b).p(), G.f16915S0)) {
                                strI0 = k0().i0();
                                C0812f1 c0812f1B4 = C0817g1.B();
                                c0812f1B4.h("_tu");
                                c0812f1B4.i(strI0);
                                c0797c1.k((C0817g1) c0812f1B4.e());
                            } else {
                                strI0 = null;
                            }
                            C0812f1 c0812f1B5 = C0817g1.B();
                            c0812f1B5.h("_tr");
                            c0812f1B5.j(1L);
                            c0797c1.k((C0817g1) c0812f1B5.e());
                            U(c0967b0);
                            F1 f1P2 = c0967b0.P(((C0842l1) c0982g0.f17363b).p(), c0837k1, c0797c1, strI0);
                            if (f1P2 != null) {
                                b().f17178E.c(((C0842l1) c0982g0.f17363b).p(), f1P2.f16879r, "Generated trigger URI. appId, uri");
                                C0999m c0999m3 = this.f17106t;
                                U(c0999m3);
                                c0999m3.I(((C0842l1) c0982g0.f17363b).p(), f1P2);
                                if (!linkedList.contains(((C0842l1) c0982g0.f17363b).p())) {
                                    linkedList.add(((C0842l1) c0982g0.f17363b).p());
                                }
                            }
                        }
                    }
                    C0802d1 c0802d1 = (C0802d1) c0797c1.e();
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).X(i10, c0802d1);
                    break;
                }
            }
        }
    }

    public final void x(String str, C0812f1 c0812f1, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (V1.O(((C0817g1) c0812f1.f14329s).q()) || V1.O(str)) {
            C0981g c0981gE0 = e0();
            c0981gE0.getClass();
            iMax = Math.max(Math.max(Math.min(c0981gE0.w(str2, G.f16951i0), 500), 100), 256);
        } else {
            C0981g c0981gE1 = e0();
            c0981gE1.getClass();
            iMax = Math.max(Math.min(c0981gE1.w(str2, G.f16951i0), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((C0817g1) c0812f1.f14329s).s().codePointCount(0, ((C0817g1) c0812f1.f14329s).s().length());
        k0();
        String strQ = ((C0817g1) c0812f1.f14329s).q();
        e0();
        String strT = V1.t(40, strQ, true);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((C0817g1) c0812f1.f14329s).q())) {
            return;
        }
        if ("_ev".equals(((C0817g1) c0812f1.f14329s).q())) {
            k0();
            String strS = ((C0817g1) c0812f1.f14329s).s();
            C0981g c0981gE2 = e0();
            c0981gE2.getClass();
            bundle.putString("_ev", V1.t(Math.max(Math.max(Math.min(c0981gE2.w(str2, G.f16951i0), 500), 100), 256), strS, true));
            return;
        }
        b().f17175B.c(strT, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strT);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((C0817g1) c0812f1.f14329s).q());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0153 A[EDGE_INSN: B:105:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:107:0x00f5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
      0x008f: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011f A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0188 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01dc A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0230 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x023b A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0241 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x024a A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0254 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    public final void y(boolean z10, int i10, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map;
        Iterator it;
        boolean zHasNext;
        EnumC0980f1 enumC0980f1;
        Iterator it2;
        List listT;
        int size;
        int i11;
        C0999m c0999m;
        Long l10;
        long j;
        C0832j1 c0832j1;
        M1 m10;
        Map map2;
        C0832j1 c0832j2;
        M1 m11;
        EnumC0980f1 enumC0980f2;
        EnumC0980f1 enumC0980f3;
        Map map3;
        long jS;
        int i12 = i10;
        C0967b0 c0967b0 = this.f17105s;
        c().o();
        l0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.f17093L = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList arrayList = this.f17097P;
        U6.y.f(arrayList);
        this.f17097P = null;
        if (z10) {
            if (i12 == 200) {
                if (th != null) {
                    V v10 = b().f17178E;
                    numValueOf = Integer.valueOf(i12);
                    v10.c(numValueOf, Boolean.valueOf(z10), "Network upload successful with code, uploadAttempted");
                    if (z10) {
                        C0979f0 c0979f0 = this.f17112z.f17625y;
                        e().getClass();
                        c0979f0.b(System.currentTimeMillis());
                    }
                    this.f17112z.f17626z.b(0L);
                    N();
                    if (z10) {
                        b().f17178E.c(numValueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
                    } else {
                        b().f17178E.a("Purged empty bundles");
                    }
                    C0999m c0999m2 = this.f17106t;
                    U(c0999m2);
                    c0999m2.a0();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        enumC0980f1 = EnumC0980f1.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        c0832j2 = (C0832j1) pair.first;
                        m11 = (M1) pair.second;
                        enumC0980f2 = m11.f17034c;
                        enumC0980f3 = m11.f17034c;
                        if (enumC0980f2 != enumC0980f1) {
                            C0999m c0999m3 = this.f17106t;
                            U(c0999m3);
                            String str2 = m11.f17032a;
                            map3 = m11.f17033b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jS = c0999m3.s(str, c0832j2, str2, map3, enumC0980f3, null);
                            if (enumC0980f3 == EnumC0980f1.GOOGLE_SIGNAL_PENDING) {
                                map.put(c0832j2.t(), Long.valueOf(jS));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        c0832j1 = (C0832j1) pair2.first;
                        m10 = (M1) pair2.second;
                        if (m10.f17034c == enumC0980f1) {
                            Long l11 = (Long) map.get(c0832j1.t());
                            C0999m c0999m4 = this.f17106t;
                            U(c0999m4);
                            EnumC0980f1 enumC0980f4 = enumC0980f1;
                            String str3 = m10.f17032a;
                            map2 = m10.f17033b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            c0999m4.s(str, c0832j1, str3, map2, m10.f17034c, l11);
                            enumC0980f1 = enumC0980f4;
                        }
                    }
                    C0999m c0999m5 = this.f17106t;
                    U(c0999m5);
                    listT = c0999m5.t(str, J1.b(enumC0980f1), 1);
                    if (!listT.isEmpty()) {
                        j = ((R1) listT.get(0)).f17121f;
                        e().getClass();
                        if (System.currentTimeMillis() > ((Long) G.f16892F.a(null)).longValue() + j) {
                            b().f17185z.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                        }
                    }
                    size = arrayList.size();
                    i11 = 0;
                    while (i11 < size) {
                        int i13 = i11 + 1;
                        l10 = (Long) arrayList.get(i11);
                        C0999m c0999m6 = this.f17106t;
                        U(c0999m6);
                        c0999m6.x(l10.longValue());
                        i11 = i13;
                    }
                    C0999m c0999m7 = this.f17106t;
                    U(c0999m7);
                    c0999m7.b0();
                    C0999m c0999m8 = this.f17106t;
                    U(c0999m8);
                    c0999m8.c0();
                    this.Q = null;
                    U(c0967b0);
                    if (c0967b0.I()) {
                        c0999m = this.f17106t;
                        U(c0999m);
                        if (c0999m.u(str)) {
                            t(str);
                        } else {
                            U(c0967b0);
                            if (c0967b0.I()) {
                                this.R = -1L;
                                N();
                            } else {
                                this.R = -1L;
                                N();
                            }
                        }
                    } else {
                        U(c0967b0);
                        if (c0967b0.I()) {
                            this.R = -1L;
                            N();
                        } else {
                            this.R = -1L;
                            N();
                        }
                    }
                    this.f17087F = 0L;
                }
            } else if (i12 == 204) {
                i12 = 204;
                if (th != null) {
                    V v11 = b().f17178E;
                    numValueOf = Integer.valueOf(i12);
                    v11.c(numValueOf, Boolean.valueOf(z10), "Network upload successful with code, uploadAttempted");
                    if (z10) {
                        C0979f0 c0979f1 = this.f17112z.f17625y;
                        e().getClass();
                        c0979f1.b(System.currentTimeMillis());
                    }
                    this.f17112z.f17626z.b(0L);
                    N();
                    if (z10) {
                        b().f17178E.c(numValueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
                    } else {
                        b().f17178E.a("Purged empty bundles");
                    }
                    C0999m c0999m9 = this.f17106t;
                    U(c0999m9);
                    c0999m9.a0();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        enumC0980f1 = EnumC0980f1.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair3 = (Pair) it.next();
                        c0832j2 = (C0832j1) pair3.first;
                        m11 = (M1) pair3.second;
                        enumC0980f2 = m11.f17034c;
                        enumC0980f3 = m11.f17034c;
                        if (enumC0980f2 != enumC0980f1) {
                            C0999m c0999m10 = this.f17106t;
                            U(c0999m10);
                            String str4 = m11.f17032a;
                            map3 = m11.f17033b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jS = c0999m10.s(str, c0832j2, str4, map3, enumC0980f3, null);
                            if (enumC0980f3 == EnumC0980f1.GOOGLE_SIGNAL_PENDING) {
                                map.put(c0832j2.t(), Long.valueOf(jS));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair4 = (Pair) it2.next();
                        c0832j1 = (C0832j1) pair4.first;
                        m10 = (M1) pair4.second;
                        if (m10.f17034c == enumC0980f1) {
                            Long l12 = (Long) map.get(c0832j1.t());
                            C0999m c0999m11 = this.f17106t;
                            U(c0999m11);
                            EnumC0980f1 enumC0980f5 = enumC0980f1;
                            String str5 = m10.f17032a;
                            map2 = m10.f17033b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            c0999m11.s(str, c0832j1, str5, map2, m10.f17034c, l12);
                            enumC0980f1 = enumC0980f5;
                        }
                    }
                    C0999m c0999m12 = this.f17106t;
                    U(c0999m12);
                    listT = c0999m12.t(str, J1.b(enumC0980f1), 1);
                    if (!listT.isEmpty()) {
                        j = ((R1) listT.get(0)).f17121f;
                        e().getClass();
                        if (System.currentTimeMillis() > ((Long) G.f16892F.a(null)).longValue() + j) {
                            b().f17185z.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                        }
                    }
                    size = arrayList.size();
                    i11 = 0;
                    while (i11 < size) {
                        int i14 = i11 + 1;
                        l10 = (Long) arrayList.get(i11);
                        C0999m c0999m13 = this.f17106t;
                        U(c0999m13);
                        c0999m13.x(l10.longValue());
                        i11 = i14;
                    }
                    C0999m c0999m14 = this.f17106t;
                    U(c0999m14);
                    c0999m14.b0();
                    C0999m c0999m15 = this.f17106t;
                    U(c0999m15);
                    c0999m15.c0();
                    this.Q = null;
                    U(c0967b0);
                    if (c0967b0.I()) {
                        c0999m = this.f17106t;
                        U(c0999m);
                        if (c0999m.u(str)) {
                            t(str);
                        } else {
                            U(c0967b0);
                            if (c0967b0.I()) {
                                this.R = -1L;
                                N();
                            } else {
                                this.R = -1L;
                                N();
                            }
                        }
                    } else {
                        U(c0967b0);
                        if (c0967b0.I()) {
                            this.R = -1L;
                            N();
                        } else {
                            this.R = -1L;
                            N();
                        }
                    }
                    this.f17087F = 0L;
                }
            }
            String str6 = new String(bArr2, StandardCharsets.UTF_8);
            b().f17175B.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i12), th, str6.substring(0, Math.min(32, str6.length())));
            C0979f0 c0979f2 = this.f17112z.f17626z;
            e().getClass();
            c0979f2.b(System.currentTimeMillis());
            if (i12 == 503 || i12 == 429) {
                C0979f0 c0979f3 = this.f17112z.f17624x;
                e().getClass();
                c0979f3.b(System.currentTimeMillis());
            }
            C0999m c0999m16 = this.f17106t;
            U(c0999m16);
            c0999m16.z(arrayList);
            N();
        } else {
            V v12 = b().f17178E;
            numValueOf = Integer.valueOf(i12);
            v12.c(numValueOf, Boolean.valueOf(z10), "Network upload successful with code, uploadAttempted");
            if (z10) {
                try {
                    C0979f0 c0979f4 = this.f17112z.f17625y;
                    e().getClass();
                    c0979f4.b(System.currentTimeMillis());
                } catch (SQLiteException e10) {
                    b().f17182w.b(e10, "Database error while trying to delete uploaded bundles");
                    e().getClass();
                    this.f17087F = SystemClock.elapsedRealtime();
                    b().f17178E.b(Long.valueOf(this.f17087F), "Disable upload, time");
                }
            }
            this.f17112z.f17626z.b(0L);
            N();
            if (z10) {
                b().f17178E.c(numValueOf, Integer.valueOf(bArr2.length), "Successful upload. Got network response. code, size");
            } else {
                b().f17178E.a("Purged empty bundles");
            }
            C0999m c0999m17 = this.f17106t;
            U(c0999m17);
            c0999m17.a0();
            try {
                map = new HashMap();
                it = list.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    enumC0980f1 = EnumC0980f1.SGTM_CLIENT;
                    if (!zHasNext) {
                        break;
                    }
                    Pair pair5 = (Pair) it.next();
                    c0832j2 = (C0832j1) pair5.first;
                    m11 = (M1) pair5.second;
                    enumC0980f2 = m11.f17034c;
                    enumC0980f3 = m11.f17034c;
                    if (enumC0980f2 != enumC0980f1) {
                        C0999m c0999m18 = this.f17106t;
                        U(c0999m18);
                        String str7 = m11.f17032a;
                        map3 = m11.f17033b;
                        if (map3 == null) {
                            map3 = Collections.EMPTY_MAP;
                        }
                        jS = c0999m18.s(str, c0832j2, str7, map3, enumC0980f3, null);
                        if (enumC0980f3 == EnumC0980f1.GOOGLE_SIGNAL_PENDING && jS != -1 && !c0832j2.t().isEmpty()) {
                            map.put(c0832j2.t(), Long.valueOf(jS));
                        }
                    }
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair6 = (Pair) it2.next();
                    c0832j1 = (C0832j1) pair6.first;
                    m10 = (M1) pair6.second;
                    if (m10.f17034c == enumC0980f1) {
                        Long l13 = (Long) map.get(c0832j1.t());
                        C0999m c0999m19 = this.f17106t;
                        U(c0999m19);
                        EnumC0980f1 enumC0980f6 = enumC0980f1;
                        String str8 = m10.f17032a;
                        map2 = m10.f17033b;
                        if (map2 == null) {
                            map2 = Collections.EMPTY_MAP;
                        }
                        c0999m19.s(str, c0832j1, str8, map2, m10.f17034c, l13);
                        enumC0980f1 = enumC0980f6;
                    }
                }
                C0999m c0999m110 = this.f17106t;
                U(c0999m110);
                listT = c0999m110.t(str, J1.b(enumC0980f1), 1);
                if (!listT.isEmpty()) {
                    j = ((R1) listT.get(0)).f17121f;
                    e().getClass();
                    if (System.currentTimeMillis() > ((Long) G.f16892F.a(null)).longValue() + j) {
                        b().f17185z.c(str, Long.valueOf(j), "[sgtm] client batches are queued too long. appId, creationTime");
                    }
                }
                size = arrayList.size();
                i11 = 0;
                while (i11 < size) {
                    int i15 = i11 + 1;
                    l10 = (Long) arrayList.get(i11);
                    try {
                        C0999m c0999m111 = this.f17106t;
                        U(c0999m111);
                        c0999m111.x(l10.longValue());
                    } catch (SQLiteException e11) {
                        ArrayList arrayList2 = this.Q;
                        if (arrayList2 == null || !arrayList2.contains(l10)) {
                            throw e11;
                        }
                    }
                    i11 = i15;
                }
                C0999m c0999m112 = this.f17106t;
                U(c0999m112);
                c0999m112.b0();
                C0999m c0999m113 = this.f17106t;
                U(c0999m113);
                c0999m113.c0();
                this.Q = null;
                U(c0967b0);
                if (c0967b0.I()) {
                    c0999m = this.f17106t;
                    U(c0999m);
                    if (c0999m.u(str)) {
                        t(str);
                    } else {
                        U(c0967b0);
                        if (c0967b0.I() || !L()) {
                            this.R = -1L;
                            N();
                        } else {
                            q();
                        }
                    }
                } else {
                    U(c0967b0);
                    if (c0967b0.I()) {
                        this.R = -1L;
                        N();
                    } else {
                        this.R = -1L;
                        N();
                    }
                }
                this.f17087F = 0L;
            } catch (Throwable th3) {
                C0999m c0999m20 = this.f17106t;
                U(c0999m20);
                c0999m20.c0();
                throw th3;
            }
        }
        this.f17093L = false;
        O();
    }

    public final void z(C0970c0 c0970c0) {
        C1350e c1350e;
        C1350e c1350e2;
        c().o();
        if (TextUtils.isEmpty(c0970c0.G())) {
            String strD = c0970c0.D();
            U6.y.f(strD);
            A(strD, 204, null, null, null);
            return;
        }
        String strD2 = c0970c0.D();
        U6.y.f(strD2);
        b().f17178E.b(strD2, "Fetching remote configuration");
        C1003n0 c1003n0 = this.f17104r;
        U(c1003n0);
        com.google.android.gms.internal.measurement.H0 h0A = c1003n0.A(strD2);
        U(c1003n0);
        c1003n0.o();
        String str = (String) c1003n0.f17476D.get(strD2);
        if (h0A != null) {
            if (TextUtils.isEmpty(str)) {
                c1350e2 = null;
            } else {
                c1350e2 = new C1350e(0);
                c1350e2.put("If-Modified-Since", str);
            }
            U(c1003n0);
            c1003n0.o();
            String str2 = (String) c1003n0.f17477E.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (c1350e2 == null) {
                    c1350e2 = new C1350e(0);
                }
                c1350e2.put("If-None-Match", str2);
            }
            c1350e = c1350e2;
        } else {
            c1350e = null;
        }
        this.f17092K = true;
        C0967b0 c0967b0 = this.f17105s;
        U(c0967b0);
        X4.c cVar = new X4.c(this);
        C1023u0 c1023u0 = (C1023u0) c0967b0.f16104r;
        c0967b0.o();
        c0967b0.p();
        N1 n6 = c0967b0.f17001s.f17082A;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) G.f16942f.a(null)).encodedAuthority((String) G.g.a(null)).path("config/app/".concat(String.valueOf(c0970c0.G()))).appendQueryParameter("platform", "android");
        ((C1023u0) n6.f16104r).f17582u.t();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.A(new RunnableC0964a0(c0967b0, c0970c0.D(), url, (byte[]) null, c1350e, cVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.c(X.w(c0970c0.D()), string, "Failed to parse config URL. Not fetching. appId");
        }
    }
}
