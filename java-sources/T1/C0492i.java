package T1;

/* JADX INFO: renamed from: T1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0492i extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Aa.a f7682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Aa.a f7684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7685u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0492i(Aa.a aVar, q9.c cVar) {
        super(cVar);
        this.f7684t = aVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7683s = obj;
        this.f7685u |= Integer.MIN_VALUE;
        return this.f7684t.h(this);
    }
}
