package p042e0;

import A9.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n[] f15719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15721t = true;

    public d(m mVar, n[] nVarArr) {
        this.f15719r = nVarArr;
        nVarArr[0].a(mVar.f15743d, Integer.bitCount(mVar.f15740a) * 2, 0);
        this.f15720s = 0;
        a();
    }

    public final void a() {
        int i10 = this.f15720s;
        n[] nVarArr = this.f15719r;
        n nVar = nVarArr[i10];
        if (nVar.f15746t < nVar.f15745s) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                n nVar2 = nVarArr[i10];
                int i11 = nVar2.f15746t;
                Object[] objArr = nVar2.f15744r;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f15746t = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f15720s = iB;
                return;
            }
            if (i10 > 0) {
                n nVar3 = nVarArr[i10 - 1];
                int i12 = nVar3.f15746t;
                int length2 = nVar3.f15744r.length;
                nVar3.f15746t = i12 + 1;
            }
            nVarArr[i10].a(m.f15739e.f15743d, 0, 0);
            i10--;
        }
        this.f15721t = false;
    }

    public final int b(int i10) {
        n[] nVarArr = this.f15719r;
        n nVar = nVarArr[i10];
        int i11 = nVar.f15746t;
        if (i11 < nVar.f15745s) {
            return i10;
        }
        Object[] objArr = nVar.f15744r;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        j.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i10 == 6) {
            n nVar2 = nVarArr[i10 + 1];
            Object[] objArr2 = mVar.f15743d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i10 + 1].a(mVar.f15743d, Integer.bitCount(mVar.f15740a) * 2, 0);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15721t;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f15721t) {
            throw new NoSuchElementException();
        }
        Object next = this.f15719r[this.f15720s].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
