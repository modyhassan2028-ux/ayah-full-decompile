package pa;

import Z0.B;
import i7.C1011q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import ka.l;
import ka.n;
import ka.o;
import ka.t;
import ka.u;
import ka.w;
import ka.x;
import oa.m;
import oa.p;
import p120l9.r;
import p251z9.j;
import ra.C1289a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21166a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21167b;

    public a(ka.b bVar) {
        j.e(bVar, "cookieJar");
        this.f21167b = bVar;
    }

    public static int d(u uVar, int i10) {
        String strB = uVar.f19278w.b("Retry-After");
        if (strB == null) {
            strB = null;
        }
        if (strB == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        j.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        j.d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    @Override // ka.o
    public final u a(f fVar) {
        boolean z10;
        w wVar;
        SSLSocketFactory sSLSocketFactory;
        ya.c cVar;
        ka.d dVar;
        switch (this.f21166a) {
            case 0:
                boolean z11 = true;
                ka.b bVar = (ka.b) this.f21167b;
                E6.u uVar = fVar.f21173e;
                Aa.a aVarU = uVar.u();
                n nVar = (n) uVar.f1960b;
                l lVar = (l) uVar.f1962d;
                if (lVar.b("Host") == null) {
                    z10 = false;
                    aVarU.y("Host", la.e.g(nVar, false));
                } else {
                    z10 = false;
                }
                if (lVar.b("Connection") == null) {
                    aVarU.y("Connection", "Keep-Alive");
                }
                if (lVar.b("Accept-Encoding") == null && lVar.b("Range") == null) {
                    aVarU.y("Accept-Encoding", "gzip");
                } else {
                    z11 = z10;
                }
                bVar.getClass();
                j.e(nVar, "url");
                if (lVar.b("User-Agent") == null) {
                    aVarU.y("User-Agent", "okhttp/5.1.0");
                }
                E6.u uVar2 = new E6.u(aVarU);
                u uVarB = fVar.b(uVar2);
                l lVar2 = uVarB.f19278w;
                e.b(bVar, (n) uVar2.f1960b, lVar2);
                t tVarB = uVarB.b();
                tVarB.f19255a = uVar2;
                if (z11) {
                    String strB = lVar2.b("Content-Encoding");
                    if (strB == null) {
                        strB = null;
                    }
                    if ("gzip".equalsIgnoreCase(strB) && e.a(uVarB) && (wVar = uVarB.f19279x) != null) {
                        Da.n nVar2 = new Da.n(wVar.i());
                        B bD = lVar2.d();
                        bD.l("Content-Encoding");
                        bD.l("Content-Length");
                        tVarB.f19260f = bD.d().d();
                        String strB2 = lVar2.b("Content-Type");
                        tVarB.g = new g(strB2 == null ? null : strB2, -1L, Y2.a.p(nVar2));
                    }
                }
                return tVarB.a();
            default:
                E6.u uVar3 = fVar.f21173e;
                m mVar = fVar.f21169a;
                List listR0 = r.f19440r;
                u uVarA = null;
                int i10 = 0;
                E6.u uVarB2 = uVar3;
                while (true) {
                    boolean z12 = true;
                    while (true) {
                        if (mVar.f20435z != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (mVar) {
                            try {
                                if (mVar.f20422B) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (mVar.f20421A) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z12) {
                            ka.r rVar = mVar.f20427r;
                            na.d dVar2 = rVar.f19244z;
                            oa.o oVar = mVar.f20429t;
                            int i11 = rVar.f19241w;
                            int i12 = rVar.f19242x;
                            int i13 = fVar.f21174f;
                            int i14 = fVar.g;
                            boolean z13 = rVar.f19225e;
                            boolean z14 = rVar.f19226f;
                            n nVar3 = (n) uVarB2.f1960b;
                            j.e(nVar3, "url");
                            if (j.a(nVar3.f19186a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f19233o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                ya.c cVar2 = rVar.f19237s;
                                dVar = rVar.f19238t;
                                cVar = cVar2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            p pVar = new p(dVar2, oVar, i11, i12, i13, i14, z13, z14, new ka.a(nVar3.f19189d, nVar3.f19190e, rVar.f19229k, rVar.f19232n, sSLSocketFactory, cVar, dVar, rVar.f19231m, rVar.f19236r, rVar.f19235q, rVar.f19230l), mVar.f20427r.f19243y, new oa.a(mVar, mVar.f20429t.f20453a, fVar));
                            ka.r rVar2 = mVar.f20427r;
                            mVar.f20433x = rVar2.f19226f ? new C1011q(pVar, rVar2.f19244z) : new oa.j(pVar);
                        }
                        try {
                            if (mVar.f20424D) {
                                throw new IOException("Canceled");
                            }
                            try {
                            } catch (IOException e10) {
                                if (!c(e10, mVar, uVarB2)) {
                                    byte[] bArr = la.c.f19448a;
                                    j.e(listR0, "suppressed");
                                    Iterator it = listR0.iterator();
                                    while (it.hasNext()) {
                                        p110k9.a.a(e10, (Exception) it.next());
                                    }
                                    throw e10;
                                }
                                listR0 = p120l9.m.r0(listR0, e10);
                                mVar.c(true);
                                z12 = false;
                            }
                        } catch (Throwable th2) {
                            mVar.c(true);
                            throw th2;
                        }
                        break;
                    }
                    t tVarB2 = fVar.b(uVarB2).b();
                    tVarB2.f19255a = uVarB2;
                    tVarB2.j = uVarA != null ? va.g.R(uVarA) : null;
                    uVarA = tVarB2.a();
                    uVarB2 = b(uVarA, mVar.f20435z);
                    if (uVarB2 == null) {
                        mVar.c(false);
                        return uVarA;
                    }
                    la.c.a(uVarA.f19279x);
                    i10++;
                    if (i10 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                    mVar.c(true);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:106:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    public E6.u b(u uVar, Ca.r rVar) throws ProtocolException {
        ka.r rVar2;
        String strB;
        E6.u uVar2;
        ka.m mVar;
        n nVarA;
        Aa.a aVarU;
        boolean z10;
        u uVar3;
        x xVar = rVar != null ? rVar.a().f20438d : null;
        int i10 = uVar.f19276u;
        String str = (String) uVar.f19273r.f1961c;
        if (i10 == 307 || i10 == 308) {
            rVar2 = (ka.r) this.f21167b;
            if (rVar2.f19227h) {
                strB = uVar.f19278w.b("Location");
                if (strB == null) {
                    strB = null;
                }
                uVar2 = uVar.f19273r;
                if (strB != null) {
                    n nVar = (n) uVar2.f1960b;
                    nVar.getClass();
                    try {
                        mVar = new ka.m();
                        mVar.c(nVar, strB);
                    } catch (IllegalArgumentException unused) {
                        mVar = null;
                    }
                    if (mVar != null) {
                        nVarA = mVar.a();
                    } else {
                        nVarA = null;
                    }
                    if (nVarA != null && (j.a(nVarA.f19186a, ((n) uVar2.f1960b).f19186a) || rVar2.f19228i)) {
                        aVarU = uVar2.u();
                        j.e(str, "method");
                        if (!str.equals("GET") && !str.equals("HEAD")) {
                            int i11 = uVar.f19276u;
                            z10 = !str.equals("PROPFIND") || i11 == 308 || i11 == 307;
                            if (!str.equals("PROPFIND") || i11 == 308 || i11 == 307) {
                                aVarU.B(str);
                            } else {
                                aVarU.B("GET");
                            }
                            if (!z10) {
                                ((B) aVarU.f556t).l("Transfer-Encoding");
                                ((B) aVarU.f556t).l("Content-Length");
                                ((B) aVarU.f556t).l("Content-Type");
                            }
                        }
                        if (!la.e.a((n) uVar2.f1960b, nVarA)) {
                            ((B) aVarU.f556t).l("Authorization");
                        }
                        aVarU.f554r = nVarA;
                        return new E6.u(aVarU);
                    }
                }
            }
        } else {
            if (i10 == 401) {
                ((ka.r) this.f21167b).g.getClass();
                return null;
            }
            if (i10 != 421) {
                if (i10 == 503) {
                    u uVar4 = uVar.f19267A;
                    if ((uVar4 == null || uVar4.f19276u != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                        return uVar.f19273r;
                    }
                } else {
                    if (i10 == 407) {
                        j.b(xVar);
                        if (xVar.f19286b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((ka.r) this.f21167b).f19231m.getClass();
                        return null;
                    }
                    if (i10 != 408) {
                        switch (i10) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                rVar2 = (ka.r) this.f21167b;
                                if (rVar2.f19227h) {
                                    strB = uVar.f19278w.b("Location");
                                    if (strB == null) {
                                        strB = null;
                                    }
                                    uVar2 = uVar.f19273r;
                                    if (strB != null) {
                                        n nVar2 = (n) uVar2.f1960b;
                                        nVar2.getClass();
                                        mVar = new ka.m();
                                        mVar.c(nVar2, strB);
                                        if (mVar != null) {
                                            nVarA = mVar.a();
                                        } else {
                                            nVarA = null;
                                        }
                                        if (nVarA != null) {
                                            aVarU = uVar2.u();
                                            j.e(str, "method");
                                            if (!str.equals("GET")) {
                                                int i12 = uVar.f19276u;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    aVarU.B(str);
                                                } else {
                                                    aVarU.B(str);
                                                }
                                                if (!z10) {
                                                    ((B) aVarU.f556t).l("Transfer-Encoding");
                                                    ((B) aVarU.f556t).l("Content-Length");
                                                    ((B) aVarU.f556t).l("Content-Type");
                                                }
                                            }
                                            if (!la.e.a((n) uVar2.f1960b, nVarA)) {
                                                ((B) aVarU.f556t).l("Authorization");
                                            }
                                            aVarU.f554r = nVarA;
                                            return new E6.u(aVarU);
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((ka.r) this.f21167b).f19225e && (((uVar3 = uVar.f19267A) == null || uVar3.f19276u != 408) && d(uVar, 0) <= 0)) {
                        return uVar.f19273r;
                    }
                }
            } else if (rVar != null && !j.a(((oa.g) rVar.f850d).c().g().f19104h.f19189d, ((d) rVar.f851e).d().e().f19285a.f19104h.f19189d)) {
                oa.n nVarA2 = rVar.a();
                synchronized (nVarA2) {
                    nVarA2.f20446n = true;
                }
                return uVar.f19273r;
            }
        }
        return null;
    }

    public boolean c(IOException iOException, m mVar, E6.u uVar) {
        boolean z10 = iOException instanceof C1289a;
        if (!((ka.r) this.f21167b).f19225e) {
            return false;
        }
        if ((!z10 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z10) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Ca.r rVar = mVar.f20425E;
        if (rVar == null || !rVar.f848b) {
            return false;
        }
        oa.g gVar = mVar.f20433x;
        j.b(gVar);
        oa.t tVarC = gVar.c();
        Ca.r rVar2 = mVar.f20425E;
        return tVarC.f(rVar2 != null ? rVar2.a() : null);
    }

    public a(ka.r rVar) {
        this.f21167b = rVar;
    }
}
