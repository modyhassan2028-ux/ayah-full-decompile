package p035d3;

import C4.b;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class D extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f15585t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f15585t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f15583r = obj;
        this.f15584s |= Integer.MIN_VALUE;
        return this.f15585t.b(null, this);
    }
}
