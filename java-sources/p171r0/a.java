package p171r0;

import A.C0023i;
import D.AbstractC0071n;
import D0.C0096n;
import D0.I;
import Ga.w;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K.v0;
import O.C0453v;
import W.C0563h;
import X.L;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import l0.o;
import l0.r;
import p050e8.b;
import p241y9.c;
import p241y9.e;
import p242z.d;
import p242z.h;
import p242z.i;
import p242z.j;
import p242z.k;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(j jVar, p241y9.a aVar, r rVar, C0023i c0023i, C0698o c0698o, int i10) {
        int i11;
        p241y9.a aVar2;
        C0023i c0023i2;
        c0698o.V(645832757);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(aVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.i(c0023i) ? 2048 : 1024;
        }
        if (c0698o.K(i12 & 1, (i12 & 1171) != 1170)) {
            i iVar = (i) jVar.f24743a.getValue();
            if (!(iVar instanceof h)) {
                C0699o0 c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new v0(jVar, aVar, c0023i, i10, 5);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            c0023i2 = c0023i;
            boolean zG = c0698o.g(iVar);
            Object objH = c0698o.H();
            if (zG || objH == C0690k.f10683a) {
                objH = new d(g.L(((h) iVar).f24742a));
                c0698o.e0(objH);
            }
            k.c((d) objH, aVar2, c0023i2, c0698o, i12 & 8176);
            rVar = o.f19333a;
        } else {
            aVar2 = aVar;
            c0023i2 = c0023i;
            c0698o.N();
        }
        C0699o0 c0699o0R2 = c0698o.r();
        if (c0699o0R2 != null) {
            c0699o0R2.f10749d = new C0563h(jVar, aVar2, rVar, c0023i2, i10);
        }
    }

    public static final void b(j jVar, p241y9.a aVar, C0023i c0023i, r rVar, boolean z10, p241y9.a aVar2, p074h0.d dVar, C0698o c0698o, int i10) {
        int i11;
        p241y9.a aVar3;
        C0023i c0023i2;
        r rVar2;
        r suspendPointerInputElement;
        c0698o.V(1969259374);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar3 = aVar;
            i11 |= c0698o.i(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i10 & 384) == 0) {
            c0023i2 = c0023i;
            i11 |= c0698o.i(c0023i2) ? 256 : 128;
        } else {
            c0023i2 = c0023i;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.h(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0698o.i(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0698o.i(dVar) ? 1048576 : 524288;
        }
        int i13 = 1;
        if (c0698o.K(i12 & 1, (599187 & i12) != 599186)) {
            rVar2 = o.f19333a;
            if (z10) {
                c0698o.T(1021907653);
                boolean z11 = ((i12 & 14) == 4) | ((458752 & i12) == 131072);
                Object objH = c0698o.H();
                if (z11 || objH == C0690k.f10683a) {
                    objH = new L(25, aVar2, jVar);
                    c0698o.e0(objH);
                }
                C0453v c0453v = new C0453v((c) objH, i13);
                C0096n c0096n = I.f1055a;
                suspendPointerInputElement = new SuspendPointerInputElement(p242z.c.f24727a, null, c0453v, 6);
                c0698o.p(false);
            } else {
                c0698o.T(1022064513);
                c0698o.p(false);
                suspendPointerInputElement = rVar2;
            }
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, true);
            int i14 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            r rVarC = l0.a.c(c0698o, suspendPointerInputElement);
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
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i14))) {
                p123m2.c.y(i14, c0698o, i14, c0285h);
            }
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            dVar.invoke(c0698o, Integer.valueOf((i12 >> 18) & 14));
            a(jVar, aVar3, null, c0023i2, c0698o, ((i12 << 3) & 7168) | (i12 & 126));
            c0698o.p(true);
        } else {
            c0698o.N();
            rVar2 = rVar;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new w(jVar, aVar, c0023i, rVar2, z10, aVar2, dVar, i10, 4);
        }
    }

    public static final void c(boolean z10, e eVar, C0698o c0698o, int i10) {
        c0698o.V(1818896922);
        int i11 = (c0698o.h(z10) ? 4 : 2) | i10 | (c0698o.i(eVar) ? 32 : 16);
        if ((i11 & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            b.c(z10, eVar, c0698o, i11 & 126);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p005a4.d(z10, eVar, i10, 2);
        }
    }

    public static final Class d(F9.c cVar) {
        p251z9.j.e(cVar, "<this>");
        Class clsA = ((p251z9.d) cVar).a();
        p251z9.j.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class e(F9.c cVar) {
        p251z9.j.e(cVar, "<this>");
        Class clsA = ((p251z9.d) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final String f(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f7 = f3 * fPow;
        int i10 = (int) f7;
        if (f7 - i10 >= 0.5f) {
            i10++;
        }
        float f10 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f10) : String.valueOf((int) f10);
    }
}
