package p226x2;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat f24308a;

    public g(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.f24308a = multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.f24308a;
        HashSet hashSet = multiSelectListPreferenceDialogFragmentCompat.f12733M0;
        if (z10) {
            multiSelectListPreferenceDialogFragmentCompat.f12734N0 = hashSet.add(multiSelectListPreferenceDialogFragmentCompat.f12736P0[i10].toString()) | multiSelectListPreferenceDialogFragmentCompat.f12734N0;
        } else {
            multiSelectListPreferenceDialogFragmentCompat.f12734N0 = hashSet.remove(multiSelectListPreferenceDialogFragmentCompat.f12736P0[i10].toString()) | multiSelectListPreferenceDialogFragmentCompat.f12734N0;
        }
    }
}
