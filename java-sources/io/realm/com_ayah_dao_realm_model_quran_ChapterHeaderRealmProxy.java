package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Page;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy extends ChapterHeader implements RealmObjectProxy, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ChapterHeaderColumnInfo columnInfo;
    private ProxyState<ChapterHeader> proxyState;

    public static final class ChapterHeaderColumnInfo extends ColumnInfo {
        long centerXColKey;
        long centerYColKey;
        long chapterColKey;
        long lineColKey;
        long pageColKey;

        public ChapterHeaderColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.chapterColKey = addColumnDetails("chapter", "chapter", objectSchemaInfo);
            this.pageColKey = addColumnDetails("page", "page", objectSchemaInfo);
            this.lineColKey = addColumnDetails("line", "line", objectSchemaInfo);
            this.centerXColKey = addColumnDetails("centerX", "centerX", objectSchemaInfo);
            this.centerYColKey = addColumnDetails("centerY", "centerY", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new ChapterHeaderColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ChapterHeaderColumnInfo chapterHeaderColumnInfo = (ChapterHeaderColumnInfo) columnInfo;
            ChapterHeaderColumnInfo chapterHeaderColumnInfo2 = (ChapterHeaderColumnInfo) columnInfo2;
            chapterHeaderColumnInfo2.chapterColKey = chapterHeaderColumnInfo.chapterColKey;
            chapterHeaderColumnInfo2.pageColKey = chapterHeaderColumnInfo.pageColKey;
            chapterHeaderColumnInfo2.lineColKey = chapterHeaderColumnInfo.lineColKey;
            chapterHeaderColumnInfo2.centerXColKey = chapterHeaderColumnInfo.centerXColKey;
            chapterHeaderColumnInfo2.centerYColKey = chapterHeaderColumnInfo.centerYColKey;
        }

        public ChapterHeaderColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ChapterHeader";
    }

    public com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    public static ChapterHeader copy(Realm realm, ChapterHeaderColumnInfo chapterHeaderColumnInfo, ChapterHeader chapterHeader, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        Page pageRealmGet$page;
        Page page;
        RealmObjectProxy realmObjectProxy = map.get(chapterHeader);
        if (realmObjectProxy != null) {
            return (ChapterHeader) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ChapterHeader.class), set);
        osObjectBuilder.addInteger(chapterHeaderColumnInfo.lineColKey, Long.valueOf(chapterHeader.realmGet$line()));
        osObjectBuilder.addFloat(chapterHeaderColumnInfo.centerXColKey, Float.valueOf(chapterHeader.realmGet$centerX()));
        osObjectBuilder.addFloat(chapterHeaderColumnInfo.centerYColKey, Float.valueOf(chapterHeader.realmGet$centerY()));
        com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(chapterHeader, com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance);
        Chapter chapterRealmGet$chapter = chapterHeader.realmGet$chapter();
        if (chapterRealmGet$chapter != null) {
            Chapter chapter = (Chapter) map.get(chapterRealmGet$chapter);
            if (chapter != null) {
                com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$chapter(chapter);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class), chapterRealmGet$chapter, z11, map3, set2));
                map2 = map3;
            }
            pageRealmGet$page = chapterHeader.realmGet$page();
            if (pageRealmGet$page == null) {
                com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$page(null);
                return com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance;
            }
            page = (Page) map2.get(pageRealmGet$page);
            if (page != null) {
                com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$page(page);
                return com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance;
            }
            com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$page(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page, z11, map2, set2));
            return com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$chapter(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        pageRealmGet$page = chapterHeader.realmGet$page();
        if (pageRealmGet$page == null) {
            com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$page(null);
            return com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance;
        }
        page = (Page) map2.get(pageRealmGet$page);
        if (page != null) {
            com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$page(page);
            return com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance.realmSet$page(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page, z11, map2, set2));
        return com_ayah_dao_realm_model_quran_chapterheaderrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChapterHeader copyOrUpdate(Realm realm, ChapterHeaderColumnInfo chapterHeaderColumnInfo, ChapterHeader chapterHeader, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((chapterHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapterHeader)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapterHeader;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return chapterHeader;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmModel realmModel = (RealmObjectProxy) map.get(chapterHeader);
        return realmModel != null ? (ChapterHeader) realmModel : copy(realm, chapterHeaderColumnInfo, chapterHeader, z10, map, set);
    }

    public static ChapterHeaderColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ChapterHeaderColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChapterHeader createDetachedCopy(ChapterHeader chapterHeader, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ChapterHeader chapterHeader2;
        if (i10 > i11 || chapterHeader == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(chapterHeader);
        if (cacheData == null) {
            chapterHeader2 = new ChapterHeader();
            map.put(chapterHeader, new RealmObjectProxy.CacheData<>(i10, chapterHeader2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (ChapterHeader) cacheData.object;
            }
            ChapterHeader chapterHeader3 = (ChapterHeader) cacheData.object;
            cacheData.minDepth = i10;
            chapterHeader2 = chapterHeader3;
        }
        int i12 = i10 + 1;
        chapterHeader2.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createDetachedCopy(chapterHeader.realmGet$chapter(), i12, i11, map));
        chapterHeader2.realmSet$page(com_ayah_dao_realm_model_quran_PageRealmProxy.createDetachedCopy(chapterHeader.realmGet$page(), i12, i11, map));
        chapterHeader2.realmSet$line(chapterHeader.realmGet$line());
        chapterHeader2.realmSet$centerX(chapterHeader.realmGet$centerX());
        chapterHeader2.realmSet$centerY(chapterHeader.realmGet$centerY());
        return chapterHeader2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        builder.addPersistedLinkProperty(NO_ALIAS, "chapter", realmFieldType, com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "page", realmFieldType, com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty(NO_ALIAS, "line", RealmFieldType.INTEGER, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.FLOAT;
        builder.addPersistedProperty(NO_ALIAS, "centerX", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "centerY", realmFieldType2, false, false, true);
        return builder.build();
    }

    public static ChapterHeader createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("chapter")) {
            arrayList.add("chapter");
        }
        if (jSONObject.has("page")) {
            arrayList.add("page");
        }
        ChapterHeader chapterHeader = (ChapterHeader) realm.createObjectInternal(ChapterHeader.class, true, arrayList);
        if (jSONObject.has("chapter")) {
            if (jSONObject.isNull("chapter")) {
                chapterHeader.realmSet$chapter(null);
            } else {
                chapterHeader.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("chapter"), z10));
            }
        }
        if (jSONObject.has("page")) {
            if (jSONObject.isNull("page")) {
                chapterHeader.realmSet$page(null);
            } else {
                chapterHeader.realmSet$page(com_ayah_dao_realm_model_quran_PageRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("page"), z10));
            }
        }
        if (jSONObject.has("line")) {
            if (jSONObject.isNull("line")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'line' to null.");
            }
            chapterHeader.realmSet$line(jSONObject.getLong("line"));
        }
        if (jSONObject.has("centerX")) {
            if (jSONObject.isNull("centerX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'centerX' to null.");
            }
            chapterHeader.realmSet$centerX((float) jSONObject.getDouble("centerX"));
        }
        if (!jSONObject.has("centerY")) {
            return chapterHeader;
        }
        if (jSONObject.isNull("centerY")) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'centerY' to null.");
        }
        chapterHeader.realmSet$centerY((float) jSONObject.getDouble("centerY"));
        return chapterHeader;
    }

    @TargetApi(11)
    public static ChapterHeader createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ChapterHeader chapterHeader = new ChapterHeader();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("chapter")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    chapterHeader.realmSet$chapter(null);
                } else {
                    chapterHeader.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("page")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    chapterHeader.realmSet$page(null);
                } else {
                    chapterHeader.realmSet$page(com_ayah_dao_realm_model_quran_PageRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("line")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'line' to null.");
                }
                chapterHeader.realmSet$line(jsonReader.nextLong());
            } else if (strNextName.equals("centerX")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'centerX' to null.");
                }
                chapterHeader.realmSet$centerX((float) jsonReader.nextDouble());
            } else if (!strNextName.equals("centerY")) {
                jsonReader.skipValue();
            } else {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'centerY' to null.");
                }
                chapterHeader.realmSet$centerY((float) jsonReader.nextDouble());
            }
        }
        jsonReader.endObject();
        return (ChapterHeader) realm.copyToRealm(chapterHeader, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, ChapterHeader chapterHeader, Map<RealmModel, Long> map) {
        if ((chapterHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapterHeader)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapterHeader;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(ChapterHeader.class);
        long nativePtr = table.getNativePtr();
        ChapterHeaderColumnInfo chapterHeaderColumnInfo = (ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(chapterHeader, Long.valueOf(jCreateRow));
        Chapter chapterRealmGet$chapter = chapterHeader.realmGet$chapter();
        if (chapterRealmGet$chapter != null) {
            Long lValueOf = map.get(chapterRealmGet$chapter);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapterRealmGet$chapter, map));
            }
            Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.chapterColKey, jCreateRow, lValueOf.longValue(), false);
        }
        Page pageRealmGet$page = chapterHeader.realmGet$page();
        if (pageRealmGet$page != null) {
            Long lValueOf2 = map.get(pageRealmGet$page);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, pageRealmGet$page, map));
            }
            Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.pageColKey, jCreateRow, lValueOf2.longValue(), false);
        }
        Table.nativeSetLong(nativePtr, chapterHeaderColumnInfo.lineColKey, jCreateRow, chapterHeader.realmGet$line(), false);
        Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerXColKey, jCreateRow, chapterHeader.realmGet$centerX(), false);
        Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerYColKey, jCreateRow, chapterHeader.realmGet$centerY(), false);
        return jCreateRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, ChapterHeader chapterHeader, Map<RealmModel, Long> map) {
        if ((chapterHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapterHeader)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapterHeader;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(ChapterHeader.class);
        long nativePtr = table.getNativePtr();
        ChapterHeaderColumnInfo chapterHeaderColumnInfo = (ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(chapterHeader, Long.valueOf(jCreateRow));
        Chapter chapterRealmGet$chapter = chapterHeader.realmGet$chapter();
        if (chapterRealmGet$chapter != null) {
            Long lValueOf = map.get(chapterRealmGet$chapter);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapterRealmGet$chapter, map));
            }
            Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.chapterColKey, jCreateRow, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, chapterHeaderColumnInfo.chapterColKey, jCreateRow);
        }
        Page pageRealmGet$page = chapterHeader.realmGet$page();
        if (pageRealmGet$page != null) {
            Long lValueOf2 = map.get(pageRealmGet$page);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, pageRealmGet$page, map));
            }
            Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.pageColKey, jCreateRow, lValueOf2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, chapterHeaderColumnInfo.pageColKey, jCreateRow);
        }
        Table.nativeSetLong(nativePtr, chapterHeaderColumnInfo.lineColKey, jCreateRow, chapterHeader.realmGet$line(), false);
        Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerXColKey, jCreateRow, chapterHeader.realmGet$centerX(), false);
        Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerYColKey, jCreateRow, chapterHeader.realmGet$centerY(), false);
        return jCreateRow;
    }

    public static com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(ChapterHeader.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy com_ayah_dao_realm_model_quran_chapterheaderrealmproxy = new com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_chapterheaderrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy com_ayah_dao_realm_model_quran_chapterheaderrealmproxy = (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_chapterheaderrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_chapterheaderrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_chapterheaderrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (ChapterHeaderColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<ChapterHeader> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public float realmGet$centerX() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getFloat(this.columnInfo.centerXColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public float realmGet$centerY() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getFloat(this.columnInfo.centerYColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public Chapter realmGet$chapter() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.chapterColKey)) {
            return null;
        }
        return (Chapter) this.proxyState.getRealm$realm().get(Chapter.class, this.proxyState.getRow$realm().getLink(this.columnInfo.chapterColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public long realmGet$line() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.lineColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public Page realmGet$page() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.pageColKey)) {
            return null;
        }
        return (Page) this.proxyState.getRealm$realm().get(Page.class, this.proxyState.getRow$realm().getLink(this.columnInfo.pageColKey), false, Collections.EMPTY_LIST);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$centerX(float f3) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setFloat(this.columnInfo.centerXColKey, f3);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setFloat(this.columnInfo.centerXColKey, row$realm.getObjectKey(), f3, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$centerY(float f3) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setFloat(this.columnInfo.centerYColKey, f3);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setFloat(this.columnInfo.centerYColKey, row$realm.getObjectKey(), f3, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$chapter(Chapter chapter) {
        Chapter chapter2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (chapter == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.chapterColKey);
                return;
            } else {
                this.proxyState.checkValidObject(chapter);
                this.proxyState.getRow$realm().setLink(this.columnInfo.chapterColKey, ((RealmObjectProxy) chapter).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("chapter")) {
                chapter2 = chapter;
                return;
            }
            if (chapter != 0) {
                boolean zIsManaged = RealmObject.isManaged(chapter);
                chapter2 = chapter;
                if (!zIsManaged) {
                    chapter2 = (Chapter) realm.copyToRealmOrUpdate(chapter, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (chapter2 == 0) {
                row$realm.nullifyLink(this.columnInfo.chapterColKey);
            } else {
                this.proxyState.checkValidObject(chapter2);
                row$realm.getTable().setLink(this.columnInfo.chapterColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) chapter2), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$line(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.lineColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.lineColKey, row$realm.getObjectKey(), j, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.ChapterHeader, io.realm.com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxyInterface
    public void realmSet$page(Page page) {
        Page page2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (page == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.pageColKey);
                return;
            } else {
                this.proxyState.checkValidObject(page);
                this.proxyState.getRow$realm().setLink(this.columnInfo.pageColKey, ((RealmObjectProxy) page).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("page")) {
                page2 = page;
                return;
            }
            if (page != 0) {
                boolean zIsManaged = RealmObject.isManaged(page);
                page2 = page;
                if (!zIsManaged) {
                    page2 = (Page) realm.copyToRealmOrUpdate(page, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (page2 == 0) {
                row$realm.nullifyLink(this.columnInfo.pageColKey);
            } else {
                this.proxyState.checkValidObject(page2);
                row$realm.getTable().setLink(this.columnInfo.pageColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) page2), true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ChapterHeader = proxy[{chapter:");
        sb.append(realmGet$chapter() != null ? com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{page:");
        sb.append(realmGet$page() != null ? com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{line:");
        sb.append(realmGet$line());
        sb.append("},{centerX:");
        sb.append(realmGet$centerX());
        sb.append("},{centerY:");
        sb.append(realmGet$centerY());
        sb.append("}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ChapterHeader.class);
        long nativePtr = table.getNativePtr();
        ChapterHeaderColumnInfo chapterHeaderColumnInfo = (ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class);
        while (it.hasNext()) {
            ChapterHeader chapterHeader = (ChapterHeader) it.next();
            if (!map.containsKey(chapterHeader)) {
                if ((chapterHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapterHeader)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapterHeader;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(chapterHeader, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(chapterHeader, Long.valueOf(jCreateRow));
                Chapter chapterRealmGet$chapter = chapterHeader.realmGet$chapter();
                if (chapterRealmGet$chapter != null) {
                    Long lValueOf = map.get(chapterRealmGet$chapter);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapterRealmGet$chapter, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.chapterColKey, jCreateRow, lValueOf.longValue(), false);
                }
                Page pageRealmGet$page = chapterHeader.realmGet$page();
                if (pageRealmGet$page != null) {
                    Long lValueOf2 = map.get(pageRealmGet$page);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, pageRealmGet$page, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.pageColKey, jCreateRow, lValueOf2.longValue(), false);
                }
                Table.nativeSetLong(nativePtr, chapterHeaderColumnInfo.lineColKey, jCreateRow, chapterHeader.realmGet$line(), false);
                Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerXColKey, jCreateRow, chapterHeader.realmGet$centerX(), false);
                Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerYColKey, jCreateRow, chapterHeader.realmGet$centerY(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ChapterHeader.class);
        long nativePtr = table.getNativePtr();
        ChapterHeaderColumnInfo chapterHeaderColumnInfo = (ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class);
        while (it.hasNext()) {
            ChapterHeader chapterHeader = (ChapterHeader) it.next();
            if (!map.containsKey(chapterHeader)) {
                if ((chapterHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapterHeader)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapterHeader;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(chapterHeader, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(chapterHeader, Long.valueOf(jCreateRow));
                Chapter chapterRealmGet$chapter = chapterHeader.realmGet$chapter();
                if (chapterRealmGet$chapter != null) {
                    Long lValueOf = map.get(chapterRealmGet$chapter);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapterRealmGet$chapter, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.chapterColKey, jCreateRow, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, chapterHeaderColumnInfo.chapterColKey, jCreateRow);
                }
                Page pageRealmGet$page = chapterHeader.realmGet$page();
                if (pageRealmGet$page != null) {
                    Long lValueOf2 = map.get(pageRealmGet$page);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, pageRealmGet$page, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterHeaderColumnInfo.pageColKey, jCreateRow, lValueOf2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, chapterHeaderColumnInfo.pageColKey, jCreateRow);
                }
                Table.nativeSetLong(nativePtr, chapterHeaderColumnInfo.lineColKey, jCreateRow, chapterHeader.realmGet$line(), false);
                Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerXColKey, jCreateRow, chapterHeader.realmGet$centerX(), false);
                Table.nativeSetFloat(nativePtr, chapterHeaderColumnInfo.centerYColKey, jCreateRow, chapterHeader.realmGet$centerY(), false);
            }
        }
    }
}
