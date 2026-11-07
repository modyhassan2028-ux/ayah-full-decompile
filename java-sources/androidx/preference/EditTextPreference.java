package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.ayah.R;
import i7.C;
import p226x2.b;
import p226x2.u;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f12717j0;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iB = a.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iB, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f24349d, iB, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C.f16837A == null) {
                C.f16837A = new C(16);
            }
            this.f12759b0 = C.f16837A;
            k();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void B(String str) {
        boolean zY = y();
        this.f12717j0 = str;
        w(str);
        boolean zY2 = y();
        if (zY2 != zY) {
            l(zY2);
        }
        k();
    }

    @Override // androidx.preference.Preference
    public final Object r(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public final void s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(b.class)) {
            super.s(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.s(bVar.getSuperState());
        B(bVar.f24303r);
    }

    @Override // androidx.preference.Preference
    public final Parcelable t() {
        super.t();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f12744H) {
            return absSavedState;
        }
        b bVar = new b();
        bVar.f24303r = this.f12717j0;
        return bVar;
    }

    @Override // androidx.preference.Preference
    public final void u(Object obj) {
        B(f((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return TextUtils.isEmpty(this.f12717j0) || super.y();
    }
}
