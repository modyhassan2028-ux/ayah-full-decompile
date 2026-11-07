package X7;

import I1.C0243b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class w extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f10102d;

    public w(TextInputLayout textInputLayout) {
        this.f10102d = textInputLayout;
    }

    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        this.f3710a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f10102d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z10 = textInputLayout.L0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        u uVar = textInputLayout.f15330s;
        AppCompatTextView appCompatTextView = uVar.f10091s;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.f10093u);
        }
        if (!zIsEmpty) {
            gVar.x(text);
        } else if (!TextUtils.isEmpty(string)) {
            gVar.x(string);
            if (!z10 && placeholderText != null) {
                gVar.x(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.x(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                gVar.r(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                gVar.x(string);
            }
            gVar.w(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z11) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f15275A.f10080y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f15332t.b().m(gVar);
    }

    @Override // I1.C0243b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f10102d.f15332t.b().n(accessibilityEvent);
    }
}
