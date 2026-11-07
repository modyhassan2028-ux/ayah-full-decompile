package p035d3;

import B.f;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f15576t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f15576t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f15574r = obj;
        this.f15575s |= Integer.MIN_VALUE;
        return this.f15576t.b(null, this);
    }
}
