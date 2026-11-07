package E2;

import A.o1;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: E2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0129j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0111a0 f1688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1693f;

    public static void b(F0 f3) {
        int i10 = f3.j;
        if (!f3.g() && (i10 & 4) == 0) {
            f3.b();
        }
    }

    public abstract boolean a(F0 f3, F0 f7, C0127i0 c0127i0, C0127i0 c0127i1);

    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007e, please report this as an issue */
    public final void c(F0 f3) {
        C0111a0 c0111a0 = this.f1688a;
        if (c0111a0 != null) {
            RecyclerView recyclerView = c0111a0.f1640a;
            boolean z10 = true;
            f3.o(true);
            View view = f3.f1486a;
            if (f3.f1492h != null && f3.f1493i == null) {
                f3.f1492h = null;
            }
            f3.f1493i = null;
            if ((f3.j & 16) != 0) {
                return;
            }
            u0 u0Var = recyclerView.f12912t;
            recyclerView.p0();
            C0124h c0124h = recyclerView.f12918w;
            o1 o1Var = (o1) c0124h.f1675d;
            C0111a0 c0111a1 = (C0111a0) c0124h.f1674c;
            int i10 = c0124h.f1673b;
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0124h.f1673b = 2;
                    int iIndexOfChild = c0111a1.f1640a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c0124h.J(view);
                    } else if (o1Var.e(iIndexOfChild)) {
                        o1Var.j(iIndexOfChild);
                        c0124h.J(view);
                        c0111a1.c(iIndexOfChild);
                    } else {
                        c0124h.f1673b = 0;
                    }
                    c0124h.f1673b = 0;
                    if (z10) {
                        F0 f0P = RecyclerView.P(view);
                        u0Var.l(f0P);
                        u0Var.i(f0P);
                        if (RecyclerView.f12847U0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.r0(!z10);
                    if (z10 && f3.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    c0124h.f1673b = 0;
                    throw th;
                }
            }
            if (((View) c0124h.f1677f) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z10 = false;
            if (z10) {
                F0 f0P2 = RecyclerView.P(view);
                u0Var.l(f0P2);
                u0Var.i(f0P2);
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.r0(!z10);
            if (z10) {
            }
        }
    }

    public abstract void d(F0 f3);

    public abstract void e();

    public abstract boolean f();
}
