package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class RealmAnySetOperator extends SetValueOperator<RealmAny> {
    public RealmAnySetOperator(BaseRealm baseRealm, OsSet osSet, Class<RealmAny> cls) {
        super(baseRealm, osSet, cls);
    }

    private void checkValidObject(RealmAny realmAny) {
        try {
            realmAny.checkValidObject(this.baseRealm);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("RealmAny collection contains unmanaged objects.", e10);
        }
    }

    private RealmAny getManagedRealmAny(RealmAny realmAny) {
        if (realmAny == null) {
            return RealmAny.nullValue();
        }
        if (realmAny.getType() != RealmAny.Type.OBJECT) {
            return realmAny;
        }
        RealmModel realmModelAsRealmModel = realmAny.asRealmModel(RealmModel.class);
        if (CollectionUtils.checkCanObjectBeCopied(this.baseRealm, realmModelAsRealmModel, this.valueClass.getName(), CollectionUtils.SET_TYPE)) {
            realmModelAsRealmModel = CollectionUtils.copyToRealm(this.baseRealm, realmModelAsRealmModel);
        }
        return RealmAny.valueOf(realmModelAsRealmModel);
    }

    private NativeRealmAnyCollection getNativeRealmAnyCollection(Collection<? extends RealmAny> collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        int i10 = 0;
        for (RealmAny realmAny : collection) {
            if (realmAny != null) {
                checkValidObject(realmAny);
                jArr[i10] = realmAny.getNativePtr();
                zArr[i10] = true;
            }
            i10++;
        }
        return NativeRealmAnyCollection.newRealmAnyCollection(jArr, zArr);
    }

    @Override // io.realm.SetValueOperator
    public boolean addAllInternal(Collection<? extends RealmAny> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends RealmAny> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getManagedRealmAny(it.next()));
        }
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean containsInternal(Object obj) {
        RealmAny realmAnyNullValue = obj == null ? RealmAny.nullValue() : (RealmAny) obj;
        checkValidObject(realmAnyNullValue);
        return this.osSet.containsRealmAny(realmAnyNullValue.getNativePtr());
    }

    @Override // io.realm.SetValueOperator
    public boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean removeInternal(Object obj) {
        RealmAny realmAnyNullValue = obj == null ? RealmAny.nullValue() : (RealmAny) obj;
        checkValidObject(realmAnyNullValue);
        return this.osSet.removeRealmAny(realmAnyNullValue.getNativePtr());
    }

    @Override // io.realm.SetValueOperator
    public boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(getNativeRealmAnyCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    @Override // io.realm.SetValueOperator
    public boolean add(RealmAny realmAny) {
        return this.osSet.addRealmAny(getManagedRealmAny(realmAny).getNativePtr());
    }
}
