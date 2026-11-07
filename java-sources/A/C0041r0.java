package A;

import G.C0187v;
import H0.C0224x;
import J0.AbstractC0283f;
import J0.C0277c;
import K9.AbstractC0405x;
import U0.C0515g;
import W.C0556f0;
import Z.C0681f0;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: A.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041r0 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f398s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0041r0(int i10, Object obj) {
        super(0);
        this.f397r = i10;
        this.f398s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x024f A[LOOP:3: B:86:0x0219->B:96:0x024f, LOOP_END] */
    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f397r) {
            case 0:
                return (C0026j0) M9.l.a(((M9.i) this.f398s).g());
            case 1:
                return Boolean.valueOf(((S0) this.f398s).f19338E);
            case 2:
                return ((C0.d) this.f398s).f670d;
            case 3:
                return ((C0.g) this.f398s).v0();
            case 4:
                C0187v c0187v = ((androidx.compose.foundation.lazy.layout.b) this.f398s).j;
                if (c0187v != null) {
                    AbstractC0283f.m(c0187v);
                }
                return p110k9.y.f19095a;
            case 5:
                return (p171r0.e) this.f398s;
            case 6:
                H0.E eA = ((H0.d0) this.f398s).a();
                J0.I i10 = eA.f3144r;
                if (eA.f3141E != ((p011b0.b) i10.p()).f13119r.f13127t) {
                    u.E e10 = eA.f3149w;
                    Object[] objArr = e10.f22671c;
                    long[] jArr = e10.f22669a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j) < 128) {
                                        ((C0224x) objArr[(i11 << 3) + i13]).f3228d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i12 == 8) {
                                    if (i11 != length) {
                                        i11++;
                                    }
                                }
                            } else if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                    if (!i10.r()) {
                        J0.I.W(i10, false, 7);
                    }
                }
                return p110k9.y.f19095a;
            case 7:
                I.d dVar = (I.d) this.f398s;
                dVar.f3651Z.e(Boolean.valueOf(!dVar.f3650Y));
                return p110k9.y.f19095a;
            case 8:
                I0.c cVar = (I0.c) this.f398s;
                p011b0.e eVar = cVar.f3657c;
                p011b0.e eVar2 = cVar.f3656b;
                p011b0.e eVar3 = cVar.f3659e;
                cVar.f3660f = false;
                HashSet hashSet = new HashSet();
                p011b0.e eVar4 = cVar.f3658d;
                Object[] objArr2 = eVar4.f13125r;
                int i14 = eVar4.f13127t;
                for (int i15 = 0; i15 < i14; i15++) {
                    J0.I i16 = (J0.I) objArr2[i15];
                    I0.f fVar = (I0.f) eVar3.f13125r[i15];
                    l0.q qVar = (l0.q) i16.f3914W.f4067f;
                    if (qVar.f19338E) {
                        I0.c.b(qVar, fVar, hashSet);
                    }
                }
                eVar4.g();
                eVar3.g();
                Object[] objArr3 = eVar2.f13125r;
                int i17 = eVar2.f13127t;
                for (int i18 = 0; i18 < i17; i18++) {
                    C0277c c0277c = (C0277c) objArr3[i18];
                    I0.f fVar2 = (I0.f) eVar.f13125r[i18];
                    if (c0277c.f19338E) {
                        I0.c.b(c0277c, fVar2, hashSet);
                    }
                }
                eVar2.g();
                eVar.g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C0277c) it.next()).x0();
                }
                return p110k9.y.f19095a;
            case 9:
                J0.M m10 = ((J0.I) this.f398s).f3915X;
                m10.f3958p.R = true;
                J0.V v10 = m10.f3959q;
                if (v10 != null) {
                    v10.f3999L = true;
                }
                return p110k9.y.f19095a;
            case 10:
                p241y9.c cVar2 = (p241y9.c) this.f398s;
                p180s0.G g = J0.j0.f4120Y;
                cVar2.e(g);
                g.f21786I = g.f21781D.c(g.f21783F, g.f21785H, g.f21784G);
                return p110k9.y.f19095a;
            case 11:
                return (C0515g) this.f398s;
            case 12:
                p171r0.h.c((p242z.j) this.f398s);
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((K.W) this.f398s).d();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new K.r0((EnumC0047u0) this.f398s, 0.0f);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new p063g1.j(((p063g1.k) this.f398s).c());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                AbstractC0405x.h(((K0.V) this.f398s).f5024t, null);
                return p110k9.y.f19095a;
            case 17:
                ((K0.W) this.f398s).f5029b = null;
                return p110k9.y.f19095a;
            case 18:
                Object systemService = ((View) ((M.k) this.f398s).f5618s).getContext().getSystemService("input_method");
                p251z9.j.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new BaseInputConnection(((M.p) this.f398s).f5641a, false);
            case 20:
                N.h hVar = (N.h) this.f398s;
                hVar.U = null;
                AbstractC0283f.o(hVar);
                AbstractC0283f.n(hVar);
                AbstractC0283f.m(hVar);
                return Boolean.TRUE;
            case 21:
                N.k kVar = (N.k) this.f398s;
                kVar.Q = null;
                AbstractC0283f.o(kVar);
                AbstractC0283f.n(kVar);
                AbstractC0283f.m(kVar);
                return Boolean.TRUE;
            case 22:
                S0.a aVar = (S0.a) this.f398s;
                aVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    return p110k9.y.f19095a;
                } finally {
                    Trace.endSection();
                }
            case 23:
                Object obj = T1.F.f7581e;
                File file = (File) this.f398s;
                synchronized (obj) {
                    T1.F.f7580d.remove(file.getAbsolutePath());
                }
                return p110k9.y.f19095a;
            case 24:
                ((K9.J) this.f398s).a();
                return p110k9.y.f19095a;
            case 25:
                C0681f0 c0681f0 = ((V.a) this.f398s).f8319A;
                c0681f0.setValue(Boolean.valueOf(!((Boolean) c0681f0.getValue()).booleanValue()));
                return p110k9.y.f19095a;
            case 26:
                AbstractC0283f.m((V.b) this.f398s);
                return p110k9.y.f19095a;
            case 27:
                return Float.valueOf(((W.P) this.f398s).f8750a.f9137b.f());
            case 28:
                C0556f0 c0556f0 = (C0556f0) this.f398s;
                AbstractC0405x.x(c0556f0.h0(), null, new C0040q0(c0556f0, (p150o9.c) null, 13), 3);
                return p110k9.y.f19095a;
            default:
                return Float.valueOf(B0.c.k(((Number) ((p241y9.a) this.f398s).invoke()).floatValue(), 0.0f, 1.0f));
        }
    }
}
