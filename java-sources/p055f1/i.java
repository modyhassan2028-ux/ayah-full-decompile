package p055f1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f15906c = new i(17, f.f15902c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15908b;

    public i(int i10, float f3) {
        this.f15907a = f3;
        this.f15908b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f3 = iVar.f15907a;
        float f7 = f.f15901b;
        return Float.compare(this.f15907a, f3) == 0 && this.f15908b == iVar.f15908b;
    }

    public final int hashCode() {
        float f3 = f.f15901b;
        return ((Float.floatToIntBits(this.f15907a) * 31) + this.f15908b) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f15907a));
        sb.append(", trim=");
        int i10 = this.f15908b;
        if (i10 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
