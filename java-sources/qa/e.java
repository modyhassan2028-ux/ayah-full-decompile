package qa;

import A.o1;
import Da.i;
import Da.j;
import Da.y;
import E6.u;
import G.a0;
import H9.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import ka.l;
import ka.n;
import ka.r;
import ka.s;
import ka.t;

/* JADX INFO: loaded from: classes.dex */
public final class e implements pa.d {
    public static final l g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pa.c f21363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f21364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f21365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1 f21367f;

    static {
        l lVar = l.f19177s;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        p251z9.j.e(strArr, "inputNamesAndValues");
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr2[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = o.t1(strArr[i11]).toString();
        }
        int iC = p186s9.b.c(0, strArr2.length - 1, 2);
        if (iC >= 0) {
            while (true) {
                String str = strArr2[i10];
                String str2 = strArr2[i10 + 1];
                B0.c.P(str);
                B0.c.Q(str2, str);
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        g = new l(strArr2);
    }

    public e(r rVar, pa.c cVar, j jVar, i iVar) {
        p251z9.j.e(jVar, "source");
        p251z9.j.e(iVar, "sink");
        this.f21362a = rVar;
        this.f21363b = cVar;
        this.f21364c = jVar;
        this.f21365d = iVar;
        this.f21367f = new o1(jVar);
    }

    @Override // pa.d
    public final void a() {
        this.f21365d.flush();
    }

    @Override // pa.d
    public final void b(u uVar) {
        Proxy.Type type = this.f21363b.e().f19286b.type();
        p251z9.j.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) uVar.f1961c);
        sb.append(' ');
        n nVar = (n) uVar.f1960b;
        if (p251z9.j.a(nVar.f19186a, "https") || type != Proxy.Type.HTTP) {
            String strB = nVar.b();
            String strD = nVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        i((l) uVar.f1962d, sb.toString());
    }

    @Override // pa.d
    public final boolean c() {
        return this.f21366e == 6;
    }

    @Override // pa.d
    public final void cancel() {
        this.f21363b.cancel();
    }

    @Override // pa.d
    public final pa.c d() {
        return this.f21363b;
    }

    @Override // pa.d
    public final y e(ka.u uVar) {
        u uVar2 = uVar.f19273r;
        if (!pa.e.a(uVar)) {
            return h((n) uVar2.f1960b, 0L);
        }
        String strB = uVar.f19278w.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            n nVar = (n) uVar2.f1960b;
            if (this.f21366e == 4) {
                this.f21366e = 5;
                return new b(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f21366e).toString());
        }
        long jD = la.e.d(uVar);
        if (jD != -1) {
            return h((n) uVar2.f1960b, jD);
        }
        n nVar2 = (n) uVar2.f1960b;
        if (this.f21366e != 4) {
            throw new IllegalStateException(("state: " + this.f21366e).toString());
        }
        this.f21366e = 5;
        this.f21363b.h();
        p251z9.j.e(nVar2, "url");
        return new d(this, nVar2);
    }

    @Override // pa.d
    public final long f(ka.u uVar) {
        if (!pa.e.a(uVar)) {
            return 0L;
        }
        String strB = uVar.f19278w.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            return -1L;
        }
        return la.e.d(uVar);
    }

    @Override // pa.d
    public final t g() throws IOException {
        o1 o1Var = this.f21367f;
        int i10 = this.f21366e;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f21366e).toString());
        }
        try {
            String strG = ((j) o1Var.f367t).G(o1Var.f366s);
            o1Var.f366s -= (long) strG.length();
            a0 a0VarQ = p050e8.b.Q(strG);
            int i11 = a0VarQ.f2654b;
            t tVar = new t();
            tVar.f19256b = (s) a0VarQ.f2655c;
            tVar.f19257c = i11;
            tVar.f19258d = (String) a0VarQ.f2656d;
            tVar.f19260f = o1Var.i().d();
            if (i11 == 100) {
                this.f21366e = 3;
                return tVar;
            }
            if (102 > i11 || i11 >= 200) {
                this.f21366e = 4;
                return tVar;
            }
            this.f21366e = 3;
            return tVar;
        } catch (EOFException e10) {
            throw new IOException(p123m2.c.s("unexpected end of stream on ", this.f21363b.e().f19285a.f19104h.f()), e10);
        }
    }

    public final c h(n nVar, long j) {
        if (this.f21366e == 4) {
            this.f21366e = 5;
            return new c(this, nVar, j);
        }
        throw new IllegalStateException(("state: " + this.f21366e).toString());
    }

    public final void i(l lVar, String str) {
        p251z9.j.e(lVar, "headers");
        p251z9.j.e(str, "requestLine");
        if (this.f21366e != 0) {
            throw new IllegalStateException(("state: " + this.f21366e).toString());
        }
        i iVar = this.f21365d;
        iVar.T(str).T("\r\n");
        int size = lVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            iVar.T(lVar.c(i10)).T(": ").T(lVar.e(i10)).T("\r\n");
        }
        iVar.T("\r\n");
        this.f21366e = 1;
    }
}
