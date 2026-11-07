package p093j0;

import A.R0;
import C6.b;
import p074h0.i;
import p074h0.j;
import p120l9.m;
import p241y9.a;
import p241y9.c;
import u.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f18675a = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j10 = jArr[i11];
            if (j > j10) {
                i10 = i11 + 1;
            } else {
                if (j >= j10) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static i c() {
        return (i) n.f18660a.n();
    }

    public static i d(i iVar) {
        if (iVar instanceof A) {
            A a9 = (A) iVar;
            if (a9.f18618t == j.b()) {
                a9.f18616r = null;
                return iVar;
            }
        }
        if (iVar instanceof B) {
            B b5 = (B) iVar;
            if (b5.f18621h == j.b()) {
                b5.g = null;
                return iVar;
            }
        }
        i iVarH = n.h(iVar, null, false);
        iVarH.j();
        return iVarH;
    }

    public static Object e(c cVar, a aVar) {
        i a9;
        if (cVar == null) {
            return aVar.invoke();
        }
        i iVar = (i) n.f18660a.n();
        if (iVar instanceof A) {
            A a10 = (A) iVar;
            if (a10.f18618t == j.b()) {
                c cVar2 = a10.f18616r;
                c cVar3 = a10.f18617s;
                try {
                    ((A) iVar).f18616r = n.l(cVar, cVar2, true);
                    ((A) iVar).f18617s = cVar3;
                    return aVar.invoke();
                } finally {
                    a10.f18616r = cVar2;
                    a10.f18617s = cVar3;
                }
            }
        }
        if (iVar == null || (iVar instanceof e)) {
            a9 = new A(iVar instanceof e ? (e) iVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.invoke();
            }
            a9 = iVar.u(cVar);
        }
        try {
            i iVarJ = a9.j();
            try {
                Object objInvoke = aVar.invoke();
                i.q(iVarJ);
                a9.c();
                return objInvoke;
            } catch (Throwable th) {
                i.q(iVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            a9.c();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public static b f(R0 r10) {
        i iVar = n.f18660a;
        n.f(C1213a.f18623t);
        synchronized (n.f18661b) {
            n.g = m.r0(n.g, r10);
        }
        return new b(17, r10);
    }

    public static void g(i iVar, i iVar2, c cVar) {
        if (iVar != iVar2) {
            iVar2.getClass();
            i.q(iVar);
            iVar2.c();
        } else if (iVar instanceof A) {
            ((A) iVar).f18616r = cVar;
        } else if (iVar instanceof B) {
            ((B) iVar).g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + iVar).toString());
        }
    }

    public static void h() {
        boolean z10;
        synchronized (n.f18661b) {
            F f3 = n.f18667i.f18633h;
            z10 = false;
            if (f3 != null && f3.h()) {
                z10 = true;
            }
        }
        if (z10) {
            n.a();
        }
    }

    public static final void i() {
        throw new UnsupportedOperationException();
    }
}
