package io.realm.internal;

import android.support.v4.media.session.p;
import io.realm.RealmFieldType;
import io.realm.RealmFieldTypeConstants;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
public class Table implements NativeObject {
    public static final int CLASS_NAME_MAX_LENGTH;
    public static final long INFINITE = -1;
    public static final int MAX_BINARY_SIZE = 16777200;
    public static final int MAX_STRING_SIZE = 16777199;
    public static final boolean NOT_NULLABLE = false;
    public static final int NO_MATCH = -1;
    public static final boolean NULLABLE = true;
    private static final int TABLE_NAME_MAX_LENGTH = 63;
    private static final String TABLE_PREFIX;
    private static final long nativeFinalizerPtr;
    private final NativeContext context;
    private final long nativeTableRefPtr;
    private final OsSharedRealm sharedRealm;

    /* JADX INFO: renamed from: io.realm.internal.Table$1, reason: invalid class name */
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
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_SET.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_SET.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_SET.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    static {
        String tablePrefix = Util.getTablePrefix();
        TABLE_PREFIX = tablePrefix;
        CLASS_NAME_MAX_LENGTH = 63 - tablePrefix.length();
        nativeFinalizerPtr = nativeGetFinalizerPtr();
    }

    public Table(OsSharedRealm osSharedRealm, long j) {
        NativeContext nativeContext = osSharedRealm.context;
        this.context = nativeContext;
        this.sharedRealm = osSharedRealm;
        this.nativeTableRefPtr = j;
        nativeContext.addReference(this);
    }

    public static String getClassNameForTable(String str) {
        if (str == null) {
            return null;
        }
        String str2 = TABLE_PREFIX;
        return !str.startsWith(str2) ? str : str.substring(str2.length());
    }

    public static String getTableNameForClass(String str) {
        if (str == null) {
            return null;
        }
        return p.B(new StringBuilder(), TABLE_PREFIX, str);
    }

    private boolean isPrimaryKey(long j) {
        return getColumnName(j).equals(OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, getClassName()));
    }

    private native long nativeAddColumn(long j, int i10, String str, boolean z10);

    private native long nativeAddColumnDictionaryLink(long j, int i10, String str, long j10);

    private native long nativeAddColumnLink(long j, int i10, String str, long j10);

    private native long nativeAddColumnSetLink(long j, int i10, String str, long j10);

    private native long nativeAddPrimitiveDictionaryColumn(long j, int i10, String str, boolean z10);

    private native long nativeAddPrimitiveListColumn(long j, int i10, String str, boolean z10);

    private native long nativeAddPrimitiveSetColumn(long j, int i10, String str, boolean z10);

    private native void nativeAddSearchIndex(long j, long j10);

    private native void nativeClear(long j);

    private native void nativeConvertColumnToNotNullable(long j, long j10, boolean z10);

    private native void nativeConvertColumnToNullable(long j, long j10, boolean z10);

    private native long nativeCountDouble(long j, long j10, double d5);

    private native long nativeCountFloat(long j, long j10, float f3);

    private native long nativeCountLong(long j, long j10, long j11);

    private native long nativeCountString(long j, long j10, String str);

    private native long nativeFindFirstBool(long j, long j10, boolean z10);

    public static native long nativeFindFirstDecimal128(long j, long j10, long j11, long j12);

    private native long nativeFindFirstDouble(long j, long j10, double d5);

    private native long nativeFindFirstFloat(long j, long j10, float f3);

    public static native long nativeFindFirstInt(long j, long j10, long j11);

    public static native long nativeFindFirstNull(long j, long j10);

    public static native long nativeFindFirstObjectId(long j, long j10, String str);

    public static native long nativeFindFirstString(long j, long j10, String str);

    private native long nativeFindFirstTimestamp(long j, long j10, long j11);

    public static native long nativeFindFirstUUID(long j, long j10, String str);

    private static native long nativeFreeze(long j, long j10);

    private native boolean nativeGetBoolean(long j, long j10, long j11);

    private native byte[] nativeGetByteArray(long j, long j10, long j11);

    private native long nativeGetColumnCount(long j);

    private native long nativeGetColumnKey(long j, String str);

    private native String nativeGetColumnName(long j, long j10);

    private native String[] nativeGetColumnNames(long j);

    private native int nativeGetColumnType(long j, long j10);

    private native long[] nativeGetDecimal128(long j, long j10, long j11);

    private native double nativeGetDouble(long j, long j10, long j11);

    private static native long nativeGetFinalizerPtr();

    private native float nativeGetFloat(long j, long j10, long j11);

    private native long nativeGetLink(long j, long j10, long j11);

    private native long nativeGetLinkTarget(long j, long j10);

    private native long nativeGetLong(long j, long j10, long j11);

    private native String nativeGetName(long j);

    private native String nativeGetObjectId(long j, long j10, long j11);

    private native String nativeGetString(long j, long j10, long j11);

    private native long nativeGetTimestamp(long j, long j10, long j11);

    private native boolean nativeHasSameSchema(long j, long j10);

    private native boolean nativeHasSearchIndex(long j, long j10);

    public static native void nativeIncrementLong(long j, long j10, long j11, long j12);

    private native boolean nativeIsColumnNullable(long j, long j10);

    private static native boolean nativeIsEmbedded(long j);

    private native boolean nativeIsNull(long j, long j10, long j11);

    private native boolean nativeIsNullLink(long j, long j10, long j11);

    private native boolean nativeIsValid(long j);

    private native void nativeMoveLastOver(long j, long j10);

    public static native void nativeNullifyLink(long j, long j10, long j11);

    private native void nativeRemoveColumn(long j, long j10);

    private native void nativeRemoveSearchIndex(long j, long j10);

    private native void nativeRenameColumn(long j, long j10, String str);

    public static native void nativeSetBoolean(long j, long j10, long j11, boolean z10, boolean z11);

    public static native void nativeSetByteArray(long j, long j10, long j11, byte[] bArr, boolean z10);

    public static native void nativeSetDecimal128(long j, long j10, long j11, long j12, long j13, boolean z10);

    public static native void nativeSetDouble(long j, long j10, long j11, double d5, boolean z10);

    private static native boolean nativeSetEmbedded(long j, boolean z10, boolean z11);

    public static native void nativeSetFloat(long j, long j10, long j11, float f3, boolean z10);

    public static native void nativeSetLink(long j, long j10, long j11, long j12, boolean z10);

    public static native void nativeSetLong(long j, long j10, long j11, long j12, boolean z10);

    public static native void nativeSetNull(long j, long j10, long j11, boolean z10);

    public static native void nativeSetObjectId(long j, long j10, long j11, String str, boolean z10);

    public static native void nativeSetRealmAny(long j, long j10, long j11, long j12, boolean z10);

    public static native void nativeSetString(long j, long j10, long j11, String str, boolean z10);

    public static native void nativeSetTimestamp(long j, long j10, long j11, long j12, boolean z10);

    public static native void nativeSetUUID(long j, long j10, long j11, String str, boolean z10);

    private native long nativeSize(long j);

    private native long nativeWhere(long j);

    public static void throwDuplicatePrimaryKeyException(Object obj) {
        throw new RealmPrimaryKeyConstraintException("Value already exists: " + obj);
    }

    private static void throwImmutable() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    private void verifyColumnName(String str) {
        if (str.length() > TABLE_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
        }
    }

    public long addColumn(RealmFieldType realmFieldType, String str, boolean z10) {
        verifyColumnName(str);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return nativeAddColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, z10);
            case 12:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
            case 17:
            case 18:
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
            case 20:
            case 21:
            case 22:
                return nativeAddPrimitiveListColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue() - 128, str, z10);
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return nativeAddPrimitiveDictionaryColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue() - 512, str, z10);
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return nativeAddPrimitiveSetColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue() - 256, str, z10);
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
    }

    public long addColumnDictionaryLink(RealmFieldType realmFieldType, String str, Table table) {
        verifyColumnName(str);
        return nativeAddColumnDictionaryLink(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, table.nativeTableRefPtr);
    }

    public long addColumnLink(RealmFieldType realmFieldType, String str, Table table) {
        verifyColumnName(str);
        return nativeAddColumnLink(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, table.nativeTableRefPtr);
    }

    public long addColumnSetLink(RealmFieldType realmFieldType, String str, Table table) {
        verifyColumnName(str);
        return nativeAddColumnSetLink(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, table.nativeTableRefPtr);
    }

    public void addSearchIndex(long j) {
        checkImmutable();
        nativeAddSearchIndex(this.nativeTableRefPtr, j);
    }

    public void checkImmutable() {
        if (isImmutable()) {
            throwImmutable();
        }
    }

    public void clear() {
        checkImmutable();
        nativeClear(this.nativeTableRefPtr);
    }

    public void convertColumnToNotNullable(long j) {
        if (this.sharedRealm.isSyncRealm()) {
            throw new IllegalStateException("This method is only available for non-synchronized Realms");
        }
        nativeConvertColumnToNotNullable(this.nativeTableRefPtr, j, isPrimaryKey(j));
    }

    public void convertColumnToNullable(long j) {
        if (this.sharedRealm.isSyncRealm()) {
            throw new IllegalStateException("This method is only available for non-synchronized Realms");
        }
        nativeConvertColumnToNullable(this.nativeTableRefPtr, j, isPrimaryKey(j));
    }

    public long count(long j, long j10) {
        return nativeCountLong(this.nativeTableRefPtr, j, j10);
    }

    public long findFirstBoolean(long j, boolean z10) {
        return nativeFindFirstBool(this.nativeTableRefPtr, j, z10);
    }

    public long findFirstDate(long j, Date date) {
        if (date != null) {
            return nativeFindFirstTimestamp(this.nativeTableRefPtr, j, date.getTime());
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstDecimal128(long j, Decimal128 decimal128) {
        if (decimal128 != null) {
            return nativeFindFirstDecimal128(this.nativeTableRefPtr, j, decimal128.f20495s, decimal128.f20494r);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstDouble(long j, double d5) {
        return nativeFindFirstDouble(this.nativeTableRefPtr, j, d5);
    }

    public long findFirstFloat(long j, float f3) {
        return nativeFindFirstFloat(this.nativeTableRefPtr, j, f3);
    }

    public long findFirstLong(long j, long j10) {
        return nativeFindFirstInt(this.nativeTableRefPtr, j, j10);
    }

    public long findFirstNull(long j) {
        return nativeFindFirstNull(this.nativeTableRefPtr, j);
    }

    public long findFirstObjectId(long j, ObjectId objectId) {
        if (objectId != null) {
            return nativeFindFirstObjectId(this.nativeTableRefPtr, j, objectId.toString());
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstString(long j, String str) {
        if (str != null) {
            return nativeFindFirstString(this.nativeTableRefPtr, j, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstUUID(long j, UUID uuid) {
        if (uuid != null) {
            return nativeFindFirstUUID(this.nativeTableRefPtr, j, uuid.toString());
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public Table freeze(OsSharedRealm osSharedRealm) {
        if (osSharedRealm.isFrozen()) {
            return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.nativeTableRefPtr));
        }
        throw new IllegalArgumentException("Frozen Realm required");
    }

    public byte[] getBinaryByteArray(long j, long j10) {
        return nativeGetByteArray(this.nativeTableRefPtr, j, j10);
    }

    public boolean getBoolean(long j, long j10) {
        return nativeGetBoolean(this.nativeTableRefPtr, j, j10);
    }

    public CheckedRow getCheckedRow(long j) {
        return CheckedRow.get(this.context, this, j);
    }

    public String getClassName() {
        String classNameForTable = getClassNameForTable(getName());
        if (Util.isEmptyString(classNameForTable)) {
            throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
        }
        return classNameForTable;
    }

    public long getColumnCount() {
        return nativeGetColumnCount(this.nativeTableRefPtr);
    }

    public long getColumnKey(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.nativeTableRefPtr, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String getColumnName(long j) {
        return nativeGetColumnName(this.nativeTableRefPtr, j);
    }

    public String[] getColumnNames() {
        return nativeGetColumnNames(this.nativeTableRefPtr);
    }

    public RealmFieldType getColumnType(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.nativeTableRefPtr, j));
    }

    public Date getDate(long j, long j10) {
        return new Date(nativeGetTimestamp(this.nativeTableRefPtr, j, j10));
    }

    public double getDouble(long j, long j10) {
        return nativeGetDouble(this.nativeTableRefPtr, j, j10);
    }

    public float getFloat(long j, long j10) {
        return nativeGetFloat(this.nativeTableRefPtr, j, j10);
    }

    public long getLink(long j, long j10) {
        return nativeGetLink(this.nativeTableRefPtr, j, j10);
    }

    public Table getLinkTarget(long j) {
        return new Table(this.sharedRealm, nativeGetLinkTarget(this.nativeTableRefPtr, j));
    }

    public long getLong(long j, long j10) {
        return nativeGetLong(this.nativeTableRefPtr, j, j10);
    }

    public String getName() {
        return nativeGetName(this.nativeTableRefPtr);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativeTableRefPtr;
    }

    public OsSharedRealm getSharedRealm() {
        return this.sharedRealm;
    }

    public String getString(long j, long j10) {
        return nativeGetString(this.nativeTableRefPtr, j, j10);
    }

    public Table getTable() {
        return this;
    }

    public UncheckedRow getUncheckedRow(long j) {
        return UncheckedRow.getByRowKey(this.context, this, j);
    }

    public UncheckedRow getUncheckedRowByPointer(long j) {
        return UncheckedRow.getByRowPointer(this.context, this, j);
    }

    public boolean hasSameSchema(Table table) {
        if (table != null) {
            return nativeHasSameSchema(this.nativeTableRefPtr, table.nativeTableRefPtr);
        }
        throw new IllegalArgumentException("The argument cannot be null");
    }

    public boolean hasSearchIndex(long j) {
        return nativeHasSearchIndex(this.nativeTableRefPtr, j);
    }

    public void incrementLong(long j, long j10, long j11) {
        checkImmutable();
        nativeIncrementLong(this.nativeTableRefPtr, j, j10, j11);
    }

    public boolean isColumnNullable(long j) {
        return nativeIsColumnNullable(this.nativeTableRefPtr, j);
    }

    public boolean isEmbedded() {
        return nativeIsEmbedded(this.nativeTableRefPtr);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isImmutable() {
        OsSharedRealm osSharedRealm = this.sharedRealm;
        return (osSharedRealm == null || osSharedRealm.isInTransaction()) ? false : true;
    }

    public boolean isNullLink(long j, long j10) {
        return nativeIsNullLink(this.nativeTableRefPtr, j, j10);
    }

    public boolean isValid() {
        long j = this.nativeTableRefPtr;
        return j != 0 && nativeIsValid(j);
    }

    public void moveLastOver(long j) {
        checkImmutable();
        nativeMoveLastOver(this.nativeTableRefPtr, j);
    }

    public native long nativeGetRowPtr(long j, long j10);

    public void nullifyLink(long j, long j10) {
        nativeNullifyLink(this.nativeTableRefPtr, j, j10);
    }

    public void removeColumn(long j) {
        String className = getClassName();
        String columnName = getColumnName(j);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, getClassName());
        nativeRemoveColumn(this.nativeTableRefPtr, j);
        if (columnName.equals(primaryKeyForObject)) {
            OsObjectStore.setPrimaryKeyForObject(this.sharedRealm, className, null);
        }
    }

    public void removeSearchIndex(long j) {
        checkImmutable();
        nativeRemoveSearchIndex(this.nativeTableRefPtr, j);
    }

    public void renameColumn(long j, String str) {
        verifyColumnName(str);
        String strNativeGetColumnName = nativeGetColumnName(this.nativeTableRefPtr, j);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, getClassName());
        nativeRenameColumn(this.nativeTableRefPtr, j, str);
        if (strNativeGetColumnName.equals(primaryKeyForObject)) {
            try {
                OsObjectStore.setPrimaryKeyForObject(this.sharedRealm, getClassName(), str);
            } catch (Exception e10) {
                nativeRenameColumn(this.nativeTableRefPtr, j, strNativeGetColumnName);
                throw new RuntimeException(e10);
            }
        }
    }

    public void setBinaryByteArray(long j, long j10, byte[] bArr, boolean z10) {
        checkImmutable();
        nativeSetByteArray(this.nativeTableRefPtr, j, j10, bArr, z10);
    }

    public void setBoolean(long j, long j10, boolean z10, boolean z11) {
        checkImmutable();
        nativeSetBoolean(this.nativeTableRefPtr, j, j10, z10, z11);
    }

    public void setDate(long j, long j10, Date date, boolean z10) {
        if (date == null) {
            throw new IllegalArgumentException("Null Date is not allowed.");
        }
        checkImmutable();
        nativeSetTimestamp(this.nativeTableRefPtr, j, j10, date.getTime(), z10);
    }

    public void setDecimal128(long j, long j10, Decimal128 decimal128, boolean z10) {
        checkImmutable();
        if (decimal128 == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j10, z10);
        } else {
            nativeSetDecimal128(this.nativeTableRefPtr, j, j10, decimal128.f20495s, decimal128.f20494r, z10);
        }
    }

    public void setDouble(long j, long j10, double d5, boolean z10) {
        checkImmutable();
        nativeSetDouble(this.nativeTableRefPtr, j, j10, d5, z10);
    }

    public boolean setEmbedded(boolean z10) {
        return setEmbedded(z10, false);
    }

    public void setFloat(long j, long j10, float f3, boolean z10) {
        checkImmutable();
        nativeSetFloat(this.nativeTableRefPtr, j, j10, f3, z10);
    }

    public void setLink(long j, long j10, long j11, boolean z10) {
        checkImmutable();
        nativeSetLink(this.nativeTableRefPtr, j, j10, j11, z10);
    }

    public void setLong(long j, long j10, long j11, boolean z10) {
        checkImmutable();
        nativeSetLong(this.nativeTableRefPtr, j, j10, j11, z10);
    }

    public void setNull(long j, long j10, boolean z10) {
        checkImmutable();
        nativeSetNull(this.nativeTableRefPtr, j, j10, z10);
    }

    public void setObjectId(long j, long j10, ObjectId objectId, boolean z10) {
        checkImmutable();
        if (objectId == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j10, z10);
        } else {
            nativeSetObjectId(this.nativeTableRefPtr, j, j10, objectId.toString(), z10);
        }
    }

    public void setRealmAny(long j, long j10, long j11, boolean z10) {
        checkImmutable();
        nativeSetRealmAny(this.nativeTableRefPtr, j, j10, j11, z10);
    }

    public void setString(long j, long j10, String str, boolean z10) {
        checkImmutable();
        if (str == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j10, z10);
        } else {
            nativeSetString(this.nativeTableRefPtr, j, j10, str, z10);
        }
    }

    public void setUUID(long j, long j10, UUID uuid, boolean z10) {
        checkImmutable();
        if (uuid == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j10, z10);
        } else {
            nativeSetUUID(this.nativeTableRefPtr, j, j10, uuid.toString(), z10);
        }
    }

    public long size() {
        return nativeSize(this.nativeTableRefPtr);
    }

    public String toString() {
        long columnCount = getColumnCount();
        String name = getName();
        StringBuilder sb = new StringBuilder("The Table ");
        if (name != null && !name.isEmpty()) {
            sb.append(getName());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(columnCount);
        sb.append(" columns: ");
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            String str = columnNames[i10];
            if (!z10) {
                sb.append(", ");
            }
            sb.append(str);
            i10++;
            z10 = false;
        }
        sb.append(". And ");
        sb.append(size());
        sb.append(" rows.");
        return sb.toString();
    }

    public TableQuery where() {
        return new TableQuery(this.context, this, nativeWhere(this.nativeTableRefPtr));
    }

    public long count(long j, float f3) {
        return nativeCountFloat(this.nativeTableRefPtr, j, f3);
    }

    public boolean setEmbedded(boolean z10, boolean z11) {
        return nativeSetEmbedded(this.nativeTableRefPtr, z10, z11);
    }

    public long count(long j, double d5) {
        return nativeCountDouble(this.nativeTableRefPtr, j, d5);
    }

    public long count(long j, String str) {
        return nativeCountString(this.nativeTableRefPtr, j, str);
    }

    public long addColumn(RealmFieldType realmFieldType, String str) {
        return addColumn(realmFieldType, str, false);
    }
}
