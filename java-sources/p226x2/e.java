package p226x2;

import android.content.DialogInterface;
import androidx.preference.ListPreferenceDialogFragmentCompat;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ListPreferenceDialogFragmentCompat f24306r;

    public e(ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat) {
        this.f24306r = listPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = this.f24306r;
        listPreferenceDialogFragmentCompat.f12727M0 = i10;
        listPreferenceDialogFragmentCompat.L0 = -1;
        dialogInterface.dismiss();
    }
}
