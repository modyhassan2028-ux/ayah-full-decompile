package p174r3;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f21543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f21544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21545t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, c cVar) {
        super(cVar);
        this.f21544s = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21543r = obj;
        this.f21545t |= Integer.MIN_VALUE;
        return this.f21544s.g(this);
    }
}
