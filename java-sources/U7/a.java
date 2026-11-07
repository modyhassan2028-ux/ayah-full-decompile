package U7;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            throw p123m2.c.p(message.obj);
        }
        if (i10 != 1) {
            return false;
        }
        throw p123m2.c.p(message.obj);
    }
}
