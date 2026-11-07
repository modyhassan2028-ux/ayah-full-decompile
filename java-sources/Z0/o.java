package Z0;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class o extends n {
    @Override // Z0.n
    public final void a(M.q qVar) {
        qVar.closeConnection();
    }

    @Override // Z0.n, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // Z0.n, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
