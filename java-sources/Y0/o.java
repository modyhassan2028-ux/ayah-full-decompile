package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X4.c f10366c;

    public o(X4.c cVar) {
        this.f10366c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f10366c.equals(((o) obj).f10366c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10366c.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f10366c + ')';
    }
}
