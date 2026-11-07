package com.google.android.material.datepicker;

import I1.C0;
import I1.D0;
import I1.E0;
import I1.F0;
import I1.I;
import I1.S;
import K.y0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.ayah.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final LinkedHashSet f14834E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final LinkedHashSet f14835F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f14836G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public PickerFragment f14837H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public b f14838I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public MaterialCalendar f14839J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f14840K0;
    public CharSequence L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f14841M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f14842N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f14843O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public CharSequence f14844P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f14845Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public CharSequence f14846R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f14847S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public CharSequence f14848T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f14849U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public CharSequence f14850V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public TextView f14851W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public CheckableImageButton f14852X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public R7.i f14853Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f14854Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public CharSequence f14855a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public CharSequence f14856b1;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f14834E0 = new LinkedHashSet();
        this.f14835F0 = new LinkedHashSet();
    }

    public static int X(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = q.b();
        calendarB.set(5, 1);
        Calendar calendarA = q.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Y(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(u0.A(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f14841M0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f14841M0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(X(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(X(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = S.f3689a;
        textView.setAccessibilityLiveRegion(1);
        this.f14852X0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f14851W0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f14852X0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f14852X0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, Y2.a.E(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], Y2.a.E(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f14852X0.setChecked(this.f14842N0 != 0);
        S.o(this.f14852X0, null);
        CheckableImageButton checkableImageButton2 = this.f14852X0;
        this.f14852X0.setContentDescription(this.f14842N0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f14852X0.setOnClickListener(new E5.b(6, this));
        W();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f14836G0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f14838I0;
        a aVar = new a();
        int i10 = a.f14860b;
        int i11 = a.f14860b;
        long j = bVar.f14862r.f14889w;
        long j10 = bVar.f14863s.f14889w;
        aVar.f14861a = Long.valueOf(bVar.f14865u.f14889w);
        int i12 = bVar.f14866v;
        d dVar = bVar.f14864t;
        MaterialCalendar materialCalendar = this.f14839J0;
        j jVar = materialCalendar == null ? null : materialCalendar.f14824r0;
        if (jVar != null) {
            aVar.f14861a = Long.valueOf(jVar.f14889w);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        j jVarB = j.b(j);
        j jVarB2 = j.b(j10);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = aVar.f14861a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(jVarB, jVarB2, dVar2, l10 == null ? null : j.b(l10.longValue()), i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f14840K0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.L0);
        bundle.putInt("INPUT_MODE_KEY", this.f14842N0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f14843O0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f14844P0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f14845Q0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f14846R0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f14847S0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f14848T0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f14849U0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f14850V0);
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void G() {
        PickerFragment pickerFragment;
        F9.n d1;
        F9.n d5;
        super.G();
        Dialog dialog = this.f12590z0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f14841M0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f14853Y0);
            if (!this.f14854Z0) {
                View viewFindViewById = N().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListD = A1.b.d(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = numValueOf == null || numValueOf.intValue() == 0;
                int iC = Y2.a.C(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z11) {
                    numValueOf = Integer.valueOf(iC);
                }
                B0.c.d0(window, false);
                window.getContext();
                int iE = i10 < 27 ? A1.a.e(Y2.a.C(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z12 = Y2.a.T(0) || Y2.a.T(numValueOf.intValue());
                O8.c cVar = new O8.c(window.getDecorView());
                if (i10 >= 35) {
                    d1 = new F0(window, cVar);
                } else if (i10 >= 30) {
                    d1 = new E0(window, cVar);
                } else {
                    d1 = i10 >= 26 ? new D0(window, cVar) : new C0(window, cVar);
                }
                d1.R(z12);
                boolean zT = Y2.a.T(iC);
                if (Y2.a.T(iE) || (iE == 0 && zT)) {
                    z10 = true;
                }
                O8.c cVar2 = new O8.c(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 35) {
                    d5 = new F0(window, cVar2);
                } else if (i11 >= 30) {
                    d5 = new E0(window, cVar2);
                } else {
                    d5 = i11 >= 26 ? new D0(window, cVar2) : new C0(window, cVar2);
                }
                d5.Q(z10);
                y0 y0Var = new y0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = S.f3689a;
                I.m(viewFindViewById, y0Var);
                this.f14854Z0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = p().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f14853Y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f12590z0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new B7.a(dialog2, rect));
        }
        M();
        int i12 = this.f14836G0;
        if (i12 == 0) {
            W();
            throw null;
        }
        W();
        b bVar = this.f14838I0;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i12);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f14865u);
        materialCalendar.P(bundle);
        this.f14839J0 = materialCalendar;
        if (this.f14842N0 == 1) {
            pickerFragment = materialCalendar;
            W();
            b bVar2 = this.f14838I0;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i12);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            materialTextInputPicker.P(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        pickerFragment = materialCalendar;
        this.f14837H0 = pickerFragment;
        this.f14851W0.setText((this.f14842N0 == 1 && p().getConfiguration().orientation == 2) ? this.f14856b1 : this.f14855a1);
        W();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void H() {
        this.f14837H0.f14859o0.clear();
        super.H();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog T(Bundle bundle) {
        Context contextM = M();
        M();
        int i10 = this.f14836G0;
        if (i10 == 0) {
            W();
            throw null;
        }
        Dialog dialog = new Dialog(contextM, i10);
        Context context = dialog.getContext();
        this.f14841M0 = Y(context, android.R.attr.windowFullscreen);
        this.f14853Y0 = new R7.i(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p128m7.a.f19634B, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f14853Y0.k(context);
        this.f14853Y0.m(ColorStateList.valueOf(color));
        R7.i iVar = this.f14853Y0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = S.f3689a;
        iVar.l(I.e(decorView));
        return dialog;
    }

    public final void W() {
        if (this.f16166w.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f14834E0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f14835F0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f16145X;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.f16166w;
        }
        this.f14836G0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14838I0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14840K0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.L0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f14842N0 = bundle.getInt("INPUT_MODE_KEY");
        this.f14843O0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14844P0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f14845Q0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f14846R0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f14847S0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14848T0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f14849U0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f14850V0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.L0;
        if (text == null) {
            text = M().getResources().getText(this.f14840K0);
        }
        this.f14855a1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f14856b1 = text;
    }
}
