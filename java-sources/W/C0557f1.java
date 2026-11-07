package W;

import D0.C0086d;
import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import K9.C0389g;
import K9.InterfaceC0388f;
import K9.InterfaceC0402u;
import Z.C0675c0;
import Z.C0681f0;
import Z.C0685h0;
import Z.C0698o;
import Z.C0699o0;
import Z.C0704u;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.window.PopupLayout;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import p223x.AbstractC1413d;
import p232y.AbstractC1450d;
import p232y.C1452f;
import p232y.C1453g;
import p232y.C1466u;
import p232y.C1471z;

/* JADX INFO: renamed from: W.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0557f1 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9073s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0557f1(int i10, Object obj) {
        super(0);
        this.f9072r = i10;
        this.f9073s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0081, LOOP:2: B:13:0x002c->B:24:0x0070, LOOP_END, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x0011, B:10:0x001a, B:13:0x002c, B:15:0x0041, B:17:0x004d, B:19:0x0057, B:21:0x0065, B:26:0x0077, B:24:0x0070), top: B:44:0x0011, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0077 A[EDGE_INSN: B:52:0x0077->B:26:0x0077 BREAK  A[LOOP:2: B:13:0x002c->B:24:0x0070], SYNTHETIC] */
    private final Object b() {
        Object[] objArr;
        do {
            p093j0.u uVar = (p093j0.u) this.f9073s;
            synchronized (uVar.g) {
                try {
                    if (!uVar.f18688c) {
                        uVar.f18688c = true;
                        try {
                            p011b0.e eVar = uVar.f18691f;
                            Object[] objArr2 = eVar.f13125r;
                            int i10 = eVar.f13127t;
                            int i11 = 0;
                            while (i11 < i10) {
                                p093j0.t tVar = (p093j0.t) objArr2[i11];
                                u.F f3 = tVar.g;
                                p241y9.c cVar = tVar.f18676a;
                                Object[] objArr3 = f3.f22676b;
                                long[] jArr = f3.f22675a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j = jArr[i12];
                                        objArr = objArr2;
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i12 != length) {
                                                break;
                                                break;
                                            }
                                            i12++;
                                            objArr2 = objArr;
                                        } else {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j & 255) < 128) {
                                                    cVar.e(objArr3[(i12 << 3) + i15]);
                                                }
                                                j >>= i13;
                                                i15++;
                                                i13 = i13;
                                            }
                                            if (i14 != i13) {
                                                break;
                                            }
                                            if (i12 != length) {
                                                break;
                                            }
                                            i12++;
                                            objArr2 = objArr;
                                        }
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                f3.b();
                                i11++;
                                objArr2 = objArr;
                            }
                            uVar.f18688c = false;
                        } catch (Throwable th) {
                            uVar.f18688c = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (p093j0.u.a((p093j0.u) this.f9073s));
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v3, types: [u.A] */
    /* JADX WARN: Type inference failed for: r12v2, types: [u.A] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Z.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object[]] */
    @Override // p241y9.a
    public final Object invoke() {
        p241y9.a aVar;
        C0704u c0704u;
        InterfaceC0388f interfaceC0388fY;
        boolean z10 = false;
        int i10 = 1;
        InterfaceC0219s interfaceC0219s = null;
        interfaceC0219s = null;
        switch (this.f9072r) {
            case 0:
                return Float.valueOf(((p063g1.c) this.f9073s).w(125));
            case 1:
                C0604u1 c0604u1 = (C0604u1) this.f9073s;
                if (!((Boolean) c0604u1.f9395B.getValue()).booleanValue() && (aVar = c0604u1.f9402s) != null) {
                    aVar.invoke();
                }
                return p110k9.y.f19095a;
            case 2:
                C0615y0 c0615y0 = (C0615y0) this.f9073s;
                if (!p251z9.j.a(null, c0615y0.f9463a)) {
                    p120l9.m.s0(c0615y0.f9464b, new O(i10, 10));
                    C0699o0 c0699o0 = c0615y0.f9465c;
                    if (c0699o0 != null && (c0704u = c0699o0.f10747b) != null) {
                        c0704u.q(c0699o0, null);
                    }
                }
                return p110k9.y.f19095a;
            case 3:
                return Float.valueOf(((H1) this.f9073s).f8578a.w(G1.f8556a));
            case 4:
                File file = (File) ((C0086d) this.f9073s).invoke();
                if (v9.g.g(file).equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    p251z9.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 5:
                throw null;
            case 6:
                ArrayList arrayList = ((C0685h0) this.f9073s).f10676a;
                u.E e10 = new u.E(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ?? r10 = (Z.O) arrayList.get(i11);
                    Object obj = r10.f10632b;
                    int i12 = r10.f10631a;
                    Object n6 = obj != null ? new Z.N(Integer.valueOf(i12), r10.f10632b) : Integer.valueOf(i12);
                    int iF = e10.f(n6);
                    ?? r11 = iF < 0;
                    Object obj2 = r11 != false ? null : e10.f22671c[iF];
                    if (obj2 != null) {
                        if (obj2 instanceof u.A) {
                            ?? r12 = (u.A) obj2;
                            r12.a(r10);
                            r10 = r12;
                        } else {
                            Object[] objArr = u.K.f22696a;
                            ?? a9 = new u.A(2);
                            a9.a(obj2);
                            a9.a(r10);
                            r10 = a9;
                        }
                    }
                    if (r11 == true) {
                        int i13 = ~iF;
                        e10.f22670b[i13] = n6;
                        e10.f22671c[i13] = r10;
                    } else {
                        e10.f22671c[iF] = r10;
                    }
                }
                return new p011b0.a(e10);
            case 7:
                Z.s0 s0Var = (Z.s0) this.f9073s;
                synchronized (s0Var.f10789b) {
                    interfaceC0388fY = s0Var.y();
                    if (((Z.p0) s0Var.f10805t.getValue()).compareTo(Z.p0.f10759s) <= 0) {
                        Throwable th = s0Var.f10791d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (interfaceC0388fY != null) {
                    ((C0389g) interfaceC0388fY).resumeWith(p110k9.y.f19095a);
                }
                return p110k9.y.f19095a;
            case 8:
                Object systemService = ((View) ((android.support.v4.media.session.r) this.f9073s).f11364s).getContext().getSystemService("input_method");
                p251z9.j.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 9:
                return new BaseInputConnection(((Z0.C) this.f9073s).f10876a, false);
            case 10:
                p024c3.e eVar = (p024c3.e) this.f9073s;
                return BigInteger.valueOf(eVar.f13455r).shiftLeft(32).or(BigInteger.valueOf(eVar.f13456s)).shiftLeft(32).or(BigInteger.valueOf(eVar.f13457t));
            case 11:
                p043e1.b bVar = (p043e1.b) this.f9073s;
                C0681f0 c0681f0 = bVar.f15752t;
                if (((p171r0.i) c0681f0.getValue()).f21400a == 9205357640488583168L || p171r0.i.e(((p171r0.i) c0681f0.getValue()).f21400a)) {
                    return null;
                }
                return bVar.f15750r.x(((p171r0.i) c0681f0.getValue()).f21400a);
            case 12:
                p085i0.b bVar2 = (p085i0.b) this.f9073s;
                p085i0.m mVar = bVar2.f16705r;
                Object obj3 = bVar2.f16708u;
                if (obj3 != null) {
                    return mVar.a(bVar2, obj3);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return b();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                PopupLayout popupLayout = (PopupLayout) this.f9073s;
                InterfaceC0219s parentLayoutCoordinates = popupLayout.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.C()) {
                    interfaceC0219s = parentLayoutCoordinates;
                }
                if (interfaceC0219s != null && popupLayout.m3getPopupContentSizebOM6tXw() != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ((p162q0.t) this.f9073s).w0();
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                N9.Y y10 = ((p217w2.a) this.f9073s).f23635l;
                p110k9.y yVar = p110k9.y.f19095a;
                y10.g(yVar);
                return yVar;
            case 17:
                return Float.valueOf(AbstractC1413d.m(((InterfaceC0402u) this.f9073s).getCoroutineContext()));
            case 18:
                p223x.X x9 = (p223x.X) this.f9073s;
                p223x.q0 q0Var = x9.f23918v;
                x9.f23919w = q0Var != null ? ((Number) q0Var.f24074l.getValue()).longValue() : 0L;
                return p110k9.y.f19095a;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                p224x0.I i14 = (p224x0.I) this.f9073s;
                int i15 = i14.f24159k;
                C0675c0 c0675c0 = i14.f24157h;
                if (i15 == c0675c0.g()) {
                    c0675c0.h(c0675c0.g() + 1);
                }
                return p110k9.y.f19095a;
            case 20:
                ((AbstractC1450d) this.f9073s).f24489M.invoke();
                return Boolean.TRUE;
            case 21:
                p241y9.a aVar2 = ((C1466u) this.f9073s).f24586Y;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Boolean.TRUE;
            case 22:
                return Boolean.valueOf(((C1471z) this.f9073s).f24613M.z0(7));
            case 23:
                p232y.k0 k0Var = (p232y.k0) this.f9073s;
                C1453g c1453g = (C1453g) AbstractC0283f.i(k0Var, p232y.Y.f24465a);
                k0Var.Q = c1453g;
                k0Var.R = c1453g != null ? new C1452f(c1453g.f24513a, c1453g.f24514b, c1453g.f24515c, c1453g.f24516d) : null;
                return p110k9.y.f19095a;
            default:
                ((p251z9.k) this.f9073s).invoke();
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557f1(C0698o c0698o, Z.W w9) {
        super(0);
        this.f9072r = 5;
        this.f9073s = c0698o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0557f1(p241y9.a aVar) {
        super(0);
        this.f9072r = 24;
        this.f9073s = (p251z9.k) aVar;
    }
}
