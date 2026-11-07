package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
class RealmAnySetIterator extends SetIterator<RealmAny> {
    public RealmAnySetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.SetIterator
    public RealmAny getValueAtIndex(int i10) {
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, new NativeRealmAny(this.osSet.getRealmAny(i10))));
    }
}
