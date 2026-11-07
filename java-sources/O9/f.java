package O9;

import F2.D;
import N9.InterfaceC0415h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public D f6523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC0415h f6524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f6526u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6527v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D d5, p150o9.c cVar) {
        super(cVar);
        this.f6526u = d5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6525t = obj;
        this.f6527v |= Integer.MIN_VALUE;
        return this.f6526u.a(null, this);
    }
}
