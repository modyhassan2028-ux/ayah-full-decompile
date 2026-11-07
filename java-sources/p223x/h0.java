package p223x;

import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import p063g1.f;
import p063g1.g;
import p063g1.j;
import p063g1.l;
import p093j0.u;
import p110k9.y;
import p171r0.e;
import p171r0.i;
import p241y9.a;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends k implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final h0 f23985A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final h0 f23986B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final h0 f23987C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final h0 f23988D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final h0 f23989E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final h0 f23990F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final h0 f23991G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final h0 f23992H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final h0 f23993I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final h0 f23994J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final h0 f23995K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final h0 f23996L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final h0 f23997M;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h0 f23998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h0 f23999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h0 f24000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h0 f24001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h0 f24002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h0 f24003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h0 f24004y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h0 f24005z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24006r;

    static {
        int i10 = 1;
        f23998s = new h0(i10, 0);
        f23999t = new h0(i10, 1);
        f24000u = new h0(i10, 2);
        f24001v = new h0(i10, 3);
        f24002w = new h0(i10, 4);
        f24003x = new h0(i10, 5);
        f24004y = new h0(i10, 6);
        f24005z = new h0(i10, 7);
        f23985A = new h0(i10, 8);
        f23986B = new h0(i10, 9);
        f23987C = new h0(i10, 10);
        f23988D = new h0(i10, 11);
        f23989E = new h0(i10, 12);
        f23990F = new h0(i10, 13);
        f23991G = new h0(i10, 14);
        f23992H = new h0(i10, 15);
        f23993I = new h0(i10, 16);
        f23994J = new h0(i10, 17);
        f23995K = new h0(i10, 18);
        f23996L = new h0(i10, 19);
        f23997M = new h0(i10, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10, int i11) {
        super(i10);
        this.f24006r = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k9.g] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f24006r) {
            case 0:
                return y.f19095a;
            case 1:
                ((a) obj).invoke();
                return y.f19095a;
            case 2:
                X x9 = (X) obj;
                long j = x9.f23919w;
                ((u) t0.f24106a.getValue()).d(x9, f24000u, x9.f23920x);
                long j10 = x9.f23919w;
                if (j != j10) {
                    O o10 = x9.f23911E;
                    if (o10 != null) {
                        if (o10.f23864a > j10) {
                            x9.v();
                        } else {
                            o10.g = j10;
                            if (o10.f23865b == null) {
                                o10.f23870h = B9.a.W((1.0d - ((double) o10.f23868e.a(0))) * x9.f23919w);
                            }
                        }
                    } else if (j10 != 0) {
                        x9.x();
                    }
                }
                return y.f19095a;
            case 3:
                long j11 = ((g) obj).f16253a;
                return new C1424m(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            case 4:
                C1424m c1424m = (C1424m) obj;
                return new g((((long) Float.floatToRawIntBits(c1424m.f24037a)) << 32) | (((long) Float.floatToRawIntBits(c1424m.f24038b)) & 4294967295L));
            case 5:
                return new C1423l(((f) obj).f16252r);
            case 6:
                return new f(((C1423l) obj).f24036a);
            case 7:
                return new C1423l(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C1423l) obj).f24036a);
            case 9:
                long j12 = ((j) obj).f16254a;
                return new C1424m((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 10:
                C1424m c1424m2 = (C1424m) obj;
                return new j((((long) Math.round(c1424m2.f24037a)) << 32) | (((long) Math.round(c1424m2.f24038b)) & 4294967295L));
            case 11:
                long j13 = ((l) obj).f16260a;
                return new C1424m((int) (j13 >> 32), (int) (j13 & 4294967295L));
            case 12:
                C1424m c1424m3 = (C1424m) obj;
                int iRound = Math.round(c1424m3.f24037a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c1424m3.f24038b);
                return new l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new C1423l(((Number) obj).intValue());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return Integer.valueOf((int) ((C1423l) obj).f24036a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                long j14 = ((p171r0.c) obj).f21387a;
                return new C1424m(Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                C1424m c1424m4 = (C1424m) obj;
                return new p171r0.c((((long) Float.floatToRawIntBits(c1424m4.f24037a)) << 32) | (((long) Float.floatToRawIntBits(c1424m4.f24038b)) & 4294967295L));
            case 17:
                e eVar = (e) obj;
                return new C1426o(eVar.f21389a, eVar.f21390b, eVar.f21391c, eVar.f21392d);
            case 18:
                C1426o c1426o = (C1426o) obj;
                return new e(c1426o.f24059a, c1426o.f24060b, c1426o.f24061c, c1426o.f24062d);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                long j15 = ((i) obj).f21400a;
                return new C1424m(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)));
            default:
                C1424m c1424m5 = (C1424m) obj;
                return new i((((long) Float.floatToRawIntBits(c1424m5.f24037a)) << 32) | (((long) Float.floatToRawIntBits(c1424m5.f24038b)) & 4294967295L));
        }
    }
}
