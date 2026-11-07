package p185s8;

/* JADX INFO: renamed from: s8.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1329l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1331m0 f22407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1335o0 f22408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1333n0 f22409c;

    public C1329l0(C1331m0 c1331m0, C1335o0 c1335o0, C1333n0 c1333n0) {
        this.f22407a = c1331m0;
        this.f22408b = c1335o0;
        this.f22409c = c1333n0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1329l0) {
            C1329l0 c1329l0 = (C1329l0) obj;
            if (this.f22407a.equals(c1329l0.f22407a) && this.f22408b.equals(c1329l0.f22408b) && this.f22409c.equals(c1329l0.f22409c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22407a.hashCode() ^ 1000003) * 1000003) ^ this.f22408b.hashCode()) * 1000003) ^ this.f22409c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f22407a + ", osData=" + this.f22408b + ", deviceData=" + this.f22409c + "}";
    }
}
