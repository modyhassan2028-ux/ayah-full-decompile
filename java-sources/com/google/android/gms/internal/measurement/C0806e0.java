package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0806e0 extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ I f14232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14233x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0806e0(C0846m0 c0846m0, I i10, int i11) {
        super(c0846m0, true);
        this.f14231v = i11;
        this.f14232w = i10;
        this.f14233x = c0846m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        switch (this.f14231v) {
            case 0:
                L l10 = this.f14233x.f14362f;
                U6.y.f(l10);
                l10.getGmpAppId(this.f14232w);
                break;
            case 1:
                L l11 = this.f14233x.f14362f;
                U6.y.f(l11);
                l11.getCachedAppInstanceId(this.f14232w);
                break;
            case 2:
                L l12 = this.f14233x.f14362f;
                U6.y.f(l12);
                l12.generateEventId(this.f14232w);
                break;
            case 3:
                L l13 = this.f14233x.f14362f;
                U6.y.f(l13);
                l13.getCurrentScreenName(this.f14232w);
                break;
            default:
                L l14 = this.f14233x.f14362f;
                U6.y.f(l14);
                l14.getCurrentScreenClass(this.f14232w);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void b() {
        switch (this.f14231v) {
            case 0:
                this.f14232w.D(null);
                break;
            case 1:
                this.f14232w.D(null);
                break;
            case 2:
                this.f14232w.D(null);
                break;
            case 3:
                this.f14232w.D(null);
                break;
            default:
                this.f14232w.D(null);
                break;
        }
    }
}
