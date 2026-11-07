package p207v2;

import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import X1.c;
import p241y9.e;
import p251z9.j;

/* JADX INFO: renamed from: v2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1367e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f23227a = new Object();

    public static final boolean a(n0 n0Var, n0 n0Var2, EnumC1375m enumC1375m) {
        j.e(n0Var, "<this>");
        if (n0Var2 == null || ((n0Var2 instanceof m0) && (n0Var instanceof l0))) {
            return true;
        }
        if ((n0Var instanceof m0) && (n0Var2 instanceof l0)) {
            return false;
        }
        return (n0Var.f23274c == n0Var2.f23274c && n0Var.f23275d == n0Var2.f23275d && n0Var2.a(enumC1375m) <= n0Var.a(enumC1375m)) ? false : true;
    }

    public static final InterfaceC0415h b(e eVar) {
        return AbstractC0419l.g(new C4.e(new c(eVar, null, 2)), -2);
    }
}
