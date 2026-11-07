package X7;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f10049d;

    public n(m mVar) {
        this.f10046a = mVar.f10037r;
        this.f10047b = mVar;
        this.f10048c = mVar.getContext();
        this.f10049d = mVar.f10043x;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public C6.b h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return this instanceof j;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f10047b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(J1.g gVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z10) {
    }
}
