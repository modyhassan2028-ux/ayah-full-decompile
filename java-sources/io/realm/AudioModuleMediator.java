package io.realm;

import android.util.JsonReader;
import com.ayah.dao.realm.model.audio.Reciter;
import com.ayah.dao.realm.model.audio.Timing;
import com.ayah.dao.realm.model.audio.Track;
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
class AudioModuleMediator extends RealmProxyMediator {
    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;

    static {
        HashSet hashSet = new HashSet(3);
        hashSet.add(Track.class);
        hashSet.add(Timing.class);
        hashSet.add(Reciter.class);
        MODEL_CLASSES = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E e10, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<?> superclass = e10 instanceof RealmObjectProxy ? e10.getClass().getSuperclass() : e10.getClass();
        if (superclass.equals(Track.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_audio_TrackRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_audio_TrackRealmProxy.TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class), (Track) e10, z10, map, set));
        }
        if (superclass.equals(Timing.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_audio_TimingRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_audio_TimingRealmProxy.TimingColumnInfo) realm.getSchema().getColumnInfo(Timing.class), (Timing) e10, z10, map, set));
        }
        if (superclass.equals(Reciter.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_audio_ReciterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_audio_ReciterRealmProxy.ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class), (Reciter) e10, z10, map, set));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(Track.class)) {
            return com_ayah_dao_realm_model_audio_TrackRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Timing.class)) {
            return com_ayah_dao_realm_model_audio_TimingRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Reciter.class)) {
            return com_ayah_dao_realm_model_audio_ReciterRealmProxy.createColumnInfo(osSchemaInfo);
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createDetachedCopy(E e10, int i10, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Class<? super Object> superclass = e10.getClass().getSuperclass();
        if (superclass.equals(Track.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_audio_TrackRealmProxy.createDetachedCopy((Track) e10, 0, i10, map));
        }
        if (superclass.equals(Timing.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_audio_TimingRealmProxy.createDetachedCopy((Timing) e10, 0, i10, map));
        }
        if (superclass.equals(Reciter.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_audio_ReciterRealmProxy.createDetachedCopy((Reciter) e10, 0, i10, map));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> cls, Realm realm, JSONObject jSONObject, boolean z10) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(Track.class)) {
            return cls.cast(com_ayah_dao_realm_model_audio_TrackRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Timing.class)) {
            return cls.cast(com_ayah_dao_realm_model_audio_TimingRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Reciter.class)) {
            return cls.cast(com_ayah_dao_realm_model_audio_ReciterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createUsingJsonStream(Class<E> cls, Realm realm, JsonReader jsonReader) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(Track.class)) {
            return cls.cast(com_ayah_dao_realm_model_audio_TrackRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Timing.class)) {
            return cls.cast(com_ayah_dao_realm_model_audio_TimingRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Reciter.class)) {
            return cls.cast(com_ayah_dao_realm_model_audio_ReciterRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Class<? extends RealmModel> getClazzImpl(String str) {
        RealmProxyMediator.checkClassName(str);
        if (str.equals(com_ayah_dao_realm_model_audio_TrackRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Track.class;
        }
        if (str.equals(com_ayah_dao_realm_model_audio_TimingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Timing.class;
        }
        if (str.equals(com_ayah_dao_realm_model_audio_ReciterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Reciter.class;
        }
        throw RealmProxyMediator.getMissingProxyClassException(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        HashMap map = new HashMap(3);
        map.put(Track.class, com_ayah_dao_realm_model_audio_TrackRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Timing.class, com_ayah_dao_realm_model_audio_TimingRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Reciter.class, com_ayah_dao_realm_model_audio_ReciterRealmProxy.getExpectedObjectSchemaInfo());
        return map;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String getSimpleClassNameImpl(Class<? extends RealmModel> cls) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(Track.class)) {
            return com_ayah_dao_realm_model_audio_TrackRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Timing.class)) {
            return com_ayah_dao_realm_model_audio_TimingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Reciter.class)) {
            return com_ayah_dao_realm_model_audio_ReciterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> cls) {
        return Track.class.isAssignableFrom(cls) || Reciter.class.isAssignableFrom(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(Track.class)) {
            return com_ayah_dao_realm_model_audio_TrackRealmProxy.insert(realm, (Track) realmModel, map);
        }
        if (superclass.equals(Timing.class)) {
            return com_ayah_dao_realm_model_audio_TimingRealmProxy.insert(realm, (Timing) realmModel, map);
        }
        if (superclass.equals(Reciter.class)) {
            return com_ayah_dao_realm_model_audio_ReciterRealmProxy.insert(realm, (Reciter) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(Track.class)) {
            return com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, (Track) realmModel, map);
        }
        if (superclass.equals(Timing.class)) {
            return com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, (Timing) realmModel, map);
        }
        if (superclass.equals(Reciter.class)) {
            return com_ayah_dao_realm_model_audio_ReciterRealmProxy.insertOrUpdate(realm, (Reciter) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean isEmbedded(Class<E> cls) {
        if (cls.equals(Track.class) || cls.equals(Timing.class) || cls.equals(Reciter.class)) {
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
            if (cls.equals(Track.class)) {
                E eCast = cls.cast(new com_ayah_dao_realm_model_audio_TrackRealmProxy());
                realmObjectContext.clear();
                return eCast;
            }
            if (cls.equals(Timing.class)) {
                E eCast2 = cls.cast(new com_ayah_dao_realm_model_audio_TimingRealmProxy());
                realmObjectContext.clear();
                return eCast2;
            }
            if (!cls.equals(Reciter.class)) {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
            }
            E eCast3 = cls.cast(new com_ayah_dao_realm_model_audio_ReciterRealmProxy());
            realmObjectContext.clear();
            return eCast3;
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
        if (superclass.equals(Track.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.audio.Track");
        }
        if (superclass.equals(Timing.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.audio.Timing");
        }
        if (!superclass.equals(Reciter.class)) {
            throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
        throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.audio.Reciter");
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap map = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel next = it.next();
            Class<?> superclass = next instanceof RealmObjectProxy ? next.getClass().getSuperclass() : next.getClass();
            if (superclass.equals(Track.class)) {
                com_ayah_dao_realm_model_audio_TrackRealmProxy.insert(realm, (Track) next, map);
            } else if (superclass.equals(Timing.class)) {
                com_ayah_dao_realm_model_audio_TimingRealmProxy.insert(realm, (Timing) next, map);
            } else if (superclass.equals(Reciter.class)) {
                com_ayah_dao_realm_model_audio_ReciterRealmProxy.insert(realm, (Reciter) next, map);
            } else {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (it.hasNext()) {
                if (superclass.equals(Track.class)) {
                    com_ayah_dao_realm_model_audio_TrackRealmProxy.insert(realm, it, map);
                } else if (superclass.equals(Timing.class)) {
                    com_ayah_dao_realm_model_audio_TimingRealmProxy.insert(realm, it, map);
                } else {
                    if (superclass.equals(Reciter.class)) {
                        com_ayah_dao_realm_model_audio_ReciterRealmProxy.insert(realm, it, map);
                        return;
                    }
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap map = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel next = it.next();
            Class<?> superclass = next instanceof RealmObjectProxy ? next.getClass().getSuperclass() : next.getClass();
            if (superclass.equals(Track.class)) {
                com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, (Track) next, map);
            } else if (superclass.equals(Timing.class)) {
                com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, (Timing) next, map);
            } else if (superclass.equals(Reciter.class)) {
                com_ayah_dao_realm_model_audio_ReciterRealmProxy.insertOrUpdate(realm, (Reciter) next, map);
            } else {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (it.hasNext()) {
                if (superclass.equals(Track.class)) {
                    com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, it, map);
                } else if (superclass.equals(Timing.class)) {
                    com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, it, map);
                } else {
                    if (superclass.equals(Reciter.class)) {
                        com_ayah_dao_realm_model_audio_ReciterRealmProxy.insertOrUpdate(realm, it, map);
                        return;
                    }
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
            }
        }
    }
}
