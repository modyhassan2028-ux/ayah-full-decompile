package io.realm;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface OrderedRealmCollection<E> extends List<E>, RealmCollection<E> {
    OrderedRealmCollectionSnapshot<E> createSnapshot();

    boolean deleteFirstFromRealm();

    void deleteFromRealm(int i10);

    boolean deleteLastFromRealm();

    E first();

    E first(E e10);

    E last();

    E last(E e10);

    RealmResults<E> sort(String str);

    RealmResults<E> sort(String str, Sort sort);

    RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2);

    RealmResults<E> sort(String[] strArr, Sort[] sortArr);
}
