package io.realm;

import com.ayah.dao.realm.model.quran.Verse;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_SectionRealmProxyInterface {
    long realmGet$identifier();

    RealmList<Verse> realmGet$verses();

    void realmSet$identifier(long j);

    void realmSet$verses(RealmList<Verse> realmList);
}
