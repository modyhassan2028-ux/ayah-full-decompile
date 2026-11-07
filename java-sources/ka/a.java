package ka;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f19099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f19100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f19101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f19102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f19103f;
    public final ProxySelector g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f19104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f19105i;
    public final List j;

    public a(String str, int i10, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, ya.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        p251z9.j.e(str, "uriHost");
        p251z9.j.e(bVar, "dns");
        p251z9.j.e(socketFactory, "socketFactory");
        p251z9.j.e(bVar2, "proxyAuthenticator");
        p251z9.j.e(list, "protocols");
        p251z9.j.e(list2, "connectionSpecs");
        p251z9.j.e(proxySelector, "proxySelector");
        this.f19098a = bVar;
        this.f19099b = socketFactory;
        this.f19100c = sSLSocketFactory;
        this.f19101d = cVar;
        this.f19102e = dVar;
        this.f19103f = bVar2;
        this.g = proxySelector;
        m mVar = new m();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            mVar.f19179a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            mVar.f19179a = "https";
        }
        String strB = la.b.b(za.a.c(0, 0, 7, str));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        mVar.f19182d = strB;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(p123m2.c.r(i10, "unexpected port: ").toString());
        }
        mVar.f19183e = i10;
        this.f19104h = mVar.a();
        this.f19105i = la.e.h(list);
        this.j = la.e.h(list2);
    }

    public final boolean a(a aVar) {
        p251z9.j.e(aVar, "that");
        return p251z9.j.a(this.f19098a, aVar.f19098a) && p251z9.j.a(this.f19103f, aVar.f19103f) && p251z9.j.a(this.f19105i, aVar.f19105i) && p251z9.j.a(this.j, aVar.j) && p251z9.j.a(this.g, aVar.g) && p251z9.j.a(this.f19100c, aVar.f19100c) && p251z9.j.a(this.f19101d, aVar.f19101d) && p251z9.j.a(this.f19102e, aVar.f19102e) && this.f19104h.f19190e == aVar.f19104h.f19190e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p251z9.j.a(this.f19104h, aVar.f19104h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19102e) + ((Objects.hashCode(this.f19101d) + ((Objects.hashCode(this.f19100c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.f19105i.hashCode() + ((this.f19103f.hashCode() + ((this.f19098a.hashCode() + p245z2.a.x(this.f19104h.f19192h, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.f19104h;
        sb.append(nVar.f19189d);
        sb.append(':');
        sb.append(nVar.f19190e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
