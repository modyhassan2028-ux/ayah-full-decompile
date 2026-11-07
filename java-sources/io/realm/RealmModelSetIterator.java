package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class RealmModelSetIterator<T extends RealmModel> extends SetIterator<T> {
    private final Class<T> valueClass;

    public RealmModelSetIterator(OsSet osSet, BaseRealm baseRealm, Class<T> cls) {
        super(osSet, baseRealm);
        this.valueClass = cls;
    }

    @Override // io.realm.SetIterator
    public T getValueAtIndex(int i10) {
        return (T) this.baseRealm.get(this.valueClass, this.osSet.getRow(i10), false, new ArrayList());
    }
}
