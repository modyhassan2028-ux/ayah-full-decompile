package U6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Intent f8296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8297t;

    public /* synthetic */ o(Intent intent, Object obj, int i10) {
        this.f8295r = i10;
        this.f8296s = intent;
        this.f8297t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T6.e, java.lang.Object] */
    public final void a() {
        switch (this.f8295r) {
            case 0:
                Intent intent = this.f8296s;
                if (intent != null) {
                    ((GoogleApiActivity) this.f8297t).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f8296s;
                if (intent2 != null) {
                    this.f8297t.a(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
