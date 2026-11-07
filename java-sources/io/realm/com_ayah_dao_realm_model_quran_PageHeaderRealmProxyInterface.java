package io.realm;

import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface {
    RealmList<Chapter> realmGet$chapters();

    Part realmGet$part();

    Quarter realmGet$quarter();

    void realmSet$chapters(RealmList<Chapter> realmList);

    void realmSet$part(Part part);

    void realmSet$quarter(Quarter quarter);
}
