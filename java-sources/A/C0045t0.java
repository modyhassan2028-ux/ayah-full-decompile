package A;

import K9.AbstractC0405x;
import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p223x.AbstractC1413d;

/* JADX INFO: renamed from: A.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0045t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f421f;
    public Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f422h;

    public C0045t0(b1 b1Var, O8.c cVar, N0 n6, p063g1.c cVar2) {
        this.f417b = b1Var;
        this.f418c = cVar;
        this.f419d = n6;
        this.f420e = cVar2;
        this.f421f = p185s8.u0.a(Integer.MAX_VALUE, 6, null);
        this.f422h = new M.k(1);
    }

    public static final float a(C0045t0 c0045t0, Z0 z10, float f3) {
        b1 b1Var = (b1) c0045t0.f417b;
        long jH = b1Var.h(b1Var.d(f3));
        b1 b1Var2 = z10.f178a;
        return b1Var.g(b1Var.e(b1.a(b1Var2, b1Var2.j, jH, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final Object b(C0045t0 c0045t0, b1 b1Var, C0026j0 c0026j0, float f3, float f7, q9.c cVar) {
        C0032m0 c0032m0;
        p251z9.s sVar;
        C0045t0 c0045t1;
        float f10;
        b1 b1Var2;
        c0045t0.getClass();
        if (cVar instanceof C0032m0) {
            c0032m0 = (C0032m0) cVar;
            int i10 = c0032m0.f330x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0032m0.f330x = i10 - Integer.MIN_VALUE;
            } else {
                c0032m0 = new C0032m0(c0045t0, cVar);
            }
        } else {
            c0032m0 = new C0032m0(c0045t0, cVar);
        }
        C0032m0 c0032m1 = c0032m0;
        Object obj = c0032m1.f328v;
        int i11 = c0032m1.f330x;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            p251z9.v vVar = new p251z9.v();
            vVar.f24886r = c0026j0;
            c0045t0.g(c0026j0);
            C0026j0 c0026j0F = f((M9.e) c0045t0.f421f);
            if (c0026j0F != null) {
                c0045t0.g(c0026j0F);
                vVar.f24886r = ((C0026j0) vVar.f24886r).a(c0026j0F);
            }
            p251z9.s sVar2 = new p251z9.s();
            float fG = b1Var.g(b1Var.e(((C0026j0) vVar.f24886r).f270a));
            sVar2.f24883r = fG;
            if (!AbstractC0024i0.a(fG)) {
                p251z9.v vVar2 = new p251z9.v();
                vVar2.f24886r = AbstractC1413d.b(30, 0.0f);
                C0036o0 c0036o0 = new C0036o0(sVar2, vVar2, vVar, f3, c0045t0, f7, b1Var, null);
                c0032m1.f324r = c0045t0;
                c0032m1.f325s = b1Var;
                c0032m1.f326t = sVar2;
                c0032m1.f327u = f7;
                c0032m1.f330x = 1;
                if (c0045t0.h(b1Var, c0036o0, c0032m1) != aVar) {
                    sVar = sVar2;
                    c0045t1 = c0045t0;
                    f10 = f7;
                    b1Var2 = b1Var;
                }
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return yVar;
        }
        f10 = c0032m1.f327u;
        sVar = c0032m1.f326t;
        b1Var2 = c0032m1.f325s;
        c0045t1 = c0032m1.f324r;
        p110k9.a.e(obj);
        M.k kVar = (M.k) c0045t1.f422h;
        long jE = Y2.a.e(((E0.c) kVar.f5618s).b(Float.MAX_VALUE), ((E0.c) kVar.f5619t).b(Float.MAX_VALUE));
        if (jE == 0) {
            float fD = b1Var2.d(Math.signum(sVar.f24883r)) * Math.min(Math.abs(sVar.f24883r) / 100, f10) * 1000;
            if (fD == 0.0f) {
                jE = 0;
            } else {
                jE = b1Var2.f196d == EnumC0047u0.f425s ? Y2.a.e(fD, 0.0f) : Y2.a.e(0.0f, fD);
            }
        }
        N0 n6 = (N0) c0045t1.f419d;
        c0032m1.f324r = null;
        c0032m1.f325s = null;
        c0032m1.f326t = null;
        c0032m1.f330x = 2;
        S0 s10 = (S0) n6.f24861r;
        AbstractC0405x.x(s10.R.c(), null, new O0(s10, jE, null, 2), 3);
        return yVar == aVar ? aVar : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(C0045t0 c0045t0, p251z9.v vVar, p251z9.s sVar, b1 b1Var, p251z9.v vVar2, long j, q9.c cVar) {
        C0038p0 c0038p0;
        p251z9.s sVar2;
        b1 b1Var2;
        p251z9.v vVar3;
        boolean z10;
        if (cVar instanceof C0038p0) {
            c0038p0 = (C0038p0) cVar;
            int i10 = c0038p0.f376x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0038p0.f376x = i10 - Integer.MIN_VALUE;
            } else {
                c0038p0 = new C0038p0(cVar);
            }
        } else {
            c0038p0 = new C0038p0(cVar);
        }
        Object objJ = c0038p0.f375w;
        int i11 = c0038p0.f376x;
        if (i11 == 0) {
            p110k9.a.e(objJ);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C0040q0 c0040q0 = new C0040q0(c0045t0, (p150o9.c) null, 0);
            c0038p0.f370r = c0045t0;
            c0038p0.f371s = vVar;
            c0038p0.f372t = sVar;
            c0038p0.f373u = b1Var;
            c0038p0.f374v = vVar2;
            c0038p0.f376x = 1;
            objJ = AbstractC0405x.J(j, c0040q0, c0038p0);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objJ == aVar) {
                return aVar;
            }
            sVar2 = sVar;
            b1Var2 = b1Var;
            vVar3 = vVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p251z9.v vVar4 = c0038p0.f374v;
            b1 b1Var3 = c0038p0.f373u;
            sVar2 = c0038p0.f372t;
            p251z9.v vVar5 = c0038p0.f371s;
            C0045t0 c0045t1 = c0038p0.f370r;
            p110k9.a.e(objJ);
            vVar3 = vVar4;
            b1Var2 = b1Var3;
            vVar = vVar5;
            c0045t0 = c0045t1;
        }
        C0026j0 c0026j0 = (C0026j0) objJ;
        if (c0026j0 != null) {
            boolean z11 = ((C0026j0) vVar.f24886r).f272c;
            long j10 = c0026j0.f270a;
            vVar.f24886r = new C0026j0(j10, c0026j0.f271b, z11);
            sVar2.f24883r = b1Var2.g(b1Var2.e(j10));
            vVar3.f24886r = AbstractC1413d.b(30, 0.0f);
            c0045t0.g(c0026j0);
            z10 = !AbstractC0024i0.a(sVar2.f24883r);
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0026j0 f(M9.e eVar) {
        C0026j0 c0026j0 = null;
        G9.j jVarI = AbstractC0813f2.I(new C0012c0((Object) new C0041r0(0, eVar), (p150o9.c) (0 == true ? 1 : 0), 1));
        while (jVarI.hasNext()) {
            C0026j0 c0026j0A = (C0026j0) jVarI.next();
            if (c0026j0 != null) {
                c0026j0A = c0026j0.a(c0026j0A);
            }
            c0026j0 = c0026j0A;
        }
        return c0026j0;
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((C2.d) this.f418c).g();
            return null;
        }
    }

    public void e(int i10, Serializable serializable) {
        ((Executor) this.f417b).execute(new C2.b(i10, 0, this, serializable));
    }

    public void g(C0026j0 c0026j0) {
        M.k kVar = (M.k) this.f422h;
        long j = c0026j0.f271b;
        long j10 = c0026j0.f270a;
        ((E0.c) kVar.f5618s).a(j, Float.intBitsToFloat((int) (j10 >> 32)));
        ((E0.c) kVar.f5619t).a(j, Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(b1 b1Var, C0036o0 c0036o0, q9.c cVar) throws Throwable {
        C0043s0 c0043s0;
        C0045t0 c0045t0;
        if (cVar instanceof C0043s0) {
            c0043s0 = (C0043s0) cVar;
            int i10 = c0043s0.f414u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0043s0.f414u = i10 - Integer.MIN_VALUE;
            } else {
                c0043s0 = new C0043s0(this, cVar);
            }
        } else {
            c0043s0 = new C0043s0(this, cVar);
        }
        Object obj = c0043s0.f412s;
        int i11 = c0043s0.f414u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            this.f416a = true;
            C0030l0 c0030l0 = new C0030l0(b1Var, c0036o0, null, 2);
            c0043s0.f411r = this;
            c0043s0.f414u = 1;
            K9.o0 o0Var = new K9.o0(c0043s0.getContext(), c0043s0, 0);
            Object objQ = va.g.Q(o0Var, true, o0Var, c0030l0);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objQ == aVar) {
                return aVar;
            }
            c0045t0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0045t0 = c0043s0.f411r;
            p110k9.a.e(obj);
        }
        c0045t0.f416a = false;
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public C0045t0(AssetManager assetManager, Executor executor, C2.d dVar, String str, File file) {
        this.f416a = false;
        this.f417b = executor;
        this.f418c = dVar;
        this.f421f = str;
        this.f420e = file;
        int i10 = Build.VERSION.SDK_INT;
        ?? r10 = 0;
        r10 = 0;
        if (i10 >= 24) {
            if (i10 >= 31) {
                r10 = C2.e.f703d;
            } else {
                switch (i10) {
                    case 24:
                    case 25:
                        r10 = C2.e.f706h;
                        break;
                    case 26:
                        r10 = C2.e.g;
                        break;
                    case 27:
                        r10 = C2.e.f705f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        r10 = C2.e.f704e;
                        break;
                }
            }
        }
        this.f419d = r10;
    }
}
