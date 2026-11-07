package p207v2;

import p174r3.j;
import q9.c;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1364b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f23206t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364b(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f23206t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23204r = obj;
        this.f23205s |= Integer.MIN_VALUE;
        return this.f23206t.b(null, this);
    }
}
