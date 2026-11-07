package io.realm.internal.modules;

import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Util;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CompositeMediator extends RealmProxyMediator {
    private final Map<String, Class<? extends RealmModel>> internalClassNames = new HashMap();
    private final Map<Class<? extends RealmModel>, RealmProxyMediator> mediators;

    public CompositeMediator(RealmProxyMediator... realmProxyMediatorArr) {
        HashMap map = new HashMap();
        if (realmProxyMediatorArr != null) {
            for (RealmProxyMediator realmProxyMediator : realmProxyMediatorArr) {
                for (Class<? extends RealmModel> cls : realmProxyMediator.getModelClasses()) {
                    String simpleClassName = realmProxyMediator.getSimpleClassName(cls);
                    Class<? extends RealmModel> cls2 = this.internalClassNames.get(simpleClassName);
                    if (cls2 != null && !cls2.equals(cls)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, map.get(cls2), realmProxyMediator, simpleClassName));
                    }
                    map.put(cls, realmProxyMediator);
                    this.internalClassNames.put(simpleClassName, cls);
                }
            }
        }
        this.mediators = DesugarCollections.unmodifiableMap(map);
    }

    private RealmProxyMediator getMediator(Class<? extends RealmModel> cls) {
        RealmProxyMediator realmProxyMediator = this.mediators.get(Util.getOriginalModelClass(cls));
        if (realmProxyMediator != null) {
            return realmProxyMediator;
        }
        throw new RealmException(cls.getSimpleName().concat(" is not part of the schema for this Realm"));
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E e10, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        return (E) getMediator(Util.getOriginalModelClass(e10.getClass())).copyOrUpdate(realm, e10, z10, map, set);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        return getMediator(cls).createColumnInfo(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createDetachedCopy(E e10, int i10, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        return (E) getMediator(Util.getOriginalModelClass(e10.getClass())).createDetachedCopy(e10, i10, map);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> cls, Realm realm, JSONObject jSONObject, boolean z10) {
        return (E) getMediator((Class<? extends RealmModel>) cls).createOrUpdateUsingJsonObject(cls, realm, jSONObject, z10);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createUsingJsonStream(Class<E> cls, Realm realm, JsonReader jsonReader) {
        return (E) getMediator((Class<? extends RealmModel>) cls).createUsingJsonStream(cls, realm, jsonReader);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <T extends RealmModel> Class<T> getClazzImpl(String str) {
        return getMediator(str).getClazz(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        HashMap map = new HashMap();
        Iterator<RealmProxyMediator> it = this.mediators.values().iterator();
        while (it.hasNext()) {
            map.putAll(it.next().getExpectedObjectSchemaInfoMap());
        }
        return map;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return this.mediators.keySet();
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String getSimpleClassNameImpl(Class<? extends RealmModel> cls) {
        return getMediator(cls).getSimpleClassName(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> cls) {
        return getMediator(cls).hasPrimaryKey(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        return getMediator(Util.getOriginalModelClass(realmModel.getClass())).insert(realm, realmModel, map);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        return getMediator(Util.getOriginalModelClass(realmModel.getClass())).insertOrUpdate(realm, realmModel, map);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean isEmbedded(Class<E> cls) {
        return getMediator(Util.getOriginalModelClass(cls)).isEmbedded(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E newInstance(Class<E> cls, Object obj, Row row, ColumnInfo columnInfo, boolean z10, List<String> list) {
        return (E) getMediator((Class<? extends RealmModel>) cls).newInstance(cls, obj, row, columnInfo, z10, list);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
        Iterator<Map.Entry<Class<? extends RealmModel>, RealmProxyMediator>> it = this.mediators.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().transformerApplied()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E e10, E e11, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        getMediator(Util.getOriginalModelClass(e11.getClass())).updateEmbeddedObject(realm, e10, e11, map, set);
    }

    private RealmProxyMediator getMediator(String str) {
        return getMediator(this.internalClassNames.get(str));
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(Realm realm, Collection<? extends RealmModel> collection) {
        getMediator(Util.getOriginalModelClass(Util.getOriginalModelClass(collection.iterator().next().getClass()))).insert(realm, collection);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection) {
        getMediator(Util.getOriginalModelClass(Util.getOriginalModelClass(collection.iterator().next().getClass()))).insertOrUpdate(realm, collection);
    }
}
