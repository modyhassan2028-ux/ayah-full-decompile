package H2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class s extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f3322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Serializable f3323s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3324t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3325u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f3326v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3327w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, q9.c cVar) {
        super(cVar);
        this.f3326v = uVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f3325u = obj;
        this.f3327w |= Integer.MIN_VALUE;
        return this.f3326v.g(null, null, this);
    }
}
