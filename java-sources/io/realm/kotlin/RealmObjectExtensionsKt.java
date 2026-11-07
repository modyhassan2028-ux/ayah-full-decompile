package io.realm.kotlin;

import C4.e;
import N9.InterfaceC0415h;
import io.realm.BaseRealm;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.internal.RealmObjectProxy;
import io.realm.rx.ObjectChange;

/* JADX INFO: loaded from: classes.dex */
public final class RealmObjectExtensionsKt {
    public static final <T extends RealmModel> InterfaceC0415h toChangesetFlow(T t2) {
        InterfaceC0415h interfaceC0415hChangesetFrom;
        if (t2 == null) {
            interfaceC0415hChangesetFrom = null;
        } else {
            if (!(t2 instanceof RealmObjectProxy)) {
                return new e(7, new ObjectChange(t2, null));
            }
            BaseRealm realm$realm = ((RealmObjectProxy) t2).realmGet$proxyState().getRealm$realm();
            if (realm$realm instanceof Realm) {
                Realm realm = (Realm) realm$realm;
                interfaceC0415hChangesetFrom = realm.getConfiguration().getFlowFactory().changesetFrom(realm, t2);
            } else {
                if (!(realm$realm instanceof DynamicRealm)) {
                    throw new UnsupportedOperationException(realm$realm.getClass() + " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                }
                DynamicRealm dynamicRealm = (DynamicRealm) realm$realm;
                interfaceC0415hChangesetFrom = dynamicRealm.getConfiguration().getFlowFactory().changesetFrom(dynamicRealm, (DynamicRealmObject) t2);
                if (interfaceC0415hChangesetFrom == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T of io.realm.kotlin.RealmObjectExtensionsKt.toChangesetFlow$lambda-3$lambda-2>?>");
                }
            }
        }
        return interfaceC0415hChangesetFrom == null ? new e(7, null) : interfaceC0415hChangesetFrom;
    }

    public static final <T extends RealmModel> InterfaceC0415h toFlow(T t2) {
        InterfaceC0415h interfaceC0415hFrom;
        if (t2 == null) {
            interfaceC0415hFrom = null;
        } else {
            if (!(t2 instanceof RealmObjectProxy)) {
                return new e(7, t2);
            }
            BaseRealm realm$realm = ((RealmObjectProxy) t2).realmGet$proxyState().getRealm$realm();
            if (realm$realm instanceof Realm) {
                Realm realm = (Realm) realm$realm;
                interfaceC0415hFrom = realm.getConfiguration().getFlowFactory().from(realm, t2);
            } else {
                if (!(realm$realm instanceof DynamicRealm)) {
                    throw new UnsupportedOperationException(realm$realm.getClass() + " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                }
                DynamicRealm dynamicRealm = (DynamicRealm) realm$realm;
                interfaceC0415hFrom = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm, (DynamicRealmObject) t2);
                if (interfaceC0415hFrom == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of io.realm.kotlin.RealmObjectExtensionsKt.toFlow$lambda-1$lambda-0?>");
                }
            }
        }
        return interfaceC0415hFrom == null ? new e(7, null) : interfaceC0415hFrom;
    }
}
