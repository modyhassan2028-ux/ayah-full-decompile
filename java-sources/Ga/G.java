package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class G extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public J f2982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public F f2983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C f2984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p251z9.k f2985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f2986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f2987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f2988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2989y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j, q9.c cVar) {
        super(cVar);
        this.f2988x = j;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2987w = obj;
        this.f2989y |= Integer.MIN_VALUE;
        return J.a(this.f2988x, this);
    }
}
