package p042e0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import p000a.a;
import p251z9.j;
import p251z9.y;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f15727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f15728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15730x;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f15723s, nVarArr);
        this.f15727u = eVar;
        this.f15730x = eVar.f15725u;
    }

    public final void c(int i10, m mVar, Object obj, int i11) {
        int i12 = i11 * 5;
        n[] nVarArr = this.f15719r;
        if (i12 <= 30) {
            int iN = 1 << a.N(i10, i12);
            if (mVar.h(iN)) {
                nVarArr[i11].a(mVar.f15743d, Integer.bitCount(mVar.f15740a) * 2, mVar.f(iN));
                this.f15720s = i11;
                return;
            } else {
                int iT = mVar.t(iN);
                m mVarS = mVar.s(iT);
                nVarArr[i11].a(mVar.f15743d, Integer.bitCount(mVar.f15740a) * 2, iT);
                c(i10, mVarS, obj, i11 + 1);
                return;
            }
        }
        n nVar = nVarArr[i11];
        Object[] objArr = mVar.f15743d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i11];
            if (j.a(nVar2.f15744r[nVar2.f15746t], obj)) {
                this.f15720s = i11;
                return;
            } else {
                nVarArr[i11].f15746t += 2;
            }
        }
    }

    @Override // p042e0.d, java.util.Iterator
    public final Object next() {
        if (this.f15727u.f15725u != this.f15730x) {
            throw new ConcurrentModificationException();
        }
        if (!this.f15721t) {
            throw new NoSuchElementException();
        }
        n nVar = this.f15719r[this.f15720s];
        this.f15728v = nVar.f15744r[nVar.f15746t];
        this.f15729w = true;
        return super.next();
    }

    @Override // p042e0.d, java.util.Iterator
    public final void remove() {
        if (!this.f15729w) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f15721t;
        e eVar = this.f15727u;
        if (!z10) {
            y.a(eVar).remove(this.f15728v);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = this.f15719r[this.f15720s];
            Object obj = nVar.f15744r[nVar.f15746t];
            y.a(eVar).remove(this.f15728v);
            c(obj != null ? obj.hashCode() : 0, eVar.f15723s, obj, 0);
        }
        this.f15728v = null;
        this.f15729w = false;
        this.f15730x = eVar.f15725u;
    }
}
