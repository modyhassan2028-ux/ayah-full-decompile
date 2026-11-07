package p223x;

import p110k9.y;
import p241y9.c;
import p251z9.k;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f23968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1417f f23970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC1427p f23971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1422k f23972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f23973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f23974x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v vVar, Object obj, InterfaceC1417f interfaceC1417f, AbstractC1427p abstractC1427p, C1422k c1422k, float f3, c cVar) {
        super(1);
        this.f23968r = vVar;
        this.f23969s = obj;
        this.f23970t = interfaceC1417f;
        this.f23971u = abstractC1427p;
        this.f23972v = c1422k;
        this.f23973w = f3;
        this.f23974x = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC1417f interfaceC1417f = this.f23970t;
        C1420i c1420i = new C1420i(this.f23969s, interfaceC1417f.g(), this.f23971u, jLongValue, interfaceC1417f.h(), jLongValue, new C1416e0(0, this.f23972v));
        AbstractC1413d.l(c1420i, jLongValue, this.f23973w, this.f23970t, this.f23972v, this.f23974x);
        this.f23968r.f24886r = c1420i;
        return y.f19095a;
    }
}
