package p122m0;

import android.support.v4.media.session.p;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f19454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f19456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutofillId f19457d;

    public a(AndroidComposeView androidComposeView, l lVar) {
        this.f19454a = androidComposeView;
        this.f19455b = lVar;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f19456c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        N0.a aVarZ = Y2.a.z(androidComposeView);
        AutofillId autofillId = aVarZ != null ? (AutofillId) aVarZ.f5961a : null;
        if (autofillId == null) {
            throw p.s("Required value was null.");
        }
        this.f19457d = autofillId;
    }
}
