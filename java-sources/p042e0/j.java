package p042e0;

import A9.b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p129m9.c;
import p129m9.e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractCollection implements Collection, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f15736s;

    public /* synthetic */ j(int i10, Object obj) {
        this.f15735r = i10;
        this.f15736s = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f15735r) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f15735r) {
            case 1:
                p251z9.j.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f15735r) {
            case 0:
                ((e) this.f15736s).clear();
                break;
            default:
                ((e) this.f15736s).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f15735r) {
            case 0:
                return ((e) this.f15736s).containsValue(obj);
            default:
                return ((e) this.f15736s).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f15735r) {
            case 1:
                return ((e) this.f15736s).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15735r) {
            case 0:
                e eVar = (e) this.f15736s;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(2);
                }
                return new i(eVar, nVarArr);
            default:
                e eVar2 = (e) this.f15736s;
                eVar2.getClass();
                return new c(eVar2, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f15735r) {
            case 1:
                e eVar = (e) this.f15736s;
                eVar.c();
                int i10 = eVar.i(obj);
                if (i10 < 0) {
                    return false;
                }
                eVar.l(i10);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f15735r) {
            case 1:
                p251z9.j.e(collection, "elements");
                ((e) this.f15736s).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f15735r) {
            case 1:
                p251z9.j.e(collection, "elements");
                ((e) this.f15736s).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f15735r) {
            case 0:
                e eVar = (e) this.f15736s;
                eVar.getClass();
                return eVar.f15726v;
            default:
                return ((e) this.f15736s).f19718z;
        }
    }
}
