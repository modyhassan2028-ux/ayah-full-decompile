package androidx.preference;

import Da.r;
import android.os.Bundle;
import p084i.C0956d;
import p226x2.e;

/* JADX INFO: loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f12727M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CharSequence[] f12728N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public CharSequence[] f12729O0;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f12727M0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f12728N0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f12729O0);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void Y(boolean z10) {
        int i10;
        if (!z10 || (i10 = this.f12727M0) < 0) {
            return;
        }
        String string = this.f12729O0[i10].toString();
        ListPreference listPreference = (ListPreference) W();
        listPreference.getClass();
        listPreference.C(string);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void Z(r rVar) {
        CharSequence[] charSequenceArr = this.f12728N0;
        int i10 = this.f12727M0;
        e eVar = new e(this);
        C0956d c0956d = (C0956d) rVar.f1388t;
        c0956d.f16567m = charSequenceArr;
        c0956d.f16569o = eVar;
        c0956d.f16574t = i10;
        c0956d.f16573s = true;
        c0956d.g = null;
        c0956d.f16563h = null;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle != null) {
            this.f12727M0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f12728N0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f12729O0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) W();
        CharSequence[] charSequenceArr = listPreference.f12722j0;
        CharSequence[] charSequenceArr2 = listPreference.f12723k0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f12727M0 = listPreference.B(listPreference.f12724l0);
        this.f12728N0 = listPreference.f12722j0;
        this.f12729O0 = charSequenceArr2;
    }
}
