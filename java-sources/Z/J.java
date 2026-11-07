package Z;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10609r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0 f10610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10613v;

    public J(x0 x0Var, int i10, int i11) {
        this.f10610s = x0Var;
        this.f10611t = i11;
        this.f10612u = i10;
        this.f10613v = x0Var.f10861y;
        if (x0Var.f10860x) {
            z0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10609r) {
            case 0:
                return this.f10612u < this.f10611t;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10609r) {
            case 0:
                x0 x0Var = this.f10610s;
                int i10 = x0Var.f10861y;
                int i11 = this.f10613v;
                if (i10 != i11) {
                    z0.f();
                }
                int i12 = this.f10612u;
                this.f10612u = z0.a(x0Var.f10854r, i12) + i12;
                return new y0(x0Var, i12, i11);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10609r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public J(x0 x0Var, int i10, K k7, C0672b c0672b) {
        this.f10610s = x0Var;
        this.f10611t = i10;
        this.f10612u = x0Var.f10861y;
    }
}
