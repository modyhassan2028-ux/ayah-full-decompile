package A;

import J0.AbstractC0283f;
import p232y.C1452f;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T0 f193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1452f f194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0037p f195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0047u0 f196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0.d f198f;
    public final C0041r0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f200i = 1;
    public C0 j = androidx.compose.foundation.gestures.a.f11797a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z0 f201k = new Z0(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M0 f202l = new M0(1, this);

    public b1(T0 t2, C1452f c1452f, C0037p c0037p, EnumC0047u0 enumC0047u0, boolean z10, C0.d dVar, C0041r0 c0041r0) {
        this.f193a = t2;
        this.f194b = c1452f;
        this.f195c = c0037p;
        this.f196d = enumC0047u0;
        this.f197e = z10;
        this.f198f = dVar;
        this.g = c0041r0;
    }

    public static final long a(b1 b1Var, C0 c10, long j, int i10) {
        C0.g gVar = b1Var.f198f.f667a;
        C0.g gVar2 = null;
        C0.g gVar3 = (gVar == null || !gVar.f19338E) ? null : (C0.g) AbstractC0283f.j(gVar);
        long jM = gVar3 != null ? gVar3.m(j, i10) : 0L;
        long jG = p171r0.c.g(j, jM);
        long jE = b1Var.e(b1Var.h(c10.a(b1Var.g(b1Var.e(p171r0.c.a(jG, 0.0f, b1Var.f196d == EnumC0047u0.f425s ? 1 : 2))))));
        long jG2 = p171r0.c.g(jG, jE);
        C0.g gVar4 = b1Var.f198f.f667a;
        if (gVar4 != null && gVar4.f19338E) {
            gVar2 = (C0.g) AbstractC0283f.j(gVar4);
        }
        C0.g gVar5 = gVar2;
        return p171r0.c.h(p171r0.c.h(jM, jE), gVar5 != null ? gVar5.B(i10, jE, jG2) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, q9.c cVar) {
        W0 w9;
        b1 b1Var;
        p251z9.u uVar;
        if (cVar instanceof W0) {
            w9 = (W0) cVar;
            int i10 = w9.f164v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w9.f164v = i10 - Integer.MIN_VALUE;
            } else {
                w9 = new W0(this, cVar);
            }
        } else {
            w9 = new W0(this, cVar);
        }
        Object obj = w9.f162t;
        int i11 = w9.f164v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            p251z9.u uVar2 = new p251z9.u();
            uVar2.f24885r = j;
            this.f199h = true;
            Y0 y10 = new Y0(this, uVar2, j, null);
            w9.f160r = this;
            w9.f161s = uVar2;
            w9.f164v = 1;
            Object objF = f(p232y.T.f24454r, y10, w9);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objF == aVar) {
                return aVar;
            }
            b1Var = this;
            uVar = uVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = w9.f161s;
            b1Var = w9.f160r;
            p110k9.a.e(obj);
        }
        b1Var.f199h = false;
        return new p063g1.q(uVar.f24885r);
    }

    public final Object c(long j, boolean z10, q9.i iVar) {
        p110k9.y yVar = p110k9.y.f19095a;
        if (z10) {
            return yVar;
        }
        long jA = p063g1.q.a(j, 0.0f, 0.0f, this.f196d == EnumC0047u0.f425s ? 1 : 2);
        a1 a1Var = new a1(this, null);
        C1452f c1452f = this.f194b;
        p161p9.a aVar = p161p9.a.f21156r;
        if (c1452f == null || !(this.f193a.d() || this.f193a.b())) {
            a1 a1Var2 = new a1(a1Var.f187u, iVar);
            a1Var2.f186t = jA;
            Object objInvokeSuspend = a1Var2.invokeSuspend(yVar);
            if (objInvokeSuspend == aVar) {
                return objInvokeSuspend;
            }
        } else {
            Object objB = c1452f.b(jA, a1Var, iVar);
            if (objB == aVar) {
                return objB;
            }
        }
        return yVar;
    }

    public final float d(float f3) {
        return this.f197e ? f3 * (-1) : f3;
    }

    public final long e(long j) {
        return this.f197e ? p171r0.c.i(j, -1.0f) : j;
    }

    public final Object f(p232y.T t2, p241y9.e eVar, q9.c cVar) {
        Object objA = this.f193a.a(t2, new C0039q(this, eVar, (p150o9.c) null, 4), cVar);
        return objA == p161p9.a.f21156r ? objA : p110k9.y.f19095a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.f196d == EnumC0047u0.f425s ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f3) {
        long jFloatToRawIntBits;
        long j;
        if (f3 == 0.0f) {
            return 0L;
        }
        if (this.f196d == EnumC0047u0.f425s) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f3);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }
}
