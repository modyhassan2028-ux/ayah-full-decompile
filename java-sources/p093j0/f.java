package p093j0;

import java.util.Arrays;
import java.util.HashMap;
import p241y9.c;
import p251z9.j;
import u.F;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f18638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18639p;

    public f(long j, m mVar, c cVar, c cVar2, e eVar) {
        super(j, mVar, cVar, cVar2);
        this.f18638o = eVar;
        eVar.k();
    }

    @Override // p093j0.e, p093j0.i
    public final void c() {
        if (this.f18646c) {
            return;
        }
        super.c();
        if (this.f18639p) {
            return;
        }
        this.f18639p = true;
        this.f18638o.l();
    }

    @Override // p093j0.e
    public final s w() throws Throwable {
        f fVar;
        e eVar = this.f18638o;
        if (eVar.f18637m || eVar.f18646c) {
            return new j();
        }
        F f3 = this.f18633h;
        long j = this.f18645b;
        HashMap mapC = f3 != null ? n.c(eVar.g(), this, this.f18638o.d()) : null;
        synchronized (n.f18661b) {
            try {
                n.d(this);
                try {
                    if (f3 == null || f3.f22678d == 0) {
                        fVar = this;
                        a();
                    } else {
                        fVar = this;
                        s sVarZ = fVar.z(this.f18638o.g(), f3, mapC, this.f18638o.d());
                        if (!sVarZ.equals(k.f18648b)) {
                            return sVarZ;
                        }
                        F fX = fVar.f18638o.x();
                        if (fX != null) {
                            fX.k(f3);
                        } else {
                            fVar.f18638o.C(f3);
                            fVar.f18633h = null;
                        }
                    }
                    if (fVar.f18638o.g() < j) {
                        fVar.f18638o.v();
                    }
                    e eVar2 = fVar.f18638o;
                    eVar2.r(eVar2.d().c(j).b(fVar.j));
                    fVar.f18638o.A(j);
                    e eVar3 = fVar.f18638o;
                    int i10 = fVar.f18647d;
                    fVar.f18647d = -1;
                    if (i10 >= 0) {
                        int[] iArr = eVar3.f18635k;
                        j.e(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i10;
                        eVar3.f18635k = iArrCopyOf;
                    } else {
                        eVar3.getClass();
                    }
                    fVar.f18638o.B(fVar.j);
                    e eVar4 = fVar.f18638o;
                    int[] iArr2 = fVar.f18635k;
                    eVar4.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = eVar4.f18635k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            j.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        eVar4.f18635k = iArr2;
                    }
                    fVar.f18637m = true;
                    if (!fVar.f18639p) {
                        fVar.f18639p = true;
                        fVar.f18638o.l();
                    }
                    return k.f18648b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
