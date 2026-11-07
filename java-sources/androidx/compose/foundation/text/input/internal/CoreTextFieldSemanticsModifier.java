package androidx.compose.foundation.text.input.internal;

import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import K.W;
import M.e;
import M.g;
import O.N;
import U0.K;
import Z0.F;
import Z0.k;
import Z0.s;
import Z0.y;
import l0.q;
import p162q0.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f11874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f11875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f11876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f11878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f11879f;
    public final k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f11880h;

    public CoreTextFieldSemanticsModifier(F f3, y yVar, W w9, boolean z10, s sVar, N n6, k kVar, p pVar) {
        this.f11874a = f3;
        this.f11875b = yVar;
        this.f11876c = w9;
        this.f11877d = z10;
        this.f11878e = sVar;
        this.f11879f = n6;
        this.g = kVar;
        this.f11880h = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return this.f11874a.equals(coreTextFieldSemanticsModifier.f11874a) && j.a(this.f11875b, coreTextFieldSemanticsModifier.f11875b) && this.f11876c.equals(coreTextFieldSemanticsModifier.f11876c) && this.f11877d == coreTextFieldSemanticsModifier.f11877d && j.a(this.f11878e, coreTextFieldSemanticsModifier.f11878e) && this.f11879f.equals(coreTextFieldSemanticsModifier.f11879f) && j.a(this.g, coreTextFieldSemanticsModifier.g) && j.a(this.f11880h, coreTextFieldSemanticsModifier.f11880h);
    }

    public final int hashCode() {
        return this.f11880h.hashCode() + ((this.g.hashCode() + ((this.f11879f.hashCode() + ((this.f11878e.hashCode() + ((((((((this.f11876c.hashCode() + ((this.f11875b.hashCode() + (this.f11874a.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.f11877d ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        g gVar = new g();
        gVar.f5603H = this.f11874a;
        gVar.f5604I = this.f11875b;
        gVar.f5605J = this.f11876c;
        gVar.f5606K = this.f11877d;
        gVar.f5607L = this.f11878e;
        N n6 = this.f11879f;
        gVar.f5608M = n6;
        gVar.f5609N = this.g;
        gVar.f5610O = this.f11880h;
        n6.g = new e(gVar, 0);
        return gVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        g gVar = (g) qVar;
        boolean z10 = gVar.f5606K;
        k kVar = gVar.f5609N;
        N n6 = gVar.f5608M;
        gVar.f5603H = this.f11874a;
        y yVar = this.f11875b;
        gVar.f5604I = yVar;
        gVar.f5605J = this.f11876c;
        boolean z11 = this.f11877d;
        gVar.f5606K = z11;
        gVar.f5607L = this.f11878e;
        N n10 = this.f11879f;
        gVar.f5608M = n10;
        k kVar2 = this.g;
        gVar.f5609N = kVar2;
        gVar.f5610O = this.f11880h;
        if (z11 != z10 || z11 != z10 || !j.a(kVar2, kVar) || !K.b(yVar.f10954b)) {
            AbstractC0283f.o(gVar);
        }
        if (n10.equals(n6)) {
            return;
        }
        n10.g = new e(gVar, 7);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f11874a + ", value=" + this.f11875b + ", state=" + this.f11876c + ", readOnly=false, enabled=" + this.f11877d + ", isPassword=false, offsetMapping=" + this.f11878e + ", manager=" + this.f11879f + ", imeOptions=" + this.g + ", focusRequester=" + this.f11880h + ')';
    }
}
