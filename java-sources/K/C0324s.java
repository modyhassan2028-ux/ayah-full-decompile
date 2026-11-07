package K;

import U0.C0515g;

/* JADX INFO: renamed from: K.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0324s extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0 f4773s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0324s(w0 w0Var, int i10) {
        super(0);
        this.f4772r = i10;
        this.f4773s = w0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        U0.H h7;
        switch (this.f4772r) {
            case 0:
                w0 w0Var = this.f4773s;
                return Boolean.valueOf(w0Var != null ? ((Boolean) new C0324s(w0Var, 2).invoke()).booleanValue() : false);
            case 1:
                w0 w0Var2 = this.f4773s;
                return Boolean.valueOf(w0Var2 != null ? ((Boolean) new C0324s(w0Var2, 2).invoke()).booleanValue() : false);
            default:
                w0 w0Var3 = this.f4773s;
                C0515g c0515g = w0Var3.f4813b;
                U0.I i10 = (U0.I) w0Var3.f4812a.getValue();
                return Boolean.valueOf(p251z9.j.a(c0515g, (i10 == null || (h7 = i10.f8023a) == null) ? null : h7.f8015a));
        }
    }
}
