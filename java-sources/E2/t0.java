package E2;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f1770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f1772c;

    public final s0 a(int i10) {
        SparseArray sparseArray = this.f1770a;
        s0 s0Var = (s0) sparseArray.get(i10);
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0();
        sparseArray.put(i10, s0Var2);
        return s0Var2;
    }
}
