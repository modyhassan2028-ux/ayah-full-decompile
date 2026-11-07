package p107k5;

import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f18994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18995t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, c cVar) {
        super(cVar);
        this.f18994s = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f18993r = obj;
        this.f18995t |= Integer.MIN_VALUE;
        return this.f18994s.a(this);
    }
}
