package androidx.compose.foundation.gestures;

import A.EnumC0047u0;
import A.S0;
import A.T0;
import B.j;
import J0.AbstractC0274a0;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f11792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0047u0 f11793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f11796e;

    public ScrollableElement(T0 t2, EnumC0047u0 enumC0047u0, boolean z10, boolean z11, j jVar) {
        this.f11792a = t2;
        this.f11793b = enumC0047u0;
        this.f11794c = z10;
        this.f11795d = z11;
        this.f11796e = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return p251z9.j.a(this.f11792a, scrollableElement.f11792a) && this.f11793b == scrollableElement.f11793b && this.f11794c == scrollableElement.f11794c && this.f11795d == scrollableElement.f11795d && p251z9.j.a(this.f11796e, scrollableElement.f11796e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11793b.hashCode() + (this.f11792a.hashCode() * 31)) * 961) + (this.f11794c ? 1231 : 1237)) * 31) + (this.f11795d ? 1231 : 1237)) * 961;
        j jVar = this.f11796e;
        return (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        boolean z10 = this.f11795d;
        return new S0(null, this.f11793b, this.f11792a, this.f11796e, null, this.f11794c, z10);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((S0) qVar).H0(null, this.f11793b, this.f11792a, this.f11796e, null, this.f11794c, this.f11795d);
    }
}
