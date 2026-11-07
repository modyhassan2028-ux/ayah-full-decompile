package p218w3;

import N9.InterfaceC0416i;
import p207v2.C1384w;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1384w f23659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f23660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23661v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1384w c1384w, p150o9.c cVar) {
        super(cVar);
        this.f23659t = c1384w;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f23657r = obj;
        this.f23658s |= Integer.MIN_VALUE;
        return this.f23659t.b(null, this);
    }
}
