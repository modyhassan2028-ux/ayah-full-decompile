package io.realm;

import android.util.JsonReader;
import com.ayah.dao.realm.model.tafsir.BookEntry;
import io.realm.annotations.RealmModule;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RealmModule
class TafsirModuleMediator extends RealmProxyMediator {
    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;

    static {
        HashSet hashSet = new HashSet(1);
        hashSet.add(BookEntry.class);
        MODEL_CLASSES = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E e10, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<?> superclass = e10 instanceof RealmObjectProxy ? e10.getClass().getSuperclass() : e10.getClass();
        if (superclass.equals(BookEntry.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.BookEntryColumnInfo) realm.getSchema().getColumnInfo(BookEntry.class), (BookEntry) e10, z10, map, set));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(BookEntry.class)) {
            return com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.createColumnInfo(osSchemaInfo);
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createDetachedCopy(E e10, int i10, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Class<? super Object> superclass = e10.getClass().getSuperclass();
        if (superclass.equals(BookEntry.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.createDetachedCopy((BookEntry) e10, 0, i10, map));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> cls, Realm realm, JSONObject jSONObject, boolean z10) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(BookEntry.class)) {
            return cls.cast(com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createUsingJsonStream(Class<E> cls, Realm realm, JsonReader jsonReader) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(BookEntry.class)) {
            return cls.cast(com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Class<? extends RealmModel> getClazzImpl(String str) {
        RealmProxyMediator.checkClassName(str);
        if (str.equals(com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return BookEntry.class;
        }
        throw RealmProxyMediator.getMissingProxyClassException(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        HashMap map = new HashMap(1);
        map.put(BookEntry.class, com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.getExpectedObjectSchemaInfo());
        return map;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String getSimpleClassNameImpl(Class<? extends RealmModel> cls) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(BookEntry.class)) {
            return com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> cls) {
        return false;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(BookEntry.class)) {
            return com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.insert(realm, (BookEntry) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(BookEntry.class)) {
            return com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.insertOrUpdate(realm, (BookEntry) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean isEmbedded(Class<E> cls) {
        if (cls.equals(BookEntry.class)) {
            return false;
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E newInstance(Class<E> cls, Object obj, Row row, ColumnInfo columnInfo, boolean z10, List<String> list) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        try {
            realmObjectContext.set((BaseRealm) obj, row, columnInfo, z10, list);
            RealmProxyMediator.checkClass(cls);
            if (!cls.equals(BookEntry.class)) {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
            }
            E eCast = cls.cast(new com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy());
            realmObjectContext.clear();
            return eCast;
        } catch (Throwable th) {
            realmObjectContext.clear();
            throw th;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
        return true;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E e10, E e11, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<? super Object> superclass = e11.getClass().getSuperclass();
        if (!superclass.equals(BookEntry.class)) {
            throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
        throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.tafsir.BookEntry");
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap map = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel next = it.next();
            Class<?> superclass = next instanceof RealmObjectProxy ? next.getClass().getSuperclass() : next.getClass();
            if (superclass.equals(BookEntry.class)) {
                com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.insert(realm, (BookEntry) next, map);
                if (it.hasNext()) {
                    if (superclass.equals(BookEntry.class)) {
                        com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.insert(realm, it, map);
                        return;
                    }
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
                return;
            }
            throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap map = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel next = it.next();
            Class<?> superclass = next instanceof RealmObjectProxy ? next.getClass().getSuperclass() : next.getClass();
            if (superclass.equals(BookEntry.class)) {
                com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.insertOrUpdate(realm, (BookEntry) next, map);
                if (it.hasNext()) {
                    if (superclass.equals(BookEntry.class)) {
                        com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy.insertOrUpdate(realm, it, map);
                        return;
                    }
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
                return;
            }
            throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
    }
}
