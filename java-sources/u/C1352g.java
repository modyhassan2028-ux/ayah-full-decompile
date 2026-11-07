package u;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: u.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1352g implements Set, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E f22728s;

    public C1352g(E e10, int i10) {
        this.f22727r = i10;
        switch (i10) {
            case 1:
                p251z9.j.e(e10, "parent");
                this.f22728s = e10;
                break;
            default:
                p251z9.j.e(e10, "parent");
                this.f22728s = e10;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f22727r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f22727r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f22727r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f22727r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return p251z9.j.a(this.f22728s.g(entry.getKey()), entry.getValue());
            default:
                return this.f22728s.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f22727r) {
            case 0:
                p251z9.j.e(collection, "elements");
                Collection<Map.Entry> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!p251z9.j.a(this.f22728s.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                p251z9.j.e(collection, "elements");
                Collection collection3 = collection;
                if (collection3.isEmpty()) {
                    return true;
                }
                Iterator it = collection3.iterator();
                while (it.hasNext()) {
                    if (!this.f22728s.c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f22727r) {
            case 0:
                break;
        }
        return this.f22728s.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f22727r) {
            case 0:
                return AbstractC0813f2.I(new p011b0.g(this, null, 1));
            default:
                return AbstractC0813f2.I(new p011b0.g(this, null, 2));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f22727r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f22727r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f22727r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f22727r) {
            case 0:
                break;
        }
        return this.f22728s.f22673e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f22727r) {
            case 0:
                break;
        }
        return p251z9.i.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f22727r) {
            case 0:
                p251z9.j.e(objArr, "array");
                break;
            default:
                p251z9.j.e(objArr, "array");
                break;
        }
        return p251z9.i.b(this, objArr);
    }
}
