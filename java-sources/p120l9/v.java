package p120l9;

import A9.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements Iterator, a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
