package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.VerseMarker;
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
public class com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy extends VerseMarker implements RealmObjectProxy, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VerseMarkerColumnInfo columnInfo;
    private ProxyState<VerseMarker> proxyState;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VerseMarker";
    }

    public static final class VerseMarkerColumnInfo extends ColumnInfo {
        long centerXColKey;
        long centerYColKey;
        long lineColKey;
        long numberCodePointColKey;

        public VerseMarkerColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.numberCodePointColKey = addColumnDetails("numberCodePoint", "numberCodePoint", objectSchemaInfo);
            this.lineColKey = addColumnDetails("line", "line", objectSchemaInfo);
            this.centerXColKey = addColumnDetails("centerX", "centerX", objectSchemaInfo);
            this.centerYColKey = addColumnDetails("centerY", "centerY", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new VerseMarkerColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VerseMarkerColumnInfo verseMarkerColumnInfo = (VerseMarkerColumnInfo) columnInfo;
            VerseMarkerColumnInfo verseMarkerColumnInfo2 = (VerseMarkerColumnInfo) columnInfo2;
            verseMarkerColumnInfo2.numberCodePointColKey = verseMarkerColumnInfo.numberCodePointColKey;
            verseMarkerColumnInfo2.lineColKey = verseMarkerColumnInfo.lineColKey;
            verseMarkerColumnInfo2.centerXColKey = verseMarkerColumnInfo.centerXColKey;
            verseMarkerColumnInfo2.centerYColKey = verseMarkerColumnInfo.centerYColKey;
        }

        public VerseMarkerColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static VerseMarker copy(Realm realm, VerseMarkerColumnInfo verseMarkerColumnInfo, VerseMarker verseMarker, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(verseMarker);
        if (realmObjectProxy != null) {
            return (VerseMarker) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(VerseMarker.class), set);
        osObjectBuilder.addString(verseMarkerColumnInfo.numberCodePointColKey, verseMarker.realmGet$numberCodePoint());
        osObjectBuilder.addInteger(verseMarkerColumnInfo.lineColKey, Long.valueOf(verseMarker.realmGet$line()));
        osObjectBuilder.addFloat(verseMarkerColumnInfo.centerXColKey, Float.valueOf(verseMarker.realmGet$centerX()));
        osObjectBuilder.addFloat(verseMarkerColumnInfo.centerYColKey, Float.valueOf(verseMarker.realmGet$centerY()));
        com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy com_ayah_dao_realm_model_quran_versemarkerrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(verseMarker, com_ayah_dao_realm_model_quran_versemarkerrealmproxyNewProxyInstance);
        return com_ayah_dao_realm_model_quran_versemarkerrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerseMarker copyOrUpdate(Realm realm, VerseMarkerColumnInfo verseMarkerColumnInfo, VerseMarker verseMarker, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((verseMarker instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseMarker)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseMarker;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return verseMarker;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmModel realmModel = (RealmObjectProxy) map.get(verseMarker);
        return realmModel != null ? (VerseMarker) realmModel : copy(realm, verseMarkerColumnInfo, verseMarker, z10, map, set);
    }

    public static VerseMarkerColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VerseMarkerColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerseMarker createDetachedCopy(VerseMarker verseMarker, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        VerseMarker verseMarker2;
        if (i10 > i11 || verseMarker == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(verseMarker);
        if (cacheData == null) {
            verseMarker2 = new VerseMarker();
            map.put(verseMarker, new RealmObjectProxy.CacheData<>(i10, verseMarker2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (VerseMarker) cacheData.object;
            }
            VerseMarker verseMarker3 = (VerseMarker) cacheData.object;
            cacheData.minDepth = i10;
            verseMarker2 = verseMarker3;
        }
        verseMarker2.realmSet$numberCodePoint(verseMarker.realmGet$numberCodePoint());
        verseMarker2.realmSet$line(verseMarker.realmGet$line());
        verseMarker2.realmSet$centerX(verseMarker.realmGet$centerX());
        verseMarker2.realmSet$centerY(verseMarker.realmGet$centerY());
        return verseMarker2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 4, 0);
        builder.addPersistedProperty(NO_ALIAS, "numberCodePoint", RealmFieldType.STRING, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "line", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.FLOAT;
        builder.addPersistedProperty(NO_ALIAS, "centerX", realmFieldType, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "centerY", realmFieldType, false, false, true);
        return builder.build();
    }

    public static VerseMarker createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) {
        VerseMarker verseMarker = (VerseMarker) realm.createObjectInternal(VerseMarker.class, true, Collections.EMPTY_LIST);
        if (jSONObject.has("numberCodePoint")) {
            if (jSONObject.isNull("numberCodePoint")) {
                verseMarker.realmSet$numberCodePoint(null);
            } else {
                verseMarker.realmSet$numberCodePoint(jSONObject.getString("numberCodePoint"));
            }
        }
        if (jSONObject.has("line")) {
            if (jSONObject.isNull("line")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'line' to null.");
            }
            verseMarker.realmSet$line(jSONObject.getLong("line"));
        }
        if (jSONObject.has("centerX")) {
            if (jSONObject.isNull("centerX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'centerX' to null.");
            }
            verseMarker.realmSet$centerX((float) jSONObject.getDouble("centerX"));
        }
        if (!jSONObject.has("centerY")) {
            return verseMarker;
        }
        if (jSONObject.isNull("centerY")) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'centerY' to null.");
        }
        verseMarker.realmSet$centerY((float) jSONObject.getDouble("centerY"));
        return verseMarker;
    }

    @TargetApi(11)
    public static VerseMarker createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        VerseMarker verseMarker = new VerseMarker();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("numberCodePoint")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verseMarker.realmSet$numberCodePoint(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verseMarker.realmSet$numberCodePoint(null);
                }
            } else if (strNextName.equals("line")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'line' to null.");
                }
                verseMarker.realmSet$line(jsonReader.nextLong());
            } else if (strNextName.equals("centerX")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'centerX' to null.");
                }
                verseMarker.realmSet$centerX((float) jsonReader.nextDouble());
            } else if (!strNextName.equals("centerY")) {
                jsonReader.skipValue();
            } else {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'centerY' to null.");
                }
                verseMarker.realmSet$centerY((float) jsonReader.nextDouble());
            }
        }
        jsonReader.endObject();
        return (VerseMarker) realm.copyToRealm(verseMarker, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, VerseMarker verseMarker, Map<RealmModel, Long> map) {
        if ((verseMarker instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseMarker)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseMarker;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(VerseMarker.class);
        long nativePtr = table.getNativePtr();
        VerseMarkerColumnInfo verseMarkerColumnInfo = (VerseMarkerColumnInfo) realm.getSchema().getColumnInfo(VerseMarker.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(verseMarker, Long.valueOf(jCreateRow));
        String strRealmGet$numberCodePoint = verseMarker.realmGet$numberCodePoint();
        if (strRealmGet$numberCodePoint != null) {
            Table.nativeSetString(nativePtr, verseMarkerColumnInfo.numberCodePointColKey, jCreateRow, strRealmGet$numberCodePoint, false);
        }
        Table.nativeSetLong(nativePtr, verseMarkerColumnInfo.lineColKey, jCreateRow, verseMarker.realmGet$line(), false);
        Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerXColKey, jCreateRow, verseMarker.realmGet$centerX(), false);
        Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerYColKey, jCreateRow, verseMarker.realmGet$centerY(), false);
        return jCreateRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, VerseMarker verseMarker, Map<RealmModel, Long> map) {
        if ((verseMarker instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseMarker)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseMarker;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(VerseMarker.class);
        long nativePtr = table.getNativePtr();
        VerseMarkerColumnInfo verseMarkerColumnInfo = (VerseMarkerColumnInfo) realm.getSchema().getColumnInfo(VerseMarker.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(verseMarker, Long.valueOf(jCreateRow));
        String strRealmGet$numberCodePoint = verseMarker.realmGet$numberCodePoint();
        if (strRealmGet$numberCodePoint != null) {
            Table.nativeSetString(nativePtr, verseMarkerColumnInfo.numberCodePointColKey, jCreateRow, strRealmGet$numberCodePoint, false);
        } else {
            Table.nativeSetNull(nativePtr, verseMarkerColumnInfo.numberCodePointColKey, jCreateRow, false);
        }
        Table.nativeSetLong(nativePtr, verseMarkerColumnInfo.lineColKey, jCreateRow, verseMarker.realmGet$line(), false);
        Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerXColKey, jCreateRow, verseMarker.realmGet$centerX(), false);
        Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerYColKey, jCreateRow, verseMarker.realmGet$centerY(), false);
        return jCreateRow;
    }

    public static com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(VerseMarker.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy com_ayah_dao_realm_model_quran_versemarkerrealmproxy = new com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_versemarkerrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy com_ayah_dao_realm_model_quran_versemarkerrealmproxy = (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_versemarkerrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_versemarkerrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_versemarkerrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (VerseMarkerColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<VerseMarker> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public float realmGet$centerX() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getFloat(this.columnInfo.centerXColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public float realmGet$centerY() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getFloat(this.columnInfo.centerYColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public long realmGet$line() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.lineColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public String realmGet$numberCodePoint() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.numberCodePointColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$centerX(float f3) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setFloat(this.columnInfo.centerXColKey, f3);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setFloat(this.columnInfo.centerXColKey, row$realm.getObjectKey(), f3, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$centerY(float f3) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setFloat(this.columnInfo.centerYColKey, f3);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setFloat(this.columnInfo.centerYColKey, row$realm.getObjectKey(), f3, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$line(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.lineColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.lineColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.VerseMarker, io.realm.com_ayah_dao_realm_model_quran_VerseMarkerRealmProxyInterface
    public void realmSet$numberCodePoint(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numberCodePoint' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.numberCodePointColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numberCodePoint' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.numberCodePointColKey, row$realm.getObjectKey(), str, true);
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "VerseMarker = proxy[{numberCodePoint:" + realmGet$numberCodePoint() + "},{line:" + realmGet$line() + "},{centerX:" + realmGet$centerX() + "},{centerY:" + realmGet$centerY() + "}]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VerseMarker.class);
        long nativePtr = table.getNativePtr();
        VerseMarkerColumnInfo verseMarkerColumnInfo = (VerseMarkerColumnInfo) realm.getSchema().getColumnInfo(VerseMarker.class);
        while (it.hasNext()) {
            VerseMarker verseMarker = (VerseMarker) it.next();
            if (!map.containsKey(verseMarker)) {
                if ((verseMarker instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseMarker)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseMarker;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(verseMarker, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(verseMarker, Long.valueOf(jCreateRow));
                String strRealmGet$numberCodePoint = verseMarker.realmGet$numberCodePoint();
                if (strRealmGet$numberCodePoint != null) {
                    Table.nativeSetString(nativePtr, verseMarkerColumnInfo.numberCodePointColKey, jCreateRow, strRealmGet$numberCodePoint, false);
                }
                Table.nativeSetLong(nativePtr, verseMarkerColumnInfo.lineColKey, jCreateRow, verseMarker.realmGet$line(), false);
                Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerXColKey, jCreateRow, verseMarker.realmGet$centerX(), false);
                Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerYColKey, jCreateRow, verseMarker.realmGet$centerY(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VerseMarker.class);
        long nativePtr = table.getNativePtr();
        VerseMarkerColumnInfo verseMarkerColumnInfo = (VerseMarkerColumnInfo) realm.getSchema().getColumnInfo(VerseMarker.class);
        while (it.hasNext()) {
            VerseMarker verseMarker = (VerseMarker) it.next();
            if (!map.containsKey(verseMarker)) {
                if ((verseMarker instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseMarker)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseMarker;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(verseMarker, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(verseMarker, Long.valueOf(jCreateRow));
                String strRealmGet$numberCodePoint = verseMarker.realmGet$numberCodePoint();
                if (strRealmGet$numberCodePoint != null) {
                    Table.nativeSetString(nativePtr, verseMarkerColumnInfo.numberCodePointColKey, jCreateRow, strRealmGet$numberCodePoint, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseMarkerColumnInfo.numberCodePointColKey, jCreateRow, false);
                }
                Table.nativeSetLong(nativePtr, verseMarkerColumnInfo.lineColKey, jCreateRow, verseMarker.realmGet$line(), false);
                Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerXColKey, jCreateRow, verseMarker.realmGet$centerX(), false);
                Table.nativeSetFloat(nativePtr, verseMarkerColumnInfo.centerYColKey, jCreateRow, verseMarker.realmGet$centerY(), false);
            }
        }
    }
}
