package D0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f1066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1067t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n6, q9.a aVar) {
        super(aVar);
        this.f1066s = n6;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f1065r = obj;
        this.f1067t |= Integer.MIN_VALUE;
        return this.f1066s.i(0L, null, this);
    }
}
