package X7;

import I1.S;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ayah.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f10056A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f10057B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f10061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f10062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f10063f;
    public final Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f10064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f10065i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f10066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f10067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f10068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f10071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatTextView f10073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f10074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f10077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f10078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatTextView f10080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10081z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.f10064h = textInputLayout;
        this.f10068m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f10058a = p050e8.b.S(context, R.attr.motionDurationShort4, 217);
        this.f10059b = p050e8.b.S(context, R.attr.motionDurationMedium4, 167);
        this.f10060c = p050e8.b.S(context, R.attr.motionDurationShort4, 167);
        this.f10061d = p050e8.b.T(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, p137n7.a.f20018d);
        LinearInterpolator linearInterpolator = p137n7.a.f20015a;
        this.f10062e = p050e8.b.T(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f10063f = p050e8.b.T(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i10) {
        if (this.f10065i == null && this.f10066k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f10065i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f10065i;
            TextInputLayout textInputLayout = this.f10064h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f10066k = new FrameLayout(context);
            this.f10065i.addView(this.f10066k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f10066k.setVisibility(0);
            this.f10066k.addView(appCompatTextView);
        } else {
            this.f10065i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10065i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f10065i != null) {
            TextInputLayout textInputLayout = this.f10064h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean zC = va.g.C(context);
                LinearLayout linearLayout = this.f10065i;
                WeakHashMap weakHashMap = S.f3689a;
                int paddingStart = editText.getPaddingStart();
                if (zC) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zC) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zC) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f10067l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, AppCompatTextView appCompatTextView, int i10, int i11, int i12) {
        if (appCompatTextView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z11 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i13 = this.f10060c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f10059b : i13);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f10062e : this.f10063f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f10068m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f10058a);
            objectAnimatorOfFloat2.setInterpolator(this.f10061d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f10073r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f10080y;
    }

    public final void f() {
        this.f10071p = null;
        c();
        if (this.f10069n == 1) {
            if (!this.f10079x || TextUtils.isEmpty(this.f10078w)) {
                this.f10070o = 0;
            } else {
                this.f10070o = 2;
            }
        }
        i(this.f10069n, this.f10070o, h(this.f10073r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f10065i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f10066k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i11 = this.j - 1;
        this.j = i11;
        LinearLayout linearLayout2 = this.f10065i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f3689a;
        TextInputLayout textInputLayout = this.f10064h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f10070o == this.f10069n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10067l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f10079x, this.f10080y, 2, i10, i11);
            d(arrayList, this.f10072q, this.f10073r, 1, i10, i11);
            p050e8.b.R(animatorSet, arrayList);
            animatorSet.addListener(new o(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f10069n = i11;
        }
        TextInputLayout textInputLayout = this.f10064h;
        textInputLayout.r();
        textInputLayout.u(z10, false);
        textInputLayout.x();
    }
}
