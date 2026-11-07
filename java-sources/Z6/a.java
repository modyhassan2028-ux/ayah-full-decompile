package Z6;

import W2.n;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.google.android.gms.measurement.internal.zzw;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import p110k9.i;
import p122m0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f11023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f11024b;

    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i10 = configuration.colorMode & 3;
        int i11 = configuration2.colorMode & 3;
        if (i10 != i11) {
            configuration3.colorMode |= i11;
        }
        int i12 = configuration.colorMode & 12;
        int i13 = configuration2.colorMode & 12;
        if (i12 != i13) {
            configuration3.colorMode |= i13;
        }
    }

    public static AutofillId c(View view) {
        return view.getAutofillId();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean f(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f11023a;
        if (context2 != null && (bool = f11024b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f11024b = null;
        if (Y6.b.a()) {
            f11024b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f11024b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f11024b = Boolean.FALSE;
            }
        }
        f11023a = applicationContext;
        return f11024b.booleanValue();
    }

    public static boolean g(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void h(p122m0.a aVar, SparseArray sparseArray) {
        if (aVar.f19455b.f19472a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueG = n.g(sparseArray.get(iKeyAt));
            if (autofillValueG.isText()) {
                l lVar = aVar.f19455b;
                autofillValueG.getTextValue().toString();
                if (lVar.f19472a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (autofillValueG.isDate()) {
                    throw new i("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueG.isList()) {
                    throw new i("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueG.isToggle()) {
                    throw new i("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static Intent i(Context context, zzw zzwVar, IntentFilter intentFilter) {
        return context.registerReceiver(zzwVar, intentFilter, null, null, 0);
    }

    public static Intent j(Context context, zzw zzwVar, IntentFilter intentFilter) {
        return context.registerReceiver(zzwVar, intentFilter, null, null, 2);
    }

    public static void k(MenuItem menuItem, char c10, int i10) {
        menuItem.setAlphabeticShortcut(c10, i10);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void m(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void n(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void o(MenuItem menuItem, char c10, int i10) {
        menuItem.setNumericShortcut(c10, i10);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void q(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
