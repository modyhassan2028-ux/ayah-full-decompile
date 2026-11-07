package R8;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f7395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f7396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f7397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S9.c f7398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Map f7399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f7402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7403z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, q9.c cVar2) {
        super(cVar2);
        this.f7402y = cVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7401x = obj;
        this.f7403z |= Integer.MIN_VALUE;
        return this.f7402y.b(this);
    }
}
