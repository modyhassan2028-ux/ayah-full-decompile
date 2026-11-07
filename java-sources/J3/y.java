package J3;

/* JADX INFO: loaded from: classes.dex */
public final class y extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f4316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4317t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b5, q9.c cVar) {
        super(cVar);
        this.f4316s = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4315r = obj;
        this.f4317t |= Integer.MIN_VALUE;
        return B.a(this.f4316s, this);
    }
}
