package E2;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: E2.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0115c0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0117d0 f1651r = new C0117d0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1652s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1653t = 1;

    public abstract int a();

    public long b(int i10) {
        return -1L;
    }

    public int c(int i10) {
        return 0;
    }

    public final void d() {
        this.f1651r.b();
    }

    public abstract void e(F0 f3, int i10);

    public void f(F0 f3, int i10, List list) {
        e(f3, i10);
    }

    public abstract F0 g(ViewGroup viewGroup, int i10);

    public final void i(boolean z10) {
        if (this.f1651r.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1652s = z10;
    }

    public void h(F0 f3) {
    }
}
