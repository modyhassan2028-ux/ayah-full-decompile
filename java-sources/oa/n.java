package oa;

import Z0.B;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import ka.x;
import p151p.m1;
import ra.C;
import ra.C1289a;
import ra.C1291c;
import ra.EnumC1290b;
import ra.y;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ra.m implements pa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.d f20436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f20437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f20438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f20439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Socket f20440f;
    public final ka.k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ka.s f20441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Da.j f20442i;
    public final Da.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f20443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ra.p f20444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f20451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20452t;

    public n(na.d dVar, o oVar, x xVar, Socket socket, Socket socket2, ka.k kVar, ka.s sVar, Da.t tVar, Da.s sVar2, e eVar) {
        p251z9.j.e(dVar, "taskRunner");
        p251z9.j.e(oVar, "connectionPool");
        p251z9.j.e(xVar, "route");
        p251z9.j.e(socket, "rawSocket");
        p251z9.j.e(socket2, "socket");
        p251z9.j.e(sVar, "protocol");
        p251z9.j.e(tVar, "source");
        p251z9.j.e(sVar2, "sink");
        this.f20436b = dVar;
        this.f20437c = oVar;
        this.f20438d = xVar;
        this.f20439e = socket;
        this.f20440f = socket2;
        this.g = kVar;
        this.f20441h = sVar;
        this.f20442i = tVar;
        this.j = sVar2;
        this.f20443k = eVar;
        this.f20450r = 1;
        this.f20451s = new ArrayList();
        this.f20452t = Long.MAX_VALUE;
    }

    public static void c(ka.r rVar, x xVar, IOException iOException) {
        p251z9.j.e(xVar, "failedRoute");
        p251z9.j.e(iOException, "failure");
        if (xVar.f19286b.type() != Proxy.Type.DIRECT) {
            ka.a aVar = xVar.f19285a;
            aVar.g.connectFailed(aVar.f19104h.g(), xVar.f19286b.address(), iOException);
        }
        B b5 = rVar.f19243y;
        synchronized (b5) {
            ((LinkedHashSet) b5.f10875s).add(xVar);
        }
    }

    @Override // ra.m
    public final void a(ra.p pVar, ra.B b5) {
        p251z9.j.e(b5, "settings");
        synchronized (this) {
            try {
                int i10 = this.f20450r;
                int i11 = (b5.f21638a & 8) != 0 ? b5.f21639b[3] : Integer.MAX_VALUE;
                this.f20450r = i11;
                if (i11 < i10) {
                    o oVar = this.f20437c;
                    ka.a aVar = this.f20438d.f19285a;
                    oVar.getClass();
                    p251z9.j.e(aVar, "address");
                    if (oVar.f20455c.get(aVar) != null) {
                        throw new ClassCastException();
                    }
                } else if (i11 > i10) {
                    o oVar2 = this.f20437c;
                    oVar2.f20456d.d(oVar2.f20457e, 0L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ra.m
    public final void b(ra.x xVar) {
        xVar.c(EnumC1290b.REFUSED_STREAM, null);
    }

    @Override // pa.c
    public final void cancel() {
        la.e.b(this.f20439e);
    }

    public final void d() {
        synchronized (this) {
            this.f20448p++;
        }
    }

    @Override // pa.c
    public final x e() {
        return this.f20438d;
    }

    public final boolean f(ka.a aVar, List list) {
        p251z9.j.e(aVar, "address");
        ka.n nVar = aVar.f19104h;
        TimeZone timeZone = la.e.f19451a;
        if (this.f20451s.size() < this.f20450r && !this.f20445m) {
            x xVar = this.f20438d;
            ka.a aVar2 = xVar.f19285a;
            ka.a aVar3 = xVar.f19285a;
            if (aVar2.a(aVar)) {
                String str = nVar.f19189d;
                String str2 = nVar.f19189d;
                if (!p251z9.j.a(str, aVar3.f19104h.f19189d)) {
                    if (this.f20444l != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            x xVar2 = (x) it.next();
                            Proxy.Type type = xVar2.f19286b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && xVar.f19286b.type() == type2 && p251z9.j.a(xVar.f19287c, xVar2.f19287c)) {
                                if (aVar.f19101d != ya.c.f24718a) {
                                    break;
                                }
                                TimeZone timeZone2 = la.e.f19451a;
                                ka.n nVar2 = aVar3.f19104h;
                                if (nVar.f19190e != nVar2.f19190e) {
                                    break;
                                }
                                boolean zA = p251z9.j.a(str2, nVar2.f19189d);
                                ka.k kVar = this.g;
                                if (!zA) {
                                    if (!this.f20446n && kVar != null) {
                                        List listA = kVar.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            p251z9.j.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!ya.c.c(str2, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    ka.d dVar = aVar.f19102e;
                                    p251z9.j.b(dVar);
                                    p251z9.j.b(kVar);
                                    List listA2 = kVar.a();
                                    p251z9.j.e(str2, "hostname");
                                    p251z9.j.e(listA2, "peerCertificates");
                                    Iterator it2 = dVar.f19122a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pa.c
    public final void g(m mVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof C)) {
                    if (!(this.f20444l != null) || (iOException instanceof C1289a)) {
                        this.f20445m = true;
                        if (this.f20448p == 0) {
                            if (iOException != null) {
                                c(mVar.f20427r, this.f20438d, iOException);
                            }
                            this.f20447o++;
                        }
                    }
                } else if (((C) iOException).f21640r == EnumC1290b.REFUSED_STREAM) {
                    int i10 = this.f20449q + 1;
                    this.f20449q = i10;
                    if (i10 > 1) {
                        this.f20445m = true;
                        this.f20447o++;
                    }
                } else if (((C) iOException).f21640r != EnumC1290b.CANCEL || !mVar.f20424D) {
                    this.f20445m = true;
                    this.f20447o++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // pa.c
    public final void h() {
        synchronized (this) {
            this.f20445m = true;
        }
        this.f20443k.getClass();
    }

    public final boolean i(boolean z10) {
        long j;
        TimeZone timeZone = la.e.f19451a;
        long jNanoTime = System.nanoTime();
        if (this.f20439e.isClosed() || this.f20440f.isClosed() || this.f20440f.isInputShutdown() || this.f20440f.isOutputShutdown()) {
            return false;
        }
        ra.p pVar = this.f20444l;
        if (pVar != null) {
            return pVar.i(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f20452t;
        }
        if (j < 10000000000L || !z10) {
            return true;
        }
        Socket socket = this.f20440f;
        Da.j jVar = this.f20442i;
        p251z9.j.e(socket, "<this>");
        p251z9.j.e(jVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !jVar.y();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void j() throws SocketException {
        this.f20452t = System.nanoTime();
        ka.s sVar = this.f20441h;
        if (sVar == ka.s.f19250w || sVar == ka.s.f19251x) {
            this.f20440f.setSoTimeout(0);
            C1291c c1291c = C1291c.f21650a;
            m1 m1Var = new m1(this.f20436b);
            Socket socket = this.f20440f;
            String str = this.f20438d.f19285a.f19104h.f19189d;
            Da.j jVar = this.f20442i;
            Da.i iVar = this.j;
            p251z9.j.e(socket, "socket");
            p251z9.j.e(str, "peerName");
            p251z9.j.e(jVar, "source");
            p251z9.j.e(iVar, "sink");
            m1Var.f20741b = socket;
            String str2 = la.e.f19452b + ' ' + str;
            p251z9.j.e(str2, "<set-?>");
            m1Var.f20742c = str2;
            m1Var.f20743d = jVar;
            m1Var.f20744e = iVar;
            m1Var.f20745f = this;
            m1Var.g = c1291c;
            ra.p pVar = new ra.p(m1Var);
            this.f20444l = pVar;
            ra.B b5 = ra.p.Q;
            this.f20450r = (b5.f21638a & 8) != 0 ? b5.f21639b[3] : Integer.MAX_VALUE;
            y yVar = pVar.f21708N;
            synchronized (yVar) {
                try {
                    if (yVar.f21763u) {
                        throw new IOException("closed");
                    }
                    Logger logger = y.f21759w;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(la.e.c(">> CONNECTION " + ra.h.f21674a.b(), new Object[0]));
                    }
                    yVar.f21760r.v(ra.h.f21674a);
                    yVar.f21760r.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.f21708N.E(pVar.f21702H);
            int iA = pVar.f21702H.a();
            if (iA != 65535) {
                pVar.f21708N.F(iA - 65535, 0);
            }
            na.c.c(pVar.f21717x.d(), pVar.f21713t, pVar.f21709O);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        x xVar = this.f20438d;
        sb.append(xVar.f19285a.f19104h.f19189d);
        sb.append(':');
        sb.append(xVar.f19285a.f19104h.f19190e);
        sb.append(", proxy=");
        sb.append(xVar.f19286b);
        sb.append(" hostAddress=");
        sb.append(xVar.f19287c);
        sb.append(" cipherSuite=");
        ka.k kVar = this.g;
        if (kVar == null || (obj = kVar.f19174b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f20441h);
        sb.append('}');
        return sb.toString();
    }
}
