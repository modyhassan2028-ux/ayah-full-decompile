package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17734b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f17735a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            f17734b = new a((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    public a(Unsafe unsafe) {
        this.f17735a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public final int e(q qVar, long j) {
        while (true) {
            int intVolatile = this.f17735a.getIntVolatile(qVar, j);
            q qVar2 = qVar;
            long j10 = j;
            if (this.f17735a.compareAndSwapInt(qVar2, j10, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j = j10;
        }
    }

    public final long i(Field field) {
        return this.f17735a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public final int a(Class cls) {
        return this.f17735a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f17735a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j) {
        return this.f17735a.getObjectVolatile(obj, j);
    }

    public final void j(Object obj, long j, l lVar) {
        this.f17735a.putObjectVolatile(obj, j, lVar);
    }

    public final boolean c(Object obj, long j, int i10, int i11) {
        return this.f17735a.compareAndSwapInt(obj, j, i10, i11);
    }

    public final boolean d(Object obj, long j, long j10, long j11) {
        return this.f17735a.compareAndSwapLong(obj, j, j10, j11);
    }
}
