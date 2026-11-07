package A;

/* JADX INFO: renamed from: A.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032m0 extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0045t0 f324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b1 f325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p251z9.s f326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0045t0 f329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f330x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032m0(C0045t0 c0045t0, q9.c cVar) {
        super(cVar);
        this.f329w = c0045t0;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f328v = obj;
        this.f330x |= Integer.MIN_VALUE;
        return C0045t0.b(this.f329w, null, null, 0.0f, 0.0f, this);
    }
}
