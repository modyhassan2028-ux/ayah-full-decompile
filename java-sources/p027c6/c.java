package p027c6;

import G5.b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f13499t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f13499t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f13497r = obj;
        this.f13498s |= Integer.MIN_VALUE;
        return this.f13499t.b(null, this);
    }
}
