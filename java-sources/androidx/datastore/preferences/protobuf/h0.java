package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends i0 {
    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j, Object obj) {
        return this.f12471a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j, Object obj) {
        return this.f12471a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j, Object obj) {
        return this.f12471a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j, boolean z10) {
        this.f12471a.putBoolean(obj, j, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j, byte b5) {
        this.f12471a.putByte(obj, j, b5);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j, double d5) {
        this.f12471a.putDouble(obj, j, d5);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j, float f3) {
        this.f12471a.putFloat(obj, j, f3);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f12471a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            j0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        Unsafe unsafe = this.f12471a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (j0.g() != null) {
                    try {
                        Class<?> cls3 = this.f12471a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        j0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                j0.a(th2);
            }
        }
        return false;
    }
}
