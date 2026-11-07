package p009aa;

import Da.r;
import E2.C0124h;
import G.a0;
import H7.C0227a;
import H9.o;
import K0.C0362p;
import U6.C0532j;
import U9.c;
import U9.d;
import W9.f;
import X9.a;
import X9.b;
import Y9.C0662s;
import Z0.B;
import Z9.i;
import Z9.p;
import Z9.s;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Map;
import p017b7.g;
import p251z9.j;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g implements b, a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z9.b f11255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f11256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0124h f11257f;
    public final C0532j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0227a f11259i;
    public final h j;

    public m(Z9.b bVar, q qVar, C0124h c0124h, f fVar) {
        j.e(fVar, "descriptor");
        this.f11255d = bVar;
        this.f11256e = qVar;
        this.f11257f = c0124h;
        this.g = bVar.f11044b;
        this.f11258h = -1;
        C0227a c0227a = bVar.f11043a;
        this.f11259i = c0227a;
        this.j = c0227a.f3463b ? null : new h(fVar);
    }

    @Override // p017b7.g, X9.b
    public final b A(f fVar) {
        j.e(fVar, "descriptor");
        return o.a(fVar) ? new f(this.f11257f, this.f11255d) : this;
    }

    @Override // p017b7.g, X9.b
    public final double B() {
        C0124h c0124h = this.f11257f;
        String strL = c0124h.l();
        try {
            double d5 = Double.parseDouble(strL);
            this.f11255d.f11043a.getClass();
            if (!Double.isInfinite(d5) && !Double.isNaN(d5)) {
                return d5;
            }
            i.j(c0124h, Double.valueOf(d5));
            throw null;
        } catch (IllegalArgumentException unused) {
            C0124h.p(c0124h, p245z2.a.A('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    public final i H0() {
        return new r(this.f11255d.f11043a, this.f11257f).k();
    }

    @Override // p017b7.g, X9.b
    public final long a() {
        return this.f11257f.j();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0127, please report this as an issue */
    @Override // p017b7.g, X9.b
    public final Object c(U9.a aVar) {
        String message;
        String strB;
        Z9.b bVar = this.f11255d;
        C0124h c0124h = this.f11257f;
        a0 a0Var = (a0) c0124h.f1674c;
        j.e(aVar, "deserializer");
        try {
            if (!(aVar instanceof c)) {
                return aVar.c(this);
            }
            bVar.f11043a.getClass();
            String strE = i.e(((c) aVar).d(), bVar);
            this.f11259i.getClass();
            String strC = c0124h.C(strE);
            if (strC != null) {
                try {
                    B9.a.v((c) aVar, this, strC);
                    throw null;
                } catch (d e10) {
                    String message2 = e10.getMessage();
                    j.b(message2);
                    int iB1 = o.b1(message2, '\n', 0, 6);
                    if (iB1 != -1) {
                        message2 = message2.substring(0, iB1);
                        j.d(message2, "substring(...)");
                    }
                    String strK1 = o.k1(message2, ".");
                    String message3 = e10.getMessage();
                    j.b(message3);
                    C0124h.p(c0124h, strK1, 0, o.p1('\n', message3, ""), 2);
                    throw null;
                }
            }
            if (!(aVar instanceof c)) {
                return aVar.c(this);
            }
            bVar.f11043a.getClass();
            String strE2 = i.e(((c) aVar).d(), bVar);
            i iVarH0 = H0();
            String strB2 = ((c) aVar).d().b();
            if (!(iVarH0 instanceof s)) {
                throw i.b("Expected " + w.a(s.class).c() + ", but had " + w.a(iVarH0.getClass()).c() + " as the serialized body of " + strB2 + " at element: " + a0Var.g(), iVarH0.toString(), -1);
            }
            s sVar = (s) iVarH0;
            i iVar = (i) sVar.get(strE2);
            if (iVar != null) {
                Z9.w wVarA = Z9.j.a(iVar);
                strB = wVarA instanceof p ? null : wVarA.b();
            }
            try {
                B9.a.v((c) aVar, this, strB);
                throw null;
            } catch (d e11) {
                String message4 = e11.getMessage();
                j.b(message4);
                throw i.b(message4, sVar.toString(), -1);
            }
            message = e.getMessage();
            j.b(message);
            if (o.V0(message, "at path")) {
                throw e;
            }
            throw new U9.b(e.f8318r, e.getMessage() + " at path: " + a0Var.g(), e);
        } catch (U9.b e12) {
            message = e12.getMessage();
            j.b(message);
            if (o.V0(message, "at path")) {
                throw e12;
            }
            throw new U9.b(e12.f8318r, e12.getMessage() + " at path: " + a0Var.g(), e12);
        }
    }

    @Override // p017b7.g, X9.b
    public final a d(f fVar) {
        j.e(fVar, "descriptor");
        Z9.b bVar = this.f11255d;
        q qVarI = i.i(fVar, bVar);
        C0124h c0124h = this.f11257f;
        a0 a0Var = (a0) c0124h.f1674c;
        int i10 = a0Var.f2654b + 1;
        a0Var.f2654b = i10;
        Object[] objArr = (Object[]) a0Var.f2655c;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            j.d(objArrCopyOf, "copyOf(...)");
            a0Var.f2655c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) a0Var.f2656d, i11);
            j.d(iArrCopyOf, "copyOf(...)");
            a0Var.f2656d = iArrCopyOf;
        }
        ((Object[]) a0Var.f2655c)[i10] = fVar;
        c0124h.i(qVarI.f11277r);
        if (c0124h.D() == 4) {
            C0124h.p(c0124h, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = qVarI.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new m(bVar, qVarI, c0124h, fVar);
        }
        return (this.f11256e == qVarI && bVar.f11043a.f3463b) ? this : new m(bVar, qVarI, c0124h, fVar);
    }

    @Override // p017b7.g, X9.b
    public final boolean e() {
        boolean z10;
        boolean z11;
        C0124h c0124h = this.f11257f;
        int iG = c0124h.G();
        String str = (String) c0124h.f1677f;
        if (iG == str.length()) {
            C0124h.p(c0124h, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iG) == '\"') {
            iG++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iF = c0124h.F(iG);
        if (iF >= str.length() || iF == -1) {
            C0124h.p(c0124h, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iF + 1;
        int iCharAt = str.charAt(iF) | ' ';
        if (iCharAt == 102) {
            c0124h.e(i10, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                C0124h.p(c0124h, "Expected valid boolean literal prefix, but had '" + c0124h.l() + '\'', 0, null, 6);
                throw null;
            }
            c0124h.e(i10, "rue");
            z11 = true;
        }
        if (!z10) {
            return z11;
        }
        if (c0124h.f1673b == str.length()) {
            C0124h.p(c0124h, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c0124h.f1673b) == '\"') {
            c0124h.f1673b++;
            return z11;
        }
        C0124h.p(c0124h, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p017b7.g, X9.a
    public final Object f(f fVar, int i10, U9.a aVar, Object obj) {
        a0 a0Var = (a0) this.f11257f.f1674c;
        j.e(fVar, "descriptor");
        j.e(aVar, "deserializer");
        boolean z10 = this.f11256e == q.MAP && (i10 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) a0Var.f2656d;
            int i11 = a0Var.f2654b;
            if (iArr[i11] == -2) {
                ((Object[]) a0Var.f2655c)[i11] = j.f11244a;
            }
        }
        Object objF = super.f(fVar, i10, aVar, obj);
        if (z10) {
            int[] iArr2 = (int[]) a0Var.f2656d;
            int i12 = a0Var.f2654b;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                a0Var.f2654b = i13;
                Object[] objArr = (Object[]) a0Var.f2655c;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    j.d(objArrCopyOf, "copyOf(...)");
                    a0Var.f2655c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) a0Var.f2656d, i14);
                    j.d(iArrCopyOf, "copyOf(...)");
                    a0Var.f2656d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) a0Var.f2655c;
            int i15 = a0Var.f2654b;
            objArr2[i15] = objF;
            ((int[]) a0Var.f2656d)[i15] = -2;
        }
        return objF;
    }

    @Override // p017b7.g, X9.b
    public final boolean g() {
        h hVar = this.j;
        if (!(hVar != null ? hVar.f11242b : false)) {
            C0124h c0124h = this.f11257f;
            int iF = c0124h.F(c0124h.G());
            String str = (String) c0124h.f1677f;
            int length = str.length() - iF;
            boolean z10 = false;
            if (length >= 4 && iF != -1) {
                for (int i10 = 0; i10 < 4; i10++) {
                    if ("null".charAt(i10) == str.charAt(iF + i10)) {
                    }
                }
                if (length <= 4 || i.d(str.charAt(iF + 4)) != 0) {
                    z10 = true;
                    c0124h.f1673b = iF + 4;
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    @Override // X9.a
    public final int h(f fVar) {
        Object obj;
        Z9.b bVar = this.f11255d;
        C0227a c0227a = bVar.f11043a;
        j.e(fVar, "descriptor");
        q qVar = this.f11256e;
        int iOrdinal = qVar.ordinal();
        int i10 = 0;
        zH = false;
        boolean zH = false;
        int iIntValue = -1;
        C0124h c0124h = this.f11257f;
        if (iOrdinal == 0) {
            boolean zH2 = c0124h.H();
            boolean zD = c0124h.d();
            h hVar = this.j;
            if (zD) {
                this.f11259i.getClass();
                String strF = c0124h.f();
                c0124h.i(':');
                j.e(fVar, "<this>");
                j.e(bVar, "json");
                j.e(strF, "name");
                C0227a c0227a2 = bVar.f11043a;
                c0227a2.getClass();
                i.h(fVar, bVar);
                int iA = fVar.a(strF);
                if (iA == -3 && c0227a2.f3464c) {
                    B b5 = bVar.f11045c;
                    G4.f fVar2 = new G4.f(20, fVar, bVar);
                    b5.getClass();
                    b5.getClass();
                    j.e(fVar, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) b5.f10875s).get(fVar);
                    j jVar = i.f11243a;
                    Object obj2 = map != null ? map.get(jVar) : null;
                    Object objInvoke = obj2 != null ? obj2 : null;
                    if (objInvoke == null) {
                        objInvoke = fVar2.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b5.f10875s;
                        Object obj3 = concurrentHashMap.get(fVar);
                        if (obj3 == null) {
                            obj = obj3;
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(fVar, concurrentHashMap2);
                            obj = concurrentHashMap2;
                        }
                        obj = obj3;
                        ((Map) obj).put(jVar, objInvoke);
                    }
                    Integer num = (Integer) ((Map) objInvoke).get(strF);
                    iIntValue = num != null ? num.intValue() : -3;
                } else {
                    iIntValue = iA;
                }
                if (iIntValue == -3) {
                    String string = ((String) c0124h.f1677f).subSequence(0, c0124h.f1673b).toString();
                    int iY0 = (6 & 2) != 0 ? o.Y0(string) : 0;
                    j.e(string, "<this>");
                    j.e(strF, "string");
                    c0124h.o(string.lastIndexOf(strF, iY0), p245z2.a.A('\'', "Encountered an unknown key '", strF), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (hVar != null) {
                    C0662s c0662s = hVar.f11241a;
                    if (iIntValue < 64) {
                        c0662s.f10548c |= 1 << iIntValue;
                    } else {
                        int i11 = (iIntValue >>> 6) - 1;
                        long[] jArr = c0662s.f10549d;
                        jArr[i11] = jArr[i11] | (1 << (iIntValue & 63));
                    }
                }
            } else if (!zH2) {
                if (hVar != null) {
                    C0662s c0662s2 = hVar.f11241a;
                    C0362p c0362p = c0662s2.f10547b;
                    f fVar3 = c0662s2.f10546a;
                    int iD = fVar3.d();
                    while (true) {
                        long j = c0662s2.f10548c;
                        long j10 = -1;
                        if (j == -1) {
                            if (iD <= 64) {
                                break;
                            }
                            long[] jArr2 = c0662s2.f10549d;
                            int length = jArr2.length;
                            loop1: while (i10 < length) {
                                int i12 = i10 + 1;
                                int i13 = i12 * 64;
                                long j11 = jArr2[i10];
                                while (true) {
                                    if (j11 != j10) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                                        j11 |= 1 << iNumberOfTrailingZeros;
                                        int i14 = iNumberOfTrailingZeros + i13;
                                        if (((Boolean) c0362p.invoke(fVar3, Integer.valueOf(i14))).booleanValue()) {
                                            jArr2[i10] = j11;
                                            iIntValue = i14;
                                            break;
                                        }
                                        j10 = -1;
                                    } else {
                                        jArr2[i10] = j11;
                                        i10 = i12;
                                        j10 = -1;
                                    }
                                }
                            }
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        c0662s2.f10548c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) c0362p.invoke(fVar3, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            iIntValue = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                }
            } else {
                c0227a.getClass();
                i.f(c0124h, "object");
                throw null;
            }
        } else if (iOrdinal != 2) {
            boolean zH3 = c0124h.H();
            if (c0124h.d()) {
                int i15 = this.f11258h;
                if (i15 != -1 && !zH3) {
                    C0124h.p(c0124h, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iIntValue = i15 + 1;
                this.f11258h = iIntValue;
            } else if (zH3) {
                c0227a.getClass();
                i.f(c0124h, "array");
                throw null;
            }
        } else {
            int i16 = this.f11258h;
            boolean z10 = i16 % 2 != 0;
            if (!z10) {
                c0124h.i(':');
            } else if (i16 != -1) {
                zH = c0124h.H();
            }
            if (c0124h.d()) {
                if (z10) {
                    if (this.f11258h == -1) {
                        int i17 = c0124h.f1673b;
                        if (zH) {
                            C0124h.p(c0124h, "Unexpected leading comma", i17, null, 4);
                            throw null;
                        }
                    } else {
                        int i18 = c0124h.f1673b;
                        if (!zH) {
                            C0124h.p(c0124h, "Expected comma after the key-value pair", i18, null, 4);
                            throw null;
                        }
                    }
                }
                iIntValue = this.f11258h + 1;
                this.f11258h = iIntValue;
            } else if (zH) {
                c0227a.getClass();
                i.f(c0124h, "object");
                throw null;
            }
        }
        if (qVar != q.MAP) {
            a0 a0Var = (a0) c0124h.f1674c;
            ((int[]) a0Var.f2656d)[a0Var.f2654b] = iIntValue;
        }
        return iIntValue;
    }

    @Override // p017b7.g, X9.b
    public final char i() {
        C0124h c0124h = this.f11257f;
        String strL = c0124h.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        C0124h.p(c0124h, p245z2.a.A('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    @Override // p017b7.g, X9.b
    public final int o() {
        C0124h c0124h = this.f11257f;
        long j = c0124h.j();
        int i10 = (int) j;
        if (j == i10) {
            return i10;
        }
        C0124h.p(c0124h, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // X9.a
    public final C0532j q() {
        return this.g;
    }

    @Override // p017b7.g, X9.b
    public final byte r() {
        C0124h c0124h = this.f11257f;
        long j = c0124h.j();
        byte b5 = (byte) j;
        if (j == b5) {
            return b5;
        }
        C0124h.p(c0124h, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // p017b7.g, X9.a
    public final void t(f fVar) {
        j.e(fVar, "descriptor");
        C0227a c0227a = this.f11255d.f11043a;
        c0227a.getClass();
        C0124h c0124h = this.f11257f;
        if (c0124h.H()) {
            c0227a.getClass();
            i.f(c0124h, "");
            throw null;
        }
        c0124h.i(this.f11256e.f11278s);
        a0 a0Var = (a0) c0124h.f1674c;
        int i10 = a0Var.f2654b;
        int[] iArr = (int[]) a0Var.f2656d;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            a0Var.f2654b = i10 - 1;
        }
        int i11 = a0Var.f2654b;
        if (i11 != -1) {
            a0Var.f2654b = i11 - 1;
        }
    }

    @Override // p017b7.g, X9.b
    public final short v() {
        C0124h c0124h = this.f11257f;
        long j = c0124h.j();
        short s10 = (short) j;
        if (j == s10) {
            return s10;
        }
        C0124h.p(c0124h, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // p017b7.g, X9.b
    public final String w() {
        this.f11259i.getClass();
        return this.f11257f.k();
    }

    @Override // p017b7.g, X9.b
    public final float y() {
        C0124h c0124h = this.f11257f;
        String strL = c0124h.l();
        try {
            float f3 = Float.parseFloat(strL);
            this.f11255d.f11043a.getClass();
            if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                return f3;
            }
            i.j(c0124h, Float.valueOf(f3));
            throw null;
        } catch (IllegalArgumentException unused) {
            C0124h.p(c0124h, p245z2.a.A('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
