package p232y;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class F extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H f24425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H f24427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24428u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(H h7, c cVar) {
        super(cVar);
        this.f24427t = h7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24426s = obj;
        this.f24428u |= Integer.MIN_VALUE;
        return H.w0(this.f24427t, this);
    }
}
