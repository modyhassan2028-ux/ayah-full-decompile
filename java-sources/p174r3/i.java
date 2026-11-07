package p174r3;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f21538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21539s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f21540t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f21540t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21538r = obj;
        this.f21539s |= Integer.MIN_VALUE;
        return this.f21540t.b(null, this);
    }
}
