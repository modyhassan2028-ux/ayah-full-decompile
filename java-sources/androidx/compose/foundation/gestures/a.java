package androidx.compose.foundation.gestures;

import A.E0;
import A.EnumC0047u0;
import A.F0;
import A.G0;
import A.H0;
import A.J0;
import A.b1;
import B.j;
import K.o0;
import l0.r;
import p232y.T;
import p251z9.s;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0 f11797a = new F0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E0 f11798b = new E0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G0 f11799c = new G0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(b1 b1Var, long j, c cVar) {
        H0 h7;
        s sVar;
        b1 b1Var2;
        if (cVar instanceof H0) {
            h7 = (H0) cVar;
            int i10 = h7.f61u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h7.f61u = i10 - Integer.MIN_VALUE;
            } else {
                h7 = new H0(cVar);
            }
        } else {
            h7 = new H0(cVar);
        }
        Object obj = h7.f60t;
        int i11 = h7.f61u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            sVar = new s();
            J0 j10 = new J0(b1Var, j, sVar, null, 0);
            h7.f58r = b1Var;
            h7.f59s = sVar;
            h7.f61u = 1;
            Object objF = b1Var.f(T.f24454r, j10, h7);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objF == aVar) {
                return aVar;
            }
            b1Var2 = b1Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s sVar2 = h7.f59s;
            b1 b1Var3 = h7.f58r;
            p110k9.a.e(obj);
            sVar = sVar2;
            b1Var2 = b1Var3;
        }
        return new p171r0.c(b1Var2.h(sVar.f24883r));
    }

    public static r b(o0 o0Var, EnumC0047u0 enumC0047u0, boolean z10, boolean z11, j jVar) {
        return new ScrollableElement(o0Var, enumC0047u0, z10, z11, jVar);
    }
}
