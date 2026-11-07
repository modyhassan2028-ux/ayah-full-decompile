package Da;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class k implements Serializable, Comparable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f1363u = new k(new byte[0]);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f1364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient int f1365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient String f1366t;

    public k(byte[] bArr) {
        p251z9.j.e(bArr, "data");
        this.f1364r = bArr;
    }

    public int a() {
        return this.f1364r.length;
    }

    public String b() {
        byte[] bArr = this.f1364r;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b5 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = Ea.b.f2005a;
            cArr[i10] = cArr2[(b5 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f1364r;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        p251z9.j.e(kVar, "other");
        int iA = a();
        int iA2 = kVar.a();
        int iMin = Math.min(iA, iA2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iD = d(i10) & 255;
            int iD2 = kVar.d(i10) & 255;
            if (iD != iD2) {
                return iD < iD2 ? -1 : 1;
            }
        }
        if (iA == iA2) {
            return 0;
        }
        return iA < iA2 ? -1 : 1;
    }

    public byte d(int i10) {
        return this.f1364r[i10];
    }

    public boolean e(int i10, byte[] bArr, int i11, int i12) {
        p251z9.j.e(bArr, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f1364r;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && F9.n.f(i10, i11, i12, bArr2, bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            int iA = kVar.a();
            byte[] bArr = this.f1364r;
            if (iA == bArr.length && kVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(k kVar, int i10) {
        p251z9.j.e(kVar, "other");
        return kVar.e(0, this.f1364r, 0, i10);
    }

    public String g(Charset charset) {
        p251z9.j.e(charset, "charset");
        return new String(this.f1364r, charset);
    }

    public k h(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = a();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1364r;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.A(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new k(p120l9.l.c0(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public int hashCode() {
        int i10 = this.f1365s;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f1364r);
        this.f1365s = iHashCode;
        return iHashCode;
    }

    public k i() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f1364r;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b5 = bArr[i10];
            if (b5 >= 65 && b5 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                p251z9.j.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b5 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b10 = bArrCopyOf[i11];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i11] = (byte) (b10 + 32);
                    }
                }
                return new k(bArrCopyOf);
            }
            i10++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f1364r;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        p251z9.j.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String k() {
        String str = this.f1366t;
        if (str != null) {
            return str;
        }
        byte[] bArrC = c();
        p251z9.j.e(bArrC, "<this>");
        String str2 = new String(bArrC, H9.a.f3610a);
        this.f1366t = str2;
        return str2;
    }

    public void l(h hVar, int i10) {
        hVar.L(i10, this.f1364r);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b5;
        int i10;
        byte[] bArr = this.f1364r;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if ((b10 >> 5) != -2) {
                    if ((b10 >> 4) != -2) {
                        if ((b10 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b11 = bArr[i11 + 1];
                            if ((b11 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b12 = bArr[i11 + 2];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b13 = bArr[i14];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b14 = bArr[i11 + 1];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b15 = bArr[i16];
                            if ((b15 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b15 ^ (-123008)) ^ (b14 << 6)) ^ (b10 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b16 = bArr[i18];
                        if ((b16 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b16 ^ 3968) ^ (b10 << 6);
                        if (i19 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                    i12 += b10 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i20;
                        if (i11 < length && (b5 = bArr[i11]) >= 0) {
                            i11++;
                            i20 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b5 == 10 || b5 == 13 || ((b5 < 0 || b5 >= 32) && (127 > b5 || b5 >= 160))) && b5 != 65533) {
                                i12 += b5 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strK = k();
            String strSubstring = strK.substring(0, i12);
            p251z9.j.d(strSubstring, "substring(...)");
            String strP0 = H9.v.P0(H9.v.P0(H9.v.P0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strK.length()) {
                return p245z2.a.A(']', "[text=", strP0);
            }
            return "[size=" + bArr.length + " text=" + strP0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.A(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new k(p120l9.l.c0(bArr, 0, 64))).b());
        sb.append("…]");
        return sb.toString();
    }
}
