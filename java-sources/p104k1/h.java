package p104k1;

import Z.C0672b;
import Z.C0698o;
import p074h0.d;
import p110k9.y;
import p241y9.a;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f18917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f18918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f18919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f18920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f18922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, a aVar, t tVar, d dVar, int i10, int i11) {
        super(2);
        this.f18917r = sVar;
        this.f18918s = aVar;
        this.f18919t = tVar;
        this.f18920u = dVar;
        this.f18921v = i10;
        this.f18922w = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        i.a(this.f18917r, this.f18918s, this.f18919t, this.f18920u, (C0698o) obj, C0672b.y(this.f18921v | 1), this.f18922w);
        return y.f19095a;
    }
}
