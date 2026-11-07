package p144o3;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f20315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20316w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(cVar);
        this.f20315v = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f20314u = obj;
        this.f20316w |= Integer.MIN_VALUE;
        return this.f20315v.b(0, 0, 0, null, this);
    }
}
