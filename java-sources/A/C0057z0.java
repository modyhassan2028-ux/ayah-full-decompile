package A;

import p223x.AbstractC1413d;
import p223x.InterfaceC1421j;

/* JADX INFO: renamed from: A.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057z0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1421j f456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p251z9.s f457v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0057z0(float f3, InterfaceC1421j interfaceC1421j, p251z9.s sVar, p150o9.c cVar) {
        super(2, cVar);
        this.f455t = f3;
        this.f456u = interfaceC1421j;
        this.f457v = sVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        C0057z0 c0057z0 = new C0057z0(this.f455t, this.f456u, this.f457v, cVar);
        c0057z0.f454s = obj;
        return c0057z0;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0057z0) create((C0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f453r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            int i11 = 1;
            K k7 = new K(i11, this.f457v, (C0) this.f454s);
            this.f453r = 1;
            Object objE = AbstractC1413d.e(0.0f, this.f455t, this.f456u, k7, this, 4);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
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
