package r;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f21369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f21370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f21371t;

    public b(c cVar, c cVar2, int i10) {
        this.f21371t = i10;
        this.f21369r = cVar2;
        this.f21370s = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f21369r == cVar && cVar == this.f21370s) {
            this.f21370s = null;
            this.f21369r = null;
        }
        c cVar3 = this.f21369r;
        if (cVar3 == cVar) {
            switch (this.f21371t) {
                case 0:
                    cVar2 = cVar3.f21375u;
                    break;
                default:
                    cVar2 = cVar3.f21374t;
                    break;
            }
            this.f21369r = cVar2;
        }
        c cVar4 = this.f21370s;
        if (cVar4 == cVar) {
            c cVar5 = this.f21369r;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f21370s = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f21371t) {
            case 0:
                return cVar.f21374t;
            default:
                return cVar.f21375u;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21370s != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f21370s;
        c cVar2 = this.f21369r;
        this.f21370s = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
