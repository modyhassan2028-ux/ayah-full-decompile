package androidx.preference;

import Da.r;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import p084i.C0956d;
import p226x2.g;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final HashSet f12733M0 = new HashSet();

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f12734N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public CharSequence[] f12735O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public CharSequence[] f12736P0;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f12733M0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f12734N0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f12735O0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f12736P0);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void Y(boolean z10) {
        if (z10 && this.f12734N0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) W();
            multiSelectListPreference.getClass();
            multiSelectListPreference.B(this.f12733M0);
        }
        this.f12734N0 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void Z(r rVar) {
        int length = this.f12736P0.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f12733M0.contains(this.f12736P0[i10].toString());
        }
        CharSequence[] charSequenceArr = this.f12735O0;
        g gVar = new g(this);
        C0956d c0956d = (C0956d) rVar.f1388t;
        c0956d.f16567m = charSequenceArr;
        c0956d.f16575u = gVar;
        c0956d.f16571q = zArr;
        c0956d.f16572r = true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        HashSet hashSet = this.f12733M0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f12734N0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f12735O0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f12736P0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) W();
        CharSequence[] charSequenceArr = multiSelectListPreference.f12730j0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.f12731k0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f12732l0);
        this.f12734N0 = false;
        this.f12735O0 = multiSelectListPreference.f12730j0;
        this.f12736P0 = charSequenceArr2;
    }
}
