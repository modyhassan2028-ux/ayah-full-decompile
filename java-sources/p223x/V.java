package p223x;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class V extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f23895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f23896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f23898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23899v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x9, c cVar) {
        super(cVar);
        this.f23898u = x9;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23897t = obj;
        this.f23899v |= Integer.MIN_VALUE;
        return X.s(this.f23898u, this);
    }
}
