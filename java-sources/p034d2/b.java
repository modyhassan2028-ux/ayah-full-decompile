package p034d2;

import R7.f;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import p013b2.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15558b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        f fVar = new f(25);
        super(inputConnection, false);
        this.f15557a = editText;
        this.f15558b = fVar;
        if (j.d()) {
            j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f15557a.getEditableText();
        this.f15558b.getClass();
        return f.q(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f15557a.getEditableText();
        this.f15558b.getClass();
        return f.q(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
