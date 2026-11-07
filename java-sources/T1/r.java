package T1;

import K9.C0395m;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B f7724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0395m f7725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f7726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B f7727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(B b5, q9.c cVar) {
        super(cVar);
        this.f7727v = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7726u = obj;
        this.f7728w |= Integer.MIN_VALUE;
        return B.d(this.f7727v, null, this);
    }
}
