package androidx.datastore.preferences.protobuf;

import I1.AbstractC0244b0;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static d0 a(Object obj) {
        AbstractC0746u abstractC0746u = (AbstractC0746u) obj;
        d0 d0Var = abstractC0746u.unknownFields;
        if (d0Var != d0.f12442f) {
            return d0Var;
        }
        d0 d0Var2 = new d0(0, new int[8], new Object[8], true);
        abstractC0746u.unknownFields = d0Var2;
        return d0Var2;
    }

    public static boolean b(int i10, E2.A a9, Object obj) throws C0750y {
        int i11 = a9.f1434b;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) a9.f1437e;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            a9.E(0);
            ((d0) obj).c(i12 << 3, Long.valueOf(abstractC0244b0.s()));
            return true;
        }
        if (i13 == 1) {
            a9.E(1);
            ((d0) obj).c((i12 << 3) | 1, Long.valueOf(abstractC0244b0.o()));
            return true;
        }
        if (i13 == 2) {
            ((d0) obj).c((i12 << 3) | 2, a9.m());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw C0750y.b();
            }
            a9.E(5);
            ((d0) obj).c(5 | (i12 << 3), Integer.valueOf(abstractC0244b0.n()));
            return true;
        }
        d0 d0Var = new d0(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new C0750y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (a9.g() != Integer.MAX_VALUE && b(i16, a9, d0Var)) {
        }
        if (i15 != a9.f1434b) {
            throw new C0750y("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f12447e) {
            d0Var.f12447e = false;
        }
        ((d0) obj).c(i14 | 3, d0Var);
        return true;
    }
}
