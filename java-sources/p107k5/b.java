package p107k5;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C4.b f18998t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C4.b bVar, p150o9.c cVar) {
        super(cVar);
        this.f18998t = bVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f18996r = obj;
        this.f18997s |= Integer.MIN_VALUE;
        return this.f18998t.b(null, this);
    }
}
