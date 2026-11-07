package ka;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f19286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f19287c;

    public x(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        p251z9.j.e(aVar, "address");
        p251z9.j.e(inetSocketAddress, "socketAddress");
        this.f19285a = aVar;
        this.f19286b = proxy;
        this.f19287c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p251z9.j.a(xVar.f19285a, this.f19285a) && p251z9.j.a(xVar.f19286b, this.f19286b) && p251z9.j.a(xVar.f19287c, this.f19287c);
    }

    public final int hashCode() {
        return this.f19287c.hashCode() + ((this.f19286b.hashCode() + ((this.f19285a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        a aVar = this.f19285a;
        n nVar = aVar.f19104h;
        n nVar2 = aVar.f19104h;
        String str = nVar.f19189d;
        InetSocketAddress inetSocketAddress = this.f19287c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : la.b.b(hostAddress);
        if (H9.o.U0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (nVar2.f19190e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(nVar2.f19190e);
        }
        if (!str.equals(strB)) {
            if (this.f19286b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (H9.o.U0(strB, ':')) {
                sb.append("[");
                sb.append(strB);
                sb.append("]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
