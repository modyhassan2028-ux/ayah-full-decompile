package io.realm;

import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Verse;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_QuarterRealmProxyInterface {
    String realmGet$arabicTitle();

    String realmGet$englishTitle();

    long realmGet$hizbFraction();

    long realmGet$hizbNumber();

    long realmGet$identifier();

    Part realmGet$part();

    RealmList<Verse> realmGet$verses();

    void realmSet$arabicTitle(String str);

    void realmSet$englishTitle(String str);

    void realmSet$hizbFraction(long j);

    void realmSet$hizbNumber(long j);

    void realmSet$identifier(long j);

    void realmSet$part(Part part);

    void realmSet$verses(RealmList<Verse> realmList);
}
