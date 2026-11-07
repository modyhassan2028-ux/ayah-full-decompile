package Z;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Iterable, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0 f10864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10866t;

    public y0(x0 x0Var, int i10, int i11) {
        this.f10864r = x0Var;
        this.f10865s = i10;
        this.f10866t = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int iE;
        x0 x0Var = this.f10864r;
        if (x0Var.f10861y != this.f10866t) {
            z0.f();
        }
        HashMap map = x0Var.f10852A;
        C0670a c0670a = null;
        int i11 = this.f10865s;
        if (map != null) {
            if (x0Var.f10860x) {
                AbstractC0700p.c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i11 >= 0 && i11 < (i10 = x0Var.f10855s) && (iE = z0.e((arrayList = x0Var.f10862z), i11, i10)) >= 0) {
                c0670a = (C0670a) arrayList.get(iE);
            }
            if (c0670a != null) {
            }
        }
        return new J(x0Var, i11 + 1, x0Var.f10854r[(i11 * 5) + 3] + i11);
    }
}
