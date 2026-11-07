package E4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s extends va.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List list) {
        super(2);
        p251z9.j.e(list, "suras");
        this.f1883c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && p251z9.j.a(this.f1883c, ((s) obj).f1883c);
    }

    @Override // va.g
    public final int hashCode() {
        return this.f1883c.hashCode();
    }

    @Override // va.g
    public final String toString() {
        return "Suras(suras=" + this.f1883c + ")";
    }
}
