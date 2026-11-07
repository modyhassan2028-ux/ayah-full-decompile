package F;

import A.C0009b;
import A.EnumC0047u0;
import A.M0;
import D.InterfaceC0064g;
import D.P;
import G.AbstractC0190y;
import G.C0174h;
import G.C0178l;
import G.F;
import G.G;
import G.H;
import G.I;
import G.a0;
import H0.J;
import H0.e0;
import K9.InterfaceC0402u;
import Z.C0675c0;
import Z.X;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p223x.C1422k;
import u.AbstractC1354i;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f2074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f2075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f2076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0064g f2077u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f2078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p180s0.v f2079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0174h f2080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l0.d f2081y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(A a9, P p10, F9.d dVar, InterfaceC0064g interfaceC0064g, InterfaceC0402u interfaceC0402u, p180s0.v vVar, C0174h c0174h, l0.d dVar2) {
        super(2);
        this.f2074r = a9;
        this.f2075s = p10;
        this.f2076t = dVar;
        this.f2077u = interfaceC0064g;
        this.f2078v = interfaceC0402u;
        this.f2079w = vVar;
        this.f2080x = c0174h;
        this.f2081y = dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0318  */
    /* JADX WARN: Code duplicated, block: B:110:0x0334  */
    /* JADX WARN: Code duplicated, block: B:112:0x0339  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0372  */
    /* JADX WARN: Code duplicated, block: B:123:0x037b  */
    /* JADX WARN: Code duplicated, block: B:125:0x037f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0390 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:144:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:155:0x041e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0425  */
    /* JADX WARN: Code duplicated, block: B:157:0x042a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0451  */
    /* JADX WARN: Code duplicated, block: B:170:0x0463  */
    /* JADX WARN: Code duplicated, block: B:173:0x0468  */
    /* JADX WARN: Code duplicated, block: B:177:0x0478  */
    /* JADX WARN: Code duplicated, block: B:182:0x048b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:196:0x04d3 A[LOOP:4: B:192:0x04c1->B:196:0x04d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:200:0x04e4 A[LOOP:5: B:200:0x04e4->B:207:0x0503, LOOP_START, PHI: r1 r2
      0x04e4: PHI (r1v63 java.util.List) = (r1v79 java.util.List), (r1v80 java.util.List) binds: [B:199:0x04e2, B:207:0x0503] A[DONT_GENERATE, DONT_INLINE]
      0x04e4: PHI (r2v46 int) = (r2v29 int), (r2v50 int) binds: [B:199:0x04e2, B:207:0x0503] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x04f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:207:0x0503 A[LOOP:5: B:200:0x04e4->B:207:0x0503, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0508  */
    /* JADX WARN: Code duplicated, block: B:212:0x0513 A[LOOP:6: B:211:0x0511->B:212:0x0513, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x0548  */
    /* JADX WARN: Code duplicated, block: B:217:0x054c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0560 A[LOOP:7: B:216:0x054a->B:220:0x0560, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:221:0x0569  */
    /* JADX WARN: Code duplicated, block: B:28:0x0157  */
    /* JADX WARN: Code duplicated, block: B:292:0x068e  */
    /* JADX WARN: Code duplicated, block: B:299:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x015a  */
    /* JADX WARN: Code duplicated, block: B:301:0x06bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:306:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:310:0x06dd A[LOOP:15: B:309:0x06db->B:310:0x06dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:319:0x0706  */
    /* JADX WARN: Code duplicated, block: B:322:0x0718  */
    /* JADX WARN: Code duplicated, block: B:323:0x071a  */
    /* JADX WARN: Code duplicated, block: B:330:0x073a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0747  */
    /* JADX WARN: Code duplicated, block: B:338:0x0755 A[LOOP:16: B:337:0x0753->B:338:0x0755, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0768  */
    /* JADX WARN: Code duplicated, block: B:352:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:354:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:356:0x07b8 A[LOOP:26: B:355:0x07b6->B:356:0x07b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x07d9 A[LOOP:27: B:358:0x07d7->B:359:0x07d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x016d  */
    /* JADX WARN: Code duplicated, block: B:362:0x07f2 A[LOOP:28: B:361:0x07f0->B:362:0x07f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x081c  */
    /* JADX WARN: Code duplicated, block: B:367:0x082c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0844  */
    /* JADX WARN: Code duplicated, block: B:371:0x084b A[LOOP:18: B:370:0x0849->B:371:0x084b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:374:0x085f  */
    /* JADX WARN: Code duplicated, block: B:378:0x086b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0178  */
    /* JADX WARN: Code duplicated, block: B:39:0x0180  */
    /* JADX WARN: Code duplicated, block: B:41:0x0196  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:450:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:452:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:454:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:455:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:456:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:458:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:462:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:464:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:475:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:482:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a6d  */
    /* JADX WARN: Code duplicated, block: B:502:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:513:0x04dc A[EDGE_INSN: B:513:0x04dc->B:198:0x04dc BREAK  A[LOOP:4: B:192:0x04c1->B:196:0x04d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0506 A[EDGE_INSN: B:514:0x0506->B:208:0x0506 BREAK  A[LOOP:5: B:200:0x04e4->B:207:0x0503], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x056f A[EDGE_INSN: B:516:0x056f->B:222:0x056f BREAK  A[LOOP:7: B:216:0x054a->B:220:0x0560], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:535:0x06cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:561:0x04b2 A[ADDED_TO_REGION, EDGE_INSN: B:561:0x04b2->B:188:0x04b2 BREAK  A[LOOP:29: B:181:0x0489->B:187:0x04a3], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x023c A[EDGE_INSN: B:575:0x023c->B:78:0x023c BREAK  A[LOOP:33: B:75:0x0230->B:77:0x0239], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0201  */
    /* JADX WARN: Code duplicated, block: B:66:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0230 A[LOOP:33: B:75:0x0230->B:77:0x0239, LOOP_START, PHI: r2
      0x0230: PHI (r2v13 int) = (r2v12 int), (r2v14 int) binds: [B:74:0x022e, B:77:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0239 A[LOOP:33: B:75:0x0230->B:77:0x0239, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0287  */
    /* JADX WARN: Code duplicated, block: B:92:0x028f  */
    /* JADX WARN: Code duplicated, block: B:95:0x029c  */
    /* JADX WARN: Code duplicated, block: B:97:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c6  */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int i11;
        I i12;
        C0009b c0009b;
        p011b0.e eVar;
        boolean z10;
        p120l9.r rVar;
        ArrayList arrayList;
        E9.d dVar;
        int size;
        int i13;
        int i14;
        int i15;
        List list;
        int iF;
        int i16;
        Object[] objArr;
        int i17;
        int i18;
        int i19;
        Object[] objArr2;
        int i20;
        int i21;
        int i22;
        int i23;
        p120l9.r rVar2;
        float fFloatValue;
        float f3;
        androidx.compose.foundation.lazy.layout.b bVar;
        int i24;
        boolean zT;
        X x9;
        l lVar;
        int i25;
        InterfaceC0402u interfaceC0402u;
        p180s0.v vVar;
        m mVar;
        int i26;
        int iRound;
        int i27;
        p120l9.k kVar;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int iMax;
        long j;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z11;
        int iMax2;
        boolean z12;
        int i41;
        int i42;
        int i43;
        int i44;
        float f7;
        float f10;
        int i45;
        s sVar;
        int iB;
        int i46;
        int i47;
        int i48;
        int iMax3;
        int i49;
        int i50;
        List arrayList2;
        int size2;
        int size3;
        int iMax4;
        int i51;
        int iMin;
        int i52;
        float f11;
        int i53;
        ArrayList arrayList3;
        List list2;
        ArrayList arrayList4;
        int size4;
        int i54;
        List list3;
        int size5;
        int iMax5;
        int i55;
        boolean z13;
        int iG;
        int iF2;
        int i56;
        boolean z14;
        ArrayList arrayList5;
        int i57;
        m mVar2;
        int size6;
        int i58;
        int i59;
        int iB2;
        int i60;
        int i61;
        int size7;
        int i62;
        float f12;
        boolean z15;
        boolean z16;
        p120l9.k kVar2;
        u.s sVar2;
        float f13;
        boolean z17;
        int i63;
        boolean z18;
        List list4;
        s sVar3;
        Integer numValueOf;
        s sVar4;
        boolean z19;
        int iIntValue;
        int iIntValue2;
        int size8;
        int i64;
        List list5;
        int i65;
        r rVar3;
        boolean z20;
        s sVar5;
        s sVar6;
        u.s sVar7;
        int i66;
        Object obj3;
        int i67;
        int iMax6;
        int i68;
        int i69;
        int i70;
        long jA;
        int iF3;
        int size9;
        int i71;
        int iB3;
        int[] iArr;
        int i72;
        int[] iArr2;
        int i73;
        int iIntValue3;
        s sVar8;
        float f14;
        s sVar9;
        Object obj4;
        int i74;
        Object obj5;
        int i75;
        int iMin2;
        s sVar10;
        Object obj6;
        ArrayList arrayList6;
        List list6;
        int i76;
        int iIntValue4;
        List arrayList7;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int iJ;
        int i83;
        long jA2;
        F f15 = (F) obj;
        long j10 = ((p063g1.a) obj2).f16246a;
        A a9 = this.f2074r;
        a9.f2024r.getValue();
        boolean z21 = a9.f2010b || f15.f2583s.t();
        EnumC0047u0 enumC0047u0 = EnumC0047u0.f424r;
        p171r0.h.b(j10, enumC0047u0);
        p063g1.m layoutDirection = f15.f2583s.getLayoutDirection();
        P p10 = this.f2075s;
        int iE = f15.f2583s.E(p10.a(layoutDirection));
        int iE2 = f15.f2583s.E(p10.b(f15.f2583s.getLayoutDirection()));
        int iE3 = f15.f2583s.E(p10.f909b);
        float f16 = p10.f911d;
        e0 e0Var = f15.f2583s;
        int iE4 = e0Var.E(f16) + iE3;
        int i84 = iE2 + iE;
        int i85 = iE4 - iE3;
        long jI = p063g1.b.i(-i84, -iE4, j10);
        i iVar = (i) this.f2076t.invoke();
        C0153b c0153b = iVar.f2056c;
        a0 a0Var = iVar.f2057d;
        int iH = p063g1.a.h(jI);
        int iG2 = p063g1.a.g(jI);
        c0153b.f2042a.h(iH);
        c0153b.f2043b.h(iG2);
        InterfaceC0064g interfaceC0064g = this.f2077u;
        if (interfaceC0064g == null) {
            C.a.b("null verticalArrangement when isVertical == true");
            throw new A6.a();
        }
        int iE5 = e0Var.E(interfaceC0064g.a());
        int iB4 = iVar.b();
        int iG3 = p063g1.a.g(j10) - iE4;
        m mVar3 = new m(jI, iVar, f15, iB4, iE5, this.f2081y, iE3, i85, (((long) iE) << 32) | (((long) iE3) & 4294967295L), this.f2074r);
        p093j0.i iVarC = p093j0.s.c();
        Integer numValueOf2 = null;
        p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
        p093j0.i iVarD = p093j0.s.d(iVarC);
        try {
            D0.y yVar = a9.f2012d;
            int iG4 = ((C0675c0) yVar.f1158s).g();
            int iF4 = AbstractC0190y.f(iG4, iVar, yVar.f1160u);
            if (iG4 != iF4) {
                i10 = iB4;
                ((C0675c0) yVar.f1158s).h(iF4);
                G g = (G) yVar.f1161v;
                i11 = i85;
                if (iG4 != g.f2587s) {
                    g.f2587s = iG4;
                    int i86 = (iG4 / 30) * 30;
                    g.f2586r.setValue(B0.c.i0(Math.max(i86 - 100, 0), i86 + 130));
                }
                int iG5 = ((C0675c0) yVar.f1159t).g();
                p093j0.s.g(iVarC, iVarD, cVarE);
                i12 = a9.f2023q;
                c0009b = a9.f2020n;
                eVar = c0009b.f188a;
                if (eVar.f13127t != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar = p120l9.r.f19440r;
                if (z10 && i12.f2594r.isEmpty()) {
                    iG5 = iG5;
                    rVar2 = rVar;
                    list = rVar;
                } else {
                    arrayList = new ArrayList();
                    if (c0009b.f188a.f13127t != 0) {
                        i16 = eVar.f13127t;
                        if (i16 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        objArr = eVar.f13125r;
                        i17 = ((C0178l) objArr[0]).f2708a;
                        i18 = 0;
                        while (i18 < i16) {
                            int i87 = i16;
                            i23 = ((C0178l) objArr[i18]).f2708a;
                            if (i23 < i17) {
                                i17 = i23;
                            }
                            i18++;
                            i16 = i87;
                        }
                        if (i17 < 0) {
                            C.a.a("negative minIndex");
                        }
                        i19 = eVar.f13127t;
                        if (i19 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        objArr2 = eVar.f13125r;
                        i20 = ((C0178l) objArr2[0]).f2709b;
                        i21 = 0;
                        while (i21 < i19) {
                            Object[] objArr3 = objArr2;
                            i22 = ((C0178l) objArr2[i21]).f2709b;
                            if (i22 > i20) {
                                i20 = i22;
                            }
                            i21++;
                            objArr2 = objArr3;
                        }
                        dVar = new E9.d(i17, Math.min(i20, iVar.b() - 1), 1);
                    } else {
                        dVar = E9.d.f2002u;
                    }
                    size = i12.f2594r.size();
                    for (i13 = 0; i13 < size; i13++) {
                        H h7 = (H) i12.get(i13);
                        iF = AbstractC0190y.f(h7.f2590c, iVar, h7.f2588a);
                        int i88 = dVar.f1995r;
                        if ((iF <= dVar.f1996s || i88 > iF) && iF >= 0 && iF < iVar.b()) {
                            arrayList.add(Integer.valueOf(iF));
                        }
                    }
                    i14 = dVar.f1995r;
                    i15 = dVar.f1996s;
                    if (i14 <= i15) {
                        while (true) {
                            arrayList.add(Integer.valueOf(i14));
                            if (i14 == i15) {
                                break;
                            }
                            i14++;
                        }
                    }
                    list = arrayList;
                    rVar2 = rVar;
                }
                if (e0Var.t() && z21) {
                    fFloatValue = ((Number) ((C1422k) a9.f2028v.f6511r).f24028s.getValue()).floatValue();
                } else {
                    fFloatValue = a9.g;
                }
                f3 = fFloatValue;
                bVar = a9.f2019m;
                i24 = iG5;
                zT = e0Var.t();
                r rVar4 = a9.f2011c;
                x9 = a9.f2027u;
                i25 = i10;
                lVar = new l(f15, j10, i84, iE4);
                if (iE3 < 0) {
                    C.a.a("invalid beforeContentPadding");
                }
                if (i11 < 0) {
                    C.a.a("invalid afterContentPadding");
                }
                interfaceC0402u = this.f2078v;
                vVar = this.f2079w;
                if (i25 <= 0) {
                    iJ = p063g1.a.j(jI);
                    i83 = p063g1.a.i(jI);
                    bVar.c(0, iJ, i83, new ArrayList(), a0Var, mVar3, zT, z21, 0, 0, interfaceC0402u, vVar);
                    if (!zT) {
                        jA2 = bVar.a();
                        if (!p063g1.l.a(jA2, 0L)) {
                            iJ = p063g1.b.g(jI, (int) (jA2 >> 32));
                            i83 = p063g1.b.f(jI, (int) (jA2 & 4294967295L));
                        }
                    }
                    rVar3 = new r(null, 0, false, 0.0f, (J) lVar.d(Integer.valueOf(iJ), Integer.valueOf(i83), o.f2082s), 0.0f, false, interfaceC0402u, f15, mVar3.f2067c, rVar2, -iE3, iG3 + i11, 0, enumC0047u0, i11, iE5);
                    z20 = false;
                } else {
                    mVar = mVar3;
                    if (iF4 >= i25) {
                        i26 = iG3;
                        iF4 = i25 - 1;
                        i24 = 0;
                    }
                    i26 = iG3;
                    iRound = Math.round(f3);
                    i27 = i24 - iRound;
                    if (iF4 == 0 && i27 < 0) {
                        iRound += i27;
                        i27 = 0;
                    }
                    kVar = new p120l9.k();
                    i28 = iF4;
                    int i89 = -iE3;
                    if (r9 < 0) {
                        i29 = r9;
                    } else {
                        i29 = 0;
                    }
                    i30 = iRound;
                    i31 = i89 + i29;
                    i32 = i89;
                    i33 = i27 + i31;
                    iMax = 0;
                    while (true) {
                        j = mVar.f2067c;
                        if (i33 >= 0 || i28 <= 0) {
                            break;
                        }
                        int i90 = i28 - 1;
                        s sVarA = mVar.a(j, i90);
                        kVar.add(0, sVarA);
                        iMax = Math.max(iMax, sVarA.f2123p);
                        i33 += sVarA.f2122o;
                        i28 = i90;
                    }
                    if (i33 < i31) {
                        i34 = i30 - (i31 - i33);
                        i33 = i31;
                    } else {
                        i34 = i30;
                    }
                    int i91 = i33 - i31;
                    i35 = i26 + i11;
                    int i92 = iMax;
                    if (i35 < 0) {
                        i36 = 0;
                    } else {
                        i36 = i35;
                    }
                    i37 = -i91;
                    i38 = i91;
                    i39 = i28;
                    i40 = 0;
                    z11 = false;
                    while (i40 < kVar.f19438t) {
                        if (i37 >= i36) {
                            kVar.c(i40);
                            z11 = true;
                        } else {
                            i39++;
                            i37 += ((s) kVar.get(i40)).f2122o;
                            i40++;
                        }
                    }
                    iMax2 = i92;
                    z12 = z11;
                    i41 = i39;
                    while (i41 < i25 && (i37 < i36 || i37 <= 0 || kVar.isEmpty())) {
                        int i93 = i36;
                        s sVarA2 = mVar.a(j, i41);
                        boolean z22 = z12;
                        i80 = sVarA2.f2122o;
                        i81 = i37 + i80;
                        if (i81 <= i31) {
                            i82 = i81;
                            if (i41 != i25 - 1) {
                                i38 -= i80;
                                i28 = i41 + 1;
                                z12 = true;
                            }
                            i41++;
                            i36 = i93;
                            i37 = i82;
                        } else {
                            i82 = i81;
                        }
                        iMax2 = Math.max(iMax2, sVarA2.f2123p);
                        kVar.addLast(sVarA2);
                        z12 = z22;
                        i41++;
                        i36 = i93;
                        i37 = i82;
                    }
                    boolean z23 = z12;
                    if (i37 < i26) {
                        i77 = i26 - i37;
                        i78 = i37 + i77;
                        i44 = i38 - i77;
                        while (i44 < iE3 && i28 > 0) {
                            int i94 = i28 - 1;
                            int i95 = i77;
                            s sVarA3 = mVar.a(j, i94);
                            kVar.add(0, sVarA3);
                            iMax2 = Math.max(iMax2, sVarA3.f2123p);
                            i44 += sVarA3.f2122o;
                            i28 = i94;
                            i77 = i95;
                            i78 = i78;
                        }
                        i79 = i78;
                        i42 = i34 + i77;
                        if (i44 < 0) {
                            i42 += i44;
                            i37 = i79 + i44;
                            i43 = i28;
                            i44 = 0;
                        } else {
                            i43 = i28;
                            i37 = i79;
                        }
                    } else {
                        i42 = i34;
                        i43 = i28;
                        i44 = i38;
                    }
                    int i96 = iMax2;
                    if (Integer.signum(Math.round(f3)) == Integer.signum(i42) || Math.abs(Math.round(f3)) < Math.abs(i42)) {
                        f7 = f3;
                    } else {
                        f7 = i42;
                    }
                    float f17 = f3 - f7;
                    if (zT || i42 <= i34 || f17 > 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = (i42 - i34) + f17;
                    }
                    if (i44 < 0) {
                        C.a.a("negative currentFirstItemScrollOffset");
                    }
                    i45 = -i44;
                    sVar = (s) kVar.first();
                    if (iE3 <= 0 || r9 < 0) {
                        iB = kVar.b();
                        s sVar11 = sVar;
                        i46 = i44;
                        i47 = 0;
                        while (i47 < iB) {
                            int i97 = iB;
                            int i98 = ((s) kVar.get(i47)).f2122o;
                            if (i46 != 0 || i98 > i46 || i47 == AbstractC0813f2.E(kVar)) {
                                break;
                            }
                            i46 -= i98;
                            i47++;
                            sVar11 = (s) kVar.get(i47);
                            iB = i97;
                        }
                        i48 = i46;
                        sVar = sVar11;
                    } else {
                        i48 = i44;
                    }
                    iMax3 = Math.max(0, i43);
                    i49 = i43 - 1;
                    if (iMax3 <= i49) {
                        arrayList2 = null;
                        while (true) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            i50 = i45;
                            arrayList2.add(mVar.a(j, i49));
                            if (i49 != iMax3) {
                                break;
                            }
                            i49--;
                            i45 = i50;
                            arrayList2 = arrayList2;
                        }
                    } else {
                        i50 = i45;
                        arrayList2 = null;
                    }
                    size2 = list.size() - 1;
                    list6 = arrayList2;
                    if (size2 >= 0) {
                        while (true) {
                            i76 = size2 - 1;
                            iIntValue4 = ((Number) list.get(size2)).intValue();
                            arrayList7 = list6;
                            arrayList2 = list6;
                            if (iIntValue4 < iMax3) {
                                if (list6 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(mVar.a(j, iIntValue4));
                                arrayList2 = arrayList7;
                            }
                            if (i76 < 0) {
                                break;
                            }
                            size2 = i76;
                            list6 = arrayList2;
                        }
                    }
                    if (arrayList2 == null) {
                        arrayList2 = rVar2;
                    }
                    iMax4 = i96;
                    i51 = 0;
                    for (size3 = arrayList2.size(); i51 < size3; size3 = size3) {
                        iMax4 = Math.max(iMax4, ((s) arrayList2.get(i51)).f2123p);
                        i51++;
                    }
                    int i99 = i25 - 1;
                    iMin = Math.min(((s) p120l9.m.m0(kVar)).f2110a, i99);
                    int i100 = iMax4;
                    i52 = ((s) p120l9.m.m0(kVar)).f2110a + 1;
                    if (i52 <= iMin) {
                        arrayList6 = null;
                        while (true) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            f11 = f7;
                            i53 = i41;
                            arrayList3 = arrayList6;
                            arrayList3.add(mVar.a(j, i52));
                            if (i52 != iMin) {
                                break;
                            }
                            i52++;
                            arrayList6 = arrayList3;
                            i41 = i53;
                            f7 = f11;
                        }
                    } else {
                        f11 = f7;
                        i53 = i41;
                        arrayList3 = null;
                    }
                    if (zT || rVar4 == null) {
                        list2 = arrayList2;
                        i26 = i26;
                        arrayList4 = arrayList3;
                    } else {
                        ?? r10 = rVar4.f2103k;
                        if (r10.isEmpty()) {
                            list2 = arrayList2;
                            i26 = i26;
                            arrayList4 = arrayList3;
                        } else {
                            int size10 = r10.size() - 1;
                            ArrayList arrayList8 = arrayList3;
                            while (true) {
                                if (-1 >= size10) {
                                    sVar8 = null;
                                    break;
                                }
                                if (((s) r10.get(size10)).f2110a > iMin && (size10 == 0 || ((s) r10.get(size10 - 1)).f2110a <= iMin)) {
                                    sVar8 = (s) r10.get(size10);
                                    break;
                                }
                                size10--;
                            }
                            s sVar12 = (s) p120l9.m.m0(r10);
                            if (sVar8 != null && (i75 = sVar8.f2110a) <= (iMin2 = Math.min(sVar12.f2110a, i99))) {
                                arrayList4 = arrayList8;
                                List list7 = arrayList2;
                                while (true) {
                                    list2 = list7;
                                    if (arrayList4 != null) {
                                        int size11 = arrayList4.size();
                                        int i101 = 0;
                                        while (true) {
                                            if (i101 >= size11) {
                                                obj6 = null;
                                                break;
                                            }
                                            obj6 = arrayList4.get(i101);
                                            int i102 = size11;
                                            if (((s) obj6).f2110a == i75) {
                                                break;
                                            }
                                            i101++;
                                            size11 = i102;
                                        }
                                        sVar10 = (s) obj6;
                                    } else {
                                        sVar10 = null;
                                    }
                                    if (sVar10 == null) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(mVar.a(j, i75));
                                    }
                                    if (i75 == iMin2) {
                                        break;
                                    }
                                    i75++;
                                    list7 = list2;
                                    i26 = i26;
                                }
                            } else {
                                list2 = arrayList2;
                                i26 = i26;
                                arrayList4 = arrayList8;
                            }
                            float f18 = ((rVar4.f2105m - sVar12.f2120m) - sVar12.f2121n) - f11;
                            if (f18 > 0.0f) {
                                int i103 = sVar12.f2110a + 1;
                                int i104 = 0;
                                while (i103 < i25 && i104 < f18) {
                                    if (i103 <= iMin) {
                                        int iB5 = kVar.b();
                                        int i105 = 0;
                                        while (true) {
                                            if (i105 >= iB5) {
                                                f14 = f18;
                                                obj5 = null;
                                                break;
                                            }
                                            obj5 = kVar.get(i105);
                                            f14 = f18;
                                            if (((s) obj5).f2110a == i103) {
                                                break;
                                            }
                                            i105++;
                                            f18 = f14;
                                        }
                                        sVar9 = (s) obj5;
                                    } else {
                                        f14 = f18;
                                        if (arrayList4 != null) {
                                            int size12 = arrayList4.size();
                                            int i106 = 0;
                                            while (true) {
                                                if (i106 >= size12) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = arrayList4.get(i106);
                                                if (((s) obj4).f2110a == i103) {
                                                    break;
                                                }
                                                i106++;
                                            }
                                            sVar9 = (s) obj4;
                                        } else {
                                            sVar9 = null;
                                        }
                                    }
                                    if (sVar9 != null) {
                                        i103++;
                                        i74 = sVar9.f2122o;
                                    } else {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(mVar.a(j, i103));
                                        i103++;
                                        i74 = ((s) p120l9.m.m0(arrayList4)).f2122o;
                                    }
                                    i104 += i74;
                                    f18 = f14;
                                }
                            }
                        }
                    }
                    if (arrayList4 != null && ((s) p120l9.m.m0(arrayList4)).f2110a > iMin) {
                        iMin = ((s) p120l9.m.m0(arrayList4)).f2110a;
                    }
                    size4 = list.size();
                    for (i54 = 0; i54 < size4; i54++) {
                        iIntValue3 = ((Number) list.get(i54)).intValue();
                        if (iIntValue3 <= iMin) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(mVar.a(j, iIntValue3));
                        }
                    }
                    if (arrayList4 == null) {
                        list3 = rVar2;
                    } else {
                        list3 = arrayList4;
                    }
                    size5 = list3.size();
                    iMax5 = i100;
                    for (i55 = 0; i55 < size5; i55++) {
                        iMax5 = Math.max(iMax5, ((s) list3.get(i55)).f2123p);
                    }
                    if (!p251z9.j.a(sVar, kVar.first()) && list2.isEmpty() && list3.isEmpty()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    iG = p063g1.b.g(jI, iMax5);
                    iF2 = p063g1.b.f(jI, i37);
                    i56 = i26;
                    if (i37 < Math.min(iF2, i56)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14 && i50 != 0) {
                        C.a.c("non-zero itemsScrollOffset");
                    }
                    arrayList5 = new ArrayList(list3.size() + list2.size() + kVar.b());
                    if (z14) {
                        if (list2.isEmpty() || !list3.isEmpty()) {
                            C.a.a("no extra items");
                        }
                        iB3 = kVar.b();
                        iArr = new int[iB3];
                        for (i72 = 0; i72 < iB3; i72++) {
                            iArr[i72] = ((s) kVar.get(i72)).f2121n;
                        }
                        iArr2 = new int[iB3];
                        if (interfaceC0064g != null) {
                            C.a.b("null verticalArrangement when isVertical == true");
                            throw new A6.a();
                        }
                        i57 = i37;
                        interfaceC0064g.d(iF2, f15, iArr, iArr2);
                        E9.d dVar2 = new E9.d(0, iB3 - 1, 1);
                        int i107 = dVar2.f1996s;
                        i73 = dVar2.f1997t;
                        if ((i73 <= 0 && i107 >= 0) || (i73 < 0 && i107 <= 0)) {
                            int i108 = 0;
                            while (true) {
                                int i109 = iArr2[i108];
                                mVar2 = mVar;
                                s sVar13 = (s) kVar.get(i108);
                                sVar13.c(i109, iG, iF2);
                                arrayList5.add(sVar13);
                                if (i108 == i107) {
                                    break;
                                }
                                i108 += i73;
                                mVar = mVar2;
                            }
                        }
                    } else {
                        i57 = i37;
                        mVar2 = mVar;
                        i58 = i50;
                        i59 = 0;
                        for (size6 = list2.size(); i59 < size6; size6 = size6) {
                            s sVar14 = (s) list2.get(i59);
                            i58 -= sVar14.f2122o;
                            sVar14.c(i58, iG, iF2);
                            arrayList5.add(sVar14);
                            i59++;
                        }
                        iB2 = kVar.b();
                        i60 = i50;
                        for (i61 = 0; i61 < iB2; i61++) {
                            s sVar15 = (s) kVar.get(i61);
                            sVar15.c(i60, iG, iF2);
                            arrayList5.add(sVar15);
                            i60 += sVar15.f2122o;
                        }
                        size7 = list3.size();
                        for (i62 = 0; i62 < size7; i62++) {
                            s sVar16 = (s) list3.get(i62);
                            sVar16.c(i60, iG, iF2);
                            arrayList5.add(sVar16);
                            i60 += sVar16.f2122o;
                        }
                    }
                    f12 = f11;
                    int i110 = i57;
                    bVar.c((int) f12, iG, iF2, arrayList5, a0Var, mVar2, zT, z21, i48, i110, interfaceC0402u, vVar);
                    m mVar4 = mVar2;
                    z15 = zT;
                    if (z15) {
                        z16 = z13;
                        kVar2 = kVar;
                    } else {
                        jA = bVar.a();
                        z16 = z13;
                        kVar2 = kVar;
                        if (!p063g1.l.a(jA, 0L)) {
                            iG = p063g1.b.g(jI, Math.max(iG, (int) (jA >> 32)));
                            iF3 = p063g1.b.f(jI, Math.max(iF2, (int) (jA & 4294967295L)));
                            if (iF3 != iF2) {
                                size9 = arrayList5.size();
                                for (i71 = 0; i71 < size9; i71++) {
                                    s sVar17 = (s) arrayList5.get(i71);
                                    sVar17.f2125r = iF3;
                                    sVar17.f2127t = sVar17.f2115f + iF3;
                                }
                            }
                            iF2 = iF3;
                        }
                    }
                    sVar2 = iVar.f2055b.f2053b;
                    if (sVar2 == null) {
                        sVar2 = AbstractC1354i.f22730a;
                    }
                    M0 m10 = new M0(4, mVar4);
                    if (this.f2080x != null || arrayList5.isEmpty() || sVar2.f22758b == 0) {
                        f13 = f12;
                        z17 = z15;
                        i63 = i32;
                        z18 = true;
                        list4 = rVar2;
                    } else {
                        int i111 = ((s) p120l9.m.f0(arrayList5)).f2110a;
                        if (((s) p120l9.m.m0(arrayList5)).f2110a - i111 < 0 || (i68 = sVar2.f22758b) == 0) {
                            f13 = f12;
                            sVar7 = AbstractC1354i.f22730a;
                        } else {
                            E9.d dVarI0 = B0.c.i0(0, i68);
                            int i112 = dVarI0.f1995r;
                            int i113 = dVarI0.f1996s;
                            f13 = f12;
                            if (i112 <= i113) {
                                int iC = -1;
                                while (sVar2.c(i112) <= i111) {
                                    iC = sVar2.c(i112);
                                    if (i112 == i113) {
                                        break;
                                    }
                                    i112++;
                                }
                                i70 = iC;
                                i69 = -1;
                            } else {
                                i69 = -1;
                                i70 = -1;
                            }
                            if (i70 == i69) {
                                sVar7 = AbstractC1354i.f22730a;
                            } else {
                                u.s sVar18 = AbstractC1354i.f22730a;
                                sVar7 = new u.s(1);
                                sVar7.a(i70);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList(arrayList5.size());
                        int size13 = arrayList5.size();
                        int i114 = 0;
                        while (i114 < size13) {
                            Object obj7 = arrayList5.get(i114);
                            int i115 = i114;
                            int i116 = ((s) obj7).f2110a;
                            int i117 = size13;
                            int[] iArr3 = sVar2.f22757a;
                            int i118 = sVar2.f22758b;
                            u.s sVar19 = sVar2;
                            int i119 = 0;
                            while (i119 < i118) {
                                int i120 = i119;
                                if (iArr3[i120] == i116) {
                                    arrayList10.add(obj7);
                                    break;
                                }
                                i119 = i120 + 1;
                            }
                            i114 = i115 + 1;
                            size13 = i117;
                            sVar2 = sVar19;
                        }
                        int[] iArr4 = sVar7.f22757a;
                        int i121 = sVar7.f22758b;
                        int i122 = 0;
                        while (i122 < i121) {
                            int i123 = iArr4[i122];
                            int size14 = arrayList5.size();
                            int i124 = i121;
                            int i125 = 0;
                            int i126 = 0;
                            while (true) {
                                if (i125 >= size14) {
                                    i66 = -1;
                                    break;
                                }
                                Object obj8 = arrayList5.get(i125);
                                int i127 = i125 + 1;
                                if (((s) obj8).f2110a == i123) {
                                    i66 = i126;
                                    break;
                                }
                                i126++;
                                i125 = i127;
                            }
                            s sVar20 = i66 == -1 ? (s) m10.e(Integer.valueOf(i123)) : (s) arrayList5.remove(i66);
                            int[] iArr5 = iArr4;
                            int i128 = sVar20.f2122o;
                            int iA = i66 == -1 ? Integer.MIN_VALUE : (int) (sVar20.a(0) & 4294967295L);
                            int size15 = arrayList10.size();
                            M0 m11 = m10;
                            int i129 = 0;
                            while (true) {
                                if (i129 >= size15) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = arrayList10.get(i129);
                                int i130 = i129;
                                if (((s) obj3).f2110a != i123) {
                                    break;
                                }
                                i129 = i130 + 1;
                            }
                            s sVar21 = (s) obj3;
                            int iA2 = sVar21 != null ? (int) (sVar21.a(0) & 4294967295L) : Integer.MIN_VALUE;
                            if (iA == Integer.MIN_VALUE) {
                                iMax6 = i32;
                                i67 = iMax6;
                            } else {
                                i67 = i32;
                                iMax6 = Math.max(i67, iA);
                            }
                            if (iA2 != Integer.MIN_VALUE) {
                                iMax6 = Math.min(iMax6, iA2 - i128);
                            }
                            sVar20.f2124q = true;
                            sVar20.c(iMax6, iG, iF2);
                            arrayList9.add(sVar20);
                            i122++;
                            z15 = z15;
                            i32 = i67;
                            iArr4 = iArr5;
                            i121 = i124;
                            m10 = m11;
                        }
                        z17 = z15;
                        i63 = i32;
                        z18 = true;
                        list4 = arrayList9;
                    }
                    if (z16) {
                        sVar6 = (s) p120l9.m.g0(arrayList5);
                        if (sVar6 != null) {
                            numValueOf = Integer.valueOf(sVar6.f2110a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        sVar3 = (s) kVar2.f();
                        if (sVar3 != null) {
                            numValueOf = Integer.valueOf(sVar3.f2110a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z16) {
                        sVar5 = (s) p120l9.m.n0(arrayList5);
                        if (sVar5 != null) {
                            numValueOf2 = Integer.valueOf(sVar5.f2110a);
                        }
                    } else {
                        sVar4 = (s) kVar2.h();
                        if (sVar4 != null) {
                            numValueOf2 = Integer.valueOf(sVar4.f2110a);
                        }
                    }
                    if (i53 >= i25 || i110 > i56) {
                        z19 = z18;
                    } else {
                        z19 = false;
                    }
                    J j11 = (J) lVar.d(Integer.valueOf(iG), Integer.valueOf(iF2), new q(x9, arrayList5, list4, z17));
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (arrayList5.isEmpty()) {
                        list5 = rVar2;
                    } else {
                        ArrayList arrayListD0 = p120l9.m.D0(list4);
                        size8 = arrayList5.size();
                        for (i64 = 0; i64 < size8; i64++) {
                            s sVar22 = (s) arrayList5.get(i64);
                            i65 = sVar22.f2110a;
                            if (iIntValue > i65 && i65 <= iIntValue2) {
                                arrayListD0.add(sVar22);
                            }
                        }
                        p120l9.p.c0(arrayListD0, AbstractC0190y.f2762b);
                        list5 = arrayListD0;
                    }
                    z20 = false;
                    rVar3 = new r(sVar, i48, z19, f13, j11, f10, z23, interfaceC0402u, f15, mVar4.f2067c, list5, i63, i35, i25, enumC0047u0, i11, r9);
                }
                a9.f(rVar3, e0Var.t(), z20);
                return rVar3;
            }
            i10 = iB4;
            i11 = i85;
            int iG6 = ((C0675c0) yVar.f1159t).g();
            p093j0.s.g(iVarC, iVarD, cVarE);
            i12 = a9.f2023q;
            c0009b = a9.f2020n;
            eVar = c0009b.f188a;
            if (eVar.f13127t != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rVar = p120l9.r.f19440r;
            if (z10) {
                arrayList = new ArrayList();
                if (c0009b.f188a.f13127t != 0) {
                    i16 = eVar.f13127t;
                    if (i16 == 0) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    objArr = eVar.f13125r;
                    i17 = ((C0178l) objArr[0]).f2708a;
                    i18 = 0;
                    while (i18 < i16) {
                        int i810 = i16;
                        i23 = ((C0178l) objArr[i18]).f2708a;
                        if (i23 < i17) {
                            i17 = i23;
                        }
                        i18++;
                        i16 = i810;
                    }
                    if (i17 < 0) {
                        C.a.a("negative minIndex");
                    }
                    i19 = eVar.f13127t;
                    if (i19 == 0) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    objArr2 = eVar.f13125r;
                    i20 = ((C0178l) objArr2[0]).f2709b;
                    i21 = 0;
                    while (i21 < i19) {
                        Object[] objArr4 = objArr2;
                        i22 = ((C0178l) objArr2[i21]).f2709b;
                        if (i22 > i20) {
                            i20 = i22;
                        }
                        i21++;
                        objArr2 = objArr4;
                    }
                    dVar = new E9.d(i17, Math.min(i20, iVar.b() - 1), 1);
                } else {
                    dVar = E9.d.f2002u;
                }
                size = i12.f2594r.size();
                while (i13 < size) {
                    H h10 = (H) i12.get(i13);
                    iF = AbstractC0190y.f(h10.f2590c, iVar, h10.f2588a);
                    int i811 = dVar.f1995r;
                    if (iF <= dVar.f1996s) {
                        arrayList.add(Integer.valueOf(iF));
                    } else {
                        arrayList.add(Integer.valueOf(iF));
                    }
                }
                i14 = dVar.f1995r;
                i15 = dVar.f1996s;
                if (i14 <= i15) {
                    while (true) {
                        arrayList.add(Integer.valueOf(i14));
                        if (i14 == i15) {
                            break;
                            break;
                        }
                        i14++;
                    }
                }
                list = arrayList;
                rVar2 = rVar;
            } else {
                arrayList = new ArrayList();
                if (c0009b.f188a.f13127t != 0) {
                    i16 = eVar.f13127t;
                    if (i16 == 0) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    objArr = eVar.f13125r;
                    i17 = ((C0178l) objArr[0]).f2708a;
                    i18 = 0;
                    while (i18 < i16) {
                        int i812 = i16;
                        i23 = ((C0178l) objArr[i18]).f2708a;
                        if (i23 < i17) {
                            i17 = i23;
                        }
                        i18++;
                        i16 = i812;
                    }
                    if (i17 < 0) {
                        C.a.a("negative minIndex");
                    }
                    i19 = eVar.f13127t;
                    if (i19 == 0) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    objArr2 = eVar.f13125r;
                    i20 = ((C0178l) objArr2[0]).f2709b;
                    i21 = 0;
                    while (i21 < i19) {
                        Object[] objArr5 = objArr2;
                        i22 = ((C0178l) objArr2[i21]).f2709b;
                        if (i22 > i20) {
                            i20 = i22;
                        }
                        i21++;
                        objArr2 = objArr5;
                    }
                    dVar = new E9.d(i17, Math.min(i20, iVar.b() - 1), 1);
                } else {
                    dVar = E9.d.f2002u;
                }
                size = i12.f2594r.size();
                while (i13 < size) {
                    H h11 = (H) i12.get(i13);
                    iF = AbstractC0190y.f(h11.f2590c, iVar, h11.f2588a);
                    int i813 = dVar.f1995r;
                    if (iF <= dVar.f1996s) {
                        arrayList.add(Integer.valueOf(iF));
                    } else {
                        arrayList.add(Integer.valueOf(iF));
                    }
                }
                i14 = dVar.f1995r;
                i15 = dVar.f1996s;
                if (i14 <= i15) {
                    while (true) {
                        arrayList.add(Integer.valueOf(i14));
                        if (i14 == i15) {
                            break;
                            break;
                        }
                        i14++;
                    }
                }
                list = arrayList;
                rVar2 = rVar;
            }
            if (e0Var.t()) {
                fFloatValue = a9.g;
            } else {
                fFloatValue = a9.g;
            }
            f3 = fFloatValue;
            bVar = a9.f2019m;
            i24 = iG6;
            zT = e0Var.t();
            r rVar5 = a9.f2011c;
            x9 = a9.f2027u;
            i25 = i10;
            lVar = new l(f15, j10, i84, iE4);
            if (iE3 < 0) {
                C.a.a("invalid beforeContentPadding");
            }
            if (i11 < 0) {
                C.a.a("invalid afterContentPadding");
            }
            interfaceC0402u = this.f2078v;
            vVar = this.f2079w;
            if (i25 <= 0) {
                iJ = p063g1.a.j(jI);
                i83 = p063g1.a.i(jI);
                bVar.c(0, iJ, i83, new ArrayList(), a0Var, mVar3, zT, z21, 0, 0, interfaceC0402u, vVar);
                if (!zT) {
                    jA2 = bVar.a();
                    if (!p063g1.l.a(jA2, 0L)) {
                        iJ = p063g1.b.g(jI, (int) (jA2 >> 32));
                        i83 = p063g1.b.f(jI, (int) (jA2 & 4294967295L));
                    }
                }
                rVar3 = new r(null, 0, false, 0.0f, (J) lVar.d(Integer.valueOf(iJ), Integer.valueOf(i83), o.f2082s), 0.0f, false, interfaceC0402u, f15, mVar3.f2067c, rVar2, -iE3, iG3 + i11, 0, enumC0047u0, i11, iE5);
                z20 = false;
            } else {
                mVar = mVar3;
                if (iF4 >= i25) {
                    i26 = iG3;
                    iF4 = i25 - 1;
                    i24 = 0;
                }
                i26 = iG3;
                iRound = Math.round(f3);
                i27 = i24 - iRound;
                if (iF4 == 0) {
                    iRound += i27;
                    i27 = 0;
                }
                kVar = new p120l9.k();
                i28 = iF4;
                int i814 = -iE3;
                if (r9 < 0) {
                    i29 = r9;
                } else {
                    i29 = 0;
                }
                i30 = iRound;
                i31 = i814 + i29;
                i32 = i814;
                i33 = i27 + i31;
                iMax = 0;
                while (true) {
                    j = mVar.f2067c;
                    if (i33 >= 0) {
                        break;
                    }
                    break;
                    break;
                    int i910 = i28 - 1;
                    s sVarA4 = mVar.a(j, i910);
                    kVar.add(0, sVarA4);
                    iMax = Math.max(iMax, sVarA4.f2123p);
                    i33 += sVarA4.f2122o;
                    i28 = i910;
                }
                if (i33 < i31) {
                    i34 = i30 - (i31 - i33);
                    i33 = i31;
                } else {
                    i34 = i30;
                }
                int i911 = i33 - i31;
                i35 = i26 + i11;
                int i912 = iMax;
                if (i35 < 0) {
                    i36 = 0;
                } else {
                    i36 = i35;
                }
                i37 = -i911;
                i38 = i911;
                i39 = i28;
                i40 = 0;
                z11 = false;
                while (i40 < kVar.f19438t) {
                    if (i37 >= i36) {
                        kVar.c(i40);
                        z11 = true;
                    } else {
                        i39++;
                        i37 += ((s) kVar.get(i40)).f2122o;
                        i40++;
                    }
                }
                iMax2 = i912;
                z12 = z11;
                i41 = i39;
                while (i41 < i25) {
                    int i913 = i36;
                    s sVarA5 = mVar.a(j, i41);
                    boolean z24 = z12;
                    i80 = sVarA5.f2122o;
                    i81 = i37 + i80;
                    if (i81 <= i31) {
                        i82 = i81;
                        if (i41 != i25 - 1) {
                            i38 -= i80;
                            i28 = i41 + 1;
                            z12 = true;
                        }
                        i41++;
                        i36 = i913;
                        i37 = i82;
                    } else {
                        i82 = i81;
                    }
                    iMax2 = Math.max(iMax2, sVarA5.f2123p);
                    kVar.addLast(sVarA5);
                    z12 = z24;
                    i41++;
                    i36 = i913;
                    i37 = i82;
                }
                boolean z25 = z12;
                if (i37 < i26) {
                    i77 = i26 - i37;
                    i78 = i37 + i77;
                    i44 = i38 - i77;
                    while (i44 < iE3) {
                        int i914 = i28 - 1;
                        int i915 = i77;
                        s sVarA6 = mVar.a(j, i914);
                        kVar.add(0, sVarA6);
                        iMax2 = Math.max(iMax2, sVarA6.f2123p);
                        i44 += sVarA6.f2122o;
                        i28 = i914;
                        i77 = i915;
                        i78 = i78;
                    }
                    i79 = i78;
                    i42 = i34 + i77;
                    if (i44 < 0) {
                        i42 += i44;
                        i37 = i79 + i44;
                        i43 = i28;
                        i44 = 0;
                    } else {
                        i43 = i28;
                        i37 = i79;
                    }
                } else {
                    i42 = i34;
                    i43 = i28;
                    i44 = i38;
                }
                int i916 = iMax2;
                if (Integer.signum(Math.round(f3)) == Integer.signum(i42)) {
                    f7 = f3;
                } else {
                    f7 = f3;
                }
                float f19 = f3 - f7;
                if (zT) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                }
                if (i44 < 0) {
                    C.a.a("negative currentFirstItemScrollOffset");
                }
                i45 = -i44;
                sVar = (s) kVar.first();
                if (iE3 <= 0) {
                    iB = kVar.b();
                    s sVar110 = sVar;
                    i46 = i44;
                    i47 = 0;
                    while (i47 < iB) {
                        int i917 = iB;
                        int i918 = ((s) kVar.get(i47)).f2122o;
                        if (i46 != 0) {
                            break;
                        }
                        break;
                    }
                    i48 = i46;
                    sVar = sVar110;
                } else {
                    iB = kVar.b();
                    s sVar111 = sVar;
                    i46 = i44;
                    i47 = 0;
                    while (i47 < iB) {
                        int i919 = iB;
                        int i9110 = ((s) kVar.get(i47)).f2122o;
                        if (i46 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    i48 = i46;
                    sVar = sVar111;
                }
                iMax3 = Math.max(0, i43);
                i49 = i43 - 1;
                if (iMax3 <= i49) {
                    arrayList2 = null;
                    while (true) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        i50 = i45;
                        arrayList2.add(mVar.a(j, i49));
                        if (i49 != iMax3) {
                            break;
                            break;
                        }
                        i49--;
                        i45 = i50;
                        arrayList2 = arrayList2;
                    }
                } else {
                    i50 = i45;
                    arrayList2 = null;
                }
                size2 = list.size() - 1;
                list6 = arrayList2;
                if (size2 >= 0) {
                    while (true) {
                        i76 = size2 - 1;
                        iIntValue4 = ((Number) list.get(size2)).intValue();
                        arrayList7 = list6;
                        arrayList2 = list6;
                        if (iIntValue4 < iMax3) {
                            if (list6 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(mVar.a(j, iIntValue4));
                            arrayList2 = arrayList7;
                        }
                        if (i76 < 0) {
                            break;
                            break;
                        }
                        size2 = i76;
                        list6 = arrayList2;
                    }
                }
                if (arrayList2 == null) {
                    arrayList2 = rVar2;
                }
                iMax4 = i916;
                i51 = 0;
                while (i51 < size3) {
                    iMax4 = Math.max(iMax4, ((s) arrayList2.get(i51)).f2123p);
                    i51++;
                }
                int i920 = i25 - 1;
                iMin = Math.min(((s) p120l9.m.m0(kVar)).f2110a, i920);
                int i1010 = iMax4;
                i52 = ((s) p120l9.m.m0(kVar)).f2110a + 1;
                if (i52 <= iMin) {
                    arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        f11 = f7;
                        i53 = i41;
                        arrayList3 = arrayList6;
                        arrayList3.add(mVar.a(j, i52));
                        if (i52 != iMin) {
                            break;
                            break;
                        }
                        i52++;
                        arrayList6 = arrayList3;
                        i41 = i53;
                        f7 = f11;
                    }
                } else {
                    f11 = f7;
                    i53 = i41;
                    arrayList3 = null;
                }
                if (zT) {
                    list2 = arrayList2;
                    i26 = i26;
                    arrayList4 = arrayList3;
                } else {
                    list2 = arrayList2;
                    i26 = i26;
                    arrayList4 = arrayList3;
                }
                if (arrayList4 != null) {
                    iMin = ((s) p120l9.m.m0(arrayList4)).f2110a;
                }
                size4 = list.size();
                while (i54 < size4) {
                    iIntValue3 = ((Number) list.get(i54)).intValue();
                    if (iIntValue3 <= iMin) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(mVar.a(j, iIntValue3));
                    }
                }
                if (arrayList4 == null) {
                    list3 = rVar2;
                } else {
                    list3 = arrayList4;
                }
                size5 = list3.size();
                iMax5 = i1010;
                while (i55 < size5) {
                    iMax5 = Math.max(iMax5, ((s) list3.get(i55)).f2123p);
                }
                if (!p251z9.j.a(sVar, kVar.first())) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                iG = p063g1.b.g(jI, iMax5);
                iF2 = p063g1.b.f(jI, i37);
                i56 = i26;
                if (i37 < Math.min(iF2, i56)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    C.a.c("non-zero itemsScrollOffset");
                }
                arrayList5 = new ArrayList(list3.size() + list2.size() + kVar.b());
                if (z14) {
                    if (list2.isEmpty()) {
                        C.a.a("no extra items");
                    } else {
                        C.a.a("no extra items");
                    }
                    iB3 = kVar.b();
                    iArr = new int[iB3];
                    while (i72 < iB3) {
                        iArr[i72] = ((s) kVar.get(i72)).f2121n;
                    }
                    iArr2 = new int[iB3];
                    if (interfaceC0064g != null) {
                        C.a.b("null verticalArrangement when isVertical == true");
                        throw new A6.a();
                    }
                    i57 = i37;
                    interfaceC0064g.d(iF2, f15, iArr, iArr2);
                    E9.d dVar3 = new E9.d(0, iB3 - 1, 1);
                    int i1011 = dVar3.f1996s;
                    i73 = dVar3.f1997t;
                    mVar2 = i73 <= 0 ? mVar : mVar;
                } else {
                    i57 = i37;
                    mVar2 = mVar;
                    i58 = i50;
                    i59 = 0;
                    while (i59 < size6) {
                        s sVar112 = (s) list2.get(i59);
                        i58 -= sVar112.f2122o;
                        sVar112.c(i58, iG, iF2);
                        arrayList5.add(sVar112);
                        i59++;
                    }
                    iB2 = kVar.b();
                    i60 = i50;
                    while (i61 < iB2) {
                        s sVar113 = (s) kVar.get(i61);
                        sVar113.c(i60, iG, iF2);
                        arrayList5.add(sVar113);
                        i60 += sVar113.f2122o;
                    }
                    size7 = list3.size();
                    while (i62 < size7) {
                        s sVar114 = (s) list3.get(i62);
                        sVar114.c(i60, iG, iF2);
                        arrayList5.add(sVar114);
                        i60 += sVar114.f2122o;
                    }
                }
                f12 = f11;
                int i1110 = i57;
                bVar.c((int) f12, iG, iF2, arrayList5, a0Var, mVar2, zT, z21, i48, i1110, interfaceC0402u, vVar);
                m mVar5 = mVar2;
                z15 = zT;
                if (z15) {
                    jA = bVar.a();
                    z16 = z13;
                    kVar2 = kVar;
                    if (!p063g1.l.a(jA, 0L)) {
                        iG = p063g1.b.g(jI, Math.max(iG, (int) (jA >> 32)));
                        iF3 = p063g1.b.f(jI, Math.max(iF2, (int) (jA & 4294967295L)));
                        if (iF3 != iF2) {
                            size9 = arrayList5.size();
                            while (i71 < size9) {
                                s sVar115 = (s) arrayList5.get(i71);
                                sVar115.f2125r = iF3;
                                sVar115.f2127t = sVar115.f2115f + iF3;
                            }
                        }
                        iF2 = iF3;
                    }
                } else {
                    z16 = z13;
                    kVar2 = kVar;
                }
                sVar2 = iVar.f2055b.f2053b;
                if (sVar2 == null) {
                    sVar2 = AbstractC1354i.f22730a;
                }
                M0 m12 = new M0(4, mVar5);
                if (this.f2080x != null) {
                    f13 = f12;
                    z17 = z15;
                    i63 = i32;
                    z18 = true;
                    list4 = rVar2;
                } else {
                    f13 = f12;
                    z17 = z15;
                    i63 = i32;
                    z18 = true;
                    list4 = rVar2;
                }
                if (z16) {
                    sVar6 = (s) p120l9.m.g0(arrayList5);
                    if (sVar6 != null) {
                        numValueOf = Integer.valueOf(sVar6.f2110a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    sVar3 = (s) kVar2.f();
                    if (sVar3 != null) {
                        numValueOf = Integer.valueOf(sVar3.f2110a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z16) {
                    sVar5 = (s) p120l9.m.n0(arrayList5);
                    if (sVar5 != null) {
                        numValueOf2 = Integer.valueOf(sVar5.f2110a);
                    }
                } else {
                    sVar4 = (s) kVar2.h();
                    if (sVar4 != null) {
                        numValueOf2 = Integer.valueOf(sVar4.f2110a);
                    }
                }
                if (i53 >= i25) {
                    z19 = z18;
                } else {
                    z19 = z18;
                }
                J j12 = (J) lVar.d(Integer.valueOf(iG), Integer.valueOf(iF2), new q(x9, arrayList5, list4, z17));
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (arrayList5.isEmpty()) {
                    list5 = rVar2;
                } else {
                    ArrayList arrayListD1 = p120l9.m.D0(list4);
                    size8 = arrayList5.size();
                    while (i64 < size8) {
                        s sVar23 = (s) arrayList5.get(i64);
                        i65 = sVar23.f2110a;
                        if (iIntValue > i65) {
                        }
                    }
                    p120l9.p.c0(arrayListD1, AbstractC0190y.f2762b);
                    list5 = arrayListD1;
                }
                z20 = false;
                rVar3 = new r(sVar, i48, z19, f13, j12, f10, z25, interfaceC0402u, f15, mVar5.f2067c, list5, i63, i35, i25, enumC0047u0, i11, r9);
            }
            a9.f(rVar3, e0Var.t(), z20);
            return rVar3;
        } catch (Throwable th) {
            p093j0.s.g(iVarC, iVarD, cVarE);
            throw th;
        }
    }
}
