package androidx.compose.foundation.layout;

import D.EnumC0080x;
import D.j0;
import J0.AbstractC0274a0;
import l0.q;
import p241y9.e;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0080x f11822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f11823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11824c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(EnumC0080x enumC0080x, e eVar, Object obj) {
        this.f11822a = enumC0080x;
        this.f11823b = (k) eVar;
        this.f11824c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f11822a == wrapContentElement.f11822a && j.a(this.f11824c, wrapContentElement.f11824c);
    }

    public final int hashCode() {
        return this.f11824c.hashCode() + (((this.f11822a.hashCode() * 31) + 1237) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        j0 j0Var = new j0();
        j0Var.f990F = this.f11822a;
        j0Var.f991G = this.f11823b;
        return j0Var;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        j0 j0Var = (j0) qVar;
        j0Var.f990F = this.f11822a;
        j0Var.f991G = this.f11823b;
    }
}
