package io.realm;

import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.PageHeader;
import com.ayah.dao.realm.model.quran.Verse;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_PageRealmProxyInterface {
    RealmList<ChapterHeader> realmGet$chapterHeaders1405();

    RealmList<ChapterHeader> realmGet$chapterHeaders1441();

    PageHeader realmGet$header1405();

    PageHeader realmGet$header1441();

    long realmGet$identifier();

    boolean realmGet$isRight();

    long realmGet$number();

    RealmList<Verse> realmGet$verses1405();

    RealmList<Verse> realmGet$verses1441();

    void realmSet$chapterHeaders1405(RealmList<ChapterHeader> realmList);

    void realmSet$chapterHeaders1441(RealmList<ChapterHeader> realmList);

    void realmSet$header1405(PageHeader pageHeader);

    void realmSet$header1441(PageHeader pageHeader);

    void realmSet$identifier(long j);

    void realmSet$isRight(boolean z10);

    void realmSet$number(long j);

    void realmSet$verses1405(RealmList<Verse> realmList);

    void realmSet$verses1441(RealmList<Verse> realmList);
}
