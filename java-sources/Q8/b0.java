package Q8;

import K9.InterfaceC0402u;
import T1.InterfaceC0491h;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f6951t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(f0 f0Var, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6949r = i10;
        this.f6951t = f0Var;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6949r) {
            case 0:
                return new b0(this.f6951t, cVar, 0);
            default:
                return new b0(this.f6951t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6949r) {
            case 0:
                break;
        }
        return ((b0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f6949r) {
            case 0:
                int i10 = this.f6950s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    f0 f0Var = this.f6951t;
                    C4.g gVar = new C4.g(f0Var.f6988e.b(), new N9.D(f0Var, (p150o9.c) null, 1), 5);
                    E5.e eVar = new E5.e(5, f0Var);
                    this.f6950s = 1;
                    Object objD = gVar.d(eVar, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i11 = this.f6950s;
                p150o9.c cVar = null;
                f0 f0Var2 = this.f6951t;
                try {
                    if (i11 == 0) {
                        p110k9.a.e(obj);
                        InterfaceC0491h interfaceC0491h = f0Var2.f6988e;
                        d0 d0Var = new d0(f0Var2, cVar, 0);
                        this.f6950s = 1;
                        Object objA = interfaceC0491h.a(d0Var, this);
                        p161p9.a aVar2 = p161p9.a.f21156r;
                        if (objA == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    break;
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    K k7 = f0Var2.f6990h;
                    if (k7 == null) {
                        p251z9.j.k("localSessionData");
                        throw null;
                    }
                    f0Var2.f6990h = K.a(k7, null, f0Var2.f6987d.a(), null, 5);
                }
                return p110k9.y.f19095a;
        }
    }
}
