package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.ayah.R;
import p151p.C1270u0;
import p226x2.t;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ArrayAdapter f12714o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Spinner f12715p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final C1270u0 f12716q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.f12716q0 = new C1270u0(2, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f12714o0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f12722j0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void k() {
        super.k();
        ArrayAdapter arrayAdapter = this.f12714o0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void o(t tVar) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) tVar.f1486a.findViewById(R.id.spinner);
        this.f12715p0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f12714o0);
        this.f12715p0.setOnItemSelectedListener(this.f12716q0);
        Spinner spinner2 = this.f12715p0;
        String str = this.f12724l0;
        if (str == null || (charSequenceArr = this.f12723k0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.o(tVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void p() {
        this.f12715p0.performClick();
    }
}
