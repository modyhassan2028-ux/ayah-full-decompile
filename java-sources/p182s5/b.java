package p182s5;

import B.f;
import N9.InterfaceC0416i;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f22140t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f22141u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22142v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, p150o9.c cVar) {
        super(cVar);
        this.f22140t = fVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22138r = obj;
        this.f22139s |= Integer.MIN_VALUE;
        return this.f22140t.b(null, this);
    }
}
