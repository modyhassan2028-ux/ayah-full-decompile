package p013b2;

import T6.p;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0757f;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0757f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f13166r;

    public k(EmojiCompatInitializer emojiCompatInitializer, w wVar) {
        this.f13166r = wVar;
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void A(InterfaceC0771u interfaceC0771u) {
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final void b(InterfaceC0771u interfaceC0771u) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p(1), 500L);
        this.f13166r.f(this);
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void e(InterfaceC0771u interfaceC0771u) {
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void i(InterfaceC0771u interfaceC0771u) {
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void s(InterfaceC0771u interfaceC0771u) {
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void w(InterfaceC0771u interfaceC0771u) {
    }
}
