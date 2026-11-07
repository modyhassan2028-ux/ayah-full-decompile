package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.android.gms.internal.measurement.Z;

/* JADX INFO: loaded from: classes.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0846m0 c0846m0C = C0846m0.c(this, null);
        Intent intent = getIntent();
        c0846m0C.getClass();
        c0846m0C.a(new Z(c0846m0C, intent, 3));
        finish();
    }
}
