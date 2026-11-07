package p174r3;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f21506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f21507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21508t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, c cVar2) {
        super(cVar2);
        this.f21507s = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21506r = obj;
        this.f21508t |= Integer.MIN_VALUE;
        return this.f21507s.a(this);
    }
}
