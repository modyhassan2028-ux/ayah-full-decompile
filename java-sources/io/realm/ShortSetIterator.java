package io.realm;

import io.realm.internal.OsSet;

/* JADX INFO: loaded from: classes.dex */
class ShortSetIterator extends SetIterator<Short> {
    public ShortSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // io.realm.SetIterator
    public Short getValueAtIndex(int i10) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i10);
        if (valueAtIndex == null) {
            return null;
        }
        return Short.valueOf(((Long) valueAtIndex).shortValue());
    }
}
