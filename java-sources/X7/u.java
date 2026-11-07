package X7;

import H7.H;
import I1.S;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ayah.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10089A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextInputLayout f10090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AppCompatTextView f10091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f10092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CheckableImageButton f10093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f10094v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f10095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView.ScaleType f10097y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View.OnLongClickListener f10098z;

    public u(TextInputLayout textInputLayout, p074h0.i iVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f10090r = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f10093u = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f10091s = appCompatTextView;
        if (va.g.C(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f10098z;
        checkableImageButton.setOnClickListener(null);
        Y2.a.i0(checkableImageButton, onLongClickListener);
        this.f10098z = null;
        checkableImageButton.setOnLongClickListener(null);
        Y2.a.i0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) iVar.f16423t;
        if (typedArray.hasValue(69)) {
            this.f10094v = va.g.x(getContext(), iVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f10095w = H.o(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(iVar.r(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f10096x) {
            this.f10096x = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeU = Y2.a.u(typedArray.getInt(68, -1));
            this.f10097y = scaleTypeU;
            checkableImageButton.setScaleType(scaleTypeU);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = S.f3689a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(iVar.q(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f10092t = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f10093u;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = S.f3689a;
        return this.f10091s.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10093u;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f10094v;
            PorterDuff.Mode mode = this.f10095w;
            TextInputLayout textInputLayout = this.f10090r;
            Y2.a.k(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            Y2.a.g0(textInputLayout, checkableImageButton, this.f10094v);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f10098z;
        checkableImageButton.setOnClickListener(null);
        Y2.a.i0(checkableImageButton, onLongClickListener);
        this.f10098z = null;
        checkableImageButton.setOnLongClickListener(null);
        Y2.a.i0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f10093u;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f10090r.f15334u;
        if (editText == null) {
            return;
        }
        if (this.f10093u.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = S.f3689a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = S.f3689a;
        this.f10091s.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i10 = (this.f10092t == null || this.f10089A) ? 8 : 0;
        setVisibility((this.f10093u.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f10091s.setVisibility(i10);
        this.f10090r.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
