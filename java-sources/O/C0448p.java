package O;

import com.google.android.gms.internal.measurement.J1;

/* JADX INFO: renamed from: O.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0448p extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E2.A f6395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J1 f6398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6399v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0448p(E2.A a9, int i10, int i11, J1 j10, p110k9.g gVar) {
        super(0);
        this.f6395r = a9;
        this.f6396s = i10;
        this.f6397t = i11;
        this.f6398u = j10;
        this.f6399v = gVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k9.g] */
    @Override // p241y9.a
    public final Object invoke() {
        E2.A a9 = this.f6395r;
        U0.I i10 = (U0.I) a9.f1437e;
        int iIntValue = ((Number) this.f6399v.getValue()).intValue();
        J1 j10 = this.f6398u;
        boolean z10 = j10.f14055b;
        boolean z11 = j10.d() == EnumC0442j.f6376r;
        int i11 = this.f6396s;
        long jI = i10.i(i11);
        U0.p pVar = i10.f8024b;
        int i12 = U0.K.f8034c;
        int iF = (int) (jI >> 32);
        int iD = pVar.d(iF);
        int i13 = pVar.f8111f;
        if (iD != iIntValue) {
            iF = iIntValue >= i13 ? i10.f(i13 - 1) : i10.f(iIntValue);
        }
        int iC = (int) (jI & 4294967295L);
        if (pVar.d(iC) != iIntValue) {
            iC = iIntValue >= i13 ? pVar.c(i13 - 1, false) : pVar.c(iIntValue, false);
        }
        int i14 = this.f6397t;
        if (iF == i14) {
            return a9.d(iC);
        }
        if (iC == i14) {
            return a9.d(iF);
        }
        if (!(z10 ^ z11) ? i11 >= iF : i11 > iC) {
            iF = iC;
        }
        return a9.d(iF);
    }
}
