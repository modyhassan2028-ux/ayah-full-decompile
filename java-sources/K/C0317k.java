package K;

import A.EnumC0047u0;
import U0.AbstractC0522n;
import U0.C0513e;
import Z0.C0714e;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: renamed from: K.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0317k extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0317k f4662A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0317k f4663B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0317k f4664C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0317k f4665D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0317k f4666E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0317k f4667F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0317k f4668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0317k f4669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0317k f4670u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0317k f4671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0317k f4672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0317k f4673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0317k f4674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0317k f4675z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4676r;

    static {
        int i10 = 1;
        f4668s = new C0317k(i10, 0);
        f4669t = new C0317k(i10, 1);
        f4670u = new C0317k(i10, 2);
        f4671v = new C0317k(i10, 3);
        f4672w = new C0317k(i10, 4);
        f4673x = new C0317k(i10, 5);
        f4674y = new C0317k(i10, 6);
        f4675z = new C0317k(i10, 7);
        f4662A = new C0317k(i10, 8);
        f4663B = new C0317k(i10, 9);
        f4664C = new C0317k(i10, 10);
        f4665D = new C0317k(i10, 11);
        f4666E = new C0317k(i10, 12);
        f4667F = new C0317k(i10, 13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0317k(int i10, int i11) {
        super(i10);
        this.f4676r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        U0.J jA;
        U0.C c10;
        int i10 = this.f4676r;
        p110k9.y yVar = p110k9.y.f19095a;
        switch (i10) {
            case 0:
                return yVar;
            case 1:
                return yVar;
            case 2:
                return yVar;
            case 3:
                return yVar;
            case 4:
                return yVar;
            case 5:
                O.G g = (O.G) obj;
                long j = g.f6290f;
                int i11 = U0.K.f8034c;
                return new C0714e(((int) (j & 4294967295L)) - T.u((int) (4294967295L & j), g.g.f8060s), 0);
            case 6:
                O.G g10 = (O.G) obj;
                String str = g10.g.f8060s;
                long j10 = g10.f6290f;
                int i12 = U0.K.f8034c;
                int iR = T.r((int) (j10 & 4294967295L), str);
                if (iR != -1) {
                    return new C0714e(0, iR - ((int) (4294967295L & g10.f6290f)));
                }
                return null;
            case 7:
                O.G g11 = (O.G) obj;
                Integer numE = g11.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j11 = g11.f6290f;
                int i13 = U0.K.f8034c;
                return new C0714e(((int) (4294967295L & j11)) - iIntValue, 0);
            case 8:
                O.G g12 = (O.G) obj;
                Integer numD = g12.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j12 = g12.f6290f;
                int i14 = U0.K.f8034c;
                return new C0714e(0, iIntValue2 - ((int) (4294967295L & j12)));
            case 9:
                O.G g13 = (O.G) obj;
                Integer numC = g13.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j13 = g13.f6290f;
                int i15 = U0.K.f8034c;
                return new C0714e(((int) (4294967295L & j13)) - iIntValue3, 0);
            case 10:
                O.G g14 = (O.G) obj;
                Integer numB = g14.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j14 = g14.f6290f;
                int i16 = U0.K.f8034c;
                return new C0714e(0, iIntValue4 - ((int) (4294967295L & j14)));
            case 11:
                List list = (List) obj;
                Object obj2 = list.get(1);
                p251z9.j.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                EnumC0047u0 enumC0047u0 = ((Boolean) obj2).booleanValue() ? EnumC0047u0.f424r : EnumC0047u0.f425s;
                Object obj3 = list.get(0);
                p251z9.j.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new r0(enumC0047u0, ((Float) obj3).floatValue());
            case 12:
                C0513e c0513e = (C0513e) obj;
                Object obj4 = c0513e.f8054a;
                if (!(obj4 instanceof AbstractC0522n) || (jA = ((AbstractC0522n) obj4).a()) == null || (jA.f8029a == null && jA.f8030b == null && jA.f8031c == null && jA.f8032d == null)) {
                    return AbstractC0813f2.m(c0513e);
                }
                Object obj5 = c0513e.f8054a;
                p251z9.j.c(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                U0.J jA2 = ((AbstractC0522n) obj5).a();
                if (jA2 == null || (c10 = jA2.f8029a) == null) {
                    c10 = new U0.C(0L, 0L, (Y0.l) null, (Y0.j) null, (Y0.k) null, (Y0.e) null, (String) null, 0L, (p055f1.a) null, (p055f1.q) null, (p012b1.c) null, 0L, (p055f1.l) null, (p180s0.I) null, 65535);
                }
                return AbstractC0813f2.m(c0513e, new C0513e(c0513e.f8055b, c0513e.f8056c, c10));
            default:
                ((R0.j) obj).e(R0.s.f7178y, yVar);
                return yVar;
        }
    }
}
