package p207v2;

import H9.p;
import p251z9.j;

/* JADX INFO: renamed from: v2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1378p extends AbstractC1379q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1374l f23282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1374l f23283b;

    public C1378p(C1374l c1374l, C1374l c1374l2) {
        this.f23282a = c1374l;
        this.f23283b = c1374l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1378p)) {
            return false;
        }
        C1378p c1378p = (C1378p) obj;
        return j.a(this.f23282a, c1378p.f23282a) && j.a(this.f23283b, c1378p.f23283b);
    }

    public final int hashCode() {
        int iHashCode = this.f23282a.hashCode() * 31;
        C1374l c1374l = this.f23283b;
        return iHashCode + (c1374l == null ? 0 : c1374l.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f23282a + "\n                    ";
        C1374l c1374l = this.f23283b;
        if (c1374l != null) {
            str = str + "|   mediatorLoadStates: " + c1374l + '\n';
        }
        return p.J0(str + "|)");
    }
}
