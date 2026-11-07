package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0796c0 extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14218x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0796c0(C0846m0 c0846m0, String str, int i10) {
        super(c0846m0, true);
        this.f14216v = i10;
        this.f14217w = str;
        this.f14218x = c0846m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        switch (this.f14216v) {
            case 0:
                L l10 = this.f14218x.f14362f;
                U6.y.f(l10);
                l10.beginAdUnitExposure(this.f14217w, this.f14334s);
                break;
            default:
                L l11 = this.f14218x.f14362f;
                U6.y.f(l11);
                l11.endAdUnitExposure(this.f14217w, this.f14334s);
                break;
        }
    }
}
