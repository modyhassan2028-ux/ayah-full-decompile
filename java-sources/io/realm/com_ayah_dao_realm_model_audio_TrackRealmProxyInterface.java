package io.realm;

import com.ayah.dao.realm.model.audio.Reciter;
import com.ayah.dao.realm.model.audio.Timing;

/* JADX INFO: loaded from: classes.dex */
public interface com_ayah_dao_realm_model_audio_TrackRealmProxyInterface {
    long realmGet$chapterNumber();

    double realmGet$endTime();

    Reciter realmGet$reciter();

    double realmGet$startTime();

    RealmList<Timing> realmGet$timings();

    String realmGet$trackID();

    long realmGet$version();

    void realmSet$chapterNumber(long j);

    void realmSet$endTime(double d5);

    void realmSet$reciter(Reciter reciter);

    void realmSet$startTime(double d5);

    void realmSet$timings(RealmList<Timing> realmList);

    void realmSet$trackID(String str);

    void realmSet$version(long j);
}
