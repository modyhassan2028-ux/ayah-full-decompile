package io.realm.internal;

import android.support.v4.media.session.p;
import io.realm.RealmAny;
import io.realm.RealmAnyNativeFunctionsImpl;
import io.realm.Sort;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.Date;
import org.bson.types.Decimal128;

/* JADX INFO: loaded from: classes.dex */
public class TableQuery implements NativeObject {
    private static final boolean DEBUG = false;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private final Table table;
    private final RealmAnyNativeFunctionsImpl realmAnyNativeFunctions = new RealmAnyNativeFunctionsImpl();
    private boolean queryValidated = true;

    public TableQuery(NativeContext nativeContext, Table table, long j) {
        this.table = table;
        this.nativePtr = j;
        nativeContext.addReference(this);
    }

    public static String buildDistinctDescriptor(String[] strArr) {
        StringBuilder sb = new StringBuilder("DISTINCT(");
        int length = strArr.length;
        String str = "";
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            sb.append(str);
            sb.append(escapeFieldName(str2));
            i10++;
            str = ", ";
        }
        sb.append(")");
        return sb.toString();
    }

    public static String buildSortDescriptor(String[] strArr, Sort[] sortArr) {
        StringBuilder sb = new StringBuilder("SORT(");
        String str = "";
        int i10 = 0;
        while (i10 < strArr.length) {
            String str2 = strArr[i10];
            sb.append(str);
            sb.append(escapeFieldName(str2));
            sb.append(" ");
            sb.append(sortArr[i10] == Sort.ASCENDING ? "ASC" : "DESC");
            i10++;
            str = ", ";
        }
        sb.append(")");
        return sb.toString();
    }

    private static String escapeFieldName(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    private native long[] nativeAverageDecimal128(long j, long j10);

    private native double nativeAverageDouble(long j, long j10);

    private native double nativeAverageFloat(long j, long j10);

    private native double nativeAverageInt(long j, long j10);

    private native long[] nativeAverageRealmAny(long j, long j10);

    private native void nativeBeginGroup(long j);

    private native long nativeCount(long j);

    private native void nativeEndGroup(long j);

    private native long nativeFind(long j);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long j, long j10);

    private native Double nativeMaximumDouble(long j, long j10);

    private native Float nativeMaximumFloat(long j, long j10);

    private native Long nativeMaximumInt(long j, long j10);

    private native NativeRealmAny nativeMaximumRealmAny(long j, long j10);

    private native Long nativeMaximumTimestamp(long j, long j10);

    private native long[] nativeMinimumDecimal128(long j, long j10);

    private native Double nativeMinimumDouble(long j, long j10);

    private native Float nativeMinimumFloat(long j, long j10);

    private native Long nativeMinimumInt(long j, long j10);

    private native NativeRealmAny nativeMinimumRealmAny(long j, long j10);

    private native Long nativeMinimumTimestamp(long j, long j10);

    private native void nativeNot(long j);

    private native void nativeOr(long j);

    private native void nativeRawDescriptor(long j, String str, long j10);

    private native void nativeRawPredicate(long j, String str, long[] jArr, long j10);

    private native long nativeRemove(long j);

    private native long[] nativeSumDecimal128(long j, long j10);

    private native double nativeSumDouble(long j, long j10);

    private native double nativeSumFloat(long j, long j10);

    private native long nativeSumInt(long j, long j10);

    private native long[] nativeSumRealmAny(long j, long j10);

    private native String nativeValidateQuery(long j);

    private void rawDescriptor(OsKeyPathMapping osKeyPathMapping, String str) {
        nativeRawDescriptor(this.nativePtr, str, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L);
    }

    private void throwImmutable() {
        throw new IllegalStateException("Mutable method call during read transaction.");
    }

    public TableQuery alwaysFalse() {
        rawPredicateWithPointers(null, "FALSEPREDICATE", new long[0]);
        this.queryValidated = false;
        return this;
    }

    public TableQuery alwaysTrue() {
        rawPredicateWithPointers(null, "TRUEPREDICATE", new long[0]);
        this.queryValidated = false;
        return this;
    }

    public Decimal128 averageDecimal128(long j) {
        validateQuery();
        long[] jArrNativeAverageDecimal128 = nativeAverageDecimal128(this.nativePtr, j);
        return jArrNativeAverageDecimal128 != null ? Decimal128.fromIEEE754BIDEncoding(jArrNativeAverageDecimal128[1], jArrNativeAverageDecimal128[0]) : new Decimal128(0L);
    }

    public double averageDouble(long j) {
        validateQuery();
        return nativeAverageDouble(this.nativePtr, j);
    }

    public double averageFloat(long j) {
        validateQuery();
        return nativeAverageFloat(this.nativePtr, j);
    }

    public double averageInt(long j) {
        validateQuery();
        return nativeAverageInt(this.nativePtr, j);
    }

    public Decimal128 averageRealmAny(long j) {
        validateQuery();
        long[] jArrNativeAverageRealmAny = nativeAverageRealmAny(this.nativePtr, j);
        return Decimal128.fromIEEE754BIDEncoding(jArrNativeAverageRealmAny[1], jArrNativeAverageRealmAny[0]);
    }

    public TableQuery beginGroup() {
        nativeBeginGroup(this.nativePtr);
        this.queryValidated = false;
        return this;
    }

    public TableQuery beginsWith(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " BEGINSWITH $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery beginsWithInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " BEGINSWITH[c] $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery between(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny, RealmAny realmAny2) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.realmAnyNativeFunctions;
        StringBuilder sb = new StringBuilder("(");
        sb.append(escapeFieldName(str));
        sb.append(" >= $0 AND ");
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, p.B(sb, escapeFieldName(str), " <= $1)"), realmAny, realmAny2);
        this.queryValidated = false;
        return this;
    }

    public TableQuery contains(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " CONTAINS $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery containsEntry(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny, RealmAny realmAny2) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), "[$0] == $1"), realmAny, realmAny2);
        this.queryValidated = false;
        return this;
    }

    public TableQuery containsInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " CONTAINS[c] $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery containsKey(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder("ANY "), escapeFieldName(str), ".@keys == $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery containsValue(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder("ANY "), escapeFieldName(str), ".@values == $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    @Deprecated
    public long count() {
        validateQuery();
        return nativeCount(this.nativePtr);
    }

    public TableQuery distinct(OsKeyPathMapping osKeyPathMapping, String[] strArr) {
        rawDescriptor(osKeyPathMapping, buildDistinctDescriptor(strArr));
        return this;
    }

    public TableQuery endGroup() {
        nativeEndGroup(this.nativePtr);
        this.queryValidated = false;
        return this;
    }

    public TableQuery endsWith(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " ENDSWITH $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery endsWithInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " ENDSWITH[c] $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery equalTo(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " = $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery equalToInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " =[c] $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public long find() {
        validateQuery();
        return nativeFind(this.nativePtr);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public Table getTable() {
        return this.table;
    }

    public TableQuery greaterThan(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " > $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery greaterThanOrEqual(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " >= $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery in(OsKeyPathMapping osKeyPathMapping, String str, RealmAny[] realmAnyArr) {
        String strEscapeFieldName = escapeFieldName(str);
        beginGroup();
        int length = realmAnyArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            RealmAny realmAny = realmAnyArr[i10];
            if (!z10) {
                or();
            }
            if (realmAny == null) {
                isNull(osKeyPathMapping, strEscapeFieldName);
            } else {
                equalTo(osKeyPathMapping, strEscapeFieldName, realmAny);
            }
            i10++;
            z10 = false;
        }
        endGroup();
        this.queryValidated = false;
        return this;
    }

    public TableQuery inInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny[] realmAnyArr) {
        String strEscapeFieldName = escapeFieldName(str);
        beginGroup();
        int length = realmAnyArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            RealmAny realmAny = realmAnyArr[i10];
            if (!z10) {
                or();
            }
            if (realmAny == null) {
                isNull(osKeyPathMapping, strEscapeFieldName);
            } else {
                equalToInsensitive(osKeyPathMapping, strEscapeFieldName, realmAny);
            }
            i10++;
            z10 = false;
        }
        endGroup();
        this.queryValidated = false;
        return this;
    }

    public TableQuery isEmpty(OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), ".@count = 0"), new long[0]);
        this.queryValidated = false;
        return this;
    }

    public TableQuery isNotEmpty(OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), ".@count != 0"), new long[0]);
        this.queryValidated = false;
        return this;
    }

    public TableQuery isNotNull(OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " != NULL"), new long[0]);
        this.queryValidated = false;
        return this;
    }

    public TableQuery isNull(OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " = NULL"), new long[0]);
        this.queryValidated = false;
        return this;
    }

    public TableQuery lessThan(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " < $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery lessThanOrEqual(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " <= $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery like(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " LIKE $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery likeInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " LIKE[c] $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery limit(long j) {
        rawDescriptor(null, "LIMIT(" + j + ")");
        return this;
    }

    public Date maximumDate(long j) {
        validateQuery();
        Long lNativeMaximumTimestamp = nativeMaximumTimestamp(this.nativePtr, j);
        if (lNativeMaximumTimestamp != null) {
            return new Date(lNativeMaximumTimestamp.longValue());
        }
        return null;
    }

    public Decimal128 maximumDecimal128(long j) {
        validateQuery();
        long[] jArrNativeMaximumDecimal128 = nativeMaximumDecimal128(this.nativePtr, j);
        if (jArrNativeMaximumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(jArrNativeMaximumDecimal128[1], jArrNativeMaximumDecimal128[0]);
        }
        return null;
    }

    public Double maximumDouble(long j) {
        validateQuery();
        return nativeMaximumDouble(this.nativePtr, j);
    }

    public Float maximumFloat(long j) {
        validateQuery();
        return nativeMaximumFloat(this.nativePtr, j);
    }

    public Long maximumInt(long j) {
        validateQuery();
        return nativeMaximumInt(this.nativePtr, j);
    }

    public NativeRealmAny maximumRealmAny(long j) {
        validateQuery();
        return nativeMaximumRealmAny(this.nativePtr, j);
    }

    public Date minimumDate(long j) {
        validateQuery();
        Long lNativeMinimumTimestamp = nativeMinimumTimestamp(this.nativePtr, j);
        if (lNativeMinimumTimestamp != null) {
            return new Date(lNativeMinimumTimestamp.longValue());
        }
        return null;
    }

    public Decimal128 minimumDecimal128(long j) {
        validateQuery();
        long[] jArrNativeMinimumDecimal128 = nativeMinimumDecimal128(this.nativePtr, j);
        if (jArrNativeMinimumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(jArrNativeMinimumDecimal128[1], jArrNativeMinimumDecimal128[0]);
        }
        return null;
    }

    public Double minimumDouble(long j) {
        validateQuery();
        return nativeMinimumDouble(this.nativePtr, j);
    }

    public Float minimumFloat(long j) {
        validateQuery();
        return nativeMinimumFloat(this.nativePtr, j);
    }

    public Long minimumInt(long j) {
        validateQuery();
        return nativeMinimumInt(this.nativePtr, j);
    }

    public NativeRealmAny minimumRealmAny(long j) {
        validateQuery();
        return nativeMinimumRealmAny(this.nativePtr, j);
    }

    public TableQuery not() {
        nativeNot(this.nativePtr);
        this.queryValidated = false;
        return this;
    }

    public TableQuery notEqualTo(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " != $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery notEqualToInsensitive(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, p.B(new StringBuilder(), escapeFieldName(str), " !=[c] $0"), realmAny);
        this.queryValidated = false;
        return this;
    }

    public TableQuery or() {
        nativeOr(this.nativePtr);
        this.queryValidated = false;
        return this;
    }

    public TableQuery rawPredicate(OsKeyPathMapping osKeyPathMapping, String str, RealmAny... realmAnyArr) {
        this.realmAnyNativeFunctions.callRawPredicate(this, osKeyPathMapping, str, realmAnyArr);
        return this;
    }

    public void rawPredicateWithPointers(OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        nativeRawPredicate(this.nativePtr, str, jArr, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L);
    }

    public long remove() {
        validateQuery();
        if (this.table.isImmutable()) {
            throwImmutable();
        }
        return nativeRemove(this.nativePtr);
    }

    public TableQuery sort(OsKeyPathMapping osKeyPathMapping, String[] strArr, Sort[] sortArr) {
        rawDescriptor(osKeyPathMapping, buildSortDescriptor(strArr, sortArr));
        return this;
    }

    public Decimal128 sumDecimal128(long j) {
        validateQuery();
        long[] jArrNativeSumDecimal128 = nativeSumDecimal128(this.nativePtr, j);
        if (jArrNativeSumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(jArrNativeSumDecimal128[1], jArrNativeSumDecimal128[0]);
        }
        return null;
    }

    public double sumDouble(long j) {
        validateQuery();
        return nativeSumDouble(this.nativePtr, j);
    }

    public double sumFloat(long j) {
        validateQuery();
        return nativeSumFloat(this.nativePtr, j);
    }

    public long sumInt(long j) {
        validateQuery();
        return nativeSumInt(this.nativePtr, j);
    }

    public Decimal128 sumRealmAny(long j) {
        validateQuery();
        long[] jArrNativeSumRealmAny = nativeSumRealmAny(this.nativePtr, j);
        return Decimal128.fromIEEE754BIDEncoding(jArrNativeSumRealmAny[1], jArrNativeSumRealmAny[0]);
    }

    public void validateQuery() {
        if (this.queryValidated) {
            return;
        }
        String strNativeValidateQuery = nativeValidateQuery(this.nativePtr);
        if (!"".equals(strNativeValidateQuery)) {
            throw new UnsupportedOperationException(strNativeValidateQuery);
        }
        this.queryValidated = true;
    }
}
