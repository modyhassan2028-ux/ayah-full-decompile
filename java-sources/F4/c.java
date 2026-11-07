package F4;

import N9.k0;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f2370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k0 f2371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f2373u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2374v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, q9.c cVar) {
        super(cVar);
        this.f2373u = dVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f2372t = obj;
        this.f2374v |= Integer.MIN_VALUE;
        return this.f2373u.b(null, null, this);
    }
}
