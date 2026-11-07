package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.ayah.R;
import p226x2.t;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, a.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void o(t tVar) {
        super.o(tVar);
        if (Build.VERSION.SDK_INT >= 28) {
            tVar.f1486a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return !super.j();
    }
}
