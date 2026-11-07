package p183s6;

import android.content.Context;
import android.content.Intent;
import com.ayah.MainActivity;
import com.ayah.feature.audio.service.AyahAudioService;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.reciterlist.RecitersActivity;
import p035d3.y;
import p136n5.e;
import p144o3.a;
import p165q3.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22152b;

    public b(Context context, a aVar) {
        j.e(context, "context");
        j.e(aVar, "audioPlaybackModel");
        this.f22151a = context;
        this.f22152b = aVar;
    }

    @Override // p136n5.e
    public final void a() {
        h("com.ayah.action.REWIND");
    }

    @Override // p136n5.e
    public final void b() {
        h("com.ayah.action.STOP");
    }

    @Override // p136n5.e
    public final void c() {
        h("com.ayah.action.PLAYBACK");
    }

    @Override // p136n5.e
    public final void d() {
        Object obj = this.f22151a;
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            MainActivity mainActivity = (MainActivity) aVar;
            mainActivity.f13649n0 = true;
            Intent intent = new Intent(mainActivity, (Class<?>) RecitersActivity.class);
            intent.putExtra("EXTRA_PAGE_NUMBER", mainActivity.v());
            mainActivity.startActivityForResult(intent, 3);
        }
    }

    @Override // p136n5.e
    public final void e() {
        h("com.ayah.action.SKIP");
    }

    @Override // p136n5.e
    public final void f() {
        this.f22152b.b(f.f21292a);
    }

    @Override // p136n5.e
    public final void g() {
        Object obj = this.f22151a;
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            MainActivity mainActivity = (MainActivity) aVar;
            AudioConfigWrapper audioConfigWrapper = new AudioConfigWrapper(mainActivity, null, 0, 14);
            mainActivity.s(audioConfigWrapper);
            audioConfigWrapper.setOnClickListener(new y(mainActivity, 2));
            p211v6.a aVar2 = mainActivity.f13639d0;
            if (aVar2 != null) {
                aVar2.d();
            } else {
                j.k("systemUiHelper");
                throw null;
            }
        }
    }

    public final void h(String str) {
        Object obj = this.f22151a;
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            MainActivity mainActivity = (MainActivity) aVar;
            Intent intent = new Intent(mainActivity, (Class<?>) AyahAudioService.class);
            intent.setAction(str);
            p166q4.a aVar2 = mainActivity.f13629G0;
            if (aVar2 == null) {
                j.k("crashLogger");
                throw null;
            }
            aVar2.a("starting audio service for sendAudioCommand");
            mainActivity.startService(intent);
        }
    }
}
