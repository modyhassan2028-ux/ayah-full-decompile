package K;

import A.C0007a;
import A.C0023i;
import A.C0025j;
import A.C0027k;
import A.C0033n;
import A.C0041r0;
import A.EnumC0047u0;
import A.I0;
import A.R0;
import A.U0;
import D.AbstractC0071n;
import D0.C0083a;
import D0.C0086d;
import D0.C0096n;
import E2.C0127i0;
import G.C0184s;
import Ga.C0201j;
import H0.InterfaceC0219s;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import K0.C0344g;
import K0.C0351j0;
import K0.InterfaceC0353k0;
import K0.X0;
import K0.Y0;
import K0.f1;
import K9.InterfaceC0402u;
import O.C0453v;
import O.InterfaceC0444l;
import U0.AbstractC0517i;
import U0.C0511c;
import U0.C0512d;
import U0.C0513e;
import U0.C0515g;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import android.content.ClipData;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f4542a = new P(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0083a f4543b = new C0083a(1008);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0083a f4544c = new C0083a(1022);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0127i0 f4545d = new C0127i0(0, 0);

    public static final void A(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbX = p123m2.c.x("OffsetMapping.originalToTransformed returned invalid mapping: ", i12, " -> ", i10, " is not in range of transformed text [0, ");
        sbX.append(i11);
        sbX.append(']');
        C.a.c(sbX.toString());
    }

    public static final void B(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbX = p123m2.c.x("OffsetMapping.transformedToOriginal returned invalid mapping: ", i12, " -> ", i10, " is not in range of original text [0, ");
        sbX.append(i11);
        sbX.append(']');
        C.a.c(sbX.toString());
    }

    public static final void a(C0515g c0515g, l0.r rVar, U0.L l10, p241y9.c cVar, int i10, boolean z10, int i11, int i12, Map map, C0698o c0698o, int i13) {
        int i14;
        l0.r rVar2;
        U0.L l11;
        p241y9.c cVar2;
        C0698o c0698o2;
        int i15;
        boolean z11;
        c0698o.V(-1343466571);
        if ((i13 & 6) == 0) {
            i14 = (c0698o.g(c0515g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            rVar2 = rVar;
            i14 |= c0698o.g(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        if ((i13 & 384) == 0) {
            l11 = l10;
            i14 |= c0698o.g(l11) ? 256 : 128;
        } else {
            l11 = l10;
        }
        if ((i13 & 3072) == 0) {
            cVar2 = cVar;
            i14 |= c0698o.i(cVar2) ? 2048 : 1024;
        } else {
            cVar2 = cVar;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c0698o.e(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= c0698o.h(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c0698o.e(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c0698o.e(i12) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c0698o.i(map) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i14 |= c0698o.i(null) ? 536870912 : 268435456;
        }
        boolean z12 = false;
        if (c0698o.K(i14 & 1, (306783379 & i14) != 306783378)) {
            z(i12, i11);
            if (c0698o.k(O.D.f6280a) != null) {
                throw new ClassCastException();
            }
            c0698o.T(-1583679630);
            c0698o.p(false);
            p110k9.j jVar = AbstractC0314h.f4644a;
            int length = c0515g.f8060s.length();
            List list = c0515g.f8059r;
            if (list == null) {
                i15 = i14;
                z11 = z12;
                break;
            }
            int size = list.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    i15 = i14;
                    z11 = z12;
                    break;
                }
                C0513e c0513e = (C0513e) list.get(i16);
                if (c0513e.f8054a instanceof U0.F) {
                    i15 = i14;
                    if ("androidx.compose.foundation.text.inlineContent".equals(c0513e.f8057d)) {
                        z12 = false;
                        if (AbstractC0517i.b(0, length, c0513e.f8055b, c0513e.f8056c)) {
                            z11 = true;
                            break;
                        }
                    }
                    i16++;
                    i14 = i15;
                } else {
                    i15 = i14;
                }
                z12 = false;
                i16++;
                i14 = i15;
            }
            boolean zD = F9.n.D(c0515g);
            if (z11 || zD) {
                c0698o.T(-1582650709);
                boolean z13 = (i15 & 14) == 4;
                Object objH = c0698o.H();
                Z.S s10 = C0690k.f10683a;
                if (z13 || objH == s10) {
                    objH = C0672b.r(c0515g);
                    c0698o.e0(objH);
                }
                Z.X x9 = (Z.X) objH;
                C0515g c0515g2 = (C0515g) x9.getValue();
                Y0.d dVar = (Y0.d) c0698o.k(AbstractC0359n0.f5120k);
                boolean zG = c0698o.g(x9);
                Object objH2 = c0698o.H();
                if (zG || objH2 == s10) {
                    objH2 = new U0(x9, 2);
                    c0698o.e0(objH2);
                }
                int i17 = i15 << 6;
                c0698o2 = c0698o;
                h(rVar, c0515g2, cVar, z11, map, l10, i10, z10, i11, i12, dVar, (p241y9.c) objH2, c0698o2, ((i15 >> 3) & 910) | ((i15 >> 12) & 57344) | ((i15 << 9) & 458752) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), ((i15 >> 21) & 896) | 24576);
                c0698o2.p(false);
            } else {
                c0698o.T(-1583500636);
                l0.r rVarY = y(rVar2, c0515g, l11, cVar2, i10, z10, i11, i12, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), null, null, null, null);
                C0313g c0313g = C0313g.f4642c;
                int i18 = c0698o.f10721P;
                l0.r rVarC = l0.a.c(c0698o, rVarY);
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                InterfaceC0288k.f4142a.getClass();
                C0286i c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0313g, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                C0285h c0285h = C0287j.g;
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i18))) {
                    p123m2.c.y(i18, c0698o, i18, c0285h);
                }
                c0698o.p(true);
                c0698o.p(false);
                c0698o2 = c0698o;
            }
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0322p(c0515g, rVar, l10, cVar, i10, z10, i11, i12, map, i13, 0);
        }
    }

    public static final void b(C0515g c0515g, l0.r rVar, U0.L l10, p241y9.c cVar, int i10, boolean z10, int i11, int i12, Map map, C0698o c0698o, int i13) {
        int i14;
        Map map2;
        c0698o.V(-1064305212);
        if ((i13 & 6) == 0) {
            i14 = (c0698o.g(c0515g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c0698o.g(l10) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c0698o.i(cVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c0698o.e(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= c0698o.h(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c0698o.e(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c0698o.e(i12) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            map2 = map;
            i14 |= c0698o.i(map2) ? 67108864 : 33554432;
        } else {
            map2 = map;
        }
        int i15 = i14 | 805306368;
        if (c0698o.K(i15 & 1, (306783379 & i15) != 306783378)) {
            a(c0515g, rVar, l10, cVar, i10, z10, i11, i12, map2, c0698o, i15 & 2147483646);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0322p(c0515g, rVar, l10, cVar, i10, z10, i11, i12, map, i13, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0170  */
    /* JADX WARN: Code duplicated, block: B:110:0x017e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0188  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:117:0x019b  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0100  */
    public static final void c(String str, l0.r rVar, U0.L l10, int i10, boolean z10, int i11, int i12, C0698o c0698o, int i13, int i14) {
        int i15;
        U0.L l11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z11;
        boolean z12;
        int i24;
        int i25;
        C0699o0 c0699o0R;
        int i26;
        boolean z13;
        int i27;
        int i28;
        C0286i c0286i;
        C0285h c0285h;
        int i29;
        c0698o.V(-1040751001);
        if ((i13 & 6) == 0) {
            i15 = (c0698o.g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            l11 = l10;
            i15 |= c0698o.g(l11) ? 256 : 128;
        } else {
            l11 = l10;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c0698o.i(null) ? 2048 : 1024;
        }
        int i30 = i14 & 16;
        if (i30 == 0) {
            if ((i13 & 24576) == 0) {
                i16 = i10;
                i15 |= c0698o.e(i16) ? 16384 : 8192;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    if (c0698o.h(z10)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i15 |= i18;
                }
                if ((1572864 & i13) == 0) {
                    if (c0698o.e(i11)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i19 = i14 & 128;
                if (i19 != 0) {
                    if ((12582912 & i13) == 0) {
                        i20 = i12;
                        if (c0698o.e(i20)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i15 |= i21;
                    }
                    if ((i14 & 256) != 0) {
                        i15 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c0698o.i(null)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i15 |= i22;
                    }
                    i23 = i15 | 805306368;
                    if ((306783379 & i23) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0698o.K(i23 & 1, z11)) {
                        if (i30 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i16;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        z(i27, i11);
                        if (c0698o.k(O.D.f6280a) == null) {
                            throw new ClassCastException();
                        }
                        c0698o.T(-1588311278);
                        c0698o.p(false);
                        c0698o.T(-1587511974);
                        l0.r rVarB = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                        c0698o.p(false);
                        C0313g c0313g = C0313g.f4642c;
                        i28 = c0698o.f10721P;
                        l0.r rVarC = l0.a.c(c0698o, rVarB);
                        InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                        InterfaceC0288k.f4142a.getClass();
                        c0286i = C0287j.f4115b;
                        c0698o.X();
                        if (c0698o.f10720O) {
                            c0698o.l(c0286i);
                        } else {
                            c0698o.h0();
                        }
                        C0672b.v(c0698o, c0313g, C0287j.f4119f);
                        C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                        C0672b.v(c0698o, rVarC, C0287j.f4117d);
                        c0285h = C0287j.g;
                        if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i28))) {
                            p123m2.c.y(i28, c0698o, i28, c0285h);
                        }
                        c0698o.p(true);
                        i24 = i26;
                        z12 = z13;
                        i25 = i27;
                    } else {
                        c0698o.N();
                        z12 = z10;
                        i24 = i16;
                        i25 = i20;
                    }
                    c0699o0R = c0698o.r();
                    if (c0699o0R != null) {
                        c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
                    }
                }
                i15 |= 12582912;
                i20 = i12;
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0698o.i(null)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i15 |= i22;
                }
                i23 = i15 | 805306368;
                if ((306783379 & i23) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0698o.K(i23 & 1, z11)) {
                    if (i30 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i16;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    z(i27, i11);
                    if (c0698o.k(O.D.f6280a) == null) {
                        throw new ClassCastException();
                    }
                    c0698o.T(-1588311278);
                    c0698o.p(false);
                    c0698o.T(-1587511974);
                    l0.r rVarB2 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                    c0698o.p(false);
                    C0313g c0313g2 = C0313g.f4642c;
                    i28 = c0698o.f10721P;
                    l0.r rVarC2 = l0.a.c(c0698o, rVarB2);
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
                    InterfaceC0288k.f4142a.getClass();
                    c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0313g2, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M2, C0287j.f4118e);
                    C0672b.v(c0698o, rVarC2, C0287j.f4117d);
                    c0285h = C0287j.g;
                    if (c0698o.f10720O) {
                        p123m2.c.y(i28, c0698o, i28, c0285h);
                    } else {
                        p123m2.c.y(i28, c0698o, i28, c0285h);
                    }
                    c0698o.p(true);
                    i24 = i26;
                    z12 = z13;
                    i25 = i27;
                } else {
                    c0698o.N();
                    z12 = z10;
                    i24 = i16;
                    i25 = i20;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
                }
            }
            i15 |= 196608;
            if ((1572864 & i13) == 0) {
                if (c0698o.e(i11)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i19 = i14 & 128;
            if (i19 != 0) {
                if ((12582912 & i13) == 0) {
                    i20 = i12;
                    if (c0698o.e(i20)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i15 |= i21;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0698o.i(null)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i15 |= i22;
                }
                i23 = i15 | 805306368;
                if ((306783379 & i23) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0698o.K(i23 & 1, z11)) {
                    if (i30 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i16;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    z(i27, i11);
                    if (c0698o.k(O.D.f6280a) == null) {
                        throw new ClassCastException();
                    }
                    c0698o.T(-1588311278);
                    c0698o.p(false);
                    c0698o.T(-1587511974);
                    l0.r rVarB3 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                    c0698o.p(false);
                    C0313g c0313g3 = C0313g.f4642c;
                    i28 = c0698o.f10721P;
                    l0.r rVarC3 = l0.a.c(c0698o, rVarB3);
                    InterfaceC0687i0 interfaceC0687i0M3 = c0698o.m();
                    InterfaceC0288k.f4142a.getClass();
                    c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0313g3, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M3, C0287j.f4118e);
                    C0672b.v(c0698o, rVarC3, C0287j.f4117d);
                    c0285h = C0287j.g;
                    if (c0698o.f10720O) {
                        p123m2.c.y(i28, c0698o, i28, c0285h);
                    } else {
                        p123m2.c.y(i28, c0698o, i28, c0285h);
                    }
                    c0698o.p(true);
                    i24 = i26;
                    z12 = z13;
                    i25 = i27;
                } else {
                    c0698o.N();
                    z12 = z10;
                    i24 = i16;
                    i25 = i20;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
                }
            }
            i15 |= 12582912;
            i20 = i12;
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0698o.i(null)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            i23 = i15 | 805306368;
            if ((306783379 & i23) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0698o.K(i23 & 1, z11)) {
                if (i30 != 0) {
                    i26 = 1;
                } else {
                    i26 = i16;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                z(i27, i11);
                if (c0698o.k(O.D.f6280a) == null) {
                    throw new ClassCastException();
                }
                c0698o.T(-1588311278);
                c0698o.p(false);
                c0698o.T(-1587511974);
                l0.r rVarB4 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                c0698o.p(false);
                C0313g c0313g4 = C0313g.f4642c;
                i28 = c0698o.f10721P;
                l0.r rVarC4 = l0.a.c(c0698o, rVarB4);
                InterfaceC0687i0 interfaceC0687i0M4 = c0698o.m();
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0313g4, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M4, C0287j.f4118e);
                C0672b.v(c0698o, rVarC4, C0287j.f4117d);
                c0285h = C0287j.g;
                if (c0698o.f10720O) {
                    p123m2.c.y(i28, c0698o, i28, c0285h);
                } else {
                    p123m2.c.y(i28, c0698o, i28, c0285h);
                }
                c0698o.p(true);
                i24 = i26;
                z12 = z13;
                i25 = i27;
            } else {
                c0698o.N();
                z12 = z10;
                i24 = i16;
                i25 = i20;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
            }
        }
        i15 |= 24576;
        i16 = i10;
        i17 = i14 & 32;
        if (i17 != 0) {
            if ((196608 & i13) == 0) {
                if (c0698o.h(z10)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i15 |= i18;
            }
            if ((1572864 & i13) == 0) {
                if (c0698o.e(i11)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i19 = i14 & 128;
            if (i19 != 0) {
                if ((12582912 & i13) == 0) {
                    i20 = i12;
                    if (c0698o.e(i20)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i15 |= i21;
                }
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c0698o.i(null)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i15 |= i22;
                }
                i23 = i15 | 805306368;
                if ((306783379 & i23) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0698o.K(i23 & 1, z11)) {
                    if (i30 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i16;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    z(i27, i11);
                    if (c0698o.k(O.D.f6280a) == null) {
                        throw new ClassCastException();
                    }
                    c0698o.T(-1588311278);
                    c0698o.p(false);
                    c0698o.T(-1587511974);
                    l0.r rVarB5 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                    c0698o.p(false);
                    C0313g c0313g5 = C0313g.f4642c;
                    i28 = c0698o.f10721P;
                    l0.r rVarC5 = l0.a.c(c0698o, rVarB5);
                    InterfaceC0687i0 interfaceC0687i0M5 = c0698o.m();
                    InterfaceC0288k.f4142a.getClass();
                    c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c0313g5, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M5, C0287j.f4118e);
                    C0672b.v(c0698o, rVarC5, C0287j.f4117d);
                    c0285h = C0287j.g;
                    if (c0698o.f10720O) {
                        p123m2.c.y(i28, c0698o, i28, c0285h);
                    } else {
                        p123m2.c.y(i28, c0698o, i28, c0285h);
                    }
                    c0698o.p(true);
                    i24 = i26;
                    z12 = z13;
                    i25 = i27;
                } else {
                    c0698o.N();
                    z12 = z10;
                    i24 = i16;
                    i25 = i20;
                }
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
                }
            }
            i15 |= 12582912;
            i20 = i12;
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0698o.i(null)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            i23 = i15 | 805306368;
            if ((306783379 & i23) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0698o.K(i23 & 1, z11)) {
                if (i30 != 0) {
                    i26 = 1;
                } else {
                    i26 = i16;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                z(i27, i11);
                if (c0698o.k(O.D.f6280a) == null) {
                    throw new ClassCastException();
                }
                c0698o.T(-1588311278);
                c0698o.p(false);
                c0698o.T(-1587511974);
                l0.r rVarB6 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                c0698o.p(false);
                C0313g c0313g6 = C0313g.f4642c;
                i28 = c0698o.f10721P;
                l0.r rVarC6 = l0.a.c(c0698o, rVarB6);
                InterfaceC0687i0 interfaceC0687i0M6 = c0698o.m();
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0313g6, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M6, C0287j.f4118e);
                C0672b.v(c0698o, rVarC6, C0287j.f4117d);
                c0285h = C0287j.g;
                if (c0698o.f10720O) {
                    p123m2.c.y(i28, c0698o, i28, c0285h);
                } else {
                    p123m2.c.y(i28, c0698o, i28, c0285h);
                }
                c0698o.p(true);
                i24 = i26;
                z12 = z13;
                i25 = i27;
            } else {
                c0698o.N();
                z12 = z10;
                i24 = i16;
                i25 = i20;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
            }
        }
        i15 |= 196608;
        if ((1572864 & i13) == 0) {
            if (c0698o.e(i11)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i15 |= i29;
        }
        i19 = i14 & 128;
        if (i19 != 0) {
            if ((12582912 & i13) == 0) {
                i20 = i12;
                if (c0698o.e(i20)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i15 |= i21;
            }
            if ((i14 & 256) != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c0698o.i(null)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            i23 = i15 | 805306368;
            if ((306783379 & i23) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0698o.K(i23 & 1, z11)) {
                if (i30 != 0) {
                    i26 = 1;
                } else {
                    i26 = i16;
                }
                if (i17 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                z(i27, i11);
                if (c0698o.k(O.D.f6280a) == null) {
                    throw new ClassCastException();
                }
                c0698o.T(-1588311278);
                c0698o.p(false);
                c0698o.T(-1587511974);
                l0.r rVarB7 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
                c0698o.p(false);
                C0313g c0313g7 = C0313g.f4642c;
                i28 = c0698o.f10721P;
                l0.r rVarC7 = l0.a.c(c0698o, rVarB7);
                InterfaceC0687i0 interfaceC0687i0M7 = c0698o.m();
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0313g7, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M7, C0287j.f4118e);
                C0672b.v(c0698o, rVarC7, C0287j.f4117d);
                c0285h = C0287j.g;
                if (c0698o.f10720O) {
                    p123m2.c.y(i28, c0698o, i28, c0285h);
                } else {
                    p123m2.c.y(i28, c0698o, i28, c0285h);
                }
                c0698o.p(true);
                i24 = i26;
                z12 = z13;
                i25 = i27;
            } else {
                c0698o.N();
                z12 = z10;
                i24 = i16;
                i25 = i20;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
            }
        }
        i15 |= 12582912;
        i20 = i12;
        if ((i14 & 256) != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c0698o.i(null)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i15 |= i22;
        }
        i23 = i15 | 805306368;
        if ((306783379 & i23) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0698o.K(i23 & 1, z11)) {
            if (i30 != 0) {
                i26 = 1;
            } else {
                i26 = i16;
            }
            if (i17 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i19 != 0) {
                i27 = 1;
            } else {
                i27 = i20;
            }
            z(i27, i11);
            if (c0698o.k(O.D.f6280a) == null) {
                throw new ClassCastException();
            }
            c0698o.T(-1588311278);
            c0698o.p(false);
            c0698o.T(-1587511974);
            l0.r rVarB8 = rVar.b(new TextStringSimpleElement(str, l11, (Y0.d) c0698o.k(AbstractC0359n0.f5120k), i26, z13, i11, i27, null));
            c0698o.p(false);
            C0313g c0313g8 = C0313g.f4642c;
            i28 = c0698o.f10721P;
            l0.r rVarC8 = l0.a.c(c0698o, rVarB8);
            InterfaceC0687i0 interfaceC0687i0M8 = c0698o.m();
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0313g8, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M8, C0287j.f4118e);
            C0672b.v(c0698o, rVarC8, C0287j.f4117d);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i28, c0698o, i28, c0285h);
            } else {
                p123m2.c.y(i28, c0698o, i28, c0285h);
            }
            c0698o.p(true);
            i24 = i26;
            z12 = z13;
            i25 = i27;
        } else {
            c0698o.N();
            z12 = z10;
            i24 = i16;
            i25 = i20;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0321o(str, rVar, l10, i24, z12, i11, i25, i13, i14);
        }
    }

    public static final void d(String str, l0.r rVar, U0.L l10, int i10, boolean z10, int i11, int i12, C0698o c0698o, int i13) {
        int i14;
        c0698o.V(-1186827822);
        if ((i13 & 6) == 0) {
            i14 = (c0698o.g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c0698o.g(l10) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c0698o.i(null) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c0698o.e(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= c0698o.h(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c0698o.e(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c0698o.e(i12) ? 8388608 : 4194304;
        }
        int i15 = i14 | 100663296;
        if (c0698o.K(i15 & 1, (38347923 & i15) != 38347922)) {
            c(str, rVar, l10, i10, z10, i11, i12, c0698o, i15 & 268435454, 512);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0323q(str, rVar, l10, i10, z10, i11, i12, i13);
        }
    }

    public static final void e(O.N n6, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(n6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(dVar) ? 32 : 16;
        }
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            Object objH = c0698o.H();
            Z.S s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new p242z.j();
                c0698o.e0(objH);
            }
            p242z.j jVar = (p242z.j) objH;
            Object objH2 = c0698o.H();
            if (objH2 == s10) {
                objH2 = C0672b.m(c0698o);
                c0698o.e0(objH2);
            }
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) objH2;
            Object objH3 = c0698o.H();
            if (objH3 == s10) {
                objH3 = C0672b.r(new c0(0));
                c0698o.e0(objH3);
            }
            Z.X x9 = (Z.X) objH3;
            Object objH4 = c0698o.H();
            if (objH4 == s10) {
                objH4 = new C0041r0(12, jVar);
                c0698o.e0(objH4);
            }
            p241y9.a aVar = (p241y9.a) objH4;
            C0023i c0023i = new C0023i(x9, jVar, n6, 11);
            boolean zI = n6.i();
            boolean zI2 = c0698o.i(interfaceC0402u) | c0698o.i(n6);
            Object objH5 = c0698o.H();
            if (zI2 || objH5 == s10) {
                objH5 = new C0025j(interfaceC0402u, x9, n6, 3);
                c0698o.e0(objH5);
            }
            p171r0.a.b(jVar, aVar, c0023i, null, zI, (p241y9.a) objH5, dVar, c0698o, ((i11 << 15) & 3670016) | 54);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.C(i10, 2, n6, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:217:0x0427  */
    /* JADX WARN: Code duplicated, block: B:218:0x0430  */
    /* JADX WARN: Code duplicated, block: B:220:0x0438  */
    /* JADX WARN: Code duplicated, block: B:227:0x0453  */
    /* JADX WARN: Code duplicated, block: B:230:0x0468  */
    /* JADX WARN: Code duplicated, block: B:233:0x0473  */
    /* JADX WARN: Code duplicated, block: B:236:0x0486  */
    /* JADX WARN: Code duplicated, block: B:238:0x048a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0496  */
    /* JADX WARN: Code duplicated, block: B:244:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:247:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:250:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:253:0x0528  */
    /* JADX WARN: Code duplicated, block: B:254:0x052a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0534  */
    /* JADX WARN: Code duplicated, block: B:258:0x0536  */
    /* JADX WARN: Code duplicated, block: B:261:0x054a  */
    /* JADX WARN: Code duplicated, block: B:262:0x054d  */
    /* JADX WARN: Code duplicated, block: B:265:0x055b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0564  */
    /* JADX WARN: Code duplicated, block: B:269:0x0569  */
    /* JADX WARN: Code duplicated, block: B:272:0x0575 A[PHI: r14 r29 r32
      0x0575: PHI (r14v36 Z0.k) = (r14v30 Z0.k), (r14v37 Z0.k) binds: [B:271:0x0573, B:268:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0575: PHI (r29v16 K.W) = (r29v10 K.W), (r29v18 K.W) binds: [B:271:0x0573, B:268:0x0564] A[DONT_GENERATE, DONT_INLINE]
      0x0575: PHI (r32v6 Z0.z) = (r32v1 Z0.z), (r32v7 Z0.z) binds: [B:271:0x0573, B:268:0x0564] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:273:0x0577  */
    /* JADX WARN: Code duplicated, block: B:276:0x0594 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:282:0x0607  */
    /* JADX WARN: Code duplicated, block: B:286:0x0611  */
    /* JADX WARN: Code duplicated, block: B:288:0x0617 A[PHI: r29
      0x0617: PHI (r29v14 K.W) = (r29v12 K.W), (r29v15 K.W) binds: [B:287:0x0615, B:285:0x060e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:289:0x0619  */
    /* JADX WARN: Code duplicated, block: B:292:0x0621 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x062f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0654 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x0656  */
    /* JADX WARN: Code duplicated, block: B:302:0x067f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0681  */
    /* JADX WARN: Code duplicated, block: B:306:0x0687  */
    /* JADX WARN: Code duplicated, block: B:307:0x0689  */
    /* JADX WARN: Code duplicated, block: B:310:0x069b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:313:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:316:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:319:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:320:0x06df  */
    /* JADX WARN: Code duplicated, block: B:323:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:327:0x0706  */
    /* JADX WARN: Code duplicated, block: B:328:0x0708  */
    /* JADX WARN: Code duplicated, block: B:331:0x0719  */
    /* JADX WARN: Code duplicated, block: B:332:0x071b  */
    /* JADX WARN: Code duplicated, block: B:335:0x0728 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x0732  */
    /* JADX WARN: Code duplicated, block: B:341:0x0766  */
    /* JADX WARN: Code duplicated, block: B:349:0x079b  */
    /* JADX WARN: Code duplicated, block: B:351:0x079e  */
    /* JADX WARN: Code duplicated, block: B:352:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:355:0x07c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:359:0x07de  */
    /* JADX WARN: Code duplicated, block: B:360:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:363:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:365:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:371:0x07fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:374:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:377:0x081b  */
    /* JADX WARN: Code duplicated, block: B:378:0x081d  */
    /* JADX WARN: Code duplicated, block: B:382:0x0842  */
    /* JADX WARN: Code duplicated, block: B:384:0x0846  */
    /* JADX WARN: Code duplicated, block: B:388:0x0864 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:389:0x0866  */
    /* JADX WARN: Code duplicated, block: B:392:0x088d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x0892  */
    /* JADX WARN: Code duplicated, block: B:398:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:405:0x091b  */
    /* JADX WARN: Code duplicated, block: B:407:0x091e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Z0.y yVar, p241y9.c cVar, l0.r rVar, U0.L l10, W2.n nVar, p241y9.c cVar2, B.j jVar, p180s0.L l11, boolean z10, int i10, int i11, Z0.k kVar, U u8, boolean z11, p074h0.d dVar, C0698o c0698o, int i12, int i13) {
        int i14;
        int i15;
        Object w9;
        boolean z12;
        U0.L l12;
        p063g1.c cVar3;
        Y0.d dVar2;
        p063g1.c cVar4;
        boolean z13;
        boolean z14;
        long j;
        Z0.y yVarA;
        Z0.y yVar2;
        Object objH;
        A0 a9;
        long jCurrentTimeMillis;
        Object objH2;
        InterfaceC0402u interfaceC0402u;
        Object objH3;
        H.b bVar;
        Object objH4;
        O.N n6;
        p162q0.p pVar;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        int i19;
        Z0.k kVar2;
        Z0.z zVar;
        W w10;
        boolean z18;
        boolean zI;
        Object c10;
        W w11;
        Z0.s sVar;
        C0698o c0698o2;
        Z0.k kVar3;
        Z0.z zVar2;
        Z0.y yVar3;
        boolean z19;
        Z.X xU;
        W w12;
        boolean z20;
        boolean z21;
        Object c0027k;
        Z0.s sVar2;
        W w13;
        boolean zI2;
        Object objH5;
        l0.r suspendPointerInputElement;
        int i20;
        boolean z22;
        boolean z23;
        boolean zI3;
        Object objH6;
        Z0.s sVar3;
        p241y9.c cVar5;
        boolean z24;
        boolean zI4;
        Object objH7;
        l0.r rVarA;
        boolean z25;
        boolean z26;
        boolean zI5;
        Object objH8;
        O.N n10;
        W w14;
        boolean z27;
        Z0.s sVar4;
        l0.r rVarA2;
        boolean zI6;
        Object objH9;
        boolean z28;
        boolean z29;
        Object objH10;
        Z0.k kVar4;
        boolean z30;
        int i21;
        boolean z31;
        boolean zH;
        Object objH11;
        long j10;
        boolean zI7;
        Object objH12;
        int i22;
        Long l13;
        C0698o c0698o3 = c0698o;
        c0698o3.V(-244533042);
        if ((i12 & 6) == 0) {
            i14 = i12 | (c0698o3.g(yVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c0698o3.i(cVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c0698o3.g(rVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c0698o3.g(l10) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c0698o3.g(nVar) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= c0698o3.i(cVar2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= c0698o3.g(jVar) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= c0698o3.g(l11) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= c0698o3.h(z10) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= c0698o3.e(i10) ? 536870912 : 268435456;
        }
        int i23 = i14;
        if ((i13 & 6) == 0) {
            i15 = (c0698o3.e(i11) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c0698o3.g(kVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c0698o3.g(u8) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c0698o3.h(z11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c0698o3.h(false) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i15 |= c0698o3.i(dVar) ? 131072 : 65536;
        }
        int i24 = i15 | 1572864;
        if (c0698o3.K(i23 & 1, ((i23 & 306783379) == 306783378 && (599187 & i24) == 599186) ? false : true)) {
            c0698o3.P();
            if ((i12 & 1) != 0 && !c0698o3.w()) {
                c0698o3.N();
            }
            c0698o3.q();
            Object objH13 = c0698o3.H();
            Z.S s10 = C0690k.f10683a;
            if (objH13 == s10) {
                objH13 = new p162q0.p();
                c0698o3.e0(objH13);
            }
            p162q0.p pVar2 = (p162q0.p) objH13;
            Object objH14 = c0698o3.H();
            if (objH14 == s10) {
                M.n nVar2 = M.o.f5640a;
                objH14 = new M.c();
                c0698o3.e0(objH14);
            }
            M.c cVar6 = (M.c) objH14;
            Object objH15 = c0698o3.H();
            if (objH15 == s10) {
                objH15 = new Z0.z(cVar6);
                c0698o3.e0(objH15);
            }
            Z0.z zVar3 = (Z0.z) objH15;
            p063g1.c cVar7 = (p063g1.c) c0698o3.k(AbstractC0359n0.f5118h);
            Y0.d dVar3 = (Y0.d) c0698o3.k(AbstractC0359n0.f5120k);
            long j11 = ((O.U) c0698o3.k(O.V.f6342a)).f6341b;
            p162q0.j jVar2 = (p162q0.j) c0698o3.k(AbstractC0359n0.f5119i);
            f1 f1Var = (f1) c0698o3.k(AbstractC0359n0.f5129t);
            X0 x9 = (X0) c0698o3.k(AbstractC0359n0.f5125p);
            EnumC0047u0 enumC0047u0 = EnumC0047u0.f424r;
            EnumC0047u0 enumC0047u1 = (i10 == 1 && !z10 && kVar.f10929a) ? EnumC0047u0.f425s : enumC0047u0;
            c0698o3.T(-1705353356);
            Object[] objArr = {enumC0047u1};
            p085i0.n nVar3 = r0.g;
            boolean zG = c0698o3.g(enumC0047u1);
            Object objH16 = c0698o3.H();
            if (zG || objH16 == s10) {
                objH16 = new C0041r0(14, enumC0047u1);
                c0698o3.e0(objH16);
            }
            r0 r0Var = (r0) va.g.H(objArr, nVar3, (p241y9.a) objH16, c0698o3, 0, 4);
            c0698o3.p(false);
            if (((EnumC0047u0) r0Var.f4771f.getValue()) != enumC0047u1) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(enumC0047u1 == enumC0047u0 ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i25 = i23 & 14;
            boolean z32 = ((i23 & 57344) == 16384) | (i25 == 4);
            Object objH17 = c0698o3.H();
            if (z32 || objH17 == s10) {
                Z0.F fQ = q(nVar, yVar.f10953a);
                U0.K k7 = yVar.f10955c;
                if (k7 != null) {
                    long j12 = k7.f8035a;
                    Z0.s sVar5 = fQ.f10892b;
                    int i26 = U0.K.f8034c;
                    int iB = sVar5.b((int) (j12 >> 32));
                    int iB2 = sVar5.b((int) (j12 & 4294967295L));
                    int iMin = Math.min(iB, iB2);
                    int iMax = Math.max(iB, iB2);
                    C0512d c0512d = new C0512d(fQ.f10891a);
                    c0512d.f8053s.add(new C0511c(new U0.C(0L, 0L, (Y0.l) null, (Y0.j) null, (Y0.k) null, (Y0.e) null, (String) null, 0L, (p055f1.a) null, (p055f1.q) null, (p012b1.c) null, 0L, p055f1.l.f15914c, (p180s0.I) null, 61439), iMin, iMax, ""));
                    objH17 = new Z0.F(c0512d.b(), sVar5);
                } else {
                    objH17 = fQ;
                }
                c0698o3.e0(objH17);
            } else {
                pVar2 = pVar2;
                i25 = i25;
            }
            Z0.F f3 = (Z0.F) objH17;
            C0515g c0515g = f3.f10891a;
            Z0.s sVar6 = f3.f10892b;
            C0699o0 c0699o0V = c0698o3.v();
            if (c0699o0V == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c0699o0V.f10746a |= 1;
            boolean zG2 = c0698o3.g(x9);
            Object objH18 = c0698o3.H();
            if (zG2 || objH18 == s10) {
                z12 = z10;
                l12 = l10;
                f0 f0Var = new f0(c0515g, l12, z12, cVar7, dVar3, 0);
                cVar3 = cVar7;
                dVar2 = dVar3;
                w9 = new W(f0Var, c0699o0V, x9);
                c0698o3.e0(w9);
            } else {
                z12 = z10;
                w9 = objH18;
                cVar3 = cVar7;
                dVar2 = dVar3;
                l12 = l10;
            }
            W w15 = (W) w9;
            C0515g c0515g2 = yVar.f10953a;
            w15.f4571u = cVar;
            w15.f4575y = j11;
            android.support.v4.media.session.r rVar2 = w15.f4568r;
            rVar2.f11365t = u8;
            rVar2.f11366u = jVar2;
            w15.j = c0515g2;
            f0 f0Var2 = w15.f4553a;
            if (p251z9.j.a(f0Var2.f4632a, c0515g) && p251z9.j.a(f0Var2.f4633b, l12) && f0Var2.f4636e == z12 && f0Var2.f4637f == 1 && f0Var2.f4634c == Integer.MAX_VALUE && f0Var2.f4635d == 1 && p251z9.j.a(f0Var2.g, cVar3) && p251z9.j.a(f0Var2.f4639i, p120l9.r.f19440r) && f0Var2.f4638h == dVar2) {
                cVar4 = cVar3;
            } else {
                cVar4 = cVar3;
                f0Var2 = new f0(c0515g, l12, z12, cVar4, dVar2, 0);
            }
            if (w15.f4553a != f0Var2) {
                w15.f4566p = true;
            }
            w15.f4553a = f0Var2;
            L5.c cVar8 = w15.f4556d;
            Z0.E e10 = w15.f4557e;
            cVar8.getClass();
            U0.K k10 = yVar.f10955c;
            long j13 = yVar.f10954b;
            boolean zA = p251z9.j.a(k10, ((Z0.h) cVar8.f5533t).c());
            String str = ((Z0.y) cVar8.f5532s).f10953a.f8060s;
            C0515g c0515g3 = yVar.f10953a;
            if (p251z9.j.a(str, c0515g3.f8060s)) {
                if (U0.K.a(((Z0.y) cVar8.f5532s).f10954b, j13)) {
                    z13 = false;
                } else {
                    ((Z0.h) cVar8.f5533t).f(U0.K.e(j13), U0.K.d(j13));
                    z14 = true;
                    z13 = false;
                }
                if (k10 == null) {
                    Z0.h hVar = (Z0.h) cVar8.f5533t;
                    hVar.f10926d = -1;
                    hVar.f10927e = -1;
                } else {
                    j = k10.f8035a;
                    if (!U0.K.b(j)) {
                        ((Z0.h) cVar8.f5533t).e(U0.K.e(j), U0.K.d(j));
                    }
                }
                if (z13 && (z14 || zA)) {
                    yVarA = yVar;
                } else {
                    Z0.h hVar2 = (Z0.h) cVar8.f5533t;
                    hVar2.f10926d = -1;
                    hVar2.f10927e = -1;
                    yVarA = Z0.y.a(yVar, null, 0L, 3);
                }
                yVar2 = (Z0.y) cVar8.f5532s;
                cVar8.f5532s = yVarA;
                if (e10 != null) {
                    e10.a(yVar2, yVarA);
                }
                objH = c0698o3.H();
                if (objH == s10) {
                    objH = new A0();
                    c0698o3.e0(objH);
                }
                a9 = (A0) objH;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (a9.f4438e) {
                    a9.f4437d = Long.valueOf(jCurrentTimeMillis);
                    a9.a(yVar);
                } else {
                    l13 = a9.f4437d;
                    if (jCurrentTimeMillis > (l13 != null ? l13.longValue() : 0L) + ((long) 5000)) {
                        a9.f4437d = Long.valueOf(jCurrentTimeMillis);
                        a9.a(yVar);
                    }
                }
                objH2 = c0698o3.H();
                if (objH2 == s10) {
                    objH2 = C0672b.m(c0698o3);
                    c0698o3.e0(objH2);
                }
                interfaceC0402u = (InterfaceC0402u) objH2;
                objH3 = c0698o3.H();
                if (objH3 == s10) {
                    objH3 = new H.b();
                    c0698o3.e0(objH3);
                }
                bVar = (H.b) objH3;
                objH4 = c0698o3.H();
                if (objH4 == s10) {
                    objH4 = new O.N(a9);
                    c0698o3.e0(objH4);
                }
                n6 = (O.N) objH4;
                n6.f6309b = sVar6;
                n6.f6313f = nVar;
                n6.f6310c = w15.f4572v;
                n6.f6311d = w15;
                n6.f6312e.setValue(yVar);
                n6.f6314h = (InterfaceC0353k0) c0698o3.k(AbstractC0359n0.f5117f);
                n6.f6315i = interfaceC0402u;
                n6.j = (Y0) c0698o3.k(AbstractC0359n0.f5126q);
                n6.f6316k = (p243z0.a) c0698o3.k(AbstractC0359n0.f5121l);
                pVar = pVar2;
                n6.f6317l = pVar;
                n6.f6318m.setValue(true);
                n6.f6319n.setValue(Boolean.valueOf(z11));
                boolean zI8 = c0698o3.i(w15);
                i16 = i24 & 7168;
                if (i16 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z33 = z15 | zI8;
                i17 = i24 & 57344;
                if (i17 == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zI9 = z33 | z16 | c0698o3.i(zVar3);
                i18 = i25;
                if (i18 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z34 = zI9 | z17;
                i19 = (i24 & 112) ^ 48;
                if (i19 > 32) {
                    kVar2 = kVar;
                    if (!c0698o3.g(kVar2)) {
                        zVar = zVar3;
                        w10 = w15;
                    }
                    z18 = true;
                    zI = z34 | z18 | c0698o3.i(sVar6) | c0698o3.i(interfaceC0402u) | c0698o3.i(bVar) | c0698o3.i(n6);
                    Object objH19 = c0698o3.H();
                    if (!zI || objH19 == s10) {
                        w11 = w10;
                        sVar = sVar6;
                        c0698o2 = c0698o3;
                        kVar3 = kVar2;
                        zVar2 = zVar;
                        c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                        yVar3 = yVar;
                        n6 = n6;
                        z19 = z11;
                        c0698o2.e0(c10);
                    } else {
                        c10 = objH19;
                        yVar3 = yVar;
                        w11 = w10;
                        zVar2 = zVar;
                        sVar = sVar6;
                        c0698o2 = c0698o3;
                        kVar3 = kVar2;
                        z19 = z11;
                    }
                    l0.r rVarE = androidx.compose.foundation.a.e(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar), (p241y9.c) c10), z19, jVar);
                    xU = C0672b.u(Boolean.valueOf(z19), c0698o2);
                    boolean zG3 = c0698o2.g(xU) | c0698o2.i(w11) | c0698o2.i(zVar2) | c0698o2.i(n6);
                    if (i19 > 32 || !c0698o2.g(kVar3)) {
                        w12 = w11;
                        if ((i24 & 48) != 32) {
                            z20 = false;
                        }
                        z21 = z20 | zG3;
                        Object objH20 = c0698o2.H();
                        if (!z21 || objH20 == s10) {
                            sVar2 = sVar;
                            w13 = w12;
                            c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                            c0698o2.e0(c0027k);
                        } else {
                            c0027k = objH20;
                            sVar2 = sVar;
                            w13 = w12;
                        }
                        C0672b.f(c0698o2, p110k9.y.f19095a, (p241y9.e) c0027k);
                        zI2 = c0698o2.i(w13);
                        objH5 = c0698o2.H();
                        if (zI2 || objH5 == s10) {
                            objH5 = new B(w13, 1);
                            c0698o2.e0(objH5);
                        }
                        C0453v c0453v = new C0453v((p241y9.c) objH5, 0);
                        C0096n c0096n = D0.I.f1055a;
                        i20 = 6;
                        suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, c0453v, 6);
                        boolean zI10 = c0698o2.i(w13);
                        if (i17 == 16384) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        boolean z35 = zI10 | z22;
                        if (i16 == 2048) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        zI3 = z35 | z23 | c0698o2.i(sVar2) | c0698o2.i(n6);
                        objH6 = c0698o2.H();
                        if (!zI3 || objH6 == s10) {
                            sVar3 = sVar2;
                            E e11 = new E(w13, pVar, z11, n6, sVar3);
                            c0698o2.e0(e11);
                            objH6 = e11;
                        } else {
                            sVar3 = sVar2;
                        }
                        cVar5 = (p241y9.c) objH6;
                        if (z11) {
                            suspendPointerInputElement = l0.a.a(suspendPointerInputElement, new A.M(1, cVar5, jVar));
                        }
                        O8.c cVar9 = n6.f6329x;
                        O.I i27 = n6.f6328w;
                        l0.r rVarF = D0.u.f(suspendPointerInputElement.b(new SuspendPointerInputElement(cVar9, i27, new I(cVar9, i27), 4)), f4543b);
                        boolean zI11 = c0698o2.i(w13);
                        if (i18 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zI4 = zI11 | z24 | c0698o2.i(sVar3);
                        objH7 = c0698o2.H();
                        if (zI4 || objH7 == s10) {
                            objH7 = new C0023i(w13, yVar3, sVar3, i20);
                            c0698o2.e0(objH7);
                        }
                        rVarA = l0.o.f19333a;
                        l0.r rVarA3 = androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH7);
                        boolean zI12 = c0698o2.i(w13);
                        if (i16 == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean zG4 = zI12 | z25 | c0698o2.g(f1Var) | c0698o2.i(n6);
                        if (i18 == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zI5 = zG4 | z26 | c0698o2.i(sVar3);
                        objH8 = c0698o2.H();
                        if (zI5 || objH8 == s10) {
                            Z0.s sVar7 = sVar3;
                            D d5 = new D(w13, z11, f1Var, n6, yVar3, sVar7, 0);
                            sVar3 = sVar7;
                            c0698o2.e0(d5);
                            objH8 = d5;
                        }
                        l0.r rVarD = androidx.compose.ui.layout.a.d(rVarA, (p241y9.c) objH8);
                        W w16 = w13;
                        n10 = n6;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(f3, yVar, w16, z11, sVar3, n10, kVar, pVar);
                        w14 = w16;
                        if (!z11 && ((Boolean) ((K0.B0) f1Var).f4872a.getValue()).booleanValue() && U0.K.b(((U0.K) w14.f4576z.getValue()).f8035a) && U0.K.b(((U0.K) w14.f4552A.getValue()).f8035a)) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if (z27) {
                            Z0.s sVar8 = sVar3;
                            C0201j c0201j = new C0201j(l11, w14, yVar, sVar8, 1);
                            w14 = w14;
                            sVar4 = sVar8;
                            rVarA2 = l0.a.a(rVarA, c0201j);
                        } else {
                            sVar4 = sVar3;
                            rVarA2 = rVarA;
                        }
                        zI6 = c0698o2.i(n10);
                        objH9 = c0698o2.H();
                        if (zI6 || objH9 == s10) {
                            objH9 = new C0327v(n10, 0);
                            c0698o2.e0(objH9);
                        }
                        C0672b.d(n10, (p241y9.c) objH9, c0698o2);
                        boolean zI13 = c0698o2.i(w14) | c0698o2.i(zVar2);
                        if (i18 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zI13 | z28 | ((i19 <= 32 && c0698o2.g(kVar)) || (i24 & 48) == 32);
                        objH10 = c0698o2.H();
                        if (!z29 || objH10 == s10) {
                            C0033n c0033n = new C0033n(w14, zVar2, yVar, kVar, 5);
                            kVar4 = kVar;
                            c0698o2.e0(c0033n);
                            objH10 = c0033n;
                        } else {
                            kVar4 = kVar;
                        }
                        C0672b.d(kVar4, (p241y9.c) objH10, c0698o2);
                        B b5 = w14.f4572v;
                        if (i10 == 1) {
                            z30 = true;
                        } else {
                            z30 = false;
                        }
                        Z0.s sVar9 = sVar4;
                        l0.m mVar = new l0.m(new k0(w14, n10, yVar, true, z30, sVar9, a9, b5, kVar4.f10933e));
                        i21 = kVar4.f10932d;
                        if (i21 == 7 && i21 != 8) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        boolean zBooleanValue = ((Boolean) xU.getValue()).booleanValue();
                        zH = c0698o2.h(z31) | c0698o2.i(cVar6);
                        objH11 = c0698o2.H();
                        if (zH || objH11 == s10) {
                            objH11 = new I.c(z31, cVar6);
                            c0698o2.e0(objH11);
                        }
                        l0.r rVarA4 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue, z31, (p241y9.a) objH11);
                        j10 = ((p180s0.q) c0698o2.k(AbstractC0316j.f4651a)).f21845a;
                        zI7 = c0698o2.i(w14) | c0698o2.f(j10);
                        objH12 = c0698o2.H();
                        if (!zI7 || objH12 == s10) {
                            i22 = 1;
                            objH12 = new C0184s(w14, j10, i22);
                            c0698o2.e0(objH12);
                        } else {
                            i22 = 1;
                        }
                        l0.r rVarD2 = androidx.compose.ui.layout.a.d(l0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(rVar.b(androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH12)), cVar6, w14, n10).b(rVarA4).b(rVarE), new C0007a(11, jVar2, w14)), new C0007a(9, w14, n10)).b(mVar), new p0(r0Var, z11, jVar)).b(rVarF).b(coreTextFieldSemanticsModifier), new B(w14, 0));
                        if (z11 || !w14.b() || !((Boolean) w14.f4567q.getValue()).booleanValue() || !((Boolean) r3.f4872a.getValue()).booleanValue()) {
                            i22 = 0;
                        }
                        if (i22 != 0 && p232y.S.a()) {
                            rVarA = l0.a.a(rVarA, new A.D(5, n10));
                        }
                        c0698o3 = c0698o;
                        g(rVarD2, n10, p074h0.j.d(-492537660, new C0331z(dVar, w14, l10, i11, i10, r0Var, yVar, nVar, rVarA2, rVarA3, rVarD, rVarA, bVar, n10, i22, cVar2, sVar9, cVar4), c0698o3), c0698o3, 384);
                    } else {
                        w12 = w11;
                    }
                    z20 = true;
                    z21 = z20 | zG3;
                    Object objH21 = c0698o2.H();
                    if (z21) {
                        sVar2 = sVar;
                        w13 = w12;
                        c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                        c0698o2.e0(c0027k);
                    } else {
                        sVar2 = sVar;
                        w13 = w12;
                        c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                        c0698o2.e0(c0027k);
                    }
                    C0672b.f(c0698o2, p110k9.y.f19095a, (p241y9.e) c0027k);
                    zI2 = c0698o2.i(w13);
                    objH5 = c0698o2.H();
                    if (zI2) {
                        objH5 = new B(w13, 1);
                        c0698o2.e0(objH5);
                    } else {
                        objH5 = new B(w13, 1);
                        c0698o2.e0(objH5);
                    }
                    C0453v c0453v2 = new C0453v((p241y9.c) objH5, 0);
                    C0096n c0096n2 = D0.I.f1055a;
                    i20 = 6;
                    suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, c0453v2, 6);
                    boolean zI14 = c0698o2.i(w13);
                    if (i17 == 16384) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z36 = zI14 | z22;
                    if (i16 == 2048) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    zI3 = z36 | z23 | c0698o2.i(sVar2) | c0698o2.i(n6);
                    objH6 = c0698o2.H();
                    if (zI3) {
                        sVar3 = sVar2;
                        E e12 = new E(w13, pVar, z11, n6, sVar3);
                        c0698o2.e0(e12);
                        objH6 = e12;
                    } else {
                        sVar3 = sVar2;
                        E e13 = new E(w13, pVar, z11, n6, sVar3);
                        c0698o2.e0(e13);
                        objH6 = e13;
                    }
                    cVar5 = (p241y9.c) objH6;
                    if (z11) {
                        suspendPointerInputElement = l0.a.a(suspendPointerInputElement, new A.M(1, cVar5, jVar));
                    }
                    O8.c cVar10 = n6.f6329x;
                    O.I i28 = n6.f6328w;
                    l0.r rVarF2 = D0.u.f(suspendPointerInputElement.b(new SuspendPointerInputElement(cVar10, i28, new I(cVar10, i28), 4)), f4543b);
                    boolean zI15 = c0698o2.i(w13);
                    if (i18 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zI4 = zI15 | z24 | c0698o2.i(sVar3);
                    objH7 = c0698o2.H();
                    if (zI4) {
                        objH7 = new C0023i(w13, yVar3, sVar3, i20);
                        c0698o2.e0(objH7);
                    } else {
                        objH7 = new C0023i(w13, yVar3, sVar3, i20);
                        c0698o2.e0(objH7);
                    }
                    rVarA = l0.o.f19333a;
                    l0.r rVarA5 = androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH7);
                    boolean zI16 = c0698o2.i(w13);
                    if (i16 == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean zG5 = zI16 | z25 | c0698o2.g(f1Var) | c0698o2.i(n6);
                    if (i18 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zI5 = zG5 | z26 | c0698o2.i(sVar3);
                    objH8 = c0698o2.H();
                    if (zI5) {
                        Z0.s sVar10 = sVar3;
                        D d9 = new D(w13, z11, f1Var, n6, yVar3, sVar10, 0);
                        sVar3 = sVar10;
                        c0698o2.e0(d9);
                        objH8 = d9;
                    } else {
                        Z0.s sVar11 = sVar3;
                        D d10 = new D(w13, z11, f1Var, n6, yVar3, sVar11, 0);
                        sVar3 = sVar11;
                        c0698o2.e0(d10);
                        objH8 = d10;
                    }
                    l0.r rVarD3 = androidx.compose.ui.layout.a.d(rVarA, (p241y9.c) objH8);
                    W w17 = w13;
                    n10 = n6;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(f3, yVar, w17, z11, sVar3, n10, kVar, pVar);
                    w14 = w17;
                    if (!z11) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (z27) {
                        Z0.s sVar12 = sVar3;
                        C0201j c0201j2 = new C0201j(l11, w14, yVar, sVar12, 1);
                        w14 = w14;
                        sVar4 = sVar12;
                        rVarA2 = l0.a.a(rVarA, c0201j2);
                    } else {
                        sVar4 = sVar3;
                        rVarA2 = rVarA;
                    }
                    zI6 = c0698o2.i(n10);
                    objH9 = c0698o2.H();
                    if (zI6) {
                        objH9 = new C0327v(n10, 0);
                        c0698o2.e0(objH9);
                    } else {
                        objH9 = new C0327v(n10, 0);
                        c0698o2.e0(objH9);
                    }
                    C0672b.d(n10, (p241y9.c) objH9, c0698o2);
                    boolean zI17 = c0698o2.i(w14) | c0698o2.i(zVar2);
                    if (i18 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zI17 | z28 | ((i19 <= 32 && c0698o2.g(kVar)) || (i24 & 48) == 32);
                    objH10 = c0698o2.H();
                    if (z29) {
                        C0033n c0033n2 = new C0033n(w14, zVar2, yVar, kVar, 5);
                        kVar4 = kVar;
                        c0698o2.e0(c0033n2);
                        objH10 = c0033n2;
                    } else {
                        C0033n c0033n3 = new C0033n(w14, zVar2, yVar, kVar, 5);
                        kVar4 = kVar;
                        c0698o2.e0(c0033n3);
                        objH10 = c0033n3;
                    }
                    C0672b.d(kVar4, (p241y9.c) objH10, c0698o2);
                    B b10 = w14.f4572v;
                    if (i10 == 1) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    Z0.s sVar13 = sVar4;
                    l0.m mVar2 = new l0.m(new k0(w14, n10, yVar, true, z30, sVar13, a9, b10, kVar4.f10933e));
                    i21 = kVar4.f10932d;
                    if (i21 == 7) {
                        z31 = false;
                    } else {
                        z31 = true;
                    }
                    boolean zBooleanValue2 = ((Boolean) xU.getValue()).booleanValue();
                    zH = c0698o2.h(z31) | c0698o2.i(cVar6);
                    objH11 = c0698o2.H();
                    if (zH) {
                        objH11 = new I.c(z31, cVar6);
                        c0698o2.e0(objH11);
                    } else {
                        objH11 = new I.c(z31, cVar6);
                        c0698o2.e0(objH11);
                    }
                    l0.r rVarA6 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue2, z31, (p241y9.a) objH11);
                    j10 = ((p180s0.q) c0698o2.k(AbstractC0316j.f4651a)).f21845a;
                    zI7 = c0698o2.i(w14) | c0698o2.f(j10);
                    objH12 = c0698o2.H();
                    if (zI7) {
                        i22 = 1;
                        objH12 = new C0184s(w14, j10, i22);
                        c0698o2.e0(objH12);
                    } else {
                        i22 = 1;
                        objH12 = new C0184s(w14, j10, i22);
                        c0698o2.e0(objH12);
                    }
                    l0.r rVarD4 = androidx.compose.ui.layout.a.d(l0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(rVar.b(androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH12)), cVar6, w14, n10).b(rVarA6).b(rVarE), new C0007a(11, jVar2, w14)), new C0007a(9, w14, n10)).b(mVar2), new p0(r0Var, z11, jVar)).b(rVarF2).b(coreTextFieldSemanticsModifier2), new B(w14, 0));
                    if (z11) {
                        i22 = 0;
                    } else {
                        i22 = 0;
                    }
                    if (i22 != 0) {
                        rVarA = l0.a.a(rVarA, new A.D(5, n10));
                    }
                    c0698o3 = c0698o;
                    g(rVarD4, n10, p074h0.j.d(-492537660, new C0331z(dVar, w14, l10, i11, i10, r0Var, yVar, nVar, rVarA2, rVarA5, rVarD3, rVarA, bVar, n10, i22, cVar2, sVar13, cVar4), c0698o3), c0698o3, 384);
                } else {
                    kVar2 = kVar;
                }
                zVar = zVar3;
                w10 = w15;
                if ((i24 & 48) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zI = z34 | z18 | c0698o3.i(sVar6) | c0698o3.i(interfaceC0402u) | c0698o3.i(bVar) | c0698o3.i(n6);
                Object objH110 = c0698o3.H();
                if (zI) {
                    w11 = w10;
                    sVar = sVar6;
                    c0698o2 = c0698o3;
                    kVar3 = kVar2;
                    zVar2 = zVar;
                    c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                    yVar3 = yVar;
                    n6 = n6;
                    z19 = z11;
                    c0698o2.e0(c10);
                } else {
                    w11 = w10;
                    sVar = sVar6;
                    c0698o2 = c0698o3;
                    kVar3 = kVar2;
                    zVar2 = zVar;
                    c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                    yVar3 = yVar;
                    n6 = n6;
                    z19 = z11;
                    c0698o2.e0(c10);
                }
                l0.r rVarE2 = androidx.compose.foundation.a.e(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar), (p241y9.c) c10), z19, jVar);
                xU = C0672b.u(Boolean.valueOf(z19), c0698o2);
                boolean zG6 = c0698o2.g(xU) | c0698o2.i(w11) | c0698o2.i(zVar2) | c0698o2.i(n6);
                if (i19 > 32) {
                    w12 = w11;
                    if ((i24 & 48) != 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                } else {
                    w12 = w11;
                    if ((i24 & 48) != 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                }
                z21 = z20 | zG6;
                Object objH22 = c0698o2.H();
                if (z21) {
                    sVar2 = sVar;
                    w13 = w12;
                    c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                    c0698o2.e0(c0027k);
                } else {
                    sVar2 = sVar;
                    w13 = w12;
                    c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                    c0698o2.e0(c0027k);
                }
                C0672b.f(c0698o2, p110k9.y.f19095a, (p241y9.e) c0027k);
                zI2 = c0698o2.i(w13);
                objH5 = c0698o2.H();
                if (zI2) {
                    objH5 = new B(w13, 1);
                    c0698o2.e0(objH5);
                } else {
                    objH5 = new B(w13, 1);
                    c0698o2.e0(objH5);
                }
                C0453v c0453v3 = new C0453v((p241y9.c) objH5, 0);
                C0096n c0096n3 = D0.I.f1055a;
                i20 = 6;
                suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, c0453v3, 6);
                boolean zI18 = c0698o2.i(w13);
                if (i17 == 16384) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z37 = zI18 | z22;
                if (i16 == 2048) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                zI3 = z37 | z23 | c0698o2.i(sVar2) | c0698o2.i(n6);
                objH6 = c0698o2.H();
                if (zI3) {
                    sVar3 = sVar2;
                    E e14 = new E(w13, pVar, z11, n6, sVar3);
                    c0698o2.e0(e14);
                    objH6 = e14;
                } else {
                    sVar3 = sVar2;
                    E e15 = new E(w13, pVar, z11, n6, sVar3);
                    c0698o2.e0(e15);
                    objH6 = e15;
                }
                cVar5 = (p241y9.c) objH6;
                if (z11) {
                    suspendPointerInputElement = l0.a.a(suspendPointerInputElement, new A.M(1, cVar5, jVar));
                }
                O8.c cVar11 = n6.f6329x;
                O.I i29 = n6.f6328w;
                l0.r rVarF3 = D0.u.f(suspendPointerInputElement.b(new SuspendPointerInputElement(cVar11, i29, new I(cVar11, i29), 4)), f4543b);
                boolean zI19 = c0698o2.i(w13);
                if (i18 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zI4 = zI19 | z24 | c0698o2.i(sVar3);
                objH7 = c0698o2.H();
                if (zI4) {
                    objH7 = new C0023i(w13, yVar3, sVar3, i20);
                    c0698o2.e0(objH7);
                } else {
                    objH7 = new C0023i(w13, yVar3, sVar3, i20);
                    c0698o2.e0(objH7);
                }
                rVarA = l0.o.f19333a;
                l0.r rVarA7 = androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH7);
                boolean zI110 = c0698o2.i(w13);
                if (i16 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean zG7 = zI110 | z25 | c0698o2.g(f1Var) | c0698o2.i(n6);
                if (i18 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zI5 = zG7 | z26 | c0698o2.i(sVar3);
                objH8 = c0698o2.H();
                if (zI5) {
                    Z0.s sVar14 = sVar3;
                    D d11 = new D(w13, z11, f1Var, n6, yVar3, sVar14, 0);
                    sVar3 = sVar14;
                    c0698o2.e0(d11);
                    objH8 = d11;
                } else {
                    Z0.s sVar15 = sVar3;
                    D d12 = new D(w13, z11, f1Var, n6, yVar3, sVar15, 0);
                    sVar3 = sVar15;
                    c0698o2.e0(d12);
                    objH8 = d12;
                }
                l0.r rVarD5 = androidx.compose.ui.layout.a.d(rVarA, (p241y9.c) objH8);
                W w18 = w13;
                n10 = n6;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier3 = new CoreTextFieldSemanticsModifier(f3, yVar, w18, z11, sVar3, n10, kVar, pVar);
                w14 = w18;
                if (!z11) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (z27) {
                    Z0.s sVar16 = sVar3;
                    C0201j c0201j3 = new C0201j(l11, w14, yVar, sVar16, 1);
                    w14 = w14;
                    sVar4 = sVar16;
                    rVarA2 = l0.a.a(rVarA, c0201j3);
                } else {
                    sVar4 = sVar3;
                    rVarA2 = rVarA;
                }
                zI6 = c0698o2.i(n10);
                objH9 = c0698o2.H();
                if (zI6) {
                    objH9 = new C0327v(n10, 0);
                    c0698o2.e0(objH9);
                } else {
                    objH9 = new C0327v(n10, 0);
                    c0698o2.e0(objH9);
                }
                C0672b.d(n10, (p241y9.c) objH9, c0698o2);
                boolean zI111 = c0698o2.i(w14) | c0698o2.i(zVar2);
                if (i18 == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zI111 | z28 | ((i19 <= 32 && c0698o2.g(kVar)) || (i24 & 48) == 32);
                objH10 = c0698o2.H();
                if (z29) {
                    C0033n c0033n4 = new C0033n(w14, zVar2, yVar, kVar, 5);
                    kVar4 = kVar;
                    c0698o2.e0(c0033n4);
                    objH10 = c0033n4;
                } else {
                    C0033n c0033n5 = new C0033n(w14, zVar2, yVar, kVar, 5);
                    kVar4 = kVar;
                    c0698o2.e0(c0033n5);
                    objH10 = c0033n5;
                }
                C0672b.d(kVar4, (p241y9.c) objH10, c0698o2);
                B b11 = w14.f4572v;
                if (i10 == 1) {
                    z30 = true;
                } else {
                    z30 = false;
                }
                Z0.s sVar17 = sVar4;
                l0.m mVar3 = new l0.m(new k0(w14, n10, yVar, true, z30, sVar17, a9, b11, kVar4.f10933e));
                i21 = kVar4.f10932d;
                if (i21 == 7) {
                    z31 = false;
                } else {
                    z31 = true;
                }
                boolean zBooleanValue3 = ((Boolean) xU.getValue()).booleanValue();
                zH = c0698o2.h(z31) | c0698o2.i(cVar6);
                objH11 = c0698o2.H();
                if (zH) {
                    objH11 = new I.c(z31, cVar6);
                    c0698o2.e0(objH11);
                } else {
                    objH11 = new I.c(z31, cVar6);
                    c0698o2.e0(objH11);
                }
                l0.r rVarA8 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue3, z31, (p241y9.a) objH11);
                j10 = ((p180s0.q) c0698o2.k(AbstractC0316j.f4651a)).f21845a;
                zI7 = c0698o2.i(w14) | c0698o2.f(j10);
                objH12 = c0698o2.H();
                if (zI7) {
                    i22 = 1;
                    objH12 = new C0184s(w14, j10, i22);
                    c0698o2.e0(objH12);
                } else {
                    i22 = 1;
                    objH12 = new C0184s(w14, j10, i22);
                    c0698o2.e0(objH12);
                }
                l0.r rVarD6 = androidx.compose.ui.layout.a.d(l0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(rVar.b(androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH12)), cVar6, w14, n10).b(rVarA8).b(rVarE2), new C0007a(11, jVar2, w14)), new C0007a(9, w14, n10)).b(mVar3), new p0(r0Var, z11, jVar)).b(rVarF3).b(coreTextFieldSemanticsModifier3), new B(w14, 0));
                if (z11) {
                    i22 = 0;
                } else {
                    i22 = 0;
                }
                if (i22 != 0) {
                    rVarA = l0.a.a(rVarA, new A.D(5, n10));
                }
                c0698o3 = c0698o;
                g(rVarD6, n10, p074h0.j.d(-492537660, new C0331z(dVar, w14, l10, i11, i10, r0Var, yVar, nVar, rVarA2, rVarA7, rVarD5, rVarA, bVar, n10, i22, cVar2, sVar17, cVar4), c0698o3), c0698o3, 384);
            } else {
                cVar8.f5533t = new Z0.h(c0515g3, j13);
                z13 = true;
            }
            z14 = false;
            if (k10 == null) {
                Z0.h hVar3 = (Z0.h) cVar8.f5533t;
                hVar3.f10926d = -1;
                hVar3.f10927e = -1;
            } else {
                j = k10.f8035a;
                if (!U0.K.b(j)) {
                    ((Z0.h) cVar8.f5533t).e(U0.K.e(j), U0.K.d(j));
                }
            }
            if (z13) {
                Z0.h hVar4 = (Z0.h) cVar8.f5533t;
                hVar4.f10926d = -1;
                hVar4.f10927e = -1;
                yVarA = Z0.y.a(yVar, null, 0L, 3);
            } else {
                Z0.h hVar5 = (Z0.h) cVar8.f5533t;
                hVar5.f10926d = -1;
                hVar5.f10927e = -1;
                yVarA = Z0.y.a(yVar, null, 0L, 3);
            }
            yVar2 = (Z0.y) cVar8.f5532s;
            cVar8.f5532s = yVarA;
            if (e10 != null) {
                e10.a(yVar2, yVarA);
            }
            objH = c0698o3.H();
            if (objH == s10) {
                objH = new A0();
                c0698o3.e0(objH);
            }
            a9 = (A0) objH;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (a9.f4438e) {
                a9.f4437d = Long.valueOf(jCurrentTimeMillis);
                a9.a(yVar);
            } else {
                l13 = a9.f4437d;
                if (jCurrentTimeMillis > (l13 != null ? l13.longValue() : 0L) + ((long) 5000)) {
                    a9.f4437d = Long.valueOf(jCurrentTimeMillis);
                    a9.a(yVar);
                }
            }
            objH2 = c0698o3.H();
            if (objH2 == s10) {
                objH2 = C0672b.m(c0698o3);
                c0698o3.e0(objH2);
            }
            interfaceC0402u = (InterfaceC0402u) objH2;
            objH3 = c0698o3.H();
            if (objH3 == s10) {
                objH3 = new H.b();
                c0698o3.e0(objH3);
            }
            bVar = (H.b) objH3;
            objH4 = c0698o3.H();
            if (objH4 == s10) {
                objH4 = new O.N(a9);
                c0698o3.e0(objH4);
            }
            n6 = (O.N) objH4;
            n6.f6309b = sVar6;
            n6.f6313f = nVar;
            n6.f6310c = w15.f4572v;
            n6.f6311d = w15;
            n6.f6312e.setValue(yVar);
            n6.f6314h = (InterfaceC0353k0) c0698o3.k(AbstractC0359n0.f5117f);
            n6.f6315i = interfaceC0402u;
            n6.j = (Y0) c0698o3.k(AbstractC0359n0.f5126q);
            n6.f6316k = (p243z0.a) c0698o3.k(AbstractC0359n0.f5121l);
            pVar = pVar2;
            n6.f6317l = pVar;
            n6.f6318m.setValue(true);
            n6.f6319n.setValue(Boolean.valueOf(z11));
            boolean zI20 = c0698o3.i(w15);
            i16 = i24 & 7168;
            if (i16 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z38 = z15 | zI20;
            i17 = i24 & 57344;
            if (i17 == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zI21 = z38 | z16 | c0698o3.i(zVar3);
            i18 = i25;
            if (i18 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z39 = zI21 | z17;
            i19 = (i24 & 112) ^ 48;
            if (i19 > 32) {
                kVar2 = kVar;
                if (!c0698o3.g(kVar2)) {
                    zVar = zVar3;
                    w10 = w15;
                }
                z18 = true;
                zI = z39 | z18 | c0698o3.i(sVar6) | c0698o3.i(interfaceC0402u) | c0698o3.i(bVar) | c0698o3.i(n6);
                Object objH111 = c0698o3.H();
                if (zI) {
                    w11 = w10;
                    sVar = sVar6;
                    c0698o2 = c0698o3;
                    kVar3 = kVar2;
                    zVar2 = zVar;
                    c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                    yVar3 = yVar;
                    n6 = n6;
                    z19 = z11;
                    c0698o2.e0(c10);
                } else {
                    w11 = w10;
                    sVar = sVar6;
                    c0698o2 = c0698o3;
                    kVar3 = kVar2;
                    zVar2 = zVar;
                    c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                    yVar3 = yVar;
                    n6 = n6;
                    z19 = z11;
                    c0698o2.e0(c10);
                }
                l0.r rVarE3 = androidx.compose.foundation.a.e(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar), (p241y9.c) c10), z19, jVar);
                xU = C0672b.u(Boolean.valueOf(z19), c0698o2);
                boolean zG8 = c0698o2.g(xU) | c0698o2.i(w11) | c0698o2.i(zVar2) | c0698o2.i(n6);
                if (i19 > 32) {
                    w12 = w11;
                    if ((i24 & 48) != 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                } else {
                    w12 = w11;
                    if ((i24 & 48) != 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                }
                z21 = z20 | zG8;
                Object objH23 = c0698o2.H();
                if (z21) {
                    sVar2 = sVar;
                    w13 = w12;
                    c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                    c0698o2.e0(c0027k);
                } else {
                    sVar2 = sVar;
                    w13 = w12;
                    c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                    c0698o2.e0(c0027k);
                }
                C0672b.f(c0698o2, p110k9.y.f19095a, (p241y9.e) c0027k);
                zI2 = c0698o2.i(w13);
                objH5 = c0698o2.H();
                if (zI2) {
                    objH5 = new B(w13, 1);
                    c0698o2.e0(objH5);
                } else {
                    objH5 = new B(w13, 1);
                    c0698o2.e0(objH5);
                }
                C0453v c0453v4 = new C0453v((p241y9.c) objH5, 0);
                C0096n c0096n4 = D0.I.f1055a;
                i20 = 6;
                suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, c0453v4, 6);
                boolean zI112 = c0698o2.i(w13);
                if (i17 == 16384) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z310 = zI112 | z22;
                if (i16 == 2048) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                zI3 = z310 | z23 | c0698o2.i(sVar2) | c0698o2.i(n6);
                objH6 = c0698o2.H();
                if (zI3) {
                    sVar3 = sVar2;
                    E e16 = new E(w13, pVar, z11, n6, sVar3);
                    c0698o2.e0(e16);
                    objH6 = e16;
                } else {
                    sVar3 = sVar2;
                    E e17 = new E(w13, pVar, z11, n6, sVar3);
                    c0698o2.e0(e17);
                    objH6 = e17;
                }
                cVar5 = (p241y9.c) objH6;
                if (z11) {
                    suspendPointerInputElement = l0.a.a(suspendPointerInputElement, new A.M(1, cVar5, jVar));
                }
                O8.c cVar12 = n6.f6329x;
                O.I i210 = n6.f6328w;
                l0.r rVarF4 = D0.u.f(suspendPointerInputElement.b(new SuspendPointerInputElement(cVar12, i210, new I(cVar12, i210), 4)), f4543b);
                boolean zI113 = c0698o2.i(w13);
                if (i18 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zI4 = zI113 | z24 | c0698o2.i(sVar3);
                objH7 = c0698o2.H();
                if (zI4) {
                    objH7 = new C0023i(w13, yVar3, sVar3, i20);
                    c0698o2.e0(objH7);
                } else {
                    objH7 = new C0023i(w13, yVar3, sVar3, i20);
                    c0698o2.e0(objH7);
                }
                rVarA = l0.o.f19333a;
                l0.r rVarA9 = androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH7);
                boolean zI114 = c0698o2.i(w13);
                if (i16 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean zG9 = zI114 | z25 | c0698o2.g(f1Var) | c0698o2.i(n6);
                if (i18 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zI5 = zG9 | z26 | c0698o2.i(sVar3);
                objH8 = c0698o2.H();
                if (zI5) {
                    Z0.s sVar18 = sVar3;
                    D d13 = new D(w13, z11, f1Var, n6, yVar3, sVar18, 0);
                    sVar3 = sVar18;
                    c0698o2.e0(d13);
                    objH8 = d13;
                } else {
                    Z0.s sVar19 = sVar3;
                    D d14 = new D(w13, z11, f1Var, n6, yVar3, sVar19, 0);
                    sVar3 = sVar19;
                    c0698o2.e0(d14);
                    objH8 = d14;
                }
                l0.r rVarD7 = androidx.compose.ui.layout.a.d(rVarA, (p241y9.c) objH8);
                W w19 = w13;
                n10 = n6;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier4 = new CoreTextFieldSemanticsModifier(f3, yVar, w19, z11, sVar3, n10, kVar, pVar);
                w14 = w19;
                if (!z11) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (z27) {
                    Z0.s sVar110 = sVar3;
                    C0201j c0201j4 = new C0201j(l11, w14, yVar, sVar110, 1);
                    w14 = w14;
                    sVar4 = sVar110;
                    rVarA2 = l0.a.a(rVarA, c0201j4);
                } else {
                    sVar4 = sVar3;
                    rVarA2 = rVarA;
                }
                zI6 = c0698o2.i(n10);
                objH9 = c0698o2.H();
                if (zI6) {
                    objH9 = new C0327v(n10, 0);
                    c0698o2.e0(objH9);
                } else {
                    objH9 = new C0327v(n10, 0);
                    c0698o2.e0(objH9);
                }
                C0672b.d(n10, (p241y9.c) objH9, c0698o2);
                boolean zI115 = c0698o2.i(w14) | c0698o2.i(zVar2);
                if (i18 == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zI115 | z28 | ((i19 <= 32 && c0698o2.g(kVar)) || (i24 & 48) == 32);
                objH10 = c0698o2.H();
                if (z29) {
                    C0033n c0033n6 = new C0033n(w14, zVar2, yVar, kVar, 5);
                    kVar4 = kVar;
                    c0698o2.e0(c0033n6);
                    objH10 = c0033n6;
                } else {
                    C0033n c0033n7 = new C0033n(w14, zVar2, yVar, kVar, 5);
                    kVar4 = kVar;
                    c0698o2.e0(c0033n7);
                    objH10 = c0033n7;
                }
                C0672b.d(kVar4, (p241y9.c) objH10, c0698o2);
                B b12 = w14.f4572v;
                if (i10 == 1) {
                    z30 = true;
                } else {
                    z30 = false;
                }
                Z0.s sVar111 = sVar4;
                l0.m mVar4 = new l0.m(new k0(w14, n10, yVar, true, z30, sVar111, a9, b12, kVar4.f10933e));
                i21 = kVar4.f10932d;
                if (i21 == 7) {
                    z31 = false;
                } else {
                    z31 = true;
                }
                boolean zBooleanValue4 = ((Boolean) xU.getValue()).booleanValue();
                zH = c0698o2.h(z31) | c0698o2.i(cVar6);
                objH11 = c0698o2.H();
                if (zH) {
                    objH11 = new I.c(z31, cVar6);
                    c0698o2.e0(objH11);
                } else {
                    objH11 = new I.c(z31, cVar6);
                    c0698o2.e0(objH11);
                }
                l0.r rVarA10 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue4, z31, (p241y9.a) objH11);
                j10 = ((p180s0.q) c0698o2.k(AbstractC0316j.f4651a)).f21845a;
                zI7 = c0698o2.i(w14) | c0698o2.f(j10);
                objH12 = c0698o2.H();
                if (zI7) {
                    i22 = 1;
                    objH12 = new C0184s(w14, j10, i22);
                    c0698o2.e0(objH12);
                } else {
                    i22 = 1;
                    objH12 = new C0184s(w14, j10, i22);
                    c0698o2.e0(objH12);
                }
                l0.r rVarD8 = androidx.compose.ui.layout.a.d(l0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(rVar.b(androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH12)), cVar6, w14, n10).b(rVarA10).b(rVarE3), new C0007a(11, jVar2, w14)), new C0007a(9, w14, n10)).b(mVar4), new p0(r0Var, z11, jVar)).b(rVarF4).b(coreTextFieldSemanticsModifier4), new B(w14, 0));
                if (z11) {
                    i22 = 0;
                } else {
                    i22 = 0;
                }
                if (i22 != 0) {
                    rVarA = l0.a.a(rVarA, new A.D(5, n10));
                }
                c0698o3 = c0698o;
                g(rVarD8, n10, p074h0.j.d(-492537660, new C0331z(dVar, w14, l10, i11, i10, r0Var, yVar, nVar, rVarA2, rVarA9, rVarD7, rVarA, bVar, n10, i22, cVar2, sVar111, cVar4), c0698o3), c0698o3, 384);
            } else {
                kVar2 = kVar;
            }
            zVar = zVar3;
            w10 = w15;
            if ((i24 & 48) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            zI = z39 | z18 | c0698o3.i(sVar6) | c0698o3.i(interfaceC0402u) | c0698o3.i(bVar) | c0698o3.i(n6);
            Object objH112 = c0698o3.H();
            if (zI) {
                w11 = w10;
                sVar = sVar6;
                c0698o2 = c0698o3;
                kVar3 = kVar2;
                zVar2 = zVar;
                c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                yVar3 = yVar;
                n6 = n6;
                z19 = z11;
                c0698o2.e0(c10);
            } else {
                w11 = w10;
                sVar = sVar6;
                c0698o2 = c0698o3;
                kVar3 = kVar2;
                zVar2 = zVar;
                c10 = new C(w11, z11, zVar2, yVar, kVar3, sVar, n6, interfaceC0402u, bVar);
                yVar3 = yVar;
                n6 = n6;
                z19 = z11;
                c0698o2.e0(c10);
            }
            l0.r rVarE4 = androidx.compose.foundation.a.e(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(pVar), (p241y9.c) c10), z19, jVar);
            xU = C0672b.u(Boolean.valueOf(z19), c0698o2);
            boolean zG10 = c0698o2.g(xU) | c0698o2.i(w11) | c0698o2.i(zVar2) | c0698o2.i(n6);
            if (i19 > 32) {
                w12 = w11;
                if ((i24 & 48) != 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
            } else {
                w12 = w11;
                if ((i24 & 48) != 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
            }
            z21 = z20 | zG10;
            Object objH24 = c0698o2.H();
            if (z21) {
                sVar2 = sVar;
                w13 = w12;
                c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                c0698o2.e0(c0027k);
            } else {
                sVar2 = sVar;
                w13 = w12;
                c0027k = new C0027k(w13, xU, zVar2, n6, kVar3, null, 2);
                c0698o2.e0(c0027k);
            }
            C0672b.f(c0698o2, p110k9.y.f19095a, (p241y9.e) c0027k);
            zI2 = c0698o2.i(w13);
            objH5 = c0698o2.H();
            if (zI2) {
                objH5 = new B(w13, 1);
                c0698o2.e0(objH5);
            } else {
                objH5 = new B(w13, 1);
                c0698o2.e0(objH5);
            }
            C0453v c0453v5 = new C0453v((p241y9.c) objH5, 0);
            C0096n c0096n5 = D0.I.f1055a;
            i20 = 6;
            suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, c0453v5, 6);
            boolean zI116 = c0698o2.i(w13);
            if (i17 == 16384) {
                z22 = true;
            } else {
                z22 = false;
            }
            boolean z311 = zI116 | z22;
            if (i16 == 2048) {
                z23 = true;
            } else {
                z23 = false;
            }
            zI3 = z311 | z23 | c0698o2.i(sVar2) | c0698o2.i(n6);
            objH6 = c0698o2.H();
            if (zI3) {
                sVar3 = sVar2;
                E e18 = new E(w13, pVar, z11, n6, sVar3);
                c0698o2.e0(e18);
                objH6 = e18;
            } else {
                sVar3 = sVar2;
                E e19 = new E(w13, pVar, z11, n6, sVar3);
                c0698o2.e0(e19);
                objH6 = e19;
            }
            cVar5 = (p241y9.c) objH6;
            if (z11) {
                suspendPointerInputElement = l0.a.a(suspendPointerInputElement, new A.M(1, cVar5, jVar));
            }
            O8.c cVar13 = n6.f6329x;
            O.I i211 = n6.f6328w;
            l0.r rVarF5 = D0.u.f(suspendPointerInputElement.b(new SuspendPointerInputElement(cVar13, i211, new I(cVar13, i211), 4)), f4543b);
            boolean zI117 = c0698o2.i(w13);
            if (i18 == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            zI4 = zI117 | z24 | c0698o2.i(sVar3);
            objH7 = c0698o2.H();
            if (zI4) {
                objH7 = new C0023i(w13, yVar3, sVar3, i20);
                c0698o2.e0(objH7);
            } else {
                objH7 = new C0023i(w13, yVar3, sVar3, i20);
                c0698o2.e0(objH7);
            }
            rVarA = l0.o.f19333a;
            l0.r rVarA11 = androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH7);
            boolean zI118 = c0698o2.i(w13);
            if (i16 == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean zG11 = zI118 | z25 | c0698o2.g(f1Var) | c0698o2.i(n6);
            if (i18 == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            zI5 = zG11 | z26 | c0698o2.i(sVar3);
            objH8 = c0698o2.H();
            if (zI5) {
                Z0.s sVar112 = sVar3;
                D d15 = new D(w13, z11, f1Var, n6, yVar3, sVar112, 0);
                sVar3 = sVar112;
                c0698o2.e0(d15);
                objH8 = d15;
            } else {
                Z0.s sVar113 = sVar3;
                D d16 = new D(w13, z11, f1Var, n6, yVar3, sVar113, 0);
                sVar3 = sVar113;
                c0698o2.e0(d16);
                objH8 = d16;
            }
            l0.r rVarD9 = androidx.compose.ui.layout.a.d(rVarA, (p241y9.c) objH8);
            W w110 = w13;
            n10 = n6;
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier5 = new CoreTextFieldSemanticsModifier(f3, yVar, w110, z11, sVar3, n10, kVar, pVar);
            w14 = w110;
            if (!z11) {
                z27 = false;
            } else {
                z27 = false;
            }
            if (z27) {
                Z0.s sVar114 = sVar3;
                C0201j c0201j5 = new C0201j(l11, w14, yVar, sVar114, 1);
                w14 = w14;
                sVar4 = sVar114;
                rVarA2 = l0.a.a(rVarA, c0201j5);
            } else {
                sVar4 = sVar3;
                rVarA2 = rVarA;
            }
            zI6 = c0698o2.i(n10);
            objH9 = c0698o2.H();
            if (zI6) {
                objH9 = new C0327v(n10, 0);
                c0698o2.e0(objH9);
            } else {
                objH9 = new C0327v(n10, 0);
                c0698o2.e0(objH9);
            }
            C0672b.d(n10, (p241y9.c) objH9, c0698o2);
            boolean zI119 = c0698o2.i(w14) | c0698o2.i(zVar2);
            if (i18 == 4) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zI119 | z28 | ((i19 <= 32 && c0698o2.g(kVar)) || (i24 & 48) == 32);
            objH10 = c0698o2.H();
            if (z29) {
                C0033n c0033n8 = new C0033n(w14, zVar2, yVar, kVar, 5);
                kVar4 = kVar;
                c0698o2.e0(c0033n8);
                objH10 = c0033n8;
            } else {
                C0033n c0033n9 = new C0033n(w14, zVar2, yVar, kVar, 5);
                kVar4 = kVar;
                c0698o2.e0(c0033n9);
                objH10 = c0033n9;
            }
            C0672b.d(kVar4, (p241y9.c) objH10, c0698o2);
            B b13 = w14.f4572v;
            if (i10 == 1) {
                z30 = true;
            } else {
                z30 = false;
            }
            Z0.s sVar115 = sVar4;
            l0.m mVar5 = new l0.m(new k0(w14, n10, yVar, true, z30, sVar115, a9, b13, kVar4.f10933e));
            i21 = kVar4.f10932d;
            if (i21 == 7) {
                z31 = false;
            } else {
                z31 = true;
            }
            boolean zBooleanValue5 = ((Boolean) xU.getValue()).booleanValue();
            zH = c0698o2.h(z31) | c0698o2.i(cVar6);
            objH11 = c0698o2.H();
            if (zH) {
                objH11 = new I.c(z31, cVar6);
                c0698o2.e0(objH11);
            } else {
                objH11 = new I.c(z31, cVar6);
                c0698o2.e0(objH11);
            }
            l0.r rVarA12 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue5, z31, (p241y9.a) objH11);
            j10 = ((p180s0.q) c0698o2.k(AbstractC0316j.f4651a)).f21845a;
            zI7 = c0698o2.i(w14) | c0698o2.f(j10);
            objH12 = c0698o2.H();
            if (zI7) {
                i22 = 1;
                objH12 = new C0184s(w14, j10, i22);
                c0698o2.e0(objH12);
            } else {
                i22 = 1;
                objH12 = new C0184s(w14, j10, i22);
                c0698o2.e0(objH12);
            }
            l0.r rVarD10 = androidx.compose.ui.layout.a.d(l0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(rVar.b(androidx.compose.ui.draw.a.a(rVarA, (p241y9.c) objH12)), cVar6, w14, n10).b(rVarA12).b(rVarE4), new C0007a(11, jVar2, w14)), new C0007a(9, w14, n10)).b(mVar5), new p0(r0Var, z11, jVar)).b(rVarF5).b(coreTextFieldSemanticsModifier5), new B(w14, 0));
            if (z11) {
                i22 = 0;
            } else {
                i22 = 0;
            }
            if (i22 != 0) {
                rVarA = l0.a.a(rVarA, new A.D(5, n10));
            }
            c0698o3 = c0698o;
            g(rVarD10, n10, p074h0.j.d(-492537660, new C0331z(dVar, w14, l10, i11, i10, r0Var, yVar, nVar, rVarA2, rVarA11, rVarD9, rVarA, bVar, n10, i22, cVar2, sVar115, cVar4), c0698o3), c0698o3, 384);
        } else {
            c0698o3.N();
        }
        C0699o0 c0699o0R = c0698o3.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A(yVar, cVar, rVar, l10, nVar, cVar2, jVar, l11, z10, i10, i11, kVar, u8, z11, dVar, i12, i13);
        }
    }

    public static final void g(l0.r rVar, O.N n6, p074h0.d dVar, C0698o c0698o, int i10) {
        c0698o.V(-20551815);
        int i11 = (c0698o.g(rVar) ? 4 : 2) | i10 | (c0698o.i(n6) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, true);
            int i12 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            e(n6, dVar, c0698o, (i11 >> 3) & 126);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I0(rVar, n6, dVar, i10, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4, types: [Z.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r40v0, types: [Z.o] */
    /* JADX WARN: Type inference failed for: r9v14, types: [l9.r] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList] */
    public static final void h(l0.r rVar, C0515g c0515g, p241y9.c cVar, boolean z10, Map map, U0.L l10, int i10, boolean z11, int i11, int i12, Y0.d dVar, p241y9.c cVar2, C0698o c0698o, int i13, int i14) {
        w0 w0Var;
        p241y9.a aVar;
        p110k9.j jVar;
        p241y9.c cVar3;
        ?? r10;
        Object obj;
        Object x0Var;
        boolean z12;
        ?? r12;
        Object obj2;
        Object obj3;
        Object obj4;
        ?? arrayList;
        c0698o.V(-2118572703);
        int i15 = (i13 & 6) == 0 ? (c0698o.g(rVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c0698o.g(c0515g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c0698o.i(cVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c0698o.h(z10) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c0698o.i(map) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= c0698o.g(l10) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c0698o.e(i10) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c0698o.h(z11) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c0698o.e(i11) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c0698o.e(i12) ? 536870912 : 268435456;
        }
        int i16 = (i14 & 6) == 0 ? i14 | (c0698o.i(dVar) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i16 |= c0698o.i(null) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c0698o.i(null) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c0698o.i(cVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= (32768 & i14) == 0 ? c0698o.g(null) : c0698o.i(null) ? 16384 : 8192;
        }
        if (c0698o.K(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 9363) == 9362) ? false : true)) {
            boolean zD = F9.n.D(c0515g);
            Z.S s10 = C0690k.f10683a;
            if (zD) {
                c0698o.T(-613484007);
                boolean z13 = (i15 & 112) == 32;
                Object objH = c0698o.H();
                Object obj5 = objH;
                if (z13 || objH == s10) {
                    w0 w0Var2 = new w0(c0515g);
                    c0698o.e0(w0Var2);
                    obj5 = w0Var2;
                }
                w0Var = (w0) obj5;
                c0698o.p(false);
            } else {
                c0698o.T(-613418350);
                c0698o.p(false);
                w0Var = null;
            }
            if (F9.n.D(c0515g)) {
                c0698o.T(-613220135);
                boolean zG = ((i15 & 112) == 32) | c0698o.g(w0Var);
                Object objH2 = c0698o.H();
                Object obj6 = objH2;
                if (zG || objH2 == s10) {
                    C0086d c0086d = new C0086d(9, w0Var, c0515g);
                    c0698o.e0(c0086d);
                    obj6 = c0086d;
                }
                aVar = (p241y9.a) obj6;
                c0698o.p(false);
            } else {
                c0698o.T(-613122857);
                boolean z14 = (i15 & 112) == 32;
                Object objH3 = c0698o.H();
                Object obj7 = objH3;
                if (z14 || objH3 == s10) {
                    C0041r0 c0041r0 = new C0041r0(11, c0515g);
                    c0698o.e0(c0041r0);
                    obj7 = c0041r0;
                }
                aVar = (p241y9.a) obj7;
                c0698o.p(false);
            }
            if (z10) {
                if (map != null) {
                    p110k9.j jVar2 = AbstractC0314h.f4644a;
                    if (map.isEmpty()) {
                        jVar = AbstractC0314h.f4644a;
                    } else {
                        int length = c0515g.f8060s.length();
                        List list = c0515g.f8059r;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i17 = 0;
                            while (i17 < size) {
                                List list2 = list;
                                C0513e c0513e = (C0513e) list.get(i17);
                                int i18 = size;
                                Object obj8 = c0513e.f8054a;
                                int i19 = i17;
                                int i20 = c0513e.f8056c;
                                int i21 = c0513e.f8055b;
                                String str = c0513e.f8057d;
                                if ((obj8 instanceof U0.F) && "androidx.compose.foundation.text.inlineContent".equals(str) && AbstractC0517i.b(0, length, i21, i20)) {
                                    Object obj9 = c0513e.f8054a;
                                    p251z9.j.c(obj9, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    arrayList.add(new C0513e(((U0.F) obj9).f8012a, i21, i20, str));
                                }
                                i17 = i19 + 1;
                                size = i18;
                                list = list2;
                                length = length;
                            }
                        } else {
                            arrayList = p120l9.r.f19440r;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            if (map.get(((C0513e) arrayList.get(i22)).f8054a) != null) {
                                throw new ClassCastException();
                            }
                        }
                        jVar = new p110k9.j(arrayList2, arrayList3);
                    }
                } else {
                    jVar = AbstractC0314h.f4644a;
                }
                cVar3 = null;
            } else {
                aVar = aVar;
                cVar3 = null;
                jVar = new p110k9.j(null, null);
            }
            List list3 = (List) jVar.f19077r;
            List list4 = (List) jVar.f19078s;
            if (z10) {
                c0698o.T(-612806750);
                Object objH4 = c0698o.H();
                if (objH4 == s10) {
                    obj4 = objH4;
                    C0681f0 c0681f0R = C0672b.r(cVar3);
                    c0698o.e0(c0681f0R);
                    obj4 = c0681f0R;
                }
                obj4 = objH4;
                c0698o.p(false);
                r10 = (Z.X) obj4;
            } else {
                c0698o.T(-612718990);
                c0698o.p(false);
                r10 = cVar3;
            }
            int i23 = 3;
            if (z10) {
                c0698o.T(-612625741);
                boolean zG2 = c0698o.g(r10);
                Object objH5 = c0698o.H();
                if (zG2 || objH5 == s10) {
                    obj3 = objH5;
                    U0 u8 = new U0(r10, i23);
                    c0698o.e0(u8);
                    obj3 = u8;
                }
                cVar3 = (p241y9.c) obj3;
                c0698o.p(false);
            } else {
                c0698o.T(-612554318);
                c0698o.p(false);
            }
            p241y9.c cVar4 = cVar3;
            C0515g c0515g2 = (C0515g) aVar.invoke();
            boolean zI = c0698o.i(w0Var) | ((i15 & 896) == 256);
            Object objH6 = c0698o.H();
            Object obj10 = objH6;
            if (zI || objH6 == s10) {
                r rVar2 = new r(w0Var, cVar, 0);
                c0698o.e0(rVar2);
                obj10 = rVar2;
            }
            l0.r rVarY = y(rVar, c0515g2, l10, (p241y9.c) obj10, i10, z11, i11, i12, dVar, list3, cVar4, null, cVar2);
            if (z10) {
                c0698o.T(-611365560);
                boolean zI2 = c0698o.i(w0Var);
                Object objH7 = c0698o.H();
                if (zI2 || objH7 == s10) {
                    obj = objH7;
                    C0324s c0324s = new C0324s(w0Var, 1);
                    c0698o.e0(c0324s);
                    obj = c0324s;
                }
                p241y9.a aVar2 = (p241y9.a) obj;
                boolean zG3 = c0698o.g(r10);
                Object objH8 = c0698o.H();
                Object obj11 = objH8;
                if (zG3 || objH8 == s10) {
                    F.k kVar = new F.k(r10, i23);
                    c0698o.e0(kVar);
                    obj11 = kVar;
                }
                x0Var = new x0(0, aVar2, (p241y9.a) obj11);
                c0698o.p(false);
            } else {
                c0698o.T(-611542291);
                boolean zI3 = c0698o.i(w0Var);
                Object objH9 = c0698o.H();
                if (zI3 || objH9 == s10) {
                    r12 = 0;
                    C0324s c0324s2 = new C0324s(w0Var, false ? 1 : 0);
                    c0698o.e0(c0324s2);
                    obj2 = c0324s2;
                } else {
                    r12 = 0;
                    obj2 = objH9;
                }
                x0Var = new Y(r12, (p241y9.a) obj2);
                c0698o.p(r12);
            }
            int i24 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarY);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, x0Var, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i24))) {
                p123m2.c.y(i24, c0698o, i24, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            if (w0Var == null) {
                c0698o.T(-509592027);
                z12 = false;
            } else {
                z12 = false;
                c0698o.T(537750876);
                w0Var.a(0, c0698o);
            }
            c0698o.p(z12);
            if (list4 == null) {
                c0698o.T(-509541249);
            } else {
                c0698o.T(-509541248);
                AbstractC0314h.a(c0515g, list4, c0698o, (i15 >> 3) & 14);
            }
            c0698o.p(z12);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0325t(rVar, c0515g, cVar, z10, map, l10, i10, z11, i11, i12, dVar, cVar2, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011e  */
    public static final void i(O.N n6, C0698o c0698o, int i10) {
        c0698o.V(-1436003720);
        int i11 = (c0698o.i(n6) ? 4 : 2) | i10;
        int i12 = 1;
        int i13 = 0;
        if (c0698o.K(i11 & 1, (i11 & 3) != 2)) {
            W w9 = n6.f6311d;
            if (w9 == null || !((Boolean) w9.f4565o.getValue()).booleanValue()) {
                c0698o.T(-288632802);
                c0698o.p(false);
            } else {
                W w10 = n6.f6311d;
                C0515g c0515g = w10 != null ? w10.f4553a.f4632a : null;
                if (c0515g == null || c0515g.f8060s.length() <= 0) {
                    c0698o.T(-288632802);
                    c0698o.p(false);
                } else {
                    c0698o.T(-289940723);
                    boolean zG = c0698o.g(n6);
                    Object objH = c0698o.H();
                    Object obj = C0690k.f10683a;
                    if (zG || objH == obj) {
                        objH = new O.I(n6, i13);
                        c0698o.e0(objH);
                    }
                    g0 g0Var = (g0) objH;
                    p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
                    Z0.s sVar = n6.f6309b;
                    long j = n6.k().f10954b;
                    int i14 = U0.K.f8034c;
                    int iB = sVar.b((int) (j >> 32));
                    W w11 = n6.f6311d;
                    t0 t0VarD = w11 != null ? w11.d() : null;
                    p251z9.j.b(t0VarD);
                    U0.I i15 = t0VarD.f4794a;
                    p171r0.e eVarC = i15.c(B0.c.l(iB, 0, i15.f8023a.f8015a.f8060s.length()));
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(eVarC.f21392d)) & 4294967295L) | (((long) Float.floatToRawIntBits((cVar.w(h0.f4645a) / 2) + eVarC.f21389a)) << 32);
                    boolean zF = c0698o.f(jFloatToRawIntBits);
                    Object objH2 = c0698o.H();
                    if (zF || objH2 == obj) {
                        objH2 = new G(jFloatToRawIntBits);
                        c0698o.e0(objH2);
                    }
                    InterfaceC0444l interfaceC0444l = (InterfaceC0444l) objH2;
                    boolean zI = c0698o.i(g0Var) | c0698o.i(n6);
                    Object objH3 = c0698o.H();
                    if (zI || objH3 == obj) {
                        objH3 = new I(g0Var, n6);
                        c0698o.e0(objH3);
                    }
                    SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(g0Var, null, (PointerInputEventHandler) objH3, 6);
                    boolean zF2 = c0698o.f(jFloatToRawIntBits);
                    Object objH4 = c0698o.H();
                    if (zF2 || objH4 == obj) {
                        objH4 = new C0310d(jFloatToRawIntBits, i12);
                        c0698o.e0(objH4);
                    }
                    AbstractC0312f.a(interfaceC0444l, R0.m.a(suspendPointerInputElement, false, (p241y9.c) objH4), 0L, c0698o, 0);
                    c0698o.p(false);
                }
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new R0(i10, 7, n6);
        }
    }

    public static final void j(O.N n6, boolean z10, C0698o c0698o, int i10) {
        int i11;
        t0 t0VarD;
        c0698o.V(626339208);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(n6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.h(z10) ? 32 : 16;
        }
        if (!c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            c0698o.N();
        } else if (z10) {
            c0698o.T(-1290924834);
            W w9 = n6.f6311d;
            U0.I i12 = null;
            if (w9 != null && (t0VarD = w9.d()) != null) {
                U0.I i13 = t0VarD.f4794a;
                W w10 = n6.f6311d;
                if (!(w10 != null ? w10.f4566p : true)) {
                    i12 = i13;
                }
            }
            if (i12 == null) {
                c0698o.T(-1290601288);
            } else {
                c0698o.T(-1290601287);
                if (U0.K.b(n6.k().f10954b)) {
                    c0698o.T(-1684179174);
                    c0698o.p(false);
                } else {
                    c0698o.T(-1685230508);
                    int iB = n6.f6309b.b((int) (n6.k().f10954b >> 32));
                    int iB2 = n6.f6309b.b((int) (n6.k().f10954b & 4294967295L));
                    p055f1.j jVarA = i12.a(iB);
                    p055f1.j jVarA2 = i12.a(Math.max(iB2 - 1, 0));
                    W w11 = n6.f6311d;
                    if (w11 == null || !((Boolean) w11.f4563m.getValue()).booleanValue()) {
                        c0698o.T(-1684548198);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-1684812473);
                        p050e8.b.f(true, jVarA, n6, c0698o, ((i11 << 6) & 896) | 6);
                        c0698o.p(false);
                    }
                    W w12 = n6.f6311d;
                    if (w12 == null || !((Boolean) w12.f4564n.getValue()).booleanValue()) {
                        c0698o.T(-1684200998);
                        c0698o.p(false);
                    } else {
                        c0698o.T(-1684464312);
                        p050e8.b.f(false, jVarA2, n6, c0698o, ((i11 << 6) & 896) | 6);
                        c0698o.p(false);
                    }
                    c0698o.p(false);
                }
                W w13 = n6.f6311d;
                if (w13 != null) {
                    C0681f0 c0681f0 = w13.f4562l;
                    if (!p251z9.j.a(n6.f6326u.f10953a.f8060s, n6.k().f10953a.f8060s)) {
                        c0681f0.setValue(Boolean.FALSE);
                    }
                    if (w13.b()) {
                        if (((Boolean) c0681f0.getValue()).booleanValue()) {
                            n6.p();
                        } else {
                            n6.l();
                        }
                    }
                }
            }
            c0698o.p(false);
            c0698o.p(false);
        } else {
            c0698o.T(651160447);
            c0698o.p(false);
            n6.l();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new F(n6, z10, i10);
        }
    }

    public static final void k(W w9) {
        Z0.E e10 = w9.f4557e;
        if (e10 != null) {
            w9.f4572v.e(Z0.y.a((Z0.y) w9.f4556d.f5532s, null, 0L, 3));
            Z0.z zVar = e10.f10889a;
            AtomicReference atomicReference = zVar.f10957b;
            while (!atomicReference.compareAndSet(e10, null)) {
                if (atomicReference.get() != e10) {
                }
            }
            zVar.f10956a.g();
        }
        w9.f4557e = null;
    }

    public static final p171r0.e l(p063g1.c cVar, int i10, Z0.F f3, U0.I i11, boolean z10, int i12) {
        p171r0.e eVarC = i11 != null ? i11.c(f3.f10892b.b(i10)) : p171r0.e.f21388e;
        float f7 = eVarC.f21389a;
        int iE = cVar.E(h0.f4645a);
        return p171r0.e.a(eVarC, z10 ? (i12 - f7) - iE : f7, z10 ? i12 - f7 : iE + f7, 10);
    }

    public static final boolean m(int i10, KeyEvent keyEvent) {
        return ((int) (B0.c.H(keyEvent) >> 32)) == i10;
    }

    public static final ArrayList n(List list, p241y9.a aVar) {
        y0 y0Var;
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            H0.H h7 = (H0.H) list.get(i10);
            Object objI = h7.i();
            p251z9.j.c(objI, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            u0 u0Var = ((z0) objI).f4862a;
            w0 w0Var = (w0) u0Var.f4803s;
            C0513e c0513e = (C0513e) u0Var.f4804t;
            U0.I i11 = (U0.I) w0Var.f4812a.getValue();
            if (i11 == null) {
                y0Var = new y0(0, 0, C0315i.f4647t);
            } else {
                C0513e c0513eC = w0.c(c0513e, i11);
                if (c0513eC == null) {
                    y0Var = new y0(0, 0, C0315i.f4648u);
                } else {
                    p063g1.k kVarB0 = B0.c.b0(i11.h(c0513eC.f8055b, c0513eC.f8056c).a());
                    y0Var = new y0(kVarB0.d(), kVarB0.b(), new C0041r0(15, kVarB0));
                }
            }
            int i12 = y0Var.f4841r;
            int i13 = y0Var.f4842s;
            arrayList.add(new p110k9.j(h7.a(AbstractC0813f2.A(i12, i12, i13, i13)), (p251z9.k) y0Var.f4843t));
        }
        return arrayList;
    }

    public static final void o(Z0.z zVar, W w9, Z0.y yVar, Z0.k kVar, Z0.s sVar) {
        L5.c cVar = w9.f4556d;
        B b5 = w9.f4572v;
        B b10 = w9.f4573w;
        p251z9.v vVar = new p251z9.v();
        C0023i c0023i = new C0023i(cVar, b5, vVar, 8);
        Z0.t tVar = zVar.f10956a;
        tVar.h(yVar, kVar, c0023i, b10);
        Z0.E e10 = new Z0.E(zVar, tVar);
        zVar.f10957b.set(e10);
        vVar.f24886r = e10;
        w9.f4557e = e10;
        w(w9, yVar, sVar);
    }

    public static final int p(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static final Z0.F q(W2.n nVar, C0515g c0515g) {
        nVar.getClass();
        int length = c0515g.f8060s.length();
        int length2 = c0515g.f8060s.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            A(i10, length2, i10);
        }
        A(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            B(i11, length, i11);
        }
        B(length2, length, length2);
        return new Z0.F(c0515g, new C0127i0(c0515g.f8060s.length(), c0515g.f8060s.length()));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.support.v4.media.session.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final int r(int i10, String str) {
        p013b2.j jVarA;
        ?? r10;
        ?? r11;
        int spanEnd;
        Integer num = null;
        if (p013b2.j.d()) {
            jVarA = p013b2.j.a();
            if (jVarA.c() != 1) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            if (!(jVarA.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            B0.c.i(str, "charSequence cannot be null");
            ?? r12 = (android.support.v4.media.session.r) jVarA.f13162e.f13154a;
            r12.getClass();
            if (i10 < 0 || i10 >= str.length()) {
                r11 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                p013b2.y[] yVarArr = (p013b2.y[]) spanned.getSpans(i10, i10 + 1, p013b2.y.class);
                if (yVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(yVarArr[0]);
                    r11 = str;
                } else {
                    ?? r13 = str;
                    spanEnd = ((p013b2.q) r12.L(r13, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new p013b2.q(i10))).f13175t;
                    r11 = r13;
                }
            } else {
                ?? r14 = str;
                spanEnd = ((p013b2.q) r12.L(r14, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new p013b2.q(i10))).f13175t;
                r11 = r14;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r10 = r11;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r10 = str;
        }
        if (num != null) {
            r10 = r11;
            return num.intValue();
        }
        r10 = r11;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r10);
        return characterInstance.following(i10);
    }

    public static final int s(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int t(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final int u(int i10, String str) {
        p013b2.j jVarA;
        Integer num = null;
        if (p013b2.j.d()) {
            jVarA = p013b2.j.a();
            if (jVarA.c() != 1) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            int iB = jVarA.b(str, Math.max(0, i10 - 1));
            Integer numValueOf = Integer.valueOf(iB);
            if (iB != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v20 */
    public static final Object v(O.N n6, q9.c cVar) {
        C0326u c0326u;
        int i10;
        int i11;
        int i12;
        O.N n10;
        int i13;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        int i14;
        int i15;
        int i16;
        if (cVar instanceof C0326u) {
            c0326u = (C0326u) cVar;
            int i17 = c0326u.f4801v;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                c0326u.f4801v = i17 - Integer.MIN_VALUE;
            } else {
                c0326u = new C0326u(cVar);
            }
        } else {
            c0326u = new C0326u(cVar);
        }
        Object obj = c0326u.f4800u;
        int i18 = c0326u.f4801v;
        if (i18 == 0) {
            p110k9.a.e(obj);
            W2.n nVar = n6.f6313f;
            i10 = !U0.K.b(n6.k().f10954b) ? 1 : 0;
            if (n6.h()) {
                InterfaceC0353k0 interfaceC0353k0 = n6.f6314h;
                if (interfaceC0353k0 != null) {
                    c0326u.f4797r = n6;
                    c0326u.f4798s = i10;
                    c0326u.f4799t = i10;
                    c0326u.f4801v = 1;
                    ClipData primaryClip = ((C0344g) interfaceC0353k0).f5073a.f5075a.getPrimaryClip();
                    C0351j0 c0351j0 = primaryClip != null ? new C0351j0(primaryClip) : null;
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (c0351j0 == aVar) {
                        return aVar;
                    }
                    i12 = i10;
                    obj = c0351j0;
                    n10 = n6;
                    i13 = i12;
                } else {
                    i11 = i10;
                }
                r10 = false;
                if (r10 == true) {
                    r11 = true;
                }
                if (i10 == 0 && n6.h()) {
                    r12 = true;
                } else {
                    r12 = false;
                }
                if (U0.K.c(n6.k().f10954b) != n6.k().f10953a.f8060s.length()) {
                    r13 = true;
                } else {
                    r13 = false;
                }
                boolean z10 = !n6.h() && U0.K.b(n6.k().f10954b);
                if (r11 == true) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                int i19 = i14 | i11;
                if (r12 == true) {
                    i15 = 4;
                } else {
                    i15 = 0;
                }
                int i20 = i19 | i15;
                if (r13 == true) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                return new c0(i20 | i16 | (z10 ? 16 : 0));
            }
            i11 = i10;
            r11 = false;
            if (i10 == 0) {
                r12 = false;
            } else {
                r12 = false;
            }
            if (U0.K.c(n6.k().f10954b) != n6.k().f10953a.f8060s.length()) {
                r13 = true;
            } else {
                r13 = false;
            }
            if (n6.h()) {
            }
            if (r11 == true) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            int i110 = i14 | i11;
            if (r12 == true) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            int i21 = i110 | i15;
            if (r13 == true) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            return new c0(i21 | i16 | (z10 ? 16 : 0));
        }
        if (i18 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i13 = c0326u.f4799t;
        i12 = c0326u.f4798s;
        n10 = c0326u.f4797r;
        p110k9.a.e(obj);
        C0351j0 c0351j1 = (C0351j0) obj;
        if (c0351j1 == null || !c0351j1.f5084a.getDescription().hasMimeType("text/*")) {
            O.N n11 = n10;
            i11 = i13;
            n6 = n11;
            i10 = i12;
            r10 = false;
        } else {
            O.N n12 = n10;
            i11 = i13;
            n6 = n12;
            i10 = i12;
            r10 = true;
        }
        if (r10 == true) {
            r11 = true;
        } else {
            r11 = false;
        }
        if (i10 == 0) {
            r12 = false;
        } else {
            r12 = false;
        }
        if (U0.K.c(n6.k().f10954b) != n6.k().f10953a.f8060s.length()) {
            r13 = true;
        } else {
            r13 = false;
        }
        if (n6.h()) {
        }
        if (r11 == true) {
            i14 = 2;
        } else {
            i14 = 0;
        }
        int i111 = i14 | i11;
        if (r12 == true) {
            i15 = 4;
        } else {
            i15 = 0;
        }
        int i22 = i111 | i15;
        if (r13 == true) {
            i16 = 8;
        } else {
            i16 = 0;
        }
        return new c0(i22 | i16 | (z10 ? 16 : 0));
    }

    public static final void w(W w9, Z0.y yVar, Z0.s sVar) {
        p093j0.i iVarC = p093j0.s.c();
        p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
        p093j0.i iVarD = p093j0.s.d(iVarC);
        try {
            t0 t0VarD = w9.d();
            if (t0VarD == null) {
                return;
            }
            Z0.E e10 = w9.f4557e;
            if (e10 == null) {
                return;
            }
            InterfaceC0219s interfaceC0219sC = w9.c();
            if (interfaceC0219sC == null) {
                return;
            }
            x(yVar, w9.f4553a, t0VarD.f4794a, interfaceC0219sC, e10, w9.b(), sVar);
        } finally {
            p093j0.s.g(iVarC, iVarD, cVarE);
        }
    }

    public static void x(Z0.y yVar, f0 f0Var, U0.I i10, InterfaceC0219s interfaceC0219s, Z0.E e10, boolean z10, Z0.s sVar) {
        p171r0.e eVarB;
        if (z10) {
            int iB = sVar.b(U0.K.d(yVar.f10954b));
            if (iB < i10.f8023a.f8015a.f8060s.length()) {
                eVarB = i10.b(iB);
            } else {
                eVarB = iB != 0 ? i10.b(iB - 1) : new p171r0.e(0.0f, 0.0f, 1.0f, (int) (i0.a(f0Var.f4633b, f0Var.g, f0Var.f4638h, i0.f4650a, 1) & 4294967295L));
            }
            float f3 = eVarB.f21390b;
            float f7 = eVarB.f21389a;
            long jG = interfaceC0219s.G((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            p171r0.e eVarD = p171r0.f.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG >> 32)))) << 32), (((long) Float.floatToRawIntBits(eVarB.f21391c - f7)) << 32) | (((long) Float.floatToRawIntBits(eVarB.f21392d - f3)) & 4294967295L));
            if (p251z9.j.a((Z0.E) e10.f10889a.f10957b.get(), e10)) {
                e10.f10890b.b(eVarD);
            }
        }
    }

    public static final l0.r y(l0.r rVar, C0515g c0515g, U0.L l10, p241y9.c cVar, int i10, boolean z10, int i11, int i12, Y0.d dVar, List list, p241y9.c cVar2, p180s0.r rVar2, p241y9.c cVar3) {
        return rVar.b(l0.o.f19333a).b(new TextAnnotatedStringElement(c0515g, l10, dVar, cVar, i10, z10, i11, i12, list, cVar2, rVar2, cVar3));
    }

    public static final void z(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            C.a.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        C.a.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
