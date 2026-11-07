package U0;

import android.graphics.RectF;
import android.text.Layout;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import p180s0.AbstractC1302k;
import p180s0.C1300i;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f8023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f8028f;

    public I(H h7, p pVar, long j) {
        this.f8023a = h7;
        this.f8024b = pVar;
        this.f8025c = j;
        ArrayList arrayList = pVar.f8112h;
        float fD = 0.0f;
        this.f8026d = arrayList.isEmpty() ? 0.0f : ((r) arrayList.get(0)).f8115a.f8045d.d(0);
        if (!arrayList.isEmpty()) {
            r rVar = (r) p120l9.m.m0(arrayList);
            V0.r rVar2 = rVar.f8115a.f8045d;
            fD = rVar2.d(rVar2.g - 1) + rVar.f8120f;
        }
        this.f8027e = fD;
        this.f8028f = pVar.g;
    }

    public final p055f1.j a(int i10) {
        p pVar = this.f8024b;
        ArrayList arrayList = pVar.f8112h;
        pVar.l(i10);
        r rVar = (r) arrayList.get(i10 == ((C0515g) pVar.f8106a.f1960b).f8060s.length() ? AbstractC0813f2.E(arrayList) : AbstractC0813f2.v(i10, arrayList));
        return rVar.f8115a.f8045d.f8389f.isRtlCharAt(rVar.d(i10)) ? p055f1.j.f15910s : p055f1.j.f15909r;
    }

    public final p171r0.e b(int i10) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        p pVar = this.f8024b;
        pVar.k(i10);
        ArrayList arrayList = pVar.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.v(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int iD = rVar.d(i10);
        CharSequence charSequence = c0509a.f8046e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbW = p123m2.c.w(iD, "offset(", ") is out of bounds [0,");
            sbW.append(charSequence.length());
            sbW.append(')');
            p002a1.a.a(sbW.toString());
        }
        V0.r rVar2 = c0509a.f8045d;
        Layout layout = rVar2.f8389f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = rVar2.g(lineForOffset);
        float fE = rVar2.e(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fH = rVar2.i(iD, false);
                fH2 = rVar2.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = rVar2.h(iD, false);
                fH2 = rVar2.h(iD + 1, true);
            } else {
                fI = rVar2.i(iD, false);
                fI2 = rVar2.i(iD + 1, true);
            }
            float f3 = fH;
            fI = fH2;
            fI2 = f3;
        } else {
            fI = rVar2.h(iD, false);
            fI2 = rVar2.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return rVar.a(new p171r0.e(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final p171r0.e c(int i10) {
        p pVar = this.f8024b;
        ArrayList arrayList = pVar.f8112h;
        pVar.l(i10);
        r rVar = (r) arrayList.get(i10 == ((C0515g) pVar.f8106a.f1960b).f8060s.length() ? AbstractC0813f2.E(arrayList) : AbstractC0813f2.v(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int iD = rVar.d(i10);
        CharSequence charSequence = c0509a.f8046e;
        V0.r rVar2 = c0509a.f8045d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbW = p123m2.c.w(iD, "offset(", ") is out of bounds [0,");
            sbW.append(charSequence.length());
            sbW.append(']');
            p002a1.a.a(sbW.toString());
        }
        float fH = rVar2.h(iD, false);
        int lineForOffset = rVar2.f8389f.getLineForOffset(iD);
        return rVar.a(new p171r0.e(fH, rVar2.g(lineForOffset), fH, rVar2.e(lineForOffset)));
    }

    public final float d(int i10) {
        p pVar = this.f8024b;
        pVar.m(i10);
        ArrayList arrayList = pVar.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.w(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int i11 = i10 - rVar.f8118d;
        V0.r rVar2 = c0509a.f8045d;
        return rVar2.f8389f.getLineLeft(i11) + (i11 == rVar2.g + (-1) ? rVar2.j : 0.0f);
    }

    public final float e(int i10) {
        p pVar = this.f8024b;
        pVar.m(i10);
        ArrayList arrayList = pVar.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.w(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int i11 = i10 - rVar.f8118d;
        V0.r rVar2 = c0509a.f8045d;
        return rVar2.f8389f.getLineRight(i11) + (i11 == rVar2.g + (-1) ? rVar2.f8392k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return p251z9.j.a(this.f8023a, i10.f8023a) && this.f8024b.equals(i10.f8024b) && p063g1.l.a(this.f8025c, i10.f8025c) && this.f8026d == i10.f8026d && this.f8027e == i10.f8027e && p251z9.j.a(this.f8028f, i10.f8028f);
    }

    public final int f(int i10) {
        p pVar = this.f8024b;
        pVar.m(i10);
        ArrayList arrayList = pVar.f8112h;
        r rVar = (r) arrayList.get(AbstractC0813f2.w(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        return c0509a.f8045d.f8389f.getLineStart(i10 - rVar.f8118d) + rVar.f8116b;
    }

    public final p055f1.j g(int i10) {
        p pVar = this.f8024b;
        ArrayList arrayList = pVar.f8112h;
        pVar.l(i10);
        r rVar = (r) arrayList.get(i10 == ((C0515g) pVar.f8106a.f1960b).f8060s.length() ? AbstractC0813f2.E(arrayList) : AbstractC0813f2.v(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int iD = rVar.d(i10);
        V0.r rVar2 = c0509a.f8045d;
        return rVar2.f8389f.getParagraphDirection(rVar2.f8389f.getLineForOffset(iD)) == 1 ? p055f1.j.f15909r : p055f1.j.f15910s;
    }

    public final C1300i h(int i10, int i11) {
        p pVar = this.f8024b;
        C0515g c0515g = (C0515g) pVar.f8106a.f1960b;
        if (i10 < 0 || i10 > i11 || i11 > c0515g.f8060s.length()) {
            StringBuilder sbX = p123m2.c.x("Start(", i10, ") or End(", i11, ") is out of range [0..");
            sbX.append(c0515g.f8060s.length());
            sbX.append("), or start > end!");
            p002a1.a.a(sbX.toString());
        }
        if (i10 == i11) {
            return AbstractC1302k.a();
        }
        C1300i c1300iA = AbstractC1302k.a();
        AbstractC0813f2.y(pVar.f8112h, va.g.e(i10, i11), new D.E(c1300iA, i10, i11, 4));
        return c1300iA;
    }

    public final int hashCode() {
        int iHashCode = (this.f8024b.hashCode() + (this.f8023a.hashCode() * 31)) * 31;
        long j = this.f8025c;
        return this.f8028f.hashCode() + p123m2.c.n(p123m2.c.n((((int) (j ^ (j >>> 32))) + iHashCode) * 31, this.f8026d, 31), this.f8027e, 31);
    }

    public final long i(int i10) {
        int iJ;
        int i11;
        int i12;
        p pVar = this.f8024b;
        ArrayList arrayList = pVar.f8112h;
        pVar.l(i10);
        r rVar = (r) arrayList.get(i10 == ((C0515g) pVar.f8106a.f1960b).f8060s.length() ? AbstractC0813f2.E(arrayList) : AbstractC0813f2.v(i10, arrayList));
        C0509a c0509a = rVar.f8115a;
        int iD = rVar.d(i10);
        W0.e eVarJ = c0509a.f8045d.j();
        if (eVarJ.h(eVarJ.j(iD))) {
            eVarJ.a(iD);
            iJ = iD;
            while (iJ != -1 && (!eVarJ.h(iJ) || eVarJ.d(iJ))) {
                iJ = eVarJ.j(iJ);
            }
        } else {
            eVarJ.a(iD);
            if (eVarJ.g(iD)) {
                iJ = (!eVarJ.e(iD) || eVarJ.c(iD)) ? eVarJ.j(iD) : iD;
            } else {
                iJ = eVarJ.c(iD) ? eVarJ.j(iD) : -1;
            }
        }
        if (iJ == -1) {
            iJ = iD;
        }
        if (eVarJ.d(eVarJ.i(iD))) {
            eVarJ.a(iD);
            i11 = iD;
            while (i11 != -1 && (eVarJ.h(i11) || !eVarJ.d(i11))) {
                i11 = eVarJ.i(i11);
            }
        } else {
            eVarJ.a(iD);
            if (eVarJ.c(iD)) {
                if (!eVarJ.e(iD) || eVarJ.g(iD)) {
                    i12 = eVarJ.i(iD);
                    i11 = i12;
                } else {
                    i11 = iD;
                }
            } else if (eVarJ.g(iD)) {
                i12 = eVarJ.i(iD);
                i11 = i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            iD = i11;
        }
        return rVar.b(va.g.e(iJ, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f8023a + ", multiParagraph=" + this.f8024b + ", size=" + ((Object) p063g1.l.b(this.f8025c)) + ", firstBaseline=" + this.f8026d + ", lastBaseline=" + this.f8027e + ", placeholderRects=" + this.f8028f + ')';
    }
}
