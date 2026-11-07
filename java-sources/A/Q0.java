package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S0 f124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f126u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(S0 s10, float f3, float f7, p150o9.c cVar) {
        super(2, cVar);
        this.f124s = s10;
        this.f125t = f3;
        this.f126u = f7;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new Q0(this.f124s, this.f125t, this.f126u, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Q0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f123r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            b1 b1Var = this.f124s.U;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f125t)) << 32) | (((long) Float.floatToRawIntBits(this.f126u)) & 4294967295L);
            this.f123r = 1;
            Object objA = androidx.compose.foundation.gestures.a.a(b1Var, jFloatToRawIntBits, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objA == aVar) {
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
