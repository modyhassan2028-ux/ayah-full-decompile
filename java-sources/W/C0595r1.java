package W;

/* JADX INFO: renamed from: W.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0595r1 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f9337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9338t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0595r1(int i10, Object obj, boolean z10) {
        super(1);
        this.f9336r = i10;
        this.f9337s = z10;
        this.f9338t = obj;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f9336r;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj2 = this.f9338t;
        boolean z10 = this.f9337s;
        switch (i10) {
            case 0:
                R0.j jVar = (R0.j) obj;
                if (!z10) {
                    F9.f[] fVarArr = R0.u.f7181a;
                    jVar.e(R0.s.f7163i, yVar);
                }
                C0584n1 c0584n1 = new C0584n1((C0604u1) obj2, 1);
                F9.f[] fVarArr2 = R0.u.f7181a;
                jVar.e(R0.i.f7090h, new R0.a(null, c0584n1));
                break;
            default:
                ((p180s0.G) obj).d(!z10 && ((Boolean) ((p241y9.a) obj2).invoke()).booleanValue());
                break;
        }
        return yVar;
    }
}
