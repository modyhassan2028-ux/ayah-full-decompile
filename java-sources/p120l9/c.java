package p120l9;

import android.support.v4.media.session.p;
import java.util.List;
import java.util.RandomAccess;
import p017b7.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f19430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19432t;

    public c(d dVar, int i10, int i11) {
        this.f19430r = dVar;
        this.f19431s = i10;
        g.T(i10, i11, dVar.b());
        this.f19432t = i11 - i10;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f19432t;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f19432t;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        return this.f19430r.get(this.f19431s + i10);
    }

    @Override // p120l9.d, java.util.List
    public final List subList(int i10, int i11) {
        g.T(i10, i11, this.f19432t);
        int i12 = this.f19431s;
        return new c(this.f19430r, i10 + i12, i12 + i11);
    }
}
