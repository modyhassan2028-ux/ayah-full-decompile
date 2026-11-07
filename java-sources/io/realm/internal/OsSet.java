package io.realm.internal;

import io.realm.SetChangeSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
public class OsSet implements NativeObject, OsCollection {
    public static final int NOT_FOUND = -1;
    private static final int VALUE_FOUND = 1;
    private static final int VALUE_NOT_FOUND = 0;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final NativeContext context;
    private final long nativePtr;
    private final OsSharedRealm osSharedRealm;
    private final Table targetTable;

    /* JADX INFO: renamed from: io.realm.internal.OsSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation;

        static {
            int[] iArr = new int[ExternalCollectionOperation.values().length];
            $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation = iArr;
            try {
                iArr[ExternalCollectionOperation.CONTAINS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[ExternalCollectionOperation.ADD_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[ExternalCollectionOperation.REMOVE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[ExternalCollectionOperation.RETAIN_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum ExternalCollectionOperation {
        CONTAINS_ALL,
        ADD_ALL,
        REMOVE_ALL,
        RETAIN_ALL
    }

    public OsSet(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm sharedRealm = uncheckedRow.getTable().getSharedRealm();
        this.osSharedRealm = sharedRealm;
        long[] jArrNativeCreate = nativeCreate(sharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.nativePtr = jArrNativeCreate[0];
        NativeContext nativeContext = sharedRealm.context;
        this.context = nativeContext;
        nativeContext.addReference(this);
        if (jArrNativeCreate[1] != 0) {
            this.targetTable = new Table(sharedRealm, jArrNativeCreate[1]);
        } else {
            this.targetTable = null;
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j, long j10);

    private static native long[] nativeAddBinary(long j, byte[] bArr);

    private static native long[] nativeAddBoolean(long j, boolean z10);

    private static native long[] nativeAddDate(long j, long j10);

    private static native long[] nativeAddDecimal128(long j, long j10, long j11);

    private static native long[] nativeAddDouble(long j, double d5);

    private static native long[] nativeAddFloat(long j, float f3);

    private static native long[] nativeAddLong(long j, long j10);

    private static native long[] nativeAddNull(long j);

    private static native long[] nativeAddObjectId(long j, String str);

    private static native long[] nativeAddRealmAny(long j, long j10);

    private static native long[] nativeAddRow(long j, long j10);

    private static native long[] nativeAddString(long j, String str);

    private static native long[] nativeAddUUID(long j, String str);

    private static native boolean nativeAsymmetricDifference(long j, long j10);

    private static native void nativeClear(long j);

    private static native boolean nativeContainsAll(long j, long j10);

    private static native boolean nativeContainsAllRealmAnyCollection(long j, long j10);

    private static native boolean nativeContainsBinary(long j, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j, boolean z10);

    private static native boolean nativeContainsDate(long j, long j10);

    private static native boolean nativeContainsDecimal128(long j, long j10, long j11);

    private static native boolean nativeContainsDouble(long j, double d5);

    private static native boolean nativeContainsFloat(long j, float f3);

    private static native boolean nativeContainsLong(long j, long j10);

    private static native boolean nativeContainsNull(long j);

    private static native boolean nativeContainsObjectId(long j, String str);

    private static native boolean nativeContainsRealmAny(long j, long j10);

    private static native boolean nativeContainsRow(long j, long j10);

    private static native boolean nativeContainsString(long j, String str);

    private static native boolean nativeContainsUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j10, long j11);

    private static native void nativeDeleteAll(long j);

    private static native long nativeFreeze(long j, long j10);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j);

    private static native long nativeGetRealmAny(long j, int i10);

    private static native long nativeGetRow(long j, int i10);

    private static native Object nativeGetValueAtIndex(long j, int i10);

    private static native boolean nativeIntersect(long j, long j10);

    private static native boolean nativeIsValid(long j);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j, long j10);

    private static native long[] nativeRemoveBinary(long j, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j, boolean z10);

    private static native long[] nativeRemoveDate(long j, long j10);

    private static native long[] nativeRemoveDecimal128(long j, long j10, long j11);

    private static native long[] nativeRemoveDouble(long j, double d5);

    private static native long[] nativeRemoveFloat(long j, float f3);

    private static native long[] nativeRemoveLong(long j, long j10);

    private static native long[] nativeRemoveNull(long j);

    private static native long[] nativeRemoveObjectId(long j, String str);

    private static native long[] nativeRemoveRealmAny(long j, long j10);

    private static native long[] nativeRemoveRow(long j, long j10);

    private static native long[] nativeRemoveString(long j, String str);

    private static native long[] nativeRemoveUUID(long j, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j, long j10);

    private static native long nativeSize(long j);

    private static native void nativeStartListening(long j, ObservableSet observableSet);

    private static native void nativeStopListening(long j);

    private static native boolean nativeUnion(long j, long j10);

    private boolean retainAllInternal(NativeRealmAnyCollection nativeRealmAnyCollection) {
        if (size() == 0) {
            return false;
        }
        if (nativeRealmAnyCollection.getSize() != 0) {
            return nativeRetainAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        clear();
        return true;
    }

    public boolean add(Boolean bool) {
        return (bool == null ? nativeAddNull(this.nativePtr) : nativeAddBoolean(this.nativePtr, bool.booleanValue()))[1] != 0;
    }

    public boolean addRealmAny(long j) {
        return nativeAddRealmAny(this.nativePtr, j)[1] != 0;
    }

    public boolean addRow(long j) {
        return nativeAddRow(this.nativePtr, j)[1] != 0;
    }

    public boolean asymmetricDifference(OsSet osSet) {
        return nativeAsymmetricDifference(this.nativePtr, osSet.getNativePtr());
    }

    public void clear() {
        nativeClear(this.nativePtr);
    }

    public boolean collectionFunnel(NativeRealmAnyCollection nativeRealmAnyCollection, ExternalCollectionOperation externalCollectionOperation) {
        int i10 = AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[externalCollectionOperation.ordinal()];
        if (i10 == 1) {
            return nativeContainsAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        if (i10 == 2) {
            return nativeAddAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        if (i10 == 3) {
            return nativeRemoveAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        if (i10 == 4) {
            return retainAllInternal(nativeRealmAnyCollection);
        }
        throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
    }

    public boolean contains(Boolean bool) {
        return bool == null ? nativeContainsNull(this.nativePtr) : nativeContainsBoolean(this.nativePtr, bool.booleanValue());
    }

    public boolean containsAll(OsSet osSet) {
        return nativeContainsAll(this.nativePtr, osSet.getNativePtr());
    }

    public boolean containsRealmAny(long j) {
        return nativeContainsRealmAny(this.nativePtr, j);
    }

    public boolean containsRow(long j) {
        return nativeContainsRow(this.nativePtr, j);
    }

    public void deleteAll() {
        nativeDeleteAll(this.nativePtr);
    }

    public OsSet freeze(OsSharedRealm osSharedRealm) {
        return new OsSet(osSharedRealm, nativeFreeze(this.nativePtr, osSharedRealm.getNativePtr()), this.targetTable);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public TableQuery getQuery() {
        return new TableQuery(this.context, this.targetTable, nativeGetQuery(this.nativePtr));
    }

    public long getRealmAny(int i10) {
        return nativeGetRealmAny(this.nativePtr, i10);
    }

    public long getRow(int i10) {
        return nativeGetRow(this.nativePtr, i10);
    }

    public Table getTargetTable() {
        return this.targetTable;
    }

    public Object getValueAtIndex(int i10) {
        return nativeGetValueAtIndex(this.nativePtr, i10);
    }

    public boolean intersect(OsSet osSet) {
        return nativeIntersect(this.nativePtr, osSet.getNativePtr());
    }

    @Override // io.realm.internal.OsCollection
    public boolean isValid() {
        return nativeIsValid(this.nativePtr);
    }

    public <T> void notifyChangeListeners(long j, ObserverPairList<ObservableSet.SetObserverPair<T>> observerPairList) {
        SetChangeSet setChangeSet = new SetChangeSet(new OsCollectionChangeSet(j, false));
        if (setChangeSet.isEmpty()) {
            return;
        }
        observerPairList.foreach(new ObservableSet.Callback(setChangeSet));
    }

    public boolean remove(Boolean bool) {
        return (bool == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveBoolean(this.nativePtr, bool.booleanValue()))[1] == 1;
    }

    public boolean removeRealmAny(long j) {
        return nativeRemoveRealmAny(this.nativePtr, j)[1] != 0;
    }

    public boolean removeRow(long j) {
        return nativeRemoveRow(this.nativePtr, j)[1] != 0;
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void startListening(ObservableSet observableSet) {
        nativeStartListening(this.nativePtr, observableSet);
    }

    public void stopListening() {
        nativeStopListening(this.nativePtr);
    }

    public boolean union(OsSet osSet) {
        return nativeUnion(this.nativePtr, osSet.getNativePtr());
    }

    public boolean contains(String str) {
        if (str == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsString(this.nativePtr, str);
    }

    public boolean add(String str) {
        long[] jArrNativeAddString;
        if (str == null) {
            jArrNativeAddString = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddString = nativeAddString(this.nativePtr, str);
        }
        return jArrNativeAddString[1] != 0;
    }

    public boolean remove(String str) {
        long[] jArrNativeRemoveString;
        if (str == null) {
            jArrNativeRemoveString = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveString = nativeRemoveString(this.nativePtr, str);
        }
        return jArrNativeRemoveString[1] == 1;
    }

    public boolean contains(Long l10) {
        if (l10 == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsLong(this.nativePtr, l10.longValue());
    }

    public boolean add(Integer num) {
        long[] jArrNativeAddLong;
        if (num == null) {
            jArrNativeAddLong = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddLong = nativeAddLong(this.nativePtr, num.longValue());
        }
        return jArrNativeAddLong[1] != 0;
    }

    public boolean contains(Float f3) {
        if (f3 == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsFloat(this.nativePtr, f3.floatValue());
    }

    public boolean remove(Integer num) {
        long[] jArrNativeRemoveLong;
        if (num == null) {
            jArrNativeRemoveLong = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveLong = nativeRemoveLong(this.nativePtr, num.longValue());
        }
        return jArrNativeRemoveLong[1] == 1;
    }

    public boolean contains(Double d5) {
        if (d5 == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsDouble(this.nativePtr, d5.doubleValue());
    }

    private OsSet(OsSharedRealm osSharedRealm, long j, Table table) {
        this.osSharedRealm = osSharedRealm;
        this.nativePtr = j;
        NativeContext nativeContext = osSharedRealm.context;
        this.context = nativeContext;
        this.targetTable = table;
        nativeContext.addReference(this);
    }

    public boolean add(Long l10) {
        long[] jArrNativeAddLong;
        if (l10 == null) {
            jArrNativeAddLong = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddLong = nativeAddLong(this.nativePtr, l10.longValue());
        }
        return jArrNativeAddLong[1] != 0;
    }

    public boolean remove(Long l10) {
        long[] jArrNativeRemoveLong;
        if (l10 == null) {
            jArrNativeRemoveLong = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveLong = nativeRemoveLong(this.nativePtr, l10.longValue());
        }
        return jArrNativeRemoveLong[1] == 1;
    }

    public boolean contains(byte[] bArr) {
        if (bArr == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsBinary(this.nativePtr, bArr);
    }

    public boolean add(Short sh) {
        long[] jArrNativeAddLong;
        if (sh == null) {
            jArrNativeAddLong = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddLong = nativeAddLong(this.nativePtr, sh.longValue());
        }
        return jArrNativeAddLong[1] != 0;
    }

    public boolean contains(Date date) {
        if (date == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsDate(this.nativePtr, date.getTime());
    }

    public boolean remove(Short sh) {
        long[] jArrNativeRemoveLong;
        if (sh == null) {
            jArrNativeRemoveLong = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveLong = nativeRemoveLong(this.nativePtr, sh.longValue());
        }
        return jArrNativeRemoveLong[1] == 1;
    }

    public boolean contains(Decimal128 decimal128) {
        if (decimal128 == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsDecimal128(this.nativePtr, decimal128.f20495s, decimal128.f20494r);
    }

    public boolean add(Byte b5) {
        long[] jArrNativeAddLong;
        if (b5 == null) {
            jArrNativeAddLong = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddLong = nativeAddLong(this.nativePtr, b5.longValue());
        }
        return jArrNativeAddLong[1] != 0;
    }

    public boolean remove(Byte b5) {
        long[] jArrNativeRemoveLong;
        if (b5 == null) {
            jArrNativeRemoveLong = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveLong = nativeRemoveLong(this.nativePtr, b5.longValue());
        }
        return jArrNativeRemoveLong[1] == 1;
    }

    public boolean add(Float f3) {
        long[] jArrNativeAddFloat;
        if (f3 == null) {
            jArrNativeAddFloat = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddFloat = nativeAddFloat(this.nativePtr, f3.floatValue());
        }
        return jArrNativeAddFloat[1] != 0;
    }

    public boolean remove(Float f3) {
        long[] jArrNativeRemoveFloat;
        if (f3 == null) {
            jArrNativeRemoveFloat = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveFloat = nativeRemoveFloat(this.nativePtr, f3.floatValue());
        }
        return jArrNativeRemoveFloat[1] == 1;
    }

    public boolean contains(ObjectId objectId) {
        if (objectId == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsObjectId(this.nativePtr, objectId.toString());
    }

    public boolean add(Double d5) {
        long[] jArrNativeAddDouble;
        if (d5 == null) {
            jArrNativeAddDouble = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddDouble = nativeAddDouble(this.nativePtr, d5.doubleValue());
        }
        return jArrNativeAddDouble[1] != 0;
    }

    public boolean contains(UUID uuid) {
        if (uuid == null) {
            return nativeContainsNull(this.nativePtr);
        }
        return nativeContainsUUID(this.nativePtr, uuid.toString());
    }

    public boolean remove(Double d5) {
        long[] jArrNativeRemoveDouble;
        if (d5 == null) {
            jArrNativeRemoveDouble = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveDouble = nativeRemoveDouble(this.nativePtr, d5.doubleValue());
        }
        return jArrNativeRemoveDouble[1] == 1;
    }

    public boolean add(byte[] bArr) {
        long[] jArrNativeAddBinary;
        if (bArr == null) {
            jArrNativeAddBinary = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddBinary = nativeAddBinary(this.nativePtr, bArr);
        }
        return jArrNativeAddBinary[1] != 0;
    }

    public boolean remove(byte[] bArr) {
        long[] jArrNativeRemoveBinary;
        if (bArr == null) {
            jArrNativeRemoveBinary = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveBinary = nativeRemoveBinary(this.nativePtr, bArr);
        }
        return jArrNativeRemoveBinary[1] == 1;
    }

    public boolean add(Date date) {
        long[] jArrNativeAddDate;
        if (date == null) {
            jArrNativeAddDate = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddDate = nativeAddDate(this.nativePtr, date.getTime());
        }
        return jArrNativeAddDate[1] != 0;
    }

    public boolean remove(Date date) {
        long[] jArrNativeRemoveDate;
        if (date == null) {
            jArrNativeRemoveDate = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveDate = nativeRemoveDate(this.nativePtr, date.getTime());
        }
        return jArrNativeRemoveDate[1] == 1;
    }

    public boolean add(Decimal128 decimal128) {
        long[] jArrNativeAddDecimal128;
        if (decimal128 == null) {
            jArrNativeAddDecimal128 = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddDecimal128 = nativeAddDecimal128(this.nativePtr, decimal128.f20495s, decimal128.f20494r);
        }
        return jArrNativeAddDecimal128[1] != 0;
    }

    public boolean remove(Decimal128 decimal128) {
        long[] jArrNativeRemoveDecimal128;
        if (decimal128 == null) {
            jArrNativeRemoveDecimal128 = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveDecimal128 = nativeRemoveDecimal128(this.nativePtr, decimal128.f20495s, decimal128.f20494r);
        }
        return jArrNativeRemoveDecimal128[1] == 1;
    }

    public boolean add(ObjectId objectId) {
        long[] jArrNativeAddObjectId;
        if (objectId == null) {
            jArrNativeAddObjectId = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddObjectId = nativeAddObjectId(this.nativePtr, objectId.toString());
        }
        return jArrNativeAddObjectId[1] != 0;
    }

    public boolean remove(ObjectId objectId) {
        long[] jArrNativeRemoveObjectId;
        if (objectId == null) {
            jArrNativeRemoveObjectId = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveObjectId = nativeRemoveObjectId(this.nativePtr, objectId.toString());
        }
        return jArrNativeRemoveObjectId[1] == 1;
    }

    public boolean add(UUID uuid) {
        long[] jArrNativeAddUUID;
        if (uuid == null) {
            jArrNativeAddUUID = nativeAddNull(this.nativePtr);
        } else {
            jArrNativeAddUUID = nativeAddUUID(this.nativePtr, uuid.toString());
        }
        return jArrNativeAddUUID[1] != 0;
    }

    public boolean remove(UUID uuid) {
        long[] jArrNativeRemoveUUID;
        if (uuid == null) {
            jArrNativeRemoveUUID = nativeRemoveNull(this.nativePtr);
        } else {
            jArrNativeRemoveUUID = nativeRemoveUUID(this.nativePtr, uuid.toString());
        }
        return jArrNativeRemoveUUID[1] == 1;
    }
}
