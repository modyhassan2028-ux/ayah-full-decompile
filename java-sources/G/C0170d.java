package G;

import K9.C0389g;

/* JADX INFO: renamed from: G.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170d extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0389g f2676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0171e f2678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2679u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170d(C0171e c0171e, q9.c cVar) {
        super(cVar);
        this.f2678t = c0171e;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2677s = obj;
        this.f2679u |= Integer.MIN_VALUE;
        return this.f2678t.k(this);
    }
}
