package Z0;

import A.M0;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class n implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0 f10937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M.q f10938b;

    public n(M.q qVar, M0 m10) {
        this.f10937a = m10;
        this.f10938b = qVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            if (qVar != null) {
                a(qVar);
                this.f10938b = null;
            }
            this.f10937a.e(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.setSelection(i10, i11);
        }
        return false;
    }

    public void a(M.q qVar) {
    }
}
