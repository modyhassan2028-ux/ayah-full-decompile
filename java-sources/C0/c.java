package C0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f666t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, q9.c cVar) {
        super(cVar);
        this.f665s = dVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f664r = obj;
        this.f666t |= Integer.MIN_VALUE;
        return this.f665s.b(0L, this);
    }
}
