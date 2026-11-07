package io.realm;

import io.realm.internal.OsSet;

/* JADX INFO: loaded from: classes.dex */
class DynamicSetIterator extends SetIterator<DynamicRealmObject> {
    private final String className;

    public DynamicSetIterator(OsSet osSet, BaseRealm baseRealm, String str) {
        super(osSet, baseRealm);
        this.className = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public DynamicRealmObject getValueAtIndex(int i10) {
        return (DynamicRealmObject) this.baseRealm.get(DynamicRealmObject.class, this.className, this.osSet.getRow(i10));
    }
}
