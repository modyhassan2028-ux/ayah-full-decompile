package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.ayah.R;
import p226x2.a;
import p226x2.t;
import p226x2.u;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final a f12806i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f12807j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f12808k0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iB = p244z1.a.b(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iB, 0);
        this.f12806i0 = new a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24355l, iB, 0);
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
        this.f12807j0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        k();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f12808k0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        k();
        this.f12816h0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12812d0);
        }
        if (z10) {
            Switch r10 = (Switch) view;
            r10.setTextOn(this.f12807j0);
            r10.setTextOff(this.f12808k0);
            r10.setOnCheckedChangeListener(this.f12806i0);
        }
    }

    @Override // androidx.preference.Preference
    public final void o(t tVar) {
        super.o(tVar);
        D(tVar.r(android.R.id.switch_widget));
        C(tVar.r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void v(View view) {
        super.v(view);
        if (((AccessibilityManager) this.f12761r.getSystemService("accessibility")).isEnabled()) {
            D(view.findViewById(android.R.id.switch_widget));
            C(view.findViewById(android.R.id.summary));
        }
    }
}
