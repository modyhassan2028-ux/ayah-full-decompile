package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f12416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f12417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f12418c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t2 = T.f12406c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f12416a = cls;
        try {
            T t10 = T.f12406c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f12417b = e0Var;
        f12418c = new e0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB0 += C0737k.b0(((Integer) list.get(i10)).intValue());
        }
        return iB0;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0737k.Z(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0737k.Z(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB0 += C0737k.b0(((Integer) list.get(i10)).intValue());
        }
        return iB0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB0 += C0737k.b0(((Long) list.get(i10)).longValue());
        }
        return iB0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iA0 += C0737k.a0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iA0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iB0 += C0737k.b0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iB0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA0 += C0737k.a0(((Integer) list.get(i10)).intValue());
        }
        return iA0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iB0 += C0737k.b0(((Long) list.get(i10)).longValue());
        }
        return iB0;
    }

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
    public static void k(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0746u abstractC0746u = (AbstractC0746u) obj;
        d0 d0Var = abstractC0746u.unknownFields;
        d0 d0Var2 = ((AbstractC0746u) obj2).unknownFields;
        d0 d0Var3 = d0.f12442f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i10 = d0Var.f12443a + d0Var2.f12443a;
                int[] iArrCopyOf = Arrays.copyOf(d0Var.f12444b, i10);
                System.arraycopy(d0Var2.f12444b, 0, iArrCopyOf, d0Var.f12443a, d0Var2.f12443a);
                Object[] objArrCopyOf = Arrays.copyOf(d0Var.f12445c, i10);
                System.arraycopy(d0Var2.f12445c, 0, objArrCopyOf, d0Var.f12443a, d0Var2.f12443a);
                d0Var = new d0(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f12447e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = d0Var.f12443a + d0Var2.f12443a;
                    d0Var.a(i11);
                    System.arraycopy(d0Var2.f12444b, 0, d0Var.f12444b, d0Var.f12443a, d0Var2.f12443a);
                    System.arraycopy(d0Var2.f12445c, 0, d0Var.f12445c, d0Var.f12443a, d0Var2.f12443a);
                    d0Var.f12443a = i11;
                }
            }
        }
        abstractC0746u.unknownFields = d0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.g0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12++;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.e0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void n(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                c0737k.getClass();
                c0737k.l0(Double.doubleToRawLongBits(dDoubleValue), i10);
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12 += 8;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.m0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void o(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB0 += C0737k.b0(((Integer) list.get(i12)).intValue());
        }
        c0737k.u0(iB0);
        while (i11 < list.size()) {
            c0737k.o0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void p(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12 += 4;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void q(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.l0(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12 += 8;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.m0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void r(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                c0737k.getClass();
                c0737k.j0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12 += 4;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.k0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB0 += C0737k.b0(((Integer) list.get(i12)).intValue());
        }
        c0737k.u0(iB0);
        while (i11 < list.size()) {
            c0737k.o0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.v0(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB0 += C0737k.b0(((Long) list.get(i12)).longValue());
        }
        c0737k.u0(iB0);
        while (i11 < list.size()) {
            c0737k.w0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12 += 4;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void v(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.l0(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = C0737k.f12478i;
            i12 += 8;
        }
        c0737k.u0(i12);
        while (i11 < list.size()) {
            c0737k.m0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void w(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                c0737k.t0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iA0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iA0 += C0737k.a0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0737k.u0(iA0);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            c0737k.u0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void x(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                c0737k.v0((jLongValue >> 63) ^ (jLongValue << 1), i10);
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iB0 += C0737k.b0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0737k.u0(iB0);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            c0737k.w0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.t0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iA0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA0 += C0737k.a0(((Integer) list.get(i12)).intValue());
        }
        c0737k.u0(iA0);
        while (i11 < list.size()) {
            c0737k.u0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void z(int i10, List list, E e10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0737k c0737k = (C0737k) e10.f12378a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0737k.v0(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
            return;
        }
        c0737k.s0(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB0 += C0737k.b0(((Long) list.get(i12)).longValue());
        }
        c0737k.u0(iB0);
        while (i11 < list.size()) {
            c0737k.w0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static Object j(Object obj, int i10, InterfaceC0747v interfaceC0747v, Object obj2, e0 e0Var) {
        return obj2;
    }
}
