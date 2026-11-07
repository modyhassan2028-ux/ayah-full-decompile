package ra;

import G.a0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class q implements pa.d {
    public static final List g = la.e.i(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f21720h = la.e.i(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.n f21721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pa.f f21722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f21723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile x f21724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ka.s f21725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f21726f;

    public q(ka.r rVar, oa.n nVar, pa.f fVar, p pVar) {
        p251z9.j.e(pVar, "http2Connection");
        this.f21721a = nVar;
        this.f21722b = fVar;
        this.f21723c = pVar;
        List list = rVar.f19236r;
        ka.s sVar = ka.s.f19251x;
        this.f21725e = list.contains(sVar) ? sVar : ka.s.f19250w;
    }

    @Override // pa.d
    public final void a() {
        x xVar = this.f21724d;
        p251z9.j.b(xVar);
        xVar.f21755i.close();
    }

    @Override // pa.d
    public final void b(E6.u uVar) throws IOException {
        int i10;
        x xVar;
        if (this.f21724d != null) {
            return;
        }
        ka.l lVar = (ka.l) uVar.f1962d;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new d(d.f21653f, (String) uVar.f1961c));
        Da.k kVar = d.g;
        ka.n nVar = (ka.n) uVar.f1960b;
        p251z9.j.e(nVar, "url");
        String strB = nVar.b();
        String strD = nVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(kVar, strB));
        String strB2 = ((ka.l) uVar.f1962d).b("Host");
        if (strB2 != null) {
            arrayList.add(new d(d.f21655i, strB2));
        }
        arrayList.add(new d(d.f21654h, nVar.f19186a));
        int size = lVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strC = lVar.c(i11);
            Locale locale = Locale.US;
            p251z9.j.d(locale, "US");
            String lowerCase = strC.toLowerCase(locale);
            p251z9.j.d(lowerCase, "toLowerCase(...)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && lVar.e(i11).equals("trailers"))) {
                arrayList.add(new d(lowerCase, lVar.e(i11)));
            }
        }
        p pVar = this.f21723c;
        pVar.getClass();
        synchronized (pVar.f21708N) {
            synchronized (pVar) {
                try {
                    if (pVar.f21715v > 1073741823) {
                        pVar.s(EnumC1290b.REFUSED_STREAM);
                    }
                    if (pVar.f21716w) {
                        throw new C1289a();
                    }
                    i10 = pVar.f21715v;
                    pVar.f21715v = i10 + 2;
                    xVar = new x(i10, pVar, true, false, null);
                    if (xVar.h()) {
                        pVar.f21712s.put(Integer.valueOf(i10), xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.f21708N.s(true, i10, arrayList);
        }
        pVar.f21708N.flush();
        this.f21724d = xVar;
        if (this.f21726f) {
            x xVar2 = this.f21724d;
            p251z9.j.b(xVar2);
            xVar2.e(EnumC1290b.CANCEL);
            throw new IOException("Canceled");
        }
        x xVar3 = this.f21724d;
        p251z9.j.b(xVar3);
        w wVar = xVar3.j;
        long j = this.f21722b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j);
        x xVar4 = this.f21724d;
        p251z9.j.b(xVar4);
        xVar4.f21756k.g(this.f21722b.f21175h);
    }

    @Override // pa.d
    public final boolean c() {
        boolean z10;
        x xVar = this.f21724d;
        if (xVar == null) {
            return false;
        }
        synchronized (xVar) {
            v vVar = xVar.f21754h;
            z10 = vVar.f21742s && vVar.f21744u.y();
        }
        return z10;
    }

    @Override // pa.d
    public final void cancel() {
        this.f21726f = true;
        x xVar = this.f21724d;
        if (xVar != null) {
            xVar.e(EnumC1290b.CANCEL);
        }
    }

    @Override // pa.d
    public final pa.c d() {
        return this.f21721a;
    }

    @Override // pa.d
    public final Da.y e(ka.u uVar) {
        x xVar = this.f21724d;
        p251z9.j.b(xVar);
        return xVar.f21754h;
    }

    @Override // pa.d
    public final long f(ka.u uVar) {
        if (pa.e.a(uVar)) {
            return la.e.d(uVar);
        }
        return 0L;
    }

    @Override // pa.d
    public final ka.t g() throws IOException {
        ka.l lVar;
        x xVar = this.f21724d;
        if (xVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (xVar) {
            while (true) {
                if (!xVar.f21753f.isEmpty() || xVar.f() != null) {
                    break;
                }
                xVar.f21749b.getClass();
                u uVar = xVar.f21755i;
                boolean z10 = uVar.f21739t || uVar.f21737r;
                if (z10) {
                    xVar.j.h();
                }
                try {
                    try {
                        xVar.wait();
                        if (z10) {
                            xVar.j.k();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z10) {
                        xVar.j.k();
                    }
                    throw th;
                }
            }
            if (xVar.f21753f.isEmpty()) {
                IOException iOException = xVar.f21758m;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC1290b enumC1290bF = xVar.f();
                p251z9.j.b(enumC1290bF);
                throw new C(enumC1290bF);
            }
            Object objRemoveFirst = xVar.f21753f.removeFirst();
            p251z9.j.d(objRemoveFirst, "removeFirst(...)");
            lVar = (ka.l) objRemoveFirst;
        }
        ka.s sVar = this.f21725e;
        p251z9.j.e(sVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = lVar.size();
        a0 a0VarQ = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strC = lVar.c(i10);
            String strE = lVar.e(i10);
            if (strC.equals(":status")) {
                a0VarQ = p050e8.b.Q("HTTP/1.1 ".concat(strE));
            } else if (!f21720h.contains(strC)) {
                arrayList.add(strC);
                arrayList.add(H9.o.t1(strE).toString());
            }
        }
        if (a0VarQ == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ka.t tVar = new ka.t();
        tVar.f19256b = sVar;
        tVar.f19257c = a0VarQ.f2654b;
        tVar.f19258d = (String) a0VarQ.f2656d;
        tVar.f19260f = new ka.l((String[]) arrayList.toArray(new String[0])).d();
        return tVar;
    }
}
