package T5;

import B.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f7804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f7804t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7802r = obj;
        this.f7803s |= Integer.MIN_VALUE;
        return this.f7804t.b(null, this);
    }
}
