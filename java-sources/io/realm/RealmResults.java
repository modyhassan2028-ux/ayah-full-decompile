package io.realm;

import android.annotation.SuppressLint;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import io.realm.rx.CollectionChange;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class RealmResults<E> extends OrderedRealmCollectionImpl<E> {

    /* JADX INFO: renamed from: io.realm.RealmResults$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            $SwitchMap$io$realm$RealmFieldType = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, Class<E> cls) {
        this(baseRealm, osResults, (Class) cls, false);
    }

    private void checkForAddListener(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.baseRealm.checkIfValid();
        this.baseRealm.sharedRealm.capabilities.checkCanDeliverNotification("Listeners cannot be used on current thread.");
    }

    private void checkForRemoveListener(Object obj, boolean z10) {
        if (z10 && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (this.baseRealm.isClosed()) {
            RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.baseRealm.configuration.getPath());
        }
    }

    private void checkNonEmptyFieldName(String str) {
        if (Util.isEmptyString(str)) {
            throw new IllegalArgumentException("Non-empty 'fieldname' required.");
        }
    }

    private void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Non-null 'value' required. Use 'setNull(fieldName)' instead.");
        }
    }

    private Row checkRealmObjectConstraints(String str, RealmModel realmModel) {
        if (realmModel == null) {
            return null;
        }
        if (!RealmObject.isManaged(realmModel) || !RealmObject.isValid(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid, managed Realm object.");
        }
        ProxyState proxyStateRealmGet$proxyState = ((RealmObjectProxy) realmModel).realmGet$proxyState();
        if (!proxyStateRealmGet$proxyState.getRealm$realm().getPath().equals(this.baseRealm.getPath())) {
            throw new IllegalArgumentException("'value' does not belong to the same Realm as the RealmResults.");
        }
        Table table = this.osResults.getTable();
        Table linkTarget = table.getLinkTarget(table.getColumnKey(str));
        Table table2 = proxyStateRealmGet$proxyState.getRow$realm().getTable();
        if (linkTarget.hasSameSchema(table2)) {
            return proxyStateRealmGet$proxyState.getRow$realm();
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(c.t("Type of object is wrong. Was '", table2.getClassName(), "', expected '", linkTarget.getClassName(), "'"));
    }

    private void checkType(String str, RealmFieldType realmFieldType) {
        String className = this.osResults.getTable().getClassName();
        RealmFieldType fieldType = this.baseRealm.getSchema().get(className).getFieldType(str);
        if (fieldType == realmFieldType) {
            return;
        }
        throw new IllegalArgumentException("The field '" + className + "." + str + "' is not of the expected type. Actual: " + fieldType + ", Expected: " + realmFieldType);
    }

    private <T> void checkTypeOfListElements(RealmList<T> realmList, Class<?> cls) {
        if (realmList.isEmpty()) {
            return;
        }
        Class<?> cls2 = realmList.first().getClass();
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        throw new IllegalArgumentException("List contained the wrong type of elements. Elements of type '" + cls + "' was expected, but the actual type is '" + cls2 + "'");
    }

    @SuppressLint({"unused"})
    public static <T extends RealmModel> RealmResults<T> createBacklinkResults(BaseRealm baseRealm, Row row, Class<T> cls, String str) {
        Table table = baseRealm.getSchema().getTable((Class<? extends RealmModel>) cls);
        return new RealmResults<>(baseRealm, OsResults.createForBacklinks(baseRealm.sharedRealm, (UncheckedRow) row, table, str), cls);
    }

    public static RealmResults<DynamicRealmObject> createDynamicBacklinkResults(DynamicRealm dynamicRealm, UncheckedRow uncheckedRow, Table table, String str) {
        return new RealmResults<>(dynamicRealm, OsResults.createForBacklinks(dynamicRealm.sharedRealm, uncheckedRow, table, str), Table.getClassNameForTable(table.getName()));
    }

    private Class<?> getListType(RealmList realmList) {
        return !realmList.isEmpty() ? realmList.first().getClass() : Long.class;
    }

    private String mapFieldNameToInternalName(String str) {
        if (!(this.baseRealm instanceof Realm)) {
            return str;
        }
        String internalFieldName = this.baseRealm.getSchema().getColumnInfo(this.osResults.getTable().getClassName()).getInternalFieldName(str);
        if (internalFieldName != null) {
            return internalFieldName;
        }
        throw new IllegalArgumentException(a.D("Field '", str, "' does not exists."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        super.add(i10, obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i10, Collection collection) {
        return super.addAll(i10, collection);
    }

    public void addChangeListener(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        checkForAddListener(realmChangeListener);
        this.osResults.addListener(this, realmChangeListener);
    }

    public Observable<CollectionChange<RealmResults<E>>> asChangesetObservable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((DynamicRealm) baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    public Flowable<RealmResults<E>> asFlowable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().from((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().from((DynamicRealm) baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    public String asJSON() {
        return this.osResults.toJSON(-1);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ double average(String str) {
        return super.average(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ OrderedRealmCollectionSnapshot createSnapshot() {
        return super.createSnapshot();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean deleteAllFromRealm() {
        return super.deleteAllFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteFirstFromRealm() {
        return super.deleteFirstFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ void deleteFromRealm(int i10) {
        super.deleteFromRealm(i10);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteLastFromRealm() {
        return super.deleteLastFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ Object first() {
        return super.first();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return super.get(i10);
    }

    @Override // io.realm.OrderedRealmCollectionImpl
    public /* bridge */ /* synthetic */ Realm getRealm() {
        return super.getRealm();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        BaseRealm baseRealm = this.baseRealm;
        return baseRealm != null && baseRealm.isFrozen();
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        this.baseRealm.checkIfValid();
        return this.osResults.isLoaded();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isManaged() {
        return super.isManaged();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isValid() {
        return super.isValid();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ Object last() {
        return super.last();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        this.baseRealm.checkIfValid();
        this.osResults.load();
        return true;
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number max(String str) {
        return super.max(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Date maxDate(String str) {
        return super.maxDate(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number min(String str) {
        return super.min(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Date minDate(String str) {
        return super.minDate(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        return super.remove(i10);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public void removeAllChangeListeners() {
        checkForRemoveListener(null, false);
        this.osResults.removeAllListeners();
    }

    public void removeChangeListener(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        checkForRemoveListener(realmChangeListener, true);
        this.osResults.removeListener(this, realmChangeListener);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return super.set(i10, obj);
    }

    public void setBlob(String str, byte[] bArr) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.BINARY);
        this.osResults.setBlob(strMapFieldNameToInternalName, bArr);
    }

    public void setBoolean(String str, boolean z10) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.BOOLEAN);
        this.osResults.setBoolean(strMapFieldNameToInternalName, z10);
    }

    public void setByte(String str, byte b5) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.osResults.setInt(strMapFieldNameToInternalName, b5);
    }

    public void setDate(String str, Date date) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.DATE);
        this.osResults.setDate(strMapFieldNameToInternalName, date);
    }

    public void setDecimal128(String str, Decimal128 decimal128) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.DECIMAL128);
        this.osResults.setDecimal128(strMapFieldNameToInternalName, decimal128);
    }

    public void setDouble(String str, double d5) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.DOUBLE);
        this.osResults.setDouble(strMapFieldNameToInternalName, d5);
    }

    public void setFloat(String str, float f3) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.FLOAT);
        this.osResults.setFloat(strMapFieldNameToInternalName, f3);
    }

    public void setInt(String str, int i10) {
        checkNonEmptyFieldName(str);
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.baseRealm.checkIfValidAndInTransaction();
        this.osResults.setInt(strMapFieldNameToInternalName, i10);
    }

    public <T> void setList(String str, RealmList<T> realmList) {
        checkNonEmptyFieldName(str);
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        if (realmList == null) {
            throw new IllegalArgumentException("Non-null 'list' required");
        }
        RealmFieldType fieldType = this.baseRealm.getSchema().getSchemaForClass(this.osResults.getTable().getClassName()).getFieldType(strMapFieldNameToInternalName);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[fieldType.ordinal()]) {
            case 9:
                checkTypeOfListElements(realmList, RealmModel.class);
                checkRealmObjectConstraints(strMapFieldNameToInternalName, (RealmModel) realmList.first(null));
                this.osResults.setModelList(strMapFieldNameToInternalName, realmList);
                return;
            case 10:
                Class<?> listType = getListType(realmList);
                if (listType.equals(Integer.class)) {
                    this.osResults.setIntegerList(strMapFieldNameToInternalName, realmList);
                    return;
                }
                if (listType.equals(Long.class)) {
                    this.osResults.setLongList(strMapFieldNameToInternalName, realmList);
                    return;
                }
                if (listType.equals(Short.class)) {
                    this.osResults.setShortList(strMapFieldNameToInternalName, realmList);
                    return;
                } else {
                    if (listType.equals(Byte.class)) {
                        this.osResults.setByteList(strMapFieldNameToInternalName, realmList);
                        return;
                    }
                    throw new IllegalArgumentException("List contained the wrong type of elements. Elements that can be mapped to Integers was expected, but the actual type is '" + listType + "'");
                }
            case 11:
                checkTypeOfListElements(realmList, Boolean.class);
                this.osResults.setBooleanList(strMapFieldNameToInternalName, realmList);
                return;
            case 12:
                checkTypeOfListElements(realmList, String.class);
                this.osResults.setStringList(strMapFieldNameToInternalName, realmList);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                checkTypeOfListElements(realmList, byte[].class);
                this.osResults.setByteArrayList(strMapFieldNameToInternalName, realmList);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                checkTypeOfListElements(realmList, Date.class);
                this.osResults.setDateList(strMapFieldNameToInternalName, realmList);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                checkTypeOfListElements(realmList, Decimal128.class);
                this.osResults.setDecimal128List(strMapFieldNameToInternalName, realmList);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                checkTypeOfListElements(realmList, ObjectId.class);
                this.osResults.setObjectIdList(strMapFieldNameToInternalName, realmList);
                return;
            case 17:
                checkTypeOfListElements(realmList, UUID.class);
                this.osResults.setUUIDList(strMapFieldNameToInternalName, realmList);
                return;
            case 18:
                checkTypeOfListElements(realmList, Float.class);
                this.osResults.setFloatList(strMapFieldNameToInternalName, realmList);
                return;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                checkTypeOfListElements(realmList, Double.class);
                this.osResults.setDoubleList(strMapFieldNameToInternalName, realmList);
                return;
            default:
                throw new IllegalArgumentException("Field '" + strMapFieldNameToInternalName + "' is not a list but a " + fieldType);
        }
    }

    public void setLong(String str, long j) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.osResults.setInt(strMapFieldNameToInternalName, j);
    }

    public void setNull(String str) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        this.osResults.setNull(str);
    }

    public void setObject(String str, RealmModel realmModel) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.OBJECT);
        this.osResults.setObject(strMapFieldNameToInternalName, checkRealmObjectConstraints(strMapFieldNameToInternalName, realmModel));
    }

    public void setObjectId(String str, ObjectId objectId) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.OBJECT_ID);
        this.osResults.setObjectId(strMapFieldNameToInternalName, objectId);
    }

    public void setShort(String str, short s10) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.osResults.setInt(strMapFieldNameToInternalName, s10);
    }

    public void setString(String str, String str2) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.STRING);
        this.osResults.setString(strMapFieldNameToInternalName, str2);
    }

    public void setUUID(String str, UUID uuid) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(strMapFieldNameToInternalName, RealmFieldType.UUID);
        this.osResults.setUUID(strMapFieldNameToInternalName, uuid);
    }

    public void setValue(String str, Object obj) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String strMapFieldNameToInternalName = mapFieldNameToInternalName(str);
        boolean z10 = obj instanceof String;
        String str2 = z10 ? (String) obj : null;
        String className = this.osResults.getTable().getClassName();
        RealmObjectSchema realmObjectSchema = getRealm().getSchema().get(className);
        if (!realmObjectSchema.hasField(strMapFieldNameToInternalName)) {
            throw new IllegalArgumentException(c.t("Field '", strMapFieldNameToInternalName, "' could not be found in class '", className, "'"));
        }
        if (obj == null) {
            this.osResults.setNull(strMapFieldNameToInternalName);
            return;
        }
        RealmFieldType fieldType = realmObjectSchema.getFieldType(strMapFieldNameToInternalName);
        if (z10 && fieldType != RealmFieldType.STRING) {
            switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[fieldType.ordinal()]) {
                case 1:
                    obj = Boolean.valueOf(Boolean.parseBoolean(str2));
                    break;
                case 2:
                    obj = Long.valueOf(Long.parseLong(str2));
                    break;
                case 3:
                    obj = Float.valueOf(Float.parseFloat(str2));
                    break;
                case 4:
                    obj = Double.valueOf(Double.parseDouble(str2));
                    break;
                case 5:
                    obj = JsonUtils.stringToDate(str2);
                    break;
                case 6:
                    obj = Decimal128.g(str2);
                    break;
                case 7:
                    obj = new ObjectId(str2);
                    break;
                case 8:
                    obj = UUID.fromString(str2);
                    break;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", strMapFieldNameToInternalName, obj));
            }
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class) {
            setBoolean(strMapFieldNameToInternalName, ((Boolean) obj).booleanValue());
            return;
        }
        if (cls == Short.class) {
            setShort(strMapFieldNameToInternalName, ((Short) obj).shortValue());
            return;
        }
        if (cls == Integer.class) {
            setInt(strMapFieldNameToInternalName, ((Integer) obj).intValue());
            return;
        }
        if (cls == Long.class) {
            setLong(strMapFieldNameToInternalName, ((Long) obj).longValue());
            return;
        }
        if (cls == Byte.class) {
            setByte(strMapFieldNameToInternalName, ((Byte) obj).byteValue());
            return;
        }
        if (cls == Float.class) {
            setFloat(strMapFieldNameToInternalName, ((Float) obj).floatValue());
            return;
        }
        if (cls == Double.class) {
            setDouble(strMapFieldNameToInternalName, ((Double) obj).doubleValue());
            return;
        }
        if (cls == String.class) {
            setString(strMapFieldNameToInternalName, (String) obj);
            return;
        }
        if (obj instanceof Date) {
            setDate(strMapFieldNameToInternalName, (Date) obj);
            return;
        }
        if (obj instanceof Decimal128) {
            setDecimal128(strMapFieldNameToInternalName, (Decimal128) obj);
            return;
        }
        if (obj instanceof ObjectId) {
            setObjectId(strMapFieldNameToInternalName, (ObjectId) obj);
            return;
        }
        if (obj instanceof UUID) {
            setUUID(strMapFieldNameToInternalName, (UUID) obj);
            return;
        }
        if (obj instanceof byte[]) {
            setBlob(strMapFieldNameToInternalName, (byte[]) obj);
            return;
        }
        if (obj instanceof RealmModel) {
            setObject(strMapFieldNameToInternalName, (RealmModel) obj);
        } else if (cls == RealmList.class) {
            setList(strMapFieldNameToInternalName, (RealmList) obj);
        } else {
            throw new IllegalArgumentException("Value is of a type not supported: " + obj.getClass());
        }
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String str) {
        return super.sort(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number sum(String str) {
        return super.sum(str);
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> where() {
        this.baseRealm.checkIfValid();
        return RealmQuery.createQueryFromResult(this);
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, Class<E> cls, boolean z10) {
        super(baseRealm, osResults, cls, OrderedRealmCollectionImpl.getCollectionOperator(z10, baseRealm, osResults, cls, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ Object first(Object obj) {
        return super.first(obj);
    }

    @Override // io.realm.internal.Freezable
    public RealmResults<E> freeze() {
        if (!isValid()) {
            throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
        }
        BaseRealm baseRealmFreeze = this.baseRealm.freeze();
        OsResults osResultsFreeze = this.osResults.freeze(baseRealmFreeze.sharedRealm);
        String str = this.className;
        return str != null ? new RealmResults<>(baseRealmFreeze, osResultsFreeze, str) : new RealmResults<>(baseRealmFreeze, osResultsFreeze, this.classSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ Object last(Object obj) {
        return super.last(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return super.listIterator(i10);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String str, Sort sort) {
        return super.sort(str, sort);
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, String str) {
        this(baseRealm, osResults, str, false);
    }

    public void addChangeListener(OrderedRealmCollectionChangeListener<RealmResults<E>> orderedRealmCollectionChangeListener) {
        checkForAddListener(orderedRealmCollectionChangeListener);
        this.osResults.addListener(this, orderedRealmCollectionChangeListener);
    }

    public void removeChangeListener(OrderedRealmCollectionChangeListener<RealmResults<E>> orderedRealmCollectionChangeListener) {
        checkForRemoveListener(orderedRealmCollectionChangeListener, true);
        this.osResults.removeListener(this, orderedRealmCollectionChangeListener);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String[] strArr, Sort[] sortArr) {
        return super.sort(strArr, sortArr);
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, String str, boolean z10) {
        super(baseRealm, osResults, str, OrderedRealmCollectionImpl.getCollectionOperator(z10, baseRealm, osResults, null, str));
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }
}
