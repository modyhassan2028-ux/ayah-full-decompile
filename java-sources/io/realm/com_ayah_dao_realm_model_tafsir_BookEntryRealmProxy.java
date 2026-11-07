package io.realm;

import android.annotation.TargetApi;
import android.support.v4.media.session.p;
import android.util.JsonReader;
import android.util.JsonToken;
import com.ayah.dao.realm.model.tafsir.BookEntry;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy extends BookEntry implements RealmObjectProxy, com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BookEntryColumnInfo columnInfo;
    private ProxyState<BookEntry> proxyState;

    public static final class BookEntryColumnInfo extends ColumnInfo {
        long chapterNumberColKey;
        long orderColKey;
        long pageNumberColKey;
        long textColKey;
        long typeColKey;
        long verseIDColKey;

        public BookEntryColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.orderColKey = addColumnDetails("order", "order", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.textColKey = addColumnDetails("text", "text", objectSchemaInfo);
            this.verseIDColKey = addColumnDetails("verseID", "verseID", objectSchemaInfo);
            this.pageNumberColKey = addColumnDetails("pageNumber", "pageNumber", objectSchemaInfo);
            this.chapterNumberColKey = addColumnDetails("chapterNumber", "chapterNumber", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z10) {
            return new BookEntryColumnInfo(this, z10);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BookEntryColumnInfo bookEntryColumnInfo = (BookEntryColumnInfo) columnInfo;
            BookEntryColumnInfo bookEntryColumnInfo2 = (BookEntryColumnInfo) columnInfo2;
            bookEntryColumnInfo2.orderColKey = bookEntryColumnInfo.orderColKey;
            bookEntryColumnInfo2.typeColKey = bookEntryColumnInfo.typeColKey;
            bookEntryColumnInfo2.textColKey = bookEntryColumnInfo.textColKey;
            bookEntryColumnInfo2.verseIDColKey = bookEntryColumnInfo.verseIDColKey;
            bookEntryColumnInfo2.pageNumberColKey = bookEntryColumnInfo.pageNumberColKey;
            bookEntryColumnInfo2.chapterNumberColKey = bookEntryColumnInfo.chapterNumberColKey;
        }

        public BookEntryColumnInfo(ColumnInfo columnInfo, boolean z10) {
            super(columnInfo, z10);
            copy(columnInfo, this);
        }
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BookEntry";
    }

    public com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static BookEntry copy(Realm realm, BookEntryColumnInfo bookEntryColumnInfo, BookEntry bookEntry, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bookEntry);
        if (realmObjectProxy != null) {
            return (BookEntry) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BookEntry.class), set);
        osObjectBuilder.addInteger(bookEntryColumnInfo.orderColKey, Long.valueOf(bookEntry.realmGet$order()));
        osObjectBuilder.addString(bookEntryColumnInfo.typeColKey, bookEntry.realmGet$type());
        osObjectBuilder.addString(bookEntryColumnInfo.textColKey, bookEntry.realmGet$text());
        osObjectBuilder.addInteger(bookEntryColumnInfo.verseIDColKey, bookEntry.realmGet$verseID());
        osObjectBuilder.addInteger(bookEntryColumnInfo.pageNumberColKey, bookEntry.realmGet$pageNumber());
        osObjectBuilder.addInteger(bookEntryColumnInfo.chapterNumberColKey, bookEntry.realmGet$chapterNumber());
        com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy com_ayah_dao_realm_model_tafsir_bookentryrealmproxyNewProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bookEntry, com_ayah_dao_realm_model_tafsir_bookentryrealmproxyNewProxyInstance);
        return com_ayah_dao_realm_model_tafsir_bookentryrealmproxyNewProxyInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BookEntry copyOrUpdate(Realm realm, BookEntryColumnInfo bookEntryColumnInfo, BookEntry bookEntry, boolean z10, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((bookEntry instanceof RealmObjectProxy) && !RealmObject.isFrozen(bookEntry)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bookEntry;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (realm$realm.getPath().equals(realm.getPath())) {
                    return bookEntry;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmModel realmModel = (RealmObjectProxy) map.get(bookEntry);
        return realmModel != null ? (BookEntry) realmModel : copy(realm, bookEntryColumnInfo, bookEntry, z10, map, set);
    }

    public static BookEntryColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BookEntryColumnInfo(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BookEntry createDetachedCopy(BookEntry bookEntry, int i10, int i11, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BookEntry bookEntry2;
        if (i10 > i11 || bookEntry == 0) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(bookEntry);
        if (cacheData == null) {
            bookEntry2 = new BookEntry();
            map.put(bookEntry, new RealmObjectProxy.CacheData<>(i10, bookEntry2));
        } else {
            if (i10 >= cacheData.minDepth) {
                return (BookEntry) cacheData.object;
            }
            BookEntry bookEntry3 = (BookEntry) cacheData.object;
            cacheData.minDepth = i10;
            bookEntry2 = bookEntry3;
        }
        bookEntry2.realmSet$order(bookEntry.realmGet$order());
        bookEntry2.realmSet$type(bookEntry.realmGet$type());
        bookEntry2.realmSet$text(bookEntry.realmGet$text());
        bookEntry2.realmSet$verseID(bookEntry.realmGet$verseID());
        bookEntry2.realmSet$pageNumber(bookEntry.realmGet$pageNumber());
        bookEntry2.realmSet$chapterNumber(bookEntry.realmGet$chapterNumber());
        return bookEntry2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, ClassNameHelper.INTERNAL_CLASS_NAME, false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        builder.addPersistedProperty(NO_ALIAS, "order", realmFieldType, false, true, true);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        builder.addPersistedProperty(NO_ALIAS, "type", realmFieldType2, false, true, true);
        builder.addPersistedProperty(NO_ALIAS, "text", realmFieldType2, false, false, false);
        builder.addPersistedProperty(NO_ALIAS, "verseID", realmFieldType, false, true, false);
        builder.addPersistedProperty(NO_ALIAS, "pageNumber", realmFieldType, false, true, false);
        builder.addPersistedProperty(NO_ALIAS, "chapterNumber", realmFieldType, false, true, false);
        return builder.build();
    }

    public static BookEntry createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z10) {
        BookEntry bookEntry = (BookEntry) realm.createObjectInternal(BookEntry.class, true, Collections.EMPTY_LIST);
        if (jSONObject.has("order")) {
            if (jSONObject.isNull("order")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'order' to null.");
            }
            bookEntry.realmSet$order(jSONObject.getLong("order"));
        }
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                bookEntry.realmSet$type(null);
            } else {
                bookEntry.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("text")) {
            if (jSONObject.isNull("text")) {
                bookEntry.realmSet$text(null);
            } else {
                bookEntry.realmSet$text(jSONObject.getString("text"));
            }
        }
        if (jSONObject.has("verseID")) {
            if (jSONObject.isNull("verseID")) {
                bookEntry.realmSet$verseID(null);
            } else {
                bookEntry.realmSet$verseID(Long.valueOf(jSONObject.getLong("verseID")));
            }
        }
        if (jSONObject.has("pageNumber")) {
            if (jSONObject.isNull("pageNumber")) {
                bookEntry.realmSet$pageNumber(null);
            } else {
                bookEntry.realmSet$pageNumber(Long.valueOf(jSONObject.getLong("pageNumber")));
            }
        }
        if (jSONObject.has("chapterNumber")) {
            if (jSONObject.isNull("chapterNumber")) {
                bookEntry.realmSet$chapterNumber(null);
                return bookEntry;
            }
            bookEntry.realmSet$chapterNumber(Long.valueOf(jSONObject.getLong("chapterNumber")));
        }
        return bookEntry;
    }

    @TargetApi(11)
    public static BookEntry createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BookEntry bookEntry = new BookEntry();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("order")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    throw p.v(jsonReader, "Trying to set non-nullable field 'order' to null.");
                }
                bookEntry.realmSet$order(jsonReader.nextLong());
            } else if (strNextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    bookEntry.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    bookEntry.realmSet$type(null);
                }
            } else if (strNextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    bookEntry.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    bookEntry.realmSet$text(null);
                }
            } else if (strNextName.equals("verseID")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    bookEntry.realmSet$verseID(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    bookEntry.realmSet$verseID(null);
                }
            } else if (strNextName.equals("pageNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    bookEntry.realmSet$pageNumber(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    bookEntry.realmSet$pageNumber(null);
                }
            } else if (!strNextName.equals("chapterNumber")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                bookEntry.realmSet$chapterNumber(Long.valueOf(jsonReader.nextLong()));
            } else {
                jsonReader.skipValue();
                bookEntry.realmSet$chapterNumber(null);
            }
        }
        jsonReader.endObject();
        return (BookEntry) realm.copyToRealm(bookEntry, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insert(Realm realm, BookEntry bookEntry, Map<RealmModel, Long> map) {
        if ((bookEntry instanceof RealmObjectProxy) && !RealmObject.isFrozen(bookEntry)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bookEntry;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(BookEntry.class);
        long nativePtr = table.getNativePtr();
        BookEntryColumnInfo bookEntryColumnInfo = (BookEntryColumnInfo) realm.getSchema().getColumnInfo(BookEntry.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(bookEntry, Long.valueOf(jCreateRow));
        Table.nativeSetLong(nativePtr, bookEntryColumnInfo.orderColKey, jCreateRow, bookEntry.realmGet$order(), false);
        String strRealmGet$type = bookEntry.realmGet$type();
        if (strRealmGet$type != null) {
            Table.nativeSetString(nativePtr, bookEntryColumnInfo.typeColKey, jCreateRow, strRealmGet$type, false);
        }
        String strRealmGet$text = bookEntry.realmGet$text();
        if (strRealmGet$text != null) {
            Table.nativeSetString(nativePtr, bookEntryColumnInfo.textColKey, jCreateRow, strRealmGet$text, false);
        }
        Long lRealmGet$verseID = bookEntry.realmGet$verseID();
        if (lRealmGet$verseID != null) {
            Table.nativeSetLong(nativePtr, bookEntryColumnInfo.verseIDColKey, jCreateRow, lRealmGet$verseID.longValue(), false);
        }
        Long lRealmGet$pageNumber = bookEntry.realmGet$pageNumber();
        if (lRealmGet$pageNumber != null) {
            Table.nativeSetLong(nativePtr, bookEntryColumnInfo.pageNumberColKey, jCreateRow, lRealmGet$pageNumber.longValue(), false);
        }
        Long lRealmGet$chapterNumber = bookEntry.realmGet$chapterNumber();
        if (lRealmGet$chapterNumber != null) {
            Table.nativeSetLong(nativePtr, bookEntryColumnInfo.chapterNumberColKey, jCreateRow, lRealmGet$chapterNumber.longValue(), false);
        }
        return jCreateRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long insertOrUpdate(Realm realm, BookEntry bookEntry, Map<RealmModel, Long> map) {
        if ((bookEntry instanceof RealmObjectProxy) && !RealmObject.isFrozen(bookEntry)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bookEntry;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return p.r(realmObjectProxy);
            }
        }
        Table table = realm.getTable(BookEntry.class);
        long nativePtr = table.getNativePtr();
        BookEntryColumnInfo bookEntryColumnInfo = (BookEntryColumnInfo) realm.getSchema().getColumnInfo(BookEntry.class);
        long jCreateRow = OsObject.createRow(table);
        map.put(bookEntry, Long.valueOf(jCreateRow));
        Table.nativeSetLong(nativePtr, bookEntryColumnInfo.orderColKey, jCreateRow, bookEntry.realmGet$order(), false);
        String strRealmGet$type = bookEntry.realmGet$type();
        if (strRealmGet$type != null) {
            Table.nativeSetString(nativePtr, bookEntryColumnInfo.typeColKey, jCreateRow, strRealmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, bookEntryColumnInfo.typeColKey, jCreateRow, false);
        }
        String strRealmGet$text = bookEntry.realmGet$text();
        if (strRealmGet$text != null) {
            Table.nativeSetString(nativePtr, bookEntryColumnInfo.textColKey, jCreateRow, strRealmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, bookEntryColumnInfo.textColKey, jCreateRow, false);
        }
        Long lRealmGet$verseID = bookEntry.realmGet$verseID();
        if (lRealmGet$verseID != null) {
            Table.nativeSetLong(nativePtr, bookEntryColumnInfo.verseIDColKey, jCreateRow, lRealmGet$verseID.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, bookEntryColumnInfo.verseIDColKey, jCreateRow, false);
        }
        Long lRealmGet$pageNumber = bookEntry.realmGet$pageNumber();
        if (lRealmGet$pageNumber != null) {
            Table.nativeSetLong(nativePtr, bookEntryColumnInfo.pageNumberColKey, jCreateRow, lRealmGet$pageNumber.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, bookEntryColumnInfo.pageNumberColKey, jCreateRow, false);
        }
        Long lRealmGet$chapterNumber = bookEntry.realmGet$chapterNumber();
        if (lRealmGet$chapterNumber != null) {
            Table.nativeSetLong(nativePtr, bookEntryColumnInfo.chapterNumberColKey, jCreateRow, lRealmGet$chapterNumber.longValue(), false);
            return jCreateRow;
        }
        Table.nativeSetNull(nativePtr, bookEntryColumnInfo.chapterNumberColKey, jCreateRow, false);
        return jCreateRow;
    }

    public static com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(BookEntry.class), false, Collections.EMPTY_LIST);
        com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy com_ayah_dao_realm_model_tafsir_bookentryrealmproxy = new com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy();
        realmObjectContext.clear();
        return com_ayah_dao_realm_model_tafsir_bookentryrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy com_ayah_dao_realm_model_tafsir_bookentryrealmproxy = (com_ayah_dao_realm_model_tafsir_BookEntryRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_ayah_dao_realm_model_tafsir_bookentryrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String strY = p.y(this.proxyState);
        String strY2 = p.y(com_ayah_dao_realm_model_tafsir_bookentryrealmproxy.proxyState);
        if (strY == null ? strY2 == null : strY.equals(strY2)) {
            return this.proxyState.getRow$realm().getObjectKey() == com_ayah_dao_realm_model_tafsir_bookentryrealmproxy.proxyState.getRow$realm().getObjectKey();
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
        this.columnInfo = (BookEntryColumnInfo) realmObjectContext.getColumnInfo();
        ProxyState<BookEntry> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(realmObjectContext.getRealm());
        this.proxyState.setRow$realm(realmObjectContext.getRow());
        this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public Long realmGet$chapterNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.chapterNumberColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.chapterNumberColKey));
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public long realmGet$order() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.orderColKey);
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public Long realmGet$pageNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.pageNumberColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.pageNumberColKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textColKey);
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeColKey);
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public Long realmGet$verseID() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.verseIDColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.verseIDColKey));
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$chapterNumber(Long l10) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l10 == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.chapterNumberColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.chapterNumberColKey, l10.longValue());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l10 == null) {
                row$realm.getTable().setNull(this.columnInfo.chapterNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.chapterNumberColKey, row$realm.getObjectKey(), l10.longValue(), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$order(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.orderColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.orderColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$pageNumber(Long l10) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l10 == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.pageNumberColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.pageNumberColKey, l10.longValue());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l10 == null) {
                row$realm.getTable().setNull(this.columnInfo.pageNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.pageNumberColKey, row$realm.getObjectKey(), l10.longValue(), true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textColKey, str);
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            }
            this.proxyState.getRow$realm().setString(this.columnInfo.typeColKey, str);
            return;
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            }
            row$realm.getTable().setString(this.columnInfo.typeColKey, row$realm.getObjectKey(), str, true);
        }
    }

    @Override // com.ayah.dao.realm.model.tafsir.BookEntry, io.realm.com_ayah_dao_realm_model_tafsir_BookEntryRealmProxyInterface
    public void realmSet$verseID(Long l10) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l10 == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.verseIDColKey);
                return;
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.verseIDColKey, l10.longValue());
                return;
            }
        }
        if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l10 == null) {
                row$realm.getTable().setNull(this.columnInfo.verseIDColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.verseIDColKey, row$realm.getObjectKey(), l10.longValue(), true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("BookEntry = proxy[{order:");
        sb.append(realmGet$order());
        sb.append("},{type:");
        sb.append(realmGet$type());
        sb.append("},{text:");
        sb.append(realmGet$text() != null ? realmGet$text() : "null");
        sb.append("},{verseID:");
        sb.append(realmGet$verseID() != null ? realmGet$verseID() : "null");
        sb.append("},{pageNumber:");
        sb.append(realmGet$pageNumber() != null ? realmGet$pageNumber() : "null");
        sb.append("},{chapterNumber:");
        sb.append(realmGet$chapterNumber() != null ? realmGet$chapterNumber() : "null");
        sb.append("}]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BookEntry.class);
        long nativePtr = table.getNativePtr();
        BookEntryColumnInfo bookEntryColumnInfo = (BookEntryColumnInfo) realm.getSchema().getColumnInfo(BookEntry.class);
        while (it.hasNext()) {
            BookEntry bookEntry = (BookEntry) it.next();
            if (!map.containsKey(bookEntry)) {
                if ((bookEntry instanceof RealmObjectProxy) && !RealmObject.isFrozen(bookEntry)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bookEntry;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(bookEntry, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(bookEntry, Long.valueOf(jCreateRow));
                Table.nativeSetLong(nativePtr, bookEntryColumnInfo.orderColKey, jCreateRow, bookEntry.realmGet$order(), false);
                String strRealmGet$type = bookEntry.realmGet$type();
                if (strRealmGet$type != null) {
                    Table.nativeSetString(nativePtr, bookEntryColumnInfo.typeColKey, jCreateRow, strRealmGet$type, false);
                }
                String strRealmGet$text = bookEntry.realmGet$text();
                if (strRealmGet$text != null) {
                    Table.nativeSetString(nativePtr, bookEntryColumnInfo.textColKey, jCreateRow, strRealmGet$text, false);
                }
                Long lRealmGet$verseID = bookEntry.realmGet$verseID();
                if (lRealmGet$verseID != null) {
                    Table.nativeSetLong(nativePtr, bookEntryColumnInfo.verseIDColKey, jCreateRow, lRealmGet$verseID.longValue(), false);
                }
                Long lRealmGet$pageNumber = bookEntry.realmGet$pageNumber();
                if (lRealmGet$pageNumber != null) {
                    Table.nativeSetLong(nativePtr, bookEntryColumnInfo.pageNumberColKey, jCreateRow, lRealmGet$pageNumber.longValue(), false);
                }
                Long lRealmGet$chapterNumber = bookEntry.realmGet$chapterNumber();
                if (lRealmGet$chapterNumber != null) {
                    Table.nativeSetLong(nativePtr, bookEntryColumnInfo.chapterNumberColKey, jCreateRow, lRealmGet$chapterNumber.longValue(), false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BookEntry.class);
        long nativePtr = table.getNativePtr();
        BookEntryColumnInfo bookEntryColumnInfo = (BookEntryColumnInfo) realm.getSchema().getColumnInfo(BookEntry.class);
        while (it.hasNext()) {
            BookEntry bookEntry = (BookEntry) it.next();
            if (!map.containsKey(bookEntry)) {
                if ((bookEntry instanceof RealmObjectProxy) && !RealmObject.isFrozen(bookEntry)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bookEntry;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(bookEntry, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long jCreateRow = OsObject.createRow(table);
                map.put(bookEntry, Long.valueOf(jCreateRow));
                Table.nativeSetLong(nativePtr, bookEntryColumnInfo.orderColKey, jCreateRow, bookEntry.realmGet$order(), false);
                String strRealmGet$type = bookEntry.realmGet$type();
                if (strRealmGet$type != null) {
                    Table.nativeSetString(nativePtr, bookEntryColumnInfo.typeColKey, jCreateRow, strRealmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, bookEntryColumnInfo.typeColKey, jCreateRow, false);
                }
                String strRealmGet$text = bookEntry.realmGet$text();
                if (strRealmGet$text != null) {
                    Table.nativeSetString(nativePtr, bookEntryColumnInfo.textColKey, jCreateRow, strRealmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, bookEntryColumnInfo.textColKey, jCreateRow, false);
                }
                Long lRealmGet$verseID = bookEntry.realmGet$verseID();
                if (lRealmGet$verseID != null) {
                    Table.nativeSetLong(nativePtr, bookEntryColumnInfo.verseIDColKey, jCreateRow, lRealmGet$verseID.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, bookEntryColumnInfo.verseIDColKey, jCreateRow, false);
                }
                Long lRealmGet$pageNumber = bookEntry.realmGet$pageNumber();
                if (lRealmGet$pageNumber != null) {
                    Table.nativeSetLong(nativePtr, bookEntryColumnInfo.pageNumberColKey, jCreateRow, lRealmGet$pageNumber.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, bookEntryColumnInfo.pageNumberColKey, jCreateRow, false);
                }
                Long lRealmGet$chapterNumber = bookEntry.realmGet$chapterNumber();
                if (lRealmGet$chapterNumber != null) {
                    Table.nativeSetLong(nativePtr, bookEntryColumnInfo.chapterNumberColKey, jCreateRow, lRealmGet$chapterNumber.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, bookEntryColumnInfo.chapterNumberColKey, jCreateRow, false);
                }
            }
        }
    }
}
