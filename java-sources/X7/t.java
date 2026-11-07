package X7;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class t extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f10088f;
    public final E5.b g;

    public t(m mVar, int i10) {
        super(mVar);
        this.f10087e = R.drawable.design_password_eye;
        this.g = new E5.b(5, this);
        if (i10 != 0) {
            this.f10087e = i10;
        }
    }

    @Override // X7.n
    public final void b() {
        p();
    }

    @Override // X7.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // X7.n
    public final int d() {
        return this.f10087e;
    }

    @Override // X7.n
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // X7.n
    public final boolean j() {
        return true;
    }

    @Override // X7.n
    public final boolean k() {
        EditText editText = this.f10088f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // X7.n
    public final void l(EditText editText) {
        this.f10088f = editText;
        p();
    }

    @Override // X7.n
    public final void q() {
        EditText editText = this.f10088f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f10088f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // X7.n
    public final void r() {
        EditText editText = this.f10088f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
