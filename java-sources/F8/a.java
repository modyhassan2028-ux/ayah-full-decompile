package F8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2521a;

    public a(int i10) {
        this.f2521a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f2521a != ((a) ((d) obj)).f2521a) {
            return false;
        }
        Object obj2 = c.f2523r;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f2521a) + (c.f2523r.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f2521a + "intEncoding=" + c.f2523r + ')';
    }
}
