package b8;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13335r;

    public g(Object obj) {
        this.f13335r = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).f13335r;
        Object obj3 = this.f13335r;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // b8.d
    public final Object get() {
        return this.f13335r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13335r});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13335r);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
