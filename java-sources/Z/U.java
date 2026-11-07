package Z;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f10646s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U(p241y9.c cVar, int i10) {
        super(1);
        this.f10645r = i10;
        switch (i10) {
            case 1:
                this.f10646s = (p251z9.k) cVar;
                super(1);
                break;
            case 2:
                this.f10646s = (p251z9.k) cVar;
                super(1);
                break;
            case 3:
                this.f10646s = (p251z9.k) cVar;
                super(1);
                break;
            case 4:
                this.f10646s = (p251z9.k) cVar;
                super(1);
                break;
            default:
                this.f10646s = (p251z9.k) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r7v16, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r7v2, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r7v23, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r7v9, types: [y9.c, z9.k] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f10645r) {
            case 0:
                return this.f10646s.e(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                p093j0.i iVar = (p093j0.i) this.f10646s.e((p093j0.m) obj);
                synchronized (p093j0.n.f18661b) {
                    p093j0.n.f18662c = p093j0.n.f18662c.f(iVar.g());
                }
                return iVar;
            case 2:
                return new p063g1.j((((long) ((Number) this.f10646s.e(Integer.valueOf((int) (((p063g1.l) obj).f16260a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 3:
                return new p063g1.j((((long) ((Number) this.f10646s.e(Integer.valueOf((int) (((p063g1.l) obj).f16260a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            default:
                return this.f10646s.e(Long.valueOf(((Number) obj).longValue()));
        }
    }
}
