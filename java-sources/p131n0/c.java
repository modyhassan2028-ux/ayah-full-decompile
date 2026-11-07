package p131n0;

import A.K;
import A.R0;
import J0.AbstractC0283f;
import J0.j0;
import K0.P;
import K0.RunnableC0354l;
import K0.V0;
import M9.e;
import N0.a;
import N0.b;
import R0.g;
import R0.i;
import R0.p;
import R0.s;
import R0.v;
import U0.C0515g;
import U0.H;
import U0.I;
import U0.L;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.InterfaceC0757f;
import androidx.lifecycle.InterfaceC0771u;
import java.util.ArrayList;
import java.util.List;
import p063g1.o;
import p185s8.u0;
import p251z9.j;
import u.AbstractC1355j;
import u.AbstractC1356k;
import u.E;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0757f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public t f19796A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f19797B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f19798C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public V0 f19799D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f19800E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RunnableC0354l f19801F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AndroidComposeView f19802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F2.t f19803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f19804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f19805u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f19806v = 100;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f19807w = a.f19788r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19808x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f19809y = u0.a(1, 6, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f19810z = new Handler(Looper.getMainLooper());

    public c(AndroidComposeView androidComposeView, F2.t tVar) {
        this.f19802r = androidComposeView;
        this.f19803s = tVar;
        t tVar2 = AbstractC1356k.f22736a;
        j.c(tVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f19796A = tVar2;
        this.f19798C = new t();
        p pVarA = androidComposeView.getSemanticsOwner().a();
        j.c(tVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f19799D = new V0(pVarA, tVar2);
        this.f19801F = new RunnableC0354l(20, this);
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final void A(InterfaceC0771u interfaceC0771u) {
        l(this.f19802r.getSemanticsOwner().a());
        g();
        this.f19804t = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (K9.AbstractC0405x.k(r6, r0) == r4) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q9.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p131n0.b
            if (r0 == 0) goto L13
            r0 = r10
            n0.b r0 = (p131n0.b) r0
            int r1 = r0.f19795v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19795v = r1
            goto L18
        L13:
            n0.b r0 = new n0.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f19793t
            int r1 = r0.f19795v
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            M9.b r1 = r0.f19792s
            n0.c r5 = r0.f19791r
            p110k9.a.e(r10)
        L2d:
            r10 = r5
            goto L4d
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            M9.b r1 = r0.f19792s
            n0.c r5 = r0.f19791r
            p110k9.a.e(r10)
            goto L5d
        L3f:
            p110k9.a.e(r10)
            M9.e r10 = r9.f19809y
            r10.getClass()
            M9.b r1 = new M9.b
            r1.<init>(r10)
            r10 = r9
        L4d:
            r0.f19791r = r10
            r0.f19792s = r1
            r0.f19795v = r3
            java.lang.Object r5 = r1.b(r0)
            if (r5 != r4) goto L5a
            goto L8c
        L5a:
            r8 = r5
            r5 = r10
            r10 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8d
            r1.c()
            boolean r10 = r5.f()
            if (r10 == 0) goto L71
            r5.g()
        L71:
            boolean r10 = r5.f19800E
            if (r10 != 0) goto L7e
            r5.f19800E = r3
            android.os.Handler r10 = r5.f19810z
            K0.l r6 = r5.f19801F
            r10.post(r6)
        L7e:
            long r6 = r5.f19806v
            r0.f19791r = r5
            r0.f19792s = r1
            r0.f19795v = r2
            java.lang.Object r10 = K9.AbstractC0405x.k(r6, r0)
            if (r10 != r4) goto L2d
        L8c:
            return r4
        L8d:
            k9.y r10 = p110k9.y.f19095a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p131n0.c.a(q9.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final void b(InterfaceC0771u interfaceC0771u) {
    }

    public final void c(p pVar, p241y9.e eVar) {
        pVar.getClass();
        List listH = p.h(4, pVar);
        int size = listH.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listH.get(i11);
            if (d().a(((p) obj).g)) {
                eVar.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    public final AbstractC1355j d() {
        if (this.f19808x) {
            this.f19808x = false;
            this.f19796A = P.g(this.f19802r.getSemanticsOwner());
            this.f19797B = System.currentTimeMillis();
        }
        return this.f19796A;
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void e(InterfaceC0771u interfaceC0771u) {
    }

    public final boolean f() {
        return this.f19804t != null;
    }

    public final void g() {
        AutofillId autofillIdB;
        b bVar = this.f19804t;
        if (bVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f19805u;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                int iOrdinal = dVar.f19813c.ordinal();
                if (iOrdinal == 0) {
                    O8.c cVar = dVar.f19814d;
                    if (cVar != null) {
                        bVar.d((ViewStructure) cVar.f6511r);
                    }
                } else if (iOrdinal == 1 && (autofillIdB = bVar.b(dVar.f19811a)) != null) {
                    bVar.e(autofillIdB);
                }
            }
            bVar.a();
            arrayList.clear();
        }
    }

    public final void h(p pVar, V0 v10) {
        c(pVar, new K(14, v10, this));
        List listH = p.h(4, pVar);
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar2 = (p) listH.get(i10);
            AbstractC1355j abstractC1355jD = d();
            int i11 = pVar2.g;
            if (abstractC1355jD.a(i11)) {
                t tVar = this.f19798C;
                if (tVar.a(i11)) {
                    Object objB = tVar.b(i11);
                    if (objB == null) {
                        throw android.support.v4.media.session.p.s("node not present in pruned tree before this change");
                    }
                    h(pVar2, (V0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void i(InterfaceC0771u interfaceC0771u) {
    }

    public final void j(int i10, String str) {
        b bVar;
        if (Build.VERSION.SDK_INT >= 29 && (bVar = this.f19804t) != null) {
            AutofillId autofillIdB = bVar.b(i10);
            if (autofillIdB == null) {
                throw android.support.v4.media.session.p.s("Invalid content capture ID");
            }
            bVar.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    public final void k(int i10, p pVar) {
        p241y9.c cVar;
        a aVarZ;
        AutofillId autofillIdI;
        O8.c cVar2;
        j0 j0VarC;
        String strT;
        p241y9.c cVar3;
        if (f()) {
            E e10 = pVar.f7119d.f7108r;
            Object objG = e10.g(s.f7144B);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.f19807w == a.f19788r && j.a(bool, Boolean.TRUE)) {
                Object objG2 = e10.g(i.f7093l);
                if (objG2 == null) {
                    objG2 = null;
                }
                R0.a aVar = (R0.a) objG2;
                if (aVar != null && (cVar3 = (p241y9.c) aVar.f7069b) != null) {
                }
            } else if (this.f19807w == a.f19789s && j.a(bool, Boolean.FALSE)) {
                Object objG3 = e10.g(i.f7093l);
                if (objG3 == null) {
                    objG3 = null;
                }
                R0.a aVar2 = (R0.a) objG3;
                if (aVar2 != null && (cVar = (p241y9.c) aVar2.f7069b) != null) {
                }
            }
            int i11 = pVar.g;
            b bVar = this.f19804t;
            if (bVar == null || Build.VERSION.SDK_INT < 29 || (aVarZ = Y2.a.z(this.f19802r)) == null) {
                cVar2 = null;
            } else {
                p pVarJ = pVar.j();
                int i12 = pVar.g;
                if (pVarJ != null) {
                    autofillIdI = bVar.b(pVarJ.g);
                    if (autofillIdI == null) {
                        cVar2 = null;
                    }
                } else {
                    autofillIdI = aVarZ.i();
                }
                O8.c cVarC = bVar.c(autofillIdI, i12);
                if (cVarC == null) {
                    cVar2 = null;
                } else {
                    ViewStructure viewStructure = (ViewStructure) cVarC.f6511r;
                    R0.j jVar = pVar.f7119d;
                    v vVar = s.f7151I;
                    E e11 = jVar.f7108r;
                    if (e11.c(vVar)) {
                        cVar2 = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.f19797B);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
                        }
                        Object objG4 = e11.g(s.f7177x);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructure.setId(i12, null, null, str);
                        }
                        Object objG5 = e11.g(s.f7166m);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = e11.g(s.f7179z);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(p086i1.a.a(62, "\n", list));
                        }
                        Object objG7 = e11.g(s.f7146D);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        C0515g c0515g = (C0515g) objG7;
                        if (c0515g != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(c0515g);
                        }
                        Object objG8 = e11.g(s.f7156a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(p086i1.a.a(62, "\n", list2));
                        }
                        Object objG9 = e11.g(s.f7176w);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        g gVar = (g) objG9;
                        if (gVar != null && (strT = P.t(gVar.f7079a)) != null) {
                            viewStructure.setClassName(strT);
                        }
                        I i13 = P.i(jVar);
                        if (i13 != null) {
                            H h7 = i13.f8023a;
                            L l10 = h7.f8016b;
                            p063g1.c cVar4 = h7.g;
                            viewStructure.setTextStyle(cVar4.n() * cVar4.getDensity() * o.c(l10.f8037a.f7995b), 0, 0, 0);
                        }
                        p pVarJ2 = pVar.j();
                        p171r0.e eVarJ = p171r0.e.f21388e;
                        if (pVarJ2 != null && (j0VarC = pVar.c()) != null) {
                            j0 j0Var = j0VarC.E0().f19338E ? j0VarC : null;
                            if (j0Var != null) {
                                eVarJ = AbstractC0283f.v(pVarJ2.f7116a, 8).J(j0Var, true);
                            }
                        }
                        float f3 = eVarJ.f21389a;
                        float f7 = eVarJ.f21390b;
                        viewStructure.setDimens((int) f3, (int) f7, 0, 0, (int) (eVarJ.f21391c - f3), (int) (eVarJ.f21392d - f7));
                        cVar2 = cVarC;
                    }
                }
            }
            if (cVar2 != null) {
                this.f19805u.add(new d(i11, this.f19797B, e.f19815r, cVar2));
            }
            c(pVar, new R0(20, this));
        }
    }

    public final void l(p pVar) {
        if (f()) {
            this.f19805u.add(new d(pVar.g, this.f19797B, e.f19816s, null));
            List listH = p.h(4, pVar);
            int size = listH.size();
            for (int i10 = 0; i10 < size; i10++) {
                l((p) listH.get(i10));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f19810z.removeCallbacks(this.f19801F);
        this.f19804t = null;
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void s(InterfaceC0771u interfaceC0771u) {
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final void w(InterfaceC0771u interfaceC0771u) {
        this.f19804t = (b) this.f19803s.invoke();
        k(-1, this.f19802r.getSemanticsOwner().a());
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
