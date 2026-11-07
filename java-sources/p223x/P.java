package p223x;

import B9.a;
import E9.d;
import p110k9.y;
import p120l9.l;
import p241y9.c;
import p251z9.k;
import u.A;

/* JADX INFO: loaded from: classes.dex */
public final class P extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f23872s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(X x9, int i10) {
        super(1);
        this.f23871r = i10;
        this.f23872s = x9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23871r) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                X x9 = this.f23872s;
                long j = jLongValue - x9.f23909C;
                x9.f23909C = jLongValue;
                long jW = a.W(j / ((double) x9.f23913G));
                A a9 = x9.f23910D;
                if (a9.h()) {
                    Object[] objArr = a9.f22650a;
                    int i10 = a9.f22651b;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        O o10 = (O) objArr[i12];
                        X.q(x9, o10, jW);
                        o10.f23866c = true;
                    }
                    q0 q0Var = x9.f23918v;
                    if (q0Var != null) {
                        q0Var.o();
                    }
                    int i13 = a9.f22651b;
                    Object[] objArr2 = a9.f22650a;
                    d dVarI0 = B0.c.i0(0, i13);
                    int i14 = dVarI0.f1995r;
                    int i15 = dVarI0.f1996s;
                    if (i14 <= i15) {
                        while (true) {
                            objArr2[i14 - i11] = objArr2[i14];
                            if (((O) objArr2[i14]).f23866c) {
                                i11++;
                            }
                            if (i14 != i15) {
                                i14++;
                            }
                        }
                    }
                    l.e0(i13 - i11, i13, null, objArr2);
                    a9.f22651b -= i11;
                }
                O o11 = x9.f23911E;
                if (o11 != null) {
                    o11.g = x9.f23919w;
                    X.q(x9, o11, jW);
                    x9.y(o11.f23867d);
                    if (o11.f23867d == 1.0f) {
                        x9.f23911E = null;
                    }
                    x9.x();
                }
                break;
            default:
                this.f23872s.f23909C = ((Number) obj).longValue();
                break;
        }
        return y.f19095a;
    }
}
