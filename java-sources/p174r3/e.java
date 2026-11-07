package p174r3;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f21521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f21522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21523t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, c cVar) {
        super(cVar);
        this.f21522s = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21521r = obj;
        this.f21523t |= Integer.MIN_VALUE;
        return this.f21522s.b(this);
    }
}
