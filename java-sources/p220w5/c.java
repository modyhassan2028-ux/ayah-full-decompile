package p220w5;

import p174r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f23740t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f23740t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23738r = obj;
        this.f23739s |= Integer.MIN_VALUE;
        return this.f23740t.b(null, this);
    }
}
