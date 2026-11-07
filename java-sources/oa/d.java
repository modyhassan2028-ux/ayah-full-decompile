package oa;

import Da.A;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ka.x;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s, pa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na.d f20388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f20389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20393f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f20394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f20395i;
    public final x j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f20396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E6.u f20397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f20398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f20399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f20400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Socket f20401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Socket f20402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ka.k f20403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ka.s f20404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Da.t f20405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Da.s f20406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f20407v;

    public d(na.d dVar, o oVar, int i10, int i11, int i12, int i13, boolean z10, a aVar, p pVar, x xVar, List list, E6.u uVar, int i14, boolean z11) {
        p251z9.j.e(dVar, "taskRunner");
        p251z9.j.e(oVar, "connectionPool");
        p251z9.j.e(aVar, "user");
        p251z9.j.e(xVar, "route");
        this.f20388a = dVar;
        this.f20389b = oVar;
        this.f20390c = i10;
        this.f20391d = i11;
        this.f20392e = i12;
        this.f20393f = i13;
        this.g = z10;
        this.f20394h = aVar;
        this.f20395i = pVar;
        this.j = xVar;
        this.f20396k = list;
        this.f20397l = uVar;
        this.f20398m = i14;
        this.f20399n = z11;
    }

    @Override // oa.s
    public final s a() {
        return new d(this.f20388a, this.f20389b, this.f20390c, this.f20391d, this.f20392e, this.f20393f, this.g, this.f20394h, this.f20395i, this.j, this.f20396k, this.f20397l, this.f20398m, this.f20399n);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    @Override // oa.s
    public final r b() throws Throwable {
        boolean z10;
        d dVar;
        boolean z11;
        Socket socket;
        d dVar2;
        Socket socket2 = this.f20401p;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (d()) {
            throw new IllegalStateException("already connected");
        }
        x xVar = this.j;
        ka.a aVar = xVar.f19285a;
        ka.a aVar2 = xVar.f19285a;
        List list = aVar.j;
        a aVar3 = this.f20394h;
        aVar3.b(this);
        d dVar3 = null;
        try {
            try {
                if (this.f20397l != null) {
                    r rVarK = k();
                    if (rVarK.f20475c != null) {
                        aVar3.p(this);
                        Socket socket3 = this.f20402q;
                        if (socket3 != null) {
                            la.e.b(socket3);
                        }
                        la.e.b(socket2);
                        return rVarK;
                    }
                }
                if (aVar2.f19100c != null) {
                    Da.t tVar = this.f20405t;
                    if (tVar == null) {
                        p251z9.j.k("source");
                        throw null;
                    }
                    if (tVar.f1393s.y()) {
                        Da.s sVar = this.f20406u;
                        if (sVar == null) {
                            p251z9.j.k("sink");
                            throw null;
                        }
                        if (sVar.f1390s.y()) {
                            aVar3.getClass();
                            SSLSocketFactory sSLSocketFactory = aVar2.f19100c;
                            ka.n nVar = aVar2.f19104h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, nVar.f19189d, nVar.f19190e, true);
                            p251z9.j.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            d dVarM = m(list, sSLSocket);
                            ka.i iVar = (ka.i) list.get(dVarM.f20398m);
                            d dVarL = dVarM.l(list, sSLSocket);
                            try {
                                iVar.a(sSLSocket, dVarM.f20399n);
                                j(sSLSocket, iVar);
                                aVar3.getClass();
                                dVar2 = dVarL;
                            } catch (IOException e10) {
                                e = e10;
                                dVar = null;
                                dVar3 = dVarL;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f20402q = socket2;
                List list2 = aVar2.f19105i;
                ka.s sVar2 = ka.s.f19251x;
                if (!list2.contains(sVar2)) {
                    sVar2 = ka.s.f19248u;
                }
                this.f20404s = sVar2;
                dVar2 = null;
                try {
                    try {
                        na.d dVar4 = this.f20388a;
                        try {
                            o oVar = this.f20389b;
                            x xVar2 = this.j;
                            Socket socket4 = this.f20402q;
                            p251z9.j.b(socket4);
                            ka.k kVar = this.f20403r;
                            try {
                                ka.s sVar3 = this.f20404s;
                                p251z9.j.b(sVar3);
                                Da.t tVar2 = this.f20405t;
                                try {
                                    if (tVar2 == null) {
                                        p251z9.j.k("source");
                                        throw null;
                                    }
                                    Da.s sVar4 = this.f20406u;
                                    if (sVar4 == null) {
                                        p251z9.j.k("sink");
                                        throw null;
                                    }
                                    dVar = null;
                                    n nVar2 = new n(dVar4, oVar, xVar2, socket2, socket4, kVar, sVar3, tVar2, sVar4, this.f20389b.f20453a);
                                    this.f20407v = nVar2;
                                    nVar2.j();
                                    aVar3.getClass();
                                    p251z9.j.e(xVar, "route");
                                    p251z9.j.e(xVar.f19287c, "inetSocketAddress");
                                    try {
                                        r rVar = new r(this, (Throwable) null, 6);
                                        aVar3.p(this);
                                        return rVar;
                                    } catch (IOException e11) {
                                        e = e11;
                                        dVar3 = dVar2;
                                        z11 = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z10 = true;
                                        aVar3.p(this);
                                        if (!z10) {
                                            socket = this.f20402q;
                                            if (socket != null) {
                                                la.e.b(socket);
                                            }
                                            la.e.b(socket2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    dVar3 = dVar2;
                                    z11 = false;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                dVar = null;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            dVar = null;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        dVar = null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    dVar = null;
                }
                dVar3 = dVar2;
            } catch (IOException e17) {
                e = e17;
                dVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
        z11 = false;
        try {
            aVar3.d(xVar, e);
            if (!this.g || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
                dVar3 = dVar;
            }
            r rVar2 = new r(this, dVar3, e);
            aVar3.p(this);
            if (!z11) {
                Socket socket5 = this.f20402q;
                if (socket5 != null) {
                    la.e.b(socket5);
                }
                la.e.b(socket2);
            }
            return rVar2;
        } catch (Throwable th3) {
            th = th3;
            z10 = z11;
            aVar3.p(this);
            if (!z10) {
                socket = this.f20402q;
                if (socket != null) {
                    la.e.b(socket);
                }
                la.e.b(socket2);
            }
            throw th;
        }
    }

    @Override // oa.s
    public final n c() {
        this.f20394h.s(this.j);
        n nVar = this.f20407v;
        p251z9.j.b(nVar);
        a aVar = this.f20394h;
        x xVar = this.j;
        aVar.getClass();
        p251z9.j.e(nVar, "connection");
        p251z9.j.e(xVar, "route");
        e eVar = aVar.f20384b;
        m mVar = aVar.f20383a;
        eVar.getClass();
        p251z9.j.e(mVar, "call");
        q qVarI = this.f20395i.i(this, this.f20396k);
        if (qVarI != null) {
            return qVarI.f20472a;
        }
        synchronized (nVar) {
            o oVar = this.f20389b;
            oVar.getClass();
            TimeZone timeZone = la.e.f19451a;
            oVar.f20458f.add(nVar);
            oVar.f20456d.d(oVar.f20457e, 0L);
            this.f20394h.a(nVar);
        }
        this.f20394h.e(nVar);
        this.f20394h.f(nVar);
        return nVar;
    }

    @Override // oa.s, pa.c
    public final void cancel() {
        this.f20400o = true;
        Socket socket = this.f20401p;
        if (socket != null) {
            la.e.b(socket);
        }
    }

    @Override // oa.s
    public final boolean d() {
        return this.f20404s != null;
    }

    @Override // pa.c
    public final x e() {
        return this.j;
    }

    @Override // oa.s
    public final r f() {
        Socket socket;
        Socket socket2;
        x xVar = this.j;
        if (this.f20401p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f20394h;
        aVar.b(this);
        boolean z10 = false;
        try {
            try {
                aVar.getClass();
                p251z9.j.e(xVar, "route");
                p251z9.j.e(xVar.f19287c, "inetSocketAddress");
                i();
                z10 = true;
                r rVar = new r(this, (Throwable) null, 6);
                aVar.p(this);
                return rVar;
            } catch (IOException e10) {
                xVar.f19285a.getClass();
                if (xVar.f19286b.type() != Proxy.Type.DIRECT) {
                    ka.a aVar2 = xVar.f19285a;
                    aVar2.g.connectFailed(aVar2.f19104h.g(), xVar.f19286b.address(), e10);
                }
                aVar.d(xVar, e10);
                r rVar2 = new r(this, e10, 2);
                aVar.p(this);
                if (!z10 && (socket = this.f20401p) != null) {
                    la.e.b(socket);
                }
                return rVar2;
            }
        } catch (Throwable th) {
            aVar.p(this);
            if (!z10 && (socket2 = this.f20401p) != null) {
                la.e.b(socket2);
            }
            throw th;
        }
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.f19286b.type();
        int i10 = type == null ? -1 : c.f20387a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = this.j.f19285a.f19099b.createSocket();
            p251z9.j.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.j.f19286b);
        }
        this.f20401p = socketCreateSocket;
        if (this.f20400o) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f20393f);
        try {
            ua.e eVar = ua.e.f22996a;
            ua.e.f22996a.f(socketCreateSocket, this.j.f19287c, this.f20392e);
            try {
                this.f20405t = Y2.a.p(Y2.a.l0(socketCreateSocket));
                this.f20406u = Y2.a.o(Y2.a.j0(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (p251z9.j.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.f19287c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, ka.i iVar) {
        String strG;
        ka.s sVarD;
        ka.a aVar = this.j.f19285a;
        try {
            if (iVar.f19158b) {
                ua.e eVar = ua.e.f22996a;
                ua.e.f22996a.e(sSLSocket, aVar.f19104h.f19189d, aVar.f19105i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            p251z9.j.b(session);
            ka.k kVarZ = B0.c.z(session);
            HostnameVerifier hostnameVerifier = aVar.f19101d;
            p251z9.j.b(hostnameVerifier);
            if (!hostnameVerifier.verify(aVar.f19104h.f19189d, session)) {
                List listA = kVarZ.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f19104h.f19189d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                p251z9.j.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(aVar.f19104h.f19189d);
                sb.append(" not verified:\n            |    certificate: ");
                ka.d dVar = ka.d.f19121c;
                sb.append(u0.v(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(p120l9.m.q0(ya.c.a(x509Certificate, 7), ya.c.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(H9.p.J0(sb.toString()));
            }
            ka.d dVar2 = aVar.f19102e;
            p251z9.j.b(dVar2);
            this.f20403r = new ka.k(kVarZ.f19173a, kVarZ.f19174b, kVarZ.f19175c, new W4.d(dVar2, kVarZ, aVar, 1));
            p251z9.j.e(aVar.f19104h.f19189d, "hostname");
            Iterator it = dVar2.f19122a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVar.f19158b) {
                ua.e eVar2 = ua.e.f22996a;
                strG = ua.e.f22996a.g(sSLSocket);
            } else {
                strG = null;
            }
            this.f20402q = sSLSocket;
            this.f20405t = Y2.a.p(Y2.a.l0(sSLSocket));
            this.f20406u = Y2.a.o(Y2.a.j0(sSLSocket));
            if (strG != null) {
                ka.s.f19246s.getClass();
                sVarD = ka.b.d(strG);
            } else {
                sVarD = ka.s.f19248u;
            }
            this.f20404s = sVarD;
            ua.e eVar3 = ua.e.f22996a;
            ua.e.f22996a.getClass();
        } catch (Throwable th) {
            ua.e eVar4 = ua.e.f22996a;
            ua.e.f22996a.getClass();
            la.e.b(sSLSocket);
            throw th;
        }
    }

    public final r k() throws IOException {
        E6.u uVar = this.f20397l;
        p251z9.j.b(uVar);
        x xVar = this.j;
        String str = "CONNECT " + la.e.g(xVar.f19285a.f19104h, true) + " HTTP/1.1";
        Da.t tVar = this.f20405t;
        if (tVar == null) {
            p251z9.j.k("source");
            throw null;
        }
        Da.s sVar = this.f20406u;
        if (sVar == null) {
            p251z9.j.k("sink");
            throw null;
        }
        qa.e eVar = new qa.e(null, this, tVar, sVar);
        Da.t tVar2 = this.f20405t;
        if (tVar2 == null) {
            p251z9.j.k("source");
            throw null;
        }
        A aD = tVar2.f1392r.d();
        long j = this.f20390c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aD.g(j);
        Da.s sVar2 = this.f20406u;
        if (sVar2 == null) {
            p251z9.j.k("sink");
            throw null;
        }
        sVar2.f1389r.d().g(this.f20391d);
        eVar.i((ka.l) uVar.f1962d, str);
        eVar.a();
        ka.t tVarG = eVar.g();
        tVarG.f19255a = uVar;
        ka.u uVarA = tVarG.a();
        int i10 = uVarA.f19276u;
        long jD = la.e.d(uVarA);
        if (jD != -1) {
            qa.c cVarH = eVar.h((ka.n) uVarA.f19273r.f1960b, jD);
            la.e.e(cVarH, Integer.MAX_VALUE);
            cVarH.close();
        }
        if (i10 == 200) {
            return new r(this, (Throwable) null, 6);
        }
        if (i10 != 407) {
            throw new IOException(p123m2.c.r(i10, "Unexpected response code for CONNECT: "));
        }
        xVar.f19285a.f19103f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final d l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        p251z9.j.e(list, "connectionSpecs");
        int i10 = this.f20398m;
        int size = list.size();
        for (int i11 = i10 + 1; i11 < size; i11++) {
            ka.i iVar = (ka.i) list.get(i11);
            iVar.getClass();
            if (iVar.f19157a && (((strArr = iVar.f19160d) == null || la.c.d(strArr, sSLSocket.getEnabledProtocols(), p139n9.a.f20030b)) && ((strArr2 = iVar.f19159c) == null || la.c.d(strArr2, sSLSocket.getEnabledCipherSuites(), ka.f.f19125c)))) {
                return new d(this.f20388a, this.f20389b, this.f20390c, this.f20391d, this.f20392e, this.f20393f, this.g, this.f20394h, this.f20395i, this.j, this.f20396k, this.f20397l, i11, i10 != -1);
            }
        }
        return null;
    }

    public final d m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        p251z9.j.e(list, "connectionSpecs");
        if (this.f20398m != -1) {
            return this;
        }
        d dVarL = l(list, sSLSocket);
        if (dVarL != null) {
            return dVarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f20399n);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        p251z9.j.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        p251z9.j.d(string, "toString(...)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // pa.c
    public final void h() {
    }

    @Override // pa.c
    public final void g(m mVar, IOException iOException) {
    }
}
