package X;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: renamed from: X.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0637i extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC0402u f9740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ float f9741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f9742t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0637i(s sVar, p150o9.c cVar) {
        super(3, cVar);
        this.f9742t = sVar;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0637i c0637i = new C0637i(this.f9742t, (p150o9.c) obj3);
        c0637i.f9740r = (InterfaceC0402u) obj;
        c0637i.f9741s = fFloatValue;
        p110k9.y yVar = p110k9.y.f19095a;
        c0637i.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.a.e(obj);
        AbstractC0405x.x(this.f9740r, null, new Q0.c(this.f9742t, this.f9741s, null, 2), 3);
        return p110k9.y.f19095a;
    }
}
