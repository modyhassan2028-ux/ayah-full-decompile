package Z;

/* JADX INFO: loaded from: classes.dex */
public final class A implements O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p251z9.k f10559a;

    /* JADX WARN: Multi-variable type inference failed */
    public A(p241y9.c cVar) {
        this.f10559a = (p251z9.k) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.c, z9.k] */
    @Override // Z.O0
    public final Object a(InterfaceC0687i0 interfaceC0687i0) {
        return this.f10559a.e(interfaceC0687i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && this.f10559a.equals(((A) obj).f10559a);
    }

    public final int hashCode() {
        return this.f10559a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f10559a + ')';
    }
}
