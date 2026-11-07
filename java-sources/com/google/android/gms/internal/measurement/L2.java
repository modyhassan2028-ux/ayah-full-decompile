package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0818g2 f14066a;

    static {
        H2 h7 = H2.f14042c;
        f14066a = new C0818g2(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) obj;
        O2 o10 = abstractC0828i2.zzc;
        O2 o11 = ((AbstractC0828i2) obj2).zzc;
        O2 o12 = O2.f14091f;
        if (!o12.equals(o11)) {
            if (o12.equals(o10)) {
                int i10 = o10.f14092a + o11.f14092a;
                int[] iArrCopyOf = Arrays.copyOf(o10.f14093b, i10);
                System.arraycopy(o11.f14093b, 0, iArrCopyOf, o10.f14092a, o11.f14092a);
                Object[] objArrCopyOf = Arrays.copyOf(o10.f14094c, i10);
                System.arraycopy(o11.f14094c, 0, objArrCopyOf, o10.f14092a, o11.f14092a);
                o10 = new O2(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                o10.getClass();
                if (!o11.equals(o12)) {
                    if (!o10.f14096e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = o10.f14092a + o11.f14092a;
                    o10.e(i11);
                    System.arraycopy(o11.f14093b, 0, o10.f14093b, o10.f14092a, o11.f14092a);
                    System.arraycopy(o11.f14094c, 0, o10.f14094c, o10.f14092a, o11.f14092a);
                    o10.f14092a = i11;
                }
            }
        }
        abstractC0828i2.zzc = o10;
    }

    public static void c(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0788a2.m0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()), i10);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        c0788a2.q0(i12);
        while (i11 < list.size()) {
            c0788a2.t0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void d(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                c0788a2.k0(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        c0788a2.q0(i12);
        while (i11 < list.size()) {
            c0788a2.r0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void e(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0897w2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.l0(((Long) list.get(i11)).longValue(), i10);
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += C0788a2.f0(((Long) list.get(i12)).longValue());
            }
            c0788a2.q0(iF0);
            while (i11 < list.size()) {
                c0788a2.s0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        if (!z10) {
            while (i11 < c0897w2.f14501t) {
                c0788a2.l0(c0897w2.c(i11), i10);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iF1 = 0;
        for (int i13 = 0; i13 < c0897w2.f14501t; i13++) {
            iF1 += C0788a2.f0(c0897w2.c(i13));
        }
        c0788a2.q0(iF1);
        while (i11 < c0897w2.f14501t) {
            c0788a2.s0(c0897w2.c(i11));
            i11++;
        }
    }

    public static void f(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0897w2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.l0(((Long) list.get(i11)).longValue(), i10);
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += C0788a2.f0(((Long) list.get(i12)).longValue());
            }
            c0788a2.q0(iF0);
            while (i11 < list.size()) {
                c0788a2.s0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        if (!z10) {
            while (i11 < c0897w2.f14501t) {
                c0788a2.l0(c0897w2.c(i11), i10);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iF1 = 0;
        for (int i13 = 0; i13 < c0897w2.f14501t; i13++) {
            iF1 += C0788a2.f0(c0897w2.c(i13));
        }
        c0788a2.q0(iF1);
        while (i11 < c0897w2.f14501t) {
            c0788a2.s0(c0897w2.c(i11));
            i11++;
        }
    }

    public static void g(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0897w2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    c0788a2.l0((jLongValue >> 63) ^ (jLongValue + jLongValue), i10);
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iF0 += C0788a2.f0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            c0788a2.q0(iF0);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                c0788a2.s0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        if (!z10) {
            while (i11 < c0897w2.f14501t) {
                long jC = c0897w2.c(i11);
                c0788a2.l0((jC >> 63) ^ (jC + jC), i10);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iF1 = 0;
        for (int i13 = 0; i13 < c0897w2.f14501t; i13++) {
            long jC2 = c0897w2.c(i13);
            iF1 += C0788a2.f0((jC2 >> 63) ^ (jC2 + jC2));
        }
        c0788a2.q0(iF1);
        while (i11 < c0897w2.f14501t) {
            long jC3 = c0897w2.c(i11);
            c0788a2.s0((jC3 >> 63) ^ (jC3 + jC3));
            i11++;
        }
    }

    public static void h(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0897w2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.m0(((Long) list.get(i11)).longValue(), i10);
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            c0788a2.q0(i12);
            while (i11 < list.size()) {
                c0788a2.t0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        if (!z10) {
            while (i11 < c0897w2.f14501t) {
                c0788a2.m0(c0897w2.c(i11), i10);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0897w2.f14501t; i15++) {
            c0897w2.c(i15);
            i14 += 8;
        }
        c0788a2.q0(i14);
        while (i11 < c0897w2.f14501t) {
            c0788a2.t0(c0897w2.c(i11));
            i11++;
        }
    }

    public static void i(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0897w2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.m0(((Long) list.get(i11)).longValue(), i10);
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            c0788a2.q0(i12);
            while (i11 < list.size()) {
                c0788a2.t0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        if (!z10) {
            while (i11 < c0897w2.f14501t) {
                c0788a2.m0(c0897w2.c(i11), i10);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0897w2.f14501t; i15++) {
            c0897w2.c(i15);
            i14 += 8;
        }
        c0788a2.q0(i14);
        while (i11 < c0897w2.f14501t) {
            c0788a2.t0(c0897w2.c(i11));
            i11++;
        }
    }

    public static void j(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0833j2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.i0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += C0788a2.f0(((Integer) list.get(i12)).intValue());
            }
            c0788a2.q0(iF0);
            while (i11 < list.size()) {
                c0788a2.p0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        if (!z10) {
            while (i11 < c0833j2.f14342t) {
                c0788a2.i0(i10, c0833j2.d(i11));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iF1 = 0;
        for (int i13 = 0; i13 < c0833j2.f14342t; i13++) {
            iF1 += C0788a2.f0(c0833j2.d(i13));
        }
        c0788a2.q0(iF1);
        while (i11 < c0833j2.f14342t) {
            c0788a2.p0(c0833j2.d(i11));
            i11++;
        }
    }

    public static void k(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0833j2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.j0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iW0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW0 += C0788a2.w0(((Integer) list.get(i12)).intValue());
            }
            c0788a2.q0(iW0);
            while (i11 < list.size()) {
                c0788a2.q0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        if (!z10) {
            while (i11 < c0833j2.f14342t) {
                c0788a2.j0(i10, c0833j2.d(i11));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iW1 = 0;
        for (int i13 = 0; i13 < c0833j2.f14342t; i13++) {
            iW1 += C0788a2.w0(c0833j2.d(i13));
        }
        c0788a2.q0(iW1);
        while (i11 < c0833j2.f14342t) {
            c0788a2.q0(c0833j2.d(i11));
            i11++;
        }
    }

    public static void l(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0833j2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    c0788a2.j0(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iW0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iW0 += C0788a2.w0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c0788a2.q0(iW0);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                c0788a2.q0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        if (!z10) {
            while (i11 < c0833j2.f14342t) {
                int iD = c0833j2.d(i11);
                c0788a2.j0(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iW1 = 0;
        for (int i13 = 0; i13 < c0833j2.f14342t; i13++) {
            int iD2 = c0833j2.d(i13);
            iW1 += C0788a2.w0((iD2 >> 31) ^ (iD2 + iD2));
        }
        c0788a2.q0(iW1);
        while (i11 < c0833j2.f14342t) {
            int iD3 = c0833j2.d(i11);
            c0788a2.q0((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    public static void m(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0833j2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.k0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            c0788a2.q0(i12);
            while (i11 < list.size()) {
                c0788a2.r0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        if (!z10) {
            while (i11 < c0833j2.f14342t) {
                c0788a2.k0(i10, c0833j2.d(i11));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0833j2.f14342t; i15++) {
            c0833j2.d(i15);
            i14 += 4;
        }
        c0788a2.q0(i14);
        while (i11 < c0833j2.f14342t) {
            c0788a2.r0(c0833j2.d(i11));
            i11++;
        }
    }

    public static void n(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0833j2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.k0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            c0788a2.q0(i12);
            while (i11 < list.size()) {
                c0788a2.r0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        if (!z10) {
            while (i11 < c0833j2.f14342t) {
                c0788a2.k0(i10, c0833j2.d(i11));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0833j2.f14342t; i15++) {
            c0833j2.d(i15);
            i14 += 4;
        }
        c0788a2.q0(i14);
        while (i11 < c0833j2.f14342t) {
            c0788a2.r0(c0833j2.d(i11));
            i11++;
        }
    }

    public static void o(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!(list instanceof C0833j2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    c0788a2.i0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0788a2.h0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += C0788a2.f0(((Integer) list.get(i12)).intValue());
            }
            c0788a2.q0(iF0);
            while (i11 < list.size()) {
                c0788a2.p0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        if (!z10) {
            while (i11 < c0833j2.f14342t) {
                c0788a2.i0(i10, c0833j2.d(i11));
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int iF1 = 0;
        for (int i13 = 0; i13 < c0833j2.f14342t; i13++) {
            iF1 += C0788a2.f0(c0833j2.d(i13));
        }
        c0788a2.q0(iF1);
        while (i11 < c0833j2.f14342t) {
            c0788a2.p0(c0833j2.d(i11));
            i11++;
        }
    }

    public static void p(int i10, List list, C0902x2 c0902x2, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                c0788a2.q0(i10 << 3);
                c0788a2.o0(zBooleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        c0788a2.h0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        c0788a2.q0(i12);
        while (i11 < list.size()) {
            c0788a2.o0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0897w2)) {
            int iF0 = 0;
            while (i10 < size) {
                iF0 += C0788a2.f0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iF0;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        int iF1 = 0;
        while (i10 < size) {
            iF1 += C0788a2.f0(c0897w2.c(i10));
            i10++;
        }
        return iF1;
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0897w2)) {
            int iF0 = 0;
            while (i10 < size) {
                iF0 += C0788a2.f0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iF0;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        int iF1 = 0;
        while (i10 < size) {
            iF1 += C0788a2.f0(c0897w2.c(i10));
            i10++;
        }
        return iF1;
    }

    public static int s(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0897w2)) {
            int iF0 = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iF0 += C0788a2.f0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iF0;
        }
        C0897w2 c0897w2 = (C0897w2) list;
        int iF1 = 0;
        while (i10 < size) {
            long jC = c0897w2.c(i10);
            iF1 += C0788a2.f0((jC >> 63) ^ (jC + jC));
            i10++;
        }
        return iF1;
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0833j2)) {
            int iF0 = 0;
            while (i10 < size) {
                iF0 += C0788a2.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iF0;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        int iF1 = 0;
        while (i10 < size) {
            iF1 += C0788a2.f0(c0833j2.d(i10));
            i10++;
        }
        return iF1;
    }

    public static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0833j2)) {
            int iF0 = 0;
            while (i10 < size) {
                iF0 += C0788a2.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iF0;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        int iF1 = 0;
        while (i10 < size) {
            iF1 += C0788a2.f0(c0833j2.d(i10));
            i10++;
        }
        return iF1;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0833j2)) {
            int iW0 = 0;
            while (i10 < size) {
                iW0 += C0788a2.w0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iW0;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        int iW1 = 0;
        while (i10 < size) {
            iW1 += C0788a2.w0(c0833j2.d(i10));
            i10++;
        }
        return iW1;
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0833j2)) {
            int iW0 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iW0 += C0788a2.w0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iW0;
        }
        C0833j2 c0833j2 = (C0833j2) list;
        int iW1 = 0;
        while (i10 < size) {
            int iD = c0833j2.d(i10);
            iW1 += C0788a2.w0((iD >> 31) ^ (iD + iD));
            i10++;
        }
        return iW1;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0788a2.w0(i10 << 3) + 4) * size;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0788a2.w0(i10 << 3) + 8) * size;
    }
}
