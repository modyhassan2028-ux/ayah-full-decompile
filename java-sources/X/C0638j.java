package X;

import p223x.AbstractC1413d;
import p223x.InterfaceC1421j;

/* JADX INFO: renamed from: X.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0638j extends q9.i implements p241y9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ q f9744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ F f9745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f9746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f9747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f9748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638j(s sVar, float f3, p150o9.c cVar) {
        super(4, cVar);
        this.f9747v = sVar;
        this.f9748w = f3;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        C0638j c0638j = new C0638j(this.f9747v, this.f9748w, (p150o9.c) obj4);
        c0638j.f9744s = (q) obj;
        c0638j.f9745t = (F) obj2;
        c0638j.f9746u = obj3;
        return c0638j.invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f9743r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            q qVar = this.f9744s;
            float fD = this.f9745t.d(this.f9746u);
            if (!Float.isNaN(fD)) {
                p251z9.s sVar = new p251z9.s();
                s sVar2 = this.f9747v;
                float fG = Float.isNaN(sVar2.f9782i.g()) ? 0.0f : sVar2.f9782i.g();
                sVar.f24883r = fG;
                InterfaceC1421j interfaceC1421j = sVar2.f9777c;
                A.K k7 = new A.K(12, qVar, sVar);
                this.f9744s = null;
                this.f9745t = null;
                this.f9743r = 1;
                Object objC = AbstractC1413d.c(fG, fD, this.f9748w, interfaceC1421j, k7, this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objC == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        return p110k9.y.f19095a;
    }
}
