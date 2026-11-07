package N9;

/* JADX INFO: renamed from: N9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0424q implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f6236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q9.i f6237t;

    /* JADX WARN: Multi-variable type inference failed */
    public C0424q(InterfaceC0415h interfaceC0415h, p241y9.e eVar, int i10) {
        this.f6235r = i10;
        switch (i10) {
            case 2:
                this.f6236s = interfaceC0415h;
                this.f6237t = (q9.i) eVar;
                break;
            default:
                this.f6236s = interfaceC0415h;
                this.f6237t = (q9.i) eVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [q9.i, y9.e] */
    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        C0423p c0423p;
        Throwable th;
        O9.s sVar;
        C0424q c0424q;
        InterfaceC0416i interfaceC0416i2;
        InterfaceC0415h interfaceC0415h;
        switch (this.f6235r) {
            case 0:
                if (cVar instanceof C0423p) {
                    c0423p = (C0423p) cVar;
                    int i10 = c0423p.f6230s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0423p.f6230s = i10 - Integer.MIN_VALUE;
                    } else {
                        c0423p = new C0423p(this, cVar);
                    }
                } else {
                    c0423p = new C0423p(this, cVar);
                }
                Object obj = c0423p.f6229r;
                int i11 = c0423p.f6230s;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    O9.s sVar2 = new O9.s(interfaceC0416i, c0423p.getContext());
                    try {
                        ?? r10 = this.f6237t;
                        c0423p.f6232u = this;
                        c0423p.f6233v = interfaceC0416i;
                        c0423p.f6234w = sVar2;
                        c0423p.f6230s = 1;
                        if (r10.invoke(sVar2, c0423p) == aVar) {
                            return aVar;
                        }
                        c0424q = this;
                        interfaceC0416i2 = interfaceC0416i;
                        sVar = sVar2;
                        sVar.releaseIntercepted();
                        interfaceC0415h = c0424q.f6236s;
                        c0423p.f6232u = null;
                        c0423p.f6233v = null;
                        c0423p.f6234w = null;
                        c0423p.f6230s = 2;
                        if (interfaceC0415h.d(interfaceC0416i2, c0423p) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sVar = sVar2;
                        sVar.releaseIntercepted();
                        throw th;
                    }
                } else if (i11 == 1) {
                    sVar = c0423p.f6234w;
                    interfaceC0416i2 = c0423p.f6233v;
                    c0424q = c0423p.f6232u;
                    try {
                        p110k9.a.e(obj);
                        sVar.releaseIntercepted();
                        interfaceC0415h = c0424q.f6236s;
                        c0423p.f6232u = null;
                        c0423p.f6233v = null;
                        c0423p.f6234w = null;
                        c0423p.f6230s = 2;
                        if (interfaceC0415h.d(interfaceC0416i2, c0423p) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            case 1:
                Object objD = this.f6236s.d(new H2.i(new p251z9.r(), interfaceC0416i, (p241y9.e) this.f6237t), cVar);
                return objD == p161p9.a.f21156r ? objD : p110k9.y.f19095a;
            default:
                Object objD2 = this.f6236s.d(new B.f(interfaceC0416i, this.f6237t), cVar);
                return objD2 == p161p9.a.f21156r ? objD2 : p110k9.y.f19095a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0424q(p241y9.e eVar, InterfaceC0415h interfaceC0415h) {
        this.f6235r = 0;
        this.f6237t = (q9.i) eVar;
        this.f6236s = interfaceC0415h;
    }
}
