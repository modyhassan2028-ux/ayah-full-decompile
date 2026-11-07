package p237y4;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f24642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f24644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24645v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(cVar);
        this.f24644u = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24643t = obj;
        this.f24645v |= Integer.MIN_VALUE;
        return this.f24644u.a(0, null, this);
    }
}
