package p181s2;

import A4.l;
import B0.c;
import D.e0;
import G4.f;
import G4.m;
import H0.C0210i;
import H0.C0211j;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.A0;
import R0.n;
import W.C0602u;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.X;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p085i0.g;
import p093j0.r;
import p173r2.j;
import p173r2.v;
import p180s0.C1303l;
import p215w0.b;
import p232y.I;
import p241y9.a;
import p241y9.e;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final void a(q qVar, C0698o c0698o, int i10) {
        r rVar;
        c0698o.V(294589392);
        if ((((c0698o.i(qVar) ? 4 : 2) | i10) & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            g gVarY = c.Y(c0698o);
            X xL = C0672b.l(qVar.b().f21459e, c0698o);
            List list = (List) xL.getValue();
            boolean zBooleanValue = ((Boolean) c0698o.k(A0.f4865a)).booleanValue();
            boolean zG = c0698o.g(list);
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            Object obj2 = objH;
            if (zG || objH == obj) {
                r rVar2 = new r();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    j jVar = (j) obj3;
                    if (zBooleanValue || jVar.f21448y.j.f12672c.compareTo(EnumC0767p.f12664u) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                rVar2.addAll(arrayList);
                c0698o.e0(rVar2);
                obj2 = rVar2;
            }
            r rVar3 = (r) obj2;
            c(rVar3, (List) xL.getValue(), c0698o, 0);
            X xL2 = C0672b.l(qVar.b().f21460f, c0698o);
            Object objH2 = c0698o.H();
            if (objH2 == obj) {
                objH2 = new r();
                c0698o.e0(objH2);
            }
            r rVar4 = (r) objH2;
            c0698o.T(-367418626);
            ListIterator listIterator = rVar3.listIterator();
            while (true) {
                J0.r rVar5 = (J0.r) listIterator;
                if (!rVar5.hasNext()) {
                    break;
                }
                j jVar2 = (j) rVar5.next();
                v vVar = jVar2.f21442s;
                p251z9.j.c(vVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                p pVar = (p) vVar;
                boolean zI = c0698o.i(qVar) | c0698o.i(jVar2);
                Object objH3 = c0698o.H();
                if (zI || objH3 == obj) {
                    objH3 = new f(27, qVar, jVar2);
                    c0698o.e0(objH3);
                }
                AbstractC0813f2.a((a) objH3, pVar.f22088w, p074h0.j.d(1129586364, new n(jVar2, qVar, gVarY, rVar4, pVar), c0698o), c0698o, 384);
            }
            c0698o.p(false);
            Set set = (Set) xL2.getValue();
            boolean zG2 = c0698o.g(xL2) | c0698o.i(qVar);
            Object objH4 = c0698o.H();
            if (zG2 || objH4 == obj) {
                rVar = rVar4;
                Object lVar = new l(xL2, qVar, rVar, null, 8);
                c0698o.e0(lVar);
                objH4 = lVar;
            } else {
                rVar = rVar4;
            }
            C0672b.g(set, rVar, (e) objH4, c0698o);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new m(i10, 12, qVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void b(b bVar, String str, l0.r rVar, l0.e eVar, C0210i c0210i, float f3, C1303l c1303l, C0698o c0698o, int i10, int i11) {
        l0.r rVar2;
        int i12;
        int i13;
        C1303l c1303l2;
        int i14;
        int i15;
        boolean z10;
        l0.e eVar2;
        C0210i c0210i2;
        l0.r rVar3;
        float f7;
        C1303l c1303l3;
        C0699o0 c0699o0R;
        l0.r rVarA;
        int i16;
        C0286i c0286i;
        C0285h c0285h;
        boolean z11;
        Object objH;
        c0698o.V(1142754848);
        int i17 = (c0698o.i(bVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i17 |= c0698o.g(str) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i17 |= c0698o.g(rVar2) ? 256 : 128;
            }
            i12 = 224256 | i17;
            i13 = i11 & 64;
            if (i13 != 0) {
                i15 = i17 | 1797120;
                c1303l2 = c1303l;
            } else {
                c1303l2 = c1303l;
                if (c0698o.g(c1303l2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i15 = i12 | i14;
            }
            if ((599187 & i15) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0698o.K(i15 & 1, z10)) {
                rVarA = l0.o.f19333a;
                if (i18 != 0) {
                    rVar2 = rVarA;
                }
                eVar2 = l0.c.f19317v;
                if (i13 != 0) {
                    c1303l2 = null;
                }
                if (str != null) {
                    c0698o.T(1040425059);
                    if ((i15 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objH = c0698o.H();
                    if (z11 || objH == C0690k.f10683a) {
                        objH = new n(str, 8);
                        c0698o.e0(objH);
                    }
                    rVarA = R0.m.a(rVarA, false, (p241y9.c) objH);
                    c0698o.p(false);
                } else {
                    c0698o.T(1040583841);
                    c0698o.p(false);
                }
                l0.r rVarD = androidx.compose.ui.draw.a.d(B1.n(rVar2.b(rVarA)), bVar, 1.0f, c1303l2, 2);
                i16 = c0698o.f10721P;
                l0.r rVarC = l0.a.c(c0698o, rVarD);
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                InterfaceC0288k.f4142a.getClass();
                c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, I.f24434a, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                c0285h = C0287j.g;
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i16))) {
                    p123m2.c.y(i16, c0698o, i16, c0285h);
                }
                c0698o.p(true);
                c0210i2 = C0211j.f3203a;
                rVar3 = rVar2;
                f7 = 1.0f;
            } else {
                c0698o.N();
                eVar2 = eVar;
                c0210i2 = c0210i;
                rVar3 = rVar2;
                f7 = f3;
            }
            c1303l3 = c1303l2;
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0602u(bVar, str, rVar3, eVar2, c0210i2, f7, c1303l3, i10, i11);
            }
        }
        i17 |= 384;
        rVar2 = rVar;
        i12 = 224256 | i17;
        i13 = i11 & 64;
        if (i13 != 0) {
            i15 = i17 | 1797120;
            c1303l2 = c1303l;
        } else {
            c1303l2 = c1303l;
            if (c0698o.g(c1303l2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i15 = i12 | i14;
        }
        if ((599187 & i15) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0698o.K(i15 & 1, z10)) {
            rVarA = l0.o.f19333a;
            if (i18 != 0) {
                rVar2 = rVarA;
            }
            eVar2 = l0.c.f19317v;
            if (i13 != 0) {
                c1303l2 = null;
            }
            if (str != null) {
                c0698o.T(1040425059);
                if ((i15 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objH = c0698o.H();
                if (z11) {
                    objH = new n(str, 8);
                    c0698o.e0(objH);
                } else {
                    objH = new n(str, 8);
                    c0698o.e0(objH);
                }
                rVarA = R0.m.a(rVarA, false, (p241y9.c) objH);
                c0698o.p(false);
            } else {
                c0698o.T(1040583841);
                c0698o.p(false);
            }
            l0.r rVarD2 = androidx.compose.ui.draw.a.d(B1.n(rVar2.b(rVarA)), bVar, 1.0f, c1303l2, 2);
            i16 = c0698o.f10721P;
            l0.r rVarC2 = l0.a.c(c0698o, rVarD2);
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            InterfaceC0288k.f4142a.getClass();
            c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, I.f24434a, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M2, C0287j.f4118e);
            C0672b.v(c0698o, rVarC2, C0287j.f4117d);
            c0285h = C0287j.g;
            if (c0698o.f10720O) {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            } else {
                p123m2.c.y(i16, c0698o, i16, c0285h);
            }
            c0698o.p(true);
            c0210i2 = C0211j.f3203a;
            rVar3 = rVar2;
            f7 = 1.0f;
        } else {
            c0698o.N();
            eVar2 = eVar;
            c0210i2 = c0210i;
            rVar3 = rVar2;
            f7 = f3;
        }
        c1303l3 = c1303l2;
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0602u(bVar, str, rVar3, eVar2, c0210i2, f7, c1303l3, i10, i11);
        }
    }

    public static final void c(final List list, Collection collection, C0698o c0698o, int i10) {
        c0698o.V(1537894851);
        if ((((c0698o.i(list) ? 4 : 2) | i10 | (c0698o.i(collection) ? 32 : 16)) & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            final boolean zBooleanValue = ((Boolean) c0698o.k(A0.f4865a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final j jVar = (j) it.next();
                w wVar = jVar.f21448y.j;
                boolean zH = c0698o.h(zBooleanValue) | c0698o.i(list) | c0698o.i(jVar);
                Object objH = c0698o.H();
                if (zH || objH == C0690k.f10683a) {
                    objH = new p241y9.c() { // from class: s2.l
                        @Override // p241y9.c
                        public final Object e(Object obj) {
                            final List list2 = list;
                            final j jVar2 = jVar;
                            final boolean z10 = zBooleanValue;
                            InterfaceC0769s interfaceC0769s = new InterfaceC0769s() { // from class: s2.k
                                @Override // androidx.lifecycle.InterfaceC0769s
                                public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
                                    boolean z11 = z10;
                                    List list3 = list2;
                                    j jVar3 = jVar2;
                                    if (z11 && !list3.contains(jVar3)) {
                                        list3.add(jVar3);
                                    }
                                    if (enumC0766o == EnumC0766o.ON_START && !list3.contains(jVar3)) {
                                        list3.add(jVar3);
                                    }
                                    if (enumC0766o == EnumC0766o.ON_STOP) {
                                        list3.remove(jVar3);
                                    }
                                }
                            };
                            jVar2.f21448y.j.a(interfaceC0769s);
                            return new e0(7, jVar2, interfaceC0769s);
                        }
                    };
                    c0698o.e0(objH);
                }
                C0672b.d(wVar, (p241y9.c) objH, c0698o);
            }
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 11, list, collection);
        }
    }

    public static final k d(p124m3.j jVar) {
        p251z9.j.e(jVar, "<this>");
        return new k(jVar.f19595m, jVar.f19586b, jVar.f19585a);
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                p110k9.a.a(th, th2);
            }
        }
    }

    public static final k f(k kVar, int i10) {
        p251z9.j.e(kVar, "<this>");
        int i11 = kVar.f24796r;
        int i12 = kVar.f24797s;
        int i13 = kVar.f24798t;
        k kVar2 = new k(i11, i12 + 1, i13 + 1);
        if (i12 + 1 > i10) {
            return i11 + 1 > 114 ? kVar : new k(i11 + 1, 1, i13 + 1);
        }
        return kVar2;
    }
}
