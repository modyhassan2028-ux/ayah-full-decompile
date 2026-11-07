package E2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractC0119e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1789a;

    public w0(RecyclerView recyclerView) {
        this.f1789a = recyclerView;
    }

    @Override // E2.AbstractC0119e0
    public final void a() {
        RecyclerView recyclerView = this.f1789a;
        recyclerView.k(null);
        recyclerView.f12923y0.f1448f = true;
        recyclerView.c0(true);
        if (recyclerView.f12916v.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // E2.AbstractC0119e0
    public final void b(int i10, int i11, Object obj) {
        RecyclerView recyclerView = this.f1789a;
        recyclerView.k(null);
        C0112b c0112b = recyclerView.f12916v;
        ArrayList arrayList = (ArrayList) c0112b.f1642b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(c0112b.n(obj, 4, i10, i11));
        c0112b.f1641a |= 4;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // E2.AbstractC0119e0
    public final void c(int i10, int i11) {
        RecyclerView recyclerView = this.f1789a;
        recyclerView.k(null);
        C0112b c0112b = recyclerView.f12916v;
        ArrayList arrayList = (ArrayList) c0112b.f1642b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(c0112b.n(null, 1, i10, i11));
        c0112b.f1641a |= 1;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // E2.AbstractC0119e0
    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f1789a;
        recyclerView.k(null);
        C0112b c0112b = recyclerView.f12916v;
        ArrayList arrayList = (ArrayList) c0112b.f1642b;
        if (i10 == i11) {
            return;
        }
        arrayList.add(c0112b.n(null, 8, i10, i11));
        c0112b.f1641a |= 8;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // E2.AbstractC0119e0
    public final void e(int i10, int i11) {
        RecyclerView recyclerView = this.f1789a;
        recyclerView.k(null);
        C0112b c0112b = recyclerView.f12916v;
        ArrayList arrayList = (ArrayList) c0112b.f1642b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(c0112b.n(null, 2, i10, i11));
        c0112b.f1641a |= 2;
        if (arrayList.size() == 1) {
            f();
        }
    }

    public final void f() {
        RecyclerView recyclerView = this.f1789a;
        if (!recyclerView.f12875K || !recyclerView.f12873J) {
            recyclerView.R = true;
            recyclerView.requestLayout();
        } else {
            Z z10 = recyclerView.f12924z;
            WeakHashMap weakHashMap = I1.S.f3689a;
            recyclerView.postOnAnimation(z10);
        }
    }
}
