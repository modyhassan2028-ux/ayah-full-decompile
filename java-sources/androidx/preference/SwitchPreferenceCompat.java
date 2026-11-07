package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.ayah.R;
import p226x2.a;
import p226x2.t;
import p226x2.u;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final a f12809i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f12810j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f12811k0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.f12809i0 = new a(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24356m, R.attr.switchPreferenceCompatStyle, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f12813e0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f12812d0) {
            k();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f12814f0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f12812d0) {
            k();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f12810j0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        k();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f12811k0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        k();
        this.f12816h0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12812d0);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f12810j0);
            switchCompat.setTextOff(this.f12811k0);
            switchCompat.setOnCheckedChangeListener(this.f12809i0);
        }
    }

    @Override // androidx.preference.Preference
    public final void o(t tVar) {
        super.o(tVar);
        D(tVar.r(R.id.switchWidget));
        C(tVar.r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void v(View view) {
        super.v(view);
        if (((AccessibilityManager) this.f12761r.getSystemService("accessibility")).isEnabled()) {
            D(view.findViewById(R.id.switchWidget));
            C(view.findViewById(android.R.id.summary));
        }
    }
}
