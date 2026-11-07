package p171r0;

import A.EnumC0047u0;
import D0.y;
import N9.b0;
import android.graphics.Canvas;
import android.graphics.Paint;
import p063g1.a;
import p063g1.m;
import p074h0.i;
import p123m2.c;
import p180s0.AbstractC1295d;
import p180s0.AbstractC1302k;
import p180s0.B;
import p180s0.C;
import p180s0.C1300i;
import p180s0.D;
import p180s0.F;
import p180s0.o;
import p196u0.d;
import p205v0.b;
import p242z.g;
import p242z.j;
import u.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final g a(float f3, float f7, float f10, float f11, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new g(f3, f7, f10, f11, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void b(long j, EnumC0047u0 enumC0047u0) {
        if (enumC0047u0 == EnumC0047u0.f424r) {
            if (a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            C.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            C.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void c(j jVar) {
        jVar.f24743a.setValue(g.f24741a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(d dVar, b bVar) {
        boolean z10;
        float f3;
        o oVarP = dVar.y().p();
        b bVar2 = (b) dVar.y().f16423t;
        p205v0.d dVar2 = bVar.f23004a;
        if (bVar.f23020s) {
            return;
        }
        bVar.a();
        if (!dVar2.n()) {
            try {
                bVar.f23004a.s(bVar.f23005b, bVar.f23006c, bVar, bVar.f23008e);
            } catch (Throwable unused) {
            }
        }
        boolean z11 = dVar2.E() > 0.0f;
        if (z11) {
            oVarP.t();
        }
        Canvas canvasA = AbstractC1295d.a(oVarP);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = bVar.f23021t;
            float f7 = (int) (j >> 32);
            float f10 = (int) (j & 4294967295L);
            long j10 = bVar.f23022u;
            float f11 = ((int) (j10 >> 32)) + f7;
            float f12 = ((int) (j10 & 4294967295L)) + f10;
            float fC = dVar2.c();
            int iH = dVar2.H();
            if (fC < 1.0f || iH != 3 || dVar2.w() == 1) {
                b0 b0VarG = bVar.f23017p;
                if (b0VarG == null) {
                    b0VarG = F.g();
                    bVar.f23017p = b0VarG;
                }
                b0VarG.c(fC);
                b0VarG.d(iH);
                b0VarG.f(null);
                canvasA = canvasA;
                f3 = f7;
                canvasA.saveLayer(f3, f10, f11, f12, (Paint) b0VarG.f6165b);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f3 = f7;
            }
            canvasA.translate(f3, f10);
            canvasA.concat(dVar2.A());
        }
        boolean z12 = !zIsHardwareAccelerated && bVar.f23024w;
        if (z12) {
            oVarP.q();
            F fD = bVar.d();
            if (fD instanceof C) {
                oVarP.a(((C) fD).f21771e);
            } else if (fD instanceof D) {
                C1300i c1300iA = bVar.f23014m;
                if (c1300iA != null) {
                    c1300iA.f21829a.rewind();
                } else {
                    c1300iA = AbstractC1302k.a();
                    bVar.f23014m = c1300iA;
                }
                c.c(c1300iA, ((D) fD).f21772e);
                oVarP.b(c1300iA);
            } else if (fD instanceof B) {
                oVarP.b(((B) fD).f21770e);
            }
        }
        if (bVar2 != null) {
            y yVar = bVar2.f23019r;
            if (!yVar.f1157r) {
                p180s0.y.a("Only add dependencies during a tracking");
            }
            u.F f13 = (u.F) yVar.f1160u;
            if (f13 != null) {
                f13.a(bVar);
            } else if (((b) yVar.f1158s) != null) {
                int i10 = N.f22700a;
                u.F f14 = new u.F();
                b bVar3 = (b) yVar.f1158s;
                p251z9.j.b(bVar3);
                f14.a(bVar3);
                f14.a(bVar);
                yVar.f1160u = f14;
                yVar.f1158s = null;
            } else {
                yVar.f1158s = bVar;
            }
            u.F f15 = (u.F) yVar.f1161v;
            if (f15 != null) {
                z10 = !f15.l(bVar);
            } else if (((b) yVar.f1159t) != bVar) {
                z10 = true;
            } else {
                yVar.f1159t = null;
                z10 = false;
            }
            if (z10) {
                bVar.f23018q++;
            }
        }
        if (AbstractC1295d.a(oVarP).isHardwareAccelerated()) {
            dVar2.C(oVarP);
        } else {
            p196u0.b bVar4 = bVar.f23016o;
            if (bVar4 == null) {
                bVar4 = new p196u0.b();
                bVar.f23016o = bVar4;
            }
            i iVar = bVar4.f22795s;
            p063g1.c cVar = bVar.f23005b;
            m mVar = bVar.f23006c;
            long jD0 = B9.a.d0(bVar.f23022u);
            p196u0.a aVar = ((p196u0.b) iVar.f16424u).f22794r;
            p063g1.c cVar2 = aVar.f22790a;
            m mVar2 = aVar.f22791b;
            o oVarP2 = iVar.p();
            long jV = iVar.v();
            b bVar5 = (b) iVar.f16423t;
            iVar.H(cVar);
            iVar.I(mVar);
            iVar.G(oVarP);
            iVar.J(jD0);
            iVar.f16423t = bVar;
            oVarP.q();
            try {
                bVar.c(bVar4);
                oVarP.n();
                iVar.H(cVar2);
                iVar.I(mVar2);
                iVar.G(oVarP2);
                iVar.J(jV);
                iVar.f16423t = bVar5;
            } catch (Throwable th) {
                oVarP.n();
                iVar.H(cVar2);
                iVar.I(mVar2);
                iVar.G(oVarP2);
                iVar.J(jV);
                iVar.f16423t = bVar5;
                throw th;
            }
        }
        if (z12) {
            oVarP.n();
        }
        if (z11) {
            oVarP.r();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public static final boolean e(g gVar) {
        long j = gVar.f21397e;
        return (j >>> 32) == (4294967295L & j) && j == gVar.f21398f && j == gVar.g && j == gVar.f21399h;
    }
}
