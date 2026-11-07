package U6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.ayah.R;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f8293a = new O(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f8294b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) Z6.b.a(context).f5961a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strA);
        }
        if (i10 == 2) {
            return Y6.b.d(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strA);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strA);
        }
        if (i10 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i10 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        O o10 = f8293a;
        synchronized (o10) {
            try {
                Locale locale = p050e8.b.z(context.getResources().getConfiguration()).f1426a.get(0);
                if (!locale.equals(f8294b)) {
                    o10.clear();
                    f8294b = locale;
                }
                String str2 = (String) o10.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = R6.h.f7247a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f8293a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
