package E9;

import java.util.NoSuchElementException;
import p120l9.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2001u;

    public c(int i10, int i11, int i12) {
        this.f1998r = i12;
        this.f1999s = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f2000t = z10;
        this.f2001u = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2000t;
    }

    @Override // p120l9.v
    public final int nextInt() {
        int i10 = this.f2001u;
        if (i10 != this.f1999s) {
            this.f2001u = this.f1998r + i10;
            return i10;
        }
        if (!this.f2000t) {
            throw new NoSuchElementException();
        }
        this.f2000t = false;
        return i10;
    }
}
