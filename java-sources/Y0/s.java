package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f10368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10371e;

    public s(e eVar, l lVar, int i10, int i11, Object obj) {
        this.f10367a = eVar;
        this.f10368b = lVar;
        this.f10369c = i10;
        this.f10370d = i11;
        this.f10371e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p251z9.j.a(this.f10367a, sVar.f10367a) && p251z9.j.a(this.f10368b, sVar.f10368b) && this.f10369c == sVar.f10369c && this.f10370d == sVar.f10370d && p251z9.j.a(this.f10371e, sVar.f10371e);
    }

    public final int hashCode() {
        e eVar = this.f10367a;
        int iHashCode = (((((((eVar == null ? 0 : eVar.hashCode()) * 31) + this.f10368b.f10364r) * 31) + this.f10369c) * 31) + this.f10370d) * 31;
        Object obj = this.f10371e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f10367a);
        sb.append(", fontWeight=");
        sb.append(this.f10368b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i10 = this.f10369c;
        if (i10 == 0) {
            str = "Normal";
        } else {
            str = i10 == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i11 = this.f10370d;
        if (i11 == 0) {
            str2 = "None";
        } else if (i11 == 1) {
            str2 = "Weight";
        } else if (i11 == 2) {
            str2 = "Style";
        } else if (i11 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f10371e);
        sb.append(')');
        return sb.toString();
    }
}
