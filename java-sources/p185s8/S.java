package p185s8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f22262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f22263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f22264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22265e;

    public S(List list, U u8, q0 q0Var, V v10, List list2) {
        this.f22261a = list;
        this.f22262b = u8;
        this.f22263c = q0Var;
        this.f22264d = v10;
        this.f22265e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c10 = (C0) obj;
        List list = this.f22261a;
        if (list == null) {
            if (((S) c10).f22261a != null) {
                return false;
            }
        } else if (!list.equals(((S) c10).f22261a)) {
            return false;
        }
        y0 y0Var = this.f22262b;
        if (y0Var == null) {
            if (((S) c10).f22262b != null) {
                return false;
            }
        } else if (!y0Var.equals(((S) c10).f22262b)) {
            return false;
        }
        q0 q0Var = this.f22263c;
        if (q0Var == null) {
            if (((S) c10).f22263c != null) {
                return false;
            }
        } else if (!q0Var.equals(((S) c10).f22263c)) {
            return false;
        }
        S s10 = (S) c10;
        return this.f22264d.equals(s10.f22264d) && this.f22265e.equals(s10.f22265e);
    }

    public final int hashCode() {
        List list = this.f22261a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        y0 y0Var = this.f22262b;
        int iHashCode2 = (iHashCode ^ (y0Var == null ? 0 : y0Var.hashCode())) * 1000003;
        q0 q0Var = this.f22263c;
        return (((((q0Var != null ? q0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f22264d.hashCode()) * 1000003) ^ this.f22265e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f22261a + ", exception=" + this.f22262b + ", appExitInfo=" + this.f22263c + ", signal=" + this.f22264d + ", binaries=" + this.f22265e + "}";
    }
}
