package androidx.compose.foundation.text.modifiers;

import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import N.h;
import U0.C0515g;
import U0.L;
import Y0.d;
import java.util.List;
import l0.q;
import p180s0.r;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f11884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f11885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f11886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f11887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11889f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f11891i;
    public final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f11892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f11893l;

    public TextAnnotatedStringElement(C0515g c0515g, L l10, d dVar, c cVar, int i10, boolean z10, int i11, int i12, List list, c cVar2, r rVar, c cVar3) {
        this.f11884a = c0515g;
        this.f11885b = l10;
        this.f11886c = dVar;
        this.f11887d = cVar;
        this.f11888e = i10;
        this.f11889f = z10;
        this.g = i11;
        this.f11890h = i12;
        this.f11891i = list;
        this.j = cVar2;
        this.f11892k = rVar;
        this.f11893l = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return j.a(this.f11892k, textAnnotatedStringElement.f11892k) && j.a(this.f11884a, textAnnotatedStringElement.f11884a) && j.a(this.f11885b, textAnnotatedStringElement.f11885b) && j.a(this.f11891i, textAnnotatedStringElement.f11891i) && j.a(this.f11886c, textAnnotatedStringElement.f11886c) && this.f11887d == textAnnotatedStringElement.f11887d && this.f11893l == textAnnotatedStringElement.f11893l && this.f11888e == textAnnotatedStringElement.f11888e && this.f11889f == textAnnotatedStringElement.f11889f && this.g == textAnnotatedStringElement.g && this.f11890h == textAnnotatedStringElement.f11890h && this.j == textAnnotatedStringElement.j;
    }

    public final int hashCode() {
        int iHashCode = (this.f11886c.hashCode() + ((this.f11885b.hashCode() + (this.f11884a.hashCode() * 31)) * 31)) * 31;
        c cVar = this.f11887d;
        int iHashCode2 = (((((((((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f11888e) * 31) + (this.f11889f ? 1231 : 1237)) * 31) + this.g) * 31) + this.f11890h) * 31;
        List list = this.f11891i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        c cVar2 = this.j;
        int iHashCode4 = (iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
        r rVar = this.f11892k;
        int iHashCode5 = (iHashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        c cVar3 = this.f11893l;
        return iHashCode5 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        h hVar = new h();
        hVar.f5933F = this.f11884a;
        hVar.f5934G = this.f11885b;
        hVar.f5935H = this.f11886c;
        hVar.f5936I = this.f11887d;
        hVar.f5937J = this.f11888e;
        hVar.f5938K = this.f11889f;
        hVar.f5939L = this.g;
        hVar.f5940M = this.f11890h;
        hVar.f5941N = this.f11891i;
        hVar.f5942O = this.j;
        hVar.f5943P = this.f11892k;
        hVar.Q = this.f11893l;
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        boolean z10;
        boolean z11;
        h hVar = (h) qVar;
        r rVar = hVar.f5943P;
        r rVar2 = this.f11892k;
        boolean zA = j.a(rVar2, rVar);
        hVar.f5943P = rVar2;
        if (zA) {
            L l10 = hVar.f5934G;
            L l11 = this.f11885b;
            if (l11 == l10) {
                l11.getClass();
            } else if (!l11.f8037a.b(l10.f8037a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        String str = hVar.f5933F.f8060s;
        C0515g c0515g = this.f11884a;
        boolean zA2 = j.a(str, c0515g.f8060s);
        boolean z12 = (zA2 && j.a(hVar.f5933F.f8059r, c0515g.f8059r)) ? false : true;
        if (z12) {
            hVar.f5933F = c0515g;
        }
        if (!zA2) {
            hVar.U = null;
        }
        L l12 = hVar.f5934G;
        L l13 = this.f11885b;
        boolean z13 = true;
        boolean z14 = !l12.c(l13);
        hVar.f5934G = l13;
        List list = hVar.f5941N;
        List list2 = this.f11891i;
        if (!j.a(list, list2)) {
            hVar.f5941N = list2;
            z14 = true;
        }
        int i10 = hVar.f5940M;
        int i11 = this.f11890h;
        if (i10 != i11) {
            hVar.f5940M = i11;
            z14 = true;
        }
        int i12 = hVar.f5939L;
        int i13 = this.g;
        if (i12 != i13) {
            hVar.f5939L = i13;
            z14 = true;
        }
        boolean z15 = hVar.f5938K;
        boolean z16 = this.f11889f;
        if (z15 != z16) {
            hVar.f5938K = z16;
            z14 = true;
        }
        d dVar = hVar.f5935H;
        d dVar2 = this.f11886c;
        if (!j.a(dVar, dVar2)) {
            hVar.f5935H = dVar2;
            z14 = true;
        }
        int i14 = hVar.f5937J;
        int i15 = this.f11888e;
        if (i14 == i15) {
            z13 = z14;
        } else {
            hVar.f5937J = i15;
        }
        c cVar = hVar.f5936I;
        c cVar2 = this.f11887d;
        boolean z17 = true;
        if (cVar != cVar2) {
            hVar.f5936I = cVar2;
            z11 = true;
        } else {
            z11 = false;
        }
        c cVar3 = hVar.f5942O;
        c cVar4 = this.j;
        if (cVar3 != cVar4) {
            hVar.f5942O = cVar4;
            z11 = true;
        }
        c cVar5 = hVar.Q;
        c cVar6 = this.f11893l;
        if (cVar5 != cVar6) {
            hVar.Q = cVar6;
        } else {
            z17 = z11;
        }
        if (z12 || z13 || z17) {
            N.d dVarV0 = hVar.v0();
            C0515g c0515g2 = hVar.f5933F;
            L l14 = hVar.f5934G;
            d dVar3 = hVar.f5935H;
            int i16 = hVar.f5937J;
            boolean z18 = hVar.f5938K;
            int i17 = hVar.f5939L;
            int i18 = hVar.f5940M;
            List list3 = hVar.f5941N;
            dVarV0.f5897a = c0515g2;
            boolean zC = l14.c(dVarV0.f5905k);
            dVarV0.f5905k = l14;
            if (!zC) {
                dVarV0.f5906l = null;
                dVarV0.f5908n = null;
                dVarV0.f5910p = -1;
                dVarV0.f5909o = -1;
            }
            dVarV0.f5898b = dVar3;
            dVarV0.f5899c = i16;
            dVarV0.f5900d = z18;
            dVarV0.f5901e = i17;
            dVarV0.f5902f = i18;
            dVarV0.g = list3;
            dVarV0.f5906l = null;
            dVarV0.f5908n = null;
            dVarV0.f5910p = -1;
            dVarV0.f5909o = -1;
        }
        if (hVar.f19338E) {
            if (z12 || (z10 && hVar.T != null)) {
                AbstractC0283f.o(hVar);
            }
            if (z12 || z13 || z17) {
                AbstractC0283f.n(hVar);
                AbstractC0283f.m(hVar);
            }
            if (z10) {
                AbstractC0283f.m(hVar);
            }
        }
    }
}
