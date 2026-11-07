package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.RealmFieldTypeConstants;
import java.util.Locale;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class Property implements NativeObject {
    public static final boolean INDEXED = true;
    public static final boolean PRIMARY_KEY = true;
    public static final boolean REQUIRED = true;
    public static final int TYPE_ARRAY = 128;
    public static final int TYPE_BOOL = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_DATE = 4;
    public static final int TYPE_DECIMAL128 = 11;
    public static final int TYPE_DICTIONARY = 512;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 0;
    public static final int TYPE_LINKING_OBJECTS = 8;
    public static final int TYPE_MIXED = 9;
    public static final int TYPE_NULLABLE = 64;
    public static final int TYPE_OBJECT = 7;
    public static final int TYPE_OBJECT_ID = 10;
    public static final int TYPE_REQUIRED = 0;
    public static final int TYPE_SET = 256;
    public static final int TYPE_STRING = 2;
    public static final int TYPE_UUID = 12;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private long nativePtr;

    /* JADX INFO: renamed from: io.realm.internal.Property$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            $SwitchMap$io$realm$RealmFieldType = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LINKING_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_LIST.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_LIST.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BOOLEAN_SET.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.STRING_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.INTEGER_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.FLOAT_SET.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DOUBLE_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.BINARY_SET.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DECIMAL128_SET.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.OBJECT_ID_SET.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.UUID_SET.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.LINK_SET.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.MIXED_SET.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    public Property(long j) {
        this.nativePtr = j;
        NativeContext.dummyContext.addReference(this);
    }

    public static int convertFromRealmFieldType(RealmFieldType realmFieldType, boolean z10) {
        int i10;
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 1:
                return 71;
            case 2:
                return 135;
            case 3:
                return 136;
            case 4:
                i10 = 0;
                break;
            case 5:
                i10 = 1;
                break;
            case 6:
                i10 = 2;
                break;
            case 7:
                i10 = 3;
                break;
            case 8:
                i10 = 4;
                break;
            case 9:
                i10 = 5;
                break;
            case 10:
                i10 = 11;
                break;
            case 11:
                i10 = 10;
                break;
            case 12:
                i10 = 12;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                i10 = 9;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                i10 = 6;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                i10 = 128;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                i10 = 129;
                break;
            case 17:
                i10 = 130;
                break;
            case 18:
                i10 = 131;
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                i10 = 132;
                break;
            case 20:
                i10 = 133;
                break;
            case 21:
                i10 = 139;
                break;
            case 22:
                i10 = 138;
                break;
            case 23:
                i10 = 140;
                break;
            case 24:
                i10 = 134;
                break;
            case 25:
                i10 = 137;
                break;
            case 26:
                i10 = 521;
                break;
            case 27:
                i10 = 513;
                break;
            case 28:
                i10 = 514;
                break;
            case 29:
                i10 = 512;
                break;
            case 30:
                i10 = 517;
                break;
            case 31:
                i10 = 518;
                break;
            case 32:
                i10 = 515;
                break;
            case 33:
                i10 = 516;
                break;
            case 34:
                i10 = 523;
                break;
            case 35:
                i10 = 522;
                break;
            case 36:
                i10 = 524;
                break;
            case 37:
                i10 = 519;
                break;
            case 38:
                i10 = 257;
                break;
            case 39:
                i10 = 258;
                break;
            case 40:
                i10 = 256;
                break;
            case 41:
                i10 = 261;
                break;
            case 42:
                i10 = 262;
                break;
            case 43:
                i10 = 259;
                break;
            case 44:
                i10 = 260;
                break;
            case 45:
                i10 = 267;
                break;
            case 46:
                i10 = 266;
                break;
            case 47:
                i10 = 268;
                break;
            case 48:
                return 263;
            case 49:
                i10 = 265;
                break;
            default:
                Locale locale = Locale.US;
                throw new IllegalArgumentException(a.D("Unsupported filed type: '", realmFieldType.name(), "'."));
        }
        return i10 | (z10 ? 0 : 64);
    }

    private static RealmFieldType convertToRealmFieldType(int i10) {
        int i11 = i10 & (-65);
        switch (i11) {
            case 0:
                return RealmFieldType.INTEGER;
            case 1:
                return RealmFieldType.BOOLEAN;
            case 2:
                return RealmFieldType.STRING;
            case 3:
                return RealmFieldType.BINARY;
            case 4:
                return RealmFieldType.DATE;
            case 5:
                return RealmFieldType.FLOAT;
            case 6:
                return RealmFieldType.DOUBLE;
            case 7:
                return RealmFieldType.OBJECT;
            default:
                switch (i11) {
                    case 9:
                        return RealmFieldType.MIXED;
                    case 10:
                        return RealmFieldType.OBJECT_ID;
                    case 11:
                        return RealmFieldType.DECIMAL128;
                    case 12:
                        return RealmFieldType.UUID;
                    default:
                        switch (i11) {
                            case 128:
                                return RealmFieldType.INTEGER_LIST;
                            case 129:
                                return RealmFieldType.BOOLEAN_LIST;
                            case 130:
                                return RealmFieldType.STRING_LIST;
                            case 131:
                                return RealmFieldType.BINARY_LIST;
                            case 132:
                                return RealmFieldType.DATE_LIST;
                            case 133:
                                return RealmFieldType.FLOAT_LIST;
                            case 134:
                                return RealmFieldType.DOUBLE_LIST;
                            case 135:
                                return RealmFieldType.LIST;
                            case 136:
                                return RealmFieldType.LINKING_OBJECTS;
                            case 137:
                                return RealmFieldType.MIXED_LIST;
                            case 138:
                                return RealmFieldType.OBJECT_ID_LIST;
                            case 139:
                                return RealmFieldType.DECIMAL128_LIST;
                            case 140:
                                return RealmFieldType.UUID_LIST;
                            default:
                                switch (i11) {
                                    case 256:
                                        return RealmFieldType.INTEGER_SET;
                                    case 257:
                                        return RealmFieldType.BOOLEAN_SET;
                                    case 258:
                                        return RealmFieldType.STRING_SET;
                                    case 259:
                                        return RealmFieldType.BINARY_SET;
                                    case 260:
                                        return RealmFieldType.DATE_SET;
                                    case 261:
                                        return RealmFieldType.FLOAT_SET;
                                    case 262:
                                        return RealmFieldType.DOUBLE_SET;
                                    case 263:
                                        return RealmFieldType.LINK_SET;
                                    default:
                                        switch (i11) {
                                            case 265:
                                                return RealmFieldType.MIXED_SET;
                                            case 266:
                                                return RealmFieldType.OBJECT_ID_SET;
                                            case 267:
                                                return RealmFieldType.DECIMAL128_SET;
                                            case 268:
                                                return RealmFieldType.UUID_SET;
                                            default:
                                                switch (i11) {
                                                    case 512:
                                                        return RealmFieldType.STRING_TO_INTEGER_MAP;
                                                    case 513:
                                                        return RealmFieldType.STRING_TO_BOOLEAN_MAP;
                                                    case 514:
                                                        return RealmFieldType.STRING_TO_STRING_MAP;
                                                    case 515:
                                                        return RealmFieldType.STRING_TO_BINARY_MAP;
                                                    case 516:
                                                        return RealmFieldType.STRING_TO_DATE_MAP;
                                                    case 517:
                                                        return RealmFieldType.STRING_TO_FLOAT_MAP;
                                                    case 518:
                                                        return RealmFieldType.STRING_TO_DOUBLE_MAP;
                                                    case 519:
                                                        return RealmFieldType.STRING_TO_LINK_MAP;
                                                    default:
                                                        switch (i11) {
                                                            case 521:
                                                                return RealmFieldType.STRING_TO_MIXED_MAP;
                                                            case 522:
                                                                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
                                                            case 523:
                                                                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
                                                            case 524:
                                                                return RealmFieldType.STRING_TO_UUID_MAP;
                                                            default:
                                                                Locale locale = Locale.US;
                                                                throw new IllegalArgumentException(a.B(i10, "Unsupported property type: '", "'"));
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static native long nativeCreateComputedLinkProperty(String str, String str2, String str3);

    public static native long nativeCreatePersistedLinkProperty(String str, String str2, int i10, String str3);

    public static native long nativeCreatePersistedProperty(String str, String str2, int i10, boolean z10, boolean z11);

    private static native long nativeGetColumnKey(long j);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetLinkedObjectName(long j);

    private static native int nativeGetType(long j);

    public long getColumnKey() {
        return nativeGetColumnKey(this.nativePtr);
    }

    public String getLinkedObjectName() {
        return nativeGetLinkedObjectName(this.nativePtr);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public RealmFieldType getType() {
        return convertToRealmFieldType(nativeGetType(this.nativePtr));
    }
}
