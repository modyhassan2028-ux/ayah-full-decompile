package W;

/* JADX INFO: renamed from: W.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0552e0 extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f9038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9039t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0552e0(Object obj, p150o9.c cVar, int i10) {
        super(3, cVar);
        this.f9037r = i10;
        this.f9039t = obj;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        p171r0.c cVar = (p171r0.c) obj2;
        switch (this.f9037r) {
            case 0:
                long j = cVar.f21387a;
                C0552e0 c0552e0 = new C0552e0((C0556f0) this.f9039t, (p150o9.c) obj3, 0);
                c0552e0.f9038s = j;
                p110k9.y yVar = p110k9.y.f19095a;
                c0552e0.invokeSuspend(yVar);
                return yVar;
            default:
                long j10 = cVar.f21387a;
                C0552e0 c0552e1 = new C0552e0((C0604u1) this.f9039t, (p150o9.c) obj3, 1);
                c0552e1.f9038s = j10;
                p110k9.y yVar2 = p110k9.y.f19095a;
                c0552e1.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9037r) {
            case 0:
                p110k9.a.e(obj);
                long j = this.f9038s;
                C0556f0 c0556f0 = (C0556f0) this.f9039t;
                c0556f0.f9067K = p171r0.c.d(j);
                c0556f0.f9068L = p171r0.c.e(j);
                break;
            default:
                p110k9.a.e(obj);
                long j10 = this.f9038s;
                C0604u1 c0604u1 = (C0604u1) this.f9039t;
                c0604u1.f9398E.h((c0604u1.f9408y ? c0604u1.f9407x.g() - p171r0.c.d(j10) : p171r0.c.d(j10)) - c0604u1.f9397D.g());
                break;
        }
        return p110k9.y.f19095a;
    }
}
