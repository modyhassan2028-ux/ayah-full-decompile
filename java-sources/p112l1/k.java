package p112l1;

import E6.s;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p039d8.a;
import p039d8.b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WeakReference f19379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f19380s = new j(this);

    public k(i iVar) {
        this.f19379r = new WeakReference(iVar);
    }

    @Override // p039d8.b
    public final void a(a aVar, s sVar) {
        this.f19380s.a(aVar, sVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f19379r.get();
        boolean zCancel = this.f19380s.cancel(z10);
        if (zCancel && iVar != null) {
            iVar.f19374a = null;
            iVar.f19375b = null;
            iVar.f19376c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19380s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19380s.f19371r instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19380s.isDone();
    }

    public final String toString() {
        return this.f19380s.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19380s.get(j, timeUnit);
    }
}
