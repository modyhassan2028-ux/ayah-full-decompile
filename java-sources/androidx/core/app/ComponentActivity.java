package androidx.core.app;

import I1.InterfaceC0260m;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;
import p050e8.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC0771u, InterfaceC0260m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f12313r = new w(this);

    @Override // I1.InterfaceC0260m
    public final boolean d(KeyEvent keyEvent) {
        j.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        if (b.p(decorView, keyEvent)) {
            return true;
        }
        return b.q(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        if (b.p(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public w h() {
        return this.f12313r;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = G.f12616s;
        E.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        j.e(bundle, "outState");
        this.f12313r.g(EnumC0767p.f12663t);
        super.onSaveInstanceState(bundle);
    }
}
