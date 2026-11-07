package io.realm.coroutines;

import N9.InterfaceC0415h;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes.dex */
public interface FlowFactory {
    InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    <T> InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, RealmList<T> realmList);

    <T> InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, RealmResults<T> realmResults);

    <T> InterfaceC0415h changesetFrom(Realm realm, RealmList<T> realmList);

    <T extends RealmModel> InterfaceC0415h changesetFrom(Realm realm, T t2);

    <T> InterfaceC0415h changesetFrom(Realm realm, RealmResults<T> realmResults);

    InterfaceC0415h from(DynamicRealm dynamicRealm);

    InterfaceC0415h from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    <T> InterfaceC0415h from(DynamicRealm dynamicRealm, RealmList<T> realmList);

    <T> InterfaceC0415h from(DynamicRealm dynamicRealm, RealmResults<T> realmResults);

    InterfaceC0415h from(Realm realm);

    <T> InterfaceC0415h from(Realm realm, RealmList<T> realmList);

    <T extends RealmModel> InterfaceC0415h from(Realm realm, T t2);

    <T> InterfaceC0415h from(Realm realm, RealmResults<T> realmResults);
}
