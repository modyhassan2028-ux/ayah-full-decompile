package io.realm;

import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface RealmCollection<E> extends Collection<E>, ManageableObject, Freezable<RealmCollection<E>> {
    double average(String str);

    boolean contains(Object obj);

    boolean deleteAllFromRealm();

    boolean isLoaded();

    @Override // io.realm.internal.ManageableObject
    boolean isManaged();

    @Override // io.realm.internal.ManageableObject
    boolean isValid();

    boolean load();

    Number max(String str);

    Date maxDate(String str);

    Number min(String str);

    Date minDate(String str);

    Number sum(String str);

    RealmQuery<E> where();
}
