package p009aa;

import Da.r;
import G1.f;
import H7.C0227a;
import U6.C0532j;
import U9.a;
import U9.c;
import W9.i;
import Y9.Q;
import Z9.b;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f11261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f11262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n[] f11263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0532j f11264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0227a f11265f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11267i;

    public n(f fVar, b bVar, q qVar, n[] nVarArr) {
        j.e(fVar, "composer");
        this.f11260a = fVar;
        this.f11261b = bVar;
        this.f11262c = qVar;
        this.f11263d = nVarArr;
        this.f11264e = bVar.f11044b;
        this.f11265f = bVar.f11043a;
        int iOrdinal = qVar.ordinal();
        if (nVarArr != null) {
            n nVar = nVarArr[iOrdinal];
            if (nVar == null && nVar == this) {
                return;
            }
            nVarArr[iOrdinal] = this;
        }
    }

    public final n a(W9.f fVar) {
        n nVar;
        j.e(fVar, "descriptor");
        b bVar = this.f11261b;
        q qVarI = i.i(fVar, bVar);
        char c10 = qVarI.f11277r;
        f fVar2 = this.f11260a;
        fVar2.g(c10);
        fVar2.f2780r = true;
        String str = this.f11266h;
        if (str != null) {
            String strB = this.f11267i;
            if (strB == null) {
                strB = fVar.b();
            }
            fVar2.e();
            r(str);
            fVar2.g(':');
            r(strB);
            this.f11266h = null;
            this.f11267i = null;
        }
        if (this.f11262c == qVarI) {
            return this;
        }
        n[] nVarArr = this.f11263d;
        return (nVarArr == null || (nVar = nVarArr[qVarI.ordinal()]) == null) ? new n(fVar2, bVar, qVarI, nVarArr) : nVar;
    }

    public final void b(boolean z10) {
        if (this.g) {
            r(String.valueOf(z10));
        } else {
            ((r) this.f11260a.f2781s).r(String.valueOf(z10));
        }
    }

    public final void c(byte b5) {
        if (this.g) {
            r(String.valueOf((int) b5));
        } else {
            this.f11260a.f(b5);
        }
    }

    public final void d(char c10) {
        r(String.valueOf(c10));
    }

    public final void e(double d5) {
        boolean z10 = this.g;
        f fVar = this.f11260a;
        if (z10) {
            r(String.valueOf(d5));
        } else {
            ((r) fVar.f2781s).r(String.valueOf(d5));
        }
        this.f11265f.getClass();
        if (Double.isInfinite(d5) || Double.isNaN(d5)) {
            throw i.a(Double.valueOf(d5), ((r) fVar.f2781s).toString());
        }
    }

    public final void f(W9.f fVar, int i10) {
        j.e(fVar, "descriptor");
        int iOrdinal = this.f11262c.ordinal();
        f fVar2 = this.f11260a;
        boolean z10 = true;
        if (iOrdinal == 1) {
            if (!fVar2.f2780r) {
                fVar2.g(',');
            }
            fVar2.e();
            return;
        }
        if (iOrdinal == 2) {
            if (fVar2.f2780r) {
                this.g = true;
                fVar2.e();
                return;
            }
            if (i10 % 2 == 0) {
                fVar2.g(',');
                fVar2.e();
            } else {
                fVar2.g(':');
                fVar2.o();
                z10 = false;
            }
            this.g = z10;
            return;
        }
        if (iOrdinal != 3) {
            if (!fVar2.f2780r) {
                fVar2.g(',');
            }
            fVar2.e();
            i.h(fVar, this.f11261b);
            r(fVar.e(i10));
            fVar2.g(':');
            fVar2.o();
            return;
        }
        if (i10 == 0) {
            this.g = true;
        }
        if (i10 == 1) {
            fVar2.g(',');
            fVar2.o();
            this.g = false;
        }
    }

    public final void g(float f3) {
        boolean z10 = this.g;
        f fVar = this.f11260a;
        if (z10) {
            r(String.valueOf(f3));
        } else {
            ((r) fVar.f2781s).r(String.valueOf(f3));
        }
        this.f11265f.getClass();
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw i.a(Float.valueOf(f3), ((r) fVar.f2781s).toString());
        }
    }

    public final n h(W9.f fVar) {
        j.e(fVar, "descriptor");
        boolean zA = o.a(fVar);
        q qVar = this.f11262c;
        b bVar = this.f11261b;
        f dVar = this.f11260a;
        if (zA) {
            if (!(dVar instanceof e)) {
                dVar = new e((r) dVar.f2781s, this.g);
            }
            return new n(dVar, bVar, qVar, null);
        }
        if (fVar.f() && fVar.equals(Z9.j.f11052a)) {
            if (!(dVar instanceof d)) {
                dVar = new d((r) dVar.f2781s, this.g);
            }
            return new n(dVar, bVar, qVar, null);
        }
        if (this.f11266h != null) {
            this.f11267i = fVar.b();
        }
        return this;
    }

    public final n i(Q q10, int i10) {
        j.e(q10, "descriptor");
        f(q10, i10);
        return h(q10.j(i10));
    }

    public final void j(int i10) {
        if (this.g) {
            r(String.valueOf(i10));
        } else {
            this.f11260a.i(i10);
        }
    }

    public final void k(long j) {
        if (this.g) {
            r(String.valueOf(j));
        } else {
            this.f11260a.j(j);
        }
    }

    public final void l(W9.f fVar, int i10, long j) {
        j.e(fVar, "descriptor");
        f(fVar, i10);
        k(j);
    }

    public final void m() {
        this.f11260a.k("null");
    }

    public final void n(W9.f fVar, int i10, a aVar, Object obj) {
        j.e(fVar, "descriptor");
        j.e(aVar, "serializer");
        if (obj != null || this.f11265f.f3463b) {
            j.e(fVar, "descriptor");
            j.e(aVar, "serializer");
            f(fVar, i10);
            if (aVar.d().h()) {
                p(aVar, obj);
            } else if (obj == null) {
                m();
            } else {
                p(aVar, obj);
            }
        }
    }

    public final void o(W9.f fVar, int i10, a aVar, Object obj) {
        j.e(fVar, "descriptor");
        j.e(aVar, "serializer");
        f(fVar, i10);
        p(aVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    public final void p(a aVar, Object obj) {
        String strE;
        j.e(aVar, "serializer");
        b bVar = this.f11261b;
        C0227a c0227a = bVar.f11043a;
        c0227a.getClass();
        Z9.a aVar2 = (Z9.a) c0227a.f3467f;
        boolean z10 = aVar instanceof c;
        if (!z10) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    g gVarC = aVar.d().c();
                    strE = (j.a(gVarC, i.f9679c) || j.a(gVarC, i.f9682f)) ? i.e(aVar.d(), bVar) : null;
                } else if (iOrdinal != 2) {
                    throw new A6.a();
                }
            }
        } else if (aVar2 != Z9.a.f11039r) {
        }
        if (!z10) {
            if (strE != null) {
                String strB = aVar.d().b();
                this.f11266h = strE;
                this.f11267i = strB;
            }
            aVar.b(this, obj);
            return;
        }
        c cVar = (c) aVar;
        if (obj == null) {
            throw new IllegalArgumentException(("Value for serializer " + cVar.d() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
        }
        j.e(cVar, "<this>");
        j.e(obj, "value");
        cVar.getClass();
        this.f11264e.getClass();
        throw null;
    }

    public final void q(short s10) {
        if (this.g) {
            r(String.valueOf((int) s10));
        } else {
            this.f11260a.l(s10);
        }
    }

    public final void r(String str) {
        j.e(str, "value");
        this.f11260a.m(str);
    }

    public final void s(W9.f fVar, int i10, String str) {
        j.e(fVar, "descriptor");
        j.e(str, "value");
        f(fVar, i10);
        r(str);
    }

    public final void t(W9.f fVar) {
        j.e(fVar, "descriptor");
        f fVar2 = this.f11260a;
        fVar2.getClass();
        fVar2.f2780r = false;
        fVar2.g(this.f11262c.f11278s);
    }

    public final boolean u(W9.f fVar) {
        this.f11265f.getClass();
        return false;
    }
}
