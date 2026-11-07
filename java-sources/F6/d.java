package F6;

import android.content.Context;
import android.support.v4.media.session.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2414b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f2413a = i10;
        this.f2414b = obj;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f2413a) {
            case 0:
                return new r((Context) ((d) this.f2414b).f2414b, new R7.f(12), new H8.e(12), 7);
            default:
                return this.f2414b;
        }
    }
}
