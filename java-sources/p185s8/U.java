package p185s8;

import java.util.List;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class U extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f22273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22274e;

    public U(String str, String str2, List list, y0 y0Var, int i10) {
        this.f22270a = str;
        this.f22271b = str2;
        this.f22272c = list;
        this.f22273d = y0Var;
        this.f22274e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        y0 y0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            U u8 = (U) ((y0) obj);
            y0 y0Var2 = u8.f22273d;
            String str2 = u8.f22271b;
            if (this.f22270a.equals(u8.f22270a) && ((str = this.f22271b) != null ? str.equals(str2) : str2 == null) && this.f22272c.equals(u8.f22272c) && ((y0Var = this.f22273d) != null ? y0Var.equals(y0Var2) : y0Var2 == null) && this.f22274e == u8.f22274e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22270a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22271b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f22272c.hashCode()) * 1000003;
        y0 y0Var = this.f22273d;
        return ((iHashCode2 ^ (y0Var != null ? y0Var.hashCode() : 0)) * 1000003) ^ this.f22274e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f22270a);
        sb.append(", reason=");
        sb.append(this.f22271b);
        sb.append(", frames=");
        sb.append(this.f22272c);
        sb.append(", causedBy=");
        sb.append(this.f22273d);
        sb.append(", overflowCount=");
        return a.E(sb, this.f22274e, "}");
    }
}
