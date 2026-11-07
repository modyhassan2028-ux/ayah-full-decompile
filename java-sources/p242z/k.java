package p242z;

import A.C0023i;
import A.K;
import D.AbstractC0066i;
import D.C0059b;
import D.C0063f;
import D.C0076t;
import D.C0077u;
import D.I;
import D.U;
import D.W;
import J.e;
import J0.C0285h;
import J0.C0287j;
import J0.InterfaceC0288k;
import K.T;
import K.v0;
import U0.L;
import W.C0557f1;
import W.C0563h;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import l0.c;
import l0.i;
import l0.o;
import l0.r;
import p074h0.d;
import p104k1.s;
import p104k1.t;
import p180s0.F;
import p180s0.q;
import p180s0.w;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f24744a = new t(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24745b;

    static {
        long j = q.f21840c;
        long j10 = q.f21839b;
        f24745b = new a(j, j10, j10, q.b(j10, 0.38f), q.b(j10, 0.38f));
    }

    public static final void a(a aVar, d dVar, C0698o c0698o, int i10) {
        c0698o.V(-921259293);
        int i11 = (c0698o.g(aVar) ? 4 : 2) | i10;
        r shadowGraphicsLayerElement = o.f19333a;
        int i12 = i11 | (c0698o.g(shadowGraphicsLayerElement) ? 32 : 16);
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            float f3 = f.f24733d;
            J.d dVarB = e.b(f.f24734e);
            float f7 = 0;
            boolean z10 = Float.compare(f3, f7) > 0;
            long j = w.f21849a;
            if (Float.compare(f3, f7) > 0 || z10) {
                shadowGraphicsLayerElement = new ShadowGraphicsLayerElement(dVarB, z10, j, j);
            }
            r rVarE = p181s2.r.e(b.j(b.m(a.a(shadowGraphicsLayerElement, aVar.f24719a, F.f21774a), I.f891s), 0.0f, f.f24737i, 1), p181s2.r.d(c0698o));
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, c.f19309D, c0698o, 0);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarE);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar2 = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar2);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, c0076tA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            dVar.d(C0077u.f1028a, c0698o, 54);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K(i10, 17, aVar, dVar);
        }
    }

    public static final void b(String str, a aVar, p241y9.a aVar2, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(791018367);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.h(true) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(aVar) ? 256 : 128;
        }
        int i12 = i10 & 3072;
        o oVar = o.f19333a;
        if (i12 == 0) {
            i11 |= c0698o.g(oVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(aVar2) ? 131072 : 65536;
        }
        if (c0698o.K(i11 & 1, (74899 & i11) != 74898)) {
            i iVar = f.f24735f;
            C0059b c0059b = AbstractC0066i.f977a;
            float f3 = f.f24736h;
            C0063f c0063f = new C0063f(f3);
            boolean z10 = ((i11 & 112) == 32) | ((458752 & i11) == 131072);
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new C0557f1(aVar2);
                c0698o.e0(objH);
            }
            r rVarB = a.c(oVar, true, str, (p241y9.a) objH, 4).b(androidx.compose.foundation.layout.c.f11826a);
            float f7 = f.f24730a;
            float f10 = f.f24731b;
            float f11 = f.f24732c;
            r rVarJ = b.j(androidx.compose.foundation.layout.c.l(rVarB, f7, f11, f10, f11), f3, 0.0f, 2);
            W wA = U.a(c0063f, iVar, c0698o, 54);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, rVarJ);
            InterfaceC0288k.f4142a.getClass();
            p241y9.a aVar3 = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(aVar3);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, wA, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            c0698o.T(554788141);
            c0698o.p(false);
            L l10 = new L(aVar.f24720b, f.j, f.f24738k, f.f24740m, f.g, f.f24739l, 16613240);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            T.c(str, new LayoutWeightElement(1.0f, true), l10, 0, false, 1, 0, c0698o, (i11 & 14) | 1572864, 952);
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v0(str, aVar, aVar2, i10);
        }
    }

    public static final void c(s sVar, p241y9.a aVar, C0023i c0023i, C0698o c0698o, int i10) {
        s sVar2;
        int i11;
        p241y9.a aVar2;
        C0023i c0023i2;
        c0698o.V(712057293);
        if ((i10 & 6) == 0) {
            sVar2 = sVar;
            i11 = (c0698o.g(sVar2) ? 4 : 2) | i10;
        } else {
            sVar2 = sVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            i11 |= c0698o.i(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(o.f19333a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            c0023i2 = c0023i;
            i11 |= c0698o.i(c0023i2) ? 2048 : 1024;
        } else {
            c0023i2 = c0023i;
        }
        if (c0698o.K(i11 & 1, (i11 & 1171) != 1170)) {
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            boolean zG = c0698o.g((Configuration) c0698o.k(AndroidCompositionLocals_androidKt.f12062a)) | c0698o.g(context);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                a aVar3 = f24745b;
                long jC = aVar3.f24719a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iU = F.u(jC);
                int color = typedArrayObtainStyledAttributes.getColor(0, iU);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iU) {
                    jC = F.c(color);
                }
                long j = jC;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jC2 = aVar3.f24720b;
                int iU2 = F.u(jC2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iU2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iU2) {
                    jC2 = F.c(numValueOf.intValue());
                }
                long j10 = jC2;
                long jC3 = aVar3.f24722d;
                int iU3 = F.u(jC3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iU3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iU3) {
                    jC3 = F.c(numValueOf2.intValue());
                }
                long j11 = jC3;
                Object aVar4 = new a(j, j10, j10, j11, j11);
                c0698o.e0(aVar4);
                objH = aVar4;
            }
            d(sVar2, aVar2, (a) objH, c0023i2, c0698o, (i11 & 1022) | ((i11 << 3) & 57344));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v0(sVar, aVar, c0023i, i10, 7);
        }
    }

    public static final void d(s sVar, p241y9.a aVar, a aVar2, C0023i c0023i, C0698o c0698o, int i10) {
        int i11;
        p241y9.a aVar3;
        C0698o c0698o2;
        s sVar2;
        c0698o.V(1447189339);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(sVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(o.f19333a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(aVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(c0023i) ? 16384 : 8192;
        }
        if (c0698o.K(i11 & 1, (i11 & 9363) != 9362)) {
            aVar3 = aVar;
            c0698o2 = c0698o;
            p104k1.i.a(sVar, aVar3, f24744a, p074h0.j.d(795909757, new K(18, aVar2, c0023i), c0698o), c0698o2, (i11 & 14) | 3456 | (i11 & 112), 0);
            sVar2 = sVar;
        } else {
            aVar3 = aVar;
            c0698o2 = c0698o;
            sVar2 = sVar;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0563h(sVar2, aVar3, aVar2, c0023i, i10);
        }
    }
}
