package K0;

import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.InterfaceC0290m;
import Z.C0690k;
import Z.C0698o;
import android.R;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p180s0.AbstractC1302k;
import p180s0.C1300i;
import u.AbstractC1356k;

/* JADX INFO: loaded from: classes.dex */
public abstract class P implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f4967a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p171r0.e f4968b = new p171r0.e(0.0f, 0.0f, 10.0f, 10.0f);

    public static final int a(long j) {
        int i10 = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i10 | 2 : i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r9
      0x0048: PHI (r9v6 float) = (r9v3 float), (r9v7 float) binds: [B:16:0x0054, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x001d A[PHI: r1
      0x001d: PHI (r1v6 float) = (r1v2 float), (r1v7 float) binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long b(int[] iArr, long j) {
        float f3;
        float fIntBitsToFloat;
        float f7;
        float fIntBitsToFloat2;
        int i10 = (int) (j >> 32);
        if (Float.intBitsToFloat(i10) >= 0.0f) {
            f3 = iArr[0] * (-1.0f);
            fIntBitsToFloat = Float.intBitsToFloat(i10);
            if (f3 > fIntBitsToFloat) {
                f3 = fIntBitsToFloat;
            }
        } else {
            f3 = iArr[0] * (-1.0f);
            fIntBitsToFloat = Float.intBitsToFloat(i10);
            if (f3 < fIntBitsToFloat) {
                f3 = fIntBitsToFloat;
            }
        }
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i11) >= 0.0f) {
            f7 = iArr[1] * (-1.0f);
            fIntBitsToFloat2 = Float.intBitsToFloat(i11);
            if (f7 > fIntBitsToFloat2) {
                f7 = fIntBitsToFloat2;
            }
        } else {
            f7 = iArr[1] * (-1.0f);
            fIntBitsToFloat2 = Float.intBitsToFloat(i11);
            if (f7 < fIntBitsToFloat2) {
                f7 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
    }

    public static final void c(J1.g gVar, R0.p pVar) {
        R0.j jVar = pVar.f7119d;
        u.E e10 = jVar.f7108r;
        Object objG = jVar.f7108r.g(R0.s.f7176w);
        if (objG == null) {
            objG = null;
        }
        R0.g gVar2 = (R0.g) objG;
        if (I.a(pVar)) {
            if (gVar2 != null && gVar2.f7079a == 8) {
                return;
            }
            Object objG2 = e10.g(R0.i.f7105x);
            if (objG2 == null) {
                objG2 = null;
            }
            R0.a aVar = (R0.a) objG2;
            if (aVar != null) {
                gVar.b(new J1.d(R.id.accessibilityActionPageUp, aVar.f7068a));
            }
            Object objG3 = e10.g(R0.i.f7107z);
            if (objG3 == null) {
                objG3 = null;
            }
            R0.a aVar2 = (R0.a) objG3;
            if (aVar2 != null) {
                gVar.b(new J1.d(R.id.accessibilityActionPageDown, aVar2.f7068a));
            }
            Object objG4 = e10.g(R0.i.f7106y);
            if (objG4 == null) {
                objG4 = null;
            }
            R0.a aVar3 = (R0.a) objG4;
            if (aVar3 != null) {
                gVar.b(new J1.d(R.id.accessibilityActionPageLeft, aVar3.f7068a));
            }
            Object objG5 = e10.g(R0.i.f7082A);
            R0.a aVar4 = (R0.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                gVar.b(new J1.d(R.id.accessibilityActionPageRight, aVar4.f7068a));
            }
        }
    }

    public static final boolean d(Object obj) {
        if (obj instanceof p093j0.o) {
            p093j0.o oVar = (p093j0.o) obj;
            if (oVar.a() == Z.S.f10640t || oVar.a() == Z.S.f10643w || oVar.a() == Z.S.f10641u) {
                Object value = oVar.getValue();
                if (value == null) {
                    return true;
                }
                return d(value);
            }
        } else {
            if ((obj instanceof p110k9.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f4967a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int e(float f3) {
        return ((int) (f3 >= 0.0f ? Math.ceil(f3) : Math.floor(f3))) * (-1);
    }

    public static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final u.t g(R0.q qVar) {
        R0.p pVarA = qVar.a();
        J0.I i10 = pVarA.f7118c;
        if (!i10.I() || !i10.H()) {
            u.t tVar = AbstractC1356k.f22736a;
            p251z9.j.c(tVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return tVar;
        }
        u.t tVar2 = new u.t(48);
        p171r0.e eVarE = pVarA.e();
        h(new Region(Math.round(eVarE.f21389a), Math.round(eVarE.f21390b), Math.round(eVarE.f21391c), Math.round(eVarE.f21392d)), pVarA, tVar2, pVarA, new Region());
        return tVar2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[EDGE_INSN: B:43:0x00cf->B:46:0x00e5 BREAK  A[LOOP:1: B:40:0x00c4->B:44:0x00d2]] */
    public static final void h(Region region, R0.p pVar, u.t tVar, R0.p pVar2, Region region2) {
        p171r0.e eVar;
        J0.I i10;
        InterfaceC0290m interfaceC0290mZ;
        int i11 = pVar.g;
        J0.I i12 = pVar2.f7118c;
        int i13 = pVar2.g;
        boolean z10 = (i12.I() && i12.H()) ? false : true;
        if (!region.isEmpty() || i13 == i11) {
            if (!z10 || pVar2.f7120e) {
                InterfaceC0290m interfaceC0290m = pVar2.f7116a;
                R0.j jVar = pVar2.f7119d;
                if (jVar.f7110t && (interfaceC0290mZ = F9.n.z(i12)) != null) {
                    interfaceC0290m = interfaceC0290mZ;
                }
                l0.q qVar = ((l0.q) interfaceC0290m).f19339r;
                Object objG = jVar.f7108r.g(R0.i.f7085b);
                if (objG == null) {
                    objG = null;
                }
                boolean z11 = objG != null;
                if (!qVar.f19339r.f19338E) {
                    eVar = p171r0.e.f21388e;
                    break;
                }
                if (z11) {
                    J0.j0 j0VarV = AbstractC0283f.v(qVar, 8);
                    if (!j0VarV.E0().f19338E) {
                        eVar = p171r0.e.f21388e;
                        break;
                    }
                    InterfaceC0219s interfaceC0219sD = H0.a0.d(j0VarV);
                    p171r0.b bVar = j0VarV.f4138P;
                    if (bVar == null) {
                        bVar = new p171r0.b();
                        j0VarV.f4138P = bVar;
                    }
                    long jU0 = j0VarV.u0(j0VarV.D0());
                    int i14 = (int) (jU0 >> 32);
                    bVar.f21383a = -Float.intBitsToFloat(i14);
                    int i15 = (int) (jU0 & 4294967295L);
                    bVar.f21384b = -Float.intBitsToFloat(i15);
                    bVar.f21385c = Float.intBitsToFloat(i14) + j0VarV.T();
                    bVar.f21386d = Float.intBitsToFloat(i15) + j0VarV.S();
                    while (true) {
                        if (j0VarV == interfaceC0219sD) {
                            eVar = new p171r0.e(bVar.f21383a, bVar.f21384b, bVar.f21385c, bVar.f21386d);
                            break;
                        }
                        j0VarV.V0(bVar, false, true);
                        if (bVar.b()) {
                            eVar = p171r0.e.f21388e;
                            break;
                        } else {
                            j0VarV = j0VarV.f4127E;
                            p251z9.j.b(j0VarV);
                        }
                    }
                } else {
                    J0.j0 j0VarV2 = AbstractC0283f.v(qVar, 8);
                    eVar = H0.a0.d(j0VarV2).J(j0VarV2, true);
                }
                int iRound = Math.round(eVar.f21389a);
                int iRound2 = Math.round(eVar.f21390b);
                int iRound3 = Math.round(eVar.f21391c);
                int iRound4 = Math.round(eVar.f21392d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i13 == i11) {
                    i13 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (pVar2.f7120e) {
                        R0.p pVarJ = pVar2.j();
                        p171r0.e eVarE = (pVarJ == null || (i10 = pVarJ.f7118c) == null || !i10.I()) ? f4968b : pVarJ.e();
                        tVar.h(i13, new W0(pVar2, new Rect(Math.round(eVarE.f21389a), Math.round(eVarE.f21390b), Math.round(eVarE.f21391c), Math.round(eVarE.f21392d))));
                        return;
                    } else {
                        if (i13 == -1) {
                            tVar.h(i13, new W0(pVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                tVar.h(i13, new W0(pVar2, region2.getBounds()));
                List listH = R0.p.h(4, pVar2);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    if (!((R0.p) listH.get(size)).i().f7108r.c(R0.s.f7178y)) {
                        h(region, pVar, tVar, (R0.p) listH.get(size), region2);
                    }
                }
                if (l(pVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final U0.I i(R0.j jVar) {
        p241y9.c cVar;
        ArrayList arrayList = new ArrayList();
        Object objG = jVar.f7108r.g(R0.i.f7084a);
        if (objG == null) {
            objG = null;
        }
        R0.a aVar = (R0.a) objG;
        if (aVar == null || (cVar = (p241y9.c) aVar.f7069b) == null || !((Boolean) cVar.e(arrayList)).booleanValue()) {
            return null;
        }
        return (U0.I) arrayList.get(0);
    }

    public static final boolean j(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        float f17 = fArr[9];
        float f18 = fArr[10];
        float f19 = fArr[11];
        float f20 = fArr[12];
        float f21 = fArr[13];
        float f22 = fArr[14];
        float f23 = fArr[15];
        float f24 = (f3 * f13) - (f7 * f12);
        float f25 = (f3 * f14) - (f10 * f12);
        float f26 = (f3 * f15) - (f11 * f12);
        float f27 = (f7 * f14) - (f10 * f13);
        float f28 = (f7 * f15) - (f11 * f13);
        float f29 = (f10 * f15) - (f11 * f14);
        float f30 = (f16 * f21) - (f17 * f20);
        float f31 = (f16 * f22) - (f18 * f20);
        float f32 = (f16 * f23) - (f19 * f20);
        float f33 = (f17 * f22) - (f18 * f21);
        float f34 = (f17 * f23) - (f19 * f21);
        float f35 = (f18 * f23) - (f19 * f22);
        float f36 = (f29 * f30) + (((f27 * f32) + ((f26 * f33) + ((f24 * f35) - (f25 * f34)))) - (f28 * f31));
        if (f36 != 0.0f) {
            float f37 = 1.0f / f36;
            fArr2[0] = ((f15 * f33) + ((f13 * f35) - (f14 * f34))) * f37;
            fArr2[1] = (((f10 * f34) + ((-f7) * f35)) - (f11 * f33)) * f37;
            fArr2[2] = ((f23 * f27) + ((f21 * f29) - (f22 * f28))) * f37;
            fArr2[3] = (((f18 * f28) + ((-f17) * f29)) - (f19 * f27)) * f37;
            float f38 = -f12;
            fArr2[4] = (((f14 * f32) + (f38 * f35)) - (f15 * f31)) * f37;
            fArr2[5] = ((f11 * f31) + ((f35 * f3) - (f10 * f32))) * f37;
            float f39 = -f20;
            fArr2[6] = (((f22 * f26) + (f39 * f29)) - (f23 * f25)) * f37;
            fArr2[7] = ((f19 * f25) + ((f29 * f16) - (f18 * f26))) * f37;
            fArr2[8] = ((f15 * f30) + ((f12 * f34) - (f13 * f32))) * f37;
            fArr2[9] = (((f32 * f7) + ((-f3) * f34)) - (f11 * f30)) * f37;
            fArr2[10] = ((f23 * f24) + ((f20 * f28) - (f21 * f26))) * f37;
            fArr2[11] = (((f26 * f17) + ((-f16) * f28)) - (f19 * f24)) * f37;
            fArr2[12] = (((f13 * f31) + (f38 * f33)) - (f14 * f30)) * f37;
            fArr2[13] = ((f10 * f30) + ((f3 * f33) - (f7 * f31))) * f37;
            fArr2[14] = (((f21 * f25) + (f39 * f27)) - (f22 * f24)) * f37;
            fArr2[15] = ((f18 * f24) + ((f16 * f27) - (f17 * f25))) * f37;
        }
        return !(f36 == 0.0f);
    }

    public static final boolean k(R0.p pVar) {
        J0.j0 j0VarC = pVar.c();
        R0.j jVar = pVar.f7119d;
        if (j0VarC != null ? j0VarC.M0() : false) {
            return true;
        }
        R0.v vVar = R0.s.f7156a;
        if (jVar.f7108r.c(R0.s.f7168o)) {
            return true;
        }
        return jVar.f7108r.c(R0.s.f7167n);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean l(R0.p pVar) {
        if (!k(pVar)) {
            R0.j jVar = pVar.f7119d;
            if (jVar.f7110t) {
                return true;
            }
            u.E e10 = jVar.f7108r;
            Object[] objArr = e10.f22670b;
            Object[] objArr2 = e10.f22671c;
            long[] jArr = e10.f22669a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                Object obj2 = objArr2[i13];
                                if (((R0.v) obj).f7184c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean m(p180s0.F f3, float f7, float f10) {
        if (f3 instanceof p180s0.C) {
            p171r0.e eVar = ((p180s0.C) f3).f21771e;
            return eVar.f21389a <= f7 && f7 < eVar.f21391c && eVar.f21390b <= f10 && f10 < eVar.f21392d;
        }
        if (!(f3 instanceof p180s0.D)) {
            if (f3 instanceof p180s0.B) {
                return n(((p180s0.B) f3).f21770e, f7, f10);
            }
            throw new A6.a();
        }
        p171r0.g gVar = ((p180s0.D) f3).f21772e;
        float f11 = gVar.f21393a;
        long j = gVar.f21398f;
        long j10 = gVar.f21399h;
        long j11 = gVar.g;
        float f12 = gVar.f21396d;
        float f13 = gVar.f21394b;
        float f14 = gVar.f21395c;
        long j12 = gVar.f21397e;
        if (f7 < f11 || f7 >= f14 || f10 < f13 || f10 >= f12) {
            return false;
        }
        int i10 = (int) (j12 >> 32);
        int i11 = (int) (j >> 32);
        if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= gVar.b()) {
            int i12 = (int) (j10 >> 32);
            int i13 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i13) + Float.intBitsToFloat(i12) <= gVar.b()) {
                int i14 = (int) (j12 & 4294967295L);
                int i15 = (int) (j10 & 4294967295L);
                if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= gVar.a()) {
                    int i16 = (int) (j & 4294967295L);
                    int i17 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= gVar.a()) {
                        float fIntBitsToFloat = Float.intBitsToFloat(i10) + f11;
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) + f13;
                        float fIntBitsToFloat3 = f14 - Float.intBitsToFloat(i11);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i16) + f13;
                        float fIntBitsToFloat5 = f14 - Float.intBitsToFloat(i13);
                        float fIntBitsToFloat6 = f12 - Float.intBitsToFloat(i17);
                        float fIntBitsToFloat7 = f12 - Float.intBitsToFloat(i15);
                        float fIntBitsToFloat8 = Float.intBitsToFloat(i12) + f11;
                        if (f7 < fIntBitsToFloat && f10 < fIntBitsToFloat2) {
                            return o(f7, f10, fIntBitsToFloat, fIntBitsToFloat2, gVar.f21397e);
                        }
                        if (f7 < fIntBitsToFloat8 && f10 > fIntBitsToFloat7) {
                            return o(f7, f10, fIntBitsToFloat8, fIntBitsToFloat7, gVar.f21399h);
                        }
                        if (f7 > fIntBitsToFloat3 && f10 < fIntBitsToFloat4) {
                            return o(f7, f10, fIntBitsToFloat3, fIntBitsToFloat4, gVar.f21398f);
                        }
                        if (f7 <= fIntBitsToFloat5 || f10 <= fIntBitsToFloat6) {
                            return true;
                        }
                        return o(f7, f10, fIntBitsToFloat5, fIntBitsToFloat6, gVar.g);
                    }
                }
            }
        }
        C1300i c1300iA = AbstractC1302k.a();
        p123m2.c.c(c1300iA, gVar);
        return n(c1300iA, f7, f10);
    }

    public static final boolean n(p180s0.E e10, float f3, float f7) {
        float f10 = f3 - 0.005f;
        float f11 = f7 - 0.005f;
        float f12 = f3 + 0.005f;
        float f13 = f7 + 0.005f;
        C1300i c1300iA = AbstractC1302k.a();
        if (Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) {
            AbstractC1302k.b("Invalid rectangle, make sure no value is NaN");
        }
        if (c1300iA.f21830b == null) {
            c1300iA.f21830b = new RectF();
        }
        RectF rectF = c1300iA.f21830b;
        p251z9.j.b(rectF);
        rectF.set(f10, f11, f12, f13);
        Path path = c1300iA.f21829a;
        RectF rectF2 = c1300iA.f21830b;
        p251z9.j.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        C1300i c1300iA2 = AbstractC1302k.a();
        c1300iA2.b(e10, c1300iA, 1);
        boolean zIsEmpty = c1300iA2.f21829a.isEmpty();
        c1300iA2.c();
        c1300iA.c();
        return !zIsEmpty;
    }

    public static final boolean o(float f3, float f7, float f10, float f11, long j) {
        float f12 = f3 - f10;
        float f13 = f7 - f11;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f13 * f13) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f12 * f12) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void p(float[] fArr, float[] fArr2) {
        float f3 = f(fArr2, 0, fArr, 0);
        float f7 = f(fArr2, 0, fArr, 1);
        float f10 = f(fArr2, 0, fArr, 2);
        float f11 = f(fArr2, 0, fArr, 3);
        float f12 = f(fArr2, 1, fArr, 0);
        float f13 = f(fArr2, 1, fArr, 1);
        float f14 = f(fArr2, 1, fArr, 2);
        float f15 = f(fArr2, 1, fArr, 3);
        float f16 = f(fArr2, 2, fArr, 0);
        float f17 = f(fArr2, 2, fArr, 1);
        float f18 = f(fArr2, 2, fArr, 2);
        float f19 = f(fArr2, 2, fArr, 3);
        float f20 = f(fArr2, 3, fArr, 0);
        float f21 = f(fArr2, 3, fArr, 1);
        float f22 = f(fArr2, 3, fArr, 2);
        float f23 = f(fArr2, 3, fArr, 3);
        fArr[0] = f3;
        fArr[1] = f7;
        fArr[2] = f10;
        fArr[3] = f11;
        fArr[4] = f12;
        fArr[5] = f13;
        fArr[6] = f14;
        fArr[7] = f15;
        fArr[8] = f16;
        fArr[9] = f17;
        fArr[10] = f18;
        fArr[11] = f19;
        fArr[12] = f20;
        fArr[13] = f21;
        fArr[14] = f22;
        fArr[15] = f23;
    }

    public static final F0 q(C0698o c0698o) {
        View view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
        boolean zG = c0698o.g(view);
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            objH = new F0(view);
            c0698o.e0(objH);
        }
        return (F0) objH;
    }

    public static final AndroidViewHolder r(AndroidViewsHandler androidViewsHandler, int i10) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((J0.I) ((Map.Entry) next).getKey()).f3926s != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String s(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String t(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static void u(View view) {
        try {
            if (!ViewLayer.f12076J) {
                ViewLayer.f12076J = true;
                if (Build.VERSION.SDK_INT < 28) {
                    ViewLayer.f12074H = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    ViewLayer.f12075I = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    ViewLayer.f12074H = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.f12075I = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = ViewLayer.f12074H;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = ViewLayer.f12075I;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = ViewLayer.f12075I;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = ViewLayer.f12074H;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            ViewLayer.f12077K = true;
        }
    }
}
