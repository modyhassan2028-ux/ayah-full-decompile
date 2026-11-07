package p185s8;

/* JADX INFO: renamed from: s8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1325j0 extends L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22393d;

    public C1325j0(int i10, String str, String str2, boolean z10) {
        this.f22390a = i10;
        this.f22391b = str;
        this.f22392c = str2;
        this.f22393d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L0) {
            C1325j0 c1325j0 = (C1325j0) ((L0) obj);
            if (this.f22390a == c1325j0.f22390a && this.f22391b.equals(c1325j0.f22391b) && this.f22392c.equals(c1325j0.f22392c) && this.f22393d == c1325j0.f22393d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22390a ^ 1000003) * 1000003) ^ this.f22391b.hashCode()) * 1000003) ^ this.f22392c.hashCode()) * 1000003) ^ (this.f22393d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f22390a + ", version=" + this.f22391b + ", buildVersion=" + this.f22392c + ", jailbroken=" + this.f22393d + "}";
    }
}
