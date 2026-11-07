package E2;

/* JADX INFO: renamed from: E2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0122g implements U {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U f1667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1668s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1669t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1670u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f1671v = null;

    public C0122g(U u8) {
        this.f1667r = u8;
    }

    public final void a() {
        int i10 = this.f1668s;
        if (i10 == 0) {
            return;
        }
        U u8 = this.f1667r;
        if (i10 == 1) {
            u8.s(this.f1669t, this.f1670u);
        } else if (i10 == 2) {
            u8.g(this.f1669t, this.f1670u);
        } else if (i10 == 3) {
            u8.u(this.f1669t, this.f1670u, this.f1671v);
        }
        this.f1671v = null;
        this.f1668s = 0;
    }

    @Override // E2.U
    public final void g(int i10, int i11) {
        int i12;
        if (this.f1668s == 2 && (i12 = this.f1669t) >= i10 && i12 <= i10 + i11) {
            this.f1670u += i11;
            this.f1669t = i10;
        } else {
            a();
            this.f1669t = i10;
            this.f1670u = i11;
            this.f1668s = 2;
        }
    }

    @Override // E2.U
    public final void h(int i10, int i11) {
        a();
        this.f1667r.h(i10, i11);
    }

    @Override // E2.U
    public final void s(int i10, int i11) {
        int i12;
        if (this.f1668s == 1 && i10 >= (i12 = this.f1669t)) {
            int i13 = this.f1670u;
            if (i10 <= i12 + i13) {
                this.f1670u = i13 + i11;
                this.f1669t = Math.min(i10, i12);
                return;
            }
        }
        a();
        this.f1669t = i10;
        this.f1670u = i11;
        this.f1668s = 1;
    }

    @Override // E2.U
    public final void u(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int i14;
        if (this.f1668s == 3 && i10 <= (i13 = this.f1670u + (i12 = this.f1669t)) && (i14 = i10 + i11) >= i12 && this.f1671v == obj) {
            this.f1669t = Math.min(i10, i12);
            this.f1670u = Math.max(i13, i14) - this.f1669t;
            return;
        }
        a();
        this.f1669t = i10;
        this.f1670u = i11;
        this.f1671v = obj;
        this.f1668s = 3;
    }
}
