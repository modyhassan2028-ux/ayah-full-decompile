package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    @Override // android.support.v4.media.session.m
    public final p143o2.n c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f11353a.getCurrentControllerInfo();
        p143o2.n nVar = new p143o2.n();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        nVar.f20295a = new p143o2.p(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return nVar;
    }

    @Override // android.support.v4.media.session.m
    public final void f(p143o2.n nVar) {
    }
}
