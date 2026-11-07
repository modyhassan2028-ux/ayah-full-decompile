package p071g9;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f16344e = new e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16348d;

    public e(int i10, int i11, int i12, int i13) {
        this.f16345a = i10;
        this.f16346b = i11;
        this.f16347c = i12;
        this.f16348d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16345a == eVar.f16345a && this.f16346b == eVar.f16346b && this.f16347c == eVar.f16347c && this.f16348d == eVar.f16348d;
    }

    public final int hashCode() {
        return (((((this.f16345a * 31) + this.f16346b) * 31) + this.f16347c) * 31) + this.f16348d;
    }

    public final String toString() {
        StringBuilder sbX = c.x("ViewDimensions(left=", this.f16345a, ", top=", this.f16346b, ", right=");
        sbX.append(this.f16347c);
        sbX.append(", bottom=");
        sbX.append(this.f16348d);
        sbX.append(")");
        return sbX.toString();
    }
}
