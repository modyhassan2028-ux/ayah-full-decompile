package I1;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f3771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A1.c[] f3772b;

    public r0() {
        this(new B0((B0) null));
    }

    public final void a() {
        A1.c[] cVarArr = this.f3772b;
        if (cVarArr != null) {
            A1.c cVarG = cVarArr[0];
            A1.c cVarG2 = cVarArr[1];
            B0 b5 = this.f3771a;
            if (cVarG2 == null) {
                cVarG2 = b5.f3671a.g(2);
            }
            if (cVarG == null) {
                cVarG = b5.f3671a.g(1);
            }
            g(A1.c.a(cVarG, cVarG2));
            A1.c cVar = this.f3772b[B9.a.I(16)];
            if (cVar != null) {
                f(cVar);
            }
            A1.c cVar2 = this.f3772b[B9.a.I(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            A1.c cVar3 = this.f3772b[B9.a.I(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract B0 b();

    public void c(int i10, A1.c cVar) {
        if (this.f3772b == null) {
            this.f3772b = new A1.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f3772b[B9.a.I(i11)] = cVar;
            }
        }
    }

    public abstract void e(A1.c cVar);

    public abstract void g(A1.c cVar);

    public r0(B0 b5) {
        this.f3771a = b5;
    }

    public void d(A1.c cVar) {
    }

    public void f(A1.c cVar) {
    }

    public void h(A1.c cVar) {
    }
}
