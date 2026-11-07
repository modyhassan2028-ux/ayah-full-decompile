package p122m0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f19471a = new j();

    public final void a(a aVar) {
        aVar.f19456c.registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.f19456c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i10, int i11) {
        String str;
        super.onAutofillEvent(view, i10, i11);
        if (i11 == 1) {
            str = "Autofill popup was shown.";
        } else if (i11 != 2) {
            str = i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
