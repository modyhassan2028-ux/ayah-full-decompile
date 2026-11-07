package O;

import E2.C0112b;
import E6.u;
import J0.C0280d0;
import K0.C0344g;
import K0.C0351j0;
import K0.InterfaceC0353k0;
import K9.InterfaceC0402u;
import L5.c;
import N9.k0;
import R6.g;
import Z0.B;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.wifi.WifiManager;
import android.support.v4.media.session.p;
import com.ayah.R;
import com.ayah.feature.audio.service.AyahAudioService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import p040da.b;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class H extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6296u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(Object obj, boolean z10, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6293r = i10;
        this.f6296u = obj;
        this.f6295t = z10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6293r) {
            case 0:
                return new H((N) this.f6296u, this.f6295t, cVar, 0);
            default:
                return new H((AyahAudioService) this.f6296u, this.f6295t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6293r) {
            case 0:
                break;
        }
        return ((H) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        File[] fileArrListFiles;
        switch (this.f6293r) {
            case 0:
                p110k9.y yVar = p110k9.y.f19095a;
                N n6 = (N) this.f6296u;
                p161p9.a aVar = p161p9.a.f21156r;
                int i10 = this.f6294s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    if (U0.K.b(n6.k().f10954b)) {
                        return yVar;
                    }
                    InterfaceC0353k0 interfaceC0353k0 = n6.f6314h;
                    if (interfaceC0353k0 != null) {
                        C0351j0 c0351j0G = u0.G(Y2.a.L(n6.k()));
                        this.f6294s = 1;
                        ((C0344g) interfaceC0353k0).a(c0351j0G);
                        if (yVar == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                if (!this.f6295t) {
                    return yVar;
                }
                int iD = U0.K.d(n6.k().f10954b);
                n6.f6310c.e(N.c(n6.k().f10953a, va.g.e(iD, iD)));
                n6.o(K.L.f4484r);
                return yVar;
            default:
                p161p9.a aVar2 = p161p9.a.f21156r;
                int i11 = this.f6294s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    C0280d0 c0280d0B = ((AyahAudioService) this.f6296u).b();
                    this.f6294s = 1;
                    obj = c0280d0B.i(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                p246z4.j jVar = (p246z4.j) obj;
                if (jVar != null) {
                    p209v4.a aVar3 = ((AyahAudioService) this.f6296u).f13737B;
                    if (aVar3 == null) {
                        p251z9.j.k("audioNotificationManager");
                        throw null;
                    }
                    aVar3.f23335f = jVar.a();
                    int i12 = 0;
                    if (!this.f6295t) {
                        ((AyahAudioService) this.f6296u).l(false);
                        ((AyahAudioService) this.f6296u).m(1);
                    }
                    if (jVar instanceof p246z4.h) {
                        p246z4.h hVar = (p246z4.h) jVar;
                        boolean z10 = H9.v.R0(hVar.f24819b, "http:", false) || H9.v.R0(hVar.f24819b, "https:", false);
                        if (!z10 && !new File(hVar.f24819b).exists()) {
                            ((AyahAudioService) this.f6296u).h();
                        }
                        p219w4.f fVar = ((AyahAudioService) this.f6296u).f13738C;
                        if (fVar == null) {
                            p251z9.j.k("audioPlayer");
                            throw null;
                        }
                        String str = hVar.f24819b;
                        int i13 = hVar.f24820c;
                        R7.f fVar2 = Ha.a.f3643a;
                        "starting to play: ".concat(str);
                        fVar2.getClass();
                        R7.f.h(new Object[0]);
                        MediaPlayer mediaPlayer = fVar.g;
                        if (mediaPlayer == null) {
                            MediaPlayer mediaPlayer2 = new MediaPlayer();
                            mediaPlayer2.setWakeMode(fVar.f23715a, 1);
                            mediaPlayer2.setOnPreparedListener(fVar);
                            mediaPlayer2.setOnCompletionListener(fVar);
                            mediaPlayer2.setOnErrorListener(fVar);
                            mediaPlayer2.setOnSeekCompleteListener(fVar);
                            mediaPlayer2.setAudioAttributes((AudioAttributes) fVar.f23720f.getValue());
                            fVar.g = mediaPlayer2;
                        } else if (mediaPlayer != null) {
                            try {
                                mediaPlayer.reset();
                                mediaPlayer.setAudioAttributes((AudioAttributes) fVar.f23720f.getValue());
                            } catch (IllegalStateException unused) {
                                fVar.e();
                            }
                        }
                        try {
                            MediaPlayer mediaPlayer3 = fVar.g;
                            if (mediaPlayer3 != null) {
                                try {
                                    mediaPlayer3.setDataSource(str);
                                } catch (IllegalStateException unused2) {
                                    MediaPlayer mediaPlayer4 = fVar.g;
                                    if (mediaPlayer4 != null) {
                                        mediaPlayer4.reset();
                                        mediaPlayer4.setAudioAttributes((AudioAttributes) fVar.f23720f.getValue());
                                    }
                                    try {
                                        mediaPlayer3.setDataSource(str);
                                    } catch (IllegalStateException unused3) {
                                        fVar.e();
                                    }
                                }
                                Ha.a.f3643a.getClass();
                                R7.f.h(new Object[0]);
                                try {
                                    mediaPlayer3.prepareAsync();
                                    k0 k0Var = fVar.f23718d;
                                    Integer numValueOf = Integer.valueOf(i13);
                                    k0Var.getClass();
                                    k0Var.n(null, numValueOf);
                                    k0 k0Var2 = fVar.f23717c;
                                    p219w4.g gVar = p219w4.g.f23724s;
                                    k0Var2.getClass();
                                    k0Var2.n(null, gVar);
                                } catch (IllegalStateException unused4) {
                                    fVar.e();
                                }
                            }
                        } catch (IOException unused5) {
                            MediaPlayer mediaPlayer5 = fVar.g;
                            if (mediaPlayer5 != null) {
                                mediaPlayer5.reset();
                                mediaPlayer5.setAudioAttributes((AudioAttributes) fVar.f23720f.getValue());
                            }
                            Ha.a.f3643a.getClass();
                            R7.f.l(new Object[0]);
                        }
                        AyahAudioService ayahAudioService = (AyahAudioService) this.f6296u;
                        ayahAudioService.f13739D = false;
                        if (z10) {
                            WifiManager.WifiLock wifiLock = ayahAudioService.f13751v;
                            if (wifiLock == null) {
                                p251z9.j.k("wifiLock");
                                throw null;
                            }
                            wifiLock.acquire();
                        } else {
                            ayahAudioService.i();
                        }
                    } else {
                        if (!(jVar instanceof p246z4.i)) {
                            throw new A6.a();
                        }
                        AyahAudioService ayahAudioService2 = (AyahAudioService) this.f6296u;
                        p246z4.i iVar = (p246z4.i) jVar;
                        String str2 = iVar.f24822b;
                        File file = new File(iVar.f24823c);
                        p124m3.a aVar4 = iVar.f24824d;
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            if (!parentFile.mkdirs() && (fileArrListFiles = parentFile.listFiles(new p175r4.b(String.format(Locale.US, "%03d_", Arrays.copyOf(new Object[]{Integer.valueOf(aVar4.f19528b)}, 1)), i12))) != null) {
                                I1.V vH = p251z9.j.h(fileArrListFiles);
                                while (vH.hasNext()) {
                                    File file2 = (File) vH.next();
                                    String name = file2.getName();
                                    p251z9.j.d(name, "getName(...)");
                                    if (!H9.v.L0(name, ".part")) {
                                        file2.delete();
                                    }
                                }
                            }
                            if (ayahAudioService2.f13752w != null) {
                                C0112b c0112b = ayahAudioService2.f13753x;
                                if (c0112b == null) {
                                    p251z9.j.k("downloadManager");
                                    throw null;
                                }
                                c0112b.c(ayahAudioService2.f13752w);
                            }
                            ayahAudioService2.f13752w = str2;
                            String string = ayahAudioService2.getResources().getString(p125m4.b.b() ? R.string.sura_name_arabic : R.string.sura_name, aVar4.b());
                            p251z9.j.d(string, "getString(...)");
                            p251z9.j.b(str2);
                            final p052ea.b bVar = new p052ea.b(str2, string, file.getName());
                            final C0112b c0112b2 = ayahAudioService2.f13753x;
                            if (c0112b2 == null) {
                                p251z9.j.k("downloadManager");
                                throw null;
                            }
                            final String path = parentFile.getPath();
                            ExecutorService executorService = (ExecutorService) ((HashMap) c0112b2.f1645e).get("audio");
                            final p031ca.b bVar2 = new p031ca.b(bVar);
                            if (executorService != null) {
                                bVar2.f13600b = executorService.submit(new Callable() { // from class: ca.a
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() throws Throwable {
                                        int i14;
                                        int iC;
                                        Object obj2;
                                        C0112b c0112b3 = c0112b2;
                                        ArrayList arrayList = (ArrayList) c0112b3.f1642b;
                                        b bVar3 = (b) c0112b3.f1644d;
                                        p052ea.b bVar4 = bVar;
                                        bVar3.b(bVar4);
                                        int i15 = 0;
                                        do {
                                            c cVar = (c) c0112b3.f1643c;
                                            b bVar5 = bVar2;
                                            p052ea.b bVar6 = bVar5.f13599a;
                                            i14 = 1;
                                            iC = 1;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= i14 || iC != i14) {
                                                    obj2 = null;
                                                    break;
                                                }
                                                String str3 = bVar6.f15866r;
                                                obj2 = null;
                                                String strSubstring = bVar6.f15868t;
                                                if (strSubstring == null) {
                                                    int iLastIndexOf = str3.lastIndexOf(47);
                                                    strSubstring = iLastIndexOf != -1 ? str3.substring(iLastIndexOf + 1) : null;
                                                    if (strSubstring == null) {
                                                        ((b) cVar.f5533t).e(bVar6, new g(new Exception("Invalid url: ".concat(str3))));
                                                        iC = 2;
                                                        break;
                                                    }
                                                }
                                                String str4 = path;
                                                File file3 = new File(str4, strSubstring);
                                                if (!file3.exists()) {
                                                    Aa.a aVar5 = new Aa.a(16);
                                                    aVar5.K(str3);
                                                    long length = new File(str4, strSubstring.concat(".part")).length();
                                                    if (length > 0) {
                                                        String str5 = "bytes=" + length + "-";
                                                        j.e(str5, "value");
                                                        B b5 = (B) aVar5.f556t;
                                                        b5.getClass();
                                                        B0.c.P("Range");
                                                        B0.c.Q(str5, "Range");
                                                        B0.c.o(b5, "Range", str5);
                                                    }
                                                    iC = cVar.C(bVar5, new u(aVar5), file3.getPath(), i16);
                                                }
                                                i16++;
                                                i14 = i14;
                                            }
                                            if (iC != 2) {
                                                break;
                                            }
                                            i15++;
                                        } while (i15 < c0112b3.f1641a);
                                        if (iC == i14) {
                                            if (arrayList.size() > 0) {
                                                throw p.u(0, arrayList);
                                            }
                                            bVar3.a(bVar4);
                                            return obj2;
                                        }
                                        if (iC == 3) {
                                            bVar3.d(bVar4);
                                            return obj2;
                                        }
                                        bVar3.f(bVar4);
                                        return obj2;
                                    }
                                });
                                ((CopyOnWriteArrayList) c0112b2.f1646f).add(bVar2);
                            }
                        }
                    }
                    break;
                } else {
                    AyahAudioService ayahAudioService3 = (AyahAudioService) this.f6296u;
                    boolean z11 = AyahAudioService.f13735O;
                    ayahAudioService3.h();
                }
                return p110k9.y.f19095a;
        }
    }
}
