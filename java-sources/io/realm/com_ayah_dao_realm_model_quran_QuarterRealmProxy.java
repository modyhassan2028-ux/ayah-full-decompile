package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_quran_QuarterRealmProxy extends Quarter implements RealmObjectProxy, com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private QuarterColumnInfo columnInfo;
    private ProxyState<Quarter> proxyState;
    private RealmList<Verse> versesRealmList;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Quarter";
    }

    public static final class QuarterColumnInfo extends ColumnInfo {
        long arabicTitleColKey;
        long englishTitleColKey;
        long hizbFractionColKey;
        long hizbNumberColKey;
        long identifierColKey;
        long partColKey;
        long versesColKey;

        public QuarterColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.identifierColKey = addColumnDetails("identifier", "identifier", objectSchemaInfo);
            this.hizbNumberColKey = addColumnDetails("hizbNumber", "hizbNumber", objectSchemaInfo);
            this.hizbFractionColKey = addColumnDetails("hizbFraction", "hizbFraction", objectSchemaInfo);
            this.arabicTitleColKey = addColumnDetails("arabicTitle", "arabicTitle", objectSchemaInfo);
            this.englishTitleColKey = addColumnDetails("englishTitle", "englishTitle", objectSchemaInfo);
            this.partColKey = addColumnDetails("part", "part", objectSchemaInfo);
            this.versesColKey = addColumnDetails("verses", "verses", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new QuarterColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            QuarterColumnInfo quarterColumnInfo = (QuarterColumnInfo) columnInfo;
            QuarterColumnInfo quarterColumnInfo2 = (QuarterColumnInfo) columnInfo2;
            quarterColumnInfo2.identifierColKey = quarterColumnInfo.identifierColKey;
            quarterColumnInfo2.hizbNumberColKey = quarterColumnInfo.hizbNumberColKey;
            quarterColumnInfo2.hizbFractionColKey = quarterColumnInfo.hizbFractionColKey;
            quarterColumnInfo2.arabicTitleColKey = quarterColumnInfo.arabicTitleColKey;
            quarterColumnInfo2.englishTitleColKey = quarterColumnInfo.englishTitleColKey;
            quarterColumnInfo2.partColKey = quarterColumnInfo.partColKey;
            quarterColumnInfo2.versesColKey = quarterColumnInfo.versesColKey;
        }

        public QuarterColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_QuarterRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0093  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    public static Quarter copy(Realm realm, QuarterColumnInfo quarterColumnInfo, Quarter quarter, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        RealmList<Verse> realmListRealmGet$verses;
        RealmList<Verse> realmListRealmGet$verses2;
        int i10;
        Verse verse;
        Verse verse2;
        RealmObjectProxy realmObjectProxy = map.get(quarter);
        if (realmObjectProxy != null) {
            return (Quarter) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Quarter.class), set);
        osObjectBuilder.addInteger(quarterColumnInfo.identifierColKey, Long.valueOf(quarter.realmGet$identifier()));
        osObjectBuilder.addInteger(quarterColumnInfo.hizbNumberColKey, Long.valueOf(quarter.realmGet$hizbNumber()));
        osObjectBuilder.addInteger(quarterColumnInfo.hizbFractionColKey, Long.valueOf(quarter.realmGet$hizbFraction()));
        osObjectBuilder.addString(quarterColumnInfo.arabicTitleColKey, quarter.realmGet$arabicTitle());
        osObjectBuilder.addString(quarterColumnInfo.englishTitleColKey, quarter.realmGet$englishTitle());
        com_ayah_dao_realm_model_quran_QuarterRealmProxy com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(quarter, com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance);
        Part partRealmGet$part = quarter.realmGet$part();
        if (partRealmGet$part != null) {
            Part part = (Part) map.get(partRealmGet$part);
            if (part != null) {
                com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance.realmSet$part(part);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PartRealmProxy.PartColumnInfo) realm.getSchema().getColumnInfo(Part.class), partRealmGet$part, z11, map3, set2));
                map2 = map3;
            }
            realmListRealmGet$verses = quarter.realmGet$verses();
            if (realmListRealmGet$verses != null) {
                realmListRealmGet$verses2 = com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance.realmGet$verses();
                realmListRealmGet$verses2.clear();
                for (i10 = 0; i10 < realmListRealmGet$verses.size(); i10++) {
                    verse = realmListRealmGet$verses.get(i10);
                    verse2 = (Verse) map2.get(verse);
                    if (verse2 != null) {
                        realmListRealmGet$verses2.add(verse2);
                    } else {
                        realmListRealmGet$verses2.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, z11, map2, set2));
                    }
                }
            }
            return com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance.realmSet$part(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        realmListRealmGet$verses = quarter.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            realmListRealmGet$verses2 = com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance.realmGet$verses();
            realmListRealmGet$verses2.clear();
            while (i10 < realmListRealmGet$verses.size()) {
                verse = realmListRealmGet$verses.get(i10);
                verse2 = (Verse) map2.get(verse);
                if (verse2 != null) {
                    realmListRealmGet$verses2.add(verse2);
                } else {
                    realmListRealmGet$verses2.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, z11, map2, set2));
                }
            }
        }
        return com_ayah_dao_realm_model_quran_quarterrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Quarter copyOrUpdate(Realm realm, QuarterColumnInfo quarterColumnInfo, Quarter quarter, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((quarter instanceof RealmObjectProxy) && !RealmObject.isFrozen(quarter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) quarter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return quarter;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(quarter);
        if (realmObjectProxy2 != null) {
            return (Quarter) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_quran_QuarterRealmProxy com_ayah_dao_realm_model_quran_quarterrealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Quarter.class);
            long jFindFirstLong = table.findFirstLong(quarterColumnInfo.identifierColKey, quarter.realmGet$identifier());
            if (jFindFirstLong == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstLong), quarterColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_quran_quarterrealmproxy = new com_ayah_dao_realm_model_quran_QuarterRealmProxy();
                    map.put(quarter, com_ayah_dao_realm_model_quran_quarterrealmproxy);
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
        return z11 ? update(realm, quarterColumnInfo, com_ayah_dao_realm_model_quran_quarterrealmproxy, quarter, map, set) : copy(realm, quarterColumnInfo, quarter, z10, map, set);
    }

    public static QuarterColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new QuarterColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Quarter createDetachedCopy(Quarter quarter, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Quarter quarter2;
        if (i10 > i11 || quarter == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(quarter);
        if (cacheData == null) {
            quarter2 = new Quarter();
            map.put(quarter, new RealmObjectProxy.CacheData<>(i10, quarter2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Quarter) cacheData.object;
            }
            Quarter quarter3 = (Quarter) cacheData.object;
            cacheData.minDepth = i10;
            quarter2 = quarter3;
        }
        quarter2.realmSet$identifier(quarter.realmGet$identifier());
        quarter2.realmSet$hizbNumber(quarter.realmGet$hizbNumber());
        quarter2.realmSet$hizbFraction(quarter.realmGet$hizbFraction());
        quarter2.realmSet$arabicTitle(quarter.realmGet$arabicTitle());
        quarter2.realmSet$englishTitle(quarter.realmGet$englishTitle());
        int i12 = i10 + 1;
        quarter2.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createDetachedCopy(quarter.realmGet$part(), i12, i11, map));
        if (i10 == i11) {
            quarter2.realmSet$verses(null);
            return quarter2;
        }
        RealmList<Verse> realmListRealmGet$verses = quarter.realmGet$verses();
        RealmList<Verse> realmList = new RealmList<>();
        quarter2.realmSet$verses(realmList);
        int size = realmListRealmGet$verses.size();
        for (int i13 = 0; i13 < size; i13++) {
            realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy(realmListRealmGet$verses.get(i13), i12, i11, map));
        }
        return quarter2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "identifier", realmFieldType, true, false, true);
        builder.addPersistedProperty(NO_ALIAS, "hizbNumber", realmFieldType, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "hizbFraction", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        builder.addPersistedProperty(NO_ALIAS, "arabicTitle", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "englishTitle", realmFieldType2, false, false, true);
        builder.addPersistedLinkProperty(NO_ALIAS, "part", RealmFieldType.OBJECT, com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "verses", RealmFieldType.LIST, com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public static Quarter createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_quran_QuarterRealmProxy com_ayah_dao_realm_model_quran_quarterrealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(2);
        if (z10) {
            Table table = realm.getTable(Quarter.class);
            long jFindFirstLong = !jSONObject.isNull("identifier") ? table.findFirstLong(((QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class)).identifierColKey, jSONObject.getLong("identifier")) : -1L;
            if (jFindFirstLong != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstLong);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Quarter.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_quran_quarterrealmproxy = new com_ayah_dao_realm_model_quran_QuarterRealmProxy();
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
                com_ayah_dao_realm_model_quran_quarterrealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_quran_quarterrealmproxy = null;
        }
        if (com_ayah_dao_realm_model_quran_quarterrealmproxy == null) {
            if (jSONObject.has("part")) {
                arrayList.add("part");
            }
            if (jSONObject.has("verses")) {
                arrayList.add("verses");
            }
            if (!jSONObject.has("identifier")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'identifier'.");
            }
            com_ayah_dao_realm_model_quran_quarterrealmproxy = jSONObject.isNull("identifier") ? (com_ayah_dao_realm_model_quran_QuarterRealmProxy) realm.createObjectInternal(Quarter.class, null, true, arrayList) : (com_ayah_dao_realm_model_quran_QuarterRealmProxy) realm.createObjectInternal(Quarter.class, Long.valueOf(jSONObject.getLong("identifier")), true, arrayList);
        }
        if (jSONObject.has("hizbNumber")) {
            if (jSONObject.isNull("hizbNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hizbNumber' to null.");
            }
            com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$hizbNumber(jSONObject.getLong("hizbNumber"));
        }
        if (jSONObject.has("hizbFraction")) {
            if (jSONObject.isNull("hizbFraction")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hizbFraction' to null.");
            }
            com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$hizbFraction(jSONObject.getLong("hizbFraction"));
        }
        if (jSONObject.has("arabicTitle")) {
            if (jSONObject.isNull("arabicTitle")) {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$arabicTitle(null);
            } else {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$arabicTitle(jSONObject.getString("arabicTitle"));
            }
        }
        if (jSONObject.has("englishTitle")) {
            if (jSONObject.isNull("englishTitle")) {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$englishTitle(null);
            } else {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$englishTitle(jSONObject.getString("englishTitle"));
            }
        }
        if (jSONObject.has("part")) {
            if (jSONObject.isNull("part")) {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$part(null);
            } else {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("part"), z10));
            }
        }
        if (jSONObject.has("verses")) {
            if (jSONObject.isNull("verses")) {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmSet$verses(null);
                return com_ayah_dao_realm_model_quran_quarterrealmproxy;
            }
            com_ayah_dao_realm_model_quran_quarterrealmproxy.realmGet$verses().clear();
            JSONArray jSONArray = jSONObject.getJSONArray("verses");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                com_ayah_dao_realm_model_quran_quarterrealmproxy.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
            }
        }
        return com_ayah_dao_realm_model_quran_quarterrealmproxy;
    }

    @TargetApi(11)
    public static Quarter createUsingJsonStream(Realm realm, JsonReader jsonReader) {
        Quarter quarter = new Quarter();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("identifier")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'identifier' to null.");
                }
                quarter.realmSet$identifier(jsonReader.nextLong());
                z10 = true;
            } else if (strNextName.equals("hizbNumber")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'hizbNumber' to null.");
                }
                quarter.realmSet$hizbNumber(jsonReader.nextLong());
            } else if (strNextName.equals("hizbFraction")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'hizbFraction' to null.");
                }
                quarter.realmSet$hizbFraction(jsonReader.nextLong());
            } else if (strNextName.equals("arabicTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    quarter.realmSet$arabicTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    quarter.realmSet$arabicTitle(null);
                }
            } else if (strNextName.equals("englishTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    quarter.realmSet$englishTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    quarter.realmSet$englishTitle(null);
                }
            } else if (strNextName.equals("part")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    quarter.realmSet$part(null);
                } else {
                    quarter.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!strNextName.equals("verses")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                quarter.realmSet$verses(null);
            } else {
                quarter.realmSet$verses(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    quarter.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Quarter) realm.copyToRealmOrUpdate(quarter, new ImportFlag[0]);
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
    public static long insert(Realm realm, Quarter quarter, Map<RealmModel, Long> map) {
        if ((quarter instanceof RealmObjectProxy) && !RealmObject.isFrozen(quarter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) quarter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Quarter.class);
        long nativePtr = table.getNativePtr();
        QuarterColumnInfo quarterColumnInfo = (QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class);
        long j = quarterColumnInfo.identifierColKey;
        Long lValueOf = Long.valueOf(quarter.realmGet$identifier());
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, quarter.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(quarter.realmGet$identifier()));
        } else {
            Table.throwDuplicatePrimaryKeyException(lValueOf);
        }
        map.put(quarter, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbNumberColKey, jNativeFindFirstInt, quarter.realmGet$hizbNumber(), false);
        Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbFractionColKey, jNativeFindFirstInt, quarter.realmGet$hizbFraction(), false);
        String strRealmGet$arabicTitle = quarter.realmGet$arabicTitle();
        if (strRealmGet$arabicTitle != null) {
            Table.nativeSetString(nativePtr, quarterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
        }
        String strRealmGet$englishTitle = quarter.realmGet$englishTitle();
        if (strRealmGet$englishTitle != null) {
            Table.nativeSetString(nativePtr, quarterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
        }
        Part partRealmGet$part = quarter.realmGet$part();
        if (partRealmGet$part != null) {
            Long lValueOf2 = map.get(partRealmGet$part);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, partRealmGet$part, map));
            }
            Table.nativeSetLink(nativePtr, quarterColumnInfo.partColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        }
        RealmList<Verse> realmListRealmGet$verses = quarter.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), quarterColumnInfo.versesColKey);
            for (Verse verse : realmListRealmGet$verses) {
                Long lValueOf3 = map.get(verse);
                if (lValueOf3 == null) {
                    lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                }
                osList.addRow(lValueOf3.longValue());
            }
        }
        return jNativeFindFirstInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Quarter quarter, Map<RealmModel, Long> map) {
        if ((quarter instanceof RealmObjectProxy) && !RealmObject.isFrozen(quarter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) quarter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Quarter.class);
        long nativePtr = table.getNativePtr();
        QuarterColumnInfo quarterColumnInfo = (QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class);
        long j = quarterColumnInfo.identifierColKey;
        quarter.realmGet$identifier();
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, quarter.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(quarter.realmGet$identifier()));
        }
        map.put(quarter, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbNumberColKey, jNativeFindFirstInt, quarter.realmGet$hizbNumber(), false);
        Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbFractionColKey, jNativeFindFirstInt, quarter.realmGet$hizbFraction(), false);
        String strRealmGet$arabicTitle = quarter.realmGet$arabicTitle();
        if (strRealmGet$arabicTitle != null) {
            Table.nativeSetString(nativePtr, quarterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, quarterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$englishTitle = quarter.realmGet$englishTitle();
        if (strRealmGet$englishTitle != null) {
            Table.nativeSetString(nativePtr, quarterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, quarterColumnInfo.englishTitleColKey, jNativeFindFirstInt, false);
        }
        Part partRealmGet$part = quarter.realmGet$part();
        if (partRealmGet$part != null) {
            Long lValueOf = map.get(partRealmGet$part);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, partRealmGet$part, map));
            }
            Table.nativeSetLink(nativePtr, quarterColumnInfo.partColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, quarterColumnInfo.partColKey, jNativeFindFirstInt);
        }
        OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), quarterColumnInfo.versesColKey);
        RealmList<Verse> realmListRealmGet$verses = quarter.realmGet$verses();
        if (realmListRealmGet$verses == null || realmListRealmGet$verses.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$verses != null) {
                for (Verse verse : realmListRealmGet$verses) {
                    Long lValueOf2 = map.get(verse);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                    }
                    osList.addRow(lValueOf2.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$verses.size();
            int iQ = 0;
            while (iQ < size) {
                Verse verse2 = realmListRealmGet$verses.get(iQ);
                Long lValueOf3 = map.get(verse2);
                if (lValueOf3 == null) {
                    lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                }
                iQ = p.q(lValueOf3, osList, iQ, iQ, 1);
            }
        }
        return jNativeFindFirstInt;
    }

    public static com_ayah_dao_realm_model_quran_QuarterRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Quarter.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_QuarterRealmProxy com_ayah_dao_realm_model_quran_quarterrealmproxy = new com_ayah_dao_realm_model_quran_QuarterRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_quarterrealmproxy;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0081  */
    /* JADX WARN: Code duplicated, block: B:15:0x008d  */
    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    public static Quarter update(Realm realm, QuarterColumnInfo quarterColumnInfo, Quarter quarter, Quarter quarter2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        RealmList<Verse> realmListRealmGet$verses;
        RealmList realmList;
        int i10;
        Verse verse;
        Verse verse2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Quarter.class), set);
        osObjectBuilder.addInteger(quarterColumnInfo.identifierColKey, Long.valueOf(quarter2.realmGet$identifier()));
        osObjectBuilder.addInteger(quarterColumnInfo.hizbNumberColKey, Long.valueOf(quarter2.realmGet$hizbNumber()));
        osObjectBuilder.addInteger(quarterColumnInfo.hizbFractionColKey, Long.valueOf(quarter2.realmGet$hizbFraction()));
        osObjectBuilder.addString(quarterColumnInfo.arabicTitleColKey, quarter2.realmGet$arabicTitle());
        osObjectBuilder.addString(quarterColumnInfo.englishTitleColKey, quarter2.realmGet$englishTitle());
        Part partRealmGet$part = quarter2.realmGet$part();
        if (partRealmGet$part != null) {
            Part part = (Part) map.get(partRealmGet$part);
            if (part != null) {
                osObjectBuilder.addObject(quarterColumnInfo.partColKey, part);
            } else {
                realm2 = realm;
                map2 = map;
                set2 = set;
                osObjectBuilder.addObject(quarterColumnInfo.partColKey, com_ayah_dao_realm_model_quran_PartRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PartRealmProxy.PartColumnInfo) realm.getSchema().getColumnInfo(Part.class), partRealmGet$part, true, map2, set2));
            }
            realmListRealmGet$verses = quarter2.realmGet$verses();
            if (realmListRealmGet$verses != null) {
                realmList = new RealmList();
                for (i10 = 0; i10 < realmListRealmGet$verses.size(); i10++) {
                    verse = realmListRealmGet$verses.get(i10);
                    verse2 = (Verse) map2.get(verse);
                    if (verse2 != null) {
                        realmList.add(verse2);
                    } else {
                        realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(quarterColumnInfo.versesColKey, realmList);
            } else {
                osObjectBuilder.addObjectList(quarterColumnInfo.versesColKey, new RealmList());
            }
            osObjectBuilder.updateExistingTopLevelObject();
            return quarter;
        }
        osObjectBuilder.addNull(quarterColumnInfo.partColKey);
        realm2 = realm;
        map2 = map;
        set2 = set;
        realmListRealmGet$verses = quarter2.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            realmList = new RealmList();
            while (i10 < realmListRealmGet$verses.size()) {
                verse = realmListRealmGet$verses.get(i10);
                verse2 = (Verse) map2.get(verse);
                if (verse2 != null) {
                    realmList.add(verse2);
                } else {
                    realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(quarterColumnInfo.versesColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(quarterColumnInfo.versesColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return quarter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_QuarterRealmProxy com_ayah_dao_realm_model_quran_quarterrealmproxy = (com_ayah_dao_realm_model_quran_QuarterRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_quarterrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_quarterrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_quarterrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (QuarterColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Quarter> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public String realmGet$arabicTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.arabicTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public String realmGet$englishTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.englishTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public long realmGet$hizbFraction() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.hizbFractionColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public long realmGet$hizbNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.hizbNumberColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public long realmGet$identifier() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.identifierColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$arabicTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'arabicTitle' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.arabicTitleColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'arabicTitle' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.arabicTitleColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$englishTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'englishTitle' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.englishTitleColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'englishTitle' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.englishTitleColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$hizbFraction(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.hizbFractionColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.hizbFractionColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$hizbNumber(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.hizbNumberColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.hizbNumberColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
    public void realmSet$identifier(long j) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'identifier' cannot be changed after object was created.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Quarter, io.realm.com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface
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
        StringBuilder sb = new StringBuilder("Quarter = proxy[{identifier:");
        sb.append(realmGet$identifier());
        sb.append("},{hizbNumber:");
        sb.append(realmGet$hizbNumber());
        sb.append("},{hizbFraction:");
        sb.append(realmGet$hizbFraction());
        sb.append("},{arabicTitle:");
        sb.append(realmGet$arabicTitle());
        sb.append("},{englishTitle:");
        sb.append(realmGet$englishTitle());
        sb.append("},{part:");
        sb.append(realmGet$part() != null ? com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{verses:RealmList<Verse>[");
        sb.append(realmGet$verses().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Quarter.class);
        long nativePtr = table.getNativePtr();
        QuarterColumnInfo quarterColumnInfo = (QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class);
        long j = quarterColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Quarter quarter = (Quarter) it.next();
            if (!map.containsKey(quarter)) {
                if ((quarter instanceof RealmObjectProxy) && !RealmObject.isFrozen(quarter)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) quarter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(quarter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Long lValueOf = Long.valueOf(quarter.realmGet$identifier());
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, quarter.realmGet$identifier());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(quarter.realmGet$identifier()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(lValueOf);
                }
                map.put(quarter, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbNumberColKey, jNativeFindFirstInt, quarter.realmGet$hizbNumber(), false);
                Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbFractionColKey, jNativeFindFirstInt, quarter.realmGet$hizbFraction(), false);
                String strRealmGet$arabicTitle = quarter.realmGet$arabicTitle();
                if (strRealmGet$arabicTitle != null) {
                    Table.nativeSetString(nativePtr, quarterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
                }
                String strRealmGet$englishTitle = quarter.realmGet$englishTitle();
                if (strRealmGet$englishTitle != null) {
                    Table.nativeSetString(nativePtr, quarterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
                }
                Part partRealmGet$part = quarter.realmGet$part();
                if (partRealmGet$part != null) {
                    Long lValueOf2 = map.get(partRealmGet$part);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, partRealmGet$part, map));
                    }
                    Table.nativeSetLink(nativePtr, quarterColumnInfo.partColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                }
                RealmList<Verse> realmListRealmGet$verses = quarter.realmGet$verses();
                if (realmListRealmGet$verses != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), quarterColumnInfo.versesColKey);
                    for (Verse verse : realmListRealmGet$verses) {
                        Long lValueOf3 = map.get(verse);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                        }
                        osList.addRow(lValueOf3.longValue());
                    }
                }
                j = j10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Quarter.class);
        long nativePtr = table.getNativePtr();
        QuarterColumnInfo quarterColumnInfo = (QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class);
        long j = quarterColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Quarter quarter = (Quarter) it.next();
            if (!map.containsKey(quarter)) {
                if ((quarter instanceof RealmObjectProxy) && !RealmObject.isFrozen(quarter)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) quarter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(quarter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                quarter.realmGet$identifier();
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, quarter.realmGet$identifier());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(quarter.realmGet$identifier()));
                }
                map.put(quarter, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbNumberColKey, jNativeFindFirstInt, quarter.realmGet$hizbNumber(), false);
                Table.nativeSetLong(nativePtr, quarterColumnInfo.hizbFractionColKey, jNativeFindFirstInt, quarter.realmGet$hizbFraction(), false);
                String strRealmGet$arabicTitle = quarter.realmGet$arabicTitle();
                if (strRealmGet$arabicTitle != null) {
                    Table.nativeSetString(nativePtr, quarterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, quarterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$englishTitle = quarter.realmGet$englishTitle();
                if (strRealmGet$englishTitle != null) {
                    Table.nativeSetString(nativePtr, quarterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, quarterColumnInfo.englishTitleColKey, jNativeFindFirstInt, false);
                }
                Part partRealmGet$part = quarter.realmGet$part();
                if (partRealmGet$part != null) {
                    Long lValueOf = map.get(partRealmGet$part);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, partRealmGet$part, map));
                    }
                    Table.nativeSetLink(nativePtr, quarterColumnInfo.partColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, quarterColumnInfo.partColKey, jNativeFindFirstInt);
                }
                OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), quarterColumnInfo.versesColKey);
                RealmList<Verse> realmListRealmGet$verses = quarter.realmGet$verses();
                if (realmListRealmGet$verses != null && realmListRealmGet$verses.size() == osList.size()) {
                    int size = realmListRealmGet$verses.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Verse verse = realmListRealmGet$verses.get(iQ);
                        Long lValueOf2 = map.get(verse);
                        if (lValueOf2 == null) {
                            lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                        }
                        iQ = p.q(lValueOf2, osList, iQ, iQ, 1);
                    }
                } else {
                    osList.removeAll();
                    if (realmListRealmGet$verses != null) {
                        for (Verse verse2 : realmListRealmGet$verses) {
                            Long lValueOf3 = map.get(verse2);
                            if (lValueOf3 == null) {
                                lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                            }
                            osList.addRow(lValueOf3.longValue());
                        }
                    }
                }
                j = j10;
            }
        }
    }
}
