package p207v2;

import q9.c;

/* JADX INFO: renamed from: v2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1386y extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public G f23312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public H f23313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S9.c f23314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f23315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f23316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23317w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386y(G g, c cVar) {
        super(cVar);
        this.f23316v = g;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23315u = obj;
        this.f23317w |= Integer.MIN_VALUE;
        return this.f23316v.e(this);
    }
}
