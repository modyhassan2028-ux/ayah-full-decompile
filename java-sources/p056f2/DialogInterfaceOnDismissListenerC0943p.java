package p056f2;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: renamed from: f2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0943p implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f16112r;

    public DialogInterfaceOnDismissListenerC0943p(DialogFragment dialogFragment) {
        this.f16112r = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f16112r;
        Dialog dialog = dialogFragment.f12590z0;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
