package p175r4;

import p174r3.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f21561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f21563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f21563t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21561r = obj;
        this.f21562s |= Integer.MIN_VALUE;
        return this.f21563t.b(null, this);
    }
}
