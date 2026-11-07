package com.google.android.gms.common.api;

import R6.b;
import R6.e;
import T6.d;
import U6.y;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.H;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f13980s = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13981r = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f13981r = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d dVarE = d.e(this);
                if (i11 == -1) {
                    H h7 = dVarE.f7828m;
                    h7.sendMessage(h7.obtainMessage(3));
                } else if (i11 == 0) {
                    dVarE.f(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f13981r = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f13981r = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f13981r = bundle.getInt("resolution");
        }
        if (this.f13981r == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            y.f(num);
            e.f7244d.c(this, num.intValue(), this);
            this.f13981r = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f13981r = 1;
            } catch (ActivityNotFoundException e10) {
                e = e10;
                if (extras.getBoolean("notify_manager", true)) {
                    d.e(this).f(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strD = a.D("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strD = strD.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strD, e);
                }
                googleApiActivity.f13981r = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e12) {
            e = e12;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f13981r);
        super.onSaveInstanceState(bundle);
    }
}
