package p009aa;

import Da.r;
import E2.C0124h;
import Z9.i;
import p110k9.a;
import p110k9.b;
import p110k9.y;
import p150o9.c;
import p241y9.f;
import q9.h;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h implements f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ b f11246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f11247u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, c cVar) {
        super(3, cVar);
        this.f11247u = rVar;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.f11247u, (c) obj3);
        kVar.f11246t = (b) obj;
        return kVar.invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        r rVar = this.f11247u;
        C0124h c0124h = (C0124h) rVar.f1388t;
        int i10 = this.f11245s;
        if (i10 == 0) {
            a.e(obj);
            b bVar = this.f11246t;
            byte bD = c0124h.D();
            if (bD == 1) {
                return rVar.m(true);
            }
            if (bD == 0) {
                return rVar.m(false);
            }
            if (bD != 6) {
                if (bD == 8) {
                    return rVar.l();
                }
                C0124h.p(c0124h, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f11245s = 1;
            obj = r.a(rVar, bVar, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(obj);
        }
        return (i) obj;
    }
}
