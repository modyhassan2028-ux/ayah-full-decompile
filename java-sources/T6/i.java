package T6;

import E2.RunnableC0147v;
import U6.y;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import u.C1350e;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public final class i implements S6.d, S6.e {
    public final S6.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f7832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L5.c f7833i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7836m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f7839p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f7831f = new LinkedList();
    public final HashSet j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f7834k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f7837n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public R6.b f7838o = null;

    public i(d dVar, S6.c cVar) {
        this.f7839p = dVar;
        Looper looper = dVar.f7828m.getLooper();
        Context context = cVar.f7506a;
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(20, false);
        Set set = Collections.EMPTY_SET;
        if (((C1351f) rVar.f11364s) == null) {
            rVar.f11364s = new C1351f(0);
        }
        ((C1351f) rVar.f11364s).addAll(set);
        rVar.f11366u = context.getClass().getName();
        rVar.f11365t = context.getPackageName();
        android.support.v4.media.session.r rVar2 = new android.support.v4.media.session.r((C1351f) rVar.f11364s, (String) rVar.f11365t, (String) rVar.f11366u);
        W6.b bVar = (W6.b) cVar.f7508c.f5532s;
        y.f(bVar);
        U6.m mVar = cVar.f7509d;
        Context context2 = cVar.f7506a;
        bVar.getClass();
        W6.d dVar2 = new W6.d(context2, looper, rVar2, mVar, this, this);
        String str = cVar.f7507b;
        if (str != null) {
            dVar2.f8242s = str;
        }
        this.g = dVar2;
        this.f7832h = cVar.f7510e;
        this.f7833i = new L5.c(6);
        this.f7835l = cVar.f7511f;
    }

    @Override // S6.d
    public final void a(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        H h7 = this.f7839p.f7828m;
        if (looperMyLooper == h7.getLooper()) {
            i(i10);
        } else {
            h7.post(new F1.a(i10, 2, this));
        }
    }

    public final void b(R6.b bVar) {
        HashSet hashSet = this.j;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (y.i(bVar, R6.b.f7232v)) {
                this.g.i();
            }
            throw null;
        }
    }

    @Override // S6.d
    public final void c() {
        Looper looperMyLooper = Looper.myLooper();
        H h7 = this.f7839p.f7828m;
        if (looperMyLooper == h7.getLooper()) {
            h();
        } else {
            h7.post(new RunnableC0147v(7, this));
        }
    }

    public final void d(Status status) {
        y.b(this.f7839p.f7828m);
        e(status, null, false);
    }

    public final void e(Status status, Exception exc, boolean z10) {
        y.b(this.f7839p.f7828m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f7831f.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!z10 || mVar.f7848a == 2) {
                if (status != null) {
                    mVar.c(status);
                } else {
                    mVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        LinkedList linkedList = this.f7831f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList.get(i10);
            if (!this.g.a()) {
                return;
            }
            if (k(mVar)) {
                linkedList.remove(mVar);
            }
        }
    }

    @Override // S6.e
    public final void g(R6.b bVar) {
        o(bVar, null);
    }

    public final void h() {
        d dVar = this.f7839p;
        y.b(dVar.f7828m);
        this.f7838o = null;
        b(R6.b.f7232v);
        H h7 = dVar.f7828m;
        if (this.f7836m) {
            a aVar = this.f7832h;
            h7.removeMessages(11, aVar);
            h7.removeMessages(9, aVar);
            this.f7836m = false;
        }
        Iterator it = this.f7834k.values().iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
        f();
        j();
    }

    public final void i(int i10) {
        d dVar = this.f7839p;
        H h7 = dVar.f7828m;
        y.b(dVar.f7828m);
        this.f7838o = null;
        this.f7836m = true;
        String strK = this.g.k();
        L5.c cVar = this.f7833i;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        cVar.P(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f7832h;
        h7.sendMessageDelayed(Message.obtain(h7, 9, aVar), 5000L);
        h7.sendMessageDelayed(Message.obtain(h7, 11, aVar), 120000L);
        ((SparseIntArray) dVar.g.f5532s).clear();
        Iterator it = this.f7834k.values().iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
    }

    public final void j() {
        d dVar = this.f7839p;
        H h7 = dVar.f7828m;
        a aVar = this.f7832h;
        h7.removeMessages(12, aVar);
        h7.sendMessageDelayed(h7.obtainMessage(12, aVar), dVar.f7818a);
    }

    public final boolean k(m mVar) {
        R6.d dVar;
        if (mVar == null) {
            L5.c cVar = this.f7833i;
            S6.a aVar = this.g;
            mVar.f(cVar, aVar.m());
            try {
                mVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                aVar.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        R6.d[] dVarArrB = mVar.b(this);
        if (dVarArrB == null || dVarArrB.length == 0) {
            dVar = null;
            break;
        }
        R6.d[] dVarArrH = this.g.h();
        if (dVarArrH == null) {
            dVarArrH = new R6.d[0];
        }
        C1350e c1350e = new C1350e(dVarArrH.length);
        for (R6.d dVar2 : dVarArrH) {
            c1350e.put(dVar2.f7240r, Long.valueOf(dVar2.b()));
        }
        int length = dVarArrB.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrB[i10];
            Long l10 = (Long) c1350e.get(dVar.f7240r);
            if (l10 == null || l10.longValue() < dVar.b()) {
                break;
            }
            i10++;
        }
        if (dVar == null) {
            L5.c cVar2 = this.f7833i;
            S6.a aVar2 = this.g;
            mVar.f(cVar2, aVar2.m());
            try {
                mVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                aVar2.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.g.getClass().getName() + " could not execute call because it requires feature (" + dVar.f7240r + ", " + dVar.b() + ").");
        if (!this.f7839p.f7829n || !mVar.a(this)) {
            mVar.d(new S6.h(dVar));
            return true;
        }
        j jVar = new j(this.f7832h, dVar);
        int iIndexOf = this.f7837n.indexOf(jVar);
        if (iIndexOf >= 0) {
            j jVar2 = (j) this.f7837n.get(iIndexOf);
            this.f7839p.f7828m.removeMessages(15, jVar2);
            H h7 = this.f7839p.f7828m;
            h7.sendMessageDelayed(Message.obtain(h7, 15, jVar2), 5000L);
        } else {
            this.f7837n.add(jVar);
            H h10 = this.f7839p.f7828m;
            h10.sendMessageDelayed(Message.obtain(h10, 15, jVar), 5000L);
            H h11 = this.f7839p.f7828m;
            h11.sendMessageDelayed(Message.obtain(h11, 16, jVar), 120000L);
            R6.b bVar = new R6.b(2, null);
            if (!l(bVar)) {
                this.f7839p.a(bVar, this.f7835l);
            }
        }
        return false;
    }

    public final boolean l(R6.b bVar) {
        synchronized (d.f7816q) {
        }
        return false;
    }

    public final void m() {
        d dVar = this.f7839p;
        y.b(dVar.f7828m);
        S6.a aVar = this.g;
        if (aVar.a() || aVar.g()) {
            return;
        }
        try {
            L5.c cVar = dVar.g;
            Context context = dVar.f7822e;
            SparseIntArray sparseIntArray = (SparseIntArray) cVar.f5532s;
            y.f(context);
            int iF = aVar.f();
            int iB = ((SparseIntArray) cVar.f5532s).get(iF, -1);
            if (iB == -1) {
                iB = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i10);
                    if (iKeyAt > iF && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (iB == -1) {
                    iB = ((R6.e) cVar.f5533t).b(context, iF);
                }
                sparseIntArray.put(iF, iB);
            }
            if (iB == 0) {
                k kVar = new k(dVar, aVar, this.f7832h);
                if (aVar.m()) {
                    y.f(null);
                    throw null;
                }
                try {
                    aVar.d(kVar);
                    return;
                } catch (SecurityException e10) {
                    o(new R6.b(10), e10);
                    return;
                }
            }
            R6.b bVar = new R6.b(iB, null);
            Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + bVar.toString());
            o(bVar, null);
        } catch (IllegalStateException e11) {
            o(new R6.b(10), e11);
        }
    }

    public final void n(m mVar) {
        y.b(this.f7839p.f7828m);
        boolean zA = this.g.a();
        LinkedList linkedList = this.f7831f;
        if (zA) {
            if (k(mVar)) {
                j();
                return;
            } else {
                linkedList.add(mVar);
                return;
            }
        }
        linkedList.add(mVar);
        R6.b bVar = this.f7838o;
        if (bVar == null || bVar.f7234s == 0 || bVar.f7235t == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(R6.b bVar, RuntimeException runtimeException) {
        y.b(this.f7839p.f7828m);
        y.b(this.f7839p.f7828m);
        this.f7838o = null;
        ((SparseIntArray) this.f7839p.g.f5532s).clear();
        b(bVar);
        if ((this.g instanceof W6.d) && bVar.f7234s != 24) {
            d dVar = this.f7839p;
            dVar.f7819b = true;
            H h7 = dVar.f7828m;
            h7.sendMessageDelayed(h7.obtainMessage(19), 300000L);
        }
        if (bVar.f7234s == 4) {
            d(d.f7815p);
            return;
        }
        if (this.f7831f.isEmpty()) {
            this.f7838o = bVar;
            return;
        }
        if (runtimeException != null) {
            y.b(this.f7839p.f7828m);
            e(null, runtimeException, false);
            return;
        }
        if (!this.f7839p.f7829n) {
            d(d.b(this.f7832h, bVar));
            return;
        }
        e(d.b(this.f7832h, bVar), null, true);
        if (this.f7831f.isEmpty() || l(bVar) || this.f7839p.a(bVar, this.f7835l)) {
            return;
        }
        if (bVar.f7234s == 18) {
            this.f7836m = true;
        }
        if (!this.f7836m) {
            d(d.b(this.f7832h, bVar));
            return;
        }
        d dVar2 = this.f7839p;
        a aVar = this.f7832h;
        H h10 = dVar2.f7828m;
        h10.sendMessageDelayed(Message.obtain(h10, 9, aVar), 5000L);
    }

    public final void p() {
        y.b(this.f7839p.f7828m);
        Status status = d.f7814o;
        d(status);
        this.f7833i.P(false, status);
        for (f fVar : (f[]) this.f7834k.keySet().toArray(new f[0])) {
            n(new s(new p118l7.i()));
        }
        b(new R6.b(4));
        S6.a aVar = this.g;
        if (aVar.a()) {
            aVar.b(new O8.c(this));
        }
    }
}
