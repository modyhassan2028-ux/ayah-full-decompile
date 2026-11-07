package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.audio.Timing;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_audio_TimingRealmProxy extends Timing implements RealmObjectProxy, com_ayah_dao_realm_model_audio_TimingRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TimingColumnInfo columnInfo;
    private ProxyState<Timing> proxyState;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Timing";
    }

    public static final class TimingColumnInfo extends ColumnInfo {
        long startTimeColKey;
        long verseIDColKey;

        public TimingColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.verseIDColKey = addColumnDetails("verseID", "verseID", objectSchemaInfo);
            this.startTimeColKey = addColumnDetails("startTime", "startTime", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new TimingColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TimingColumnInfo timingColumnInfo = (TimingColumnInfo) columnInfo;
            TimingColumnInfo timingColumnInfo2 = (TimingColumnInfo) columnInfo2;
            timingColumnInfo2.verseIDColKey = timingColumnInfo.verseIDColKey;
            timingColumnInfo2.startTimeColKey = timingColumnInfo.startTimeColKey;
        }

        public TimingColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_audio_TimingRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Timing copy(Realm realm, TimingColumnInfo timingColumnInfo, Timing timing, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(timing);
        if (realmObjectProxy != null) {
            return (Timing) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Timing.class), set);
        osObjectBuilder.addInteger(timingColumnInfo.verseIDColKey, Long.valueOf(timing.realmGet$verseID()));
        osObjectBuilder.addDouble(timingColumnInfo.startTimeColKey, Double.valueOf(timing.realmGet$startTime()));
        com_ayah_dao_realm_model_audio_TimingRealmProxy com_ayah_dao_realm_model_audio_timingrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(timing, com_ayah_dao_realm_model_audio_timingrealmproxyNewProxyInstance);
        return com_ayah_dao_realm_model_audio_timingrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Timing copyOrUpdate(Realm realm, TimingColumnInfo timingColumnInfo, Timing timing, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((timing instanceof RealmObjectProxy) && !RealmObject.isFrozen(timing)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timing;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return timing;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmModel realmModel = (RealmObjectProxy) map.get(timing);
        return realmModel != null ? (Timing) realmModel : copy(realm, timingColumnInfo, timing, z10, map, set);
    }

    public static TimingColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TimingColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Timing createDetachedCopy(Timing timing, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Timing timing2;
        if (i10 > i11 || timing == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(timing);
        if (cacheData == null) {
            timing2 = new Timing();
            map.put(timing, new RealmObjectProxy.CacheData<>(i10, timing2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Timing) cacheData.object;
            }
            Timing timing3 = (Timing) cacheData.object;
            cacheData.minDepth = i10;
            timing2 = timing3;
        }
        timing2.realmSet$verseID(timing.realmGet$verseID());
        timing2.realmSet$startTime(timing.realmGet$startTime());
        return timing2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "verseID", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "startTime", RealmFieldType.DOUBLE, false, false, true);
        return builder.build();
    }

    public static Timing createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) {
        Timing timing = (Timing) realm.createObjectInternal(Timing.class, true, Collections.EMPTY_LIST);
        if (jSONObject.has("verseID")) {
            if (jSONObject.isNull("verseID")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'verseID' to null.");
            }
            timing.realmSet$verseID(jSONObject.getLong("verseID"));
        }
        if (!jSONObject.has("startTime")) {
            return timing;
        }
        if (jSONObject.isNull("startTime")) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'startTime' to null.");
        }
        timing.realmSet$startTime(jSONObject.getDouble("startTime"));
        return timing;
    }

    @TargetApi(11)
    public static Timing createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Timing timing = new Timing();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("verseID")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'verseID' to null.");
                }
                timing.realmSet$verseID(jsonReader.nextLong());
            } else if (!strNextName.equals("startTime")) {
                jsonReader.skipValue();
            } else {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'startTime' to null.");
                }
                timing.realmSet$startTime(jsonReader.nextDouble());
            }
        }
        jsonReader.endObject();
        return (Timing) realm.copyToRealm(timing, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, Timing timing, Map<RealmModel, Long> map) {
        if ((timing instanceof RealmObjectProxy) && !RealmObject.isFrozen(timing)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timing;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Timing.class);
        long nativePtr = table.getNativePtr();
        TimingColumnInfo timingColumnInfo = (TimingColumnInfo) realm.getSchema().getColumnInfo(Timing.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(timing, Long.valueOf(jCreateRow));
        Table.nativeSetLong(nativePtr, timingColumnInfo.verseIDColKey, jCreateRow, timing.realmGet$verseID(), false);
        Table.nativeSetDouble(nativePtr, timingColumnInfo.startTimeColKey, jCreateRow, timing.realmGet$startTime(), false);
        return jCreateRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Timing timing, Map<RealmModel, Long> map) {
        if ((timing instanceof RealmObjectProxy) && !RealmObject.isFrozen(timing)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timing;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Timing.class);
        long nativePtr = table.getNativePtr();
        TimingColumnInfo timingColumnInfo = (TimingColumnInfo) realm.getSchema().getColumnInfo(Timing.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(timing, Long.valueOf(jCreateRow));
        Table.nativeSetLong(nativePtr, timingColumnInfo.verseIDColKey, jCreateRow, timing.realmGet$verseID(), false);
        Table.nativeSetDouble(nativePtr, timingColumnInfo.startTimeColKey, jCreateRow, timing.realmGet$startTime(), false);
        return jCreateRow;
    }

    public static com_ayah_dao_realm_model_audio_TimingRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Timing.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_audio_TimingRealmProxy com_ayah_dao_realm_model_audio_timingrealmproxy = new com_ayah_dao_realm_model_audio_TimingRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_audio_timingrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_audio_TimingRealmProxy com_ayah_dao_realm_model_audio_timingrealmproxy = (com_ayah_dao_realm_model_audio_TimingRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_audio_timingrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_audio_timingrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_audio_timingrealmproxy.proxyState.getRow$realm().getObjectKey();
        }
        return false;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String strY = p.y(this.proxyState);
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (strY != null ? strY.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        this.columnInfo = (TimingColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Timing> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.audio.Timing, io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public double realmGet$startTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getDouble(this.columnInfo.startTimeColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Timing, io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public long realmGet$verseID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.verseIDColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Timing, io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public void realmSet$startTime(double d5) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setDouble(this.columnInfo.startTimeColKey, d5);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setDouble(this.columnInfo.startTimeColKey, row$realm.getObjectKey(), d5, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Timing, io.realm.com_ayah_dao_realm_model_audio_TimingRealmProxyInterface
    public void realmSet$verseID(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.verseIDColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.verseIDColKey, row$realm.getObjectKey(), j, true);
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Timing = proxy[{verseID:" + realmGet$verseID() + "},{startTime:" + realmGet$startTime() + "}]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Timing.class);
        long nativePtr = table.getNativePtr();
        TimingColumnInfo timingColumnInfo = (TimingColumnInfo) realm.getSchema().getColumnInfo(Timing.class);
        while (it.hasNext()) {
            Timing timing = (Timing) it.next();
            if (!map.containsKey(timing)) {
                if ((timing instanceof RealmObjectProxy) && !RealmObject.isFrozen(timing)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timing;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(timing, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(timing, Long.valueOf(jCreateRow));
                Table.nativeSetLong(nativePtr, timingColumnInfo.verseIDColKey, jCreateRow, timing.realmGet$verseID(), false);
                Table.nativeSetDouble(nativePtr, timingColumnInfo.startTimeColKey, jCreateRow, timing.realmGet$startTime(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Timing.class);
        long nativePtr = table.getNativePtr();
        TimingColumnInfo timingColumnInfo = (TimingColumnInfo) realm.getSchema().getColumnInfo(Timing.class);
        while (it.hasNext()) {
            Timing timing = (Timing) it.next();
            if (!map.containsKey(timing)) {
                if ((timing instanceof RealmObjectProxy) && !RealmObject.isFrozen(timing)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timing;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(timing, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(timing, Long.valueOf(jCreateRow));
                Table.nativeSetLong(nativePtr, timingColumnInfo.verseIDColKey, jCreateRow, timing.realmGet$verseID(), false);
                Table.nativeSetDouble(nativePtr, timingColumnInfo.startTimeColKey, jCreateRow, timing.realmGet$startTime(), false);
            }
        }
    }
}
