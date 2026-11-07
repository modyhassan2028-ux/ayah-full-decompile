package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0746u extends AbstractC0727a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0746u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0746u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f12442f;
    }

    public static AbstractC0746u d(Class cls) {
        AbstractC0746u abstractC0746u = defaultInstanceMap.get(cls);
        if (abstractC0746u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0746u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC0746u != null) {
            return abstractC0746u;
        }
        AbstractC0746u abstractC0746u2 = (AbstractC0746u) ((AbstractC0746u) j0.d(cls)).c(6);
        if (abstractC0746u2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0746u2);
        return abstractC0746u2;
    }

    public static Object e(Method method, AbstractC0746u abstractC0746u, Object... objArr) {
        try {
            return method.invoke(abstractC0746u, objArr);
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

    public static final boolean f(AbstractC0746u abstractC0746u, boolean z10) {
        byte bByteValue = ((Byte) abstractC0746u.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        T t2 = T.f12406c;
        t2.getClass();
        boolean zF = t2.a(abstractC0746u.getClass()).f(abstractC0746u);
        if (z10) {
            abstractC0746u.c(2);
        }
        return zF;
    }

    public static void j(Class cls, AbstractC0746u abstractC0746u) {
        abstractC0746u.h();
        defaultInstanceMap.put(cls, abstractC0746u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0727a
    public final int a(W w9) {
        int iH;
        int iH2;
        if (g()) {
            if (w9 == null) {
                T t2 = T.f12406c;
                t2.getClass();
                iH2 = t2.a(getClass()).h(this);
            } else {
                iH2 = w9.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(p123m2.c.r(iH2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (w9 == null) {
            T t10 = T.f12406c;
            t10.getClass();
            iH = t10.a(getClass()).h(this);
        } else {
            iH = w9.h(this);
        }
        k(iH);
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0727a
    public final void b(C0737k c0737k) {
        T t2 = T.f12406c;
        t2.getClass();
        W wA = t2.a(getClass());
        E e10 = c0737k.f12479d;
        if (e10 == null) {
            e10 = new E(c0737k);
        }
        wA.c(this, e10);
    }

    public abstract Object c(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t2 = T.f12406c;
        t2.getClass();
        return t2.a(getClass()).g(this, (AbstractC0746u) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            T t2 = T.f12406c;
            t2.getClass();
            return t2.a(getClass()).d(this);
        }
        if (this.memoizedHashCode == 0) {
            T t10 = T.f12406c;
            t10.getClass();
            this.memoizedHashCode = t10.a(getClass()).d(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0746u i() {
        return (AbstractC0746u) c(4);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(p123m2.c.r(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L.f12387a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
