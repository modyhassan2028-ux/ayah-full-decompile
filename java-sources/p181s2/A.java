package p181s2;

import A.C0027k;
import A.C0029l;
import B3.f;
import E2.C0112b;
import E2.C0124h;
import E2.C0127i0;
import G4.i;
import G9.m;
import X.C0641m;
import Z.C0672b;
import Z.C0673b0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.L0;
import Z.S;
import Z.X;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.p;
import android.util.Log;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import l0.e;
import l0.j;
import l0.o;
import l0.r;
import p085i0.g;
import p087i2.a;
import p120l9.k;
import p120l9.w;
import p173r2.C;
import p173r2.D;
import p173r2.G;
import p173r2.H;
import p173r2.n;
import p173r2.u;
import p173r2.v;
import p173r2.x;
import p173r2.y;
import p197u2.h;
import p214w.C1401n;
import p223x.q0;
import p223x.t0;
import p241y9.c;
import u.AbstractC1361p;
import u.I;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static final void a(p173r2.A a9, r rVar, e eVar, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, C0698o c0698o, int i10) {
        c cVar6;
        c cVar7;
        int i11;
        e eVar2;
        r rVar2;
        c cVar8;
        c cVar9;
        c cVar10;
        c cVar11;
        e eVar3;
        c0698o.V(1840250294);
        int i12 = i10 | (c0698o.i(a9) ? 4 : 2) | 844852608;
        char c10 = c0698o.i(cVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i12) == 306783378 && (c10 & 3) == 2 && c0698o.x()) {
            c0698o.N();
            rVar2 = rVar;
            eVar3 = eVar;
            cVar8 = cVar;
            cVar9 = cVar2;
            cVar10 = cVar3;
            cVar11 = cVar4;
        } else {
            c0698o.P();
            int i13 = i10 & 1;
            S s10 = C0690k.f10683a;
            if (i13 == 0 || c0698o.w()) {
                j jVar = l0.c.f19313r;
                Object objH = c0698o.H();
                if (objH == s10) {
                    objH = new m(26);
                    c0698o.e0(objH);
                }
                cVar6 = (c) objH;
                Object objH2 = c0698o.H();
                if (objH2 == s10) {
                    objH2 = new m(28);
                    c0698o.e0(objH2);
                }
                cVar7 = (c) objH2;
                i11 = i12 & (-264241153);
                eVar2 = jVar;
                rVar2 = o.f19333a;
                cVar8 = cVar6;
                cVar9 = cVar7;
            } else {
                c0698o.N();
                rVar2 = rVar;
                cVar9 = cVar2;
                cVar6 = cVar3;
                cVar7 = cVar4;
                i11 = i12 & (-264241153);
                eVar2 = eVar;
                cVar8 = cVar;
            }
            c0698o.q();
            boolean z10 = (c10 & 14) == 4;
            Object objH3 = c0698o.H();
            if (z10 || objH3 == s10) {
                y yVar = new y(a9.f21412b.f22865s);
                cVar5.e(yVar);
                objH3 = yVar.c();
                c0698o.e0(objH3);
            }
            cVar10 = cVar6;
            cVar11 = cVar7;
            eVar3 = eVar2;
            b(a9, (x) objH3, rVar2, eVar3, cVar8, cVar9, cVar10, cVar11, c0698o, (i11 & 8078) | 100884480);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i(a9, rVar2, eVar3, cVar8, cVar9, cVar10, cVar11, cVar5, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0493  */
    /* JADX WARN: Code duplicated, block: B:230:0x0497  */
    /* JADX WARN: Code duplicated, block: B:232:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:233:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:234:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:249:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:250:0x050a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0515  */
    /* JADX WARN: Code duplicated, block: B:268:0x0576 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x0578  */
    /* JADX WARN: Code duplicated, block: B:270:0x057a  */
    /* JADX WARN: Code duplicated, block: B:273:0x057f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0587  */
    /* JADX WARN: Code duplicated, block: B:279:0x0599  */
    /* JADX WARN: Code duplicated, block: B:281:0x05a6 A[LOOP:10: B:277:0x0596->B:281:0x05a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:287:0x0601  */
    /* JADX WARN: Code duplicated, block: B:289:0x0607  */
    /* JADX WARN: Code duplicated, block: B:290:0x060a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0615  */
    /* JADX WARN: Code duplicated, block: B:294:0x061c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0622 A[LOOP:12: B:297:0x0622->B:299:0x0631, LOOP_START, PHI: r12
      0x0622: PHI (r12v11 r2.v) = (r12v10 r2.v), (r12v13 r2.v) binds: [B:295:0x061e, B:299:0x0631] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:299:0x0631 A[LOOP:12: B:297:0x0622->B:299:0x0631, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x063d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0689  */
    /* JADX WARN: Code duplicated, block: B:338:0x0772  */
    /* JADX WARN: Code duplicated, block: B:339:0x0776  */
    /* JADX WARN: Code duplicated, block: B:341:0x0779  */
    /* JADX WARN: Code duplicated, block: B:343:0x077f  */
    /* JADX WARN: Code duplicated, block: B:345:0x0799  */
    /* JADX WARN: Code duplicated, block: B:347:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:350:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:353:0x07df  */
    /* JADX WARN: Code duplicated, block: B:354:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:360:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:364:0x0825  */
    /* JADX WARN: Code duplicated, block: B:367:0x0844  */
    /* JADX WARN: Code duplicated, block: B:370:0x0869  */
    /* JADX WARN: Code duplicated, block: B:373:0x0879  */
    /* JADX WARN: Code duplicated, block: B:383:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:384:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:390:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:401:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:402:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:408:0x0905  */
    /* JADX WARN: Code duplicated, block: B:411:0x091d  */
    /* JADX WARN: Code duplicated, block: B:412:0x0920  */
    /* JADX WARN: Code duplicated, block: B:416:0x0929  */
    /* JADX WARN: Code duplicated, block: B:420:0x0943  */
    /* JADX WARN: Code duplicated, block: B:423:0x0958  */
    /* JADX WARN: Code duplicated, block: B:426:0x0976  */
    /* JADX WARN: Code duplicated, block: B:431:0x099e  */
    /* JADX WARN: Code duplicated, block: B:434:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:439:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:453:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:457:0x0add  */
    /* JADX WARN: Code duplicated, block: B:460:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:461:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:463:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:465:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:467:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:499:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x05db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x065e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x063b A[EDGE_INSN: B:516:0x063b->B:300:0x063b BREAK  A[LOOP:12: B:297:0x0622->B:299:0x0631], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:249:0x04ea, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final p173r2.A a9, final x xVar, final r rVar, final e eVar, final c cVar, final c cVar2, final c cVar3, final c cVar4, C0698o c0698o, final int i10) {
        InterfaceC0771u interfaceC0771u;
        H h7;
        i iVar;
        H h10;
        G gB;
        final i iVar2;
        C0698o c0698o2;
        X xL;
        Object objH;
        S s10;
        C0673b0 c0673b0;
        Object objH2;
        final X x9;
        boolean z10;
        boolean zG;
        Object objH3;
        X x10;
        InterfaceC0771u interfaceC0771u2;
        boolean zI;
        Object objH4;
        g gVarY;
        X xL2;
        Object objH5;
        L0 l10;
        p173r2.j jVar;
        Object objH6;
        final u.y yVar;
        i iVar3;
        G gB2;
        q qVar;
        C0699o0 c0699o0R;
        q qVar2;
        boolean z11;
        boolean z12;
        Object objH7;
        boolean z13;
        final c cVar5;
        boolean z14;
        boolean z15;
        Object objH8;
        final c cVar6;
        boolean z16;
        Object objH9;
        final c cVar7;
        boolean zI2;
        Object objH10;
        Object objH11;
        p223x.X x11;
        q0 q0VarD;
        boolean zI3;
        Object objH12;
        q0 q0Var;
        p223x.X x12;
        boolean zI4;
        Object objH13;
        final L0 l11;
        u.y yVar2;
        i iVar4;
        Object objH14;
        L0 l12;
        q0 q0Var2;
        boolean zG2;
        Object objH15;
        boolean zG3;
        Object objH16;
        C0699o0 c0699o0R2;
        int[] intArray;
        int[] iArr;
        ArrayList arrayList;
        x xVar2;
        int length;
        int i11;
        String strA;
        int length2;
        Bundle[] bundleArr;
        int i12;
        int i13;
        boolean z17;
        x xVar3;
        int length3;
        int i14;
        int i15;
        Bundle bundle;
        v vVarR;
        x xVar4;
        C0124h c0124h;
        int i16;
        int i17;
        int i18;
        Bundle bundle2;
        v vVarD;
        Bundle bundle3;
        int i19;
        v vVarR2;
        x xVar5;
        x xVar6;
        boolean z18;
        c0698o.V(-1964664536);
        int i20 = (i10 & 6) == 0 ? (c0698o.i(a9) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i20 |= c0698o.i(xVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i20 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i20 |= c0698o.g(eVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i20 |= c0698o.i(cVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i20 |= c0698o.i(cVar2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i20 |= c0698o.i(cVar3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i20 |= c0698o.i(cVar4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i20 |= c0698o.i(null) ? 67108864 : 33554432;
        }
        int i21 = i20;
        if ((38347923 & i21) == 38347922 && c0698o.x()) {
            c0698o.N();
            c0698o2 = c0698o;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            InterfaceC0771u interfaceC0771u3 = (InterfaceC0771u) c0698o.k(a.f16736a);
            V vA = p113l2.a.a(c0698o);
            if (vA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            U uG = vA.g();
            a9.getClass();
            h hVar = a9.f21412b;
            p251z9.j.e(uG, "viewModelStore");
            hVar.getClass();
            H h11 = hVar.f22865s;
            if (!p251z9.j.a(hVar.f22861o, p173r2.i.c(uG))) {
                if (!hVar.f22854f.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                hVar.f22861o = p173r2.i.c(uG);
            }
            p251z9.j.e(xVar, "graph");
            LinkedHashMap linkedHashMap = hVar.f22866t;
            C0124h c0124h2 = xVar.f21502w;
            k<p173r2.j> kVar = hVar.f22854f;
            if (!kVar.isEmpty() && hVar.i() == EnumC0767p.f12661r) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (p251z9.j.a(hVar.f22851c, xVar)) {
                i21 = i21;
                interfaceC0771u = interfaceC0771u3;
                h7 = h11;
                iVar = null;
                int iG = ((P) c0124h2.f1675d).g();
                for (int i22 = 0; i22 < iG; i22++) {
                    v vVar = (v) ((P) c0124h2.f1675d).h(i22);
                    x xVar7 = hVar.f22851c;
                    p251z9.j.b(xVar7);
                    int iE = ((P) xVar7.f21502w.f1675d).e(i22);
                    x xVar8 = hVar.f22851c;
                    p251z9.j.b(xVar8);
                    P p10 = (P) xVar8.f21502w.f1675d;
                    if (p10.f22704r) {
                        AbstractC1361p.a(p10);
                    }
                    int iA = p204v.a.a(p10.f22707u, iE, p10.f22705s);
                    if (iA >= 0) {
                        Object[] objArr = p10.f22706t;
                        Object obj = objArr[iA];
                        objArr[iA] = vVar;
                    }
                }
                for (p173r2.j jVar2 : kVar) {
                    int i23 = v.f21491v;
                    H9.i iVar5 = new H9.i(1, G9.k.e0(p173r2.i.b(jVar2.f21442s)));
                    v vVarR3 = hVar.f22851c;
                    p251z9.j.b(vVarR3);
                    Iterator it = iVar5.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((p093j0.y) it).f18698s;
                        if (listIterator.hasPrevious()) {
                            v vVar2 = (v) listIterator.previous();
                            if (!p251z9.j.a(vVar2, hVar.f22851c) || !p251z9.j.a(vVarR3, xVar)) {
                                if (vVarR3 instanceof x) {
                                    vVarR3 = ((x) vVarR3).f21502w.r(vVar2.f21493s.f1641a);
                                    p251z9.j.b(vVarR3);
                                }
                            }
                        }
                    }
                    p251z9.j.e(vVarR3, "<set-?>");
                    jVar2.f21442s = vVarR3;
                }
            } else {
                x xVar9 = hVar.f22851c;
                if (xVar9 != null) {
                    ArrayList arrayList2 = new ArrayList(hVar.f22858l.keySet());
                    int size = arrayList2.size();
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj2 = arrayList2.get(i24);
                        i24++;
                        Integer num = (Integer) obj2;
                        p251z9.j.b(num);
                        ArrayList arrayList3 = arrayList2;
                        int iIntValue = num.intValue();
                        Iterator it2 = linkedHashMap.values().iterator();
                        while (it2.hasNext()) {
                            ((n) it2.next()).f21458d = true;
                            size = size;
                        }
                        int i25 = size;
                        C0127i0 c0127i0 = new C0127i0();
                        c0127i0.f1681a = -1;
                        c0127i0.f1682b = -1;
                        boolean zQ = hVar.q(iIntValue, null, new C(false, true, -1, false, false, c0127i0.f1681a, c0127i0.f1682b));
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((n) it3.next()).f21458d = false;
                            it3 = it3;
                            zQ = zQ;
                        }
                        if (zQ) {
                            hVar.m(iIntValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        size = i25;
                    }
                    hVar.m(xVar9.f21493s.f1641a, true, false);
                }
                hVar.f22851c = xVar;
                H h12 = hVar.f22865s;
                p173r2.A a10 = hVar.f22849a;
                p013b2.n nVar = a10.f21413c;
                Bundle bundle4 = hVar.f22852d;
                if (bundle4 != null && bundle4.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        F9.n.J("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        String str = stringArrayList.get(i26);
                        i26++;
                        ArrayList<String> arrayList4 = stringArrayList;
                        String str2 = str;
                        h12.b(str2);
                        if (bundle4.containsKey(str2)) {
                            B9.a.F(str2, bundle4);
                        }
                        stringArrayList = arrayList4;
                    }
                }
                Bundle[] bundleArr2 = hVar.f22853e;
                if (bundleArr2 != null) {
                    int length4 = bundleArr2.length;
                    int i27 = 0;
                    while (i27 < length4) {
                        Bundle[] bundleArr3 = bundleArr2;
                        Bundle bundle5 = bundleArr3[i27];
                        int i28 = length4;
                        p251z9.j.e(bundle5, "state");
                        bundle5.setClassLoader(p173r2.k.class.getClassLoader());
                        String string = bundle5.getString("nav-entry-state:id");
                        if (string == null) {
                            F9.n.J("nav-entry-state:id");
                            throw null;
                        }
                        int iC = B9.a.C("nav-entry-state:destination-id", bundle5);
                        Bundle bundleF = B9.a.F("nav-entry-state:args", bundle5);
                        int i29 = i27;
                        Bundle bundleF2 = B9.a.F("nav-entry-state:saved-state", bundle5);
                        v vVarD2 = hVar.d(iC, null);
                        if (vVarD2 == null) {
                            int i30 = v.f21491v;
                            StringBuilder sbD = p.D("Restoring the Navigation back stack failed: destination ", p173r2.i.a(nVar, iC), " cannot be found from the current destination ");
                            sbD.append(hVar.g());
                            throw new IllegalStateException(sbD.toString());
                        }
                        EnumC0767p enumC0767pI = hVar.i();
                        p173r2.o oVar = hVar.f22861o;
                        p251z9.j.e(nVar, "context");
                        p251z9.j.e(enumC0767pI, "hostLifecycleState");
                        Context context = nVar.f13172a;
                        bundleF.setClassLoader(context != null ? context.getClassLoader() : null);
                        p173r2.j jVar3 = new p173r2.j(nVar, vVarD2, bundleF, enumC0767pI, oVar, string, bundleF2);
                        G gB3 = h12.b(vVarD2.f21492r);
                        Object obj3 = linkedHashMap.get(gB3);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            n nVar2 = new n(a10, gB3);
                            linkedHashMap.put(gB3, nVar2);
                            obj4 = nVar2;
                        }
                        kVar.addLast(jVar3);
                        ((n) obj4).a(jVar3);
                        x xVar10 = jVar3.f21442s.f21494t;
                        if (xVar10 != null) {
                            hVar.k(jVar3, hVar.f(xVar10.f21493s.f1641a));
                        }
                        i27 = i29 + 1;
                        bundleArr2 = bundleArr3;
                        length4 = i28;
                    }
                    hVar.f22850b.invoke();
                    hVar.f22853e = null;
                }
                Collection collectionValues = w.k0(h12.f21434a).values();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : collectionValues) {
                    if (!((G) obj5).f21432b) {
                        arrayList5.add(obj5);
                    }
                }
                int size3 = arrayList5.size();
                int i31 = 0;
                while (i31 < size3) {
                    Object obj6 = arrayList5.get(i31);
                    i31++;
                    G g = (G) obj6;
                    Object nVar3 = linkedHashMap.get(g);
                    if (nVar3 == null) {
                        p251z9.j.e(g, "navigator");
                        nVar3 = new n(a10, g);
                        linkedHashMap.put(g, nVar3);
                    }
                    g.getClass();
                    g.f21431a = (n) nVar3;
                    g.f21432b = true;
                }
                if (hVar.f22851c == null || !kVar.isEmpty()) {
                    i21 = i21;
                    interfaceC0771u = interfaceC0771u3;
                    h7 = h11;
                    iVar = null;
                    hVar.b();
                } else {
                    Activity activity = a10.f21414d;
                    if (a10.f21415e || activity == null) {
                        i21 = i21;
                        interfaceC0771u = interfaceC0771u3;
                        h7 = h11;
                        x xVar11 = hVar.f22851c;
                        p251z9.j.b(xVar11);
                        iVar = null;
                        hVar.l(xVar11, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        h hVar2 = a10.f21412b;
                        if (intent == null) {
                            i21 = i21;
                            interfaceC0771u = interfaceC0771u3;
                            h7 = h11;
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e10) {
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                bundleP.putAll(bundle6);
                            }
                            if (intArray == null || intArray.length == 0) {
                                x xVarJ = hVar2.j();
                                interfaceC0771u = interfaceC0771u3;
                                h7 = h11;
                                u uVarE = xVarJ.e(new p074h0.i(13, intent.getData(), intent.getAction(), intent.getType()), xVarJ);
                                if (uVarE != null) {
                                    v vVar3 = uVarE.f21486r;
                                    k kVar2 = new k();
                                    v vVar4 = vVar3;
                                    while (true) {
                                        C0112b c0112b = vVar4.f21493s;
                                        x xVar12 = vVar4.f21494t;
                                        if (xVar12 == null || xVar12.f21502w.f1673b != c0112b.f1641a) {
                                            kVar2.addFirst(vVar4);
                                        }
                                        if (p251z9.j.a(xVar12, null) || xVar12 == null) {
                                            break;
                                        } else {
                                            vVar4 = xVar12;
                                        }
                                    }
                                    List listC0 = p120l9.m.C0(kVar2);
                                    ArrayList arrayList6 = new ArrayList(p120l9.n.a0(listC0, 10));
                                    Iterator it4 = listC0.iterator();
                                    while (it4.hasNext()) {
                                        arrayList6.add(Integer.valueOf(((v) it4.next()).f21493s.f1641a));
                                    }
                                    int[] iArrB0 = p120l9.m.B0(arrayList6);
                                    Bundle bundleB = vVar3.b(uVarE.f21487s);
                                    if (bundleB != null) {
                                        bundleP.putAll(bundleB);
                                    }
                                    iArr = iArrB0;
                                    arrayList = null;
                                }
                                if (iArr != null && iArr.length != 0) {
                                    hVar2.getClass();
                                    xVar2 = hVar2.f22851c;
                                    length = iArr.length;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < length) {
                                            strA = null;
                                            break;
                                        }
                                        i19 = iArr[i11];
                                        if (i11 == 0) {
                                            xVar6 = hVar2.f22851c;
                                            p251z9.j.b(xVar6);
                                            if (xVar6.f21493s.f1641a == i19) {
                                                vVarR2 = hVar2.f22851c;
                                            } else {
                                                vVarR2 = null;
                                            }
                                        } else {
                                            p251z9.j.b(xVar2);
                                            vVarR2 = xVar2.f21502w.r(i19);
                                        }
                                        if (vVarR2 == null) {
                                            int i32 = v.f21491v;
                                            strA = p173r2.i.a(hVar2.f22849a.f21413c, i19);
                                            break;
                                        }
                                        if (i11 == iArr.length - 1 && (vVarR2 instanceof x)) {
                                            while (true) {
                                                xVar5 = (x) vVarR2;
                                                p251z9.j.b(xVar5);
                                                C0124h c0124h3 = xVar5.f21502w;
                                                if (!(c0124h3.r(c0124h3.f1673b) instanceof x)) {
                                                    break;
                                                } else {
                                                    vVarR2 = c0124h3.r(c0124h3.f1673b);
                                                }
                                            }
                                            xVar2 = xVar5;
                                        }
                                        i11++;
                                    }
                                    if (strA != null) {
                                        String str3 = "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent;
                                        p251z9.j.e(str3, "message");
                                        Log.i("NavController", str3);
                                    } else {
                                        bundleP.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        length2 = iArr.length;
                                        bundleArr = new Bundle[length2];
                                        for (i12 = 0; i12 < length2; i12++) {
                                            Bundle bundleP2 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                                            bundleP2.putAll(bundleP);
                                            if (arrayList == null && (bundle3 = (Bundle) arrayList.get(i12)) != null) {
                                                bundleP2.putAll(bundle3);
                                            }
                                            bundleArr[i12] = bundleP2;
                                        }
                                        int flags = intent.getFlags();
                                        i13 = 268435456 & flags;
                                        if (i13 == 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            p216w1.w wVar = new p216w1.w(a10.f21411a);
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(wVar.f23625s.getPackageManager());
                                            }
                                            if (component != null) {
                                                wVar.b(component);
                                            }
                                            wVar.f23624r.add(intent);
                                            wVar.c();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else {
                                            if (i13 != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                if (!hVar2.f22854f.isEmpty()) {
                                                    x xVar13 = hVar2.f22851c;
                                                    p251z9.j.b(xVar13);
                                                    hVar2.m(xVar13.f21493s.f1641a, true, false);
                                                }
                                                i16 = 0;
                                                while (i16 < iArr.length) {
                                                    i17 = iArr[i16];
                                                    i18 = i16 + 1;
                                                    bundle2 = bundleArr[i16];
                                                    vVarD = hVar2.d(i17, null);
                                                    if (vVarD == null) {
                                                        int i33 = v.f21491v;
                                                        StringBuilder sbD2 = p.D("Deep Linking failed: destination ", p173r2.i.a(nVar, i17), " cannot be found from the current destination ");
                                                        sbD2.append(hVar2.g());
                                                        throw new IllegalStateException(sbD2.toString());
                                                    }
                                                    A3.e eVar2 = new A3.e(12, vVarD, a10);
                                                    D d5 = new D();
                                                    eVar2.e(d5);
                                                    boolean z19 = d5.f21424b;
                                                    int i34 = d5.f21425c;
                                                    boolean z20 = d5.f21426d;
                                                    C0127i0 c0127i1 = d5.f21423a;
                                                    hVar2.l(vVarD, bundle2, new C(z19, false, i34, false, z20, c0127i1.f1681a, c0127i1.f1682b));
                                                    i16 = i18;
                                                }
                                                a10.f21415e = true;
                                            } else {
                                                xVar3 = hVar2.f22851c;
                                                length3 = iArr.length;
                                                for (i14 = 0; i14 < length3; i14++) {
                                                    i15 = iArr[i14];
                                                    bundle = bundleArr[i14];
                                                    if (i14 == 0) {
                                                        vVarR = hVar2.f22851c;
                                                    } else {
                                                        p251z9.j.b(xVar3);
                                                        vVarR = xVar3.f21502w.r(i15);
                                                    }
                                                    if (vVarR == null) {
                                                        int i35 = v.f21491v;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + p173r2.i.a(nVar, i15) + " cannot be found in graph " + xVar3);
                                                    }
                                                    if (i14 == iArr.length - 1) {
                                                        x xVar14 = hVar2.f22851c;
                                                        p251z9.j.b(xVar14);
                                                        hVar2.l(vVarR, bundle, new C(false, false, xVar14.f21493s.f1641a, true, false, 0, 0));
                                                    } else if (vVarR instanceof x) {
                                                        while (true) {
                                                            xVar4 = (x) vVarR;
                                                            p251z9.j.b(xVar4);
                                                            c0124h = xVar4.f21502w;
                                                            if (!(c0124h.r(c0124h.f1673b) instanceof x)) {
                                                                break;
                                                            } else {
                                                                vVarR = c0124h.r(c0124h.f1673b);
                                                            }
                                                        }
                                                        xVar3 = xVar4;
                                                    }
                                                }
                                                a10.f21415e = true;
                                            }
                                        }
                                        iVar = null;
                                    }
                                }
                            } else {
                                interfaceC0771u = interfaceC0771u3;
                                h7 = h11;
                            }
                            arrayList = parcelableArrayList;
                            iArr = intArray;
                            if (iArr != null) {
                                hVar2.getClass();
                                xVar2 = hVar2.f22851c;
                                length = iArr.length;
                                i11 = 0;
                                while (true) {
                                    if (i11 < length) {
                                        strA = null;
                                        break;
                                    }
                                    i19 = iArr[i11];
                                    if (i11 == 0) {
                                        xVar6 = hVar2.f22851c;
                                        p251z9.j.b(xVar6);
                                        if (xVar6.f21493s.f1641a == i19) {
                                            vVarR2 = hVar2.f22851c;
                                        } else {
                                            vVarR2 = null;
                                        }
                                    } else {
                                        p251z9.j.b(xVar2);
                                        vVarR2 = xVar2.f21502w.r(i19);
                                    }
                                    if (vVarR2 == null) {
                                        int i36 = v.f21491v;
                                        strA = p173r2.i.a(hVar2.f22849a.f21413c, i19);
                                        break;
                                    } else {
                                        if (i11 == iArr.length - 1) {
                                        }
                                        i11++;
                                    }
                                }
                                if (strA != null) {
                                    String str4 = "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent;
                                    p251z9.j.e(str4, "message");
                                    Log.i("NavController", str4);
                                } else {
                                    bundleP.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    length2 = iArr.length;
                                    bundleArr = new Bundle[length2];
                                    while (i12 < length2) {
                                        Bundle bundleP3 = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                                        bundleP3.putAll(bundleP);
                                        if (arrayList == null) {
                                        }
                                        bundleArr[i12] = bundleP3;
                                    }
                                    int flags2 = intent.getFlags();
                                    i13 = 268435456 & flags2;
                                    if (i13 == 0) {
                                        if (i13 != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            if (!hVar2.f22854f.isEmpty()) {
                                                x xVar15 = hVar2.f22851c;
                                                p251z9.j.b(xVar15);
                                                hVar2.m(xVar15.f21493s.f1641a, true, false);
                                            }
                                            i16 = 0;
                                            while (i16 < iArr.length) {
                                                i17 = iArr[i16];
                                                i18 = i16 + 1;
                                                bundle2 = bundleArr[i16];
                                                vVarD = hVar2.d(i17, null);
                                                if (vVarD == null) {
                                                    int i37 = v.f21491v;
                                                    StringBuilder sbD3 = p.D("Deep Linking failed: destination ", p173r2.i.a(nVar, i17), " cannot be found from the current destination ");
                                                    sbD3.append(hVar2.g());
                                                    throw new IllegalStateException(sbD3.toString());
                                                }
                                                A3.e eVar3 = new A3.e(12, vVarD, a10);
                                                D d9 = new D();
                                                eVar3.e(d9);
                                                boolean z110 = d9.f21424b;
                                                int i38 = d9.f21425c;
                                                boolean z21 = d9.f21426d;
                                                C0127i0 c0127i2 = d9.f21423a;
                                                hVar2.l(vVarD, bundle2, new C(z110, false, i38, false, z21, c0127i2.f1681a, c0127i2.f1682b));
                                                i16 = i18;
                                            }
                                            a10.f21415e = true;
                                        } else {
                                            xVar3 = hVar2.f22851c;
                                            length3 = iArr.length;
                                            while (i14 < length3) {
                                                i15 = iArr[i14];
                                                bundle = bundleArr[i14];
                                                if (i14 == 0) {
                                                    vVarR = hVar2.f22851c;
                                                } else {
                                                    p251z9.j.b(xVar3);
                                                    vVarR = xVar3.f21502w.r(i15);
                                                }
                                                if (vVarR == null) {
                                                    int i39 = v.f21491v;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + p173r2.i.a(nVar, i15) + " cannot be found in graph " + xVar3);
                                                }
                                                if (i14 == iArr.length - 1) {
                                                    x xVar16 = hVar2.f22851c;
                                                    p251z9.j.b(xVar16);
                                                    hVar2.l(vVarR, bundle, new C(false, false, xVar16.f21493s.f1641a, true, false, 0, 0));
                                                } else if (vVarR instanceof x) {
                                                    while (true) {
                                                        xVar4 = (x) vVarR;
                                                        p251z9.j.b(xVar4);
                                                        c0124h = xVar4.f21502w;
                                                        if (!(c0124h.r(c0124h.f1673b) instanceof x)) {
                                                            break;
                                                            break;
                                                        }
                                                        vVarR = c0124h.r(c0124h.f1673b);
                                                    }
                                                    xVar3 = xVar4;
                                                }
                                            }
                                            a10.f21415e = true;
                                        }
                                    } else {
                                        if (i13 != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            if (!hVar2.f22854f.isEmpty()) {
                                                x xVar17 = hVar2.f22851c;
                                                p251z9.j.b(xVar17);
                                                hVar2.m(xVar17.f21493s.f1641a, true, false);
                                            }
                                            i16 = 0;
                                            while (i16 < iArr.length) {
                                                i17 = iArr[i16];
                                                i18 = i16 + 1;
                                                bundle2 = bundleArr[i16];
                                                vVarD = hVar2.d(i17, null);
                                                if (vVarD == null) {
                                                    int i310 = v.f21491v;
                                                    StringBuilder sbD4 = p.D("Deep Linking failed: destination ", p173r2.i.a(nVar, i17), " cannot be found from the current destination ");
                                                    sbD4.append(hVar2.g());
                                                    throw new IllegalStateException(sbD4.toString());
                                                }
                                                A3.e eVar4 = new A3.e(12, vVarD, a10);
                                                D d10 = new D();
                                                eVar4.e(d10);
                                                boolean z111 = d10.f21424b;
                                                int i311 = d10.f21425c;
                                                boolean z22 = d10.f21426d;
                                                C0127i0 c0127i3 = d10.f21423a;
                                                hVar2.l(vVarD, bundle2, new C(z111, false, i311, false, z22, c0127i3.f1681a, c0127i3.f1682b));
                                                i16 = i18;
                                            }
                                            a10.f21415e = true;
                                        } else {
                                            xVar3 = hVar2.f22851c;
                                            length3 = iArr.length;
                                            while (i14 < length3) {
                                                i15 = iArr[i14];
                                                bundle = bundleArr[i14];
                                                if (i14 == 0) {
                                                    vVarR = hVar2.f22851c;
                                                } else {
                                                    p251z9.j.b(xVar3);
                                                    vVarR = xVar3.f21502w.r(i15);
                                                }
                                                if (vVarR == null) {
                                                    int i312 = v.f21491v;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + p173r2.i.a(nVar, i15) + " cannot be found in graph " + xVar3);
                                                }
                                                if (i14 == iArr.length - 1) {
                                                    x xVar18 = hVar2.f22851c;
                                                    p251z9.j.b(xVar18);
                                                    hVar2.l(vVarR, bundle, new C(false, false, xVar18.f21493s.f1641a, true, false, 0, 0));
                                                } else if (vVarR instanceof x) {
                                                    while (true) {
                                                        xVar4 = (x) vVarR;
                                                        p251z9.j.b(xVar4);
                                                        c0124h = xVar4.f21502w;
                                                        if (!(c0124h.r(c0124h.f1673b) instanceof x)) {
                                                            break;
                                                            break;
                                                        }
                                                        vVarR = c0124h.r(c0124h.f1673b);
                                                    }
                                                    xVar3 = xVar4;
                                                }
                                            }
                                            a10.f21415e = true;
                                        }
                                    }
                                    iVar = null;
                                }
                            }
                        }
                        x xVar19 = hVar.f22851c;
                        p251z9.j.b(xVar19);
                        iVar = null;
                        hVar.l(xVar19, null, null);
                    }
                    h10 = h7;
                    gB = h10.b("composable");
                    if (gB instanceof i) {
                        iVar2 = (i) gB;
                    } else {
                        iVar2 = iVar;
                    }
                    if (iVar2 == null) {
                        c0699o0R2 = c0698o.r();
                        if (c0699o0R2 != null) {
                            final int i40 = 2;
                            c0699o0R2.f10749d = new p241y9.e() { // from class: s2.w
                                @Override // p241y9.e
                                public final Object invoke(Object obj7, Object obj8) {
                                    switch (i40) {
                                        case 0:
                                            ((Integer) obj8).getClass();
                                            A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                            break;
                                        case 1:
                                            ((Integer) obj8).getClass();
                                            A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                            break;
                                        default:
                                            ((Integer) obj8).getClass();
                                            A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                            break;
                                    }
                                    return p110k9.y.f19095a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    c0698o2 = c0698o;
                    xL = C0672b.l(iVar2.b().f21459e, c0698o2);
                    objH = c0698o2.H();
                    s10 = C0690k.f10683a;
                    if (objH == s10) {
                        objH = new C0673b0(0.0f);
                        c0698o2.e0(objH);
                    }
                    c0673b0 = (C0673b0) objH;
                    objH2 = c0698o2.H();
                    if (objH2 == s10) {
                        objH2 = C0672b.r(Boolean.FALSE);
                        c0698o2.e0(objH2);
                    }
                    x9 = (X) objH2;
                    if (((List) xL.getValue()).size() > 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zG = c0698o2.g(xL) | c0698o2.i(iVar2);
                    objH3 = c0698o2.H();
                    if (!zG || objH3 == s10) {
                        objH3 = new C0027k(iVar2, xL, c0673b0, x9, null, 7);
                        x10 = xL;
                        c0698o2.e0(objH3);
                    } else {
                        x10 = xL;
                    }
                    p171r0.a.c(z10, (p241y9.e) objH3, c0698o2, 0);
                    interfaceC0771u2 = interfaceC0771u;
                    zI = c0698o2.i(a9) | c0698o2.i(interfaceC0771u2);
                    objH4 = c0698o2.H();
                    if (zI || objH4 == s10) {
                        objH4 = new A3.e(14, a9, interfaceC0771u2);
                        c0698o2.e0(objH4);
                    }
                    C0672b.d(interfaceC0771u2, (c) objH4, c0698o2);
                    gVarY = B0.c.Y(c0698o2);
                    xL2 = C0672b.l(hVar.f22856i, c0698o2);
                    objH5 = c0698o2.H();
                    if (objH5 == s10) {
                        objH5 = C0672b.o(new f(21, xL2));
                        c0698o2.e0(objH5);
                    }
                    l10 = (L0) objH5;
                    jVar = (p173r2.j) p120l9.m.n0((List) l10.getValue());
                    objH6 = c0698o2.H();
                    if (objH6 == s10) {
                        int i41 = I.f22694a;
                        objH6 = new u.y();
                        c0698o2.e0(objH6);
                    }
                    yVar = (u.y) objH6;
                    if (jVar != null) {
                        c0698o2.T(-1797897781);
                        boolean zI5 = c0698o2.i(iVar2) | ((((i21 & 3670016) ^ 1572864) <= 1048576 && c0698o2.g(cVar3)) || (i21 & 1572864) == 1048576);
                        if ((i21 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zI5 | z11;
                        objH7 = c0698o2.H();
                        if (!z12 || objH7 == s10) {
                            final int i42 = 1;
                            z13 = true;
                            c cVar8 = new c() { // from class: s2.u
                                @Override // p241y9.c
                                public final Object e(Object obj7) {
                                    int i43 = i42;
                                    X x13 = x9;
                                    c cVar9 = cVar;
                                    c cVar10 = cVar3;
                                    i iVar6 = iVar2;
                                    C1401n c1401n = (C1401n) obj7;
                                    switch (i43) {
                                        case 0:
                                            v vVar5 = ((p173r2.j) c1401n.a()).f21442s;
                                            p251z9.j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            h hVar3 = (h) vVar5;
                                            if (((Boolean) iVar6.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                                int i44 = v.f21491v;
                                                for (v vVar6 : p173r2.i.b(hVar3)) {
                                                }
                                                return (p214w.H) cVar10.e(c1401n);
                                            }
                                            int i45 = v.f21491v;
                                            for (v vVar7 : p173r2.i.b(hVar3)) {
                                            }
                                            return (p214w.H) cVar9.e(c1401n);
                                        default:
                                            v vVar8 = ((p173r2.j) c1401n.c()).f21442s;
                                            p251z9.j.c(vVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            h hVar4 = (h) vVar8;
                                            if (((Boolean) iVar6.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                                int i46 = v.f21491v;
                                                for (v vVar9 : p173r2.i.b(hVar4)) {
                                                }
                                                return (p214w.G) cVar10.e(c1401n);
                                            }
                                            int i47 = v.f21491v;
                                            for (v vVar10 : p173r2.i.b(hVar4)) {
                                            }
                                            return (p214w.G) cVar9.e(c1401n);
                                    }
                                }
                            };
                            c0698o2.e0(cVar8);
                            objH7 = cVar8;
                        } else {
                            z13 = true;
                        }
                        cVar5 = (c) objH7;
                        boolean zI6 = c0698o2.i(iVar2) | (((((i21 & 29360128) ^ 12582912) > 8388608 || !c0698o2.g(cVar4)) && (i21 & 12582912) != 8388608) ? false : z13);
                        if ((i21 & 458752) == 131072) {
                            z14 = z13;
                        } else {
                            z14 = false;
                        }
                        z15 = zI6 | z14;
                        objH8 = c0698o2.H();
                        if (z15 || objH8 == s10) {
                            final int i43 = 0;
                            c cVar9 = new c() { // from class: s2.u
                                @Override // p241y9.c
                                public final Object e(Object obj7) {
                                    int i44 = i43;
                                    X x13 = x9;
                                    c cVar10 = cVar2;
                                    c cVar11 = cVar4;
                                    i iVar6 = iVar2;
                                    C1401n c1401n = (C1401n) obj7;
                                    switch (i44) {
                                        case 0:
                                            v vVar5 = ((p173r2.j) c1401n.a()).f21442s;
                                            p251z9.j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            h hVar3 = (h) vVar5;
                                            if (((Boolean) iVar6.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                                int i45 = v.f21491v;
                                                for (v vVar6 : p173r2.i.b(hVar3)) {
                                                }
                                                return (p214w.H) cVar11.e(c1401n);
                                            }
                                            int i46 = v.f21491v;
                                            for (v vVar7 : p173r2.i.b(hVar3)) {
                                            }
                                            return (p214w.H) cVar10.e(c1401n);
                                        default:
                                            v vVar8 = ((p173r2.j) c1401n.c()).f21442s;
                                            p251z9.j.c(vVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                            h hVar4 = (h) vVar8;
                                            if (((Boolean) iVar6.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                                int i47 = v.f21491v;
                                                for (v vVar9 : p173r2.i.b(hVar4)) {
                                                }
                                                return (p214w.G) cVar11.e(c1401n);
                                            }
                                            int i48 = v.f21491v;
                                            for (v vVar10 : p173r2.i.b(hVar4)) {
                                            }
                                            return (p214w.G) cVar10.e(c1401n);
                                    }
                                }
                            };
                            c0698o2.e0(cVar9);
                            objH8 = cVar9;
                        }
                        cVar6 = (c) objH8;
                        if ((i21 & 234881024) == 67108864) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        objH9 = c0698o2.H();
                        if (z16 || objH9 == s10) {
                            objH9 = new m(27);
                            c0698o2.e0(objH9);
                        }
                        cVar7 = (c) objH9;
                        Boolean bool = Boolean.TRUE;
                        zI2 = c0698o2.i(iVar2);
                        objH10 = c0698o2.H();
                        if (zI2 || objH10 == s10) {
                            objH10 = new A3.e(13, l10, iVar2);
                            c0698o2.e0(objH10);
                        }
                        C0672b.d(bool, (c) objH10, c0698o2);
                        objH11 = c0698o2.H();
                        if (objH11 == s10) {
                            objH11 = new p223x.X(jVar);
                            c0698o2.e0(objH11);
                        }
                        x11 = (p223x.X) objH11;
                        q0VarD = t0.d(x11, "entry", c0698o2, 56);
                        if (((Boolean) x9.getValue()).booleanValue()) {
                            c0698o2.T(-1795663766);
                            Float fValueOf = Float.valueOf(c0673b0.g());
                            zG3 = c0698o2.g(x10) | c0698o2.i(x11);
                            objH16 = c0698o2.H();
                            if (!zG3 || objH16 == s10) {
                                iVar3 = null;
                                objH16 = new C0641m(x11, x10, c0673b0, false ? 1 : 0, 7);
                                c0698o2.e0(objH16);
                            } else {
                                iVar3 = null;
                            }
                            C0672b.f(c0698o2, fValueOf, (p241y9.e) objH16);
                            c0698o2.p(false);
                            q0Var = q0VarD;
                            x12 = x11;
                        } else {
                            iVar3 = null;
                            z18 = false;
                            c0698o2.T(-1795408729);
                            zI3 = c0698o2.i(x11) | c0698o2.i(jVar) | c0698o2.g(q0VarD);
                            objH12 = c0698o2.H();
                            if (!zI3 || objH12 == s10) {
                                q0Var = q0VarD;
                                x12 = x11;
                                objH12 = new C0029l((Object) x12, (Object) jVar, (Object) q0Var, (p150o9.c) (z18 ? 1 : 0), 10);
                                c0698o2.e0(objH12);
                            } else {
                                q0Var = q0VarD;
                                x12 = x11;
                            }
                            C0672b.f(c0698o2, jVar, (p241y9.e) objH12);
                            c0698o2.p(false);
                        }
                        zI4 = c0698o2.i(yVar) | c0698o2.i(iVar2) | c0698o2.g(cVar5) | c0698o2.g(cVar6) | c0698o2.g(cVar7);
                        objH13 = c0698o2.H();
                        if (!zI4 || objH13 == s10) {
                            final i iVar6 = iVar2;
                            l11 = l10;
                            objH13 = new c() { // from class: s2.v
                                @Override // p241y9.c
                                public final Object e(Object obj7) {
                                    float f3;
                                    C1401n c1401n = (C1401n) obj7;
                                    if (!((List) l11.getValue()).contains(c1401n.a())) {
                                        return androidx.compose.animation.a.c(p214w.G.f23439b, p214w.H.f23441b);
                                    }
                                    String str5 = ((p173r2.j) c1401n.a()).f21446w;
                                    u.y yVar3 = yVar;
                                    int iC2 = yVar3.c(str5);
                                    if (iC2 >= 0) {
                                        f3 = yVar3.f22780c[iC2];
                                    } else {
                                        yVar3.e(str5, 0.0f);
                                        f3 = 0.0f;
                                    }
                                    if (!p251z9.j.a(((p173r2.j) c1401n.c()).f21446w, ((p173r2.j) c1401n.a()).f21446w)) {
                                        f3 = (((Boolean) iVar6.f22072c.getValue()).booleanValue() || ((Boolean) x9.getValue()).booleanValue()) ? f3 - 1.0f : f3 + 1.0f;
                                    }
                                    yVar3.e(((p173r2.j) c1401n.c()).f21446w, f3);
                                    return new p214w.u((p214w.G) cVar5.e(c1401n), (p214w.H) cVar6.e(c1401n), f3, (p214w.P) cVar7.e(c1401n));
                                }
                            };
                            yVar2 = yVar;
                            iVar4 = iVar6;
                            c0698o2.e0(objH13);
                        } else {
                            yVar2 = yVar;
                            l11 = l10;
                            iVar4 = iVar2;
                        }
                        c cVar10 = (c) objH13;
                        objH14 = c0698o2.H();
                        if (objH14 == s10) {
                            objH14 = new m(29);
                            c0698o2.e0(objH14);
                        }
                        l12 = l11;
                        q0Var2 = q0Var;
                        androidx.compose.animation.a.b(q0Var2, rVar, cVar10, eVar, (c) objH14, p074h0.j.d(820763100, new x(x12, jVar, gVarY, x9, l12), c0698o2), c0698o2, ((i21 >> 3) & 112) | 221184 | (i21 & 7168));
                        Object objI = q0Var2.f24065a.i();
                        Object value = q0Var2.f24068d.getValue();
                        zG2 = c0698o2.g(q0Var2) | c0698o2.i(a9) | c0698o2.i(jVar) | c0698o2.i(iVar4) | c0698o2.i(yVar2);
                        objH15 = c0698o2.H();
                        if (zG2 || objH15 == s10) {
                            y yVar3 = new y(q0Var2, a9, jVar, yVar2, l12, iVar4, null);
                            c0698o2.e0(yVar3);
                            objH15 = yVar3;
                        }
                        C0672b.g(objI, value, (p241y9.e) objH15, c0698o2);
                        c0698o2.p(false);
                    } else {
                        iVar3 = iVar;
                        c0698o2.T(-1790256870);
                        c0698o2.p(false);
                    }
                    gB2 = h10.b("dialog");
                    if (gB2 instanceof q) {
                        qVar2 = (q) gB2;
                    } else {
                        qVar = iVar3;
                    }
                    if (qVar == 0) {
                        c0699o0R = c0698o2.r();
                        if (c0699o0R != null) {
                            qVar = qVar2;
                            return;
                        }
                        qVar = qVar2;
                        final int i44 = 0;
                        c0699o0R.f10749d = new p241y9.e() { // from class: s2.w
                            @Override // p241y9.e
                            public final Object invoke(Object obj7, Object obj8) {
                                switch (i44) {
                                    case 0:
                                        ((Integer) obj8).getClass();
                                        A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                        break;
                                    case 1:
                                        ((Integer) obj8).getClass();
                                        A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                        break;
                                    default:
                                        ((Integer) obj8).getClass();
                                        A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                        break;
                                }
                                return p110k9.y.f19095a;
                            }
                        };
                        return;
                    }
                    qVar = qVar2;
                    o.a(qVar, c0698o2, 0);
                }
            }
            h10 = h7;
            gB = h10.b("composable");
            if (gB instanceof i) {
                iVar2 = (i) gB;
            } else {
                iVar2 = iVar;
            }
            if (iVar2 == null) {
                c0699o0R2 = c0698o.r();
                if (c0699o0R2 != null) {
                    final int i45 = 2;
                    c0699o0R2.f10749d = new p241y9.e() { // from class: s2.w
                        @Override // p241y9.e
                        public final Object invoke(Object obj7, Object obj8) {
                            switch (i45) {
                                case 0:
                                    ((Integer) obj8).getClass();
                                    A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj8).getClass();
                                    A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                    break;
                                default:
                                    ((Integer) obj8).getClass();
                                    A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                    break;
                            }
                            return p110k9.y.f19095a;
                        }
                    };
                    return;
                }
                return;
            }
            c0698o2 = c0698o;
            xL = C0672b.l(iVar2.b().f21459e, c0698o2);
            objH = c0698o2.H();
            s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new C0673b0(0.0f);
                c0698o2.e0(objH);
            }
            c0673b0 = (C0673b0) objH;
            objH2 = c0698o2.H();
            if (objH2 == s10) {
                objH2 = C0672b.r(Boolean.FALSE);
                c0698o2.e0(objH2);
            }
            x9 = (X) objH2;
            if (((List) xL.getValue()).size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            zG = c0698o2.g(xL) | c0698o2.i(iVar2);
            objH3 = c0698o2.H();
            if (zG) {
                objH3 = new C0027k(iVar2, xL, c0673b0, x9, null, 7);
                x10 = xL;
                c0698o2.e0(objH3);
            } else {
                objH3 = new C0027k(iVar2, xL, c0673b0, x9, null, 7);
                x10 = xL;
                c0698o2.e0(objH3);
            }
            p171r0.a.c(z10, (p241y9.e) objH3, c0698o2, 0);
            interfaceC0771u2 = interfaceC0771u;
            zI = c0698o2.i(a9) | c0698o2.i(interfaceC0771u2);
            objH4 = c0698o2.H();
            if (zI) {
                objH4 = new A3.e(14, a9, interfaceC0771u2);
                c0698o2.e0(objH4);
            } else {
                objH4 = new A3.e(14, a9, interfaceC0771u2);
                c0698o2.e0(objH4);
            }
            C0672b.d(interfaceC0771u2, (c) objH4, c0698o2);
            gVarY = B0.c.Y(c0698o2);
            xL2 = C0672b.l(hVar.f22856i, c0698o2);
            objH5 = c0698o2.H();
            if (objH5 == s10) {
                objH5 = C0672b.o(new f(21, xL2));
                c0698o2.e0(objH5);
            }
            l10 = (L0) objH5;
            jVar = (p173r2.j) p120l9.m.n0((List) l10.getValue());
            objH6 = c0698o2.H();
            if (objH6 == s10) {
                int i46 = I.f22694a;
                objH6 = new u.y();
                c0698o2.e0(objH6);
            }
            yVar = (u.y) objH6;
            if (jVar != null) {
                c0698o2.T(-1797897781);
                boolean zI7 = c0698o2.i(iVar2) | ((((i21 & 3670016) ^ 1572864) <= 1048576 && c0698o2.g(cVar3)) || (i21 & 1572864) == 1048576);
                if ((i21 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zI7 | z11;
                objH7 = c0698o2.H();
                if (z12) {
                    final int i47 = 1;
                    z13 = true;
                    c cVar11 = new c() { // from class: s2.u
                        @Override // p241y9.c
                        public final Object e(Object obj7) {
                            int i48 = i47;
                            X x13 = x9;
                            c cVar12 = cVar;
                            c cVar13 = cVar3;
                            i iVar7 = iVar2;
                            C1401n c1401n = (C1401n) obj7;
                            switch (i48) {
                                case 0:
                                    v vVar5 = ((p173r2.j) c1401n.a()).f21442s;
                                    p251z9.j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar3 = (h) vVar5;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i49 = v.f21491v;
                                        for (v vVar6 : p173r2.i.b(hVar3)) {
                                        }
                                        return (p214w.H) cVar13.e(c1401n);
                                    }
                                    int i410 = v.f21491v;
                                    for (v vVar7 : p173r2.i.b(hVar3)) {
                                    }
                                    return (p214w.H) cVar12.e(c1401n);
                                default:
                                    v vVar8 = ((p173r2.j) c1401n.c()).f21442s;
                                    p251z9.j.c(vVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar4 = (h) vVar8;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i411 = v.f21491v;
                                        for (v vVar9 : p173r2.i.b(hVar4)) {
                                        }
                                        return (p214w.G) cVar13.e(c1401n);
                                    }
                                    int i412 = v.f21491v;
                                    for (v vVar10 : p173r2.i.b(hVar4)) {
                                    }
                                    return (p214w.G) cVar12.e(c1401n);
                            }
                        }
                    };
                    c0698o2.e0(cVar11);
                    objH7 = cVar11;
                } else {
                    final int i48 = 1;
                    z13 = true;
                    c cVar12 = new c() { // from class: s2.u
                        @Override // p241y9.c
                        public final Object e(Object obj7) {
                            int i49 = i48;
                            X x13 = x9;
                            c cVar13 = cVar;
                            c cVar14 = cVar3;
                            i iVar7 = iVar2;
                            C1401n c1401n = (C1401n) obj7;
                            switch (i49) {
                                case 0:
                                    v vVar5 = ((p173r2.j) c1401n.a()).f21442s;
                                    p251z9.j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar3 = (h) vVar5;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i410 = v.f21491v;
                                        for (v vVar6 : p173r2.i.b(hVar3)) {
                                        }
                                        return (p214w.H) cVar14.e(c1401n);
                                    }
                                    int i411 = v.f21491v;
                                    for (v vVar7 : p173r2.i.b(hVar3)) {
                                    }
                                    return (p214w.H) cVar13.e(c1401n);
                                default:
                                    v vVar8 = ((p173r2.j) c1401n.c()).f21442s;
                                    p251z9.j.c(vVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar4 = (h) vVar8;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i412 = v.f21491v;
                                        for (v vVar9 : p173r2.i.b(hVar4)) {
                                        }
                                        return (p214w.G) cVar14.e(c1401n);
                                    }
                                    int i413 = v.f21491v;
                                    for (v vVar10 : p173r2.i.b(hVar4)) {
                                    }
                                    return (p214w.G) cVar13.e(c1401n);
                            }
                        }
                    };
                    c0698o2.e0(cVar12);
                    objH7 = cVar12;
                }
                cVar5 = (c) objH7;
                boolean zI8 = c0698o2.i(iVar2) | (((((i21 & 29360128) ^ 12582912) > 8388608 || !c0698o2.g(cVar4)) && (i21 & 12582912) != 8388608) ? false : z13);
                if ((i21 & 458752) == 131072) {
                    z14 = z13;
                } else {
                    z14 = false;
                }
                z15 = zI8 | z14;
                objH8 = c0698o2.H();
                if (z15) {
                    final int i49 = 0;
                    c cVar13 = new c() { // from class: s2.u
                        @Override // p241y9.c
                        public final Object e(Object obj7) {
                            int i410 = i49;
                            X x13 = x9;
                            c cVar14 = cVar2;
                            c cVar15 = cVar4;
                            i iVar7 = iVar2;
                            C1401n c1401n = (C1401n) obj7;
                            switch (i410) {
                                case 0:
                                    v vVar5 = ((p173r2.j) c1401n.a()).f21442s;
                                    p251z9.j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar3 = (h) vVar5;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i411 = v.f21491v;
                                        for (v vVar6 : p173r2.i.b(hVar3)) {
                                        }
                                        return (p214w.H) cVar15.e(c1401n);
                                    }
                                    int i412 = v.f21491v;
                                    for (v vVar7 : p173r2.i.b(hVar3)) {
                                    }
                                    return (p214w.H) cVar14.e(c1401n);
                                default:
                                    v vVar8 = ((p173r2.j) c1401n.c()).f21442s;
                                    p251z9.j.c(vVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar4 = (h) vVar8;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i413 = v.f21491v;
                                        for (v vVar9 : p173r2.i.b(hVar4)) {
                                        }
                                        return (p214w.G) cVar15.e(c1401n);
                                    }
                                    int i414 = v.f21491v;
                                    for (v vVar10 : p173r2.i.b(hVar4)) {
                                    }
                                    return (p214w.G) cVar14.e(c1401n);
                            }
                        }
                    };
                    c0698o2.e0(cVar13);
                    objH8 = cVar13;
                } else {
                    final int i410 = 0;
                    c cVar14 = new c() { // from class: s2.u
                        @Override // p241y9.c
                        public final Object e(Object obj7) {
                            int i411 = i410;
                            X x13 = x9;
                            c cVar15 = cVar2;
                            c cVar16 = cVar4;
                            i iVar7 = iVar2;
                            C1401n c1401n = (C1401n) obj7;
                            switch (i411) {
                                case 0:
                                    v vVar5 = ((p173r2.j) c1401n.a()).f21442s;
                                    p251z9.j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar3 = (h) vVar5;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i412 = v.f21491v;
                                        for (v vVar6 : p173r2.i.b(hVar3)) {
                                        }
                                        return (p214w.H) cVar16.e(c1401n);
                                    }
                                    int i413 = v.f21491v;
                                    for (v vVar7 : p173r2.i.b(hVar3)) {
                                    }
                                    return (p214w.H) cVar15.e(c1401n);
                                default:
                                    v vVar8 = ((p173r2.j) c1401n.c()).f21442s;
                                    p251z9.j.c(vVar8, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar4 = (h) vVar8;
                                    if (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) {
                                        int i414 = v.f21491v;
                                        for (v vVar9 : p173r2.i.b(hVar4)) {
                                        }
                                        return (p214w.G) cVar16.e(c1401n);
                                    }
                                    int i415 = v.f21491v;
                                    for (v vVar10 : p173r2.i.b(hVar4)) {
                                    }
                                    return (p214w.G) cVar15.e(c1401n);
                            }
                        }
                    };
                    c0698o2.e0(cVar14);
                    objH8 = cVar14;
                }
                cVar6 = (c) objH8;
                if ((i21 & 234881024) == 67108864) {
                    z16 = z13;
                } else {
                    z16 = false;
                }
                objH9 = c0698o2.H();
                if (z16) {
                    objH9 = new m(27);
                    c0698o2.e0(objH9);
                } else {
                    objH9 = new m(27);
                    c0698o2.e0(objH9);
                }
                cVar7 = (c) objH9;
                Boolean bool2 = Boolean.TRUE;
                zI2 = c0698o2.i(iVar2);
                objH10 = c0698o2.H();
                if (zI2) {
                    objH10 = new A3.e(13, l10, iVar2);
                    c0698o2.e0(objH10);
                } else {
                    objH10 = new A3.e(13, l10, iVar2);
                    c0698o2.e0(objH10);
                }
                C0672b.d(bool2, (c) objH10, c0698o2);
                objH11 = c0698o2.H();
                if (objH11 == s10) {
                    objH11 = new p223x.X(jVar);
                    c0698o2.e0(objH11);
                }
                x11 = (p223x.X) objH11;
                q0VarD = t0.d(x11, "entry", c0698o2, 56);
                if (((Boolean) x9.getValue()).booleanValue()) {
                    c0698o2.T(-1795663766);
                    Float fValueOf2 = Float.valueOf(c0673b0.g());
                    zG3 = c0698o2.g(x10) | c0698o2.i(x11);
                    objH16 = c0698o2.H();
                    if (zG3) {
                        iVar3 = null;
                        objH16 = new C0641m(x11, x10, c0673b0, false ? 1 : 0, 7);
                        c0698o2.e0(objH16);
                    } else {
                        iVar3 = null;
                        objH16 = new C0641m(x11, x10, c0673b0, false ? 1 : 0, 7);
                        c0698o2.e0(objH16);
                    }
                    C0672b.f(c0698o2, fValueOf2, (p241y9.e) objH16);
                    c0698o2.p(false);
                    q0Var = q0VarD;
                    x12 = x11;
                } else {
                    iVar3 = null;
                    z18 = false;
                    c0698o2.T(-1795408729);
                    zI3 = c0698o2.i(x11) | c0698o2.i(jVar) | c0698o2.g(q0VarD);
                    objH12 = c0698o2.H();
                    if (zI3) {
                        q0Var = q0VarD;
                        x12 = x11;
                        objH12 = new C0029l((Object) x12, (Object) jVar, (Object) q0Var, (p150o9.c) (z18 ? 1 : 0), 10);
                        c0698o2.e0(objH12);
                    } else {
                        q0Var = q0VarD;
                        x12 = x11;
                        objH12 = new C0029l((Object) x12, (Object) jVar, (Object) q0Var, (p150o9.c) (z18 ? 1 : 0), 10);
                        c0698o2.e0(objH12);
                    }
                    C0672b.f(c0698o2, jVar, (p241y9.e) objH12);
                    c0698o2.p(false);
                }
                zI4 = c0698o2.i(yVar) | c0698o2.i(iVar2) | c0698o2.g(cVar5) | c0698o2.g(cVar6) | c0698o2.g(cVar7);
                objH13 = c0698o2.H();
                if (zI4) {
                    final i iVar7 = iVar2;
                    l11 = l10;
                    objH13 = new c() { // from class: s2.v
                        @Override // p241y9.c
                        public final Object e(Object obj7) {
                            float f3;
                            C1401n c1401n = (C1401n) obj7;
                            if (!((List) l11.getValue()).contains(c1401n.a())) {
                                return androidx.compose.animation.a.c(p214w.G.f23439b, p214w.H.f23441b);
                            }
                            String str5 = ((p173r2.j) c1401n.a()).f21446w;
                            u.y yVar4 = yVar;
                            int iC2 = yVar4.c(str5);
                            if (iC2 >= 0) {
                                f3 = yVar4.f22780c[iC2];
                            } else {
                                yVar4.e(str5, 0.0f);
                                f3 = 0.0f;
                            }
                            if (!p251z9.j.a(((p173r2.j) c1401n.c()).f21446w, ((p173r2.j) c1401n.a()).f21446w)) {
                                f3 = (((Boolean) iVar7.f22072c.getValue()).booleanValue() || ((Boolean) x9.getValue()).booleanValue()) ? f3 - 1.0f : f3 + 1.0f;
                            }
                            yVar4.e(((p173r2.j) c1401n.c()).f21446w, f3);
                            return new p214w.u((p214w.G) cVar5.e(c1401n), (p214w.H) cVar6.e(c1401n), f3, (p214w.P) cVar7.e(c1401n));
                        }
                    };
                    yVar2 = yVar;
                    iVar4 = iVar7;
                    c0698o2.e0(objH13);
                } else {
                    final i iVar8 = iVar2;
                    l11 = l10;
                    objH13 = new c() { // from class: s2.v
                        @Override // p241y9.c
                        public final Object e(Object obj7) {
                            float f3;
                            C1401n c1401n = (C1401n) obj7;
                            if (!((List) l11.getValue()).contains(c1401n.a())) {
                                return androidx.compose.animation.a.c(p214w.G.f23439b, p214w.H.f23441b);
                            }
                            String str5 = ((p173r2.j) c1401n.a()).f21446w;
                            u.y yVar4 = yVar;
                            int iC2 = yVar4.c(str5);
                            if (iC2 >= 0) {
                                f3 = yVar4.f22780c[iC2];
                            } else {
                                yVar4.e(str5, 0.0f);
                                f3 = 0.0f;
                            }
                            if (!p251z9.j.a(((p173r2.j) c1401n.c()).f21446w, ((p173r2.j) c1401n.a()).f21446w)) {
                                f3 = (((Boolean) iVar8.f22072c.getValue()).booleanValue() || ((Boolean) x9.getValue()).booleanValue()) ? f3 - 1.0f : f3 + 1.0f;
                            }
                            yVar4.e(((p173r2.j) c1401n.c()).f21446w, f3);
                            return new p214w.u((p214w.G) cVar5.e(c1401n), (p214w.H) cVar6.e(c1401n), f3, (p214w.P) cVar7.e(c1401n));
                        }
                    };
                    yVar2 = yVar;
                    iVar4 = iVar8;
                    c0698o2.e0(objH13);
                }
                c cVar15 = (c) objH13;
                objH14 = c0698o2.H();
                if (objH14 == s10) {
                    objH14 = new m(29);
                    c0698o2.e0(objH14);
                }
                l12 = l11;
                q0Var2 = q0Var;
                androidx.compose.animation.a.b(q0Var2, rVar, cVar15, eVar, (c) objH14, p074h0.j.d(820763100, new x(x12, jVar, gVarY, x9, l12), c0698o2), c0698o2, ((i21 >> 3) & 112) | 221184 | (i21 & 7168));
                Object objI2 = q0Var2.f24065a.i();
                Object value2 = q0Var2.f24068d.getValue();
                zG2 = c0698o2.g(q0Var2) | c0698o2.i(a9) | c0698o2.i(jVar) | c0698o2.i(iVar4) | c0698o2.i(yVar2);
                objH15 = c0698o2.H();
                if (zG2) {
                    y yVar4 = new y(q0Var2, a9, jVar, yVar2, l12, iVar4, null);
                    c0698o2.e0(yVar4);
                    objH15 = yVar4;
                } else {
                    y yVar5 = new y(q0Var2, a9, jVar, yVar2, l12, iVar4, null);
                    c0698o2.e0(yVar5);
                    objH15 = yVar5;
                }
                C0672b.g(objI2, value2, (p241y9.e) objH15, c0698o2);
                c0698o2.p(false);
            } else {
                iVar3 = iVar;
                c0698o2.T(-1790256870);
                c0698o2.p(false);
            }
            gB2 = h10.b("dialog");
            if (gB2 instanceof q) {
                qVar2 = (q) gB2;
            } else {
                qVar = iVar3;
            }
            if (qVar == 0) {
                c0699o0R = c0698o2.r();
                if (c0699o0R != null) {
                    qVar = qVar2;
                    return;
                }
                qVar = qVar2;
                final int i411 = 0;
                c0699o0R.f10749d = new p241y9.e() { // from class: s2.w
                    @Override // p241y9.e
                    public final Object invoke(Object obj7, Object obj8) {
                        switch (i411) {
                            case 0:
                                ((Integer) obj8).getClass();
                                A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                break;
                            case 1:
                                ((Integer) obj8).getClass();
                                A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                break;
                            default:
                                ((Integer) obj8).getClass();
                                A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                                break;
                        }
                        return p110k9.y.f19095a;
                    }
                };
                return;
            }
            qVar = qVar2;
            o.a(qVar, c0698o2, 0);
        }
        C0699o0 c0699o0R3 = c0698o2.r();
        if (c0699o0R3 != null) {
            final int i50 = 1;
            c0699o0R3.f10749d = new p241y9.e() { // from class: s2.w
                @Override // p241y9.e
                public final Object invoke(Object obj7, Object obj8) {
                    switch (i50) {
                        case 0:
                            ((Integer) obj8).getClass();
                            A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                            break;
                        case 1:
                            ((Integer) obj8).getClass();
                            A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                            break;
                        default:
                            ((Integer) obj8).getClass();
                            A.b(a9, xVar, rVar, eVar, cVar, cVar2, cVar3, cVar4, (C0698o) obj7, C0672b.y(i10 | 1));
                            break;
                    }
                    return p110k9.y.f19095a;
                }
            };
        }
    }

    public static float c(float f3, float f7, int i10) {
        return (Math.max(0, i10 - 1) * f7) + f3;
    }

    public static float d(float f3, float f7, int i10) {
        return i10 > 0 ? (f7 / 2.0f) + f3 : f3;
    }

    public static final Activity e(Context context) {
        p251z9.j.e(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            p251z9.j.d(context, "getBaseContext(...)");
        }
        return null;
    }

    public static float f(float f3, float f7, float f10, int i10) {
        return i10 > 0 ? (f10 / 2.0f) + f7 : f3;
    }
}
