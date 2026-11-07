package F6;

import L6.i;
import L6.k;
import android.content.Context;
import android.support.v4.media.session.r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f2419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p101j9.a f2420c;

    public /* synthetic */ f(p101j9.a aVar, p101j9.a aVar2, int i10) {
        this.f2418a = i10;
        this.f2419b = aVar;
        this.f2420c = aVar2;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f2418a) {
            case 0:
                return new e((Context) ((d) this.f2419b).f2414b, (r) ((d) this.f2420c).get());
            default:
                return new i(new R7.f(12), new H8.e(12), L6.a.f5534f, (k) this.f2419b.get(), this.f2420c);
        }
    }
}
