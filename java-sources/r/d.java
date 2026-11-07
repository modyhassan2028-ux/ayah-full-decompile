package r;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f21376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21377s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f21378t;

    public d(f fVar) {
        this.f21378t = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2 = this.f21376r;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f21375u;
            this.f21376r = cVar3;
            this.f21377s = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21377s) {
            return this.f21378t.f21379r != null;
        }
        c cVar = this.f21376r;
        return (cVar == null || cVar.f21374t == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21377s) {
            this.f21377s = false;
            this.f21376r = this.f21378t.f21379r;
        } else {
            c cVar = this.f21376r;
            this.f21376r = cVar != null ? cVar.f21374t : null;
        }
        return this.f21376r;
    }
}
