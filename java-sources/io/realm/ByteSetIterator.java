package io.realm;

import io.realm.internal.OsSet;

/* JADX INFO: loaded from: classes.dex */
class ByteSetIterator extends SetIterator<Byte> {
    public ByteSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public Byte getValueAtIndex(int i10) {
        Object valueAtIndex = this.osSet.getValueAtIndex(i10);
        if (valueAtIndex == null) {
            return null;
        }
        return Byte.valueOf(((Long) valueAtIndex).byteValue());
    }
}
