package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Section;
import com.ayah.dao.realm.model.quran.Verse;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
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
public class com_ayah_dao_realm_model_quran_SectionRealmProxy extends Section implements RealmObjectProxy, com_ayah_dao_realm_model_quran_SectionRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SectionColumnInfo columnInfo;
    private ProxyState<Section> proxyState;
    private RealmList<Verse> versesRealmList;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Section";
    }

    public static final class SectionColumnInfo extends ColumnInfo {
        long identifierColKey;
        long versesColKey;

        public SectionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.identifierColKey = addColumnDetails("identifier", "identifier", objectSchemaInfo);
            this.versesColKey = addColumnDetails("verses", "verses", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new SectionColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SectionColumnInfo sectionColumnInfo = (SectionColumnInfo) columnInfo;
            SectionColumnInfo sectionColumnInfo2 = (SectionColumnInfo) columnInfo2;
            sectionColumnInfo2.identifierColKey = sectionColumnInfo.identifierColKey;
            sectionColumnInfo2.versesColKey = sectionColumnInfo.versesColKey;
        }

        public SectionColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_SectionRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Section copy(Realm realm, SectionColumnInfo sectionColumnInfo, Section section, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        RealmModel realmModel = (RealmObjectProxy) map.get(section);
        if (realmModel != null) {
            return (Section) realmModel;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Section.class), set);
        osObjectBuilder.addInteger(sectionColumnInfo.identifierColKey, Long.valueOf(section.realmGet$identifier()));
        com_ayah_dao_realm_model_quran_SectionRealmProxy com_ayah_dao_realm_model_quran_sectionrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(section, com_ayah_dao_realm_model_quran_sectionrealmproxyNewProxyInstance);
        RealmList<Verse> realmListRealmGet$verses = section.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            RealmList<Verse> realmListRealmGet$verses2 = com_ayah_dao_realm_model_quran_sectionrealmproxyNewProxyInstance.realmGet$verses();
            realmListRealmGet$verses2.clear();
            int i10 = 0;
            while (i10 < realmListRealmGet$verses.size()) {
                Verse verse = realmListRealmGet$verses.get(i10);
                Verse verse2 = (Verse) map.get(verse);
                if (verse2 != null) {
                    realmListRealmGet$verses2.add(verse2);
                    realm2 = realm;
                    z11 = z10;
                    map2 = map;
                    set2 = set;
                } else {
                    realm2 = realm;
                    z11 = z10;
                    map2 = map;
                    set2 = set;
                    realmListRealmGet$verses2.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class), verse, z11, map2, set2));
                }
                i10++;
                realm = realm2;
                z10 = z11;
                map = map2;
                set = set2;
            }
        }
        return com_ayah_dao_realm_model_quran_sectionrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Section copyOrUpdate(Realm realm, SectionColumnInfo sectionColumnInfo, Section section, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((section instanceof RealmObjectProxy) && !RealmObject.isFrozen(section)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) section;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return section;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(section);
        if (realmObjectProxy2 != null) {
            return (Section) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_quran_SectionRealmProxy com_ayah_dao_realm_model_quran_sectionrealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Section.class);
            long jFindFirstLong = table.findFirstLong(sectionColumnInfo.identifierColKey, section.realmGet$identifier());
            if (jFindFirstLong == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstLong), sectionColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_quran_sectionrealmproxy = new com_ayah_dao_realm_model_quran_SectionRealmProxy();
                    map.put(section, com_ayah_dao_realm_model_quran_sectionrealmproxy);
                    realmObjectContext.clear();
                    z11 = z10;
                } catch (Throwable th) {
                    realmObjectContext.clear();
                    throw th;
                }
            }
        } else {
            z11 = z10;
        }
        return z11 ? update(realm, sectionColumnInfo, com_ayah_dao_realm_model_quran_sectionrealmproxy, section, map, set) : copy(realm, sectionColumnInfo, section, z10, map, set);
    }

    public static SectionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SectionColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Section createDetachedCopy(Section section, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Section section2;
        if (i10 > i11 || section == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(section);
        if (cacheData == null) {
            section2 = new Section();
            map.put(section, new RealmObjectProxy.CacheData<>(i10, section2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Section) cacheData.object;
            }
            Section section3 = (Section) cacheData.object;
            cacheData.minDepth = i10;
            section2 = section3;
        }
        section2.realmSet$identifier(section.realmGet$identifier());
        if (i10 == i11) {
            section2.realmSet$verses(null);
            return section2;
        }
        RealmList<Verse> realmListRealmGet$verses = section.realmGet$verses();
        RealmList<Verse> realmList = new RealmList<>();
        section2.realmSet$verses(realmList);
        int i12 = i10 + 1;
        int size = realmListRealmGet$verses.size();
        for (int i13 = 0; i13 < size; i13++) {
            realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy(realmListRealmGet$verses.get(i13), i12, i11, map));
        }
        return section2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "identifier", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedLinkProperty(NO_ALIAS, "verses", RealmFieldType.LIST, com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public static Section createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_quran_SectionRealmProxy com_ayah_dao_realm_model_quran_sectionrealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(1);
        if (z10) {
            Table table = realm.getTable(Section.class);
            long jFindFirstLong = !jSONObject.isNull("identifier") ? table.findFirstLong(((SectionColumnInfo) realm.getSchema().getColumnInfo(Section.class)).identifierColKey, jSONObject.getLong("identifier")) : -1L;
            if (jFindFirstLong != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstLong);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Section.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_quran_sectionrealmproxy = new com_ayah_dao_realm_model_quran_SectionRealmProxy();
                        realmObjectContext.clear();
                    } catch (Throwable th) {
                        th = th;
                        realmObjectContext.clear();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    realmObjectContext = realmObjectContext2;
                }
            } else {
                com_ayah_dao_realm_model_quran_sectionrealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_quran_sectionrealmproxy = null;
        }
        if (com_ayah_dao_realm_model_quran_sectionrealmproxy == null) {
            if (jSONObject.has("verses")) {
                arrayList.add("verses");
            }
            if (!jSONObject.has("identifier")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'identifier'.");
            }
            com_ayah_dao_realm_model_quran_sectionrealmproxy = jSONObject.isNull("identifier") ? (com_ayah_dao_realm_model_quran_SectionRealmProxy) realm.createObjectInternal(Section.class, null, true, arrayList) : (com_ayah_dao_realm_model_quran_SectionRealmProxy) realm.createObjectInternal(Section.class, Long.valueOf(jSONObject.getLong("identifier")), true, arrayList);
        }
        if (jSONObject.has("verses")) {
            if (jSONObject.isNull("verses")) {
                com_ayah_dao_realm_model_quran_sectionrealmproxy.realmSet$verses(null);
                return com_ayah_dao_realm_model_quran_sectionrealmproxy;
            }
            com_ayah_dao_realm_model_quran_sectionrealmproxy.realmGet$verses().clear();
            JSONArray jSONArray = jSONObject.getJSONArray("verses");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                com_ayah_dao_realm_model_quran_sectionrealmproxy.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
            }
        }
        return com_ayah_dao_realm_model_quran_sectionrealmproxy;
    }

    @TargetApi(11)
    public static Section createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Section section = new Section();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("identifier")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'identifier' to null.");
                }
                section.realmSet$identifier(jsonReader.nextLong());
                z10 = true;
            } else if (!strNextName.equals("verses")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                section.realmSet$verses(null);
            } else {
                section.realmSet$verses(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    section.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Section) realm.copyToRealmOrUpdate(section, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'identifier'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, Section section, Map<RealmModel, Long> map) {
        if ((section instanceof RealmObjectProxy) && !RealmObject.isFrozen(section)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) section;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Section.class);
        long nativePtr = table.getNativePtr();
        SectionColumnInfo sectionColumnInfo = (SectionColumnInfo) realm.getSchema().getColumnInfo(Section.class);
        long j = sectionColumnInfo.identifierColKey;
        Long lValueOf = Long.valueOf(section.realmGet$identifier());
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, section.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(section.realmGet$identifier()));
        } else {
            Table.throwDuplicatePrimaryKeyException(lValueOf);
        }
        map.put(section, Long.valueOf(jNativeFindFirstInt));
        RealmList<Verse> realmListRealmGet$verses = section.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), sectionColumnInfo.versesColKey);
            for (Verse verse : realmListRealmGet$verses) {
                Long lValueOf2 = map.get(verse);
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                }
                osList.addRow(lValueOf2.longValue());
            }
        }
        return jNativeFindFirstInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Section section, Map<RealmModel, Long> map) {
        if ((section instanceof RealmObjectProxy) && !RealmObject.isFrozen(section)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) section;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Section.class);
        long nativePtr = table.getNativePtr();
        SectionColumnInfo sectionColumnInfo = (SectionColumnInfo) realm.getSchema().getColumnInfo(Section.class);
        long j = sectionColumnInfo.identifierColKey;
        section.realmGet$identifier();
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, section.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(section.realmGet$identifier()));
        }
        map.put(section, Long.valueOf(jNativeFindFirstInt));
        OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), sectionColumnInfo.versesColKey);
        RealmList<Verse> realmListRealmGet$verses = section.realmGet$verses();
        if (realmListRealmGet$verses == null || realmListRealmGet$verses.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$verses != null) {
                for (Verse verse : realmListRealmGet$verses) {
                    Long lValueOf = map.get(verse);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                    }
                    osList.addRow(lValueOf.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$verses.size();
            int iQ = 0;
            while (iQ < size) {
                Verse verse2 = realmListRealmGet$verses.get(iQ);
                Long lValueOf2 = map.get(verse2);
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                }
                iQ = p.q(lValueOf2, osList, iQ, iQ, 1);
            }
        }
        return jNativeFindFirstInt;
    }

    public static com_ayah_dao_realm_model_quran_SectionRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Section.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_SectionRealmProxy com_ayah_dao_realm_model_quran_sectionrealmproxy = new com_ayah_dao_realm_model_quran_SectionRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_sectionrealmproxy;
    }

    public static Section update(Realm realm, SectionColumnInfo sectionColumnInfo, Section section, Section section2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Section.class), set);
        osObjectBuilder.addInteger(sectionColumnInfo.identifierColKey, Long.valueOf(section2.realmGet$identifier()));
        RealmList<Verse> realmListRealmGet$verses = section2.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            RealmList realmList = new RealmList();
            int i10 = 0;
            while (i10 < realmListRealmGet$verses.size()) {
                Verse verse = realmListRealmGet$verses.get(i10);
                Verse verse2 = (Verse) map.get(verse);
                if (verse2 != null) {
                    realmList.add(verse2);
                    realm2 = realm;
                    map2 = map;
                    set2 = set;
                } else {
                    realm2 = realm;
                    map2 = map;
                    set2 = set;
                    realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class), verse, true, map2, set2));
                }
                i10++;
                realm = realm2;
                map = map2;
                set = set2;
            }
            osObjectBuilder.addObjectList(sectionColumnInfo.versesColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(sectionColumnInfo.versesColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return section;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_SectionRealmProxy com_ayah_dao_realm_model_quran_sectionrealmproxy = (com_ayah_dao_realm_model_quran_SectionRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_sectionrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_sectionrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_sectionrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (SectionColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Section> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.Section, io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public long realmGet$identifier() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.identifierColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.Section, io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public RealmList<Verse> realmGet$verses() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Verse> realmList = this.versesRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Verse> realmList2 = new RealmList<>((Class<Verse>) Verse.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.versesColKey), this.proxyState.getRealm$realm());
        this.versesRealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Section, io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public void realmSet$identifier(long j) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'identifier' cannot be changed after object was created.");
    }

    @Override // com.ayah.dao.realm.model.quran.Section, io.realm.com_ayah_dao_realm_model_quran_SectionRealmProxyInterface
    public void realmSet$verses(RealmList<Verse> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("verses")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Verse> realmList2 = new RealmList<>();
                for (Verse verse : realmList) {
                    if (verse == null || RealmObject.isManaged(verse)) {
                        realmList2.add(verse);
                    } else {
                        realmList2.add((Verse) realm.copyToRealmOrUpdate(verse, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.versesColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (Verse) realmList.get(i10);
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
            RealmModel realmModel2 = (Verse) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Section = proxy[{identifier:" + realmGet$identifier() + "},{verses:RealmList<Verse>[" + realmGet$verses().size() + "]}]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Section.class);
        long nativePtr = table.getNativePtr();
        SectionColumnInfo sectionColumnInfo = (SectionColumnInfo) realm.getSchema().getColumnInfo(Section.class);
        long j = sectionColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Section section = (Section) it.next();
            if (!map.containsKey(section)) {
                if ((section instanceof RealmObjectProxy) && !RealmObject.isFrozen(section)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) section;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(section, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Long lValueOf = Long.valueOf(section.realmGet$identifier());
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, section.realmGet$identifier());
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(section.realmGet$identifier()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(lValueOf);
                }
                map.put(section, Long.valueOf(jNativeFindFirstInt));
                RealmList<Verse> realmListRealmGet$verses = section.realmGet$verses();
                if (realmListRealmGet$verses != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), sectionColumnInfo.versesColKey);
                    for (Verse verse : realmListRealmGet$verses) {
                        Long lValueOf2 = map.get(verse);
                        if (lValueOf2 == null) {
                            lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                        }
                        osList.addRow(lValueOf2.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Section.class);
        long nativePtr = table.getNativePtr();
        SectionColumnInfo sectionColumnInfo = (SectionColumnInfo) realm.getSchema().getColumnInfo(Section.class);
        long j = sectionColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Section section = (Section) it.next();
            if (!map.containsKey(section)) {
                if ((section instanceof RealmObjectProxy) && !RealmObject.isFrozen(section)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) section;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(section, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                section.realmGet$identifier();
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, section.realmGet$identifier());
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(section.realmGet$identifier()));
                }
                map.put(section, Long.valueOf(jNativeFindFirstInt));
                OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), sectionColumnInfo.versesColKey);
                RealmList<Verse> realmListRealmGet$verses = section.realmGet$verses();
                if (realmListRealmGet$verses != null && realmListRealmGet$verses.size() == osList.size()) {
                    int size = realmListRealmGet$verses.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Verse verse = realmListRealmGet$verses.get(iQ);
                        Long lValueOf = map.get(verse);
                        if (lValueOf == null) {
                            lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                        }
                        iQ = p.q(lValueOf, osList, iQ, iQ, 1);
                    }
                } else {
                    osList.removeAll();
                    if (realmListRealmGet$verses != null) {
                        for (Verse verse2 : realmListRealmGet$verses) {
                            Long lValueOf2 = map.get(verse2);
                            if (lValueOf2 == null) {
                                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                            }
                            osList.addRow(lValueOf2.longValue());
                        }
                    }
                }
            }
        }
    }
}
