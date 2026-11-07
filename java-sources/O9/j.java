package O9;

import F2.D;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public D f6534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f6535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f6537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6538v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(D d5, p150o9.c cVar) {
        super(cVar);
        this.f6537u = d5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6536t = obj;
        this.f6538v |= Integer.MIN_VALUE;
        return this.f6537u.b(null, this);
    }
}
