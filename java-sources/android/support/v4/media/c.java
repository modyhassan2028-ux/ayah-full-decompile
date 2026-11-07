package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p151p.C1271v;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f11299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f11300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f11301d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1350e f11302e = new C1350e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L5.c f11303f;
    public Messenger g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f11304h;

    public c(Context context, ComponentName componentName, C1271v c1271v) {
        this.f11298a = context;
        Bundle bundle = new Bundle();
        this.f11300c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c1271v.f20791b = this;
        this.f11299b = new MediaBrowser(context, componentName, (b) c1271v.f20790a, bundle);
    }
}
