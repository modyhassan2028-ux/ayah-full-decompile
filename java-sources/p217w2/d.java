package p217w2;

import N9.InterfaceC0415h;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import p150o9.c;
import p150o9.i;
import p207v2.C1371i;
import p207v2.C1372j;
import p207v2.C1374l;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1374l f23644a;

    static {
        C1372j c1372j = new C1372j(false);
        f23644a = new C1374l(C1371i.f23250b, c1372j, c1372j);
    }

    public static final b a(InterfaceC0415h interfaceC0415h, C0698o c0698o) {
        c0698o.U(388053246);
        c0698o.U(1046463091);
        boolean zG = c0698o.g(interfaceC0415h);
        Object objH = c0698o.H();
        Object obj = C0690k.f10683a;
        if (zG || objH == obj) {
            objH = new b(interfaceC0415h);
            c0698o.e0(objH);
        }
        b bVar = (b) objH;
        c0698o.p(false);
        c0698o.U(1046463169);
        Object obj2 = i.f20380r;
        boolean zI = c0698o.i(obj2) | c0698o.i(bVar);
        Object objH2 = c0698o.H();
        c cVar = null;
        if (zI || objH2 == obj) {
            objH2 = new c(bVar, cVar, 1);
            c0698o.e0(objH2);
        }
        c0698o.p(false);
        C0672b.f(c0698o, bVar, (e) objH2);
        c0698o.U(1046463438);
        boolean zI2 = c0698o.i(obj2) | c0698o.i(bVar);
        Object objH3 = c0698o.H();
        if (zI2 || objH3 == obj) {
            objH3 = new c(bVar, cVar, 3);
            c0698o.e0(objH3);
        }
        c0698o.p(false);
        C0672b.f(c0698o, bVar, (e) objH3);
        c0698o.p(false);
        return bVar;
    }
}
