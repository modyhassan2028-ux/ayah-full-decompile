package p123m2;

import F1.d;
import J0.C0285h;
import J0.K;
import N9.b0;
import Z.C0698o;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import p110k9.t;
import p171r0.g;
import p180s0.C1297f;
import p180s0.C1300i;
import p180s0.C1303l;
import p180s0.E;
import p180s0.F;
import p180s0.L;
import p180s0.o;
import p180s0.q;
import p196u0.b;
import p196u0.f;
import p223x.InterfaceC1417f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void A(long j, String str, StringBuilder sb) {
        sb.append((Object) q.i(j));
        sb.append(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void B(Q2.c cVar) throws Exception {
        if (cVar instanceof AutoCloseable) {
            cVar.close();
            return;
        }
        if (cVar instanceof ExecutorService) {
            d.d((ExecutorService) cVar);
            return;
        }
        if (cVar instanceof TypedArray) {
            ((TypedArray) cVar).recycle();
            return;
        }
        if (cVar instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cVar).release();
            return;
        }
        if (cVar instanceof MediaDrm) {
            ((MediaDrm) cVar).release();
        } else if (cVar instanceof DrmManagerClient) {
            ((DrmManagerClient) cVar).release();
        } else {
            if (!(cVar instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cVar).release();
        }
    }

    public static /* synthetic */ void C(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            d.d((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static /* synthetic */ boolean D(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String E(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static boolean a(InterfaceC1417f interfaceC1417f, long j) {
        return j >= interfaceC1417f.f();
    }

    public static long b(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static void c(E e10, g gVar) {
        C1300i c1300i = (C1300i) e10;
        if (c1300i.f21830b == null) {
            c1300i.f21830b = new RectF();
        }
        RectF rectF = c1300i.f21830b;
        j.b(rectF);
        float f3 = gVar.f21393a;
        long j = gVar.f21399h;
        long j10 = gVar.g;
        long j11 = gVar.f21398f;
        long j12 = gVar.f21397e;
        rectF.set(f3, gVar.f21394b, gVar.f21395c, gVar.f21396d);
        if (c1300i.f21831c == null) {
            c1300i.f21831c = new float[8];
        }
        float[] fArr = c1300i.f21831c;
        j.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c1300i.f21829a;
        RectF rectF2 = c1300i.f21830b;
        j.b(rectF2);
        float[] fArr2 = c1300i.f21831c;
        j.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static /* synthetic */ void d(p196u0.d dVar, long j, float f3, float f7, boolean z10, long j10, long j11, p196u0.g gVar, int i10) {
        long j12 = (i10 & 16) != 0 ? 0L : j10;
        dVar.e0(j, f3, f7, z10, j12, (i10 & 32) != 0 ? b(dVar.b(), j12) : j11, (i10 & 128) != 0 ? f.f22800b : gVar);
    }

    public static /* synthetic */ void e(p196u0.d dVar, long j, float f3, long j10, int i10, int i11) {
        if ((i11 & 4) != 0) {
            j10 = dVar.I();
        }
        long j11 = j10;
        if ((i11 & 64) != 0) {
            i10 = 3;
        }
        dVar.K(j, i10, j11, f3);
    }

    public static void f(p196u0.d dVar, C1297f c1297f, long j, long j10, float f3, C1303l c1303l, int i10, int i11) {
        dVar.g(c1297f, 0L, j, (i11 & 16) != 0 ? j : j10, (i11 & 32) != 0 ? 1.0f : f3, c1303l, (i11 & 512) != 0 ? 1 : i10);
    }

    public static void g(K k7, L l10, long j, long j10, float f3, float f7, int i10) {
        if ((i10 & 64) != 0) {
            f7 = 1.0f;
        }
        b bVar = k7.f3942r;
        o oVar = bVar.f22794r.f22792c;
        b0 b0VarG = bVar.f22797u;
        if (b0VarG == null) {
            b0VarG = F.g();
            b0VarG.l(1);
            bVar.f22797u = b0VarG;
        }
        Paint paint = (Paint) b0VarG.f6165b;
        l10.j(f7, bVar.f22795s.v(), b0VarG);
        if (!j.a((C1303l) b0VarG.f6167d, null)) {
            b0VarG.f(null);
        }
        if (b0VarG.f6164a != 3) {
            b0VarG.d(3);
        }
        if (paint.getStrokeWidth() != f3) {
            b0VarG.k(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (b0VarG.a() != 0) {
            b0VarG.i(0);
        }
        if (b0VarG.b() != 0) {
            b0VarG.j(0);
        }
        if (!paint.isFilterBitmap()) {
            b0VarG.g(1);
        }
        oVar.p(j, j10, b0VarG);
    }

    public static /* synthetic */ void i(p196u0.d dVar, E e10, F f3, float f7, p196u0.g gVar, int i10) {
        if ((i10 & 4) != 0) {
            f7 = 1.0f;
        }
        float f10 = f7;
        p196u0.c cVar = gVar;
        if ((i10 & 8) != 0) {
            cVar = f.f22800b;
        }
        dVar.O(e10, f3, f10, cVar, (i10 & 32) != 0 ? 3 : 0);
    }

    public static void j(K k7, F f3, long j, long j10, float f7, p196u0.c cVar, int i10) {
        long j11 = (i10 & 2) != 0 ? 0L : j;
        long jB = (i10 & 4) != 0 ? b(k7.b(), j11) : j10;
        float f10 = (i10 & 8) != 0 ? 1.0f : f7;
        p196u0.c cVar2 = (i10 & 16) != 0 ? f.f22800b : cVar;
        b bVar = k7.f3942r;
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        bVar.f22794r.f22792c.o(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (jB >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jB & 4294967295L)) + Float.intBitsToFloat(i12), bVar.c(f3, cVar2, f10, null, 3, 1));
    }

    public static /* synthetic */ void k(p196u0.d dVar, long j, long j10, long j11, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = b(dVar.b(), j12);
        }
        dVar.f0((i10 & 64) != 0 ? 3 : 0, j, j12, j11);
    }

    public static void l(K k7, F f3, long j, long j10, long j11, p196u0.c cVar, int i10) {
        long j12 = (i10 & 2) != 0 ? 0L : j;
        long jB = (i10 & 4) != 0 ? b(k7.b(), j12) : j10;
        p196u0.c cVar2 = (i10 & 32) != 0 ? f.f22800b : cVar;
        b bVar = k7.f3942r;
        int i11 = (int) (j12 >> 32);
        int i12 = (int) (j12 & 4294967295L);
        bVar.f22794r.f22792c.k(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (jB >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jB & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), bVar.c(f3, cVar2, 1.0f, null, 3, 1));
    }

    public static /* synthetic */ int m(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static int n(int i10, float f3, int i11) {
        return (Float.floatToIntBits(f3) + i10) * i11;
    }

    public static int o(int i10, int i11, long j) {
        return (t.a(j) + i10) * i11;
    }

    public static ClassCastException p(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object q(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String r(int i10, String str) {
        return str + i10;
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static String t(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String u(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String v(StringBuilder sb, float f3, char c10) {
        sb.append(f3);
        sb.append(c10);
        return sb.toString();
    }

    public static StringBuilder w(int i10, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder x(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        sb.append(i11);
        sb.append(str3);
        return sb;
    }

    public static void y(int i10, C0698o c0698o, int i11, C0285h c0285h) {
        c0698o.e0(Integer.valueOf(i10));
        c0698o.c(Integer.valueOf(i11), c0285h);
    }

    public static /* synthetic */ void z(int i10, String str) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = j.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            j.i(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }
}
