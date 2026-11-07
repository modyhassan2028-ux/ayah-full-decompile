package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0736j;
import io.realm.RealmFieldTypeConstants;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0907y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0879t f14510a;

    public C0907y2(W2 w9, W2 w10) {
        this.f14510a = new C0879t(w9, w10);
    }

    public static void a(C0788a2 c0788a2, C0879t c0879t, Object obj, Object obj2) throws C0736j {
        C0803d2.b(c0788a2, (W2) c0879t.f14408a, 1, obj);
        C0803d2.b(c0788a2, (W2) c0879t.f14409b, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189  */
    /* JADX WARN: Code duplicated, block: B:58:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    public static int b(C0879t c0879t, Object obj, Object obj2) {
        int iF0;
        int iD;
        int iW0;
        int i10;
        int iW1;
        int iD2;
        int iW2;
        W2 w9 = (W2) c0879t.f14408a;
        W2 w10 = (W2) c0879t.f14409b;
        int i11 = C0803d2.f14224c;
        int iF1 = 8;
        int iW3 = C0788a2.w0(8);
        W2 w11 = W2.f14156u;
        if (w9 == w11) {
            Charset charset = AbstractC0863p2.f14382a;
            iW3 += iW3;
        }
        X2 x9 = X2.f14164r;
        switch (w9.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iF0 = 8;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset2 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iF0 = 4;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset3 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iF0 = C0788a2.f0(((Long) obj).longValue());
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset4 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iF0 = C0788a2.f0(((Long) obj).longValue());
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset5 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iF0 = C0788a2.f0(((Integer) obj).intValue());
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset6 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iF0 = 8;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset7 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iF0 = 4;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset8 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iF0 = 1;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset9 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof Z1) {
                    iD = ((Z1) obj).d();
                    iW0 = C0788a2.w0(iD);
                    iF0 = iD + iW0;
                } else {
                    iF0 = C0788a2.g0((String) obj);
                }
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset10 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iF0 = ((AbstractC0828i2) ((T1) obj)).k();
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset11 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iD = ((AbstractC0828i2) ((T1) obj)).k();
                iW0 = C0788a2.w0(iD);
                iF0 = iD + iW0;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset12 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof Z1) {
                    iD = ((Z1) obj).d();
                    iW0 = C0788a2.w0(iD);
                } else {
                    iD = ((byte[]) obj).length;
                    iW0 = C0788a2.w0(iD);
                }
                iF0 = iD + iW0;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset13 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iF0 = C0788a2.w0(((Integer) obj).intValue());
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset14 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                iF0 = obj instanceof InterfaceC0838k2 ? C0788a2.f0(((InterfaceC0838k2) obj).a()) : C0788a2.f0(((Integer) obj).intValue());
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset15 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                ((Integer) obj).getClass();
                iF0 = 4;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset16 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ((Long) obj).getClass();
                iF0 = 8;
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset17 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int iIntValue17 = ((Integer) obj).intValue();
                iF0 = C0788a2.w0((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset18 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iF0 = C0788a2.f0((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i10 = iF0 + iW3;
                iW1 = C0788a2.w0(16);
                if (w10 == w11) {
                    Charset charset19 = AbstractC0863p2.f14382a;
                    iW1 += iW1;
                }
                switch (w10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 2:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 3:
                        iF1 = C0788a2.f0(((Long) obj2).longValue());
                        return iF1 + iW1 + i10;
                    case 4:
                        iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iF1 = 1;
                        return iF1 + iW1 + i10;
                    case 8:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                            iF1 = iW2 + iD2;
                        } else {
                            iF1 = C0788a2.g0((String) obj2);
                        }
                        return iF1 + iW1 + i10;
                    case 9:
                        iF1 = ((AbstractC0828i2) ((T1) obj2)).k();
                        return iF1 + iW1 + i10;
                    case 10:
                        iD2 = ((AbstractC0828i2) ((T1) obj2)).k();
                        iW2 = C0788a2.w0(iD2);
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 11:
                        if (obj2 instanceof Z1) {
                            iD2 = ((Z1) obj2).d();
                            iW2 = C0788a2.w0(iD2);
                        } else {
                            iD2 = ((byte[]) obj2).length;
                            iW2 = C0788a2.w0(iD2);
                        }
                        iF1 = iW2 + iD2;
                        return iF1 + iW1 + i10;
                    case 12:
                        iF1 = C0788a2.w0(((Integer) obj2).intValue());
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (obj2 instanceof InterfaceC0838k2) {
                            iF1 = C0788a2.f0(((InterfaceC0838k2) obj2).a());
                        } else {
                            iF1 = C0788a2.f0(((Integer) obj2).intValue());
                        }
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        ((Integer) obj2).getClass();
                        iF1 = 4;
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        ((Long) obj2).getClass();
                        return iF1 + iW1 + i10;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iF1 = C0788a2.w0((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iF1 + iW1 + i10;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iF1 = C0788a2.f0((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iF1 + iW1 + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
