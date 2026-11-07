package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0816g0 extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f14247A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14248v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f14251y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14252z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816g0(C0846m0 c0846m0, String str, String str2, Bundle bundle, boolean z10) {
        super(c0846m0, true);
        this.f14249w = str;
        this.f14250x = str2;
        this.f14247A = bundle;
        this.f14251y = z10;
        this.f14252z = c0846m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        switch (this.f14248v) {
            case 0:
                L l10 = this.f14252z.f14362f;
                U6.y.f(l10);
                l10.getUserProperties(this.f14249w, this.f14250x, this.f14251y, (I) this.f14247A);
                break;
            default:
                long j = this.f14333r;
                L l11 = this.f14252z.f14362f;
                U6.y.f(l11);
                l11.logEvent(this.f14249w, this.f14250x, (Bundle) this.f14247A, this.f14251y, true, j);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public void b() {
        switch (this.f14248v) {
            case 0:
                ((I) this.f14247A).D(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816g0(C0846m0 c0846m0, String str, String str2, boolean z10, I i10) {
        super(c0846m0, true);
        this.f14249w = str;
        this.f14250x = str2;
        this.f14251y = z10;
        this.f14247A = i10;
        this.f14252z = c0846m0;
    }
}
