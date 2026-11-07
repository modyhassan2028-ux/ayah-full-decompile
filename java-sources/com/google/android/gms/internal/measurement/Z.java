package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14183x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(C0846m0 c0846m0, Object obj, int i10) {
        super(c0846m0, true);
        this.f14181v = i10;
        this.f14183x = obj;
        this.f14182w = c0846m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        switch (this.f14181v) {
            case 0:
                L l10 = this.f14182w.f14362f;
                U6.y.f(l10);
                l10.setConditionalUserProperty((Bundle) this.f14183x, this.f14333r);
                break;
            case 1:
                L l11 = this.f14182w.f14362f;
                U6.y.f(l11);
                l11.retrieveAndUploadBatches(new BinderC0801d0(this, (p039d8.a) this.f14183x));
                break;
            case 2:
                L l12 = this.f14182w.f14362f;
                U6.y.f(l12);
                l12.logHealthData(5, "Error with data collection. Data lost.", new a7.b((Exception) this.f14183x), new a7.b(null), new a7.b(null));
                break;
            case 3:
                L l13 = this.f14182w.f14362f;
                U6.y.f(l13);
                l13.setSgtmDebugInfo((Intent) this.f14183x);
                break;
            default:
                L l14 = this.f14182w.f14362f;
                U6.y.f(l14);
                l14.registerOnMeasurementEventListener((BinderC0831j0) this.f14183x);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0846m0 c0846m0, Exception exc) {
        super(c0846m0, false);
        this.f14181v = 2;
        this.f14183x = exc;
        this.f14182w = c0846m0;
    }
}
