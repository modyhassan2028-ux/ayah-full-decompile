package p248z6;

import java.util.List;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f24835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f24836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Aa.a f24838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24839v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Aa.a aVar, c cVar) {
        super(cVar);
        this.f24838u = aVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24837t = obj;
        this.f24839v |= Integer.MIN_VALUE;
        return this.f24838u.c(this);
    }
}
