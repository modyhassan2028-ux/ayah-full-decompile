package p189t3;

import p174r3.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f22585t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f22585t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22583r = obj;
        this.f22584s |= Integer.MIN_VALUE;
        return this.f22585t.b(null, this);
    }
}
