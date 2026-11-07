package X7;

import I1.S;
import I1.Y;
import K0.RunnableC0354l;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.ayah.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10011f;
    public final TimeInterpolator g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f10012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E5.b f10013i;
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C6.b f10014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f10019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f10020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f10021r;

    public j(m mVar) {
        super(mVar);
        this.f10013i = new E5.b(4, this);
        this.j = new a(this, 1);
        this.f10014k = new C6.b(11, this);
        this.f10018o = Long.MAX_VALUE;
        this.f10011f = p050e8.b.S(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f10010e = p050e8.b.S(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = p050e8.b.T(mVar.getContext(), R.attr.motionEasingLinearInterpolator, p137n7.a.f20015a);
    }

    @Override // X7.n
    public final void a() {
        if (this.f10019p.isTouchExplorationEnabled() && this.f10012h.getInputType() != 0 && !this.f10049d.hasFocus()) {
            this.f10012h.dismissDropDown();
        }
        this.f10012h.post(new RunnableC0354l(8, this));
    }

    @Override // X7.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // X7.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // X7.n
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // X7.n
    public final View.OnClickListener f() {
        return this.f10013i;
    }

    @Override // X7.n
    public final C6.b h() {
        return this.f10014k;
    }

    @Override // X7.n
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // X7.n
    public final boolean k() {
        return this.f10017n;
    }

    @Override // X7.n
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f10012h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new P7.g(1, this));
        this.f10012h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: X7.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                j jVar = this.f10009a;
                jVar.f10016m = true;
                jVar.f10018o = System.currentTimeMillis();
                jVar.s(false);
            }
        });
        this.f10012h.setThreshold(0);
        TextInputLayout textInputLayout = this.f10046a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f10019p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f3689a;
            this.f10049d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // X7.n
    public final void m(J1.g gVar) {
        if (this.f10012h.getInputType() == 0) {
            gVar.m(Spinner.class.getName());
        }
        if (gVar.h()) {
            gVar.r(null);
        }
    }

    @Override // X7.n
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f10019p.isEnabled() && this.f10012h.getInputType() == 0) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f10017n && !this.f10012h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                t();
                this.f10016m = true;
                this.f10018o = System.currentTimeMillis();
            }
        }
    }

    @Override // X7.n
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f10011f);
        int i10 = 5;
        valueAnimatorOfFloat.addUpdateListener(new Y(i10, this));
        this.f10021r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f10010e);
        valueAnimatorOfFloat2.addUpdateListener(new Y(i10, this));
        this.f10020q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new F7.e(10, this));
        this.f10019p = (AccessibilityManager) this.f10048c.getSystemService("accessibility");
    }

    @Override // X7.n
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f10012h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f10012h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z10) {
        if (this.f10017n != z10) {
            this.f10017n = z10;
            this.f10021r.cancel();
            this.f10020q.start();
        }
    }

    public final void t() {
        if (this.f10012h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f10018o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f10016m = false;
        }
        if (this.f10016m) {
            this.f10016m = false;
            return;
        }
        s(!this.f10017n);
        if (!this.f10017n) {
            this.f10012h.dismissDropDown();
        } else {
            this.f10012h.requestFocus();
            this.f10012h.showDropDown();
        }
    }
}
