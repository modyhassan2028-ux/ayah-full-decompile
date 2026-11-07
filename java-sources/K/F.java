package K;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4467r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4470u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(O.N n6, boolean z10, int i10) {
        super(2);
        this.f4470u = n6;
        this.f4468s = z10;
        this.f4469t = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4467r;
        C0698o c0698o = (C0698o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                T.j((O.N) this.f4470u, this.f4468s, c0698o, C0672b.y(this.f4469t | 1));
                break;
            default:
                p050e8.b.c(this.f4468s, (p241y9.e) this.f4470u, c0698o, C0672b.y(this.f4469t | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(boolean z10, p241y9.e eVar, int i10) {
        super(2);
        this.f4468s = z10;
        this.f4470u = eVar;
        this.f4469t = i10;
    }
}
