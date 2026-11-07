package E2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: E2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0111a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1640a;

    public /* synthetic */ C0111a0(RecyclerView recyclerView) {
        this.f1640a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public void a(F0 f3, C0127i0 c0127i0, C0127i0 c0127i1) {
        boolean zG;
        RecyclerView recyclerView = this.f1640a;
        recyclerView.getClass();
        f3.o(false);
        C0138o c0138o = (C0138o) recyclerView.f12897g0;
        if (c0127i0 != null) {
            c0138o.getClass();
            int i10 = c0127i0.f1681a;
            int i11 = c0127i1.f1681a;
            if (i10 == i11 && c0127i0.f1682b == c0127i1.f1682b) {
                c0138o.l(f3);
                f3.f1486a.setAlpha(0.0f);
                c0138o.f1739i.add(f3);
                zG = true;
            } else {
                zG = c0138o.g(f3, i10, c0127i0.f1682b, i11, c0127i1.f1682b);
            }
        } else {
            c0138o.l(f3);
            f3.f1486a.setAlpha(0.0f);
            c0138o.f1739i.add(f3);
            zG = true;
        }
        if (zG) {
            recyclerView.a0();
        }
    }

    public void b(F0 f3, C0127i0 c0127i0, C0127i0 c0127i1) {
        boolean zG;
        RecyclerView recyclerView = this.f1640a;
        recyclerView.f12912t.l(f3);
        recyclerView.h(f3);
        f3.o(false);
        C0138o c0138o = (C0138o) recyclerView.f12897g0;
        c0138o.getClass();
        int i10 = c0127i0.f1681a;
        int i11 = c0127i0.f1682b;
        View view = f3.f1486a;
        int left = c0127i1 == null ? view.getLeft() : c0127i1.f1681a;
        int top = c0127i1 == null ? view.getTop() : c0127i1.f1682b;
        if (f3.i() || (i10 == left && i11 == top)) {
            c0138o.l(f3);
            c0138o.f1738h.add(f3);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c0138o.g(f3, i10, i11, left, top);
        }
        if (zG) {
            recyclerView.a0();
        }
    }

    public void c(int i10) {
        RecyclerView recyclerView = this.f1640a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
