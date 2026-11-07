package p021c0;

import java.util.List;
import p017b7.g;
import p033d0.c;
import p120l9.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f13414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13416t;

    public a(c cVar, int i10, int i11) {
        this.f13414r = cVar;
        this.f13415s = i10;
        g.U(i10, i11, cVar.b());
        this.f13416t = i11 - i10;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f13416t;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g.P(i10, this.f13416t);
        return this.f13414r.get(this.f13415s + i10);
    }

    @Override // p120l9.d, java.util.List
    public final List subList(int i10, int i11) {
        g.U(i10, i11, this.f13416t);
        int i12 = this.f13415s;
        return new a(this.f13414r, i10 + i12, i12 + i11);
    }
}
