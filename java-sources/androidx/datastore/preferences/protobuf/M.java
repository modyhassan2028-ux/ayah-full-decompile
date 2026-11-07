package androidx.datastore.preferences.protobuf;

import I1.AbstractC0244b0;
import W.AbstractC0607v1;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class M implements W {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f12388n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f12389o = j0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f12391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0727a f12394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12395f;
    public final int[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12397i;
    public final O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f12398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f12399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I f12400m;

    public M(int[] iArr, Object[] objArr, int i10, int i11, AbstractC0727a abstractC0727a, int[] iArr2, int i12, int i13, O o10, B b5, e0 e0Var, C0740n c0740n, I i14) {
        this.f12390a = iArr;
        this.f12391b = objArr;
        this.f12392c = i10;
        this.f12393d = i11;
        this.f12395f = abstractC0727a instanceof AbstractC0746u;
        this.g = iArr2;
        this.f12396h = i12;
        this.f12397i = i13;
        this.j = o10;
        this.f12398k = b5;
        this.f12399l = e0Var;
        this.f12394e = abstractC0727a;
        this.f12400m = i14;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbD = android.support.v4.media.session.p.D("Field ", str, " for ");
            sbD.append(cls.getName());
            sbD.append(" not found. Known fields are ");
            sbD.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbD.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0746u) {
            return ((AbstractC0746u) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    public static M w(V v10, O o10, B b5, e0 e0Var, C0740n c0740n, I i10) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i20;
        char cCharAt3;
        int i21;
        char cCharAt4;
        int i22;
        char cCharAt5;
        int i23;
        char cCharAt6;
        int i24;
        char cCharAt7;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        int i32;
        int i33;
        Field fieldF;
        char cCharAt9;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field fieldF2;
        int i37;
        Object obj2;
        Field fieldF3;
        int i38;
        char cCharAt10;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        String str = v10.f12413b;
        int length = str.length();
        int i42 = 55296;
        if (str.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i11 = i43 + 1;
                if (str.charAt(i43) < 55296) {
                    break;
                }
                i43 = i11;
            }
        } else {
            i11 = 1;
        }
        int i44 = i11 + 1;
        int iCharAt2 = str.charAt(i11);
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
            i16 = 0;
            iCharAt = 0;
            i12 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f12388n;
            i14 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt3 = str.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i25 = i47 + 1;
                    cCharAt8 = str.charAt(i47);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i25;
                }
                iCharAt3 = i48 | (cCharAt8 << i49);
                i47 = i25;
            }
            int i50 = i47 + 1;
            int iCharAt4 = str.charAt(i47);
            if (iCharAt4 >= 55296) {
                int i51 = iCharAt4 & 8191;
                int i52 = 13;
                while (true) {
                    i24 = i50 + 1;
                    cCharAt7 = str.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i24;
                }
                iCharAt4 = i51 | (cCharAt7 << i52);
                i50 = i24;
            }
            int i53 = i50 + 1;
            int iCharAt5 = str.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i23 = i53 + 1;
                    cCharAt6 = str.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i23;
                }
                iCharAt5 = i54 | (cCharAt6 << i55);
                i53 = i23;
            }
            int i56 = i53 + 1;
            int iCharAt6 = str.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i22 = i56 + 1;
                    cCharAt5 = str.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i22;
                }
                iCharAt6 = i57 | (cCharAt5 << i58);
                i56 = i22;
            }
            int i59 = i56 + 1;
            iCharAt = str.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i21 = i59 + 1;
                    cCharAt4 = str.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i21;
                }
                iCharAt = i60 | (cCharAt4 << i61);
                i59 = i21;
            }
            int i62 = i59 + 1;
            int iCharAt7 = str.charAt(i59);
            if (iCharAt7 >= 55296) {
                int i63 = iCharAt7 & 8191;
                int i64 = 13;
                while (true) {
                    i20 = i62 + 1;
                    cCharAt3 = str.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i20;
                }
                iCharAt7 = i63 | (cCharAt3 << i64);
                i62 = i20;
            }
            int i65 = i62 + 1;
            int iCharAt8 = str.charAt(i62);
            if (iCharAt8 >= 55296) {
                int i66 = iCharAt8 & 8191;
                int i67 = 13;
                while (true) {
                    i19 = i65 + 1;
                    cCharAt2 = str.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i19;
                }
                iCharAt8 = i66 | (cCharAt2 << i67);
                i65 = i19;
            }
            int i68 = i65 + 1;
            int iCharAt9 = str.charAt(i65);
            if (iCharAt9 >= 55296) {
                int i69 = iCharAt9 & 8191;
                int i70 = 13;
                while (true) {
                    i18 = i68 + 1;
                    cCharAt = str.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i69 |= (cCharAt & 8191) << i70;
                    i70 += 13;
                    i68 = i18;
                }
                iCharAt9 = i69 | (cCharAt << i70);
                i68 = i18;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i71 = (iCharAt3 * 2) + iCharAt4;
            int i72 = iCharAt7;
            i12 = iCharAt5;
            i13 = i72;
            i14 = iCharAt3;
            i44 = i68;
            iArr = iArr2;
            i15 = iCharAt6;
            i16 = i71;
            i17 = iCharAt9;
        }
        Unsafe unsafe = f12389o;
        Object[] objArr = v10.f12414c;
        Class<?> cls = v10.f12412a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i73 = i17 + i13;
        int i74 = i73;
        int i75 = i17;
        int i76 = 0;
        int i77 = 0;
        while (i44 < length) {
            int i78 = i44 + 1;
            int iCharAt10 = str.charAt(i44);
            if (iCharAt10 >= i42) {
                int i79 = iCharAt10 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    cCharAt12 = str.charAt(i80);
                    i26 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i40;
                    length = i26;
                }
                iCharAt10 = i79 | (cCharAt12 << i81);
                i27 = i40;
            } else {
                i26 = length;
                i27 = i78;
            }
            int i82 = i27 + 1;
            int iCharAt11 = str.charAt(i27);
            Object[] objArr3 = objArr;
            char c10 = 55296;
            if (iCharAt11 >= 55296) {
                int i83 = iCharAt11 & 8191;
                int i84 = 13;
                while (true) {
                    i39 = i82 + 1;
                    cCharAt11 = str.charAt(i82);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i83 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i82 = i39;
                    c10 = 55296;
                }
                iCharAt11 = i83 | (cCharAt11 << i84);
                i82 = i39;
            }
            int i85 = iCharAt11 & 255;
            int i86 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int[] iArr4 = iArr3;
            if (i85 >= 51) {
                int i87 = i82 + 1;
                int iCharAt12 = str.charAt(i82);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = 13;
                    while (true) {
                        i38 = i87 + 1;
                        cCharAt10 = str.charAt(i87);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i89;
                        i89 += 13;
                        i87 = i38;
                        c11 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i89);
                    i87 = i38;
                }
                int i90 = i85 - 51;
                int i91 = i87;
                if (i90 == 9 || i90 == 17) {
                    i35 = i16 + 1;
                    objArr2[((i77 / 3) * 2) + 1] = objArr3[i16];
                } else {
                    if (i90 == 12 && (AbstractC0607v1.a(v10.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i35 = i16 + 1;
                        objArr2[((i77 / 3) * 2) + 1] = objArr3[i16];
                    }
                    i36 = iCharAt12 * 2;
                    obj = objArr3[i36];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr3[i36] = fieldF2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                    i37 = i36 + 1;
                    obj2 = objArr3[i37];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr3[i37] = fieldF3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF3);
                    int i92 = i14;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i33 = iObjectFieldOffset3;
                    i28 = i92;
                    i32 = i16;
                    i30 = i91;
                    i31 = 0;
                    cls = cls;
                }
                i16 = i35;
                i36 = iCharAt12 * 2;
                obj = objArr3[i36];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr3[i36] = fieldF2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldF2);
                i37 = i36 + 1;
                obj2 = objArr3[i37];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr3[i37] = fieldF3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldF3);
                int i93 = i14;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i33 = iObjectFieldOffset5;
                i28 = i93;
                i32 = i16;
                i30 = i91;
                i31 = 0;
                cls = cls;
            } else {
                int i94 = i16 + 1;
                Field fieldF4 = F(cls, (String) objArr3[i16]);
                if (i85 == 9 || i85 == 17) {
                    i28 = i14;
                    objArr2[((i77 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i85 == 27 || i85 == 49) {
                        i28 = i14;
                        i34 = i16 + 2;
                        objArr2[((i77 / 3) * 2) + 1] = objArr3[i94];
                    } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                        i28 = i14;
                        if (v10.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i34 = i16 + 2;
                            objArr2[((i77 / 3) * 2) + 1] = objArr3[i94];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i30 = i82;
                            i31 = 0;
                        } else {
                            int i95 = i82 + 1;
                            int iCharAt13 = str.charAt(i82);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i30 = i95 + 1;
                                    cCharAt9 = str.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i30;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i30 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + (i28 * 2);
                            Object obj3 = objArr3[i98];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr3[i98] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i31 = iCharAt13 % 32;
                        }
                        if (i85 >= 18 || i85 > 49) {
                            i32 = i29;
                            i33 = iObjectFieldOffset;
                        } else {
                            iArr[i74] = iObjectFieldOffset;
                            i32 = i29;
                            i33 = iObjectFieldOffset;
                            i74++;
                        }
                    } else {
                        if (i85 == 50) {
                            int i99 = i75 + 1;
                            iArr[i75] = i77;
                            int i100 = (i77 / 3) * 2;
                            int i101 = i16 + 2;
                            objArr2[i100] = objArr3[i94];
                            if ((iCharAt11 & 2048) != 0) {
                                i29 = i16 + 3;
                                objArr2[i100 + 1] = objArr3[i101];
                                i28 = i14;
                                i75 = i99;
                            } else {
                                i29 = i101;
                                i75 = i99;
                                i28 = i14;
                            }
                        } else {
                            i28 = i14;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i30 = i82;
                            i31 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i30 = i82;
                            i31 = 0;
                        }
                        if (i85 >= 18) {
                            i32 = i29;
                            i33 = iObjectFieldOffset;
                        } else {
                            i32 = i29;
                            i33 = iObjectFieldOffset;
                        }
                    }
                    i29 = i34;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i30 = i82;
                        i31 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i30 = i82;
                        i31 = 0;
                    }
                    if (i85 >= 18) {
                        i32 = i29;
                        i33 = iObjectFieldOffset;
                    } else {
                        i32 = i29;
                        i33 = iObjectFieldOffset;
                    }
                }
                i29 = i94;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i30 = i82;
                    i31 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i30 = i82;
                    i31 = 0;
                }
                if (i85 >= 18) {
                    i32 = i29;
                    i33 = iObjectFieldOffset;
                } else {
                    i32 = i29;
                    i33 = iObjectFieldOffset;
                }
            }
            int i102 = i77 + 1;
            iArr4[i77] = i86;
            int i103 = i77 + 2;
            String str2 = str;
            iArr4[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | i33;
            i77 += 3;
            iArr4[i103] = (i31 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i26;
            i14 = i28;
            i44 = i30;
            i42 = 55296;
            i16 = i32;
            iArr3 = iArr4;
        }
        return new M(iArr3, objArr2, i12, i15, v10.f12412a, iArr, i17, i73, o10, b5, e0Var, c0740n, i10);
    }

    public static long x(int i10) {
        return i10 & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) j0.f12474c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) j0.f12474c.h(j, obj)).longValue();
    }

    public final int A(int i10) {
        if (i10 >= this.f12392c && i10 <= this.f12393d) {
            int[] iArr = this.f12390a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
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
        }
        return -1;
    }

    public final void B(Object obj, long j, E2.A a9, W w9, C0739m c0739m) throws C0749x {
        int iZ;
        this.f12398k.getClass();
        InterfaceC0747v interfaceC0747vA = B.a(j, obj);
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) a9.f1437e;
        int i10 = a9.f1434b;
        if ((i10 & 7) != 3) {
            throw C0750y.b();
        }
        do {
            AbstractC0746u abstractC0746uI = w9.i();
            a9.j(abstractC0746uI, w9, c0739m);
            w9.e(abstractC0746uI);
            ((U) interfaceC0747vA).add(abstractC0746uI);
            if (abstractC0244b0.c() || a9.f1436d != 0) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == i10);
        a9.f1436d = iZ;
    }

    public final void C(Object obj, int i10, E2.A a9, W w9, C0739m c0739m) throws C0750y {
        int iZ;
        this.f12398k.getClass();
        InterfaceC0747v interfaceC0747vA = B.a(i10 & 1048575, obj);
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) a9.f1437e;
        int i11 = a9.f1434b;
        if ((i11 & 7) != 2) {
            throw C0750y.b();
        }
        do {
            AbstractC0746u abstractC0746uI = w9.i();
            a9.k(abstractC0746uI, w9, c0739m);
            w9.e(abstractC0746uI);
            ((U) interfaceC0747vA).add(abstractC0746uI);
            if (abstractC0244b0.c() || a9.f1436d != 0) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == i11);
        a9.f1436d = iZ;
    }

    public final void D(int i10, E2.A a9, Object obj) throws C0749x {
        if ((536870912 & i10) != 0) {
            a9.E(2);
            j0.o(i10 & 1048575, obj, ((AbstractC0244b0) a9.f1437e).y());
        } else if (!this.f12395f) {
            j0.o(i10 & 1048575, obj, a9.m());
        } else {
            a9.E(2);
            j0.o(i10 & 1048575, obj, ((AbstractC0244b0) a9.f1437e).x());
        }
    }

    public final void E(int i10, E2.A a9, Object obj) throws C0749x {
        int i11 = 536870912 & i10;
        B b5 = this.f12398k;
        if (i11 != 0) {
            b5.getClass();
            a9.A(B.a(i10 & 1048575, obj), true);
        } else {
            b5.getClass();
            a9.A(B.a(i10 & 1048575, obj), false);
        }
    }

    public final void G(int i10, Object obj) {
        int i11 = this.f12390a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        j0.m(obj, j, (1 << (i11 >>> 20)) | j0.f12474c.f(j, obj));
    }

    public final void H(int i10, int i11, Object obj) {
        j0.m(obj, this.f12390a[i11 + 2] & 1048575, i10);
    }

    public final void I(Object obj, int i10, AbstractC0727a abstractC0727a) {
        f12389o.putObject(obj, L(i10) & 1048575, abstractC0727a);
        G(i10, obj);
    }

    public final void J(Object obj, int i10, int i11, AbstractC0727a abstractC0727a) {
        f12389o.putObject(obj, L(i11) & 1048575, abstractC0727a);
        H(i10, i11, obj);
    }

    public final int L(int i10) {
        return this.f12390a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x0337  */
    /* JADX WARN: Code duplicated, block: B:123:0x0346  */
    /* JADX WARN: Code duplicated, block: B:124:0x0358  */
    /* JADX WARN: Code duplicated, block: B:125:0x0369  */
    /* JADX WARN: Code duplicated, block: B:127:0x0372  */
    /* JADX WARN: Code duplicated, block: B:129:0x037b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0388  */
    /* JADX WARN: Code duplicated, block: B:131:0x0394  */
    /* JADX WARN: Code duplicated, block: B:133:0x0398  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03db  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:146:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x0407  */
    /* JADX WARN: Code duplicated, block: B:148:0x0412  */
    /* JADX WARN: Code duplicated, block: B:149:0x0419  */
    /* JADX WARN: Code duplicated, block: B:279:0x0340 A[SYNTHETIC] */
    public final void M(Object obj, E e10) throws IOException {
        int i10;
        E e11;
        int i11;
        int i12;
        boolean z10;
        int iB0;
        int size;
        int iA0;
        int iA;
        int iA1;
        int i13;
        int iZ;
        int iB1;
        int size2;
        int iA2;
        M m10 = this;
        E e12 = e10;
        int[] iArr = m10.f12390a;
        int length = iArr.length;
        Unsafe unsafe = f12389o;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int iL = m10.L(i16);
            int i18 = iArr[i16];
            int iK = K(iL);
            int i19 = 1;
            if (iK <= 17) {
                int i20 = iArr[i16 + 2];
                int i21 = i20 & i14;
                if (i21 != i15) {
                    i17 = i21 == i14 ? 0 : unsafe.getInt(obj, i21);
                    i15 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            long j = iL & i14;
            switch (iK) {
                case 0:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        double d5 = j0.f12474c.d(j, obj);
                        C0737k c0737k = (C0737k) e11.f12378a;
                        c0737k.getClass();
                        c0737k.l0(Double.doubleToRawLongBits(d5), i18);
                    }
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 1:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        float fE = j0.f12474c.e(j, obj);
                        C0737k c0737k2 = (C0737k) e11.f12378a;
                        c0737k2.getClass();
                        c0737k2.j0(i18, Float.floatToRawIntBits(fE));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 2:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).v0(unsafe.getLong(obj, j), i18);
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 3:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).v0(unsafe.getLong(obj, j), i18);
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 4:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).n0(i18, unsafe.getInt(obj, j));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 5:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).l0(unsafe.getLong(obj, j), i18);
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 6:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).j0(i18, unsafe.getInt(obj, j));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 7:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).g0(i18, j0.f12474c.c(j, obj));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 8:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0737k) e11.f12378a).q0(i18, (String) object);
                        } else {
                            ((C0737k) e11.f12378a).h0(i18, (C0733g) object);
                        }
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 9:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).p0(i18, (AbstractC0727a) unsafe.getObject(obj, j), m10.m(i16));
                    }
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 10:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).h0(i18, (C0733g) unsafe.getObject(obj, j));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 11:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).t0(i18, unsafe.getInt(obj, j));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 12:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).n0(i18, unsafe.getInt(obj, j));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).j0(i18, unsafe.getInt(obj, j));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        ((C0737k) e11.f12378a).l0(unsafe.getLong(obj, j), i18);
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        int i22 = unsafe.getInt(obj, j);
                        ((C0737k) e11.f12378a).t0(i18, (i22 >> 31) ^ (i22 << 1));
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        long j10 = unsafe.getLong(obj, j);
                        ((C0737k) e11.f12378a).v0((j10 >> 63) ^ (j10 << 1), i18);
                    }
                    m10 = this;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 17:
                    e11 = e12;
                    if (m10.o(obj, i16, i15, i17, i10)) {
                        e11.a(i18, unsafe.getObject(obj, j), m10.m(i16));
                    }
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 18:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.n(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.r(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 20:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.t(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 21:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.z(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 22:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.s(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 23:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.q(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 24:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.p(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 25:
                    i15 = i15;
                    i17 = i17;
                    e11 = e12;
                    X.m(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 26:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    int i23 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = X.f12416a;
                    if (list != null && !list.isEmpty()) {
                        e11.getClass();
                        for (int i24 = 0; i24 < list.size(); i24++) {
                            ((C0737k) e11.f12378a).q0(i23, (String) list.get(i24));
                        }
                    }
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 27:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    int i25 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j);
                    W wM = m10.m(i16);
                    Class cls2 = X.f12416a;
                    if (list2 != null && !list2.isEmpty()) {
                        e11.getClass();
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            ((C0737k) e11.f12378a).p0(i25, (AbstractC0727a) list2.get(i26), wM);
                        }
                    }
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 28:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    int i27 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = X.f12416a;
                    if (list3 != null && !list3.isEmpty()) {
                        e11.getClass();
                        for (int i28 = 0; i28 < list3.size(); i28++) {
                            ((C0737k) e11.f12378a).h0(i27, (C0733g) list3.get(i28));
                        }
                    }
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 29:
                    e11 = e12;
                    z10 = false;
                    X.y(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 30:
                    e11 = e12;
                    z10 = false;
                    X.o(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 31:
                    e11 = e12;
                    z10 = false;
                    X.u(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 32:
                    e11 = e12;
                    z10 = false;
                    X.v(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 33:
                    e11 = e12;
                    z10 = false;
                    X.w(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 34:
                    e11 = e12;
                    z10 = false;
                    X.x(iArr[i16], (List) unsafe.getObject(obj, j), e11, false);
                    i15 = i15;
                    i17 = i17;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 35:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.n(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 36:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.r(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 37:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.t(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 38:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.z(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 39:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.s(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 40:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.q(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 41:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.p(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 42:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.m(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 43:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.y(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 44:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.o(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 45:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.u(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 46:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.v(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 47:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.w(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 48:
                    i11 = i15;
                    i12 = i17;
                    e11 = e12;
                    X.x(iArr[i16], (List) unsafe.getObject(obj, j), e11, true);
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 49:
                    i11 = i15;
                    i12 = i17;
                    int i29 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j);
                    W wM2 = m10.m(i16);
                    Class cls4 = X.f12416a;
                    if (list4 != null && !list4.isEmpty()) {
                        e10.getClass();
                        for (int i30 = 0; i30 < list4.size(); i30++) {
                            e10.a(i29, list4.get(i30), wM2);
                        }
                    }
                    e11 = e10;
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i31 = 2;
                        Object obj2 = m10.f12391b[(i16 / 3) * 2];
                        m10.f12400m.getClass();
                        F f3 = ((G) obj2).f12382a;
                        r0 r0Var = f3.f12380b;
                        r0 r0Var2 = f3.f12379a;
                        C0737k c0737k3 = (C0737k) e12.f12378a;
                        c0737k3.getClass();
                        Iterator it = ((H) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            c0737k3.s0(i18, i31);
                            int i32 = i31;
                            Object key = entry.getKey();
                            int i33 = i19;
                            Object value = entry.getValue();
                            int i34 = C0742p.f12490c;
                            int iZ2 = C0737k.Z(i33);
                            int i35 = i15;
                            o0 o0Var = r0.f12501u;
                            if (r0Var2 == o0Var) {
                                iZ2 *= 2;
                            }
                            int i36 = i17;
                            Iterator it2 = it;
                            switch (r0Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iB0 = 8;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key2);
                                            C0742p.b(c0737k3, r0Var, i32, value2);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key3);
                                            C0742p.b(c0737k3, r0Var, i32, value3);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key4);
                                            C0742p.b(c0737k3, r0Var, i32, value4);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key5);
                                            C0742p.b(c0737k3, r0Var, i32, value5);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key6);
                                            C0742p.b(c0737k3, r0Var, i32, value6);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key7);
                                            C0742p.b(c0737k3, r0Var, i32, value7);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key8);
                                            C0742p.b(c0737k3, r0Var, i32, value8);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key9);
                                            C0742p.b(c0737k3, r0Var, i32, value9);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key10);
                                            C0742p.b(c0737k3, r0Var, i32, value10);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11);
                                            C0742p.b(c0737k3, r0Var, i32, value11);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key12);
                                            C0742p.b(c0737k3, r0Var, i32, value12);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key13);
                                            C0742p.b(c0737k3, r0Var, i32, value13);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key14);
                                            C0742p.b(c0737k3, r0Var, i32, value14);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key15);
                                            C0742p.b(c0737k3, r0Var, i32, value15);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key16);
                                            C0742p.b(c0737k3, r0Var, i32, value16);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key17);
                                            C0742p.b(c0737k3, r0Var, i32, value17);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue >> 31) ^ (iIntValue << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key18);
                                            C0742p.b(c0737k3, r0Var, i32, value18);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue << i33) ^ (jLongValue >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key19);
                                            C0742p.b(c0737k3, r0Var, i32, value19);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iB0 = 4;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key110);
                                            C0742p.b(c0737k3, r0Var, i32, value110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111);
                                            C0742p.b(c0737k3, r0Var, i32, value111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key112);
                                            C0742p.b(c0737k3, r0Var, i32, value112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key113);
                                            C0742p.b(c0737k3, r0Var, i32, value113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key114);
                                            C0742p.b(c0737k3, r0Var, i32, value114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key115);
                                            C0742p.b(c0737k3, r0Var, i32, value115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key116);
                                            C0742p.b(c0737k3, r0Var, i32, value116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key117);
                                            C0742p.b(c0737k3, r0Var, i32, value117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key118);
                                            C0742p.b(c0737k3, r0Var, i32, value118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key119);
                                            C0742p.b(c0737k3, r0Var, i32, value119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1110);
                                            C0742p.b(c0737k3, r0Var, i32, value1110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1112);
                                            C0742p.b(c0737k3, r0Var, i32, value1112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1113);
                                            C0742p.b(c0737k3, r0Var, i32, value1113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1114);
                                            C0742p.b(c0737k3, r0Var, i32, value1114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1115);
                                            C0742p.b(c0737k3, r0Var, i32, value1115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1116);
                                            C0742p.b(c0737k3, r0Var, i32, value1116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue2 << i33) ^ (jLongValue2 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1117);
                                            C0742p.b(c0737k3, r0Var, i32, value1117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    iB0 = C0737k.b0(((Long) key).longValue());
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1118);
                                            C0742p.b(c0737k3, r0Var, i32, value1118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1119);
                                            C0742p.b(c0737k3, r0Var, i32, value1119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11110);
                                            C0742p.b(c0737k3, r0Var, i32, value11110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11112);
                                            C0742p.b(c0737k3, r0Var, i32, value11112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11113);
                                            C0742p.b(c0737k3, r0Var, i32, value11113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11114);
                                            C0742p.b(c0737k3, r0Var, i32, value11114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11115);
                                            C0742p.b(c0737k3, r0Var, i32, value11115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11116);
                                            C0742p.b(c0737k3, r0Var, i32, value11116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11117);
                                            C0742p.b(c0737k3, r0Var, i32, value11117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11118);
                                            C0742p.b(c0737k3, r0Var, i32, value11118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11119);
                                            C0742p.b(c0737k3, r0Var, i32, value11119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue3 << i33) ^ (jLongValue3 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    iB0 = C0737k.b0(((Long) key).longValue());
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue4 << i33) ^ (jLongValue4 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    iB0 = C0737k.b0(((Integer) key).intValue());
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue5 << i33) ^ (jLongValue5 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iB0 = 8;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue6 << i33) ^ (jLongValue6 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iB0 = 4;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue7 << i33) ^ (jLongValue7 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iB0 = i33;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue8 << i33) ^ (jLongValue8 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    if (key instanceof C0733g) {
                                        size = ((C0733g) key).size();
                                        iA0 = C0737k.a0(size);
                                        iB0 = size + iA0;
                                    } else {
                                        iB0 = C0737k.Y((String) key);
                                    }
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue9 << i33) ^ (jLongValue9 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iA = ((AbstractC0746u) ((AbstractC0727a) key)).a(null);
                                    iB0 = iA;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue10 << i33) ^ (jLongValue10 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    int iA3 = ((AbstractC0746u) ((AbstractC0727a) key)).a(null);
                                    iA = iA3 + C0737k.a0(iA3);
                                    iB0 = iA;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue11 << i33) ^ (jLongValue11 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    if (key instanceof C0733g) {
                                        size = ((C0733g) key).size();
                                        iA0 = C0737k.a0(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iA0 = C0737k.a0(size);
                                    }
                                    iB0 = size + iA0;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue12 << i33) ^ (jLongValue12 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    iB0 = C0737k.a0(((Integer) key).intValue());
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue13 << i33) ^ (jLongValue13 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                    iB0 = C0737k.b0(((Integer) key).intValue());
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue14 << i33) ^ (jLongValue14 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                    ((Integer) key).getClass();
                                    iB0 = 4;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue15 << i33) ^ (jLongValue15 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                    ((Long) key).getClass();
                                    iB0 = 8;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue16 << i33) ^ (jLongValue16 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iA1 = C0737k.a0((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    iB0 = iA1;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue17 << i33) ^ (jLongValue17 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iA1 = C0737k.b0((jLongValue18 << i33) ^ (jLongValue18 >> 63));
                                    iB0 = iA1;
                                    i13 = iB0 + iZ2;
                                    iZ = C0737k.Z(i32);
                                    if (r0Var == o0Var) {
                                        iZ *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key1111111111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value1111111111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 2:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 3:
                                            iB1 = C0737k.b0(((Long) value).longValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 4:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB1 = i33;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                                iB1 = size2 + iA2;
                                            } else {
                                                iB1 = C0737k.Y((String) value);
                                            }
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111116);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111116);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 9:
                                            iB1 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111117);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111117);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 10:
                                            size2 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA2 = C0737k.a0(size2);
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111118);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111118);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size2 = ((C0733g) value).size();
                                                iA2 = C0737k.a0(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iA2 = C0737k.a0(size2);
                                            }
                                            iB1 = size2 + iA2;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key11111111111111111111111111111119);
                                            C0742p.b(c0737k3, r0Var, i32, value11111111111111111111111111111119);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 12:
                                            iB1 = C0737k.a0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111110);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111110);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB1 = C0737k.b0(((Integer) value).intValue());
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111111);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111111);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB1 = 4;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111112);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111112);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB1 = 8;
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111113);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111113);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iB1 = C0737k.a0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111114);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111114);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iB1 = C0737k.b0((jLongValue19 << i33) ^ (jLongValue19 >> 63));
                                            c0737k3.u0(iB1 + iZ + i13);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            C0742p.b(c0737k3, r0Var2, i33, key111111111111111111111111111111115);
                                            C0742p.b(c0737k3, r0Var, i32, value111111111111111111111111111111115);
                                            i31 = i32;
                                            i15 = i35;
                                            i17 = i36;
                                            it = it2;
                                            i19 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i11 = i15;
                    i12 = i17;
                    e11 = e10;
                    i15 = i11;
                    i17 = i12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 51:
                    if (m10.q(i18, i16, obj)) {
                        double dDoubleValue = ((Double) j0.f12474c.h(j, obj)).doubleValue();
                        C0737k c0737k4 = (C0737k) e12.f12378a;
                        c0737k4.getClass();
                        c0737k4.l0(Double.doubleToRawLongBits(dDoubleValue), i18);
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 52:
                    if (m10.q(i18, i16, obj)) {
                        float fFloatValue = ((Float) j0.f12474c.h(j, obj)).floatValue();
                        C0737k c0737k5 = (C0737k) e12.f12378a;
                        c0737k5.getClass();
                        c0737k5.j0(i18, Float.floatToRawIntBits(fFloatValue));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 53:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).v0(z(j, obj), i18);
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 54:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).v0(z(j, obj), i18);
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 55:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).n0(i18, y(j, obj));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 56:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).l0(z(j, obj), i18);
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 57:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).j0(i18, y(j, obj));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 58:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).g0(i18, ((Boolean) j0.f12474c.h(j, obj)).booleanValue());
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 59:
                    if (m10.q(i18, i16, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0737k) e12.f12378a).q0(i18, (String) object3);
                        } else {
                            ((C0737k) e12.f12378a).h0(i18, (C0733g) object3);
                        }
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 60:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).p0(i18, (AbstractC0727a) unsafe.getObject(obj, j), m10.m(i16));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 61:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).h0(i18, (C0733g) unsafe.getObject(obj, j));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 62:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).t0(i18, y(j, obj));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 63:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).n0(i18, y(j, obj));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 64:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).j0(i18, y(j, obj));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 65:
                    if (m10.q(i18, i16, obj)) {
                        ((C0737k) e12.f12378a).l0(z(j, obj), i18);
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 66:
                    if (m10.q(i18, i16, obj)) {
                        int iY = y(j, obj);
                        ((C0737k) e12.f12378a).t0(i18, (iY >> 31) ^ (iY << 1));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 67:
                    if (m10.q(i18, i16, obj)) {
                        long jZ = z(j, obj);
                        ((C0737k) e12.f12378a).v0((jZ << 1) ^ (jZ >> 63), i18);
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                case 68:
                    if (m10.q(i18, i16, obj)) {
                        e12.a(i18, unsafe.getObject(obj, j), m10.m(i16));
                    }
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
                default:
                    e11 = e12;
                    i16 += 3;
                    e12 = e11;
                    i14 = 1048575;
                    break;
            }
        }
        m10.f12399l.getClass();
        ((AbstractC0746u) obj).unknownFields.d(e12);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(java.lang.Object r19, E2.A r20, androidx.datastore.preferences.protobuf.C0739m r21) {
        /*
            Method dump skipped, instruction units count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.a(java.lang.Object, E2.A, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f12390a;
            if (i10 >= iArr.length) {
                X.k(this.f12399l, obj, obj2);
                return;
            }
            int iL = L(i10);
            long j = 1048575 & iL;
            int i11 = iArr[i10];
            switch (K(iL)) {
                case 0:
                    if (!n(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        i0 i0Var = j0.f12474c;
                        obj3 = obj;
                        i0Var.l(obj3, j, i0Var.d(j, obj2));
                        G(i10, obj3);
                    }
                    break;
                case 1:
                    if (n(i10, obj2)) {
                        i0 i0Var2 = j0.f12474c;
                        i0Var2.m(obj, j, i0Var2.e(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i10, obj2)) {
                        j0.n(obj, j, j0.f12474c.g(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i10, obj2)) {
                        j0.n(obj, j, j0.f12474c.g(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i10, obj2)) {
                        j0.m(obj, j, j0.f12474c.f(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i10, obj2)) {
                        j0.n(obj, j, j0.f12474c.g(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i10, obj2)) {
                        j0.m(obj, j, j0.f12474c.f(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i10, obj2)) {
                        i0 i0Var3 = j0.f12474c;
                        i0Var3.j(obj, j, i0Var3.c(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i10, obj2)) {
                        j0.o(j, obj, j0.f12474c.h(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i10, obj2)) {
                        j0.o(j, obj, j0.f12474c.h(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i10, obj2)) {
                        j0.m(obj, j, j0.f12474c.f(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i10, obj2)) {
                        j0.m(obj, j, j0.f12474c.f(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (n(i10, obj2)) {
                        j0.m(obj, j, j0.f12474c.f(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (n(i10, obj2)) {
                        j0.n(obj, j, j0.f12474c.g(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (n(i10, obj2)) {
                        j0.m(obj, j, j0.f12474c.f(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (n(i10, obj2)) {
                        j0.n(obj, j, j0.f12474c.g(j, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i10, obj, obj2);
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
                    this.f12398k.getClass();
                    i0 i0Var4 = j0.f12474c;
                    InterfaceC0747v interfaceC0747vD = (InterfaceC0747v) i0Var4.h(j, obj);
                    InterfaceC0747v interfaceC0747v = (InterfaceC0747v) i0Var4.h(j, obj2);
                    U u8 = (U) interfaceC0747vD;
                    int i12 = u8.f12411t;
                    int i13 = ((U) interfaceC0747v).f12411t;
                    if (i12 > 0 && i13 > 0) {
                        if (!((AbstractC0728b) interfaceC0747vD).f12433r) {
                            interfaceC0747vD = u8.d(i13 + i12);
                        }
                        ((AbstractC0728b) interfaceC0747vD).addAll(interfaceC0747v);
                    }
                    if (i12 > 0) {
                        interfaceC0747v = interfaceC0747vD;
                    }
                    j0.o(j, obj, interfaceC0747v);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = X.f12416a;
                    i0 i0Var5 = j0.f12474c;
                    Object objH = i0Var5.h(j, obj);
                    Object objH2 = i0Var5.h(j, obj2);
                    this.f12400m.getClass();
                    j0.o(j, obj, I.a(objH, objH2));
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
                    if (q(i11, i10, obj2)) {
                        j0.o(j, obj, j0.f12474c.h(j, obj2));
                        H(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i11, i10, obj2)) {
                        j0.o(j, obj, j0.f12474c.h(j, obj2));
                        H(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i10, obj, obj2);
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

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, E e10) throws IOException {
        e10.getClass();
        M(obj, e10);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.W
    public final int d(AbstractC0746u abstractC0746u) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f12390a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iL = L(i13);
            int i14 = iArr[i13];
            long j = 1048575 & iL;
            int i15 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i10 = i12 * 53;
                    iB = AbstractC0748w.b(Double.doubleToLongBits(j0.f12474c.d(j, abstractC0746u)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(j0.f12474c.e(j, abstractC0746u));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = AbstractC0748w.b(j0.f12474c.g(j, abstractC0746u));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = AbstractC0748w.b(j0.f12474c.g(j, abstractC0746u));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = j0.f12474c.f(j, abstractC0746u);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = AbstractC0748w.b(j0.f12474c.g(j, abstractC0746u));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = j0.f12474c.f(j, abstractC0746u);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = j0.f12474c.c(j, abstractC0746u);
                    Charset charset = AbstractC0748w.f12518a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) j0.f12474c.h(j, abstractC0746u)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objH = j0.f12474c.h(j, abstractC0746u);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = j0.f12474c.h(j, abstractC0746u).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = j0.f12474c.f(j, abstractC0746u);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = j0.f12474c.f(j, abstractC0746u);
                    i12 = iB + i10;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    i10 = i12 * 53;
                    iB = j0.f12474c.f(j, abstractC0746u);
                    i12 = iB + i10;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    i10 = i12 * 53;
                    iB = AbstractC0748w.b(j0.f12474c.g(j, abstractC0746u));
                    i12 = iB + i10;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    i10 = i12 * 53;
                    iB = j0.f12474c.f(j, abstractC0746u);
                    i12 = iB + i10;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    i10 = i12 * 53;
                    iB = AbstractC0748w.b(j0.f12474c.g(j, abstractC0746u));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objH2 = j0.f12474c.h(j, abstractC0746u);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
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
                    i10 = i12 * 53;
                    iB = j0.f12474c.h(j, abstractC0746u).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = j0.f12474c.h(j, abstractC0746u).hashCode();
                    i12 = iB + i10;
                    break;
                case 51:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = AbstractC0748w.b(Double.doubleToLongBits(((Double) j0.f12474c.h(j, abstractC0746u)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case 52:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) j0.f12474c.h(j, abstractC0746u)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case 53:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = AbstractC0748w.b(z(j, abstractC0746u));
                        i12 = iB + i10;
                    }
                    break;
                case 54:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = AbstractC0748w.b(z(j, abstractC0746u));
                        i12 = iB + i10;
                    }
                    break;
                case 55:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = y(j, abstractC0746u);
                        i12 = iB + i10;
                    }
                    break;
                case 56:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = AbstractC0748w.b(z(j, abstractC0746u));
                        i12 = iB + i10;
                    }
                    break;
                case 57:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = y(j, abstractC0746u);
                        i12 = iB + i10;
                    }
                    break;
                case 58:
                    if (q(i14, i13, abstractC0746u)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) j0.f12474c.h(j, abstractC0746u)).booleanValue();
                        Charset charset2 = AbstractC0748w.f12518a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = ((String) j0.f12474c.h(j, abstractC0746u)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = j0.f12474c.h(j, abstractC0746u).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 61:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = j0.f12474c.h(j, abstractC0746u).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = y(j, abstractC0746u);
                        i12 = iB + i10;
                    }
                    break;
                case 63:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = y(j, abstractC0746u);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = y(j, abstractC0746u);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = AbstractC0748w.b(z(j, abstractC0746u));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = y(j, abstractC0746u);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = AbstractC0748w.b(z(j, abstractC0746u));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (q(i14, i13, abstractC0746u)) {
                        i10 = i12 * 53;
                        iB = j0.f12474c.h(j, abstractC0746u).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        this.f12399l.getClass();
        return abstractC0746u.unknownFields.hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void e(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0746u) {
                AbstractC0746u abstractC0746u = (AbstractC0746u) obj;
                abstractC0746u.k(Integer.MAX_VALUE);
                abstractC0746u.memoizedHashCode = 0;
                abstractC0746u.h();
            }
            int[] iArr = this.f12390a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iL = L(i10);
                long j = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (n(i10, obj)) {
                                    m(i10).e(f12389o.getObject(obj, j));
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
                                this.f12398k.getClass();
                                AbstractC0728b abstractC0728b = (AbstractC0728b) ((InterfaceC0747v) j0.f12474c.h(j, obj));
                                if (abstractC0728b.f12433r) {
                                    abstractC0728b.f12433r = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f12389o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f12400m.getClass();
                                    ((H) object).f12384r = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i10], i10, obj)) {
                        m(i10).e(f12389o.getObject(obj, j));
                    }
                } else if (n(i10, obj)) {
                    m(i10).e(f12389o.getObject(obj, j));
                }
            }
            this.f12399l.getClass();
            d0 d0Var = ((AbstractC0746u) obj).unknownFields;
            if (d0Var.f12447e) {
                d0Var.f12447e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean f(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f12396h) {
            int i15 = this.g[i14];
            int[] iArr = this.f12390a;
            int i16 = iArr[i15];
            int iL = L(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f12389o.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iL) == 0 || o(obj, i15, i10, i11, i19)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i15, i10, i11, i19)) {
                        if (!m(i15).f(j0.f12474c.h(iL & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i16, i15, obj)) {
                                if (!m(i15).f(j0.f12474c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = j0.f12474c.h(iL & 1048575, obj);
                                this.f12400m.getClass();
                                H h7 = (H) objH;
                                if (h7.isEmpty()) {
                                    continue;
                                } else {
                                    if (((G) this.f12391b[(i15 / 3) * 2]).f12382a.f12380b.f12504r != s0.f12517z) {
                                        continue;
                                    } else {
                                        W wA = null;
                                        for (Object obj2 : h7.values()) {
                                            if (wA == null) {
                                                wA = T.f12406c.a(obj2.getClass());
                                            }
                                            if (!wA.f(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        }
                    }
                    List list = (List) j0.f12474c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        W wM = m(i15);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (wM.f(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean g(AbstractC0746u abstractC0746u, AbstractC0746u abstractC0746u2) {
        int[] iArr = this.f12390a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zL = true;
            if (i10 < length) {
                int iL = L(i10);
                long j = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var = j0.f12474c;
                            if (Double.doubleToLongBits(i0Var.d(j, abstractC0746u)) != Double.doubleToLongBits(i0Var.d(j, abstractC0746u2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var2 = j0.f12474c;
                            if (Float.floatToIntBits(i0Var2.e(j, abstractC0746u)) != Float.floatToIntBits(i0Var2.e(j, abstractC0746u2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var3 = j0.f12474c;
                            if (i0Var3.g(j, abstractC0746u) != i0Var3.g(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var4 = j0.f12474c;
                            if (i0Var4.g(j, abstractC0746u) != i0Var4.g(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var5 = j0.f12474c;
                            if (i0Var5.f(j, abstractC0746u) != i0Var5.f(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var6 = j0.f12474c;
                            if (i0Var6.g(j, abstractC0746u) != i0Var6.g(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var7 = j0.f12474c;
                            if (i0Var7.f(j, abstractC0746u) != i0Var7.f(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var8 = j0.f12474c;
                            if (i0Var8.c(j, abstractC0746u) != i0Var8.c(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var9 = j0.f12474c;
                            if (!X.l(i0Var9.h(j, abstractC0746u), i0Var9.h(j, abstractC0746u2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var10 = j0.f12474c;
                            if (!X.l(i0Var10.h(j, abstractC0746u), i0Var10.h(j, abstractC0746u2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var11 = j0.f12474c;
                            if (!X.l(i0Var11.h(j, abstractC0746u), i0Var11.h(j, abstractC0746u2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var12 = j0.f12474c;
                            if (i0Var12.f(j, abstractC0746u) != i0Var12.f(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var13 = j0.f12474c;
                            if (i0Var13.f(j, abstractC0746u) != i0Var13.f(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var14 = j0.f12474c;
                            if (i0Var14.f(j, abstractC0746u) != i0Var14.f(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var15 = j0.f12474c;
                            if (i0Var15.g(j, abstractC0746u) != i0Var15.g(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var16 = j0.f12474c;
                            if (i0Var16.f(j, abstractC0746u) != i0Var16.f(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var17 = j0.f12474c;
                            if (i0Var17.g(j, abstractC0746u) != i0Var17.g(j, abstractC0746u2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(abstractC0746u, abstractC0746u2, i10)) {
                            zL = false;
                        } else {
                            i0 i0Var18 = j0.f12474c;
                            if (!X.l(i0Var18.h(j, abstractC0746u), i0Var18.h(j, abstractC0746u2))) {
                                zL = false;
                            }
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
                        i0 i0Var19 = j0.f12474c;
                        zL = X.l(i0Var19.h(j, abstractC0746u), i0Var19.h(j, abstractC0746u2));
                        break;
                    case 50:
                        i0 i0Var20 = j0.f12474c;
                        zL = X.l(i0Var20.h(j, abstractC0746u), i0Var20.h(j, abstractC0746u2));
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
                        long j10 = iArr[i10 + 2] & 1048575;
                        i0 i0Var21 = j0.f12474c;
                        if (i0Var21.f(j10, abstractC0746u) != i0Var21.f(j10, abstractC0746u2) || !X.l(i0Var21.h(j, abstractC0746u), i0Var21.h(j, abstractC0746u2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i10 += 3;
                }
            } else {
                this.f12399l.getClass();
                if (abstractC0746u.unknownFields.equals(abstractC0746u2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x031c  */
    /* JADX WARN: Code duplicated, block: B:133:0x032b  */
    /* JADX WARN: Code duplicated, block: B:134:0x033c  */
    /* JADX WARN: Code duplicated, block: B:135:0x034d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0356  */
    /* JADX WARN: Code duplicated, block: B:139:0x035f  */
    /* JADX WARN: Code duplicated, block: B:140:0x036c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0378  */
    /* JADX WARN: Code duplicated, block: B:143:0x037c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0389  */
    /* JADX WARN: Code duplicated, block: B:146:0x0391  */
    /* JADX WARN: Code duplicated, block: B:147:0x039f  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:215:0x05ec A[PHI: r23 r24
      0x05ec: PHI (r23v19 int) = 
      (r23v2 int)
      (r23v3 int)
      (r23v4 int)
      (r23v8 int)
      (r23v10 int)
      (r23v11 int)
      (r23v12 int)
      (r23v16 int)
      (r23v20 int)
     binds: [B:274:0x07a3, B:270:0x0785, B:266:0x0767, B:249:0x06ea, B:235:0x0681, B:231:0x0665, B:227:0x0649, B:220:0x060b, B:214:0x05ea] A[DONT_GENERATE, DONT_INLINE]
      0x05ec: PHI (r24v18 int) = 
      (r24v2 int)
      (r24v3 int)
      (r24v4 int)
      (r24v8 int)
      (r24v10 int)
      (r24v11 int)
      (r24v12 int)
      (r24v15 int)
      (r24v19 int)
     binds: [B:274:0x07a3, B:270:0x0785, B:266:0x0767, B:249:0x06ea, B:235:0x0681, B:231:0x0665, B:227:0x0649, B:220:0x060b, B:214:0x05ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x0325 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0746u abstractC0746u) {
        int i10;
        int iZ;
        int iZ2;
        int iZ3;
        int iB0;
        int iZ4;
        int iB1;
        int iZ5;
        int iZ6;
        int iX;
        int iA;
        int iC;
        int i11;
        int i12;
        int iZ7;
        int size;
        int i13;
        int iZ8;
        int iZ9;
        int size2;
        int iZ10;
        int iA0;
        int iA2;
        int iA1;
        int iB2;
        int size3;
        int iA3;
        int i14;
        r0 r0Var;
        int iZ11;
        int iB3;
        int size4;
        int iA4;
        int iZ12;
        int iZ13;
        int iB4;
        int iZ14;
        int iB5;
        int iA5;
        M m10 = this;
        AbstractC0746u abstractC0746u2 = abstractC0746u;
        Unsafe unsafe = f12389o;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int iX2 = 0;
        while (true) {
            int[] iArr = m10.f12390a;
            if (i17 >= iArr.length) {
                m10.f12399l.getClass();
                return abstractC0746u2.unknownFields.b() + iX2;
            }
            int iL = m10.L(i17);
            int iK = K(iL);
            int i19 = iArr[i17];
            int i20 = iArr[i17 + 2];
            int i21 = i20 & i15;
            int i22 = 1;
            if (iK <= 17) {
                if (i21 != i16) {
                    i18 = i21 == i15 ? 0 : unsafe.getInt(abstractC0746u2, i21);
                    i16 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            long j = iL & i15;
            if (iK >= EnumC0743q.f12493s.f12497r) {
                int i23 = EnumC0743q.f12494t.f12497r;
            }
            char c10 = '?';
            switch (iK) {
                case 0:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ = C0737k.Z(i19);
                        iA = iZ + 8;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 1:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ2 = C0737k.Z(i19);
                        iZ6 = iZ2 + 4;
                        iX2 += iZ6;
                    }
                    m10 = this;
                    abstractC0746u2 = abstractC0746u;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 2:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        long j10 = unsafe.getLong(abstractC0746u2, j);
                        iZ3 = C0737k.Z(i19);
                        iB0 = C0737k.b0(j10);
                        iX2 += iB0 + iZ3;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 3:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        long j11 = unsafe.getLong(abstractC0746u2, j);
                        iZ3 = C0737k.Z(i19);
                        iB0 = C0737k.b0(j11);
                        iX2 += iB0 + iZ3;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 4:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        int i24 = unsafe.getInt(abstractC0746u2, j);
                        iZ4 = C0737k.Z(i19);
                        iB1 = C0737k.b0(i24);
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 5:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ5 = C0737k.Z(i19);
                        iZ6 = iZ5 + 8;
                        iX2 += iZ6;
                    }
                    m10 = this;
                    abstractC0746u2 = abstractC0746u;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 6:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ2 = C0737k.Z(i19);
                        iZ6 = iZ2 + 4;
                        iX2 += iZ6;
                    }
                    m10 = this;
                    abstractC0746u2 = abstractC0746u;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 7:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ6 = C0737k.Z(i19) + 1;
                        iX2 += iZ6;
                    }
                    m10 = this;
                    abstractC0746u2 = abstractC0746u;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 8:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        Object object = unsafe.getObject(abstractC0746u2, j);
                        iX2 = (object instanceof C0733g ? C0737k.X(i19, (C0733g) object) : C0737k.Y((String) object) + C0737k.Z(i19)) + iX2;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 9:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        Object object2 = unsafe.getObject(abstractC0746u2, j);
                        W wM = m10.m(i17);
                        Class cls = X.f12416a;
                        int iZ15 = C0737k.Z(i19);
                        int iA6 = ((AbstractC0727a) object2).a(wM);
                        iX2 += C0737k.a0(iA6) + iA6 + iZ15;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 10:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iX = C0737k.X(i19, (C0733g) unsafe.getObject(abstractC0746u2, j));
                        iX2 += iX;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 11:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        int i25 = unsafe.getInt(abstractC0746u2, j);
                        iZ4 = C0737k.Z(i19);
                        iB1 = C0737k.a0(i25);
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 12:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        int i26 = unsafe.getInt(abstractC0746u2, j);
                        iZ4 = C0737k.Z(i19);
                        iB1 = C0737k.b0(i26);
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ2 = C0737k.Z(i19);
                        iZ6 = iZ2 + 4;
                        iX2 += iZ6;
                    }
                    m10 = this;
                    abstractC0746u2 = abstractC0746u;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iZ5 = C0737k.Z(i19);
                        iZ6 = iZ5 + 8;
                        iX2 += iZ6;
                    }
                    m10 = this;
                    abstractC0746u2 = abstractC0746u;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        int i27 = unsafe.getInt(abstractC0746u2, j);
                        iZ4 = C0737k.Z(i19);
                        iB1 = C0737k.a0((i27 >> 31) ^ (i27 << 1));
                        iX = iB1 + iZ4;
                        iX2 += iX;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        long j12 = unsafe.getLong(abstractC0746u2, j);
                        iZ3 = C0737k.Z(i19);
                        iB0 = C0737k.b0((j12 >> 63) ^ (j12 << 1));
                        iX2 += iB0 + iZ3;
                    }
                    m10 = this;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 17:
                    if (m10.o(abstractC0746u2, i17, i16, i18, i10)) {
                        iA = ((AbstractC0727a) unsafe.getObject(abstractC0746u2, j)).a(m10.m(i17)) + (C0737k.Z(i19) * 2);
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 18:
                    iC = X.c(i19, (List) unsafe.getObject(abstractC0746u2, j));
                    iX2 += iC;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    iC = X.b(i19, (List) unsafe.getObject(abstractC0746u2, j));
                    iX2 += iC;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 20:
                    i11 = i16;
                    i12 = i18;
                    List list = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls2 = X.f12416a;
                    if (list.size() == 0) {
                        iZ7 = 0;
                    } else {
                        iZ7 = (C0737k.Z(i19) * list.size()) + X.e(list);
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 21:
                    i11 = i16;
                    i12 = i18;
                    List list2 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls3 = X.f12416a;
                    size = list2.size();
                    if (size == 0) {
                        iZ7 = 0;
                    } else {
                        i13 = X.i(list2);
                        iZ8 = C0737k.Z(i19);
                        iZ7 = (iZ8 * size) + i13;
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 22:
                    i11 = i16;
                    i12 = i18;
                    List list3 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls4 = X.f12416a;
                    size = list3.size();
                    if (size == 0) {
                        iZ7 = 0;
                    } else {
                        i13 = X.d(list3);
                        iZ8 = C0737k.Z(i19);
                        iZ7 = (iZ8 * size) + i13;
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 23:
                    iC = X.c(i19, (List) unsafe.getObject(abstractC0746u2, j));
                    iX2 += iC;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 24:
                    iC = X.b(i19, (List) unsafe.getObject(abstractC0746u2, j));
                    iX2 += iC;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 25:
                    i11 = i16;
                    i12 = i18;
                    List list4 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls5 = X.f12416a;
                    int size5 = list4.size();
                    iX2 += size5 == 0 ? 0 : (C0737k.Z(i19) + 1) * size5;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 26:
                    i11 = i16;
                    i12 = i18;
                    List list5 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls6 = X.f12416a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iZ7 = 0;
                    } else {
                        iZ7 = C0737k.Z(i19) * size6;
                        for (int i28 = 0; i28 < size6; i28++) {
                            Object obj = list5.get(i28);
                            if (obj instanceof C0733g) {
                                int size7 = ((C0733g) obj).size();
                                iZ7 = C0737k.a0(size7) + size7 + iZ7;
                            } else {
                                iZ7 = C0737k.Y((String) obj) + iZ7;
                            }
                        }
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 27:
                    i11 = i16;
                    i12 = i18;
                    List list6 = (List) unsafe.getObject(abstractC0746u2, j);
                    W wM2 = m10.m(i17);
                    Class cls7 = X.f12416a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iZ9 = 0;
                    } else {
                        iZ9 = C0737k.Z(i19) * size8;
                        for (int i29 = 0; i29 < size8; i29++) {
                            int iA7 = ((AbstractC0727a) list6.get(i29)).a(wM2);
                            iZ9 += C0737k.a0(iA7) + iA7;
                        }
                    }
                    iX2 += iZ9;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 28:
                    i11 = i16;
                    i12 = i18;
                    List list7 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls8 = X.f12416a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iZ7 = 0;
                    } else {
                        iZ7 = C0737k.Z(i19) * size9;
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int size10 = ((C0733g) list7.get(i30)).size();
                            iZ7 += C0737k.a0(size10) + size10;
                        }
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 29:
                    i11 = i16;
                    i12 = i18;
                    List list8 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls9 = X.f12416a;
                    size = list8.size();
                    if (size == 0) {
                        iZ7 = 0;
                    } else {
                        i13 = X.h(list8);
                        iZ8 = C0737k.Z(i19);
                        iZ7 = (iZ8 * size) + i13;
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 30:
                    i11 = i16;
                    i12 = i18;
                    List list9 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls10 = X.f12416a;
                    size = list9.size();
                    if (size == 0) {
                        iZ7 = 0;
                    } else {
                        i13 = X.a(list9);
                        iZ8 = C0737k.Z(i19);
                        iZ7 = (iZ8 * size) + i13;
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 31:
                    iC = X.b(i19, (List) unsafe.getObject(abstractC0746u2, j));
                    iX2 += iC;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 32:
                    iC = X.c(i19, (List) unsafe.getObject(abstractC0746u2, j));
                    iX2 += iC;
                    i16 = i16;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 33:
                    i11 = i16;
                    i12 = i18;
                    List list10 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls11 = X.f12416a;
                    size = list10.size();
                    if (size == 0) {
                        iZ7 = 0;
                    } else {
                        i13 = X.f(list10);
                        iZ8 = C0737k.Z(i19);
                        iZ7 = (iZ8 * size) + i13;
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 34:
                    i11 = i16;
                    i12 = i18;
                    List list11 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls12 = X.f12416a;
                    size = list11.size();
                    if (size == 0) {
                        iZ7 = 0;
                    } else {
                        i13 = X.g(list11);
                        iZ8 = C0737k.Z(i19);
                        iZ7 = (iZ8 * size) + i13;
                    }
                    iX2 += iZ7;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 35:
                    i11 = i16;
                    i12 = i18;
                    List list12 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls13 = X.f12416a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 36:
                    i11 = i16;
                    i12 = i18;
                    List list13 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls14 = X.f12416a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 37:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.e((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 38:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.i((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 39:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.d((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 40:
                    i11 = i16;
                    i12 = i18;
                    List list14 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls15 = X.f12416a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 41:
                    i11 = i16;
                    i12 = i18;
                    List list15 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls16 = X.f12416a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 42:
                    i11 = i16;
                    i12 = i18;
                    List list16 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls17 = X.f12416a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 43:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.h((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 44:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.a((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 45:
                    i11 = i16;
                    i12 = i18;
                    List list17 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls18 = X.f12416a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 46:
                    i11 = i16;
                    i12 = i18;
                    List list18 = (List) unsafe.getObject(abstractC0746u2, j);
                    Class cls19 = X.f12416a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 47:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.f((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 48:
                    i11 = i16;
                    i12 = i18;
                    size2 = X.g((List) unsafe.getObject(abstractC0746u2, j));
                    if (size2 > 0) {
                        iZ10 = C0737k.Z(i19);
                        iA0 = C0737k.a0(size2);
                        iX2 += iA0 + iZ10 + size2;
                    }
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 49:
                    i11 = i16;
                    i12 = i18;
                    List list19 = (List) unsafe.getObject(abstractC0746u2, j);
                    W wM3 = m10.m(i17);
                    Class cls20 = X.f12416a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i31 = 0; i31 < size11; i31++) {
                            iA2 += ((AbstractC0727a) list19.get(i31)).a(wM3) + (C0737k.Z(i19) * 2);
                        }
                    }
                    iX2 += iA2;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0746u2, j);
                    Object obj2 = m10.f12391b[(i17 / 3) * 2];
                    m10.f12400m.getClass();
                    H h7 = (H) object3;
                    G g = (G) obj2;
                    if (h7.isEmpty()) {
                        iA1 = 0;
                    } else {
                        Iterator it = h7.entrySet().iterator();
                        iA1 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g.getClass();
                            int iZ16 = C0737k.Z(i19);
                            F f3 = g.f12382a;
                            char c11 = c10;
                            r0 r0Var2 = f3.f12379a;
                            int i32 = C0742p.f12490c;
                            int iZ17 = C0737k.Z(i22);
                            int i33 = i22;
                            o0 o0Var = r0.f12501u;
                            if (r0Var2 == o0Var) {
                                iZ17 *= 2;
                            }
                            int i34 = i16;
                            int i35 = i18;
                            switch (r0Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iB2 = 8;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i36 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i36) + i36 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i37 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i37) + i37 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i38 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i38) + i38 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i39 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i39) + i39 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i310 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i310) + i310 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311) + i311 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i312 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i312) + i312 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i313 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i313) + i313 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i314 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i314) + i314 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i315 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i315) + i315 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i316 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i316) + i316 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i317 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i317) + i317 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i318 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i318) + i318 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i319 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i319) + i319 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3110) + i3110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111) + i3111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i3112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3112) + i3112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue >> c11) ^ (jLongValue << i33));
                                            int i3113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3113) + i3113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iB2 = 4;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i3114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3114) + i3114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i3115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3115) + i3115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3116) + i3116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3117) + i3117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3118) + i3118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3119) + i3119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31110) + i31110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111) + i31111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31112) + i31112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31113) + i31113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i31114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31114) + i31114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i31115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31115) + i31115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31116) + i31116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31117) + i31117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31118) + i31118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31119) + i31119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i311110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311110) + i311110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue2 >> c11) ^ (jLongValue2 << i33));
                                            int i311111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111) + i311111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    it = it;
                                    iB2 = C0737k.b0(((Long) key).longValue());
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311112) + i311112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311113) + i311113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311114) + i311114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311115) + i311115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311116) + i311116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311117) + i311117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311118) + i311118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311119) + i311119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111110) + i3111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111) + i3111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111112) + i3111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111113) + i3111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i3111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111114) + i3111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111115) + i3111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111116) + i3111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111117) + i3111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i3111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111118) + i3111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue3 >> c11) ^ (jLongValue3 << i33));
                                            int i3111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111119) + i3111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    iB2 = C0737k.b0(((Long) key).longValue());
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i31111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111110) + i31111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i31111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111) + i31111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111112) + i31111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111113) + i31111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111114) + i31111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111115) + i31111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111116) + i31111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111117) + i31111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111118) + i31111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111119) + i31111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i311111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111110) + i311111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i311111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111) + i311111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i311111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111112) + i311111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111113) + i311111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111114) + i311111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111115) + i311111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i311111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111116) + i311111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue4 >> c11) ^ (jLongValue4 << i33));
                                            int i311111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111117) + i311111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    it = it;
                                    iB2 = C0737k.b0(((Integer) key).intValue());
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111118) + i311111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111119) + i311111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111110) + i3111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111) + i3111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111112) + i3111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111113) + i3111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111114) + i3111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i3111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111115) + i3111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111116) + i3111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111117) + i3111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111118) + i3111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111119) + i3111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111110) + i31111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111) + i31111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111112) + i31111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111113) + i31111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i31111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111114) + i31111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue5 >> c11) ^ (jLongValue5 << i33));
                                            int i31111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111115) + i31111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iB2 = 8;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i31111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111116) + i31111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i31111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111117) + i31111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111118) + i31111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111119) + i31111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111110) + i311111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111) + i311111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111112) + i311111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111113) + i311111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i311111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111114) + i311111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i311111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111115) + i311111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i311111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111116) + i311111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i311111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111117) + i311111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i311111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111118) + i311111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111119) + i311111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111110) + i3111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111) + i3111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i3111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111112) + i3111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue6 >> c11) ^ (jLongValue6 << i33));
                                            int i3111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111113) + i3111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iB2 = 4;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i3111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111114) + i3111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i3111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111115) + i3111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111116) + i3111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111117) + i3111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111118) + i3111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111119) + i3111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111110) + i31111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111) + i31111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111112) + i31111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111113) + i31111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i31111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111114) + i31111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i31111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111115) + i31111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111116) + i31111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111117) + i31111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111118) + i31111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111119) + i31111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i311111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111110) + i311111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue7 >> c11) ^ (jLongValue7 << i33));
                                            int i311111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111) + i311111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iB2 = i33;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111112) + i311111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111113) + i311111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111114) + i311111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111115) + i311111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111116) + i311111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111117) + i311111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111118) + i311111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111119) + i311111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111110) + i3111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111) + i3111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111112) + i3111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111113) + i3111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i3111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111114) + i3111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111115) + i3111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111116) + i3111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111117) + i3111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i3111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111118) + i3111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue8 >> c11) ^ (jLongValue8 << i33));
                                            int i3111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111119) + i3111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    it = it;
                                    if (key instanceof C0733g) {
                                        size3 = ((C0733g) key).size();
                                        iA3 = C0737k.a0(size3);
                                        iB2 = iA3 + size3;
                                    } else {
                                        iB2 = C0737k.Y((String) key);
                                    }
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111110) + i31111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111) + i31111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111112) + i31111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111113) + i31111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111114) + i31111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111115) + i31111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111116) + i31111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111117) + i31111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111118) + i31111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111119) + i31111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i311111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111110) + i311111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i311111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111) + i311111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i311111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111112) + i311111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111113) + i311111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111114) + i311111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111115) + i311111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i311111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111116) + i311111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue9 >> c11) ^ (jLongValue9 << i33));
                                            int i311111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111117) + i311111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    it = it;
                                    iB2 = ((AbstractC0746u) ((AbstractC0727a) key)).a(null);
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111118) + i311111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111119) + i311111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111110) + i3111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111) + i3111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111112) + i3111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111113) + i3111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111114) + i3111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i3111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111115) + i3111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111116) + i3111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111117) + i3111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111118) + i3111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111119) + i3111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111110) + i31111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111) + i31111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111112) + i31111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111113) + i31111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i31111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111114) + i31111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue10 >> c11) ^ (jLongValue10 << i33));
                                            int i31111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111115) + i31111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    it = it;
                                    int iA8 = ((AbstractC0746u) ((AbstractC0727a) key)).a(null);
                                    iB2 = C0737k.a0(iA8) + iA8;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111116) + i31111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111117) + i31111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111118) + i31111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111119) + i31111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111110) + i311111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111) + i311111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111112) + i311111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111113) + i311111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i311111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111114) + i311111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i311111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111115) + i311111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i311111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111116) + i311111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i311111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111117) + i311111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i311111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111118) + i311111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111119) + i311111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111110) + i3111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111) + i3111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i3111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111112) + i3111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue11 >> c11) ^ (jLongValue11 << i33));
                                            int i3111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111113) + i3111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    it = it;
                                    if (key instanceof C0733g) {
                                        size3 = ((C0733g) key).size();
                                        iA3 = C0737k.a0(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iA3 = C0737k.a0(size3);
                                    }
                                    iB2 = iA3 + size3;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111114) + i3111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111115) + i3111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111116) + i3111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111117) + i3111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111118) + i3111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111119) + i3111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111110) + i31111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111) + i31111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111112) + i31111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111113) + i31111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i31111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111114) + i31111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i31111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111115) + i31111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111116) + i31111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111117) + i31111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111118) + i31111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111119) + i31111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i311111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111110) + i311111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue12 >> c11) ^ (jLongValue12 << i33));
                                            int i311111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111) + i311111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    it = it;
                                    iB2 = C0737k.a0(((Integer) key).intValue());
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111112) + i311111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111113) + i311111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111114) + i311111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111115) + i311111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111116) + i311111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111117) + i311111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111118) + i311111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111119) + i311111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111110) + i3111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111) + i3111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111112) + i3111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111113) + i3111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i3111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111114) + i3111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111115) + i3111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111116) + i3111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111117) + i3111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i3111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111118) + i3111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue13 >> c11) ^ (jLongValue13 << i33));
                                            int i3111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111119) + i3111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                    it = it;
                                    iB2 = C0737k.b0(((Integer) key).intValue());
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111110) + i31111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111) + i31111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111112) + i31111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111113) + i31111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111114) + i31111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111115) + i31111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111116) + i31111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111117) + i31111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111118) + i31111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111119) + i31111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i311111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111110) + i311111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i311111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111) + i311111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i311111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111112) + i311111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111113) + i311111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111114) + i311111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111115) + i311111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i311111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111116) + i311111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue14 >> c11) ^ (jLongValue14 << i33));
                                            int i311111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111117) + i311111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                    ((Integer) key).getClass();
                                    iB2 = 4;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111118) + i311111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111119) + i311111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111110) + i3111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111) + i3111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111112) + i3111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111113) + i3111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111114) + i3111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i3111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111115) + i3111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111116) + i3111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111117) + i3111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111118) + i3111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111119) + i3111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111110) + i31111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111) + i31111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111112) + i31111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111113) + i31111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i31111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111114) + i31111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue15 >> c11) ^ (jLongValue15 << i33));
                                            int i31111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111115) + i31111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                    ((Long) key).getClass();
                                    iB2 = 8;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111116) + i31111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111117) + i31111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111118) + i31111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i31111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111119) + i31111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111110) + i311111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111) + i311111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111112) + i311111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111113) + i311111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i311111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111114) + i311111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i311111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111115) + i311111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i311111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111116) + i311111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i311111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111117) + i311111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i311111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111118) + i311111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111119) + i311111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111110) + i3111111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111) + i3111111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            int i3111111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111112) + i3111111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue16 >> c11) ^ (jLongValue16 << i33));
                                            int i3111111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111113) + i3111111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iB2 = C0737k.a0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    it = it;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111114) + i3111111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111115) + i3111111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111116) + i3111111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i3111111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111117) + i3111111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111118) + i3111111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111119) + i3111111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111110) + i31111111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i31111111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111111) + i31111111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i31111111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111112) + i31111111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i31111111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111113) + i31111111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i31111111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111114) + i31111111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i31111111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111115) + i31111111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i31111111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111116) + i31111111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i31111111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111117) + i31111111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i31111111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111118) + i31111111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i31111111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i31111111111111111111111111111119) + i31111111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i311111111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111110) + i311111111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue17 >> c11) ^ (jLongValue17 << i33));
                                            int i311111111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111111) + i311111111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iB2 = C0737k.b0((jLongValue18 << i33) ^ (jLongValue18 >> c11));
                                    it = it;
                                    i14 = iB2 + iZ17;
                                    r0Var = f3.f12380b;
                                    iZ11 = C0737k.Z(2);
                                    if (r0Var == o0Var) {
                                        iZ11 *= 2;
                                    }
                                    switch (r0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111112) + i311111111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111113) + i311111111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 2:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311111111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111114) + i311111111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 3:
                                            iB3 = C0737k.b0(((Long) value).longValue());
                                            int i311111111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111115) + i311111111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 4:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i311111111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111116) + i311111111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i311111111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111117) + i311111111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i311111111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111118) + i311111111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB3 = i33;
                                            int i311111111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i311111111111111111111111111111119) + i311111111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 8:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                                iB3 = size4 + iA4;
                                            } else {
                                                iB3 = C0737k.Y((String) value);
                                            }
                                            int i3111111111111111111111111111111110 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111110) + i3111111111111111111111111111111110 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 9:
                                            iB3 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            int i3111111111111111111111111111111111 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111111) + i3111111111111111111111111111111111 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 10:
                                            size4 = ((AbstractC0746u) ((AbstractC0727a) value)).a(null);
                                            iA4 = C0737k.a0(size4);
                                            iB3 = size4 + iA4;
                                            int i3111111111111111111111111111111112 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111112) + i3111111111111111111111111111111112 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 11:
                                            if (value instanceof C0733g) {
                                                size4 = ((C0733g) value).size();
                                                iA4 = C0737k.a0(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iA4 = C0737k.a0(size4);
                                            }
                                            iB3 = size4 + iA4;
                                            int i3111111111111111111111111111111113 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111113) + i3111111111111111111111111111111113 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 12:
                                            iB3 = C0737k.a0(((Integer) value).intValue());
                                            int i3111111111111111111111111111111114 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111114) + i3111111111111111111111111111111114 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                                            iB3 = C0737k.b0(((Integer) value).intValue());
                                            int i3111111111111111111111111111111115 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111115) + i3111111111111111111111111111111115 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                                            ((Integer) value).getClass();
                                            iB3 = 4;
                                            int i3111111111111111111111111111111116 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111116) + i3111111111111111111111111111111116 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                                            ((Long) value).getClass();
                                            iB3 = 8;
                                            int i3111111111111111111111111111111117 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111117) + i3111111111111111111111111111111117 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iB3 = C0737k.a0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i3111111111111111111111111111111118 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111118) + i3111111111111111111111111111111118 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iB3 = C0737k.b0((jLongValue19 >> c11) ^ (jLongValue19 << i33));
                                            int i3111111111111111111111111111111119 = iB3 + iZ11 + i14;
                                            iA1 += C0737k.a0(i3111111111111111111111111111111119) + i3111111111111111111111111111111119 + iZ16;
                                            it = it;
                                            c10 = c11;
                                            i22 = i33;
                                            i16 = i34;
                                            i18 = i35;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i11 = i16;
                    i12 = i18;
                    iX2 += iA1;
                    i16 = i11;
                    i18 = i12;
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 51:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iZ = C0737k.Z(i19);
                        iA = iZ + 8;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 52:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iZ12 = C0737k.Z(i19);
                        iA = iZ12 + 4;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 53:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        long jZ = z(j, abstractC0746u2);
                        iZ13 = C0737k.Z(i19);
                        iB4 = C0737k.b0(jZ);
                        iA5 = iB4 + iZ13;
                        iX2 += iA5;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 54:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        long jZ2 = z(j, abstractC0746u2);
                        iZ13 = C0737k.Z(i19);
                        iB4 = C0737k.b0(jZ2);
                        iA5 = iB4 + iZ13;
                        iX2 += iA5;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 55:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        int iY = y(j, abstractC0746u2);
                        iZ14 = C0737k.Z(i19);
                        iB5 = C0737k.b0(iY);
                        iA = iB5 + iZ14;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 56:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iZ = C0737k.Z(i19);
                        iA = iZ + 8;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 57:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iZ12 = C0737k.Z(i19);
                        iA = iZ12 + 4;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 58:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iA = C0737k.Z(i19) + 1;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 59:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        Object object4 = unsafe.getObject(abstractC0746u2, j);
                        iX2 = (object4 instanceof C0733g ? C0737k.X(i19, (C0733g) object4) : C0737k.Y((String) object4) + C0737k.Z(i19)) + iX2;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 60:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        Object object5 = unsafe.getObject(abstractC0746u2, j);
                        W wM4 = m10.m(i17);
                        Class cls21 = X.f12416a;
                        int iZ18 = C0737k.Z(i19);
                        int iA9 = ((AbstractC0727a) object5).a(wM4);
                        iA5 = C0737k.a0(iA9) + iA9 + iZ18;
                        iX2 += iA5;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 61:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iA = C0737k.X(i19, (C0733g) unsafe.getObject(abstractC0746u2, j));
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 62:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        int iY2 = y(j, abstractC0746u2);
                        iZ14 = C0737k.Z(i19);
                        iB5 = C0737k.a0(iY2);
                        iA = iB5 + iZ14;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 63:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        int iY3 = y(j, abstractC0746u2);
                        iZ14 = C0737k.Z(i19);
                        iB5 = C0737k.b0(iY3);
                        iA = iB5 + iZ14;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 64:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iZ12 = C0737k.Z(i19);
                        iA = iZ12 + 4;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 65:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iZ = C0737k.Z(i19);
                        iA = iZ + 8;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 66:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        int iY4 = y(j, abstractC0746u2);
                        iZ14 = C0737k.Z(i19);
                        iB5 = C0737k.a0((iY4 >> 31) ^ (iY4 << 1));
                        iA = iB5 + iZ14;
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 67:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        long jZ3 = z(j, abstractC0746u2);
                        iZ13 = C0737k.Z(i19);
                        iB4 = C0737k.b0((jZ3 << 1) ^ (jZ3 >> 63));
                        iA5 = iB4 + iZ13;
                        iX2 += iA5;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                case 68:
                    if (m10.q(i19, i17, abstractC0746u2)) {
                        iA = ((AbstractC0727a) unsafe.getObject(abstractC0746u2, j)).a(m10.m(i17)) + (C0737k.Z(i19) * 2);
                        iX2 += iA;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    break;
                default:
                    i17 += 3;
                    i15 = 1048575;
                    break;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0746u i() {
        this.j.getClass();
        return ((AbstractC0746u) this.f12394e).i();
    }

    public final boolean j(AbstractC0746u abstractC0746u, AbstractC0746u abstractC0746u2, int i10) {
        return n(i10, abstractC0746u) == n(i10, abstractC0746u2);
    }

    public final void k(int i10, Object obj, Object obj2) {
        int i11 = this.f12390a[i10];
        if (j0.f12474c.h(L(i10) & 1048575, obj) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.f12391b[((i10 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f12391b;
        W w9 = (W) objArr[i11];
        if (w9 != null) {
            return w9;
        }
        W wA = T.f12406c.a((Class) objArr[i11 + 1]);
        objArr[i11] = wA;
        return wA;
    }

    public final boolean n(int i10, Object obj) {
        int i11 = this.f12390a[i10 + 2];
        long j = i11 & 1048575;
        if (j == 1048575) {
            int iL = L(i10);
            long j10 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(j0.f12474c.d(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j0.f12474c.e(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (j0.f12474c.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (j0.f12474c.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (j0.f12474c.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (j0.f12474c.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (j0.f12474c.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return j0.f12474c.c(j10, obj);
                case 8:
                    Object objH = j0.f12474c.h(j10, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof C0733g) {
                        return !C0733g.f12451t.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j0.f12474c.h(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0733g.f12451t.equals(j0.f12474c.h(j10, obj));
                case 11:
                    if (j0.f12474c.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j0.f12474c.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    if (j0.f12474c.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    if (j0.f12474c.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    if (j0.f12474c.f(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    if (j0.f12474c.g(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j0.f12474c.h(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & j0.f12474c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return n(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean q(int i10, int i11, Object obj) {
        return j0.f12474c.f((long) (this.f12390a[i11 + 2] & 1048575), obj) == i10;
    }

    public final void r(Object obj, int i10, Object obj2, C0739m c0739m, E2.A a9) throws C0749x {
        long jL = L(i10) & 1048575;
        Object objH = j0.f12474c.h(jL, obj);
        I i11 = this.f12400m;
        if (objH == null) {
            i11.getClass();
            objH = H.f12383s.b();
            j0.o(jL, obj, objH);
        } else {
            i11.getClass();
            if (!((H) objH).f12384r) {
                H hB = H.f12383s.b();
                I.a(hB, objH);
                j0.o(jL, obj, hB);
                objH = hB;
            }
        }
        i11.getClass();
        H h7 = (H) objH;
        F f3 = ((G) obj2).f12382a;
        a9.E(2);
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) a9.f1437e;
        int i12 = abstractC0244b0.i(abstractC0244b0.A());
        Object obj3 = f3.f12381c;
        Object objQ = "";
        Object objQ2 = obj3;
        while (true) {
            try {
                int iG = a9.g();
                if (iG == Integer.MAX_VALUE || abstractC0244b0.c()) {
                    break;
                }
                if (iG == 1) {
                    objQ = a9.q(f3.f12379a, null, null);
                } else if (iG != 2) {
                    try {
                        if (!a9.F()) {
                            throw new C0750y("Unable to parse map entry.");
                        }
                    } catch (C0749x unused) {
                        if (!a9.F()) {
                            throw new C0750y("Unable to parse map entry.");
                        }
                    }
                } else {
                    objQ2 = a9.q(f3.f12380b, obj3.getClass(), c0739m);
                }
            } catch (Throwable th) {
                abstractC0244b0.h(i12);
                throw th;
            }
        }
        h7.put(objQ, objQ2);
        abstractC0244b0.h(i12);
    }

    public final void s(int i10, Object obj, Object obj2) {
        if (n(i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f12389o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12390a[i10] + " is present but null: " + obj2);
            }
            W wM = m(i10);
            if (!n(i10, obj)) {
                if (p(object)) {
                    AbstractC0746u abstractC0746uI = wM.i();
                    wM.b(abstractC0746uI, object);
                    unsafe.putObject(obj, jL, abstractC0746uI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                AbstractC0746u abstractC0746uI2 = wM.i();
                wM.b(abstractC0746uI2, object2);
                unsafe.putObject(obj, jL, abstractC0746uI2);
                object2 = abstractC0746uI2;
            }
            wM.b(object2, object);
        }
    }

    public final void t(int i10, Object obj, Object obj2) {
        int[] iArr = this.f12390a;
        int i11 = iArr[i10];
        if (q(i11, i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f12389o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            W wM = m(i10);
            if (!q(i11, i10, obj)) {
                if (p(object)) {
                    AbstractC0746u abstractC0746uI = wM.i();
                    wM.b(abstractC0746uI, object);
                    unsafe.putObject(obj, jL, abstractC0746uI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                AbstractC0746u abstractC0746uI2 = wM.i();
                wM.b(abstractC0746uI2, object2);
                unsafe.putObject(obj, jL, abstractC0746uI2);
                object2 = abstractC0746uI2;
            }
            wM.b(object2, object);
        }
    }

    public final Object u(int i10, Object obj) {
        W wM = m(i10);
        long jL = L(i10) & 1048575;
        if (!n(i10, obj)) {
            return wM.i();
        }
        Object object = f12389o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        AbstractC0746u abstractC0746uI = wM.i();
        if (object != null) {
            wM.b(abstractC0746uI, object);
        }
        return abstractC0746uI;
    }

    public final Object v(int i10, int i11, Object obj) {
        W wM = m(i11);
        if (!q(i10, i11, obj)) {
            return wM.i();
        }
        Object object = f12389o.getObject(obj, L(i11) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0746u abstractC0746uI = wM.i();
        if (object != null) {
            wM.b(abstractC0746uI, object);
        }
        return abstractC0746uI;
    }
}
