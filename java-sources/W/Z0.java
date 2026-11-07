package W;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J.d f8934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.d f8935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J.d f8936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J.d f8937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J.d f8938e;

    public Z0() {
        J.d dVar = Y0.f8922a;
        J.d dVar2 = Y0.f8923b;
        J.d dVar3 = Y0.f8924c;
        J.d dVar4 = Y0.f8925d;
        J.d dVar5 = Y0.f8926e;
        this.f8934a = dVar;
        this.f8935b = dVar2;
        this.f8936c = dVar3;
        this.f8937d = dVar4;
        this.f8938e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z0)) {
            return false;
        }
        Z0 z10 = (Z0) obj;
        return p251z9.j.a(this.f8934a, z10.f8934a) && p251z9.j.a(this.f8935b, z10.f8935b) && p251z9.j.a(this.f8936c, z10.f8936c) && p251z9.j.a(this.f8937d, z10.f8937d) && p251z9.j.a(this.f8938e, z10.f8938e);
    }

    public final int hashCode() {
        return this.f8938e.hashCode() + ((this.f8937d.hashCode() + ((this.f8936c.hashCode() + ((this.f8935b.hashCode() + (this.f8934a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f8934a + ", small=" + this.f8935b + ", medium=" + this.f8936c + ", large=" + this.f8937d + ", extraLarge=" + this.f8938e + ')';
    }
}
