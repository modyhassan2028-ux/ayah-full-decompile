package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0791b0 extends AbstractRunnableC0826i0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14206v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f14207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14209y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0791b0(C0846m0 c0846m0, Object obj, Object obj2, int i10) {
        super(c0846m0, true);
        this.f14206v = i10;
        this.f14208x = obj;
        this.f14209y = obj2;
        this.f14207w = c0846m0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f14206v) {
            case 0:
                try {
                    Context context = (Context) this.f14208x;
                    U6.y.f(context);
                    String strA = i7.I0.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = i7.I0.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    L lAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    C0846m0 c0846m0 = (C0846m0) this.f14207w;
                    boolean z10 = boolValueOf == null || !boolValueOf.booleanValue();
                    c0846m0.getClass();
                    try {
                        lAsInterface = K.asInterface(p017b7.f.c(context, z10 ? p017b7.f.f13312c : p017b7.f.f13311b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (p017b7.b e10) {
                        c0846m0.b(e10, true, false);
                    }
                    c0846m0.f14362f = lAsInterface;
                    if (c0846m0.f14362f != null) {
                        int iA = p017b7.f.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = p017b7.f.d(context, ModuleDescriptor.MODULE_ID, false);
                        W w9 = new W(133005L, Math.max(iA, iD), Boolean.TRUE.equals(boolValueOf) || iD < iA, (Bundle) this.f14209y, i7.I0.a(context));
                        L l10 = c0846m0.f14362f;
                        U6.y.f(l10);
                        l10.initialize(new a7.b(context), w9, this.f14333r);
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e11) {
                    ((C0846m0) this.f14207w).b(e11, true, false);
                    return;
                }
                break;
            case 1:
                L l11 = ((C0846m0) this.f14207w).f14362f;
                U6.y.f(l11);
                l11.getMaxUserProperties((String) this.f14208x, (I) this.f14209y);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f14209y;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                L l12 = ((C0841l0) this.f14207w).f14352r.f14362f;
                U6.y.f(l12);
                l12.onActivityCreatedByScionActivityInfo(Y.b((Activity) this.f14208x), bundle, this.f14334s);
                break;
            default:
                L l13 = ((C0841l0) this.f14207w).f14352r.f14362f;
                U6.y.f(l13);
                l13.onActivitySaveInstanceStateByScionActivityInfo(Y.b((Activity) this.f14208x), (I) this.f14209y, this.f14334s);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0826i0
    public void b() {
        switch (this.f14206v) {
            case 1:
                ((I) this.f14209y).D(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0791b0(C0841l0 c0841l0, Activity activity, I i10) {
        super(c0841l0.f14352r, true);
        this.f14206v = 3;
        this.f14208x = activity;
        this.f14209y = i10;
        this.f14207w = c0841l0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0791b0(C0841l0 c0841l0, Bundle bundle, Activity activity) {
        super(c0841l0.f14352r, true);
        this.f14206v = 2;
        this.f14209y = bundle;
        this.f14208x = activity;
        this.f14207w = c0841l0;
    }
}
