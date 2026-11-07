package io.realm.kotlin;

import io.realm.RealmChangeListener;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RealmModelExtensionsKt {
    public static final <E extends RealmModel> void addChangeListener(E e10, RealmChangeListener<E> realmChangeListener) {
        j.e(e10, "<this>");
        j.e(realmChangeListener, "listener");
        RealmObject.addChangeListener(e10, realmChangeListener);
    }

    public static final void deleteFromRealm(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        RealmObject.deleteFromRealm(realmModel);
    }

    public static final <T extends RealmModel> T freeze(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        T t2 = (T) RealmObject.freeze(realmModel);
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of io.realm.kotlin.RealmModelExtensionsKt.freeze");
    }

    public static final boolean isFrozen(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        return RealmObject.isFrozen(realmModel);
    }

    public static final boolean isLoaded(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        return RealmObject.isLoaded(realmModel);
    }

    public static final boolean isManaged(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        return RealmObject.isManaged(realmModel);
    }

    public static final boolean isValid(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        return RealmObject.isValid(realmModel);
    }

    public static final boolean load(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        return RealmObject.load(realmModel);
    }

    public static final void removeAllChangeListeners(RealmModel realmModel) {
        j.e(realmModel, "<this>");
        RealmObject.removeAllChangeListeners(realmModel);
    }

    public static final <E extends RealmModel> void removeChangeListener(E e10, RealmChangeListener<E> realmChangeListener) {
        j.e(e10, "<this>");
        j.e(realmChangeListener, "listener");
        RealmObject.removeChangeListener(e10, realmChangeListener);
    }

    public static final <E extends RealmModel> void addChangeListener(E e10, RealmObjectChangeListener<E> realmObjectChangeListener) {
        j.e(e10, "<this>");
        j.e(realmObjectChangeListener, "listener");
        RealmObject.addChangeListener(e10, realmObjectChangeListener);
    }

    public static final <E extends RealmModel> void removeChangeListener(E e10, RealmObjectChangeListener<E> realmObjectChangeListener) {
        j.e(e10, "<this>");
        j.e(realmObjectChangeListener, "listener");
        RealmObject.removeChangeListener(e10, realmObjectChangeListener);
    }
}
