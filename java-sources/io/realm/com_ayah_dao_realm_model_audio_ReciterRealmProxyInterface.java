package io.realm;

import com.ayah.dao.realm.model.audio.Track;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface {
    String realmGet$arInfo();

    String realmGet$arSubtitle();

    String realmGet$arTitle();

    String realmGet$category();

    String realmGet$enInfo();

    String realmGet$enSubtitle();

    String realmGet$enTitle();

    boolean realmGet$isPrivate();

    String realmGet$reciterID();

    String realmGet$searchableText();

    RealmList<Track> realmGet$tracks();

    void realmSet$arInfo(String str);

    void realmSet$arSubtitle(String str);

    void realmSet$arTitle(String str);

    void realmSet$category(String str);

    void realmSet$enInfo(String str);

    void realmSet$enSubtitle(String str);

    void realmSet$enTitle(String str);

    void realmSet$isPrivate(boolean z10);

    void realmSet$reciterID(String str);

    void realmSet$searchableText(String str);

    void realmSet$tracks(RealmList<Track> realmList);
}
