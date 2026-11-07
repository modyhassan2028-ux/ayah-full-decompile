package N9;

import K9.C0389g;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends O9.b implements S, InterfaceC0415h, O9.p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6211w = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6212v;

    public k0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // N9.V
    public final List a() {
        return AbstractC0813f2.K(getValue());
    }

    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        m(obj);
        return p110k9.y.f19095a;
    }

    @Override // O9.p
    public final InterfaceC0415h c(p150o9.h hVar, int i10, M9.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != M9.a.f5831s) ? AbstractC0419l.t(this, hVar, i10, aVar) : this;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00e0->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // N9.InterfaceC0415h
    public final java.lang.Object d(N9.InterfaceC0416i r18, p150o9.c r19) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.k0.d(N9.i, o9.c):java.lang.Object");
    }

    @Override // N9.Q
    public final void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // N9.Q
    public final boolean g(Object obj) {
        m(obj);
        return true;
    }

    @Override // N9.i0
    public final Object getValue() {
        P9.t tVar = O9.c.f6518b;
        Object obj = f6211w.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    @Override // O9.b
    public final O9.d h() {
        return new l0();
    }

    @Override // O9.b
    public final O9.d[] i() {
        return new l0[2];
    }

    public final boolean l(Object obj, Object obj2) {
        P9.t tVar = O9.c.f6518b;
        if (obj == null) {
            obj = tVar;
        }
        if (obj2 == null) {
            obj2 = tVar;
        }
        return n(obj, obj2);
    }

    public final void m(Object obj) {
        if (obj == null) {
            obj = O9.c.f6518b;
        }
        n(null, obj);
    }

    public final boolean n(Object obj, Object obj2) {
        int i10;
        O9.d[] dVarArr;
        P9.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6211w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p251z9.j.a(obj3, obj)) {
                return false;
            }
            if (p251z9.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f6212v;
            if ((i11 & 1) != 0) {
                this.f6212v = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f6212v = i12;
            O9.d[] dVarArr2 = this.f6513r;
            while (true) {
                l0[] l0VarArr = (l0[]) dVarArr2;
                if (l0VarArr != null) {
                    for (l0 l0Var : l0VarArr) {
                        if (l0Var != null) {
                            AtomicReference atomicReference = l0Var.f6217a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (tVar = AbstractC0419l.f6216d)) {
                                    break;
                                }
                                P9.t tVar2 = AbstractC0419l.f6215c;
                                if (obj4 != tVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, tVar2)) {
                                            ((C0389g) obj4).resumeWith(p110k9.y.f19095a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, tVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f6212v;
                    if (i10 == i12) {
                        this.f6212v = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f6513r;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }
}
