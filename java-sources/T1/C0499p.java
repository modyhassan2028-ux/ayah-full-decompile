package T1;

/* JADX INFO: renamed from: T1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0499p extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f7717t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0499p(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f7717t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7715r = obj;
        this.f7716s |= Integer.MIN_VALUE;
        return this.f7717t.b(null, this);
    }
}
