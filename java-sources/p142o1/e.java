package p142o1;

import Aa.a;
import H1.c;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f20227o = 1000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f20228p = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20230b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c[] f20233e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f20237k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f20240n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20229a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20231c = 32;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20232d = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20234f = false;
    public boolean[] g = new boolean[32];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20235h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20236i = 0;
    public int j = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h[] f20238l = new h[f20227o];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20239m = 0;

    public e() {
        this.f20233e = null;
        this.f20233e = new c[32];
        q();
        a aVar = new a();
        aVar.f554r = new c();
        aVar.f555s = new c();
        aVar.f556t = new c();
        aVar.f557u = new h[32];
        this.f20237k = aVar;
        g gVar = new g(aVar);
        gVar.f20243f = new h[128];
        gVar.g = new h[128];
        gVar.f20244h = 0;
        gVar.f20245i = new f(gVar);
        this.f20230b = gVar;
        if (f20228p) {
            this.f20240n = new d(aVar);
        } else {
            this.f20240n = new c(aVar);
        }
    }

    public static int m(Object obj) {
        h hVar = ((p153p1.c) obj).g;
        if (hVar != null) {
            return (int) (hVar.f20250e + 0.5f);
        }
        return 0;
    }

    public final h a(int i10) {
        h hVar = (h) ((c) this.f20237k.f556t).a();
        if (hVar == null) {
            hVar = new h(i10);
            hVar.f20255l = i10;
        } else {
            hVar.c();
            hVar.f20255l = i10;
        }
        int i11 = this.f20239m;
        int i12 = f20227o;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f20227o = i13;
            this.f20238l = (h[]) Arrays.copyOf(this.f20238l, i13);
        }
        h[] hVarArr = this.f20238l;
        int i14 = this.f20239m;
        this.f20239m = i14 + 1;
        hVarArr[i14] = hVar;
        return hVar;
    }

    public final void b(h hVar, h hVar2, int i10, float f3, h hVar3, h hVar4, int i11, int i12) {
        c cVarK = k();
        if (hVar2 == hVar3) {
            cVarK.f20225d.e(hVar, 1.0f);
            cVarK.f20225d.e(hVar4, 1.0f);
            cVarK.f20225d.e(hVar2, -2.0f);
        } else if (f3 == 0.5f) {
            cVarK.f20225d.e(hVar, 1.0f);
            cVarK.f20225d.e(hVar2, -1.0f);
            cVarK.f20225d.e(hVar3, -1.0f);
            cVarK.f20225d.e(hVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                cVarK.f20223b = (-i10) + i11;
            }
        } else if (f3 <= 0.0f) {
            cVarK.f20225d.e(hVar, -1.0f);
            cVarK.f20225d.e(hVar2, 1.0f);
            cVarK.f20223b = i10;
        } else if (f3 >= 1.0f) {
            cVarK.f20225d.e(hVar4, -1.0f);
            cVarK.f20225d.e(hVar3, 1.0f);
            cVarK.f20223b = -i11;
        } else {
            float f7 = 1.0f - f3;
            cVarK.f20225d.e(hVar, f7 * 1.0f);
            cVarK.f20225d.e(hVar2, f7 * (-1.0f));
            cVarK.f20225d.e(hVar3, (-1.0f) * f3);
            cVarK.f20225d.e(hVar4, 1.0f * f3);
            if (i10 > 0 || i11 > 0) {
                cVarK.f20223b = (i11 * f3) + ((-i10) * f7);
            }
        }
        if (i12 != 8) {
            cVarK.a(this, i12);
        }
        c(cVarK);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    public final void c(c cVar) {
        boolean z10;
        boolean z11;
        h hVarE;
        if (this.f20236i + 1 >= this.j || this.f20235h + 1 >= this.f20232d) {
            n();
        }
        if (cVar.f20226e) {
            z10 = false;
        } else {
            ArrayList arrayList = cVar.f20224c;
            if (this.f20233e.length != 0) {
                boolean z12 = false;
                while (!z12) {
                    int iD = cVar.f20225d.d();
                    for (int i10 = 0; i10 < iD; i10++) {
                        h hVarH = cVar.f20225d.h(i10);
                        if (hVarH.f20248c != -1 || hVarH.f20251f) {
                            arrayList.add(hVarH);
                        }
                    }
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            h hVar = (h) obj;
                            if (hVar.f20251f) {
                                cVar.g(hVar, true);
                            } else {
                                cVar.h(this.f20233e[hVar.f20248c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z12 = true;
                    }
                }
            }
            float f3 = 0.0f;
            if (cVar.f20222a == null && cVar.f20223b == 0.0f && cVar.f20225d.d() == 0) {
                return;
            }
            float f7 = cVar.f20223b;
            if (f7 < 0.0f) {
                cVar.f20223b = f7 * (-1.0f);
                cVar.f20225d.k();
            }
            int iD2 = cVar.f20225d.d();
            float f10 = 0.0f;
            float f11 = 0.0f;
            h hVar2 = null;
            h hVar3 = null;
            int i12 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i12 < iD2) {
                float fA = cVar.f20225d.a(i12);
                h hVarH2 = cVar.f20225d.h(i12);
                float f12 = f3;
                if (hVarH2.f20255l == 1) {
                    if (hVar2 == null) {
                        if (hVarH2.f20254k <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        hVar2 = hVarH2;
                        f10 = fA;
                    } else {
                        if (f10 > fA) {
                            if (hVarH2.f20254k > 1) {
                                z13 = false;
                            }
                            hVar2 = hVarH2;
                            f10 = fA;
                        } else if (z13 || hVarH2.f20254k > 1) {
                        }
                        z13 = true;
                        hVar2 = hVarH2;
                        f10 = fA;
                    }
                } else if (hVar2 == null && fA < f12) {
                    if (hVar3 == null) {
                        if (hVarH2.f20254k <= 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        hVar3 = hVarH2;
                        f11 = fA;
                    } else {
                        if (f11 > fA) {
                            if (hVarH2.f20254k > 1) {
                                z14 = false;
                            }
                            hVar3 = hVarH2;
                            f11 = fA;
                        } else if (z14 || hVarH2.f20254k > 1) {
                        }
                        z14 = true;
                        hVar3 = hVarH2;
                        f11 = fA;
                    }
                }
                i12++;
                f3 = f12;
            }
            float f13 = f3;
            if (hVar2 == null) {
                hVar2 = hVar3;
            }
            if (hVar2 == null) {
                z11 = true;
            } else {
                cVar.f(hVar2);
                z11 = false;
            }
            if (cVar.f20225d.d() == 0) {
                cVar.f20226e = true;
            }
            if (z11) {
                if (this.f20235h + 1 >= this.f20232d) {
                    n();
                }
                h hVarA = a(3);
                int i13 = this.f20229a + 1;
                this.f20229a = i13;
                this.f20235h++;
                hVarA.f20247b = i13;
                ((h[]) this.f20237k.f557u)[i13] = hVarA;
                cVar.f20222a = hVarA;
                h(cVar);
                c cVar2 = this.f20240n;
                cVar2.f20222a = null;
                cVar2.f20225d.clear();
                for (int i14 = 0; i14 < cVar.f20225d.d(); i14++) {
                    cVar2.f20225d.i(cVar.f20225d.h(i14), cVar.f20225d.a(i14), true);
                }
                p(this.f20240n);
                if (hVarA.f20248c == -1) {
                    if (cVar.f20222a == hVarA && (hVarE = cVar.e(null, hVarA)) != null) {
                        cVar.f(hVarE);
                    }
                    if (!cVar.f20226e) {
                        cVar.f20222a.d(cVar);
                    }
                    this.f20236i--;
                }
                z10 = true;
            } else {
                z10 = false;
            }
            h hVar4 = cVar.f20222a;
            if (hVar4 == null) {
                return;
            }
            if (hVar4.f20255l != 1 && cVar.f20223b < f13) {
                return;
            }
        }
        if (z10) {
            return;
        }
        h(cVar);
    }

    public final void d(h hVar, int i10) {
        int i11 = hVar.f20248c;
        if (i11 == -1) {
            hVar.f20250e = i10;
            hVar.f20251f = true;
            int i12 = hVar.j;
            for (int i13 = 0; i13 < i12; i13++) {
                hVar.f20253i[i13].g(hVar, false);
            }
            hVar.j = 0;
            return;
        }
        if (i11 == -1) {
            c cVarK = k();
            cVarK.f20222a = hVar;
            float f3 = i10;
            hVar.f20250e = f3;
            cVarK.f20223b = f3;
            cVarK.f20226e = true;
            c(cVarK);
            return;
        }
        c cVar = this.f20233e[i11];
        if (cVar.f20226e) {
            cVar.f20223b = i10;
            return;
        }
        if (cVar.f20225d.d() == 0) {
            cVar.f20226e = true;
            cVar.f20223b = i10;
            return;
        }
        c cVarK2 = k();
        if (i10 < 0) {
            cVarK2.f20223b = i10 * (-1);
            cVarK2.f20225d.e(hVar, 1.0f);
        } else {
            cVarK2.f20223b = i10;
            cVarK2.f20225d.e(hVar, -1.0f);
        }
        c(cVarK2);
    }

    public final void e(h hVar, h hVar2, int i10, int i11) {
        boolean z10 = false;
        if (i11 == 8 && hVar2.f20251f && hVar.f20248c == -1) {
            hVar.f20250e = hVar2.f20250e + i10;
            hVar.f20251f = true;
            int i12 = hVar.j;
            for (int i13 = 0; i13 < i12; i13++) {
                hVar.f20253i[i13].g(hVar, false);
            }
            hVar.j = 0;
            return;
        }
        c cVarK = k();
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            cVarK.f20223b = i10;
        }
        if (z10) {
            cVarK.f20225d.e(hVar, 1.0f);
            cVarK.f20225d.e(hVar2, -1.0f);
        } else {
            cVarK.f20225d.e(hVar, -1.0f);
            cVarK.f20225d.e(hVar2, 1.0f);
        }
        if (i11 != 8) {
            cVarK.a(this, i11);
        }
        c(cVarK);
    }

    public final void f(h hVar, h hVar2, int i10, int i11) {
        c cVarK = k();
        h hVarL = l();
        hVarL.f20249d = 0;
        cVarK.b(hVar, hVar2, hVarL, i10);
        if (i11 != 8) {
            cVarK.f20225d.e(i(i11), (int) (cVarK.f20225d.f(hVarL) * (-1.0f)));
        }
        c(cVarK);
    }

    public final void g(h hVar, h hVar2, int i10, int i11) {
        c cVarK = k();
        h hVarL = l();
        hVarL.f20249d = 0;
        cVarK.c(hVar, hVar2, hVarL, i10);
        if (i11 != 8) {
            cVarK.f20225d.e(i(i11), (int) (cVarK.f20225d.f(hVarL) * (-1.0f)));
        }
        c(cVarK);
    }

    public final void h(c cVar) {
        boolean z10 = f20228p;
        a aVar = this.f20237k;
        if (z10) {
            c cVar2 = this.f20233e[this.f20236i];
            if (cVar2 != null) {
                ((c) aVar.f554r).b(cVar2);
            }
        } else {
            c cVar3 = this.f20233e[this.f20236i];
            if (cVar3 != null) {
                ((c) aVar.f555s).b(cVar3);
            }
        }
        c[] cVarArr = this.f20233e;
        int i10 = this.f20236i;
        cVarArr[i10] = cVar;
        h hVar = cVar.f20222a;
        hVar.f20248c = i10;
        this.f20236i = i10 + 1;
        hVar.d(cVar);
    }

    public final h i(int i10) {
        if (this.f20235h + 1 >= this.f20232d) {
            n();
        }
        h hVarA = a(4);
        float[] fArr = hVarA.f20252h;
        int i11 = this.f20229a + 1;
        this.f20229a = i11;
        this.f20235h++;
        hVarA.f20247b = i11;
        hVarA.f20249d = i10;
        ((h[]) this.f20237k.f557u)[i11] = hVarA;
        g gVar = this.f20230b;
        gVar.f20245i.f20241r = hVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[hVarA.f20249d] = 1.0f;
        gVar.i(hVarA);
        return hVarA;
    }

    public final h j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f20235h + 1 >= this.f20232d) {
            n();
        }
        if (!(obj instanceof p153p1.c)) {
            return null;
        }
        p153p1.c cVar = (p153p1.c) obj;
        h hVar = cVar.g;
        if (hVar == null) {
            cVar.i();
            hVar = cVar.g;
        }
        int i10 = hVar.f20247b;
        a aVar = this.f20237k;
        if (i10 != -1 && i10 <= this.f20229a && ((h[]) aVar.f557u)[i10] != null) {
            return hVar;
        }
        if (i10 != -1) {
            hVar.c();
        }
        int i11 = this.f20229a + 1;
        this.f20229a = i11;
        this.f20235h++;
        hVar.f20247b = i11;
        hVar.f20255l = 1;
        ((h[]) aVar.f557u)[i11] = hVar;
        return hVar;
    }

    public final c k() {
        boolean z10 = f20228p;
        a aVar = this.f20237k;
        if (z10) {
            c cVar = (c) ((c) aVar.f554r).a();
            if (cVar == null) {
                return new d(aVar);
            }
            cVar.f20222a = null;
            cVar.f20225d.clear();
            cVar.f20223b = 0.0f;
            cVar.f20226e = false;
            return cVar;
        }
        c cVar2 = (c) ((c) aVar.f555s).a();
        if (cVar2 == null) {
            return new c(aVar);
        }
        cVar2.f20222a = null;
        cVar2.f20225d.clear();
        cVar2.f20223b = 0.0f;
        cVar2.f20226e = false;
        return cVar2;
    }

    public final h l() {
        if (this.f20235h + 1 >= this.f20232d) {
            n();
        }
        h hVarA = a(3);
        int i10 = this.f20229a + 1;
        this.f20229a = i10;
        this.f20235h++;
        hVarA.f20247b = i10;
        ((h[]) this.f20237k.f557u)[i10] = hVarA;
        return hVarA;
    }

    public final void n() {
        int i10 = this.f20231c * 2;
        this.f20231c = i10;
        this.f20233e = (c[]) Arrays.copyOf(this.f20233e, i10);
        a aVar = this.f20237k;
        aVar.f557u = (h[]) Arrays.copyOf((h[]) aVar.f557u, this.f20231c);
        int i11 = this.f20231c;
        this.g = new boolean[i11];
        this.f20232d = i11;
        this.j = i11;
    }

    public final void o(g gVar) {
        a aVar;
        for (int i10 = 0; i10 < this.f20236i; i10++) {
            c cVar = this.f20233e[i10];
            int i11 = 1;
            if (cVar.f20222a.f20255l != 1) {
                float f3 = 0.0f;
                if (cVar.f20223b < 0.0f) {
                    boolean z10 = false;
                    int i12 = 0;
                    while (!z10) {
                        i12 += i11;
                        float f7 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.f20236i;
                            aVar = this.f20237k;
                            if (i15 >= i17) {
                                break;
                            }
                            c cVar2 = this.f20233e[i15];
                            if (cVar2.f20222a.f20255l != i11 && !cVar2.f20226e && cVar2.f20223b < f3) {
                                int i18 = i11;
                                while (i18 < this.f20235h) {
                                    h hVar = ((h[]) aVar.f557u)[i18];
                                    float f10 = cVar2.f20225d.f(hVar);
                                    if (f10 > f3) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f11 = hVar.g[i19] / f10;
                                            if ((f11 < f7 && i19 == i16) || i19 > i16) {
                                                i16 = i19;
                                                f7 = f11;
                                                i13 = i15;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                    i18++;
                                    f3 = 0.0f;
                                }
                            }
                            i15++;
                            f3 = 0.0f;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            c cVar3 = this.f20233e[i13];
                            cVar3.f20222a.f20248c = -1;
                            cVar3.f(((h[]) aVar.f557u)[i14]);
                            h hVar2 = cVar3.f20222a;
                            hVar2.f20248c = i13;
                            hVar2.d(cVar3);
                        } else {
                            z10 = true;
                        }
                        if (i12 > this.f20235h / 2) {
                            z10 = true;
                        }
                        f3 = 0.0f;
                        i11 = 1;
                    }
                    break;
                }
            }
        }
        p(gVar);
        for (int i20 = 0; i20 < this.f20236i; i20++) {
            c cVar4 = this.f20233e[i20];
            cVar4.f20222a.f20250e = cVar4.f20223b;
        }
    }

    public final void p(c cVar) {
        for (int i10 = 0; i10 < this.f20235h; i10++) {
            this.g[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f20235h * 2) {
                return;
            }
            h hVar = cVar.f20222a;
            if (hVar != null) {
                this.g[hVar.f20247b] = true;
            }
            h hVarD = cVar.d(this.g);
            if (hVarD != null) {
                boolean[] zArr = this.g;
                int i12 = hVarD.f20247b;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (hVarD != null) {
                float f3 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f20236i; i14++) {
                    c cVar2 = this.f20233e[i14];
                    if (cVar2.f20222a.f20255l != 1 && !cVar2.f20226e && cVar2.f20225d.g(hVarD)) {
                        float f7 = cVar2.f20225d.f(hVarD);
                        if (f7 < 0.0f) {
                            float f10 = (-cVar2.f20223b) / f7;
                            if (f10 < f3) {
                                i13 = i14;
                                f3 = f10;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar3 = this.f20233e[i13];
                    cVar3.f20222a.f20248c = -1;
                    cVar3.f(hVarD);
                    h hVar2 = cVar3.f20222a;
                    hVar2.f20248c = i13;
                    hVar2.d(cVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void q() {
        boolean z10 = f20228p;
        a aVar = this.f20237k;
        int i10 = 0;
        if (z10) {
            while (true) {
                c[] cVarArr = this.f20233e;
                if (i10 >= cVarArr.length) {
                    return;
                }
                c cVar = cVarArr[i10];
                if (cVar != null) {
                    ((c) aVar.f554r).b(cVar);
                }
                this.f20233e[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f20233e;
                if (i10 >= cVarArr2.length) {
                    return;
                }
                c cVar2 = cVarArr2[i10];
                if (cVar2 != null) {
                    ((c) aVar.f555s).b(cVar2);
                }
                this.f20233e[i10] = null;
                i10++;
            }
        }
    }

    public final void r() {
        a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.f20237k;
            h[] hVarArr = (h[]) aVar.f557u;
            if (i10 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i10];
            if (hVar != null) {
                hVar.c();
            }
            i10++;
        }
        c cVar = (c) aVar.f556t;
        h[] hVarArr2 = this.f20238l;
        int length = this.f20239m;
        cVar.getClass();
        if (length > hVarArr2.length) {
            length = hVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            h hVar2 = hVarArr2[i11];
            int i12 = cVar.f3245c;
            Object[] objArr = cVar.f3244b;
            if (i12 < objArr.length) {
                objArr[i12] = hVar2;
                cVar.f3245c = i12 + 1;
            }
        }
        this.f20239m = 0;
        Arrays.fill((h[]) aVar.f557u, (Object) null);
        this.f20229a = 0;
        g gVar = this.f20230b;
        gVar.f20244h = 0;
        gVar.f20223b = 0.0f;
        this.f20235h = 1;
        for (int i13 = 0; i13 < this.f20236i; i13++) {
            this.f20233e[i13].getClass();
        }
        q();
        this.f20236i = 0;
        if (f20228p) {
            this.f20240n = new d(aVar);
        } else {
            this.f20240n = new c(aVar);
        }
    }
}
