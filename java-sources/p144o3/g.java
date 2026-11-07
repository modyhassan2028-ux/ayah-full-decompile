package p144o3;

import B.f;
import N9.InterfaceC0416i;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f20325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f20326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20327v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f20325t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f20323r = obj;
        this.f20324s |= Integer.MIN_VALUE;
        return this.f20325t.b(null, this);
    }
}
