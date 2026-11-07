package T1;

import java.io.Serializable;

/* JADX INFO: renamed from: T1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0506x extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f7755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f7756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Serializable f7757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p251z9.v f7758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ B f7762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7763z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0506x(B b5, q9.c cVar) {
        super(cVar);
        this.f7762y = b5;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7761x = obj;
        this.f7763z |= Integer.MIN_VALUE;
        return B.g(this.f7762y, false, this);
    }
}
