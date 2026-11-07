package p144o3;

import p165q3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f20306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p124m3.j f20307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f20309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, q9.c cVar) {
        super(cVar);
        this.f20309v = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f20308u = obj;
        this.f20310w |= Integer.MIN_VALUE;
        return this.f20309v.a(0, null, this);
    }
}
