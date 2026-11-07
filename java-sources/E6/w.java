package E6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class w implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f1971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p101j9.a f1972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G6.b f1973d;

    public /* synthetic */ w(p101j9.a aVar, p101j9.a aVar2, G6.b bVar, int i10) {
        this.f1970a = i10;
        this.f1971b = aVar;
        this.f1972c = aVar2;
        this.f1973d = bVar;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f1970a) {
            case 0:
                return new v(new R7.f(12), new H8.e(12), (J6.e) ((J6.d) this.f1971b).get(), (D6.s) ((K6.j) this.f1972c).get(), (Aa.a) ((K6.k) this.f1973d).get());
            default:
                return new android.support.v4.media.session.r((Context) this.f1971b.get(), (L6.d) this.f1972c.get(), (K6.b) ((p) this.f1973d).get(), 18);
        }
    }
}
