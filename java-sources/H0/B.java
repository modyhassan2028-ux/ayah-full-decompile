package H0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B extends J0.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f3133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f3134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e10, p241y9.e eVar, String str) {
        super(str);
        this.f3133b = e10;
        this.f3134c = eVar;
    }

    @Override // H0.I
    public final J a(K k7, List list, long j) {
        E e10 = this.f3133b;
        C0226z c0226z = e10.f3151y;
        c0226z.f3237r = k7.getLayoutDirection();
        c0226z.f3238s = k7.getDensity();
        c0226z.f3239t = k7.n();
        boolean zT = k7.t();
        p241y9.e eVar = this.f3134c;
        if (zT || e10.f3144r.f3932y == null) {
            e10.f3147u = 0;
            J j10 = (J) eVar.invoke(c0226z, new p063g1.a(j));
            return new A(j10, e10, e10.f3147u, j10, 1);
        }
        e10.f3148v = 0;
        J j11 = (J) eVar.invoke(e10.f3152z, new p063g1.a(j));
        return new A(j11, e10, e10.f3148v, j11, 0);
    }
}
