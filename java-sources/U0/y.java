package U0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final y f8136A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final y f8137B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final y f8138C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final y f8139D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final y f8140E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final y f8141F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final y f8142G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final y f8143H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final y f8144I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final y f8145J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final y f8146K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final y f8147L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final y f8148M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final y f8149N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final y f8150O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final y f8151P;
    public static final y Q;
    public static final y R;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f8152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f8153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f8154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f8155v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y f8156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y f8157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y f8158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final y f8159z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8160r;

    static {
        int i10 = 2;
        f8152s = new y(i10, 0);
        f8153t = new y(i10, 1);
        f8154u = new y(i10, 2);
        f8155v = new y(i10, 3);
        f8156w = new y(i10, 4);
        f8157x = new y(i10, 5);
        f8158y = new y(i10, 6);
        f8159z = new y(i10, 7);
        f8136A = new y(i10, 8);
        f8137B = new y(i10, 9);
        f8138C = new y(i10, 10);
        f8139D = new y(i10, 11);
        f8140E = new y(i10, 12);
        f8141F = new y(i10, 13);
        f8142G = new y(i10, 14);
        f8143H = new y(i10, 15);
        f8144I = new y(i10, 16);
        f8145J = new y(i10, 17);
        f8146K = new y(i10, 18);
        f8147L = new y(i10, 19);
        f8148M = new y(i10, 20);
        f8149N = new y(i10, 21);
        f8150O = new y(i10, 22);
        f8151P = new y(i10, 23);
        Q = new y(i10, 24);
        R = new y(i10, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11) {
        super(i10);
        this.f8160r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        EnumC0518j enumC0518j;
        Object objA;
        int i10 = 0;
        switch (this.f8160r) {
            case 0:
                C0515g c0515g = (C0515g) obj2;
                String str = c0515g.f8060s;
                p085i0.n nVar = A.f7972a;
                return AbstractC0813f2.m(str, A.a(c0515g.f8059r, A.f7972a, (p085i0.b) obj));
            case 1:
                p085i0.b bVar = (p085i0.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i10 < size) {
                    arrayList.add(A.a((C0513e) list.get(i10), A.f7973b, bVar));
                    i10++;
                }
                return arrayList;
            case 2:
                p085i0.b bVar2 = (p085i0.b) obj;
                C0513e c0513e = (C0513e) obj2;
                Object obj3 = c0513e.f8054a;
                if (obj3 instanceof u) {
                    enumC0518j = EnumC0518j.f8089r;
                } else if (obj3 instanceof C) {
                    enumC0518j = EnumC0518j.f8090s;
                } else if (obj3 instanceof N) {
                    enumC0518j = EnumC0518j.f8091t;
                } else if (obj3 instanceof M) {
                    enumC0518j = EnumC0518j.f8092u;
                } else if (obj3 instanceof C0521m) {
                    enumC0518j = EnumC0518j.f8093v;
                } else if (obj3 instanceof C0520l) {
                    enumC0518j = EnumC0518j.f8094w;
                } else {
                    if (!(obj3 instanceof F)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC0518j = EnumC0518j.f8095x;
                }
                switch (enumC0518j.ordinal()) {
                    case 0:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = A.a((u) obj3, A.g, bVar2);
                        break;
                    case 1:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = A.a((C) obj3, A.f7978h, bVar2);
                        break;
                    case 2:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = A.a((N) obj3, A.f7974c, bVar2);
                        break;
                    case 3:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = A.a((M) obj3, A.f7975d, bVar2);
                        break;
                    case 4:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = A.a((C0521m) obj3, A.f7976e, bVar2);
                        break;
                    case 5:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = A.a((C0520l) obj3, A.f7977f, bVar2);
                        break;
                    case 6:
                        p251z9.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((F) obj3).f8012a;
                        p085i0.n nVar2 = A.f7972a;
                        break;
                    default:
                        throw new A6.a();
                }
                return AbstractC0813f2.m(enumC0518j, objA, Integer.valueOf(c0513e.f8055b), Integer.valueOf(c0513e.f8056c), c0513e.f8057d);
            case 3:
                return Float.valueOf(((p055f1.a) obj2).f15894a);
            case 4:
                C0520l c0520l = (C0520l) obj2;
                String str2 = c0520l.f8097a;
                p085i0.n nVar3 = A.f7972a;
                return AbstractC0813f2.m(str2, A.a(c0520l.f8098b, A.f7979i, (p085i0.b) obj));
            case 5:
                long j = ((p180s0.q) obj2).f21845a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(p180s0.F.u(j));
            case 6:
                return Integer.valueOf(((Y0.l) obj2).f10364r);
            case 7:
                p055f1.i iVar = (p055f1.i) obj2;
                p055f1.f fVar = new p055f1.f(iVar.f15907a);
                p085i0.n nVar4 = A.f7972a;
                return AbstractC0813f2.m(fVar, new p055f1.h(iVar.f15908b), new p055f1.g());
            case 8:
                C0521m c0521m = (C0521m) obj2;
                String str3 = c0521m.f8099a;
                p085i0.n nVar5 = A.f7972a;
                return AbstractC0813f2.m(str3, A.a(c0521m.f8100b, A.f7979i, (p085i0.b) obj));
            case 9:
                p085i0.b bVar3 = (p085i0.b) obj;
                List list2 = ((p012b1.c) obj2).f13145r;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i10 < size2) {
                    arrayList2.add(A.a((p012b1.b) list2.get(i10), A.f7989t, bVar3));
                    i10++;
                }
                return arrayList2;
            case 10:
                return ((p012b1.b) obj2).f13143a.toLanguageTag();
            case 11:
                long j10 = ((p171r0.c) obj2).f21387a;
                if (p171r0.c.b(j10, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)));
                p085i0.n nVar6 = A.f7972a;
                return AbstractC0813f2.m(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            case 12:
                p085i0.b bVar4 = (p085i0.b) obj;
                u uVar = (u) obj2;
                p055f1.k kVar = new p055f1.k(uVar.f8124a);
                p085i0.n nVar7 = A.f7972a;
                p055f1.m mVar = new p055f1.m(uVar.f8125b);
                Object objA2 = A.a(new p063g1.o(uVar.f8126c), A.f7986q, bVar4);
                p055f1.r rVar = uVar.f8127d;
                p055f1.r rVar2 = p055f1.r.f15924c;
                Object objA3 = A.a(rVar, A.f7981l, bVar4);
                Object objA4 = A.a(uVar.f8128e, B.f7991a, bVar4);
                p055f1.i iVar2 = uVar.f8129f;
                p055f1.i iVar3 = p055f1.i.f15906c;
                return AbstractC0813f2.m(kVar, mVar, objA2, objA3, objA4, A.a(iVar2, A.f7990u, bVar4), A.a(new p055f1.e(uVar.g), B.f7992b, bVar4), new p055f1.d(uVar.f8130h), A.a(uVar.f8131i, B.f7993c, bVar4));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                p085i0.b bVar5 = (p085i0.b) obj;
                p180s0.I i11 = (p180s0.I) obj2;
                return AbstractC0813f2.m(A.a(new p180s0.q(i11.f21799a), A.f7985p, bVar5), A.a(new p171r0.c(i11.f21800b), A.f7987r, bVar5), Float.valueOf(i11.f21801c));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p085i0.b bVar6 = (p085i0.b) obj;
                C c10 = (C) obj2;
                p180s0.q qVar = new p180s0.q(c10.f7994a.b());
                z zVar = A.f7985p;
                Object objA5 = A.a(qVar, zVar, bVar6);
                p063g1.o oVar = new p063g1.o(c10.f7995b);
                z zVar2 = A.f7986q;
                Object objA6 = A.a(oVar, zVar2, bVar6);
                Y0.l lVar = c10.f7996c;
                Y0.l lVar2 = Y0.l.f10358s;
                Object objA7 = A.a(lVar, A.f7982m, bVar6);
                Y0.j jVar = c10.f7997d;
                Y0.k kVar2 = c10.f7998e;
                String str4 = c10.g;
                Object objA8 = A.a(new p063g1.o(c10.f8000h), zVar2, bVar6);
                Object objA9 = A.a(c10.f8001i, A.f7983n, bVar6);
                Object objA10 = A.a(c10.j, A.f7980k, bVar6);
                p012b1.c cVar = c10.f8002k;
                p012b1.c cVar2 = p012b1.c.f13144t;
                Object objA11 = A.a(cVar, A.f7988s, bVar6);
                Object objA12 = A.a(new p180s0.q(c10.f8003l), zVar, bVar6);
                Object objA13 = A.a(c10.f8004m, A.j, bVar6);
                p180s0.I i12 = c10.f8005n;
                p180s0.I i13 = p180s0.I.f21798d;
                return AbstractC0813f2.m(objA5, objA6, objA7, jVar, kVar2, -1, str4, objA8, objA9, objA10, objA11, objA12, objA13, A.a(i12, A.f7984o, bVar6));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return Integer.valueOf(((p055f1.l) obj2).f15916a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p055f1.q qVar2 = (p055f1.q) obj2;
                return AbstractC0813f2.m(Float.valueOf(qVar2.f15922a), Float.valueOf(qVar2.f15923b));
            case 17:
                p085i0.b bVar7 = (p085i0.b) obj;
                p055f1.r rVar3 = (p055f1.r) obj2;
                p063g1.o oVar2 = new p063g1.o(rVar3.f15925a);
                z zVar3 = A.f7986q;
                return AbstractC0813f2.m(A.a(oVar2, zVar3, bVar7), A.a(new p063g1.o(rVar3.f15926b), zVar3, bVar7));
            case 18:
                p085i0.b bVar8 = (p085i0.b) obj;
                J j11 = (J) obj2;
                C c11 = j11.f8029a;
                p085i0.n nVar8 = A.f7978h;
                return AbstractC0813f2.m(A.a(c11, nVar8, bVar8), A.a(j11.f8030b, nVar8, bVar8), A.a(j11.f8031c, nVar8, bVar8), A.a(j11.f8032d, nVar8, bVar8));
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                long j12 = ((K) obj2).f8035a;
                int i14 = K.f8034c;
                Integer numValueOf = Integer.valueOf((int) (j12 >> 32));
                p085i0.n nVar9 = A.f7972a;
                return AbstractC0813f2.m(numValueOf, Integer.valueOf((int) (j12 & 4294967295L)));
            case 20:
                long j13 = ((p063g1.o) obj2).f16267a;
                if (p063g1.o.a(j13, p063g1.o.f16266c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(p063g1.o.c(j13));
                p085i0.n nVar10 = A.f7972a;
                return AbstractC0813f2.m(fValueOf2, new p063g1.p(p063g1.o.b(j13)));
            case 21:
                String str5 = ((M) obj2).f8040a;
                p085i0.n nVar11 = A.f7972a;
                return str5;
            case 22:
                String str6 = ((N) obj2).f8041a;
                p085i0.n nVar12 = A.f7972a;
                return str6;
            case 23:
                return Integer.valueOf(((p055f1.e) obj2).f15900a);
            case 24:
                Boolean boolValueOf = Boolean.valueOf(((w) obj2).f8134a);
                p085i0.n nVar13 = A.f7972a;
                return AbstractC0813f2.m(boolValueOf, new C0519k());
            default:
                p055f1.t tVar = (p055f1.t) obj2;
                p055f1.s sVar = new p055f1.s(tVar.f15930a);
                p085i0.n nVar14 = A.f7972a;
                return AbstractC0813f2.m(sVar, Boolean.valueOf(tVar.f15931b));
        }
    }
}
