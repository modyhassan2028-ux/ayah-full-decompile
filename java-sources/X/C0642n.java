package X;

/* JADX INFO: renamed from: X.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642n extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f9761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f9762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f9763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9764u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642n(s sVar, q9.c cVar) {
        super(cVar);
        this.f9763t = sVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f9762s = obj;
        this.f9764u |= Integer.MIN_VALUE;
        return this.f9763t.b(null, null, this);
    }
}
