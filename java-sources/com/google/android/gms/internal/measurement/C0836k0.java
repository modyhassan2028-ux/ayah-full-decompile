package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0836k0 extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f14348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0841l0 f14349x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836k0(C0841l0 c0841l0, Activity activity, int i10) {
        super(c0841l0.f14352r, true);
        this.f14347v = i10;
        switch (i10) {
            case 1:
                this.f14348w = activity;
                this.f14349x = c0841l0;
                super(c0841l0.f14352r, true);
                break;
            case 2:
                this.f14348w = activity;
                this.f14349x = c0841l0;
                super(c0841l0.f14352r, true);
                break;
            case 3:
                this.f14348w = activity;
                this.f14349x = c0841l0;
                super(c0841l0.f14352r, true);
                break;
            case 4:
                this.f14348w = activity;
                this.f14349x = c0841l0;
                super(c0841l0.f14352r, true);
                break;
            default:
                this.f14348w = activity;
                this.f14349x = c0841l0;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        switch (this.f14347v) {
            case 0:
                L l10 = this.f14349x.f14352r.f14362f;
                U6.y.f(l10);
                l10.onActivityStartedByScionActivityInfo(Y.b(this.f14348w), this.f14334s);
                break;
            case 1:
                L l11 = this.f14349x.f14352r.f14362f;
                U6.y.f(l11);
                l11.onActivityResumedByScionActivityInfo(Y.b(this.f14348w), this.f14334s);
                break;
            case 2:
                L l12 = this.f14349x.f14352r.f14362f;
                U6.y.f(l12);
                l12.onActivityPausedByScionActivityInfo(Y.b(this.f14348w), this.f14334s);
                break;
            case 3:
                L l13 = this.f14349x.f14352r.f14362f;
                U6.y.f(l13);
                l13.onActivityStoppedByScionActivityInfo(Y.b(this.f14348w), this.f14334s);
                break;
            default:
                L l14 = this.f14349x.f14352r.f14362f;
                U6.y.f(l14);
                l14.onActivityDestroyedByScionActivityInfo(Y.b(this.f14348w), this.f14334s);
                break;
        }
    }
}
