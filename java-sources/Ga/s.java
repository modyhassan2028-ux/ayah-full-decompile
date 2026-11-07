package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f3074s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(A a9, int i10) {
        super(1);
        this.f3073r = i10;
        this.f3074s = a9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3073r) {
            case 0:
                z zVar = (z) obj;
                p251z9.j.e(zVar, "item");
                return Boolean.valueOf(this.f3074s.f2967q.contains(zVar.f3106a.f2117i));
            case 1:
                p180s0.G g = (p180s0.G) obj;
                p251z9.j.e(g, "$this$graphicsLayer");
                g.o(p171r0.c.e(this.f3074s.e()));
                return p110k9.y.f19095a;
            case 2:
                p180s0.G g10 = (p180s0.G) obj;
                p251z9.j.e(g10, "$this$graphicsLayer");
                g10.m(p171r0.c.d(this.f3074s.e()));
                return p110k9.y.f19095a;
            case 3:
                p180s0.G g11 = (p180s0.G) obj;
                p251z9.j.e(g11, "$this$graphicsLayer");
                g11.o(p171r0.c.e(((p171r0.c) this.f3074s.f2969s.d()).f21387a));
                return p110k9.y.f19095a;
            default:
                p180s0.G g12 = (p180s0.G) obj;
                p251z9.j.e(g12, "$this$graphicsLayer");
                g12.m(p171r0.c.d(((p171r0.c) this.f3074s.f2969s.d()).f21387a));
                return p110k9.y.f19095a;
        }
    }
}
