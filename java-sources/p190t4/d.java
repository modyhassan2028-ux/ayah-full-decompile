package p190t4;

import java.util.List;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f22596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f22597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f22598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f22599u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22600v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(cVar);
        this.f22599u = eVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22598t = obj;
        this.f22600v |= Integer.MIN_VALUE;
        return e.g(this.f22599u, null, this);
    }
}
