package io.realm;

import io.realm.internal.OsSet;

/* JADX INFO: loaded from: classes.dex */
class BinarySetIterator extends SetIterator<byte[]> {
    public BinarySetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    @Override // io.realm.SetIterator
    public byte[] getValueAtIndex(int i10) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i10);
        if (valueAtIndex == null) {
            return null;
        }
        return (byte[]) valueAtIndex;
    }
}
