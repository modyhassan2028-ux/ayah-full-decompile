package p020c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class A implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f13344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f13345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f13346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f13347d;

    public A(y yVar, y yVar2, z zVar, z zVar2) {
        this.f13344a = yVar;
        this.f13345b = yVar2;
        this.f13346c = zVar;
        this.f13347d = zVar2;
    }

    public final void onBackCancelled() {
        this.f13347d.invoke();
    }

    public final void onBackInvoked() {
        this.f13346c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        this.f13345b.e(new C0776a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        this.f13344a.e(new C0776a(backEvent));
    }
}
