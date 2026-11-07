package io.realm.internal;

import io.realm.ObjectChangeSet;
import io.realm.RealmFieldType;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import io.realm.exceptions.RealmException;
import java.util.UUID;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class OsObject implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private ObserverPairList<ObjectObserverPair> observerPairs = new ObserverPairList<>();

    public static class Callback implements ObserverPairList.Callback<ObjectObserverPair> {
        private final String[] changedFields;

        public Callback(String[] strArr) {
            this.changedFields = strArr;
        }

        private ObjectChangeSet createChangeSet() {
            String[] strArr = this.changedFields;
            boolean z10 = strArr == null;
            if (z10) {
                strArr = new String[0];
            }
            return new OsObjectChangeSet(strArr, z10);
        }

        @Override // io.realm.internal.ObserverPairList.Callback
        public void onCalled(ObjectObserverPair objectObserverPair, Object obj) {
            objectObserverPair.onChange((RealmModel) obj, createChangeSet());
        }
    }

    public static class ObjectObserverPair<T extends RealmModel> extends ObserverPairList.ObserverPair<T, RealmObjectChangeListener<T>> {
        public ObjectObserverPair(T t2, RealmObjectChangeListener<T> realmObjectChangeListener) {
            super(t2, realmObjectChangeListener);
        }

        public void onChange(T t2, ObjectChangeSet objectChangeSet) {
            ((RealmObjectChangeListener) this.listener).onChange(t2, objectChangeSet);
        }
    }

    public static class OsObjectChangeSet implements ObjectChangeSet {
        final String[] changedFields;
        final boolean deleted;

        public OsObjectChangeSet(String[] strArr, boolean z10) {
            this.changedFields = strArr;
            this.deleted = z10;
        }

        @Override // io.realm.ObjectChangeSet
        public String[] getChangedFields() {
            return this.changedFields;
        }

        @Override // io.realm.ObjectChangeSet
        public boolean isDeleted() {
            return this.deleted;
        }

        @Override // io.realm.ObjectChangeSet
        public boolean isFieldChanged(String str) {
            for (String str2 : this.changedFields) {
                if (str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.addReference(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.getSharedRealm().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j, long j10) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j, j10);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j, Object obj) {
        RealmFieldType columnType = table.getColumnType(j);
        OsSharedRealm sharedRealm = table.getSharedRealm();
        if (columnType == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return nativeCreateRowWithStringPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, (String) obj);
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        }
        if (columnType == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null);
        }
        if (columnType == RealmFieldType.OBJECT_ID) {
            if (obj == null || (obj instanceof ObjectId)) {
                return nativeCreateRowWithObjectIdPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, obj != null ? obj.toString() : null);
            }
            throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
        }
        if (columnType != RealmFieldType.UUID) {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + columnType);
        }
        if (obj == null || (obj instanceof UUID)) {
            return nativeCreateRowWithUUIDPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, obj != null ? obj.toString() : null);
        }
        throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType columnType = table.getColumnType(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm sharedRealm = table.getSharedRealm();
        if (columnType == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithStringPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        }
        if (columnType == RealmFieldType.INTEGER) {
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithLongPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null));
        }
        if (columnType == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj != null ? obj.toString() : null));
        }
        if (columnType == RealmFieldType.UUID) {
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj != null ? obj.toString() : null));
        }
        throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + columnType);
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(table.getSharedRealm(), table.getClassName());
        if (primaryKeyForObject != null) {
            return table.getColumnKey(primaryKeyForObject);
        }
        throw new IllegalStateException(table.getName() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j, long j10);

    private static native long nativeCreateEmbeddedObject(long j, long j10, long j11);

    private static native long nativeCreateNewObject(long j);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j10, long j11, long j12, boolean z10);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j, long j10, long j11, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j10, long j11, String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j, long j10, long j11, String str);

    private static native long nativeCreateRow(long j);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j10, long j11, long j12, boolean z10);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j, long j10, long j11, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j10, long j11, String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j, long j10, long j11, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.foreach(new Callback(strArr));
    }

    public <T extends RealmModel> void addListener(T t2, RealmObjectChangeListener<T> realmObjectChangeListener) {
        if (this.observerPairs.isEmpty()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.add(new ObjectObserverPair(t2, realmObjectChangeListener));
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends RealmModel> void removeListener(T t2) {
        this.observerPairs.removeByObserver(t2);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(ObserverPairList<ObjectObserverPair> observerPairList) {
        if (!this.observerPairs.isEmpty()) {
            throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
        }
        this.observerPairs = observerPairList;
        if (observerPairList.isEmpty()) {
            return;
        }
        nativeStartListening(this.nativePtr);
    }

    public <T extends RealmModel> void removeListener(T t2, RealmObjectChangeListener<T> realmObjectChangeListener) {
        this.observerPairs.remove(t2, realmObjectChangeListener);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }
}
