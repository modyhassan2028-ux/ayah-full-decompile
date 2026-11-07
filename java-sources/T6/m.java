package T6;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7848a;

    public m(int i10) {
        this.f7848a = i10;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(i iVar);

    public abstract R6.d[] b(i iVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(i iVar);

    public abstract void f(L5.c cVar, boolean z10);
}
