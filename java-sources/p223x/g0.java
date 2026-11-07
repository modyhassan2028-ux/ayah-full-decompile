package p223x;

import p110k9.y;
import p241y9.c;
import p251z9.j;
import p251z9.k;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f23978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f23979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1417f f23980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1422k f23981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f23982v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v vVar, float f3, InterfaceC1417f interfaceC1417f, C1422k c1422k, c cVar) {
        super(1);
        this.f23978r = vVar;
        this.f23979s = f3;
        this.f23980t = interfaceC1417f;
        this.f23981u = c1422k;
        this.f23982v = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f23978r.f24886r;
        j.b(obj2);
        AbstractC1413d.l((C1420i) obj2, jLongValue, this.f23979s, this.f23980t, this.f23981u, this.f23982v);
        return y.f19095a;
    }
}
