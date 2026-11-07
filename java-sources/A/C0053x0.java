package A;

/* JADX INFO: renamed from: A.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0053x0 implements p063g1.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p063g1.c f437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final S9.c f440u = new S9.c(false);

    public C0053x0(p063g1.c cVar) {
        this.f437r = cVar;
    }

    @Override // p063g1.c
    public final int E(float f3) {
        return this.f437r.E(f3);
    }

    @Override // p063g1.c
    public final long M(long j) {
        return this.f437r.M(j);
    }

    @Override // p063g1.c
    public final float Q(long j) {
        return this.f437r.Q(j);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return this.f437r.X(f3);
    }

    public final void a() {
        this.f439t = true;
        S9.c cVar = this.f440u;
        if (cVar.f()) {
            cVar.b(null);
        }
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return this.f437r.b0(i10);
    }

    public final void c() {
        this.f438s = true;
        S9.c cVar = this.f440u;
        if (cVar.f()) {
            cVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(q9.c cVar) {
        C0049v0 c0049v0;
        C0053x0 c0053x0;
        if (cVar instanceof C0049v0) {
            c0049v0 = (C0049v0) cVar;
            int i10 = c0049v0.f431u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0049v0.f431u = i10 - Integer.MIN_VALUE;
            } else {
                c0049v0 = new C0049v0(this, cVar);
            }
        } else {
            c0049v0 = new C0049v0(this, cVar);
        }
        Object obj = c0049v0.f429s;
        int i11 = c0049v0.f431u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            c0049v0.f428r = this;
            c0049v0.f431u = 1;
            Object objE = this.f440u.e(c0049v0);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
            c0053x0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0053x0 = c0049v0.f428r;
            p110k9.a.e(obj);
        }
        c0053x0.f438s = false;
        c0053x0.f439t = false;
        return p110k9.y.f19095a;
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return this.f437r.d0(f3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q9.c cVar) {
        C0051w0 c0051w0;
        C0053x0 c0053x0;
        if (cVar instanceof C0051w0) {
            c0051w0 = (C0051w0) cVar;
            int i10 = c0051w0.f436u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0051w0.f436u = i10 - Integer.MIN_VALUE;
            } else {
                c0051w0 = new C0051w0(this, cVar);
            }
        } else {
            c0051w0 = new C0051w0(this, cVar);
        }
        Object obj = c0051w0.f434s;
        int i11 = c0051w0.f436u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            if (this.f438s || this.f439t) {
                c0053x0 = this;
            } else {
                c0051w0.f433r = this;
                c0051w0.f436u = 1;
                Object objE = this.f440u.e(c0051w0);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objE == aVar) {
                    return aVar;
                }
                c0053x0 = this;
            }
            return Boolean.valueOf(c0053x0.f438s);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0053x0 = c0051w0.f433r;
        p110k9.a.e(obj);
        c0053x0.f440u.b(null);
        return Boolean.valueOf(c0053x0.f438s);
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f437r.getDensity();
    }

    @Override // p063g1.c
    public final float n() {
        return this.f437r.n();
    }

    @Override // p063g1.c
    public final long v(long j) {
        return this.f437r.v(j);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return this.f437r.w(f3);
    }

    @Override // p063g1.c
    public final float z(long j) {
        return this.f437r.z(j);
    }
}
