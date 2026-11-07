package D6;

/* JADX INFO: loaded from: classes.dex */
public final class w extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f1331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f1332b;

    public w(I i10, H h7) {
        this.f1331a = i10;
        this.f1332b = h7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j = (J) obj;
            I i10 = this.f1331a;
            if (i10 != null ? i10.equals(((w) j).f1331a) : ((w) j).f1331a == null) {
                H h7 = this.f1332b;
                if (h7 != null ? h7.equals(((w) j).f1332b) : ((w) j).f1332b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        I i10 = this.f1331a;
        int iHashCode = ((i10 == null ? 0 : i10.hashCode()) ^ 1000003) * 1000003;
        H h7 = this.f1332b;
        return (h7 != null ? h7.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1331a + ", mobileSubtype=" + this.f1332b + "}";
    }
}
