package W5;

import B.f;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f9630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f9631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9632v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f9630t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f9628r = obj;
        this.f9629s |= Integer.MIN_VALUE;
        return this.f9630t.b(null, this);
    }
}
