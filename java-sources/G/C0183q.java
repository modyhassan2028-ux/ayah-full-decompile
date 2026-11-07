package G;

import p223x.C1411c;

/* JADX INFO: renamed from: G.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0183q extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p205v0.b f2721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0185t f2722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0183q(p205v0.b bVar, C0185t c0185t, int i10) {
        super(1);
        this.f2720r = i10;
        this.f2721s = bVar;
        this.f2722t = c0185t;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2720r) {
            case 0:
                this.f2721s.f(((Number) ((C1411c) obj).d()).floatValue());
                this.f2722t.f2736c.invoke();
                break;
            default:
                this.f2721s.f(((Number) ((C1411c) obj).d()).floatValue());
                this.f2722t.f2736c.invoke();
                break;
        }
        return p110k9.y.f19095a;
    }
}
