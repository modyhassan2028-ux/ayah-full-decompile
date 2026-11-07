package io.realm.internal;

import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmProxyMediator {
    public static void checkClass(Class<? extends RealmModel> cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public static void checkClassName(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public static RealmException getMissingProxyClassException(Class<? extends RealmModel> cls) {
        return new RealmException(a.D("'", cls.toString(), "' is not part of the schema for this Realm."));
    }

    public static IllegalStateException getNotEmbeddedClassException(String str) {
        return new IllegalStateException(c.s("This class is not marked embedded: ", str));
    }

    public abstract <E extends RealmModel> E copyOrUpdate(Realm realm, E e10, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set);

    public abstract ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo);

    public abstract <E extends RealmModel> E createDetachedCopy(E e10, int i10, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map);

    public abstract <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> cls, Realm realm, JSONObject jSONObject, boolean z10);

    public abstract <E extends RealmModel> E createUsingJsonStream(Class<E> cls, Realm realm, JsonReader jsonReader);

    public boolean equals(Object obj) {
        if (obj instanceof RealmProxyMediator) {
            return getModelClasses().equals(((RealmProxyMediator) obj).getModelClasses());
        }
        return false;
    }

    public final <T extends RealmModel> Class<T> getClazz(String str) {
        return getClazzImpl(str);
    }

    public abstract <T extends RealmModel> Class<T> getClazzImpl(String str);

    public abstract Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap();

    public abstract Set<Class<? extends RealmModel>> getModelClasses();

    public final String getSimpleClassName(Class<? extends RealmModel> cls) {
        return getSimpleClassNameImpl(Util.getOriginalModelClass(cls));
    }

    public abstract String getSimpleClassNameImpl(Class<? extends RealmModel> cls);

    public boolean hasPrimaryKey(Class<? extends RealmModel> cls) {
        return hasPrimaryKeyImpl(cls);
    }

    public abstract boolean hasPrimaryKeyImpl(Class<? extends RealmModel> cls);

    public int hashCode() {
        return getModelClasses().hashCode();
    }

    public abstract long insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map);

    public abstract void insert(Realm realm, Collection<? extends RealmModel> collection);

    public abstract long insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map);

    public abstract void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection);

    public abstract <E extends RealmModel> boolean isEmbedded(Class<E> cls);

    public abstract <E extends RealmModel> E newInstance(Class<E> cls, Object obj, Row row, ColumnInfo columnInfo, boolean z10, List<String> list);

    public boolean transformerApplied() {
        return false;
    }

    public abstract <E extends RealmModel> void updateEmbeddedObject(Realm realm, E e10, E e11, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set);

    public static RealmException getMissingProxyClassException(String str) {
        return new RealmException(a.D("'", str, "' is not part of the schema for this Realm."));
    }
}
