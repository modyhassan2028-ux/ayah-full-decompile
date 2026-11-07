package X7;

import I1.S;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v implements TextWatcher {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EditText f10100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f10101t;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.f10101t = textInputLayout;
        this.f10100s = editText;
        this.f10099r = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f10101t;
        textInputLayout.u(!textInputLayout.f15307R0, false);
        if (textInputLayout.f15277B) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f15293J) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f10100s;
        int lineCount = editText.getLineCount();
        int i10 = this.f10099r;
        if (lineCount != i10) {
            if (lineCount < i10) {
                WeakHashMap weakHashMap = S.f3689a;
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.f15296K0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f10099r = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
