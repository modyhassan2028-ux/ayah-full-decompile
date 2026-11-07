package p214w;

import Z.C0672b;
import Z.C0698o;
import l0.r;
import p074h0.d;
import p110k9.y;
import p181s2.s;
import p223x.u0;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class v extends k implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f23542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f23543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u0 f23544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f23545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f23546v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object obj, r rVar, u0 u0Var, String str, d dVar, int i10) {
        super(2);
        this.f23542r = obj;
        this.f23543s = rVar;
        this.f23544t = u0Var;
        this.f23545u = str;
        this.f23546v = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = C0672b.y(24961);
        s.a(this.f23542r, this.f23543s, this.f23544t, this.f23545u, this.f23546v, (C0698o) obj, iY);
        return y.f19095a;
    }
}
