package Z;

/* JADX INFO: loaded from: classes.dex */
public final class G implements O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0681f0 f10596a;

    public G(C0681f0 c0681f0) {
        this.f10596a = c0681f0;
    }

    @Override // Z.O0
    public final Object a(InterfaceC0687i0 interfaceC0687i0) {
        return this.f10596a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && this.f10596a.equals(((G) obj).f10596a);
    }

    public final int hashCode() {
        return this.f10596a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f10596a + ')';
    }
}
