package p223x;

import K.y0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements InterfaceC1432v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1433w f24110c;

    public u0(int i10, InterfaceC1433w interfaceC1433w, int i11) {
        this(i10, 0, (i11 & 4) != 0 ? AbstractC1434x.f24121a : interfaceC1433w);
    }

    @Override // p223x.InterfaceC1421j
    public final x0 a(v0 v0Var) {
        return new y0(this.f24108a, this.f24109b, this.f24110c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (u0Var.f24108a == this.f24108a && u0Var.f24109b == this.f24109b && j.a(u0Var.f24110c, this.f24110c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f24110c.hashCode() + (this.f24108a * 31)) * 31) + this.f24109b;
    }

    @Override // p223x.InterfaceC1432v, p223x.InterfaceC1421j
    public final z0 a(v0 v0Var) {
        return new y0(this.f24108a, this.f24109b, this.f24110c);
    }

    public u0(int i10, int i11, InterfaceC1433w interfaceC1433w) {
        this.f24108a = i10;
        this.f24109b = i11;
        this.f24110c = interfaceC1433w;
    }
}
