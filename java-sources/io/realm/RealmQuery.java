package io.realm;

import io.realm.internal.OsCollection;
import io.realm.internal.OsList;
import io.realm.internal.OsResults;
import io.realm.internal.OsSet;
import io.realm.internal.PendingRow;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class RealmQuery<E> {
    private static final String ASYNC_QUERY_WRONG_THREAD_MESSAGE = "Async query cannot be created on current thread.";
    private static final String EMPTY_VALUES = "Non-empty 'values' must be provided.";
    private static final String PRIMITIVE_LISTS_NOT_SUPPORTED_ERROR_MESSAGE = "Queries on primitive lists are not yet supported";
    private static final String TYPE_MISMATCH = "Field '%s': type mismatch - %s expected.";
    private String className;
    private Class<E> clazz;
    private final boolean forValues;
    private final OsCollection osCollection;
    private final TableQuery query;
    private final BaseRealm realm;
    private final RealmObjectSchema schema;
    private final Table table;

    /* JADX INFO: renamed from: io.realm.RealmQuery$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            $SwitchMap$io$realm$RealmFieldType = iArr;
            try {
                iArr[RealmFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private RealmQuery(Realm realm, Class<E> cls) {
        this.realm = realm;
        this.clazz = cls;
        boolean zIsClassForRealmModel = isClassForRealmModel(cls);
        this.forValues = !zIsClassForRealmModel;
        if (!zIsClassForRealmModel) {
            throw new UnsupportedOperationException(PRIMITIVE_LISTS_NOT_SUPPORTED_ERROR_MESSAGE);
        }
        RealmObjectSchema schemaForClass = realm.getSchema().getSchemaForClass((Class<? extends RealmModel>) cls);
        this.schema = schemaForClass;
        Table table = schemaForClass.getTable();
        this.table = table;
        this.osCollection = null;
        this.query = table.where();
    }

    public static <E extends RealmModel> RealmQuery<E> createDynamicQuery(DynamicRealm dynamicRealm, String str) {
        return new RealmQuery<>(dynamicRealm, str);
    }

    public static <E extends RealmModel> RealmQuery<E> createQuery(Realm realm, Class<E> cls) {
        return new RealmQuery<>(realm, cls);
    }

    public static <E> RealmQuery<E> createQueryFromList(RealmList<E> realmList) {
        return realmList.clazz == null ? new RealmQuery<>(realmList.baseRealm, realmList.getOsList(), realmList.className) : new RealmQuery<>(realmList.baseRealm, realmList.getOsList(), realmList.clazz);
    }

    public static <E> RealmQuery<E> createQueryFromResult(RealmResults<E> realmResults) {
        Class<E> cls = realmResults.classSpec;
        return cls == null ? new RealmQuery<>((RealmResults<DynamicRealmObject>) realmResults, realmResults.className) : new RealmQuery<>(realmResults, cls);
    }

    private RealmResults<E> createRealmResults(TableQuery tableQuery, boolean z10) {
        OsResults osResultsCreateFromQuery = OsResults.createFromQuery(this.realm.sharedRealm, tableQuery);
        RealmResults<E> realmResults = isDynamicQuery() ? new RealmResults<>(this.realm, osResultsCreateFromQuery, this.className) : new RealmResults<>(this.realm, osResultsCreateFromQuery, this.clazz);
        if (z10) {
            realmResults.load();
        }
        return realmResults;
    }

    private long getSourceRowIndexForFirstObject() {
        return this.query.find();
    }

    private static boolean isClassForRealmModel(Class<?> cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    private boolean isDynamicQuery() {
        return this.className != null;
    }

    private OsResults lazyFindAll() {
        this.realm.checkIfValid();
        return createRealmResults(this.query, false).osResults;
    }

    private static native String nativeSerializeQuery(long j);

    public RealmQuery<E> alwaysFalse() {
        this.realm.checkIfValid();
        this.query.alwaysFalse();
        return this;
    }

    public RealmQuery<E> alwaysTrue() {
        this.realm.checkIfValid();
        this.query.alwaysTrue();
        return this;
    }

    public RealmQuery<E> and() {
        this.realm.checkIfValid();
        return this;
    }

    public double average(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        long andCheckFieldColumnKey = this.schema.getAndCheckFieldColumnKey(str);
        int i10 = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[this.table.getColumnType(andCheckFieldColumnKey).ordinal()];
        if (i10 == 1) {
            return this.query.averageInt(andCheckFieldColumnKey);
        }
        if (i10 == 2) {
            return this.query.averageFloat(andCheckFieldColumnKey);
        }
        if (i10 == 3) {
            return this.query.averageDouble(andCheckFieldColumnKey);
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(a.D("Field '", str, "': type mismatch - int, float or double. For Decimal128 use `averageDecimal128` method. expected."));
    }

    public Decimal128 averageDecimal128(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return this.query.averageDecimal128(this.schema.getAndCheckFieldColumnKey(str));
    }

    public Decimal128 averageRealmAny(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return this.query.averageRealmAny(this.schema.getAndCheckFieldColumnKey(str));
    }

    public RealmQuery<E> beginGroup() {
        this.realm.checkIfValid();
        this.query.beginGroup();
        return this;
    }

    public RealmQuery<E> beginsWith(String str, String str2) {
        return beginsWith(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> between(String str, int i10, int i11) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Integer.valueOf(i10)), RealmAny.valueOf(Integer.valueOf(i11)));
        return this;
    }

    public RealmQuery<E> contains(String str, String str2) {
        return contains(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> containsEntry(String str, Map.Entry<String, ?> entry) {
        Util.checkNull(entry, "entry");
        this.realm.checkIfValid();
        this.query.containsEntry(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(entry.getKey()), RealmAny.valueOf(entry.getValue()));
        return this;
    }

    public RealmQuery<E> containsKey(String str, String str2) {
        this.realm.checkIfValid();
        this.query.containsKey(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(str2));
        return this;
    }

    public RealmQuery<E> containsValue(String str, Boolean bool) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(bool));
        return this;
    }

    public long count() {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return lazyFindAll().size();
    }

    public RealmQuery<E> distinct(String str, String... strArr) {
        this.realm.checkIfValid();
        String[] strArr2 = new String[strArr.length + 1];
        int i10 = 0;
        strArr2[0] = str;
        while (i10 < strArr.length) {
            int i11 = i10 + 1;
            strArr2[i11] = strArr[i10];
            i10 = i11;
        }
        this.query.distinct(this.realm.getSchema().getKeyPathMapping(), strArr2);
        return this;
    }

    public RealmQuery<E> endGroup() {
        this.realm.checkIfValid();
        this.query.endGroup();
        return this;
    }

    public RealmQuery<E> endsWith(String str, String str2) {
        return endsWith(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> equalTo(String str, String str2) {
        return equalTo(str, str2, Case.SENSITIVE);
    }

    public RealmResults<E> findAll() {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return createRealmResults(this.query, true);
    }

    public RealmResults<E> findAllAsync() {
        this.realm.checkIfValid();
        this.realm.sharedRealm.capabilities.checkCanDeliverNotification(ASYNC_QUERY_WRONG_THREAD_MESSAGE);
        return createRealmResults(this.query, false);
    }

    public E findFirst() {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        if (this.forValues) {
            return null;
        }
        long sourceRowIndexForFirstObject = getSourceRowIndexForFirstObject();
        if (sourceRowIndexForFirstObject < 0) {
            return null;
        }
        return (E) this.realm.get(this.clazz, this.className, sourceRowIndexForFirstObject);
    }

    public E findFirstAsync() {
        RealmObjectProxy realmObjectProxy;
        this.realm.checkIfValid();
        if (this.forValues) {
            throw new UnsupportedOperationException("findFirstAsync() available only when type parameter 'E' is implementing RealmModel.");
        }
        this.realm.sharedRealm.capabilities.checkCanDeliverNotification(ASYNC_QUERY_WRONG_THREAD_MESSAGE);
        Row rowFirstUncheckedRow = this.realm.isInTransaction() ? OsResults.createFromQuery(this.realm.sharedRealm, this.query).firstUncheckedRow() : new PendingRow(this.realm.sharedRealm, this.query, isDynamicQuery());
        if (isDynamicQuery()) {
            realmObjectProxy = (E) new DynamicRealmObject(this.realm, rowFirstUncheckedRow);
        } else {
            Class<E> cls = this.clazz;
            RealmProxyMediator schemaMediator = this.realm.getConfiguration().getSchemaMediator();
            BaseRealm baseRealm = this.realm;
            realmObjectProxy = (E) schemaMediator.newInstance(cls, baseRealm, rowFirstUncheckedRow, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) cls), false, Collections.EMPTY_LIST);
        }
        if (rowFirstUncheckedRow instanceof PendingRow) {
            ((PendingRow) rowFirstUncheckedRow).setFrontEnd(realmObjectProxy.realmGet$proxyState());
        }
        return (E) realmObjectProxy;
    }

    public String getDescription() {
        this.query.validateQuery();
        return nativeSerializeQuery(this.query.getNativePtr());
    }

    public long getQueryPointer() {
        return this.query.getNativePtr();
    }

    public Realm getRealm() {
        BaseRealm baseRealm = this.realm;
        if (baseRealm == null) {
            return null;
        }
        baseRealm.checkIfValid();
        BaseRealm baseRealm2 = this.realm;
        if (baseRealm2 instanceof Realm) {
            return (Realm) baseRealm2;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    public String getTypeQueried() {
        return this.table.getClassName();
    }

    public RealmQuery<E> greaterThan(String str, int i10) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Integer.valueOf(i10)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, int i10) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Integer.valueOf(i10)));
        return this;
    }

    public RealmQuery<E> in(String str, String[] strArr) {
        return in(str, strArr, Case.SENSITIVE);
    }

    public RealmQuery<E> isEmpty(String str) {
        this.realm.checkIfValid();
        this.query.isEmpty(this.realm.getSchema().getKeyPathMapping(), str);
        return this;
    }

    public RealmQuery<E> isNotEmpty(String str) {
        this.realm.checkIfValid();
        this.query.isNotEmpty(this.realm.getSchema().getKeyPathMapping(), str);
        return this;
    }

    public RealmQuery<E> isNotNull(String str) {
        this.realm.checkIfValid();
        this.query.isNotNull(this.realm.getSchema().getKeyPathMapping(), str);
        return this;
    }

    public RealmQuery<E> isNull(String str) {
        this.realm.checkIfValid();
        this.query.isNull(this.realm.getSchema().getKeyPathMapping(), str);
        return this;
    }

    public boolean isValid() {
        BaseRealm baseRealm = this.realm;
        if (baseRealm != null && !baseRealm.isClosed()) {
            OsCollection osCollection = this.osCollection;
            if (osCollection != null) {
                return osCollection.isValid();
            }
            Table table = this.table;
            if (table != null && table.isValid()) {
                return true;
            }
        }
        return false;
    }

    public RealmQuery<E> lessThan(String str, int i10) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Integer.valueOf(i10)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, int i10) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Integer.valueOf(i10)));
        return this;
    }

    public RealmQuery<E> like(String str, String str2) {
        return like(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> limit(long j) {
        this.realm.checkIfValid();
        this.query.limit(j);
        return this;
    }

    public Number max(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        long andCheckFieldColumnKey = this.schema.getAndCheckFieldColumnKey(str);
        int i10 = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[this.table.getColumnType(andCheckFieldColumnKey).ordinal()];
        if (i10 == 1) {
            return this.query.maximumInt(andCheckFieldColumnKey);
        }
        if (i10 == 2) {
            return this.query.maximumFloat(andCheckFieldColumnKey);
        }
        if (i10 == 3) {
            return this.query.maximumDouble(andCheckFieldColumnKey);
        }
        if (i10 == 4) {
            return this.query.maximumDecimal128(andCheckFieldColumnKey);
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(a.D("Field '", str, "': type mismatch - int, float or double expected."));
    }

    public RealmAny maxRealmAny(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.realm, this.query.maximumRealmAny(this.schema.getAndCheckFieldColumnKey(str))));
    }

    public Date maximumDate(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return this.query.maximumDate(this.schema.getAndCheckFieldColumnKey(str));
    }

    public Number min(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        long andCheckFieldColumnKey = this.schema.getAndCheckFieldColumnKey(str);
        int i10 = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[this.table.getColumnType(andCheckFieldColumnKey).ordinal()];
        if (i10 == 1) {
            return this.query.minimumInt(andCheckFieldColumnKey);
        }
        if (i10 == 2) {
            return this.query.minimumFloat(andCheckFieldColumnKey);
        }
        if (i10 == 3) {
            return this.query.minimumDouble(andCheckFieldColumnKey);
        }
        if (i10 == 4) {
            return this.query.minimumDecimal128(andCheckFieldColumnKey);
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(a.D("Field '", str, "': type mismatch - int, float or double expected."));
    }

    public RealmAny minRealmAny(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.realm, this.query.minimumRealmAny(this.schema.getAndCheckFieldColumnKey(str))));
    }

    public Date minimumDate(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        return this.query.minimumDate(this.schema.getAndCheckFieldColumnKey(str));
    }

    public RealmQuery<E> not() {
        this.realm.checkIfValid();
        this.query.not();
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, String str2) {
        return notEqualTo(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> or() {
        this.realm.checkIfValid();
        this.query.or();
        return this;
    }

    public RealmQuery<E> rawPredicate(String str, Object... objArr) {
        this.realm.checkIfValid();
        if (Util.isEmptyString(str)) {
            throw new IllegalArgumentException("Non-null 'predicate' required.");
        }
        RealmAny[] realmAnyArr = new RealmAny[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            realmAnyArr[i10] = RealmAny.valueOf(objArr[i10]);
        }
        try {
            this.query.rawPredicate(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        } catch (IllegalArgumentException e10) {
            if (e10.getMessage().startsWith("Illegal Argument: Request for argument at index")) {
                throw new IllegalStateException(e10.getMessage());
            }
            throw e10;
        }
    }

    public RealmQuery<E> sort(String str) {
        this.realm.checkIfValid();
        return sort(str, Sort.ASCENDING);
    }

    public Number sum(String str) {
        this.realm.checkIfValid();
        this.realm.checkAllowQueriesOnUiThread();
        long andCheckFieldColumnKey = this.schema.getAndCheckFieldColumnKey(str);
        int i10 = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[this.table.getColumnType(andCheckFieldColumnKey).ordinal()];
        if (i10 == 1) {
            return Long.valueOf(this.query.sumInt(andCheckFieldColumnKey));
        }
        if (i10 == 2) {
            return Double.valueOf(this.query.sumFloat(andCheckFieldColumnKey));
        }
        if (i10 == 3) {
            return Double.valueOf(this.query.sumDouble(andCheckFieldColumnKey));
        }
        if (i10 == 4) {
            return this.query.sumDecimal128(andCheckFieldColumnKey);
        }
        if (i10 == 5) {
            return this.query.sumRealmAny(andCheckFieldColumnKey);
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(a.D("Field '", str, "': type mismatch - int, float or double expected."));
    }

    public RealmQuery<E> beginsWith(String str, RealmAny realmAny) {
        return beginsWith(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> contains(String str, RealmAny realmAny) {
        return contains(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> endsWith(String str, RealmAny realmAny) {
        return endsWith(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> equalTo(String str, String str2, Case r10) {
        this.realm.checkIfValid();
        equalTo(str, RealmAny.valueOf(str2), r10);
        return this;
    }

    public RealmQuery<E> in(String str, String[] strArr, Case r10) {
        this.realm.checkIfValid();
        if (strArr == null || strArr.length == 0) {
            alwaysFalse();
            return this;
        }
        RealmAny[] realmAnyArr = new RealmAny[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            if (str2 != null) {
                realmAnyArr[i10] = RealmAny.valueOf(str2);
            } else {
                realmAnyArr[i10] = null;
            }
        }
        if (r10 == Case.SENSITIVE) {
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        this.query.inInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
        return this;
    }

    public RealmQuery<E> like(String str, RealmAny realmAny) {
        return like(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> notEqualTo(String str, String str2, Case r10) {
        this.realm.checkIfValid();
        notEqualTo(str, RealmAny.valueOf(str2), r10);
        return this;
    }

    public RealmQuery<E> beginsWith(String str, String str2, Case r10) {
        Util.checkNull(str2, "value");
        this.realm.checkIfValid();
        beginsWith(str, RealmAny.valueOf(str2), r10);
        return this;
    }

    public RealmQuery<E> between(String str, long j, long j10) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Long.valueOf(j)), RealmAny.valueOf(Long.valueOf(j10)));
        return this;
    }

    public RealmQuery<E> contains(String str, String str2, Case r10) {
        Util.checkNull(str2, "value");
        this.realm.checkIfValid();
        contains(str, RealmAny.valueOf(str2), r10);
        return this;
    }

    public RealmQuery<E> containsValue(String str, Byte b5) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(b5));
        return this;
    }

    public RealmQuery<E> endsWith(String str, String str2, Case r10) {
        Util.checkNull(str2, "value");
        this.realm.checkIfValid();
        endsWith(str, RealmAny.valueOf(str2), r10);
        return this;
    }

    public RealmQuery<E> greaterThan(String str, long j) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, long j) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> lessThan(String str, long j) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, long j) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> like(String str, String str2, Case r10) {
        Util.checkNull(str2, "value");
        this.realm.checkIfValid();
        like(str, RealmAny.valueOf(str2), r10);
        return this;
    }

    public RealmQuery<E> sort(String str, Sort sort) {
        this.realm.checkIfValid();
        return sort(new String[]{str}, new Sort[]{sort});
    }

    public RealmQuery<E> equalTo(String str, RealmAny realmAny, Case r10) {
        this.realm.checkIfValid();
        if (r10 == Case.SENSITIVE) {
            this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
            return this;
        }
        this.query.equalToInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, RealmAny realmAny, Case r10) {
        this.realm.checkIfValid();
        if (r10 == Case.SENSITIVE) {
            this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
            return this;
        }
        this.query.notEqualToInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> between(String str, double d5, double d9) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Double.valueOf(d5)), RealmAny.valueOf(Double.valueOf(d9)));
        return this;
    }

    public RealmQuery<E> containsValue(String str, Short sh) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(sh));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, double d5) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Double.valueOf(d5)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, double d5) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Double.valueOf(d5)));
        return this;
    }

    public RealmQuery<E> lessThan(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> sort(String str, Sort sort, String str2, Sort sort2) {
        this.realm.checkIfValid();
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    public RealmQuery<E> beginsWith(String str, RealmAny realmAny, Case r10) {
        this.realm.checkIfValid();
        if (r10 == Case.SENSITIVE) {
            this.query.beginsWith(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
            return this;
        }
        this.query.beginsWithInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> contains(String str, RealmAny realmAny, Case r10) {
        this.realm.checkIfValid();
        if (r10 == Case.SENSITIVE) {
            this.query.contains(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
            return this;
        }
        this.query.containsInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> endsWith(String str, RealmAny realmAny, Case r10) {
        this.realm.checkIfValid();
        if (r10 == Case.SENSITIVE) {
            this.query.endsWith(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
            return this;
        }
        this.query.endsWithInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> like(String str, RealmAny realmAny, Case r10) {
        this.realm.checkIfValid();
        if (r10 == Case.SENSITIVE) {
            this.query.like(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
            return this;
        }
        this.query.likeInsensitive(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> between(String str, float f3, float f7) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Float.valueOf(f3)), RealmAny.valueOf(Float.valueOf(f7)));
        return this;
    }

    public RealmQuery<E> containsValue(String str, Integer num) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(num));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, float f3) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Float.valueOf(f3)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, float f3) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Float.valueOf(f3)));
        return this;
    }

    public RealmQuery<E> lessThan(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> sort(String[] strArr, Sort[] sortArr) {
        if (sortArr != null && sortArr.length != 0) {
            if (strArr.length == sortArr.length) {
                this.realm.checkIfValid();
                this.query.sort(this.realm.getSchema().getKeyPathMapping(), strArr, sortArr);
                return this;
            }
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        throw new IllegalArgumentException("You must provide at least one sort order.");
    }

    public RealmQuery<E> equalTo(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> between(String str, Date date, Date date2) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date), RealmAny.valueOf(date2));
        return this;
    }

    public RealmQuery<E> containsValue(String str, Long l10) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(l10));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, Date date) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, Date date) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> lessThan(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    private RealmQuery(RealmResults<E> realmResults, Class<E> cls) {
        BaseRealm baseRealm = realmResults.baseRealm;
        this.realm = baseRealm;
        this.clazz = cls;
        boolean zIsClassForRealmModel = isClassForRealmModel(cls);
        this.forValues = !zIsClassForRealmModel;
        if (zIsClassForRealmModel) {
            this.schema = baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) cls);
            this.table = realmResults.getTable();
            this.osCollection = null;
            this.query = realmResults.getOsResults().where();
            return;
        }
        throw new UnsupportedOperationException(PRIMITIVE_LISTS_NOT_SUPPORTED_ERROR_MESSAGE);
    }

    public RealmQuery<E> equalTo(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> between(String str, RealmAny realmAny, RealmAny realmAny2) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, realmAny, realmAny2);
        return this;
    }

    public RealmQuery<E> containsValue(String str, Double d5) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(d5));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> lessThan(String str, double d5) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Double.valueOf(d5)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, double d5) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Double.valueOf(d5)));
        return this;
    }

    public RealmQuery<E> equalTo(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> between(String str, Decimal128 decimal128, Decimal128 decimal129) {
        this.realm.checkIfValid();
        this.query.between(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128), RealmAny.valueOf(decimal129));
        return this;
    }

    public RealmQuery<E> containsValue(String str, Float f3) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(f3));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> in(String str, Byte[] bArr) {
        this.realm.checkIfValid();
        if (bArr != null && bArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[bArr.length];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(bArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    public RealmQuery<E> lessThan(String str, float f3) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Float.valueOf(f3)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, float f3) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(Float.valueOf(f3)));
        return this;
    }

    public RealmQuery<E> equalTo(String str, Byte b5) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(b5));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        notEqualTo(str, realmAny, Case.SENSITIVE);
        return this;
    }

    public RealmQuery<E> containsValue(String str, String str2) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(str2));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> lessThan(String str, Date date) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, Date date) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> equalTo(String str, byte[] bArr) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(bArr));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Byte b5) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(b5));
        return this;
    }

    public RealmQuery<E> containsValue(String str, byte[] bArr) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(bArr));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.greaterThan(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        this.query.greaterThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> lessThan(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        this.query.lessThan(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        this.query.lessThanOrEqual(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> equalTo(String str, Short sh) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(sh));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, byte[] bArr) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(bArr));
        return this;
    }

    private RealmQuery(BaseRealm baseRealm, OsList osList, Class<E> cls) {
        this.realm = baseRealm;
        this.clazz = cls;
        boolean zIsClassForRealmModel = isClassForRealmModel(cls);
        this.forValues = !zIsClassForRealmModel;
        if (zIsClassForRealmModel) {
            RealmObjectSchema schemaForClass = baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) cls);
            this.schema = schemaForClass;
            this.table = schemaForClass.getTable();
            this.osCollection = osList;
            this.query = osList.getQuery();
            return;
        }
        throw new UnsupportedOperationException(PRIMITIVE_LISTS_NOT_SUPPORTED_ERROR_MESSAGE);
    }

    public RealmQuery<E> containsValue(String str, Date date) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> equalTo(String str, Integer num) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(num));
        return this;
    }

    public RealmQuery<E> in(String str, Short[] shArr) {
        this.realm.checkIfValid();
        if (shArr != null && shArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[shArr.length];
            for (int i10 = 0; i10 < shArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(shArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Short sh) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(sh));
        return this;
    }

    public RealmQuery<E> containsValue(String str, Decimal128 decimal128) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> equalTo(String str, Long l10) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(l10));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Integer num) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(num));
        return this;
    }

    public RealmQuery<E> containsValue(String str, ObjectId objectId) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> equalTo(String str, Double d5) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(d5));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Long l10) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(l10));
        return this;
    }

    public RealmQuery<E> containsValue(String str, UUID uuid) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> equalTo(String str, Float f3) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(f3));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Double d5) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(d5));
        return this;
    }

    public RealmQuery<E> containsValue(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> in(String str, Integer[] numArr) {
        this.realm.checkIfValid();
        if (numArr != null && numArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[numArr.length];
            for (int i10 = 0; i10 < numArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(numArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    public RealmQuery(BaseRealm baseRealm, OsSet osSet, Class<E> cls) {
        this.realm = baseRealm;
        this.clazz = cls;
        boolean zIsClassForRealmModel = isClassForRealmModel(cls);
        this.forValues = !zIsClassForRealmModel;
        if (zIsClassForRealmModel) {
            RealmObjectSchema schemaForClass = baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) cls);
            this.schema = schemaForClass;
            this.table = schemaForClass.getTable();
            this.osCollection = osSet;
            this.query = osSet.getQuery();
            return;
        }
        throw new UnsupportedOperationException(PRIMITIVE_LISTS_NOT_SUPPORTED_ERROR_MESSAGE);
    }

    public RealmQuery<E> equalTo(String str, Boolean bool) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(bool));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Float f3) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(f3));
        return this;
    }

    public RealmQuery<E> containsValue(String str, RealmModel realmModel) {
        this.realm.checkIfValid();
        this.query.containsValue(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(realmModel));
        return this;
    }

    public RealmQuery<E> equalTo(String str, Date date) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Boolean bool) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(bool));
        return this;
    }

    public RealmQuery<E> equalTo(String str, RealmAny realmAny) {
        this.realm.checkIfValid();
        this.query.equalTo(this.realm.getSchema().getKeyPathMapping(), str, realmAny);
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Date date) {
        this.realm.checkIfValid();
        this.query.notEqualTo(this.realm.getSchema().getKeyPathMapping(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> in(String str, Long[] lArr) {
        this.realm.checkIfValid();
        if (lArr != null && lArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[lArr.length];
            for (int i10 = 0; i10 < lArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(lArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    private RealmQuery(BaseRealm baseRealm, String str) {
        this.realm = baseRealm;
        this.className = str;
        this.forValues = false;
        RealmObjectSchema schemaForClass = baseRealm.getSchema().getSchemaForClass(str);
        this.schema = schemaForClass;
        Table table = schemaForClass.getTable();
        this.table = table;
        this.query = table.where();
        this.osCollection = null;
    }

    public RealmQuery<E> in(String str, Double[] dArr) {
        this.realm.checkIfValid();
        if (dArr != null && dArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[dArr.length];
            for (int i10 = 0; i10 < dArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(dArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    private RealmQuery(RealmResults<DynamicRealmObject> realmResults, String str) {
        BaseRealm baseRealm = realmResults.baseRealm;
        this.realm = baseRealm;
        this.className = str;
        this.forValues = false;
        RealmObjectSchema schemaForClass = baseRealm.getSchema().getSchemaForClass(str);
        this.schema = schemaForClass;
        this.table = schemaForClass.getTable();
        this.query = realmResults.getOsResults().where();
        this.osCollection = null;
    }

    public RealmQuery<E> in(String str, Float[] fArr) {
        this.realm.checkIfValid();
        if (fArr != null && fArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[fArr.length];
            for (int i10 = 0; i10 < fArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(fArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    private RealmQuery(BaseRealm baseRealm, OsList osList, String str) {
        this.realm = baseRealm;
        this.className = str;
        this.forValues = false;
        RealmObjectSchema schemaForClass = baseRealm.getSchema().getSchemaForClass(str);
        this.schema = schemaForClass;
        this.table = schemaForClass.getTable();
        this.query = osList.getQuery();
        this.osCollection = osList;
    }

    public RealmQuery<E> in(String str, Boolean[] boolArr) {
        this.realm.checkIfValid();
        if (boolArr != null && boolArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[boolArr.length];
            for (int i10 = 0; i10 < boolArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(boolArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    public RealmQuery<E> in(String str, Date[] dateArr) {
        this.realm.checkIfValid();
        if (dateArr != null && dateArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[dateArr.length];
            for (int i10 = 0; i10 < dateArr.length; i10++) {
                realmAnyArr[i10] = RealmAny.valueOf(dateArr[i10]);
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr);
            return this;
        }
        alwaysFalse();
        return this;
    }

    public RealmQuery<E> in(String str, RealmAny[] realmAnyArr) {
        this.realm.checkIfValid();
        if (realmAnyArr != null && realmAnyArr.length != 0) {
            RealmAny[] realmAnyArr2 = new RealmAny[realmAnyArr.length];
            for (int i10 = 0; i10 < realmAnyArr.length; i10++) {
                RealmAny realmAnyNullValue = realmAnyArr[i10];
                if (realmAnyNullValue == null) {
                    realmAnyNullValue = RealmAny.nullValue();
                }
                realmAnyArr2[i10] = realmAnyNullValue;
            }
            this.query.in(this.realm.getSchema().getKeyPathMapping(), str, realmAnyArr2);
            return this;
        }
        alwaysFalse();
        return this;
    }
}
