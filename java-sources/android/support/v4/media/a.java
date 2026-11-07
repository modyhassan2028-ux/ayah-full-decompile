package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.r;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f11295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f11296b;

    public a(c cVar) {
        this.f11295a = new WeakReference(cVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f11296b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f11295a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        r.C(data);
        c cVar = (c) weakReference2.get();
        Messenger messenger = (Messenger) this.f11296b.get();
        try {
            int i10 = message.what;
            if (i10 == 1) {
                r.C(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                cVar.getClass();
                return;
            }
            if (i10 == 2) {
                cVar.getClass();
                return;
            }
            if (i10 != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            r.C(data.getBundle("data_options"));
            r.C(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (cVar.g != messenger) {
                return;
            }
            if (cVar.f11302e.get(string) != null) {
                throw new ClassCastException();
            }
            if (e.f11305b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                cVar.getClass();
            }
        }
    }
}
