package p232y;

import q9.c;

/* JADX INFO: renamed from: y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1451e extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1452f f24495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f24496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1452f f24498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24499v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451e(C1452f c1452f, c cVar) {
        super(cVar);
        this.f24498u = c1452f;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24497t = obj;
        this.f24499v |= Integer.MIN_VALUE;
        return this.f24498u.b(0L, null, this);
    }
}
