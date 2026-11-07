package K;

import A.M0;
import H0.InterfaceC0219s;
import K0.f1;
import K9.InterfaceC0402u;
import W.C0561g1;
import W.EnumC0565h1;
import Z.C0681f0;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f4454r = i10;
        this.f4456t = obj;
        this.f4455s = z10;
        this.f4457u = obj2;
        this.f4458v = obj3;
        this.f4459w = obj4;
        this.f4460x = obj5;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        InterfaceC0219s interfaceC0219s;
        InterfaceC0219s interfaceC0219s2;
        int i10 = this.f4454r;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj2 = this.f4458v;
        Object obj3 = this.f4457u;
        boolean z10 = this.f4455s;
        Object obj4 = this.f4456t;
        Object obj5 = this.f4460x;
        Object obj6 = this.f4459w;
        switch (i10) {
            case 0:
                InterfaceC0219s interfaceC0219s3 = (InterfaceC0219s) obj;
                Z0.y yVar2 = (Z0.y) obj6;
                O.N n6 = (O.N) obj2;
                W w9 = (W) obj4;
                C0681f0 c0681f0 = w9.f4565o;
                w9.f4559h = interfaceC0219s3;
                t0 t0VarD = w9.d();
                if (t0VarD != null) {
                    t0VarD.f4795b = interfaceC0219s3;
                }
                if (z10) {
                    if (w9.a() == L.f4485s) {
                        if (((Boolean) w9.f4562l.getValue()).booleanValue() && ((Boolean) ((K0.B0) ((f1) obj3)).f4872a.getValue()).booleanValue()) {
                            n6.p();
                        } else {
                            n6.l();
                        }
                        w9.f4563m.setValue(Boolean.valueOf(p050e8.b.I(n6, true)));
                        w9.f4564n.setValue(Boolean.valueOf(p050e8.b.I(n6, false)));
                        c0681f0.setValue(Boolean.valueOf(U0.K.b(yVar2.f10954b)));
                    } else if (w9.a() == L.f4486t) {
                        c0681f0.setValue(Boolean.valueOf(p050e8.b.I(n6, true)));
                    }
                    T.w(w9, yVar2, (Z0.s) obj5);
                    t0 t0VarD2 = w9.d();
                    if (t0VarD2 != null) {
                        Z0.y yVar3 = (Z0.y) obj6;
                        Z0.s sVar = (Z0.s) obj5;
                        Z0.E e10 = w9.f4557e;
                        if (e10 != null && w9.b() && (interfaceC0219s = t0VarD2.f4795b) != null && interfaceC0219s.C() && (interfaceC0219s2 = t0VarD2.f4796c) != null) {
                            U0.I i11 = t0VarD2.f4794a;
                            M0 m10 = new M0(13, interfaceC0219s);
                            p171r0.e eVarO = B1.O(interfaceC0219s);
                            p171r0.e eVarJ = interfaceC0219s.J(interfaceC0219s2, false);
                            if (p251z9.j.a((Z0.E) e10.f10889a.f10957b.get(), e10)) {
                                e10.f10890b.a(yVar3, sVar, i11, m10, eVarO, eVarJ);
                            }
                        }
                    }
                }
                break;
            default:
                R0.j jVar = (R0.j) obj;
                C0561g1 c0561g1 = (C0561g1) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj6;
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj5;
                X.s sVar2 = c0561g1.f9137b;
                X.F fD = sVar2.d();
                p241y9.c cVar = sVar2.f9778d;
                if (fD.f9690a.size() > 1 && z10) {
                    EnumC0565h1 enumC0565h1B = c0561g1.b();
                    EnumC0565h1 enumC0565h1 = EnumC0565h1.f9160t;
                    if (enumC0565h1B == enumC0565h1) {
                        if (((Boolean) cVar.e(EnumC0565h1.f9159s)).booleanValue()) {
                            W.L l10 = new W.L(interfaceC0402u, c0561g1, 0);
                            F9.f[] fVarArr = R0.u.f7181a;
                            jVar.e(R0.i.f7100s, new R0.a(str, l10));
                        }
                    } else if (((Boolean) cVar.e(enumC0565h1)).booleanValue()) {
                        W.L l11 = new W.L(interfaceC0402u, c0561g1, 1);
                        F9.f[] fVarArr2 = R0.u.f7181a;
                        jVar.e(R0.i.f7101t, new R0.a(str2, l11));
                    }
                    if (!c0561g1.f9136a) {
                        W.L l12 = new W.L(interfaceC0402u, c0561g1, 2);
                        F9.f[] fVarArr3 = R0.u.f7181a;
                        jVar.e(R0.i.f7102u, new R0.a(str3, l12));
                    }
                }
                break;
        }
        return yVar;
    }
}
