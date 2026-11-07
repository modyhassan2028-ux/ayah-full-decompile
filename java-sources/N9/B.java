package N9;

/* JADX INFO: loaded from: classes.dex */
public final class B extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.g f6075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B.f f6076u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C4.g gVar, p150o9.c cVar) {
        super(cVar);
        this.f6075t = gVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6073r = obj;
        this.f6074s |= Integer.MIN_VALUE;
        return this.f6075t.d(null, this);
    }
}
