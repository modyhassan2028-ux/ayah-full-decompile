package L5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f5525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f5526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f5529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5530x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, q9.c cVar2) {
        super(cVar2);
        this.f5529w = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f5528v = obj;
        this.f5530x |= Integer.MIN_VALUE;
        return this.f5529w.K(false, null, 0, this);
    }
}
