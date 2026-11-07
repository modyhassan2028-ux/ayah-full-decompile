package K1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6.b f5217a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, C6.b bVar) {
        super(inputConnection, false);
        this.f5217a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        Object[] objArr;
        ResultReceiver resultReceiver;
        C6.b bVar = this.f5217a;
        boolean zI = false;
        zI = false;
        zI = false;
        zI = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i10 = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        zI = bVar.i(new p248z6.c(uri, clipDescription, uri2), i10, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(zI ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (zI) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
