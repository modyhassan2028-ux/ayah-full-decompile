package p117l6;

import p074h0.i;
import p124m3.j;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f19397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f19398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f19399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19400v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, c cVar) {
        super(cVar);
        this.f19399u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f19398t = obj;
        this.f19400v |= Integer.MIN_VALUE;
        return this.f19399u.z(0, this);
    }
}
