package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f18300a;

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.W(this, j, j10, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public K0(Collection collection) {
        this.f18300a = collection;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return AbstractC1062c.v(this.f18300a).spliterator();
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i10) {
        Iterator it = this.f18300a.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    @Override // j$.util.stream.G0
    public final Object[] m(IntFunction intFunction) {
        Collection collection = this.f18300a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f18300a.size();
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        AbstractC1062c.q(this.f18300a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f18300a.size()), this.f18300a);
    }
}
