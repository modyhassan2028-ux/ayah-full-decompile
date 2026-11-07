package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.PageHeader;
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
public class com_ayah_dao_realm_model_quran_PageRealmProxy extends Page implements RealmObjectProxy, com_ayah_dao_realm_model_quran_PageRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<ChapterHeader> chapterHeaders1405RealmList;
    private RealmList<ChapterHeader> chapterHeaders1441RealmList;
    private PageColumnInfo columnInfo;
    private ProxyState<Page> proxyState;
    private RealmList<Verse> verses1405RealmList;
    private RealmList<Verse> verses1441RealmList;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Page";
    }

    public static final class PageColumnInfo extends ColumnInfo {
        long chapterHeaders1405ColKey;
        long chapterHeaders1441ColKey;
        long header1405ColKey;
        long header1441ColKey;
        long identifierColKey;
        long isRightColKey;
        long numberColKey;
        long verses1405ColKey;
        long verses1441ColKey;

        public PageColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.identifierColKey = addColumnDetails("identifier", "identifier", objectSchemaInfo);
            this.numberColKey = addColumnDetails("number", "number", objectSchemaInfo);
            this.isRightColKey = addColumnDetails("isRight", "isRight", objectSchemaInfo);
            this.header1405ColKey = addColumnDetails("header1405", "header1405", objectSchemaInfo);
            this.header1441ColKey = addColumnDetails("header1441", "header1441", objectSchemaInfo);
            this.chapterHeaders1405ColKey = addColumnDetails("chapterHeaders1405", "chapterHeaders1405", objectSchemaInfo);
            this.chapterHeaders1441ColKey = addColumnDetails("chapterHeaders1441", "chapterHeaders1441", objectSchemaInfo);
            this.verses1405ColKey = addColumnDetails("verses1405", "verses1405", objectSchemaInfo);
            this.verses1441ColKey = addColumnDetails("verses1441", "verses1441", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new PageColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PageColumnInfo pageColumnInfo = (PageColumnInfo) columnInfo;
            PageColumnInfo pageColumnInfo2 = (PageColumnInfo) columnInfo2;
            pageColumnInfo2.identifierColKey = pageColumnInfo.identifierColKey;
            pageColumnInfo2.numberColKey = pageColumnInfo.numberColKey;
            pageColumnInfo2.isRightColKey = pageColumnInfo.isRightColKey;
            pageColumnInfo2.header1405ColKey = pageColumnInfo.header1405ColKey;
            pageColumnInfo2.header1441ColKey = pageColumnInfo.header1441ColKey;
            pageColumnInfo2.chapterHeaders1405ColKey = pageColumnInfo.chapterHeaders1405ColKey;
            pageColumnInfo2.chapterHeaders1441ColKey = pageColumnInfo.chapterHeaders1441ColKey;
            pageColumnInfo2.verses1405ColKey = pageColumnInfo.verses1405ColKey;
            pageColumnInfo2.verses1441ColKey = pageColumnInfo.verses1441ColKey;
        }

        public PageColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_quran_PageRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:59:0x017f  */
    public static Page copy(Realm realm, PageColumnInfo pageColumnInfo, Page page, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        PageHeader pageHeaderRealmGet$header1441;
        PageHeader pageHeader;
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405;
        int i10;
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441;
        RealmList<Verse> realmListRealmGet$verses1405;
        RealmList<Verse> realmListRealmGet$verses1441;
        RealmList<Verse> realmListRealmGet$verses1442;
        Verse verse;
        Verse verse2;
        RealmList<Verse> realmListRealmGet$verses1406;
        int i11;
        Verse verse3;
        Verse verse4;
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1442;
        int i12;
        ChapterHeader chapterHeader;
        ChapterHeader chapterHeader2;
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1406;
        int i13;
        ChapterHeader chapterHeader3;
        ChapterHeader chapterHeader4;
        RealmObjectProxy realmObjectProxy = map.get(page);
        if (realmObjectProxy != null) {
            return (Page) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Page.class), set);
        osObjectBuilder.addInteger(pageColumnInfo.identifierColKey, Long.valueOf(page.realmGet$identifier()));
        osObjectBuilder.addInteger(pageColumnInfo.numberColKey, Long.valueOf(page.realmGet$number()));
        osObjectBuilder.addBoolean(pageColumnInfo.isRightColKey, Boolean.valueOf(page.realmGet$isRight()));
        com_ayah_dao_realm_model_quran_PageRealmProxy com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(page, com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance);
        PageHeader pageHeaderRealmGet$header1405 = page.realmGet$header1405();
        if (pageHeaderRealmGet$header1405 != null) {
            PageHeader pageHeader2 = (PageHeader) map.get(pageHeaderRealmGet$header1405);
            if (pageHeader2 != null) {
                com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1405(pageHeader2);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1405(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class), pageHeaderRealmGet$header1405, z11, map3, set2));
                map2 = map3;
            }
            pageHeaderRealmGet$header1441 = page.realmGet$header1441();
            if (pageHeaderRealmGet$header1441 == null) {
                com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1441(null);
            } else {
                pageHeader = (PageHeader) map2.get(pageHeaderRealmGet$header1441);
                if (pageHeader != null) {
                    com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1441(pageHeader);
                } else {
                    com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1441(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm2.getSchema().getColumnInfo(PageHeader.class), pageHeaderRealmGet$header1441, z11, map2, set2));
                }
            }
            realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
            if (realmListRealmGet$chapterHeaders1405 != null) {
                realmListRealmGet$chapterHeaders1406 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$chapterHeaders1405();
                realmListRealmGet$chapterHeaders1406.clear();
                for (i13 = 0; i13 < realmListRealmGet$chapterHeaders1405.size(); i13++) {
                    chapterHeader3 = realmListRealmGet$chapterHeaders1405.get(i13);
                    chapterHeader4 = (ChapterHeader) map2.get(chapterHeader3);
                    if (chapterHeader4 != null) {
                        realmListRealmGet$chapterHeaders1406.add(chapterHeader4);
                    } else {
                        realmListRealmGet$chapterHeaders1406.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader3, z11, map2, set2));
                    }
                }
            }
            realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
            if (realmListRealmGet$chapterHeaders1441 != null) {
                realmListRealmGet$chapterHeaders1442 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$chapterHeaders1441();
                realmListRealmGet$chapterHeaders1442.clear();
                for (i12 = 0; i12 < realmListRealmGet$chapterHeaders1441.size(); i12++) {
                    chapterHeader = realmListRealmGet$chapterHeaders1441.get(i12);
                    chapterHeader2 = (ChapterHeader) map2.get(chapterHeader);
                    if (chapterHeader2 != null) {
                        realmListRealmGet$chapterHeaders1442.add(chapterHeader2);
                    } else {
                        realmListRealmGet$chapterHeaders1442.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader, z11, map2, set2));
                    }
                }
            }
            realmListRealmGet$verses1405 = page.realmGet$verses1405();
            if (realmListRealmGet$verses1405 != null) {
                realmListRealmGet$verses1406 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$verses1405();
                realmListRealmGet$verses1406.clear();
                for (i11 = 0; i11 < realmListRealmGet$verses1405.size(); i11++) {
                    verse3 = realmListRealmGet$verses1405.get(i11);
                    verse4 = (Verse) map2.get(verse3);
                    if (verse4 != null) {
                        realmListRealmGet$verses1406.add(verse4);
                    } else {
                        realmListRealmGet$verses1406.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse3, z11, map2, set2));
                    }
                }
            }
            realmListRealmGet$verses1441 = page.realmGet$verses1441();
            if (realmListRealmGet$verses1441 != null) {
                realmListRealmGet$verses1442 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$verses1441();
                realmListRealmGet$verses1442.clear();
                for (i10 = 0; i10 < realmListRealmGet$verses1441.size(); i10++) {
                    verse = realmListRealmGet$verses1441.get(i10);
                    verse2 = (Verse) map2.get(verse);
                    if (verse2 != null) {
                        realmListRealmGet$verses1442.add(verse2);
                    } else {
                        realmListRealmGet$verses1442.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, z11, map2, set2));
                    }
                }
            }
            return com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1405(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        pageHeaderRealmGet$header1441 = page.realmGet$header1441();
        if (pageHeaderRealmGet$header1441 == null) {
            com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1441(null);
        } else {
            pageHeader = (PageHeader) map2.get(pageHeaderRealmGet$header1441);
            if (pageHeader != null) {
                com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1441(pageHeader);
            } else {
                com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmSet$header1441(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm2.getSchema().getColumnInfo(PageHeader.class), pageHeaderRealmGet$header1441, z11, map2, set2));
            }
        }
        realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
        if (realmListRealmGet$chapterHeaders1405 != null) {
            realmListRealmGet$chapterHeaders1406 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$chapterHeaders1405();
            realmListRealmGet$chapterHeaders1406.clear();
            while (i13 < realmListRealmGet$chapterHeaders1405.size()) {
                chapterHeader3 = realmListRealmGet$chapterHeaders1405.get(i13);
                chapterHeader4 = (ChapterHeader) map2.get(chapterHeader3);
                if (chapterHeader4 != null) {
                    realmListRealmGet$chapterHeaders1406.add(chapterHeader4);
                } else {
                    realmListRealmGet$chapterHeaders1406.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader3, z11, map2, set2));
                }
            }
        }
        realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
        if (realmListRealmGet$chapterHeaders1441 != null) {
            realmListRealmGet$chapterHeaders1442 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$chapterHeaders1441();
            realmListRealmGet$chapterHeaders1442.clear();
            while (i12 < realmListRealmGet$chapterHeaders1441.size()) {
                chapterHeader = realmListRealmGet$chapterHeaders1441.get(i12);
                chapterHeader2 = (ChapterHeader) map2.get(chapterHeader);
                if (chapterHeader2 != null) {
                    realmListRealmGet$chapterHeaders1442.add(chapterHeader2);
                } else {
                    realmListRealmGet$chapterHeaders1442.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader, z11, map2, set2));
                }
            }
        }
        realmListRealmGet$verses1405 = page.realmGet$verses1405();
        if (realmListRealmGet$verses1405 != null) {
            realmListRealmGet$verses1406 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$verses1405();
            realmListRealmGet$verses1406.clear();
            while (i11 < realmListRealmGet$verses1405.size()) {
                verse3 = realmListRealmGet$verses1405.get(i11);
                verse4 = (Verse) map2.get(verse3);
                if (verse4 != null) {
                    realmListRealmGet$verses1406.add(verse4);
                } else {
                    realmListRealmGet$verses1406.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse3, z11, map2, set2));
                }
            }
        }
        realmListRealmGet$verses1441 = page.realmGet$verses1441();
        if (realmListRealmGet$verses1441 != null) {
            realmListRealmGet$verses1442 = com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance.realmGet$verses1441();
            realmListRealmGet$verses1442.clear();
            while (i10 < realmListRealmGet$verses1441.size()) {
                verse = realmListRealmGet$verses1441.get(i10);
                verse2 = (Verse) map2.get(verse);
                if (verse2 != null) {
                    realmListRealmGet$verses1442.add(verse2);
                } else {
                    realmListRealmGet$verses1442.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, z11, map2, set2));
                }
            }
        }
        return com_ayah_dao_realm_model_quran_pagerealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Page copyOrUpdate(Realm realm, PageColumnInfo pageColumnInfo, Page page, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((page instanceof RealmObjectProxy) && !RealmObject.isFrozen(page)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) page;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return page;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(page);
        if (realmObjectProxy2 != null) {
            return (Page) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_quran_PageRealmProxy com_ayah_dao_realm_model_quran_pagerealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Page.class);
            long jFindFirstLong = table.findFirstLong(pageColumnInfo.identifierColKey, page.realmGet$identifier());
            if (jFindFirstLong == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstLong), pageColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_quran_pagerealmproxy = new com_ayah_dao_realm_model_quran_PageRealmProxy();
                    map.put(page, com_ayah_dao_realm_model_quran_pagerealmproxy);
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
        return z11 ? update(realm, pageColumnInfo, com_ayah_dao_realm_model_quran_pagerealmproxy, page, map, set) : copy(realm, pageColumnInfo, page, z10, map, set);
    }

    public static PageColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PageColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Page createDetachedCopy(Page page, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Page page2;
        if (i10 > i11 || page == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(page);
        if (cacheData == null) {
            page2 = new Page();
            map.put(page, new RealmObjectProxy.CacheData<>(i10, page2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Page) cacheData.object;
            }
            Page page3 = (Page) cacheData.object;
            cacheData.minDepth = i10;
            page2 = page3;
        }
        page2.realmSet$identifier(page.realmGet$identifier());
        page2.realmSet$number(page.realmGet$number());
        page2.realmSet$isRight(page.realmGet$isRight());
        int i12 = i10 + 1;
        page2.realmSet$header1405(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createDetachedCopy(page.realmGet$header1405(), i12, i11, map));
        page2.realmSet$header1441(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createDetachedCopy(page.realmGet$header1441(), i12, i11, map));
        if (i10 == i11) {
            page2.realmSet$chapterHeaders1405(null);
        } else {
            RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
            RealmList<ChapterHeader> realmList = new RealmList<>();
            page2.realmSet$chapterHeaders1405(realmList);
            int size = realmListRealmGet$chapterHeaders1405.size();
            for (int i13 = 0; i13 < size; i13++) {
                realmList.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createDetachedCopy(realmListRealmGet$chapterHeaders1405.get(i13), i12, i11, map));
            }
        }
        if (i10 == i11) {
            page2.realmSet$chapterHeaders1441(null);
        } else {
            RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
            RealmList<ChapterHeader> realmList2 = new RealmList<>();
            page2.realmSet$chapterHeaders1441(realmList2);
            int size2 = realmListRealmGet$chapterHeaders1441.size();
            for (int i14 = 0; i14 < size2; i14++) {
                realmList2.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createDetachedCopy(realmListRealmGet$chapterHeaders1441.get(i14), i12, i11, map));
            }
        }
        if (i10 == i11) {
            page2.realmSet$verses1405(null);
        } else {
            RealmList<Verse> realmListRealmGet$verses1405 = page.realmGet$verses1405();
            RealmList<Verse> realmList3 = new RealmList<>();
            page2.realmSet$verses1405(realmList3);
            int size3 = realmListRealmGet$verses1405.size();
            for (int i15 = 0; i15 < size3; i15++) {
                realmList3.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy(realmListRealmGet$verses1405.get(i15), i12, i11, map));
            }
        }
        if (i10 == i11) {
            page2.realmSet$verses1441(null);
            return page2;
        }
        RealmList<Verse> realmListRealmGet$verses1441 = page.realmGet$verses1441();
        RealmList<Verse> realmList4 = new RealmList<>();
        page2.realmSet$verses1441(realmList4);
        int size4 = realmListRealmGet$verses1441.size();
        for (int i16 = 0; i16 < size4; i16++) {
            realmList4.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy(realmListRealmGet$verses1441.get(i16), i12, i11, map));
        }
        return page2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "identifier", realmFieldType, true, false, true);
        builder.addPersistedProperty(NO_ALIAS, "number", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "isRight", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        builder.addPersistedLinkProperty(NO_ALIAS, "header1405", realmFieldType2, com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "header1441", realmFieldType2, com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        RealmFieldType realmFieldType3 = RealmFieldType.LIST;
        builder.addPersistedLinkProperty(NO_ALIAS, "chapterHeaders1405", realmFieldType3, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "chapterHeaders1441", realmFieldType3, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "verses1405", realmFieldType3, com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(NO_ALIAS, "verses1441", realmFieldType3, com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    public static Page createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_quran_PageRealmProxy com_ayah_dao_realm_model_quran_pagerealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(6);
        if (z10) {
            Table table = realm.getTable(Page.class);
            long jFindFirstLong = !jSONObject.isNull("identifier") ? table.findFirstLong(((PageColumnInfo) realm.getSchema().getColumnInfo(Page.class)).identifierColKey, jSONObject.getLong("identifier")) : -1L;
            if (jFindFirstLong != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstLong);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Page.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_quran_pagerealmproxy = new com_ayah_dao_realm_model_quran_PageRealmProxy();
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
                com_ayah_dao_realm_model_quran_pagerealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_quran_pagerealmproxy = null;
        }
        if (com_ayah_dao_realm_model_quran_pagerealmproxy == null) {
            if (jSONObject.has("header1405")) {
                arrayList.add("header1405");
            }
            if (jSONObject.has("header1441")) {
                arrayList.add("header1441");
            }
            if (jSONObject.has("chapterHeaders1405")) {
                arrayList.add("chapterHeaders1405");
            }
            if (jSONObject.has("chapterHeaders1441")) {
                arrayList.add("chapterHeaders1441");
            }
            if (jSONObject.has("verses1405")) {
                arrayList.add("verses1405");
            }
            if (jSONObject.has("verses1441")) {
                arrayList.add("verses1441");
            }
            if (!jSONObject.has("identifier")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'identifier'.");
            }
            com_ayah_dao_realm_model_quran_pagerealmproxy = jSONObject.isNull("identifier") ? (com_ayah_dao_realm_model_quran_PageRealmProxy) realm.createObjectInternal(Page.class, null, true, arrayList) : (com_ayah_dao_realm_model_quran_PageRealmProxy) realm.createObjectInternal(Page.class, Long.valueOf(jSONObject.getLong("identifier")), true, arrayList);
        }
        if (jSONObject.has("number")) {
            if (jSONObject.isNull("number")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
            }
            com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$number(jSONObject.getLong("number"));
        }
        if (jSONObject.has("isRight")) {
            if (jSONObject.isNull("isRight")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isRight' to null.");
            }
            com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$isRight(jSONObject.getBoolean("isRight"));
        }
        if (jSONObject.has("header1405")) {
            if (jSONObject.isNull("header1405")) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$header1405(null);
            } else {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$header1405(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("header1405"), z10));
            }
        }
        if (jSONObject.has("header1441")) {
            if (jSONObject.isNull("header1441")) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$header1441(null);
            } else {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$header1441(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("header1441"), z10));
            }
        }
        if (jSONObject.has("chapterHeaders1405")) {
            if (jSONObject.isNull("chapterHeaders1405")) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$chapterHeaders1405(null);
            } else {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$chapterHeaders1405().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("chapterHeaders1405");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$chapterHeaders1405().add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
                }
            }
        }
        if (jSONObject.has("chapterHeaders1441")) {
            if (jSONObject.isNull("chapterHeaders1441")) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$chapterHeaders1441(null);
            } else {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$chapterHeaders1441().clear();
                JSONArray jSONArray2 = jSONObject.getJSONArray("chapterHeaders1441");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$chapterHeaders1441().add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray2.getJSONObject(i11), z10));
                }
            }
        }
        if (jSONObject.has("verses1405")) {
            if (jSONObject.isNull("verses1405")) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$verses1405(null);
            } else {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$verses1405().clear();
                JSONArray jSONArray3 = jSONObject.getJSONArray("verses1405");
                for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                    com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$verses1405().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray3.getJSONObject(i12), z10));
                }
            }
        }
        if (jSONObject.has("verses1441")) {
            if (jSONObject.isNull("verses1441")) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmSet$verses1441(null);
                return com_ayah_dao_realm_model_quran_pagerealmproxy;
            }
            com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$verses1441().clear();
            JSONArray jSONArray4 = jSONObject.getJSONArray("verses1441");
            for (int i13 = 0; i13 < jSONArray4.length(); i13++) {
                com_ayah_dao_realm_model_quran_pagerealmproxy.realmGet$verses1441().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray4.getJSONObject(i13), z10));
            }
        }
        return com_ayah_dao_realm_model_quran_pagerealmproxy;
    }

    @TargetApi(11)
    public static Page createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Page page = new Page();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("identifier")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'identifier' to null.");
                }
                page.realmSet$identifier(jsonReader.nextLong());
                z10 = true;
            } else if (strNextName.equals("number")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'number' to null.");
                }
                page.realmSet$number(jsonReader.nextLong());
            } else if (strNextName.equals("isRight")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'isRight' to null.");
                }
                page.realmSet$isRight(jsonReader.nextBoolean());
            } else if (strNextName.equals("header1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    page.realmSet$header1405(null);
                } else {
                    page.realmSet$header1405(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("header1441")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    page.realmSet$header1441(null);
                } else {
                    page.realmSet$header1441(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("chapterHeaders1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    page.realmSet$chapterHeaders1405(null);
                } else {
                    page.realmSet$chapterHeaders1405(new RealmList<>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        page.realmGet$chapterHeaders1405().add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (strNextName.equals("chapterHeaders1441")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    page.realmSet$chapterHeaders1441(null);
                } else {
                    page.realmSet$chapterHeaders1441(new RealmList<>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        page.realmGet$chapterHeaders1441().add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (strNextName.equals("verses1405")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    page.realmSet$verses1405(null);
                } else {
                    page.realmSet$verses1405(new RealmList<>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        page.realmGet$verses1405().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!strNextName.equals("verses1441")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                page.realmSet$verses1441(null);
            } else {
                page.realmSet$verses1441(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    page.realmGet$verses1441().add(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Page) realm.copyToRealmOrUpdate(page, new ImportFlag[0]);
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
    public static long insert(Realm realm, Page page, Map<RealmModel, Long> map) {
        if ((page instanceof RealmObjectProxy) && !RealmObject.isFrozen(page)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) page;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Page.class);
        long nativePtr = table.getNativePtr();
        PageColumnInfo pageColumnInfo = (PageColumnInfo) realm.getSchema().getColumnInfo(Page.class);
        long j = pageColumnInfo.identifierColKey;
        Long lValueOf = Long.valueOf(page.realmGet$identifier());
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, page.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(page.realmGet$identifier()));
        } else {
            Table.throwDuplicatePrimaryKeyException(lValueOf);
        }
        map.put(page, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, pageColumnInfo.numberColKey, jNativeFindFirstInt, page.realmGet$number(), false);
        Table.nativeSetBoolean(nativePtr, pageColumnInfo.isRightColKey, jNativeFindFirstInt, page.realmGet$isRight(), false);
        PageHeader pageHeaderRealmGet$header1405 = page.realmGet$header1405();
        if (pageHeaderRealmGet$header1405 != null) {
            Long lValueOf2 = map.get(pageHeaderRealmGet$header1405);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, pageHeaderRealmGet$header1405, map));
            }
            Table.nativeSetLink(nativePtr, pageColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        }
        PageHeader pageHeaderRealmGet$header1441 = page.realmGet$header1441();
        if (pageHeaderRealmGet$header1441 != null) {
            Long lValueOf3 = map.get(pageHeaderRealmGet$header1441);
            if (lValueOf3 == null) {
                lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, pageHeaderRealmGet$header1441, map));
            }
            Table.nativeSetLink(nativePtr, pageColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
        }
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
        if (realmListRealmGet$chapterHeaders1405 != null) {
            OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1405ColKey);
            for (ChapterHeader chapterHeader : realmListRealmGet$chapterHeaders1405) {
                Long lValueOf4 = map.get(chapterHeader);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeader, map));
                }
                osList.addRow(lValueOf4.longValue());
            }
        }
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
        if (realmListRealmGet$chapterHeaders1441 != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1441ColKey);
            for (ChapterHeader chapterHeader2 : realmListRealmGet$chapterHeaders1441) {
                Long lValueOf5 = map.get(chapterHeader2);
                if (lValueOf5 == null) {
                    lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeader2, map));
                }
                osList2.addRow(lValueOf5.longValue());
            }
        }
        RealmList<Verse> realmListRealmGet$verses1405 = page.realmGet$verses1405();
        if (realmListRealmGet$verses1405 != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1405ColKey);
            for (Verse verse : realmListRealmGet$verses1405) {
                Long lValueOf6 = map.get(verse);
                if (lValueOf6 == null) {
                    lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                }
                osList3.addRow(lValueOf6.longValue());
            }
        }
        RealmList<Verse> realmListRealmGet$verses1441 = page.realmGet$verses1441();
        if (realmListRealmGet$verses1441 != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1441ColKey);
            for (Verse verse2 : realmListRealmGet$verses1441) {
                Long lValueOf7 = map.get(verse2);
                if (lValueOf7 == null) {
                    lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse2, map));
                }
                osList4.addRow(lValueOf7.longValue());
            }
        }
        return jNativeFindFirstInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Page page, Map<RealmModel, Long> map) {
        if ((page instanceof RealmObjectProxy) && !RealmObject.isFrozen(page)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) page;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Page.class);
        long nativePtr = table.getNativePtr();
        PageColumnInfo pageColumnInfo = (PageColumnInfo) realm.getSchema().getColumnInfo(Page.class);
        long j = pageColumnInfo.identifierColKey;
        page.realmGet$identifier();
        long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, page.realmGet$identifier());
        if (jNativeFindFirstInt == -1) {
            jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(page.realmGet$identifier()));
        }
        map.put(page, Long.valueOf(jNativeFindFirstInt));
        Table.nativeSetLong(nativePtr, pageColumnInfo.numberColKey, jNativeFindFirstInt, page.realmGet$number(), false);
        Table.nativeSetBoolean(nativePtr, pageColumnInfo.isRightColKey, jNativeFindFirstInt, page.realmGet$isRight(), false);
        PageHeader pageHeaderRealmGet$header1405 = page.realmGet$header1405();
        if (pageHeaderRealmGet$header1405 != null) {
            Long lValueOf = map.get(pageHeaderRealmGet$header1405);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, pageHeaderRealmGet$header1405, map));
            }
            Table.nativeSetLink(nativePtr, pageColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, pageColumnInfo.header1405ColKey, jNativeFindFirstInt);
        }
        PageHeader pageHeaderRealmGet$header1441 = page.realmGet$header1441();
        if (pageHeaderRealmGet$header1441 != null) {
            Long lValueOf2 = map.get(pageHeaderRealmGet$header1441);
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, pageHeaderRealmGet$header1441, map));
            }
            Table.nativeSetLink(nativePtr, pageColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, pageColumnInfo.header1441ColKey, jNativeFindFirstInt);
        }
        OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1405ColKey);
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
        int iQ = 0;
        if (realmListRealmGet$chapterHeaders1405 == null || realmListRealmGet$chapterHeaders1405.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$chapterHeaders1405 != null) {
                for (ChapterHeader chapterHeader : realmListRealmGet$chapterHeaders1405) {
                    Long lValueOf3 = map.get(chapterHeader);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader, map));
                    }
                    osList.addRow(lValueOf3.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$chapterHeaders1405.size();
            int iQ2 = 0;
            while (iQ2 < size) {
                ChapterHeader chapterHeader2 = realmListRealmGet$chapterHeaders1405.get(iQ2);
                Long lValueOf4 = map.get(chapterHeader2);
                if (lValueOf4 == null) {
                    lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader2, map));
                }
                iQ2 = p.q(lValueOf4, osList, iQ2, iQ2, 1);
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1441ColKey);
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
        if (realmListRealmGet$chapterHeaders1441 == null || realmListRealmGet$chapterHeaders1441.size() != osList2.size()) {
            osList2.removeAll();
            if (realmListRealmGet$chapterHeaders1441 != null) {
                for (ChapterHeader chapterHeader3 : realmListRealmGet$chapterHeaders1441) {
                    Long lValueOf5 = map.get(chapterHeader3);
                    if (lValueOf5 == null) {
                        lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader3, map));
                    }
                    osList2.addRow(lValueOf5.longValue());
                }
            }
        } else {
            int size2 = realmListRealmGet$chapterHeaders1441.size();
            int iQ3 = 0;
            while (iQ3 < size2) {
                ChapterHeader chapterHeader4 = realmListRealmGet$chapterHeaders1441.get(iQ3);
                Long lValueOf6 = map.get(chapterHeader4);
                if (lValueOf6 == null) {
                    lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader4, map));
                }
                iQ3 = p.q(lValueOf6, osList2, iQ3, iQ3, 1);
            }
        }
        OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1405ColKey);
        RealmList<Verse> realmListRealmGet$verses1405 = page.realmGet$verses1405();
        if (realmListRealmGet$verses1405 == null || realmListRealmGet$verses1405.size() != osList3.size()) {
            osList3.removeAll();
            if (realmListRealmGet$verses1405 != null) {
                for (Verse verse : realmListRealmGet$verses1405) {
                    Long lValueOf7 = map.get(verse);
                    if (lValueOf7 == null) {
                        lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                    }
                    osList3.addRow(lValueOf7.longValue());
                }
            }
        } else {
            int size3 = realmListRealmGet$verses1405.size();
            int iQ4 = 0;
            while (iQ4 < size3) {
                Verse verse2 = realmListRealmGet$verses1405.get(iQ4);
                Long lValueOf8 = map.get(verse2);
                if (lValueOf8 == null) {
                    lValueOf8 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                }
                iQ4 = p.q(lValueOf8, osList3, iQ4, iQ4, 1);
            }
        }
        OsList osList4 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1441ColKey);
        RealmList<Verse> realmListRealmGet$verses1441 = page.realmGet$verses1441();
        if (realmListRealmGet$verses1441 == null || realmListRealmGet$verses1441.size() != osList4.size()) {
            osList4.removeAll();
            if (realmListRealmGet$verses1441 != null) {
                for (Verse verse3 : realmListRealmGet$verses1441) {
                    Long lValueOf9 = map.get(verse3);
                    if (lValueOf9 == null) {
                        lValueOf9 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse3, map));
                    }
                    osList4.addRow(lValueOf9.longValue());
                }
            }
        } else {
            int size4 = realmListRealmGet$verses1441.size();
            while (iQ < size4) {
                Verse verse4 = realmListRealmGet$verses1441.get(iQ);
                Long lValueOf10 = map.get(verse4);
                if (lValueOf10 == null) {
                    lValueOf10 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse4, map));
                }
                iQ = p.q(lValueOf10, osList4, iQ, iQ, 1);
            }
        }
        return jNativeFindFirstInt;
    }

    public static com_ayah_dao_realm_model_quran_PageRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Page.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_quran_PageRealmProxy com_ayah_dao_realm_model_quran_pagerealmproxy = new com_ayah_dao_realm_model_quran_PageRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_quran_pagerealmproxy;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0075  */
    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0127  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Code duplicated, block: B:46:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0154  */
    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:52:0x0174  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x018f  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    public static Page update(Realm realm, PageColumnInfo pageColumnInfo, Page page, Page page2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        PageHeader pageHeaderRealmGet$header1441;
        PageHeader pageHeader;
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405;
        int i10;
        RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441;
        RealmList<Verse> realmListRealmGet$verses1405;
        RealmList<Verse> realmListRealmGet$verses1441;
        RealmList realmList;
        Verse verse;
        Verse verse2;
        RealmList realmList2;
        int i11;
        Verse verse3;
        Verse verse4;
        RealmList realmList3;
        int i12;
        ChapterHeader chapterHeader;
        ChapterHeader chapterHeader2;
        RealmList realmList4;
        int i13;
        ChapterHeader chapterHeader3;
        ChapterHeader chapterHeader4;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Page.class), set);
        osObjectBuilder.addInteger(pageColumnInfo.identifierColKey, Long.valueOf(page2.realmGet$identifier()));
        osObjectBuilder.addInteger(pageColumnInfo.numberColKey, Long.valueOf(page2.realmGet$number()));
        osObjectBuilder.addBoolean(pageColumnInfo.isRightColKey, Boolean.valueOf(page2.realmGet$isRight()));
        PageHeader pageHeaderRealmGet$header1405 = page2.realmGet$header1405();
        if (pageHeaderRealmGet$header1405 != null) {
            PageHeader pageHeader2 = (PageHeader) map.get(pageHeaderRealmGet$header1405);
            if (pageHeader2 != null) {
                osObjectBuilder.addObject(pageColumnInfo.header1405ColKey, pageHeader2);
            } else {
                realm2 = realm;
                map2 = map;
                set2 = set;
                osObjectBuilder.addObject(pageColumnInfo.header1405ColKey, com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class), pageHeaderRealmGet$header1405, true, map2, set2));
            }
            pageHeaderRealmGet$header1441 = page2.realmGet$header1441();
            if (pageHeaderRealmGet$header1441 == null) {
                osObjectBuilder.addNull(pageColumnInfo.header1441ColKey);
            } else {
                pageHeader = (PageHeader) map2.get(pageHeaderRealmGet$header1441);
                if (pageHeader != null) {
                    osObjectBuilder.addObject(pageColumnInfo.header1441ColKey, pageHeader);
                } else {
                    osObjectBuilder.addObject(pageColumnInfo.header1441ColKey, com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm2.getSchema().getColumnInfo(PageHeader.class), pageHeaderRealmGet$header1441, true, map2, set2));
                }
            }
            realmListRealmGet$chapterHeaders1405 = page2.realmGet$chapterHeaders1405();
            if (realmListRealmGet$chapterHeaders1405 != null) {
                realmList4 = new RealmList();
                for (i13 = 0; i13 < realmListRealmGet$chapterHeaders1405.size(); i13++) {
                    chapterHeader3 = realmListRealmGet$chapterHeaders1405.get(i13);
                    chapterHeader4 = (ChapterHeader) map2.get(chapterHeader3);
                    if (chapterHeader4 != null) {
                        realmList4.add(chapterHeader4);
                    } else {
                        realmList4.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader3, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1405ColKey, realmList4);
            } else {
                osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1405ColKey, new RealmList());
            }
            realmListRealmGet$chapterHeaders1441 = page2.realmGet$chapterHeaders1441();
            if (realmListRealmGet$chapterHeaders1441 != null) {
                realmList3 = new RealmList();
                for (i12 = 0; i12 < realmListRealmGet$chapterHeaders1441.size(); i12++) {
                    chapterHeader = realmListRealmGet$chapterHeaders1441.get(i12);
                    chapterHeader2 = (ChapterHeader) map2.get(chapterHeader);
                    if (chapterHeader2 != null) {
                        realmList3.add(chapterHeader2);
                    } else {
                        realmList3.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1441ColKey, realmList3);
            } else {
                osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1441ColKey, new RealmList());
            }
            realmListRealmGet$verses1405 = page2.realmGet$verses1405();
            if (realmListRealmGet$verses1405 != null) {
                realmList2 = new RealmList();
                for (i11 = 0; i11 < realmListRealmGet$verses1405.size(); i11++) {
                    verse3 = realmListRealmGet$verses1405.get(i11);
                    verse4 = (Verse) map2.get(verse3);
                    if (verse4 != null) {
                        realmList2.add(verse4);
                    } else {
                        realmList2.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse3, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(pageColumnInfo.verses1405ColKey, realmList2);
            } else {
                osObjectBuilder.addObjectList(pageColumnInfo.verses1405ColKey, new RealmList());
            }
            realmListRealmGet$verses1441 = page2.realmGet$verses1441();
            if (realmListRealmGet$verses1441 != null) {
                realmList = new RealmList();
                for (i10 = 0; i10 < realmListRealmGet$verses1441.size(); i10++) {
                    verse = realmListRealmGet$verses1441.get(i10);
                    verse2 = (Verse) map2.get(verse);
                    if (verse2 != null) {
                        realmList.add(verse2);
                    } else {
                        realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(pageColumnInfo.verses1441ColKey, realmList);
            } else {
                osObjectBuilder.addObjectList(pageColumnInfo.verses1441ColKey, new RealmList());
            }
            osObjectBuilder.updateExistingTopLevelObject();
            return page;
        }
        osObjectBuilder.addNull(pageColumnInfo.header1405ColKey);
        realm2 = realm;
        map2 = map;
        set2 = set;
        pageHeaderRealmGet$header1441 = page2.realmGet$header1441();
        if (pageHeaderRealmGet$header1441 == null) {
            osObjectBuilder.addNull(pageColumnInfo.header1441ColKey);
        } else {
            pageHeader = (PageHeader) map2.get(pageHeaderRealmGet$header1441);
            if (pageHeader != null) {
                osObjectBuilder.addObject(pageColumnInfo.header1441ColKey, pageHeader);
            } else {
                osObjectBuilder.addObject(pageColumnInfo.header1441ColKey, com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm2.getSchema().getColumnInfo(PageHeader.class), pageHeaderRealmGet$header1441, true, map2, set2));
            }
        }
        realmListRealmGet$chapterHeaders1405 = page2.realmGet$chapterHeaders1405();
        if (realmListRealmGet$chapterHeaders1405 != null) {
            realmList4 = new RealmList();
            while (i13 < realmListRealmGet$chapterHeaders1405.size()) {
                chapterHeader3 = realmListRealmGet$chapterHeaders1405.get(i13);
                chapterHeader4 = (ChapterHeader) map2.get(chapterHeader3);
                if (chapterHeader4 != null) {
                    realmList4.add(chapterHeader4);
                } else {
                    realmList4.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader3, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1405ColKey, realmList4);
        } else {
            osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1405ColKey, new RealmList());
        }
        realmListRealmGet$chapterHeaders1441 = page2.realmGet$chapterHeaders1441();
        if (realmListRealmGet$chapterHeaders1441 != null) {
            realmList3 = new RealmList();
            while (i12 < realmListRealmGet$chapterHeaders1441.size()) {
                chapterHeader = realmListRealmGet$chapterHeaders1441.get(i12);
                chapterHeader2 = (ChapterHeader) map2.get(chapterHeader);
                if (chapterHeader2 != null) {
                    realmList3.add(chapterHeader2);
                } else {
                    realmList3.add(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm2.getSchema().getColumnInfo(ChapterHeader.class), chapterHeader, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1441ColKey, realmList3);
        } else {
            osObjectBuilder.addObjectList(pageColumnInfo.chapterHeaders1441ColKey, new RealmList());
        }
        realmListRealmGet$verses1405 = page2.realmGet$verses1405();
        if (realmListRealmGet$verses1405 != null) {
            realmList2 = new RealmList();
            while (i11 < realmListRealmGet$verses1405.size()) {
                verse3 = realmListRealmGet$verses1405.get(i11);
                verse4 = (Verse) map2.get(verse3);
                if (verse4 != null) {
                    realmList2.add(verse4);
                } else {
                    realmList2.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse3, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(pageColumnInfo.verses1405ColKey, realmList2);
        } else {
            osObjectBuilder.addObjectList(pageColumnInfo.verses1405ColKey, new RealmList());
        }
        realmListRealmGet$verses1441 = page2.realmGet$verses1441();
        if (realmListRealmGet$verses1441 != null) {
            realmList = new RealmList();
            while (i10 < realmListRealmGet$verses1441.size()) {
                verse = realmListRealmGet$verses1441.get(i10);
                verse2 = (Verse) map2.get(verse);
                if (verse2 != null) {
                    realmList.add(verse2);
                } else {
                    realmList.add(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm2.getSchema().getColumnInfo(Verse.class), verse, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(pageColumnInfo.verses1441ColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(pageColumnInfo.verses1441ColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return page;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_quran_PageRealmProxy com_ayah_dao_realm_model_quran_pagerealmproxy = (com_ayah_dao_realm_model_quran_PageRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_quran_pagerealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_quran_pagerealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_quran_pagerealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (PageColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Page> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList<ChapterHeader> realmGet$chapterHeaders1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<ChapterHeader> realmList = this.chapterHeaders1405RealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<ChapterHeader> realmList2 = new RealmList<>((Class<ChapterHeader>) ChapterHeader.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.chapterHeaders1405ColKey), this.proxyState.getRealm$realm());
        this.chapterHeaders1405RealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList<ChapterHeader> realmGet$chapterHeaders1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<ChapterHeader> realmList = this.chapterHeaders1441RealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<ChapterHeader> realmList2 = new RealmList<>((Class<ChapterHeader>) ChapterHeader.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.chapterHeaders1441ColKey), this.proxyState.getRealm$realm());
        this.chapterHeaders1441RealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public PageHeader realmGet$header1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.header1405ColKey)) {
            return null;
        }
        return (PageHeader) this.proxyState.getRealm$realm().get(PageHeader.class, this.proxyState.getRow$realm().getLink(this.columnInfo.header1405ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public PageHeader realmGet$header1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.header1441ColKey)) {
            return null;
        }
        return (PageHeader) this.proxyState.getRealm$realm().get(PageHeader.class, this.proxyState.getRow$realm().getLink(this.columnInfo.header1441ColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public long realmGet$identifier() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.identifierColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public boolean realmGet$isRight() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isRightColKey);
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public long realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.numberColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList<Verse> realmGet$verses1405() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Verse> realmList = this.verses1405RealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Verse> realmList2 = new RealmList<>((Class<Verse>) Verse.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.verses1405ColKey), this.proxyState.getRealm$realm());
        this.verses1405RealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList<Verse> realmGet$verses1441() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Verse> realmList = this.verses1441RealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Verse> realmList2 = new RealmList<>((Class<Verse>) Verse.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.verses1441ColKey), this.proxyState.getRealm$realm());
        this.verses1441RealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$chapterHeaders1405(RealmList<ChapterHeader> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("chapterHeaders1405")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<ChapterHeader> realmList2 = new RealmList<>();
                for (ChapterHeader chapterHeader : realmList) {
                    if (chapterHeader == null || RealmObject.isManaged(chapterHeader)) {
                        realmList2.add(chapterHeader);
                    } else {
                        realmList2.add((ChapterHeader) realm.copyToRealm(chapterHeader, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.chapterHeaders1405ColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (ChapterHeader) realmList.get(i10);
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
            RealmModel realmModel2 = (ChapterHeader) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$chapterHeaders1441(RealmList<ChapterHeader> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("chapterHeaders1441")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<ChapterHeader> realmList2 = new RealmList<>();
                for (ChapterHeader chapterHeader : realmList) {
                    if (chapterHeader == null || RealmObject.isManaged(chapterHeader)) {
                        realmList2.add(chapterHeader);
                    } else {
                        realmList2.add((ChapterHeader) realm.copyToRealm(chapterHeader, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.chapterHeaders1441ColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (ChapterHeader) realmList.get(i10);
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
            RealmModel realmModel2 = (ChapterHeader) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$header1405(PageHeader pageHeader) {
        PageHeader pageHeader2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (pageHeader == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.header1405ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(pageHeader);
                this.proxyState.getRow$realm().setLink(this.columnInfo.header1405ColKey, ((RealmObjectProxy) pageHeader).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("header1405")) {
                pageHeader2 = pageHeader;
                return;
            }
            if (pageHeader != 0) {
                boolean zIsManaged = RealmObject.isManaged(pageHeader);
                pageHeader2 = pageHeader;
                if (!zIsManaged) {
                    pageHeader2 = (PageHeader) realm.copyToRealm(pageHeader, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (pageHeader2 == 0) {
                row$realm.nullifyLink(this.columnInfo.header1405ColKey);
            } else {
                this.proxyState.checkValidObject(pageHeader2);
                row$realm.getTable().setLink(this.columnInfo.header1405ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) pageHeader2), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$header1441(PageHeader pageHeader) {
        PageHeader pageHeader2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (pageHeader == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.header1441ColKey);
                return;
            } else {
                this.proxyState.checkValidObject(pageHeader);
                this.proxyState.getRow$realm().setLink(this.columnInfo.header1441ColKey, ((RealmObjectProxy) pageHeader).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("header1441")) {
                pageHeader2 = pageHeader;
                return;
            }
            if (pageHeader != 0) {
                boolean zIsManaged = RealmObject.isManaged(pageHeader);
                pageHeader2 = pageHeader;
                if (!zIsManaged) {
                    pageHeader2 = (PageHeader) realm.copyToRealm(pageHeader, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (pageHeader2 == 0) {
                row$realm.nullifyLink(this.columnInfo.header1441ColKey);
            } else {
                this.proxyState.checkValidObject(pageHeader2);
                row$realm.getTable().setLink(this.columnInfo.header1441ColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) pageHeader2), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$identifier(long j) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'identifier' cannot be changed after object was created.");
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$isRight(boolean z10) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isRightColKey, z10);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isRightColKey, row$realm.getObjectKey(), z10, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$number(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.numberColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.numberColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$verses1405(RealmList<Verse> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("verses1405")) {
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.verses1405ColKey);
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

    @Override // com.ayah.dao.realm.model.quran.Page, io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$verses1441(RealmList<Verse> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("verses1441")) {
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.verses1441ColKey);
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
        StringBuilder sb = new StringBuilder("Page = proxy[{identifier:");
        sb.append(realmGet$identifier());
        sb.append("},{number:");
        sb.append(realmGet$number());
        sb.append("},{isRight:");
        sb.append(realmGet$isRight());
        sb.append("},{header1405:");
        sb.append(realmGet$header1405() != null ? com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{header1441:");
        sb.append(realmGet$header1441() != null ? com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{chapterHeaders1405:RealmList<ChapterHeader>[");
        sb.append(realmGet$chapterHeaders1405().size());
        sb.append("]},{chapterHeaders1441:RealmList<ChapterHeader>[");
        sb.append(realmGet$chapterHeaders1441().size());
        sb.append("]},{verses1405:RealmList<Verse>[");
        sb.append(realmGet$verses1405().size());
        sb.append("]},{verses1441:RealmList<Verse>[");
        sb.append(realmGet$verses1441().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Page.class);
        long nativePtr = table.getNativePtr();
        PageColumnInfo pageColumnInfo = (PageColumnInfo) realm.getSchema().getColumnInfo(Page.class);
        long j = pageColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Page page = (Page) it.next();
            if (!map.containsKey(page)) {
                if ((page instanceof RealmObjectProxy) && !RealmObject.isFrozen(page)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) page;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(page, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Long lValueOf = Long.valueOf(page.realmGet$identifier());
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j, page.realmGet$identifier());
                long j10 = j;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j10, Long.valueOf(page.realmGet$identifier()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(lValueOf);
                }
                map.put(page, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, pageColumnInfo.numberColKey, jNativeFindFirstInt, page.realmGet$number(), false);
                Table.nativeSetBoolean(nativePtr, pageColumnInfo.isRightColKey, jNativeFindFirstInt, page.realmGet$isRight(), false);
                PageHeader pageHeaderRealmGet$header1405 = page.realmGet$header1405();
                if (pageHeaderRealmGet$header1405 != null) {
                    Long lValueOf2 = map.get(pageHeaderRealmGet$header1405);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, pageHeaderRealmGet$header1405, map));
                    }
                    Table.nativeSetLink(nativePtr, pageColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                }
                PageHeader pageHeaderRealmGet$header1441 = page.realmGet$header1441();
                if (pageHeaderRealmGet$header1441 != null) {
                    Long lValueOf3 = map.get(pageHeaderRealmGet$header1441);
                    if (lValueOf3 == null) {
                        lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, pageHeaderRealmGet$header1441, map));
                    }
                    Table.nativeSetLink(nativePtr, pageColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf3.longValue(), false);
                }
                RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
                if (realmListRealmGet$chapterHeaders1405 != null) {
                    OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1405ColKey);
                    for (ChapterHeader chapterHeader : realmListRealmGet$chapterHeaders1405) {
                        Long lValueOf4 = map.get(chapterHeader);
                        if (lValueOf4 == null) {
                            lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeader, map));
                        }
                        osList.addRow(lValueOf4.longValue());
                    }
                }
                RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
                if (realmListRealmGet$chapterHeaders1441 != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1441ColKey);
                    for (ChapterHeader chapterHeader2 : realmListRealmGet$chapterHeaders1441) {
                        Long lValueOf5 = map.get(chapterHeader2);
                        if (lValueOf5 == null) {
                            lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, chapterHeader2, map));
                        }
                        osList2.addRow(lValueOf5.longValue());
                    }
                }
                RealmList<Verse> realmListRealmGet$verses1405 = page.realmGet$verses1405();
                if (realmListRealmGet$verses1405 != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1405ColKey);
                    for (Verse verse : realmListRealmGet$verses1405) {
                        Long lValueOf6 = map.get(verse);
                        if (lValueOf6 == null) {
                            lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse, map));
                        }
                        osList3.addRow(lValueOf6.longValue());
                    }
                }
                RealmList<Verse> realmListRealmGet$verses1441 = page.realmGet$verses1441();
                if (realmListRealmGet$verses1441 != null) {
                    OsList osList4 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1441ColKey);
                    for (Verse verse2 : realmListRealmGet$verses1441) {
                        Long lValueOf7 = map.get(verse2);
                        if (lValueOf7 == null) {
                            lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, verse2, map));
                        }
                        osList4.addRow(lValueOf7.longValue());
                    }
                }
                j = j10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Table table = realm.getTable(Page.class);
        long nativePtr = table.getNativePtr();
        PageColumnInfo pageColumnInfo = (PageColumnInfo) realm.getSchema().getColumnInfo(Page.class);
        long j10 = pageColumnInfo.identifierColKey;
        while (it.hasNext()) {
            Page page = (Page) it.next();
            if (!map.containsKey(page)) {
                if ((page instanceof RealmObjectProxy) && !RealmObject.isFrozen(page)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) page;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(page, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                page.realmGet$identifier();
                long jNativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j10, page.realmGet$identifier());
                long j11 = j10;
                if (jNativeFindFirstInt == -1) {
                    jNativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j11, Long.valueOf(page.realmGet$identifier()));
                }
                map.put(page, Long.valueOf(jNativeFindFirstInt));
                Table.nativeSetLong(nativePtr, pageColumnInfo.numberColKey, jNativeFindFirstInt, page.realmGet$number(), false);
                Table.nativeSetBoolean(nativePtr, pageColumnInfo.isRightColKey, jNativeFindFirstInt, page.realmGet$isRight(), false);
                PageHeader pageHeaderRealmGet$header1405 = page.realmGet$header1405();
                if (pageHeaderRealmGet$header1405 != null) {
                    Long lValueOf = map.get(pageHeaderRealmGet$header1405);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, pageHeaderRealmGet$header1405, map));
                    }
                    Table.nativeSetLink(nativePtr, pageColumnInfo.header1405ColKey, jNativeFindFirstInt, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, pageColumnInfo.header1405ColKey, jNativeFindFirstInt);
                }
                PageHeader pageHeaderRealmGet$header1441 = page.realmGet$header1441();
                if (pageHeaderRealmGet$header1441 != null) {
                    Long lValueOf2 = map.get(pageHeaderRealmGet$header1441);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, pageHeaderRealmGet$header1441, map));
                    }
                    Table.nativeSetLink(nativePtr, pageColumnInfo.header1441ColKey, jNativeFindFirstInt, lValueOf2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, pageColumnInfo.header1441ColKey, jNativeFindFirstInt);
                }
                OsList osList = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1405ColKey);
                RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1405 = page.realmGet$chapterHeaders1405();
                if (realmListRealmGet$chapterHeaders1405 != null && realmListRealmGet$chapterHeaders1405.size() == osList.size()) {
                    int size = realmListRealmGet$chapterHeaders1405.size();
                    int iQ = 0;
                    while (iQ < size) {
                        ChapterHeader chapterHeader = realmListRealmGet$chapterHeaders1405.get(iQ);
                        Long lValueOf3 = map.get(chapterHeader);
                        if (lValueOf3 == null) {
                            lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader, map));
                        }
                        iQ = p.q(lValueOf3, osList, iQ, iQ, 1);
                        nativePtr = nativePtr;
                    }
                    j = nativePtr;
                } else {
                    j = nativePtr;
                    osList.removeAll();
                    if (realmListRealmGet$chapterHeaders1405 != null) {
                        for (ChapterHeader chapterHeader2 : realmListRealmGet$chapterHeaders1405) {
                            Long lValueOf4 = map.get(chapterHeader2);
                            if (lValueOf4 == null) {
                                lValueOf4 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader2, map));
                            }
                            osList.addRow(lValueOf4.longValue());
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.chapterHeaders1441ColKey);
                RealmList<ChapterHeader> realmListRealmGet$chapterHeaders1441 = page.realmGet$chapterHeaders1441();
                if (realmListRealmGet$chapterHeaders1441 != null && realmListRealmGet$chapterHeaders1441.size() == osList2.size()) {
                    int size2 = realmListRealmGet$chapterHeaders1441.size();
                    int iQ2 = 0;
                    while (iQ2 < size2) {
                        ChapterHeader chapterHeader3 = realmListRealmGet$chapterHeaders1441.get(iQ2);
                        Long lValueOf5 = map.get(chapterHeader3);
                        if (lValueOf5 == null) {
                            lValueOf5 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader3, map));
                        }
                        iQ2 = p.q(lValueOf5, osList2, iQ2, iQ2, 1);
                    }
                } else {
                    osList2.removeAll();
                    if (realmListRealmGet$chapterHeaders1441 != null) {
                        for (ChapterHeader chapterHeader4 : realmListRealmGet$chapterHeaders1441) {
                            Long lValueOf6 = map.get(chapterHeader4);
                            if (lValueOf6 == null) {
                                lValueOf6 = Long.valueOf(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, chapterHeader4, map));
                            }
                            osList2.addRow(lValueOf6.longValue());
                        }
                    }
                }
                OsList osList3 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1405ColKey);
                RealmList<Verse> realmListRealmGet$verses1405 = page.realmGet$verses1405();
                if (realmListRealmGet$verses1405 != null && realmListRealmGet$verses1405.size() == osList3.size()) {
                    int size3 = realmListRealmGet$verses1405.size();
                    int iQ3 = 0;
                    while (iQ3 < size3) {
                        Verse verse = realmListRealmGet$verses1405.get(iQ3);
                        Long lValueOf7 = map.get(verse);
                        if (lValueOf7 == null) {
                            lValueOf7 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse, map));
                        }
                        iQ3 = p.q(lValueOf7, osList3, iQ3, iQ3, 1);
                    }
                } else {
                    osList3.removeAll();
                    if (realmListRealmGet$verses1405 != null) {
                        for (Verse verse2 : realmListRealmGet$verses1405) {
                            Long lValueOf8 = map.get(verse2);
                            if (lValueOf8 == null) {
                                lValueOf8 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse2, map));
                            }
                            osList3.addRow(lValueOf8.longValue());
                        }
                    }
                }
                OsList osList4 = new OsList(table.getUncheckedRow(jNativeFindFirstInt), pageColumnInfo.verses1441ColKey);
                RealmList<Verse> realmListRealmGet$verses1441 = page.realmGet$verses1441();
                if (realmListRealmGet$verses1441 != null && realmListRealmGet$verses1441.size() == osList4.size()) {
                    int size4 = realmListRealmGet$verses1441.size();
                    int iQ4 = 0;
                    while (iQ4 < size4) {
                        Verse verse3 = realmListRealmGet$verses1441.get(iQ4);
                        Long lValueOf9 = map.get(verse3);
                        if (lValueOf9 == null) {
                            lValueOf9 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse3, map));
                        }
                        iQ4 = p.q(lValueOf9, osList4, iQ4, iQ4, 1);
                    }
                } else {
                    osList4.removeAll();
                    if (realmListRealmGet$verses1441 != null) {
                        for (Verse verse4 : realmListRealmGet$verses1441) {
                            Long lValueOf10 = map.get(verse4);
                            if (lValueOf10 == null) {
                                lValueOf10 = Long.valueOf(com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, verse4, map));
                            }
                            osList4.addRow(lValueOf10.longValue());
                        }
                    }
                }
                j10 = j11;
                nativePtr = j;
            }
        }
    }
}
