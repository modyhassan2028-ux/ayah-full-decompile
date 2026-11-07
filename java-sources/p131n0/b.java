package p131n0;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f19791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public M9.b f19792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f19793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f19794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19795v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f19794u = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f19793t = obj;
        this.f19795v |= Integer.MIN_VALUE;
        return this.f19794u.a(this);
    }
}
