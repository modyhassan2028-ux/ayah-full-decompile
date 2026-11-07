package G9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2945s;

    public /* synthetic */ n(int i10, Object obj) {
        this.f2944r = i10;
        this.f2945s = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2944r) {
            case 0:
                return new H9.b((g) this.f2945s);
            default:
                return new b(p251z9.j.h((Object[]) ((B3.f) this.f2945s).f613s));
        }
    }
}
