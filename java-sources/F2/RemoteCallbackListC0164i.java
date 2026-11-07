package F2;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: F2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC0164i extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2284a;

    public RemoteCallbackListC0164i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2284a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        p251z9.j.e((InterfaceC0159d) iInterface, "callback");
        p251z9.j.e(obj, "cookie");
        this.f2284a.f12949s.remove((Integer) obj);
    }
}
