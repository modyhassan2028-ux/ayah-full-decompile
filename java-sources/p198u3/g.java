package p198u3;

import N9.InterfaceC0416i;
import p077h3.a;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f22899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0416i f22900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f22901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22903x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p150o9.c cVar) {
        super(cVar);
        this.f22899t = hVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f22897r = obj;
        this.f22898s |= Integer.MIN_VALUE;
        return this.f22899t.b(null, this);
    }
}
