package p175r4;

import android.support.v4.media.session.k;
import com.ayah.feature.audio.service.AyahAudioService;
import p219w4.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AyahAudioService f21560f;

    public c(AyahAudioService ayahAudioService) {
        this.f21560f = ayahAudioService;
    }

    @Override // android.support.v4.media.session.k
    public final void b() {
        boolean z10 = AyahAudioService.f13735O;
        f fVar = this.f21560f.f13738C;
        if (fVar != null) {
            fVar.c(true);
        } else {
            j.k("audioPlayer");
            throw null;
        }
    }

    @Override // android.support.v4.media.session.k
    public final void c() {
        boolean z10 = AyahAudioService.f13735O;
        this.f21560f.e(false);
    }

    @Override // android.support.v4.media.session.k
    public final void d() {
        boolean z10 = AyahAudioService.f13735O;
        this.f21560f.g();
    }

    @Override // android.support.v4.media.session.k
    public final void e() {
        boolean z10 = AyahAudioService.f13735O;
        this.f21560f.f();
    }

    @Override // android.support.v4.media.session.k
    public final void f() {
        boolean z10 = AyahAudioService.f13735O;
        this.f21560f.h();
    }
}
