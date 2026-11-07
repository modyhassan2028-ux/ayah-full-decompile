package K1;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6.b f5216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, C6.b bVar) {
        super(inputConnection, false);
        this.f5216a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        p248z6.c cVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            cVar = new p248z6.c(19, new f(inputContentInfo));
        }
        if (this.f5216a.i(cVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
