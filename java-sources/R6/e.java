package R6;

import U6.y;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import p056f2.C0949w;
import p056f2.L;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7243c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7244d = new e();

    public static AlertDialog d(Activity activity, int i10, U6.o oVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(U6.n.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(com.ayah.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.ayah.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.ayah.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, oVar);
        }
        String strC = U6.n.c(activity, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", p123m2.c.r(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                L l10 = ((C0949w) ((FragmentActivity) activity).f12591L.f9953r).f16175u;
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                y.g(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.f13977E0 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.f13978F0 = onCancelListener;
                }
                supportErrorDialogFragment.V(l10, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        y.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f7237r = alertDialog;
        if (onCancelListener != null) {
            cVar.f7238s = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i10, new U6.o(super.a(i10, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", p245z2.a.B(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? U6.n.e(context, "common_google_play_services_resolution_required_title") : U6.n.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.ayah.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? U6.n.d(context, "common_google_play_services_resolution_required_text", U6.n.a(context)) : U6.n.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        p216w1.p pVar = new p216w1.p(context, null);
        pVar.f23614n = true;
        pVar.c(16, true);
        pVar.f23607e = p216w1.p.b(strE);
        p216w1.o oVar = new p216w1.o();
        oVar.f23602s = p216w1.p.b(strD);
        pVar.d(oVar);
        if (Y6.b.c(context)) {
            pVar.f23620t.icon = context.getApplicationInfo().icon;
            pVar.f23610i = 2;
            if (Y6.b.d(context)) {
                pVar.f23604b.add(new p216w1.n(2131230855, resources.getString(com.ayah.R.string.common_open_on_phone), pendingIntent));
            } else {
                pVar.g = pendingIntent;
            }
        } else {
            pVar.f23620t.icon = R.drawable.stat_sys_warning;
            pVar.f23620t.tickerText = p216w1.p.b(resources.getString(com.ayah.R.string.common_google_play_services_notification_ticker));
            pVar.f23620t.when = System.currentTimeMillis();
            pVar.g = pendingIntent;
            pVar.f23608f = p216w1.p.b(strD);
        }
        if (Y6.b.a()) {
            if (!Y6.b.a()) {
                throw new IllegalStateException();
            }
            synchronized (f7243c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.ayah.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            pVar.f23618r = "com.google.android.gms.availability";
        }
        Notification notificationA = pVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            h.f7247a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    public final void g(Activity activity, T6.e eVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i10, new U6.o(super.a(i10, activity, "d"), eVar, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
