package u;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1346a implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f22714v;

    public C1346a(int i10) {
        this.f22710r = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22711s < this.f22710r;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f22711s;
        switch (this.f22713u) {
            case 0:
                objF = ((C1350e) this.f22714v).f(i10);
                break;
            case 1:
                objF = ((C1350e) this.f22714v).i(i10);
                break;
            default:
                objF = ((C1351f) this.f22714v).f22725s[i10];
                break;
        }
        this.f22711s++;
        this.f22712t = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22712t) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f22711s - 1;
        this.f22711s = i10;
        switch (this.f22713u) {
            case 0:
                ((C1350e) this.f22714v).g(i10);
                break;
            case 1:
                ((C1350e) this.f22714v).g(i10);
                break;
            default:
                ((C1351f) this.f22714v).b(i10);
                break;
        }
        this.f22710r--;
        this.f22712t = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1346a(C1351f c1351f) {
        this(c1351f.f22726t);
        this.f22713u = 2;
        this.f22714v = c1351f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1346a(C1350e c1350e, int i10) {
        this(c1350e.f22703t);
        this.f22713u = i10;
        switch (i10) {
            case 1:
                this.f22714v = c1350e;
                this(c1350e.f22703t);
                break;
            default:
                this.f22714v = c1350e;
                break;
        }
    }
}
