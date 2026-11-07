package io.realm;

import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Verse;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_PartRealmProxyInterface {
    String realmGet$arabicTitle();

    RealmList<Chapter> realmGet$chapters();

    String realmGet$englishTitle();

    long realmGet$identifier();

    long realmGet$number();

    RealmList<Quarter> realmGet$quarters();

    RealmList<Verse> realmGet$verses();

    void realmSet$arabicTitle(String str);

    void realmSet$chapters(RealmList<Chapter> realmList);

    void realmSet$englishTitle(String str);

    void realmSet$identifier(long j);

    void realmSet$number(long j);

    void realmSet$quarters(RealmList<Quarter> realmList);

    void realmSet$verses(RealmList<Verse> realmList);
}
