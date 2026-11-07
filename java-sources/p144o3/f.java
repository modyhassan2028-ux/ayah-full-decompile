package p144o3;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f20319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f20320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f20321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20322u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, c cVar) {
        super(cVar);
        this.f20321t = hVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f20320s = obj;
        this.f20322u |= Integer.MIN_VALUE;
        return this.f20321t.a(null, this);
    }
}
