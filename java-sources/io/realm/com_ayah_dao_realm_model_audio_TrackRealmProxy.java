package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.audio.Reciter;
import com.ayah.dao.realm.model.audio.Timing;
import com.ayah.dao.realm.model.audio.Track;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_audio_TrackRealmProxy extends Track implements RealmObjectProxy, com_ayah_dao_realm_model_audio_TrackRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TrackColumnInfo columnInfo;
    private ProxyState<Track> proxyState;
    private RealmList<Timing> timingsRealmList;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Track";
    }

    public static final class TrackColumnInfo extends ColumnInfo {
        long chapterNumberColKey;
        long endTimeColKey;
        long reciterColKey;
        long startTimeColKey;
        long timingsColKey;
        long trackIDColKey;
        long versionColKey;

        public TrackColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.trackIDColKey = addColumnDetails("trackID", "trackID", objectSchemaInfo);
            this.reciterColKey = addColumnDetails("reciter", "reciter", objectSchemaInfo);
            this.chapterNumberColKey = addColumnDetails("chapterNumber", "chapterNumber", objectSchemaInfo);
            this.versionColKey = addColumnDetails("version", "version", objectSchemaInfo);
            this.startTimeColKey = addColumnDetails("startTime", "startTime", objectSchemaInfo);
            this.endTimeColKey = addColumnDetails("endTime", "endTime", objectSchemaInfo);
            this.timingsColKey = addColumnDetails("timings", "timings", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new TrackColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TrackColumnInfo trackColumnInfo = (TrackColumnInfo) columnInfo;
            TrackColumnInfo trackColumnInfo2 = (TrackColumnInfo) columnInfo2;
            trackColumnInfo2.trackIDColKey = trackColumnInfo.trackIDColKey;
            trackColumnInfo2.reciterColKey = trackColumnInfo.reciterColKey;
            trackColumnInfo2.chapterNumberColKey = trackColumnInfo.chapterNumberColKey;
            trackColumnInfo2.versionColKey = trackColumnInfo.versionColKey;
            trackColumnInfo2.startTimeColKey = trackColumnInfo.startTimeColKey;
            trackColumnInfo2.endTimeColKey = trackColumnInfo.endTimeColKey;
            trackColumnInfo2.timingsColKey = trackColumnInfo.timingsColKey;
        }

        public TrackColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_audio_TrackRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    public static Track copy(Realm realm, TrackColumnInfo trackColumnInfo, Track track, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Set<ImportFlag> set2;
        Map map2;
        RealmList<Timing> realmListRealmGet$timings;
        RealmList<Timing> realmListRealmGet$timings2;
        int i10;
        Timing timing;
        Timing timing2;
        RealmObjectProxy realmObjectProxy = map.get(track);
        if (realmObjectProxy != null) {
            return (Track) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Track.class), set);
        osObjectBuilder.addString(trackColumnInfo.trackIDColKey, track.realmGet$trackID());
        osObjectBuilder.addInteger(trackColumnInfo.chapterNumberColKey, Long.valueOf(track.realmGet$chapterNumber()));
        osObjectBuilder.addInteger(trackColumnInfo.versionColKey, Long.valueOf(track.realmGet$version()));
        osObjectBuilder.addDouble(trackColumnInfo.startTimeColKey, Double.valueOf(track.realmGet$startTime()));
        osObjectBuilder.addDouble(trackColumnInfo.endTimeColKey, Double.valueOf(track.realmGet$endTime()));
        com_ayah_dao_realm_model_audio_TrackRealmProxy com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(track, com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance);
        Reciter reciterRealmGet$reciter = track.realmGet$reciter();
        if (reciterRealmGet$reciter != null) {
            Reciter reciter = (Reciter) map.get(reciterRealmGet$reciter);
            if (reciter != null) {
                com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance.realmSet$reciter(reciter);
            } else {
                realm2 = realm;
                z11 = z10;
                Map map3 = map;
                set2 = set;
                com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance.realmSet$reciter(com_ayah_dao_realm_model_audio_ReciterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_ReciterRealmProxy.ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class), reciterRealmGet$reciter, z11, map3, set2));
                map2 = map3;
            }
            realmListRealmGet$timings = track.realmGet$timings();
            if (realmListRealmGet$timings != null) {
                realmListRealmGet$timings2 = com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance.realmGet$timings();
                realmListRealmGet$timings2.clear();
                for (i10 = 0; i10 < realmListRealmGet$timings.size(); i10++) {
                    timing = realmListRealmGet$timings.get(i10);
                    timing2 = (Timing) map2.get(timing);
                    if (timing2 != null) {
                        realmListRealmGet$timings2.add(timing2);
                    } else {
                        realmListRealmGet$timings2.add(com_ayah_dao_realm_model_audio_TimingRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_TimingRealmProxy.TimingColumnInfo) realm2.getSchema().getColumnInfo(Timing.class), timing, z11, map2, set2));
                    }
                }
            }
            return com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance;
        }
        com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance.realmSet$reciter(null);
        realm2 = realm;
        z11 = z10;
        map2 = map;
        set2 = set;
        realmListRealmGet$timings = track.realmGet$timings();
        if (realmListRealmGet$timings != null) {
            realmListRealmGet$timings2 = com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance.realmGet$timings();
            realmListRealmGet$timings2.clear();
            while (i10 < realmListRealmGet$timings.size()) {
                timing = realmListRealmGet$timings.get(i10);
                timing2 = (Timing) map2.get(timing);
                if (timing2 != null) {
                    realmListRealmGet$timings2.add(timing2);
                } else {
                    realmListRealmGet$timings2.add(com_ayah_dao_realm_model_audio_TimingRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_TimingRealmProxy.TimingColumnInfo) realm2.getSchema().getColumnInfo(Timing.class), timing, z11, map2, set2));
                }
            }
        }
        return com_ayah_dao_realm_model_audio_trackrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Track copyOrUpdate(Realm realm, TrackColumnInfo trackColumnInfo, Track track, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((track instanceof RealmObjectProxy) && !RealmObject.isFrozen(track)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) track;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return track;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(track);
        if (realmObjectProxy2 != null) {
            return (Track) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_audio_TrackRealmProxy com_ayah_dao_realm_model_audio_trackrealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Track.class);
            long jFindFirstString = table.findFirstString(trackColumnInfo.trackIDColKey, track.realmGet$trackID());
            if (jFindFirstString == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstString), trackColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_audio_trackrealmproxy = new com_ayah_dao_realm_model_audio_TrackRealmProxy();
                    map.put(track, com_ayah_dao_realm_model_audio_trackrealmproxy);
                    realmObjectContext.clear();
                    z11 = z10;
                } catch (Throwable th) {
                    realmObjectContext.clear();
                    throw th;
                }
            }
        } else {
            z11 = z10;
        }
        return z11 ? update(realm, trackColumnInfo, com_ayah_dao_realm_model_audio_trackrealmproxy, track, map, set) : copy(realm, trackColumnInfo, track, z10, map, set);
    }

    public static TrackColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TrackColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Track createDetachedCopy(Track track, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Track track2;
        if (i10 > i11 || track == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(track);
        if (cacheData == null) {
            track2 = new Track();
            map.put(track, new RealmObjectProxy.CacheData<>(i10, track2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Track) cacheData.object;
            }
            Track track3 = (Track) cacheData.object;
            cacheData.minDepth = i10;
            track2 = track3;
        }
        track2.realmSet$trackID(track.realmGet$trackID());
        int i12 = i10 + 1;
        track2.realmSet$reciter(com_ayah_dao_realm_model_audio_ReciterRealmProxy.createDetachedCopy(track.realmGet$reciter(), i12, i11, map));
        track2.realmSet$chapterNumber(track.realmGet$chapterNumber());
        track2.realmSet$version(track.realmGet$version());
        track2.realmSet$startTime(track.realmGet$startTime());
        track2.realmSet$endTime(track.realmGet$endTime());
        if (i10 == i11) {
            track2.realmSet$timings(null);
            return track2;
        }
        RealmList<Timing> realmListRealmGet$timings = track.realmGet$timings();
        RealmList<Timing> realmList = new RealmList<>();
        track2.realmSet$timings(realmList);
        int size = realmListRealmGet$timings.size();
        for (int i13 = 0; i13 < size; i13++) {
            realmList.add(com_ayah_dao_realm_model_audio_TimingRealmProxy.createDetachedCopy(realmListRealmGet$timings.get(i13), i12, i11, map));
        }
        return track2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 7, 0);
        builder.addPersistedProperty(NO_ALIAS, "trackID", RealmFieldType.STRING, true, false, true);
        builder.addPersistedLinkProperty(NO_ALIAS, "reciter", RealmFieldType.OBJECT, com_ayah_dao_realm_model_audio_ReciterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "chapterNumber", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "version", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.DOUBLE;
        builder.addPersistedProperty(NO_ALIAS, "startTime", realmFieldType2, false, false, true);
        builder.addPersistedProperty(NO_ALIAS, "endTime", realmFieldType2, false, false, true);
        builder.addPersistedLinkProperty(NO_ALIAS, "timings", RealmFieldType.LIST, com_ayah_dao_realm_model_audio_TimingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public static Track createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_audio_TrackRealmProxy com_ayah_dao_realm_model_audio_trackrealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(2);
        if (z10) {
            Table table = realm.getTable(Track.class);
            long jFindFirstString = !jSONObject.isNull("trackID") ? table.findFirstString(((TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class)).trackIDColKey, jSONObject.getString("trackID")) : -1L;
            if (jFindFirstString != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstString);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Track.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_audio_trackrealmproxy = new com_ayah_dao_realm_model_audio_TrackRealmProxy();
                        realmObjectContext.clear();
                    } catch (Throwable th) {
                        th = th;
                        realmObjectContext.clear();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    realmObjectContext = realmObjectContext2;
                }
            } else {
                com_ayah_dao_realm_model_audio_trackrealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_audio_trackrealmproxy = null;
        }
        if (com_ayah_dao_realm_model_audio_trackrealmproxy == null) {
            if (jSONObject.has("reciter")) {
                arrayList.add("reciter");
            }
            if (jSONObject.has("timings")) {
                arrayList.add("timings");
            }
            if (!jSONObject.has("trackID")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'trackID'.");
            }
            com_ayah_dao_realm_model_audio_trackrealmproxy = jSONObject.isNull("trackID") ? (com_ayah_dao_realm_model_audio_TrackRealmProxy) realm.createObjectInternal(Track.class, null, true, arrayList) : (com_ayah_dao_realm_model_audio_TrackRealmProxy) realm.createObjectInternal(Track.class, jSONObject.getString("trackID"), true, arrayList);
        }
        if (jSONObject.has("reciter")) {
            if (jSONObject.isNull("reciter")) {
                com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$reciter(null);
            } else {
                com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$reciter(com_ayah_dao_realm_model_audio_ReciterRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("reciter"), z10));
            }
        }
        if (jSONObject.has("chapterNumber")) {
            if (jSONObject.isNull("chapterNumber")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'chapterNumber' to null.");
            }
            com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$chapterNumber(jSONObject.getLong("chapterNumber"));
        }
        if (jSONObject.has("version")) {
            if (jSONObject.isNull("version")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'version' to null.");
            }
            com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$version(jSONObject.getLong("version"));
        }
        if (jSONObject.has("startTime")) {
            if (jSONObject.isNull("startTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startTime' to null.");
            }
            com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$startTime(jSONObject.getDouble("startTime"));
        }
        if (jSONObject.has("endTime")) {
            if (jSONObject.isNull("endTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endTime' to null.");
            }
            com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$endTime(jSONObject.getDouble("endTime"));
        }
        if (jSONObject.has("timings")) {
            if (jSONObject.isNull("timings")) {
                com_ayah_dao_realm_model_audio_trackrealmproxy.realmSet$timings(null);
                return com_ayah_dao_realm_model_audio_trackrealmproxy;
            }
            com_ayah_dao_realm_model_audio_trackrealmproxy.realmGet$timings().clear();
            JSONArray jSONArray = jSONObject.getJSONArray("timings");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                com_ayah_dao_realm_model_audio_trackrealmproxy.realmGet$timings().add(com_ayah_dao_realm_model_audio_TimingRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
            }
        }
        return com_ayah_dao_realm_model_audio_trackrealmproxy;
    }

    @TargetApi(11)
    public static Track createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Track track = new Track();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("trackID")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    track.realmSet$trackID(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    track.realmSet$trackID(null);
                }
                z10 = true;
            } else if (strNextName.equals("reciter")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    track.realmSet$reciter(null);
                } else {
                    track.realmSet$reciter(com_ayah_dao_realm_model_audio_ReciterRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (strNextName.equals("chapterNumber")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'chapterNumber' to null.");
                }
                track.realmSet$chapterNumber(jsonReader.nextLong());
            } else if (strNextName.equals("version")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'version' to null.");
                }
                track.realmSet$version(jsonReader.nextLong());
            } else if (strNextName.equals("startTime")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'startTime' to null.");
                }
                track.realmSet$startTime(jsonReader.nextDouble());
            } else if (strNextName.equals("endTime")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'endTime' to null.");
                }
                track.realmSet$endTime(jsonReader.nextDouble());
            } else if (!strNextName.equals("timings")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                track.realmSet$timings(null);
            } else {
                track.realmSet$timings(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    track.realmGet$timings().add(com_ayah_dao_realm_model_audio_TimingRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Track) realm.copyToRealmOrUpdate(track, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'trackID'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, Track track, Map<RealmModel, Long> map) {
        if ((track instanceof RealmObjectProxy) && !RealmObject.isFrozen(track)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) track;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Track.class);
        long nativePtr = table.getNativePtr();
        TrackColumnInfo trackColumnInfo = (TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class);
        long j = trackColumnInfo.trackIDColKey;
        String strRealmGet$trackID = track.realmGet$trackID();
        long jNativeFindFirstString = strRealmGet$trackID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$trackID) : -1L;
        if (jNativeFindFirstString == -1) {
            jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$trackID);
        } else {
            Table.throwDuplicatePrimaryKeyException(strRealmGet$trackID);
        }
        long j10 = jNativeFindFirstString;
        map.put(track, Long.valueOf(j10));
        Reciter reciterRealmGet$reciter = track.realmGet$reciter();
        if (reciterRealmGet$reciter != null) {
            Long lValueOf = map.get(reciterRealmGet$reciter);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_ReciterRealmProxy.insert(realm, reciterRealmGet$reciter, map));
            }
            Table.nativeSetLink(nativePtr, trackColumnInfo.reciterColKey, j10, lValueOf.longValue(), false);
        }
        Table.nativeSetLong(nativePtr, trackColumnInfo.chapterNumberColKey, j10, track.realmGet$chapterNumber(), false);
        Table.nativeSetLong(nativePtr, trackColumnInfo.versionColKey, j10, track.realmGet$version(), false);
        Table.nativeSetDouble(nativePtr, trackColumnInfo.startTimeColKey, j10, track.realmGet$startTime(), false);
        Table.nativeSetDouble(nativePtr, trackColumnInfo.endTimeColKey, j10, track.realmGet$endTime(), false);
        RealmList<Timing> realmListRealmGet$timings = track.realmGet$timings();
        if (realmListRealmGet$timings != null) {
            OsList osList = new OsList(table.getUncheckedRow(j10), trackColumnInfo.timingsColKey);
            for (Timing timing : realmListRealmGet$timings) {
                Long lValueOf2 = map.get(timing);
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_audio_TimingRealmProxy.insert(realm, timing, map));
                }
                osList.addRow(lValueOf2.longValue());
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Track track, Map<RealmModel, Long> map) {
        if ((track instanceof RealmObjectProxy) && !RealmObject.isFrozen(track)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) track;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Track.class);
        long nativePtr = table.getNativePtr();
        TrackColumnInfo trackColumnInfo = (TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class);
        long j = trackColumnInfo.trackIDColKey;
        String strRealmGet$trackID = track.realmGet$trackID();
        long jNativeFindFirstString = strRealmGet$trackID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$trackID) : -1L;
        if (jNativeFindFirstString == -1) {
            jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$trackID);
        }
        long j10 = jNativeFindFirstString;
        map.put(track, Long.valueOf(j10));
        Reciter reciterRealmGet$reciter = track.realmGet$reciter();
        if (reciterRealmGet$reciter != null) {
            Long lValueOf = map.get(reciterRealmGet$reciter);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_ReciterRealmProxy.insertOrUpdate(realm, reciterRealmGet$reciter, map));
            }
            Table.nativeSetLink(nativePtr, trackColumnInfo.reciterColKey, j10, lValueOf.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, trackColumnInfo.reciterColKey, j10);
        }
        Table.nativeSetLong(nativePtr, trackColumnInfo.chapterNumberColKey, j10, track.realmGet$chapterNumber(), false);
        Table.nativeSetLong(nativePtr, trackColumnInfo.versionColKey, j10, track.realmGet$version(), false);
        Table.nativeSetDouble(nativePtr, trackColumnInfo.startTimeColKey, j10, track.realmGet$startTime(), false);
        Table.nativeSetDouble(nativePtr, trackColumnInfo.endTimeColKey, j10, track.realmGet$endTime(), false);
        OsList osList = new OsList(table.getUncheckedRow(j10), trackColumnInfo.timingsColKey);
        RealmList<Timing> realmListRealmGet$timings = track.realmGet$timings();
        if (realmListRealmGet$timings == null || realmListRealmGet$timings.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$timings != null) {
                for (Timing timing : realmListRealmGet$timings) {
                    Long lValueOf2 = map.get(timing);
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, timing, map));
                    }
                    osList.addRow(lValueOf2.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$timings.size();
            int iQ = 0;
            while (iQ < size) {
                Timing timing2 = realmListRealmGet$timings.get(iQ);
                Long lValueOf3 = map.get(timing2);
                if (lValueOf3 == null) {
                    lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, timing2, map));
                }
                iQ = p.q(lValueOf3, osList, iQ, iQ, 1);
            }
        }
        return j10;
    }

    public static com_ayah_dao_realm_model_audio_TrackRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Track.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_audio_TrackRealmProxy com_ayah_dao_realm_model_audio_trackrealmproxy = new com_ayah_dao_realm_model_audio_TrackRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_audio_trackrealmproxy;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0085  */
    /* JADX WARN: Code duplicated, block: B:15:0x0091  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c2  */
    public static Track update(Realm realm, TrackColumnInfo trackColumnInfo, Track track, Track track2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        RealmList<Timing> realmListRealmGet$timings;
        RealmList realmList;
        int i10;
        Timing timing;
        Timing timing2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Track.class), set);
        osObjectBuilder.addString(trackColumnInfo.trackIDColKey, track2.realmGet$trackID());
        Reciter reciterRealmGet$reciter = track2.realmGet$reciter();
        if (reciterRealmGet$reciter != null) {
            Reciter reciter = (Reciter) map.get(reciterRealmGet$reciter);
            if (reciter != null) {
                osObjectBuilder.addObject(trackColumnInfo.reciterColKey, reciter);
            } else {
                realm2 = realm;
                map2 = map;
                set2 = set;
                osObjectBuilder.addObject(trackColumnInfo.reciterColKey, com_ayah_dao_realm_model_audio_ReciterRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_ReciterRealmProxy.ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class), reciterRealmGet$reciter, true, map2, set2));
            }
            osObjectBuilder.addInteger(trackColumnInfo.chapterNumberColKey, Long.valueOf(track2.realmGet$chapterNumber()));
            osObjectBuilder.addInteger(trackColumnInfo.versionColKey, Long.valueOf(track2.realmGet$version()));
            osObjectBuilder.addDouble(trackColumnInfo.startTimeColKey, Double.valueOf(track2.realmGet$startTime()));
            osObjectBuilder.addDouble(trackColumnInfo.endTimeColKey, Double.valueOf(track2.realmGet$endTime()));
            realmListRealmGet$timings = track2.realmGet$timings();
            if (realmListRealmGet$timings != null) {
                realmList = new RealmList();
                for (i10 = 0; i10 < realmListRealmGet$timings.size(); i10++) {
                    timing = realmListRealmGet$timings.get(i10);
                    timing2 = (Timing) map2.get(timing);
                    if (timing2 != null) {
                        realmList.add(timing2);
                    } else {
                        realmList.add(com_ayah_dao_realm_model_audio_TimingRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_TimingRealmProxy.TimingColumnInfo) realm2.getSchema().getColumnInfo(Timing.class), timing, true, map2, set2));
                    }
                }
                osObjectBuilder.addObjectList(trackColumnInfo.timingsColKey, realmList);
            } else {
                osObjectBuilder.addObjectList(trackColumnInfo.timingsColKey, new RealmList());
            }
            osObjectBuilder.updateExistingTopLevelObject();
            return track;
        }
        osObjectBuilder.addNull(trackColumnInfo.reciterColKey);
        realm2 = realm;
        map2 = map;
        set2 = set;
        osObjectBuilder.addInteger(trackColumnInfo.chapterNumberColKey, Long.valueOf(track2.realmGet$chapterNumber()));
        osObjectBuilder.addInteger(trackColumnInfo.versionColKey, Long.valueOf(track2.realmGet$version()));
        osObjectBuilder.addDouble(trackColumnInfo.startTimeColKey, Double.valueOf(track2.realmGet$startTime()));
        osObjectBuilder.addDouble(trackColumnInfo.endTimeColKey, Double.valueOf(track2.realmGet$endTime()));
        realmListRealmGet$timings = track2.realmGet$timings();
        if (realmListRealmGet$timings != null) {
            realmList = new RealmList();
            while (i10 < realmListRealmGet$timings.size()) {
                timing = realmListRealmGet$timings.get(i10);
                timing2 = (Timing) map2.get(timing);
                if (timing2 != null) {
                    realmList.add(timing2);
                } else {
                    realmList.add(com_ayah_dao_realm_model_audio_TimingRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_TimingRealmProxy.TimingColumnInfo) realm2.getSchema().getColumnInfo(Timing.class), timing, true, map2, set2));
                }
            }
            osObjectBuilder.addObjectList(trackColumnInfo.timingsColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(trackColumnInfo.timingsColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return track;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_audio_TrackRealmProxy com_ayah_dao_realm_model_audio_trackrealmproxy = (com_ayah_dao_realm_model_audio_TrackRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_audio_trackrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_audio_trackrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_audio_trackrealmproxy.proxyState.getRow$realm().getObjectKey();
        }
        return false;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String strY = p.y(this.proxyState);
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (strY != null ? strY.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        this.columnInfo = (TrackColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Track> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public long realmGet$chapterNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.chapterNumberColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public double realmGet$endTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getDouble(this.columnInfo.endTimeColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public Reciter realmGet$reciter() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.reciterColKey)) {
            return null;
        }
        return (Reciter) this.proxyState.getRealm$realm().get(Reciter.class, this.proxyState.getRow$realm().getLink(this.columnInfo.reciterColKey), false, Collections.EMPTY_LIST);
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public double realmGet$startTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getDouble(this.columnInfo.startTimeColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public RealmList<Timing> realmGet$timings() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Timing> realmList = this.timingsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Timing> realmList2 = new RealmList<>((Class<Timing>) Timing.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.timingsColKey), this.proxyState.getRealm$realm());
        this.timingsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public String realmGet$trackID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.trackIDColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public long realmGet$version() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.versionColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$chapterNumber(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.chapterNumberColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.chapterNumberColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$endTime(double d5) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setDouble(this.columnInfo.endTimeColKey, d5);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setDouble(this.columnInfo.endTimeColKey, row$realm.getObjectKey(), d5, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$reciter(Reciter reciter) {
        Reciter reciter2;
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (reciter == 0) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.reciterColKey);
                return;
            } else {
                this.proxyState.checkValidObject(reciter);
                this.proxyState.getRow$realm().setLink(this.columnInfo.reciterColKey, ((RealmObjectProxy) reciter).realmGet$proxyState().getRow$realm().getObjectKey());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            if (this.proxyState.getExcludeFields$realm().contains("reciter")) {
                reciter2 = reciter;
                return;
            }
            if (reciter != 0) {
                boolean zIsManaged = RealmObject.isManaged(reciter);
                reciter2 = reciter;
                if (!zIsManaged) {
                    reciter2 = (Reciter) realm.copyToRealmOrUpdate(reciter, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (reciter2 == 0) {
                row$realm.nullifyLink(this.columnInfo.reciterColKey);
            } else {
                this.proxyState.checkValidObject(reciter2);
                row$realm.getTable().setLink(this.columnInfo.reciterColKey, row$realm.getObjectKey(), p.r((RealmObjectProxy) reciter2), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$startTime(double d5) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setDouble(this.columnInfo.startTimeColKey, d5);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setDouble(this.columnInfo.startTimeColKey, row$realm.getObjectKey(), d5, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$timings(RealmList<Timing> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("timings")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Timing> realmList2 = new RealmList<>();
                for (Timing timing : realmList) {
                    if (timing == null || RealmObject.isManaged(timing)) {
                        realmList2.add(timing);
                    } else {
                        realmList2.add((Timing) realm.copyToRealm(timing, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.timingsColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (Timing) realmList.get(i10);
                this.proxyState.checkValidObject(realmModel);
                modelList.setRow(i10, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.removeAll();
        if (realmList == null) {
            return;
        }
        int size2 = realmList.size();
        while (i10 < size2) {
            RealmModel realmModel2 = (Timing) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$trackID(String str) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'trackID' cannot be changed after object was created.");
    }

    @Override // com.ayah.dao.realm.model.audio.Track, io.realm.com_ayah_dao_realm_model_audio_TrackRealmProxyInterface
    public void realmSet$version(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.versionColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.versionColKey, row$realm.getObjectKey(), j, true);
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Track = proxy[{trackID:");
        sb.append(realmGet$trackID());
        sb.append("},{reciter:");
        sb.append(realmGet$reciter() != null ? com_ayah_dao_realm_model_audio_ReciterRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("},{chapterNumber:");
        sb.append(realmGet$chapterNumber());
        sb.append("},{version:");
        sb.append(realmGet$version());
        sb.append("},{startTime:");
        sb.append(realmGet$startTime());
        sb.append("},{endTime:");
        sb.append(realmGet$endTime());
        sb.append("},{timings:RealmList<Timing>[");
        sb.append(realmGet$timings().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Track.class);
        long nativePtr = table.getNativePtr();
        TrackColumnInfo trackColumnInfo = (TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class);
        long j = trackColumnInfo.trackIDColKey;
        while (it.hasNext()) {
            Track track = (Track) it.next();
            if (!map.containsKey(track)) {
                if ((track instanceof RealmObjectProxy) && !RealmObject.isFrozen(track)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) track;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(track, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String strRealmGet$trackID = track.realmGet$trackID();
                long jNativeFindFirstString = strRealmGet$trackID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$trackID) : -1L;
                if (jNativeFindFirstString == -1) {
                    jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$trackID);
                } else {
                    Table.throwDuplicatePrimaryKeyException(strRealmGet$trackID);
                }
                long j10 = jNativeFindFirstString;
                map.put(track, Long.valueOf(j10));
                Reciter reciterRealmGet$reciter = track.realmGet$reciter();
                if (reciterRealmGet$reciter != null) {
                    Long lValueOf = map.get(reciterRealmGet$reciter);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_ReciterRealmProxy.insert(realm, reciterRealmGet$reciter, map));
                    }
                    Table.nativeSetLink(nativePtr, trackColumnInfo.reciterColKey, j10, lValueOf.longValue(), false);
                }
                Table.nativeSetLong(nativePtr, trackColumnInfo.chapterNumberColKey, j10, track.realmGet$chapterNumber(), false);
                Table.nativeSetLong(nativePtr, trackColumnInfo.versionColKey, j10, track.realmGet$version(), false);
                Table.nativeSetDouble(nativePtr, trackColumnInfo.startTimeColKey, j10, track.realmGet$startTime(), false);
                Table.nativeSetDouble(nativePtr, trackColumnInfo.endTimeColKey, j10, track.realmGet$endTime(), false);
                RealmList<Timing> realmListRealmGet$timings = track.realmGet$timings();
                if (realmListRealmGet$timings != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j10), trackColumnInfo.timingsColKey);
                    for (Timing timing : realmListRealmGet$timings) {
                        Long lValueOf2 = map.get(timing);
                        if (lValueOf2 == null) {
                            lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_audio_TimingRealmProxy.insert(realm, timing, map));
                        }
                        osList.addRow(lValueOf2.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Track.class);
        long nativePtr = table.getNativePtr();
        TrackColumnInfo trackColumnInfo = (TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class);
        long j = trackColumnInfo.trackIDColKey;
        while (it.hasNext()) {
            Track track = (Track) it.next();
            if (!map.containsKey(track)) {
                if ((track instanceof RealmObjectProxy) && !RealmObject.isFrozen(track)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) track;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(track, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String strRealmGet$trackID = track.realmGet$trackID();
                long jNativeFindFirstString = strRealmGet$trackID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$trackID) : -1L;
                if (jNativeFindFirstString == -1) {
                    jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$trackID);
                }
                long j10 = jNativeFindFirstString;
                map.put(track, Long.valueOf(j10));
                Reciter reciterRealmGet$reciter = track.realmGet$reciter();
                if (reciterRealmGet$reciter != null) {
                    Long lValueOf = map.get(reciterRealmGet$reciter);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_ReciterRealmProxy.insertOrUpdate(realm, reciterRealmGet$reciter, map));
                    }
                    Table.nativeSetLink(nativePtr, trackColumnInfo.reciterColKey, j10, lValueOf.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, trackColumnInfo.reciterColKey, j10);
                }
                Table.nativeSetLong(nativePtr, trackColumnInfo.chapterNumberColKey, j10, track.realmGet$chapterNumber(), false);
                Table.nativeSetLong(nativePtr, trackColumnInfo.versionColKey, j10, track.realmGet$version(), false);
                Table.nativeSetDouble(nativePtr, trackColumnInfo.startTimeColKey, j10, track.realmGet$startTime(), false);
                Table.nativeSetDouble(nativePtr, trackColumnInfo.endTimeColKey, j10, track.realmGet$endTime(), false);
                OsList osList = new OsList(table.getUncheckedRow(j10), trackColumnInfo.timingsColKey);
                RealmList<Timing> realmListRealmGet$timings = track.realmGet$timings();
                if (realmListRealmGet$timings != null && realmListRealmGet$timings.size() == osList.size()) {
                    int size = realmListRealmGet$timings.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Timing timing = realmListRealmGet$timings.get(iQ);
                        Long lValueOf2 = map.get(timing);
                        if (lValueOf2 == null) {
                            lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, timing, map));
                        }
                        iQ = p.q(lValueOf2, osList, iQ, iQ, 1);
                    }
                } else {
                    osList.removeAll();
                    if (realmListRealmGet$timings != null) {
                        for (Timing timing2 : realmListRealmGet$timings) {
                            Long lValueOf3 = map.get(timing2);
                            if (lValueOf3 == null) {
                                lValueOf3 = Long.valueOf(com_ayah_dao_realm_model_audio_TimingRealmProxy.insertOrUpdate(realm, timing2, map));
                            }
                            osList.addRow(lValueOf3.longValue());
                        }
                    }
                }
            }
        }
    }
}
