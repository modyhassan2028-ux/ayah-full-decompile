package p207v2;

import F2.t;
import F4.f;
import N9.InterfaceC0415h;
import O9.y;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.J1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p017b7.d;
import p085i0.n;
import p110k9.a;
import p120l9.m;
import p150o9.c;
import p251z9.j;

/* JADX INFO: renamed from: v2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1381t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f23292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f23293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f23294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f23295d = new n(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f23296e = new n(15);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0415h f23297f = AbstractC1367e.b(new y(this, (c) null, 27));

    public C1381t(L l10, Integer num, d dVar) {
        this.f23292a = l10;
        this.f23293b = num;
        this.f23294c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C1381t c1381t, f fVar, q9.c cVar) throws Exception {
        C1380s c1380s;
        if (cVar instanceof C1380s) {
            c1380s = (C1380s) cVar;
            int i10 = c1380s.f23291v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1380s.f23291v = i10 - Integer.MIN_VALUE;
            } else {
                c1380s = new C1380s(c1381t, cVar);
            }
        } else {
            c1380s = new C1380s(c1381t, cVar);
        }
        Object objE = c1380s.f23289t;
        int i11 = c1380s.f23291v;
        boolean z10 = true;
        if (i11 == 0) {
            a.e(objE);
            L l10 = c1381t.f23292a;
            c1380s.f23287r = c1381t;
            c1380s.f23288s = fVar;
            c1380s.f23291v = 1;
            objE = l10.e(c1380s);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = c1380s.f23288s;
            c1381t = c1380s.f23287r;
            a.e(objE);
        }
        C1381t c1381t2 = c1381t;
        f fVar2 = (f) objE;
        if (fVar2 == fVar) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        t tVar = new t(0, c1381t2, C1381t.class, "invalidate", "invalidate()V", 0, 0, 23);
        fVar2.getClass();
        J1 j10 = fVar2.f2393a;
        j10.getClass();
        if (j10.f14055b) {
            tVar.invoke();
        } else {
            ReentrantLock reentrantLock = (ReentrantLock) j10.f14056c;
            try {
                reentrantLock.lock();
                if (!j10.f14055b) {
                    ((ArrayList) j10.f14057d).add(tVar);
                    z10 = false;
                }
                if (z10) {
                    tVar.invoke();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (fVar != null) {
            t tVar2 = new t(0, c1381t2, C1381t.class, "invalidate", "invalidate()V", 0, 0, 24);
            J1 j11 = fVar.f2393a;
            ReentrantLock reentrantLock2 = (ReentrantLock) j11.f14056c;
            try {
                reentrantLock2.lock();
                ((ArrayList) j11.f14057d).remove(tVar2);
                reentrantLock2.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        }
        if (fVar != null) {
            J1 j12 = fVar.f2393a;
            ArrayList arrayList = (ArrayList) j12.f14057d;
            boolean z11 = false;
            if (!j12.f14055b) {
                ReentrantLock reentrantLock3 = (ReentrantLock) j12.f14056c;
                try {
                    reentrantLock3.lock();
                    if (j12.f14055b) {
                        reentrantLock3.unlock();
                    } else {
                        z11 = true;
                        j12.f14055b = true;
                        List<p241y9.a> listC0 = m.C0(arrayList);
                        arrayList.clear();
                        reentrantLock3.unlock();
                        for (p241y9.a aVar2 : listC0) {
                            j.e(aVar2, "it");
                            aVar2.invoke();
                        }
                    }
                } catch (Throwable th2) {
                    reentrantLock3.unlock();
                    throw th2;
                }
            }
            if (z11 && Build.ID != null && Log.isLoggable("Paging", 3)) {
                String str = "Invalidated PagingSource " + fVar;
                j.e(str, "message");
                Log.d("Paging", str, null);
            }
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            String str2 = "Generated new PagingSource " + fVar2;
            j.e(str2, "message");
            Log.d("Paging", str2, null);
        }
        return fVar2;
    }
}
