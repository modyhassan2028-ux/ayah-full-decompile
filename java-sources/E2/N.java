package E2;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1584f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1586i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f1587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1588l;

    public final void a(View view) {
        int iC;
        int size = this.f1587k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((F0) this.f1587k.get(i11)).f1486a;
            C0137n0 c0137n0 = (C0137n0) view3.getLayoutParams();
            if (view3 != view && !c0137n0.f1733a.i() && (iC = (c0137n0.f1733a.c() - this.f1582d) * this.f1583e) >= 0 && iC < i10) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i10 = iC;
                }
            }
        }
        if (view2 == null) {
            this.f1582d = -1;
        } else {
            this.f1582d = ((C0137n0) view2.getLayoutParams()).f1733a.c();
        }
    }

    public final View b(u0 u0Var) {
        List list = this.f1587k;
        if (list == null) {
            View view = u0Var.k(Long.MAX_VALUE, this.f1582d).f1486a;
            this.f1582d += this.f1583e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((F0) this.f1587k.get(i10)).f1486a;
            C0137n0 c0137n0 = (C0137n0) view2.getLayoutParams();
            if (!c0137n0.f1733a.i() && this.f1582d == c0137n0.f1733a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
