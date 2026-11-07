package H0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import j$.lang.Iterable$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Collection, A9.a, j$.util.Collection {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3198r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3199s;

    public f0() {
        int i10 = u.L.f22698a;
        this.f3199s = new u.B(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3198r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f3198r) {
            case 0:
                ((u.B) this.f3199s).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).c(obj);
            default:
                return ((u.E) this.f3199s).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3198r) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((u.B) this.f3199s).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                p251z9.j.e(collection, "elements");
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (!((u.E) this.f3199s).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        int i10 = this.f3198r;
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).g == 0;
            default:
                return ((u.E) this.f3199s).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3198r) {
            case 0:
                u.B b5 = (u.B) this.f3199s;
                b5.getClass();
                return new G9.h(new u.D(b5));
            default:
                return AbstractC0813f2.I(new p011b0.g(this, null, 3));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        switch (this.f3198r) {
        }
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f3198r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f3198r) {
            case 0:
                return ((u.B) this.f3199s).g;
            default:
                return ((u.E) this.f3199s).f22673e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        switch (this.f3198r) {
        }
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        switch (this.f3198r) {
        }
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f3198r) {
            case 0:
                break;
        }
        return p251z9.i.a(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        switch (this.f3198r) {
            case 0:
                break;
        }
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public /* synthetic */ j$.util.Spliterator spliterator() {
        switch (this.f3198r) {
            case 0:
                break;
        }
        return j$.util.Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        switch (this.f3198r) {
            case 0:
                break;
        }
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        int i10 = this.f3198r;
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3198r) {
            case 0:
                break;
            default:
                p251z9.j.e(objArr, "array");
                break;
        }
        return p251z9.i.b(this, objArr);
    }

    public f0(u.E e10) {
        p251z9.j.e(e10, "parent");
        this.f3199s = e10;
    }
}
