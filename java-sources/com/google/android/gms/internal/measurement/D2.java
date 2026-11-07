package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0736j;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class D2 implements K2 {
    public static final int[] j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Unsafe f14006k = T2.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f14007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f14008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1 f14011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f14012f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0818g2 f14014i;

    public D2(int[] iArr, Object[] objArr, int i10, int i11, T1 t2, int[] iArr2, int i12, int i13, C0818g2 c0818g2, C0818g2 c0818g3) {
        this.f14007a = iArr;
        this.f14008b = objArr;
        this.f14009c = i10;
        this.f14010d = i11;
        this.f14012f = iArr2;
        this.g = i12;
        this.f14013h = i13;
        this.f14014i = c0818g2;
        this.f14011e = t2;
    }

    public static int F(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0828i2) {
            return ((AbstractC0828i2) obj).e();
        }
        return true;
    }

    public static int k(long j10, Object obj) {
        return ((Integer) T2.j(j10, obj)).intValue();
    }

    public static long l(long j10, Object obj) {
        return ((Long) T2.j(j10, obj)).longValue();
    }

    public static final int s(byte[] bArr, int i10, int i11, W2 w9, Class cls, W1 w10) throws C0872r2 {
        W2 w11 = W2.f14155t;
        switch (w9.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                w10.f14153c = Double.valueOf(Double.longBitsToDouble(B0.c.q0(i10, bArr)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                w10.f14153c = Float.valueOf(Float.intBitsToFloat(B0.c.p0(i10, bArr)));
                return i13;
            case 2:
            case 3:
                int iO0 = B0.c.o0(bArr, i10, w10);
                w10.f14153c = Long.valueOf(w10.f14152b);
                return iO0;
            case 4:
            case 12:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                int iM0 = B0.c.m0(bArr, i10, w10);
                w10.f14153c = Integer.valueOf(w10.f14151a);
                return iM0;
            case 5:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                int i14 = i10 + 8;
                w10.f14153c = Long.valueOf(B0.c.q0(i10, bArr));
                return i14;
            case 6:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                int i15 = i10 + 4;
                w10.f14153c = Integer.valueOf(B0.c.p0(i10, bArr));
                return i15;
            case 7:
                int iO1 = B0.c.o0(bArr, i10, w10);
                w10.f14153c = Boolean.valueOf(w10.f14152b != 0);
                return iO1;
            case 8:
                return B0.c.r0(bArr, i10, w10);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                K2 k2A = H2.f14042c.a(cls);
                AbstractC0828i2 abstractC0828i2A = k2A.a();
                int iT0 = B0.c.t0(abstractC0828i2A, k2A, bArr, i10, i11, w10);
                k2A.b(abstractC0828i2A);
                w10.f14153c = abstractC0828i2A;
                return iT0;
            case 11:
                return B0.c.s0(bArr, i10, w10);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int iM1 = B0.c.m0(bArr, i10, w10);
                w10.f14153c = Integer.valueOf(F9.n.X(w10.f14151a));
                return iM1;
            case 17:
                int iO2 = B0.c.o0(bArr, i10, w10);
                w10.f14153c = Long.valueOf(F9.n.Y(w10.f14152b));
                return iO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0274  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:129:0x0290  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:171:0x035d  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5  */
    public static D2 u(J2 j10, C0818g2 c0818g2, C0818g2 c0818g3) {
        int i10;
        int iCharAt;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Field fieldV;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field fieldV2;
        int i37;
        Object obj2;
        Field fieldV3;
        int i38;
        char cCharAt10;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(j10 instanceof J2)) {
            j10.getClass();
            throw new ClassCastException();
        }
        String str = j10.f14059b;
        int length = str.length();
        int i42 = 55296;
        if (str.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i10 = i43 + 1;
                if (str.charAt(i43) < 55296) {
                    break;
                }
                i43 = i10;
            }
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int iCharAt2 = str.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i45 = iCharAt2 & 8191;
            int i46 = 13;
            while (true) {
                i41 = i44 + 1;
                cCharAt13 = str.charAt(i44);
                if (cCharAt13 < 55296) {
                    break;
                }
                i45 |= (cCharAt13 & 8191) << i46;
                i46 += 13;
                i44 = i41;
            }
            iCharAt2 = i45 | (cCharAt13 << i46);
            i44 = i41;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i15 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i16 = 0;
            iArr = j;
            i11 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt3 = str.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i24 = i47 + 1;
                    cCharAt8 = str.charAt(i47);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i24;
                }
                iCharAt3 = i48 | (cCharAt8 << i49);
                i47 = i24;
            }
            int i50 = i47 + 1;
            int iCharAt4 = str.charAt(i47);
            if (iCharAt4 >= 55296) {
                int i51 = iCharAt4 & 8191;
                int i52 = 13;
                while (true) {
                    i23 = i50 + 1;
                    cCharAt7 = str.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i23;
                }
                iCharAt4 = i51 | (cCharAt7 << i52);
                i50 = i23;
            }
            int i53 = i50 + 1;
            int iCharAt5 = str.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i22 = i53 + 1;
                    cCharAt6 = str.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i22;
                }
                iCharAt5 = i54 | (cCharAt6 << i55);
                i53 = i22;
            }
            int i56 = i53 + 1;
            int iCharAt6 = str.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i21 = i56 + 1;
                    cCharAt5 = str.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i21;
                }
                iCharAt6 = i57 | (cCharAt5 << i58);
                i56 = i21;
            }
            int i59 = i56 + 1;
            iCharAt = str.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i20 = i59 + 1;
                    cCharAt4 = str.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i20;
                }
                iCharAt = i60 | (cCharAt4 << i61);
                i59 = i20;
            }
            int i62 = i59 + 1;
            int iCharAt7 = str.charAt(i59);
            if (iCharAt7 >= 55296) {
                int i63 = iCharAt7 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    cCharAt3 = str.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                iCharAt7 = i63 | (cCharAt3 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            int iCharAt8 = str.charAt(i62);
            if (iCharAt8 >= 55296) {
                int i66 = iCharAt8 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    cCharAt2 = str.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                iCharAt8 = i66 | (cCharAt2 << i67);
                i65 = i18;
            }
            int i68 = i65 + 1;
            int iCharAt9 = str.charAt(i65);
            if (iCharAt9 >= 55296) {
                int i69 = iCharAt9 & 8191;
                int i70 = 13;
                while (true) {
                    i17 = i68 + 1;
                    cCharAt = str.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i69 |= (cCharAt & 8191) << i70;
                    i70 += 13;
                    i68 = i17;
                }
                iCharAt9 = i69 | (cCharAt << i70);
                i68 = i17;
            }
            int i71 = iCharAt3 + iCharAt3 + iCharAt4;
            i11 = iCharAt3;
            i44 = i68;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i72 = iCharAt7;
            i12 = iCharAt5;
            i13 = i72;
            i14 = iCharAt6;
            i15 = i71;
            i16 = iCharAt9;
        }
        Unsafe unsafe = f14006k;
        Object[] objArr2 = j10.f14060c;
        Class<?> cls = j10.f14058a.getClass();
        int i73 = i16 + i13;
        int i74 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i74];
        int i75 = i73;
        int i76 = i16;
        int i77 = 0;
        int i78 = 0;
        while (i44 < length) {
            int i79 = i44 + 1;
            int iCharAt10 = str.charAt(i44);
            if (iCharAt10 >= i42) {
                int i80 = iCharAt10 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i40 = i81 + 1;
                    cCharAt12 = str.charAt(i81);
                    i25 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i40;
                    length = i25;
                }
                iCharAt10 = i80 | (cCharAt12 << i82);
                i26 = i40;
            } else {
                i25 = length;
                i26 = i79;
            }
            int i83 = i26 + 1;
            int iCharAt11 = str.charAt(i26);
            Object[] objArr4 = objArr2;
            char c10 = 55296;
            if (iCharAt11 >= 55296) {
                int i84 = iCharAt11 & 8191;
                int i85 = 13;
                while (true) {
                    i39 = i83 + 1;
                    cCharAt11 = str.charAt(i83);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i85;
                    i85 += 13;
                    i83 = i39;
                    c10 = 55296;
                }
                iCharAt11 = i84 | (cCharAt11 << i85);
                i83 = i39;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            int i86 = iCharAt11 & 255;
            int i87 = iCharAt10;
            int i88 = iCharAt11 & 2048;
            if (i86 >= 51) {
                int i89 = i83 + 1;
                int iCharAt12 = str.charAt(i83);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i90 = iCharAt12 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i38 = i91 + 1;
                        cCharAt10 = str.charAt(i91);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i90 |= (cCharAt10 & 8191) << i92;
                        i92 += 13;
                        i91 = i38;
                        c11 = 55296;
                    }
                    iCharAt12 = i90 | (cCharAt10 << i92);
                    i33 = i38;
                } else {
                    i33 = i89;
                }
                int i93 = i33;
                int i94 = i86 - 51;
                int i95 = iCharAt12;
                if (i94 == 9 || i94 == 17) {
                    i34 = i15 + 1;
                    int i96 = i78 / 3;
                    objArr3[i96 + i96 + 1] = objArr4[i15];
                } else {
                    if (i94 != 12) {
                        i35 = i88;
                    } else if (j10.a() == 1 || i88 != 0) {
                        i34 = i15 + 1;
                        int i97 = i78 / 3;
                        objArr3[i97 + i97 + 1] = objArr4[i15];
                    } else {
                        i35 = 0;
                    }
                    i36 = i95 + i95;
                    i88 = i35;
                    obj = objArr4[i36];
                    if (obj instanceof Field) {
                        fieldV2 = (Field) obj;
                    } else {
                        fieldV2 = v(cls, (String) obj);
                        objArr4[i36] = fieldV2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV2);
                    i37 = i36 + 1;
                    obj2 = objArr4[i37];
                    if (obj2 instanceof Field) {
                        fieldV3 = (Field) obj2;
                    } else {
                        fieldV3 = v(cls, (String) obj2);
                        objArr4[i37] = fieldV3;
                    }
                    i28 = i93;
                    i31 = iObjectFieldOffset3;
                    i27 = 55296;
                    objArr = objArr3;
                    i11 = i11;
                    cls = cls;
                    i30 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV3);
                }
                i15 = i34;
                i35 = i88;
                i36 = i95 + i95;
                i88 = i35;
                obj = objArr4[i36];
                if (obj instanceof Field) {
                    fieldV2 = (Field) obj;
                } else {
                    fieldV2 = v(cls, (String) obj);
                    objArr4[i36] = fieldV2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldV2);
                i37 = i36 + 1;
                obj2 = objArr4[i37];
                if (obj2 instanceof Field) {
                    fieldV3 = (Field) obj2;
                } else {
                    fieldV3 = v(cls, (String) obj2);
                    objArr4[i37] = fieldV3;
                }
                i28 = i93;
                i31 = iObjectFieldOffset4;
                i27 = 55296;
                objArr = objArr3;
                i11 = i11;
                cls = cls;
                i30 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV3);
            } else {
                int i98 = i15 + 1;
                Field fieldV4 = v(cls, (String) objArr4[i15]);
                objArr = objArr3;
                if (i86 == 9 || i86 == 17) {
                    int i99 = i78 / 3;
                    objArr[i99 + i99 + 1] = fieldV4.getType();
                } else {
                    if (i86 != 27) {
                        if (i86 == 49) {
                            i15 += 2;
                            i32 = 1;
                        } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                            i11 = i11;
                            if (j10.a() == 1 || i88 != 0) {
                                i15 += 2;
                                int i100 = i78 / 3;
                                objArr[i100 + i100 + 1] = objArr4[i98];
                                cls = cls;
                            } else {
                                cls = cls;
                                i15 = i98;
                                i88 = 0;
                            }
                        } else if (i86 == 50) {
                            int i101 = i15 + 2;
                            i76++;
                            iArr[i76] = i78;
                            int i102 = i78 / 3;
                            int i103 = i102 + i102;
                            objArr[i103] = objArr4[i98];
                            if (i88 != 0) {
                                i15 += 3;
                                objArr[i103 + 1] = objArr4[i101];
                            } else {
                                i15 = i101;
                                i88 = 0;
                            }
                            i11 = i11;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i86 > 17) {
                            i27 = 55296;
                            i28 = i83;
                            i29 = 0;
                        } else {
                            int i104 = i83 + 1;
                            int iCharAt13 = str.charAt(i83);
                            if (iCharAt13 >= 55296) {
                                int i105 = iCharAt13 & 8191;
                                int i106 = 13;
                                while (true) {
                                    i28 = i104 + 1;
                                    cCharAt9 = str.charAt(i104);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i105 |= (cCharAt9 & 8191) << i106;
                                    i106 += 13;
                                    i104 = i28;
                                }
                                iCharAt13 = i105 | (cCharAt9 << i106);
                            } else {
                                i28 = i104;
                            }
                            int i107 = (iCharAt13 / 32) + i11 + i11;
                            Object obj3 = objArr4[i107];
                            if (obj3 instanceof Field) {
                                fieldV = (Field) obj3;
                            } else {
                                fieldV = v(cls, (String) obj3);
                                objArr4[i107] = fieldV;
                            }
                            i29 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV);
                            i27 = 55296;
                        }
                        if (i86 >= 18 && i86 <= 49) {
                            iArr[i75] = iObjectFieldOffset;
                            i75++;
                        }
                        i30 = i29;
                        i31 = iObjectFieldOffset;
                    } else {
                        i32 = 1;
                        i15 += 2;
                    }
                    int i108 = i78 / 3;
                    objArr[i108 + i108 + i32] = objArr4[i98];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i27 = 55296;
                        i28 = i83;
                        i29 = 0;
                    } else {
                        i27 = 55296;
                        i28 = i83;
                        i29 = 0;
                    }
                    if (i86 >= 18) {
                        iArr[i75] = iObjectFieldOffset;
                        i75++;
                    }
                    i30 = i29;
                    i31 = iObjectFieldOffset;
                }
                cls = cls;
                i15 = i98;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i27 = 55296;
                    i28 = i83;
                    i29 = 0;
                } else {
                    i27 = 55296;
                    i28 = i83;
                    i29 = 0;
                }
                if (i86 >= 18) {
                    iArr[i75] = iObjectFieldOffset;
                    i75++;
                }
                i30 = i29;
                i31 = iObjectFieldOffset;
            }
            int i109 = i88;
            int i110 = i78 + 1;
            iArr2[i78] = i87;
            int i111 = i78 + 2;
            String str2 = str;
            iArr2[i110] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i109 != 0 ? Integer.MIN_VALUE : 0) | (i86 << 20) | i31;
            i78 += 3;
            iArr2[i111] = (i30 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr2 = objArr4;
            i42 = i27;
            length = i25;
            objArr3 = objArr;
            i11 = i11;
            i44 = i28;
            str = str2;
        }
        return new D2(iArr2, objArr3, i12, i14, j10.f14058a, iArr, i16, i73, c0818g2, c0818g3);
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            p245z2.a.I(sb, "Field ", str, " for ", name);
            throw new RuntimeException(android.support.v4.media.session.p.B(sb, " not found. Known fields are ", string), e10);
        }
    }

    public final Object A(int i10, Object obj) {
        K2 k2Y = y(i10);
        int iE = E(i10) & 1048575;
        if (!o(i10, obj)) {
            return k2Y.a();
        }
        Object object = f14006k.getObject(obj, iE);
        if (j(object)) {
            return object;
        }
        AbstractC0828i2 abstractC0828i2A = k2Y.a();
        if (object != null) {
            k2Y.d(abstractC0828i2A, object);
        }
        return abstractC0828i2A;
    }

    public final void B(int i10, Object obj, Object obj2) {
        f14006k.putObject(obj, E(i10) & 1048575, obj2);
        p(i10, obj);
    }

    public final Object C(int i10, int i11, Object obj) {
        K2 k2Y = y(i11);
        if (!q(i10, i11, obj)) {
            return k2Y.a();
        }
        Object object = f14006k.getObject(obj, E(i11) & 1048575);
        if (j(object)) {
            return object;
        }
        AbstractC0828i2 abstractC0828i2A = k2Y.a();
        if (object != null) {
            k2Y.d(abstractC0828i2A, object);
        }
        return abstractC0828i2A;
    }

    public final void D(int i10, int i11, Object obj, Object obj2) {
        f14006k.putObject(obj, E(i11) & 1048575, obj2);
        T2.g(obj, this.f14007a[i11 + 2] & 1048575, i10);
    }

    public final int E(int i10) {
        return this.f14007a[i10 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final AbstractC0828i2 a() {
        return (AbstractC0828i2) ((AbstractC0828i2) this.f14011e).o(4);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.K2
    public final void b(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof AbstractC0828i2) {
            AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) obj;
            abstractC0828i2.j();
            abstractC0828i2.zza = 0;
            abstractC0828i2.f();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14007a;
            if (i10 >= iArr.length) {
                this.f14014i.getClass();
                O2 o10 = ((AbstractC0828i2) obj).zzc;
                if (o10.f14096e) {
                    o10.f14096e = false;
                    return;
                }
                return;
            }
            int iE = E(i10);
            int i11 = 1048575 & iE;
            int iF = F(iE);
            long j10 = i11;
            if (iF != 9) {
                if (iF != 60 && iF != 68) {
                    switch (iF) {
                        case 17:
                            if (o(i10, obj)) {
                                y(i10).b(f14006k.getObject(obj, j10));
                            }
                            break;
                        case 18:
                        case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                        case 20:
                        case 21:
                        case 22:
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
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            U1 u8 = (U1) ((InterfaceC0858o2) T2.j(j10, obj));
                            if (u8.f14141r) {
                                u8.f14141r = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = f14006k;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((C0912z2) object).f14517r = false;
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (q(iArr[i10], i10, obj)) {
                    y(i10).b(f14006k.getObject(obj, j10));
                }
            } else if (o(i10, obj)) {
                y(i10).b(f14006k.getObject(obj, j10));
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final void c(Object obj, byte[] bArr, int i10, int i11, W1 w9) {
        t(obj, bArr, i10, i11, 0, w9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.measurement.K2
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!j(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14007a;
            if (i10 >= iArr.length) {
                L2.b(obj, obj2);
                return;
            }
            int iE = E(i10);
            int i11 = iE & 1048575;
            int iF = F(iE);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iF) {
                case 0:
                    if (!o(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        S2 s10 = T2.f14130c;
                        obj3 = obj;
                        s10.g(obj3, j10, s10.f(j10, obj2));
                        p(i10, obj3);
                    }
                    break;
                case 1:
                    if (o(i10, obj2)) {
                        S2 s11 = T2.f14130c;
                        s11.e(obj, j10, s11.d(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i10, obj2)) {
                        T2.i(obj, j10, T2.h(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i10, obj2)) {
                        T2.i(obj, j10, T2.h(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i10, obj2)) {
                        T2.g(obj, j10, T2.f(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i10, obj2)) {
                        T2.i(obj, j10, T2.h(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i10, obj2)) {
                        T2.g(obj, j10, T2.f(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i10, obj2)) {
                        S2 s12 = T2.f14130c;
                        s12.c(obj, j10, s12.b(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i10, obj2)) {
                        T2.k(j10, obj, T2.j(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i10, obj2)) {
                        T2.k(j10, obj, T2.j(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i10, obj2)) {
                        T2.g(obj, j10, T2.f(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i10, obj2)) {
                        T2.g(obj, j10, T2.f(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (o(i10, obj2)) {
                        T2.g(obj, j10, T2.f(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (o(i10, obj2)) {
                        T2.i(obj, j10, T2.h(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (o(i10, obj2)) {
                        T2.g(obj, j10, T2.f(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (o(i10, obj2)) {
                        T2.i(obj, j10, T2.h(j10, obj2));
                        p(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                case 20:
                case 21:
                case 22:
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
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    InterfaceC0858o2 interfaceC0858o2I = (InterfaceC0858o2) T2.j(j10, obj);
                    InterfaceC0858o2 interfaceC0858o2 = (InterfaceC0858o2) T2.j(j10, obj2);
                    int size = interfaceC0858o2I.size();
                    int size2 = interfaceC0858o2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((U1) interfaceC0858o2I).f14141r) {
                            interfaceC0858o2I = interfaceC0858o2I.i(size2 + size);
                        }
                        interfaceC0858o2I.addAll(interfaceC0858o2);
                    }
                    if (size > 0) {
                        interfaceC0858o2 = interfaceC0858o2I;
                    }
                    T2.k(j10, obj, interfaceC0858o2);
                    obj3 = obj;
                    break;
                case 50:
                    C0818g2 c0818g2 = L2.f14066a;
                    T2.k(j10, obj, C0818g2.c(T2.j(j10, obj), T2.j(j10, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i12, i10, obj2)) {
                        T2.k(j10, obj, T2.j(j10, obj2));
                        T2.g(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i12, i10, obj2)) {
                        T2.k(j10, obj, T2.j(j10, obj2));
                        T2.g(obj, iArr[i10 + 2] & 1048575, i12);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    x(i10, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i10 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7  */
    @Override // com.google.android.gms.internal.measurement.K2
    public final int e(T1 t2) {
        int i10;
        int iW0;
        int iF0;
        int iY;
        int i11;
        int iB;
        int iW1;
        int size;
        int iR;
        int iW2;
        int iW3;
        int iW4;
        int iB2;
        int iW5;
        int iF1;
        Unsafe unsafe = f14006k;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iO = 0;
        while (true) {
            int[] iArr = this.f14007a;
            if (i14 >= iArr.length) {
                return ((AbstractC0828i2) t2).zzc.c() + iO;
            }
            int iE = E(i14);
            int iF = F(iE);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iF <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(t2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iE & i12;
            if (iF >= EnumC0808e2.f14234s.f14238r) {
                EnumC0808e2.f14235t.getClass();
            }
            long j10 = i19;
            switch (iF) {
                case 0:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 8, iO);
                    }
                    break;
                case 1:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 4, iO);
                    }
                    break;
                case 2:
                    if (n(t2, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(t2, j10);
                        iW0 = C0788a2.w0(i16 << 3);
                        iF0 = C0788a2.f0(j11);
                        iY = iF0 + iW0;
                        iO += iY;
                    }
                    break;
                case 3:
                    if (n(t2, i14, i13, i15, i10)) {
                        long j12 = unsafe.getLong(t2, j10);
                        iW0 = C0788a2.w0(i16 << 3);
                        iF0 = C0788a2.f0(j12);
                        iY = iF0 + iW0;
                        iO += iY;
                    }
                    break;
                case 4:
                    if (n(t2, i14, i13, i15, i10)) {
                        long j13 = unsafe.getInt(t2, j10);
                        iW0 = C0788a2.w0(i16 << 3);
                        iF0 = C0788a2.f0(j13);
                        iY = iF0 + iW0;
                        iO += iY;
                    }
                    break;
                case 5:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 8, iO);
                    }
                    break;
                case 6:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 4, iO);
                    }
                    break;
                case 7:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 1, iO);
                    }
                    break;
                case 8:
                    if (n(t2, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(t2, j10);
                        if (object instanceof Z1) {
                            int iW6 = C0788a2.w0(i20);
                            int iD = ((Z1) object).d();
                            iO = android.support.v4.media.session.p.p(iD, iD, iW6, iO);
                        } else {
                            iW0 = C0788a2.w0(i20);
                            iF0 = C0788a2.g0((String) object);
                            iY = iF0 + iW0;
                            iO += iY;
                        }
                    }
                    break;
                case 9:
                    if (n(t2, i14, i13, i15, i10)) {
                        Object object2 = unsafe.getObject(t2, j10);
                        K2 k2Y = y(i14);
                        C0818g2 c0818g2 = L2.f14066a;
                        int iW7 = C0788a2.w0(i16 << 3);
                        int iB3 = ((T1) object2).b(k2Y);
                        iO = android.support.v4.media.session.p.p(iB3, iB3, iW7, iO);
                    }
                    break;
                case 10:
                    if (n(t2, i14, i13, i15, i10)) {
                        Z1 z10 = (Z1) unsafe.getObject(t2, j10);
                        int iW8 = C0788a2.w0(i16 << 3);
                        int iD2 = z10.d();
                        iO = android.support.v4.media.session.p.p(iD2, iD2, iW8, iO);
                    }
                    break;
                case 11:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(unsafe.getInt(t2, j10), C0788a2.w0(i16 << 3), iO);
                    }
                    break;
                case 12:
                    if (n(t2, i14, i13, i15, i10)) {
                        long j14 = unsafe.getInt(t2, j10);
                        iW0 = C0788a2.w0(i16 << 3);
                        iF0 = C0788a2.f0(j14);
                        iY = iF0 + iW0;
                        iO += iY;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 4, iO);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (n(t2, i14, i13, i15, i10)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 8, iO);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (n(t2, i14, i13, i15, i10)) {
                        int i21 = unsafe.getInt(t2, j10);
                        iO = android.support.v4.media.session.p.o((i21 >> 31) ^ (i21 + i21), C0788a2.w0(i16 << 3), iO);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (n(t2, i14, i13, i15, i10)) {
                        long j15 = unsafe.getLong(t2, j10);
                        iW0 = C0788a2.w0(i16 << 3);
                        iF0 = C0788a2.f0((j15 >> 63) ^ (j15 + j15));
                        iY = iF0 + iW0;
                        iO += iY;
                    }
                    break;
                case 17:
                    if (n(t2, i14, i13, i15, i10)) {
                        T1 t10 = (T1) unsafe.getObject(t2, j10);
                        K2 k2Y2 = y(i14);
                        int iW9 = C0788a2.w0(i16 << 3);
                        i11 = iW9 + iW9;
                        iB = t10.b(k2Y2);
                        iY = iB + i11;
                        iO += iY;
                    }
                    break;
                case 18:
                    iY = L2.y(i16, (List) unsafe.getObject(t2, j10));
                    iO += iY;
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    iY = L2.x(i16, (List) unsafe.getObject(t2, j10));
                    iO += iY;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g3 = L2.f14066a;
                    if (list.size() == 0) {
                        iW1 = 0;
                    } else {
                        iW1 = (C0788a2.w0(i16 << 3) * list.size()) + L2.q(list);
                    }
                    iO += iW1;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g4 = L2.f14066a;
                    size = list2.size();
                    if (size == 0) {
                        iW3 = 0;
                    } else {
                        iR = L2.r(list2);
                        iW2 = C0788a2.w0(i16 << 3);
                        iW3 = (iW2 * size) + iR;
                    }
                    iO += iW3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g5 = L2.f14066a;
                    size = list3.size();
                    if (size == 0) {
                        iW3 = 0;
                    } else {
                        iR = L2.u(list3);
                        iW2 = C0788a2.w0(i16 << 3);
                        iW3 = (iW2 * size) + iR;
                    }
                    iO += iW3;
                    break;
                case 23:
                    iY = L2.y(i16, (List) unsafe.getObject(t2, j10));
                    iO += iY;
                    break;
                case 24:
                    iY = L2.x(i16, (List) unsafe.getObject(t2, j10));
                    iO += iY;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g6 = L2.f14066a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iW1 = 0;
                    } else {
                        iW1 = (C0788a2.w0(i16 << 3) + 1) * size2;
                    }
                    iO += iW1;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g7 = L2.f14066a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iW3 = 0;
                    } else {
                        iW3 = C0788a2.w0(i16 << 3) * size3;
                        for (int i22 = 0; i22 < size3; i22++) {
                            Object obj = list5.get(i22);
                            if (obj instanceof Z1) {
                                int iD3 = ((Z1) obj).d();
                                iW3 = android.support.v4.media.session.p.o(iD3, iD3, iW3);
                            } else {
                                iW3 = C0788a2.g0((String) obj) + iW3;
                            }
                        }
                    }
                    iO += iW3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(t2, j10);
                    K2 k2Y3 = y(i14);
                    C0818g2 c0818g8 = L2.f14066a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iW4 = 0;
                    } else {
                        iW4 = C0788a2.w0(i16 << 3) * size4;
                        for (int i23 = 0; i23 < size4; i23++) {
                            int iB4 = ((T1) list6.get(i23)).b(k2Y3);
                            iW4 = android.support.v4.media.session.p.o(iB4, iB4, iW4);
                        }
                    }
                    iO += iW4;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g9 = L2.f14066a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iW3 = 0;
                    } else {
                        iW3 = C0788a2.w0(i16 << 3) * size5;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iD4 = ((Z1) list7.get(i24)).d();
                            iW3 = android.support.v4.media.session.p.o(iD4, iD4, iW3);
                        }
                    }
                    iO += iW3;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g10 = L2.f14066a;
                    size = list8.size();
                    if (size == 0) {
                        iW3 = 0;
                    } else {
                        iR = L2.v(list8);
                        iW2 = C0788a2.w0(i16 << 3);
                        iW3 = (iW2 * size) + iR;
                    }
                    iO += iW3;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g11 = L2.f14066a;
                    size = list9.size();
                    if (size == 0) {
                        iW3 = 0;
                    } else {
                        iR = L2.t(list9);
                        iW2 = C0788a2.w0(i16 << 3);
                        iW3 = (iW2 * size) + iR;
                    }
                    iO += iW3;
                    break;
                case 31:
                    iY = L2.x(i16, (List) unsafe.getObject(t2, j10));
                    iO += iY;
                    break;
                case 32:
                    iY = L2.y(i16, (List) unsafe.getObject(t2, j10));
                    iO += iY;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g12 = L2.f14066a;
                    size = list10.size();
                    if (size == 0) {
                        iW3 = 0;
                    } else {
                        iR = L2.w(list10);
                        iW2 = C0788a2.w0(i16 << 3);
                        iW3 = (iW2 * size) + iR;
                    }
                    iO += iW3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g13 = L2.f14066a;
                    size = list11.size();
                    if (size == 0) {
                        iW3 = 0;
                    } else {
                        iR = L2.s(list11);
                        iW2 = C0788a2.w0(i16 << 3);
                        iW3 = (iW2 * size) + iR;
                    }
                    iO += iW3;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g14 = L2.f14066a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iO = android.support.v4.media.session.p.p(size6, C0788a2.w0(i16 << 3), size6, iO);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g15 = L2.f14066a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iO = android.support.v4.media.session.p.p(size7, C0788a2.w0(i16 << 3), size7, iO);
                    }
                    break;
                case 37:
                    int iQ = L2.q((List) unsafe.getObject(t2, j10));
                    if (iQ > 0) {
                        iO = android.support.v4.media.session.p.p(iQ, C0788a2.w0(i16 << 3), iQ, iO);
                    }
                    break;
                case 38:
                    int iR2 = L2.r((List) unsafe.getObject(t2, j10));
                    if (iR2 > 0) {
                        iO = android.support.v4.media.session.p.p(iR2, C0788a2.w0(i16 << 3), iR2, iO);
                    }
                    break;
                case 39:
                    int iU = L2.u((List) unsafe.getObject(t2, j10));
                    if (iU > 0) {
                        iO = android.support.v4.media.session.p.p(iU, C0788a2.w0(i16 << 3), iU, iO);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g16 = L2.f14066a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iO = android.support.v4.media.session.p.p(size8, C0788a2.w0(i16 << 3), size8, iO);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g17 = L2.f14066a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iO = android.support.v4.media.session.p.p(size9, C0788a2.w0(i16 << 3), size9, iO);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g18 = L2.f14066a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iO = android.support.v4.media.session.p.p(size10, C0788a2.w0(i16 << 3), size10, iO);
                    }
                    break;
                case 43:
                    int iV = L2.v((List) unsafe.getObject(t2, j10));
                    if (iV > 0) {
                        iO = android.support.v4.media.session.p.p(iV, C0788a2.w0(i16 << 3), iV, iO);
                    }
                    break;
                case 44:
                    int iT = L2.t((List) unsafe.getObject(t2, j10));
                    if (iT > 0) {
                        iO = android.support.v4.media.session.p.p(iT, C0788a2.w0(i16 << 3), iT, iO);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g19 = L2.f14066a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iO = android.support.v4.media.session.p.p(size11, C0788a2.w0(i16 << 3), size11, iO);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(t2, j10);
                    C0818g2 c0818g20 = L2.f14066a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iO = android.support.v4.media.session.p.p(size12, C0788a2.w0(i16 << 3), size12, iO);
                    }
                    break;
                case 47:
                    int iW = L2.w((List) unsafe.getObject(t2, j10));
                    if (iW > 0) {
                        iO = android.support.v4.media.session.p.p(iW, C0788a2.w0(i16 << 3), iW, iO);
                    }
                    break;
                case 48:
                    int iS = L2.s((List) unsafe.getObject(t2, j10));
                    if (iS > 0) {
                        iO = android.support.v4.media.session.p.p(iS, C0788a2.w0(i16 << 3), iS, iO);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(t2, j10);
                    K2 k2Y4 = y(i14);
                    C0818g2 c0818g21 = L2.f14066a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iB2 = 0;
                    } else {
                        iB2 = 0;
                        for (int i25 = 0; i25 < size13; i25++) {
                            T1 t11 = (T1) list19.get(i25);
                            int iW10 = C0788a2.w0(i16 << 3);
                            iB2 += t11.b(k2Y4) + iW10 + iW10;
                        }
                    }
                    iO += iB2;
                    break;
                case 50:
                    int i26 = i14 / 3;
                    C0912z2 c0912z2 = (C0912z2) unsafe.getObject(t2, j10);
                    C0907y2 c0907y2 = (C0907y2) this.f14008b[i26 + i26];
                    if (c0912z2.isEmpty()) {
                        iW3 = 0;
                    } else {
                        iW3 = 0;
                        for (Map.Entry entry : c0912z2.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0879t c0879t = c0907y2.f14510a;
                            int iW11 = C0788a2.w0(i16 << 3);
                            int iB5 = C0907y2.b(c0879t, key, value);
                            iW3 = android.support.v4.media.session.p.p(iB5, iB5, iW11, iW3);
                        }
                    }
                    iO += iW3;
                    break;
                case 51:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 8, iO);
                    }
                    break;
                case 52:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 4, iO);
                    }
                    break;
                case 53:
                    if (q(i16, i14, t2)) {
                        long jL = l(j10, t2);
                        iW5 = C0788a2.w0(i16 << 3);
                        iF1 = C0788a2.f0(jL);
                        iO += iF1 + iW5;
                    }
                    break;
                case 54:
                    if (q(i16, i14, t2)) {
                        long jL2 = l(j10, t2);
                        iW5 = C0788a2.w0(i16 << 3);
                        iF1 = C0788a2.f0(jL2);
                        iO += iF1 + iW5;
                    }
                    break;
                case 55:
                    if (q(i16, i14, t2)) {
                        long jK = k(j10, t2);
                        iW5 = C0788a2.w0(i16 << 3);
                        iF1 = C0788a2.f0(jK);
                        iO += iF1 + iW5;
                    }
                    break;
                case 56:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 8, iO);
                    }
                    break;
                case 57:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 4, iO);
                    }
                    break;
                case 58:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 1, iO);
                    }
                    break;
                case 59:
                    if (q(i16, i14, t2)) {
                        int i27 = i16 << 3;
                        Object object3 = unsafe.getObject(t2, j10);
                        if (object3 instanceof Z1) {
                            int iW12 = C0788a2.w0(i27);
                            int iD5 = ((Z1) object3).d();
                            iO = android.support.v4.media.session.p.p(iD5, iD5, iW12, iO);
                        } else {
                            iW5 = C0788a2.w0(i27);
                            iF1 = C0788a2.g0((String) object3);
                            iO += iF1 + iW5;
                        }
                    }
                    break;
                case 60:
                    if (q(i16, i14, t2)) {
                        Object object4 = unsafe.getObject(t2, j10);
                        K2 k2Y5 = y(i14);
                        C0818g2 c0818g22 = L2.f14066a;
                        int iW13 = C0788a2.w0(i16 << 3);
                        int iB6 = ((T1) object4).b(k2Y5);
                        iO = android.support.v4.media.session.p.p(iB6, iB6, iW13, iO);
                    }
                    break;
                case 61:
                    if (q(i16, i14, t2)) {
                        Z1 z11 = (Z1) unsafe.getObject(t2, j10);
                        int iW14 = C0788a2.w0(i16 << 3);
                        int iD6 = z11.d();
                        iO = android.support.v4.media.session.p.p(iD6, iD6, iW14, iO);
                    }
                    break;
                case 62:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(k(j10, t2), C0788a2.w0(i16 << 3), iO);
                    }
                    break;
                case 63:
                    if (q(i16, i14, t2)) {
                        long jK2 = k(j10, t2);
                        iW5 = C0788a2.w0(i16 << 3);
                        iF1 = C0788a2.f0(jK2);
                        iO += iF1 + iW5;
                    }
                    break;
                case 64:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 4, iO);
                    }
                    break;
                case 65:
                    if (q(i16, i14, t2)) {
                        iO = android.support.v4.media.session.p.o(i16 << 3, 8, iO);
                    }
                    break;
                case 66:
                    if (q(i16, i14, t2)) {
                        int iK = k(j10, t2);
                        iO = android.support.v4.media.session.p.o((iK >> 31) ^ (iK + iK), C0788a2.w0(i16 << 3), iO);
                    }
                    break;
                case 67:
                    if (q(i16, i14, t2)) {
                        long jL3 = l(j10, t2);
                        iW5 = C0788a2.w0(i16 << 3);
                        iF1 = C0788a2.f0((jL3 >> 63) ^ (jL3 + jL3));
                        iO += iF1 + iW5;
                    }
                    break;
                case 68:
                    if (q(i16, i14, t2)) {
                        T1 t12 = (T1) unsafe.getObject(t2, j10);
                        K2 k2Y6 = y(i14);
                        int iW15 = C0788a2.w0(i16 << 3);
                        i11 = iW15 + iW15;
                        iB = t12.b(k2Y6);
                        iY = iB + i11;
                        iO += iY;
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.K2
    public final int f(AbstractC0828i2 abstractC0828i2) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f14007a;
            if (i14 >= iArr.length) {
                return abstractC0828i2.zzc.hashCode() + (i15 * 53);
            }
            int iE = E(i14);
            int i16 = 1048575 & iE;
            int iF = F(iE);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 1237;
            int iHashCode = 37;
            switch (iF) {
                case 0:
                    i10 = i15 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(T2.f14130c.f(j10, abstractC0828i2));
                    Charset charset = AbstractC0863p2.f14382a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    iFloatToIntBits = Float.floatToIntBits(T2.f14130c.d(j10, abstractC0828i2));
                    i15 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    jDoubleToLongBits = T2.h(j10, abstractC0828i2);
                    Charset charset2 = AbstractC0863p2.f14382a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    jDoubleToLongBits = T2.h(j10, abstractC0828i2);
                    Charset charset3 = AbstractC0863p2.f14382a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.f(j10, abstractC0828i2);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    jDoubleToLongBits = T2.h(j10, abstractC0828i2);
                    Charset charset4 = AbstractC0863p2.f14382a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.f(j10, abstractC0828i2);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean zB = T2.f14130c.b(j10, abstractC0828i2);
                    Charset charset5 = AbstractC0863p2.f14382a;
                    if (zB) {
                        i18 = 1231;
                    }
                    i15 = i18 + i12;
                    break;
                case 8:
                    i11 = i15 * 53;
                    iFloatToIntBits = ((String) T2.j(j10, abstractC0828i2)).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object objJ = T2.j(j10, abstractC0828i2);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i15 = i13 + iHashCode;
                    break;
                case 10:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.j(j10, abstractC0828i2).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.f(j10, abstractC0828i2);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.f(j10, abstractC0828i2);
                    i15 = iFloatToIntBits + i11;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.f(j10, abstractC0828i2);
                    i15 = iFloatToIntBits + i11;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    i10 = i15 * 53;
                    jDoubleToLongBits = T2.h(j10, abstractC0828i2);
                    Charset charset6 = AbstractC0863p2.f14382a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.f(j10, abstractC0828i2);
                    i15 = iFloatToIntBits + i11;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    i10 = i15 * 53;
                    jDoubleToLongBits = T2.h(j10, abstractC0828i2);
                    Charset charset7 = AbstractC0863p2.f14382a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object objJ2 = T2.j(j10, abstractC0828i2);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i15 = i13 + iHashCode;
                    break;
                case 18:
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                case 20:
                case 21:
                case 22:
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
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.j(j10, abstractC0828i2).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i15 * 53;
                    iFloatToIntBits = T2.j(j10, abstractC0828i2).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (q(i17, i14, abstractC0828i2)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) T2.j(j10, abstractC0828i2)).doubleValue());
                        Charset charset8 = AbstractC0863p2.f14382a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) T2.j(j10, abstractC0828i2)).floatValue());
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 53:
                    if (q(i17, i14, abstractC0828i2)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = l(j10, abstractC0828i2);
                        Charset charset9 = AbstractC0863p2.f14382a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (q(i17, i14, abstractC0828i2)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = l(j10, abstractC0828i2);
                        Charset charset10 = AbstractC0863p2.f14382a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, abstractC0828i2);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 56:
                    if (q(i17, i14, abstractC0828i2)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = l(j10, abstractC0828i2);
                        Charset charset11 = AbstractC0863p2.f14382a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, abstractC0828i2);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 58:
                    if (q(i17, i14, abstractC0828i2)) {
                        i12 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) T2.j(j10, abstractC0828i2)).booleanValue();
                        Charset charset12 = AbstractC0863p2.f14382a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i12;
                    }
                    break;
                case 59:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = ((String) T2.j(j10, abstractC0828i2)).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = T2.j(j10, abstractC0828i2).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 61:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = T2.j(j10, abstractC0828i2).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, abstractC0828i2);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 63:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, abstractC0828i2);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 64:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, abstractC0828i2);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 65:
                    if (q(i17, i14, abstractC0828i2)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = l(j10, abstractC0828i2);
                        Charset charset13 = AbstractC0863p2.f14382a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, abstractC0828i2);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 67:
                    if (q(i17, i14, abstractC0828i2)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = l(j10, abstractC0828i2);
                        Charset charset14 = AbstractC0863p2.f14382a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (q(i17, i14, abstractC0828i2)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = T2.j(j10, abstractC0828i2).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final void g(Object obj, C0902x2 c0902x2) throws C0736j {
        int i10;
        Unsafe unsafe = f14006k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.f14007a;
            if (i12 >= iArr.length) {
                ((AbstractC0828i2) obj).zzc.b(c0902x2);
                return;
            }
            int iE = E(i12);
            int iF = F(iE);
            int i15 = iArr[i12];
            if (iF <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iE & i11;
            switch (iF) {
                case 0:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).m0(Double.doubleToRawLongBits(T2.f14130c.f(j10, obj)), i15);
                    }
                    break;
                case 1:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).k0(i15, Float.floatToRawIntBits(T2.f14130c.d(j10, obj)));
                    }
                    break;
                case 2:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).l0(unsafe.getLong(obj, j10), i15);
                    }
                    break;
                case 3:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).l0(unsafe.getLong(obj, j10), i15);
                    }
                    break;
                case 4:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).i0(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).m0(unsafe.getLong(obj, j10), i15);
                    }
                    break;
                case 6:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).k0(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if (n(obj, i12, i14, i13, i10)) {
                        boolean zB = T2.f14130c.b(j10, obj);
                        C0788a2 c0788a2 = (C0788a2) c0902x2.f14509r;
                        c0788a2.q0(i15 << 3);
                        c0788a2.o0(zB ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 8:
                    if (n(obj, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            C0788a2 c0788a3 = (C0788a2) c0902x2.f14509r;
                            c0788a3.q0((i15 << 3) | 2);
                            c0788a3.v0((String) object);
                        } else {
                            C0788a2 c0788a4 = (C0788a2) c0902x2.f14509r;
                            c0788a4.q0((i15 << 3) | 2);
                            c0788a4.n0((Z1) object);
                        }
                    }
                    break;
                case 9:
                    if (n(obj, i12, i14, i13, i10)) {
                        c0902x2.d(i15, unsafe.getObject(obj, j10), y(i12));
                    }
                    break;
                case 10:
                    if (n(obj, i12, i14, i13, i10)) {
                        Z1 z10 = (Z1) unsafe.getObject(obj, j10);
                        C0788a2 c0788a5 = (C0788a2) c0902x2.f14509r;
                        c0788a5.q0((i15 << 3) | 2);
                        c0788a5.n0(z10);
                    }
                    break;
                case 11:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).j0(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).i0(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).k0(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (n(obj, i12, i14, i13, i10)) {
                        ((C0788a2) c0902x2.f14509r).m0(unsafe.getLong(obj, j10), i15);
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (n(obj, i12, i14, i13, i10)) {
                        int i18 = unsafe.getInt(obj, j10);
                        ((C0788a2) c0902x2.f14509r).j0(i15, (i18 >> 31) ^ (i18 + i18));
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (n(obj, i12, i14, i13, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((C0788a2) c0902x2.f14509r).l0((j11 >> 63) ^ (j11 + j11), i15);
                    }
                    break;
                case 17:
                    if (n(obj, i12, i14, i13, i10)) {
                        c0902x2.e(i15, unsafe.getObject(obj, j10), y(i12));
                    }
                    break;
                case 18:
                    L2.c(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    L2.d(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 20:
                    L2.e(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 21:
                    L2.f(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 22:
                    L2.j(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 23:
                    L2.h(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 24:
                    L2.m(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 25:
                    L2.p(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 26:
                    int i19 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j10);
                    C0818g2 c0818g2 = L2.f14066a;
                    if (list != null && !list.isEmpty()) {
                        c0902x2.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            C0788a2 c0788a6 = (C0788a2) c0902x2.f14509r;
                            String str = (String) list.get(i20);
                            c0788a6.q0((i19 << 3) | 2);
                            c0788a6.v0(str);
                        }
                    }
                    break;
                case 27:
                    int i21 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    K2 k2Y = y(i12);
                    C0818g2 c0818g3 = L2.f14066a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            c0902x2.d(i21, list2.get(i22), k2Y);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    C0818g2 c0818g4 = L2.f14066a;
                    if (list3 != null && !list3.isEmpty()) {
                        c0902x2.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            C0788a2 c0788a7 = (C0788a2) c0902x2.f14509r;
                            Z1 z11 = (Z1) list3.get(i24);
                            c0788a7.q0((i23 << 3) | 2);
                            c0788a7.n0(z11);
                        }
                    }
                    break;
                case 29:
                    L2.k(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 30:
                    L2.o(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 31:
                    L2.n(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 32:
                    L2.i(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 33:
                    L2.l(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 34:
                    L2.g(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, false);
                    break;
                case 35:
                    L2.c(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 36:
                    L2.d(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 37:
                    L2.e(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 38:
                    L2.f(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 39:
                    L2.j(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 40:
                    L2.h(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 41:
                    L2.m(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 42:
                    L2.p(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 43:
                    L2.k(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 44:
                    L2.o(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 45:
                    L2.n(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 46:
                    L2.i(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 47:
                    L2.l(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 48:
                    L2.g(iArr[i12], (List) unsafe.getObject(obj, j10), c0902x2, true);
                    break;
                case 49:
                    int i25 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    K2 k2Y2 = y(i12);
                    C0818g2 c0818g5 = L2.f14066a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            c0902x2.e(i25, list4.get(i26), k2Y2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j10);
                    if (object2 != null) {
                        int i27 = i12 / 3;
                        C0879t c0879t = ((C0907y2) this.f14008b[i27 + i27]).f14510a;
                        c0902x2.getClass();
                        for (Map.Entry entry : ((C0912z2) object2).entrySet()) {
                            C0788a2 c0788a8 = (C0788a2) c0902x2.f14509r;
                            c0788a8.h0(i15, 2);
                            c0788a8.q0(C0907y2.b(c0879t, entry.getKey(), entry.getValue()));
                            C0907y2.a(c0788a8, c0879t, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).m0(Double.doubleToRawLongBits(((Double) T2.j(j10, obj)).doubleValue()), i15);
                    }
                    break;
                case 52:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).k0(i15, Float.floatToRawIntBits(((Float) T2.j(j10, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).l0(l(j10, obj), i15);
                    }
                    break;
                case 54:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).l0(l(j10, obj), i15);
                    }
                    break;
                case 55:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).i0(i15, k(j10, obj));
                    }
                    break;
                case 56:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).m0(l(j10, obj), i15);
                    }
                    break;
                case 57:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).k0(i15, k(j10, obj));
                    }
                    break;
                case 58:
                    if (q(i15, i12, obj)) {
                        boolean zBooleanValue = ((Boolean) T2.j(j10, obj)).booleanValue();
                        C0788a2 c0788a9 = (C0788a2) c0902x2.f14509r;
                        c0788a9.q0(i15 << 3);
                        c0788a9.o0(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    break;
                case 59:
                    if (q(i15, i12, obj)) {
                        Object object3 = unsafe.getObject(obj, j10);
                        if (object3 instanceof String) {
                            C0788a2 c0788a10 = (C0788a2) c0902x2.f14509r;
                            c0788a10.q0((i15 << 3) | 2);
                            c0788a10.v0((String) object3);
                        } else {
                            C0788a2 c0788a11 = (C0788a2) c0902x2.f14509r;
                            c0788a11.q0((i15 << 3) | 2);
                            c0788a11.n0((Z1) object3);
                        }
                    }
                    break;
                case 60:
                    if (q(i15, i12, obj)) {
                        c0902x2.d(i15, unsafe.getObject(obj, j10), y(i12));
                    }
                    break;
                case 61:
                    if (q(i15, i12, obj)) {
                        Z1 z12 = (Z1) unsafe.getObject(obj, j10);
                        C0788a2 c0788a12 = (C0788a2) c0902x2.f14509r;
                        c0788a12.q0((i15 << 3) | 2);
                        c0788a12.n0(z12);
                    }
                    break;
                case 62:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).j0(i15, k(j10, obj));
                    }
                    break;
                case 63:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).i0(i15, k(j10, obj));
                    }
                    break;
                case 64:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).k0(i15, k(j10, obj));
                    }
                    break;
                case 65:
                    if (q(i15, i12, obj)) {
                        ((C0788a2) c0902x2.f14509r).m0(l(j10, obj), i15);
                    }
                    break;
                case 66:
                    if (q(i15, i12, obj)) {
                        int iK = k(j10, obj);
                        ((C0788a2) c0902x2.f14509r).j0(i15, (iK >> 31) ^ (iK + iK));
                    }
                    break;
                case 67:
                    if (q(i15, i12, obj)) {
                        long jL = l(j10, obj);
                        ((C0788a2) c0902x2.f14509r).l0((jL >> 63) ^ (jL + jL), i15);
                    }
                    break;
                case 68:
                    if (q(i15, i12, obj)) {
                        c0902x2.e(i15, unsafe.getObject(obj, j10), y(i12));
                    }
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final boolean h(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.g) {
            int i15 = this.f14012f[i13];
            int[] iArr = this.f14007a;
            int i16 = iArr[i15];
            int iE = E(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f14006k.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                int i20 = i12;
                i10 = i14;
                i11 = i20;
            }
            if ((268435456 & iE) == 0 || n(obj, i15, i10, i11, i19)) {
                int iF = F(iE);
                if (iF != 9 && iF != 17) {
                    if (iF != 27) {
                        if (iF == 60 || iF == 68) {
                            if (!q(i16, i15, obj) || y(i15).h(T2.j(iE & 1048575, obj))) {
                                i13++;
                                i14 = i10;
                                i12 = i11;
                            }
                        } else if (iF != 49) {
                            if (iF != 50) {
                                continue;
                            } else {
                                C0912z2 c0912z2 = (C0912z2) T2.j(iE & 1048575, obj);
                                if (c0912z2.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i15 / 3;
                                    if (((W2) ((C0907y2) this.f14008b[i21 + i21]).f14510a.f14409b).f14158r == X2.f14172z) {
                                        K2 k2A = null;
                                        for (Object obj2 : c0912z2.values()) {
                                            if (k2A == null) {
                                                k2A = H2.f14042c.a(obj2.getClass());
                                            }
                                            if (!k2A.h(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i13++;
                            i14 = i10;
                            i12 = i11;
                        }
                    }
                    List list = (List) T2.j(iE & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        K2 k2Y = y(i15);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (k2Y.h(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i10;
                    i12 = i11;
                } else if (!n(obj, i15, i10, i11, i19) || y(i15).h(T2.j(iE & 1048575, obj))) {
                    i13++;
                    i14 = i10;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.K2
    public final boolean i(AbstractC0828i2 abstractC0828i2, AbstractC0828i2 abstractC0828i3) {
        boolean zA;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14007a;
            if (i10 < iArr.length) {
                int iE = E(i10);
                long j10 = iE & 1048575;
                switch (F(iE)) {
                    case 0:
                        if (m(abstractC0828i2, abstractC0828i3, i10)) {
                            S2 s10 = T2.f14130c;
                            if (Double.doubleToLongBits(s10.f(j10, abstractC0828i2)) == Double.doubleToLongBits(s10.f(j10, abstractC0828i3))) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (m(abstractC0828i2, abstractC0828i3, i10)) {
                            S2 s11 = T2.f14130c;
                            if (Float.floatToIntBits(s11.d(j10, abstractC0828i2)) == Float.floatToIntBits(s11.d(j10, abstractC0828i3))) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.h(j10, abstractC0828i2) == T2.h(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.h(j10, abstractC0828i2) == T2.h(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.f(j10, abstractC0828i2) == T2.f(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.h(j10, abstractC0828i2) == T2.h(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.f(j10, abstractC0828i2) == T2.f(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (m(abstractC0828i2, abstractC0828i3, i10)) {
                            S2 s12 = T2.f14130c;
                            if (s12.b(j10, abstractC0828i2) == s12.b(j10, abstractC0828i3)) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.f(j10, abstractC0828i2) == T2.f(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.f(j10, abstractC0828i2) == T2.f(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.f(j10, abstractC0828i2) == T2.f(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.h(j10, abstractC0828i2) == T2.h(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.f(j10, abstractC0828i2) == T2.f(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && T2.h(j10, abstractC0828i2) == T2.h(j10, abstractC0828i3)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (m(abstractC0828i2, abstractC0828i3, i10) && L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 18:
                    case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    case 20:
                    case 21:
                    case 22:
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
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zA = L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3));
                        break;
                    case 50:
                        zA = L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j11 = iArr[i10 + 2] & 1048575;
                        if (T2.f(j11, abstractC0828i2) == T2.f(j11, abstractC0828i3) && L2.a(T2.j(j10, abstractC0828i2), T2.j(j10, abstractC0828i3))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        continue;
                        i10 += 3;
                        break;
                }
                if (zA) {
                    i10 += 3;
                }
            } else if (abstractC0828i2.zzc.equals(abstractC0828i3.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(AbstractC0828i2 abstractC0828i2, AbstractC0828i2 abstractC0828i3, int i10) {
        return o(i10, abstractC0828i2) == o(i10, abstractC0828i3);
    }

    public final boolean n(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return o(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean o(int i10, Object obj) {
        int i11 = this.f14007a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iE = E(i10);
            long j11 = iE & 1048575;
            switch (F(iE)) {
                case 0:
                    if (Double.doubleToRawLongBits(T2.f14130c.f(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(T2.f14130c.d(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (T2.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (T2.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (T2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (T2.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (T2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return T2.f14130c.b(j11, obj);
                case 8:
                    Object objJ = T2.j(j11, obj);
                    if (objJ instanceof String) {
                        if (((String) objJ).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objJ instanceof Z1)) {
                            throw new IllegalArgumentException();
                        }
                        if (Z1.f14184t.equals(objJ)) {
                            return false;
                        }
                    }
                case 9:
                    if (T2.j(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (Z1.f14184t.equals(T2.j(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (T2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (T2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (T2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (T2.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (T2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (T2.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (T2.j(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & T2.f(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i10, Object obj) {
        int i11 = this.f14007a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        T2.g(obj, j10, (1 << (i11 >>> 20)) | T2.f(j10, obj));
    }

    public final boolean q(int i10, int i11, Object obj) {
        return T2.f((long) (this.f14007a[i11 + 2] & 1048575), obj) == i10;
    }

    public final int r(int i10, int i11) {
        int[] iArr = this.f14007a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int t(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.W1 r45) {
        /*
            Method dump skipped, instruction units count: 4410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D2.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.W1):int");
    }

    public final void w(int i10, Object obj, Object obj2) {
        if (o(i10, obj2)) {
            int iE = E(i10) & 1048575;
            Unsafe unsafe = f14006k;
            long j10 = iE;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f14007a[i10];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i11);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            K2 k2Y = y(i10);
            if (!o(i10, obj)) {
                if (j(object)) {
                    AbstractC0828i2 abstractC0828i2A = k2Y.a();
                    k2Y.d(abstractC0828i2A, object);
                    unsafe.putObject(obj, j10, abstractC0828i2A);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                p(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!j(object2)) {
                AbstractC0828i2 abstractC0828i2A2 = k2Y.a();
                k2Y.d(abstractC0828i2A2, object2);
                unsafe.putObject(obj, j10, abstractC0828i2A2);
                object2 = abstractC0828i2A2;
            }
            k2Y.d(object2, object);
        }
    }

    public final void x(int i10, Object obj, Object obj2) {
        int[] iArr = this.f14007a;
        int i11 = iArr[i10];
        if (q(i11, i10, obj2)) {
            int iE = E(i10) & 1048575;
            Unsafe unsafe = f14006k;
            long j10 = iE;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i12);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            K2 k2Y = y(i10);
            if (!q(i11, i10, obj)) {
                if (j(object)) {
                    AbstractC0828i2 abstractC0828i2A = k2Y.a();
                    k2Y.d(abstractC0828i2A, object);
                    unsafe.putObject(obj, j10, abstractC0828i2A);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                T2.g(obj, iArr[i10 + 2] & 1048575, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!j(object2)) {
                AbstractC0828i2 abstractC0828i2A2 = k2Y.a();
                k2Y.d(abstractC0828i2A2, object2);
                unsafe.putObject(obj, j10, abstractC0828i2A2);
                object2 = abstractC0828i2A2;
            }
            k2Y.d(object2, object);
        }
    }

    public final K2 y(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f14008b;
        K2 k7 = (K2) objArr[i12];
        if (k7 != null) {
            return k7;
        }
        K2 k2A = H2.f14042c.a((Class) objArr[i12 + 1]);
        objArr[i12] = k2A;
        return k2A;
    }

    public final InterfaceC0843l2 z(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC0843l2) this.f14008b[i11 + i11 + 1];
    }
}
