package p214w;

import H0.Q;
import Z.C0672b;
import Z.C0681f0;
import android.support.v4.media.session.p;
import l0.r;
import p241y9.c;
import p241y9.e;

/* JADX INFO: renamed from: w.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1396i implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0681f0 f23503a;

    public C1396i(boolean z10) {
        this.f23503a = C0672b.r(Boolean.valueOf(z10));
    }

    @Override // l0.r
    public final /* synthetic */ r b(r rVar) {
        return p.d(this, rVar);
    }

    @Override // l0.r
    public final boolean g(c cVar) {
        return ((Boolean) cVar.e(this)).booleanValue();
    }

    @Override // l0.r
    public final Object h(Object obj, e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // H0.Q
    public final Object i() {
        return this;
    }
}
