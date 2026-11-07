package H0;

import K0.t1;
import Z.AbstractC0689j0;
import Z.C0672b;
import Z.C0698o;
import Z.C0704u;
import Z.InterfaceC0686i;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC0686i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final u.E f3137A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f0 f3138B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final u.E f3139C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p011b0.e f3140D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3141E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3142F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f3143G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final J0.I f3144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Z.r f3145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public M.k f3146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u.E f3149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u.E f3150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0226z f3151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0223w f3152z;

    public E(J0.I i10, M.k kVar) {
        this.f3144r = i10;
        this.f3146t = kVar;
        long[] jArr = u.M.f22699a;
        this.f3149w = new u.E();
        this.f3150x = new u.E();
        this.f3151y = new C0226z(this);
        this.f3152z = new C0223w(this);
        this.f3137A = new u.E();
        this.f3138B = new f0();
        this.f3139C = new u.E();
        this.f3140D = new p011b0.e(new Object[16]);
        this.f3143G = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static C0704u i(C0704u c0704u, J0.I i10, boolean z10, Z.r rVar, p074h0.d dVar) {
        if (c0704u == null || c0704u.f10820K) {
            ViewGroup.LayoutParams layoutParams = t1.f5170a;
            c0704u = new C0704u(rVar, new android.support.v4.media.session.r(i10));
        }
        if (!z10) {
            c0704u.j(dVar);
            return c0704u;
        }
        C0698o c0698o = c0704u.f10819J;
        c0698o.f10744y = 100;
        c0698o.f10743x = true;
        c0704u.j(dVar);
        if (c0698o.f10710E || c0698o.f10744y != 100) {
            AbstractC0689j0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        c0698o.f10744y = -1;
        c0698o.f10743x = false;
        return c0704u;
    }

    public final void a(int i10) {
        boolean z10;
        boolean z11 = false;
        this.f3141E = 0;
        List listP = this.f3144r.p();
        p011b0.b bVar = (p011b0.b) listP;
        int i11 = (bVar.f13119r.f13127t - this.f3142F) - 1;
        if (i10 <= i11) {
            this.f3138B.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object objG = this.f3149w.g((J0.I) bVar.get(i12));
                    p251z9.j.b(objG);
                    ((u.B) this.f3138B.f3199s).a(((C0224x) objG).f3225a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            M.k kVar = this.f3146t;
            f0 f0Var = this.f3138B;
            u.z zVar = (u.z) kVar.f5619t;
            zVar.a();
            Iterator it = f0Var.iterator();
            while (true) {
                G9.h hVar = (G9.h) it;
                if (!((G9.j) hVar.f2934s).hasNext()) {
                    break;
                }
                Object next = ((G9.j) hVar.f2934s).next();
                Object objB = ((G.B) kVar.f5618s).b(next);
                int iD = zVar.d(objB);
                int i13 = iD >= 0 ? zVar.f22786c[iD] : 0;
                if (i13 == 7) {
                    f0Var.remove(next);
                } else {
                    zVar.g(i13 + 1, objB);
                }
            }
            p093j0.i iVarC = p093j0.s.c();
            p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
            p093j0.i iVarD = p093j0.s.d(iVarC);
            z10 = false;
            while (i11 >= i10) {
                try {
                    J0.I i14 = (J0.I) ((p011b0.b) listP).get(i11);
                    Object objG2 = this.f3149w.g(i14);
                    p251z9.j.b(objG2);
                    C0224x c0224x = (C0224x) objG2;
                    Object obj = c0224x.f3225a;
                    if (((u.B) this.f3138B.f3199s).c(obj)) {
                        this.f3141E++;
                        if (((Boolean) c0224x.f3230f.getValue()).booleanValue()) {
                            J0.M m10 = i14.f3915X;
                            J0.Z z12 = m10.f3958p;
                            J0.G g = J0.G.f3891t;
                            z12.f4023C = g;
                            J0.V v10 = m10.f3959q;
                            if (v10 != null) {
                                v10.f3988A = g;
                            }
                            c0224x.f3230f.setValue(Boolean.FALSE);
                            z10 = true;
                        }
                    } else {
                        J0.I i15 = this.f3144r;
                        i15.f3904H = true;
                        this.f3149w.j(i14);
                        C0704u c0704u = c0224x.f3227c;
                        if (c0704u != null) {
                            c0704u.l();
                        }
                        this.f3144r.R(i11, 1);
                        i15.f3904H = false;
                    }
                    this.f3150x.j(obj);
                    i11--;
                } catch (Throwable th) {
                    p093j0.s.g(iVarC, iVarD, cVarE);
                    throw th;
                }
            }
            p093j0.s.g(iVarC, iVarD, cVarE);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (p093j0.n.f18661b) {
                u.F f3 = p093j0.n.f18667i.f18633h;
                if (f3 != null && f3.h()) {
                    z11 = true;
                }
            }
            if (z11) {
                p093j0.n.a();
            }
        }
        b();
    }

    public final void b() {
        int i10 = ((p011b0.b) this.f3144r.p()).f13119r.f13127t;
        u.E e10 = this.f3149w;
        if (e10.f22673e != i10) {
            G0.a.a("Inconsistency between the count of nodes tracked by the state (" + e10.f22673e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.f3141E) - this.f3142F < 0) {
            StringBuilder sbW = p123m2.c.w(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbW.append(this.f3141E);
            sbW.append(". Precomposed children ");
            sbW.append(this.f3142F);
            G0.a.a(sbW.toString());
        }
        u.E e11 = this.f3137A;
        if (e11.f22673e == this.f3142F) {
            return;
        }
        G0.a.a("Incorrect state. Precomposed children " + this.f3142F + ". Map size " + e11.f22673e);
    }

    @Override // Z.InterfaceC0686i
    public final void c() {
        f(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // Z.InterfaceC0686i
    public final void d() {
        C0704u c0704u;
        J0.I i10 = this.f3144r;
        i10.f3904H = true;
        u.E e10 = this.f3149w;
        Object[] objArr = e10.f22671c;
        long[] jArr = e10.f22669a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128 && (c0704u = ((C0224x) objArr[(i11 << 3) + i13]).f3227c) != null) {
                            c0704u.l();
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        i10.Q();
        i10.f3904H = false;
        e10.a();
        this.f3150x.a();
        this.f3142F = 0;
        this.f3141E = 0;
        this.f3137A.a();
        b();
    }

    @Override // Z.InterfaceC0686i
    public final void e() {
        f(true);
    }

    public final void f(boolean z10) {
        this.f3142F = 0;
        this.f3137A.a();
        List listP = this.f3144r.p();
        int i10 = ((p011b0.b) listP).f13119r.f13127t;
        if (this.f3141E != i10) {
            this.f3141E = i10;
            p093j0.i iVarC = p093j0.s.c();
            p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
            p093j0.i iVarD = p093j0.s.d(iVarC);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    J0.I i12 = (J0.I) ((p011b0.b) listP).get(i11);
                    C0224x c0224x = (C0224x) this.f3149w.g(i12);
                    if (c0224x != null && ((Boolean) c0224x.f3230f.getValue()).booleanValue()) {
                        J0.M m10 = i12.f3915X;
                        J0.Z z11 = m10.f3958p;
                        J0.G g = J0.G.f3891t;
                        z11.f4023C = g;
                        J0.V v10 = m10.f3959q;
                        if (v10 != null) {
                            v10.f3988A = g;
                        }
                        if (z10) {
                            C0704u c0704u = c0224x.f3227c;
                            if (c0704u != null) {
                                c0704u.k();
                            }
                            c0224x.f3230f = C0672b.r(Boolean.FALSE);
                        } else {
                            c0224x.f3230f.setValue(Boolean.FALSE);
                        }
                        c0224x.f3225a = a0.f3183a;
                    }
                } catch (Throwable th) {
                    p093j0.s.g(iVarC, iVarD, cVarE);
                    throw th;
                }
            }
            p093j0.s.g(iVarC, iVarD, cVarE);
            this.f3150x.a();
        }
        b();
    }

    public final b0 g(Object obj, p241y9.e eVar) {
        J0.I i10 = this.f3144r;
        if (!i10.H()) {
            return new C();
        }
        b();
        if (!this.f3150x.c(obj)) {
            this.f3139C.j(obj);
            u.E e10 = this.f3137A;
            Object objG = e10.g(obj);
            if (objG == null) {
                objG = j(obj);
                if (objG != null) {
                    int iJ = ((p011b0.b) i10.p()).f13119r.j(objG);
                    int i11 = ((p011b0.b) i10.p()).f13119r.f13127t;
                    i10.f3904H = true;
                    i10.L(iJ, i11, 1);
                    i10.f3904H = false;
                    this.f3142F++;
                } else {
                    int i12 = ((p011b0.b) i10.p()).f13119r.f13127t;
                    J0.I i13 = new J0.I(2);
                    i10.f3904H = true;
                    i10.B(i12, i13);
                    i10.f3904H = false;
                    this.f3142F++;
                    objG = i13;
                }
                e10.l(obj, objG);
            }
            h((J0.I) objG, obj, eVar);
        }
        return new D(this, obj);
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
    public final void h(J0.I i10, Object obj, p241y9.e eVar) {
        boolean z10;
        u.E e10 = this.f3149w;
        Object objG = e10.g(i10);
        Object obj2 = objG;
        if (objG == null) {
            p074h0.d dVar = AbstractC0209h.f3201a;
            C0224x c0224x = new C0224x();
            c0224x.f3225a = obj;
            c0224x.f3226b = dVar;
            c0224x.f3227c = null;
            c0224x.f3230f = C0672b.r(Boolean.TRUE);
            e10.l(i10, c0224x);
            obj2 = c0224x;
        }
        C0224x c0224x2 = (C0224x) obj2;
        C0704u c0704u = c0224x2.f3227c;
        if (c0704u != null) {
            synchronized (c0704u.f10824u) {
                z10 = c0704u.f10814E.f22673e > 0;
            }
        } else {
            z10 = true;
        }
        if (c0224x2.f3226b != eVar || z10 || c0224x2.f3228d) {
            c0224x2.f3226b = eVar;
            p093j0.i iVarC = p093j0.s.c();
            p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
            p093j0.i iVarD = p093j0.s.d(iVarC);
            try {
                J0.I i11 = this.f3144r;
                i11.f3904H = true;
                p241y9.e eVar2 = c0224x2.f3226b;
                C0704u c0704u2 = c0224x2.f3227c;
                Z.r rVar = this.f3145s;
                if (rVar == null) {
                    G0.a.c("parent composition reference not set");
                    throw new A6.a();
                }
                c0224x2.f3227c = i(c0704u2, i10, c0224x2.f3229e, rVar, new p074h0.d(-1750409193, new A.K(5, c0224x2, eVar2), true));
                c0224x2.f3229e = false;
                i11.f3904H = false;
                p093j0.s.g(iVarC, iVarD, cVarE);
                c0224x2.f3228d = false;
            } catch (Throwable th) {
                p093j0.s.g(iVarC, iVarD, cVarE);
                throw th;
            }
        }
    }

    public final J0.I j(Object obj) {
        u.E e10;
        int i10;
        if (this.f3141E == 0) {
            return null;
        }
        J0.I i11 = this.f3144r;
        p011b0.b bVar = (p011b0.b) i11.p();
        int i12 = bVar.f13119r.f13127t - this.f3142F;
        int i13 = i12 - this.f3141E;
        int i14 = i12 - 1;
        int i15 = i14;
        while (true) {
            e10 = this.f3149w;
            if (i15 < i13) {
                i10 = -1;
                break;
            }
            Object objG = e10.g((J0.I) bVar.get(i15));
            p251z9.j.b(objG);
            if (((C0224x) objG).f3225a.equals(obj)) {
                i10 = i15;
                break;
            }
            i15--;
        }
        if (i10 == -1) {
            while (true) {
                if (i14 < i13) {
                    i15 = i14;
                    break;
                }
                Object objG2 = e10.g((J0.I) bVar.get(i14));
                p251z9.j.b(objG2);
                C0224x c0224x = (C0224x) objG2;
                Object obj2 = c0224x.f3225a;
                if (obj2 != a0.f3183a) {
                    G.B b5 = (G.B) this.f3146t.f5618s;
                    if (!p251z9.j.a(b5.b(obj), b5.b(obj2))) {
                        i14--;
                    }
                }
                c0224x.f3225a = obj;
                i15 = i14;
                i10 = i15;
                break;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i15 != i13) {
            i11.f3904H = true;
            i11.L(i15, i13, 1);
            i11.f3904H = false;
        }
        this.f3141E--;
        J0.I i16 = (J0.I) bVar.get(i13);
        Object objG3 = e10.g(i16);
        p251z9.j.b(objG3);
        C0224x c0224x2 = (C0224x) objG3;
        c0224x2.f3230f = C0672b.r(Boolean.TRUE);
        c0224x2.f3229e = true;
        c0224x2.f3228d = true;
        return i16;
    }
}
