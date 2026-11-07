package p221w6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f23745b;

    public a(int i10, int i11) {
        this.f23744a = i10;
        this.f23745b = Integer.valueOf(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f23744a == ((a) obj).f23744a;
    }

    public final int hashCode() {
        return this.f23744a;
    }
}
