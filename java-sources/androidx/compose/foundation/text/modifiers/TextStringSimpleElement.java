package androidx.compose.foundation.text.modifiers;

import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import N.e;
import N.k;
import U0.L;
import Y0.d;
import l0.q;
import p180s0.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f11895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f11896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11899f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f11900h;

    public TextStringSimpleElement(String str, L l10, d dVar, int i10, boolean z10, int i11, int i12, r rVar) {
        this.f11894a = str;
        this.f11895b = l10;
        this.f11896c = dVar;
        this.f11897d = i10;
        this.f11898e = z10;
        this.f11899f = i11;
        this.g = i12;
        this.f11900h = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return j.a(this.f11900h, textStringSimpleElement.f11900h) && j.a(this.f11894a, textStringSimpleElement.f11894a) && j.a(this.f11895b, textStringSimpleElement.f11895b) && j.a(this.f11896c, textStringSimpleElement.f11896c) && this.f11897d == textStringSimpleElement.f11897d && this.f11898e == textStringSimpleElement.f11898e && this.f11899f == textStringSimpleElement.f11899f && this.g == textStringSimpleElement.g;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f11896c.hashCode() + ((this.f11895b.hashCode() + (this.f11894a.hashCode() * 31)) * 31)) * 31) + this.f11897d) * 31) + (this.f11898e ? 1231 : 1237)) * 31) + this.f11899f) * 31) + this.g) * 31;
        r rVar = this.f11900h;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        k kVar = new k();
        kVar.f5950F = this.f11894a;
        kVar.f5951G = this.f11895b;
        kVar.f5952H = this.f11896c;
        kVar.f5953I = this.f11897d;
        kVar.f5954J = this.f11898e;
        kVar.f5955K = this.f11899f;
        kVar.f5956L = this.g;
        kVar.f5957M = this.f11900h;
        return kVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        boolean z10;
        k kVar = (k) qVar;
        r rVar = kVar.f5957M;
        r rVar2 = this.f11900h;
        boolean zA = j.a(rVar2, rVar);
        kVar.f5957M = rVar2;
        boolean z11 = false;
        boolean z12 = true;
        L l10 = this.f11895b;
        if (zA) {
            L l11 = kVar.f5951G;
            if (l10 == l11) {
                l10.getClass();
            } else if (!l10.f8037a.b(l11.f8037a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        String str = kVar.f5950F;
        String str2 = this.f11894a;
        if (!j.a(str, str2)) {
            kVar.f5950F = str2;
            kVar.Q = null;
            z11 = true;
        }
        boolean z13 = !kVar.f5951G.c(l10);
        kVar.f5951G = l10;
        int i10 = kVar.f5956L;
        int i11 = this.g;
        if (i10 != i11) {
            kVar.f5956L = i11;
            z13 = true;
        }
        int i12 = kVar.f5955K;
        int i13 = this.f11899f;
        if (i12 != i13) {
            kVar.f5955K = i13;
            z13 = true;
        }
        boolean z14 = kVar.f5954J;
        boolean z15 = this.f11898e;
        if (z14 != z15) {
            kVar.f5954J = z15;
            z13 = true;
        }
        d dVar = kVar.f5952H;
        d dVar2 = this.f11896c;
        if (!j.a(dVar, dVar2)) {
            kVar.f5952H = dVar2;
            z13 = true;
        }
        int i14 = kVar.f5953I;
        int i15 = this.f11897d;
        if (i14 == i15) {
            z12 = z13;
        } else {
            kVar.f5953I = i15;
        }
        if (z11 || z12) {
            e eVarV0 = kVar.v0();
            String str3 = kVar.f5950F;
            L l12 = kVar.f5951G;
            d dVar3 = kVar.f5952H;
            int i16 = kVar.f5953I;
            boolean z16 = kVar.f5954J;
            int i17 = kVar.f5955K;
            int i18 = kVar.f5956L;
            eVarV0.f5911a = str3;
            eVarV0.f5912b = l12;
            eVarV0.f5913c = dVar3;
            eVarV0.f5914d = i16;
            eVarV0.f5915e = z16;
            eVarV0.f5916f = i17;
            eVarV0.g = i18;
            eVarV0.b();
        }
        if (kVar.f19338E) {
            if (z11 || (z10 && kVar.f5960P != null)) {
                AbstractC0283f.o(kVar);
            }
            if (z11 || z12) {
                AbstractC0283f.n(kVar);
                AbstractC0283f.m(kVar);
            }
            if (z10) {
                AbstractC0283f.m(kVar);
            }
        }
    }
}
