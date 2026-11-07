package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.ChapterHeader;
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
public class com_ayah_dao_realm_model_quran_ChapterRealmProxy extends Chapter implements RealmObjectProxy, com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ChapterColumnInfo columnInfo;
    private ProxyState<Chapter> proxyState;
    private RealmList<Verse> versesRealmList;

    public static final class ChapterColumnInfo extends ColumnInfo {
        long arabicTitleColKey;
        long englishTitleColKey;
        long header1405ColKey;
        long header1441ColKey;
        long identifierColKey;
        long isMeccanColKey;
        long numberColKey;
        long searchableKeywordsColKey;
        long searchableTextColKey;
        long titleCodePointColKey;
        long titleColKey;
        long versesColKey;

        public ChapterColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.identifierColKey = addColumnDetails("identifier", "identifier", objectSchemaInfo);
            this.numberColKey = addColumnDetails("number", "number", objectSchemaInfo);
            this.isMeccanColKey = addColumnDetails("isMeccan", "isMeccan", objectSchemaInfo);
            this.titleColKey = addColumnDetails("title", "title", objectSchemaInfo);
            this.arabicTitleColKey = addColumnDetails("arabicTitle", "arabicTitle", objectSchemaInfo);
            this.englishTitleColKey = addColumnDetails("englishTitle", "englishTitle", objectSchemaInfo);
            this.titleCodePointColKey = addColumnDetails("titleCodePoint", "titleCodePoint", objectSchemaInfo);
            this.searchableTextColKey = addColumnDetails("searchableText", "searchableText", objectSchemaInfo);
            this.searchableKeywordsColKey = addColumnDetails("searchableKeywords", "searchableKeywords", objectSchemaInfo);
            this.header1405ColKey = addColumnDetails("header1405", "header1405", objectSchemaInfo);
            this.header1441ColKey = addColumnDetails("header1441", "header1441", objectSchemaInfo);
            this.versesColKey = addColumnDetails("verses", "verses", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new ChapterColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ChapterColumnInfo chapterColumnInfo = (ChapterColumnInfo) columnInfo;
            ChapterColumnInfo chapterColumnInfo2 = (ChapterColumnInfo) columnInfo2;
            chapterColumnInfo2.identifierColKey = chapterColumnInfo.identifierColKey;
            chapterColumnInfo2.numberColKey = chapterColumnInfo.numberColKey;
            chapterColumnInfo2.isMeccanColKey = chapterColumnInfo.isMeccanColKey;
            chapterColumnInfo2.titleColKey = chapterColumnInfo.titleColKey;
            chapterColumnInfo2.arabicTitleColKey = chapterColumnInfo.arabicTitleColKey;
            chapterColumnInfo2.englishTitleColKey = chapterColumnInfo.englishTitleColKey;
            chapterColumnInfo2.titleCodePointColKey = chapterColumnInfo.titleCodePointColKey;
            chapterColumnInfo2.searchableTextColKey = chapterColumnInfo.searchableTextColKey;
            chapterColumnInfo2.searchableKeywordsColKey = chapterColumnInfo.searchableKeywordsColKey;
            chapterColumnInfo2.header1405ColKey = chapterColumnInfo.header1405ColKey;
            chapterColumnInfo2.header1441ColKey = chapterColumnInfo.header1441ColKey;
            chapterColumnInfo2.versesColKey = chapterColumnInfo.versesColKey;
        }

        public ChapterColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Chapter";
    }

    public com_ayah_dao_realm_model_quran_ChapterRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:17:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0100  */
    public static Chapter copy(Realm realm, ChapterColumnInfo chapterColumnInfo, Chapter chapter, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        ChapterHeader chapterHeaderRealmGet$header1441;
        ChapterHeader chapterHeader;
        RealmList<Verse> realmListRealmGet$verses;
        RealmList<Verse> realmListRealmGet$verses2;
        int i10;
        Verse verse;
        Verse verse2;
        RealmObjectProxy realmObjectProxy = map.get(chapter);
        if (realmObjectProxy != null) {
            return (Chapter) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Chapter.class), set);
        osObjectBuilder.addInteger(chapterColumnInfo.identifierColKey, Long.valueOf(chapter.realmGet$identifier()));
        osObjectBuilder.addInteger(chapterColumnInfo.numberColKey, Long.valueOf(chapter.realmGet$number()));
        osObjectBuilder.addBoolean(chapterColumnInfo.isMeccanColKey, Boolean.valueOf(chapter.realmGet$isMeccan()));
        osObjectBuilder.addString(chapterColumnInfo.titleColKey, chapter.realmGet$title());
        osObjectBuilder.addString(chapterColumnInfo.arabicTitleColKey, chapter.realmGet$arabicTitle());
        osObjectBuilder.addString(chapterColumnInfo.englishTitleColKey, chapter.realmGet$englishTitle());
        osObjectBuilder.addString(chapterColumnInfo.titleCodePointColKey, chapter.realmGet$titleCodePoint());
        osObjectBuilder.addString(chapterColumnInfo.searchableTextColKey, chapter.realmGet$searchableText());
        osObjectBuilder.addString(chapterColumnInfo.searchableKeywordsColKey, chapter.realmGet$searchableKeywords());
        com_ayah_dao_realm_model_quran_ChapterRealmProxy com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(chapter, com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance);
        ChapterHeader chapterHeaderRealmGet$header1405 = chapter.realmGet$header1405();
        if (chapterHeaderRealmGet$header1405 != null) {
            ChapterHeader chapterHeader2 = (ChapterHeader) map.get(chapterHeaderRealmGet$header1405);
            if (chapterHeader2 != null) {
                com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1405(chapterHeader2);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1405(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class), chapterHeaderRealmGet$header1405, z11, map3, set2));
                map2 = map3;
            }
            chapterHeaderRealmGet$header1441 = chapter.realmGet$header1441();
            if (chapterHeaderRealmGet$header1441 == null) {
                com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1441(null);
            } else {
                chapterHeader = (ChapterHeader) map2.get(chapterHeaderRealmGet$header1441);
                if (chapterHeader != null) {
                    com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1441(chapterHeader);
                } else {
                    com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1441(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeaderRealmGet$header1441, z11, map2, set2));
                }
            }
            realmListRealmGet$verses = chapter.realmGet$verses();
            if (realmListRealmGet$verses != null) {
                realmListRealmGet$verses2 = com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmGet$verses();
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
            return com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1405(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        chapterHeaderRealmGet$header1441 = chapter.realmGet$header1441();
        if (chapterHeaderRealmGet$header1441 == null) {
            com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1441(null);
        } else {
            chapterHeader = (ChapterHeader) map2.get(chapterHeaderRealmGet$header1441);
            if (chapterHeader != null) {
                com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1441(chapterHeader);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmSet$header1441(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeaderRealmGet$header1441, z11, map2, set2));
            }
        }
        realmListRealmGet$verses = chapter.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            realmListRealmGet$verses2 = com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance.realmGet$verses();
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
        return com_ayah_dao_realm_model_quran_chapterrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Chapter copyOrUpdate(Realm realm, ChapterColumnInfo chapterColumnInfo, Chapter chapter, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((chapter instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return chapter;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(chapter);
        if (realmObjectProxy2 != null) {
            return (Chapter) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_quran_ChapterRealmProxy com_ayah_dao_realm_model_quran_chapterrealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Chapter.class);
            long jFindFirstLong = table.findFirstLong(chapterColumnInfo.identifierColKey, chapter.realmGet$identifier());
            if (jFindFirstLong == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstLong), chapterColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_quran_chapterrealmproxy = new com_ayah_dao_realm_model_quran_ChapterRealmProxy();
                    map.put(chapter, com_ayah_dao_realm_model_quran_chapterrealmproxy);
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
        return z11 ? update(realm, chapterColumnInfo, com_ayah_dao_realm_model_quran_chapterrealmproxy, chapter, map, set) : copy(realm, chapterColumnInfo, chapter, z10, map, set);
    }

    public static ChapterColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ChapterColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Chapter createDetachedCopy(Chapter chapter, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Chapter chapter2;
        if (i10 > i11 || chapter == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(chapter);
        if (cacheData == null) {
            chapter2 = new Chapter();
            map.put(chapter, new RealmObjectProxy.CacheData<>(i10, chapter2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Chapter) cacheData.object;
            }
            Chapter chapter3 = (Chapter) cacheData.object;
            cacheData.minDepth = i10;
            chapter2 = chapter3;
        }
        chapter2.realmSet$identifier(chapter.realmGet$identifier());
        chapter2.realmSet$number(chapter.realmGet$number());
        chapter2.realmSet$isMeccan(chapter.realmGet$isMeccan());
        chapter2.realmSet$title(chapter.realmGet$title());
        chapter2.realmSet$arabicTitle(chapter.realmGet$arabicTitle());
        chapter2.realmSet$englishTitle(chapter.realmGet$englishTitle());
        chapter2.realmSet$titleCodePoint(chapter.realmGet$titleCodePoint());
        chapter2.realmSet$searchableText(chapter.realmGet$searchableText());
        chapter2.realmSet$searchableKeywords(chapter.realmGet$searchableKeywords());
        int i12 = i10 + 1;
        chapter2.realmSet$header1405(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createDetachedCopy(chapter.realmGet$header1405(), i12, i11, map));
        chapter2.realmSet$header1441(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createDetachedCopy(chapter.realmGet$header1441(), i12, i11, map));
        if (i10 == i11) {
            chapter2.realmSet$verses(null);
            return chapter2;
        }
        RealmList<Verse> realmListRealmGet$verses = chapter.realmGet$verses();
        RealmList<Verse> realmList = new RealmList<>();
        chapter2.realmSet$verses(realmList);
        int size = realmListRealmGet$verses.size();
        for (int i13 = 0; i13 < size; i13++) {
            realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy(realmListRealmGet$verses.get(i13), i12, i11, map));
        }
        return chapter2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 12, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "identifier", realmFieldType, true, false, true);
        builder.addPersistedProperty(NO_ALIAS, "number", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "isMeccan", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        builder.addPersistedProperty(NO_ALIAS, "title", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "arabicTitle", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "englishTitle", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "titleCodePoint", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "searchableText", realmFieldType2, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "searchableKeywords", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        builder.addPersistedLinkProperty(NO_ALIAS, "header1405", realmFieldType3, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "header1441", realmFieldType3, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "verses", RealmFieldType.LIST, com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public static Chapter createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_quran_ChapterRealmProxy com_ayah_dao_realm_model_quran_chapterrealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            Table table = realm.getTable(Chapter.class);
            long jFindFirstLong = !jSONObject.isNull("identifier") ? table.findFirstLong(((ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class)).identifierColKey, jSONObject.getLong("identifier")) : -1L;
            if (jFindFirstLong != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstLong);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Chapter.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_quran_chapterrealmproxy = new com_ayah_dao_realm_model_quran_ChapterRealmProxy();
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
                com_ayah_dao_realm_model_quran_chapterrealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_quran_chapterrealmproxy = null;
        }
        if (com_ayah_dao_realm_model_quran_chapterrealmproxy == null) {
            if (jSONObject.has("header1405")) {
                arrayList.add("header1405");
            }
            if (jSONObject.has("header1441")) {
                arrayList.add("header1441");
            }
            if (jSONObject.has("verses")) {
                arrayList.add("verses");
            }
            if (!jSONObject.has("identifier")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'identifier'.");
            }
            com_ayah_dao_realm_model_quran_chapterrealmproxy = jSONObject.isNull("identifier") ? (com_ayah_dao_realm_model_quran_ChapterRealmProxy) realm.createObjectInternal(Chapter.class, null, true, arrayList) : (com_ayah_dao_realm_model_quran_ChapterRealmProxy) realm.createObjectInternal(Chapter.class, Long.valueOf(jSONObject.getLong("identifier")), true, arrayList);
        }
        if (jSONObject.has("number")) {
            if (jSONObject.isNull("number")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
            }
            com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$number(jSONObject.getLong("number"));
        }
        if (jSONObject.has("isMeccan")) {
            if (jSONObject.isNull("isMeccan")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isMeccan' to null.");
            }
            com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$isMeccan(jSONObject.getBoolean("isMeccan"));
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$title(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("arabicTitle")) {
            if (jSONObject.isNull("arabicTitle")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$arabicTitle(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$arabicTitle(jSONObject.getString("arabicTitle"));
            }
        }
        if (jSONObject.has("englishTitle")) {
            if (jSONObject.isNull("englishTitle")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$englishTitle(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$englishTitle(jSONObject.getString("englishTitle"));
            }
        }
        if (jSONObject.has("titleCodePoint")) {
            if (jSONObject.isNull("titleCodePoint")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$titleCodePoint(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$titleCodePoint(jSONObject.getString("titleCodePoint"));
            }
        }
        if (jSONObject.has("searchableText")) {
            if (jSONObject.isNull("searchableText")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$searchableText(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$searchableText(jSONObject.getString("searchableText"));
            }
        }
        if (jSONObject.has("searchableKeywords")) {
            if (jSONObject.isNull("searchableKeywords")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$searchableKeywords(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$searchableKeywords(jSONObject.getString("searchableKeywords"));
            }
        }
        if (jSONObject.has("header1405")) {
            if (jSONObject.isNull("header1405")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$header1405(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$header1405(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("header1405"), z10));
            }
        }
        if (jSONObject.has("header1441")) {
            if (jSONObject.isNull("header1441")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$header1441(null);
            } else {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$header1441(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("header1441"), z10));
            }
        }
        if (jSONObject.has("verses")) {
            if (jSONObject.isNull("verses")) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmSet$verses(null);
                return com_ayah_dao_realm_model_quran_chapterrealmproxy;
            }
            com_ayah_dao_realm_model_quran_chapterrealmproxy.realmGet$verses().clear();
            JSONArray jSONArray = jSONObject.getJSONArray("verses");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                com_ayah_dao_realm_model_quran_chapterrealmproxy.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
            }
        }
        return com_ayah_dao_realm_model_quran_chapterrealmproxy;
    }

    @TargetApi(11)
    public static Chapter createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Chapter chapter = new Chapter();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("identifier")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'identifier' to null.");
                }
                chapter.realmSet$identifier(jsonReader.nextLong());
                z10 = true;
            } else if (strNextName.equals("number")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'number' to null.");
                }
                chapter.realmSet$number(jsonReader.nextLong());
            } else if (strNextName.equals("isMeccan")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'isMeccan' to null.");
                }
                chapter.realmSet$isMeccan(jsonReader.nextBoolean());
            } else if (strNextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    chapter.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    chapter.realmSet$title(null);
                }
            } else if (strNextName.equals("arabicTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    chapter.realmSet$arabicTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    chapter.realmSet$arabicTitle(null);
                }
            } else if (strNextName.equals("englishTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    chapter.realmSet$englishTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    chapter.realmSet$englishTitle(null);
                }
            } else if (strNextName.equals("titleCodePoint")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    chapter.realmSet$titleCodePoint(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    chapter.realmSet$titleCodePoint(null);
                }
            } else if (strNextName.equals("searchableText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    chapter.realmSet$searchableText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    chapter.realmSet$searchableText(null);
                }
            } else if (strNextName.equals("searchableKeywords")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    chapter.realmSet$searchableKeywords(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    chapter.realmSet$searchableKeywords(null);
                }
            } else if (strNextName.equals("header1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    chapter.realmSet$header1405(null);
                } else {
                    chapter.realmSet$header1405(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("header1441")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    chapter.realmSet$header1441(null);
                } else {
                    chapter.realmSet$header1441(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!strNextName.equals("verses")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                chapter.realmSet$verses(null);
            } else {
                chapter.realmSet$verses(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    chapter.realmGet$verses().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Chapter) realm.copyToRealmOrUpdate(chapter, new ImportFlag[0]);
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
    public static long insert(Realm realm, Chapter chapter, Map<RealmModel, Long> map) {
        if ((chapter instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Chapter.class);
        long nativePtr = table.getNativePtr();
        ChapterColumnInfo chapterColumnInfo = (ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class);
        long j = chapterColumnInfo.identifierColKey;
        Long lValueOf = Long.valueOf(chapter.realmGet$identifier());
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, chapter.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(chapter.realmGet$identifier()));
        } else {
            Table.throwDuplicatePrimaryKeyException(lValueOf);
        }
        map.put(chapter, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, chapterColumnInfo.numberColKey, jNativeFindFirstInt, chapter.realmGet$number(), false);
        Table.nativeSetBoolean(nativePtr, chapterColumnInfo.isMeccanColKey, jNativeFindFirstInt, chapter.realmGet$isMeccan(), false);
        String strRealmGet$title = chapter.realmGet$title();
        if (strRealmGet$title != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.titleColKey, jNativeFindFirstInt, strRealmGet$title, false);
        }
        String strRealmGet$arabicTitle = chapter.realmGet$arabicTitle();
        if (strRealmGet$arabicTitle != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
        }
        String strRealmGet$englishTitle = chapter.realmGet$englishTitle();
        if (strRealmGet$englishTitle != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
        }
        String strRealmGet$titleCodePoint = chapter.realmGet$titleCodePoint();
        if (strRealmGet$titleCodePoint != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.titleCodePointColKey, jNativeFindFirstInt, strRealmGet$titleCodePoint, false);
        }
        String strRealmGet$searchableText = chapter.realmGet$searchableText();
        if (strRealmGet$searchableText != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
        }
        String strRealmGet$searchableKeywords = chapter.realmGet$searchableKeywords();
        if (strRealmGet$searchableKeywords != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.searchableKeywordsColKey, jNativeFindFirstInt, strRealmGet$searchableKeywords, false);
        }
        ChapterHeader chapterHeaderRealmGet$header1405 = chapter.realmGet$header1405();
        if (chapterHeaderRealmGet$header1405 != null) {
            Long lValueOf2 = map.get(chapterHeaderRealmGet$header1405);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeaderRealmGet$header1405, map));
            }
            Table.nativeSetLink(nativePtr, chapterColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        }
        ChapterHeader chapterHeaderRealmGet$header1441 = chapter.realmGet$header1441();
        if (chapterHeaderRealmGet$header1441 != null) {
            Long lValueOf3 = map.get(chapterHeaderRealmGet$header1441);
            if (lValueOf3 == null) {
                lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeaderRealmGet$header1441, map));
            }
            Table.nativeSetLink(nativePtr, chapterColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
        }
        RealmList<Verse> realmListRealmGet$verses = chapter.realmGet$verses();
        if (realmListRealmGet$verses != null) {
            OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), chapterColumnInfo.versesColKey);
            for (Verse verse : realmListRealmGet$verses) {
                Long lValueOf4 = map.get(verse);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                }
                osList.addRow(lValueOf4.longValue());
            }
        }
        return jNativeFindFirstInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Chapter chapter, Map<RealmModel, Long> map) {
        if ((chapter instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Chapter.class);
        long nativePtr = table.getNativePtr();
        ChapterColumnInfo chapterColumnInfo = (ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class);
        long j = chapterColumnInfo.identifierColKey;
        chapter.realmGet$identifier();
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, chapter.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(chapter.realmGet$identifier()));
        }
        map.put(chapter, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, chapterColumnInfo.numberColKey, jNativeFindFirstInt, chapter.realmGet$number(), false);
        Table.nativeSetBoolean(nativePtr, chapterColumnInfo.isMeccanColKey, jNativeFindFirstInt, chapter.realmGet$isMeccan(), false);
        String strRealmGet$title = chapter.realmGet$title();
        if (strRealmGet$title != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.titleColKey, jNativeFindFirstInt, strRealmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, chapterColumnInfo.titleColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$arabicTitle = chapter.realmGet$arabicTitle();
        if (strRealmGet$arabicTitle != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, chapterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$englishTitle = chapter.realmGet$englishTitle();
        if (strRealmGet$englishTitle != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, chapterColumnInfo.englishTitleColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$titleCodePoint = chapter.realmGet$titleCodePoint();
        if (strRealmGet$titleCodePoint != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.titleCodePointColKey, jNativeFindFirstInt, strRealmGet$titleCodePoint, false);
        } else {
            Table.nativeSetNull(nativePtr, chapterColumnInfo.titleCodePointColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$searchableText = chapter.realmGet$searchableText();
        if (strRealmGet$searchableText != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
        } else {
            Table.nativeSetNull(nativePtr, chapterColumnInfo.searchableTextColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$searchableKeywords = chapter.realmGet$searchableKeywords();
        if (strRealmGet$searchableKeywords != null) {
            Table.nativeSetString(nativePtr, chapterColumnInfo.searchableKeywordsColKey, jNativeFindFirstInt, strRealmGet$searchableKeywords, false);
        } else {
            Table.nativeSetNull(nativePtr, chapterColumnInfo.searchableKeywordsColKey, jNativeFindFirstInt, false);
        }
        ChapterHeader chapterHeaderRealmGet$header1405 = chapter.realmGet$header1405();
        if (chapterHeaderRealmGet$header1405 != null) {
            Long lValueOf = map.get(chapterHeaderRealmGet$header1405);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeaderRealmGet$header1405, map));
            }
            Table.nativeSetLink(nativePtr, chapterColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, chapterColumnInfo.header1405ColKey, jNativeFindFirstInt);
        }
        ChapterHeader chapterHeaderRealmGet$header1441 = chapter.realmGet$header1441();
        if (chapterHeaderRealmGet$header1441 != null) {
            Long lValueOf2 = map.get(chapterHeaderRealmGet$header1441);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeaderRealmGet$header1441, map));
            }
            Table.nativeSetLink(nativePtr, chapterColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, chapterColumnInfo.header1441ColKey, jNativeFindFirstInt);
        }
        OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), chapterColumnInfo.versesColKey);
        RealmList<Verse> realmListRealmGet$verses = chapter.realmGet$verses();
        if (realmListRealmGet$verses == null || realmListRealmGet$verses.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$verses != null) {
                for (Verse verse : realmListRealmGet$verses) {
                    Long lValueOf3 = map.get(verse);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                    }
                    osList.addRow(lValueOf3.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$verses.size();
            int iQ = 0;
            while (iQ < size) {
                Verse verse2 = realmListRealmGet$verses.get(iQ);
                Long lValueOf4 = map.get(verse2);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                }
                iQ = p.q(lValueOf4, osList, iQ, iQ, 1);
            }
        }
        return jNativeFindFirstInt;
    }

    public static com_ayah_dao_realm_model_quran_ChapterRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Chapter.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_ChapterRealmProxy com_ayah_dao_realm_model_quran_chapterrealmproxy = new com_ayah_dao_realm_model_quran_ChapterRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_chapterrealmproxy;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:13:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:19:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:28:0x0111  */
    public static Chapter update(Realm realm, ChapterColumnInfo chapterColumnInfo, Chapter chapter, Chapter chapter2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        ChapterHeader chapterHeaderRealmGet$header1441;
        ChapterHeader chapterHeader;
        RealmList<Verse> realmListRealmGet$verses;
        RealmList realmList;
        int i10;
        Verse verse;
        Verse verse2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Chapter.class), set);
        osObjectBuilder.addInteger(chapterColumnInfo.identifierColKey, Long.valueOf(chapter2.realmGet$identifier()));
        osObjectBuilder.addInteger(chapterColumnInfo.numberColKey, Long.valueOf(chapter2.realmGet$number()));
        osObjectBuilder.addBoolean(chapterColumnInfo.isMeccanColKey, Boolean.valueOf(chapter2.realmGet$isMeccan()));
        osObjectBuilder.addString(chapterColumnInfo.titleColKey, chapter2.realmGet$title());
        osObjectBuilder.addString(chapterColumnInfo.arabicTitleColKey, chapter2.realmGet$arabicTitle());
        osObjectBuilder.addString(chapterColumnInfo.englishTitleColKey, chapter2.realmGet$englishTitle());
        osObjectBuilder.addString(chapterColumnInfo.titleCodePointColKey, chapter2.realmGet$titleCodePoint());
        osObjectBuilder.addString(chapterColumnInfo.searchableTextColKey, chapter2.realmGet$searchableText());
        osObjectBuilder.addString(chapterColumnInfo.searchableKeywordsColKey, chapter2.realmGet$searchableKeywords());
        ChapterHeader chapterHeaderRealmGet$header1405 = chapter2.realmGet$header1405();
        if (chapterHeaderRealmGet$header1405 != null) {
            ChapterHeader chapterHeader2 = (ChapterHeader) map.get(chapterHeaderRealmGet$header1405);
            if (chapterHeader2 != null) {
                osObjectBuilder.addObject(chapterColumnInfo.header1405ColKey, chapterHeader2);
            } else {
                realm2 = realm;
                map2 = map;
                set2 = set;
                osObjectBuilder.addObject(chapterColumnInfo.header1405ColKey, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class), chapterHeaderRealmGet$header1405, true, map2, set2));
            }
            chapterHeaderRealmGet$header1441 = chapter2.realmGet$header1441();
            if (chapterHeaderRealmGet$header1441 == null) {
                osObjectBuilder.addNull(chapterColumnInfo.header1441ColKey);
            } else {
                chapterHeader = (ChapterHeader) map2.get(chapterHeaderRealmGet$header1441);
                if (chapterHeader != null) {
                    osObjectBuilder.addObject(chapterColumnInfo.header1441ColKey, chapterHeader);
                } else {
                    osObjectBuilder.addObject(chapterColumnInfo.header1441ColKey, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeaderRealmGet$header1441, true, map2, set2));
                }
            }
            realmListRealmGet$verses = chapter2.realmGet$verses();
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
                osObjectBuilder.addObjectList(chapterColumnInfo.versesColKey, realmList);
            } else {
                osObjectBuilder.addObjectList(chapterColumnInfo.versesColKey, new RealmList());
            }
            osObjectBuilder.updateExistingTopLevelObject();
            return chapter;
        }
        osObjectBuilder.addNull(chapterColumnInfo.header1405ColKey);
        realm2 = realm;
        map2 = map;
        set2 = set;
        chapterHeaderRealmGet$header1441 = chapter2.realmGet$header1441();
        if (chapterHeaderRealmGet$header1441 == null) {
            osObjectBuilder.addNull(chapterColumnInfo.header1441ColKey);
        } else {
            chapterHeader = (ChapterHeader) map2.get(chapterHeaderRealmGet$header1441);
            if (chapterHeader != null) {
                osObjectBuilder.addObject(chapterColumnInfo.header1441ColKey, chapterHeader);
            } else {
                osObjectBuilder.addObject(chapterColumnInfo.header1441ColKey, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeaderRealmGet$header1441, true, map2, set2));
            }
        }
        realmListRealmGet$verses = chapter2.realmGet$verses();
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
            osObjectBuilder.addObjectList(chapterColumnInfo.versesColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(chapterColumnInfo.versesColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return chapter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_ChapterRealmProxy com_ayah_dao_realm_model_quran_chapterrealmproxy = (com_ayah_dao_realm_model_quran_ChapterRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_chapterrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_chapterrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_chapterrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (ChapterColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Chapter> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$arabicTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.arabicTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$englishTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.englishTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public ChapterHeader realmGet$header1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.header1405ColKey)) {
            return null;
        }
        return (ChapterHeader) this.proxyState.getRealm$realm().get(ChapterHeader.class, this.proxyState.getRow$realm().getLink(this.columnInfo.header1405ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public ChapterHeader realmGet$header1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.header1441ColKey)) {
            return null;
        }
        return (ChapterHeader) this.proxyState.getRealm$realm().get(ChapterHeader.class, this.proxyState.getRow$realm().getLink(this.columnInfo.header1441ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public long realmGet$identifier() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.identifierColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public boolean realmGet$isMeccan() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isMeccanColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public long realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.numberColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$searchableKeywords() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.searchableKeywordsColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$searchableText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.searchableTextColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public String realmGet$titleCodePoint() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleCodePointColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$header1405(ChapterHeader chapterHeader) {
        ChapterHeader chapterHeader2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (chapterHeader == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.header1405ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(chapterHeader);
                this.proxyState.getRow$realm().setLink(this.columnInfo.header1405ColKey, ((RealmObjectProxy) chapterHeader).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("header1405")) {
                chapterHeader2 = chapterHeader;
                return;
            }
            if (chapterHeader != 0) {
                boolean zIsManaged = RealmObject.isManaged(chapterHeader);
                chapterHeader2 = chapterHeader;
                if (!zIsManaged) {
                    chapterHeader2 = (ChapterHeader) realm.copyToRealm(chapterHeader, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (chapterHeader2 == 0) {
                row$realm.nullifyLink(this.columnInfo.header1405ColKey);
            } else {
                this.proxyState.checkValidObject(chapterHeader2);
                row$realm.getTable().setLink(this.columnInfo.header1405ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) chapterHeader2), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$header1441(ChapterHeader chapterHeader) {
        ChapterHeader chapterHeader2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (chapterHeader == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.header1441ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(chapterHeader);
                this.proxyState.getRow$realm().setLink(this.columnInfo.header1441ColKey, ((RealmObjectProxy) chapterHeader).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("header1441")) {
                chapterHeader2 = chapterHeader;
                return;
            }
            if (chapterHeader != 0) {
                boolean zIsManaged = RealmObject.isManaged(chapterHeader);
                chapterHeader2 = chapterHeader;
                if (!zIsManaged) {
                    chapterHeader2 = (ChapterHeader) realm.copyToRealm(chapterHeader, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (chapterHeader2 == 0) {
                row$realm.nullifyLink(this.columnInfo.header1441ColKey);
            } else {
                this.proxyState.checkValidObject(chapterHeader2);
                row$realm.getTable().setLink(this.columnInfo.header1441ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) chapterHeader2), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$identifier(long j) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'identifier' cannot be changed after object was created.");
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$isMeccan(boolean z10) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isMeccanColKey, z10);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isMeccanColKey, row$realm.getObjectKey(), z10, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$number(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.numberColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.numberColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$searchableKeywords(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'searchableKeywords' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.searchableKeywordsColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'searchableKeywords' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.searchableKeywordsColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$searchableText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'searchableText' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.searchableTextColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'searchableText' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.searchableTextColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.titleColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.titleColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
    public void realmSet$titleCodePoint(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'titleCodePoint' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.titleCodePointColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'titleCodePoint' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.titleCodePointColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Chapter, io.realm.com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface
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
        StringBuilder sb = new StringBuilder("Chapter = proxy[{identifier:");
        sb.append(realmGet$identifier());
        sb.append("},{number:");
        sb.append(realmGet$number());
        sb.append("},{isMeccan:");
        sb.append(realmGet$isMeccan());
        sb.append("},{title:");
        sb.append(realmGet$title());
        sb.append("},{arabicTitle:");
        sb.append(realmGet$arabicTitle());
        sb.append("},{englishTitle:");
        sb.append(realmGet$englishTitle());
        sb.append("},{titleCodePoint:");
        sb.append(realmGet$titleCodePoint());
        sb.append("},{searchableText:");
        sb.append(realmGet$searchableText());
        sb.append("},{searchableKeywords:");
        sb.append(realmGet$searchableKeywords());
        sb.append("},{header1405:");
        sb.append(realmGet$header1405() != null ? com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{header1441:");
        sb.append(realmGet$header1441() != null ? com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{verses:RealmList<Verse>[");
        sb.append(realmGet$verses().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Chapter.class);
        long nativePtr = table.getNativePtr();
        ChapterColumnInfo chapterColumnInfo = (ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class);
        long j = chapterColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Chapter chapter = (Chapter) it.next();
            if (!map.containsKey(chapter)) {
                if ((chapter instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapter)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(chapter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Long lValueOf = Long.valueOf(chapter.realmGet$identifier());
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, chapter.realmGet$identifier());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(chapter.realmGet$identifier()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(lValueOf);
                }
                map.put(chapter, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, chapterColumnInfo.numberColKey, jNativeFindFirstInt, chapter.realmGet$number(), false);
                Table.nativeSetBoolean(nativePtr, chapterColumnInfo.isMeccanColKey, jNativeFindFirstInt, chapter.realmGet$isMeccan(), false);
                String strRealmGet$title = chapter.realmGet$title();
                if (strRealmGet$title != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.titleColKey, jNativeFindFirstInt, strRealmGet$title, false);
                }
                String strRealmGet$arabicTitle = chapter.realmGet$arabicTitle();
                if (strRealmGet$arabicTitle != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
                }
                String strRealmGet$englishTitle = chapter.realmGet$englishTitle();
                if (strRealmGet$englishTitle != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
                }
                String strRealmGet$titleCodePoint = chapter.realmGet$titleCodePoint();
                if (strRealmGet$titleCodePoint != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.titleCodePointColKey, jNativeFindFirstInt, strRealmGet$titleCodePoint, false);
                }
                String strRealmGet$searchableText = chapter.realmGet$searchableText();
                if (strRealmGet$searchableText != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
                }
                String strRealmGet$searchableKeywords = chapter.realmGet$searchableKeywords();
                if (strRealmGet$searchableKeywords != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.searchableKeywordsColKey, jNativeFindFirstInt, strRealmGet$searchableKeywords, false);
                }
                ChapterHeader chapterHeaderRealmGet$header1405 = chapter.realmGet$header1405();
                if (chapterHeaderRealmGet$header1405 != null) {
                    Long lValueOf2 = map.get(chapterHeaderRealmGet$header1405);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeaderRealmGet$header1405, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                }
                ChapterHeader chapterHeaderRealmGet$header1441 = chapter.realmGet$header1441();
                if (chapterHeaderRealmGet$header1441 != null) {
                    Long lValueOf3 = map.get(chapterHeaderRealmGet$header1441);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeaderRealmGet$header1441, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
                }
                RealmList<Verse> realmListRealmGet$verses = chapter.realmGet$verses();
                if (realmListRealmGet$verses != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), chapterColumnInfo.versesColKey);
                    for (Verse verse : realmListRealmGet$verses) {
                        Long lValueOf4 = map.get(verse);
                        if (lValueOf4 == null) {
                            lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                        }
                        osList.addRow(lValueOf4.longValue());
                    }
                }
                j = j10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Chapter.class);
        long nativePtr = table.getNativePtr();
        ChapterColumnInfo chapterColumnInfo = (ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class);
        long j = chapterColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Chapter chapter = (Chapter) it.next();
            if (!map.containsKey(chapter)) {
                if ((chapter instanceof RealmObjectProxy) && !RealmObject.isFrozen(chapter)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chapter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(chapter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                chapter.realmGet$identifier();
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, chapter.realmGet$identifier());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(chapter.realmGet$identifier()));
                }
                map.put(chapter, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, chapterColumnInfo.numberColKey, jNativeFindFirstInt, chapter.realmGet$number(), false);
                Table.nativeSetBoolean(nativePtr, chapterColumnInfo.isMeccanColKey, jNativeFindFirstInt, chapter.realmGet$isMeccan(), false);
                String strRealmGet$title = chapter.realmGet$title();
                if (strRealmGet$title != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.titleColKey, jNativeFindFirstInt, strRealmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, chapterColumnInfo.titleColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$arabicTitle = chapter.realmGet$arabicTitle();
                if (strRealmGet$arabicTitle != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, strRealmGet$arabicTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, chapterColumnInfo.arabicTitleColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$englishTitle = chapter.realmGet$englishTitle();
                if (strRealmGet$englishTitle != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.englishTitleColKey, jNativeFindFirstInt, strRealmGet$englishTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, chapterColumnInfo.englishTitleColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$titleCodePoint = chapter.realmGet$titleCodePoint();
                if (strRealmGet$titleCodePoint != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.titleCodePointColKey, jNativeFindFirstInt, strRealmGet$titleCodePoint, false);
                } else {
                    Table.nativeSetNull(nativePtr, chapterColumnInfo.titleCodePointColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$searchableText = chapter.realmGet$searchableText();
                if (strRealmGet$searchableText != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
                } else {
                    Table.nativeSetNull(nativePtr, chapterColumnInfo.searchableTextColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$searchableKeywords = chapter.realmGet$searchableKeywords();
                if (strRealmGet$searchableKeywords != null) {
                    Table.nativeSetString(nativePtr, chapterColumnInfo.searchableKeywordsColKey, jNativeFindFirstInt, strRealmGet$searchableKeywords, false);
                } else {
                    Table.nativeSetNull(nativePtr, chapterColumnInfo.searchableKeywordsColKey, jNativeFindFirstInt, false);
                }
                ChapterHeader chapterHeaderRealmGet$header1405 = chapter.realmGet$header1405();
                if (chapterHeaderRealmGet$header1405 != null) {
                    Long lValueOf = map.get(chapterHeaderRealmGet$header1405);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeaderRealmGet$header1405, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, chapterColumnInfo.header1405ColKey, jNativeFindFirstInt);
                }
                ChapterHeader chapterHeaderRealmGet$header1441 = chapter.realmGet$header1441();
                if (chapterHeaderRealmGet$header1441 != null) {
                    Long lValueOf2 = map.get(chapterHeaderRealmGet$header1441);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeaderRealmGet$header1441, map));
                    }
                    Table.nativeSetLink(nativePtr, chapterColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, chapterColumnInfo.header1441ColKey, jNativeFindFirstInt);
                }
                OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), chapterColumnInfo.versesColKey);
                RealmList<Verse> realmListRealmGet$verses = chapter.realmGet$verses();
                if (realmListRealmGet$verses != null && realmListRealmGet$verses.size() == osList.size()) {
                    int size = realmListRealmGet$verses.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Verse verse = realmListRealmGet$verses.get(iQ);
                        Long lValueOf3 = map.get(verse);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                        }
                        iQ = p.q(lValueOf3, osList, iQ, iQ, 1);
                    }
                } else {
                    osList.removeAll();
                    if (realmListRealmGet$verses != null) {
                        for (Verse verse2 : realmListRealmGet$verses) {
                            Long lValueOf4 = map.get(verse2);
                            if (lValueOf4 == null) {
                                lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                            }
                            osList.addRow(lValueOf4.longValue());
                        }
                    }
                }
                j = j10;
            }
        }
    }
}
