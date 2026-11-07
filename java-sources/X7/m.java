package X7;

import H7.H;
import I1.S;
import K0.ViewOnAttachStateChangeListenerC0381z;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ayah.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinkedHashSet f10024A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f10025B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f10026C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10027D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ImageView.ScaleType f10028E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View.OnLongClickListener f10029F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f10030G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final AppCompatTextView f10031H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10032I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public EditText f10033J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final AccessibilityManager f10034K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C6.b f10035L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final k f10036M;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextInputLayout f10037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FrameLayout f10038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CheckableImageButton f10039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f10040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f10041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View.OnLongClickListener f10042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CheckableImageButton f10043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final W0.e f10044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10045z;

    public m(TextInputLayout textInputLayout, p074h0.i iVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f10045z = 0;
        this.f10024A = new LinkedHashSet();
        this.f10036M = new k(this);
        l lVar = new l(this);
        this.f10034K = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f10037r = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10038s = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f10039t = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f10043x = checkableImageButtonA2;
        this.f10044y = new W0.e(this, iVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f10031H = appCompatTextView;
        TypedArray typedArray = (TypedArray) iVar.f16423t;
        if (typedArray.hasValue(38)) {
            this.f10040u = va.g.x(getContext(), iVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f10041v = H.o(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(iVar.r(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = S.f3689a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f10025B = va.g.x(getContext(), iVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f10026C = H.o(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f10025B = va.g.x(getContext(), iVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f10026C = H.o(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f10027D) {
            this.f10027D = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeU = Y2.a.u(typedArray.getInt(31, -1));
            this.f10028E = scaleTypeU;
            checkableImageButtonA2.setScaleType(scaleTypeU);
            checkableImageButtonA.setScaleType(scaleTypeU);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            appCompatTextView.setTextColor(iVar.q(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f10030G = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f15337v0.add(lVar);
        if (textInputLayout.f15334u != null) {
            lVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0381z(4, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (va.g.C(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n eVar;
        int i10 = this.f10045z;
        W0.e eVar2 = this.f10044y;
        SparseArray sparseArray = (SparseArray) eVar2.f9492d;
        n nVar = (n) sparseArray.get(i10);
        if (nVar != null) {
            return nVar;
        }
        m mVar = (m) eVar2.f9493e;
        if (i10 == -1) {
            eVar = new e(mVar, 0);
        } else if (i10 == 0) {
            eVar = new e(mVar, 1);
        } else if (i10 == 1) {
            eVar = new t(mVar, eVar2.f9491c);
        } else if (i10 == 2) {
            eVar = new d(mVar);
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(p123m2.c.r(i10, "Invalid end icon mode: "));
            }
            eVar = new j(mVar);
        }
        sparseArray.append(i10, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f10043x;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = S.f3689a;
        return this.f10031H.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f10038s.getVisibility() == 0 && this.f10043x.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f10039t.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean z12;
        n nVarB = b();
        boolean zJ = nVarB.j();
        CheckableImageButton checkableImageButton = this.f10043x;
        boolean z13 = true;
        if (!zJ || (z12 = checkableImageButton.f14966u) == nVarB.k()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        }
        if (!(nVarB instanceof j) || (zIsActivated = checkableImageButton.isActivated()) == ((j) nVarB).f10015l) {
            z13 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z13) {
            Y2.a.g0(this.f10037r, checkableImageButton, this.f10025B);
        }
    }

    public final void g(int i10) {
        if (this.f10045z == i10) {
            return;
        }
        n nVarB = b();
        C6.b bVar = this.f10035L;
        AccessibilityManager accessibilityManager = this.f10034K;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new J1.b(bVar));
        }
        this.f10035L = null;
        nVarB.r();
        this.f10045z = i10;
        Iterator it = this.f10024A.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
        h(i10 != 0);
        n nVarB2 = b();
        int iD = this.f10044y.f9490b;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawableE = iD != 0 ? Y2.a.E(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f10043x;
        checkableImageButton.setImageDrawable(drawableE);
        TextInputLayout textInputLayout = this.f10037r;
        if (drawableE != null) {
            Y2.a.k(textInputLayout, checkableImageButton, this.f10025B, this.f10026C);
            Y2.a.g0(textInputLayout, checkableImageButton, this.f10025B);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.j());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        nVarB2.q();
        C6.b bVarH = nVarB2.h();
        this.f10035L = bVarH;
        if (bVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f3689a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new J1.b(this.f10035L));
            }
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f10029F;
        checkableImageButton.setOnClickListener(onClickListenerF);
        Y2.a.i0(checkableImageButton, onLongClickListener);
        EditText editText = this.f10033J;
        if (editText != null) {
            nVarB2.l(editText);
            j(nVarB2);
        }
        Y2.a.k(textInputLayout, checkableImageButton, this.f10025B, this.f10026C);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.f10043x.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f10037r.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f10039t;
        checkableImageButton.setImageDrawable(drawable);
        l();
        Y2.a.k(this.f10037r, checkableImageButton, this.f10040u, this.f10041v);
    }

    public final void j(n nVar) {
        if (this.f10033J == null) {
            return;
        }
        if (nVar.e() != null) {
            this.f10033J.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f10043x.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void k() {
        this.f10038s.setVisibility((this.f10043x.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f10030G == null || this.f10032I) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f10039t;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f10037r;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f15275A.f10072q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f10045z != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f10037r;
        if (textInputLayout.f15334u == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f15334u;
            WeakHashMap weakHashMap = S.f3689a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f15334u.getPaddingTop();
        int paddingBottom = textInputLayout.f15334u.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f3689a;
        this.f10031H.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f10031H;
        int visibility = appCompatTextView.getVisibility();
        int i10 = (this.f10030G == null || this.f10032I) ? 8 : 0;
        if (visibility != i10) {
            b().o(i10 == 0);
        }
        k();
        appCompatTextView.setVisibility(i10);
        this.f10037r.q();
    }
}
