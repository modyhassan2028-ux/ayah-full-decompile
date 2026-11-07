package U4;

import B.f;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8168r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f8170t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f8171u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p095j3.a f8172v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8173w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f8170t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f8168r = obj;
        this.f8169s |= Integer.MIN_VALUE;
        return this.f8170t.b(null, this);
    }
}
