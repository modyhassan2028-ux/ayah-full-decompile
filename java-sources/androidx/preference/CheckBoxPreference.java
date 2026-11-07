package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p226x2.a;
import p226x2.t;
import p226x2.u;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final a f12707i0;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f12707i0 = new a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24347b, i10, i11);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f12813e0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f12812d0) {
            k();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f12814f0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f12812d0) {
            k();
        }
        this.f12816h0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12812d0);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f12707i0);
        }
    }

    @Override // androidx.preference.Preference
    public void o(t tVar) {
        super.o(tVar);
        D(tVar.r(R.id.checkbox));
        C(tVar.r(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void v(View view) {
        super.v(view);
        if (((AccessibilityManager) this.f12761r.getSystemService("accessibility")).isEnabled()) {
            D(view.findViewById(R.id.checkbox));
            C(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p244z1.a.b(context, com.ayah.R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle), 0);
    }
}
