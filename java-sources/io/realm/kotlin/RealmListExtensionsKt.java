package io.realm.kotlin;

import N9.InterfaceC0415h;
import io.realm.BaseRealm;
import io.realm.DynamicRealm;
import io.realm.Realm;
import io.realm.RealmList;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RealmListExtensionsKt {
    public static final <T> InterfaceC0415h toChangesetFlow(RealmList<T> realmList) {
        j.e(realmList, "<this>");
        BaseRealm baseRealm = realmList.baseRealm;
        if (baseRealm instanceof Realm) {
            Realm realm = (Realm) baseRealm;
            InterfaceC0415h interfaceC0415hChangesetFrom = realm.getConfiguration().getFlowFactory().changesetFrom(realm, realmList);
            j.d(interfaceC0415hChangesetFrom, "realmInstance.configurat…From(realmInstance, this)");
            return interfaceC0415hChangesetFrom;
        }
        if (!(baseRealm instanceof DynamicRealm)) {
            throw new IllegalStateException("Wrong type of Realm.");
        }
        DynamicRealm dynamicRealm = (DynamicRealm) baseRealm;
        InterfaceC0415h interfaceC0415hChangesetFrom2 = dynamicRealm.getConfiguration().getFlowFactory().changesetFrom(dynamicRealm, realmList);
        j.d(interfaceC0415hChangesetFrom2, "realmInstance.configurat…From(realmInstance, this)");
        return interfaceC0415hChangesetFrom2;
    }

    public static final <T> InterfaceC0415h toFlow(RealmList<T> realmList) {
        j.e(realmList, "<this>");
        BaseRealm baseRealm = realmList.baseRealm;
        if (baseRealm instanceof Realm) {
            Realm realm = (Realm) baseRealm;
            InterfaceC0415h interfaceC0415hFrom = realm.getConfiguration().getFlowFactory().from(realm, realmList);
            j.d(interfaceC0415hFrom, "realmInstance.configurat…from(realmInstance, this)");
            return interfaceC0415hFrom;
        }
        if (!(baseRealm instanceof DynamicRealm)) {
            throw new IllegalStateException("Wrong type of Realm.");
        }
        DynamicRealm dynamicRealm = (DynamicRealm) baseRealm;
        InterfaceC0415h interfaceC0415hFrom2 = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm, realmList);
        j.d(interfaceC0415hFrom2, "realmInstance.configurat…from(realmInstance, this)");
        return interfaceC0415hFrom2;
    }
}
