package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f14128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f14129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S2 f14130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f14131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f14132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f14133f;
    public static final boolean g;

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        char c10;
        boolean z10;
        S2 s10;
        Unsafe unsafeL = l();
        f14128a = unsafeL;
        int i10 = V1.f14144a;
        f14129b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zM = m(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        S2 q10 = null;
        if (unsafeL != null) {
            if (zM) {
                q10 = new R2(unsafeL);
            } else if (zM2) {
                q10 = new Q2(unsafeL);
            }
        }
        f14130c = q10;
        boolean z11 = false;
        if (q10 == null) {
            c10 = 0;
        } else {
            try {
                Class<?> cls3 = q10.f14127a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    z11 = true;
                }
            } catch (Throwable th) {
                c10 = 0;
                Logger.getLogger(T2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                z11 = false;
            }
        }
        f14131d = z11;
        S2 s11 = f14130c;
        if (s11 == null) {
            z10 = c10;
        } else {
            try {
                Class<?> cls4 = s11.f14127a.getClass();
                Class<?>[] clsArr = new Class[1];
                clsArr[c10] = Field.class;
                cls4.getMethod("objectFieldOffset", clsArr);
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[c10] = Class.class;
                cls4.getMethod("arrayBaseOffset", clsArr2);
                Class<?>[] clsArr3 = new Class[1];
                clsArr3[c10] = Class.class;
                cls4.getMethod("arrayIndexScale", clsArr3);
                Class<?>[] clsArr4 = new Class[2];
                clsArr4[c10] = Object.class;
                clsArr4[1] = cls;
                cls4.getMethod("getInt", clsArr4);
                Class<?>[] clsArr5 = new Class[3];
                clsArr5[c10] = Object.class;
                clsArr5[1] = cls;
                clsArr5[2] = cls2;
                cls4.getMethod("putInt", clsArr5);
                Class<?>[] clsArr6 = new Class[2];
                clsArr6[c10] = Object.class;
                clsArr6[1] = cls;
                cls4.getMethod("getLong", clsArr6);
                Class<?>[] clsArr7 = new Class[3];
                clsArr7[c10] = Object.class;
                clsArr7[1] = cls;
                clsArr7[2] = cls;
                cls4.getMethod("putLong", clsArr7);
                Class<?>[] clsArr8 = new Class[2];
                clsArr8[c10] = Object.class;
                clsArr8[1] = cls;
                cls4.getMethod("getObject", clsArr8);
                Class<?>[] clsArr9 = new Class[3];
                clsArr9[c10] = Object.class;
                clsArr9[1] = cls;
                clsArr9[2] = Object.class;
                cls4.getMethod("putObject", clsArr9);
                z10 = 1;
            } catch (Throwable th2) {
                Logger.getLogger(T2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z10 = c10;
            }
        }
        f14132e = z10;
        f14133f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (s10 = f14130c) != null) {
            s10.f14127a.objectFieldOffset(fieldB);
        }
        g = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN ? c10 : 1;
    }

    public static void a(Class cls) {
        if (f14132e) {
            f14130c.f14127a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i10 = V1.f14144a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void c(Object obj, long j, byte b5) {
        Unsafe unsafe = f14130c.f14127a;
        long j10 = (-4) & j;
        int i10 = unsafe.getInt(obj, j10);
        int i11 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b5) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j, byte b5) {
        Unsafe unsafe = f14130c.f14127a;
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b5) << i10) | (unsafe.getInt(obj, j10) & (~(255 << i10))));
    }

    public static Object e(Class cls) {
        try {
            return f14128a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int f(long j, Object obj) {
        return f14130c.f14127a.getInt(obj, j);
    }

    public static void g(Object obj, long j, int i10) {
        f14130c.f14127a.putInt(obj, j, i10);
    }

    public static long h(long j, Object obj) {
        return f14130c.f14127a.getLong(obj, j);
    }

    public static void i(Object obj, long j, long j10) {
        f14130c.f14127a.putLong(obj, j, j10);
    }

    public static Object j(long j, Object obj) {
        return f14130c.f14127a.getObject(obj, j);
    }

    public static void k(long j, Object obj, Object obj2) {
        f14130c.f14127a.putObject(obj, j, obj2);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new P2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        int i10 = V1.f14144a;
        try {
            Class cls2 = f14129b;
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

    public static /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((f14130c.f14127a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(long j, Object obj) {
        return ((byte) ((f14130c.f14127a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f14132e) {
            return f14130c.f14127a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
