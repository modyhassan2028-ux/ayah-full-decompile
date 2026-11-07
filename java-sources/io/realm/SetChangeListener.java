package io.realm;

/* JADX INFO: loaded from: classes.dex */
public interface SetChangeListener<T> {
    void onChange(RealmSet<T> realmSet, SetChangeSet setChangeSet);
}
