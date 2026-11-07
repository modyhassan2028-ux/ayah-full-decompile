package Z;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements Iterable, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0 f10617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0672b f10619t;

    public K0(x0 x0Var, int i10, K k7, C0672b c0672b) {
        this.f10617r = x0Var;
        this.f10618s = i10;
        this.f10619t = c0672b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this.f10617r, this.f10618s, null, this.f10619t);
    }
}
