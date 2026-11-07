package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.C0670a;
import Z.C0699o0;
import Z.InterfaceC0674c;
import Z.u0;
import p011b0.e;
import p241y9.a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f11112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f11113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f11114f;
    public static final r g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11115c;

    static {
        int i10 = 1;
        f11112d = new r(i10, 2, 0);
        int i11 = 1;
        f11113e = new r(i11, i11, 1);
        f11114f = new r(i10, 2, 2);
        int i12 = 1;
        g = new r(i12, i12, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11, int i12) {
        super(i10, i11);
        this.f11115c = i12;
    }

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        int iC;
        int iO;
        switch (this.f11115c) {
            case 0:
                Object objInvoke = ((a) a9.i(0)).invoke();
                C0670a c0670a = (C0670a) a9.i(1);
                int iH = a9.h(0);
                c0670a.getClass();
                a10.S(a10.c(c0670a), objInvoke);
                interfaceC0674c.m(iH, objInvoke);
                interfaceC0674c.g(objInvoke);
                break;
            case 1:
                C0670a c0670a2 = (C0670a) a9.i(0);
                int iH2 = a9.h(0);
                interfaceC0674c.u();
                c0670a2.getClass();
                interfaceC0674c.f(iH2, a10.B(a10.c(c0670a2)));
                break;
            case 2:
                Object objI = a9.i(0);
                C0670a c0670a3 = (C0670a) a9.i(1);
                int iH3 = a9.h(0);
                if (objI instanceof u0) {
                    ((e) hVar.f1923c).b((u0) objI);
                }
                int iC2 = a10.c(c0670a3);
                int iG = a10.g(a10.L(iC2, iH3));
                Object[] objArr = a10.f10562c;
                Object obj = objArr[iG];
                objArr[iG] = objI;
                if (obj instanceof u0) {
                    int iO2 = a10.o() - a10.L(iC2, iH3);
                    u0 u0Var = (u0) obj;
                    C0670a c0670a4 = u0Var.f10831b;
                    if (c0670a4 == null || !c0670a4.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = a10.c(c0670a4);
                        iO = a10.o() - a10.M(iC);
                    }
                    hVar.f(u0Var, iO2, iC, iO);
                } else if (obj instanceof C0699o0) {
                    ((C0699o0) obj).d();
                }
                break;
            default:
                Object objI2 = a9.i(0);
                int iH4 = a9.h(0);
                if (objI2 instanceof u0) {
                    ((e) hVar.f1923c).b((u0) objI2);
                }
                int iG2 = a10.g(a10.L(a10.f10577t, iH4));
                Object[] objArr2 = a10.f10562c;
                Object obj2 = objArr2[iG2];
                objArr2[iG2] = objI2;
                if (obj2 instanceof u0) {
                    hVar.f((u0) obj2, a10.o() - a10.L(a10.f10577t, iH4), -1, -1);
                } else if (obj2 instanceof C0699o0) {
                    ((C0699o0) obj2).d();
                }
                break;
        }
    }
}
