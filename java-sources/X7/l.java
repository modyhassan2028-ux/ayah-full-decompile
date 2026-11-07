package X7;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f10023a;

    public l(m mVar) {
        this.f10023a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f10023a;
        k kVar = mVar.f10036M;
        if (mVar.f10033J == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.f10033J;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.f10033J.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.f10033J.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.f10033J = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().l(mVar.f10033J);
        mVar.j(mVar.b());
    }
}
