package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.audio.Reciter;
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
public class com_ayah_dao_realm_model_audio_ReciterRealmProxy extends Reciter implements RealmObjectProxy, com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ReciterColumnInfo columnInfo;
    private ProxyState<Reciter> proxyState;
    private RealmList<Track> tracksRealmList;

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Reciter";
    }

    public static final class ReciterColumnInfo extends ColumnInfo {
        long arInfoColKey;
        long arSubtitleColKey;
        long arTitleColKey;
        long categoryColKey;
        long enInfoColKey;
        long enSubtitleColKey;
        long enTitleColKey;
        long isPrivateColKey;
        long reciterIDColKey;
        long searchableTextColKey;
        long tracksColKey;

        public ReciterColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.reciterIDColKey = addColumnDetails("reciterID", "reciterID", objectSchemaInfo);
            this.isPrivateColKey = addColumnDetails("isPrivate", "isPrivate", objectSchemaInfo);
            this.categoryColKey = addColumnDetails("category", "category", objectSchemaInfo);
            this.arTitleColKey = addColumnDetails("arTitle", "arTitle", objectSchemaInfo);
            this.enTitleColKey = addColumnDetails("enTitle", "enTitle", objectSchemaInfo);
            this.arSubtitleColKey = addColumnDetails("arSubtitle", "arSubtitle", objectSchemaInfo);
            this.enSubtitleColKey = addColumnDetails("enSubtitle", "enSubtitle", objectSchemaInfo);
            this.arInfoColKey = addColumnDetails("arInfo", "arInfo", objectSchemaInfo);
            this.enInfoColKey = addColumnDetails("enInfo", "enInfo", objectSchemaInfo);
            this.searchableTextColKey = addColumnDetails("searchableText", "searchableText", objectSchemaInfo);
            this.tracksColKey = addColumnDetails("tracks", "tracks", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new ReciterColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ReciterColumnInfo reciterColumnInfo = (ReciterColumnInfo) columnInfo;
            ReciterColumnInfo reciterColumnInfo2 = (ReciterColumnInfo) columnInfo2;
            reciterColumnInfo2.reciterIDColKey = reciterColumnInfo.reciterIDColKey;
            reciterColumnInfo2.isPrivateColKey = reciterColumnInfo.isPrivateColKey;
            reciterColumnInfo2.categoryColKey = reciterColumnInfo.categoryColKey;
            reciterColumnInfo2.arTitleColKey = reciterColumnInfo.arTitleColKey;
            reciterColumnInfo2.enTitleColKey = reciterColumnInfo.enTitleColKey;
            reciterColumnInfo2.arSubtitleColKey = reciterColumnInfo.arSubtitleColKey;
            reciterColumnInfo2.enSubtitleColKey = reciterColumnInfo.enSubtitleColKey;
            reciterColumnInfo2.arInfoColKey = reciterColumnInfo.arInfoColKey;
            reciterColumnInfo2.enInfoColKey = reciterColumnInfo.enInfoColKey;
            reciterColumnInfo2.searchableTextColKey = reciterColumnInfo.searchableTextColKey;
            reciterColumnInfo2.tracksColKey = reciterColumnInfo.tracksColKey;
        }

        public ReciterColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public com_ayah_dao_realm_model_audio_ReciterRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Reciter copy(Realm realm, ReciterColumnInfo reciterColumnInfo, Reciter reciter, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        boolean z11;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        RealmModel realmModel = (RealmObjectProxy) map.get(reciter);
        if (realmModel != null) {
            return (Reciter) realmModel;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Reciter.class), set);
        osObjectBuilder.addString(reciterColumnInfo.reciterIDColKey, reciter.realmGet$reciterID());
        osObjectBuilder.addBoolean(reciterColumnInfo.isPrivateColKey, Boolean.valueOf(reciter.realmGet$isPrivate()));
        osObjectBuilder.addString(reciterColumnInfo.categoryColKey, reciter.realmGet$category());
        osObjectBuilder.addString(reciterColumnInfo.arTitleColKey, reciter.realmGet$arTitle());
        osObjectBuilder.addString(reciterColumnInfo.enTitleColKey, reciter.realmGet$enTitle());
        osObjectBuilder.addString(reciterColumnInfo.arSubtitleColKey, reciter.realmGet$arSubtitle());
        osObjectBuilder.addString(reciterColumnInfo.enSubtitleColKey, reciter.realmGet$enSubtitle());
        osObjectBuilder.addString(reciterColumnInfo.arInfoColKey, reciter.realmGet$arInfo());
        osObjectBuilder.addString(reciterColumnInfo.enInfoColKey, reciter.realmGet$enInfo());
        osObjectBuilder.addString(reciterColumnInfo.searchableTextColKey, reciter.realmGet$searchableText());
        com_ayah_dao_realm_model_audio_ReciterRealmProxy com_ayah_dao_realm_model_audio_reciterrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(reciter, com_ayah_dao_realm_model_audio_reciterrealmproxyNewProxyInstance);
        RealmList<Track> realmListRealmGet$tracks = reciter.realmGet$tracks();
        if (realmListRealmGet$tracks != null) {
            RealmList<Track> realmListRealmGet$tracks2 = com_ayah_dao_realm_model_audio_reciterrealmproxyNewProxyInstance.realmGet$tracks();
            realmListRealmGet$tracks2.clear();
            int i10 = 0;
            while (i10 < realmListRealmGet$tracks.size()) {
                Track track = realmListRealmGet$tracks.get(i10);
                Track track2 = (Track) map.get(track);
                if (track2 != null) {
                    realmListRealmGet$tracks2.add(track2);
                    realm2 = realm;
                    z11 = z10;
                    map2 = map;
                    set2 = set;
                } else {
                    realm2 = realm;
                    z11 = z10;
                    map2 = map;
                    set2 = set;
                    realmListRealmGet$tracks2.add(com_ayah_dao_realm_model_audio_TrackRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_TrackRealmProxy.TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class), track, z11, map2, set2));
                }
                i10++;
                realm = realm2;
                z10 = z11;
                map = map2;
                set = set2;
            }
        }
        return com_ayah_dao_realm_model_audio_reciterrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Reciter copyOrUpdate(Realm realm, ReciterColumnInfo reciterColumnInfo, Reciter reciter, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        boolean z11;
        if ((reciter instanceof RealmObjectProxy) && !RealmObject.isFrozen(reciter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) reciter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return reciter;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(reciter);
        if (realmObjectProxy2 != null) {
            return (Reciter) realmObjectProxy2;
        }
        com_ayah_dao_realm_model_audio_ReciterRealmProxy com_ayah_dao_realm_model_audio_reciterrealmproxy = null;
        if (z10) {
            Table table = realm.getTable(Reciter.class);
            long jFindFirstString = table.findFirstString(reciterColumnInfo.reciterIDColKey, reciter.realmGet$reciterID());
            if (jFindFirstString == -1) {
                z11 = false;
            } else {
                try {
                    realmObjectContext.set(realm, table.getUncheckedRow(jFindFirstString), reciterColumnInfo, false, Collections.EMPTY_LIST);
                    com_ayah_dao_realm_model_audio_reciterrealmproxy = new com_ayah_dao_realm_model_audio_ReciterRealmProxy();
                    map.put(reciter, com_ayah_dao_realm_model_audio_reciterrealmproxy);
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
        return z11 ? update(realm, reciterColumnInfo, com_ayah_dao_realm_model_audio_reciterrealmproxy, reciter, map, set) : copy(realm, reciterColumnInfo, reciter, z10, map, set);
    }

    public static ReciterColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ReciterColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Reciter createDetachedCopy(Reciter reciter, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Reciter reciter2;
        if (i10 > i11 || reciter == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(reciter);
        if (cacheData == null) {
            reciter2 = new Reciter();
            map.put(reciter, new RealmObjectProxy.CacheData<>(i10, reciter2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (Reciter) cacheData.object;
            }
            Reciter reciter3 = (Reciter) cacheData.object;
            cacheData.minDepth = i10;
            reciter2 = reciter3;
        }
        reciter2.realmSet$reciterID(reciter.realmGet$reciterID());
        reciter2.realmSet$isPrivate(reciter.realmGet$isPrivate());
        reciter2.realmSet$category(reciter.realmGet$category());
        reciter2.realmSet$arTitle(reciter.realmGet$arTitle());
        reciter2.realmSet$enTitle(reciter.realmGet$enTitle());
        reciter2.realmSet$arSubtitle(reciter.realmGet$arSubtitle());
        reciter2.realmSet$enSubtitle(reciter.realmGet$enSubtitle());
        reciter2.realmSet$arInfo(reciter.realmGet$arInfo());
        reciter2.realmSet$enInfo(reciter.realmGet$enInfo());
        reciter2.realmSet$searchableText(reciter.realmGet$searchableText());
        if (i10 == i11) {
            reciter2.realmSet$tracks(null);
            return reciter2;
        }
        RealmList<Track> realmListRealmGet$tracks = reciter.realmGet$tracks();
        RealmList<Track> realmList = new RealmList<>();
        reciter2.realmSet$tracks(realmList);
        int i12 = i10 + 1;
        int size = realmListRealmGet$tracks.size();
        for (int i13 = 0; i13 < size; i13++) {
            realmList.add(com_ayah_dao_realm_model_audio_TrackRealmProxy.createDetachedCopy(realmListRealmGet$tracks.get(i13), i12, i11, map));
        }
        return reciter2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 11, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        builder.addPersistedProperty(NO_ALIAS, "reciterID", realmFieldType, true, false, true);
        builder.addPersistedProperty(NO_ALIAS, "isPrivate", RealmFieldType.BOOLEAN, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "category", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "arTitle", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "enTitle", realmFieldType, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "arSubtitle", realmFieldType, false, true, false);
        builder.addPersistedProperty(NO_ALIAS, "enSubtitle", realmFieldType, false, true, false);
        builder.addPersistedProperty(NO_ALIAS, "arInfo", realmFieldType, false, false, false);
        builder.addPersistedProperty(NO_ALIAS, "enInfo", realmFieldType, false, false, false);
        builder.addPersistedProperty(NO_ALIAS, "searchableText", realmFieldType, false, true, true);
        builder.addPersistedLinkProperty(NO_ALIAS, "tracks", RealmFieldType.LIST, com_ayah_dao_realm_model_audio_TrackRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public static Reciter createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) throws Throwable {
        com_ayah_dao_realm_model_audio_ReciterRealmProxy com_ayah_dao_realm_model_audio_reciterrealmproxy;
        BaseRealm.RealmObjectContext realmObjectContext;
        ArrayList arrayList = new ArrayList(1);
        if (z10) {
            Table table = realm.getTable(Reciter.class);
            long jFindFirstString = !jSONObject.isNull("reciterID") ? table.findFirstString(((ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class)).reciterIDColKey, jSONObject.getString("reciterID")) : -1L;
            if (jFindFirstString != -1) {
                BaseRealm.RealmObjectContext realmObjectContext2 = BaseRealm.objectContext.get();
                try {
                    UncheckedRow uncheckedRow = table.getUncheckedRow(jFindFirstString);
                    realmObjectContext = realmObjectContext2;
                    try {
                        realmObjectContext.set(realm, uncheckedRow, realm.getSchema().getColumnInfo(Reciter.class), false, Collections.EMPTY_LIST);
                        com_ayah_dao_realm_model_audio_reciterrealmproxy = new com_ayah_dao_realm_model_audio_ReciterRealmProxy();
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
                com_ayah_dao_realm_model_audio_reciterrealmproxy = null;
            }
        } else {
            com_ayah_dao_realm_model_audio_reciterrealmproxy = null;
        }
        if (com_ayah_dao_realm_model_audio_reciterrealmproxy == null) {
            if (jSONObject.has("tracks")) {
                arrayList.add("tracks");
            }
            if (!jSONObject.has("reciterID")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'reciterID'.");
            }
            com_ayah_dao_realm_model_audio_reciterrealmproxy = jSONObject.isNull("reciterID") ? (com_ayah_dao_realm_model_audio_ReciterRealmProxy) realm.createObjectInternal(Reciter.class, null, true, arrayList) : (com_ayah_dao_realm_model_audio_ReciterRealmProxy) realm.createObjectInternal(Reciter.class, jSONObject.getString("reciterID"), true, arrayList);
        }
        if (jSONObject.has("isPrivate")) {
            if (jSONObject.isNull("isPrivate")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isPrivate' to null.");
            }
            com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$isPrivate(jSONObject.getBoolean("isPrivate"));
        }
        if (jSONObject.has("category")) {
            if (jSONObject.isNull("category")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$category(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$category(jSONObject.getString("category"));
            }
        }
        if (jSONObject.has("arTitle")) {
            if (jSONObject.isNull("arTitle")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$arTitle(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$arTitle(jSONObject.getString("arTitle"));
            }
        }
        if (jSONObject.has("enTitle")) {
            if (jSONObject.isNull("enTitle")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$enTitle(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$enTitle(jSONObject.getString("enTitle"));
            }
        }
        if (jSONObject.has("arSubtitle")) {
            if (jSONObject.isNull("arSubtitle")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$arSubtitle(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$arSubtitle(jSONObject.getString("arSubtitle"));
            }
        }
        if (jSONObject.has("enSubtitle")) {
            if (jSONObject.isNull("enSubtitle")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$enSubtitle(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$enSubtitle(jSONObject.getString("enSubtitle"));
            }
        }
        if (jSONObject.has("arInfo")) {
            if (jSONObject.isNull("arInfo")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$arInfo(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$arInfo(jSONObject.getString("arInfo"));
            }
        }
        if (jSONObject.has("enInfo")) {
            if (jSONObject.isNull("enInfo")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$enInfo(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$enInfo(jSONObject.getString("enInfo"));
            }
        }
        if (jSONObject.has("searchableText")) {
            if (jSONObject.isNull("searchableText")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$searchableText(null);
            } else {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$searchableText(jSONObject.getString("searchableText"));
            }
        }
        if (jSONObject.has("tracks")) {
            if (jSONObject.isNull("tracks")) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmSet$tracks(null);
                return com_ayah_dao_realm_model_audio_reciterrealmproxy;
            }
            com_ayah_dao_realm_model_audio_reciterrealmproxy.realmGet$tracks().clear();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                com_ayah_dao_realm_model_audio_reciterrealmproxy.realmGet$tracks().add(com_ayah_dao_realm_model_audio_TrackRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i10), z10));
            }
        }
        return com_ayah_dao_realm_model_audio_reciterrealmproxy;
    }

    @TargetApi(11)
    public static Reciter createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Reciter reciter = new Reciter();
        jsonReader.beginObject();
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("reciterID")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$reciterID(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$reciterID(null);
                }
                z10 = true;
            } else if (strNextName.equals("isPrivate")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'isPrivate' to null.");
                }
                reciter.realmSet$isPrivate(jsonReader.nextBoolean());
            } else if (strNextName.equals("category")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$category(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$category(null);
                }
            } else if (strNextName.equals("arTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$arTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$arTitle(null);
                }
            } else if (strNextName.equals("enTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$enTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$enTitle(null);
                }
            } else if (strNextName.equals("arSubtitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$arSubtitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$arSubtitle(null);
                }
            } else if (strNextName.equals("enSubtitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$enSubtitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$enSubtitle(null);
                }
            } else if (strNextName.equals("arInfo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$arInfo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$arInfo(null);
                }
            } else if (strNextName.equals("enInfo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$enInfo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$enInfo(null);
                }
            } else if (strNextName.equals("searchableText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    reciter.realmSet$searchableText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    reciter.realmSet$searchableText(null);
                }
            } else if (!strNextName.equals("tracks")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                reciter.realmSet$tracks(null);
            } else {
                reciter.realmSet$tracks(new RealmList<>());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    reciter.realmGet$tracks().add(com_ayah_dao_realm_model_audio_TrackRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z10) {
            return (Reciter) realm.copyToRealmOrUpdate(reciter, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'reciterID'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, Reciter reciter, Map<RealmModel, Long> map) {
        if ((reciter instanceof RealmObjectProxy) && !RealmObject.isFrozen(reciter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) reciter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Reciter.class);
        long nativePtr = table.getNativePtr();
        ReciterColumnInfo reciterColumnInfo = (ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class);
        long j = reciterColumnInfo.reciterIDColKey;
        String strRealmGet$reciterID = reciter.realmGet$reciterID();
        long jNativeFindFirstString = strRealmGet$reciterID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$reciterID) : -1L;
        if (jNativeFindFirstString == -1) {
            jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$reciterID);
        } else {
            Table.throwDuplicatePrimaryKeyException(strRealmGet$reciterID);
        }
        long j10 = jNativeFindFirstString;
        map.put(reciter, Long.valueOf(j10));
        Table.nativeSetBoolean(nativePtr, reciterColumnInfo.isPrivateColKey, j10, reciter.realmGet$isPrivate(), false);
        String strRealmGet$category = reciter.realmGet$category();
        if (strRealmGet$category != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.categoryColKey, j10, strRealmGet$category, false);
        }
        String strRealmGet$arTitle = reciter.realmGet$arTitle();
        if (strRealmGet$arTitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.arTitleColKey, j10, strRealmGet$arTitle, false);
        }
        String strRealmGet$enTitle = reciter.realmGet$enTitle();
        if (strRealmGet$enTitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.enTitleColKey, j10, strRealmGet$enTitle, false);
        }
        String strRealmGet$arSubtitle = reciter.realmGet$arSubtitle();
        if (strRealmGet$arSubtitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.arSubtitleColKey, j10, strRealmGet$arSubtitle, false);
        }
        String strRealmGet$enSubtitle = reciter.realmGet$enSubtitle();
        if (strRealmGet$enSubtitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.enSubtitleColKey, j10, strRealmGet$enSubtitle, false);
        }
        String strRealmGet$arInfo = reciter.realmGet$arInfo();
        if (strRealmGet$arInfo != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.arInfoColKey, j10, strRealmGet$arInfo, false);
        }
        String strRealmGet$enInfo = reciter.realmGet$enInfo();
        if (strRealmGet$enInfo != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.enInfoColKey, j10, strRealmGet$enInfo, false);
        }
        String strRealmGet$searchableText = reciter.realmGet$searchableText();
        if (strRealmGet$searchableText != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.searchableTextColKey, j10, strRealmGet$searchableText, false);
        }
        RealmList<Track> realmListRealmGet$tracks = reciter.realmGet$tracks();
        if (realmListRealmGet$tracks != null) {
            OsList osList = new OsList(table.getUncheckedRow(j10), reciterColumnInfo.tracksColKey);
            for (Track track : realmListRealmGet$tracks) {
                Long lValueOf = map.get(track);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_TrackRealmProxy.insert(realm, track, map));
                }
                osList.addRow(lValueOf.longValue());
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, Reciter reciter, Map<RealmModel, Long> map) {
        if ((reciter instanceof RealmObjectProxy) && !RealmObject.isFrozen(reciter)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) reciter;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(Reciter.class);
        long nativePtr = table.getNativePtr();
        ReciterColumnInfo reciterColumnInfo = (ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class);
        long j = reciterColumnInfo.reciterIDColKey;
        String strRealmGet$reciterID = reciter.realmGet$reciterID();
        long jNativeFindFirstString = strRealmGet$reciterID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$reciterID) : -1L;
        if (jNativeFindFirstString == -1) {
            jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$reciterID);
        }
        long j10 = jNativeFindFirstString;
        map.put(reciter, Long.valueOf(j10));
        Table.nativeSetBoolean(nativePtr, reciterColumnInfo.isPrivateColKey, j10, reciter.realmGet$isPrivate(), false);
        String strRealmGet$category = reciter.realmGet$category();
        if (strRealmGet$category != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.categoryColKey, j10, strRealmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.categoryColKey, j10, false);
        }
        String strRealmGet$arTitle = reciter.realmGet$arTitle();
        if (strRealmGet$arTitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.arTitleColKey, j10, strRealmGet$arTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.arTitleColKey, j10, false);
        }
        String strRealmGet$enTitle = reciter.realmGet$enTitle();
        if (strRealmGet$enTitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.enTitleColKey, j10, strRealmGet$enTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.enTitleColKey, j10, false);
        }
        String strRealmGet$arSubtitle = reciter.realmGet$arSubtitle();
        if (strRealmGet$arSubtitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.arSubtitleColKey, j10, strRealmGet$arSubtitle, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.arSubtitleColKey, j10, false);
        }
        String strRealmGet$enSubtitle = reciter.realmGet$enSubtitle();
        if (strRealmGet$enSubtitle != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.enSubtitleColKey, j10, strRealmGet$enSubtitle, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.enSubtitleColKey, j10, false);
        }
        String strRealmGet$arInfo = reciter.realmGet$arInfo();
        if (strRealmGet$arInfo != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.arInfoColKey, j10, strRealmGet$arInfo, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.arInfoColKey, j10, false);
        }
        String strRealmGet$enInfo = reciter.realmGet$enInfo();
        if (strRealmGet$enInfo != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.enInfoColKey, j10, strRealmGet$enInfo, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.enInfoColKey, j10, false);
        }
        String strRealmGet$searchableText = reciter.realmGet$searchableText();
        if (strRealmGet$searchableText != null) {
            Table.nativeSetString(nativePtr, reciterColumnInfo.searchableTextColKey, j10, strRealmGet$searchableText, false);
        } else {
            Table.nativeSetNull(nativePtr, reciterColumnInfo.searchableTextColKey, j10, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(j10), reciterColumnInfo.tracksColKey);
        RealmList<Track> realmListRealmGet$tracks = reciter.realmGet$tracks();
        if (realmListRealmGet$tracks == null || realmListRealmGet$tracks.size() != osList.size()) {
            osList.removeAll();
            if (realmListRealmGet$tracks != null) {
                for (Track track : realmListRealmGet$tracks) {
                    Long lValueOf = map.get(track);
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, track, map));
                    }
                    osList.addRow(lValueOf.longValue());
                }
            }
        } else {
            int size = realmListRealmGet$tracks.size();
            int iQ = 0;
            while (iQ < size) {
                Track track2 = realmListRealmGet$tracks.get(iQ);
                Long lValueOf2 = map.get(track2);
                if (lValueOf2 == null) {
                    lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, track2, map));
                }
                iQ = p.q(lValueOf2, osList, iQ, iQ, 1);
            }
        }
        return j10;
    }

    public static com_ayah_dao_realm_model_audio_ReciterRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Reciter.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_audio_ReciterRealmProxy com_ayah_dao_realm_model_audio_reciterrealmproxy = new com_ayah_dao_realm_model_audio_ReciterRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_audio_reciterrealmproxy;
    }

    public static Reciter update(Realm realm, ReciterColumnInfo reciterColumnInfo, Reciter reciter, Reciter reciter2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2;
        Map<RealmModel, RealmObjectProxy> map2;
        Set<ImportFlag> set2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Reciter.class), set);
        osObjectBuilder.addString(reciterColumnInfo.reciterIDColKey, reciter2.realmGet$reciterID());
        osObjectBuilder.addBoolean(reciterColumnInfo.isPrivateColKey, Boolean.valueOf(reciter2.realmGet$isPrivate()));
        osObjectBuilder.addString(reciterColumnInfo.categoryColKey, reciter2.realmGet$category());
        osObjectBuilder.addString(reciterColumnInfo.arTitleColKey, reciter2.realmGet$arTitle());
        osObjectBuilder.addString(reciterColumnInfo.enTitleColKey, reciter2.realmGet$enTitle());
        osObjectBuilder.addString(reciterColumnInfo.arSubtitleColKey, reciter2.realmGet$arSubtitle());
        osObjectBuilder.addString(reciterColumnInfo.enSubtitleColKey, reciter2.realmGet$enSubtitle());
        osObjectBuilder.addString(reciterColumnInfo.arInfoColKey, reciter2.realmGet$arInfo());
        osObjectBuilder.addString(reciterColumnInfo.enInfoColKey, reciter2.realmGet$enInfo());
        osObjectBuilder.addString(reciterColumnInfo.searchableTextColKey, reciter2.realmGet$searchableText());
        RealmList<Track> realmListRealmGet$tracks = reciter2.realmGet$tracks();
        if (realmListRealmGet$tracks != null) {
            RealmList realmList = new RealmList();
            int i10 = 0;
            while (i10 < realmListRealmGet$tracks.size()) {
                Track track = realmListRealmGet$tracks.get(i10);
                Track track2 = (Track) map.get(track);
                if (track2 != null) {
                    realmList.add(track2);
                    realm2 = realm;
                    map2 = map;
                    set2 = set;
                } else {
                    realm2 = realm;
                    map2 = map;
                    set2 = set;
                    realmList.add(com_ayah_dao_realm_model_audio_TrackRealmProxy.copyOrUpdate(realm2, (com_ayah_dao_realm_model_audio_TrackRealmProxy.TrackColumnInfo) realm.getSchema().getColumnInfo(Track.class), track, true, map2, set2));
                }
                i10++;
                realm = realm2;
                map = map2;
                set = set2;
            }
            osObjectBuilder.addObjectList(reciterColumnInfo.tracksColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(reciterColumnInfo.tracksColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return reciter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_audio_ReciterRealmProxy com_ayah_dao_realm_model_audio_reciterrealmproxy = (com_ayah_dao_realm_model_audio_ReciterRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_audio_reciterrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_audio_reciterrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_audio_reciterrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (ReciterColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<Reciter> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$arInfo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.arInfoColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$arSubtitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.arSubtitleColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$arTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.arTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$category() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.categoryColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$enInfo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.enInfoColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$enSubtitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.enSubtitleColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$enTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.enTitleColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public boolean realmGet$isPrivate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isPrivateColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$reciterID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.reciterIDColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$searchableText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.searchableTextColKey);
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public RealmList<Track> realmGet$tracks() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Track> realmList = this.tracksRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Track> realmList2 = new RealmList<>((Class<Track>) Track.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.tracksColKey), this.proxyState.getRealm$realm());
        this.tracksRealmList = realmList2;
        return realmList2;
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$arInfo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.arInfoColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.arInfoColKey, str);
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.arInfoColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.arInfoColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$arSubtitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.arSubtitleColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.arSubtitleColKey, str);
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.arSubtitleColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.arSubtitleColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$arTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'arTitle' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.arTitleColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'arTitle' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.arTitleColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$category(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.categoryColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.categoryColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$enInfo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.enInfoColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.enInfoColKey, str);
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.enInfoColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.enInfoColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$enSubtitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.enSubtitleColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.enSubtitleColKey, str);
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.enSubtitleColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.enSubtitleColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$enTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'enTitle' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.enTitleColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'enTitle' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.enTitleColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$isPrivate(boolean z10) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isPrivateColKey, z10);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isPrivateColKey, row$realm.getObjectKey(), z10, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$reciterID(String str) {
        if (this.proxyState.isUnderConstruction()) {
            return;
        }
        this.proxyState.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'reciterID' cannot be changed after object was created.");
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$searchableText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'searchableText' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.searchableTextColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'searchableText' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.searchableTextColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.audio.Reciter, io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$tracks(RealmList<Track> realmList) {
        int i10 = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("tracks")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Track> realmList2 = new RealmList<>();
                for (Track track : realmList) {
                    if (track == null || RealmObject.isManaged(track)) {
                        realmList2.add(track);
                    } else {
                        realmList2.add((Track) realm.copyToRealmOrUpdate(track, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.tracksColKey);
        if (realmList != null && realmList.size() == modelList.size()) {
            int size = realmList.size();
            while (i10 < size) {
                RealmModel realmModel = (Track) realmList.get(i10);
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
            RealmModel realmModel2 = (Track) realmList.get(i10);
            this.proxyState.checkValidObject(realmModel2);
            modelList.addRow(((RealmObjectProxy) realmModel2).realmGet$proxyState().getRow$realm().getObjectKey());
            i10++;
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Reciter = proxy[{reciterID:");
        sb.append(realmGet$reciterID());
        sb.append("},{isPrivate:");
        sb.append(realmGet$isPrivate());
        sb.append("},{category:");
        sb.append(realmGet$category());
        sb.append("},{arTitle:");
        sb.append(realmGet$arTitle());
        sb.append("},{enTitle:");
        sb.append(realmGet$enTitle());
        sb.append("},{arSubtitle:");
        sb.append(realmGet$arSubtitle() != null ? realmGet$arSubtitle() : "null");
        sb.append("},{enSubtitle:");
        sb.append(realmGet$enSubtitle() != null ? realmGet$enSubtitle() : "null");
        sb.append("},{arInfo:");
        sb.append(realmGet$arInfo() != null ? realmGet$arInfo() : "null");
        sb.append("},{enInfo:");
        sb.append(realmGet$enInfo() != null ? realmGet$enInfo() : "null");
        sb.append("},{searchableText:");
        sb.append(realmGet$searchableText());
        sb.append("},{tracks:RealmList<Track>[");
        sb.append(realmGet$tracks().size());
        sb.append("]}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Reciter.class);
        long nativePtr = table.getNativePtr();
        ReciterColumnInfo reciterColumnInfo = (ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class);
        long j = reciterColumnInfo.reciterIDColKey;
        while (it.hasNext()) {
            Reciter reciter = (Reciter) it.next();
            if (!map.containsKey(reciter)) {
                if ((reciter instanceof RealmObjectProxy) && !RealmObject.isFrozen(reciter)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) reciter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(reciter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String strRealmGet$reciterID = reciter.realmGet$reciterID();
                long jNativeFindFirstString = strRealmGet$reciterID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$reciterID) : -1L;
                if (jNativeFindFirstString == -1) {
                    jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$reciterID);
                } else {
                    Table.throwDuplicatePrimaryKeyException(strRealmGet$reciterID);
                }
                long j10 = jNativeFindFirstString;
                map.put(reciter, Long.valueOf(j10));
                Table.nativeSetBoolean(nativePtr, reciterColumnInfo.isPrivateColKey, j10, reciter.realmGet$isPrivate(), false);
                String strRealmGet$category = reciter.realmGet$category();
                if (strRealmGet$category != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.categoryColKey, j10, strRealmGet$category, false);
                }
                String strRealmGet$arTitle = reciter.realmGet$arTitle();
                if (strRealmGet$arTitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.arTitleColKey, j10, strRealmGet$arTitle, false);
                }
                String strRealmGet$enTitle = reciter.realmGet$enTitle();
                if (strRealmGet$enTitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.enTitleColKey, j10, strRealmGet$enTitle, false);
                }
                String strRealmGet$arSubtitle = reciter.realmGet$arSubtitle();
                if (strRealmGet$arSubtitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.arSubtitleColKey, j10, strRealmGet$arSubtitle, false);
                }
                String strRealmGet$enSubtitle = reciter.realmGet$enSubtitle();
                if (strRealmGet$enSubtitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.enSubtitleColKey, j10, strRealmGet$enSubtitle, false);
                }
                String strRealmGet$arInfo = reciter.realmGet$arInfo();
                if (strRealmGet$arInfo != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.arInfoColKey, j10, strRealmGet$arInfo, false);
                }
                String strRealmGet$enInfo = reciter.realmGet$enInfo();
                if (strRealmGet$enInfo != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.enInfoColKey, j10, strRealmGet$enInfo, false);
                }
                String strRealmGet$searchableText = reciter.realmGet$searchableText();
                if (strRealmGet$searchableText != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.searchableTextColKey, j10, strRealmGet$searchableText, false);
                }
                RealmList<Track> realmListRealmGet$tracks = reciter.realmGet$tracks();
                if (realmListRealmGet$tracks != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j10), reciterColumnInfo.tracksColKey);
                    for (Track track : realmListRealmGet$tracks) {
                        Long lValueOf = map.get(track);
                        if (lValueOf == null) {
                            lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_TrackRealmProxy.insert(realm, track, map));
                        }
                        osList.addRow(lValueOf.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Reciter.class);
        long nativePtr = table.getNativePtr();
        ReciterColumnInfo reciterColumnInfo = (ReciterColumnInfo) realm.getSchema().getColumnInfo(Reciter.class);
        long j = reciterColumnInfo.reciterIDColKey;
        while (it.hasNext()) {
            Reciter reciter = (Reciter) it.next();
            if (!map.containsKey(reciter)) {
                if ((reciter instanceof RealmObjectProxy) && !RealmObject.isFrozen(reciter)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) reciter;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(reciter, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String strRealmGet$reciterID = reciter.realmGet$reciterID();
                long jNativeFindFirstString = strRealmGet$reciterID != null ? Table.nativeFindFirstString(nativePtr, j, strRealmGet$reciterID) : -1L;
                if (jNativeFindFirstString == -1) {
                    jNativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, strRealmGet$reciterID);
                }
                long j10 = jNativeFindFirstString;
                map.put(reciter, Long.valueOf(j10));
                Table.nativeSetBoolean(nativePtr, reciterColumnInfo.isPrivateColKey, j10, reciter.realmGet$isPrivate(), false);
                String strRealmGet$category = reciter.realmGet$category();
                if (strRealmGet$category != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.categoryColKey, j10, strRealmGet$category, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.categoryColKey, j10, false);
                }
                String strRealmGet$arTitle = reciter.realmGet$arTitle();
                if (strRealmGet$arTitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.arTitleColKey, j10, strRealmGet$arTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.arTitleColKey, j10, false);
                }
                String strRealmGet$enTitle = reciter.realmGet$enTitle();
                if (strRealmGet$enTitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.enTitleColKey, j10, strRealmGet$enTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.enTitleColKey, j10, false);
                }
                String strRealmGet$arSubtitle = reciter.realmGet$arSubtitle();
                if (strRealmGet$arSubtitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.arSubtitleColKey, j10, strRealmGet$arSubtitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.arSubtitleColKey, j10, false);
                }
                String strRealmGet$enSubtitle = reciter.realmGet$enSubtitle();
                if (strRealmGet$enSubtitle != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.enSubtitleColKey, j10, strRealmGet$enSubtitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.enSubtitleColKey, j10, false);
                }
                String strRealmGet$arInfo = reciter.realmGet$arInfo();
                if (strRealmGet$arInfo != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.arInfoColKey, j10, strRealmGet$arInfo, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.arInfoColKey, j10, false);
                }
                String strRealmGet$enInfo = reciter.realmGet$enInfo();
                if (strRealmGet$enInfo != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.enInfoColKey, j10, strRealmGet$enInfo, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.enInfoColKey, j10, false);
                }
                String strRealmGet$searchableText = reciter.realmGet$searchableText();
                if (strRealmGet$searchableText != null) {
                    Table.nativeSetString(nativePtr, reciterColumnInfo.searchableTextColKey, j10, strRealmGet$searchableText, false);
                } else {
                    Table.nativeSetNull(nativePtr, reciterColumnInfo.searchableTextColKey, j10, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j10), reciterColumnInfo.tracksColKey);
                RealmList<Track> realmListRealmGet$tracks = reciter.realmGet$tracks();
                if (realmListRealmGet$tracks != null && realmListRealmGet$tracks.size() == osList.size()) {
                    int size = realmListRealmGet$tracks.size();
                    int iQ = 0;
                    while (iQ < size) {
                        Track track = realmListRealmGet$tracks.get(iQ);
                        Long lValueOf = map.get(track);
                        if (lValueOf == null) {
                            lValueOf = Long.valueOf(com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, track, map));
                        }
                        iQ = p.q(lValueOf, osList, iQ, iQ, 1);
                    }
                } else {
                    osList.removeAll();
                    if (realmListRealmGet$tracks != null) {
                        for (Track track2 : realmListRealmGet$tracks) {
                            Long lValueOf2 = map.get(track2);
                            if (lValueOf2 == null) {
                                lValueOf2 = Long.valueOf(com_ayah_dao_realm_model_audio_TrackRealmProxy.insertOrUpdate(realm, track2, map));
                            }
                            osList.addRow(lValueOf2.longValue());
                        }
                    }
                }
            }
        }
    }
}
