package p034d2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p013b2.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EditText f15570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f15571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15572t = true;

    public i(EditText editText) {
        this.f15570r = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j jVarA = j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws Throwable {
        EditText editText = this.f15570r;
        if (!editText.isInEditMode() && this.f15572t && j.d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iC = j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    j.a().g(i10, i12 + i10, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            j jVarA = j.a();
            if (this.f15571s == null) {
                this.f15571s = new h(editText);
            }
            jVarA.h(this.f15571s);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
