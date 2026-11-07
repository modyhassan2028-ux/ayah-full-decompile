package i7;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: i7.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1011q implements oa.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17508a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f17513f;
    public final Iterable g;

    public C1011q(C1023u0 c1023u0, String str, String str2, String str3, long j, long j10, Bundle bundle) {
        C1019t c1019t;
        U6.y.c(str2);
        U6.y.c(str3);
        this.f17511d = str2;
        this.f17512e = str3;
        this.f17513f = true == TextUtils.isEmpty(str) ? null : str;
        this.f17509b = j;
        this.f17510c = j10;
        if (j10 != 0 && j10 > j) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(X.w(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c1019t = new C1019t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.a("Param name can't be null");
                    it.remove();
                } else {
                    V1 v10 = c1023u0.f17587z;
                    C1023u0.k(v10);
                    Object objV = v10.v(bundle2.get(next), next);
                    if (objV == null) {
                        X x11 = c1023u0.f17584w;
                        C1023u0.m(x11);
                        x11.f17185z.b(c1023u0.f17563A.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        V1 v11 = c1023u0.f17587z;
                        C1023u0.k(v11);
                        v11.D(bundle2, next, objV);
                    }
                }
            }
            c1019t = new C1019t(bundle2);
        }
        this.g = c1019t;
    }

    @Override // oa.g
    public oa.n a() throws IOException {
        oa.r rVarD;
        long j;
        oa.r rVar;
        oa.t tVar = (oa.t) this.f17511d;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f17513f;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !tVar.f(null)) {
                    b();
                    p251z9.j.b(iOException);
                    throw iOException;
                }
                if (tVar.h()) {
                    throw new IOException("Canceled");
                }
                X4.c cVar = ((na.d) this.f17512e).f20047a;
                long jNanoTime = System.nanoTime();
                long j10 = this.f17510c - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j10 <= 0) {
                    rVarD = d();
                    j = this.f17509b;
                    this.f17510c = jNanoTime + j;
                } else {
                    j = j10;
                    rVarD = null;
                }
                if (rVarD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (rVar = (oa.r) ((LinkedBlockingDeque) this.g).poll(j, timeUnit)) == null) {
                        rVarD = null;
                    } else {
                        copyOnWriteArrayList.remove(rVar.f20473a);
                        rVarD = rVar;
                    }
                    if (rVarD == null) {
                    }
                }
                oa.s sVar = rVarD.f20473a;
                boolean z10 = false;
                if (rVarD.f20474b == null && rVarD.f20475c == null) {
                    b();
                    if (!sVar.d()) {
                        rVarD = sVar.b();
                    }
                    if (rVarD.f20474b == null && rVarD.f20475c == null) {
                        z10 = true;
                    }
                    if (z10) {
                        oa.n nVarC = rVarD.f20473a.c();
                        b();
                        return nVarC;
                    }
                }
                Throwable th = rVarD.f20475c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        p110k9.a.a(iOException, th);
                    }
                }
                oa.s sVar2 = rVarD.f20474b;
                if (sVar2 != null) {
                    tVar.d().addFirst(sVar2);
                }
            } catch (Throwable th2) {
                b();
                throw th2;
            }
        }
    }

    public void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f17513f;
        Iterator it = copyOnWriteArrayList.iterator();
        p251z9.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            oa.s sVar = (oa.s) it.next();
            sVar.cancel();
            oa.s sVarA = sVar.a();
            if (sVarA != null) {
                ((oa.t) this.f17511d).d().addLast(sVarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // oa.g
    public oa.t c() {
        return (oa.t) this.f17511d;
    }

    public oa.r d() {
        oa.s hVar;
        oa.t tVar = (oa.t) this.f17511d;
        if (tVar.f(null)) {
            try {
                hVar = tVar.e();
            } catch (Throwable th) {
                hVar = new oa.h(th);
            }
            if (hVar.d()) {
                return new oa.r(hVar, (Throwable) null, 6);
            }
            if (hVar instanceof oa.h) {
                return ((oa.h) hVar).f20415a;
            }
            ((CopyOnWriteArrayList) this.f17513f).add(hVar);
            ((na.d) this.f17512e).d().d(new oa.i(la.e.f19452b + " connect " + tVar.g().f19104h.f(), hVar, this), 0L);
        }
        return null;
    }

    public C1011q e(C1023u0 c1023u0, long j) {
        return new C1011q(c1023u0, (String) this.f17513f, (String) this.f17511d, (String) this.f17512e, this.f17509b, j, (C1019t) this.g);
    }

    public String toString() {
        switch (this.f17508a) {
            case 0:
                String string = ((C1019t) this.g).toString();
                String str = (String) this.f17511d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f17512e;
                StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                p245z2.a.I(sb, "Event{appId='", str, "', name='", str2);
                sb.append("', params=");
                sb.append(string);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1011q(C1023u0 c1023u0, String str, String str2, String str3, long j, long j10, C1019t c1019t) {
        U6.y.c(str2);
        U6.y.c(str3);
        U6.y.f(c1019t);
        this.f17511d = str2;
        this.f17512e = str3;
        this.f17513f = true == TextUtils.isEmpty(str) ? null : str;
        this.f17509b = j;
        this.f17510c = j10;
        if (j10 != 0 && j10 > j) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17185z.c(X.w(str2), X.w(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = c1019t;
    }

    public C1011q(oa.t tVar, na.d dVar) {
        p251z9.j.e(dVar, "taskRunner");
        this.f17511d = tVar;
        this.f17512e = dVar;
        this.f17509b = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f17510c = Long.MIN_VALUE;
        this.f17513f = new CopyOnWriteArrayList();
        this.g = new LinkedBlockingDeque();
    }
}
