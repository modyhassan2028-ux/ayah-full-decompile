package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Section;
import com.ayah.dao.realm.model.quran.Verse;
import com.ayah.dao.realm.model.quran.VerseHighlight;
import com.ayah.dao.realm.model.quran.VerseMarker;
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
public class com_ayah_dao_realm_model_quran_VerseRealmProxy extends Verse implements RealmObjectProxy, com_ayah_dao_realm_model_quran_VerseRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VerseColumnInfo columnInfo;
    private RealmList<VerseHighlight> highlights1405RealmList;
    private RealmList<VerseHighlight> highlights1441RealmList;
    private ProxyState<Verse> proxyState;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Verse";
    }

    public static final class VerseColumnInfo extends ColumnInfo {
        long chapterColKey;
        long hafsSmartTextColKey;
        long highlights1405ColKey;
        long highlights1441ColKey;
        long humanReadableIDColKey;
        long marker1405ColKey;
        long marker1441ColKey;
        long numberColKey;
        long page1405ColKey;
        long page1441ColKey;
        long partColKey;
        long quarterColKey;
        long searchableTextColKey;
        long sectionColKey;
        long textColKey;
        long textWithoutTashkilColKey;
        long uthmanicHafsTextColKey;
        long verseIDColKey;

        public VerseColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(18);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.verseIDColKey = addColumnDetails("verseID", "verseID", objectSchemaInfo);
            this.humanReadableIDColKey = addColumnDetails("humanReadableID", "humanReadableID", objectSchemaInfo);
            this.numberColKey = addColumnDetails("number", "number", objectSchemaInfo);
            this.textColKey = addColumnDetails("text", "text", objectSchemaInfo);
            this.textWithoutTashkilColKey = addColumnDetails("textWithoutTashkil", "textWithoutTashkil", objectSchemaInfo);
            this.uthmanicHafsTextColKey = addColumnDetails("uthmanicHafsText", "uthmanicHafsText", objectSchemaInfo);
            this.hafsSmartTextColKey = addColumnDetails("hafsSmartText", "hafsSmartText", objectSchemaInfo);
            this.searchableTextColKey = addColumnDetails("searchableText", "searchableText", objectSchemaInfo);
            this.partColKey = addColumnDetails("part", "part", objectSchemaInfo);
            this.quarterColKey = addColumnDetails("quarter", "quarter", objectSchemaInfo);
            this.sectionColKey = addColumnDetails("section", "section", objectSchemaInfo);
            this.page1405ColKey = addColumnDetails("page1405", "page1405", objectSchemaInfo);
            this.page1441ColKey = addColumnDetails("page1441", "page1441", objectSchemaInfo);
            this.chapterColKey = addColumnDetails("chapter", "chapter", objectSchemaInfo);
            this.marker1405ColKey = addColumnDetails("marker1405", "marker1405", objectSchemaInfo);
            this.marker1441ColKey = addColumnDetails("marker1441", "marker1441", objectSchemaInfo);
            this.highlights1405ColKey = addColumnDetails("highlights1405", "highlights1405", objectSchemaInfo);
            this.highlights1441ColKey = addColumnDetails("highlights1441", "highlights1441", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new VerseColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VerseColumnInfo verseColumnInfo = (VerseColumnInfo) columnInfo;
            VerseColumnInfo verseColumnInfo2 = (VerseColumnInfo) columnInfo2;
            verseColumnInfo2.verseIDColKey = verseColumnInfo.verseIDColKey;
            verseColumnInfo2.humanReadableIDColKey = verseColumnInfo.humanReadableIDColKey;
            verseColumnInfo2.numberColKey = verseColumnInfo.numberColKey;
            verseColumnInfo2.textColKey = verseColumnInfo.textColKey;
            verseColumnInfo2.textWithoutTashkilColKey = verseColumnInfo.textWithoutTashkilColKey;
            verseColumnInfo2.uthmanicHafsTextColKey = verseColumnInfo.uthmanicHafsTextColKey;
            verseColumnInfo2.hafsSmartTextColKey = verseColumnInfo.hafsSmartTextColKey;
            verseColumnInfo2.searchableTextColKey = verseColumnInfo.searchableTextColKey;
            verseColumnInfo2.partColKey = verseColumnInfo.partColKey;
            verseColumnInfo2.quarterColKey = verseColumnInfo.quarterColKey;
            verseColumnInfo2.sectionColKey = verseColumnInfo.sectionColKey;
            verseColumnInfo2.page1405ColKey = verseColumnInfo.page1405ColKey;
            verseColumnInfo2.page1441ColKey = verseColumnInfo.page1441ColKey;
            verseColumnInfo2.chapterColKey = verseColumnInfo.chapterColKey;
            verseColumnInfo2.marker1405ColKey = verseColumnInfo.marker1405ColKey;
            verseColumnInfo2.marker1441ColKey = verseColumnInfo.marker1441ColKey;
            verseColumnInfo2.highlights1405ColKey = verseColumnInfo.highlights1405ColKey;
            verseColumnInfo2.highlights1441ColKey = verseColumnInfo.highlights1441ColKey;
        }

        public VerseColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_VerseRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0100  */
    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX WARN: Code duplicated, block: B:37:0x0128  */
    /* JADX WARN: Code duplicated, block: B:38:0x012c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0134  */
    /* JADX WARN: Code duplicated, block: B:41:0x0138  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    /* JADX WARN: Code duplicated, block: B:45:0x0154  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Code duplicated, block: B:51:0x017c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0180  */
    /* JADX WARN: Code duplicated, block: B:54:0x0188  */
    /* JADX WARN: Code duplicated, block: B:55:0x018c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x020a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0217  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Code duplicated, block: B:81:0x022a  */
    public static Verse copy(Realm realm, VerseColumnInfo verseColumnInfo, Verse verse, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        Quarter quarterRealmGet$quarter;
        Quarter quarter;
        Section sectionRealmGet$section;
        Section section;
        Page pageRealmGet$page1405;
        Page page;
        Page pageRealmGet$page1441;
        Page page2;
        Chapter chapterRealmGet$chapter;
        Chapter chapter;
        VerseMarker verseMarkerRealmGet$marker1405;
        VerseMarker verseMarker;
        VerseMarker verseMarkerRealmGet$marker1441;
        VerseMarker verseMarker2;
        RealmList<VerseHighlight> realmListRealmGet$highlights1405;
        int i10;
        RealmList<VerseHighlight> realmListRealmGet$highlights1441;
        RealmList<VerseHighlight> realmListRealmGet$highlights1442;
        VerseHighlight verseHighlight;
        VerseHighlight verseHighlight2;
        RealmList<VerseHighlight> realmListRealmGet$highlights1406;
        int i11;
        VerseHighlight verseHighlight3;
        VerseHighlight verseHighlight4;
        RealmObjectProxy realmObjectProxy = map.get(verse);
        if (realmObjectProxy != null) {
            return (Verse) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Verse.class), set);
        osObjectBuilder.addInteger(verseColumnInfo.verseIDColKey, Long.valueOf(verse.realmGet$verseID()));
        osObjectBuilder.addString(verseColumnInfo.humanReadableIDColKey, verse.realmGet$humanReadableID());
        osObjectBuilder.addInteger(verseColumnInfo.numberColKey, Long.valueOf(verse.realmGet$number()));
        osObjectBuilder.addString(verseColumnInfo.textColKey, verse.realmGet$text());
        osObjectBuilder.addString(verseColumnInfo.textWithoutTashkilColKey, verse.realmGet$textWithoutTashkil());
        osObjectBuilder.addString(verseColumnInfo.uthmanicHafsTextColKey, verse.realmGet$uthmanicHafsText());
        osObjectBuilder.addString(verseColumnInfo.hafsSmartTextColKey, verse.realmGet$hafsSmartText());
        osObjectBuilder.addString(verseColumnInfo.searchableTextColKey, verse.realmGet$searchableText());
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(verse, com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance);
        Part partRealmGet$part = verse.realmGet$part();
        if (partRealmGet$part != null) {
            Part part = (Part) map.get(partRealmGet$part);
            if (part != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$part(part);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PartRealmProxy.PartColumnInfo) realm.getSchema().getColumnInfo(Part.class), partRealmGet$part, z11, map3, set2));
                map2 = map3;
            }
            quarterRealmGet$quarter = verse.realmGet$quarter();
            if (quarterRealmGet$quarter == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$quarter(null);
            } else {
                quarter = (Quarter) map2.get(quarterRealmGet$quarter);
                if (quarter != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$quarter(quarter);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm2.getSchema().getColumnInfo(Quarter.class), quarterRealmGet$quarter, z11, map2, set2));
                }
            }
            sectionRealmGet$section = verse.realmGet$section();
            if (sectionRealmGet$section == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$section(null);
            } else {
                section = (Section) map2.get(sectionRealmGet$section);
                if (section != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$section(section);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$section(com_ayah_dao_realm_model_quran_SectionRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_SectionRealmProxy.SectionColumnInfo) realm2.getSchema().getColumnInfo(Section.class), sectionRealmGet$section, z11, map2, set2));
                }
            }
            pageRealmGet$page1405 = verse.realmGet$page1405();
            if (pageRealmGet$page1405 == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1405(null);
            } else {
                page = (Page) map2.get(pageRealmGet$page1405);
                if (page != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1405(page);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1405(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1405, z11, map2, set2));
                }
            }
            pageRealmGet$page1441 = verse.realmGet$page1441();
            if (pageRealmGet$page1441 == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1441(null);
            } else {
                page2 = (Page) map2.get(pageRealmGet$page1441);
                if (page2 != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1441(page2);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1441(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1441, z11, map2, set2));
                }
            }
            chapterRealmGet$chapter = verse.realmGet$chapter();
            if (chapterRealmGet$chapter == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$chapter(null);
            } else {
                chapter = (Chapter) map2.get(chapterRealmGet$chapter);
                if (chapter != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$chapter(chapter);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm2.getSchema().getColumnInfo(Chapter.class), chapterRealmGet$chapter, z11, map2, set2));
                }
            }
            verseMarkerRealmGet$marker1405 = verse.realmGet$marker1405();
            if (verseMarkerRealmGet$marker1405 == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1405(null);
            } else {
                verseMarker = (VerseMarker) map2.get(verseMarkerRealmGet$marker1405);
                if (verseMarker != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1405(verseMarker);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1405(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1405, z11, map2, set2));
                }
            }
            verseMarkerRealmGet$marker1441 = verse.realmGet$marker1441();
            if (verseMarkerRealmGet$marker1441 == null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1441(null);
            } else {
                verseMarker2 = (VerseMarker) map2.get(verseMarkerRealmGet$marker1441);
                if (verseMarker2 != null) {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1441(verseMarker2);
                } else {
                    com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1441(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1441, z11, map2, set2));
                }
            }
            realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
            if (realmListRealmGet$highlights1405 != null) {
                realmListRealmGet$highlights1406 = com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmGet$highlights1405();
                realmListRealmGet$highlights1406.clear();
                for (i11 = 0; i11 < realmListRealmGet$highlights1405.size(); i11++) {
                    verseHighlight3 = realmListRealmGet$highlights1405.get(i11);
                    verseHighlight4 = (VerseHighlight) map2.get(verseHighlight3);
                    if (verseHighlight4 != null) {
                        realmListRealmGet$highlights1406.add(verseHighlight4);
                    } else {
                        realmListRealmGet$highlights1406.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight3, z11, map2, set2));
                    }
                }
            }
            realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
            if (realmListRealmGet$highlights1441 != null) {
                realmListRealmGet$highlights1442 = com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmGet$highlights1441();
                realmListRealmGet$highlights1442.clear();
                for (i10 = 0; i10 < realmListRealmGet$highlights1441.size(); i10++) {
                    verseHighlight = realmListRealmGet$highlights1441.get(i10);
                    verseHighlight2 = (VerseHighlight) map2.get(verseHighlight);
                    if (verseHighlight2 != null) {
                        realmListRealmGet$highlights1442.add(verseHighlight2);
                    } else {
                        realmListRealmGet$highlights1442.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight, z11, map2, set2));
                    }
                }
            }
            return com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$part(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        quarterRealmGet$quarter = verse.realmGet$quarter();
        if (quarterRealmGet$quarter == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$quarter(null);
        } else {
            quarter = (Quarter) map2.get(quarterRealmGet$quarter);
            if (quarter != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$quarter(quarter);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm2.getSchema().getColumnInfo(Quarter.class), quarterRealmGet$quarter, z11, map2, set2));
            }
        }
        sectionRealmGet$section = verse.realmGet$section();
        if (sectionRealmGet$section == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$section(null);
        } else {
            section = (Section) map2.get(sectionRealmGet$section);
            if (section != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$section(section);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$section(com_ayah_dao_realm_model_quran_SectionRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_SectionRealmProxy.SectionColumnInfo) realm2.getSchema().getColumnInfo(Section.class), sectionRealmGet$section, z11, map2, set2));
            }
        }
        pageRealmGet$page1405 = verse.realmGet$page1405();
        if (pageRealmGet$page1405 == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1405(null);
        } else {
            page = (Page) map2.get(pageRealmGet$page1405);
            if (page != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1405(page);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1405(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1405, z11, map2, set2));
            }
        }
        pageRealmGet$page1441 = verse.realmGet$page1441();
        if (pageRealmGet$page1441 == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1441(null);
        } else {
            page2 = (Page) map2.get(pageRealmGet$page1441);
            if (page2 != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1441(page2);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$page1441(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1441, z11, map2, set2));
            }
        }
        chapterRealmGet$chapter = verse.realmGet$chapter();
        if (chapterRealmGet$chapter == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$chapter(null);
        } else {
            chapter = (Chapter) map2.get(chapterRealmGet$chapter);
            if (chapter != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$chapter(chapter);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm2.getSchema().getColumnInfo(Chapter.class), chapterRealmGet$chapter, z11, map2, set2));
            }
        }
        verseMarkerRealmGet$marker1405 = verse.realmGet$marker1405();
        if (verseMarkerRealmGet$marker1405 == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1405(null);
        } else {
            verseMarker = (VerseMarker) map2.get(verseMarkerRealmGet$marker1405);
            if (verseMarker != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1405(verseMarker);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1405(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1405, z11, map2, set2));
            }
        }
        verseMarkerRealmGet$marker1441 = verse.realmGet$marker1441();
        if (verseMarkerRealmGet$marker1441 == null) {
            com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1441(null);
        } else {
            verseMarker2 = (VerseMarker) map2.get(verseMarkerRealmGet$marker1441);
            if (verseMarker2 != null) {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1441(verseMarker2);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmSet$marker1441(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1441, z11, map2, set2));
            }
        }
        realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
        if (realmListRealmGet$highlights1405 != null) {
            realmListRealmGet$highlights1406 = com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmGet$highlights1405();
            realmListRealmGet$highlights1406.clear();
            while (i11 < realmListRealmGet$highlights1405.size()) {
                verseHighlight3 = realmListRealmGet$highlights1405.get(i11);
                verseHighlight4 = (VerseHighlight) map2.get(verseHighlight3);
                if (verseHighlight4 != null) {
                    realmListRealmGet$highlights1406.add(verseHighlight4);
                } else {
                    realmListRealmGet$highlights1406.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight3, z11, map2, set2));
                }
            }
        }
        realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
        if (realmListRealmGet$highlights1441 != null) {
            realmListRealmGet$highlights1442 = com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance.realmGet$highlights1441();
            realmListRealmGet$highlights1442.clear();
            while (i10 < realmListRealmGet$highlights1441.size()) {
                verseHighlight = realmListRealmGet$highlights1441.get(i10);
                verseHighlight2 = (VerseHighlight) map2.get(verseHighlight);
                if (verseHighlight2 != null) {
                    realmListRealmGet$highlights1442.add(verseHighlight2);
                } else {
                    realmListRealmGet$highlights1442.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight, z11, map2, set2));
                }
            }
        }
        return com_ayah_dao_realm_model_quran_verserealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Verse copyOrUpdate(Realm realm, VerseColumnInfo verseColumnInfo, Verse verse, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((verse instanceof RealmObjectProxy) && !RealmObject.isFrozen(verse)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verse;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return verse;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(verse);
        if (realmObjectProxy2 != null) {
            return (Verse) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Verse.class);
            long jFindFirstLong = table.findFirstLong(verseColumnInfo.verseIDColKey, verse.realmGet$verseID());
            if (jFindFirstLong == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstLong), verseColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_quran_verserealmproxy = new com_ayah_dao_realm_model_quran_VerseRealmProxy();
                    map.put(verse, com_ayah_dao_realm_model_quran_verserealmproxy);
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
        return z11 ? update(realm, verseColumnInfo, com_ayah_dao_realm_model_quran_verserealmproxy, verse, map, set) : copy(realm, verseColumnInfo, verse, z10, map, set);
    }

    public static VerseColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VerseColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Verse createDetachedCopy(Verse verse, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Verse verse2;
        if (i10 > i11 || verse == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(verse);
        if (cacheData == null) {
            verse2 = new Verse();
            map.put(verse, new RealmObjectProxy.CacheData<>(i10, verse2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Verse) cacheData.object;
            }
            Verse verse3 = (Verse) cacheData.object;
            cacheData.minDepth = i10;
            verse2 = verse3;
        }
        verse2.realmSet$verseID(verse.realmGet$verseID());
        verse2.realmSet$humanReadableID(verse.realmGet$humanReadableID());
        verse2.realmSet$number(verse.realmGet$number());
        verse2.realmSet$text(verse.realmGet$text());
        verse2.realmSet$textWithoutTashkil(verse.realmGet$textWithoutTashkil());
        verse2.realmSet$uthmanicHafsText(verse.realmGet$uthmanicHafsText());
        verse2.realmSet$hafsSmartText(verse.realmGet$hafsSmartText());
        verse2.realmSet$searchableText(verse.realmGet$searchableText());
        int i12 = i10 + 1;
        verse2.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createDetachedCopy(verse.realmGet$part(), i12, i11, map));
        verse2.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createDetachedCopy(verse.realmGet$quarter(), i12, i11, map));
        verse2.realmSet$section(com_ayah_dao_realm_model_quran_SectionRealmProxy.createDetachedCopy(verse.realmGet$section(), i12, i11, map));
        verse2.realmSet$page1405(com_ayah_dao_realm_model_quran_PageRealmProxy.createDetachedCopy(verse.realmGet$page1405(), i12, i11, map));
        verse2.realmSet$page1441(com_ayah_dao_realm_model_quran_PageRealmProxy.createDetachedCopy(verse.realmGet$page1441(), i12, i11, map));
        verse2.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createDetachedCopy(verse.realmGet$chapter(), i12, i11, map));
        verse2.realmSet$marker1405(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createDetachedCopy(verse.realmGet$marker1405(), i12, i11, map));
        verse2.realmSet$marker1441(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createDetachedCopy(verse.realmGet$marker1441(), i12, i11, map));
        if (i10 == i11) {
            verse2.realmSet$highlights1405(null);
        } else {
            RealmList<VerseHighlight> realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
            RealmList<VerseHighlight> realmList = new RealmList<>();
            verse2.realmSet$highlights1405(realmList);
            int size = realmListRealmGet$highlights1405.size();
            for (int i13 = 0; i13 < size; i13++) {
                realmList.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createDetachedCopy(realmListRealmGet$highlights1405.get(i13), i12, i11, map));
            }
        }
        if (i10 == i11) {
            verse2.realmSet$highlights1441(null);
            return verse2;
        }
        RealmList<VerseHighlight> realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
        RealmList<VerseHighlight> realmList2 = new RealmList<>();
        verse2.realmSet$highlights1441(realmList2);
        int size2 = realmListRealmGet$highlights1441.size();
        for (int i14 = 0; i14 < size2; i14++) {
            realmList2.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createDetachedCopy(realmListRealmGet$highlights1441.get(i14), i12, i11, map));
        }
        return verse2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 18, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "verseID", realmFieldType, true, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        builder.addPersistedProperty(NO_ALIAS, "humanReadableID", realmFieldType2, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "number", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "text", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "textWithoutTashkil", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "uthmanicHafsText", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "hafsSmartText", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "searchableText", realmFieldType2, false, true, true);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        builder.addPersistedLinkProperty(NO_ALIAS, "part", realmFieldType3, com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "quarter", realmFieldType3, com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "section", realmFieldType3, com_ayah_dao_realm_model_quran_SectionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "page1405", realmFieldType3, com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "page1441", realmFieldType3, com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "chapter", realmFieldType3, com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "marker1405", realmFieldType3, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "marker1441", realmFieldType3, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        RealmFieldType realmFieldType4 = RealmFieldType.LIST;
        builder.addPersistedLinkProperty(NO_ALIAS, "highlights1405", realmFieldType4, com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "highlights1441", realmFieldType4, com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.ayah.dao.realm.model.quran.Chapter, com.ayah.dao.realm.model.quran.Page, com.ayah.dao.realm.model.quran.Part, com.ayah.dao.realm.model.quran.Quarter, com.ayah.dao.realm.model.quran.Section, com.ayah.dao.realm.model.quran.VerseMarker, io.realm.RealmList, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Verse createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxy;
        String str;
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxy2;
        ?? r10;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(10);
        if (z10) {
            Table table = realm.getTable(Verse.class);
            long jFindFirstLong = !jSONObject.isNull("verseID") ? table.findFirstLong(((VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class)).verseIDColKey, jSONObject.getLong("verseID")) : -1L;
            if (jFindFirstLong != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstLong);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Verse.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_quran_verserealmproxy = new com_ayah_dao_realm_model_quran_VerseRealmProxy();
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
                com_ayah_dao_realm_model_quran_verserealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_quran_verserealmproxy = null;
        }
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxy3 = com_ayah_dao_realm_model_quran_verserealmproxy;
        if (com_ayah_dao_realm_model_quran_verserealmproxy3 == null) {
            if (jSONObject.has("part")) {
                arrayList.add("part");
            }
            if (jSONObject.has("quarter")) {
                arrayList.add("quarter");
            }
            if (jSONObject.has("section")) {
                arrayList.add("section");
            }
            if (jSONObject.has("page1405")) {
                arrayList.add("page1405");
            }
            if (jSONObject.has("page1441")) {
                arrayList.add("page1441");
            }
            if (jSONObject.has("chapter")) {
                arrayList.add("chapter");
            }
            if (jSONObject.has("marker1405")) {
                arrayList.add("marker1405");
            }
            if (jSONObject.has("marker1441")) {
                arrayList.add("marker1441");
            }
            if (jSONObject.has("highlights1405")) {
                arrayList.add("highlights1405");
            }
            if (jSONObject.has("highlights1441")) {
                arrayList.add("highlights1441");
            }
            if (!jSONObject.has("verseID")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'verseID'.");
            }
            str = "highlights1441";
            com_ayah_dao_realm_model_quran_verserealmproxy2 = jSONObject.isNull("verseID") ? (com_ayah_dao_realm_model_quran_VerseRealmProxy) realm.createObjectInternal(Verse.class, null, true, arrayList) : (com_ayah_dao_realm_model_quran_VerseRealmProxy) realm.createObjectInternal(Verse.class, Long.valueOf(jSONObject.getLong("verseID")), true, arrayList);
        } else {
            str = "highlights1441";
            com_ayah_dao_realm_model_quran_verserealmproxy2 = com_ayah_dao_realm_model_quran_verserealmproxy3;
        }
        if (jSONObject.has("humanReadableID")) {
            if (jSONObject.isNull("humanReadableID")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$humanReadableID(null);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$humanReadableID(jSONObject.getString("humanReadableID"));
            }
        }
        if (jSONObject.has("number")) {
            if (jSONObject.isNull("number")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
            }
            com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$number(jSONObject.getLong("number"));
        }
        if (!jSONObject.has("text")) {
            r10 = 0;
        } else if (jSONObject.isNull("text")) {
            r10 = 0;
            com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$text(null);
        } else {
            r10 = 0;
            com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$text(jSONObject.getString("text"));
        }
        if (jSONObject.has("textWithoutTashkil")) {
            if (jSONObject.isNull("textWithoutTashkil")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$textWithoutTashkil(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$textWithoutTashkil(jSONObject.getString("textWithoutTashkil"));
            }
        }
        if (jSONObject.has("uthmanicHafsText")) {
            if (jSONObject.isNull("uthmanicHafsText")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$uthmanicHafsText(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$uthmanicHafsText(jSONObject.getString("uthmanicHafsText"));
            }
        }
        if (jSONObject.has("hafsSmartText")) {
            if (jSONObject.isNull("hafsSmartText")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$hafsSmartText(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$hafsSmartText(jSONObject.getString("hafsSmartText"));
            }
        }
        if (jSONObject.has("searchableText")) {
            if (jSONObject.isNull("searchableText")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$searchableText(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$searchableText(jSONObject.getString("searchableText"));
            }
        }
        if (jSONObject.has("part")) {
            if (jSONObject.isNull("part")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$part(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("part"), z10));
            }
        }
        if (jSONObject.has("quarter")) {
            if (jSONObject.isNull("quarter")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$quarter(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("quarter"), z10));
            }
        }
        if (jSONObject.has("section")) {
            if (jSONObject.isNull("section")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$section(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$section(com_ayah_dao_realm_model_quran_SectionRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("section"), z10));
            }
        }
        if (jSONObject.has("page1405")) {
            if (jSONObject.isNull("page1405")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$page1405(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$page1405(com_ayah_dao_realm_model_quran_PageRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("page1405"), z10));
            }
        }
        if (jSONObject.has("page1441")) {
            if (jSONObject.isNull("page1441")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$page1441(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$page1441(com_ayah_dao_realm_model_quran_PageRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("page1441"), z10));
            }
        }
        if (jSONObject.has("chapter")) {
            if (jSONObject.isNull("chapter")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$chapter(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("chapter"), z10));
            }
        }
        if (jSONObject.has("marker1405")) {
            if (jSONObject.isNull("marker1405")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$marker1405(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$marker1405(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("marker1405"), z10));
            }
        }
        if (jSONObject.has("marker1441")) {
            if (jSONObject.isNull("marker1441")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$marker1441(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$marker1441(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("marker1441"), z10));
            }
        }
        if (jSONObject.has("highlights1405")) {
            if (jSONObject.isNull("highlights1405")) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$highlights1405(r10);
            } else {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmGet$highlights1405().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("highlights1405");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    com_ayah_dao_realm_model_quran_verserealmproxy2.realmGet$highlights1405().add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
                }
            }
        }
        String str2 = str;
        if (jSONObject.has(str2)) {
            if (jSONObject.isNull(str2)) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmSet$highlights1441(null);
                return com_ayah_dao_realm_model_quran_verserealmproxy2;
            }
            com_ayah_dao_realm_model_quran_verserealmproxy2.realmGet$highlights1441().clear();
            JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                com_ayah_dao_realm_model_quran_verserealmproxy2.realmGet$highlights1441().add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray2.getJSONObject(i11), z10));
            }
        }
        return com_ayah_dao_realm_model_quran_verserealmproxy2;
    }

    @TargetApi(11)
    public static Verse createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Verse verse = new Verse();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("verseID")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'verseID' to null.");
                }
                verse.realmSet$verseID(jsonReader.nextLong());
                z10 = true;
            } else if (strNextName.equals("humanReadableID")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verse.realmSet$humanReadableID(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verse.realmSet$humanReadableID(null);
                }
            } else if (strNextName.equals("number")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'number' to null.");
                }
                verse.realmSet$number(jsonReader.nextLong());
            } else if (strNextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verse.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verse.realmSet$text(null);
                }
            } else if (strNextName.equals("textWithoutTashkil")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verse.realmSet$textWithoutTashkil(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verse.realmSet$textWithoutTashkil(null);
                }
            } else if (strNextName.equals("uthmanicHafsText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verse.realmSet$uthmanicHafsText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verse.realmSet$uthmanicHafsText(null);
                }
            } else if (strNextName.equals("hafsSmartText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verse.realmSet$hafsSmartText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verse.realmSet$hafsSmartText(null);
                }
            } else if (strNextName.equals("searchableText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    verse.realmSet$searchableText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    verse.realmSet$searchableText(null);
                }
            } else if (strNextName.equals("part")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$part(null);
                } else {
                    verse.realmSet$part(com_ayah_dao_realm_model_quran_PartRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("quarter")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$quarter(null);
                } else {
                    verse.realmSet$quarter(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("section")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$section(null);
                } else {
                    verse.realmSet$section(com_ayah_dao_realm_model_quran_SectionRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("page1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$page1405(null);
                } else {
                    verse.realmSet$page1405(com_ayah_dao_realm_model_quran_PageRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("page1441")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$page1441(null);
                } else {
                    verse.realmSet$page1441(com_ayah_dao_realm_model_quran_PageRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("chapter")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$chapter(null);
                } else {
                    verse.realmSet$chapter(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("marker1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$marker1405(null);
                } else {
                    verse.realmSet$marker1405(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("marker1441")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$marker1441(null);
                } else {
                    verse.realmSet$marker1441(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("highlights1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    verse.realmSet$highlights1405(null);
                } else {
                    verse.realmSet$highlights1405(new RealmList<>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        verse.realmGet$highlights1405().add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!strNextName.equals("highlights1441")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                verse.realmSet$highlights1441(null);
            } else {
                verse.realmSet$highlights1441(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    verse.realmGet$highlights1441().add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Verse) realm.copyToRealmOrUpdate(verse, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'verseID'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, Verse verse, Map<RealmModel, Long> map) {
        if ((verse instanceof RealmObjectProxy) && !RealmObject.isFrozen(verse)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verse;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Verse.class);
        long nativePtr = table.getNativePtr();
        VerseColumnInfo verseColumnInfo = (VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class);
        long j = verseColumnInfo.verseIDColKey;
        Long lValueOf = Long.valueOf(verse.realmGet$verseID());
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, verse.realmGet$verseID());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(verse.realmGet$verseID()));
        } else {
            Table.throwDuplicatePrimaryKeyException(lValueOf);
        }
        map.put(verse, Long.valueOf(jNativeFindFirstInt));
        String strRealmGet$humanReadableID = verse.realmGet$humanReadableID();
        if (strRealmGet$humanReadableID != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.humanReadableIDColKey, jNativeFindFirstInt, strRealmGet$humanReadableID, false);
        }
        Table.nativeSetLong(nativePtr, verseColumnInfo.numberColKey, jNativeFindFirstInt, verse.realmGet$number(), false);
        String strRealmGet$text = verse.realmGet$text();
        if (strRealmGet$text != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.textColKey, jNativeFindFirstInt, strRealmGet$text, false);
        }
        String strRealmGet$textWithoutTashkil = verse.realmGet$textWithoutTashkil();
        if (strRealmGet$textWithoutTashkil != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.textWithoutTashkilColKey, jNativeFindFirstInt, strRealmGet$textWithoutTashkil, false);
        }
        String strRealmGet$uthmanicHafsText = verse.realmGet$uthmanicHafsText();
        if (strRealmGet$uthmanicHafsText != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.uthmanicHafsTextColKey, jNativeFindFirstInt, strRealmGet$uthmanicHafsText, false);
        }
        String strRealmGet$hafsSmartText = verse.realmGet$hafsSmartText();
        if (strRealmGet$hafsSmartText != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.hafsSmartTextColKey, jNativeFindFirstInt, strRealmGet$hafsSmartText, false);
        }
        String strRealmGet$searchableText = verse.realmGet$searchableText();
        if (strRealmGet$searchableText != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
        }
        Part partRealmGet$part = verse.realmGet$part();
        if (partRealmGet$part != null) {
            Long lValueOf2 = map.get(partRealmGet$part);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, partRealmGet$part, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.partColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        }
        Quarter quarterRealmGet$quarter = verse.realmGet$quarter();
        if (quarterRealmGet$quarter != null) {
            Long lValueOf3 = map.get(quarterRealmGet$quarter);
            if (lValueOf3 == null) {
                lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, quarterRealmGet$quarter, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.quarterColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
        }
        Section sectionRealmGet$section = verse.realmGet$section();
        if (sectionRealmGet$section != null) {
            Long lValueOf4 = map.get(sectionRealmGet$section);
            if (lValueOf4 == null) {
                lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_SectionRealmProxy.insert(realm, sectionRealmGet$section, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.sectionColKey, jNativeFindFirstInt, lValueOf4.longValue(), false);
        }
        Page pageRealmGet$page1405 = verse.realmGet$page1405();
        if (pageRealmGet$page1405 != null) {
            Long lValueOf5 = map.get(pageRealmGet$page1405);
            if (lValueOf5 == null) {
                lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, pageRealmGet$page1405, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.page1405ColKey, jNativeFindFirstInt, lValueOf5.longValue(), false);
        }
        Page pageRealmGet$page1441 = verse.realmGet$page1441();
        if (pageRealmGet$page1441 != null) {
            Long lValueOf6 = map.get(pageRealmGet$page1441);
            if (lValueOf6 == null) {
                lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, pageRealmGet$page1441, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.page1441ColKey, jNativeFindFirstInt, lValueOf6.longValue(), false);
        }
        Chapter chapterRealmGet$chapter = verse.realmGet$chapter();
        if (chapterRealmGet$chapter != null) {
            Long lValueOf7 = map.get(chapterRealmGet$chapter);
            if (lValueOf7 == null) {
                lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapterRealmGet$chapter, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.chapterColKey, jNativeFindFirstInt, lValueOf7.longValue(), false);
        }
        VerseMarker verseMarkerRealmGet$marker1405 = verse.realmGet$marker1405();
        if (verseMarkerRealmGet$marker1405 != null) {
            Long lValueOf8 = map.get(verseMarkerRealmGet$marker1405);
            if (lValueOf8 == null) {
                lValueOf8 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, verseMarkerRealmGet$marker1405, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.marker1405ColKey, jNativeFindFirstInt, lValueOf8.longValue(), false);
        }
        VerseMarker verseMarkerRealmGet$marker1441 = verse.realmGet$marker1441();
        if (verseMarkerRealmGet$marker1441 != null) {
            Long lValueOf9 = map.get(verseMarkerRealmGet$marker1441);
            if (lValueOf9 == null) {
                lValueOf9 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, verseMarkerRealmGet$marker1441, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.marker1441ColKey, jNativeFindFirstInt, lValueOf9.longValue(), false);
        }
        RealmList<VerseHighlight> realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
        if (realmListRealmGet$highlights1405 != null) {
            OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1405ColKey);
            for (VerseHighlight verseHighlight : realmListRealmGet$highlights1405) {
                Long lValueOf10 = map.get(verseHighlight);
                if (lValueOf10 == null) {
                    lValueOf10 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, verseHighlight, map));
                }
                osList.addRow(lValueOf10.longValue());
            }
        }
        RealmList<VerseHighlight> realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
        if (realmListRealmGet$highlights1441 != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1441ColKey);
            for (VerseHighlight verseHighlight2 : realmListRealmGet$highlights1441) {
                Long lValueOf11 = map.get(verseHighlight2);
                if (lValueOf11 == null) {
                    lValueOf11 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, verseHighlight2, map));
                }
                osList2.addRow(lValueOf11.longValue());
            }
        }
        return jNativeFindFirstInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Verse verse, Map<RealmModel, Long> map) {
        if ((verse instanceof RealmObjectProxy) && !RealmObject.isFrozen(verse)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verse;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Verse.class);
        long nativePtr = table.getNativePtr();
        VerseColumnInfo verseColumnInfo = (VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class);
        long j = verseColumnInfo.verseIDColKey;
        verse.realmGet$verseID();
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, verse.realmGet$verseID());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(verse.realmGet$verseID()));
        }
        map.put(verse, Long.valueOf(jNativeFindFirstInt));
        String strRealmGet$humanReadableID = verse.realmGet$humanReadableID();
        if (strRealmGet$humanReadableID != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.humanReadableIDColKey, jNativeFindFirstInt, strRealmGet$humanReadableID, false);
        } else {
            Table.nativeSetNull(nativePtr, verseColumnInfo.humanReadableIDColKey, jNativeFindFirstInt, false);
        }
        Table.nativeSetLong(nativePtr, verseColumnInfo.numberColKey, jNativeFindFirstInt, verse.realmGet$number(), false);
        String strRealmGet$text = verse.realmGet$text();
        if (strRealmGet$text != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.textColKey, jNativeFindFirstInt, strRealmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, verseColumnInfo.textColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$textWithoutTashkil = verse.realmGet$textWithoutTashkil();
        if (strRealmGet$textWithoutTashkil != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.textWithoutTashkilColKey, jNativeFindFirstInt, strRealmGet$textWithoutTashkil, false);
        } else {
            Table.nativeSetNull(nativePtr, verseColumnInfo.textWithoutTashkilColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$uthmanicHafsText = verse.realmGet$uthmanicHafsText();
        if (strRealmGet$uthmanicHafsText != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.uthmanicHafsTextColKey, jNativeFindFirstInt, strRealmGet$uthmanicHafsText, false);
        } else {
            Table.nativeSetNull(nativePtr, verseColumnInfo.uthmanicHafsTextColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$hafsSmartText = verse.realmGet$hafsSmartText();
        if (strRealmGet$hafsSmartText != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.hafsSmartTextColKey, jNativeFindFirstInt, strRealmGet$hafsSmartText, false);
        } else {
            Table.nativeSetNull(nativePtr, verseColumnInfo.hafsSmartTextColKey, jNativeFindFirstInt, false);
        }
        String strRealmGet$searchableText = verse.realmGet$searchableText();
        if (strRealmGet$searchableText != null) {
            Table.nativeSetString(nativePtr, verseColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
        } else {
            Table.nativeSetNull(nativePtr, verseColumnInfo.searchableTextColKey, jNativeFindFirstInt, false);
        }
        Part partRealmGet$part = verse.realmGet$part();
        if (partRealmGet$part != null) {
            Long lValueOf = map.get(partRealmGet$part);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, partRealmGet$part, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.partColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.partColKey, jNativeFindFirstInt);
        }
        Quarter quarterRealmGet$quarter = verse.realmGet$quarter();
        if (quarterRealmGet$quarter != null) {
            Long lValueOf2 = map.get(quarterRealmGet$quarter);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarterRealmGet$quarter, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.quarterColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.quarterColKey, jNativeFindFirstInt);
        }
        Section sectionRealmGet$section = verse.realmGet$section();
        if (sectionRealmGet$section != null) {
            Long lValueOf3 = map.get(sectionRealmGet$section);
            if (lValueOf3 == null) {
                lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_SectionRealmProxy.insertOrUpdate(realm, sectionRealmGet$section, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.sectionColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.sectionColKey, jNativeFindFirstInt);
        }
        Page pageRealmGet$page1405 = verse.realmGet$page1405();
        if (pageRealmGet$page1405 != null) {
            Long lValueOf4 = map.get(pageRealmGet$page1405);
            if (lValueOf4 == null) {
                lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, pageRealmGet$page1405, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.page1405ColKey, jNativeFindFirstInt, lValueOf4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.page1405ColKey, jNativeFindFirstInt);
        }
        Page pageRealmGet$page1441 = verse.realmGet$page1441();
        if (pageRealmGet$page1441 != null) {
            Long lValueOf5 = map.get(pageRealmGet$page1441);
            if (lValueOf5 == null) {
                lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, pageRealmGet$page1441, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.page1441ColKey, jNativeFindFirstInt, lValueOf5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.page1441ColKey, jNativeFindFirstInt);
        }
        Chapter chapterRealmGet$chapter = verse.realmGet$chapter();
        if (chapterRealmGet$chapter != null) {
            Long lValueOf6 = map.get(chapterRealmGet$chapter);
            if (lValueOf6 == null) {
                lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapterRealmGet$chapter, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.chapterColKey, jNativeFindFirstInt, lValueOf6.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.chapterColKey, jNativeFindFirstInt);
        }
        VerseMarker verseMarkerRealmGet$marker1405 = verse.realmGet$marker1405();
        if (verseMarkerRealmGet$marker1405 != null) {
            Long lValueOf7 = map.get(verseMarkerRealmGet$marker1405);
            if (lValueOf7 == null) {
                lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, verseMarkerRealmGet$marker1405, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.marker1405ColKey, jNativeFindFirstInt, lValueOf7.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.marker1405ColKey, jNativeFindFirstInt);
        }
        VerseMarker verseMarkerRealmGet$marker1441 = verse.realmGet$marker1441();
        if (verseMarkerRealmGet$marker1441 != null) {
            Long lValueOf8 = map.get(verseMarkerRealmGet$marker1441);
            if (lValueOf8 == null) {
                lValueOf8 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, verseMarkerRealmGet$marker1441, map));
            }
            Table.nativeSetLink(nativePtr, verseColumnInfo.marker1441ColKey, jNativeFindFirstInt, lValueOf8.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, verseColumnInfo.marker1441ColKey, jNativeFindFirstInt);
        }
        OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1405ColKey);
        RealmList<VerseHighlight> realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
        int i10 = 1;
        int iQ = 0;
        if (realmListRealmGet$highlights1405 == null || realmListRealmGet$highlights1405.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$highlights1405 != null) {
                for (VerseHighlight verseHighlight : realmListRealmGet$highlights1405) {
                    Long lValueOf9 = map.get(verseHighlight);
                    if (lValueOf9 == null) {
                        lValueOf9 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight, map));
                    }
                    osList.addRow(lValueOf9.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$highlights1405.size();
            int iQ2 = 0;
            while (iQ2 < size) {
                VerseHighlight verseHighlight2 = realmListRealmGet$highlights1405.get(iQ2);
                Long lValueOf10 = map.get(verseHighlight2);
                if (lValueOf10 == null) {
                    lValueOf10 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight2, map));
                }
                iQ2 = p.q(lValueOf10, osList, iQ2, iQ2, 1);
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1441ColKey);
        RealmList<VerseHighlight> realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
        if (realmListRealmGet$highlights1441 == null || realmListRealmGet$highlights1441.size() != osList2.size()) {
            osList2.removeAll();
            if (realmListRealmGet$highlights1441 != null) {
                for (VerseHighlight verseHighlight3 : realmListRealmGet$highlights1441) {
                    Long lValueOf11 = map.get(verseHighlight3);
                    if (lValueOf11 == null) {
                        lValueOf11 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight3, map));
                    }
                    osList2.addRow(lValueOf11.longValue());
                }
            }
        } else {
            int size2 = realmListRealmGet$highlights1441.size();
            while (iQ < size2) {
                VerseHighlight verseHighlight4 = realmListRealmGet$highlights1441.get(iQ);
                Long lValueOf12 = map.get(verseHighlight4);
                if (lValueOf12 == null) {
                    lValueOf12 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight4, map));
                }
                int i11 = i10;
                iQ = p.q(lValueOf12, osList2, iQ, iQ, i11);
                i10 = i11;
            }
        }
        return jNativeFindFirstInt;
    }

    public static com_ayah_dao_realm_model_quran_VerseRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Verse.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxy = new com_ayah_dao_realm_model_quran_VerseRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_verserealmproxy;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0098  */
    /* JADX WARN: Code duplicated, block: B:13:0x009e  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:16:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:27:0x0102  */
    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0110  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0131  */
    /* JADX WARN: Code duplicated, block: B:36:0x0139  */
    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:40:0x015a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0160  */
    /* JADX WARN: Code duplicated, block: B:43:0x0168  */
    /* JADX WARN: Code duplicated, block: B:44:0x016e  */
    /* JADX WARN: Code duplicated, block: B:47:0x018d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193  */
    /* JADX WARN: Code duplicated, block: B:50:0x019b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0209  */
    /* JADX WARN: Code duplicated, block: B:67:0x020d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0229  */
    /* JADX WARN: Code duplicated, block: B:73:0x0239  */
    /* JADX WARN: Code duplicated, block: B:76:0x0244  */
    /* JADX WARN: Code duplicated, block: B:78:0x0253  */
    /* JADX WARN: Code duplicated, block: B:79:0x0257  */
    /* JADX WARN: Code duplicated, block: B:82:0x0273  */
    public static Verse update(Realm realm, VerseColumnInfo verseColumnInfo, Verse verse, Verse verse2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        Quarter quarterRealmGet$quarter;
        Quarter quarter;
        Section sectionRealmGet$section;
        Section section;
        Page pageRealmGet$page1405;
        Page page;
        Page pageRealmGet$page1441;
        Page page2;
        Chapter chapterRealmGet$chapter;
        Chapter chapter;
        VerseMarker verseMarkerRealmGet$marker1405;
        VerseMarker verseMarker;
        VerseMarker verseMarkerRealmGet$marker1441;
        VerseMarker verseMarker2;
        RealmList<VerseHighlight> realmListRealmGet$highlights1405;
        int i10;
        RealmList<VerseHighlight> realmListRealmGet$highlights1441;
        RealmList realmList;
        VerseHighlight verseHighlight;
        VerseHighlight verseHighlight2;
        RealmList realmList2;
        int i11;
        VerseHighlight verseHighlight3;
        VerseHighlight verseHighlight4;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Verse.class), set);
        osObjectBuilder.addInteger(verseColumnInfo.verseIDColKey, Long.valueOf(verse2.realmGet$verseID()));
        osObjectBuilder.addString(verseColumnInfo.humanReadableIDColKey, verse2.realmGet$humanReadableID());
        osObjectBuilder.addInteger(verseColumnInfo.numberColKey, Long.valueOf(verse2.realmGet$number()));
        osObjectBuilder.addString(verseColumnInfo.textColKey, verse2.realmGet$text());
        osObjectBuilder.addString(verseColumnInfo.textWithoutTashkilColKey, verse2.realmGet$textWithoutTashkil());
        osObjectBuilder.addString(verseColumnInfo.uthmanicHafsTextColKey, verse2.realmGet$uthmanicHafsText());
        osObjectBuilder.addString(verseColumnInfo.hafsSmartTextColKey, verse2.realmGet$hafsSmartText());
        osObjectBuilder.addString(verseColumnInfo.searchableTextColKey, verse2.realmGet$searchableText());
        Part partRealmGet$part = verse2.realmGet$part();
        if (partRealmGet$part != null) {
            Part part = (Part) map.get(partRealmGet$part);
            if (part != null) {
                osObjectBuilder.addObject(verseColumnInfo.partColKey, part);
            } else {
                realm2 = realm;
                map2 = map;
                set2 = set;
                osObjectBuilder.addObject(verseColumnInfo.partColKey, com_ayah_dao_realm_model_quran_PartRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PartRealmProxy.PartColumnInfo) realm.getSchema().getColumnInfo(Part.class), partRealmGet$part, true, map2, set2));
            }
            quarterRealmGet$quarter = verse2.realmGet$quarter();
            if (quarterRealmGet$quarter == null) {
                osObjectBuilder.addNull(verseColumnInfo.quarterColKey);
            } else {
                quarter = (Quarter) map2.get(quarterRealmGet$quarter);
                if (quarter != null) {
                    osObjectBuilder.addObject(verseColumnInfo.quarterColKey, quarter);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.quarterColKey, com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm2.getSchema().getColumnInfo(Quarter.class), quarterRealmGet$quarter, true, map2, set2));
                }
            }
            sectionRealmGet$section = verse2.realmGet$section();
            if (sectionRealmGet$section == null) {
                osObjectBuilder.addNull(verseColumnInfo.sectionColKey);
            } else {
                section = (Section) map2.get(sectionRealmGet$section);
                if (section != null) {
                    osObjectBuilder.addObject(verseColumnInfo.sectionColKey, section);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.sectionColKey, com_ayah_dao_realm_model_quran_SectionRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_SectionRealmProxy.SectionColumnInfo) realm2.getSchema().getColumnInfo(Section.class), sectionRealmGet$section, true, map2, set2));
                }
            }
            pageRealmGet$page1405 = verse2.realmGet$page1405();
            if (pageRealmGet$page1405 == null) {
                osObjectBuilder.addNull(verseColumnInfo.page1405ColKey);
            } else {
                page = (Page) map2.get(pageRealmGet$page1405);
                if (page != null) {
                    osObjectBuilder.addObject(verseColumnInfo.page1405ColKey, page);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.page1405ColKey, com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1405, true, map2, set2));
                }
            }
            pageRealmGet$page1441 = verse2.realmGet$page1441();
            if (pageRealmGet$page1441 == null) {
                osObjectBuilder.addNull(verseColumnInfo.page1441ColKey);
            } else {
                page2 = (Page) map2.get(pageRealmGet$page1441);
                if (page2 != null) {
                    osObjectBuilder.addObject(verseColumnInfo.page1441ColKey, page2);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.page1441ColKey, com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1441, true, map2, set2));
                }
            }
            chapterRealmGet$chapter = verse2.realmGet$chapter();
            if (chapterRealmGet$chapter == null) {
                osObjectBuilder.addNull(verseColumnInfo.chapterColKey);
            } else {
                chapter = (Chapter) map2.get(chapterRealmGet$chapter);
                if (chapter != null) {
                    osObjectBuilder.addObject(verseColumnInfo.chapterColKey, chapter);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.chapterColKey, com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm2.getSchema().getColumnInfo(Chapter.class), chapterRealmGet$chapter, true, map2, set2));
                }
            }
            verseMarkerRealmGet$marker1405 = verse2.realmGet$marker1405();
            if (verseMarkerRealmGet$marker1405 == null) {
                osObjectBuilder.addNull(verseColumnInfo.marker1405ColKey);
            } else {
                verseMarker = (VerseMarker) map2.get(verseMarkerRealmGet$marker1405);
                if (verseMarker != null) {
                    osObjectBuilder.addObject(verseColumnInfo.marker1405ColKey, verseMarker);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.marker1405ColKey, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1405, true, map2, set2));
                }
            }
            verseMarkerRealmGet$marker1441 = verse2.realmGet$marker1441();
            if (verseMarkerRealmGet$marker1441 == null) {
                osObjectBuilder.addNull(verseColumnInfo.marker1441ColKey);
            } else {
                verseMarker2 = (VerseMarker) map2.get(verseMarkerRealmGet$marker1441);
                if (verseMarker2 != null) {
                    osObjectBuilder.addObject(verseColumnInfo.marker1441ColKey, verseMarker2);
                } else {
                    osObjectBuilder.addObject(verseColumnInfo.marker1441ColKey, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1441, true, map2, set2));
                }
            }
            realmListRealmGet$highlights1405 = verse2.realmGet$highlights1405();
            if (realmListRealmGet$highlights1405 != null) {
                realmList2 = new RealmList();
                for (i11 = 0; i11 < realmListRealmGet$highlights1405.size(); i11++) {
                    verseHighlight3 = realmListRealmGet$highlights1405.get(i11);
                    verseHighlight4 = (VerseHighlight) map2.get(verseHighlight3);
                    if (verseHighlight4 != null) {
                        realmList2.add(verseHighlight4);
                    } else {
                        realmList2.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight3, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(verseColumnInfo.highlights1405ColKey, realmList2);
            } else {
                osObjectBuilder.addObjectList(verseColumnInfo.highlights1405ColKey, new RealmList());
            }
            realmListRealmGet$highlights1441 = verse2.realmGet$highlights1441();
            if (realmListRealmGet$highlights1441 != null) {
                realmList = new RealmList();
                for (i10 = 0; i10 < realmListRealmGet$highlights1441.size(); i10++) {
                    verseHighlight = realmListRealmGet$highlights1441.get(i10);
                    verseHighlight2 = (VerseHighlight) map2.get(verseHighlight);
                    if (verseHighlight2 != null) {
                        realmList.add(verseHighlight2);
                    } else {
                        realmList.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(verseColumnInfo.highlights1441ColKey, realmList);
            } else {
                osObjectBuilder.addObjectList(verseColumnInfo.highlights1441ColKey, new RealmList());
            }
            osObjectBuilder.updateExistingTopLevelObject();
            return verse;
        }
        osObjectBuilder.addNull(verseColumnInfo.partColKey);
        realm2 = realm;
        map2 = map;
        set2 = set;
        quarterRealmGet$quarter = verse2.realmGet$quarter();
        if (quarterRealmGet$quarter == null) {
            osObjectBuilder.addNull(verseColumnInfo.quarterColKey);
        } else {
            quarter = (Quarter) map2.get(quarterRealmGet$quarter);
            if (quarter != null) {
                osObjectBuilder.addObject(verseColumnInfo.quarterColKey, quarter);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.quarterColKey, com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm2.getSchema().getColumnInfo(Quarter.class), quarterRealmGet$quarter, true, map2, set2));
            }
        }
        sectionRealmGet$section = verse2.realmGet$section();
        if (sectionRealmGet$section == null) {
            osObjectBuilder.addNull(verseColumnInfo.sectionColKey);
        } else {
            section = (Section) map2.get(sectionRealmGet$section);
            if (section != null) {
                osObjectBuilder.addObject(verseColumnInfo.sectionColKey, section);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.sectionColKey, com_ayah_dao_realm_model_quran_SectionRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_SectionRealmProxy.SectionColumnInfo) realm2.getSchema().getColumnInfo(Section.class), sectionRealmGet$section, true, map2, set2));
            }
        }
        pageRealmGet$page1405 = verse2.realmGet$page1405();
        if (pageRealmGet$page1405 == null) {
            osObjectBuilder.addNull(verseColumnInfo.page1405ColKey);
        } else {
            page = (Page) map2.get(pageRealmGet$page1405);
            if (page != null) {
                osObjectBuilder.addObject(verseColumnInfo.page1405ColKey, page);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.page1405ColKey, com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1405, true, map2, set2));
            }
        }
        pageRealmGet$page1441 = verse2.realmGet$page1441();
        if (pageRealmGet$page1441 == null) {
            osObjectBuilder.addNull(verseColumnInfo.page1441ColKey);
        } else {
            page2 = (Page) map2.get(pageRealmGet$page1441);
            if (page2 != null) {
                osObjectBuilder.addObject(verseColumnInfo.page1441ColKey, page2);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.page1441ColKey, com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm2.getSchema().getColumnInfo(Page.class), pageRealmGet$page1441, true, map2, set2));
            }
        }
        chapterRealmGet$chapter = verse2.realmGet$chapter();
        if (chapterRealmGet$chapter == null) {
            osObjectBuilder.addNull(verseColumnInfo.chapterColKey);
        } else {
            chapter = (Chapter) map2.get(chapterRealmGet$chapter);
            if (chapter != null) {
                osObjectBuilder.addObject(verseColumnInfo.chapterColKey, chapter);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.chapterColKey, com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm2.getSchema().getColumnInfo(Chapter.class), chapterRealmGet$chapter, true, map2, set2));
            }
        }
        verseMarkerRealmGet$marker1405 = verse2.realmGet$marker1405();
        if (verseMarkerRealmGet$marker1405 == null) {
            osObjectBuilder.addNull(verseColumnInfo.marker1405ColKey);
        } else {
            verseMarker = (VerseMarker) map2.get(verseMarkerRealmGet$marker1405);
            if (verseMarker != null) {
                osObjectBuilder.addObject(verseColumnInfo.marker1405ColKey, verseMarker);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.marker1405ColKey, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1405, true, map2, set2));
            }
        }
        verseMarkerRealmGet$marker1441 = verse2.realmGet$marker1441();
        if (verseMarkerRealmGet$marker1441 == null) {
            osObjectBuilder.addNull(verseColumnInfo.marker1441ColKey);
        } else {
            verseMarker2 = (VerseMarker) map2.get(verseMarkerRealmGet$marker1441);
            if (verseMarker2 != null) {
                osObjectBuilder.addObject(verseColumnInfo.marker1441ColKey, verseMarker2);
            } else {
                osObjectBuilder.addObject(verseColumnInfo.marker1441ColKey, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm2.getSchema().getColumnInfo(VerseMarker.class), verseMarkerRealmGet$marker1441, true, map2, set2));
            }
        }
        realmListRealmGet$highlights1405 = verse2.realmGet$highlights1405();
        if (realmListRealmGet$highlights1405 != null) {
            realmList2 = new RealmList();
            while (i11 < realmListRealmGet$highlights1405.size()) {
                verseHighlight3 = realmListRealmGet$highlights1405.get(i11);
                verseHighlight4 = (VerseHighlight) map2.get(verseHighlight3);
                if (verseHighlight4 != null) {
                    realmList2.add(verseHighlight4);
                } else {
                    realmList2.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight3, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(verseColumnInfo.highlights1405ColKey, realmList2);
        } else {
            osObjectBuilder.addObjectList(verseColumnInfo.highlights1405ColKey, new RealmList());
        }
        realmListRealmGet$highlights1441 = verse2.realmGet$highlights1441();
        if (realmListRealmGet$highlights1441 != null) {
            realmList = new RealmList();
            while (i10 < realmListRealmGet$highlights1441.size()) {
                verseHighlight = realmListRealmGet$highlights1441.get(i10);
                verseHighlight2 = (VerseHighlight) map2.get(verseHighlight);
                if (verseHighlight2 != null) {
                    realmList.add(verseHighlight2);
                } else {
                    realmList.add(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm2.getSchema().getColumnInfo(VerseHighlight.class), verseHighlight, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(verseColumnInfo.highlights1441ColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(verseColumnInfo.highlights1441ColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return verse;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_VerseRealmProxy com_ayah_dao_realm_model_quran_verserealmproxy = (com_ayah_dao_realm_model_quran_VerseRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_verserealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_verserealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_verserealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (VerseColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Verse> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Chapter realmGet$chapter() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.chapterColKey)) {
            return null;
        }
        return (Chapter) this.proxyState.getRealm$realm().get(Chapter.class, this.proxyState.getRow$realm().getLink(this.columnInfo.chapterColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$hafsSmartText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hafsSmartTextColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public RealmList<VerseHighlight> realmGet$highlights1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<VerseHighlight> realmList = this.highlights1405RealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<VerseHighlight> realmList2 = new RealmList<>((Class<VerseHighlight>) VerseHighlight.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.highlights1405ColKey), this.proxyState.getRealm$realm());
        this.highlights1405RealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public RealmList<VerseHighlight> realmGet$highlights1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<VerseHighlight> realmList = this.highlights1441RealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<VerseHighlight> realmList2 = new RealmList<>((Class<VerseHighlight>) VerseHighlight.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.highlights1441ColKey), this.proxyState.getRealm$realm());
        this.highlights1441RealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$humanReadableID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.humanReadableIDColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public VerseMarker realmGet$marker1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.marker1405ColKey)) {
            return null;
        }
        return (VerseMarker) this.proxyState.getRealm$realm().get(VerseMarker.class, this.proxyState.getRow$realm().getLink(this.columnInfo.marker1405ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public VerseMarker realmGet$marker1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.marker1441ColKey)) {
            return null;
        }
        return (VerseMarker) this.proxyState.getRealm$realm().get(VerseMarker.class, this.proxyState.getRow$realm().getLink(this.columnInfo.marker1441ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public long realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.numberColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Page realmGet$page1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.page1405ColKey)) {
            return null;
        }
        return (Page) this.proxyState.getRealm$realm().get(Page.class, this.proxyState.getRow$realm().getLink(this.columnInfo.page1405ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Page realmGet$page1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.page1441ColKey)) {
            return null;
        }
        return (Page) this.proxyState.getRealm$realm().get(Page.class, this.proxyState.getRow$realm().getLink(this.columnInfo.page1441ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Quarter realmGet$quarter() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.quarterColKey)) {
            return null;
        }
        return (Quarter) this.proxyState.getRealm$realm().get(Quarter.class, this.proxyState.getRow$realm().getLink(this.columnInfo.quarterColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$searchableText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.searchableTextColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Section realmGet$section() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.sectionColKey)) {
            return null;
        }
        return (Section) this.proxyState.getRealm$realm().get(Section.class, this.proxyState.getRow$realm().getLink(this.columnInfo.sectionColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$textWithoutTashkil() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textWithoutTashkilColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$uthmanicHafsText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uthmanicHafsTextColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public long realmGet$verseID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.verseIDColKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$hafsSmartText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hafsSmartText' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.hafsSmartTextColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hafsSmartText' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.hafsSmartTextColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$highlights1405(RealmList<VerseHighlight> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("highlights1405")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<VerseHighlight> realmList2 = new RealmList<>();
                for (VerseHighlight verseHighlight : realmList) {
                    if (verseHighlight == null || RealmObject.isManaged(verseHighlight)) {
                        realmList2.add(verseHighlight);
                    } else {
                        realmList2.add((VerseHighlight) realm.copyToRealm(verseHighlight, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.highlights1405ColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (VerseHighlight) realmList.get(i10);
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
            RealmModel realmModel2 = (VerseHighlight) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$highlights1441(RealmList<VerseHighlight> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("highlights1441")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<VerseHighlight> realmList2 = new RealmList<>();
                for (VerseHighlight verseHighlight : realmList) {
                    if (verseHighlight == null || RealmObject.isManaged(verseHighlight)) {
                        realmList2.add(verseHighlight);
                    } else {
                        realmList2.add((VerseHighlight) realm.copyToRealm(verseHighlight, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.highlights1441ColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (VerseHighlight) realmList.get(i10);
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
            RealmModel realmModel2 = (VerseHighlight) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$humanReadableID(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'humanReadableID' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.humanReadableIDColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'humanReadableID' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.humanReadableIDColKey, row$realm.getObjectKey(), str, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$marker1405(VerseMarker verseMarker) {
        RealmModel realmModel;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (verseMarker == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.marker1405ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(verseMarker);
                this.proxyState.getRow$realm().setLink(this.columnInfo.marker1405ColKey, ((RealmObjectProxy) verseMarker).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("marker1405")) {
                realmModel = verseMarker;
                return;
            }
            if (verseMarker != 0) {
                boolean zIsManaged = RealmObject.isManaged(verseMarker);
                realmModel = verseMarker;
                if (!zIsManaged) {
                    realmModel = (VerseMarker) realm.copyToRealm(verseMarker, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (realmModel == null) {
                row$realm.nullifyLink(this.columnInfo.marker1405ColKey);
            } else {
                this.proxyState.checkValidObject(realmModel);
                row$realm.getTable().setLink(this.columnInfo.marker1405ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) realmModel), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$marker1441(VerseMarker verseMarker) {
        RealmModel realmModel;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (verseMarker == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.marker1441ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(verseMarker);
                this.proxyState.getRow$realm().setLink(this.columnInfo.marker1441ColKey, ((RealmObjectProxy) verseMarker).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("marker1441")) {
                realmModel = verseMarker;
                return;
            }
            if (verseMarker != 0) {
                boolean zIsManaged = RealmObject.isManaged(verseMarker);
                realmModel = verseMarker;
                if (!zIsManaged) {
                    realmModel = (VerseMarker) realm.copyToRealm(verseMarker, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (realmModel == null) {
                row$realm.nullifyLink(this.columnInfo.marker1441ColKey);
            } else {
                this.proxyState.checkValidObject(realmModel);
                row$realm.getTable().setLink(this.columnInfo.marker1441ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) realmModel), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$number(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.numberColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.numberColKey, row$realm.getObjectKey(), j, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$page1405(Page page) {
        Page page2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (page == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.page1405ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(page);
                this.proxyState.getRow$realm().setLink(this.columnInfo.page1405ColKey, ((RealmObjectProxy) page).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("page1405")) {
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
                row$realm.nullifyLink(this.columnInfo.page1405ColKey);
            } else {
                this.proxyState.checkValidObject(page2);
                row$realm.getTable().setLink(this.columnInfo.page1405ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) page2), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$page1441(Page page) {
        Page page2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (page == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.page1441ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(page);
                this.proxyState.getRow$realm().setLink(this.columnInfo.page1441ColKey, ((RealmObjectProxy) page).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("page1441")) {
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
                row$realm.nullifyLink(this.columnInfo.page1441ColKey);
            } else {
                this.proxyState.checkValidObject(page2);
                row$realm.getTable().setLink(this.columnInfo.page1441ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) page2), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
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
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
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

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$section(Section section) {
        Section section2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (section == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.sectionColKey);
                return;
            } else {
                this.proxyState.checkValidObject(section);
                this.proxyState.getRow$realm().setLink(this.columnInfo.sectionColKey, ((RealmObjectProxy) section).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("section")) {
                section2 = section;
                return;
            }
            if (section != 0) {
                boolean zIsManaged = RealmObject.isManaged(section);
                section2 = section;
                if (!zIsManaged) {
                    section2 = (Section) realm.copyToRealmOrUpdate(section, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (section2 == 0) {
                row$realm.nullifyLink(this.columnInfo.sectionColKey);
            } else {
                this.proxyState.checkValidObject(section2);
                row$realm.getTable().setLink(this.columnInfo.sectionColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) section2), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.textColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.textColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$textWithoutTashkil(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textWithoutTashkil' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.textWithoutTashkilColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textWithoutTashkil' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.textWithoutTashkilColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$uthmanicHafsText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uthmanicHafsText' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.uthmanicHafsTextColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uthmanicHafsText' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.uthmanicHafsTextColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Verse, io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$verseID(long j) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'verseID' cannot be changed after object was created.");
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Verse = proxy[{verseID:");
        sb.append(realmGet$verseID());
        sb.append("},{humanReadableID:");
        sb.append(realmGet$humanReadableID());
        sb.append("},{number:");
        sb.append(realmGet$number());
        sb.append("},{text:");
        sb.append(realmGet$text());
        sb.append("},{textWithoutTashkil:");
        sb.append(realmGet$textWithoutTashkil());
        sb.append("},{uthmanicHafsText:");
        sb.append(realmGet$uthmanicHafsText());
        sb.append("},{hafsSmartText:");
        sb.append(realmGet$hafsSmartText());
        sb.append("},{searchableText:");
        sb.append(realmGet$searchableText());
        sb.append("},{part:");
        sb.append(realmGet$part() != null ? com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{quarter:");
        sb.append(realmGet$quarter() != null ? com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{section:");
        sb.append(realmGet$section() != null ? com_ayah_dao_realm_model_quran_SectionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{page1405:");
        Page pageRealmGet$page1405 = realmGet$page1405();
        String str = com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(pageRealmGet$page1405 != null ? com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{page1441:");
        if (realmGet$page1441() == null) {
            str = "null";
        }
        sb.append(str);
        sb.append("},{chapter:");
        sb.append(realmGet$chapter() != null ? com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{marker1405:");
        sb.append(realmGet$marker1405() != null ? com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{marker1441:");
        sb.append(realmGet$marker1441() != null ? com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{highlights1405:RealmList<VerseHighlight>[");
        sb.append(realmGet$highlights1405().size());
        sb.append("]},{highlights1441:RealmList<VerseHighlight>[");
        sb.append(realmGet$highlights1441().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Verse.class);
        long nativePtr = table.getNativePtr();
        VerseColumnInfo verseColumnInfo = (VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class);
        long j = verseColumnInfo.verseIDColKey;
        while (it.hasNext()) {
            Verse verse = (Verse) it.next();
            if (!map.containsKey(verse)) {
                if ((verse instanceof RealmObjectProxy) && !RealmObject.isFrozen(verse)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verse;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(verse, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Long lValueOf = Long.valueOf(verse.realmGet$verseID());
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, verse.realmGet$verseID());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(verse.realmGet$verseID()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(lValueOf);
                }
                map.put(verse, Long.valueOf(jNativeFindFirstInt));
                String strRealmGet$humanReadableID = verse.realmGet$humanReadableID();
                if (strRealmGet$humanReadableID != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.humanReadableIDColKey, jNativeFindFirstInt, strRealmGet$humanReadableID, false);
                }
                Table.nativeSetLong(nativePtr, verseColumnInfo.numberColKey, jNativeFindFirstInt, verse.realmGet$number(), false);
                String strRealmGet$text = verse.realmGet$text();
                if (strRealmGet$text != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.textColKey, jNativeFindFirstInt, strRealmGet$text, false);
                }
                String strRealmGet$textWithoutTashkil = verse.realmGet$textWithoutTashkil();
                if (strRealmGet$textWithoutTashkil != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.textWithoutTashkilColKey, jNativeFindFirstInt, strRealmGet$textWithoutTashkil, false);
                }
                String strRealmGet$uthmanicHafsText = verse.realmGet$uthmanicHafsText();
                if (strRealmGet$uthmanicHafsText != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.uthmanicHafsTextColKey, jNativeFindFirstInt, strRealmGet$uthmanicHafsText, false);
                }
                String strRealmGet$hafsSmartText = verse.realmGet$hafsSmartText();
                if (strRealmGet$hafsSmartText != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.hafsSmartTextColKey, jNativeFindFirstInt, strRealmGet$hafsSmartText, false);
                }
                String strRealmGet$searchableText = verse.realmGet$searchableText();
                if (strRealmGet$searchableText != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
                }
                Part partRealmGet$part = verse.realmGet$part();
                if (partRealmGet$part != null) {
                    Long lValueOf2 = map.get(partRealmGet$part);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, partRealmGet$part, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.partColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                }
                Quarter quarterRealmGet$quarter = verse.realmGet$quarter();
                if (quarterRealmGet$quarter != null) {
                    Long lValueOf3 = map.get(quarterRealmGet$quarter);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, quarterRealmGet$quarter, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.quarterColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
                }
                Section sectionRealmGet$section = verse.realmGet$section();
                if (sectionRealmGet$section != null) {
                    Long lValueOf4 = map.get(sectionRealmGet$section);
                    if (lValueOf4 == null) {
                        lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_SectionRealmProxy.insert(realm, sectionRealmGet$section, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.sectionColKey, jNativeFindFirstInt, lValueOf4.longValue(), false);
                }
                Page pageRealmGet$page1405 = verse.realmGet$page1405();
                if (pageRealmGet$page1405 != null) {
                    Long lValueOf5 = map.get(pageRealmGet$page1405);
                    if (lValueOf5 == null) {
                        lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, pageRealmGet$page1405, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.page1405ColKey, jNativeFindFirstInt, lValueOf5.longValue(), false);
                }
                Page pageRealmGet$page1441 = verse.realmGet$page1441();
                if (pageRealmGet$page1441 != null) {
                    Long lValueOf6 = map.get(pageRealmGet$page1441);
                    if (lValueOf6 == null) {
                        lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, pageRealmGet$page1441, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.page1441ColKey, jNativeFindFirstInt, lValueOf6.longValue(), false);
                }
                Chapter chapterRealmGet$chapter = verse.realmGet$chapter();
                if (chapterRealmGet$chapter != null) {
                    Long lValueOf7 = map.get(chapterRealmGet$chapter);
                    if (lValueOf7 == null) {
                        lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, chapterRealmGet$chapter, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.chapterColKey, jNativeFindFirstInt, lValueOf7.longValue(), false);
                }
                VerseMarker verseMarkerRealmGet$marker1405 = verse.realmGet$marker1405();
                if (verseMarkerRealmGet$marker1405 != null) {
                    Long lValueOf8 = map.get(verseMarkerRealmGet$marker1405);
                    if (lValueOf8 == null) {
                        lValueOf8 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, verseMarkerRealmGet$marker1405, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.marker1405ColKey, jNativeFindFirstInt, lValueOf8.longValue(), false);
                }
                VerseMarker verseMarkerRealmGet$marker1441 = verse.realmGet$marker1441();
                if (verseMarkerRealmGet$marker1441 != null) {
                    Long lValueOf9 = map.get(verseMarkerRealmGet$marker1441);
                    if (lValueOf9 == null) {
                        lValueOf9 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, verseMarkerRealmGet$marker1441, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.marker1441ColKey, jNativeFindFirstInt, lValueOf9.longValue(), false);
                }
                RealmList<VerseHighlight> realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
                if (realmListRealmGet$highlights1405 != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1405ColKey);
                    for (VerseHighlight verseHighlight : realmListRealmGet$highlights1405) {
                        Long lValueOf10 = map.get(verseHighlight);
                        if (lValueOf10 == null) {
                            lValueOf10 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, verseHighlight, map));
                        }
                        osList.addRow(lValueOf10.longValue());
                    }
                }
                RealmList<VerseHighlight> realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
                if (realmListRealmGet$highlights1441 != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1441ColKey);
                    for (VerseHighlight verseHighlight2 : realmListRealmGet$highlights1441) {
                        Long lValueOf11 = map.get(verseHighlight2);
                        if (lValueOf11 == null) {
                            lValueOf11 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, verseHighlight2, map));
                        }
                        osList2.addRow(lValueOf11.longValue());
                    }
                }
                j = j10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Table table = realm.getTable(Verse.class);
        long nativePtr = table.getNativePtr();
        VerseColumnInfo verseColumnInfo = (VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class);
        long j10 = verseColumnInfo.verseIDColKey;
        while (it.hasNext()) {
            Verse verse = (Verse) it.next();
            if (!map.containsKey(verse)) {
                if ((verse instanceof RealmObjectProxy) && !RealmObject.isFrozen(verse)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) verse;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(verse, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                verse.realmGet$verseID();
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j10, verse.realmGet$verseID());
                long j11 = j10;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j11, Long.valueOf(verse.realmGet$verseID()));
                }
                map.put(verse, Long.valueOf(jNativeFindFirstInt));
                String strRealmGet$humanReadableID = verse.realmGet$humanReadableID();
                if (strRealmGet$humanReadableID != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.humanReadableIDColKey, jNativeFindFirstInt, strRealmGet$humanReadableID, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseColumnInfo.humanReadableIDColKey, jNativeFindFirstInt, false);
                }
                Table.nativeSetLong(nativePtr, verseColumnInfo.numberColKey, jNativeFindFirstInt, verse.realmGet$number(), false);
                String strRealmGet$text = verse.realmGet$text();
                if (strRealmGet$text != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.textColKey, jNativeFindFirstInt, strRealmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseColumnInfo.textColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$textWithoutTashkil = verse.realmGet$textWithoutTashkil();
                if (strRealmGet$textWithoutTashkil != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.textWithoutTashkilColKey, jNativeFindFirstInt, strRealmGet$textWithoutTashkil, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseColumnInfo.textWithoutTashkilColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$uthmanicHafsText = verse.realmGet$uthmanicHafsText();
                if (strRealmGet$uthmanicHafsText != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.uthmanicHafsTextColKey, jNativeFindFirstInt, strRealmGet$uthmanicHafsText, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseColumnInfo.uthmanicHafsTextColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$hafsSmartText = verse.realmGet$hafsSmartText();
                if (strRealmGet$hafsSmartText != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.hafsSmartTextColKey, jNativeFindFirstInt, strRealmGet$hafsSmartText, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseColumnInfo.hafsSmartTextColKey, jNativeFindFirstInt, false);
                }
                String strRealmGet$searchableText = verse.realmGet$searchableText();
                if (strRealmGet$searchableText != null) {
                    Table.nativeSetString(nativePtr, verseColumnInfo.searchableTextColKey, jNativeFindFirstInt, strRealmGet$searchableText, false);
                } else {
                    Table.nativeSetNull(nativePtr, verseColumnInfo.searchableTextColKey, jNativeFindFirstInt, false);
                }
                Part partRealmGet$part = verse.realmGet$part();
                if (partRealmGet$part != null) {
                    Long lValueOf = map.get(partRealmGet$part);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, partRealmGet$part, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.partColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.partColKey, jNativeFindFirstInt);
                }
                Quarter quarterRealmGet$quarter = verse.realmGet$quarter();
                if (quarterRealmGet$quarter != null) {
                    Long lValueOf2 = map.get(quarterRealmGet$quarter);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, quarterRealmGet$quarter, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.quarterColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.quarterColKey, jNativeFindFirstInt);
                }
                Section sectionRealmGet$section = verse.realmGet$section();
                if (sectionRealmGet$section != null) {
                    Long lValueOf3 = map.get(sectionRealmGet$section);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_SectionRealmProxy.insertOrUpdate(realm, sectionRealmGet$section, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.sectionColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.sectionColKey, jNativeFindFirstInt);
                }
                Page pageRealmGet$page1405 = verse.realmGet$page1405();
                if (pageRealmGet$page1405 != null) {
                    Long lValueOf4 = map.get(pageRealmGet$page1405);
                    if (lValueOf4 == null) {
                        lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, pageRealmGet$page1405, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.page1405ColKey, jNativeFindFirstInt, lValueOf4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.page1405ColKey, jNativeFindFirstInt);
                }
                Page pageRealmGet$page1441 = verse.realmGet$page1441();
                if (pageRealmGet$page1441 != null) {
                    Long lValueOf5 = map.get(pageRealmGet$page1441);
                    if (lValueOf5 == null) {
                        lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, pageRealmGet$page1441, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.page1441ColKey, jNativeFindFirstInt, lValueOf5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.page1441ColKey, jNativeFindFirstInt);
                }
                Chapter chapterRealmGet$chapter = verse.realmGet$chapter();
                if (chapterRealmGet$chapter != null) {
                    Long lValueOf6 = map.get(chapterRealmGet$chapter);
                    if (lValueOf6 == null) {
                        lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, chapterRealmGet$chapter, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.chapterColKey, jNativeFindFirstInt, lValueOf6.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.chapterColKey, jNativeFindFirstInt);
                }
                VerseMarker verseMarkerRealmGet$marker1405 = verse.realmGet$marker1405();
                if (verseMarkerRealmGet$marker1405 != null) {
                    Long lValueOf7 = map.get(verseMarkerRealmGet$marker1405);
                    if (lValueOf7 == null) {
                        lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, verseMarkerRealmGet$marker1405, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.marker1405ColKey, jNativeFindFirstInt, lValueOf7.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.marker1405ColKey, jNativeFindFirstInt);
                }
                VerseMarker verseMarkerRealmGet$marker1441 = verse.realmGet$marker1441();
                if (verseMarkerRealmGet$marker1441 != null) {
                    Long lValueOf8 = map.get(verseMarkerRealmGet$marker1441);
                    if (lValueOf8 == null) {
                        lValueOf8 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, verseMarkerRealmGet$marker1441, map));
                    }
                    Table.nativeSetLink(nativePtr, verseColumnInfo.marker1441ColKey, jNativeFindFirstInt, lValueOf8.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, verseColumnInfo.marker1441ColKey, jNativeFindFirstInt);
                }
                OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1405ColKey);
                RealmList<VerseHighlight> realmListRealmGet$highlights1405 = verse.realmGet$highlights1405();
                if (realmListRealmGet$highlights1405 != null && realmListRealmGet$highlights1405.size() == osList.size()) {
                    int size = realmListRealmGet$highlights1405.size();
                    int iQ = 0;
                    while (iQ < size) {
                        VerseHighlight verseHighlight = realmListRealmGet$highlights1405.get(iQ);
                        Long lValueOf9 = map.get(verseHighlight);
                        if (lValueOf9 == null) {
                            lValueOf9 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight, map));
                        }
                        iQ = p.q(lValueOf9, osList, iQ, iQ, 1);
                        nativePtr = nativePtr;
                    }
                    j = nativePtr;
                } else {
                    j = nativePtr;
                    osList.removeAll();
                    if (realmListRealmGet$highlights1405 != null) {
                        for (VerseHighlight verseHighlight2 : realmListRealmGet$highlights1405) {
                            Long lValueOf10 = map.get(verseHighlight2);
                            if (lValueOf10 == null) {
                                lValueOf10 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight2, map));
                            }
                            osList.addRow(lValueOf10.longValue());
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), verseColumnInfo.highlights1441ColKey);
                RealmList<VerseHighlight> realmListRealmGet$highlights1441 = verse.realmGet$highlights1441();
                if (realmListRealmGet$highlights1441 != null && realmListRealmGet$highlights1441.size() == osList2.size()) {
                    int size2 = realmListRealmGet$highlights1441.size();
                    int iQ2 = 0;
                    while (iQ2 < size2) {
                        VerseHighlight verseHighlight3 = realmListRealmGet$highlights1441.get(iQ2);
                        Long lValueOf11 = map.get(verseHighlight3);
                        if (lValueOf11 == null) {
                            lValueOf11 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight3, map));
                        }
                        iQ2 = p.q(lValueOf11, osList2, iQ2, iQ2, 1);
                    }
                } else {
                    osList2.removeAll();
                    if (realmListRealmGet$highlights1441 != null) {
                        for (VerseHighlight verseHighlight4 : realmListRealmGet$highlights1441) {
                            Long lValueOf12 = map.get(verseHighlight4);
                            if (lValueOf12 == null) {
                                lValueOf12 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, verseHighlight4, map));
                            }
                            osList2.addRow(lValueOf12.longValue());
                        }
                    }
                }
                j10 = j11;
                nativePtr = j;
            }
        }
    }
}
