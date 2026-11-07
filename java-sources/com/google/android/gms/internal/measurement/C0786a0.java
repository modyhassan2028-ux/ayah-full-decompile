package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0786a0 extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14191w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14192x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14193y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f14194z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0786a0(C0846m0 c0846m0, String str, String str2, Object obj, int i10) {
        super(c0846m0, true);
        this.f14190v = i10;
        this.f14191w = str;
        this.f14192x = str2;
        this.f14194z = obj;
        this.f14193y = c0846m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        switch (this.f14190v) {
            case 0:
                L l10 = this.f14193y.f14362f;
                U6.y.f(l10);
                l10.clearConditionalUserProperty(this.f14191w, this.f14192x, (Bundle) this.f14194z);
                break;
            case 1:
                L l11 = this.f14193y.f14362f;
                U6.y.f(l11);
                l11.getConditionalUserProperties(this.f14191w, this.f14192x, (I) this.f14194z);
                break;
            default:
                L l12 = this.f14193y.f14362f;
                U6.y.f(l12);
                l12.setCurrentScreenByScionActivityInfo((Y) this.f14194z, this.f14191w, this.f14192x, this.f14333r);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public void b() {
        switch (this.f14190v) {
            case 1:
                ((I) this.f14194z).D(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786a0(C0846m0 c0846m0, Y y10, String str, String str2) {
        super(c0846m0, true);
        this.f14190v = 2;
        this.f14194z = y10;
        this.f14191w = str;
        this.f14192x = str2;
        Objects.requireNonNull(c0846m0);
        this.f14193y = c0846m0;
    }
}
