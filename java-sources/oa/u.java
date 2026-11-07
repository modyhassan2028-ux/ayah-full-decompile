package oa;

import Z0.B;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka.a f20476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f20477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f20480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20481f;
    public Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f20482h;

    public u(ka.a aVar, B b5, a aVar2, boolean z10) {
        List listI;
        p251z9.j.e(aVar, "address");
        p251z9.j.e(b5, "routeDatabase");
        p251z9.j.e(aVar2, "connectionUser");
        this.f20476a = aVar;
        this.f20477b = b5;
        this.f20478c = aVar2;
        this.f20479d = z10;
        p120l9.r rVar = p120l9.r.f19440r;
        this.f20480e = rVar;
        this.g = rVar;
        this.f20482h = new ArrayList();
        ka.n nVar = aVar.f19104h;
        aVar2.getClass();
        p251z9.j.e(nVar, "url");
        URI uriG = nVar.g();
        if (uriG.getHost() == null) {
            listI = la.e.i(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = aVar.g.select(uriG);
            listI = (listSelect == null || listSelect.isEmpty()) ? la.e.i(new Proxy[]{Proxy.NO_PROXY}) : la.e.h(listSelect);
        }
        this.f20480e = listI;
        this.f20481f = 0;
        p251z9.j.e(nVar, "url");
    }

    public final boolean a() {
        return this.f20481f < this.f20480e.size() || !this.f20482h.isEmpty();
    }
}
