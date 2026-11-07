package io.realm;

import io.realm.internal.OsSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class SetIterator<E> implements Iterator<E> {
    protected final BaseRealm baseRealm;
    protected final OsSet osSet;
    private int pos = -1;

    public SetIterator(OsSet osSet, BaseRealm baseRealm) {
        this.osSet = osSet;
        this.baseRealm = baseRealm;
    }

    public E getValueAtIndex(int i10) {
        return (E) this.osSet.getValueAtIndex(i10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return ((long) (this.pos + 1)) < this.osSet.size();
    }

    @Override // java.util.Iterator
    public E next() {
        this.pos++;
        long size = this.osSet.size();
        int i10 = this.pos;
        if (i10 < size) {
            return getValueAtIndex(i10);
        }
        throw new NoSuchElementException("Cannot access index " + this.pos + " when size is " + size + ". Remember to check hasNext() before using next().");
    }
}
