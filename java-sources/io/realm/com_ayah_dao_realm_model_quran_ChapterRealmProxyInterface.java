package io.realm;

import com.ayah.dao.realm.model.quran.ChapterHeader;
import com.ayah.dao.realm.model.quran.Verse;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_ChapterRealmProxyInterface {
    String realmGet$arabicTitle();

    String realmGet$englishTitle();

    ChapterHeader realmGet$header1405();

    ChapterHeader realmGet$header1441();

    long realmGet$identifier();

    boolean realmGet$isMeccan();

    long realmGet$number();

    String realmGet$searchableKeywords();

    String realmGet$searchableText();

    String realmGet$title();

    String realmGet$titleCodePoint();

    RealmList<Verse> realmGet$verses();

    void realmSet$arabicTitle(String str);

    void realmSet$englishTitle(String str);

    void realmSet$header1405(ChapterHeader chapterHeader);

    void realmSet$header1441(ChapterHeader chapterHeader);

    void realmSet$identifier(long j);

    void realmSet$isMeccan(boolean z10);

    void realmSet$number(long j);

    void realmSet$searchableKeywords(String str);

    void realmSet$searchableText(String str);

    void realmSet$title(String str);

    void realmSet$titleCodePoint(String str);

    void realmSet$verses(RealmList<Verse> realmList);
}
