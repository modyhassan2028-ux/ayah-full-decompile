package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import com.ayah.R;
import p056f2.AbstractComponentCallbacksC0947u;
import p226x2.u;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final CharSequence f12708d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f12709e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Drawable f12710f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f12711g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f12712h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f12713i0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24348c, i10, i11);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f12708d0 = string;
        if (string == null) {
            this.f12708d0 = this.f12767x;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f12709e0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f12710f0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f12711g0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f12712h0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f12713i0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void p() {
        DialogFragment multiSelectListPreferenceDialogFragmentCompat;
        PreferenceFragmentCompat preferenceFragmentCompat = this.f12762s.j;
        if (preferenceFragmentCompat != null) {
            for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = preferenceFragmentCompat; abstractComponentCallbacksC0947u != null; abstractComponentCallbacksC0947u = abstractComponentCallbacksC0947u.f16140N) {
            }
            preferenceFragmentCompat.l();
            if (preferenceFragmentCompat.o().D("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                multiSelectListPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", this.f12738B);
                multiSelectListPreferenceDialogFragmentCompat.P(bundle);
            } else if (this instanceof ListPreference) {
                multiSelectListPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", this.f12738B);
                multiSelectListPreferenceDialogFragmentCompat.P(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", this.f12738B);
                multiSelectListPreferenceDialogFragmentCompat.P(bundle3);
            }
            multiSelectListPreferenceDialogFragmentCompat.Q(preferenceFragmentCompat);
            multiSelectListPreferenceDialogFragmentCompat.V(preferenceFragmentCompat.o(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), 0);
    }
}
