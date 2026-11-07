package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Chapter;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_quran_PartRealmProxy extends Part implements RealmObjectProxy, com_ayah_dao_realm_model_quran_PartRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Chapter> chaptersRealmList;
    private PartColumnInfo columnInfo;
    private ProxyState<Part> proxyState;
    private RealmList<Quarter> quartersRealmList;
    private RealmList<Verse> versesRealmList;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Part";
    }

    public static final class PartColumnInfo extends ColumnInfo {
        long arabicTitleColKey;
        long chaptersColKey;
        long englishTitleColKey;
        long identifierColKey;
        long numberColKey;
        long quartersColKey;
        long versesColKey;

        public PartColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.identifierColKey = addColumnDetails("identifier", "identifier", objectSchemaInfo);
            this.numberColKey = addColumnDetails("number", "number", objectSchemaInfo);
            this.arabicTitleColKey = addColumnDetails("arabicTitle", "arabicTitle", objectSchemaInfo);
            this.englishTitleColKey = addColumnDetails("englishTitle", "englishTitle", objectSchemaInfo);
            this.chaptersColKey = addColumnDetails("chapters", "chapters", objectSchemaInfo);
            this.quartersColKey = addColumnDetails("quarters", "quarters", objectSchemaInfo);
            this.versesColKey = addColumnDetails("verses", "verses", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new PartColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PartColumnInfo partColumnInfo = (PartColumnInfo) columnInfo;
            PartColumnInfo partColumnInfo2 = (PartColumnInfo) columnInfo2;
            partColumnInfo2.identifierColKey = partColumnInfo.identifierColKey;
            partColumnInfo2.numberColKey = partColumnInfo.numberColKey;
            partColumnInfo2.arabicTitleColKey = partColumnInfo.arabicTitleColKey;
            partColumnInfo2.englishTitleColKey = partColumnInfo.englishTitleColKey;
            partColumnInfo2.chaptersColKey = partColumnInfo.chaptersColKey;
            partColumnInfo2.quartersColKey = partColumnInfo.quartersColKey;
            partColumnInfo2.versesColKey = partColumnInfo.versesColKey;
        }

        public PartColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_PartRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Part copy(Realm realm, PartColumnInfo partColumnInfo, Part part, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(part);
        if (realmObjectProxy != null) {
            return (Part) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Part.class), set);
        osObjectBuilder.addInteger(partColumnInfo.identifierColKey, Long.valueOf(part.realmGet$identifier()));
        osObjectBuilder.addInteger(partColumnInfo.numberColKey, Long.valueOf(part.realmGet$number()));
        osObjectBuilder.addString(partColumnInfo.arabicTitleColKey, part.realmGet$arabicTitle());
        osObjectBuilder.addString(partColumnInfo.englishTitleColKey, part.realmGet$englishTitle());
        com_ayah_dao_realm_model_quran_PartRealmProxy com_ayah_dao_realm_model_quran_partrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(part, com_ayah_dao_realm_model_quran_partrealmproxyNewProxyInstance);
        RealmList<Chapter> realmListRealmGet$chapters = part.realmGet$chapters();
        if (realmListRealmGet$chapters != null) {
            RealmList<Chapter> realmListRealmGet$chapters2 = com_ayah_dao_realm_model_quran_partrealmproxyNewProxyInstance.realmGet$chapters();
            realmListRealmGet$chapters2.clear();
            for (int i10 = 0; i10 < realmListRealmGet$chapters.size(); i10++) {
                Chapter chapter = realmListRealmGet$chapters.get(i10);
                Chapter chapter2 = (Chapter) map.get(chapter);
                if (chapter2 != null) {
                    realmListRealmGet$chapters2.add(chapter2);
                } else {
                    realmListRealmGet$chapters2.add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class), chapter, z10, map, set));
                }
            }
        }
        RealmList<Quarter> realmListRealmGet$quarters = part.realmGet$quarters();
        if (realmListRealmGet$quarters != null) {
            RealmList<Quarter> realmListRealmGet$quarters2 = com_ayah_dao_realm_model_quran_partrealmproxyNewProxyInstance.realmGet$quarters();
            realmListRealmGet$quarters2.clear();
            for (int i11 = 0; i11 < realmListRealmGet$quarters.size(); i11++) {
                Quarter quarter = realmListRealmGet$quarters.get(i11);
                Quarter quarter2 = (Quarter) map.get(quarter);
                if (quarter2 != null) {
                    realmListRealmGet$quarters2.add(quarter2);
                } else {
                    realmListRealmGet$quarters2.add(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class), quarter, z10, map, set));
                }
            }
        }
        RealmList<Verse> realmListRealmGet$verses = part.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            RealmList<Verse> realmListRealmGet$verses2 = com_ayah_dao_realm_model_quran_partrealmproxyNewProxyInstance.realmGet$verses();
            realmListRealmGet$verses2.clear();
            for (int i12 = 0; i12 < realmListRealmGet$verses.size(); i12++) {
                Verse verse = realmListRealmGet$verses.get(i12);
                Verse verse2 = (Verse) map.get(verse);
                if (verse2 != null) {
                    realmListRealmGet$verses2.add(verse2);
                } else {
                    realmListRealmGet$verses2.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class), verse, z10, map, set));
                }
            }
        }
        return com_ayah_dao_realm_model_quran_partrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Part copyOrUpdate(Realm realm, PartColumnInfo partColumnInfo, Part part, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((part instanceof RealmObjectProxy) && !RealmObject.isFrozen(part)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) part;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return part;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(part);
        if (realmObjectProxy2 != null) {
            return (Part) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_quran_PartRealmProxy com_ayah_dao_realm_model_quran_partrealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Part.class);
            long jFindFirstLong = table.findFirstLong(partColumnInfo.identifierColKey, part.realmGet$identifier());
            if (jFindFirstLong == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstLong), partColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_quran_partrealmproxy = new com_ayah_dao_realm_model_quran_PartRealmProxy();
                    map.put(part, com_ayah_dao_realm_model_quran_partrealmproxy);
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
        return z11 ? update(realm, partColumnInfo, com_ayah_dao_realm_model_quran_partrealmproxy, part, map, set) : copy(realm, partColumnInfo, part, z10, map, set);
    }

    public static PartColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PartColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Part createDetachedCopy(Part part, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Part part2;
        if (i10 > i11 || part == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(part);
        if (cacheData == null) {
            part2 = new Part();
            map.put(part, new RealmObjectProxy.CacheData<>(i10, part2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Part) cacheData.object;
            }
            Part part3 = (Part) cacheData.object;
            cacheData.minDepth = i10;
            part2 = part3;
        }
        part2.realmSet$identifier(part.realmGet$identifier());
        part2.realmSet$number(part.realmGet$number());
        part2.realmSet$arabicTitle(part.realmGet$arabicTitle());
        part2.realmSet$englishTitle(part.realmGet$englishTitle());
        if (i10 == i11) {
            part2.realmSet$chapters(null);
        } else {
            RealmList<Chapter> realmListRealmGet$chapters = part.realmGet$chapters();
            RealmList<Chapter> realmList = new RealmList<>();
            part2.realmSet$chapters(realmList);
            int i12 = i10 + 1;
            int size = realmListRealmGet$chapters.size();
            for (int i13 = 0; i13 < size; i13++) {
                realmList.add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createDetachedCopy(realmListRealmGet$chapters.get(i13), i12, i11, map));
            }
        }
        if (i10 == i11) {
            part2.realmSet$quarters(null);
        } else {
            RealmList<Quarter> realmListRealmGet$quarters = part.realmGet$quarters();
            RealmList<Quarter> realmList2 = new RealmList<>();
            part2.realmSet$quarters(realmList2);
            int i14 = i10 + 1;
            int size2 = realmListRealmGet$quarters.size();
            for (int i15 = 0; i15 < size2; i15++) {
                realmList2.add(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createDetachedCopy(realmListRealmGet$quarters.get(i15), i14, i11, map));
            }
        }
        if (i10 == i11) {
            part2.realmSet$verses(null);
            return part2;
        }
        RealmList<Verse> realmListRealmGet$verses = part.realmGet$verses();
        RealmList<Verse> realmList3 = new RealmList<>();
        part2.realmSet$verses(realmList3);
        int i16 = i10 + 1;
        int size3 = realmListRealmGet$verses.size();
        for (int i17 = 0; i17 < size3; i17++) {
            realmList3.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy(realmListRealmGet$verses.get(i17), i16, i11, map));
        }
        return part2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "identifier", realmFieldType, true, false, true);
        builder.addPersistedProperty(NO_ALIAS, "number", realmFieldType, false, true, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        builder.addPersistedProperty(NO_ALIAS, "arabicTitle", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "englishTitle", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.LIST;
        builder.addPersistedLinkProperty(NO_ALIAS, "chapters", realmFieldType3, com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "quarters", realmFieldType3, com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "verses", realmFieldType3, com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public static Part createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_quran_PartRealmProxy com_ayah_dao_realm_model_quran_partrealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            Table table = realm.getTable(Part.class);
            long jFindFirstLong = !jSONObject.isNull("identifier") ? table.findFirstLong(((PartColumnInfo) realm.getSchema().getColumnInfo(Part.class)).identifierColKey, jSONObject.getLong("identifier")) : -1L;
            if (jFindFirstLong != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstLong);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Part.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_quran_partrealmproxy = new com_ayah_dao_realm_model_quran_PartRealmProxy();
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
                com_ayah_dao_realm_model_quran_partrealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_quran_partrealmproxy = null;
        }
        if (com_ayah_dao_realm_model_quran_partrealmproxy == null) {
            if (jSONObject.has("chapters")) {
                arrayList.add("chapters");
            }
            if (jSONObject.has("quarters")) {
                arrayList.add("quarters");
            }
            if (jSONObject.has("verses")) {
                arrayList.add("verses");
            }
            if (!jSONObject.has("identifier")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'identifier'.");
            }
            com_ayah_dao_realm_model_quran_partrealmproxy = jSONObject.isNull("identifier") ? (com_ayah_dao_realm_model_quran_PartRealmProxy) realm.createObjectInternal(Part.class, null, true, arrayList) : (com_ayah_dao_realm_model_quran_PartRealmProxy) realm.createObjectInternal(Part.class, Long.valueOf(jSONObject.getLong("identifier")), true, arrayList);
        }
        if (jSONObject.has("number")) {
            if (jSONObject.isNull("number")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
            }
            com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$number(jSONObject.getLong("number"));
        }
        if (jSONObject.has("arabicTitle")) {
            if (jSONObject.isNull("arabicTitle")) {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$arabicTitle(null);
            } else {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$arabicTitle(jSONObject.getString("arabicTitle"));
            }
        }
        if (jSONObject.has("englishTitle")) {
            if (jSONObject.isNull("englishTitle")) {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$englishTitle(null);
            } else {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$englishTitle(jSONObject.getString("englishTitle"));
            }
        }
        if (jSONObject.has("chapters")) {
            if (jSONObject.isNull("chapters")) {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$chapters(null);
            } else {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmGet$chapters().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("chapters");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    com_ayah_dao_realm_model_quran_partrealmproxy.realmGet$chapters().add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
                }
            }
        }
        if (jSONObject.has("quarters")) {
            if (jSONObject.isNull("quarters")) {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$quarters(null);
            } else {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmGet$quarters().clear();
                JSONArray jSONArray2 = jSONObject.getJSONArray("quarters");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    com_ayah_dao_realm_model_quran_partrealmproxy.realmGet$quarters().add(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray2.getJSONObject(i11), z10));
                }
            }
        }
        if (jSONObject.has("verses")) {
            if (jSONObject.isNull("verses")) {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmSet$verses(null);
                return com_ayah_dao_realm_model_quran_partrealmproxy;
            }
            com_ayah_dao_realm_model_quran_partrealmproxy.realmGet$verses().clear();
            JSONArray jSONArray3 = jSONObject.getJSONArray("verses");
            for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                com_ayah_dao_realm_model_quran_partrealmproxy.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray3.getJSONObject(i12), z10));
            }
        }
        return com_ayah_dao_realm_model_quran_partrealmproxy;
    }

    @TargetApi(11)
    public static Part createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Part part = new Part();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("identifier")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'identifier' to null.");
                }
                part.realmSet$identifier(jsonReader.nextLong());
                z10 = true;
            } else if (strNextName.equals("number")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'number' to null.");
                }
                part.realmSet$number(jsonReader.nextLong());
            } else if (strNextName.equals("arabicTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    part.realmSet$arabicTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    part.realmSet$arabicTitle(null);
                }
            } else if (strNextName.equals("englishTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    part.realmSet$englishTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    part.realmSet$englishTitle(null);
                }
            } else if (strNextName.equals("chapters")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    part.realmSet$chapters(null);
                } else {
                    part.realmSet$chapters(new RealmList<>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        part.realmGet$chapters().add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (strNextName.equals("quarters")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    part.realmSet$quarters(null);
                } else {
                    part.realmSet$quarters(new RealmList<>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        part.realmGet$quarters().add(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!strNextName.equals("verses")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                part.realmSet$verses(null);
            } else {
                part.realmSet$verses(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    part.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Part) realm.copyToRealmOrUpdate(part, new ImportFlag[0]);
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
    public static long insert(Realm realm, Part part, Map<RealmModel, Long> map) {
        if ((part instanceof RealmObjectProxy) && !RealmObject.isFrozen(part)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) part;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Part.class);
        long nativePtr = table.getNativePtr();
        PartColumnInfo partColumnInfo = (PartColumnInfo) realm.getSchema().getColumnInfo(Part.class);
        long j = partColumnInfo.identifierColKey;
        Long lValueOf = Long.valueOf(part.realmGet$identifier());
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, part.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(part.realmGet$identifier()));
        } else {
            Table.throwDuplicatePrimaryKeyException(lValueOf);
        }
        map.put(part, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, partColumnInfo.numberColKey, jNativeFindFirstInt, part.realmGet$number(), false);
        String strRealmGet$arabicTitle = part.realmGet$arabicTitle();
        if (strRealmGet$arabicTitle != null) {
            Table.nativeSetString(nativePtr, partColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
        }
        String strRealmGet$englishTitle = part.realmGet$englishTitle();
        if (strRealmGet$englishTitle != null) {
            Table.nativeSetString(nativePtr, partColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
        }
        RealmList<Chapter> realmListRealmGet$chapters = part.realmGet$chapters();
        if (realmListRealmGet$chapters != null) {
            OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.chaptersColKey);
            for (Chapter chapter : realmListRealmGet$chapters) {
                Long lValueOf2 = map.get(chapter);
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapter, map));
                }
                osList.addRow(lValueOf2.longValue());
            }
        }
        RealmList<Quarter> realmListRealmGet$quarters = part.realmGet$quarters();
        if (realmListRealmGet$quarters != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.quartersColKey);
            for (Quarter quarter : realmListRealmGet$quarters) {
                Long lValueOf3 = map.get(quarter);
                if (lValueOf3 == null) {
                    lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, quarter, map));
                }
                osList2.addRow(lValueOf3.longValue());
            }
        }
        RealmList<Verse> realmListRealmGet$verses = part.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.versesColKey);
            for (Verse verse : realmListRealmGet$verses) {
                Long lValueOf4 = map.get(verse);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                }
                osList3.addRow(lValueOf4.longValue());
            }
        }
        return jNativeFindFirstInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Part part, Map<RealmModel, Long> map) {
        if ((part instanceof RealmObjectProxy) && !RealmObject.isFrozen(part)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) part;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Part.class);
        long nativePtr = table.getNativePtr();
        PartColumnInfo partColumnInfo = (PartColumnInfo) realm.getSchema().getColumnInfo(Part.class);
        long j = partColumnInfo.identifierColKey;
        part.realmGet$identifier();
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, part.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(part.realmGet$identifier()));
        }
        map.put(part, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, partColumnInfo.numberColKey, jNativeFindFirstInt, part.realmGet$number(), false);
        String strRealmGet$arabicTitle = part.realmGet$arabicTitle();
        if (strRealmGet$arabicTitle != null) {
            Table.nativeSetString(nativePtr, partColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, partColumnInfo.arabicTitleColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$englishTitle = part.realmGet$englishTitle();
        if (strRealmGet$englishTitle != null) {
            Table.nativeSetString(nativePtr, partColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, partColumnInfo.englishTitleColKey, jNativeFindFirstInt, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.chaptersColKey);
        RealmList<Chapter> realmListRealmGet$chapters = part.realmGet$chapters();
        int iQ = 0;
        if (realmListRealmGet$chapters == null || realmListRealmGet$chapters.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$chapters != null) {
                for (Chapter chapter : realmListRealmGet$chapters) {
                    Long lValueOf = map.get(chapter);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter, map));
                    }
                    osList.addRow(lValueOf.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$chapters.size();
            int iQ2 = 0;
            while (iQ2 < size) {
                Chapter chapter2 = realmListRealmGet$chapters.get(iQ2);
                Long lValueOf2 = map.get(chapter2);
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter2, map));
                }
                iQ2 = p.q(lValueOf2, osList, iQ2, iQ2, 1);
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.quartersColKey);
        RealmList<Quarter> realmListRealmGet$quarters = part.realmGet$quarters();
        if (realmListRealmGet$quarters == null || realmListRealmGet$quarters.size() != osList2.size()) {
            osList2.removeAll();
            if (realmListRealmGet$quarters != null) {
                for (Quarter quarter : realmListRealmGet$quarters) {
                    Long lValueOf3 = map.get(quarter);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarter, map));
                    }
                    osList2.addRow(lValueOf3.longValue());
                }
            }
        } else {
            int size2 = realmListRealmGet$quarters.size();
            int iQ3 = 0;
            while (iQ3 < size2) {
                Quarter quarter2 = realmListRealmGet$quarters.get(iQ3);
                Long lValueOf4 = map.get(quarter2);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarter2, map));
                }
                iQ3 = p.q(lValueOf4, osList2, iQ3, iQ3, 1);
            }
        }
        OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.versesColKey);
        RealmList<Verse> realmListRealmGet$verses = part.realmGet$verses();
        if (realmListRealmGet$verses == null || realmListRealmGet$verses.size() != osList3.size()) {
            osList3.removeAll();
            if (realmListRealmGet$verses != null) {
                for (Verse verse : realmListRealmGet$verses) {
                    Long lValueOf5 = map.get(verse);
                    if (lValueOf5 == null) {
                        lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                    }
                    osList3.addRow(lValueOf5.longValue());
                }
            }
        } else {
            int size3 = realmListRealmGet$verses.size();
            while (iQ < size3) {
                Verse verse2 = realmListRealmGet$verses.get(iQ);
                Long lValueOf6 = map.get(verse2);
                if (lValueOf6 == null) {
                    lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                }
                iQ = p.q(lValueOf6, osList3, iQ, iQ, 1);
            }
        }
        return jNativeFindFirstInt;
    }

    public static com_ayah_dao_realm_model_quran_PartRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Part.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_PartRealmProxy com_ayah_dao_realm_model_quran_partrealmproxy = new com_ayah_dao_realm_model_quran_PartRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_partrealmproxy;
    }

    public static Part update(Realm realm, PartColumnInfo partColumnInfo, Part part, Part part2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Set<ImportFlag> set2 = set;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Part.class), set2);
        osObjectBuilder.addInteger(partColumnInfo.identifierColKey, Long.valueOf(part2.realmGet$identifier()));
        osObjectBuilder.addInteger(partColumnInfo.numberColKey, Long.valueOf(part2.realmGet$number()));
        osObjectBuilder.addString(partColumnInfo.arabicTitleColKey, part2.realmGet$arabicTitle());
        osObjectBuilder.addString(partColumnInfo.englishTitleColKey, part2.realmGet$englishTitle());
        RealmList<Chapter> realmListRealmGet$chapters = part2.realmGet$chapters();
        if (realmListRealmGet$chapters != null) {
            RealmList realmList = new RealmList();
            int i10 = 0;
            while (i10 < realmListRealmGet$chapters.size()) {
                Chapter chapter = realmListRealmGet$chapters.get(i10);
                Chapter chapter2 = (Chapter) map.get(chapter);
                if (chapter2 != null) {
                    realmList.add(chapter2);
                } else {
                    realmList.add(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class), chapter, true, map, set2));
                }
                i10++;
                set2 = set;
            }
            osObjectBuilder.addObjectList(partColumnInfo.chaptersColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(partColumnInfo.chaptersColKey, new RealmList());
        }
        RealmList<Quarter> realmListRealmGet$quarters = part2.realmGet$quarters();
        if (realmListRealmGet$quarters != null) {
            RealmList realmList2 = new RealmList();
            for (int i11 = 0; i11 < realmListRealmGet$quarters.size(); i11++) {
                Quarter quarter = realmListRealmGet$quarters.get(i11);
                Quarter quarter2 = (Quarter) map.get(quarter);
                if (quarter2 != null) {
                    realmList2.add(quarter2);
                } else {
                    realmList2.add(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class), quarter, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(partColumnInfo.quartersColKey, realmList2);
        } else {
            osObjectBuilder.addObjectList(partColumnInfo.quartersColKey, new RealmList());
        }
        RealmList<Verse> realmListRealmGet$verses = part2.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            RealmList realmList3 = new RealmList();
            for (int i12 = 0; i12 < realmListRealmGet$verses.size(); i12++) {
                Verse verse = realmListRealmGet$verses.get(i12);
                Verse verse2 = (Verse) map.get(verse);
                if (verse2 != null) {
                    realmList3.add(verse2);
                } else {
                    realmList3.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class), verse, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(partColumnInfo.versesColKey, realmList3);
        } else {
            osObjectBuilder.addObjectList(partColumnInfo.versesColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return part;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_PartRealmProxy com_ayah_dao_realm_model_quran_partrealmproxy = (com_ayah_dao_realm_model_quran_PartRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_partrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_partrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_partrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (PartColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Part> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public String realmGet$arabicTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.arabicTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public String realmGet$englishTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.englishTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public long realmGet$identifier() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.identifierColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public long realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.numberColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public RealmList<Quarter> realmGet$quarters() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Quarter> realmList = this.quartersRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Quarter> realmList2 = new RealmList<>((Class<Quarter>) Quarter.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.quartersColKey), this.proxyState.getRealm$realm());
        this.quartersRealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$identifier(long j) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'identifier' cannot be changed after object was created.");
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$number(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.numberColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.numberColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
    public void realmSet$quarters(RealmList<Quarter> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("quarters")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Quarter> realmList2 = new RealmList<>();
                for (Quarter quarter : realmList) {
                    if (quarter == null || RealmObject.isManaged(quarter)) {
                        realmList2.add(quarter);
                    } else {
                        realmList2.add((Quarter) realm.copyToRealmOrUpdate(quarter, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.quartersColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (Quarter) realmList.get(i10);
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
            RealmModel realmModel2 = (Quarter) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Part, io.realm.com_ayah_dao_realm_model_quran_PartRealmProxyInterface
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
        return "Part = proxy[{identifier:" + realmGet$identifier() + "},{number:" + realmGet$number() + "},{arabicTitle:" + realmGet$arabicTitle() + "},{englishTitle:" + realmGet$englishTitle() + "},{chapters:RealmList<Chapter>[" + realmGet$chapters().size() + "]},{quarters:RealmList<Quarter>[" + realmGet$quarters().size() + "]},{verses:RealmList<Verse>[" + realmGet$verses().size() + "]}]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Part.class);
        long nativePtr = table.getNativePtr();
        PartColumnInfo partColumnInfo = (PartColumnInfo) realm.getSchema().getColumnInfo(Part.class);
        long j = partColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Part part = (Part) it.next();
            if (!map.containsKey(part)) {
                if ((part instanceof RealmObjectProxy) && !RealmObject.isFrozen(part)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) part;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(part, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Long lValueOf = Long.valueOf(part.realmGet$identifier());
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, part.realmGet$identifier());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(part.realmGet$identifier()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(lValueOf);
                }
                map.put(part, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, partColumnInfo.numberColKey, jNativeFindFirstInt, part.realmGet$number(), false);
                String strRealmGet$arabicTitle = part.realmGet$arabicTitle();
                if (strRealmGet$arabicTitle != null) {
                    Table.nativeSetString(nativePtr, partColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
                }
                String strRealmGet$englishTitle = part.realmGet$englishTitle();
                if (strRealmGet$englishTitle != null) {
                    Table.nativeSetString(nativePtr, partColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
                }
                RealmList<Chapter> realmListRealmGet$chapters = part.realmGet$chapters();
                if (realmListRealmGet$chapters != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.chaptersColKey);
                    for (Chapter chapter : realmListRealmGet$chapters) {
                        Long lValueOf2 = map.get(chapter);
                        if (lValueOf2 == null) {
                            lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapter, map));
                        }
                        osList.addRow(lValueOf2.longValue());
                    }
                }
                RealmList<Quarter> realmListRealmGet$quarters = part.realmGet$quarters();
                if (realmListRealmGet$quarters != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.quartersColKey);
                    for (Quarter quarter : realmListRealmGet$quarters) {
                        Long lValueOf3 = map.get(quarter);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, quarter, map));
                        }
                        osList2.addRow(lValueOf3.longValue());
                    }
                }
                RealmList<Verse> realmListRealmGet$verses = part.realmGet$verses();
                if (realmListRealmGet$verses != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.versesColKey);
                    for (Verse verse : realmListRealmGet$verses) {
                        Long lValueOf4 = map.get(verse);
                        if (lValueOf4 == null) {
                            lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                        }
                        osList3.addRow(lValueOf4.longValue());
                    }
                }
                j = j10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Table table = realm.getTable(Part.class);
        long nativePtr = table.getNativePtr();
        PartColumnInfo partColumnInfo = (PartColumnInfo) realm.getSchema().getColumnInfo(Part.class);
        long j10 = partColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Part part = (Part) it.next();
            if (!map.containsKey(part)) {
                if ((part instanceof RealmObjectProxy) && !RealmObject.isFrozen(part)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) part;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(part, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                part.realmGet$identifier();
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j10, part.realmGet$identifier());
                long j11 = j10;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j11, Long.valueOf(part.realmGet$identifier()));
                }
                map.put(part, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, partColumnInfo.numberColKey, jNativeFindFirstInt, part.realmGet$number(), false);
                String strRealmGet$arabicTitle = part.realmGet$arabicTitle();
                if (strRealmGet$arabicTitle != null) {
                    Table.nativeSetString(nativePtr, partColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, partColumnInfo.arabicTitleColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$englishTitle = part.realmGet$englishTitle();
                if (strRealmGet$englishTitle != null) {
                    Table.nativeSetString(nativePtr, partColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, partColumnInfo.englishTitleColKey, jNativeFindFirstInt, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.chaptersColKey);
                RealmList<Chapter> realmListRealmGet$chapters = part.realmGet$chapters();
                if (realmListRealmGet$chapters != null && realmListRealmGet$chapters.size() == osList.size()) {
                    int size = realmListRealmGet$chapters.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Chapter chapter = realmListRealmGet$chapters.get(iQ);
                        Long lValueOf = map.get(chapter);
                        if (lValueOf == null) {
                            lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter, map));
                        }
                        iQ = p.q(lValueOf, osList, iQ, iQ, 1);
                        nativePtr = nativePtr;
                    }
                    j = nativePtr;
                } else {
                    j = nativePtr;
                    osList.removeAll();
                    if (realmListRealmGet$chapters != null) {
                        for (Chapter chapter2 : realmListRealmGet$chapters) {
                            Long lValueOf2 = map.get(chapter2);
                            if (lValueOf2 == null) {
                                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapter2, map));
                            }
                            osList.addRow(lValueOf2.longValue());
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.quartersColKey);
                RealmList<Quarter> realmListRealmGet$quarters = part.realmGet$quarters();
                if (realmListRealmGet$quarters != null && realmListRealmGet$quarters.size() == osList2.size()) {
                    int size2 = realmListRealmGet$quarters.size();
                    int iQ2 = 0;
                    while (iQ2 < size2) {
                        Quarter quarter = realmListRealmGet$quarters.get(iQ2);
                        Long lValueOf3 = map.get(quarter);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarter, map));
                        }
                        iQ2 = p.q(lValueOf3, osList2, iQ2, iQ2, 1);
                    }
                } else {
                    osList2.removeAll();
                    if (realmListRealmGet$quarters != null) {
                        for (Quarter quarter2 : realmListRealmGet$quarters) {
                            Long lValueOf4 = map.get(quarter2);
                            if (lValueOf4 == null) {
                                lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarter2, map));
                            }
                            osList2.addRow(lValueOf4.longValue());
                        }
                    }
                }
                OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), partColumnInfo.versesColKey);
                RealmList<Verse> realmListRealmGet$verses = part.realmGet$verses();
                if (realmListRealmGet$verses != null && realmListRealmGet$verses.size() == osList3.size()) {
                    int size3 = realmListRealmGet$verses.size();
                    int iQ3 = 0;
                    while (iQ3 < size3) {
                        Verse verse = realmListRealmGet$verses.get(iQ3);
                        Long lValueOf5 = map.get(verse);
                        if (lValueOf5 == null) {
                            lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                        }
                        iQ3 = p.q(lValueOf5, osList3, iQ3, iQ3, 1);
                    }
                } else {
                    osList3.removeAll();
                    if (realmListRealmGet$verses != null) {
                        for (Verse verse2 : realmListRealmGet$verses) {
                            Long lValueOf6 = map.get(verse2);
                            if (lValueOf6 == null) {
                                lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                            }
                            osList3.addRow(lValueOf6.longValue());
                        }
                    }
                }
                j10 = j11;
                nativePtr = j;
            }
        }
    }
}
