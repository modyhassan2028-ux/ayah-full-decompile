package p223x;

import A.k1;
import D0.C0086d;
import M9.i;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.L0;
import Z.X;
import p185s8.u0;
import p241y9.a;
import p241y9.e;

/* JADX INFO: renamed from: x.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1415e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23965a = 0;

    static {
        Object obj = E0.f23847a;
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final L0 a(Object obj, v0 v0Var, InterfaceC1421j interfaceC1421j, String str, C0698o c0698o, int i10) {
        Object objH = c0698o.H();
        Object obj2 = C0690k.f10683a;
        if (objH == obj2) {
            objH = C0672b.r(null);
            c0698o.e0(objH);
        }
        X x9 = (X) objH;
        Object objH2 = c0698o.H();
        if (objH2 == obj2) {
            objH2 = new C1411c(obj, v0Var, null);
            c0698o.e0(objH2);
        }
        C1411c c1411c = (C1411c) objH2;
        X xU = C0672b.u(null, c0698o);
        X xU2 = C0672b.u(interfaceC1421j, c0698o);
        Object objH3 = c0698o.H();
        if (objH3 == obj2) {
            objH3 = u0.a(-1, 6, null);
            c0698o.e0(objH3);
        }
        i iVar = (i) objH3;
        boolean zI = c0698o.i(iVar) | c0698o.i(obj);
        Object objH4 = c0698o.H();
        if (zI || objH4 == obj2) {
            objH4 = new C0086d(24, iVar, obj);
            c0698o.e0(objH4);
        }
        C0672b.h((a) objH4, c0698o);
        boolean zI2 = c0698o.i(iVar) | c0698o.i(c1411c) | c0698o.g(xU2) | c0698o.g(xU);
        Object objH5 = c0698o.H();
        if (zI2 || objH5 == obj2) {
            Object k1Var = new k1(iVar, c1411c, xU2, xU, null);
            c0698o.e0(k1Var);
            objH5 = k1Var;
        }
        C0672b.f(c0698o, iVar, (e) objH5);
        L0 l10 = (L0) x9.getValue();
        return l10 == null ? c1411c.f23943c : l10;
    }
}
