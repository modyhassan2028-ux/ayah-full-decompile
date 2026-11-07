package p207v2;

import H2.i;
import p251z9.v;
import q9.c;

/* JADX INFO: renamed from: v2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1365c extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f23211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f23212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f23214u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23215v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365c(i iVar, p150o9.c cVar) {
        super(cVar);
        this.f23214u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23213t = obj;
        this.f23215v |= Integer.MIN_VALUE;
        return this.f23214u.b(null, this);
    }
}
