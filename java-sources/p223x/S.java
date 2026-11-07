package p223x;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class S extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f23878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f23879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f23880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f23881u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(X x9, c cVar) {
        super(cVar);
        this.f23880t = x9;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23879s = obj;
        this.f23881u |= Integer.MIN_VALUE;
        return X.r(this.f23880t, this);
    }
}
