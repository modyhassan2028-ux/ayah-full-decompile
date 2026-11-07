package T8;

import K9.AbstractC0405x;
import Q8.k0;
import T1.InterfaceC0491h;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0491h f7969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f7970c;

    public n(p150o9.h hVar, k0 k0Var, InterfaceC0491h interfaceC0491h) {
        p251z9.j.e(hVar, "backgroundDispatcher");
        p251z9.j.e(k0Var, "timeProvider");
        p251z9.j.e(interfaceC0491h, "sessionConfigsDataStore");
        this.f7968a = k0Var;
        this.f7969b = interfaceC0491h;
        this.f7970c = new AtomicReference();
        AbstractC0405x.x(AbstractC0405x.b(hVar), null, new l(this, null, 0), 3);
    }

    public final g a() throws Throwable {
        AtomicReference atomicReference = this.f7970c;
        if (atomicReference.get() == null) {
            Object objC = AbstractC0405x.C(p150o9.i.f20380r, new l(this, null, 1));
            while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        p251z9.j.d(obj, "get(...)");
        return (g) obj;
    }

    public final boolean b() {
        Long l10 = a().f7951e;
        Integer num = a().f7950d;
        return l10 == null || num == null || this.f7968a.a().f7031c - l10.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(g gVar, q9.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f7967t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f7967t = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f7965r;
        int i11 = mVar.f7967t;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                InterfaceC0491h interfaceC0491h = this.f7969b;
                D3.b bVar = new D3.b(gVar, null, 3);
                mVar.f7967t = 1;
                Object objA = interfaceC0491h.a(bVar, mVar);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
            }
        } catch (IOException e10) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e10);
        }
        return y.f19095a;
    }
}
