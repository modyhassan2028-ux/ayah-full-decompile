package p056f2;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: renamed from: f2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0942o implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f16111r;

    public DialogInterfaceOnCancelListenerC0942o(DialogFragment dialogFragment) {
        this.f16111r = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f16111r;
        Dialog dialog = dialogFragment.f12590z0;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
