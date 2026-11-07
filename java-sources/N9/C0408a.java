package N9;

/* JADX INFO: renamed from: N9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0408a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O9.s f6152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.e f6154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6155u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408a(C4.e eVar, p150o9.c cVar) {
        super(cVar);
        this.f6154t = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6153s = obj;
        this.f6155u |= Integer.MIN_VALUE;
        return this.f6154t.d(null, this);
    }
}
