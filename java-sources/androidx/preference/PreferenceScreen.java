package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.ayah.R;
import p056f2.AbstractComponentCallbacksC0947u;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f12793l0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, a.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.f12793l0 = true;
    }

    @Override // androidx.preference.Preference
    public final void p() {
        PreferenceFragmentCompat preferenceFragmentCompat;
        if (this.f12739C != null || this.f12740D != null || this.f12787f0.size() == 0 || (preferenceFragmentCompat = this.f12762s.f24338k) == null) {
            return;
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = preferenceFragmentCompat; abstractComponentCallbacksC0947u != null; abstractComponentCallbacksC0947u = abstractComponentCallbacksC0947u.f16140N) {
        }
        preferenceFragmentCompat.l();
    }
}
