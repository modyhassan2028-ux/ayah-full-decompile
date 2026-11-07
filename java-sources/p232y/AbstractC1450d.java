package p232y;

import A.N;
import B.h;
import B.j;
import B.k;
import B.l;
import B0.d;
import D0.C0096n;
import D0.EnumC0097o;
import D0.I;
import D0.O;
import D0.z;
import E5.c;
import F9.f;
import J0.A0;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0;
import J0.InterfaceC0290m;
import J0.w0;
import J0.y0;
import K9.AbstractC0405x;
import R0.g;
import R0.i;
import R0.s;
import R0.u;
import W.C0557f1;
import android.view.KeyEvent;
import p110k9.y;
import p241y9.a;
import u.AbstractC1358m;
import u.w;

/* JADX INFO: renamed from: y.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1450d extends AbstractC0291n implements w0, d, y0, C0 {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final D f24483X = new D(3);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public j f24484H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public O f24485I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f24486J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public g f24487K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f24488L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public a f24489M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1471z f24490N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public O f24491O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public InterfaceC0290m f24492P;
    public l Q;
    public B.g R;
    public final w S;
    public long T;
    public j U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f24493V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final D f24494W;

    public AbstractC1450d(j jVar, O o10, boolean z10, String str, g gVar, a aVar) {
        this.f24484H = jVar;
        this.f24485I = o10;
        this.f24486J = str;
        this.f24487K = gVar;
        this.f24488L = z10;
        this.f24489M = aVar;
        boolean z11 = false;
        this.f24490N = new C1471z(jVar, 0, new c(1, this, AbstractC1450d.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 13));
        int i10 = AbstractC1358m.f22738a;
        this.S = new w(6);
        this.T = 0L;
        j jVar2 = this.f24484H;
        this.U = jVar2;
        if (jVar2 == null && this.f24485I != null) {
            z11 = true;
        }
        this.f24493V = z11;
        this.f24494W = f24483X;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[LOOP:0: B:13:0x002b->B:23:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:24:0x006a BREAK  A[LOOP:0: B:13:0x002b->B:23:0x0067], SYNTHETIC] */
    public final void A0() {
        j jVar = this.f24484H;
        w wVar = this.S;
        if (jVar != null) {
            l lVar = this.Q;
            if (lVar != null) {
                jVar.b(new k(lVar));
            }
            B.g gVar = this.R;
            if (gVar != null) {
                jVar.b(new h(gVar));
            }
            Object[] objArr = wVar.f22769c;
            long[] jArr = wVar.f22767a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                jVar.b(new k((l) objArr[(i10 << 3) + i12]));
                            }
                            j >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        this.Q = null;
        this.R = null;
        wVar.a();
    }

    public final void B0() {
        O o10;
        if (this.f24492P == null && (o10 = this.f24485I) != null) {
            if (this.f24484H == null) {
                this.f24484H = new j();
            }
            this.f24490N.A0(this.f24484H);
            j jVar = this.f24484H;
            p251z9.j.b(jVar);
            InterfaceC0290m interfaceC0290mB = o10.b(jVar);
            v0(interfaceC0290mB);
            this.f24492P = interfaceC0290mB;
        }
    }

    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        long jY = B9.a.y(j);
        this.T = (((long) Float.floatToRawIntBits((int) (jY & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jY >> 32)) << 32);
        B0();
        int i10 = 3;
        p150o9.c cVar = null;
        if (this.f24488L && enumC0097o == EnumC0097o.f1124s) {
            int i11 = c0096n.f1122d;
            if (i11 == 4) {
                AbstractC0405x.x(h0(), null, new C1449c(this, cVar, 0), 3);
            } else if (i11 == 5) {
                AbstractC0405x.x(h0(), null, new C1449c(this, cVar, 1), 3);
            }
        }
        if (this.f24491O == null) {
            N n6 = new N(i10, this);
            C0096n c0096n2 = I.f1055a;
            O o10 = new O(null, null, n6);
            v0(o10);
            this.f24491O = o10;
        }
        O o11 = this.f24491O;
        if (o11 != null) {
            o11.C(c0096n, enumC0097o, j);
        }
    }

    public abstract boolean D0(KeyEvent keyEvent);

    public abstract void E0(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // B0.d
    public final boolean F(KeyEvent keyEvent) {
        boolean z10;
        B0();
        long jH = B0.c.H(keyEvent);
        boolean z11 = this.f24488L;
        w wVar = this.S;
        if (z11 && B0.c.O(keyEvent) == 2 && androidx.compose.foundation.a.g(keyEvent)) {
            if (wVar.b(jH)) {
                z10 = false;
            } else {
                l lVar = new l(this.T);
                wVar.g(jH, lVar);
                if (this.f24484H != null) {
                    AbstractC0405x.x(h0(), null, new C1448b(this, lVar, null, 1), 3);
                }
                z10 = true;
            }
            if (D0(keyEvent) || z10) {
                return true;
            }
            return false;
        }
        if (this.f24488L && B0.c.O(keyEvent) == 1 && androidx.compose.foundation.a.g(keyEvent)) {
            l lVar2 = (l) wVar.f(jH);
            if (lVar2 != null) {
                if (this.f24484H != null) {
                    AbstractC0405x.x(h0(), null, new C1448b(this, lVar2, null, 2), 3);
                }
                E0(keyEvent);
            }
            if (lVar2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    public final void F0(j jVar, O o10, boolean z10, String str, g gVar, a aVar) {
        boolean z11;
        boolean z12;
        InterfaceC0290m interfaceC0290m;
        boolean z13 = false;
        if (p251z9.j.a(this.U, jVar)) {
            z11 = false;
        } else {
            A0();
            this.U = jVar;
            this.f24484H = jVar;
            z11 = true;
        }
        if (!p251z9.j.a(this.f24485I, o10)) {
            this.f24485I = o10;
            z11 = true;
        }
        boolean z14 = this.f24488L;
        C1471z c1471z = this.f24490N;
        if (z14 != z10) {
            if (z10) {
                v0(c1471z);
            } else {
                w0(c1471z);
                A0();
            }
            AbstractC0283f.o(this);
            this.f24488L = z10;
        }
        if (!p251z9.j.a(this.f24486J, str)) {
            this.f24486J = str;
            AbstractC0283f.o(this);
        }
        if (!p251z9.j.a(this.f24487K, gVar)) {
            this.f24487K = gVar;
            AbstractC0283f.o(this);
        }
        this.f24489M = aVar;
        boolean z15 = this.f24493V;
        j jVar2 = this.U;
        if (z15 != (jVar2 == null && this.f24485I != null)) {
            if (jVar2 == null && this.f24485I != null) {
                z13 = true;
            }
            this.f24493V = z13;
            z12 = (z13 || this.f24492P != null) ? z11 : true;
        }
        if (z12 && ((interfaceC0290m = this.f24492P) != null || !this.f24493V)) {
            if (interfaceC0290m != null) {
                w0(interfaceC0290m);
            }
            this.f24492P = null;
            B0();
        }
        c1471z.A0(this.f24484H);
    }

    @Override // J0.w0
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // J0.y0
    public final void L(R0.j jVar) {
        g gVar = this.f24487K;
        if (gVar != null) {
            u.e(jVar, gVar.f7079a);
        }
        String str = this.f24486J;
        C0557f1 c0557f1 = new C0557f1(20, this);
        f[] fVarArr = u.f7181a;
        jVar.e(i.f7085b, new R0.a(str, c0557f1));
        if (this.f24488L) {
            this.f24490N.L(jVar);
        } else {
            jVar.e(s.f7163i, y.f19095a);
        }
        y0(jVar);
    }

    @Override // J0.w0
    public final void P() {
        R();
    }

    @Override // J0.w0
    public final void R() {
        B.g gVar;
        j jVar = this.f24484H;
        if (jVar != null && (gVar = this.R) != null) {
            jVar.b(new h(gVar));
        }
        this.R = null;
        O o10 = this.f24491O;
        if (o10 != null) {
            o10.R();
        }
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final boolean V() {
        return true;
    }

    @Override // J0.w0
    public final /* synthetic */ void a0() {
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // B0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // l0.q
    public final void l0() {
        if (!this.f24493V) {
            B0();
        }
        if (this.f24488L) {
            v0(this.f24490N);
        }
    }

    @Override // l0.q
    public final void m0() {
        R();
    }

    @Override // l0.q
    public final void n0() {
        A0();
        if (this.U == null) {
            this.f24484H = null;
        }
        InterfaceC0290m interfaceC0290m = this.f24492P;
        if (interfaceC0290m != null) {
            w0(interfaceC0290m);
        }
        this.f24492P = null;
    }

    @Override // J0.C0
    public final Object p() {
        return this.f24494W;
    }

    @Override // J0.w0
    public final long q() {
        return A0.f3873a;
    }

    public abstract Object z0(z zVar, p150o9.c cVar);

    public void C0() {
    }

    public void y0(R0.j jVar) {
    }
}
