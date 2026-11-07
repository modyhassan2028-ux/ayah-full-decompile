package E4;

import N9.InterfaceC0415h;

/* JADX INFO: loaded from: classes.dex */
public final class p extends va.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0415h f1880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC0415h interfaceC0415h) {
        super(2);
        p251z9.j.e(interfaceC0415h, "ayat");
        this.f1880c = interfaceC0415h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && p251z9.j.a(this.f1880c, ((p) obj).f1880c);
    }

    @Override // va.g
    public final int hashCode() {
        return this.f1880c.hashCode();
    }

    @Override // va.g
    public final String toString() {
        return "Ayat(ayat=" + this.f1880c + ")";
    }
}
