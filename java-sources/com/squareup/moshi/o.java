package com.squareup.moshi;

import androidx.datastore.preferences.protobuf.C0736j;
import io.realm.RealmFieldTypeConstants;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Da.k f15454D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Da.k f15455E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Da.k f15456F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Da.k f15457G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Da.k f15458H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15459A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f15460B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public r f15461C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Da.j f15462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Da.h f15463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f15465z;

    static {
        Da.k kVar = Da.k.f1363u;
        f15454D = R7.f.m("'\\");
        f15455E = R7.f.m("\"\\");
        f15456F = R7.f.m("{}[]:, \n\t\r\f/\\;#=");
        f15457G = R7.f.m("\n\r");
        f15458H = R7.f.m("*/");
    }

    public o(Da.j jVar) {
        this.f15450s = new int[32];
        this.f15451t = new String[32];
        this.f15452u = new int[32];
        this.f15464y = 0;
        this.f15462w = jVar;
        this.f15463x = jVar.a();
        O(6);
    }

    @Override // com.squareup.moshi.n
    public final boolean A() throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 5) {
            this.f15464y = 0;
            int[] iArr = this.f15452u;
            int i10 = this.f15449r - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iF0 == 6) {
            this.f15464y = 0;
            int[] iArr2 = this.f15452u;
            int i11 = this.f15449r - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new A6.a("Expected a boolean but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
    }

    @Override // com.squareup.moshi.n
    public final double E() throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 16) {
            this.f15464y = 0;
            int[] iArr = this.f15452u;
            int i10 = this.f15449r - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f15465z;
        }
        if (iF0 == 17) {
            long j = this.f15459A;
            Da.h hVar = this.f15463x;
            hVar.getClass();
            this.f15460B = hVar.A(j, H9.a.f3610a);
        } else if (iF0 == 9) {
            this.f15460B = l0(f15455E);
        } else if (iF0 == 8) {
            this.f15460B = l0(f15454D);
        } else if (iF0 == 10) {
            this.f15460B = m0();
        } else if (iF0 != 11) {
            throw new A6.a("Expected a double but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
        this.f15464y = 11;
        try {
            double d5 = Double.parseDouble(this.f15460B);
            if (!this.f15453v && (Double.isNaN(d5) || Double.isInfinite(d5))) {
                throw new C0736j("JSON forbids NaN and infinities: " + d5 + " at path " + s());
            }
            this.f15460B = null;
            this.f15464y = 0;
            int[] iArr2 = this.f15452u;
            int i11 = this.f15449r - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d5;
        } catch (NumberFormatException unused) {
            throw new A6.a("Expected a double but was " + this.f15460B + " at path " + s());
        }
    }

    @Override // com.squareup.moshi.n
    public final int F() throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 16) {
            long j = this.f15465z;
            int i10 = (int) j;
            if (j == i10) {
                this.f15464y = 0;
                int[] iArr = this.f15452u;
                int i11 = this.f15449r - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new A6.a("Expected an int but was " + this.f15465z + " at path " + s());
        }
        if (iF0 == 17) {
            long j10 = this.f15459A;
            Da.h hVar = this.f15463x;
            hVar.getClass();
            this.f15460B = hVar.A(j10, H9.a.f3610a);
        } else if (iF0 == 9 || iF0 == 8) {
            String strL0 = iF0 == 9 ? l0(f15455E) : l0(f15454D);
            this.f15460B = strL0;
            try {
                int i12 = Integer.parseInt(strL0);
                this.f15464y = 0;
                int[] iArr2 = this.f15452u;
                int i13 = this.f15449r - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iF0 != 11) {
            throw new A6.a("Expected an int but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
        this.f15464y = 11;
        try {
            double d5 = Double.parseDouble(this.f15460B);
            int i14 = (int) d5;
            if (i14 != d5) {
                throw new A6.a("Expected an int but was " + this.f15460B + " at path " + s());
            }
            this.f15460B = null;
            this.f15464y = 0;
            int[] iArr3 = this.f15452u;
            int i15 = this.f15449r - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new A6.a("Expected an int but was " + this.f15460B + " at path " + s());
        }
    }

    @Override // com.squareup.moshi.n
    public final void H() {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 7) {
            this.f15464y = 0;
            int[] iArr = this.f15452u;
            int i10 = this.f15449r - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new A6.a("Expected null but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
    }

    @Override // com.squareup.moshi.n
    public final String L() throws C0736j, EOFException {
        String strA;
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 10) {
            strA = m0();
        } else if (iF0 == 9) {
            strA = l0(f15455E);
        } else if (iF0 == 8) {
            strA = l0(f15454D);
        } else if (iF0 == 11) {
            strA = this.f15460B;
            this.f15460B = null;
        } else if (iF0 == 16) {
            strA = Long.toString(this.f15465z);
        } else {
            if (iF0 != 17) {
                throw new A6.a("Expected a string but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
            }
            long j = this.f15459A;
            Da.h hVar = this.f15463x;
            hVar.getClass();
            strA = hVar.A(j, H9.a.f3610a);
        }
        this.f15464y = 0;
        int[] iArr = this.f15452u;
        int i10 = this.f15449r - 1;
        iArr[i10] = iArr[i10] + 1;
        return strA;
    }

    @Override // com.squareup.moshi.n
    public final int N() {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        switch (iF0) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return 5;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.n
    public final int V(m mVar) throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 < 12 || iF0 > 15) {
            return -1;
        }
        if (iF0 == 15) {
            return g0(this.f15460B, mVar);
        }
        int iQ = this.f15462w.Q(mVar.f15448b);
        if (iQ != -1) {
            this.f15464y = 0;
            this.f15451t[this.f15449r - 1] = mVar.f15447a[iQ];
            return iQ;
        }
        String str = this.f15451t[this.f15449r - 1];
        String strJ0 = j0();
        int iG0 = g0(strJ0, mVar);
        if (iG0 == -1) {
            this.f15464y = 15;
            this.f15460B = strJ0;
            this.f15451t[this.f15449r - 1] = str;
        }
        return iG0;
    }

    @Override // com.squareup.moshi.n
    public final int X(m mVar) throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 < 8 || iF0 > 11) {
            return -1;
        }
        if (iF0 == 11) {
            return h0(this.f15460B, mVar);
        }
        int iQ = this.f15462w.Q(mVar.f15448b);
        if (iQ != -1) {
            this.f15464y = 0;
            int[] iArr = this.f15452u;
            int i10 = this.f15449r - 1;
            iArr[i10] = iArr[i10] + 1;
            return iQ;
        }
        String strL = L();
        int iH0 = h0(strL, mVar);
        if (iH0 == -1) {
            this.f15464y = 11;
            this.f15460B = strL;
            int[] iArr2 = this.f15452u;
            int i11 = this.f15449r - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iH0;
    }

    @Override // com.squareup.moshi.n
    public final void b() {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 3) {
            O(1);
            this.f15452u[this.f15449r - 1] = 0;
            this.f15464y = 0;
        } else {
            throw new A6.a("Expected BEGIN_ARRAY but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
    }

    @Override // com.squareup.moshi.n
    public final void b0() throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 14) {
            long jK = this.f15462w.K(f15456F);
            Da.h hVar = this.f15463x;
            if (jK == -1) {
                jK = hVar.f1362s;
            }
            hVar.skip(jK);
        } else if (iF0 == 13) {
            o0(f15455E);
        } else if (iF0 == 12) {
            o0(f15454D);
        } else if (iF0 != 15) {
            throw new A6.a("Expected a name but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
        this.f15464y = 0;
        this.f15451t[this.f15449r - 1] = "null";
    }

    @Override // com.squareup.moshi.n
    public final void c0() throws C0736j, EOFException {
        int i10 = 0;
        do {
            int iF0 = this.f15464y;
            if (iF0 == 0) {
                iF0 = f0();
            }
            if (iF0 == 3) {
                O(1);
            } else {
                if (iF0 == 1) {
                    O(3);
                } else if (iF0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new A6.a("Expected a value but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
                    }
                    this.f15449r--;
                } else if (iF0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new A6.a("Expected a value but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
                    }
                    this.f15449r--;
                } else {
                    Da.h hVar = this.f15463x;
                    if (iF0 == 14 || iF0 == 10) {
                        long jK = this.f15462w.K(f15456F);
                        if (jK == -1) {
                            jK = hVar.f1362s;
                        }
                        hVar.skip(jK);
                    } else if (iF0 == 9 || iF0 == 13) {
                        o0(f15455E);
                    } else if (iF0 == 8 || iF0 == 12) {
                        o0(f15454D);
                    } else if (iF0 == 17) {
                        hVar.skip(this.f15459A);
                    } else if (iF0 == 18) {
                        throw new A6.a("Expected a value but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
                    }
                }
                this.f15464y = 0;
            }
            i10++;
            this.f15464y = 0;
        } while (i10 != 0);
        int[] iArr = this.f15452u;
        int i11 = this.f15449r - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f15451t[i11] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15464y = 0;
        this.f15450s[0] = 8;
        this.f15449r = 1;
        Da.h hVar = this.f15463x;
        hVar.skip(hVar.f1362s);
        this.f15462w.close();
    }

    @Override // com.squareup.moshi.n
    public final void e() {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 1) {
            O(3);
            this.f15464y = 0;
        } else {
            throw new A6.a("Expected BEGIN_OBJECT but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
    }

    public final void e0() throws C0736j {
        if (this.f15453v) {
            return;
        }
        d0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015a  */
    /* JADX WARN: Code duplicated, block: B:104:0x016e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0177  */
    /* JADX WARN: Code duplicated, block: B:148:0x01df  */
    /* JADX WARN: Code duplicated, block: B:161:0x0205 A[DONT_INVERT, PHI: r3
      0x0205: PHI (r3v9 int) = (r3v8 int), (r3v12 int) binds: [B:147:0x01dd, B:153:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0207  */
    /* JADX WARN: Code duplicated, block: B:175:0x0225  */
    /* JADX WARN: Code duplicated, block: B:177:0x0229  */
    /* JADX WARN: Code duplicated, block: B:180:0x022e  */
    /* JADX WARN: Code duplicated, block: B:185:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:186:0x023c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0248  */
    /* JADX WARN: Code duplicated, block: B:190:0x0250  */
    /* JADX WARN: Code duplicated, block: B:200:0x026f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0285  */
    /* JADX WARN: Code duplicated, block: B:211:0x0290  */
    /* JADX WARN: Code duplicated, block: B:251:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159 A[RETURN] */
    public final int f0() throws C0736j, EOFException {
        int i10;
        int iK0;
        int i11;
        int i12;
        String str;
        String str2;
        long j;
        char cE;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        long j11;
        int i17;
        int i18;
        byte bE;
        int i19;
        int[] iArr = this.f15450s;
        int i20 = 1;
        int i21 = this.f15449r - 1;
        int i22 = iArr[i21];
        Da.j jVar = this.f15462w;
        long j12 = 0;
        Da.h hVar = this.f15463x;
        if (i22 == 1) {
            iArr[i21] = 2;
        } else if (i22 == 2) {
            int iK1 = k0(true);
            hVar.readByte();
            if (iK1 != 44) {
                if (iK1 != 59) {
                    if (iK1 == 93) {
                        this.f15464y = 4;
                        return 4;
                    }
                    d0("Unterminated array");
                    throw null;
                }
                e0();
            }
        } else {
            if (i22 == 3 || i22 == 5) {
                iArr[i21] = 4;
                if (i22 == 5) {
                    int iK2 = k0(true);
                    hVar.readByte();
                    if (iK2 != 44) {
                        if (iK2 != 59) {
                            if (iK2 == 125) {
                                this.f15464y = 2;
                                return 2;
                            }
                            d0("Unterminated object");
                            throw null;
                        }
                        e0();
                    }
                }
                int iK3 = k0(true);
                if (iK3 == 34) {
                    hVar.readByte();
                    this.f15464y = 13;
                    return 13;
                }
                if (iK3 == 39) {
                    hVar.readByte();
                    e0();
                    this.f15464y = 12;
                    return 12;
                }
                if (iK3 != 125) {
                    e0();
                    if (i0((char) iK3)) {
                        this.f15464y = 14;
                        return 14;
                    }
                    d0("Expected name");
                    throw null;
                }
                if (i22 == 5) {
                    d0("Expected name");
                    throw null;
                }
                hVar.readByte();
                this.f15464y = 2;
                return 2;
            }
            if (i22 != 4) {
                if (i22 == 6) {
                    iArr[i21] = 7;
                } else if (i22 == 7) {
                    i10 = 0;
                    if (k0(false) == -1) {
                        this.f15464y = 18;
                        return 18;
                    }
                    e0();
                } else {
                    i10 = 0;
                    if (i22 == 9) {
                        r rVar = this.f15461C;
                        rVar.f15482x = true;
                        while (rVar.f15479u != r.f15473D) {
                            rVar.b(8192L);
                            rVar.f15476r.skip(rVar.f15481w);
                        }
                        this.f15461C = null;
                        this.f15449r--;
                        return f0();
                    }
                    if (i22 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iK0 = k0(true);
                if (iK0 != 34) {
                    hVar.readByte();
                    this.f15464y = 9;
                    return 9;
                }
                if (iK0 != 39) {
                    e0();
                    hVar.readByte();
                    this.f15464y = 8;
                    return 8;
                }
                if (iK0 != 44 || iK0 == 59) {
                    i11 = 1;
                } else {
                    if (iK0 == 91) {
                        hVar.readByte();
                        this.f15464y = 3;
                        return 3;
                    }
                    if (iK0 != 93) {
                        if (iK0 == 123) {
                            hVar.readByte();
                            this.f15464y = 1;
                            return 1;
                        }
                        byte bE2 = hVar.e(0L);
                        if (bE2 == 116 || bE2 == 84) {
                            i12 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bE2 != 102 && bE2 != 70) {
                                if (bE2 == 110 || bE2 == 78) {
                                    i12 = 7;
                                    str2 = "null";
                                    str = "NULL";
                                } else {
                                    i12 = i10;
                                    j = 0;
                                }
                                if (i12 != 0) {
                                    return i12;
                                }
                                i13 = i10;
                                i14 = i13;
                                int i23 = i14;
                                i15 = 1;
                                j10 = j;
                                while (true) {
                                    i16 = i14 + 1;
                                    j11 = j10;
                                    if (jVar.request(i16)) {
                                        bE = hVar.e(i14);
                                        if (bE != 43) {
                                            if (bE != 69 || bE == 101) {
                                                if (i13 != 2 || i13 == 4) {
                                                    i13 = 5;
                                                    i14 = i16;
                                                    j10 = j11;
                                                    i20 = 1;
                                                } else {
                                                    i18 = i10;
                                                }
                                            } else if (bE == 45) {
                                                i19 = 6;
                                                if (i13 == 0) {
                                                    i13 = 1;
                                                    i23 = 1;
                                                } else {
                                                    if (i13 != 5) {
                                                        i18 = i10;
                                                    }
                                                    i13 = i19;
                                                }
                                                i14 = i16;
                                                j10 = j11;
                                                i20 = 1;
                                            } else if (bE != 46) {
                                                if (bE >= 48 && bE <= 57) {
                                                    if (i13 == i20 || i13 == 0) {
                                                        j11 = -(bE - 48);
                                                        i13 = 2;
                                                    } else if (i13 == 2) {
                                                        if (j11 != j) {
                                                            long j13 = (10 * j11) - ((long) (bE - 48));
                                                            i15 &= (j11 > -922337203685477580L || (j11 == -922337203685477580L && j13 < j11)) ? 1 : i10;
                                                            j11 = j13;
                                                        }
                                                    } else if (i13 == 3) {
                                                        i13 = 4;
                                                    } else if (i13 == 5 || i13 == 6) {
                                                        i13 = 7;
                                                    }
                                                    i14 = i16;
                                                    j10 = j11;
                                                    i20 = 1;
                                                } else if (!i0(bE)) {
                                                }
                                                i18 = i10;
                                            } else if (i13 == 2) {
                                                i13 = 3;
                                                i14 = i16;
                                                j10 = j11;
                                                i20 = 1;
                                            } else {
                                                i18 = i10;
                                            }
                                            if (i18 != 0) {
                                                return i18;
                                            }
                                            if (i0(hVar.e(j))) {
                                                d0("Expected value");
                                                throw null;
                                            }
                                            e0();
                                            this.f15464y = 10;
                                            return 10;
                                        }
                                        i19 = 6;
                                        if (i13 != 5) {
                                            i18 = i10;
                                            if (i18 != 0) {
                                                return i18;
                                            }
                                            if (i0(hVar.e(j))) {
                                                d0("Expected value");
                                                throw null;
                                            }
                                            e0();
                                            this.f15464y = 10;
                                            return 10;
                                        }
                                        i13 = i19;
                                        i14 = i16;
                                        j10 = j11;
                                        i20 = 1;
                                    }
                                    i17 = 2;
                                    if (i13 != 2) {
                                        if (i13 != i17 || i13 == 4 || i13 == 7) {
                                            this.f15459A = i14;
                                            i18 = 17;
                                            this.f15464y = 17;
                                        } else {
                                            i18 = i10;
                                        }
                                    } else if (i15 != 0 || ((j11 == Long.MIN_VALUE && i23 == 0) || (j11 == j && i23 != 0))) {
                                        i17 = 2;
                                        if (i13 != i17) {
                                        }
                                        this.f15459A = i14;
                                        i18 = 17;
                                        this.f15464y = 17;
                                    } else {
                                        this.f15465z = i23 != 0 ? j11 : -j11;
                                        hVar.skip(i14);
                                        i18 = 16;
                                        this.f15464y = 16;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (i0(hVar.e(j))) {
                                        d0("Expected value");
                                        throw null;
                                    }
                                    e0();
                                    this.f15464y = 10;
                                    return 10;
                                }
                            }
                            i12 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        int length = str2.length();
                        int i24 = 1;
                        while (true) {
                            if (i24 >= length) {
                                j = j12;
                                if (!jVar.request(length + 1) || !i0(hVar.e(length))) {
                                    hVar.skip(length);
                                    this.f15464y = i12;
                                    break;
                                }
                            } else {
                                int i25 = i24 + 1;
                                j = j12;
                                if (jVar.request(i25) && ((cE = hVar.e(i24)) == str2.charAt(i24) || cE == str.charAt(i24))) {
                                    i24 = i25;
                                    j12 = j;
                                }
                            }
                            i12 = i10;
                            break;
                        }
                        if (i12 != 0) {
                            return i12;
                        }
                        i13 = i10;
                        i14 = i13;
                        int i26 = i14;
                        i15 = 1;
                        j10 = j;
                        while (true) {
                            i16 = i14 + 1;
                            j11 = j10;
                            if (jVar.request(i16)) {
                                bE = hVar.e(i14);
                                if (bE != 43) {
                                    if (bE != 69) {
                                        if (i13 != 2) {
                                        }
                                        i13 = 5;
                                        i14 = i16;
                                        j10 = j11;
                                        i20 = 1;
                                    } else {
                                        if (i13 != 2) {
                                        }
                                        i13 = 5;
                                        i14 = i16;
                                        j10 = j11;
                                        i20 = 1;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (i0(hVar.e(j))) {
                                        d0("Expected value");
                                        throw null;
                                    }
                                    e0();
                                    this.f15464y = 10;
                                    return 10;
                                }
                                i19 = 6;
                                if (i13 != 5) {
                                    i18 = i10;
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (i0(hVar.e(j))) {
                                        d0("Expected value");
                                        throw null;
                                    }
                                    e0();
                                    this.f15464y = 10;
                                    return 10;
                                }
                                i13 = i19;
                                i14 = i16;
                                j10 = j11;
                                i20 = 1;
                            }
                            i17 = 2;
                            if (i13 != 2) {
                                if (i13 != i17) {
                                }
                                this.f15459A = i14;
                                i18 = 17;
                                this.f15464y = 17;
                            } else {
                                if (i15 != 0) {
                                }
                                i17 = 2;
                                if (i13 != i17) {
                                }
                                this.f15459A = i14;
                                i18 = 17;
                                this.f15464y = 17;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (i0(hVar.e(j))) {
                                d0("Expected value");
                                throw null;
                            }
                            e0();
                            this.f15464y = 10;
                            return 10;
                        }
                    }
                    i11 = 1;
                    if (i22 == 1) {
                        hVar.readByte();
                        this.f15464y = 4;
                        return 4;
                    }
                }
                if (i22 == i11 && i22 != 2) {
                    d0("Unexpected value");
                    throw null;
                }
                e0();
                this.f15464y = 7;
                return 7;
            }
            iArr[i21] = 5;
            int iK4 = k0(true);
            hVar.readByte();
            if (iK4 != 58) {
                if (iK4 != 61) {
                    d0("Expected ':'");
                    throw null;
                }
                e0();
                if (jVar.request(1L) && hVar.e(0L) == 62) {
                    hVar.readByte();
                }
            }
        }
        i10 = 0;
        iK0 = k0(true);
        if (iK0 != 34) {
            hVar.readByte();
            this.f15464y = 9;
            return 9;
        }
        if (iK0 != 39) {
            e0();
            hVar.readByte();
            this.f15464y = 8;
            return 8;
        }
        if (iK0 != 44) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (i22 == i11) {
        }
        e0();
        this.f15464y = 7;
        return 7;
    }

    public final int g0(String str, m mVar) {
        int length = mVar.f15447a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(mVar.f15447a[i10])) {
                this.f15464y = 0;
                this.f15451t[this.f15449r - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final int h0(String str, m mVar) {
        int length = mVar.f15447a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(mVar.f15447a[i10])) {
                this.f15464y = 0;
                int[] iArr = this.f15452u;
                int i11 = this.f15449r - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.n
    public final void i() {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 != 4) {
            throw new A6.a("Expected END_ARRAY but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
        int i10 = this.f15449r;
        this.f15449r = i10 - 1;
        int[] iArr = this.f15452u;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f15464y = 0;
    }

    public final boolean i0(int i10) throws C0736j {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e0();
        return false;
    }

    public final String j0() {
        String strL0;
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 14) {
            strL0 = m0();
        } else if (iF0 == 13) {
            strL0 = l0(f15455E);
        } else if (iF0 == 12) {
            strL0 = l0(f15454D);
        } else {
            if (iF0 != 15) {
                throw new A6.a("Expected a name but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
            }
            strL0 = this.f15460B;
            this.f15460B = null;
        }
        this.f15464y = 0;
        this.f15451t[this.f15449r - 1] = strL0;
        return strL0;
    }

    public final int k0(boolean z10) throws C0736j, EOFException {
        Da.j jVar;
        long j;
        Da.h hVar;
        byte bE;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                jVar = this.f15462w;
                if (!jVar.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i10;
                hVar = this.f15463x;
                bE = hVar.e(j);
                if (bE == 10 || bE == 32 || bE == 13 || bE == 9) {
                    i10 = i11;
                }
            }
            hVar.skip(j);
            Da.k kVar = f15457G;
            if (bE == 47) {
                if (jVar.request(2L)) {
                    e0();
                    byte bE2 = hVar.e(1L);
                    if (bE2 == 42) {
                        hVar.readByte();
                        hVar.readByte();
                        Da.k kVar2 = f15458H;
                        long jG = jVar.g(kVar2);
                        boolean z11 = jG != -1;
                        hVar.skip(z11 ? jG + ((long) kVar2.f1364r.length) : hVar.f1362s);
                        if (!z11) {
                            d0("Unterminated comment");
                            throw null;
                        }
                    } else if (bE2 == 47) {
                        hVar.readByte();
                        hVar.readByte();
                        long jK = jVar.K(kVar);
                        hVar.skip(jK != -1 ? jK + 1 : hVar.f1362s);
                    }
                }
                return bE;
            }
            if (bE != 35) {
                return bE;
            }
            e0();
            long jK2 = jVar.K(kVar);
            hVar.skip(jK2 != -1 ? jK2 + 1 : hVar.f1362s);
        }
    }

    public final String l0(Da.k kVar) throws C0736j, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jK = this.f15462w.K(kVar);
            if (jK == -1) {
                d0("Unterminated string");
                throw null;
            }
            Da.h hVar = this.f15463x;
            if (hVar.e(jK) != 92) {
                if (sb == null) {
                    String strA = hVar.A(jK, H9.a.f3610a);
                    hVar.readByte();
                    return strA;
                }
                sb.append(hVar.A(jK, H9.a.f3610a));
                hVar.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(hVar.A(jK, H9.a.f3610a));
            hVar.readByte();
            sb.append(n0());
        }
    }

    public final String m0() {
        long jK = this.f15462w.K(f15456F);
        Da.h hVar = this.f15463x;
        if (jK == -1) {
            return hVar.E();
        }
        hVar.getClass();
        return hVar.A(jK, H9.a.f3610a);
    }

    @Override // com.squareup.moshi.n
    public final void n() {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 != 2) {
            throw new A6.a("Expected END_OBJECT but was " + android.support.v4.media.session.p.G(N()) + " at path " + s());
        }
        int i10 = this.f15449r;
        int i11 = i10 - 1;
        this.f15449r = i11;
        this.f15451t[i11] = null;
        int[] iArr = this.f15452u;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f15464y = 0;
    }

    public final char n0() throws C0736j, EOFException {
        int i10;
        Da.j jVar = this.f15462w;
        if (!jVar.request(1L)) {
            d0("Unterminated escape sequence");
            throw null;
        }
        Da.h hVar = this.f15463x;
        byte b5 = hVar.readByte();
        if (b5 == 10 || b5 == 34 || b5 == 39 || b5 == 47 || b5 == 92) {
            return (char) b5;
        }
        if (b5 == 98) {
            return '\b';
        }
        if (b5 == 102) {
            return '\f';
        }
        if (b5 == 110) {
            return '\n';
        }
        if (b5 == 114) {
            return '\r';
        }
        if (b5 == 116) {
            return '\t';
        }
        if (b5 != 117) {
            if (this.f15453v) {
                return (char) b5;
            }
            d0("Invalid escape sequence: \\" + ((char) b5));
            throw null;
        }
        if (!jVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + s());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bE = hVar.e(i11);
            char c11 = (char) (c10 << 4);
            if (bE >= 48 && bE <= 57) {
                i10 = bE - 48;
            } else if (bE >= 97 && bE <= 102) {
                i10 = bE - 87;
            } else {
                if (bE < 65 || bE > 70) {
                    d0("\\u".concat(hVar.A(4L, H9.a.f3610a)));
                    throw null;
                }
                i10 = bE - 55;
            }
            c10 = (char) (i10 + c11);
        }
        hVar.skip(4L);
        return c10;
    }

    public final void o0(Da.k kVar) throws C0736j, EOFException {
        while (true) {
            long jK = this.f15462w.K(kVar);
            if (jK == -1) {
                d0("Unterminated string");
                throw null;
            }
            Da.h hVar = this.f15463x;
            if (hVar.e(jK) != 92) {
                hVar.skip(jK + 1);
                return;
            } else {
                hVar.skip(jK + 1);
                n0();
            }
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f15462w + ")";
    }

    @Override // com.squareup.moshi.n
    public final boolean w() throws C0736j, EOFException {
        int iF0 = this.f15464y;
        if (iF0 == 0) {
            iF0 = f0();
        }
        return (iF0 == 2 || iF0 == 4 || iF0 == 18) ? false : true;
    }

    public o(o oVar) {
        this.f15449r = oVar.f15449r;
        this.f15450s = (int[]) oVar.f15450s.clone();
        this.f15451t = (String[]) oVar.f15451t.clone();
        this.f15452u = (int[]) oVar.f15452u.clone();
        this.f15453v = oVar.f15453v;
        this.f15464y = 0;
        Da.t tVarPeek = oVar.f15462w.peek();
        this.f15462w = tVarPeek;
        this.f15463x = tVarPeek.f1393s;
        this.f15464y = oVar.f15464y;
        this.f15465z = oVar.f15465z;
        this.f15459A = oVar.f15459A;
        this.f15460B = oVar.f15460B;
        try {
            tVarPeek.S(oVar.f15463x.f1362s);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
