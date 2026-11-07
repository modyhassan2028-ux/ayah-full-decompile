package J3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f4267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f4268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f4269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4270v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x xVar, q9.c cVar) {
        super(cVar);
        this.f4269u = xVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f4268t = obj;
        this.f4270v |= Integer.MIN_VALUE;
        return this.f4269u.a(0, this);
    }
}
