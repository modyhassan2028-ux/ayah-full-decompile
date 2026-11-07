package X1;

import A.C0029l;
import K9.AbstractC0405x;
import N9.InterfaceC0416i;
import java.util.concurrent.atomic.AtomicBoolean;
import p110k9.y;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f9847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f9848u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p241y9.e eVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f9845r = i10;
        switch (i10) {
            case 1:
                this.f9848u = (i) eVar;
                super(2, cVar);
                break;
            case 2:
                this.f9848u = (i) eVar;
                super(2, cVar);
                break;
            default:
                this.f9848u = (i) eVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q9.i, y9.e] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f9845r) {
            case 0:
                c cVar2 = new c(this.f9848u, cVar, 0);
                cVar2.f9847t = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(this.f9848u, cVar, 1);
                cVar3.f9847t = obj;
                return cVar3;
            default:
                c cVar4 = new c(this.f9848u, cVar, 2);
                cVar4.f9847t = obj;
                return cVar4;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9845r) {
            case 0:
                return ((c) create((b) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                return ((c) create((b) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            default:
                return ((c) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r5v12, types: [q9.i, y9.e] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9845r) {
            case 0:
                int i10 = this.f9846s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    b bVar = (b) this.f9847t;
                    this.f9846s = 1;
                    obj = this.f9848u.invoke(bVar, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                b bVar2 = (b) obj;
                j.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.f9844b.f24847s).set(true);
                return bVar2;
            case 1:
                int i11 = this.f9846s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.f9847t;
                    p110k9.a.e(obj);
                    return bVar3;
                }
                p110k9.a.e(obj);
                b bVarG = ((b) this.f9847t).g();
                this.f9847t = bVarG;
                this.f9846s = 1;
                Object objInvoke = this.f9848u.invoke(bVarG, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                return objInvoke == aVar2 ? aVar2 : bVarG;
            default:
                int i12 = this.f9846s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    C0029l c0029l = new C0029l((InterfaceC0416i) this.f9847t, (p241y9.e) this.f9848u, (p150o9.c) null);
                    this.f9846s = 1;
                    Object objJ = AbstractC0405x.j(c0029l, this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objJ == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
        }
    }
}
