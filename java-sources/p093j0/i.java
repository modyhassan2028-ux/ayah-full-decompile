package p093j0;

import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f18644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18647d;

    public i(long j, m mVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f18644a = mVar;
        this.f18645b = j;
        p074h0.i iVar = n.f18660a;
        if (j != 0) {
            m mVarD = d();
            long j10 = mVarD.f18658t;
            long[] jArr = mVarD.f18659u;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j11 = mVarD.f18657s;
                if (j11 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                } else {
                    long j12 = mVarD.f18656r;
                    if (j12 != 0) {
                        j10 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j10;
            }
            synchronized (n.f18661b) {
                iA = n.f18664e.a(j);
            }
        } else {
            iA = -1;
        }
        this.f18647d = iA;
    }

    public static void q(i iVar) {
        n.f18660a.D(iVar);
    }

    public final void a() {
        synchronized (n.f18661b) {
            b();
            p();
        }
    }

    public void b() {
        n.f18662c = n.f18662c.c(g());
    }

    public abstract void c();

    public m d() {
        return this.f18644a;
    }

    public abstract c e();

    public abstract boolean f();

    public long g() {
        return this.f18645b;
    }

    public int h() {
        return 0;
    }

    public abstract c i();

    public final i j() {
        p074h0.i iVar = n.f18660a;
        i iVar2 = (i) iVar.n();
        iVar.D(this);
        return iVar2;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(v vVar);

    public final void o() {
        int i10 = this.f18647d;
        if (i10 >= 0) {
            n.v(i10);
            this.f18647d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(m mVar) {
        this.f18644a = mVar;
    }

    public void s(long j) {
        this.f18645b = j;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i u(c cVar);
}
