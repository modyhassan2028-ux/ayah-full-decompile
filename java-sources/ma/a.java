package ma;

import Ca.r;
import H9.v;
import i7.D;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import ka.c;
import ka.l;
import ka.o;
import ka.s;
import ka.t;
import ka.u;
import ka.w;
import ka.z;
import oa.m;
import p085i0.n;
import p251z9.j;
import pa.d;
import pa.f;
import ra.C1289a;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19723a;

    public /* synthetic */ a(int i10) {
        this.f19723a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01dd A[LOOP:3: B:99:0x01ce->B:103:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x020f  */
    /* JADX WARN: Code duplicated, block: B:137:0x029d  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02af  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02da  */
    /* JADX WARN: Code duplicated, block: B:152:0x02df  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0301  */
    /* JADX WARN: Code duplicated, block: B:161:0x0309  */
    /* JADX WARN: Code duplicated, block: B:163:0x0311  */
    /* JADX WARN: Code duplicated, block: B:164:0x0317  */
    /* JADX WARN: Code duplicated, block: B:166:0x0320  */
    /* JADX WARN: Code duplicated, block: B:167:0x0326  */
    /* JADX WARN: Code duplicated, block: B:169:0x032e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0334  */
    /* JADX WARN: Code duplicated, block: B:172:0x033c  */
    /* JADX WARN: Code duplicated, block: B:264:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:31:0x0069, B:54:0x00de, B:56:0x0101, B:60:0x010b, B:67:0x0120, B:70:0x012d, B:71:0x0151, B:62:0x0111, B:73:0x0153, B:74:0x0156, B:45:0x009c, B:48:0x00bb, B:49:0x00be, B:75:0x0157, B:76:0x015a, B:39:0x0091, B:41:0x0097, B:25:0x005d, B:27:0x0063, B:50:0x00bf, B:53:0x00c8), top: B:244:0x005d, inners: #0, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c9  */
    @Override // ka.o
    public final u a(f fVar) throws IOException {
        n nVar;
        n nVar2;
        u uVar;
        int i10;
        int i11;
        int length;
        int length2;
        String string;
        n nVar3;
        String string2;
        IOException iOException;
        u uVarA;
        int i12;
        boolean z10 = true;
        String str = null;
        switch (this.f19723a) {
            case 0:
                System.currentTimeMillis();
                E6.u uVar2 = fVar.f21173e;
                n nVar4 = new n(9, uVar2, str);
                c cVar = (c) uVar2.f1964f;
                if (cVar == null) {
                    int i13 = c.f19109n;
                    l lVar = (l) uVar2.f1962d;
                    j.e(lVar, "headers");
                    int size = lVar.size();
                    int i14 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    boolean z14 = false;
                    boolean z15 = false;
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    boolean z19 = true;
                    String str2 = null;
                    int iL = -1;
                    int iL2 = -1;
                    int iL3 = -1;
                    int iL4 = -1;
                    while (i14 < size) {
                        boolean z20 = z10;
                        String strC = lVar.c(i14);
                        String strE = lVar.e(i14);
                        if (strC.equalsIgnoreCase("Cache-Control")) {
                            if (str2 == null) {
                                str2 = strE;
                            }
                            i11 = 0;
                            while (i11 < strE.length()) {
                                length = strE.length();
                                length2 = i11;
                                while (true) {
                                    if (length2 < length) {
                                        length2 = strE.length();
                                    } else if (H9.o.U0("=,;", strE.charAt(length2))) {
                                        length2++;
                                    }
                                }
                                String strSubstring = strE.substring(i11, length2);
                                j.d(strSubstring, "substring(...)");
                                string = H9.o.t1(strSubstring).toString();
                                if (length2 != strE.length() || strE.charAt(length2) == ',' || strE.charAt(length2) == ';') {
                                    nVar3 = nVar4;
                                    i11 = length2 + 1;
                                    string2 = null;
                                } else {
                                    int length3 = length2 + 1;
                                    byte[] bArr = la.c.f19448a;
                                    int length4 = strE.length();
                                    while (true) {
                                        if (length3 < length4) {
                                            char cCharAt = strE.charAt(length3);
                                            int i15 = length4;
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                length3++;
                                                length4 = i15;
                                            }
                                        } else {
                                            length3 = strE.length();
                                        }
                                    }
                                    if (length3 >= strE.length() || strE.charAt(length3) != '\"') {
                                        int length5 = strE.length();
                                        int length6 = length3;
                                        while (true) {
                                            if (length6 < length5) {
                                                int i16 = length5;
                                                nVar3 = nVar4;
                                                if (!H9.o.U0(",;", strE.charAt(length6))) {
                                                    length6++;
                                                    length5 = i16;
                                                    nVar4 = nVar3;
                                                }
                                            } else {
                                                nVar3 = nVar4;
                                                length6 = strE.length();
                                            }
                                        }
                                        String strSubstring2 = strE.substring(length3, length6);
                                        j.d(strSubstring2, "substring(...)");
                                        int i17 = length6;
                                        string2 = H9.o.t1(strSubstring2).toString();
                                        i11 = i17;
                                    } else {
                                        int i18 = length3 + 1;
                                        int iB1 = H9.o.b1(strE, '\"', i18, 4);
                                        string2 = strE.substring(i18, iB1);
                                        j.d(string2, "substring(...)");
                                        i11 = iB1 + 1;
                                        nVar3 = nVar4;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string)) {
                                    z11 = z20;
                                } else if ("no-store".equalsIgnoreCase(string)) {
                                    z12 = z20;
                                } else if ("max-age".equalsIgnoreCase(string)) {
                                    iL = la.c.l(-1, string2);
                                } else if ("s-maxage".equalsIgnoreCase(string)) {
                                    iL2 = la.c.l(-1, string2);
                                } else if ("private".equalsIgnoreCase(string)) {
                                    z13 = z20;
                                } else if ("public".equalsIgnoreCase(string)) {
                                    z14 = z20;
                                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                    z15 = z20;
                                } else if ("max-stale".equalsIgnoreCase(string)) {
                                    iL3 = la.c.l(Integer.MAX_VALUE, string2);
                                } else if ("min-fresh".equalsIgnoreCase(string)) {
                                    iL4 = la.c.l(-1, string2);
                                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                    z16 = z20;
                                } else if ("no-transform".equalsIgnoreCase(string)) {
                                    z17 = z20;
                                } else if ("immutable".equalsIgnoreCase(string)) {
                                    z18 = z20;
                                }
                                nVar4 = nVar3;
                            }
                            i14++;
                            z10 = z20;
                            nVar4 = nVar4;
                        } else {
                            if (strC.equalsIgnoreCase("Pragma")) {
                            }
                            i14++;
                            z10 = z20;
                            nVar4 = nVar4;
                        }
                        z19 = false;
                        i11 = 0;
                        while (i11 < strE.length()) {
                            length = strE.length();
                            length2 = i11;
                            while (true) {
                                if (length2 < length) {
                                    length2 = strE.length();
                                } else if (H9.o.U0("=,;", strE.charAt(length2))) {
                                    length2++;
                                }
                            }
                            String strSubstring3 = strE.substring(i11, length2);
                            j.d(strSubstring3, "substring(...)");
                            string = H9.o.t1(strSubstring3).toString();
                            if (length2 != strE.length()) {
                                nVar3 = nVar4;
                                i11 = length2 + 1;
                                string2 = null;
                            } else {
                                nVar3 = nVar4;
                                i11 = length2 + 1;
                                string2 = null;
                            }
                            if ("no-cache".equalsIgnoreCase(string)) {
                                z11 = z20;
                            } else if ("no-store".equalsIgnoreCase(string)) {
                                z12 = z20;
                            } else if ("max-age".equalsIgnoreCase(string)) {
                                iL = la.c.l(-1, string2);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                iL2 = la.c.l(-1, string2);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z13 = z20;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z14 = z20;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z15 = z20;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                iL3 = la.c.l(Integer.MAX_VALUE, string2);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                iL4 = la.c.l(-1, string2);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z16 = z20;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z17 = z20;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z18 = z20;
                            }
                            nVar4 = nVar3;
                        }
                        i14++;
                        z10 = z20;
                        nVar4 = nVar4;
                    }
                    nVar = nVar4;
                    c cVar2 = new c(z11, z12, iL, iL2, z13, z14, z15, iL3, iL4, z16, z17, z18, !z19 ? null : str2);
                    uVar2.f1964f = cVar2;
                    cVar = cVar2;
                } else {
                    nVar = nVar4;
                }
                if (cVar.j) {
                    Object obj = null;
                    nVar2 = new n(9, obj, obj);
                } else {
                    nVar2 = nVar;
                }
                E6.u uVar3 = (E6.u) nVar2.f16733s;
                u uVar4 = (u) nVar2.f16734t;
                if (uVar3 == null && uVar4 == null) {
                    return new u(uVar2, s.f19248u, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) new ArrayList(20).toArray(new String[0])), w.f19284r, null, null, null, -1L, System.currentTimeMillis(), null, z.f19296q);
                }
                if (uVar3 == null) {
                    j.b(uVar4);
                    t tVarB = uVar4.b();
                    u uVarR = g.R(uVar4);
                    t.b("cacheResponse", uVarR);
                    tVarB.f19262i = uVarR;
                    return tVarB.a();
                }
                u uVarB = fVar.b(uVar3);
                if (uVar4 == null) {
                    uVar = null;
                } else {
                    if (uVarB.f19276u == 304) {
                        t tVarB2 = uVar4.b();
                        l lVar2 = uVar4.f19278w;
                        l lVar3 = uVarB.f19278w;
                        ArrayList arrayList = new ArrayList(20);
                        int i19 = 0;
                        for (int size2 = lVar2.size(); i19 < size2; size2 = i10) {
                            String strC2 = lVar2.c(i19);
                            String strE2 = lVar2.e(i19);
                            if ("Warning".equalsIgnoreCase(strC2)) {
                                i10 = size2;
                                if (v.R0(strE2, "1", false)) {
                                }
                                i19++;
                            } else {
                                i10 = size2;
                            }
                            if ("Content-Length".equalsIgnoreCase(strC2) || "Content-Encoding".equalsIgnoreCase(strC2) || "Content-Type".equalsIgnoreCase(strC2) || !F9.n.G(strC2) || lVar3.b(strC2) == null) {
                                arrayList.add(strC2);
                                arrayList.add(H9.o.t1(strE2).toString());
                            }
                            i19++;
                        }
                        int size3 = lVar3.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            String strC3 = lVar3.c(i20);
                            if (!"Content-Length".equalsIgnoreCase(strC3) && !"Content-Encoding".equalsIgnoreCase(strC3) && !"Content-Type".equalsIgnoreCase(strC3) && F9.n.G(strC3)) {
                                String strE3 = lVar3.e(i20);
                                arrayList.add(strC3);
                                arrayList.add(H9.o.t1(strE3).toString());
                            }
                        }
                        tVarB2.f19260f = new l((String[]) arrayList.toArray(new String[0])).d();
                        tVarB2.f19263k = uVarB.f19268B;
                        tVarB2.f19264l = uVarB.f19269C;
                        u uVarR2 = g.R(uVar4);
                        t.b("cacheResponse", uVarR2);
                        tVarB2.f19262i = uVarR2;
                        u uVarR3 = g.R(uVarB);
                        t.b("networkResponse", uVarR3);
                        tVarB2.f19261h = uVarR3;
                        tVarB2.a();
                        uVarB.f19279x.close();
                        j.b(null);
                        throw null;
                    }
                    uVar = null;
                    la.c.a(uVar4.f19279x);
                }
                t tVarB3 = uVarB.b();
                u uVarR4 = uVar4 != null ? g.R(uVar4) : uVar;
                t.b("cacheResponse", uVarR4);
                tVarB3.f19262i = uVarR4;
                u uVarR5 = g.R(uVarB);
                t.b("networkResponse", uVarR5);
                tVarB3.f19261h = uVarR5;
                return tVarB3.a();
            default:
                r rVar = fVar.f21172d;
                j.b(rVar);
                d dVar = (d) rVar.f851e;
                E6.u uVar5 = fVar.f21173e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        try {
                            try {
                                dVar.b(uVar5);
                                String str3 = (String) uVar5.f1961c;
                                j.e(str3, "method");
                                if (!str3.equals("GET")) {
                                    str3.equals("HEAD");
                                }
                                ((m) rVar.f849c).e(rVar, true, false, null);
                                try {
                                    dVar.a();
                                    iOException = null;
                                    while (true) {
                                        if (i12 == 100 || (102 <= i12 && i12 < 200)) {
                                            try {
                                                t tVarG = dVar.g();
                                                if (tVarG != null) {
                                                    tVarG.f19265m = rVar;
                                                }
                                                j.b(tVarG);
                                                tVarG.f19255a = uVar5;
                                                tVarG.f19259e = rVar.a().g;
                                                tVarG.f19263k = jCurrentTimeMillis;
                                                tVarG.f19264l = System.currentTimeMillis();
                                                uVarA = tVarG.a();
                                                i12 = uVarA.f19276u;
                                            } catch (IOException e10) {
                                                rVar.e(e10);
                                                throw e10;
                                            }
                                        }
                                        if (iOException != null) {
                                            throw e;
                                        }
                                        p110k9.a.a(iOException, e);
                                        throw iOException;
                                    }
                                } catch (IOException e11) {
                                    rVar.e(e11);
                                    throw e11;
                                }
                            } catch (IOException e12) {
                                rVar.e(e12);
                                throw e12;
                            }
                        } catch (IOException e13) {
                            if ((e13 instanceof C1289a) || !rVar.f848b) {
                                throw e13;
                            }
                            iOException = e13;
                        }
                        t tVarG2 = dVar.g();
                        if (tVarG2 != null) {
                            tVarG2.f19265m = rVar;
                        }
                        j.b(tVarG2);
                        tVarG2.f19255a = uVar5;
                        tVarG2.f19259e = rVar.a().g;
                        tVarG2.f19263k = jCurrentTimeMillis;
                        tVarG2.f19264l = System.currentTimeMillis();
                        uVarA = tVarG2.a();
                        i12 = uVarA.f19276u;
                        try {
                            String strB = uVarA.f19278w.b("Content-Type");
                            if (strB == null) {
                                strB = null;
                            }
                            long jF = dVar.f(uVarA);
                            pa.g gVar = new pa.g(strB, jF, Y2.a.p(new oa.f(rVar, dVar.e(uVarA), jF)));
                            t tVarB4 = uVarA.b();
                            tVarB4.g = gVar;
                            tVarB4.f19266n = new D(10);
                            u uVarA2 = tVarB4.a();
                            if ("close".equalsIgnoreCase(((l) uVarA2.f19273r.f1962d).b("Connection"))) {
                                dVar.d().h();
                            } else {
                                String strB2 = uVarA2.f19278w.b("Connection");
                                if (strB2 != null) {
                                    str = strB2;
                                }
                                if ("close".equalsIgnoreCase(str)) {
                                    dVar.d().h();
                                }
                            }
                            if ((i12 != 204 && i12 != 205) || uVarA2.f19279x.b() <= 0) {
                                return uVarA2;
                            }
                            throw new ProtocolException("HTTP " + i12 + " had non-zero Content-Length: " + uVarA2.f19279x.b());
                        } catch (IOException e14) {
                            rVar.e(e14);
                            throw e14;
                        }
                    } catch (IOException e15) {
                        rVar.e(e15);
                        throw e15;
                    }
                } catch (IOException e16) {
                    if (iOException != null) {
                        throw e16;
                    }
                    p110k9.a.a(iOException, e16);
                    throw iOException;
                }
                break;
        }
    }
}
