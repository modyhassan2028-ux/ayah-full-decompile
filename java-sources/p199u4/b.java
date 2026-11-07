package p199u4;

import B3.f;
import C4.c;
import N9.AbstractC0419l;
import N9.k0;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import p110k9.a;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f22934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f22935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f22936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f22937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f22938e;

    public b(Context context, Handler handler) {
        j.e(handler, "handler");
        this.f22934a = handler;
        k0 k0VarC = AbstractC0419l.c(null);
        this.f22935b = k0VarC;
        Object systemService = context.getSystemService("audio");
        j.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f22936c = (AudioManager) systemService;
        this.f22937d = a.d(new f(23, this));
        this.f22938e = new c(k0VarC, 11);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        a aVar;
        if (i10 == -3) {
            aVar = a.f22931t;
        } else if (i10 == -2) {
            aVar = a.f22930s;
        } else if (i10 != -1) {
            aVar = i10 != 1 ? null : a.f22929r;
        } else {
            aVar = a.f22932u;
        }
        if (aVar != null) {
            k0 k0Var = this.f22935b;
            k0Var.getClass();
            k0Var.n(null, aVar);
        }
    }
}
