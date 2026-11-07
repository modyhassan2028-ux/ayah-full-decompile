package p018b9;

import H8.e;
import android.support.v4.media.session.p;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import p029c8.n;
import p105k2.d;

/* JADX INFO: loaded from: classes.dex */
public final class f implements S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R7.f f13339c = new R7.f(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f13340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13341b;

    public f(S s10, e eVar) {
        this.f13340a = s10;
        this.f13341b = new d(0, eVar);
    }

    @Override // androidx.lifecycle.S
    public final P a(Class cls) {
        if (n.f13568x.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.f13340a.a(cls);
    }

    @Override // androidx.lifecycle.S
    public final P b(Class cls, d dVar) {
        return n.f13568x.containsKey(cls) ? this.f13341b.b(cls, dVar) : this.f13340a.b(cls, dVar);
    }

    @Override // androidx.lifecycle.S
    public final /* synthetic */ P c(p251z9.e eVar, d dVar) {
        return p.a(this, eVar, dVar);
    }
}
