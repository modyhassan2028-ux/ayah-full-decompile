package Q0;

import K9.InterfaceC0402u;
import W.C0561g1;
import X.s;
import android.support.v4.media.session.p;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ float f6831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6832u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, p150o9.c cVar) {
        super(2, cVar);
        this.f6829r = 0;
        this.f6832u = dVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6829r) {
            case 0:
                c cVar2 = new c((d) this.f6832u, cVar);
                cVar2.f6831t = ((Number) obj).floatValue();
                return cVar2;
            case 1:
                return new c((C0561g1) this.f6832u, this.f6831t, cVar, 1);
            default:
                return new c((s) this.f6832u, this.f6831t, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6829r) {
            case 0:
                return ((c) create(Float.valueOf(((Number) obj).floatValue()), (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                return ((c) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            default:
                return ((c) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6829r) {
            case 0:
                d dVar = (d) this.f6832u;
                int i10 = this.f6830s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    float f3 = this.f6831t;
                    Object objG = dVar.f6833a.f7119d.f7108r.g(R0.i.f7088e);
                    if (objG == null) {
                        objG = null;
                    }
                    p241y9.e eVar = (p241y9.e) objG;
                    if (eVar == null) {
                        throw p.s("Required value was null.");
                    }
                    p171r0.c cVar = new p171r0.c((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.f6830s = 1;
                    obj = eVar.invoke(cVar, this);
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
                return new Float(Float.intBitsToFloat((int) (((p171r0.c) obj).f21387a & 4294967295L)));
            case 1:
                int i11 = this.f6830s;
                y yVar = y.f19095a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C0561g1 c0561g1 = (C0561g1) this.f6832u;
                float f7 = this.f6831t;
                this.f6830s = 1;
                Object objI = c0561g1.f9137b.i(f7, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objI != aVar2) {
                    objI = yVar;
                }
                return objI == aVar2 ? aVar2 : yVar;
            default:
                int i12 = this.f6830s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    s sVar = (s) this.f6832u;
                    float f10 = this.f6831t;
                    this.f6830s = 1;
                    Object objI2 = sVar.i(f10, this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objI2 == aVar3) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, float f3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6829r = i10;
        this.f6832u = obj;
        this.f6831t = f3;
    }
}
