package io.realm;

import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Section;
import com.ayah.dao.realm.model.quran.VerseHighlight;
import com.ayah.dao.realm.model.quran.VerseMarker;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_VerseRealmProxyInterface {
    Chapter realmGet$chapter();

    String realmGet$hafsSmartText();

    RealmList<VerseHighlight> realmGet$highlights1405();

    RealmList<VerseHighlight> realmGet$highlights1441();

    String realmGet$humanReadableID();

    VerseMarker realmGet$marker1405();

    VerseMarker realmGet$marker1441();

    long realmGet$number();

    Page realmGet$page1405();

    Page realmGet$page1441();

    Part realmGet$part();

    Quarter realmGet$quarter();

    String realmGet$searchableText();

    Section realmGet$section();

    String realmGet$text();

    String realmGet$textWithoutTashkil();

    String realmGet$uthmanicHafsText();

    long realmGet$verseID();

    void realmSet$chapter(Chapter chapter);

    void realmSet$hafsSmartText(String str);

    void realmSet$highlights1405(RealmList<VerseHighlight> realmList);

    void realmSet$highlights1441(RealmList<VerseHighlight> realmList);

    void realmSet$humanReadableID(String str);

    void realmSet$marker1405(VerseMarker verseMarker);

    void realmSet$marker1441(VerseMarker verseMarker);

    void realmSet$number(long j);

    void realmSet$page1405(Page page);

    void realmSet$page1441(Page page);

    void realmSet$part(Part part);

    void realmSet$quarter(Quarter quarter);

    void realmSet$searchableText(String str);

    void realmSet$section(Section section);

    void realmSet$text(String str);

    void realmSet$textWithoutTashkil(String str);

    void realmSet$uthmanicHafsText(String str);

    void realmSet$verseID(long j);
}
