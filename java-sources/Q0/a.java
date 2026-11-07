package Q0;

import p063g1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f6817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f6818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f6819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f6823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6824y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, q9.c cVar) {
        super(cVar);
        this.f6823x = dVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f6822w = obj;
        this.f6824y |= Integer.MIN_VALUE;
        return d.a(this.f6823x, null, null, this);
    }
}
