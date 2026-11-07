package p207v2;

import Ca.r;
import K9.a0;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f23235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a0 f23236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S9.c f23237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f23238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f23239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r rVar, c cVar) {
        super(cVar);
        this.f23239v = rVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23238u = obj;
        this.f23240w |= Integer.MIN_VALUE;
        return this.f23239v.c(null, this);
    }
}
