package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.VerseHighlight;
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
public class com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy extends VerseHighlight implements RealmObjectProxy, com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VerseHighlightColumnInfo columnInfo;
    private ProxyState<VerseHighlight> proxyState;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VerseHighlight";
    }

    public static final class VerseHighlightColumnInfo extends ColumnInfo {
        long leftColKey;
        long lineColKey;
        long rightColKey;

        public VerseHighlightColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.lineColKey = addColumnDetails("line", "line", objectSchemaInfo);
            this.leftColKey = addColumnDetails("left", "left", objectSchemaInfo);
            this.rightColKey = addColumnDetails("right", "right", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new VerseHighlightColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VerseHighlightColumnInfo verseHighlightColumnInfo = (VerseHighlightColumnInfo) columnInfo;
            VerseHighlightColumnInfo verseHighlightColumnInfo2 = (VerseHighlightColumnInfo) columnInfo2;
            verseHighlightColumnInfo2.lineColKey = verseHighlightColumnInfo.lineColKey;
            verseHighlightColumnInfo2.leftColKey = verseHighlightColumnInfo.leftColKey;
            verseHighlightColumnInfo2.rightColKey = verseHighlightColumnInfo.rightColKey;
        }

        public VerseHighlightColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static VerseHighlight copy(Realm realm, VerseHighlightColumnInfo verseHighlightColumnInfo, VerseHighlight verseHighlight, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(verseHighlight);
        if (realmObjectProxy != null) {
            return (VerseHighlight) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(VerseHighlight.class), set);
        osObjectBuilder.addInteger(verseHighlightColumnInfo.lineColKey, Long.valueOf(verseHighlight.realmGet$line()));
        osObjectBuilder.addFloat(verseHighlightColumnInfo.leftColKey, Float.valueOf(verseHighlight.realmGet$left()));
        osObjectBuilder.addFloat(verseHighlightColumnInfo.rightColKey, Float.valueOf(verseHighlight.realmGet$right()));
        com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy com_ayah_dao_realm_model_quran_versehighlightrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(verseHighlight, com_ayah_dao_realm_model_quran_versehighlightrealmproxyNewProxyInstance);
        return com_ayah_dao_realm_model_quran_versehighlightrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerseHighlight copyOrUpdate(Realm realm, VerseHighlightColumnInfo verseHighlightColumnInfo, VerseHighlight verseHighlight, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((verseHighlight instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseHighlight)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseHighlight;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return verseHighlight;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmModel realmModel = (RealmObjectProxy) map.get(verseHighlight);
        return realmModel != null ? (VerseHighlight) realmModel : copy(realm, verseHighlightColumnInfo, verseHighlight, z10, map, set);
    }

    public static VerseHighlightColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VerseHighlightColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerseHighlight createDetachedCopy(VerseHighlight verseHighlight, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        VerseHighlight verseHighlight2;
        if (i10 > i11 || verseHighlight == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(verseHighlight);
        if (cacheData == null) {
            verseHighlight2 = new VerseHighlight();
            map.put(verseHighlight, new RealmObjectProxy.CacheData<>(i10, verseHighlight2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (VerseHighlight) cacheData.object;
            }
            VerseHighlight verseHighlight3 = (VerseHighlight) cacheData.object;
            cacheData.minDepth = i10;
            verseHighlight2 = verseHighlight3;
        }
        verseHighlight2.realmSet$line(verseHighlight.realmGet$line());
        verseHighlight2.realmSet$left(verseHighlight.realmGet$left());
        verseHighlight2.realmSet$right(verseHighlight.realmGet$right());
        return verseHighlight2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "line", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType = RealmFieldType.FLOAT;
        builder.addPersistedProperty(NO_ALIAS, "left", realmFieldType, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "right", realmFieldType, false, false, true);
        return builder.build();
    }

    public static VerseHighlight createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) {
        VerseHighlight verseHighlight = (VerseHighlight) realm.createObjectInternal(VerseHighlight.class, true, Collections.EMPTY_LIST);
        if (jSONObject.has("line")) {
            if (jSONObject.isNull("line")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'line' to null.");
            }
            verseHighlight.realmSet$line(jSONObject.getLong("line"));
        }
        if (jSONObject.has("left")) {
            if (jSONObject.isNull("left")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'left' to null.");
            }
            verseHighlight.realmSet$left((float) jSONObject.getDouble("left"));
        }
        if (!jSONObject.has("right")) {
            return verseHighlight;
        }
        if (jSONObject.isNull("right")) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'right' to null.");
        }
        verseHighlight.realmSet$right((float) jSONObject.getDouble("right"));
        return verseHighlight;
    }

    @TargetApi(11)
    public static VerseHighlight createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        VerseHighlight verseHighlight = new VerseHighlight();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("line")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'line' to null.");
                }
                verseHighlight.realmSet$line(jsonReader.nextLong());
            } else if (strNextName.equals("left")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'left' to null.");
                }
                verseHighlight.realmSet$left((float) jsonReader.nextDouble());
            } else if (!strNextName.equals("right")) {
                jsonReader.skipValue();
            } else {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'right' to null.");
                }
                verseHighlight.realmSet$right((float) jsonReader.nextDouble());
            }
        }
        jsonReader.endObject();
        return (VerseHighlight) realm.copyToRealm(verseHighlight, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, VerseHighlight verseHighlight, Map<RealmModel, Long> map) {
        if ((verseHighlight instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseHighlight)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseHighlight;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(VerseHighlight.class);
        long nativePtr = table.getNativePtr();
        VerseHighlightColumnInfo verseHighlightColumnInfo = (VerseHighlightColumnInfo) realm.getSchema().getColumnInfo(VerseHighlight.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(verseHighlight, Long.valueOf(jCreateRow));
        Table.nativeSetLong(nativePtr, verseHighlightColumnInfo.lineColKey, jCreateRow, verseHighlight.realmGet$line(), false);
        Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.leftColKey, jCreateRow, verseHighlight.realmGet$left(), false);
        Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.rightColKey, jCreateRow, verseHighlight.realmGet$right(), false);
        return jCreateRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, VerseHighlight verseHighlight, Map<RealmModel, Long> map) {
        if ((verseHighlight instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseHighlight)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseHighlight;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(VerseHighlight.class);
        long nativePtr = table.getNativePtr();
        VerseHighlightColumnInfo verseHighlightColumnInfo = (VerseHighlightColumnInfo) realm.getSchema().getColumnInfo(VerseHighlight.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(verseHighlight, Long.valueOf(jCreateRow));
        Table.nativeSetLong(nativePtr, verseHighlightColumnInfo.lineColKey, jCreateRow, verseHighlight.realmGet$line(), false);
        Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.leftColKey, jCreateRow, verseHighlight.realmGet$left(), false);
        Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.rightColKey, jCreateRow, verseHighlight.realmGet$right(), false);
        return jCreateRow;
    }

    public static com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(VerseHighlight.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy com_ayah_dao_realm_model_quran_versehighlightrealmproxy = new com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_versehighlightrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy com_ayah_dao_realm_model_quran_versehighlightrealmproxy = (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_versehighlightrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_versehighlightrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_versehighlightrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (VerseHighlightColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<VerseHighlight> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.VerseHighlight, io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public float realmGet$left() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getFloat(this.columnInfo.leftColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.VerseHighlight, io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public long realmGet$line() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.lineColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.VerseHighlight, io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public float realmGet$right() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getFloat(this.columnInfo.rightColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.VerseHighlight, io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public void realmSet$left(float f3) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setFloat(this.columnInfo.leftColKey, f3);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setFloat(this.columnInfo.leftColKey, row$realm.getObjectKey(), f3, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.VerseHighlight, io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public void realmSet$line(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.lineColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.lineColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.VerseHighlight, io.realm.com_ayah_dao_realm_model_quran_VerseHighlightRealmProxyInterface
    public void realmSet$right(float f3) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setFloat(this.columnInfo.rightColKey, f3);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setFloat(this.columnInfo.rightColKey, row$realm.getObjectKey(), f3, true);
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "VerseHighlight = proxy[{line:" + realmGet$line() + "},{left:" + realmGet$left() + "},{right:" + realmGet$right() + "}]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VerseHighlight.class);
        long nativePtr = table.getNativePtr();
        VerseHighlightColumnInfo verseHighlightColumnInfo = (VerseHighlightColumnInfo) realm.getSchema().getColumnInfo(VerseHighlight.class);
        while (it.hasNext()) {
            VerseHighlight verseHighlight = (VerseHighlight) it.next();
            if (!map.containsKey(verseHighlight)) {
                if ((verseHighlight instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseHighlight)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseHighlight;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(verseHighlight, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(verseHighlight, Long.valueOf(jCreateRow));
                Table.nativeSetLong(nativePtr, verseHighlightColumnInfo.lineColKey, jCreateRow, verseHighlight.realmGet$line(), false);
                Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.leftColKey, jCreateRow, verseHighlight.realmGet$left(), false);
                Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.rightColKey, jCreateRow, verseHighlight.realmGet$right(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VerseHighlight.class);
        long nativePtr = table.getNativePtr();
        VerseHighlightColumnInfo verseHighlightColumnInfo = (VerseHighlightColumnInfo) realm.getSchema().getColumnInfo(VerseHighlight.class);
        while (it.hasNext()) {
            VerseHighlight verseHighlight = (VerseHighlight) it.next();
            if (!map.containsKey(verseHighlight)) {
                if ((verseHighlight instanceof RealmObjectProxy) && !RealmObject.isFrozen(verseHighlight)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verseHighlight;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(verseHighlight, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(verseHighlight, Long.valueOf(jCreateRow));
                Table.nativeSetLong(nativePtr, verseHighlightColumnInfo.lineColKey, jCreateRow, verseHighlight.realmGet$line(), false);
                Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.leftColKey, jCreateRow, verseHighlight.realmGet$left(), false);
                Table.nativeSetFloat(nativePtr, verseHighlightColumnInfo.rightColKey, jCreateRow, verseHighlight.realmGet$right(), false);
            }
        }
    }
}
