package T1;

/* JADX INFO: loaded from: classes.dex */
public final class G extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I f7585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D f7586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f7588u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ I f7589v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i10, q9.c cVar) {
        super(cVar);
        this.f7589v = i10;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7588u = obj;
        this.f7590w |= Integer.MIN_VALUE;
        return this.f7589v.a(null, this);
    }
}
