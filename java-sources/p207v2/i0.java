package p207v2;

import p151p.C1256n;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1256n f23251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f23252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1256n f23253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f23254u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(C1256n c1256n, c cVar) {
        super(cVar);
        this.f23253t = c1256n;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23252s = obj;
        this.f23254u |= Integer.MIN_VALUE;
        return this.f23253t.n(null, this);
    }
}
