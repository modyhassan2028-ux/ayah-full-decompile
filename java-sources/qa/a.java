package qa;

import Da.A;
import Da.h;
import Da.m;
import Da.y;
import java.io.IOException;
import ka.l;
import ka.n;
import ka.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f21352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f21353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f21355u;

    public a(e eVar, n nVar) {
        j.e(nVar, "url");
        this.f21355u = eVar;
        this.f21352r = nVar;
        A aD = eVar.f21364c.d();
        j.e(aD, "delegate");
        m mVar = new m();
        mVar.f1368e = aD;
        this.f21353s = mVar;
    }

    public final void b(l lVar) {
        r rVar;
        ka.b bVar;
        j.e(lVar, "trailers");
        e eVar = this.f21355u;
        int i10 = eVar.f21366e;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + eVar.f21366e);
        }
        m mVar = this.f21353s;
        A a9 = mVar.f1368e;
        mVar.f1368e = A.f1341d;
        a9.a();
        a9.b();
        eVar.f21366e = 6;
        if (lVar.size() <= 0 || (rVar = eVar.f21362a) == null || (bVar = rVar.j) == null) {
            return;
        }
        pa.e.b(bVar, this.f21352r, lVar);
    }

    @Override // Da.y
    public final A d() {
        return this.f21353s;
    }

    @Override // Da.y
    public long o(long j, h hVar) throws IOException {
        e eVar = this.f21355u;
        j.e(hVar, "sink");
        try {
            return eVar.f21364c.o(j, hVar);
        } catch (IOException e10) {
            eVar.f21363b.h();
            b(e.g);
            throw e10;
        }
    }
}
