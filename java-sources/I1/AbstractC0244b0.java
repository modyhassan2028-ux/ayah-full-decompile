package I1;

import androidx.datastore.preferences.protobuf.C0733g;
import androidx.datastore.preferences.protobuf.C0750y;
import java.util.List;

/* JADX INFO: renamed from: I1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0244b0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f3713s;

    public AbstractC0244b0(int i10) {
        this.f3712r = i10;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i10);

    public void D() {
        boolean zC;
        do {
            int iZ = z();
            if (iZ == 0) {
                return;
            }
            int i10 = this.f3712r;
            if (i10 >= 100) {
                throw new C0750y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f3712r = i10 + 1;
            zC = C(iZ);
            this.f3712r--;
        } while (zC);
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract B0 f(B0 b5, List list);

    public abstract void h(int i10);

    public abstract int i(int i10);

    public abstract boolean j();

    public abstract C0733g k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void d(l0 l0Var) {
    }

    public void e(l0 l0Var) {
    }

    public M.k g(l0 l0Var, M.k kVar) {
        return kVar;
    }
}
