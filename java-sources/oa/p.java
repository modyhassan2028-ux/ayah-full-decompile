package oa;

import Z0.B;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.squareup.moshi.z;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import ka.v;
import ka.w;
import ka.x;

/* JADX INFO: loaded from: classes.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na.d f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20464f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ka.a f20466i;
    public final B j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f20467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z f20468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f20469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f20470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p120l9.k f20471o;

    public p(na.d dVar, o oVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, ka.a aVar, B b5, a aVar2) {
        p251z9.j.e(dVar, "taskRunner");
        p251z9.j.e(oVar, "connectionPool");
        p251z9.j.e(aVar, "address");
        p251z9.j.e(b5, "routeDatabase");
        p251z9.j.e(aVar2, "connectionUser");
        this.f20459a = dVar;
        this.f20460b = oVar;
        this.f20461c = i10;
        this.f20462d = i11;
        this.f20463e = i12;
        this.f20464f = i13;
        this.g = z10;
        this.f20465h = z11;
        this.f20466i = aVar;
        this.j = b5;
        this.f20467k = aVar2;
        this.f20471o = new p120l9.k();
    }

    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.List] */
    public final d a() throws IOException {
        String hostAddress;
        int port;
        List listO;
        boolean zContains;
        x xVar = this.f20470n;
        if (xVar != null) {
            this.f20470n = null;
            return c(xVar, null);
        }
        z zVar = this.f20468l;
        if (zVar != null && zVar.f15518b < zVar.f15517a.size()) {
            int i10 = zVar.f15518b;
            ArrayList arrayList = zVar.f15517a;
            if (i10 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i11 = zVar.f15518b;
            zVar.f15518b = i11 + 1;
            return c((x) arrayList.get(i11), null);
        }
        u uVar = this.f20469m;
        if (uVar == null) {
            uVar = new u(this.f20466i, this.j, this.f20467k, this.f20465h);
            this.f20469m = uVar;
        }
        if (!uVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!uVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (uVar.f20481f < uVar.f20480e.size()) {
            ka.a aVar = uVar.f20476a;
            if (uVar.f20481f >= uVar.f20480e.size()) {
                throw new SocketException("No route to " + aVar.f19104h.f19189d + "; exhausted proxy configurations: " + uVar.f20480e);
            }
            List list = uVar.f20480e;
            int i12 = uVar.f20481f;
            uVar.f20481f = i12 + 1;
            Proxy proxy = (Proxy) list.get(i12);
            a aVar2 = uVar.f20478c;
            ArrayList arrayList3 = new ArrayList();
            uVar.g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                ka.n nVar = aVar.f19104h;
                hostAddress = nVar.f19189d;
                port = nVar.f19190e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    p251z9.j.d(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address.getHostAddress();
                    p251z9.j.d(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                H9.m mVar = la.b.f19447a;
                p251z9.j.e(hostAddress, "<this>");
                H9.m mVar2 = la.b.f19447a;
                mVar2.getClass();
                if (mVar2.f3641r.matcher(hostAddress).matches()) {
                    listO = AbstractC0813f2.K(InetAddress.getByName(hostAddress));
                } else {
                    aVar2.getClass();
                    aVar.f19098a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        p251z9.j.d(allByName, "getAllByName(...)");
                        List listO0 = p120l9.l.o0(allByName);
                        if (listO0.isEmpty()) {
                            throw new UnknownHostException(aVar.f19098a + " returned no addresses for " + hostAddress);
                        }
                        aVar2.getClass();
                        listO = listO0;
                    } catch (NullPointerException e10) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e10);
                        throw unknownHostException;
                    }
                }
                if (uVar.f20479d && listO.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listO) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = la.c.f19448a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        p129m9.b bVar = new p129m9.b(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                bVar.add(it.next());
                            }
                            if (it2.hasNext()) {
                                bVar.add(it2.next());
                            }
                        }
                        listO = AbstractC0813f2.o(bVar);
                    }
                }
                Iterator it3 = listO.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = uVar.g.iterator();
            while (it4.hasNext()) {
                x xVar2 = new x(uVar.f20476a, proxy, (InetSocketAddress) it4.next());
                B b5 = uVar.f20477b;
                synchronized (b5) {
                    zContains = ((LinkedHashSet) b5.f10875s).contains(xVar2);
                }
                if (zContains) {
                    uVar.f20482h.add(xVar2);
                } else {
                    arrayList2.add(xVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            p120l9.m.d0(arrayList2, uVar.f20482h);
            uVar.f20482h.clear();
        }
        z zVar2 = new z(arrayList2);
        this.f20468l = zVar2;
        if (this.f20467k.m()) {
            throw new IOException("Canceled");
        }
        if (zVar2.f15518b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i13 = zVar2.f15518b;
        zVar2.f15518b = i13 + 1;
        return c((x) arrayList2.get(i13), arrayList2);
    }

    @Override // oa.t
    public final boolean b(ka.n nVar) {
        p251z9.j.e(nVar, "url");
        ka.n nVar2 = this.f20466i.f19104h;
        return nVar.f19190e == nVar2.f19190e && p251z9.j.a(nVar.f19189d, nVar2.f19189d);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    public final d c(x xVar, ArrayList arrayList) throws UnknownServiceException {
        E6.u uVar;
        ka.s sVar = ka.s.f19251x;
        p251z9.j.e(xVar, "route");
        ka.a aVar = xVar.f19285a;
        if (aVar.f19100c == null) {
            if (!aVar.j.contains(ka.i.f19156h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = xVar.f19285a.f19104h.f19189d;
            ua.e eVar = ua.e.f22996a;
            if (!ua.e.f22996a.i(str)) {
                throw new UnknownServiceException(p245z2.a.D("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.f19105i.contains(sVar)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (xVar.f19286b.type() != Proxy.Type.HTTP) {
            uVar = null;
        } else {
            ka.a aVar2 = xVar.f19285a;
            if (aVar2.f19100c != null || aVar2.f19105i.contains(sVar)) {
                Aa.a aVar3 = new Aa.a(16);
                ka.n nVar = xVar.f19285a.f19104h;
                p251z9.j.e(nVar, "url");
                aVar3.f554r = nVar;
                aVar3.B("CONNECT");
                ka.a aVar4 = xVar.f19285a;
                aVar3.y("Host", la.e.g(aVar4.f19104h, true));
                aVar3.y("Proxy-Connection", "Keep-Alive");
                aVar3.y("User-Agent", "okhttp/5.1.0");
                E6.u uVar2 = new E6.u(aVar3);
                v vVar = w.f19284r;
                ArrayList arrayList2 = new ArrayList(20);
                B0.c.P("Proxy-Authenticate");
                B0.c.Q("OkHttp-Preemptive", "Proxy-Authenticate");
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList2.get(i10))) {
                        arrayList2.remove(i10);
                        arrayList2.remove(i10);
                        i10 -= 2;
                    }
                    i10 += 2;
                }
                arrayList2.add("Proxy-Authenticate");
                arrayList2.add(H9.o.t1("OkHttp-Preemptive").toString());
                new ka.l((String[]) arrayList2.toArray(new String[0]));
                p251z9.j.e(vVar, "body");
                aVar4.f19103f.getClass();
                uVar = uVar2;
            } else {
                uVar = null;
            }
        }
        return new d(this.f20459a, this.f20460b, this.f20461c, this.f20462d, this.f20463e, this.f20464f, this.g, this.f20467k, this, xVar, arrayList, uVar, -1, false);
    }

    @Override // oa.t
    public final p120l9.k d() {
        return this.f20471o;
    }

    @Override // oa.t
    public final s e() throws IOException {
        Socket socketO;
        boolean z10;
        q qVar;
        n nVarC = this.f20467k.c();
        if (nVarC == null) {
            qVar = null;
        } else {
            boolean zI = nVarC.i(this.f20467k.l());
            synchronized (nVarC) {
                try {
                    if (!zI) {
                        z10 = !nVarC.f20445m;
                        nVarC.f20445m = true;
                        socketO = this.f20467k.o();
                    } else if (nVarC.f20445m || !b(nVarC.f20438d.f19285a.f19104h)) {
                        socketO = this.f20467k.o();
                        z10 = false;
                    } else {
                        z10 = false;
                        socketO = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f20467k.c() == null) {
                if (socketO != null) {
                    la.e.b(socketO);
                }
                this.f20467k.getClass();
                this.f20467k.getClass();
                if (socketO != null || z10) {
                    this.f20467k.getClass();
                }
                qVar = null;
            } else {
                if (socketO != null) {
                    throw new IllegalStateException("Check failed.");
                }
                qVar = new q(nVarC);
            }
        }
        if (qVar != null) {
            return qVar;
        }
        q qVarI = i(null, null);
        if (qVarI != null) {
            return qVarI;
        }
        if (!this.f20471o.isEmpty()) {
            return (s) this.f20471o.removeFirst();
        }
        d dVarA = a();
        q qVarI2 = i(dVarA, dVarA.f20396k);
        return qVarI2 != null ? qVarI2 : dVarA;
    }

    @Override // oa.t
    public final boolean f(n nVar) {
        u uVar;
        x xVar;
        if (this.f20471o.isEmpty() && this.f20470n == null) {
            if (nVar != null) {
                synchronized (nVar) {
                    xVar = null;
                    if (nVar.f20447o == 0 && nVar.f20445m && la.e.a(nVar.f20438d.f19285a.f19104h, this.f20466i.f19104h)) {
                        xVar = nVar.f20438d;
                    }
                }
                if (xVar != null) {
                    this.f20470n = xVar;
                    return true;
                }
            }
            z zVar = this.f20468l;
            if ((zVar == null || zVar.f15518b >= zVar.f15517a.size()) && (uVar = this.f20469m) != null) {
                return uVar.a();
            }
        }
        return true;
    }

    @Override // oa.t
    public final ka.a g() {
        return this.f20466i;
    }

    @Override // oa.t
    public final boolean h() {
        return this.f20467k.m();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0044, B:22:0x0051, B:25:0x0058), top: B:53:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0044, B:22:0x0051, B:25:0x0058), top: B:53:0x0044 }] */
    public final q i(d dVar, List list) {
        n nVar;
        boolean z10;
        Socket socketO;
        o oVar = this.f20460b;
        boolean zL = this.f20467k.l();
        ka.a aVar = this.f20466i;
        a aVar2 = this.f20467k;
        boolean z11 = dVar != null && dVar.d();
        oVar.getClass();
        p251z9.j.e(aVar, "address");
        p251z9.j.e(aVar2, "connectionUser");
        Iterator it = oVar.f20458f.iterator();
        p251z9.j.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                nVar = null;
                break;
            }
            nVar = (n) it.next();
            p251z9.j.b(nVar);
            synchronized (nVar) {
                if (z11) {
                    try {
                        if (!(nVar.f20444l != null)) {
                            z10 = false;
                        } else if (nVar.f(aVar, list)) {
                            aVar2.a(nVar);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (nVar.f(aVar, list)) {
                    z10 = false;
                } else {
                    aVar2.a(nVar);
                    z10 = true;
                }
            }
            if (z10) {
                if (nVar.i(zL)) {
                    break;
                }
                synchronized (nVar) {
                    nVar.f20445m = true;
                    socketO = aVar2.o();
                }
                if (socketO != null) {
                    la.e.b(socketO);
                }
            }
        }
        if (nVar == null) {
            return null;
        }
        if (dVar != null) {
            this.f20470n = dVar.j;
            Socket socket = dVar.f20402q;
            if (socket != null) {
                la.e.b(socket);
            }
        }
        this.f20467k.e(nVar);
        this.f20467k.f(nVar);
        return new q(nVar);
    }
}
