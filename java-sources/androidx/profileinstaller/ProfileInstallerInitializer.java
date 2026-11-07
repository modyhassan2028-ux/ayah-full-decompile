package androidx.profileinstaller;

import R7.f;
import U2.b;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // U2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // U2.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new f(3);
        }
        Choreographer.getInstance().postFrameCallback(new C2.f(this, context.getApplicationContext()));
        return new f(3);
    }
}
