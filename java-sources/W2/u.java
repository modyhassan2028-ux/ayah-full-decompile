package W2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f9587b;

    public /* synthetic */ u() {
        this.f9586a = 1;
    }

    @Override // W2.q, W2.m
    public void a(p pVar) {
        switch (this.f9586a) {
            case 0:
                C0620a c0620a = (C0620a) this.f9587b;
                c0620a.T.remove(pVar);
                if (!c0620a.s()) {
                    c0620a.w(c0620a, o.f9552e, false);
                    c0620a.f9563I = true;
                    c0620a.w(c0620a, o.f9551d, false);
                }
                break;
        }
    }

    @Override // W2.q, W2.m
    public void d(p pVar) {
        switch (this.f9586a) {
            case 1:
                C0620a c0620a = (C0620a) this.f9587b;
                if (!c0620a.f9526W) {
                    c0620a.J();
                    c0620a.f9526W = true;
                }
                break;
        }
    }

    @Override // W2.q, W2.m
    public void e(p pVar) {
        switch (this.f9586a) {
            case 1:
                C0620a c0620a = (C0620a) this.f9587b;
                int i10 = c0620a.f9525V - 1;
                c0620a.f9525V = i10;
                if (i10 == 0) {
                    c0620a.f9526W = false;
                    c0620a.m();
                }
                pVar.z(this);
                break;
            case 2:
                this.f9587b.B();
                pVar.z(this);
                break;
        }
    }

    public /* synthetic */ u(p pVar, int i10) {
        this.f9586a = i10;
        this.f9587b = pVar;
    }
}
