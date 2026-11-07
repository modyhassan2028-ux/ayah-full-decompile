package p122m0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(View view, AutofillManager autofillManager, int i10, boolean z10) {
        autofillManager.notifyViewVisibilityChanged(view, i10, z10);
    }
}
