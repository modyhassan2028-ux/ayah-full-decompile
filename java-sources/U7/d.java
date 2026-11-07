package U7;

import J1.f;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f8317a;

    public d(f fVar) {
        this.f8317a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        f fVar = this.f8317a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (fVar.f4217a) {
            throw null;
        }
    }
}
