package com.google.android.gms.common;

import U6.y;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Dialog f13977E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f13978F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public AlertDialog f13979G0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog T(Bundle bundle) {
        Dialog dialog = this.f13977E0;
        if (dialog != null) {
            return dialog;
        }
        this.f12586v0 = false;
        if (this.f13979G0 == null) {
            Context contextL = l();
            y.f(contextL);
            this.f13979G0 = new AlertDialog.Builder(contextL).create();
        }
        return this.f13979G0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13978F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
