package R6;

import U6.y;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Dialog f7237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AlertDialog f7239t;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7238s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7237r;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f7239t == null) {
            Activity activity = getActivity();
            y.f(activity);
            this.f7239t = new AlertDialog.Builder(activity).create();
        }
        return this.f7239t;
    }
}
