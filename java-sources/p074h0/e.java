package p074h0;

import F9.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16416a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f16416a);
        sb.append(")@");
        int iHashCode = hashCode();
        n.n(16);
        String string = Integer.toString(iHashCode, 16);
        j.d(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
