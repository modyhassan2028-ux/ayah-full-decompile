package K0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E f4873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u.u f4874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public M9.b f4875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f4876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ E f4877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4878w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e10, q9.c cVar) {
        super(cVar);
        this.f4877v = e10;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4876u = obj;
        this.f4878w |= Integer.MIN_VALUE;
        return this.f4877v.l(this);
    }
}
