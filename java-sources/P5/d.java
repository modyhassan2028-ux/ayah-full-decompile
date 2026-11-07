package P5;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.f f6696t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(B.f fVar, p150o9.c cVar) {
        super(cVar);
        this.f6696t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6694r = obj;
        this.f6695s |= Integer.MIN_VALUE;
        return this.f6696t.b(null, this);
    }
}
