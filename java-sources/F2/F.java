package F2;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class F extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f2208u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(K k7, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f2205r = i10;
        this.f2208u = k7;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2205r) {
            case 0:
                F f3 = new F(this.f2208u, cVar, 0);
                f3.f2207t = obj;
                return f3;
            case 1:
                F f7 = new F(this.f2208u, cVar, 1);
                f7.f2207t = obj;
                return f7;
            default:
                F f10 = new F(this.f2208u, cVar, 2);
                f10.f2207t = obj;
                return f10;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2205r) {
            case 0:
                return ((F) create((H2.o) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((F) create((A) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((F) create((A) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        A a9;
        Object objA;
        Object objB;
        A a10;
        Object objA2;
        EnumC0165j[] enumC0165jArr;
        EnumC0165j enumC0165j;
        switch (this.f2205r) {
            case 0:
                int i10 = this.f2206s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                H2.o oVar = (H2.o) this.f2207t;
                this.f2206s = 1;
                Object objA3 = K.a(this.f2208u, oVar, this);
                p161p9.a aVar = p161p9.a.f21156r;
                return objA3 == aVar ? aVar : objA3;
            case 1:
                int i11 = this.f2206s;
                p161p9.a aVar2 = p161p9.a.f21156r;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            a9 = (A) this.f2207t;
                            p110k9.a.e(obj);
                            objA = obj;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p110k9.a.e(obj);
                            objB = obj;
                        }
                        return (Set) objB;
                    }
                    p110k9.a.e(obj);
                    a9 = (A) this.f2207t;
                    this.f2207t = a9;
                    this.f2206s = 1;
                    objA = a9.a(this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                    if (!((Boolean) objA).booleanValue()) {
                        z zVar = z.f2342s;
                        F f3 = new F(this.f2208u, null, 0);
                        this.f2207t = null;
                        this.f2206s = 2;
                        objB = a9.b(zVar, f3, this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                        return (Set) objB;
                    }
                } catch (SQLException unused) {
                }
                return p120l9.t.f19442r;
            default:
                int i12 = this.f2206s;
                p110k9.y yVar = p110k9.y.f19095a;
                boolean z10 = true;
                p161p9.a aVar3 = p161p9.a.f21156r;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    a10 = (A) this.f2207t;
                    this.f2207t = a10;
                    this.f2206s = 1;
                    objA2 = a10.a(this);
                    if (objA2 != aVar3) {
                    }
                    return aVar3;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                a10 = (A) this.f2207t;
                p110k9.a.e(obj);
                objA2 = obj;
                if (((Boolean) objA2).booleanValue()) {
                    return yVar;
                }
                K k7 = this.f2208u;
                Ca.r rVar = k7.f2248h;
                long[] jArr = (long[]) rVar.f850d;
                ReentrantLock reentrantLock = (ReentrantLock) rVar.f849c;
                reentrantLock.lock();
                try {
                    if (rVar.f848b) {
                        boolean z11 = false;
                        rVar.f848b = false;
                        int length = jArr.length;
                        enumC0165jArr = new EnumC0165j[length];
                        int i13 = 0;
                        boolean z12 = false;
                        while (i13 < length) {
                            if (jArr[i13] <= 0) {
                                z10 = z11;
                            }
                            boolean[] zArr = (boolean[]) rVar.f851e;
                            if (z10 != zArr[i13]) {
                                zArr[i13] = z10;
                                enumC0165j = z10 ? EnumC0165j.f2286s : EnumC0165j.f2287t;
                                z12 = true;
                            } else {
                                enumC0165j = EnumC0165j.f2285r;
                            }
                            enumC0165jArr[i13] = enumC0165j;
                            i13++;
                            z10 = true;
                            z11 = false;
                        }
                        if (!z12) {
                            enumC0165jArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        enumC0165jArr = null;
                    }
                    if (enumC0165jArr == null) {
                        return yVar;
                    }
                    J j = new J(enumC0165jArr, k7, a10, null);
                    this.f2207t = null;
                    this.f2206s = 2;
                    if (a10.b(z.f2342s, j, this) != aVar3) {
                        return yVar;
                    }
                    return aVar3;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
