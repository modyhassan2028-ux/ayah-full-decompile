package A;

import Z.C0675c0;

/* JADX INFO: loaded from: classes.dex */
public final class X0 implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f168c;

    public /* synthetic */ X0(int i10, Object obj, Object obj2) {
        this.f166a = i10;
        this.f167b = obj;
        this.f168c = obj2;
    }

    @Override // A.C0
    public final float a(float f3) {
        switch (this.f166a) {
            case 0:
                b1 b1Var = (b1) this.f167b;
                if (Math.abs(f3) != 0.0f && ((f3 > 0.0f && !b1Var.f193a.d()) || ((f3 < 0.0f && !b1Var.f193a.b()) || !((Boolean) b1Var.g.invoke()).booleanValue()))) {
                    throw new Z("The fling animation was cancelled", 0);
                }
                return b1Var.d(b1Var.g(((Z0) this.f168c).a(b1Var.e(b1Var.h(f3)), 2)));
            default:
                return ((C0) this.f167b).a(f3);
        }
    }

    public int b() {
        return ((C0675c0) ((F.A) this.f168c).f2012d.f1158s).g();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public int c() {
        F.s sVar = (F.s) p120l9.m.n0(((F.A) this.f168c).g().f2103k);
        if (sVar != null) {
            return sVar.f2110a;
        }
        return 0;
    }
}
