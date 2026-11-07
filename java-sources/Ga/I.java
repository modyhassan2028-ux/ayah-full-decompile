package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class I extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public J f2993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f2995t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2996u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j, q9.c cVar) {
        super(cVar);
        this.f2995t = j;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2994s = obj;
        this.f2996u |= Integer.MIN_VALUE;
        return this.f2995t.c(this);
    }
}
