package Z;

import J0.C0299w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f10560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f10564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u.t f10565f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10567i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0299w f10573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0299w f10574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0299w f10575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u.t f10576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u.s f10581x;

    public A0(x0 x0Var) {
        this.f10560a = x0Var;
        int[] iArr = x0Var.f10854r;
        this.f10561b = iArr;
        Object[] objArr = x0Var.f10856t;
        this.f10562c = objArr;
        this.f10563d = x0Var.f10862z;
        this.f10564e = x0Var.f10852A;
        this.f10565f = x0Var.f10853B;
        int i10 = x0Var.f10855s;
        this.g = i10;
        this.f10566h = (iArr.length / 5) - i10;
        int i11 = x0Var.f10857u;
        this.f10568k = i11;
        this.f10569l = objArr.length - i11;
        this.f10570m = i10;
        this.f10573p = new C0299w();
        this.f10574q = new C0299w();
        this.f10575r = new C0299w();
        this.f10578u = i10;
        this.f10579v = -1;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void x(A0 a9) {
        int i10 = a9.f10579v;
        int iQ = a9.q(i10);
        int[] iArr = a9.f10561b;
        int i11 = (iQ * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        a9.R(a9.C(iArr, i10));
    }

    public final void A(int i10, int i11) {
        int i12 = this.f10569l;
        int i13 = this.f10568k;
        int i14 = this.f10570m;
        if (i13 != i10) {
            Object[] objArr = this.f10562c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, n());
        if (i14 != iMin) {
            int length = this.f10562c.length - i12;
            if (iMin < i14) {
                int iQ = q(iMin);
                int iQ2 = q(i14);
                int i16 = this.g;
                while (iQ < iQ2) {
                    int i17 = (iQ * 5) + 4;
                    int i18 = this.f10561b[i17];
                    if (!(i18 >= 0)) {
                        AbstractC0700p.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f10561b[i17] = -((length - i18) + 1);
                    iQ++;
                    if (iQ == i16) {
                        iQ += this.f10566h;
                    }
                }
            } else {
                int iQ3 = q(i14);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i19 = (iQ3 * 5) + 4;
                    int i20 = this.f10561b[i19];
                    if (!(i20 < 0)) {
                        AbstractC0700p.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f10561b[i19] = i20 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.f10566h;
                    }
                }
            }
            this.f10570m = iMin;
        }
        this.f10568k = i10;
    }

    public final Object B(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f10561b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.f10562c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int C(int[] iArr, int i10) {
        int i11 = iArr[(q(i10) * 5) + 2];
        return i11 > -2 ? i11 : (n() + i11) - (-2);
    }

    public final Object D(Object obj) {
        if (this.f10571n > 0) {
            v(1, this.f10579v);
        }
        Object[] objArr = this.f10562c;
        int i10 = this.f10567i;
        this.f10567i = i10 + 1;
        Object obj2 = objArr[g(i10)];
        if (this.f10567i > this.j) {
            AbstractC0700p.c("Writing to an invalid slot");
        }
        this.f10562c[g(this.f10567i - 1)] = obj;
        return obj2;
    }

    public final void E() {
        int i10;
        u.s sVar = this.f10581x;
        if (sVar != null) {
            while (sVar.f22758b != 0) {
                int iX = C0672b.x(sVar);
                int iQ = q(iX);
                int iS = iX + 1;
                int iS2 = s(iX) + iX;
                while (true) {
                    if (iS >= iS2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f10561b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.f10561b;
                int i11 = (iQ * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iC = C(iArr, iX);
                    if (iC >= 0) {
                        C0672b.i(sVar, iC);
                    }
                }
            }
        }
    }

    public final boolean F() {
        C0670a c0670aP;
        if (this.f10571n != 0) {
            AbstractC0700p.c("Cannot remove group while inserting");
        }
        int i10 = this.f10577t;
        int i11 = this.f10567i;
        int iF = f(this.f10561b, q(i10));
        int I6 = I();
        int i12 = this.f10579v;
        HashMap map = this.f10564e;
        if (map != null && (c0670aP = P(i12)) != null) {
        }
        u.s sVar = this.f10581x;
        if (sVar != null) {
            while (true) {
                int i13 = sVar.f22758b;
                if (i13 == 0) {
                    break;
                }
                if (i13 == 0) {
                    p204v.a.e("IntList is empty.");
                    throw null;
                }
                if (sVar.f22757a[0] < i10) {
                    break;
                }
                C0672b.x(sVar);
            }
        }
        boolean zG = G(i10, this.f10577t - i10);
        H(iF, this.f10567i - iF, i10 - 1);
        this.f10577t = i10;
        this.f10567i = i11;
        this.f10572o -= I6;
        return zG;
    }

    public final boolean G(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f10563d;
            z(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f10564e;
                int i12 = i10 + i11;
                int iB = z0.b(this.f10563d, i12, m() - this.f10566h);
                if (iB >= this.f10563d.size()) {
                    iB--;
                }
                int i13 = iB + 1;
                int i14 = 0;
                while (iB >= 0) {
                    C0670a c0670a = (C0670a) this.f10563d.get(iB);
                    int iC = c(c0670a);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        c0670a.f10648a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iB + 1;
                        }
                        i13 = iB;
                    }
                    iB--;
                }
                z10 = i13 < i14;
                if (z10) {
                    this.f10563d.subList(i13, i14).clear();
                }
            }
            this.g = i10;
            this.f10566h += i11;
            int i15 = this.f10570m;
            if (i15 > i10) {
                this.f10570m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f10578u;
            if (i16 >= this.g) {
                this.f10578u = i16 - i11;
            }
            int i17 = this.f10579v;
            if (i17 >= 0 && (this.f10561b[(q(i17) * 5) + 1] & 67108864) != 0) {
                R(i17);
            }
        }
        return z10;
    }

    public final void H(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f10569l;
            int i14 = i10 + i11;
            A(i14, i12);
            this.f10568k = i10;
            this.f10569l = i13 + i11;
            p120l9.l.e0(i10, i14, null, this.f10562c);
            int i15 = this.j;
            if (i15 >= i10) {
                this.j = i15 - i11;
            }
        }
    }

    public final int I() {
        int iQ = q(this.f10577t);
        int iA = z0.a(this.f10561b, iQ) + this.f10577t;
        this.f10577t = iA;
        this.f10567i = f(this.f10561b, q(iA));
        int i10 = this.f10561b[(iQ * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void J() {
        int i10 = this.f10578u;
        this.f10577t = i10;
        this.f10567i = f(this.f10561b, q(i10));
    }

    public final int K(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f10562c.length - this.f10569l;
        }
        int iC = z0.c(iArr, i10);
        return iC < 0 ? (this.f10562c.length - this.f10569l) + iC + 1 : iC;
    }

    public final int L(int i10, int i11) {
        int iK = K(this.f10561b, q(i10));
        int i12 = iK + i11;
        if (!(i12 >= iK && i12 < f(this.f10561b, q(i10 + 1)))) {
            AbstractC0700p.c("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int M(int i10) {
        return f(this.f10561b, q(s(i10) + i10));
    }

    public final void N() {
        if (this.f10571n != 0) {
            AbstractC0700p.c("Key must be supplied when inserting");
        }
        S s10 = C0690k.f10683a;
        O(0, s10, s10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        HashMap map;
        C0670a c0670aP;
        int i12 = this.f10579v;
        Object[] objArr = this.f10571n > 0;
        this.f10575r.c(this.f10572o);
        S s10 = C0690k.f10683a;
        if (objArr == true) {
            int i13 = this.f10577t;
            int iF = f(this.f10561b, q(i13));
            u(1);
            this.f10567i = iF;
            this.j = iF;
            int iQ = q(i13);
            int i14 = obj != s10 ? 1 : 0;
            int i15 = (z10 || obj2 == s10) ? 0 : 1;
            int iH = h(iF, this.f10568k, this.f10569l, this.f10562c.length);
            if (iH >= 0 && this.f10570m < i13) {
                iH = -(((this.f10562c.length - this.f10569l) - iH) + 1);
            }
            int[] iArr = this.f10561b;
            int i16 = this.f10579v;
            int i17 = iQ * 5;
            iArr[i17] = i10;
            iArr[i17 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = iH;
            int i18 = (z10 ? 1 : 0) + i14 + i15;
            if (i18 > 0) {
                v(i18, i13);
                Object[] objArr2 = this.f10562c;
                int i19 = this.f10567i;
                if (z10) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i14 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i15 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f10567i = i19;
            }
            this.f10572o = 0;
            i11 = i13 + 1;
            this.f10579v = i13;
            this.f10577t = i11;
            if (i12 >= 0 && (map = this.f10564e) != null && (c0670aP = P(i12)) != null) {
            }
        } else {
            this.f10573p.c(i12);
            this.f10574q.c((m() - this.f10566h) - this.f10578u);
            int i20 = this.f10577t;
            int iQ2 = q(i20);
            if (!p251z9.j.a(obj2, s10)) {
                if (z10) {
                    S(this.f10577t, obj2);
                } else {
                    Q(obj2);
                }
            }
            this.f10567i = K(this.f10561b, iQ2);
            this.j = f(this.f10561b, q(this.f10577t + 1));
            int[] iArr2 = this.f10561b;
            int i21 = iQ2 * 5;
            this.f10572o = iArr2[i21 + 1] & 67108863;
            this.f10579v = i20;
            this.f10577t = i20 + 1;
            i11 = i20 + iArr2[i21 + 3];
        }
        this.f10578u = i11;
    }

    public final C0670a P(int i10) {
        ArrayList arrayList;
        int iE;
        if (i10 < 0 || i10 >= n() || (iE = z0.e((arrayList = this.f10563d), i10, n())) < 0) {
            return null;
        }
        return (C0670a) arrayList.get(iE);
    }

    public final void Q(Object obj) {
        int iQ = q(this.f10577t);
        int i10 = (iQ * 5) + 1;
        if ((this.f10561b[i10] & 268435456) == 0) {
            AbstractC0700p.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f10562c;
        int[] iArr = this.f10561b;
        objArr[g(Integer.bitCount(iArr[i10] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void R(int i10) {
        if (i10 >= 0) {
            u.s sVar = this.f10581x;
            if (sVar == null) {
                sVar = new u.s();
                this.f10581x = sVar;
            }
            C0672b.i(sVar, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void S(int i10, Object obj) {
        boolean z10;
        int iQ = q(i10);
        int[] iArr = this.f10561b;
        if (iQ < iArr.length) {
            z10 = (iArr[(iQ * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            AbstractC0700p.c("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f10562c[g(f(this.f10561b, iQ))] = obj;
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            AbstractC0700p.c("Cannot seek backwards");
        }
        if (!(this.f10571n <= 0)) {
            AbstractC0689j0.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f10577t + i10;
        if (i11 >= this.f10579v && i11 <= this.f10578u) {
            z10 = true;
        }
        if (!z10) {
            AbstractC0700p.c("Cannot seek outside the current group (" + this.f10579v + '-' + this.f10578u + ')');
        }
        this.f10577t = i11;
        int iF = f(this.f10561b, q(i11));
        this.f10567i = iF;
        this.j = iF;
    }

    public final C0670a b(int i10) {
        ArrayList arrayList = this.f10563d;
        int iE = z0.e(arrayList, i10, n());
        if (iE >= 0) {
            return (C0670a) arrayList.get(iE);
        }
        if (i10 > this.g) {
            i10 = -(n() - i10);
        }
        C0670a c0670a = new C0670a(i10);
        arrayList.add(-(iE + 1), c0670a);
        return c0670a;
    }

    public final int c(C0670a c0670a) {
        int i10 = c0670a.f10648a;
        return i10 < 0 ? n() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f10571n;
        this.f10571n = i10 + 1;
        if (i10 == 0) {
            this.f10574q.c((m() - this.f10566h) - this.f10578u);
        }
    }

    public final void e(boolean z10) {
        this.f10580w = true;
        if (z10 && this.f10573p.f4183b == 0) {
            z(n());
            A(this.f10562c.length - this.f10569l, this.g);
            int i10 = this.f10568k;
            Arrays.fill(this.f10562c, i10, this.f10569l + i10, (Object) null);
            E();
        }
        int[] iArr = this.f10561b;
        int i11 = this.g;
        Object[] objArr = this.f10562c;
        int i12 = this.f10568k;
        ArrayList arrayList = this.f10563d;
        HashMap map = this.f10564e;
        u.t tVar = this.f10565f;
        x0 x0Var = this.f10560a;
        if (!x0Var.f10860x) {
            AbstractC0689j0.a("Unexpected writer close()");
        }
        x0Var.f10860x = false;
        x0Var.f10854r = iArr;
        x0Var.f10855s = i11;
        x0Var.f10856t = objArr;
        x0Var.f10857u = i12;
        x0Var.f10862z = arrayList;
        x0Var.f10852A = map;
        x0Var.f10853B = tVar;
    }

    public final int f(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f10562c.length - this.f10569l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f10562c.length - this.f10569l) + i11 + 1 : i11;
    }

    public final int g(int i10) {
        return (this.f10569l * (i10 < this.f10568k ? 0 : 1)) + i10;
    }

    public final void i() {
        u.A a9;
        boolean z10 = this.f10571n > 0;
        int i10 = this.f10577t;
        int i11 = this.f10578u;
        int i12 = this.f10579v;
        int iQ = q(i12);
        int i13 = this.f10572o;
        int i14 = i10 - i12;
        int i15 = iQ * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f10561b[i16] & 1073741824) != 0;
        C0299w c0299w = this.f10575r;
        if (z10) {
            u.t tVar = this.f10576s;
            if (tVar != null && (a9 = (u.A) tVar.b(i12)) != null) {
                Object[] objArr = a9.f22650a;
                int i17 = a9.f22651b;
                for (int i18 = 0; i18 < i17; i18++) {
                    D(objArr[i18]);
                }
            }
            int[] iArr = this.f10561b;
            iArr[i15 + 3] = i14;
            z0.d(iQ, i13, iArr);
            int iB = c0299w.b();
            if (z11) {
                i13 = 1;
            }
            this.f10572o = iB + i13;
            int iC = C(this.f10561b, i12);
            this.f10579v = iC;
            int iN = iC < 0 ? n() : q(iC + 1);
            int iF = iN >= 0 ? f(this.f10561b, iN) : 0;
            this.f10567i = iF;
            this.j = iF;
            return;
        }
        if (i10 != i11) {
            AbstractC0700p.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f10561b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        z0.d(iQ, i13, iArr2);
        int iB2 = this.f10573p.b();
        this.f10578u = (m() - this.f10566h) - this.f10574q.b();
        this.f10579v = iB2;
        int iC2 = C(this.f10561b, i12);
        int iB3 = c0299w.b();
        this.f10572o = iB3;
        if (iC2 == iB2) {
            this.f10572o = iB3 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iC2 != 0 && iC2 != iB2 && (i23 != 0 || i22 != 0)) {
                int iQ2 = q(iC2);
                if (i22 != 0) {
                    int[] iArr3 = this.f10561b;
                    int i24 = (iQ2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f10561b;
                    z0.d(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i23, iArr4);
                }
                int[] iArr5 = this.f10561b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iC2 = C(iArr5, iC2);
            }
        }
        this.f10572o += i23;
    }

    public final void j() {
        if (this.f10571n <= 0) {
            AbstractC0689j0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f10571n - 1;
        this.f10571n = i10;
        if (i10 == 0) {
            if (this.f10575r.f4183b != this.f10573p.f4183b) {
                AbstractC0700p.c("startGroup/endGroup mismatch while inserting");
            }
            this.f10578u = (m() - this.f10566h) - this.f10574q.b();
        }
    }

    public final void k(int i10) {
        boolean z10 = false;
        if (!(this.f10571n <= 0)) {
            AbstractC0700p.c("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f10579v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f10578u) {
                z10 = true;
            }
            if (!z10) {
                AbstractC0700p.c("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f10577t;
            int i13 = this.f10567i;
            int i14 = this.j;
            this.f10577t = i10;
            N();
            this.f10577t = i12;
            this.f10567i = i13;
            this.j = i14;
        }
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.g) {
            i10 = -((n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f10561b[(q(i12) * 5) + 2] = i10;
            int i13 = this.f10561b[(q(i12) * 5) + 3] + i12;
            l(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    public final int m() {
        return this.f10561b.length / 5;
    }

    public final int n() {
        return m() - this.f10566h;
    }

    public final int o() {
        return this.f10562c.length - this.f10569l;
    }

    public final Object p(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f10561b;
        int i11 = (iQ * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return C0690k.f10683a;
        }
        return this.f10562c[Integer.bitCount(iArr[i11] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i10) {
        return (this.f10566h * (i10 < this.g ? 0 : 1)) + i10;
    }

    public final Object r(int i10) {
        int iQ = q(i10);
        int[] iArr = this.f10561b;
        int i11 = iQ * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f10562c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int s(int i10) {
        return z0.a(this.f10561b, q(i10));
    }

    public final boolean t(int i10, int i11) {
        int iM;
        int iS;
        if (i11 == this.f10579v) {
            iM = this.f10578u;
        } else {
            C0299w c0299w = this.f10573p;
            if (i11 > c0299w.a(0)) {
                iS = s(i11);
            } else {
                int[] iArr = c0299w.f4182a;
                int iMin = Math.min(iArr.length, c0299w.f4183b);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iS = s(i11);
                } else {
                    iM = (m() - this.f10566h) - this.f10574q.f4182a[i12];
                }
            }
            iM = iS + i11;
        }
        return i10 > i11 && i10 < iM;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f10577t + " end=" + this.f10578u + " size = " + n() + " gap=" + this.g + '-' + (this.g + this.f10566h) + ')';
    }

    public final void u(int i10) {
        if (i10 > 0) {
            int i11 = this.f10577t;
            z(i11);
            int i12 = this.g;
            int i13 = this.f10566h;
            int[] iArr = this.f10561b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                p120l9.l.W(0, 0, i12 * 5, iArr, iArr2);
                p120l9.l.W((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f10561b = iArr2;
                i13 = i15;
            }
            int i16 = this.f10578u;
            if (i16 >= i12) {
                this.f10578u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.g = i17;
            this.f10566h = i13 - i10;
            int iH = h(i14 > 0 ? f(this.f10561b, q(i11 + i10)) : 0, this.f10570m >= i12 ? this.f10568k : 0, this.f10569l, this.f10562c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f10561b[(i18 * 5) + 4] = iH;
            }
            int i19 = this.f10570m;
            if (i19 >= i12) {
                this.f10570m = i19 + i10;
            }
        }
    }

    public final void v(int i10, int i11) {
        if (i10 > 0) {
            A(this.f10567i, i11);
            int i12 = this.f10568k;
            int i13 = this.f10569l;
            if (i13 < i10) {
                Object[] objArr = this.f10562c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f10562c = objArr2;
                i13 = i16;
            }
            int i18 = this.j;
            if (i18 >= i12) {
                this.j = i18 + i10;
            }
            this.f10568k = i12 + i10;
            this.f10569l = i13 - i10;
        }
    }

    public final boolean w(int i10) {
        return (this.f10561b[(q(i10) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(x0 x0Var, int i10) {
        if (this.f10571n <= 0) {
            AbstractC0700p.c("Check failed");
        }
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i10 == 0 && this.f10577t == 0 && this.f10560a.f10855s == 0) {
            int[] iArr = x0Var.f10854r;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = x0Var.f10855s;
            if (i11 == i12) {
                int[] iArr2 = this.f10561b;
                Object[] objArr3 = this.f10562c;
                ArrayList arrayList = this.f10563d;
                HashMap map = this.f10564e;
                u.t tVar = this.f10565f;
                Object[] objArr4 = x0Var.f10856t;
                int i13 = x0Var.f10857u;
                HashMap map2 = x0Var.f10852A;
                u.t tVar2 = x0Var.f10853B;
                this.f10561b = iArr;
                this.f10562c = objArr4;
                this.f10563d = x0Var.f10862z;
                this.g = i12;
                this.f10566h = (iArr.length / 5) - i12;
                this.f10568k = i13;
                this.f10569l = objArr4.length - i13;
                this.f10570m = i12;
                this.f10564e = map2;
                this.f10565f = tVar2;
                x0Var.f10854r = iArr2;
                x0Var.f10855s = objArr2 == true ? 1 : 0;
                x0Var.f10856t = objArr3;
                x0Var.f10857u = objArr == true ? 1 : 0;
                x0Var.f10862z = arrayList;
                x0Var.f10852A = map;
                x0Var.f10853B = tVar;
                return;
            }
        }
        A0 a0E = x0Var.e();
        try {
            C0672b.q(a0E, i10, this, true, true, false);
            boolean z11 = true;
        } finally {
            a0E.e(z10);
        }
    }

    public final void z(int i10) {
        C0670a c0670a;
        int i11;
        C0670a c0670a2;
        int i12;
        int i13;
        int i14 = this.f10566h;
        int i15 = this.g;
        if (i15 != i10) {
            if (!this.f10563d.isEmpty()) {
                int iM = m() - this.f10566h;
                if (i15 < i10) {
                    for (int iB = z0.b(this.f10563d, i15, iM); iB < this.f10563d.size() && (i12 = (c0670a2 = (C0670a) this.f10563d.get(iB)).f10648a) < 0 && (i13 = i12 + iM) < i10; iB++) {
                        c0670a2.f10648a = i13;
                    }
                } else {
                    for (int iB2 = z0.b(this.f10563d, i10, iM); iB2 < this.f10563d.size() && (i11 = (c0670a = (C0670a) this.f10563d.get(iB2)).f10648a) >= 0; iB2++) {
                        c0670a.f10648a = -(iM - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f10561b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    p120l9.l.W(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    p120l9.l.W(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iM2 = m();
            if (i15 >= iM2) {
                AbstractC0700p.c("Check failed");
            }
            while (i15 < iM2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f10561b[i19];
                int iN = i20 > -2 ? i20 : (n() + i20) - (-2);
                if (iN >= i10) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i20) {
                    this.f10561b[i19] = iN;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.g = i10;
    }
}
