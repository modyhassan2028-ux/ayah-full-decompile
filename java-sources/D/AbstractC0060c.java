package D;

import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import java.util.List;

/* JADX INFO: renamed from: D.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0059b f941a = new C0059b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0059b f942b = new C0059b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f943c = 9;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f944d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f945e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f946f = 5;
    public static final int g = 15;

    public static final void a(C0698o c0698o, l0.r rVar) {
        C0070m c0070m = C0070m.f1000c;
        int i10 = c0698o.f10721P;
        l0.r rVarC = l0.a.c(c0698o, rVar);
        InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
        InterfaceC0288k.f4142a.getClass();
        C0286i c0286i = C0287j.f4115b;
        android.support.v4.media.session.r rVar2 = c0698o.f10722a;
        c0698o.X();
        if (c0698o.f10720O) {
            c0698o.l(c0286i);
        } else {
            c0698o.h0();
        }
        C0672b.v(c0698o, c0070m, C0287j.f4119f);
        C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
        C0672b.v(c0698o, rVarC, C0287j.f4117d);
        C0285h c0285h = C0287j.g;
        if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
            p123m2.c.y(i10, c0698o, i10, c0285h);
        }
        c0698o.p(true);
    }

    public static final T c(H0.H h7) {
        Object objI = h7.i();
        if (objI instanceof T) {
            return (T) objI;
        }
        return null;
    }

    public static final float d(T t2) {
        if (t2 != null) {
            return t2.f913a;
        }
        return 0.0f;
    }

    public static H0.J e(S s10, int i10, int i11, int i12, int i13, int i14, H0.K k7, List list, H0.U[] uArr, int i15) {
        int i16;
        float f3;
        int i17;
        int i18;
        int i19;
        List list2 = list;
        long j = i14;
        int[] iArr = new int[i15];
        int iMax = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int iMin = 0;
        float f7 = 0.0f;
        while (i20 < i15) {
            H0.H h7 = (H0.H) list2.get(i20);
            float fD = d(c(h7));
            if (fD > 0.0f) {
                f7 += fD;
                i21++;
                i17 = i20;
            } else {
                int i23 = i12 - i22;
                H0.U uA = uArr[i20];
                if (uA == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i17 = i20;
                        i18 = i21;
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i17 = i20;
                        i18 = i21;
                        i19 = i23 < 0 ? 0 : i23;
                    }
                    uA = h7.a(s10.d(0, i19, i13, false));
                } else {
                    i17 = i20;
                    i18 = i21;
                }
                H0.U u8 = uA;
                int iJ = s10.j(u8);
                int iH = s10.h(u8);
                iArr[i17] = iJ;
                int i24 = i23 - iJ;
                if (i24 < 0) {
                    i24 = 0;
                }
                iMin = Math.min(i14, i24);
                i22 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                uArr[i17] = u8;
                i21 = i18;
            }
            i20 = i17 + 1;
            j = j;
        }
        long j10 = j;
        int i25 = i21;
        if (i25 == 0) {
            i22 -= iMin;
            i16 = 0;
        } else {
            long j11 = ((long) (i25 - 1)) * j10;
            long jRound = ((long) ((i12 != Integer.MAX_VALUE ? i12 : i10) - i22)) - j11;
            if (jRound < 0) {
                jRound = 0;
            }
            float f10 = jRound / f7;
            for (int i26 = 0; i26 < i15; i26++) {
                jRound -= (long) Math.round(d(c((H0.H) list2.get(i26))) * f10);
            }
            int i27 = iMax;
            int i28 = 0;
            int i29 = 0;
            while (i28 < i15) {
                if (uArr[i28] == null) {
                    H0.H h10 = (H0.H) list2.get(i28);
                    T tC = c(h10);
                    float fD2 = d(tC);
                    if (fD2 <= 0.0f) {
                        E.a.b("All weights <= 0 should have placeables");
                    }
                    f3 = f10;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fD2 * f3) + iSignum);
                    H0.U uA2 = h10.a(s10.d((!(tC != null ? tC.f914b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iJ2 = s10.j(uA2);
                    int iH2 = s10.h(uA2);
                    iArr[i28] = iJ2;
                    i29 += iJ2;
                    int iMax3 = Math.max(i27, iH2);
                    uArr[i28] = uA2;
                    i27 = iMax3;
                } else {
                    f3 = f10;
                }
                i28++;
                list2 = list;
                f10 = f3;
            }
            i16 = (int) (((long) i29) + j11);
            int i30 = i12 - i22;
            if (i16 < 0) {
                i16 = 0;
            }
            if (i16 > i30) {
                i16 = i30;
            }
            iMax = i27;
        }
        int i31 = i16 + i22;
        if (i31 < 0) {
            i31 = 0;
        }
        int iMax4 = Math.max(i31, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr2 = new int[i15];
        s10.g(iMax4, k7, iArr, iArr2);
        return s10.f(uArr, k7, iArr2, iMax4, iMax5);
    }

    public static final G f(A1.c cVar) {
        return new G(cVar.f462a, cVar.f463b, cVar.f464c, cVar.f465d);
    }

    public static final void g(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public abstract int b(int i10, p063g1.m mVar);
}
