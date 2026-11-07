package p093j0;

import p074h0.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f18694r = new a(0);

    @Override // p093j0.v
    public /* synthetic */ x c(x xVar, x xVar2, x xVar3) {
        return null;
    }

    public final boolean e(int i10) {
        return (i10 & this.f18694r.get()) != 0;
    }

    public final void f(int i10) {
        a aVar;
        int i11;
        do {
            aVar = this.f18694r;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }
}
