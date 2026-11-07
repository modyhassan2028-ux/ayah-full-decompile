package pa;

import Da.k;
import H9.m;
import H9.o;
import H9.v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import ka.l;
import ka.n;
import ka.u;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        k kVar = k.f1363u;
        R7.f.m("\"\\");
        R7.f.m("\t ,=");
    }

    public static final boolean a(u uVar) {
        if (j.a((String) uVar.f19273r.f1961c, "HEAD")) {
            return false;
        }
        int i10 = uVar.f19276u;
        if (((i10 < 100 || i10 >= 200) && i10 != 204 && i10 != 304) || la.e.d(uVar) != -1) {
            return true;
        }
        String strB = uVar.f19278w.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        return "chunked".equalsIgnoreCase(strB);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    public static final void b(ka.b bVar, n nVar, l lVar) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        r rVar;
        ka.j jVar;
        int i10;
        ka.j jVar2;
        j.e(bVar, "<this>");
        j.e(nVar, "url");
        j.e(lVar, "headers");
        if (bVar == ka.b.f19107s) {
            return;
        }
        Pattern pattern = ka.j.f19161k;
        int size = lVar.size();
        int i11 = 0;
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < size; i12++) {
            if ("Set-Cookie".equalsIgnoreCase(lVar.c(i12))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(lVar.e(i12));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            j.d(listUnmodifiableList, "unmodifiableList(...)");
        } else {
            listUnmodifiableList = null;
        }
        r rVar2 = r.f19440r;
        List list = listUnmodifiableList == null ? rVar2 : listUnmodifiableList;
        int size2 = list.size();
        int i13 = 0;
        ArrayList arrayList2 = null;
        while (i13 < size2) {
            String str = (String) list.get(i13);
            j.e(str, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = la.c.f19448a;
            char c10 = ';';
            int iC = la.c.c(str, ';', i11, str.length());
            char c11 = '=';
            int iC2 = la.c.c(str, '=', i11, iC);
            if (iC2 == iC) {
                rVar = rVar2;
                jVar = null;
                i10 = 0;
            } else {
                String strM = la.c.m(str, i11, iC2);
                if (strM.length() != 0 && la.c.e(strM) == -1) {
                    String strM2 = la.c.m(str, iC2 + 1, iC);
                    if (la.c.e(strM2) == -1) {
                        int i14 = iC + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        long jF = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z10 = false;
                        long j10 = -1;
                        boolean z11 = false;
                        boolean z12 = true;
                        String str4 = null;
                        boolean z13 = false;
                        while (true) {
                            if (i14 >= length) {
                                rVar = rVar2;
                                if (j10 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j10 != -1) {
                                    long j11 = jCurrentTimeMillis + (j10 <= 9223372036854775L ? j10 * ((long) 1000) : Long.MAX_VALUE);
                                    if (j11 >= jCurrentTimeMillis && j11 <= 253402300799999L) {
                                        j = j11;
                                    }
                                } else {
                                    j = jF;
                                }
                                String str5 = nVar.f19189d;
                                if (str2 != null) {
                                    if (!j.a(str5, str2)) {
                                        if (v.L0(str5, str2) && str5.charAt((str5.length() - str2.length()) - 1) == '.') {
                                            m mVar = la.b.f19447a;
                                            m mVar2 = la.b.f19447a;
                                            mVar2.getClass();
                                            if (!mVar2.f3641r.matcher(str5).matches()) {
                                            }
                                        }
                                        i10 = 0;
                                        jVar2 = null;
                                    }
                                    jVar = jVar2;
                                    break;
                                }
                                str2 = str5;
                                if (str5.length() == str2.length() || xa.a.f24407d.a(str2) != null) {
                                    String strSubstring = "/";
                                    i10 = 0;
                                    if (str3 == null || !v.R0(str3, "/", false)) {
                                        String strB = nVar.b();
                                        int iG1 = o.g1(strB, '/', 0, 6);
                                        if (iG1 != 0) {
                                            strSubstring = strB.substring(0, iG1);
                                            j.d(strSubstring, "substring(...)");
                                        }
                                        str3 = strSubstring;
                                    }
                                    jVar2 = new ka.j(strM, strM2, j, str2, str3, z13, z10, z11, z12, str4);
                                } else {
                                    i10 = 0;
                                    jVar2 = null;
                                }
                                jVar = jVar2;
                                break;
                            }
                            r rVar3 = rVar2;
                            int iC3 = la.c.c(str, c10, i14, length);
                            int iC4 = la.c.c(str, c11, i14, iC3);
                            String strM3 = la.c.m(str, i14, iC4);
                            String strM4 = iC4 < iC3 ? la.c.m(str, iC4 + 1, iC3) : "";
                            if (strM3.equalsIgnoreCase("expires")) {
                                try {
                                    jF = va.g.F(strM4.length(), strM4);
                                    z11 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strM3.equalsIgnoreCase("max-age")) {
                                try {
                                    long j12 = Long.parseLong(strM4);
                                    j10 = j12 <= 0 ? Long.MIN_VALUE : j12;
                                } catch (NumberFormatException e10) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    j.d(patternCompile, "compile(...)");
                                    if (!patternCompile.matcher(strM4).matches()) {
                                        throw e10;
                                    }
                                    j10 = v.R0(strM4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z11 = true;
                            } else if (strM3.equalsIgnoreCase("domain")) {
                                if (v.L0(strM4, ".")) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strB2 = la.b.b(o.j1(strM4, "."));
                                if (strB2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strB2;
                                z12 = false;
                            } else if (strM3.equalsIgnoreCase("path")) {
                                str3 = strM4;
                            } else if (strM3.equalsIgnoreCase("secure")) {
                                z13 = true;
                            } else if (strM3.equalsIgnoreCase("httponly")) {
                                z10 = true;
                            } else if (strM3.equalsIgnoreCase("samesite")) {
                                str4 = strM4;
                            }
                            i14 = iC3 + 1;
                            rVar2 = rVar3;
                            c10 = ';';
                            c11 = '=';
                        }
                    } else {
                        rVar = rVar2;
                        jVar = null;
                        i10 = 0;
                    }
                } else {
                    rVar = rVar2;
                    jVar = null;
                    i10 = 0;
                }
            }
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i13++;
            i11 = i10;
            rVar2 = rVar;
        }
        r rVar4 = rVar2;
        if (arrayList2 != null) {
            listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList2);
            j.d(listUnmodifiableList2, "unmodifiableList(...)");
        } else {
            listUnmodifiableList2 = null;
        }
        (listUnmodifiableList2 == null ? rVar4 : listUnmodifiableList2).isEmpty();
    }
}
