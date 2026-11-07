package io.realm;

import android.util.JsonReader;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.PageHeader;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Section;
import com.ayah.dao.realm.model.quran.Verse;
import com.ayah.dao.realm.model.quran.VerseHighlight;
import com.ayah.dao.realm.model.quran.VerseMarker;
import io.realm.annotations.RealmModule;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RealmModule
class QuranModuleMediator extends RealmProxyMediator {
    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;

    static {
        HashSet hashSet = new HashSet(10);
        hashSet.add(VerseMarker.class);
        hashSet.add(VerseHighlight.class);
        hashSet.add(Verse.class);
        hashSet.add(Section.class);
        hashSet.add(Quarter.class);
        hashSet.add(Part.class);
        hashSet.add(PageHeader.class);
        hashSet.add(Page.class);
        hashSet.add(ChapterHeader.class);
        hashSet.add(Chapter.class);
        MODEL_CLASSES = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E e10, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<?> superclass = e10 instanceof RealmObjectProxy ? e10.getClass().getSuperclass() : e10.getClass();
        if (superclass.equals(VerseMarker.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.VerseMarkerColumnInfo) realm.getSchema().getColumnInfo(VerseMarker.class), (VerseMarker) e10, z10, map, set));
        }
        if (superclass.equals(VerseHighlight.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.VerseHighlightColumnInfo) realm.getSchema().getColumnInfo(VerseHighlight.class), (VerseHighlight) e10, z10, map, set));
        }
        if (superclass.equals(Verse.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_VerseRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_VerseRealmProxy.VerseColumnInfo) realm.getSchema().getColumnInfo(Verse.class), (Verse) e10, z10, map, set));
        }
        if (superclass.equals(Section.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_SectionRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_SectionRealmProxy.SectionColumnInfo) realm.getSchema().getColumnInfo(Section.class), (Section) e10, z10, map, set));
        }
        if (superclass.equals(Quarter.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_QuarterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_QuarterRealmProxy.QuarterColumnInfo) realm.getSchema().getColumnInfo(Quarter.class), (Quarter) e10, z10, map, set));
        }
        if (superclass.equals(Part.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_PartRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_PartRealmProxy.PartColumnInfo) realm.getSchema().getColumnInfo(Part.class), (Part) e10, z10, map, set));
        }
        if (superclass.equals(PageHeader.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.PageHeaderColumnInfo) realm.getSchema().getColumnInfo(PageHeader.class), (PageHeader) e10, z10, map, set));
        }
        if (superclass.equals(Page.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_PageRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_PageRealmProxy.PageColumnInfo) realm.getSchema().getColumnInfo(Page.class), (Page) e10, z10, map, set));
        }
        if (superclass.equals(ChapterHeader.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ChapterHeaderColumnInfo) realm.getSchema().getColumnInfo(ChapterHeader.class), (ChapterHeader) e10, z10, map, set));
        }
        if (superclass.equals(Chapter.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_ChapterRealmProxy.copyOrUpdate(realm, (com_ayah_dao_realm_model_quran_ChapterRealmProxy.ChapterColumnInfo) realm.getSchema().getColumnInfo(Chapter.class), (Chapter) e10, z10, map, set));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(VerseMarker.class)) {
            return com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(VerseHighlight.class)) {
            return com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Verse.class)) {
            return com_ayah_dao_realm_model_quran_VerseRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Section.class)) {
            return com_ayah_dao_realm_model_quran_SectionRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Quarter.class)) {
            return com_ayah_dao_realm_model_quran_QuarterRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Part.class)) {
            return com_ayah_dao_realm_model_quran_PartRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(PageHeader.class)) {
            return com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Page.class)) {
            return com_ayah_dao_realm_model_quran_PageRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(ChapterHeader.class)) {
            return com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Chapter.class)) {
            return com_ayah_dao_realm_model_quran_ChapterRealmProxy.createColumnInfo(osSchemaInfo);
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createDetachedCopy(E e10, int i10, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Class<? super Object> superclass = e10.getClass().getSuperclass();
        if (superclass.equals(VerseMarker.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createDetachedCopy((VerseMarker) e10, 0, i10, map));
        }
        if (superclass.equals(VerseHighlight.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createDetachedCopy((VerseHighlight) e10, 0, i10, map));
        }
        if (superclass.equals(Verse.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_VerseRealmProxy.createDetachedCopy((Verse) e10, 0, i10, map));
        }
        if (superclass.equals(Section.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_SectionRealmProxy.createDetachedCopy((Section) e10, 0, i10, map));
        }
        if (superclass.equals(Quarter.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createDetachedCopy((Quarter) e10, 0, i10, map));
        }
        if (superclass.equals(Part.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_PartRealmProxy.createDetachedCopy((Part) e10, 0, i10, map));
        }
        if (superclass.equals(PageHeader.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createDetachedCopy((PageHeader) e10, 0, i10, map));
        }
        if (superclass.equals(Page.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_PageRealmProxy.createDetachedCopy((Page) e10, 0, i10, map));
        }
        if (superclass.equals(ChapterHeader.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createDetachedCopy((ChapterHeader) e10, 0, i10, map));
        }
        if (superclass.equals(Chapter.class)) {
            return (E) superclass.cast(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createDetachedCopy((Chapter) e10, 0, i10, map));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> cls, Realm realm, JSONObject jSONObject, boolean z10) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(VerseMarker.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(VerseHighlight.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Verse.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_VerseRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Section.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_SectionRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Quarter.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Part.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_PartRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(PageHeader.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Page.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_PageRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(ChapterHeader.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        if (cls.equals(Chapter.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z10));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createUsingJsonStream(Class<E> cls, Realm realm, JsonReader jsonReader) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(VerseMarker.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(VerseHighlight.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Verse.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_VerseRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Section.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_SectionRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Quarter.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_QuarterRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Part.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_PartRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(PageHeader.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Page.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_PageRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(ChapterHeader.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Chapter.class)) {
            return cls.cast(com_ayah_dao_realm_model_quran_ChapterRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Class<? extends RealmModel> getClazzImpl(String str) {
        RealmProxyMediator.checkClassName(str);
        if (str.equals(com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return VerseMarker.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return VerseHighlight.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Verse.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_SectionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Section.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Quarter.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Part.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return PageHeader.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Page.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return ChapterHeader.class;
        }
        if (str.equals(com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return Chapter.class;
        }
        throw RealmProxyMediator.getMissingProxyClassException(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        HashMap map = new HashMap(10);
        map.put(VerseMarker.class, com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.getExpectedObjectSchemaInfo());
        map.put(VerseHighlight.class, com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Verse.class, com_ayah_dao_realm_model_quran_VerseRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Section.class, com_ayah_dao_realm_model_quran_SectionRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Quarter.class, com_ayah_dao_realm_model_quran_QuarterRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Part.class, com_ayah_dao_realm_model_quran_PartRealmProxy.getExpectedObjectSchemaInfo());
        map.put(PageHeader.class, com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Page.class, com_ayah_dao_realm_model_quran_PageRealmProxy.getExpectedObjectSchemaInfo());
        map.put(ChapterHeader.class, com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.getExpectedObjectSchemaInfo());
        map.put(Chapter.class, com_ayah_dao_realm_model_quran_ChapterRealmProxy.getExpectedObjectSchemaInfo());
        return map;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String getSimpleClassNameImpl(Class<? extends RealmModel> cls) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(VerseMarker.class)) {
            return com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(VerseHighlight.class)) {
            return com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Verse.class)) {
            return com_ayah_dao_realm_model_quran_VerseRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Section.class)) {
            return com_ayah_dao_realm_model_quran_SectionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Quarter.class)) {
            return com_ayah_dao_realm_model_quran_QuarterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Part.class)) {
            return com_ayah_dao_realm_model_quran_PartRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(PageHeader.class)) {
            return com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Page.class)) {
            return com_ayah_dao_realm_model_quran_PageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(ChapterHeader.class)) {
            return com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(Chapter.class)) {
            return com_ayah_dao_realm_model_quran_ChapterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> cls) {
        return Verse.class.isAssignableFrom(cls) || Section.class.isAssignableFrom(cls) || Quarter.class.isAssignableFrom(cls) || Part.class.isAssignableFrom(cls) || Page.class.isAssignableFrom(cls) || Chapter.class.isAssignableFrom(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(VerseMarker.class)) {
            return com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, (VerseMarker) realmModel, map);
        }
        if (superclass.equals(VerseHighlight.class)) {
            return com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, (VerseHighlight) realmModel, map);
        }
        if (superclass.equals(Verse.class)) {
            return com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, (Verse) realmModel, map);
        }
        if (superclass.equals(Section.class)) {
            return com_ayah_dao_realm_model_quran_SectionRealmProxy.insert(realm, (Section) realmModel, map);
        }
        if (superclass.equals(Quarter.class)) {
            return com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, (Quarter) realmModel, map);
        }
        if (superclass.equals(Part.class)) {
            return com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, (Part) realmModel, map);
        }
        if (superclass.equals(PageHeader.class)) {
            return com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, (PageHeader) realmModel, map);
        }
        if (superclass.equals(Page.class)) {
            return com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, (Page) realmModel, map);
        }
        if (superclass.equals(ChapterHeader.class)) {
            return com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, (ChapterHeader) realmModel, map);
        }
        if (superclass.equals(Chapter.class)) {
            return com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, (Chapter) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(VerseMarker.class)) {
            return com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, (VerseMarker) realmModel, map);
        }
        if (superclass.equals(VerseHighlight.class)) {
            return com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, (VerseHighlight) realmModel, map);
        }
        if (superclass.equals(Verse.class)) {
            return com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, (Verse) realmModel, map);
        }
        if (superclass.equals(Section.class)) {
            return com_ayah_dao_realm_model_quran_SectionRealmProxy.insertOrUpdate(realm, (Section) realmModel, map);
        }
        if (superclass.equals(Quarter.class)) {
            return com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, (Quarter) realmModel, map);
        }
        if (superclass.equals(Part.class)) {
            return com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, (Part) realmModel, map);
        }
        if (superclass.equals(PageHeader.class)) {
            return com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, (PageHeader) realmModel, map);
        }
        if (superclass.equals(Page.class)) {
            return com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, (Page) realmModel, map);
        }
        if (superclass.equals(ChapterHeader.class)) {
            return com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, (ChapterHeader) realmModel, map);
        }
        if (superclass.equals(Chapter.class)) {
            return com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, (Chapter) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean isEmbedded(Class<E> cls) {
        if (cls.equals(VerseMarker.class) || cls.equals(VerseHighlight.class) || cls.equals(Verse.class) || cls.equals(Section.class) || cls.equals(Quarter.class) || cls.equals(Part.class) || cls.equals(PageHeader.class) || cls.equals(Page.class) || cls.equals(ChapterHeader.class) || cls.equals(Chapter.class)) {
            return false;
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E newInstance(Class<E> cls, Object obj, Row row, ColumnInfo columnInfo, boolean z10, List<String> list) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        try {
            realmObjectContext.set((BaseRealm) obj, row, columnInfo, z10, list);
            RealmProxyMediator.checkClass(cls);
            if (cls.equals(VerseMarker.class)) {
                E eCast = cls.cast(new com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy());
                realmObjectContext.clear();
                return eCast;
            }
            if (cls.equals(VerseHighlight.class)) {
                E eCast2 = cls.cast(new com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy());
                realmObjectContext.clear();
                return eCast2;
            }
            if (cls.equals(Verse.class)) {
                E eCast3 = cls.cast(new com_ayah_dao_realm_model_quran_VerseRealmProxy());
                realmObjectContext.clear();
                return eCast3;
            }
            if (cls.equals(Section.class)) {
                E eCast4 = cls.cast(new com_ayah_dao_realm_model_quran_SectionRealmProxy());
                realmObjectContext.clear();
                return eCast4;
            }
            if (cls.equals(Quarter.class)) {
                E eCast5 = cls.cast(new com_ayah_dao_realm_model_quran_QuarterRealmProxy());
                realmObjectContext.clear();
                return eCast5;
            }
            if (cls.equals(Part.class)) {
                E eCast6 = cls.cast(new com_ayah_dao_realm_model_quran_PartRealmProxy());
                realmObjectContext.clear();
                return eCast6;
            }
            if (cls.equals(PageHeader.class)) {
                E eCast7 = cls.cast(new com_ayah_dao_realm_model_quran_PageHeaderRealmProxy());
                realmObjectContext.clear();
                return eCast7;
            }
            if (cls.equals(Page.class)) {
                E eCast8 = cls.cast(new com_ayah_dao_realm_model_quran_PageRealmProxy());
                realmObjectContext.clear();
                return eCast8;
            }
            if (cls.equals(ChapterHeader.class)) {
                E eCast9 = cls.cast(new com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy());
                realmObjectContext.clear();
                return eCast9;
            }
            if (!cls.equals(Chapter.class)) {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
            }
            E eCast10 = cls.cast(new com_ayah_dao_realm_model_quran_ChapterRealmProxy());
            realmObjectContext.clear();
            return eCast10;
        } catch (Throwable th) {
            realmObjectContext.clear();
            throw th;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
        return true;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E e10, E e11, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<? super Object> superclass = e11.getClass().getSuperclass();
        if (superclass.equals(VerseMarker.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.VerseMarker");
        }
        if (superclass.equals(VerseHighlight.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.VerseHighlight");
        }
        if (superclass.equals(Verse.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.Verse");
        }
        if (superclass.equals(Section.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.Section");
        }
        if (superclass.equals(Quarter.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.Quarter");
        }
        if (superclass.equals(Part.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.Part");
        }
        if (superclass.equals(PageHeader.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.PageHeader");
        }
        if (superclass.equals(Page.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.Page");
        }
        if (superclass.equals(ChapterHeader.class)) {
            throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.ChapterHeader");
        }
        if (!superclass.equals(Chapter.class)) {
            throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
        throw RealmProxyMediator.getNotEmbeddedClassException("com.ayah.dao.realm.model.quran.Chapter");
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap map = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel next = it.next();
            Class<?> superclass = next instanceof RealmObjectProxy ? next.getClass().getSuperclass() : next.getClass();
            if (superclass.equals(VerseMarker.class)) {
                com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, (VerseMarker) next, map);
            } else if (superclass.equals(VerseHighlight.class)) {
                com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, (VerseHighlight) next, map);
            } else if (superclass.equals(Verse.class)) {
                com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, (Verse) next, map);
            } else if (superclass.equals(Section.class)) {
                com_ayah_dao_realm_model_quran_SectionRealmProxy.insert(realm, (Section) next, map);
            } else if (superclass.equals(Quarter.class)) {
                com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, (Quarter) next, map);
            } else if (superclass.equals(Part.class)) {
                com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, (Part) next, map);
            } else if (superclass.equals(PageHeader.class)) {
                com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, (PageHeader) next, map);
            } else if (superclass.equals(Page.class)) {
                com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, (Page) next, map);
            } else if (superclass.equals(ChapterHeader.class)) {
                com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, (ChapterHeader) next, map);
            } else if (superclass.equals(Chapter.class)) {
                com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, (Chapter) next, map);
            } else {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (it.hasNext()) {
                if (superclass.equals(VerseMarker.class)) {
                    com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(VerseHighlight.class)) {
                    com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(Verse.class)) {
                    com_ayah_dao_realm_model_quran_VerseRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(Section.class)) {
                    com_ayah_dao_realm_model_quran_SectionRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(Quarter.class)) {
                    com_ayah_dao_realm_model_quran_QuarterRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(Part.class)) {
                    com_ayah_dao_realm_model_quran_PartRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(PageHeader.class)) {
                    com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insert(realm, it, map);
                    return;
                }
                if (superclass.equals(Page.class)) {
                    com_ayah_dao_realm_model_quran_PageRealmProxy.insert(realm, it, map);
                } else if (superclass.equals(ChapterHeader.class)) {
                    com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insert(realm, it, map);
                } else {
                    if (superclass.equals(Chapter.class)) {
                        com_ayah_dao_realm_model_quran_ChapterRealmProxy.insert(realm, it, map);
                        return;
                    }
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap map = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel next = it.next();
            Class<?> superclass = next instanceof RealmObjectProxy ? next.getClass().getSuperclass() : next.getClass();
            if (superclass.equals(VerseMarker.class)) {
                com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, (VerseMarker) next, map);
            } else if (superclass.equals(VerseHighlight.class)) {
                com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, (VerseHighlight) next, map);
            } else if (superclass.equals(Verse.class)) {
                com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, (Verse) next, map);
            } else if (superclass.equals(Section.class)) {
                com_ayah_dao_realm_model_quran_SectionRealmProxy.insertOrUpdate(realm, (Section) next, map);
            } else if (superclass.equals(Quarter.class)) {
                com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, (Quarter) next, map);
            } else if (superclass.equals(Part.class)) {
                com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, (Part) next, map);
            } else if (superclass.equals(PageHeader.class)) {
                com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, (PageHeader) next, map);
            } else if (superclass.equals(Page.class)) {
                com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, (Page) next, map);
            } else if (superclass.equals(ChapterHeader.class)) {
                com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, (ChapterHeader) next, map);
            } else if (superclass.equals(Chapter.class)) {
                com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, (Chapter) next, map);
            } else {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (it.hasNext()) {
                if (superclass.equals(VerseMarker.class)) {
                    com_ayah_dao_realm_model_quran_VerseMarkerRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(VerseHighlight.class)) {
                    com_ayah_dao_realm_model_quran_VerseHighlightRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(Verse.class)) {
                    com_ayah_dao_realm_model_quran_VerseRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(Section.class)) {
                    com_ayah_dao_realm_model_quran_SectionRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(Quarter.class)) {
                    com_ayah_dao_realm_model_quran_QuarterRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(Part.class)) {
                    com_ayah_dao_realm_model_quran_PartRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(PageHeader.class)) {
                    com_ayah_dao_realm_model_quran_PageHeaderRealmProxy.insertOrUpdate(realm, it, map);
                    return;
                }
                if (superclass.equals(Page.class)) {
                    com_ayah_dao_realm_model_quran_PageRealmProxy.insertOrUpdate(realm, it, map);
                } else if (superclass.equals(ChapterHeader.class)) {
                    com_ayah_dao_realm_model_quran_ChapterHeaderRealmProxy.insertOrUpdate(realm, it, map);
                } else {
                    if (superclass.equals(Chapter.class)) {
                        com_ayah_dao_realm_model_quran_ChapterRealmProxy.insertOrUpdate(realm, it, map);
                        return;
                    }
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
            }
        }
    }
}
