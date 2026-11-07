package U0;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E6.u f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8111f;
    public final ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f8112h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public p(E6.u uVar, long j, int i10, int i11) {
        boolean z10;
        int i12;
        int iG;
        int i13;
        this.f8106a = uVar;
        this.f8107b = i10;
        if (p063g1.a.j(j) != 0 || p063g1.a.i(j) != 0) {
            p002a1.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) uVar.f1964f;
        int size = arrayList2.size();
        float f3 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= size) {
                z10 = false;
                break;
            }
            s sVar = (s) arrayList2.get(i14);
            p022c1.c cVar = sVar.f8121a;
            int iH = p063g1.a.h(j);
            if (p063g1.a.c(j)) {
                i12 = i14;
                iG = p063g1.a.g(j) - ((int) Math.ceil(f3));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i12 = i14;
                iG = p063g1.a.g(j);
            }
            C0509a c0509a = new C0509a(cVar, this.f8107b - i15, i11, p063g1.b.b(iH, iG, 5));
            float fB = c0509a.b() + f3;
            V0.r rVar = c0509a.f8045d;
            int i16 = i15 + rVar.g;
            arrayList.add(new r(c0509a, sVar.f8122b, sVar.f8123c, i15, i16, f3, fB));
            if (!rVar.f8387d) {
                if (i16 == this.f8107b) {
                    i13 = i12;
                    if (i13 != AbstractC0813f2.E((ArrayList) this.f8106a.f1964f)) {
                    }
                } else {
                    i13 = i12;
                }
                i14 = i13 + 1;
                i15 = i16;
                f3 = fB;
            }
            z10 = true;
            i15 = i16;
            f3 = fB;
            break;
        }
        this.f8110e = f3;
        this.f8111f = i15;
        this.f8108c = z10;
        this.f8112h = arrayList;
        this.f8109d = p063g1.a.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            r rVar2 = (r) arrayList.get(i17);
            ?? r10 = rVar2.f8115a.f8047f;
            ArrayList arrayList4 = new ArrayList(r10.size());
            int size3 = r10.size();
            for (int i18 = 0; i18 < size3; i18++) {
                p171r0.e eVar = (p171r0.e) r10.get(i18);
                arrayList4.add(eVar != null ? rVar2.a(eVar) : null);
            }
            p120l9.m.d0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f8106a.f1961c).size()) {
            int size4 = ((List) this.f8106a.f1961c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList5.add(null);
            }
            arrayList3 = p120l9.m.q0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(p pVar, p180s0.o oVar, long j, p180s0.I i10, p055f1.l lVar, p196u0.c cVar) {
        oVar.q();
        ArrayList arrayList = pVar.f8112h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) arrayList.get(i11);
            rVar.f8115a.f(oVar, j, i10, lVar, cVar);
            oVar.m(0.0f, rVar.f8115a.b());
        }
        oVar.n();
    }

    public static void j(p pVar, p180s0.o oVar, p180s0.F f3, float f7, p180s0.I i10, p055f1.l lVar, p196u0.c cVar) {
        oVar.q();
        ArrayList arrayList = pVar.f8112h;
        if (arrayList.size() <= 1 || (f3 instanceof p180s0.L)) {
            p022c1.i.a(pVar, oVar, f3, f7, i10, lVar, cVar);
        } else if (f3 instanceof p180s0.H) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                r rVar = (r) arrayList.get(i11);
                fB += rVar.f8115a.b();
                fMax = Math.max(fMax, rVar.f8115a.d());
            }
            Shader shaderX = ((p180s0.H) f3).x((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderX.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C0509a c0509a = ((r) arrayList.get(i12)).f8115a;
                c0509a.g(oVar, new p180s0.n(shaderX), f7, i10, lVar, cVar);
                oVar.m(0.0f, c0509a.b());
                matrix.setTranslate(0.0f, -c0509a.b());
                shaderX.setLocalMatrix(matrix);
            }
        }
        oVar.n();
    }

    public final void a(long j, float[] fArr) {
        k(K.e(j));
        l(K.d(j));
        p251z9.t tVar = new p251z9.t();
        tVar.f24884r = 0;
        AbstractC0813f2.y(this.f8112h, j, new o(j, fArr, tVar, new p251z9.s()));
    }

    public final float b(int i10) {
        m(i10);
        ArrayList arrayList = this.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.w(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        return c0509a.f8045d.e(i10 - rVar.f8118d) + rVar.f8120f;
    }

    public final int c(int i10, boolean z10) {
        int iF;
        m(i10);
        ArrayList arrayList = this.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.w(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int i11 = i10 - rVar.f8118d;
        V0.r rVar2 = c0509a.f8045d;
        if (z10) {
            Layout layout = rVar2.f8389f;
            V0.q qVar = V0.s.f8399a;
            if (layout.getEllipsisCount(i11) <= 0 || rVar2.f8385b != TextUtils.TruncateAt.END) {
                E6.u uVarC = rVar2.c();
                Layout layout2 = (Layout) uVarC.f1960b;
                iF = uVarC.s(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iF = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iF = rVar2.f(i11);
        }
        return iF + rVar.f8116b;
    }

    public final int d(int i10) {
        int iV;
        int length = ((C0515g) this.f8106a.f1960b).f8060s.length();
        ArrayList arrayList = this.f8112h;
        if (i10 >= length) {
            iV = AbstractC0813f2.E(arrayList);
        } else {
            iV = i10 < 0 ? 0 : AbstractC0813f2.v(i10, arrayList);
        }
        r rVar = (r) arrayList.get(iV);
        return rVar.f8115a.f8045d.f8389f.getLineForOffset(rVar.d(i10)) + rVar.f8118d;
    }

    public final int e(float f3) {
        ArrayList arrayList = this.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.x(arrayList, f3));
        int i10 = rVar.f8117c - rVar.f8116b;
        int i11 = rVar.f8118d;
        if (i10 == 0) {
            return i11;
        }
        C0509a c0509a = rVar.f8115a;
        float f7 = f3 - rVar.f8120f;
        V0.r rVar2 = c0509a.f8045d;
        return rVar2.f8389f.getLineForVertical(((int) f7) - rVar2.f8390h) + i11;
    }

    public final float f(int i10) {
        m(i10);
        ArrayList arrayList = this.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.w(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        return c0509a.f8045d.g(i10 - rVar.f8118d) + rVar.f8120f;
    }

    public final int g(long j) {
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        ArrayList arrayList = this.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.x(arrayList, fIntBitsToFloat));
        int i11 = rVar.f8117c;
        int i12 = rVar.f8116b;
        if (i11 - i12 == 0) {
            return i12;
        }
        C0509a c0509a = rVar.f8115a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) - rVar.f8120f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        V0.r rVar2 = c0509a.f8045d;
        int lineForVertical = rVar2.f8389f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - rVar2.f8390h);
        return rVar2.f8389f.getOffsetForHorizontal(lineForVertical, (rVar2.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i12;
    }

    public final long h(p171r0.e eVar, int i10, J1.c cVar) {
        long jB;
        long j;
        float f3 = eVar.f21390b;
        ArrayList arrayList = this.f8112h;
        int iX = AbstractC0813f2.x(arrayList, f3);
        float f7 = ((r) arrayList.get(iX)).g;
        float f10 = eVar.f21392d;
        if (f7 >= f10 || iX == AbstractC0813f2.E(arrayList)) {
            r rVar = (r) arrayList.get(iX);
            return rVar.b(rVar.f8115a.c(rVar.c(eVar), i10, cVar), true);
        }
        int iX2 = AbstractC0813f2.x(arrayList, f10);
        long jB2 = K.f8033b;
        while (true) {
            jB = K.f8033b;
            if (!K.a(jB2, jB) || iX > iX2) {
                break;
            }
            r rVar2 = (r) arrayList.get(iX);
            jB2 = rVar2.b(rVar2.f8115a.c(rVar2.c(eVar), i10, cVar), true);
            iX++;
        }
        if (K.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = K.f8033b;
            if (!K.a(jB, j) || iX > iX2) {
                break;
            }
            r rVar3 = (r) arrayList.get(iX2);
            jB = rVar3.b(rVar3.f8115a.c(rVar3.c(eVar), i10, cVar), true);
            iX2--;
        }
        return K.a(jB, j) ? jB2 : va.g.e((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i10) {
        boolean z10 = false;
        E6.u uVar = this.f8106a;
        if (i10 >= 0 && i10 < ((C0515g) uVar.f1960b).f8060s.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbW = p123m2.c.w(i10, "offset(", ") is out of bounds [0, ");
        sbW.append(((C0515g) uVar.f1960b).f8060s.length());
        sbW.append(')');
        p002a1.a.a(sbW.toString());
    }

    public final void l(int i10) {
        boolean z10 = false;
        E6.u uVar = this.f8106a;
        if (i10 >= 0 && i10 <= ((C0515g) uVar.f1960b).f8060s.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbW = p123m2.c.w(i10, "offset(", ") is out of bounds [0, ");
        sbW.append(((C0515g) uVar.f1960b).f8060s.length());
        sbW.append(']');
        p002a1.a.a(sbW.toString());
    }

    public final void m(int i10) {
        boolean z10 = false;
        int i11 = this.f8111f;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        p002a1.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
