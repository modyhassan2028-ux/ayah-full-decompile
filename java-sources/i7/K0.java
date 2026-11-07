package i7;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f17021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.W f17023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f17025f;
    public final String g;

    public K0(Context context, com.google.android.gms.internal.measurement.W w9, Long l10) {
        this.f17024e = true;
        U6.y.f(context);
        Context applicationContext = context.getApplicationContext();
        U6.y.f(applicationContext);
        this.f17020a = applicationContext;
        this.f17025f = l10;
        if (w9 != null) {
            this.f17023d = w9;
            this.f17024e = w9.f14148t;
            this.f17022c = w9.f14147s;
            this.g = w9.f14150v;
            Bundle bundle = w9.f14149u;
            if (bundle != null) {
                this.f17021b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
