package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f12472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f12473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f12474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f12476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f12477f;
    public static final boolean g;

    static {
        Unsafe unsafeI = i();
        f12472a = unsafeI;
        f12473b = AbstractC0729c.f12436a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        i0 h0Var = null;
        if (unsafeI != null) {
            if (!AbstractC0729c.a()) {
                h0Var = new h0(unsafeI);
            } else if (zH) {
                h0Var = new g0(unsafeI, 1);
            } else if (zH2) {
                h0Var = new g0(unsafeI, 0);
            }
        }
        f12474c = h0Var;
        f12475d = h0Var == null ? false : h0Var.r();
        f12476e = h0Var == null ? false : h0Var.q();
        f12477f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && h0Var != null) {
            h0Var.i(fieldG);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(j0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((f12474c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((f12474c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f12472a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int e(Class cls) {
        if (f12476e) {
            return f12474c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f12476e) {
            f12474c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0729c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!AbstractC0729c.a()) {
            return false;
        }
        try {
            Class cls2 = f12473b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b5) {
        f12474c.k(bArr, f12477f + j, b5);
    }

    public static void k(Object obj, long j, byte b5) {
        long j10 = (-4) & j;
        int iF = f12474c.f(j10, obj);
        int i10 = ((~((int) j)) & 3) << 3;
        m(obj, j10, ((255 & b5) << i10) | (iF & (~(255 << i10))));
    }

    public static void l(Object obj, long j, byte b5) {
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        m(obj, j10, ((255 & b5) << i10) | (f12474c.f(j10, obj) & (~(255 << i10))));
    }

    public static void m(Object obj, long j, int i10) {
        f12474c.n(obj, j, i10);
    }

    public static void n(Object obj, long j, long j10) {
        f12474c.o(obj, j, j10);
    }

    public static void o(long j, Object obj, Object obj2) {
        f12474c.p(j, obj, obj2);
    }
}
