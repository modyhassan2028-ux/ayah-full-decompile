package p248z6;

import java.util.ArrayList;
import p074h0.i;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f24840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f24841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f24843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24844v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, c cVar) {
        super(cVar);
        this.f24843u = iVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f24842t = obj;
        this.f24844v |= Integer.MIN_VALUE;
        return this.f24843u.g(this);
    }
}
