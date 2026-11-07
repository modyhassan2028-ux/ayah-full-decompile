package io.realm;

import io.realm.RealmModel;

/* JADX INFO: loaded from: classes.dex */
public interface RealmObjectChangeListener<T extends RealmModel> {
    void onChange(T t2, ObjectChangeSet objectChangeSet);
}
