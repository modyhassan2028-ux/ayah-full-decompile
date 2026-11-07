package W;

/* JADX INFO: loaded from: classes.dex */
public final class X1 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ H0.U f8907A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ H0.U f8908B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Y1 f8909C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f8910D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ H0.K f8911E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H0.U f8912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f8914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H0.U f8915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H0.U f8916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H0.U f8917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ H0.U f8918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ H0.U f8919y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ H0.U f8920z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(H0.U u8, int i10, int i11, H0.U u10, H0.U u11, H0.U u12, H0.U u13, H0.U u14, H0.U u15, H0.U u16, H0.U u17, Y1 y10, int i12, H0.K k7) {
        super(1);
        this.f8912r = u8;
        this.f8913s = i10;
        this.f8914t = i11;
        this.f8915u = u10;
        this.f8916v = u11;
        this.f8917w = u12;
        this.f8918x = u13;
        this.f8919y = u14;
        this.f8920z = u15;
        this.f8907A = u16;
        this.f8908B = u17;
        this.f8909C = y10;
        this.f8910D = i12;
        this.f8911E = k7;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        boolean z10;
        int iV;
        H0.T t2 = (H0.T) obj;
        Y1 y10 = this.f8909C;
        boolean z11 = y10.f8927a;
        H0.U u8 = this.f8907A;
        H0.U u10 = this.f8915u;
        H0.K k7 = this.f8911E;
        H0.U u11 = this.f8908B;
        H0.U u12 = this.f8920z;
        H0.U u13 = this.f8919y;
        H0.U u14 = this.f8918x;
        H0.U u15 = this.f8917w;
        H0.U u16 = this.f8916v;
        int i10 = this.f8914t;
        int i11 = this.f8913s;
        H0.U u17 = this.f8912r;
        if (u17 != null) {
            int i12 = u17.f3169s;
            int i13 = this.f8910D;
            int i14 = i13 + i12;
            float f3 = y10.f8928b;
            float density = k7.getDensity();
            int i15 = W1.f8894a;
            H0.T.f(t2, u8, 0L);
            float f7 = X.M.f9711b;
            int i16 = i10 - (u11 != null ? u11.f3169s : 0);
            if (u15 != null) {
                H0.T.g(t2, u15, 0, Math.round((1 + 0.0f) * ((i16 - u15.f3169s) / 2.0f)));
            }
            if (z11) {
                iV = Math.round((1 + 0.0f) * ((i16 - u17.f3169s) / 2.0f));
            } else {
                iV = B9.a.V(X.M.f9711b * density);
            }
            H0.T.g(t2, u17, u15 != null ? u15.f3168r : 0, iV - B9.a.V((iV - i13) * f3));
            if (u13 != null) {
                H0.T.g(t2, u13, u15 != null ? u15.f3168r : 0, i14);
            }
            int i17 = (u15 != null ? u15.f3168r : 0) + (u13 != null ? u13.f3168r : 0);
            H0.T.g(t2, u10, i17, i14);
            if (u16 != null) {
                H0.T.g(t2, u16, i17, i14);
            }
            if (u12 != null) {
                H0.T.g(t2, u12, (i11 - (u14 != null ? u14.f3168r : 0)) - u12.f3168r, i14);
            }
            if (u14 != null) {
                H0.T.g(t2, u14, i11 - u14.f3168r, Math.round((1 + 0.0f) * ((i16 - u14.f3169s) / 2.0f)));
            }
            if (u11 != null) {
                H0.T.g(t2, u11, 0, i16);
            }
        } else {
            float density2 = k7.getDensity();
            D.P p10 = y10.f8929c;
            int i18 = W1.f8894a;
            H0.T.f(t2, u8, 0L);
            float f10 = X.M.f9711b;
            int i19 = i10 - (u11 != null ? u11.f3169s : 0);
            int iV2 = B9.a.V(p10.f909b * density2);
            if (u15 != null) {
                H0.T.g(t2, u15, 0, Math.round((1 + 0.0f) * ((i19 - u15.f3169s) / 2.0f)));
            }
            if (u13 != null) {
                z10 = z11;
                H0.T.g(t2, u13, u15 != null ? u15.f3168r : 0, W1.e(z10, i19, iV2, u13));
            } else {
                z10 = z11;
            }
            int i20 = (u15 != null ? u15.f3168r : 0) + (u13 != null ? u13.f3168r : 0);
            H0.T.g(t2, u10, i20, W1.e(z10, i19, iV2, u10));
            if (u16 != null) {
                H0.T.g(t2, u16, i20, W1.e(z10, i19, iV2, u16));
            }
            if (u12 != null) {
                H0.T.g(t2, u12, (i11 - (u14 != null ? u14.f3168r : 0)) - u12.f3168r, W1.e(z10, i19, iV2, u12));
            }
            if (u14 != null) {
                H0.T.g(t2, u14, i11 - u14.f3168r, Math.round((1 + 0.0f) * ((i19 - u14.f3169s) / 2.0f)));
            }
            if (u11 != null) {
                H0.T.g(t2, u11, 0, i19);
            }
        }
        return p110k9.y.f19095a;
    }
}
