package E2;

/* JADX INFO: renamed from: E2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1639d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0110a)) {
                return false;
            }
            C0110a c0110a = (C0110a) obj;
            int i10 = this.f1636a;
            if (i10 != c0110a.f1636a) {
                return false;
            }
            if (i10 != 8 || Math.abs(this.f1639d - this.f1637b) != 1 || this.f1639d != c0110a.f1637b || this.f1637b != c0110a.f1639d) {
                if (this.f1639d != c0110a.f1639d || this.f1637b != c0110a.f1637b) {
                    return false;
                }
                Object obj2 = this.f1638c;
                if (obj2 != null) {
                    if (!obj2.equals(c0110a.f1638c)) {
                        return false;
                    }
                } else if (c0110a.f1638c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1636a * 31) + this.f1637b) * 31) + this.f1639d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.f1636a;
        if (i10 == 1) {
            str = "add";
        } else if (i10 == 2) {
            str = "rm";
        } else if (i10 != 4) {
            str = i10 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f1637b);
        sb.append("c:");
        sb.append(this.f1639d);
        sb.append(",p:");
        sb.append(this.f1638c);
        sb.append("]");
        return sb.toString();
    }
}
