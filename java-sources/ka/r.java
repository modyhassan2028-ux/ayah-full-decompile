package ka;

import Z0.B;
import i7.C1011q;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final List f19218B = la.e.i(new s[]{s.f19250w, s.f19248u});

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final List f19219C = la.e.i(new i[]{i.g, i.f19156h});

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final X4.c f19220A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Aa.a f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W2.n f19224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19226f;
    public final b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19228i;
    public final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f19229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProxySelector f19230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f19231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f19232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f19233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X509TrustManager f19234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f19235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f19236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ya.c f19237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f19238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p186s9.b f19239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f19242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B f19243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final na.d f19244z;

    /* JADX WARN: Type inference failed for: r1v15, types: [ka.g] */
    public r(q qVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f19221a = qVar.f19196a;
        this.f19222b = la.e.h(qVar.f19198c);
        this.f19223c = la.e.h(qVar.f19199d);
        this.f19224d = qVar.f19200e;
        final boolean z10 = qVar.f19201f;
        this.f19225e = z10;
        final boolean z11 = qVar.g;
        this.f19226f = z11;
        this.g = qVar.f19202h;
        this.f19227h = qVar.f19203i;
        this.f19228i = qVar.j;
        this.j = qVar.f19204k;
        this.f19229k = qVar.f19205l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f19230l = proxySelector == null ? wa.a.f23810a : proxySelector;
        this.f19231m = qVar.f19206m;
        this.f19232n = qVar.f19207n;
        List list = qVar.f19210q;
        this.f19235q = list;
        this.f19236r = qVar.f19211r;
        this.f19237s = qVar.f19212s;
        final int i10 = qVar.f19215v;
        this.f19240v = i10;
        final int i11 = qVar.f19216w;
        this.f19241w = i11;
        final int i12 = qVar.f19217x;
        this.f19242x = i12;
        final B b5 = new B(28);
        this.f19243y = b5;
        this.f19244z = na.d.f20046l;
        X4.c cVar = qVar.f19197b;
        if (cVar == null) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            final na.d dVar = na.d.f20046l;
            oa.e eVar = oa.e.f20408a;
            p251z9.j.e(timeUnit, "timeUnit");
            p251z9.j.e(dVar, "taskRunner");
            oa.o oVar = new oa.o(dVar, timeUnit, eVar, new p241y9.f() { // from class: ka.g
                @Override // p241y9.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    oa.o oVar2 = (oa.o) obj;
                    a aVar = (a) obj2;
                    oa.a aVar2 = (oa.a) obj3;
                    p251z9.j.e(oVar2, "pool");
                    p251z9.j.e(aVar, "address");
                    p251z9.j.e(aVar2, "user");
                    na.d dVar2 = dVar;
                    return new C1011q(new oa.j(new oa.p(dVar2, oVar2, i11, i12, i10, i11, z10, z11, aVar, b5, aVar2)), dVar2);
                }
            });
            X4.c cVar2 = new X4.c();
            cVar2.f9953r = oVar;
            qVar.f19197b = cVar2;
            cVar = cVar2;
        }
        this.f19220A = cVar;
        if (list != null && list.isEmpty()) {
            this.f19233o = null;
            this.f19239u = null;
            this.f19234p = null;
            this.f19238t = d.f19121c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f19233o = null;
                this.f19239u = null;
                this.f19234p = null;
                this.f19238t = d.f19121c;
                break;
            }
            if (((i) it.next()).f19157a) {
                SSLSocketFactory sSLSocketFactory = qVar.f19208o;
                if (sSLSocketFactory != null) {
                    this.f19233o = sSLSocketFactory;
                    p186s9.b bVar = qVar.f19214u;
                    p251z9.j.b(bVar);
                    this.f19239u = bVar;
                    X509TrustManager x509TrustManager = qVar.f19209p;
                    p251z9.j.b(x509TrustManager);
                    this.f19234p = x509TrustManager;
                    d dVar2 = qVar.f19213t;
                    dVar2.getClass();
                    this.f19238t = p251z9.j.a(dVar2.f19123b, bVar) ? dVar2 : new d(dVar2.f19122a, bVar);
                    break;
                }
                ua.e eVar2 = ua.e.f22996a;
                ua.e.f22996a.getClass();
                X509TrustManager x509TrustManagerM = ua.e.m();
                this.f19234p = x509TrustManagerM;
                ua.e eVar3 = ua.e.f22996a;
                eVar3.getClass();
                try {
                    SSLContext sSLContextL = eVar3.l();
                    sSLContextL.init(null, new TrustManager[]{x509TrustManagerM}, null);
                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                    p251z9.j.d(socketFactory, "getSocketFactory(...)");
                    this.f19233o = socketFactory;
                    p186s9.b bVarC = ua.e.f22996a.c(x509TrustManagerM);
                    this.f19239u = bVarC;
                    d dVar3 = qVar.f19213t;
                    dVar3.getClass();
                    this.f19238t = p251z9.j.a(dVar3.f19123b, bVarC) ? dVar3 : new d(dVar3.f19122a, bVarC);
                    break;
                } catch (GeneralSecurityException e10) {
                    throw new AssertionError("No System TLS: " + e10, e10);
                }
            }
        }
        X509TrustManager x509TrustManager2 = this.f19234p;
        p186s9.b bVar2 = this.f19239u;
        SSLSocketFactory sSLSocketFactory2 = this.f19233o;
        List list2 = this.f19223c;
        List list3 = this.f19222b;
        p251z9.j.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        p251z9.j.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f19235q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f19157a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (bVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (bVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!p251z9.j.a(this.f19238t, d.f19121c)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
