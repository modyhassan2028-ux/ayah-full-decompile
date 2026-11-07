package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.PageHeader;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_quran_PageHeaderRealmProxy extends PageHeader implements RealmObjectProxy, com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Chapter> chaptersRealmList;
    private PageHeaderColumnInfo columnInfo;
    private ProxyState<PageHeader> proxyState;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PageHeader";
    }

    public static final class PageHeaderColumnInfo extends ColumnInfo {
        long chaptersColKey;
        long partColKey;
        long quarterColKey;

        public PageHeaderColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.partColKey = addColumnDetails("part", "part", objectSchemaInfo);
            this.quarterColKey = addColumnDetails("quarter", "quarter", objectSchemaInfo);
            this.chaptersColKey = addColumnDetails("chapters", "chapters", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new PageHeaderColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PageHeaderColumnInfo pageHeaderColumnInfo = (PageHeaderColumnInfo) columnInfo;
            PageHeaderColumnInfo pageHeaderColumnInfo2 = (PageHeaderColumnInfo) columnInfo2;
            pageHeaderColumnInfo2.partColKey = pageHeaderColumnInfo.partColKey;
            pageHeaderColumnInfo2.quarterColKey = pageHeaderColumnInfo.quarterColKey;
            pageHeaderColumnInfo2.chaptersColKey = pageHeaderColumnInfo.chaptersColKey;
        }

        public PageHeaderColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_PageHeaderRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    public static PageHeader copy(Realm realm, PageHeaderColumnInfo pageHeaderColumnInfo, PageHeader pageHeader, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        Quarter quarterRealmGet$quarter;
        Quarter quarter;
        RealmList<Chapter> realmListRealmGet$chapters;
        RealmList<Chapter> realmListRealmGet$chapters2;
        int i10;
        Chapter chapter;
        Chapter chapter2;
        RealmObjectProxy realmObjectProxy = map.get(pageHeader);
        if (realmObjectProxy != null) {
            return (PageHeader) realmObjectProxy;
        }
        com_ayah_dao_realm_model_quran_PageHeaderRealmProxy com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(PageHeader.class), set).createNewObject());
        map.put(pageHeader, com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance);
        Part partRealmGet$part = pageHeader.realmGet$part();
        if (partRealmGet$part != null) {
            Part part = (Part) map.get(partRealmGet$part);
            if (part != null) {
                com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$part(part);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PartRealmProxy.PartColumnInfo) realm.getSchema().getColumnInfo(Part.class), partRealmGet$part, z11, map3, set2));
                map2 = map3;
            }
            quarterRealmGet$quarter = pageHeader.realmGet$quarter();
            if (quarterRealmGet$quarter == null) {
                com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$quarter(null);
            } else {
                quarter = (Quarter) map2.get(quarterRealmGet$quarter);
                if (quarter != null) {
                    com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$quarter(quarter);
                } else {
                    com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm2.getSchema().getColumnInfo(Quarter.class), quarterRealmGet$quarter, z11, map2, set2));
                }
            }
            realmListRealmGet$chapters = pageHeader.realmGet$chapters();
            if (realmListRealmGet$chapters != null) {
                realmListRealmGet$chapters2 = com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmGet$chapters();
                realmListRealmGet$chapters2.clear();
                for (i10 = 0; i10 < realmListRealmGet$chapters.size(); i10++) {
                    chapter = realmListRealmGet$chapters.get(i10);
                    chapter2 = (Chapter) map2.get(chapter);
                    if (chapter2 != null) {
                        realmListRealmGet$chapters2.add(chapter2);
                    } else {
                        realmListRealmGet$chapters2.add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm2.getSchema().getColumnInfo(Chapter.class), chapter, z11, map2, set2));
                    }
                }
            }
            return com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$part(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        quarterRealmGet$quarter = pageHeader.realmGet$quarter();
        if (quarterRealmGet$quarter == null) {
            com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$quarter(null);
        } else {
            quarter = (Quarter) map2.get(quarterRealmGet$quarter);
            if (quarter != null) {
                com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$quarter(quarter);
            } else {
                com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm2.getSchema().getColumnInfo(Quarter.class), quarterRealmGet$quarter, z11, map2, set2));
            }
        }
        realmListRealmGet$chapters = pageHeader.realmGet$chapters();
        if (realmListRealmGet$chapters != null) {
            realmListRealmGet$chapters2 = com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance.realmGet$chapters();
            realmListRealmGet$chapters2.clear();
            while (i10 < realmListRealmGet$chapters.size()) {
                chapter = realmListRealmGet$chapters.get(i10);
                chapter2 = (Chapter) map2.get(chapter);
                if (chapter2 != null) {
                    realmListRealmGet$chapters2.add(chapter2);
                } else {
                    realmListRealmGet$chapters2.add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm2.getSchema().getColumnInfo(Chapter.class), chapter, z11, map2, set2));
                }
            }
        }
        return com_ayah_dao_realm_model_quran_pageheaderrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PageHeader copyOrUpdate(Realm realm, PageHeaderColumnInfo pageHeaderColumnInfo, PageHeader pageHeader, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((pageHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(pageHeader)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pageHeader;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return pageHeader;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmModel realmModel = (RealmObjectProxy) map.get(pageHeader);
        return realmModel != null ? (PageHeader) realmModel : copy(realm, pageHeaderColumnInfo, pageHeader, z10, map, set);
    }

    public static PageHeaderColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PageHeaderColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PageHeader createDetachedCopy(PageHeader pageHeader, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        PageHeader pageHeader2;
        if (i10 > i11 || pageHeader == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(pageHeader);
        if (cacheData == null) {
            pageHeader2 = new PageHeader();
            map.put(pageHeader, new RealmObjectProxy.CacheData<>(i10, pageHeader2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (PageHeader) cacheData.object;
            }
            PageHeader pageHeader3 = (PageHeader) cacheData.object;
            cacheData.minDepth = i10;
            pageHeader2 = pageHeader3;
        }
        int i12 = i10 + 1;
        pageHeader2.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createDetachedCopy(pageHeader.realmGet$part(), i12, i11, map));
        pageHeader2.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createDetachedCopy(pageHeader.realmGet$quarter(), i12, i11, map));
        if (i10 == i11) {
            pageHeader2.realmSet$chapters(null);
            return pageHeader2;
        }
        RealmList<Chapter> realmListRealmGet$chapters = pageHeader.realmGet$chapters();
        RealmList<Chapter> realmList = new RealmList<>();
        pageHeader2.realmSet$chapters(realmList);
        int size = realmListRealmGet$chapters.size();
        for (int i13 = 0; i13 < size; i13++) {
            realmList.add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createDetachedCopy(realmListRealmGet$chapters.get(i13), i12, i11, map));
        }
        return pageHeader2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        builder.addPersistedLinkProperty(NO_ALIAS, "part", realmFieldType, com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "quarter", realmFieldType, com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "chapters", RealmFieldType.LIST, com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static PageHeader createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        ArrayList arrayList = new ArrayList(3);
        if (jSONObject.has("part")) {
            arrayList.add("part");
        }
        if (jSONObject.has("quarter")) {
            arrayList.add("quarter");
        }
        if (jSONObject.has("chapters")) {
            arrayList.add("chapters");
        }
        PageHeader pageHeader = (PageHeader) realm.createObjectInternal(PageHeader.class, true, arrayList);
        if (jSONObject.has("part")) {
            if (jSONObject.isNull("part")) {
                pageHeader.realmSet$part(null);
            } else {
                pageHeader.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("part"), z10));
            }
        }
        if (jSONObject.has("quarter")) {
            if (jSONObject.isNull("quarter")) {
                pageHeader.realmSet$quarter(null);
            } else {
                pageHeader.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("quarter"), z10));
            }
        }
        if (jSONObject.has("chapters")) {
            if (jSONObject.isNull("chapters")) {
                pageHeader.realmSet$chapters(null);
                return pageHeader;
            }
            pageHeader.realmGet$chapters().clear();
            JSONArray jSONArray = jSONObject.getJSONArray("chapters");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                pageHeader.realmGet$chapters().add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
            }
        }
        return pageHeader;
    }

    @TargetApi(11)
    public static PageHeader createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        PageHeader pageHeader = new PageHeader();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("part")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    pageHeader.realmSet$part(null);
                } else {
                    pageHeader.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("quarter")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    pageHeader.realmSet$quarter(null);
                } else {
                    pageHeader.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!strNextName.equals("chapters")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                pageHeader.realmSet$chapters(null);
            } else {
                pageHeader.realmSet$chapters(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    pageHeader.realmGet$chapters().add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (PageHeader) realm.copyToRealm(pageHeader, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, PageHeader pageHeader, Map<RealmModel, Long> map) {
        if ((pageHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(pageHeader)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pageHeader;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(PageHeader.class);
        long nativePtr = table.getNativePtr();
        PageHeaderColumnInfo pageHeaderColumnInfo = (PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(pageHeader, Long.valueOf(jCreateRow));
        Part partRealmGet$part = pageHeader.realmGet$part();
        if (partRealmGet$part != null) {
            Long lValueOf = map.get(partRealmGet$part);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, partRealmGet$part, map));
            }
            Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.partColKey, jCreateRow, lValueOf.longValue(), false);
        }
        Quarter quarterRealmGet$quarter = pageHeader.realmGet$quarter();
        if (quarterRealmGet$quarter != null) {
            Long lValueOf2 = map.get(quarterRealmGet$quarter);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, quarterRealmGet$quarter, map));
            }
            Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.quarterColKey, jCreateRow, lValueOf2.longValue(), false);
        }
        RealmList<Chapter> realmListRealmGet$chapters = pageHeader.realmGet$chapters();
        if (realmListRealmGet$chapters != null) {
            OsList osList = new OsList(table.getUncheckedRow(jCreateRow), pageHeaderColumnInfo.chaptersColKey);
            for (Chapter chapter : realmListRealmGet$chapters) {
                Long lValueOf3 = map.get(chapter);
                if (lValueOf3 == null) {
                    lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapter, map));
                }
                osList.addRow(lValueOf3.longValue());
            }
        }
        return jCreateRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, PageHeader pageHeader, Map<RealmModel, Long> map) {
        if ((pageHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(pageHeader)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pageHeader;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(PageHeader.class);
        long nativePtr = table.getNativePtr();
        PageHeaderColumnInfo pageHeaderColumnInfo = (PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(pageHeader, Long.valueOf(jCreateRow));
        Part partRealmGet$part = pageHeader.realmGet$part();
        if (partRealmGet$part != null) {
            Long lValueOf = map.get(partRealmGet$part);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, partRealmGet$part, map));
            }
            Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.partColKey, jCreateRow, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, pageHeaderColumnInfo.partColKey, jCreateRow);
        }
        Quarter quarterRealmGet$quarter = pageHeader.realmGet$quarter();
        if (quarterRealmGet$quarter != null) {
            Long lValueOf2 = map.get(quarterRealmGet$quarter);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarterRealmGet$quarter, map));
            }
            Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.quarterColKey, jCreateRow, lValueOf2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, pageHeaderColumnInfo.quarterColKey, jCreateRow);
        }
        OsList osList = new OsList(table.getUncheckedRow(jCreateRow), pageHeaderColumnInfo.chaptersColKey);
        RealmList<Chapter> realmListRealmGet$chapters = pageHeader.realmGet$chapters();
        if (realmListRealmGet$chapters == null || realmListRealmGet$chapters.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$chapters != null) {
                for (Chapter chapter : realmListRealmGet$chapters) {
                    Long lValueOf3 = map.get(chapter);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter, map));
                    }
                    osList.addRow(lValueOf3.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$chapters.size();
            int iQ = 0;
            while (iQ < size) {
                Chapter chapter2 = realmListRealmGet$chapters.get(iQ);
                Long lValueOf4 = map.get(chapter2);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter2, map));
                }
                iQ = p.q(lValueOf4, osList, iQ, iQ, 1);
            }
        }
        return jCreateRow;
    }

    public static com_ayah_dao_realm_model_quran_PageHeaderRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(PageHeader.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_PageHeaderRealmProxy com_ayah_dao_realm_model_quran_pageheaderrealmproxy = new com_ayah_dao_realm_model_quran_PageHeaderRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_pageheaderrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_PageHeaderRealmProxy com_ayah_dao_realm_model_quran_pageheaderrealmproxy = (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_pageheaderrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_pageheaderrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_pageheaderrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (PageHeaderColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<PageHeader> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.PageHeader, io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public RealmList<Chapter> realmGet$chapters() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Chapter> realmList = this.chaptersRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Chapter> realmList2 = new RealmList<>((Class<Chapter>) Chapter.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.chaptersColKey), this.proxyState.getRealm$realm());
        this.chaptersRealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.PageHeader, io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public Part realmGet$part() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.partColKey)) {
            return null;
        }
        return (Part) this.proxyState.getRealm$realm().get(Part.class, this.proxyState.getRow$realm().getLink(this.columnInfo.partColKey), false, Collections.EMPTY_LIST);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.PageHeader, io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public Quarter realmGet$quarter() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.quarterColKey)) {
            return null;
        }
        return (Quarter) this.proxyState.getRealm$realm().get(Quarter.class, this.proxyState.getRow$realm().getLink(this.columnInfo.quarterColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.PageHeader, io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public void realmSet$chapters(RealmList<Chapter> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("chapters")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Chapter> realmList2 = new RealmList<>();
                for (Chapter chapter : realmList) {
                    if (chapter == null || RealmObject.isManaged(chapter)) {
                        realmList2.add(chapter);
                    } else {
                        realmList2.add((Chapter) realm.copyToRealmOrUpdate(chapter, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.chaptersColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (Chapter) realmList.get(i10);
                this.proxyState.checkValidObject(realmModel);
                modelList.setRow(i10, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.removeAll();
        if (realmList == null) {
            return;
        }
        int size2 = realmList.size();
        while (i10 < size2) {
            RealmModel realmModel2 = (Chapter) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.PageHeader, io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public void realmSet$part(Part part) {
        Part part2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (part == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.partColKey);
                return;
            } else {
                this.proxyState.checkValidObject(part);
                this.proxyState.getRow$realm().setLink(this.columnInfo.partColKey, ((RealmObjectProxy) part).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("part")) {
                part2 = part;
                return;
            }
            if (part != 0) {
                boolean zIsManaged = RealmObject.isManaged(part);
                part2 = part;
                if (!zIsManaged) {
                    part2 = (Part) realm.copyToRealmOrUpdate(part, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (part2 == 0) {
                row$realm.nullifyLink(this.columnInfo.partColKey);
            } else {
                this.proxyState.checkValidObject(part2);
                row$realm.getTable().setLink(this.columnInfo.partColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) part2), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.PageHeader, io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public void realmSet$quarter(Quarter quarter) {
        Quarter quarter2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (quarter == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.quarterColKey);
                return;
            } else {
                this.proxyState.checkValidObject(quarter);
                this.proxyState.getRow$realm().setLink(this.columnInfo.quarterColKey, ((RealmObjectProxy) quarter).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("quarter")) {
                quarter2 = quarter;
                return;
            }
            if (quarter != 0) {
                boolean zIsManaged = RealmObject.isManaged(quarter);
                quarter2 = quarter;
                if (!zIsManaged) {
                    quarter2 = (Quarter) realm.copyToRealmOrUpdate(quarter, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (quarter2 == 0) {
                row$realm.nullifyLink(this.columnInfo.quarterColKey);
            } else {
                this.proxyState.checkValidObject(quarter2);
                row$realm.getTable().setLink(this.columnInfo.quarterColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) quarter2), true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PageHeader = proxy[{part:");
        sb.append(realmGet$part() != null ? com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{quarter:");
        sb.append(realmGet$quarter() != null ? com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{chapters:RealmList<Chapter>[");
        sb.append(realmGet$chapters().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(PageHeader.class);
        long nativePtr = table.getNativePtr();
        PageHeaderColumnInfo pageHeaderColumnInfo = (PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class);
        while (it.hasNext()) {
            PageHeader pageHeader = (PageHeader) it.next();
            if (!map.containsKey(pageHeader)) {
                if ((pageHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(pageHeader)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pageHeader;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(pageHeader, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(pageHeader, Long.valueOf(jCreateRow));
                Part partRealmGet$part = pageHeader.realmGet$part();
                if (partRealmGet$part != null) {
                    Long lValueOf = map.get(partRealmGet$part);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, partRealmGet$part, map));
                    }
                    Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.partColKey, jCreateRow, lValueOf.longValue(), false);
                }
                Quarter quarterRealmGet$quarter = pageHeader.realmGet$quarter();
                if (quarterRealmGet$quarter != null) {
                    Long lValueOf2 = map.get(quarterRealmGet$quarter);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, quarterRealmGet$quarter, map));
                    }
                    Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.quarterColKey, jCreateRow, lValueOf2.longValue(), false);
                }
                RealmList<Chapter> realmListRealmGet$chapters = pageHeader.realmGet$chapters();
                if (realmListRealmGet$chapters != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jCreateRow), pageHeaderColumnInfo.chaptersColKey);
                    for (Chapter chapter : realmListRealmGet$chapters) {
                        Long lValueOf3 = map.get(chapter);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapter, map));
                        }
                        osList.addRow(lValueOf3.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(PageHeader.class);
        long nativePtr = table.getNativePtr();
        PageHeaderColumnInfo pageHeaderColumnInfo = (PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class);
        while (it.hasNext()) {
            PageHeader pageHeader = (PageHeader) it.next();
            if (!map.containsKey(pageHeader)) {
                if ((pageHeader instanceof RealmObjectProxy) && !RealmObject.isFrozen(pageHeader)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pageHeader;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(pageHeader, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(pageHeader, Long.valueOf(jCreateRow));
                Part partRealmGet$part = pageHeader.realmGet$part();
                if (partRealmGet$part != null) {
                    Long lValueOf = map.get(partRealmGet$part);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, partRealmGet$part, map));
                    }
                    Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.partColKey, jCreateRow, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, pageHeaderColumnInfo.partColKey, jCreateRow);
                }
                Quarter quarterRealmGet$quarter = pageHeader.realmGet$quarter();
                if (quarterRealmGet$quarter != null) {
                    Long lValueOf2 = map.get(quarterRealmGet$quarter);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarterRealmGet$quarter, map));
                    }
                    Table.nativeSetLink(nativePtr, pageHeaderColumnInfo.quarterColKey, jCreateRow, lValueOf2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, pageHeaderColumnInfo.quarterColKey, jCreateRow);
                }
                OsList osList = new OsList(table.getUncheckedRow(jCreateRow), pageHeaderColumnInfo.chaptersColKey);
                RealmList<Chapter> realmListRealmGet$chapters = pageHeader.realmGet$chapters();
                if (realmListRealmGet$chapters != null && realmListRealmGet$chapters.size() == osList.size()) {
                    int size = realmListRealmGet$chapters.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Chapter chapter = realmListRealmGet$chapters.get(iQ);
                        Long lValueOf3 = map.get(chapter);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter, map));
                        }
                        iQ = p.q(lValueOf3, osList, iQ, iQ, 1);
                    }
                } else {
                    osList.removeAll();
                    if (realmListRealmGet$chapters != null) {
                        for (Chapter chapter2 : realmListRealmGet$chapters) {
                            Long lValueOf4 = map.get(chapter2);
                            if (lValueOf4 == null) {
                                lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter2, map));
                            }
                            osList.addRow(lValueOf4.longValue());
                        }
                    }
                }
            }
        }
    }
}
