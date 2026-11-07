package A;

import G.C0191z;
import J0.AbstractC0283f;
import K0.AbstractC0359n0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import androidx.compose.ui.window.PopupLayout;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: A.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034n0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034n0(Z.X x9, Z.X x10, p251z9.v vVar, fa.a aVar, Z.X x11) {
        super(1);
        this.f340r = 4;
        this.f341s = x9;
        this.f343u = x10;
        this.f342t = vVar;
        this.f344v = aVar;
        this.f345w = x11;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x03b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l9.r] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        boolean z10;
        float f3;
        float f7;
        p110k9.y yVar;
        Object obj2;
        Object obj3;
        Z.X x9;
        char c10;
        float f10;
        boolean z11;
        ?? r10;
        p072ga.e eVar;
        double dNextDouble;
        int i10;
        int i11 = this.f340r;
        int i12 = 0;
        p110k9.y yVar2 = p110k9.y.f19095a;
        Object obj4 = this.f345w;
        Object obj5 = this.f344v;
        Object obj6 = this.f343u;
        Object obj7 = this.f342t;
        Object obj8 = this.f341s;
        switch (i11) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                p251z9.s sVar = (p251z9.s) obj6;
                p251z9.v vVar = (p251z9.v) obj7;
                C0045t0 c0045t0 = (C0045t0) obj8;
                C0026j0 c0026j0F = C0045t0.f((M9.e) c0045t0.f421f);
                if (c0026j0F != null) {
                    c0045t0.g(c0026j0F);
                    C0026j0 c0026j0A = ((C0026j0) vVar.f24886r).a(c0026j0F);
                    vVar.f24886r = c0026j0A;
                    b1 b1Var = (b1) obj5;
                    float fG = b1Var.g(b1Var.e(c0026j0A.f270a));
                    sVar.f24883r = fG;
                    z10 = true;
                    ((p251z9.r) obj4).f24882r = !AbstractC0024i0.a(fG - fFloatValue);
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(c0026j0F != null ? z10 : false);
            case 1:
                long j = ((p171r0.c) obj).f21387a;
                AbstractC0405x.x((InterfaceC0402u) obj8, null, new C0039q((Ga.k) obj6, (Z.X) obj5, (Z.X) obj4, null, 10), 3);
                ((p241y9.c) obj7).e(new p171r0.c(j));
                return yVar2;
            case 2:
                J0.K k7 = (J0.K) obj;
                k7.a();
                float fG2 = ((M.h) obj8).f5613c.g();
                if (fG2 != 0.0f) {
                    long j10 = ((Z0.y) obj6).f10954b;
                    int i13 = U0.K.f8034c;
                    int iB = ((Z0.s) obj7).b((int) (j10 >> 32));
                    K.t0 t0VarD = ((K.W) obj5).d();
                    p171r0.e eVarC = t0VarD != null ? t0VarD.f4794a.c(iB) : new p171r0.e(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(k7.w(K.h0.f4645a));
                    float f11 = fFloor < 1.0f ? 1.0f : fFloor;
                    float f12 = f11 / 2;
                    float f13 = eVarC.f21389a + f12;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (k7.f3942r.f22795s.v() >> 32)) - f12;
                    if (f13 > fIntBitsToFloat) {
                        f13 = fIntBitsToFloat;
                    }
                    if (f13 >= f12) {
                        f12 = f13;
                    }
                    float fFloor2 = ((int) f11) % 2 == 1 ? ((float) Math.floor(f12)) + 0.5f : (float) Math.rint(f12);
                    p123m2.c.g(k7, (p180s0.L) obj4, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(eVarC.f21390b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(eVarC.f21392d)) & 4294967295L), f11, fG2, 432);
                }
                return yVar2;
            case 3:
                M.p pVar = (M.p) obj;
                M.l lVar = ((M.c) obj7).f5592a;
                pVar.f5647h = (Z0.y) obj8;
                pVar.f5648i = (Z0.k) obj6;
                pVar.f5643c = (C0023i) obj5;
                pVar.f5644d = (p241y9.c) obj4;
                pVar.f5645e = lVar != null ? lVar.f5621G : null;
                pVar.f5646f = lVar != null ? lVar.f5622H : null;
                pVar.g = lVar != null ? (K0.c1) AbstractC0283f.i(lVar, AbstractC0359n0.f5128s) : null;
                return yVar2;
            case 4:
                p251z9.v vVar2 = (p251z9.v) obj7;
                long jLongValue = ((Number) obj).longValue() / 1000000;
                Z.X x10 = (Z.X) obj8;
                long jLongValue2 = ((Number) x10.getValue()).longValue() > 0 ? jLongValue - ((Number) x10.getValue()).longValue() : 0L;
                x10.setValue(Long.valueOf(jLongValue));
                Z.X x11 = (Z.X) obj6;
                Object obj9 = vVar2.f24886r;
                if (obj9 == null) {
                    p251z9.j.k("partySystems");
                    throw null;
                }
                List list = (List) obj9;
                ArrayList arrayList = new ArrayList(p120l9.n.a0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    p072ga.d dVar = (p072ga.d) it.next();
                    float f14 = 0.0f;
                    long j11 = dVar.f16369b;
                    p072ga.b bVar = dVar.f16368a;
                    long jCurrentTimeMillis = System.currentTimeMillis() - j11;
                    bVar.getClass();
                    long j12 = i12;
                    ?? arrayList2 = p120l9.r.f19440r;
                    if (jCurrentTimeMillis < j12) {
                        it = it;
                        yVar = yVar2;
                        obj2 = obj4;
                        obj3 = obj5;
                        x9 = x11;
                        c10 = '\n';
                    } else {
                        if (dVar.a()) {
                            fa.a aVar = (fa.a) obj5;
                            Object obj10 = vVar2.f24886r;
                            if (obj10 == null) {
                                p251z9.j.k("partySystems");
                                throw null;
                            }
                            List list2 = (List) obj10;
                            if (list2.isEmpty()) {
                                i10 = 0;
                            } else {
                                Iterator it2 = list2.iterator();
                                int i14 = 0;
                                while (it2.hasNext()) {
                                    if (!((p072ga.d) it2.next()).a() && (i14 = i14 + 1) < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                                i10 = i14;
                            }
                            aVar.o(dVar, i10);
                        }
                        float f15 = jLongValue2 / 1000.0f;
                        ia.a aVar2 = (ia.a) ((Z.X) obj4).getValue();
                        ArrayList arrayList3 = dVar.f16372e;
                        p251z9.j.e(aVar2, "drawArea");
                        float f16 = aVar2.f17711b;
                        float f17 = aVar2.f17710a;
                        if (dVar.f16370c) {
                            p083ha.c cVar = dVar.f16371d;
                            cVar.getClass();
                            cVar.f16493e += f15;
                            p083ha.b bVar2 = cVar.f16489a;
                            f3 = f17;
                            long j13 = bVar2.f16487a;
                            float f18 = j13;
                            float f19 = f18 / 1000.0f;
                            float f20 = cVar.f16492d;
                            if (f20 == 0.0f && f15 > f19) {
                                cVar.f16493e = f19;
                            }
                            float f21 = cVar.f16493e;
                            float f22 = bVar2.f16488b;
                            if (f21 < f22 || (j13 != 0 && f20 >= f18)) {
                                f7 = f15;
                                yVar = yVar2;
                                obj2 = obj4;
                                obj3 = obj5;
                                x9 = x11;
                                r10 = arrayList2;
                            } else {
                                E9.d dVar2 = new E9.d(1, (int) (f21 / f22), 1);
                                ArrayList arrayList4 = new ArrayList(p120l9.n.a0(dVar2, 10));
                                Iterator it3 = dVar2.iterator();
                                while (((E9.c) it3).f2000t) {
                                    ((p120l9.v) it3).nextInt();
                                    List list3 = bVar.f16362d;
                                    p072ga.g gVar = bVar.f16365h;
                                    Iterator it4 = it3;
                                    Random random = cVar.f16491c;
                                    float f23 = f15;
                                    ia.d dVar3 = (ia.d) list3.get(random.nextInt(list3.size()));
                                    AbstractC0813f2 abstractC0813f2 = bVar.g;
                                    p110k9.y yVar3 = yVar2;
                                    if (abstractC0813f2 instanceof p072ga.e) {
                                        p072ga.e eVar2 = (p072ga.e) abstractC0813f2;
                                        eVar = new p072ga.e(eVar2.f16373s, eVar2.f16374t);
                                    } else {
                                        if (!(abstractC0813f2 instanceof p072ga.f)) {
                                            throw new A6.a();
                                        }
                                        eVar = new p072ga.e(((float) 0.5d) * f3, ((float) ((p072ga.f) abstractC0813f2).f16375s) * f16);
                                    }
                                    ia.e eVar3 = new ia.e(eVar.f16373s, eVar.f16374t);
                                    float f24 = dVar3.f17716a * cVar.f16490b;
                                    float f25 = dVar3.f17717b;
                                    float fNextFloat = (random.nextFloat() * 0.2f * f25) + f25;
                                    List list4 = bVar.f16364f;
                                    ia.c cVar2 = (ia.c) list4.get(random.nextInt(list4.size()));
                                    List list5 = bVar.f16363e;
                                    int iIntValue = ((Number) list5.get(random.nextInt(list5.size()))).intValue();
                                    float f26 = bVar.f16361c;
                                    float fNextFloat2 = bVar.f16360b;
                                    if (f26 != -1.0f) {
                                        fNextFloat2 += random.nextFloat() * (f26 - fNextFloat2);
                                    }
                                    int i15 = bVar.f16359a;
                                    if (i15 == 0) {
                                        dNextDouble = 270;
                                    } else {
                                        int i16 = i15 / 2;
                                        int i17 = 270 - i16;
                                        dNextDouble = (random.nextDouble() * ((double) ((i16 + 270) - i17))) + ((double) i17);
                                    }
                                    double radians = Math.toRadians(dNextDouble);
                                    arrayList4.add(new p083ha.a(eVar3, iIntValue, f24, fNextFloat, cVar2, new ia.e(((float) Math.cos(radians)) * fNextFloat2, fNextFloat2 * ((float) Math.sin(radians))), cVar.a(gVar) * 1.5f, cVar.a(gVar) * 8.0f, cVar.f16490b));
                                    it3 = it4;
                                    f15 = f23;
                                    yVar2 = yVar3;
                                    obj4 = obj4;
                                    obj5 = obj5;
                                    x11 = x11;
                                }
                                f7 = f15;
                                yVar = yVar2;
                                obj2 = obj4;
                                obj3 = obj5;
                                x9 = x11;
                                cVar.f16493e %= bVar2.f16488b;
                                r10 = arrayList4;
                            }
                            cVar.f16492d = (f7 * 1000) + cVar.f16492d;
                            arrayList3.addAll(r10);
                        } else {
                            f3 = f17;
                            f7 = f15;
                            yVar = yVar2;
                            obj2 = obj4;
                            obj3 = obj5;
                            x9 = x11;
                        }
                        int size = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj11 = arrayList3.get(i18);
                            i18++;
                            p083ha.a aVar3 = (p083ha.a) obj11;
                            aVar3.getClass();
                            ia.e eVar4 = aVar3.f16482o;
                            ia.e eVar5 = aVar3.g;
                            float f27 = 1.0f / aVar3.f16473d;
                            float f28 = (eVar4.f17718a * f27) + eVar5.f17718a;
                            eVar5.f17718a = f28;
                            float f29 = (eVar4.f17719b * f27) + eVar5.f17719b;
                            eVar5.f17719b = f29;
                            float f30 = aVar3.f16472c;
                            ia.e eVar6 = aVar3.f16476h;
                            ia.e eVar7 = aVar3.f16470a;
                            float f31 = f7 > f14 ? 1.0f / f7 : 60.0f;
                            aVar3.f16481n = f31;
                            if (eVar7.f17719b > f16) {
                                aVar3.f16483p = 0;
                            } else {
                                float f32 = eVar6.f17718a + f28;
                                float f33 = eVar6.f17719b + f29;
                                float f34 = f32 * 0.9f;
                                eVar6.f17718a = f34;
                                float f35 = f33 * 0.9f;
                                eVar6.f17719b = f35;
                                float f36 = f7 * f31 * aVar3.f16478k;
                                eVar7.f17718a = (f34 * f36) + eVar7.f17718a;
                                eVar7.f17719b = (f35 * f36) + eVar7.f17719b;
                                long j14 = aVar3.f16475f - ((long) (1000 * f7));
                                aVar3.f16475f = j14;
                                if (j14 <= 0) {
                                    int i19 = aVar3.f16483p - ((int) ((5 * f7) * f31));
                                    if (i19 < 0) {
                                        i19 = 0;
                                    }
                                    aVar3.f16483p = i19;
                                }
                                float f37 = (aVar3.j * f7 * f31) + aVar3.f16479l;
                                aVar3.f16479l = f37;
                                if (f37 >= 360.0f) {
                                    f10 = f14;
                                    aVar3.f16479l = f10;
                                } else {
                                    f10 = f14;
                                }
                                float fAbs = aVar3.f16480m - ((Math.abs(aVar3.f16477i) * f7) * aVar3.f16481n);
                                aVar3.f16480m = fAbs;
                                if (fAbs < f10) {
                                    aVar3.f16480m = f30;
                                }
                                aVar3.f16484q = Math.abs((aVar3.f16480m / f30) - 0.5f) * 2;
                                aVar3.f16485r = (aVar3.f16483p << 24) | (aVar3.f16471b & 16777215);
                                int i20 = (int) eVar7.f17718a;
                                int i21 = (int) eVar7.f17719b;
                                float f38 = i20;
                                if (f38 < 0.0f || f38 > 0.0f + f3) {
                                    z11 = false;
                                } else {
                                    float f39 = i21;
                                    if (f39 < 0.0f || f39 > 0.0f + f16) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                }
                                aVar3.f16486s = z11;
                            }
                            f14 = 0.0f;
                        }
                        p120l9.m.s0(arrayList3, p072ga.c.f16367r);
                        ArrayList arrayList5 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            Object obj12 = arrayList3.get(i22);
                            i22++;
                            if (((p083ha.a) obj12).f16486s) {
                                arrayList5.add(obj12);
                            }
                        }
                        c10 = '\n';
                        arrayList2 = new ArrayList(p120l9.n.a0(arrayList5, 10));
                        int size3 = arrayList5.size();
                        int i23 = 0;
                        while (i23 < size3) {
                            Object obj13 = arrayList5.get(i23);
                            i23++;
                            p083ha.a aVar4 = (p083ha.a) obj13;
                            p251z9.j.e(aVar4, "<this>");
                            ia.e eVar8 = aVar4.f16470a;
                            float f40 = eVar8.f17718a;
                            float f41 = eVar8.f17719b;
                            float f42 = aVar4.f16472c;
                            arrayList2.add(new p072ga.a(f40, f41, f42, f42, aVar4.f16485r, aVar4.f16479l, aVar4.f16484q, aVar4.f16474e, aVar4.f16483p));
                        }
                    }
                    arrayList.add(arrayList2);
                    jLongValue2 = jLongValue2;
                    it = it;
                    yVar2 = yVar;
                    obj4 = obj2;
                    obj5 = obj3;
                    x11 = x9;
                    i12 = 0;
                }
                p110k9.y yVar4 = yVar2;
                x11.setValue(p120l9.n.b0(arrayList));
                return yVar4;
            default:
                PopupLayout popupLayout = (PopupLayout) obj8;
                popupLayout.f12130E.addView(popupLayout, popupLayout.f12131F);
                popupLayout.i((p241y9.a) obj7, (p104k1.t) obj6, (String) obj5, (p063g1.m) obj4);
                return new C0191z(7, popupLayout);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0034n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f340r = i10;
        this.f341s = obj;
        this.f342t = obj2;
        this.f343u = obj3;
        this.f344v = obj4;
        this.f345w = obj5;
    }
}
