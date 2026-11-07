package N9;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B.f f6181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6182t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6181s = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6180r = obj;
        this.f6182t |= Integer.MIN_VALUE;
        return this.f6181s.a(0, this);
    }
}
