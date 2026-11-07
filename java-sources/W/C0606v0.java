package W;

/* JADX INFO: renamed from: W.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606v0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f9422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f9423s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0606v0(long j, float f3) {
        super(1);
        this.f9422r = f3;
        this.f9423s = j;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p196u0.d dVar = (p196u0.d) obj;
        float f3 = this.f9422r;
        float f7 = 2;
        dVar.W(this.f9423s, p171r0.d.a(0.0f, dVar.w(f3) / f7), p171r0.d.a(p171r0.i.d(dVar.b()), dVar.w(f3) / f7), (240 & 8) != 0 ? 0.0f : dVar.w(f3), (240 & 16) != 0 ? 0 : 0, 3);
        return p110k9.y.f19095a;
    }
}
