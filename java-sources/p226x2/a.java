package p226x2;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStatePreference f24302b;

    public /* synthetic */ a(TwoStatePreference twoStatePreference, int i10) {
        this.f24301a = i10;
        this.f24302b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f24301a) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f24302b;
                checkBoxPreference.getClass();
                checkBoxPreference.B(z10);
                break;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) this.f24302b;
                switchPreference.getClass();
                switchPreference.B(z10);
                break;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f24302b;
                switchPreferenceCompat.getClass();
                switchPreferenceCompat.B(z10);
                break;
        }
    }
}
