package p223x;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class W extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f23900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f23901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f23903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23904v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x9, c cVar) {
        super(cVar);
        this.f23903u = x9;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23902t = obj;
        this.f23904v |= Integer.MIN_VALUE;
        return X.t(this.f23903u, this);
    }
}
