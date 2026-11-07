package p198u3;

import N9.InterfaceC0416i;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f22909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f22910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22911v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, p150o9.c cVar) {
        super(cVar);
        this.f22909t = hVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22907r = obj;
        this.f22908s |= Integer.MIN_VALUE;
        return this.f22909t.b(null, this);
    }
}
