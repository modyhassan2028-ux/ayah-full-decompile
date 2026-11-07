package Z;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10630a;

    public N0(Object obj) {
        this.f10630a = obj;
    }

    @Override // Z.O0
    public final Object a(InterfaceC0687i0 interfaceC0687i0) {
        return this.f10630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N0) && p251z9.j.a(this.f10630a, ((N0) obj).f10630a);
    }

    public final int hashCode() {
        Object obj = this.f10630a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f10630a + ')';
    }
}
