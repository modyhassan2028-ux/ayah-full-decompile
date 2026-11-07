package p232y;

import B.g;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class E extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public H f24420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f24421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H f24423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24424v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h7, c cVar) {
        super(cVar);
        this.f24423u = h7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24422t = obj;
        this.f24424v |= Integer.MIN_VALUE;
        return H.v0(this.f24423u, this);
    }
}
