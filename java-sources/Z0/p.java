package Z0;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    @Override // Z0.n, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        M.q qVar = this.f10938b;
        if (qVar != null) {
            return qVar.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
