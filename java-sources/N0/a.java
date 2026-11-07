package N0;

import J1.c;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import p122m0.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5961a;

    public /* synthetic */ a(Object obj) {
        this.f5961a = obj;
    }

    public void a() {
        ((AutofillManager) this.f5961a).commit();
    }

    public PackageInfo b(int i10, String str) {
        return ((Context) this.f5961a).getPackageManager().getPackageInfo(str, i10);
    }

    public boolean c() {
        String nameForUid;
        Context context = (Context) this.f5961a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return Z6.a.f(context);
        }
        if (!Y6.b.a() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public void d(AndroidComposeView androidComposeView, int i10, AutofillValue autofillValue) {
        ((AutofillManager) this.f5961a).notifyValueChanged(androidComposeView, i10, autofillValue);
    }

    public void e(AndroidComposeView androidComposeView, int i10, Rect rect) {
        ((AutofillManager) this.f5961a).notifyViewEntered(androidComposeView, i10, rect);
    }

    public void f(AndroidComposeView androidComposeView, int i10) {
        ((AutofillManager) this.f5961a).notifyViewExited(androidComposeView, i10);
    }

    public void g(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            i.a(view, (AutofillManager) this.f5961a, i10, z10);
        }
    }

    public void h(AndroidComposeView androidComposeView, int i10, Rect rect) {
        ((AutofillManager) this.f5961a).requestAutofill(androidComposeView, i10, rect);
    }

    public AutofillId i() {
        return c.d(this.f5961a);
    }
}
