package H2;

import F2.z;

/* JADX INFO: loaded from: classes.dex */
public final class q extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f3310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f3311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f3312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f3314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3315w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, q9.c cVar) {
        super(cVar);
        this.f3314v = uVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3313u = obj;
        this.f3315w |= Integer.MIN_VALUE;
        return this.f3314v.e(null, this);
    }
}
