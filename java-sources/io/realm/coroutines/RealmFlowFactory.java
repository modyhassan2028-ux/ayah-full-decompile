package io.realm.coroutines;

import N9.InterfaceC0415h;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.internal.coroutines.InternalFlowFactory;

/* JADX INFO: loaded from: classes.dex */
public class RealmFlowFactory implements FlowFactory {
    private final InternalFlowFactory factory;

    public RealmFlowFactory(Boolean bool) {
        this.factory = new InternalFlowFactory(bool.booleanValue());
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(Realm realm, RealmResults<T> realmResults) {
        return this.factory.changesetFrom(realm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h from(Realm realm) {
        return this.factory.from(realm);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, RealmResults<T> realmResults) {
        return this.factory.changesetFrom(dynamicRealm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h from(DynamicRealm dynamicRealm) {
        return this.factory.from(dynamicRealm);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(Realm realm, RealmList<T> realmList) {
        return this.factory.changesetFrom(realm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(Realm realm, RealmResults<T> realmResults) {
        return this.factory.from(realm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, RealmList<T> realmList) {
        return this.factory.changesetFrom(dynamicRealm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(DynamicRealm dynamicRealm, RealmResults<T> realmResults) {
        return this.factory.from(dynamicRealm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> InterfaceC0415h changesetFrom(Realm realm, T t2) {
        return this.factory.changesetFrom(realm, t2);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(Realm realm, RealmList<T> realmList) {
        return this.factory.from(realm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h changesetFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        return this.factory.changesetFrom(dynamicRealm, dynamicRealmObject);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> InterfaceC0415h from(DynamicRealm dynamicRealm, RealmList<T> realmList) {
        return this.factory.from(dynamicRealm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> InterfaceC0415h from(Realm realm, T t2) {
        return this.factory.from(realm, t2);
    }

    @Override // io.realm.coroutines.FlowFactory
    public InterfaceC0415h from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        return this.factory.from(dynamicRealm, dynamicRealmObject);
    }
}
