package Ea;

import Da.h;
import Da.k;
import Da.p;
import Da.u;
import F9.n;
import java.io.EOFException;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f2003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f2004b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(H9.a.f3610a);
        j.d(bytes, "getBytes(...)");
        f2003a = bytes;
        f2004b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(h hVar, k kVar, long j, long j10, int i10) {
        u uVar;
        byte[] bArr;
        long j11 = j;
        long j12 = j10;
        j.e(hVar, "<this>");
        j.e(kVar, "bytes");
        long j13 = i10;
        n.m(kVar.a(), 0, j13);
        if (i10 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j14 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        if (j11 > j12) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j11 + " > " + j12).toString());
        }
        long j15 = hVar.f1362s;
        if (j12 > j15) {
            j12 = j15;
        }
        if (j11 == j12 || (uVar = hVar.f1361r) == null) {
            return -1L;
        }
        if (j15 - j11 >= j11) {
            while (true) {
                long j16 = ((long) (uVar.f1397c - uVar.f1396b)) + j14;
                if (j16 > j11) {
                    break;
                }
                uVar = uVar.f1400f;
                j.b(uVar);
                j14 = j16;
            }
            byte[] bArrC = kVar.c();
            byte b5 = bArrC[0];
            long jMin = Math.min(j12, (hVar.f1362s - j13) + 1);
            while (j14 < jMin) {
                byte[] bArr2 = uVar.f1395a;
                int iMin = (int) Math.min(uVar.f1397c, (((long) uVar.f1396b) + jMin) - j14);
                for (int i11 = (int) ((((long) uVar.f1396b) + j11) - j14); i11 < iMin; i11++) {
                    if (bArr2[i11] == b5 && b(uVar, i11 + 1, bArrC, 1, i10)) {
                        return ((long) (i11 - uVar.f1396b)) + j14;
                    }
                }
                j14 += (long) (uVar.f1397c - uVar.f1396b);
                uVar = uVar.f1400f;
                j.b(uVar);
                j11 = j14;
            }
            return -1L;
        }
        while (j15 > j11) {
            uVar = uVar.g;
            j.b(uVar);
            j15 -= (long) (uVar.f1397c - uVar.f1396b);
        }
        byte[] bArrC2 = kVar.c();
        byte b10 = bArrC2[0];
        byte[] bArr3 = bArrC2;
        long jMin2 = Math.min(j12, (hVar.f1362s - j13) + 1);
        while (j15 < jMin2) {
            byte[] bArr4 = uVar.f1395a;
            int iMin2 = (int) Math.min(uVar.f1397c, (((long) uVar.f1396b) + jMin2) - j15);
            int i12 = (int) ((((long) uVar.f1396b) + j11) - j15);
            while (i12 < iMin2) {
                if (bArr4[i12] == b10) {
                    bArr = bArr3;
                    if (b(uVar, i12 + 1, bArr, 1, i10)) {
                        return ((long) (i12 - uVar.f1396b)) + j15;
                    }
                } else {
                    bArr = bArr3;
                }
                i12++;
                bArr3 = bArr;
            }
            j15 += (long) (uVar.f1397c - uVar.f1396b);
            uVar = uVar.f1400f;
            j.b(uVar);
            j11 = j15;
        }
        return -1L;
    }

    public static final boolean b(u uVar, int i10, byte[] bArr, int i11, int i12) {
        int i13 = uVar.f1397c;
        byte[] bArr2 = uVar.f1395a;
        while (i11 < i12) {
            if (i10 == i13) {
                uVar = uVar.f1400f;
                j.b(uVar);
                byte[] bArr3 = uVar.f1395a;
                bArr2 = bArr3;
                i10 = uVar.f1396b;
                i13 = uVar.f1397c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String c(long j, h hVar) throws EOFException {
        if (j > 0) {
            long j10 = j - 1;
            if (hVar.e(j10) == 13) {
                String strA = hVar.A(j10, H9.a.f3610a);
                hVar.skip(2L);
                return strA;
            }
        }
        String strA2 = hVar.A(j, H9.a.f3610a);
        hVar.skip(1L);
        return strA2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e A[LOOP:0: B:8:0x0019->B:49:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[SYNTHETIC] */
    public static final int d(h hVar, p pVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        u uVar;
        int i13;
        u uVar2 = hVar.f1361r;
        if (uVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = uVar2.f1395a;
        int i14 = uVar2.f1396b;
        int i15 = uVar2.f1397c;
        int[] iArr = pVar.f1379s;
        u uVar3 = uVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArr[i17];
            int i20 = i17 + 2;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (uVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                int i22 = i14 + 1;
                int i23 = bArr[i14] & 255;
                int i24 = i20 + i19;
                while (i20 != i24) {
                    if (i23 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i22 == i15) {
                            uVar3 = uVar3.f1400f;
                            j.b(uVar3);
                            int i25 = uVar3.f1396b;
                            byte[] bArr2 = uVar3.f1395a;
                            i11 = uVar3.f1397c;
                            if (uVar3 == uVar2) {
                                i12 = i25;
                                bArr = bArr2;
                                uVar3 = null;
                            } else {
                                i12 = i25;
                                bArr = bArr2;
                            }
                        } else {
                            i11 = i15;
                            i12 = i22;
                        }
                        if (i10 >= 0) {
                            return i10;
                        }
                        int i26 = i11;
                        i17 = -i10;
                        i14 = i12;
                        i15 = i26;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i27 = (i19 * (-1)) + i20;
            while (true) {
                int i28 = i14 + 1;
                int i29 = i20 + 1;
                if ((bArr[i14] & 255) == iArr[i20]) {
                    boolean z11 = i29 == i27;
                    if (i28 == i15) {
                        j.b(uVar3);
                        u uVar4 = uVar3.f1400f;
                        j.b(uVar4);
                        i12 = uVar4.f1396b;
                        byte[] bArr3 = uVar4.f1395a;
                        i13 = uVar4.f1397c;
                        if (uVar4 != uVar2) {
                            uVar = uVar4;
                            bArr = bArr3;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr3;
                            uVar = null;
                        }
                    } else {
                        uVar = uVar3;
                        i13 = i15;
                        i12 = i28;
                    }
                    if (z11) {
                        i10 = iArr[i29];
                        int i30 = i13;
                        uVar3 = uVar;
                        i11 = i30;
                        break;
                    }
                    i14 = i12;
                    i15 = i13;
                    uVar3 = uVar;
                    i20 = i29;
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            int i210 = i11;
            i17 = -i10;
            i14 = i12;
            i15 = i210;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }
}
