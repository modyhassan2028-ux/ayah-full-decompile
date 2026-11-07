package E4;

import N9.InterfaceC0415h;

/* JADX INFO: loaded from: classes.dex */
public final class r extends va.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0415h f1882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0415h interfaceC0415h) {
        super(2);
        p251z9.j.e(interfaceC0415h, "pages");
        this.f1882c = interfaceC0415h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && p251z9.j.a(this.f1882c, ((r) obj).f1882c);
    }

    @Override // va.g
    public final int hashCode() {
        return this.f1882c.hashCode();
    }

    @Override // va.g
    public final String toString() {
        return "Pages(pages=" + this.f1882c + ")";
    }
}
