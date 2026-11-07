package android.support.v4.media.session;

import I1.RunnableC0250e0;
import J0.C0280d0;
import N9.k0;
import Z0.B;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.session.MediaButtonReceiver;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.ayah.feature.audio.service.AyahAudioService;
import i7.A0;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11345b;

    public /* synthetic */ i(int i10) {
        this.f11344a = i10;
    }

    public void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        m mVar;
        k kVar;
        i iVar;
        p246z4.l lVarB;
        String stringExtra;
        Object value;
        p175r4.a aVar;
        z3.k kVar2;
        int i10 = 0;
        int i11 = 1;
        switch (this.f11344a) {
            case 0:
                if (message.what == 1) {
                    synchronized (((k) this.f11345b).f11347a) {
                        mVar = (m) ((k) this.f11345b).f11350d.get();
                        kVar = (k) this.f11345b;
                        iVar = kVar.f11351e;
                        break;
                    }
                    if (mVar == null || kVar != mVar.b() || iVar == null) {
                        return;
                    }
                    mVar.f((p143o2.n) message.obj);
                    ((k) this.f11345b).a(mVar, iVar);
                    mVar.f(null);
                    return;
                }
                return;
            case 1:
                int i12 = message.what;
                if (i12 == -3 || i12 == -2 || i12 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f11345b).get(), message.what);
                    return;
                } else {
                    if (i12 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 2:
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) this.f11345b;
                if (mediaBrowserServiceCompat == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                X4.c cVar = mediaBrowserServiceCompat.f12701s;
                Bundle data = message.getData();
                int i13 = 26;
                switch (message.what) {
                    case 1:
                        Bundle bundle = data.getBundle("data_root_hints");
                        r.C(bundle);
                        String string = data.getString("data_package_name");
                        int i14 = data.getInt("data_calling_pid");
                        int i15 = data.getInt("data_calling_uid");
                        B b5 = new B(i13, message.replyTo);
                        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (MediaBrowserServiceCompat) cVar.f9953r;
                        if (string != null) {
                            String[] packagesForUid = mediaBrowserServiceCompat2.getPackageManager().getPackagesForUid(i15);
                            int length = packagesForUid.length;
                            while (i10 < length) {
                                if (packagesForUid[i10].equals(string)) {
                                    mediaBrowserServiceCompat2.f12705w.a(new p143o2.k(cVar, b5, string, i14, i15, bundle));
                                    return;
                                }
                                i10++;
                            }
                        }
                        throw new IllegalArgumentException("Package/uid mismatch: uid=" + i15 + " package=" + string);
                    case 2:
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new p143o2.l(cVar, new B(i13, message.replyTo), i10));
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle("data_options");
                        r.C(bundle2);
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new A0(cVar, new B(i13, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                        return;
                    case 4:
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new RunnableC0250e0(cVar, new B(i13, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 11, false));
                        return;
                    case 5:
                        String string2 = data.getString("data_media_item_id");
                        p010b.d dVar = (p010b.d) data.getParcelable("data_result_receiver");
                        B b10 = new B(i13, message.replyTo);
                        cVar.getClass();
                        if (TextUtils.isEmpty(string2) || dVar == null) {
                            return;
                        }
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new p143o2.m(cVar, b10, string2, dVar));
                        return;
                    case 6:
                        Bundle bundle3 = data.getBundle("data_root_hints");
                        r.C(bundle3);
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new p143o2.k(cVar, new B(i13, message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle3));
                        return;
                    case 7:
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new p143o2.l(cVar, new B(i13, message.replyTo), i11));
                        return;
                    case 8:
                        Bundle bundle4 = data.getBundle("data_search_extras");
                        r.C(bundle4);
                        String string3 = data.getString("data_search_query");
                        p010b.d dVar2 = (p010b.d) data.getParcelable("data_result_receiver");
                        B b11 = new B(i13, message.replyTo);
                        cVar.getClass();
                        if (TextUtils.isEmpty(string3) || dVar2 == null) {
                            return;
                        }
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new p143o2.m(cVar, b11, string3, bundle4, dVar2));
                        return;
                    case 9:
                        Bundle bundle5 = data.getBundle("data_custom_action_extras");
                        r.C(bundle5);
                        String string4 = data.getString("data_custom_action");
                        p010b.d dVar3 = (p010b.d) data.getParcelable("data_result_receiver");
                        B b12 = new B(i13, message.replyTo);
                        cVar.getClass();
                        if (TextUtils.isEmpty(string4) || dVar3 == null) {
                            return;
                        }
                        ((MediaBrowserServiceCompat) cVar.f9953r).f12705w.a(new A0(cVar, b12, string4, bundle5, dVar3, 4));
                        return;
                    default:
                        Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 3:
                p246z4.l lVar = p246z4.l.f24830u;
                p251z9.j.e(message, "msg");
                int i16 = message.what;
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            ((AyahAudioService) this.f11345b).f13752w = null;
                            AyahAudioService.a((AyahAudioService) this.f11345b, false);
                            return;
                        } else {
                            if (i16 == 4) {
                                AyahAudioService ayahAudioService = (AyahAudioService) this.f11345b;
                                boolean z10 = AyahAudioService.f13735O;
                                ayahAudioService.h();
                                return;
                            }
                            return;
                        }
                    }
                    AyahAudioService ayahAudioService2 = (AyahAudioService) this.f11345b;
                    boolean z11 = AyahAudioService.f13735O;
                    C0280d0 c0280d0B = ayahAudioService2.b();
                    p219w4.f fVar = ayahAudioService2.f13738C;
                    if (fVar == null) {
                        p251z9.j.k("audioPlayer");
                        throw null;
                    }
                    int iB = fVar.b();
                    p065g3.c cVarC = c0280d0B.c();
                    p246z4.a aVar2 = (p246z4.a) ((k0) c0280d0B.g).getValue();
                    p175r4.a aVar3 = (p175r4.a) ((k0) c0280d0B.f4067f).getValue();
                    int iH = c0280d0B.h();
                    if (cVarC == null || aVar2 == null || aVar3 == null || iB < iH) {
                        lVarB = iB < iH ? p246z4.l.f24827r : lVar;
                    } else {
                        lVarB = c0280d0B.b(cVarC, aVar3, aVar2);
                    }
                    if (lVarB == p246z4.l.f24828s) {
                        ayahAudioService2.m(2);
                        ayahAudioService2.k(3);
                    }
                    if (lVarB != p246z4.l.f24829t) {
                        if (lVarB == p246z4.l.f24831v || lVarB == lVar) {
                            return;
                        }
                        ayahAudioService2.j();
                        return;
                    }
                    ayahAudioService2.f13739D = true;
                    i iVar2 = ayahAudioService2.f13736A;
                    if (iVar2 != null) {
                        iVar2.removeMessages(2);
                        return;
                    } else {
                        p251z9.j.k("serviceHandler");
                        throw null;
                    }
                }
                Object obj = message.obj;
                p251z9.j.c(obj, "null cannot be cast to non-null type android.content.Intent");
                Intent intent = (Intent) obj;
                AyahAudioService ayahAudioService3 = (AyahAudioService) this.f11345b;
                boolean z12 = AyahAudioService.f13735O;
                p175r4.a aVar4 = (p175r4.a) ((k0) ayahAudioService3.b().f4067f).getValue();
                String action = intent.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case 434515882:
                            if (action.equals("com.ayah.action.PLAY")) {
                                if (intent.hasExtra("EXTRA_AUDIO_REQUEST")) {
                                    Serializable serializableExtra = intent.getSerializableExtra("EXTRA_AUDIO_REQUEST");
                                    p251z9.j.c(serializableExtra, "null cannot be cast to non-null type com.ayah.feature.audio.service.AudioRequest");
                                    ayahAudioService3.b().o((p175r4.a) serializableExtra);
                                }
                                p175r4.a aVar5 = (p175r4.a) ((k0) ayahAudioService3.b().f4067f).getValue();
                                if (aVar5 != null) {
                                    ayahAudioService3.e(!aVar5.equals(aVar4));
                                    return;
                                } else {
                                    ayahAudioService3.h();
                                    return;
                                }
                            }
                            break;
                        case 434604533:
                            if (action.equals("com.ayah.action.SKIP")) {
                                ayahAudioService3.g();
                                return;
                            }
                            break;
                        case 434613368:
                            if (action.equals("com.ayah.action.STOP")) {
                                ayahAudioService3.h();
                                return;
                            }
                            break;
                        case 584781856:
                            if (action.equals("com.ayah.action.PAUSE")) {
                                p219w4.f fVar2 = ayahAudioService3.f13738C;
                                if (fVar2 != null) {
                                    fVar2.c(true);
                                    return;
                                } else {
                                    p251z9.j.k("audioPlayer");
                                    throw null;
                                }
                            }
                            break;
                        case 599647859:
                            if (action.equals("com.ayah.action.SWITCH_RECITER")) {
                                if (aVar4 == null || (stringExtra = intent.getStringExtra("RECITER_ID")) == null || stringExtra.equals(aVar4.f21555t)) {
                                    return;
                                }
                                C0280d0 c0280d0B2 = ayahAudioService3.b();
                                k0 k0Var = (k0) c0280d0B2.g;
                                k0 k0Var2 = (k0) c0280d0B2.f4067f;
                                do {
                                    value = k0Var2.getValue();
                                    p175r4.a aVar6 = (p175r4.a) value;
                                    if (aVar6 != null) {
                                        z3.k kVar3 = aVar6.f21553r;
                                        z3.k kVar4 = aVar6.f21554s;
                                        int i17 = aVar6.f21556u;
                                        int i18 = aVar6.f21557v;
                                        p251z9.j.e(kVar3, "startAyah");
                                        p251z9.j.e(kVar4, "endAyah");
                                        aVar = new p175r4.a(kVar3, kVar4, stringExtra, i17, i18);
                                    } else {
                                        aVar = null;
                                    }
                                } while (!k0Var2.l(value, aVar));
                                if (aVar != null) {
                                    p246z4.a aVar7 = (p246z4.a) k0Var.getValue();
                                    if (aVar7 == null || (kVar2 = aVar7.f24806a) == null) {
                                        kVar2 = aVar.f21553r;
                                    }
                                    k0Var.n(null, new p246z4.a(kVar2, aVar.f21555t, aVar7 != null ? aVar7.f24808c : 0, aVar7 != null ? aVar7.f24809d : 0));
                                    k0 k0Var3 = (k0) c0280d0B2.f4066e;
                                    p246z4.b bVar = new p246z4.b(System.currentTimeMillis(), false);
                                    k0Var3.getClass();
                                    k0Var3.n(null, bVar);
                                    return;
                                }
                                return;
                            }
                            break;
                        case 1009371057:
                            if (action.equals("com.ayah.action.REWIND")) {
                                ayahAudioService3.f();
                                return;
                            }
                            break;
                        case 1051208424:
                            if (action.equals("com.ayah.action.STATUS")) {
                                int i19 = ayahAudioService3.f13750u;
                                ayahAudioService3.m(i19);
                                if (i19 == 0 && ayahAudioService3.f13752w == null) {
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        p216w1.q.d(ayahAudioService3);
                                    } else {
                                        ayahAudioService3.stopForeground(true);
                                    }
                                    ayahAudioService3.stopSelf();
                                    return;
                                }
                                return;
                            }
                            break;
                        case 1454458769:
                            if (action.equals("com.ayah.action.PLAYBACK")) {
                                p219w4.f fVar3 = ayahAudioService3.f13738C;
                                if (fVar3 == null) {
                                    p251z9.j.k("audioPlayer");
                                    throw null;
                                }
                                p219w4.g gVar = (p219w4.g) fVar3.f23717c.getValue();
                                int iOrdinal = gVar.ordinal();
                                if (iOrdinal != 0 && iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        fVar3.c(true);
                                    } else if (iOrdinal == 3) {
                                        fVar3.d();
                                    } else if (iOrdinal != 4) {
                                        throw new A6.a();
                                    }
                                }
                                if (gVar != p219w4.g.f23723r || ((k0) ayahAudioService3.b().g).getValue() == null) {
                                    return;
                                }
                                ayahAudioService3.b().j();
                                return;
                            }
                            break;
                    }
                }
                r rVar = ayahAudioService3.f13754y;
                if (rVar == null) {
                    p251z9.j.k("mediaSession");
                    throw null;
                }
                int i20 = MediaButtonReceiver.f12706a;
                if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    X4.c cVar2 = (X4.c) rVar.f11365t;
                    if (keyEvent != null) {
                        ((f) cVar2.f9953r).f11339a.dispatchMediaButtonEvent(keyEvent);
                        return;
                    } else {
                        cVar2.getClass();
                        throw new IllegalArgumentException("KeyEvent may not be null");
                    }
                }
                return;
            default:
                if (message.what != 1) {
                    return;
                }
                PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) this.f11345b;
                PreferenceScreen preferenceScreen = preferenceFragmentCompat.f12778p0.f24336h;
                if (preferenceScreen != null) {
                    preferenceFragmentCompat.f12779q0.setAdapter(new p226x2.p(preferenceScreen));
                    preferenceScreen.m();
                    return;
                }
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.f11344a) {
            case 2:
                Bundle data = message.getData();
                data.setClassLoader(android.support.v4.media.e.class.getClassLoader());
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Looper looper, int i10) {
        super(looper);
        this.f11344a = i10;
        this.f11345b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AyahAudioService ayahAudioService, Looper looper) {
        super(looper);
        this.f11344a = 3;
        p251z9.j.e(looper, "looper");
        this.f11345b = ayahAudioService;
    }
}
