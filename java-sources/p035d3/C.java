package p035d3;

import C4.b;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class C extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15580r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f15582t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(b bVar, p150o9.c cVar) {
        super(cVar);
        this.f15582t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f15580r = obj;
        this.f15581s |= Integer.MIN_VALUE;
        return this.f15582t.b(null, this);
    }
}
