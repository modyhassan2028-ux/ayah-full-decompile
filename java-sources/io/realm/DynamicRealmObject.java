package io.realm;

import android.support.v4.media.session.p;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.android.JsonUtils;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class DynamicRealmObject extends RealmObject implements RealmObjectProxy {
    static final String MSG_LINK_QUERY_NOT_SUPPORTED = "Queries across relationships are not supported";
    private final ProxyState<DynamicRealmObject> proxyState;

    /* JADX INFO: renamed from: io.realm.DynamicRealmObject$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$DynamicRealmObject$CollectionType;
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

        static {
            int[] iArr = new int[CollectionType.values().length];
            $SwitchMap$io$realm$DynamicRealmObject$CollectionType = iArr;
            try {
                iArr[CollectionType.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$DynamicRealmObject$CollectionType[CollectionType.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$DynamicRealmObject$CollectionType[CollectionType.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            $SwitchMap$io$realm$RealmFieldType = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    public enum CollectionType {
        LIST,
        DICTIONARY,
        SET
    }

    public DynamicRealmObject(RealmModel realmModel) {
        ProxyState<DynamicRealmObject> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        if (realmModel == null) {
            throw new IllegalArgumentException("A non-null object must be provided.");
        }
        if (realmModel instanceof DynamicRealmObject) {
            throw new IllegalArgumentException("The object is already a DynamicRealmObject: " + realmModel);
        }
        if (!RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("An object managed by Realm must be provided. This is an unmanaged object.");
        }
        if (!RealmObject.isValid(realmModel)) {
            throw new IllegalArgumentException("A valid object managed by Realm must be provided. This object was deleted.");
        }
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
        Row row$realm = realmObjectProxy.realmGet$proxyState().getRow$realm();
        proxyState.setRealm$realm(realmObjectProxy.realmGet$proxyState().getRealm$realm());
        proxyState.setRow$realm(((UncheckedRow) row$realm).convertToChecked());
        proxyState.setConstructionFinished();
    }

    private void checkFieldType(String str, long j, RealmFieldType realmFieldType) {
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(j);
        if (columnType != realmFieldType) {
            RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
            String str2 = "n";
            String str3 = (realmFieldType == realmFieldType2 || realmFieldType == RealmFieldType.OBJECT) ? "n" : "";
            if (columnType != realmFieldType2 && columnType != RealmFieldType.OBJECT) {
                str2 = "";
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException("'" + str + "' is not a" + str3 + " '" + realmFieldType + "', but a" + str2 + " '" + columnType + "'.");
        }
    }

    private void checkIsPrimaryKey(String str) {
        RealmObjectSchema schemaForClass = this.proxyState.getRealm$realm().getSchema().getSchemaForClass(getType());
        if (schemaForClass.hasPrimaryKey() && schemaForClass.getPrimaryKey().equals(str)) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a.D("Primary key field '", str, "' cannot be changed after object was created."));
        }
    }

    private <E> ManagedListOperator<E> getOperator(BaseRealm baseRealm, OsList osList, RealmFieldType realmFieldType, Class<E> cls) {
        if (realmFieldType == RealmFieldType.STRING_LIST) {
            return new StringListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.INTEGER_LIST) {
            return new LongListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BOOLEAN_LIST) {
            return new BooleanListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BINARY_LIST) {
            return new BinaryListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DOUBLE_LIST) {
            return new DoubleListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.FLOAT_LIST) {
            return new FloatListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DATE_LIST) {
            return new DateListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DECIMAL128_LIST) {
            return new Decimal128ListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.OBJECT_ID_LIST) {
            return new ObjectIdListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.UUID_LIST) {
            return new UUIDListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.MIXED_LIST) {
            return new RealmAnyListOperator(baseRealm, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected list type: " + realmFieldType.name());
    }

    private <E> int primitiveTypeToCoreType(Class<E> cls) {
        if (cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Byte.class)) {
            return 0;
        }
        if (cls.equals(Boolean.class)) {
            return 1;
        }
        if (cls.equals(String.class)) {
            return 2;
        }
        if (cls.equals(byte[].class)) {
            return 4;
        }
        if (cls.equals(Date.class)) {
            return 8;
        }
        if (cls.equals(Float.class)) {
            return 9;
        }
        if (cls.equals(Double.class)) {
            return 10;
        }
        if (cls.equals(Decimal128.class)) {
            return 11;
        }
        if (cls.equals(ObjectId.class)) {
            return 15;
        }
        if (cls.equals(UUID.class)) {
            return 17;
        }
        if (cls.equals(RealmAny.class)) {
            return 6;
        }
        throw new IllegalArgumentException("Unsupported element type. Only primitive types supported. Yours was: " + cls);
    }

    private <E> RealmFieldType primitiveTypeToRealmFieldType(CollectionType collectionType, Class<E> cls) {
        int i10;
        int iPrimitiveTypeToCoreType = primitiveTypeToCoreType(cls);
        int i11 = AnonymousClass1.$SwitchMap$io$realm$DynamicRealmObject$CollectionType[collectionType.ordinal()];
        if (i11 == 1) {
            i10 = iPrimitiveTypeToCoreType + 256;
        } else if (i11 == 2) {
            i10 = iPrimitiveTypeToCoreType + 512;
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException("Type not supported: " + collectionType);
            }
            i10 = iPrimitiveTypeToCoreType + 128;
        }
        return RealmFieldType.fromNativeValue(i10);
    }

    private void setModelDictionary(String str, RealmDictionary<DynamicRealmObject> realmDictionary) {
        boolean z10;
        OsMap modelMap = this.proxyState.getRow$realm().getModelMap(this.proxyState.getRow$realm().getColumnKey(str));
        Table targetTable = modelMap.getTargetTable();
        String className = targetTable.getClassName();
        if (realmDictionary.isManaged()) {
            String valueClassName = realmDictionary.getValueClassName() != null ? realmDictionary.getValueClassName() : this.proxyState.getRealm$realm().getSchema().getTable(realmDictionary.getValueClass()).getClassName();
            if (!className.equals(valueClassName)) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(c.t("The elements in the dictionary are not the proper type. Was ", valueClassName, " expected ", className, "."));
            }
            z10 = true;
        } else {
            z10 = false;
        }
        RealmDictionary realmDictionary2 = new RealmDictionary();
        for (Map.Entry<String, DynamicRealmObject> entry : realmDictionary.entrySet()) {
            DynamicRealmObject value = entry.getValue();
            if (value.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'dictionary' must belong to the same Realm instance.");
            }
            if (!z10 && !targetTable.hasSameSchema(value.realmGet$proxyState().getRow$realm().getTable())) {
                throw new IllegalArgumentException(String.format(Locale.US, "Element with key %s is not the proper type. Was '%s' expected '%s'.", entry.getKey(), value.realmGet$proxyState().getRow$realm().getTable().getClassName(), className));
            }
            realmDictionary2.put(entry.getKey(), Long.valueOf(p.r(value)));
        }
        modelMap.clear();
        Iterator it = realmDictionary2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            modelMap.putRow(entry2.getKey(), ((Long) entry2.getValue()).longValue());
        }
    }

    private void setModelList(String str, RealmList<DynamicRealmObject> realmList) {
        boolean z10;
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.proxyState.getRow$realm().getColumnKey(str));
        Table targetTable = modelList.getTargetTable();
        String className = targetTable.getClassName();
        String className2 = realmList.className;
        if (className2 == null && realmList.clazz == null) {
            z10 = false;
        } else {
            if (className2 == null) {
                className2 = this.proxyState.getRealm$realm().getSchema().getTable(realmList.clazz).getClassName();
            }
            if (!className.equals(className2)) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(c.t("The elements in the list are not the proper type. Was ", className2, " expected ", className, "."));
            }
            z10 = true;
        }
        int size = realmList.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            DynamicRealmObject dynamicRealmObject = realmList.get(i10);
            if (dynamicRealmObject.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'list' must belong to the same Realm instance.");
            }
            if (!z10 && !targetTable.hasSameSchema(dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable())) {
                Locale locale2 = Locale.US;
                String className3 = dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable().getClassName();
                StringBuilder sb = new StringBuilder("Element at index ");
                sb.append(i10);
                sb.append(" is not the proper type. Was '");
                sb.append(className3);
                sb.append("' expected '");
                throw new IllegalArgumentException(p.B(sb, className, "'."));
            }
            jArr[i10] = p.r(dynamicRealmObject);
        }
        modelList.removeAll();
        for (int i11 = 0; i11 < size; i11++) {
            modelList.addRow(jArr[i11]);
        }
    }

    private void setModelSet(String str, RealmSet<DynamicRealmObject> realmSet) {
        boolean z10;
        OsSet modelSet = this.proxyState.getRow$realm().getModelSet(this.proxyState.getRow$realm().getColumnKey(str));
        Table targetTable = modelSet.getTargetTable();
        String className = targetTable.getClassName();
        if (realmSet.isManaged()) {
            String valueClassName = realmSet.getValueClassName() != null ? realmSet.getValueClassName() : this.proxyState.getRealm$realm().getSchema().getTable(realmSet.getValueClass()).getClassName();
            if (!className.equals(valueClassName)) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(c.t("The elements in the set are not the proper type. Was ", valueClassName, " expected ", className, "."));
            }
            z10 = true;
        } else {
            z10 = false;
        }
        RealmSet realmSet2 = new RealmSet();
        for (DynamicRealmObject dynamicRealmObject : realmSet) {
            if (dynamicRealmObject.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'set' must belong to the same Realm instance.");
            }
            if (!z10 && !targetTable.hasSameSchema(dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable())) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException(c.t("Set contains an element with not the proper type. Was '", dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable().getClassName(), "' expected '", className, "'."));
            }
            realmSet2.add(Long.valueOf(dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey()));
        }
        modelSet.clear();
        Iterator it = realmSet2.iterator();
        while (it.hasNext()) {
            modelSet.addRow(((Long) it.next()).longValue());
        }
    }

    private void setValue(String str, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class) {
            setBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (cls == Short.class) {
            setShort(str, ((Short) obj).shortValue());
            return;
        }
        if (cls == Integer.class) {
            setInt(str, ((Integer) obj).intValue());
            return;
        }
        if (cls == Long.class) {
            setLong(str, ((Long) obj).longValue());
            return;
        }
        if (cls == Byte.class) {
            setByte(str, ((Byte) obj).byteValue());
            return;
        }
        if (cls == Float.class) {
            setFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (cls == Double.class) {
            setDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (cls == String.class) {
            setString(str, (String) obj);
            return;
        }
        if (obj instanceof Date) {
            setDate(str, (Date) obj);
            return;
        }
        if (obj instanceof byte[]) {
            setBlob(str, (byte[]) obj);
            return;
        }
        if (cls == DynamicRealmObject.class) {
            setObject(str, (DynamicRealmObject) obj);
            return;
        }
        if (cls == RealmList.class) {
            setList(str, (RealmList) obj);
            return;
        }
        if (cls == Decimal128.class) {
            setDecimal128(str, (Decimal128) obj);
            return;
        }
        if (cls == ObjectId.class) {
            setObjectId(str, (ObjectId) obj);
            return;
        }
        if (cls == UUID.class) {
            setUUID(str, (UUID) obj);
        } else if (cls == RealmAny.class) {
            setRealmAny(str, (RealmAny) obj);
        } else {
            throw new IllegalArgumentException("Value is of an type not supported: " + obj.getClass());
        }
    }

    private <E> void setValueDictionary(String str, RealmDictionary<E> realmDictionary, RealmFieldType realmFieldType) {
        Class cls;
        OsMap valueMap = this.proxyState.getRow$realm().getValueMap(this.proxyState.getRow$realm().getColumnKey(str), realmFieldType);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                cls = Long.class;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                cls = Boolean.class;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                cls = String.class;
                break;
            case 17:
                cls = byte[].class;
                break;
            case 18:
                cls = Date.class;
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                cls = Float.class;
                break;
            case 20:
                cls = Double.class;
                break;
            case 21:
                cls = Decimal128.class;
                break;
            case 22:
                cls = ObjectId.class;
                break;
            case 23:
                cls = UUID.class;
                break;
            case 24:
                cls = RealmAny.class;
                break;
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
        RealmDictionary realmDictionary2 = new RealmDictionary(this.proxyState.getRealm$realm(), valueMap, cls);
        RealmDictionary realmDictionary3 = new RealmDictionary();
        for (Map.Entry<String, E> entry : realmDictionary.entrySet()) {
            realmDictionary3.put(entry.getKey(), entry.getValue());
        }
        valueMap.clear();
        Iterator it = realmDictionary3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            realmDictionary2.put((String) entry2.getKey(), entry2.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <E> void setValueList(String str, RealmList<E> realmList, RealmFieldType realmFieldType) {
        GenericDeclaration genericDeclaration;
        OsList valueList = this.proxyState.getRow$realm().getValueList(this.proxyState.getRow$realm().getColumnKey(str), realmFieldType);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 39:
                genericDeclaration = Long.class;
                break;
            case 40:
                genericDeclaration = Boolean.class;
                break;
            case 41:
                genericDeclaration = String.class;
                break;
            case 42:
                genericDeclaration = byte[].class;
                break;
            case 43:
                genericDeclaration = Date.class;
                break;
            case 44:
                genericDeclaration = Float.class;
                break;
            case 45:
                genericDeclaration = Double.class;
                break;
            case 46:
                genericDeclaration = Decimal128.class;
                break;
            case 47:
                genericDeclaration = ObjectId.class;
                break;
            case 48:
                genericDeclaration = UUID.class;
                break;
            case 49:
                genericDeclaration = RealmAny.class;
                break;
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
        ManagedListOperator operator = getOperator(this.proxyState.getRealm$realm(), valueList, realmFieldType, genericDeclaration);
        if (!realmList.isManaged() || valueList.size() != realmList.size()) {
            valueList.removeAll();
            Iterator<E> it = realmList.iterator();
            while (it.hasNext()) {
                operator.append(it.next());
            }
            return;
        }
        int size = realmList.size();
        Iterator<E> it2 = realmList.iterator();
        for (int i10 = 0; i10 < size; i10++) {
            operator.set(i10, it2.next());
        }
    }

    private <E> void setValueSet(String str, RealmSet<E> realmSet, RealmFieldType realmFieldType) {
        Class cls;
        OsSet valueSet = this.proxyState.getRow$realm().getValueSet(this.proxyState.getRow$realm().getColumnKey(str), realmFieldType);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 26:
                cls = Number.class;
                break;
            case 27:
                cls = Boolean.class;
                break;
            case 28:
                cls = String.class;
                break;
            case 29:
                cls = byte[].class;
                break;
            case 30:
                cls = Date.class;
                break;
            case 31:
                cls = Float.class;
                break;
            case 32:
                cls = Double.class;
                break;
            case 33:
                cls = Decimal128.class;
                break;
            case 34:
                cls = ObjectId.class;
                break;
            case 35:
                cls = UUID.class;
                break;
            case 36:
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
            case 37:
                cls = RealmAny.class;
                break;
        }
        RealmSet realmSet2 = new RealmSet(this.proxyState.getRealm$realm(), valueSet, cls);
        RealmSet realmSet3 = new RealmSet();
        realmSet3.addAll(realmSet);
        valueSet.clear();
        realmSet2.addAll(realmSet3);
    }

    public boolean equals(Object obj) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
            String path = this.proxyState.getRealm$realm().getPath();
            String path2 = dynamicRealmObject.proxyState.getRealm$realm().getPath();
            if (path == null ? path2 != null : !path.equals(path2)) {
                return false;
            }
            String strY = p.y(this.proxyState);
            String strY2 = p.y(dynamicRealmObject.proxyState);
            if (strY == null ? strY2 != null : !strY.equals(strY2)) {
                return false;
            }
            if (this.proxyState.getRow$realm().getObjectKey() == dynamicRealmObject.proxyState.getRow$realm().getObjectKey()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E get(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(columnKey);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
            case 1:
                return (E) Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(columnKey));
            case 2:
                return (E) Long.valueOf(this.proxyState.getRow$realm().getLong(columnKey));
            case 3:
                return (E) Float.valueOf(this.proxyState.getRow$realm().getFloat(columnKey));
            case 4:
                return (E) Double.valueOf(this.proxyState.getRow$realm().getDouble(columnKey));
            case 5:
                return (E) this.proxyState.getRow$realm().getString(columnKey);
            case 6:
                return (E) this.proxyState.getRow$realm().getBinaryByteArray(columnKey);
            case 7:
                return (E) this.proxyState.getRow$realm().getDate(columnKey);
            case 8:
                return (E) this.proxyState.getRow$realm().getDecimal128(columnKey);
            case 9:
                return (E) this.proxyState.getRow$realm().getObjectId(columnKey);
            case 10:
                return (E) getRealmAny(columnKey);
            case 11:
                return (E) this.proxyState.getRow$realm().getUUID(columnKey);
            case 12:
                return (E) getObject(str);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return (E) getList(str);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return (E) getDictionary(str, Integer.class);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return (E) getDictionary(str, Boolean.class);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return (E) getDictionary(str, String.class);
            case 17:
                return (E) getDictionary(str, byte[].class);
            case 18:
                return (E) getDictionary(str, Date.class);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return (E) getDictionary(str, Float.class);
            case 20:
                return (E) getDictionary(str, Double.class);
            case 21:
                return (E) getDictionary(str, Decimal128.class);
            case 22:
                return (E) getDictionary(str, ObjectId.class);
            case 23:
                return (E) getDictionary(str, UUID.class);
            case 24:
                return (E) getDictionary(str, RealmAny.class);
            case 25:
                return (E) getDictionary(str);
            case 26:
                return (E) getRealmSet(str, Integer.class);
            case 27:
                return (E) getRealmSet(str, Boolean.class);
            case 28:
                return (E) getRealmSet(str, String.class);
            case 29:
                return (E) getRealmSet(str, byte[].class);
            case 30:
                return (E) getRealmSet(str, Date.class);
            case 31:
                return (E) getRealmSet(str, Float.class);
            case 32:
                return (E) getRealmSet(str, Double.class);
            case 33:
                return (E) getRealmSet(str, Decimal128.class);
            case 34:
                return (E) getRealmSet(str, ObjectId.class);
            case 35:
                return (E) getRealmSet(str, UUID.class);
            case 36:
                return (E) getRealmSet(str);
            case 37:
                return (E) getRealmSet(str, RealmAny.class);
            default:
                throw new IllegalStateException("Field type not supported: " + columnType);
        }
    }

    public byte[] getBlob(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getBinaryByteArray(columnKey);
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.BINARY);
            throw e10;
        }
    }

    public boolean getBoolean(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getBoolean(columnKey);
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.BOOLEAN);
            throw e10;
        }
    }

    public byte getByte(String str) {
        return (byte) getLong(str);
    }

    public Date getDate(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.DATE);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getDate(columnKey);
    }

    public Decimal128 getDecimal128(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.DECIMAL128);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getDecimal128(columnKey);
    }

    public RealmDictionary<DynamicRealmObject> getDictionary(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            OsMap modelMap = this.proxyState.getRow$realm().getModelMap(columnKey);
            return new RealmDictionary<>(this.proxyState.getRealm$realm(), modelMap, modelMap.getTargetTable().getClassName());
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.STRING_TO_LINK_MAP);
            throw e10;
        }
    }

    public double getDouble(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getDouble(columnKey);
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.DOUBLE);
            throw e10;
        }
    }

    public DynamicRealm getDynamicRealm() {
        BaseRealm realm$realm = realmGet$proxyState().getRealm$realm();
        realm$realm.checkIfValid();
        if (isValid()) {
            return (DynamicRealm) realm$realm;
        }
        throw new IllegalStateException("the object is already deleted.");
    }

    public String[] getFieldNames() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getColumnNames();
    }

    public RealmFieldType getFieldType(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
    }

    public float getFloat(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getFloat(columnKey);
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.FLOAT);
            throw e10;
        }
    }

    public int getInt(String str) {
        return (int) getLong(str);
    }

    public RealmList<DynamicRealmObject> getList(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            OsList modelList = this.proxyState.getRow$realm().getModelList(columnKey);
            return new RealmList<>(modelList.getTargetTable().getClassName(), modelList, this.proxyState.getRealm$realm());
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.LIST);
            throw e10;
        }
    }

    public long getLong(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getLong(columnKey);
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.INTEGER);
            throw e10;
        }
    }

    public DynamicRealmObject getObject(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.OBJECT);
        if (this.proxyState.getRow$realm().isNullLink(columnKey)) {
            return null;
        }
        return new DynamicRealmObject(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getCheckedRow(this.proxyState.getRow$realm().getLink(columnKey)));
    }

    public ObjectId getObjectId(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.OBJECT_ID);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getObjectId(columnKey);
    }

    public RealmAny getRealmAny(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.MIXED);
        return getRealmAny(columnKey);
    }

    public RealmSet<DynamicRealmObject> getRealmSet(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            OsSet modelSet = this.proxyState.getRow$realm().getModelSet(columnKey);
            return new RealmSet<>(this.proxyState.getRealm$realm(), modelSet, modelSet.getTargetTable().getClassName());
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.LINK_SET);
            throw e10;
        }
    }

    public short getShort(String str) {
        return (short) getLong(str);
    }

    public String getString(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getString(columnKey);
        } catch (IllegalArgumentException e10) {
            checkFieldType(str, columnKey, RealmFieldType.STRING);
            throw e10;
        }
    }

    public String getType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getTable().getClassName();
    }

    public UUID getUUID(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.UUID);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getUUID(columnKey);
    }

    public boolean hasField(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (str == null || str.isEmpty()) {
            return false;
        }
        return this.proxyState.getRow$realm().hasColumn(str);
    }

    public int hashCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        String path = this.proxyState.getRealm$realm().getPath();
        String strY = p.y(this.proxyState);
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (strY != null ? strY.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public boolean isNull(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[this.proxyState.getRow$realm().getColumnType(columnKey).ordinal()]) {
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
                return this.proxyState.getRow$realm().isNull(columnKey);
            case 12:
                return this.proxyState.getRow$realm().isNullLink(columnKey);
            default:
                return false;
        }
    }

    public RealmResults<DynamicRealmObject> linkingObjects(String str, String str2) {
        RealmFieldType realmFieldType;
        DynamicRealm dynamicRealm = (DynamicRealm) this.proxyState.getRealm$realm();
        dynamicRealm.checkIfValid();
        this.proxyState.getRow$realm().checkIfAttached();
        RealmObjectSchema realmObjectSchema = dynamicRealm.getSchema().get(str);
        if (realmObjectSchema == null) {
            throw new IllegalArgumentException(c.s("Class not found: ", str));
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Non-null 'srcFieldName' required.");
        }
        if (str2.contains(".")) {
            throw new IllegalArgumentException(MSG_LINK_QUERY_NOT_SUPPORTED);
        }
        RealmFieldType fieldType = realmObjectSchema.getFieldType(str2);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        if (fieldType == realmFieldType2 || fieldType == (realmFieldType = RealmFieldType.LIST)) {
            return RealmResults.createDynamicBacklinkResults(dynamicRealm, (UncheckedRow) this.proxyState.getRow$realm(), realmObjectSchema.getTable(), str2);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %1$s. Field type should be either %2$s.%3$s or %2$s.%4$s.", fieldType.name(), "RealmFieldType", realmFieldType2.name(), realmFieldType.name()));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState realmGet$proxyState() {
        return this.proxyState;
    }

    public void set(String str, Object obj) {
        this.proxyState.getRealm$realm().checkIfValid();
        boolean z10 = obj instanceof String;
        String str2 = z10 ? (String) obj : null;
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
        if (z10 && columnType != RealmFieldType.STRING) {
            switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
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
                case 6:
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", str, obj));
                case 7:
                    obj = JsonUtils.stringToDate(str2);
                    break;
                case 8:
                    obj = Decimal128.g(str2);
                    break;
                case 9:
                    obj = new ObjectId(str2);
                    break;
                case 10:
                    obj = RealmAny.valueOf(str2);
                    break;
                case 11:
                    obj = UUID.fromString(str2);
                    break;
            }
        }
        if (obj == null) {
            setNull(str);
        } else {
            setValue(str, obj);
        }
    }

    public void setBlob(String str, byte[] bArr) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setBinaryByteArray(this.proxyState.getRow$realm().getColumnKey(str), bArr);
    }

    public void setBoolean(String str, boolean z10) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setBoolean(this.proxyState.getRow$realm().getColumnKey(str), z10);
    }

    public void setByte(String str, byte b5) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), b5);
    }

    public void setDate(String str, Date date) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (date == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setDate(columnKey, date);
        }
    }

    public void setDecimal128(String str, Decimal128 decimal128) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (decimal128 == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setDecimal128(columnKey, decimal128);
        }
    }

    public <E> void setDictionary(String str, RealmDictionary<E> realmDictionary) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmDictionary == null) {
            throw new IllegalArgumentException("Non-null 'dictionary' required");
        }
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
            case 17:
            case 18:
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                setValueDictionary(str, realmDictionary, columnType);
                return;
            case 25:
                setModelDictionary(str, realmDictionary);
                return;
            default:
                throw new IllegalArgumentException("Field '" + str + "' is not a dictionary but a " + columnType);
        }
    }

    public void setDouble(String str, double d5) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setDouble(this.proxyState.getRow$realm().getColumnKey(str), d5);
    }

    public void setFloat(String str, float f3) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setFloat(this.proxyState.getRow$realm().getColumnKey(str), f3);
    }

    public void setInt(String str, int i10) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), i10);
    }

    public <E> void setList(String str, RealmList<E> realmList) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmList == null) {
            throw new IllegalArgumentException("Non-null 'list' required");
        }
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
        int i10 = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()];
        if (i10 == 13) {
            if (!realmList.isEmpty()) {
                E eFirst = realmList.first();
                if (!(eFirst instanceof DynamicRealmObject) && RealmModel.class.isAssignableFrom(eFirst.getClass())) {
                    throw new IllegalArgumentException("RealmList must contain `DynamicRealmObject's, not Java model classes.");
                }
            }
            setModelList(str, realmList);
            return;
        }
        switch (i10) {
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                setValueList(str, realmList, columnType);
                return;
            default:
                throw new IllegalArgumentException("Field '" + str + "' is not a list but a " + columnType);
        }
    }

    public void setLong(String str, long j) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), j);
    }

    public void setNull(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (this.proxyState.getRow$realm().getColumnType(columnKey) == RealmFieldType.OBJECT) {
            this.proxyState.getRow$realm().nullifyLink(columnKey);
        } else {
            checkIsPrimaryKey(str);
            this.proxyState.getRow$realm().setNull(columnKey);
        }
    }

    public void setObject(String str, DynamicRealmObject dynamicRealmObject) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (dynamicRealmObject == null) {
            this.proxyState.getRow$realm().nullifyLink(columnKey);
            return;
        }
        if (dynamicRealmObject.proxyState.getRealm$realm() == null || dynamicRealmObject.proxyState.getRow$realm() == null) {
            throw new IllegalArgumentException("Cannot link to objects that are not part of the Realm.");
        }
        if (this.proxyState.getRealm$realm() != dynamicRealmObject.proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("Cannot add an object from another Realm instance.");
        }
        Table linkTarget = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey);
        Table table = dynamicRealmObject.proxyState.getRow$realm().getTable();
        if (linkTarget.hasSameSchema(table)) {
            this.proxyState.getRow$realm().setLink(columnKey, dynamicRealmObject.proxyState.getRow$realm().getObjectKey());
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException("Type of object is wrong. Was " + table.getName() + ", expected " + linkTarget.getName());
    }

    public void setObjectId(String str, ObjectId objectId) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (objectId == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setObjectId(columnKey, objectId);
        }
    }

    public void setRealmAny(String str, RealmAny realmAny) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (realmAny == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setRealmAny(columnKey, realmAny.getNativePtr());
        }
    }

    public <E> void setRealmSet(String str, RealmSet<E> realmSet) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmSet == null) {
            throw new IllegalArgumentException("Non-null 'set' required");
        }
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
                setValueSet(str, realmSet, columnType);
                return;
            case 36:
                setModelSet(str, realmSet);
                return;
            default:
                throw new IllegalArgumentException("Field '" + str + "' is not a set but a " + columnType);
        }
    }

    public void setShort(String str, short s10) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), s10);
    }

    public void setString(String str, String str2) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setString(this.proxyState.getRow$realm().getColumnKey(str), str2);
    }

    public void setUUID(String str, UUID uuid) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (uuid == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setUUID(columnKey, uuid);
        }
    }

    public String toString() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (!this.proxyState.getRow$realm().isValid()) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder(p.z(this.proxyState.getRow$realm().getTable().getClassName(), " = dynamic["));
        for (String str : getFieldNames()) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(columnKey);
            sb.append("{");
            sb.append(str);
            sb.append(":");
            String str2 = "null";
            switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
                case 1:
                    Object objValueOf = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        objValueOf = Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(columnKey));
                    }
                    sb.append(objValueOf);
                    break;
                case 2:
                    Object objValueOf2 = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        objValueOf2 = Long.valueOf(this.proxyState.getRow$realm().getLong(columnKey));
                    }
                    sb.append(objValueOf2);
                    break;
                case 3:
                    Object objValueOf3 = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        objValueOf3 = Float.valueOf(this.proxyState.getRow$realm().getFloat(columnKey));
                    }
                    sb.append(objValueOf3);
                    break;
                case 4:
                    Object objValueOf4 = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        objValueOf4 = Double.valueOf(this.proxyState.getRow$realm().getDouble(columnKey));
                    }
                    sb.append(objValueOf4);
                    break;
                case 5:
                    sb.append(this.proxyState.getRow$realm().getString(columnKey));
                    break;
                case 6:
                    sb.append(Arrays.toString(this.proxyState.getRow$realm().getBinaryByteArray(columnKey)));
                    break;
                case 7:
                    Object date = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        date = this.proxyState.getRow$realm().getDate(columnKey);
                    }
                    sb.append(date);
                    break;
                case 8:
                    Object decimal128 = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        decimal128 = this.proxyState.getRow$realm().getDecimal128(columnKey);
                    }
                    sb.append(decimal128);
                    break;
                case 9:
                    Object objectId = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        objectId = this.proxyState.getRow$realm().getObjectId(columnKey);
                    }
                    sb.append(objectId);
                    break;
                case 10:
                    Object realmAny = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        realmAny = getRealmAny(columnKey);
                    }
                    sb.append(realmAny);
                    break;
                case 11:
                    Object uuid = str2;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        uuid = this.proxyState.getRow$realm().getUUID(columnKey);
                    }
                    sb.append(uuid);
                    break;
                case 12:
                    String className = str2;
                    if (!this.proxyState.getRow$realm().isNullLink(columnKey)) {
                        className = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName();
                    }
                    sb.append(className);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    String className2 = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName();
                    Locale locale = Locale.US;
                    sb.append("RealmList<" + className2 + ">[" + this.proxyState.getRow$realm().getModelList(columnKey).size() + "]");
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    Locale locale2 = Locale.US;
                    p.E("RealmDictionary<Long>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    Locale locale3 = Locale.US;
                    p.E("RealmDictionary<Boolean>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    Locale locale4 = Locale.US;
                    p.E("RealmDictionary<String>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 17:
                    Locale locale5 = Locale.US;
                    p.E("RealmDictionary<byte[]>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 18:
                    Locale locale6 = Locale.US;
                    p.E("RealmDictionary<Date>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    Locale locale7 = Locale.US;
                    p.E("RealmDictionary<Float>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 20:
                    Locale locale8 = Locale.US;
                    p.E("RealmDictionary<Double>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 21:
                    Locale locale9 = Locale.US;
                    p.E("RealmDictionary<Decimal128>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 22:
                    Locale locale10 = Locale.US;
                    p.E("RealmDictionary<ObjectId>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 23:
                    Locale locale11 = Locale.US;
                    p.E("RealmDictionary<UUID>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 24:
                    Locale locale12 = Locale.US;
                    p.E("RealmDictionary<RealmAny>[", this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size(), "]", sb);
                    break;
                case 25:
                    String className3 = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName();
                    Locale locale13 = Locale.US;
                    sb.append("RealmDictionary<" + className3 + ">[" + this.proxyState.getRow$realm().getModelMap(columnKey).size() + "]");
                    break;
                case 26:
                    Locale locale14 = Locale.US;
                    p.E("RealmSet<Long>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 27:
                    Locale locale15 = Locale.US;
                    p.E("RealmSet<Boolean>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 28:
                    Locale locale16 = Locale.US;
                    p.E("RealmSet<String>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 29:
                    Locale locale17 = Locale.US;
                    p.E("RealmSet<byte[]>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 30:
                    Locale locale18 = Locale.US;
                    p.E("RealmSet<Date>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 31:
                    Locale locale19 = Locale.US;
                    p.E("RealmSet<Float>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 32:
                    Locale locale20 = Locale.US;
                    p.E("RealmSet<Double>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 33:
                    Locale locale21 = Locale.US;
                    p.E("RealmSet<Decimal128>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 34:
                    Locale locale22 = Locale.US;
                    p.E("RealmSet<ObjectId>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 35:
                    Locale locale23 = Locale.US;
                    p.E("RealmSet<UUID>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 36:
                    String className4 = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName();
                    Locale locale24 = Locale.US;
                    sb.append("RealmSet<" + className4 + ">[" + this.proxyState.getRow$realm().getModelSet(columnKey).size() + "]");
                    break;
                case 37:
                    Locale locale25 = Locale.US;
                    p.E("RealmSet<RealmAny>[", this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size(), "]", sb);
                    break;
                case 38:
                default:
                    sb.append("?");
                    break;
                case 39:
                    Locale locale26 = Locale.US;
                    p.E("RealmList<Long>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 40:
                    Locale locale27 = Locale.US;
                    p.E("RealmList<Boolean>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 41:
                    Locale locale28 = Locale.US;
                    p.E("RealmList<String>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 42:
                    Locale locale29 = Locale.US;
                    p.E("RealmList<byte[]>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 43:
                    Locale locale30 = Locale.US;
                    p.E("RealmList<Date>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 44:
                    Locale locale31 = Locale.US;
                    p.E("RealmList<Float>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 45:
                    Locale locale32 = Locale.US;
                    p.E("RealmList<Double>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 46:
                    Locale locale33 = Locale.US;
                    p.E("RealmList<Decimal128>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 47:
                    Locale locale34 = Locale.US;
                    p.E("RealmList<ObjectId>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 48:
                    Locale locale35 = Locale.US;
                    p.E("RealmList<UUID>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
                case 49:
                    Locale locale36 = Locale.US;
                    p.E("RealmList<RealmAny>[", this.proxyState.getRow$realm().getValueList(columnKey, columnType).size(), "]", sb);
                    break;
            }
            sb.append("},");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        sb.append("]");
        return sb.toString();
    }

    private RealmAny getRealmAny(long j) {
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getNativeRealmAny(j)));
    }

    public <E> RealmDictionary<E> getDictionary(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType realmFieldTypePrimitiveTypeToRealmFieldType = primitiveTypeToRealmFieldType(CollectionType.DICTIONARY, cls);
            try {
                return new RealmDictionary<>(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getValueMap(columnKey, realmFieldTypePrimitiveTypeToRealmFieldType), cls);
            } catch (IllegalArgumentException e10) {
                checkFieldType(str, columnKey, realmFieldTypePrimitiveTypeToRealmFieldType);
                throw e10;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }

    public <E> RealmList<E> getList(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType realmFieldTypePrimitiveTypeToRealmFieldType = primitiveTypeToRealmFieldType(CollectionType.LIST, cls);
            try {
                return new RealmList<>(cls, this.proxyState.getRow$realm().getValueList(columnKey, realmFieldTypePrimitiveTypeToRealmFieldType), this.proxyState.getRealm$realm());
            } catch (IllegalArgumentException e10) {
                checkFieldType(str, columnKey, realmFieldTypePrimitiveTypeToRealmFieldType);
                throw e10;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }

    public <E> RealmSet<E> getRealmSet(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType realmFieldTypePrimitiveTypeToRealmFieldType = primitiveTypeToRealmFieldType(CollectionType.SET, cls);
            try {
                return new RealmSet<>(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getValueSet(columnKey, realmFieldTypePrimitiveTypeToRealmFieldType), cls);
            } catch (IllegalArgumentException e10) {
                checkFieldType(str, columnKey, realmFieldTypePrimitiveTypeToRealmFieldType);
                throw e10;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }

    public DynamicRealmObject(BaseRealm baseRealm, Row row) {
        ProxyState<DynamicRealmObject> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(baseRealm);
        proxyState.setRow$realm(row);
        proxyState.setConstructionFinished();
    }
}
