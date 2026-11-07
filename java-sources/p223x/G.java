package p223x;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f23852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1433w f23853b;

    public G(Float f3, InterfaceC1433w interfaceC1433w) {
        this.f23852a = f3;
        this.f23853b = interfaceC1433w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return g.f23852a.equals(this.f23852a) && j.a(g.f23853b, this.f23853b);
    }

    public final int hashCode() {
        return this.f23853b.hashCode() + (this.f23852a.hashCode() * 961);
    }
}
