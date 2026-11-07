package p219w4;

import C4.c;
import K9.AbstractC0405x;
import L9.d;
import L9.e;
import N9.AbstractC0419l;
import N9.C0424q;
import N9.k0;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import j$.time.Instant;
import p035d3.t;
import p035d3.u;
import p110k9.a;
import p110k9.o;
import p199u4.b;
import p207v2.d0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f23716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f23717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f23718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f23719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f23720f;
    public MediaPlayer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f23721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f23722i;
    public final k0 j;

    public f(Context context, t tVar, Handler handler) {
        j.e(tVar, "audioFocusManagerFactory");
        j.e(handler, "handler");
        this.f23715a = context;
        k0 k0VarC = AbstractC0419l.c(null);
        this.f23716b = k0VarC;
        k0 k0VarC2 = AbstractC0419l.c(g.f23723r);
        this.f23717c = k0VarC2;
        this.f23718d = AbstractC0419l.c(-1);
        b bVar = new b(((u) tVar.f15641a.f15616c).f15659a.f1940a, handler);
        this.f23719e = bVar;
        this.f23720f = a.d(new Ba.b(23));
        P9.d dVarD = AbstractC0405x.d();
        int i10 = e.f5586a;
        this.f23721h = new d(handler, null, false);
        this.f23722i = new c(k0VarC, 11);
        this.j = k0VarC2;
        AbstractC0419l.u(new C0424q(bVar.f22938e, new d0(this, (p150o9.c) null, 3), 2), dVarD);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    public final void a(MediaPlayer mediaPlayer, boolean z10) {
        boolean z11;
        k0 k0Var = this.f23717c;
        g gVar = (g) k0Var.getValue();
        if (gVar == g.f23723r) {
            e();
            return;
        }
        if (z10) {
            z11 = true;
        } else {
            b bVar = this.f23719e;
            AudioManager audioManager = bVar.f22936c;
            p143o2.d dVar = (p143o2.d) bVar.f22937d.getValue();
            if (audioManager == null) {
                throw new IllegalArgumentException("AudioManager must not be null");
            }
            if (dVar == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
            }
            if ((Build.VERSION.SDK_INT >= 26 ? p143o2.e.b(audioManager, dVar.a()) : audioManager.requestAudioFocus(dVar.f20268a, dVar.f20270c.f12693a.a(), 1)) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (!z11) {
            c(true);
            return;
        }
        if (!mediaPlayer.isPlaying()) {
            boolean z12 = gVar == g.f23724s;
            int iIntValue = ((Number) this.f23718d.getValue()).intValue();
            if (!z12 || iIntValue <= -1) {
                mediaPlayer.start();
            } else {
                mediaPlayer.seekTo(iIntValue);
            }
        }
        k0Var.getClass();
        k0Var.n(null, g.f23725t);
    }

    public final int b() {
        MediaPlayer mediaPlayer;
        if (((g) this.f23717c.getValue()) != g.f23725t || (mediaPlayer = this.g) == null) {
            return -1;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public final void c(boolean z10) {
        MediaPlayer mediaPlayer;
        k0 k0Var = this.f23717c;
        if (k0Var.getValue() == g.f23725t && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying()) {
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
            if (z10) {
                k0Var.getClass();
                k0Var.n(null, g.f23726u);
            }
        }
    }

    public final boolean d() {
        g gVar = (g) this.f23717c.getValue();
        if (gVar == g.f23726u) {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                a(mediaPlayer, false);
                return true;
            }
        } else if (gVar != g.f23725t) {
            return false;
        }
        return true;
    }

    public final void e() {
        try {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        } catch (IllegalStateException unused) {
        }
        this.g = null;
        k0 k0Var = this.f23717c;
        k0Var.getClass();
        k0Var.n(null, g.f23723r);
        b bVar = this.f23719e;
        AudioManager audioManager = bVar.f22936c;
        p143o2.d dVar = (p143o2.d) bVar.f22937d.getValue();
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            p143o2.e.a(audioManager, dVar.a());
        } else {
            audioManager.abandonAudioFocus(dVar.f20268a);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mp");
        Ha.a.f3643a.getClass();
        R7.f.h(new Object[0]);
        Instant instantNow = Instant.now();
        j.d(instantNow, "now(...)");
        b bVar = new b(instantNow);
        k0 k0Var = this.f23716b;
        k0Var.getClass();
        k0Var.n(null, bVar);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        j.e(mediaPlayer, "mp");
        R7.f fVar = Ha.a.f3643a;
        Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11)};
        fVar.getClass();
        R7.f.h(objArr);
        Instant instantNow = Instant.now();
        j.d(instantNow, "now(...)");
        a aVar = new a(instantNow);
        k0 k0Var = this.f23716b;
        k0Var.getClass();
        k0Var.n(null, aVar);
        e();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mp");
        Ha.a.f3643a.getClass();
        R7.f.h(new Object[0]);
        Instant instantNow = Instant.now();
        j.d(instantNow, "now(...)");
        c cVar = new c(instantNow);
        k0 k0Var = this.f23716b;
        k0Var.getClass();
        k0Var.n(null, cVar);
        a(mediaPlayer, false);
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        j.e(mediaPlayer, "mp");
        R7.f fVar = Ha.a.f3643a;
        Object[] objArr = {Integer.valueOf(mediaPlayer.getCurrentPosition())};
        fVar.getClass();
        R7.f.h(objArr);
        mediaPlayer.start();
        k0 k0Var = this.f23717c;
        k0Var.getClass();
        k0Var.n(null, g.f23725t);
        Instant instantNow = Instant.now();
        j.d(instantNow, "now(...)");
        d dVar = new d(instantNow);
        k0 k0Var2 = this.f23716b;
        k0Var2.getClass();
        k0Var2.n(null, dVar);
    }
}
