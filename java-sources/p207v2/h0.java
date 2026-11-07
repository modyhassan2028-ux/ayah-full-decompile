package p207v2;

import Ca.r;
import K9.a0;
import S9.a;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f23244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a0 f23245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f23246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f23247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f23248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r rVar, c cVar) {
        super(cVar);
        this.f23248v = rVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23247u = obj;
        this.f23249w |= Integer.MIN_VALUE;
        return this.f23248v.f(null, this);
    }
}
