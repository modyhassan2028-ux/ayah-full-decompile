package androidx.compose.foundation.lazy.layout;

import G.C0177k;
import J0.AbstractC0274a0;
import l0.q;
import p223x.C1408a0;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1408a0 f11834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1408a0 f11835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1408a0 f11836c;

    public LazyLayoutAnimateItemElement(C1408a0 c1408a0, C1408a0 c1408a1, C1408a0 c1408a2) {
        this.f11834a = c1408a0;
        this.f11835b = c1408a1;
        this.f11836c = c1408a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return this.f11834a.equals(lazyLayoutAnimateItemElement.f11834a) && this.f11835b.equals(lazyLayoutAnimateItemElement.f11835b) && this.f11836c.equals(lazyLayoutAnimateItemElement.f11836c);
    }

    public final int hashCode() {
        return this.f11836c.hashCode() + ((this.f11835b.hashCode() + (this.f11834a.hashCode() * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0177k c0177k = new C0177k();
        c0177k.f2705F = this.f11834a;
        c0177k.f2706G = this.f11835b;
        c0177k.f2707H = this.f11836c;
        return c0177k;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C0177k c0177k = (C0177k) qVar;
        c0177k.f2705F = this.f11834a;
        c0177k.f2706G = this.f11835b;
        c0177k.f2707H = this.f11836c;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f11834a + ", placementSpec=" + this.f11835b + ", fadeOutSpec=" + this.f11836c + ')';
    }
}
