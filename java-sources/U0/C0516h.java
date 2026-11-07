package U0;

import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: U0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0516h extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0516h f8063A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0516h f8064B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0516h f8065C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0516h f8066D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0516h f8067E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0516h f8068F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0516h f8069G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final C0516h f8070H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0516h f8071I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C0516h f8072J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0516h f8073K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final C0516h f8074L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C0516h f8075M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0516h f8076N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0516h f8077O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C0516h f8078P;
    public static final C0516h Q;
    public static final C0516h R;
    public static final C0516h S;
    public static final C0516h T;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0516h f8079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0516h f8080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0516h f8081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0516h f8082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0516h f8083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0516h f8084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0516h f8085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0516h f8086z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8087r;

    static {
        int i10 = 1;
        f8079s = new C0516h(i10, 0);
        f8080t = new C0516h(i10, 1);
        f8081u = new C0516h(i10, 2);
        f8082v = new C0516h(i10, 3);
        f8083w = new C0516h(i10, 4);
        f8084x = new C0516h(i10, 5);
        f8085y = new C0516h(i10, 6);
        f8086z = new C0516h(i10, 7);
        f8063A = new C0516h(i10, 8);
        f8064B = new C0516h(i10, 9);
        f8065C = new C0516h(i10, 10);
        f8066D = new C0516h(i10, 11);
        f8067E = new C0516h(i10, 12);
        f8068F = new C0516h(i10, 13);
        f8069G = new C0516h(i10, 14);
        f8070H = new C0516h(i10, 15);
        f8071I = new C0516h(i10, 16);
        f8072J = new C0516h(i10, 17);
        f8073K = new C0516h(i10, 18);
        f8074L = new C0516h(i10, 19);
        f8075M = new C0516h(i10, 20);
        f8076N = new C0516h(i10, 21);
        f8077O = new C0516h(i10, 22);
        f8078P = new C0516h(i10, 23);
        Q = new C0516h(i10, 24);
        R = new C0516h(i10, 25);
        S = new C0516h(i10, 26);
        T = new C0516h(i10, 27);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0516h(int i10, int i11) {
        super(i10);
        this.f8087r = i11;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r14v55, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r3v52, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r4v51, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r5v22, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r5v29, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r6v32, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r7v21, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r8v3, types: [y9.c, z9.k] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = 0;
        switch (this.f8087r) {
            case 0:
                return Boolean.valueOf(!(((InterfaceC0510b) obj) instanceof u));
            case 1:
                r rVar = (r) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(rVar.f8116b);
                sb.append(", ");
                return android.support.v4.media.session.p.A(sb, rVar.f8117c, ')');
            case 2:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (p251z9.j.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((p241y9.c) A.f7972a.f16734t).e(obj2);
                Object obj3 = list.get(0);
                String str = obj3 != null ? (String) obj3 : null;
                p251z9.j.b(str);
                return new C0515g(list2, str);
            case 3:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i10 < size) {
                    Object obj4 = list3.get(i10);
                    C0513e c0513e = (p251z9.j.a(obj4, Boolean.FALSE) || obj4 == null) ? null : (C0513e) ((p241y9.c) A.f7973b.f16734t).e(obj4);
                    p251z9.j.b(c0513e);
                    arrayList.add(c0513e);
                    i10++;
                }
                return arrayList;
            case 4:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj5 = list4.get(0);
                EnumC0518j enumC0518j = obj5 != null ? (EnumC0518j) obj5 : null;
                p251z9.j.b(enumC0518j);
                Object obj6 = list4.get(2);
                Integer num = obj6 != null ? (Integer) obj6 : null;
                p251z9.j.b(num);
                int iIntValue = num.intValue();
                Object obj7 = list4.get(3);
                Integer num2 = obj7 != null ? (Integer) obj7 : null;
                p251z9.j.b(num2);
                int iIntValue2 = num2.intValue();
                Object obj8 = list4.get(4);
                String str2 = obj8 != null ? (String) obj8 : null;
                p251z9.j.b(str2);
                switch (enumC0518j.ordinal()) {
                    case 0:
                        Object obj9 = list4.get(1);
                        u uVar = (p251z9.j.a(obj9, Boolean.FALSE) || obj9 == null) ? null : (u) ((p241y9.c) A.g.f16734t).e(obj9);
                        p251z9.j.b(uVar);
                        return new C0513e(uVar, iIntValue, iIntValue2, str2);
                    case 1:
                        Object obj10 = list4.get(1);
                        C c10 = (p251z9.j.a(obj10, Boolean.FALSE) || obj10 == null) ? null : (C) ((p241y9.c) A.f7978h.f16734t).e(obj10);
                        p251z9.j.b(c10);
                        return new C0513e(c10, iIntValue, iIntValue2, str2);
                    case 2:
                        Object obj11 = list4.get(1);
                        N n6 = (p251z9.j.a(obj11, Boolean.FALSE) || obj11 == null) ? null : (N) ((p241y9.c) A.f7974c.f16734t).e(obj11);
                        p251z9.j.b(n6);
                        return new C0513e(n6, iIntValue, iIntValue2, str2);
                    case 3:
                        Object obj12 = list4.get(1);
                        M m10 = (p251z9.j.a(obj12, Boolean.FALSE) || obj12 == null) ? null : (M) ((p241y9.c) A.f7975d.f16734t).e(obj12);
                        p251z9.j.b(m10);
                        return new C0513e(m10, iIntValue, iIntValue2, str2);
                    case 4:
                        Object obj13 = list4.get(1);
                        C0521m c0521m = (p251z9.j.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (C0521m) ((p241y9.c) A.f7976e.f16734t).e(obj13);
                        p251z9.j.b(c0521m);
                        return new C0513e(c0521m, iIntValue, iIntValue2, str2);
                    case 5:
                        Object obj14 = list4.get(1);
                        C0520l c0520l = (p251z9.j.a(obj14, Boolean.FALSE) || obj14 == null) ? null : (C0520l) ((p241y9.c) A.f7977f.f16734t).e(obj14);
                        p251z9.j.b(c0520l);
                        return new C0513e(c0520l, iIntValue, iIntValue2, str2);
                    case 6:
                        Object obj15 = list4.get(1);
                        String str3 = obj15 != null ? (String) obj15 : null;
                        p251z9.j.b(str3);
                        return new C0513e(new F(str3), iIntValue, iIntValue2, str2);
                    default:
                        throw new A6.a();
                }
            case 5:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new p055f1.a(((Float) obj).floatValue());
            case 6:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list5 = (List) obj;
                Object obj16 = list5.get(0);
                String str4 = obj16 != null ? (String) obj16 : null;
                p251z9.j.b(str4);
                Object obj17 = list5.get(1);
                return new C0520l(str4, (p251z9.j.a(obj17, Boolean.FALSE) || obj17 == null) ? null : (J) ((p241y9.c) A.f7979i.f16734t).e(obj17));
            case 7:
                if (p251z9.j.a(obj, Boolean.FALSE)) {
                    return new p180s0.q(p180s0.q.g);
                }
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p180s0.q(p180s0.F.c(((Integer) obj).intValue()));
            case 8:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new Y0.l(((Integer) obj).intValue());
            case 9:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj18 = list6.get(0);
                p055f1.f fVar = obj18 != null ? (p055f1.f) obj18 : null;
                p251z9.j.b(fVar);
                float f3 = fVar.f15904a;
                Object obj19 = list6.get(1);
                p055f1.h hVar = obj19 != null ? (p055f1.h) obj19 : null;
                p251z9.j.b(hVar);
                int i11 = hVar.f15905a;
                Object obj20 = list6.get(2);
                p251z9.j.b(obj20 != null ? (p055f1.g) obj20 : null);
                return new p055f1.i(i11, f3);
            case 10:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj21 = list7.get(0);
                String str5 = obj21 != null ? (String) obj21 : null;
                p251z9.j.b(str5);
                Object obj22 = list7.get(1);
                return new C0521m(str5, (p251z9.j.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (J) ((p241y9.c) A.f7979i.f16734t).e(obj22));
            case 11:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list8.size());
                int size2 = list8.size();
                while (i10 < size2) {
                    Object obj23 = list8.get(i10);
                    p012b1.b bVar = (p251z9.j.a(obj23, Boolean.FALSE) || obj23 == null) ? null : (p012b1.b) ((p241y9.c) A.f7989t.f16734t).e(obj23);
                    p251z9.j.b(bVar);
                    arrayList2.add(bVar);
                    i10++;
                }
                return new p012b1.c(arrayList2);
            case 12:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.String");
                return new p012b1.b(p012b1.e.f13147a.b((String) obj));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                if (p251z9.j.a(obj, Boolean.FALSE)) {
                    return new p171r0.c(9205357640488583168L);
                }
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj24 = list9.get(0);
                Float f7 = obj24 != null ? (Float) obj24 : null;
                p251z9.j.b(f7);
                float fFloatValue = f7.floatValue();
                Object obj25 = list9.get(1);
                Float f10 = obj25 != null ? (Float) obj25 : null;
                p251z9.j.b(f10);
                return new p171r0.c((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f10.floatValue())) & 4294967295L));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj26 = list10.get(0);
                p055f1.k kVar = obj26 != null ? (p055f1.k) obj26 : null;
                p251z9.j.b(kVar);
                int i12 = kVar.f15912a;
                Object obj27 = list10.get(1);
                p055f1.m mVar = obj27 != null ? (p055f1.m) obj27 : null;
                p251z9.j.b(mVar);
                int i13 = mVar.f15917a;
                Object obj28 = list10.get(2);
                p063g1.p[] pVarArr = p063g1.o.f16265b;
                z zVar = A.f7986q;
                Boolean bool = Boolean.FALSE;
                p063g1.o oVar = ((p251z9.j.a(obj28, bool) && zVar == null) || obj28 == null) ? null : (p063g1.o) zVar.f8162s.e(obj28);
                p251z9.j.b(oVar);
                long j = oVar.f16267a;
                Object obj29 = list10.get(3);
                p055f1.r rVar2 = p055f1.r.f15924c;
                p055f1.r rVar3 = (p251z9.j.a(obj29, bool) || obj29 == null) ? null : (p055f1.r) ((p241y9.c) A.f7981l.f16734t).e(obj29);
                Object obj30 = list10.get(4);
                w wVar = (p251z9.j.a(obj30, bool) || obj30 == null) ? null : (w) ((p241y9.c) B.f7991a.f16734t).e(obj30);
                Object obj31 = list10.get(5);
                p055f1.i iVar = p055f1.i.f15906c;
                p055f1.i iVar2 = (p251z9.j.a(obj31, bool) || obj31 == null) ? null : (p055f1.i) ((p241y9.c) A.f7990u.f16734t).e(obj31);
                Object obj32 = list10.get(6);
                p055f1.e eVar = (p251z9.j.a(obj32, bool) || obj32 == null) ? null : (p055f1.e) ((p241y9.c) B.f7992b.f16734t).e(obj32);
                p251z9.j.b(eVar);
                int i14 = eVar.f15900a;
                Object obj33 = list10.get(7);
                p055f1.d dVar = obj33 != null ? (p055f1.d) obj33 : null;
                p251z9.j.b(dVar);
                int i15 = dVar.f15898a;
                Object obj34 = list10.get(8);
                return new u(i12, i13, j, rVar3, wVar, iVar2, i14, i15, (p251z9.j.a(obj34, bool) || obj34 == null) ? null : (p055f1.t) ((p241y9.c) B.f7993c.f16734t).e(obj34));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                Object obj35 = list11.get(0);
                int i16 = p180s0.q.f21844h;
                z zVar2 = A.f7985p;
                Boolean bool2 = Boolean.FALSE;
                p180s0.q qVar = ((p251z9.j.a(obj35, bool2) && zVar2 == null) || obj35 == null) ? null : (p180s0.q) zVar2.f8162s.e(obj35);
                p251z9.j.b(qVar);
                long j10 = qVar.f21845a;
                Object obj36 = list11.get(1);
                z zVar3 = A.f7987r;
                p171r0.c cVar = ((p251z9.j.a(obj36, bool2) && zVar3 == null) || obj36 == null) ? null : (p171r0.c) zVar3.f8162s.e(obj36);
                p251z9.j.b(cVar);
                long j11 = cVar.f21387a;
                Object obj37 = list11.get(2);
                Float f11 = obj37 != null ? (Float) obj37 : null;
                p251z9.j.b(f11);
                return new p180s0.I(j10, j11, f11.floatValue());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj38 = list12.get(0);
                int i17 = p180s0.q.f21844h;
                z zVar4 = A.f7985p;
                Boolean bool3 = Boolean.FALSE;
                p180s0.q qVar2 = ((p251z9.j.a(obj38, bool3) && zVar4 == null) || obj38 == null) ? null : (p180s0.q) zVar4.f8162s.e(obj38);
                p251z9.j.b(qVar2);
                long j12 = qVar2.f21845a;
                Object obj39 = list12.get(1);
                p063g1.p[] pVarArr2 = p063g1.o.f16265b;
                z zVar5 = A.f7986q;
                p063g1.o oVar2 = ((p251z9.j.a(obj39, bool3) && zVar5 == null) || obj39 == null) ? null : (p063g1.o) zVar5.f8162s.e(obj39);
                p251z9.j.b(oVar2);
                long j13 = oVar2.f16267a;
                Object obj40 = list12.get(2);
                Y0.l lVar = Y0.l.f10358s;
                Y0.l lVar2 = (p251z9.j.a(obj40, bool3) || obj40 == null) ? null : (Y0.l) ((p241y9.c) A.f7982m.f16734t).e(obj40);
                Object obj41 = list12.get(3);
                Y0.j jVar = obj41 != null ? (Y0.j) obj41 : null;
                Object obj42 = list12.get(4);
                Y0.k kVar2 = obj42 != null ? (Y0.k) obj42 : null;
                Object obj43 = list12.get(6);
                String str6 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list12.get(7);
                p063g1.o oVar3 = ((p251z9.j.a(obj44, bool3) && zVar5 == null) || obj44 == null) ? null : (p063g1.o) zVar5.f8162s.e(obj44);
                p251z9.j.b(oVar3);
                long j14 = oVar3.f16267a;
                Object obj45 = list12.get(8);
                p055f1.a aVar = (p251z9.j.a(obj45, bool3) || obj45 == null) ? null : (p055f1.a) ((p241y9.c) A.f7983n.f16734t).e(obj45);
                Object obj46 = list12.get(9);
                p055f1.q qVar3 = (p251z9.j.a(obj46, bool3) || obj46 == null) ? null : (p055f1.q) ((p241y9.c) A.f7980k.f16734t).e(obj46);
                Object obj47 = list12.get(10);
                p012b1.c cVar2 = p012b1.c.f13144t;
                p012b1.c cVar3 = (p251z9.j.a(obj47, bool3) || obj47 == null) ? null : (p012b1.c) ((p241y9.c) A.f7988s.f16734t).e(obj47);
                Object obj48 = list12.get(11);
                p180s0.q qVar4 = ((p251z9.j.a(obj48, bool3) && zVar4 == null) || obj48 == null) ? null : (p180s0.q) zVar4.f8162s.e(obj48);
                p251z9.j.b(qVar4);
                long j15 = qVar4.f21845a;
                Object obj49 = list12.get(12);
                p055f1.l lVar3 = (p251z9.j.a(obj49, bool3) || obj49 == null) ? null : (p055f1.l) ((p241y9.c) A.j.f16734t).e(obj49);
                Object obj50 = list12.get(13);
                p180s0.I i18 = p180s0.I.f21798d;
                return new C(j12, j13, lVar2, jVar, kVar2, (Y0.e) null, str6, j14, aVar, qVar3, cVar3, j15, lVar3, (p251z9.j.a(obj50, bool3) || obj50 == null) ? null : (p180s0.I) ((p241y9.c) A.f7984o.f16734t).e(obj50), 49184);
            case 17:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p055f1.l(((Integer) obj).intValue());
            case 18:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list13 = (List) obj;
                return new p055f1.q(((Number) list13.get(0)).floatValue(), ((Number) list13.get(1)).floatValue());
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj51 = list14.get(0);
                p063g1.p[] pVarArr3 = p063g1.o.f16265b;
                z zVar6 = A.f7986q;
                Boolean bool4 = Boolean.FALSE;
                p063g1.o oVar4 = ((p251z9.j.a(obj51, bool4) && zVar6 == null) || obj51 == null) ? null : (p063g1.o) zVar6.f8162s.e(obj51);
                p251z9.j.b(oVar4);
                long j16 = oVar4.f16267a;
                Object obj52 = list14.get(1);
                p063g1.o oVar5 = ((p251z9.j.a(obj52, bool4) && zVar6 == null) || obj52 == null) ? null : (p063g1.o) zVar6.f8162s.e(obj52);
                p251z9.j.b(oVar5);
                return new p055f1.r(j16, oVar5.f16267a);
            case 20:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj53 = list15.get(0);
                p085i0.n nVar = A.f7978h;
                Boolean bool5 = Boolean.FALSE;
                C c11 = (p251z9.j.a(obj53, bool5) || obj53 == null) ? null : (C) ((p241y9.c) nVar.f16734t).e(obj53);
                Object obj54 = list15.get(1);
                C c12 = (p251z9.j.a(obj54, bool5) || obj54 == null) ? null : (C) ((p241y9.c) nVar.f16734t).e(obj54);
                Object obj55 = list15.get(2);
                C c13 = (p251z9.j.a(obj55, bool5) || obj55 == null) ? null : (C) ((p241y9.c) nVar.f16734t).e(obj55);
                Object obj56 = list15.get(3);
                return new J(c11, c12, c13, (p251z9.j.a(obj56, bool5) || obj56 == null) ? null : (C) ((p241y9.c) nVar.f16734t).e(obj56));
            case 21:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list16 = (List) obj;
                Object obj57 = list16.get(0);
                Integer num3 = obj57 != null ? (Integer) obj57 : null;
                p251z9.j.b(num3);
                int iIntValue3 = num3.intValue();
                Object obj58 = list16.get(1);
                Integer num4 = obj58 != null ? (Integer) obj58 : null;
                p251z9.j.b(num4);
                return new K(va.g.e(iIntValue3, num4.intValue()));
            case 22:
                if (p251z9.j.a(obj, Boolean.FALSE)) {
                    return new p063g1.o(p063g1.o.f16266c);
                }
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj59 = list17.get(0);
                Float f12 = obj59 != null ? (Float) obj59 : null;
                p251z9.j.b(f12);
                float fFloatValue2 = f12.floatValue();
                Object obj60 = list17.get(1);
                p063g1.p pVar = obj60 != null ? (p063g1.p) obj60 : null;
                p251z9.j.b(pVar);
                return new p063g1.o(F9.n.L(pVar.f16268a, fFloatValue2));
            case 23:
                String str7 = obj != null ? (String) obj : null;
                p251z9.j.b(str7);
                return new M(str7);
            case 24:
                String str8 = obj != null ? (String) obj : null;
                p251z9.j.b(str8);
                return new N(str8);
            case 25:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new p055f1.e(((Integer) obj).intValue());
            case 26:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                p251z9.j.b(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                p251z9.j.b(obj62 != null ? (C0519k) obj62 : null);
                return new w(zBooleanValue);
            default:
                p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                p055f1.s sVar = obj63 != null ? (p055f1.s) obj63 : null;
                p251z9.j.b(sVar);
                int i19 = sVar.f15927a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                p251z9.j.b(bool7);
                return new p055f1.t(i19, bool7.booleanValue());
        }
    }
}
