package p182s5;

import p174r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f22145t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f22145t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22143r = obj;
        this.f22144s |= Integer.MIN_VALUE;
        return this.f22145t.b(null, this);
    }
}
