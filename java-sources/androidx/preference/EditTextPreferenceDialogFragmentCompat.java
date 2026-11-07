package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import p211v6.b;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public EditText f12718M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CharSequence f12719N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final b f12720O0 = new b(2, this);

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public long f12721P0 = -1;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f12719N0);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void X(View view) {
        super.X(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f12718M0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f12718M0.setText(this.f12719N0);
        EditText editText2 = this.f12718M0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) W()).getClass();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void Y(boolean z10) {
        if (z10) {
            String string = this.f12718M0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) W();
            editTextPreference.getClass();
            editTextPreference.B(string);
        }
    }

    public final void a0() {
        long j = this.f12721P0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f12718M0;
        if (editText == null || !editText.isFocused()) {
            this.f12721P0 = -1L;
            return;
        }
        if (((InputMethodManager) this.f12718M0.getContext().getSystemService("input_method")).showSoftInput(this.f12718M0, 0)) {
            this.f12721P0 = -1L;
            return;
        }
        EditText editText2 = this.f12718M0;
        b bVar = this.f12720O0;
        editText2.removeCallbacks(bVar);
        this.f12718M0.postDelayed(bVar, 50L);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            this.f12719N0 = ((EditTextPreference) W()).f12717j0;
        } else {
            this.f12719N0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }
}
