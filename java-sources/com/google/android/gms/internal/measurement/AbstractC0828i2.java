package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0828i2 extends T1 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected O2 zzc;

    public AbstractC0828i2() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = O2.f14091f;
    }

    public static AbstractC0828i2 l(Class cls) {
        Map map = zzd;
        AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) map.get(cls);
        if (abstractC0828i2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0828i2 = (AbstractC0828i2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC0828i2 != null) {
            return abstractC0828i2;
        }
        AbstractC0828i2 abstractC0828i3 = (AbstractC0828i2) ((AbstractC0828i2) T2.e(cls)).o(6);
        if (abstractC0828i3 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC0828i3);
        return abstractC0828i3;
    }

    public static void m(Class cls, AbstractC0828i2 abstractC0828i2) {
        abstractC0828i2.f();
        zzd.put(cls, abstractC0828i2);
    }

    public static Object n(Method method, AbstractC0828i2 abstractC0828i2, Object... objArr) {
        try {
            return method.invoke(abstractC0828i2, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final int b(K2 k7) {
        if (e()) {
            int iE = k7.e(this);
            if (iE >= 0) {
                return iE;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iE).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iE);
            throw new IllegalStateException(sb.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iE2 = k7.e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iE2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iE2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void d(C0788a2 c0788a2) {
        K2 k2A = H2.f14042c.a(getClass());
        C0902x2 c0902x2 = c0788a2.f14196f;
        if (c0902x2 == null) {
            c0902x2 = new C0902x2(c0788a2);
        }
        k2A.g(this, c0902x2);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return H2.f14042c.a(getClass()).i(this, (AbstractC0828i2) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        H2.f14042c.a(getClass()).b(this);
        f();
    }

    public final AbstractC0823h2 h() {
        return (AbstractC0823h2) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return H2.f14042c.a(getClass()).f(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iF = H2.f14042c.a(getClass()).f(this);
        this.zza = iF;
        return iF;
    }

    public final AbstractC0823h2 i() {
        AbstractC0823h2 abstractC0823h2 = (AbstractC0823h2) o(5);
        abstractC0823h2.f(this);
        return abstractC0823h2;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iE = H2.f14042c.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iE).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iE);
            throw new IllegalStateException(sb.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iE2 = H2.f14042c.a(getClass()).e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iE2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iE2);
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Object o(int i10);

    public final String toString() {
        String string = super.toString();
        char[] cArr = C2.f13999a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C2.b(this, sb, 0);
        return sb.toString();
    }
}
