package N9;

/* JADX INFO: renamed from: N9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0422o implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f6227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q9.i f6228s;

    /* JADX WARN: Multi-variable type inference failed */
    public C0422o(InterfaceC0415h interfaceC0415h, p241y9.f fVar) {
        this.f6227r = interfaceC0415h;
        this.f6228s = (q9.i) fVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [q9.i, y9.f] */
    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) throws Throwable {
        C0421n c0421n;
        C0422o c0422o;
        m0 m0Var;
        ?? r10;
        O9.s sVar;
        Throwable th;
        O9.s sVar2;
        ?? r11;
        if (cVar instanceof C0421n) {
            c0421n = (C0421n) cVar;
            int i10 = c0421n.f6223s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0421n.f6223s = i10 - Integer.MIN_VALUE;
            } else {
                c0421n = new C0421n(this, cVar);
            }
        } else {
            c0421n = new C0421n(this, cVar);
        }
        Object obj = c0421n.f6222r;
        int i11 = c0421n.f6223s;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            try {
                InterfaceC0415h interfaceC0415h = this.f6227r;
                c0421n.f6225u = this;
                c0421n.f6226v = interfaceC0416i;
                c0421n.f6223s = 1;
                if (interfaceC0415h.d(interfaceC0416i, c0421n) != aVar) {
                    c0422o = this;
                    sVar = new O9.s(interfaceC0416i, c0421n.getContext());
                    r11 = c0422o.f6228s;
                    c0421n.f6225u = sVar;
                    c0421n.f6226v = null;
                    c0421n.f6223s = 3;
                    if (r11.d(sVar, null, c0421n) != aVar) {
                        sVar2 = sVar;
                        sVar2.releaseIntercepted();
                        return p110k9.y.f19095a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c0422o = this;
                m0Var = new m0(th);
                r10 = c0422o.f6228s;
                c0421n.f6225u = th;
                c0421n.f6226v = null;
                c0421n.f6223s = 2;
                if (AbstractC0419l.e(m0Var, r10, th, c0421n) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th3 = (Throwable) c0421n.f6225u;
                p110k9.a.e(obj);
                throw th3;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = (O9.s) c0421n.f6225u;
            try {
                p110k9.a.e(obj);
                sVar2.releaseIntercepted();
                return p110k9.y.f19095a;
            } catch (Throwable th4) {
                th = th4;
                sVar2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC0416i = c0421n.f6226v;
        c0422o = (C0422o) c0421n.f6225u;
        try {
            p110k9.a.e(obj);
            sVar = new O9.s(interfaceC0416i, c0421n.getContext());
            try {
                r11 = c0422o.f6228s;
                c0421n.f6225u = sVar;
                c0421n.f6226v = null;
                c0421n.f6223s = 3;
                if (r11.d(sVar, null, c0421n) != aVar) {
                    sVar2 = sVar;
                    sVar2.releaseIntercepted();
                    return p110k9.y.f19095a;
                }
            } catch (Throwable th5) {
                th = th5;
                sVar2 = sVar;
                sVar2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            m0Var = new m0(th);
            r10 = c0422o.f6228s;
            c0421n.f6225u = th;
            c0421n.f6226v = null;
            c0421n.f6223s = 2;
            if (AbstractC0419l.e(m0Var, r10, th, c0421n) == aVar) {
                throw th;
            }
        }
        return aVar;
    }
}
