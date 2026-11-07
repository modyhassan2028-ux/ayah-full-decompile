package androidx.preference;

import Da.r;
import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import p056f2.AbstractComponentCallbacksC0947u;
import p084i.C0956d;
import p084i.DialogInterfaceC0959g;
import p226x2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public DialogPreference f12770E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public CharSequence f12771F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public CharSequence f12772G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public CharSequence f12773H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public CharSequence f12774I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f12775J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public BitmapDrawable f12776K0;
    public int L0;

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public void F(Bundle bundle) {
        super.F(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f12771F0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f12772G0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f12773H0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f12774I0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f12775J0);
        BitmapDrawable bitmapDrawable = this.f12776K0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog T(Bundle bundle) {
        this.L0 = -2;
        r rVar = new r(M());
        CharSequence charSequence = this.f12771F0;
        C0956d c0956d = (C0956d) rVar.f1388t;
        c0956d.f16560d = charSequence;
        c0956d.f16559c = this.f12776K0;
        c0956d.g = this.f12772G0;
        c0956d.f16563h = this;
        c0956d.f16564i = this.f12773H0;
        c0956d.j = this;
        M();
        int i10 = this.f12775J0;
        View viewInflate = i10 != 0 ? m().inflate(i10, (ViewGroup) null) : null;
        if (viewInflate != null) {
            X(viewInflate);
            c0956d.f16570p = viewInflate;
        } else {
            c0956d.f16562f = this.f12774I0;
        }
        Z(rVar);
        DialogInterfaceC0959g dialogInterfaceC0959gE = rVar.e();
        if (this instanceof EditTextPreferenceDialogFragmentCompat) {
            Window window = dialogInterfaceC0959gE.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                l.a(window);
                return dialogInterfaceC0959gE;
            }
            EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = (EditTextPreferenceDialogFragmentCompat) this;
            editTextPreferenceDialogFragmentCompat.f12721P0 = SystemClock.currentThreadTimeMillis();
            editTextPreferenceDialogFragmentCompat.a0();
        }
        return dialogInterfaceC0959gE;
    }

    public final DialogPreference W() {
        if (this.f12770E0 == null) {
            Bundle bundle = this.f16166w;
            if (bundle == null) {
                throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
            }
            this.f12770E0 = (DialogPreference) ((PreferenceFragmentCompat) q(true)).S(bundle.getString("key"));
        }
        return this.f12770E0;
    }

    public void X(View view) {
        int i10;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f12774I0;
            if (TextUtils.isEmpty(charSequence)) {
                i10 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    public abstract void Y(boolean z10);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.L0 = i10;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Y(this.L0 == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public void z(Bundle bundle) {
        super.z(bundle);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uQ = q(true);
        if (!(abstractComponentCallbacksC0947uQ instanceof PreferenceFragmentCompat)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) abstractComponentCallbacksC0947uQ;
        Bundle bundle2 = this.f16166w;
        if (bundle2 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        String string = bundle2.getString("key");
        if (bundle != null) {
            this.f12771F0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f12772G0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f12773H0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f12774I0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f12775J0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f12776K0 = new BitmapDrawable(p(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) preferenceFragmentCompat.S(string);
        this.f12770E0 = dialogPreference;
        this.f12771F0 = dialogPreference.f12708d0;
        this.f12772G0 = dialogPreference.f12711g0;
        this.f12773H0 = dialogPreference.f12712h0;
        this.f12774I0 = dialogPreference.f12709e0;
        this.f12775J0 = dialogPreference.f12713i0;
        Drawable drawable = dialogPreference.f12710f0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f12776K0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f12776K0 = new BitmapDrawable(p(), bitmapCreateBitmap);
    }

    public void Z(r rVar) {
    }
}
