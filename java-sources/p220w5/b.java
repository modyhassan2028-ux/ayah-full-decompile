package p220w5;

import p174r3.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f23737t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, p150o9.c cVar) {
        super(cVar);
        this.f23737t = jVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23735r = obj;
        this.f23736s |= Integer.MIN_VALUE;
        return this.f23737t.b(null, this);
    }
}
