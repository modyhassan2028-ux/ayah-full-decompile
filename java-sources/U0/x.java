package U0;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f8135a;

    public x(u0 u0Var, w wVar) {
        this.f8135a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return p251z9.j.a(this.f8135a, ((x) obj).f8135a) && p251z9.j.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0 * 31;
        w wVar = this.f8135a;
        return i10 + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + ((Object) null) + ", paragraphSyle=" + this.f8135a + ')';
    }
}
