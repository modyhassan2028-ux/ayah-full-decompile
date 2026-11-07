package p207v2;

import q9.c;

/* JADX INFO: renamed from: v2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1387z extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public G f23318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f23319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f23320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S9.c f23321u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f23322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G f23323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23324x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387z(G g, c cVar) {
        super(cVar);
        this.f23323w = g;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23322v = obj;
        this.f23324x |= Integer.MIN_VALUE;
        return this.f23323w.f(this);
    }
}
