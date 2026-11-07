package p237y4;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f24635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f24636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24637u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2) {
        super(cVar2);
        this.f24636t = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24635s = obj;
        this.f24637u |= Integer.MIN_VALUE;
        return this.f24636t.b(0, this);
    }
}
